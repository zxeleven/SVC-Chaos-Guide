package com.example.svcchaosguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class CharactersFragment extends Fragment implements View.OnClickListener{

    ImageButton snk_button;
    ImageButton cap_button;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.characters_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        ((MainActivity) getActivity()).textViewTitle.setText("Characters");

        snk_button = getView().findViewById(R.id.snk_chars_button);
        cap_button = getView().findViewById(R.id.capcom_chars_button);
        snk_button.setOnClickListener(this);
        cap_button.setOnClickListener(this);

        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.snk_chars_button){
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.setCustomAnimations(R.anim.fade_in, R.anim.fade_out,
                    R.anim.fade_in, R.anim.fade_out);
            fragmentTransaction.replace(R.id.container, new SNKFragment());
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if(v.getId() == R.id.capcom_chars_button){
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.setCustomAnimations(R.anim.fade_in, R.anim.fade_out,
                    R.anim.fade_in, R.anim.fade_out);
            fragmentTransaction.replace(R.id.container, new CapcomFragment());
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
