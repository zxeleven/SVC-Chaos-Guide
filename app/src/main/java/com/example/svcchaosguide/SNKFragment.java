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

public class SNKFragment extends Fragment implements CharacterAdapter.OnCharListener {

    RecyclerView recyclerView;
    CharacterAdapter adapter;

    List<Character> charList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.snk_fragment, container, false);

        charList = new ArrayList<>();
        recyclerView = rootView.findViewById(R.id.snk_characters);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        charList.add(
                new Character(
                        R.drawable.kyo_name,
                        R.drawable.kyo_small_port,
                        R.drawable.kyo_bg));

        charList.add(
                new Character(
                        R.drawable.iori_name,
                        R.drawable.iori_small_port,
                        R.drawable.iori_bg));

        charList.add(
                new Character(
                        R.drawable.mai_name,
                        R.drawable.mai_small_port,
                        R.drawable.mai_bg));

        charList.add(
                new Character(
                        R.drawable.terry_name,
                        R.drawable.terry_small_port,
                        R.drawable.terry_bg));

        charList.add(
                new Character(
                        R.drawable.ryo_name,
                        R.drawable.ryo_small_port,
                        R.drawable.ryo_bg));

        charList.add(
                new Character(
                        R.drawable.karate_name,
                        R.drawable.karate_small_port,
                        R.drawable.karate_bg));

        charList.add(
                new Character(
                        R.drawable.choi_name,
                        R.drawable.choi_small_port,
                        R.drawable.choi_bg));

        charList.add(
                new Character(
                        R.drawable.kim_name,
                        R.drawable.kim_small_port,
                        R.drawable.kim_bg));

        charList.add(
                new Character(
                        R.drawable.shiki_name,
                        R.drawable.shiki_small_port,
                        R.drawable.shiki_bg));

        charList.add(
                new Character(
                        R.drawable.kasumi_name,
                        R.drawable.kasumi_small_port,
                        R.drawable.kasumi_bg));

        charList.add(
                new Character(
                        R.drawable.genjyuro_name,
                        R.drawable.genjyuro_small_port,
                        R.drawable.genjyuro_bg));

        charList.add(
                new Character(
                        R.drawable.earthquake_name,
                        R.drawable.earthquake_small_port,
                        R.drawable.earthquake_bg));

        charList.add(
                new Character(
                        R.drawable.geese_name,
                        R.drawable.geese_small_port,
                        R.drawable.geese_bg));

        charList.add(
                new Character(
                        R.drawable.goenitz_name,
                        R.drawable.goenitz_small_port,
                        R.drawable.goenitz_bg));

        charList.add(
                new Character(
                        R.drawable.oiori_name,
                        R.drawable.oiori_small_port,
                        R.drawable.oiori_bg));

        charList.add(
                new Character(
                        R.drawable.mars_name,
                        R.drawable.mars_small_port,
                        R.drawable.mars_bg));

        charList.add(
                new Character(
                        R.drawable.serious_karate_name,
                        R.drawable.serious_karate_small_port,
                        R.drawable.serious_karate_bg));

        charList.add(
                new Character(
                        R.drawable.athena_name,
                        R.drawable.athena_small_port,
                        R.drawable.athena_bg));

        adapter = new CharacterAdapter(getActivity(), charList, this);
        recyclerView.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        ((MainActivity) getActivity()).textViewTitle.setText("SNK Characters");

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
