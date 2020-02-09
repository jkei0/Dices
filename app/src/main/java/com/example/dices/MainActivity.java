package com.example.dices;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pressButton(View view) {
        String d1 = "ARMSTYPUKSCL";
        String d2 = "*JRHTDTOVPSV";
        String d3 = "*LNBKÖ*PEKIT";
        String d4 = "GOMAFEHUSEJÄ";

        Random rand = new Random();
        int n1 = rand.nextInt(12);
        int n2 = rand.nextInt(12);
        int n3 = rand.nextInt(12);
        int n4 = rand.nextInt(12);


        TextView dice_1 = findViewById(R.id.dice1);
        TextView dice_2 = findViewById(R.id.dice2);
        TextView dice_3 = findViewById(R.id.dice3);
        TextView dice_4 = findViewById(R.id.dice4);

        dice_1.setText(String.valueOf(d1.charAt(n1)));
        dice_2.setText(String.valueOf(d2.charAt(n2)));
        dice_3.setText(String.valueOf(d3.charAt(n3)));
        dice_4.setText(String.valueOf(d4.charAt(n4)));

    }

}
