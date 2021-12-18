package com.cookandroid.term_project;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HeartActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart);

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText("언제든 놀러와요\n" +
                "눈치게임하지 말고\n" +
                "시간이 모자라다 느껴진다면\n" +
                "매일 야간개장할게요\n" +
                "줄을 서 기다릴 필요 없어\n" +
                "자유이용권을 준비하고\n" +
                "여기 모든 것이 always\n" +
                "널 기다리고 있어\n" +
                "입구를 지나 큰 나무 앞에\n" +
                "마중 나가 서 있을게요\n" +
                "그곳에서부터 내 손 꼭 잡고\n" +
                "날 따라와주면 돼요\n" +
                "저기 관람차로 갈까요\n" +
                "당신 위해 만들고 가꾼\n" +
                "정원과 내 맘을 보여줄게요\n" +
                "저 롤러코스터는 어때요\n" +
                "홀로 지새우던 밤처럼\n" +
                "오르락내리락해요\n" +
                "꿈과 사랑이 가득해요\n" +
                "신비한 세상으로 떠나요\n" +
                "화려한 불꽃놀이\n" +
                "둘만의 멋진 퍼레이드\n" +
                "나는 당신의 놀이공원\n" +
                "벤치에 앉아 쉴까요\n" +
                "아이스크림 같이 먹어요\n" +
                "초코와 바닐라 고민이 된다면\n" +
                "혼합에 츄러스 사올게요\n" +
                "귀신의 집으로 갈까요\n" +
                "무서우면 안겨도 돼요\n" +
                "이 손만 놓치지 말아요\n" +
                "조금도 아쉬워 말아요\n" +
                "원하면 뭐든 맞출게요\n" +
                "Always always be yours\n" +
                "꿈과 사랑이 가득해요\n" +
                "신비한 세상으로 떠나요\n" +
                "화려한 불꽃놀이\n" +
                "둘만의 멋진 퍼레이드\n" +
                "나는 당신의 놀이공원\n" +
                "Merry-go merry-go merry-go-round\n" +
                "회전목마 위 아름다운 그대\n" +
                "Merry-go merry-go merry-go-round\n" +
                "예쁜 이마 위 입 맞출게요\n" +
                "꿈과 사랑이 가득해요\n" +
                "신비한 세상으로 떠나요\n" +
                "화려한 불꽃놀이\n" +
                "둘만의 멋진 퍼레이드\n" +
                "나는 당신의 놀이공원");
    }
}
