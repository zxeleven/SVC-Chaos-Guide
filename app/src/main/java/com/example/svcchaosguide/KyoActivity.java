package com.example.svcchaosguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class KyoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character_activity);

        //Cardview
        ((ImageView) findViewById(R.id.newCharBackground)).setImageResource(R.drawable.kyo_bg);
        ((ImageView) findViewById(R.id.newCharName)).setImageResource(R.drawable.kyo_name);
        ((ImageView) findViewById(R.id.newCharPortrait)).setImageResource(R.drawable.kyo_small_port);

        //First move
        ((TextView) findViewById(R.id.move1)).setText("Geshiki: Naraku Otoshi");
        ((ImageView) findViewById(R.id.a1)).setImageResource(R.drawable.air_no_parens);
        ((ImageView) findViewById(R.id.a2)).setImageResource(R.drawable.down);
        ((ImageView) findViewById(R.id.a3)).setImageResource(R.drawable.plus);
        ((ImageView) findViewById(R.id.a4)).setImageResource(R.drawable.hp);

        //Second move
        ((TextView) findViewById(R.id.move2)).setText("Geshiki: Goufu You");
        ((ImageView) findViewById(R.id.b1)).setImageResource(R.drawable.right);
        ((ImageView) findViewById(R.id.b2)).setImageResource(R.drawable.plus);
        ((ImageView) findViewById(R.id.b3)).setImageResource(R.drawable.lk);

        //Third move
        ((TextView) findViewById(R.id.move3)).setText("88 Shiki");
        ((ImageView) findViewById(R.id.c1)).setImageResource(R.drawable.downright);
        ((ImageView) findViewById(R.id.c2)).setImageResource(R.drawable.plus);
        ((ImageView) findViewById(R.id.c3)).setImageResource(R.drawable.hk);

        //Fourth move
        ((TextView) findViewById(R.id.move4)).setText("114 Shiki: Aragami");
        ((ImageView) findViewById(R.id.d1)).setImageResource(R.drawable.down);
        ((ImageView) findViewById(R.id.d2)).setImageResource(R.drawable.downright);
        ((ImageView) findViewById(R.id.d3)).setImageResource(R.drawable.right);
        ((ImageView) findViewById(R.id.d4)).setImageResource(R.drawable.plus);
        ((ImageView) findViewById(R.id.d5)).setImageResource(R.drawable.lp);

        //Fifth move
        ((TextView) findViewById(R.id.move5)).setText("128 Shiki: Konokizu (during Aragami)");
        ((ImageView) findViewById(R.id.e1)).setImageResource(R.drawable.down);
        ((ImageView) findViewById(R.id.e2)).setImageResource(R.drawable.downright);
        ((ImageView) findViewById(R.id.e3)).setImageResource(R.drawable.right);
        ((ImageView) findViewById(R.id.e4)).setImageResource(R.drawable.plus);
        ((ImageView) findViewById(R.id.e5)).setImageResource(R.drawable.punch);

        //Sixth move
        ((TextView) findViewById(R.id.move6)).setText("127 Shiki: Yanosabi (during Konokizu)");
        ((ImageView) findViewById(R.id.f1)).setImageResource(R.drawable.punch);

        //Seventh move
        ((TextView) findViewById(R.id.move7)).setText("125 Shiki: Nanase (during Konokizu)");
        ((ImageView) findViewById(R.id.g1)).setImageResource(R.drawable.kick);

        //Eighth move
        ((TextView) findViewById(R.id.move8)).setText("127 Shiki: Yanosabi (during Aragami)");
        ((ImageView) findViewById(R.id.h1)).setImageResource(R.drawable.right);
        ((ImageView) findViewById(R.id.h2)).setImageResource(R.drawable.downright);
        ((ImageView) findViewById(R.id.h3)).setImageResource(R.drawable.down);
        ((ImageView) findViewById(R.id.h4)).setImageResource(R.drawable.downleft);
        ((ImageView) findViewById(R.id.h5)).setImageResource(R.drawable.left);
        ((ImageView) findViewById(R.id.h6)).setImageResource(R.drawable.plus);
        ((ImageView) findViewById(R.id.h7)).setImageResource(R.drawable.punch);

        //Ninth move
        ((TextView) findViewById(R.id.move9)).setText("Geshiki: Migiri Ugachi (during Yanosabi)");
        ((ImageView) findViewById(R.id.i1)).setImageResource(R.drawable.punch);

        //10th move
        ((TextView) findViewById(R.id.move10)).setText("125 Shiki: Nanase (during Yanosabi)");
        ((ImageView) findViewById(R.id.j1)).setImageResource(R.drawable.kick);

        //11th move
        ((TextView) findViewById(R.id.move11)).setText("212 Shiki: Kototsuki You (during Yanosabi)");
        ((ImageView) findViewById(R.id.k1)).setImageResource(R.drawable.right);
        ((ImageView) findViewById(R.id.k2)).setImageResource(R.drawable.downright);
        ((ImageView) findViewById(R.id.k3)).setImageResource(R.drawable.down);
        ((ImageView) findViewById(R.id.k4)).setImageResource(R.drawable.downleft);
        ((ImageView) findViewById(R.id.k5)).setImageResource(R.drawable.left);
        ((ImageView) findViewById(R.id.k6)).setImageResource(R.drawable.plus);
        ((ImageView) findViewById(R.id.k7)).setImageResource(R.drawable.kick);

        //12th move
        ((TextView) findViewById(R.id.move12)).setText("115 Shiki: Dokugami");
        ((ImageView) findViewById(R.id.l1)).setImageResource(R.drawable.down);
        ((ImageView) findViewById(R.id.l2)).setImageResource(R.drawable.downright);
        ((ImageView) findViewById(R.id.l3)).setImageResource(R.drawable.right);
        ((ImageView) findViewById(R.id.l4)).setImageResource(R.drawable.plus);
        ((ImageView) findViewById(R.id.l5)).setImageResource(R.drawable.hp);

        //13th move
        ((TextView) findViewById(R.id.move13)).setText("401 Shiki: Tsumi Yomi (during Dokugami)");
        ((ImageView) findViewById(R.id.m1)).setImageResource(R.drawable.right);
        ((ImageView) findViewById(R.id.m2)).setImageResource(R.drawable.downright);
        ((ImageView) findViewById(R.id.m3)).setImageResource(R.drawable.down);
        ((ImageView) findViewById(R.id.m4)).setImageResource(R.drawable.downleft);
        ((ImageView) findViewById(R.id.m5)).setImageResource(R.drawable.left);
        ((ImageView) findViewById(R.id.m6)).setImageResource(R.drawable.plus);
        ((ImageView) findViewById(R.id.m7)).setImageResource(R.drawable.hp);

        //14th move
        ((TextView) findViewById(R.id.move14)).setText("402 Shiki: Batsu Yomi (during Tsumi Yomi)");
        ((ImageView) findViewById(R.id.n1)).setImageResource(R.drawable.right);
        ((ImageView) findViewById(R.id.n2)).setImageResource(R.drawable.plus);
        ((ImageView) findViewById(R.id.n3)).setImageResource(R.drawable.hp);

        //15th move
        ((TextView) findViewById(R.id.move15)).setText("100 Shiki: Oniyaki (during Batsu Yomi)");
        ((ImageView) findViewById(R.id.o1)).setImageResource(R.drawable.right);
        ((ImageView) findViewById(R.id.o2)).setImageResource(R.drawable.down);
        ((ImageView) findViewById(R.id.o3)).setImageResource(R.drawable.downright);
        ((ImageView) findViewById(R.id.o4)).setImageResource(R.drawable.plus);
        ((ImageView) findViewById(R.id.o5)).setImageResource(R.drawable.punch);

    }

}