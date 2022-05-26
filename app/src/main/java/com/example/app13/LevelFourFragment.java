package com.example.app13;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class LevelFourFragment extends Fragment {
    View view;
    ImageView imageContainer1, imageContainer2, imageContainer3, imageContainer4, imageContainer5, imageContainer6, imageContainer7, imageContainer8, imageContainer9, imageContainer10, imageContainer11, imageContainer12, imageContainer13, imageContainer14, imageContainer15, imageContainer16;
    ImageView[] imageContainerArray = {imageContainer1, imageContainer2, imageContainer3, imageContainer4, imageContainer5, imageContainer6, imageContainer7, imageContainer8, imageContainer9, imageContainer10, imageContainer11, imageContainer12, imageContainer13, imageContainer14, imageContainer15, imageContainer16};
    int[] imageId = {R.id.image_container1, R.id.image_container2, R.id.image_container3, R.id.image_container4, R.id.image_container5, R.id.image_container6, R.id.image_container7, R.id.image_container8, R.id.image_container9, R.id.image_container10, R.id.image_container11, R.id.image_container12, R.id.image_container13, R.id.image_container14, R.id.image_container15, R.id.image_container16};
    //int angle1, angle2, angle3, angle4, angle5, angle6, angle7, angle8, angle9, angle10, angle11, angle12, angle13, angle14, angle15, angle16;
    //int[] angleArray = {angle1, angle2, angle3, angle4, angle5, angle6, angle7, angle8, angle9, angle10, angle11, angle12, angle13, angle14, angle15, angle16};
    //массив ответ angleArrayAnswer = {0, 90, 0, 180, 90, 0, 0, 270, 100};
    int[] angleArrayAnswer = {180, 270, 0, 0, 0, 90, 270, 270, 0, 180, 0, 90, 180, 90, 0, 90};
    int[] angleArrayBegin = {270, 0, 0, 0, 0, 180, 90, 90, 0, 0, 0, 0, 180, 180, 180, 270};
    //int[] angleRange = {90, 180, 270};
    boolean allTrue;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_level_four, container, false);

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
        imageContainerArray[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allClick(12);
            }
        });
        imageContainerArray[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allClick(13);
            }
        });
        imageContainerArray[14].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allClick(14);
            }
        });
        imageContainerArray[15].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allClick(15);
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
        if(index==11){
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
/*        Toast toast = Toast.makeText(getApplicationContext(),
                Arrays.toString(angleArrayAnswer) + "\n" + Arrays.toString(angleArrayBegin) + "\n" + String.valueOf(allTrue), Toast.LENGTH_LONG);
        toast.show();*/
        if (allTrue) {
            Handler h = new Handler();
            h.postDelayed(new Runnable() {
                @Override
                public void run() {
                    getActivity().getSupportFragmentManager().beginTransaction().remove(LevelFourFragment.this).commit();
                    //ПОБЕДА!!!!!!!!!!
                    requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_view,
                            new GameOverFragment()).commit();
                }
            }, 1000);

            //Открыть фрагмент с кнопкой NEXT


/*            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа", Toast.LENGTH_SHORT);
            toast.show();*/
        }
    }

}