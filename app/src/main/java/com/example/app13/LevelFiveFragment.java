package com.example.app13;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class LevelFiveFragment extends Fragment {
    View view;
    ImageView imageContainer1, imageContainer2, imageContainer3, imageContainer4, imageContainer5, imageContainer6, imageContainer7, imageContainer8, imageContainer9, imageContainer10, imageContainer11, imageContainer12;
    ImageView[] imageContainerArray = {imageContainer1, imageContainer2, imageContainer3, imageContainer4, imageContainer5, imageContainer6, imageContainer7, imageContainer8, imageContainer9, imageContainer10, imageContainer11, imageContainer12};
    int[] imageId = {R.id.image_container1, R.id.image_container2, R.id.image_container3, R.id.image_container4, R.id.image_container5, R.id.image_container6, R.id.image_container7, R.id.image_container8, R.id.image_container9, R.id.image_container10, R.id.image_container11, R.id.image_container12};
    int[] angleArrayAnswer = {0, 0, 0, 270, 180, 270, 0, 0, 0, 90, 0, 0};
    int[] angleArrayBegin = {0, 0, 0, 0, 180, 180, 90, 0, 0, 270, 0, 90};
    boolean allTrue;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_level_five, container, false);

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
        imageContainerArray[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allClick(4);
            }
        });
        imageContainerArray[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allClick(5);
            }
        });
        imageContainerArray[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allClick(6);
            }
        });
        imageContainerArray[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allClick(7);
            }
        });
        imageContainerArray[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allClick(8);
            }
        });
        imageContainerArray[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allClick(9);
            }
        });
        imageContainerArray[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allClick(10);
            }
        });
        imageContainerArray[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allClick(11);
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
        if(index==6 || index==10){
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
                    getActivity().getSupportFragmentManager().beginTransaction().remove(LevelFiveFragment.this).commit();
                    //ПОБЕДА!!!!!!!!!!
                    requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_view,
                            new NextLevelFragment()).commit();
                }
            }, 1000);

        }
    }
}