package com.hzw.progressview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ProgressView mView1;
    private ProgressView mView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mView1 = (ProgressView) findViewById(R.id.progressView1);
        mView2 = (ProgressView) findViewById(R.id.progressView2);
        Button changeValue = (Button) findViewById(R.id.btn_changeValue);
        changeValue.setOnClickListener(this);

        mView1.setMinMaxValue(20, 200);
        int[] color = new int[3];
        color[0] = Color.GREEN;
        color[1] = Color.YELLOW;
        color[2] = Color.RED;
        mView1.setShaderColor(color);
        mView1.setProgress(100);

        mView2.setIsDrawRestart(true);
        mView2.setAnimateDuration(2000);
        mView2.setPercent(0.6f);

    }

    @Override
    public void onClick(View view) {
        int num = (int) (20 + Math.random() * 180);
        mView1.setProgress(num);
        mView2.setPercent(num / 200f);
    }
}
