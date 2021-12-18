package com.cookandroid.term_project;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class LoveActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love);

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText("지금 바로 데리러 가는 중이니까\n" +
                "나오지 말고 그대로 있어\n" +
                "오늘따라 시린 바람은 재촉해 날\n" +
                "따뜻한 너의 품에 가서 안기라고\n" +
                "\n" +
                "I just wanna be your lover\n" +
                "모두가 아는 나 말고\n" +
                "오로지 너의 남자 너의 privacy\n" +
                "\n" +
                "우리만 아는 비밀\n" +
                "It’s not even on profile\n" +
                "이제부터는 너도 나의 privacy\n" +
                "Hold me close and don’t let me\n" +
                "go 난 너의 끝까지\n" +
                "알고 싶다고 don't hide it from me\n" +
                "\n" +
                "숨김없는 네 모습에 난 또\n" +
                "강아지처럼 안기네 폭\n" +
                "You make me feel so damn cozy\n" +
                "네가 내 휴식시간이야\n" +
                "영화에서나 봤던 장면 속에 데려가\n" +
                "당연히 주인공은 너와 나\n" +
                "\n" +
                "So won’t you come and be my lover\n" +
                "모두가 아는 너 말고\n" +
                "오로지 나의 baby 나의 privacy\n" +
                "\n" +
                "우리만 아는 비밀\n" +
                "It’s not even on profile\n" +
                "이제부터는 너도 나의 privacy\n" +
                "Hold me close and don’t let me\n" +
                "go 난 너의 끝까지\n" +
                "알고 싶다고 don't hide it from me\n" +
                "\n" +
                "우린 오늘 밤이란\n" +
                "바다를 건너갈 거야\n" +
                "You and I\n" +
                "그리고 달만이 아는 그런\n" +
                "이야길 만들어 매 순간\n" +
                "\n" +
                "우리만 아는 비밀\n" +
                "It’s not even on profile\n" +
                "이제부터는 너도 나의 privacy\n" +
                "Hold me close and don’t let me\n" +
                "go 난 너의 끝까지\n" +
                "알고 싶다고 don't hide it");
    }
}
