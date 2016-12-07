package com.example.hosein.practice10;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.Random;

import static com.example.hosein.practice10.R.color.colorPrimary;

public class MainActivity extends AppCompatActivity {
    int i;
    int counter = 1;
    Button button[];
    Button btplus;

    LinearLayout layout, layout1, layout2, layout3,layout4,layout5;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        btplus = (Button) findViewById(R.id.plus);
        button = new Button[100];
        layout = (LinearLayout) findViewById(R.id.lin1);
        layout1 = (LinearLayout) findViewById(R.id.lin2);
        layout2 = (LinearLayout) findViewById(R.id.lin3);
        layout3 = (LinearLayout) findViewById(R.id.lin4);
        layout4 = (LinearLayout) findViewById(R.id.lin5);
        layout5 = (LinearLayout) findViewById(R.id.lin6);
      final Animation  anim2 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim1);

        for (i = 1; i <= 4; i++) {

            button[i] = new Button(this);
            button[i].setTag(i);
            button[i].setText("*****");

            layout.addView(button[i]);


        }

        for (i = 5; i <= 8; i++) {

            button[i] = new Button(this);
            button[i].setTag(i);
            button[i].setText("****");
            layout1.addView(button[i]);

        }

        for (i = 9; i <= 12; i++) {

            button[i] = new Button(this);
            button[i].setTag(i);
            button[i].setText("****");
            layout2.addView(button[i]);

        }

        for (i = 12; i <= 15; i++) {

            button[i] = new Button(this);
            button[i].setTag(i);
            button[i].setText("****");
            layout4.addView(button[i]);

        }
        for (i = 16; i <= 19; i++) {

            button[i] = new Button(this);
            button[i].setTag(i);
            button[i].setText("****");
            layout5.addView(button[i]);

        }

        btplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              btplus.startAnimation(anim2);
                button[counter].setText("okOK");
                Random random = new Random();
                int x = random.nextInt(6);
                counter = counter + x;

            }
        });



    }


}
