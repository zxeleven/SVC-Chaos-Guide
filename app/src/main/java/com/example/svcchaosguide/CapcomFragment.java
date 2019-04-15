package com.example.svcchaosguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class CapcomFragment extends Fragment implements CharacterAdapter.OnCharListener {

    RecyclerView recyclerView;
    CharacterAdapter adapter;

    List<Character> charList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.capcom_fragment, container, false);

        charList = new ArrayList<>();
        recyclerView = rootView.findViewById(R.id.capcom_characters);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        charList.add(
                new Character(
                        R.drawable.ryu_name,
                        R.drawable.ryu_small_port,
                        R.drawable.ryu_bg));

        charList.add(
                new Character(
                        R.drawable.ken_name,
                        R.drawable.ken_small_port,
                        R.drawable.ken_bg));

        charList.add(
                new Character(
                        R.drawable.chunli_name,
                        R.drawable.chunli_small_port,
                        R.drawable.chunli_bg));

        charList.add(
                new Character(
                        R.drawable.guile_name,
                        R.drawable.guile_small_port,
                        R.drawable.guile_bg));

        charList.add(
                new Character(
                        R.drawable.akuma_name,
                        R.drawable.akuma_small_port,
                        R.drawable.akuma_bg));

        charList.add(
                new Character(
                        R.drawable.dhalsim_name,
                        R.drawable.dhalsim_small_port,
                        R.drawable.dhalsim_bg));

        charList.add(
                new Character(
                        R.drawable.bison_name,
                        R.drawable.bison_small_port,
                        R.drawable.bison_bg));

        charList.add(
                new Character(
                        R.drawable.vega_name,
                        R.drawable.vega_small_port,
                        R.drawable.vega_bg));

        charList.add(
                new Character(
                        R.drawable.sagat_name,
                        R.drawable.sagat_small_port,
                        R.drawable.sagat_bg));

        charList.add(
                new Character(
                        R.drawable.balrog_name,
                        R.drawable.balrog_small_port,
                        R.drawable.balrog_bg));

        charList.add(
                new Character(
                        R.drawable.hugo_name,
                        R.drawable.hugo_small_port,
                        R.drawable.hugo_bg));

        charList.add(
                new Character(
                        R.drawable.tessa_name,
                        R.drawable.tessa_small_port,
                        R.drawable.tessa_bg));

        charList.add(
                new Character(
                        R.drawable.demitri_name,
                        R.drawable.demitri_small_port,
                        R.drawable.demitri_bg));

        charList.add(
                new Character(
                        R.drawable.zero_name,
                        R.drawable.zero_small_port,
                        R.drawable.zero_bg));

        charList.add(
                new Character(
                        R.drawable.dan_name,
                        R.drawable.dan_small_port,
                        R.drawable.dan_bg));

        charList.add(
                new Character(
                        R.drawable.violent_ken_name,
                        R.drawable.violent_ken_small_port,
                        R.drawable.violent_ken_bg));

        charList.add(
                new Character(
                        R.drawable.shin_akuma_name,
                        R.drawable.shin_akuma_small_port,
                        R.drawable.shin_akuma_bg));

        charList.add(
                new Character(
                        R.drawable.red_arremer_name,
                        R.drawable.red_arremer_small_port,
                        R.drawable.red_arremer_bg));

        adapter = new CharacterAdapter(getActivity(), charList, this);
        recyclerView.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        ((MainActivity) getActivity()).textViewTitle.setText("Capcom Characters");

        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onCharClick(int pos) {
        if (pos == 0){
            Intent intent = new Intent(getActivity(), KyoActivity.class);
            startActivity(intent);
        }
        else if (pos == 1) {
            Intent intent = new Intent(getActivity(), IoriActivity.class);
            startActivity(intent);
        }
        else if (pos == 2){
            Intent intent = new Intent(getActivity(), MaiActivity.class);
            startActivity(intent);
        }
        else if (pos == 3){
            Intent intent = new Intent(getActivity(), TerryActivity.class);
            startActivity(intent);
        }
        else if (pos == 4){
            Intent intent = new Intent(getActivity(), RyoActivity.class);
            startActivity(intent);
        }
        else if (pos == 5){
            Intent intent = new Intent(getActivity(), MrKarateActivity.class);
            startActivity(intent);
        }
        else if (pos == 6){
            Intent intent = new Intent(getActivity(), ChoiActivity.class);
            startActivity(intent);
        }
        else if (pos == 7){
            Intent intent = new Intent(getActivity(), KimActivity.class);
            startActivity(intent);
        }
        else if (pos == 8){
            Intent intent = new Intent(getActivity(), ShikiActivity.class);
            startActivity(intent);
        }
        else if (pos == 9){
            Intent intent = new Intent(getActivity(), KasumiActivity.class);
            startActivity(intent);
        }
        else if (pos == 10){
            Intent intent = new Intent(getActivity(), GenjyuroActivity.class);
            startActivity(intent);
        }
        else if (pos == 11){
            Intent intent = new Intent(getActivity(), EarthquakeActivity.class);
            startActivity(intent);
        }
        else if (pos == 12){
            Intent intent = new Intent(getActivity(), GeeseActivity.class);
            startActivity(intent);
        }
        else if (pos == 13){
            Intent intent = new Intent(getActivity(), GoenitzActivity.class);
            startActivity(intent);
        }
        else if (pos == 14){
            Intent intent = new Intent(getActivity(), OrochiIoriActivity.class);
            startActivity(intent);
        }
        else if (pos == 15){
            Intent intent = new Intent(getActivity(), MarsPeopleActivity.class);
            startActivity(intent);
        }
        else if (pos == 16){
            Intent intent = new Intent(getActivity(), SeriousMrKarateActivity.class);
            startActivity(intent);
        }
        else if (pos == 17){
            Intent intent = new Intent(getActivity(), AthenaActivity.class);
            startActivity(intent);
        }
    }
}
