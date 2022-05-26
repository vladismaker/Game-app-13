package com.example.app13;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class LevelTwoFragment extends Fragment {
    View view;
    ImageView imageContainer1, imageContainer2, imageContainer3, imageContainer4;
    ImageView[] imageContainerArray = {imageContainer1, imageContainer2, imageContainer3, imageContainer4};
    int[] imageId = {R.id.image_container1, R.id.image_container2, R.id.image_container3, R.id.image_container4};
    //int angle1, angle2, angle3, angle4;
    //int[] angleArray = {angle1, angle2, angle3, angle4};
    int[] angleArrayAnswer = {180, 0, 0, 0};
    int[] angleArrayBegin = {0, 90, 90, 90};
    boolean allTrue;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_level_two, container, false);

        init();
        setAngle();

        imageContainerArray[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allClick(0);
            }
        });
        imageContainerArray[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allClick(1);
            }
        });
        imageContainerArray[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allClick(2);
            }
        });
        imageContainerArray[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allClick(3);
            }
        });


        return view;
    }
    public void init() {
        for (int i = 0; i < imageContainerArray.length; i++) {
            imageContainerArray[i] = view.findViewById(imageId[i]);
        }
    }

    public void setAngle() {
        //Пробегаемся по все углам и задаем рандомные значения
        for (int i = 0; i < angleArrayBegin.length; i++) {
            //angleArray[i] = angleRange[angleArrayAnswer[i]];
            imageContainerArray[i].setRotation(angleArrayBegin[i]);
        }
    }


    public void allClick(int index){
        if(index==1 || index==2){
            if(angleArrayBegin[index]==90){
                angleArrayBegin[index] = 0;
            } else {
                angleArrayBegin[index] += 90;
            }
        }else{
            if (angleArrayBegin[index] == 270) {
                angleArrayBegin[index] = 0;
            } else {
                angleArrayBegin[index] += 90;
            }
        }
        imageContainerArray[index].setRotation(angleArrayBegin[index]);
        checkResult();
    }

    public void checkResult(){
        for (int i = 0; i < angleArrayAnswer.length; i++) {
            if(angleArrayAnswer[i]!=angleArrayBegin[i]){
                allTrue=false;
                break;
            }else allTrue=true;
        }

        if (allTrue) {
            Handler h = new Handler();
            h.postDelayed(new Runnable() {
                @Override
                public void run() {
                    getActivity().getSupportFragmentManager().beginTransaction().remove(LevelTwoFragment.this).commit();
                    //ПОБЕДА!!!!!!!!!!
                    requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_view,
                            new NextLevelFragment()).commit();
                }
            }, 1000);
        }
    }
}