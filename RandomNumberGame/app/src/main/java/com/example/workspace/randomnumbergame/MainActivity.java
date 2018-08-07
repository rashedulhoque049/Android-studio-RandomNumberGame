package com.example.workspace.randomnumbergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView score;
    Button btn1;
    Button btn2;

    int randomNumber1;
    int randomNumber2;
    int s=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        score = (TextView) findViewById(R.id.scoreNumber);
        btn1 =  (Button) findViewById(R.id.bt1);
        btn2 =  (Button) findViewById(R.id.bt2);

        random();

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                if (randomNumber1 >= randomNumber2){
                    s++;
                    score.setText(String.valueOf(s));

                }else{
                    s--;
                    score.setText(String.valueOf(s));
                }

                random();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                if (randomNumber2 >= randomNumber1){
                    s++;
                    score.setText(String.valueOf(s));

                }else{
                    s--;
                    score.setText(String.valueOf(s));
                }

                random();
            }
        });

    }

    public void random() {

        Random r1 = new Random();
        Random r2 = new Random();

        randomNumber1 = r1.nextInt(100);
        randomNumber2 = r2.nextInt(100);

        btn1.setText(String.valueOf(randomNumber1));
        btn2.setText(String.valueOf(randomNumber2));
    }





}
