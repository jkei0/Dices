package com.example.dices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void pressButton(View view)
    {

        // Value for each dice
        List<Integer> d1 = Arrays.asList(R.drawable.a,R.drawable.r,R.drawable.m,R.drawable.s,R.drawable.t,R.drawable.y,
                R.drawable.p,R.drawable.u,R.drawable.k,R.drawable.s,R.drawable.c,R.drawable.l);
        //String d1 = "ARMSTYPUKSCL";

        List<Integer> d2 = Arrays.asList(R.drawable.tahti,R.drawable.j,R.drawable.r,R.drawable.h,R.drawable.t,
                R.drawable.d,R.drawable.t,R.drawable.o,R.drawable.v,R.drawable.p,R.drawable.s,R.drawable.v);
        //String d2 = "*JRHTDTOVPSV";

        List<Integer> d3 = Arrays.asList(R.drawable.tahti,R.drawable.l,R.drawable.n,R.drawable.b,
                R.drawable.k,R.drawable.oo,R.drawable.tahti,R.drawable.p,R.drawable.e,R.drawable.k,R.drawable.i,R.drawable.t);
        //String d3 = "*LNBKÖ*PEKIT";

        List<Integer> d4 = Arrays.asList(R.drawable.g,R.drawable.o,R.drawable.m,R.drawable.a,
                                            R.drawable.f,R.drawable.e,R.drawable.h,R.drawable.u,R.drawable.s,
                                            R.drawable.e,R.drawable.j,R.drawable.aa);
        //String d4 = "GOMAFEHUSEJÄ";

        // Randomly select value for each dice
        Random rand = new Random();
        int n1 = rand.nextInt(12);
        int n2 = rand.nextInt(12);
        int n3 = rand.nextInt(12);
        int n4 = rand.nextInt(12);


        ImageView dice_1 = findViewById(R.id.dice_1);
        ImageView dice_2 = findViewById(R.id.dice_2);
        ImageView dice_3 = findViewById(R.id.dice_3);
        ImageView dice_4 = findViewById(R.id.dice_4);

        Integer i1 = d1.get(n1);
        Integer i2 = d2.get(n2);
        Integer i3 = d3.get(n3);
        Integer i4 = d4.get(n4);

        dice_1.setImageResource(i1);
        dice_2.setImageResource(i2);
        dice_3.setImageResource(i3);
        dice_4.setImageResource(i4);

    }

}
