package com.example.hosein.practice10;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int i;
    int counter = 1;
    Button button[], btplus;
    LinearLayout layout,layout1,layout2,layout3;


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
        for (i = 1; i <= 4; i++) {

            button[i] = new Button(this);
            button[i].setTag(i);
            button[i].setText("click");
            layout.addView(button[i]);

        }

        for (i = 5; i <= 8; i++) {

            button[i] = new Button(this);
            button[i].setTag(i);
            button[i].setText("click");
            layout1.addView(button[i]);

        }

        for (i = 9; i <= 12; i++) {

            button[i] = new Button(this);
            button[i].setTag(i);
            button[i].setText("click");
            layout2.addView(button[i]);

        }

        for (i = 12; i <= 15; i++) {

            button[i] = new Button(this);
            button[i].setTag(i);
            button[i].setText("click");
            layout3.addView(button[i]);

        }


        btplus.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        button[counter].setText("goooo");

        Random random = new Random();
        int x= random.nextInt(5);
        counter = counter+x;

    }
});
    }


}
