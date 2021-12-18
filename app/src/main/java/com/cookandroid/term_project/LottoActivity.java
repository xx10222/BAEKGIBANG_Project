package com.cookandroid.term_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashSet;
import java.util.Set;

public class LottoActivity extends Activity {
    int idNumbers[][] = {
            {R.id.lotto11, R.id.lotto12, R.id.lotto13, R.id.lotto14, R.id.lotto15, R.id.lotto16},
            {R.id.lotto21, R.id.lotto22, R.id.lotto23, R.id.lotto24, R.id.lotto25, R.id.lotto26},
            {R.id.lotto31, R.id.lotto32, R.id.lotto33, R.id.lotto34, R.id.lotto35, R.id.lotto36},
            {R.id.lotto41, R.id.lotto42, R.id.lotto43, R.id.lotto44, R.id.lotto45, R.id.lotto46},
            {R.id.lotto51, R.id.lotto52, R.id.lotto53, R.id.lotto54, R.id.lotto55, R.id.lotto56},
    };
    int lottoNums[] = new int[6];
    int nums[] = new int[45];
    int temp[] = new int[45];
    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lotto);

        Button makeNumber = (Button) findViewById(R.id.makeNumber);
        makeNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Lotto 번호를 생성하였습니다.", Toast.LENGTH_SHORT).show();
                for (int i = 0; i < idNumbers.length; i++) {
                    index = i;
                    fillLottoNumbers();
                    for (int j = 0; j < idNumbers[0].length; j++) {
                        Button lottoNumber = (Button) findViewById(idNumbers[i][j]);
                        String str = "" + lottoNums[j];
                        lottoNumber.setText(str);
                    }
                }
            }
        });
    }

    private void init() {
        for(int i = 0; i < lottoNums.length; i++) {
            lottoNums[i] = 0;
        }
    }

    private void sort() {
        int t;
        for(int i = 0; i < 5; i++) {
            for(int j = i; j < 6; j++) {
                if(lottoNums[i] > lottoNums[j]) {
                    t = lottoNums[i];
                    lottoNums[i] = lottoNums[j];
                    lottoNums[j] = t;
                }
            }
        }
    }

    private void makeLottoNumbers1() {
        int j, n;
        for(int i = 0; i < 6;) {
            n = (int)(Math.random() * 45 + 1);
            for(j = 0; j < i; j++) {
                if(lottoNums[j] == n) break;
            }
            if(j == i) {
                lottoNums[i] = n;
                i++;
            }
        }
    }

    private void makeLottoNumbers2() {
        Set<Integer> s = new HashSet<>();
        int n;
        for(int i = 0; i < 6;) {
            n = (int) (Math.random() * 45 + 1);
            if(s.add(n)) {
                lottoNums[i++] = n;
            }
        }
        s.clear();
    }

    private void makeLottoNumbers3() {
        int n, temp;
        for(int i = 0; i < 45; i++) nums[i] = i + 1;
        for(int i = 0; i < 777; i++) {
            n = (int) (Math.random() * 45);
            if(n == 0) continue;
            temp = nums[0];
            nums[0] = nums[n];
            nums[n] = temp;
        }

        n = (int) (Math.random() * 45);
        for(int i = n, j = 0; j < 6; i++, j++) {
            lottoNums[j] = nums[i % 45];
        }
    }

    private void makeLottoNumbers4() {
        int n, max;

        for(int i = 0; i < nums.length; i++) {
            nums[i] = 0;
        }

        for(int i = 0; i < 777; i++) {
            n = (int)(Math.random() * 45);
            nums[n]++;
        }

        for(int i = 0; i < lottoNums.length; i++) {
            max = nums[0];
            n = 0;
            for(int j = 1; j < nums.length; j++) {
                if(max < nums[j]) {
                    max = nums[j];
                    n = j;
                }
            }
            lottoNums[i] = n + 1;
            nums[n] = 0;
        }
    }

    private void makeLottoNumbers5() {
        int n;
        for(int i = 0; i < 45; i++) temp[i] = i + 1;
        for(int i = 0, idx = 45; i < 45; i++, idx--) {
            n = (int) (Math.random() * idx);
            nums[i] = temp[n];
            for(int j = n; j < idx - 1; j++) {
                temp[j] = temp[j + 1];
            }
        }

        n = (int) (Math.random() * 45);
        for(int i = n, j = 0; j < 6; i++, j++) {
            lottoNums[j] = nums[i % 45];
        }
    }

    private void fillLottoNumbers() {
        init();
        switch (index) {
            case 0 : makeLottoNumbers1(); break;
            case 1 : makeLottoNumbers2(); break;
            case 2 : makeLottoNumbers3(); break;
            case 3 : makeLottoNumbers4(); break;
            case 4 : makeLottoNumbers5(); break;
        }
        sort();
    }
}
