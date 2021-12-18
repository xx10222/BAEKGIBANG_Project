package com.cookandroid.term_project;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SleepActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText("한 걸음마다\n" +
                "난 너를 따라 발을 맞춰\n" +
                "나란히 함께 가고 있어\n" +
                "매일 난\n" +
                "니 어깨에 맞춰\n" +
                "나의 팔을 내어 두르면\n" +
                "세상엔 온통 우리만 가득해\n" +
                "Whatever You want\n" +
                "Whatever You say\n" +
                "너와 늘 만들어갈게\n" +
                "Whatever You want\n" +
                "Whatever You say\n" +
                "니가 늘 웃을 수 있게\n" +
                "니가 보는 난 변하지 않아\n" +
                "그 어떤 이유라도\n" +
                "네게 남을게\n" +
                "지금 모습 이대로\n" +
                "까마득한 내일\n" +
                "지울 수 없는 오늘\n" +
                "불안할 테지만\n" +
                "버거울 걸 알지만\n" +
                "내가 니 손을 잡아 줄 거야\n" +
                "모든 게 바뀌고\n" +
                "많은 날이 가도\n" +
                "나의 시간은\n" +
                "니 곁에 멈출 거야\n" +
                "정신없이 살다\n" +
                "언제 돌아봐도\n" +
                "니 곁에 늘 난\n" +
                "Whatever You want\n" +
                "Whatever You say\n" +
                "너와 늘 만들어갈게\n" +
                "Whatever You want\n" +
                "Whatever You say\n" +
                "니가 늘 웃을 수 있게\n" +
                "니가 보는 난 변하지 않아\n" +
                "그 어떤 이유라도\n" +
                "네게 남을게\n" +
                "지금 모습 이대로\n" +
                "언젠가는 지금을\n" +
                "떠올리는 날 온다면\n" +
                "반짝이는 순간들로\n" +
                "기억 되어지길\n" +
                "Whatever You want\n" +
                "Whatever You say\n" +
                "너와 늘 만들어갈게\n" +
                "Whatever You want\n" +
                "Whatever You say\n" +
                "니가 늘 웃을 수 있게\n" +
                "니가 보는 난 변하지 않아\n" +
                "그 어떤 이유라도\n" +
                "네게 남을게\n" +
                "지금 모습 이대로");
    }
}
