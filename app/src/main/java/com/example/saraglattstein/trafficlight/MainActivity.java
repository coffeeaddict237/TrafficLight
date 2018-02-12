package com.example.saraglattstein.trafficlight;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// notes: use Alt + Enter to open menu that allows quick import of needed class

public class MainActivity extends AppCompatActivity {

    private TextView tvLight;

    private Button btn;
    private ColorDrawable viewColor;
    private int colorId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvLight = findViewById(R.id.tvLight);

        btn = findViewById(R.id.btn);
        btn.setTag(1);
        viewColor = (ColorDrawable) tvLight.getBackground();
        colorId = viewColor.getColor();
        View.OnClickListener onClickListener = new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(colorId == Color.WHITE || colorId == Color.RED) {
                    Log.e("Testing","Go");
                    tvLight.setBackgroundColor(Color.GREEN);
                    colorId = viewColor.getColor();
                }
                else if(colorId == Color.GREEN) {
                    Log.e("Testing","Slow");
                    tvLight.setBackgroundColor(Color.YELLOW);
                    colorId = viewColor.getColor();
                }
                else if(colorId == Color.YELLOW) {
                    Log.e("Testing","Stop");
                    tvLight.setBackgroundColor(Color.RED);
                    colorId = viewColor.getColor();
                }

            }
        };
        btn.setOnClickListener(onClickListener);
    }
}
