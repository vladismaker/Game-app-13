package com.example.app13;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.airbnb.lottie.LottieAnimationView;

public class NextLevelFragment extends Fragment {
    View view;
    LottieAnimationView lottieAnimationViewNextLevel;
    GameActivity ga;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_next_level, container, false);
        lottieAnimationViewNextLevel = view.findViewById(R.id.lottieNextLevel);

        if(getActivity()!=null){
            ga = (GameActivity)getActivity();
        }

        lottieAnimationViewNextLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().remove(NextLevelFragment.this).commit();
                if (ga.level<5){
                    ga.level++;
                }else{
                    //фрагмент "конец игры";
                }
                ga.textViewLevel.setText(String.valueOf(ga.level));
                ga.start();
            }
        });
       return view;
    }
}