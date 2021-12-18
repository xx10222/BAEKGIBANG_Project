package com.cookandroid.term_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Btn2Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn2);

        Button btnHappy = (Button)findViewById(R.id.btnHappy);
        btnHappy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Btn2Activity.this,"심장이 Poppin' Poppin' 하는 이 느낌",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),HappyActivity.class);
                startActivity(intent);
            }
        });

        Button btnSad = (Button)findViewById(R.id.btnSad);
        btnSad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Btn2Activity.this,"이별은 이별 노래로 승부한다",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),SadActivity.class);
                startActivity(intent);
            }
        });

        Button btnLonely = (Button)findViewById(R.id.btnLonely);
        btnLonely.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Btn2Activity.this,"밤비...밤... 밤비...밤비... 밤...밤...",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),LonelyActivity.class);
                startActivity(intent);
            }
        });

        Button btnLove = (Button)findViewById(R.id.btnLove);
        btnLove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Btn2Activity.this,"당연히 주인공은 너와 나",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),LoveActivity.class);
                startActivity(intent);
            }
        });

        Button btnSleep = (Button)findViewById(R.id.btnSleep);
        btnSleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Btn2Activity.this,"지친 하루를 위로하는 감미로운 목소리, 귀에 맴도는 멜로디",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),SleepActivity.class);
                startActivity(intent);
            }
        });

        Button btnGo = (Button)findViewById(R.id.btnGo);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Btn2Activity.this,"워! 워워워워.... R U Ridin'?",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),GoActivity.class);
                startActivity(intent);
            }
        });

        Button btnHeart = (Button)findViewById(R.id.btnHeart);
        btnHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Btn2Activity.this,"꿈과 사랑이 가득한 나는 당신의 놀이공원❤",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),HeartActivity.class);
                startActivity(intent);
            }
        });
    }
}
