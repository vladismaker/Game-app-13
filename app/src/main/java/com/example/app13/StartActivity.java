package com.example.app13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {
/*    ImageView imageContainer1, imageContainer2, imageContainer3, imageContainer4, imageContainer5, imageContainer6, imageContainer7, imageContainer8, imageContainer9, imageContainer10, imageContainer11, imageContainer12, imageContainer13, imageContainer14, imageContainer15, imageContainer16;
    ImageView[] imageContainerArray = {imageContainer1, imageContainer2, imageContainer3, imageContainer4, imageContainer5, imageContainer6, imageContainer7, imageContainer8, imageContainer9, imageContainer10, imageContainer11, imageContainer12, imageContainer13, imageContainer14, imageContainer15, imageContainer16};
    int[] imageId = {R.id.image_container1, R.id.image_container2, R.id.image_container3, R.id.image_container4, R.id.image_container5, R.id.image_container6, R.id.image_container7, R.id.image_container8, R.id.image_container9, R.id.image_container10, R.id.image_container11, R.id.image_container12, R.id.image_container13, R.id.image_container14, R.id.image_container15, R.id.image_container16};
    int angle1, angle2, angle3, angle4, angle5, angle6, angle7, angle8, angle9, angle10, angle11, angle12, angle13, angle14, angle15, angle16;
    int[] angleArray = {angle1, angle2, angle3, angle4, angle5, angle6, angle7, angle8, angle9, angle10, angle11, angle12, angle13, angle14, angle15, angle16};
    //массив ответ angleArrayAnswer = {0, 90, 0, 180, 90, 0, 0, 270, 100};
    int[] angleArrayAnswer = {180, 0, 270, 0, 90, 180, 0, 270, 180, 0, 0, 0, 90, 0, 0, 0};
    int[] angleArrayBegin = {270, 0, 0, 0, 90, 180, 90, 270, 270, 90, 90, 180, 90, 0, 90, 270};
    int[] angleRange = {90, 180, 270};
    boolean allTrue;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        init();
        //setAngle();
    }
    public void init() {


/*        for (int i = 0; i < imageContainerArray.length; i++) {
            imageContainerArray[i] = findViewById(imageId[i]);
        }*/
    }

    public void onClickStart(View view){
        startActivity(new Intent(StartActivity.this, GameActivity.class));
    }

  /*  public void setAngle() {
        //Пробегаемся по все углам и задаем рандомные значения
        for (int i = 0; i < angleArray.length; i++) {
            //angleArray[i] = angleRange[angleArrayAnswer[i]];
            imageContainerArray[i].setRotation(angleArrayBegin[i]);
        }
    }

    public void onClickImageContainer1(View view) {
        allClick(0);
    }
    public void onClickImageContainer2(View view) {
        allClick(1);
    }
    public void onClickImageContainer3(View view) {
        allClick(2);
    }
    public void onClickImageContainer4(View view) {
        allClick(3);
    }
    public void onClickImageContainer5(View view) {
        allClick(4);
    }
    public void onClickImageContainer6(View view) {
        allClick(5);
    }
    public void onClickImageContainer7(View view) {
        allClick(6);
    }
    public void onClickImageContainer8(View view) {
        allClick(7);
    }
    public void onClickImageContainer9(View view) {
        allClick(8);
    }
    public void onClickImageContainer10(View view) {
        allClick(9);
    }
    public void onClickImageContainer11(View view) {
        allClick(10);
    }
    public void onClickImageContainer12(View view) {
        allClick(11);
    }
    public void onClickImageContainer13(View view) {
        allClick(12);
    }
    public void onClickImageContainer14(View view) {
        allClick(13);
    }
    public void onClickImageContainer15(View view) {
        allClick(14);
    }
    public void onClickImageContainer16(View view) {
        allClick(15);
    }

    public void allClick(int index){
        if(index==1 || index==4|| index==9|| index==10|| index==13|| index==14){
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
*//*        Toast toast = Toast.makeText(getApplicationContext(),
                Arrays.toString(angleArrayAnswer) + "\n" + Arrays.toString(angleArrayBegin) + "\n" + String.valueOf(allTrue), Toast.LENGTH_LONG);
        toast.show();*//*
         if (allTrue) {
             Toast toast = Toast.makeText(getApplicationContext(),
                     "Победа", Toast.LENGTH_SHORT);
             toast.show();
         }
    }

    public int random(int min, int max) {
        return (int) (Math.random() * (max + 1 - min) + min);
    }*/
}