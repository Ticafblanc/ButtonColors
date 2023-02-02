package com.example.evaluation_formative_04_2713413;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    Button[] Button = new Button[8];
    int[] ButtonColors = { Color.GRAY, Color.GRAY, Color.GRAY,
            Color.GRAY, Color.GRAY, Color.GRAY, Color.GRAY, Color.GRAY};
    public void SetButtonColor(int Num, int color) {
        for(int i = 1; i < Num; ++i) {
            Button[i].setBackgroundColor(color);
            ButtonColors[i] = color;
        }
    }

    public void initButton() {
        Button[0] = (Button)findViewById(R.id.Effacer);
        Button[1] = (Button)findViewById(R.id.button_1);
        Button[2] = (Button)findViewById(R.id.button_2);
        Button[3] = (Button)findViewById(R.id.button_3);
        Button[4] = (Button)findViewById(R.id.button_4);
        Button[5] = (Button)findViewById(R.id.button_5);
        Button[6] = (Button)findViewById(R.id.button_6);
        Button[7] = (Button)findViewById(R.id.button_7);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButton();

        SetButtonColor(8, Color.GRAY);

        Button[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int  i = 0;
                while(i++ < 8) {
                    if (ButtonColors[i] == Color.GRAY)
                        break;
                }
                if (i > 1) {
                    Button[i - 1 ].setBackgroundColor(Color.GRAY);
                    ButtonColors[i - 1] = Color.GRAY;
                }
            }
        });

        Button[0].setOnLongClickListener(new View.OnLongClickListener() {
           @Override
           public boolean onLongClick(View v) {
               SetButtonColor(8, Color.GRAY);
               for(int i = 1; i < 8; ++i) {
                   ButtonColors[i] = Color.GRAY;
               }
               return true;
           }
       });

        Button[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetButtonColor(2,Color.RED);
            }
        });

        Button[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetButtonColor(3, Color.RED);
            }
        });

        Button[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetButtonColor(4, Color.RED);
            }
        });

        Button[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetButtonColor(5, Color.RED);
            }
        });

        Button[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetButtonColor(6, Color.RED);
            }
        });

        Button[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetButtonColor(7, Color.RED);
            }
        });
        Button[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetButtonColor(8, Color.RED);
            }
        });
    }


}