package com.cookandroid.term_project;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class GoActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go);

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText("가볍게 널 스치는 바람이 좋아 보여\n" +
                "그 표정을 읽을 수는 없는데\n" +
                "크게 튼 음악 볼륨 속에\n" +
                "우리 둘뿐인 이 공기 속에\n" +
                "넌 뭘 생각해\n" +
                "\n" +
                "You got a way\n" +
                "나눠줘 너라는 세상\n" +
                "내 것은 이미 그 안에 있어\n" +
                "\n" +
                "Baby tell me, r u ridin’? 곁에 있니?\n" +
                "With me vibin’ 내 거 맞니?\n" +
                "Is this love?\n" +
                "그 처음이자 마지막 사랑 같은 거\n" +
                "R u ridin’? 나를 믿고 가니?\n" +
                "내 거 맞니? 너답게 머물러줘\n" +
                "Never let go\n" +
                "\n" +
                "R u ridin’?\n" +
                "\n" +
                "Look 도시는 우릴 위해 멈춘 듯해\n" +
                "긴 시간 달려왔던 세상 속\n" +
                "온전히 둘이던\n" +
                "그 단순했던 또 별났던 사건\n" +
                "우리만의 쇼\n" +
                "날 이끌어줘 보게 해줘 네 신호\n" +
                "\n" +
                "You got a way\n" +
                "내게 맞출 필요는 없어\n" +
                "그 모습대로 내 옆에 있어\n" +
                "\n" +
                "Baby tell me, r u ridin’? 곁에 있니?\n" +
                "With me vibin’ 내 거 맞니?\n" +
                "Is this love?\n" +
                "그 처음이자 마지막 사랑 같은 거\n" +
                "R u ridin’? 나를 믿고 가니?\n" +
                "내 거 맞니? 너답게 머물러줘\n" +
                "Never let go\n" +
                "\n" +
                "Check it, I feel this vibes\n" +
                "Don’t have a doubt\n" +
                "줄 수 있어 다 뭐든 뭐든\n" +
                "내 노래를 넣어 너의 playlist\n" +
                "내게 들어와 있는 거지?\n" +
                "그거면 돼 더 빠르게 갈 테니\n" +
                "\n" +
                "Baby tell me, r u ridin’? 곁에 있니?\n" +
                "With me vibin’ 내 거 맞니?\n" +
                "Is this love?\n" +
                "그 처음이자 마지막 사랑 같은 거\n" +
                "R u ridin’? 나를 믿고 가니?\n" +
                "내 거 맞니? 너답게 머물러줘\n" +
                "Never let go\n" +
                "\n" +
                "R u ridin’?\n" +
                "내 거 맞니?\n" +
                "R u ridin’?");
    }
}
