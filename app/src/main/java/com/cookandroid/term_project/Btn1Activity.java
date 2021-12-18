package com.cookandroid.term_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Btn1Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn1);

        Button btnWork = (Button)findViewById(R.id.btnWork);
        btnWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Btn1Activity.this,"백현이의 운동 브이로그 보러가기!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),WorkActivity.class);
                startActivity(intent);
            }
        });

        Button btnPuppy = (Button)findViewById(R.id.btnPuppy);
        btnPuppy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Btn1Activity.this,"백현이와 몽룡이의 브이로그 보러가기!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),PuppyActivity.class);
                startActivity(intent);
            }
        });

        Button btnBirthday = (Button)findViewById(R.id.btnBirthday);
        btnBirthday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Btn1Activity.this,"에리의 생일 케이크 만들기!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),BirthdayActivity.class);
                startActivity(intent);
            }
        });

        Button btnDoll = (Button)findViewById(R.id.btnDoll);
        btnDoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Btn1Activity.this,"터래기의 탄생신화 보러가기!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),DollActivity.class);
                startActivity(intent);
            }
        });

        Button btnBH = (Button)findViewById(R.id.btnBH);
        btnBH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Btn1Activity.this,"큥튜브 채널 보러가기!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),BHActivity.class);
                startActivity(intent);
            }
        });

        Button btnEXO = (Button)findViewById(R.id.btnEXO);
        btnEXO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Btn1Activity.this,"새로운 큥튜브 영상 보러가기!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),EXOActivity.class);
                startActivity(intent);
            }
        });
    }
}
