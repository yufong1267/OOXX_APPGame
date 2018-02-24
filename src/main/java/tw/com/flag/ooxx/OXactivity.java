package tw.com.flag.ooxx;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class OXactivity extends AppCompatActivity {

    private int count = 0;
    private boolean check1 = false , check2 = false , check3 = false;
    private boolean check4 = false , check5 = false , check6 = false;
    private boolean check7 = false , check8 = false , check9 = false;
    private String final_winner = "和局";
    public static boolean show_page2 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oxactivity);
        OXactivity.show_page2 = false;
        if(!AIgame_activity.show_page1)
        {
            //這邊顯示一個甚麼page
            final AlertDialog.Builder alertdialog = new AlertDialog.Builder(OXactivity.this);
            alertdialog.setMessage("This is 2P page");
            alertdialog.setNegativeButton("確認" , new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            alertdialog.show();
            AIgame_activity.show_page1 = true;
        }

        final Button show1 = (Button)findViewById(R.id.show1);
        final Button show2 = (Button)findViewById(R.id.show2);
        final Button show3 = (Button)findViewById(R.id.show3);
        final Button show4 = (Button)findViewById(R.id.show4);
        final Button show5 = (Button)findViewById(R.id.show5);
        final Button show6 = (Button)findViewById(R.id.show6);
        final Button show7 = (Button)findViewById(R.id.show7);
        final Button show8 = (Button)findViewById(R.id.show8);
        final Button show9 = (Button)findViewById(R.id.show9);

        show1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count % 2 == 1 && !check1)
                {
                    check1 = true;
                    count++;
                    show1.setText("X");
                    show1.setTextColor(Color.parseColor("#ff0000"));
                }else if(count % 2 == 0 && !check1)
                {
                    check1 = true;
                    count++;
                    show1.setText("O");
                    show1.setTextColor(Color.parseColor("#0000ff"));
                }
                check_win();
                check_end();
            }
        });

        show2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count % 2 == 1 && !check2)
                {
                    check2 = true;
                    count++;
                    show2.setText("X");
                    show2.setTextColor(Color.parseColor("#ff0000"));
                }else if(count % 2 == 0 && !check2)
                {
                    check2 = true;
                    count++;
                    show2.setText("O");
                    show2.setTextColor(Color.parseColor("#0000ff"));
                }
                check_win();
                check_end();
            }
        });
        show3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count % 2 == 1 && !check3)
                {
                    check3 = true;
                    count++;
                    show3.setText("X");
                    show3.setTextColor(Color.parseColor("#ff0000"));
                }else if(count % 2 == 0 && !check3)
                {
                    check3 = true;
                    count++;
                    show3.setText("O");
                    show3.setTextColor(Color.parseColor("#0000ff"));
                }
                check_win();
                check_end();
            }
        });
        show4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count % 2 == 1 && !check4)
                {
                    check4 = true;
                    count++;
                    show4.setText("X");
                    show4.setTextColor(Color.parseColor("#ff0000"));
                }else if(count % 2 == 0 && !check4)
                {
                    check4 = true;
                    count++;
                    show4.setText("O");
                    show4.setTextColor(Color.parseColor("#0000ff"));
                }
                check_win();
                check_end();
            }
        });
        show5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count % 2 == 1 && !check5)
                {
                    check5 = true;
                    count++;
                    show5.setText("X");
                    show5.setTextColor(Color.parseColor("#ff0000"));
                }else  if(count % 2 == 0 && !check5)
                {
                    check5 = true;
                    count++;
                    show5.setText("O");
                    show5.setTextColor(Color.parseColor("#0000ff"));
                }
                check_win();
                check_end();
            }
        });
        show6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count % 2 == 1 && !check6)
                {
                    count++;
                    check6 = true;
                    show6.setText("X");
                    show6.setTextColor(Color.parseColor("#ff0000"));
                }else if(count % 2 == 0 && !check6)
                {
                    check6 = true;
                    count++;
                    show6.setText("O");
                    show6.setTextColor(Color.parseColor("#0000ff"));
                }
                check_win();
                check_end();
            }
        });
        show7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count % 2 == 1 && !check7)
                {
                    check7 = true;
                    count++;
                    show7.setText("X");
                    show7.setTextColor(Color.parseColor("#ff0000"));
                }else if(count % 2 == 0 && !check7)
                {
                    check7 = true;
                    count++;
                    show7.setText("O");
                    show7.setTextColor(Color.parseColor("#0000ff"));
                }
                check_win();
                check_end();
            }
        });

        show8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count % 2 == 1 && !check8)
                {
                    check8 = true;
                    count++;
                    show8.setText("X");
                    show8.setTextColor(Color.parseColor("#ff0000"));
                }else  if(count % 2 == 0 && !check8)
                {
                    check8 = true;
                    count++;
                    show8.setText("O");
                    show8.setTextColor(Color.parseColor("#0000ff"));
                }
                check_win();
                check_end();
            }
        });
        show9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count % 2 == 1 && !check9)
                {
                    check9 = true;
                    count++;
                    show9.setText("X");
                    show9.setTextColor(Color.parseColor("#ff0000"));
                }else if(count % 2 == 0 && !check9)
                {
                    check9 = true;
                    count++;
                    show9.setText("O");
                    show9.setTextColor(Color.parseColor("#0000ff"));
                }
                check_win();
                check_end();
            }
        });

    }
    //增設一個跳轉服務
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if(keyCode==KeyEvent.KEYCODE_VOLUME_DOWN  && event.getRepeatCount()==0){  //按下音量建 就會跳轉

                Toast.makeText(this, "welcome to AI_Game", Toast.LENGTH_LONG).show();
            go_Aipage();
        }
        return false;
    }


    private void check_end(){
        if(count >= 9)
        {
            //先防止 結束後再click
            check1 = true;
            check2 = true;
            check3 = true;
            check4 = true;
            check5 = true;
            check6 = true;
            check7 = true;
            check8 = true;
            check9 = true;

            //Toast.makeText(this, "阿你在小聲甚麼啦", Toast.LENGTH_LONG).show();
            final AlertDialog.Builder alertdialog = new AlertDialog.Builder(OXactivity.this);
            alertdialog.setMessage("請問要重新開始嘛?");
            alertdialog.setTitle(final_winner);
            alertdialog.setPositiveButton("確認", new DialogInterface.OnClickListener()  {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                   finish();
                    Intent page = getIntent();
                    startActivity(page);
                }
            });
            alertdialog.setNegativeButton("取消" , new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });

            alertdialog.show();
        }
    }
    private void check_win(){
        Button q1 = (Button)findViewById(R.id.show1);
        Button q2 = (Button)findViewById(R.id.show2);
        Button q3 = (Button)findViewById(R.id.show3);
        Button q4 = (Button)findViewById(R.id.show4);
        Button q5 = (Button)findViewById(R.id.show5);
        Button q6 = (Button)findViewById(R.id.show6);
        Button q7 = (Button)findViewById(R.id.show7);
        Button q8 = (Button)findViewById(R.id.show8);
        Button q9 = (Button)findViewById(R.id.show9);

        String s1 = (String) q1.getText();
        String s2 = (String) q2.getText();
        String s3 = (String) q3.getText();
        String s4 = (String) q4.getText();
        String s5 = (String) q5.getText();
        String s6 = (String) q6.getText();
        String s7 = (String) q7.getText();
        String s8 = (String) q8.getText();
        String s9 = (String) q9.getText();

        //先檢查三條直線
        if(s1.equals("X") && s4.equals("X") && s7.equals("X"))
        {
            //下一個check_end就出現結果
            count = 9;
            final_winner = "X方獲勝!";
        }
        if(s1.equals("O") && s4.equals("O") && s7.equals("O"))
        {
            //下一個check_end就出現結果
            count = 9;
            final_winner = "O方獲勝!";
        }
        //-------------------------------------------------------------------------------------
        if(s2.equals("X") && s5.equals("X") && s8.equals("X"))
        {
            //下一個check_end就出現結果
            count = 9;
            final_winner = "X方獲勝!";
        }
        if(s2.equals("O") && s5.equals("O") && s8.equals("O"))
        {
            //下一個check_end就出現結果
            count = 9;
            final_winner = "O方獲勝!";
        }
        //---------------------------------------------------------------------------------------
        if(s3.equals("X") && s6.equals("X") && s9.equals("X"))
        {
            //下一個check_end就出現結果
            count = 9;
            final_winner = "X方獲勝!";
        }
        if(s3.equals("O") && s6.equals("O") && s9.equals("O"))
        {
            //下一個check_end就出現結果
            count = 9;
            final_winner = "O方獲勝!";
        }
        //---------------------------------------------------------------------------------------
        //接下來換三條橫線
        if(s1.equals("X") && s2.equals("X") && s3.equals("X"))
        {
            //下一個check_end就出現結果
            count = 9;
            final_winner = "X方獲勝!";
        }
        if(s1.equals("O") && s2.equals("O") && s3.equals("O"))
        {
            //下一個check_end就出現結果
            count = 9;
            final_winner = "O方獲勝!";
        }
        //---------------------------------------------------------------------------------------
        if(s4.equals("X") && s5.equals("X") && s6.equals("X"))
        {
            //下一個check_end就出現結果
            count = 9;
            final_winner = "X方獲勝!";
        }
        if(s4.equals("O") && s5.equals("O") && s6.equals("O"))
        {
            //下一個check_end就出現結果
            count = 9;
            final_winner = "O方獲勝!";
        }
        //---------------------------------------------------------------------------------------
        if(s7.equals("X") && s8.equals("X") && s9.equals("X"))
        {
            //下一個check_end就出現結果
            count = 9;
            final_winner = "X方獲勝!";
        }
        if(s7.equals("O") && s8.equals("O") && s9.equals("O"))
        {
            //下一個check_end就出現結果
            count = 9;
            final_winner = "O方獲勝!";
        }
        //檢查兩條斜線
        if(s1.equals("X") && s5.equals("X") && s9.equals("X"))
        {
            //下一個check_end就出現結果
            count = 9;
            final_winner = "X方獲勝!";
        }
        if(s1.equals("O") && s5.equals("O") && s9.equals("O"))
        {
            //下一個check_end就出現結果
            count = 9;
            final_winner = "O方獲勝!";
        }
        //---------------------------------------------------------------------------------------
        if(s3.equals("X") && s5.equals("X") && s7.equals("X"))
        {
            //下一個check_end就出現結果
            count = 9;
            final_winner = "X方獲勝!";
        }
        if(s3.equals("O") && s5.equals("O") && s7.equals("O"))
        {
            //下一個check_end就出現結果
            count = 9;
            final_winner = "O方獲勝!";
        }

        }
        private void go_Aipage(){
            Intent ai = new Intent(this , AIgame_activity.class);
            startActivity(ai);
            finish();
        }
}
