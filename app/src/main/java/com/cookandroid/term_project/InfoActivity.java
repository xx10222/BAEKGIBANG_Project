package com.cookandroid.term_project;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        final Button btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(InfoActivity.this);
                dlg.setTitle("제작자 정보");
                dlg.setMessage("학과 : 컴퓨터정보공학부\n학번 : 2018202001\n이름 : 염지원");
                dlg.setIcon(R.drawable.light);
                dlg.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(InfoActivity.this, "다른 정보도 확인해보세요!",Toast.LENGTH_SHORT).show();
                    }
                });
                dlg.show();
            }
        });

        final Button btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(InfoActivity.this);
                dlg.setTitle("제작 동기");
                dlg.setMessage("군 입대, 1년 9개월\n" +
                        "길다면 길고, 짧다면 짧은 시간\n" +
                        "서로 잠시 떨어져 있어야만 하는 너무 아쉬운 시간입니다\n" +
                        "하지만, 10년이라는 몇 배는 긴 시간동안 아름다운 추억을 쌓은 우리에겐 분명히 이 시간을 멋지게 견뎌낼 힘이 있습니다\n" +
                        "제가 장담하건대, 우리는 다시 만날 것이고 함께 웃을 것입니다\n" +
                        "그래서 제가 잠시 떠나 있는 이 시간을 보내는 방법\n" +
                        "3가지를 말씀드리고자 합니다\n" +
                        "Miss You BH 'ㅅ' ");
                dlg.setIcon(R.drawable.light);
                dlg.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(InfoActivity.this, "다른 정보도 확인해보세요!",Toast.LENGTH_SHORT).show();
                    }
                });
                dlg.show();
            }
        });

        final Button btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(InfoActivity.this);
                dlg.setTitle("어플 설명");
                dlg.setMessage("이 어플은 큥튜브에 올라왔던 '백현이를 기다리는 3가지 방법' 영상을 참고하여 제작하였습니다\n" +
                        "영상 속 3가지 방법을 기반으로 기능을 만들었고, 추가로 제가 원하는 기능들을 만들었습니다\n" +
                        "원본 영상은 이전 화면의 맨 아래의 버튼을 클릭하여 확인할 수 있습니다!");
                dlg.setIcon(R.drawable.light);
                dlg.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(InfoActivity.this, "다른 정보도 확인해보세요!",Toast.LENGTH_SHORT).show();
                    }
                });
                dlg.show();
            }
        });

        final Button btn4 = (Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(InfoActivity.this);
                dlg.setTitle("향후 계획");
                dlg.setMessage("향후에는 커뮤니티 기능도 추가하여 이 시간을 함께 보내고 있는 분들과 소통할 수 있는" +
                        "공간을 만들고 싶습니다!\n" +
                        "또한 이외의 기능들도 추가하여 배포를 통해 많은 사람들과 사용하고 싶습니다 :D");
                dlg.setIcon(R.drawable.light);
                dlg.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(InfoActivity.this, "다른 정보도 확인해보세요!",Toast.LENGTH_SHORT).show();
                    }
                });
                dlg.show();
            }
        });

        final Button btn5 = (Button)findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Toast.makeText(InfoActivity.this,"로또 번호 생성기입니다!",Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(getApplicationContext(), LottoActivity.class);
                startActivity(intent1);
            }
        });

        final Button btn6 = (Button)findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Toast.makeText(InfoActivity.this,"유튜브 링크로 연결됩니다!",Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(getApplicationContext(), OriginalVideoActivity.class);
                startActivity(intent1);
            }
        });
    }
}
