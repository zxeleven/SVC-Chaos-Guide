package com.example.svcchaosguide;

import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.ms_square.etsyblur.BlurSupport;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    private Toolbar toolbar;
    private DrawerLayout drawer;
    private NavigationView navigationView;

    TextView textViewTitle;
    Fragment new_fragment;
    int clickedNavItem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        drawer = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        textViewTitle = findViewById(R.id.toolbar_title);

        initView();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, new HTPFragment()).commit();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window w = getWindow();
            w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            w.setStatusBarColor((Color.rgb(35, 35, 35)));
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START))
        {
            drawer.closeDrawer(GravityCompat.START);
        }
        else if(getFragmentManager().getBackStackEntryCount() > 0)
        {
            getFragmentManager().popBackStackImmediate();
        }
        else
            {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    public boolean onNavigationItemSelected(MenuItem item) {

        if ((item.getItemId() != clickedNavItem)) {
            switch (item.getItemId()) {
                case R.id.htp:
                    clickedNavItem = R.id.htp;
                    new_fragment = new HTPFragment();
                    break;
                case R.id.chars:
                    clickedNavItem = R.id.chars;
                    new_fragment = new CharactersFragment();
                    break;
                case R.id.stage:
                    clickedNavItem = R.id.stage;
                    new_fragment = new StagesFragment();
                    break;
            }
            drawer.closeDrawer(GravityCompat.START);
            return true;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void initView() {
        BlurSupport.addTo(drawer);

        setSupportActionBar(toolbar);
        toolbar.setTitle("");

        drawer.addDrawerListener(new DrawerLayout.SimpleDrawerListener() {
            @Override
            public void onDrawerOpened(View drawerView) {
                supportInvalidateOptionsMenu();
            }
            @Override
            public void onDrawerClosed(View drawerView) {
                switch (clickedNavItem) {
                    case 0:
                        break;
                    default:
                        getSupportFragmentManager().beginTransaction()
                                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out)
                                .replace(R.id.container, new_fragment)
                                .commit();

                }
            }
        });

        drawer.setScrimColor(Color.TRANSPARENT);

        setSupportActionBar(toolbar);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,
                drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }

}


