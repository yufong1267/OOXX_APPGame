package tw.com.flag.ooxx;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class AIgame_activity extends AppCompatActivity {
    public static boolean show_page1 = false;
    private boolean check1 = false;
    private boolean check2 = false;
    private boolean check3 = false;
    private boolean check4 = false;
    private boolean check5 = false;
    private boolean check6 = false;
    private boolean check7 = false;
    private boolean check8 = false;
    private boolean check9 = false;
    private int count = 0;
    private boolean Ai_do = false;
    private String winner_who = "NO";
    private boolean check_over = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aigame_activity);
        AIgame_activity.show_page1 = false;
        //onreate 的時候先跑出甚麼page
        if(!OXactivity.show_page2)
        {
            //這邊顯示一個甚麼page
            final AlertDialog.Builder alertdialog = new AlertDialog.Builder(AIgame_activity.this);
            alertdialog.setMessage("This is AI page");
            alertdialog.setNegativeButton("確認" , new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            alertdialog.show();
            OXactivity.show_page2 = true;
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
        show1.setText(" ");
        show2.setText(" ");
        show3.setText(" ");
        show4.setText(" ");
        show5.setText(" ");
        show6.setText(" ");
        show7.setText(" ");
        show8.setText(" ");
        show9.setText(" ");

        show1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //先避免重複按下這邊再執行
                if(!check1)
                {
                    show1.setText("X");
                    show1.setTextColor(Color.parseColor("#ff0000"));
                    count++;
                    check1 = true;
                    Ai_do = false;
                    check_end();
                    check_win();
                    if(!check_over)
                    {
                        AiPlay();
                        check_win();
                    }
                    check_end();
                }
            }
        });
        show2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!check2)
                {
                    show2.setText("X");
                    show2.setTextColor(Color.parseColor("#ff0000"));
                    count++;
                    check2 = true;
                    Ai_do = false;
                    check_end();
                    check_win();
                    if(!check_over)
                    {
                        AiPlay();
                        check_win();
                    }
                    check_end();
                }
            }
        });
        show3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!check3)
                {
                    show3.setText("X");
                    show3.setTextColor(Color.parseColor("#ff0000"));
                    count++;
                    check3 = true;
                    Ai_do = false;
                    check_end();
                    check_win();
                    if(!check_over)
                    {
                        AiPlay();
                        check_win();
                    }
                    check_end();
                }
            }
        });
        show4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!check4)
                {
                    show4.setText("X");
                    show4.setTextColor(Color.parseColor("#ff0000"));
                    count++;
                    check4 = true;
                    Ai_do = false;
                    check_end();
                    check_win();
                    if(!check_over)
                    {
                        AiPlay();
                        check_win();
                    }
                    check_end();
                }
            }
        });
        show5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!check5)
                {
                    show5.setText("X");
                    show5.setTextColor(Color.parseColor("#ff0000"));
                    count++;
                    check5 = true;
                    Ai_do = false;
                    check_end();
                    check_win();
                    if(!check_over)
                    {
                        AiPlay();
                        check_win();
                    }
                    check_end();
                }
            }
        });
        show6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!check6)
                {
                    show6.setText("X");
                    show6.setTextColor(Color.parseColor("#ff0000"));
                    count++;
                    check6 = true;
                    Ai_do = false;
                    check_end();
                    check_win();
                    if(!check_over)
                    {
                        AiPlay();
                        check_win();
                    }
                    check_end();
                }
            }
        });
        show7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!check7)
                {
                    show7.setText("X");
                    show7.setTextColor(Color.parseColor("#ff0000"));
                    count++;
                    check7 = true;
                    Ai_do = false;
                    check_end();
                    check_win();
                    if(!check_over)
                    {
                        AiPlay();
                        check_win();
                    }
                    check_end();
                }
            }
        });
        show8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!check8)
                {
                    show8.setText("X");
                    show8.setTextColor(Color.parseColor("#ff0000"));
                    count++;
                    check8 = true;
                    Ai_do = false;
                    check_end();
                    check_win();
                    if(!check_over)
                    {
                        AiPlay();
                        check_win();
                    }
                    check_end();
                }
            }
        });
        show9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!check9)
                {
                    show9.setText("X");
                    show9.setTextColor(Color.parseColor("#ff0000"));
                    count++;
                    check9 = true;
                    Ai_do = false;
                    check_end();
                    check_win();
                    if(!check_over)
                    {
                        AiPlay();
                        check_win();
                    }
                    check_end();
                }
            }
        });

    }

    //增設一個跳轉服務  這邊可以偵測有沒有按音量鍵
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if(keyCode==KeyEvent.KEYCODE_VOLUME_UP  && event.getRepeatCount()==0){  //按下音量建 就會跳轉

            //Toast.makeText(this, "welcome to 2P_Game", Toast.LENGTH_LONG).show();
            go_2P_game();
        }
        return false;
    }

    private void go_2P_game(){
        Intent twoplayer = new Intent(this,OXactivity.class);
        startActivity(twoplayer);
        finish();
    }
    private void check_end(){
//        final Button show1 = (Button)findViewById(R.id.show1);
//        final Button show2 = (Button)findViewById(R.id.show2);
//        final Button show3 = (Button)findViewById(R.id.show3);
//        final Button show4 = (Button)findViewById(R.id.show4);
//        final Button show5 = (Button)findViewById(R.id.show5);
//        final Button show6 = (Button)findViewById(R.id.show6);
//        final Button show7 = (Button)findViewById(R.id.show7);
//        final Button show8 = (Button)findViewById(R.id.show8);
//        final Button show9 = (Button)findViewById(R.id.show9);
//        String q1 = (String) show1.getText() , q2 = (String) show2.getText() , q3 = (String) show3.getText();
//        String q4 = (String) show4.getText() , q5 = (String) show5.getText() , q6 = (String) show6.getText();
//        String q7 = (String) show7.getText() , q8 = (String) show8.getText() , q9 = (String) show9.getText();
//        //這邊這樣只是單獨不想寫太長
//        boolean c1 = false , c2 = false , c3 = false;
//        if((q1.equals("X") || (q1.equals("O"))) && (q2.equals("X") || (q2.equals("O"))) && ((q3.equals("X") || (q3.equals("O")))))
//        {
//            c1 = true;
//        }
//        if((q4.equals("X") || (q4.equals("O"))) && (q5.equals("X") || (q5.equals("O"))) && ((q6.equals("X") || (q6.equals("O")))))
//        {
//            c2 = true;
//        }
//        if((q7.equals("X") || (q7.equals("O"))) && (q8.equals("X") || (q8.equals("O"))) && ((q9.equals("X") || (q9.equals("O")))))
//        {
//            c3 = true;
//        }
//        if(c1 && c2 && c3)
//        {
//            Intent restart = getIntent();
//            startActivity(restart);
//            finish();
//        }
        if(count >= 9)
        {
            final AlertDialog.Builder alertdialog = new AlertDialog.Builder(AIgame_activity.this);
            alertdialog.setMessage("請問要重新開始嘛?");
            alertdialog.setTitle(winner_who + " win!!");
            alertdialog.setPositiveButton("確認", new DialogInterface.OnClickListener()  {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                   // finish();
                    Intent page = getIntent();
                    startActivity(page);
                    finish();
                }
            });
            alertdialog.setNegativeButton("取消" , new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });

            alertdialog.show();
            check_over = true;
        }
    }

    private void AiPlay(){
        //AI重點權重 攻擊(win)>防禦>下單點
        final Button show1 = (Button)findViewById(R.id.show1);
        final Button show2 = (Button)findViewById(R.id.show2);
        final Button show3 = (Button)findViewById(R.id.show3);
        final Button show4 = (Button)findViewById(R.id.show4);
        final Button show5 = (Button)findViewById(R.id.show5);
        final Button show6 = (Button)findViewById(R.id.show6);
        final Button show7 = (Button)findViewById(R.id.show7);
        final Button show8 = (Button)findViewById(R.id.show8);
        final Button show9 = (Button)findViewById(R.id.show9);

        boolean c1 = show1.getText().toString().equals("X");
        boolean c2 = show2.getText().toString().equals("X");
        boolean c3 = show3.getText().toString().equals("X");
        boolean c4 = show4.getText().toString().equals("X");
        boolean c5 = show5.getText().toString().equals("X");
        boolean c6 = show6.getText().toString().equals("X");
        boolean c7 = show7.getText().toString().equals("X");
        boolean c8 = show8.getText().toString().equals("X");
        boolean c9 = show9.getText().toString().equals("X");

        //null
        boolean N1 = show1.getText().toString().equals(" ");
        boolean N2 = show2.getText().toString().equals(" ");
        boolean N3 = show3.getText().toString().equals(" ");
        boolean N4 = show4.getText().toString().equals(" ");
        boolean N5 = show5.getText().toString().equals(" ");
        boolean N6 = show6.getText().toString().equals(" ");
        boolean N7 = show7.getText().toString().equals(" ");
        boolean N8 = show8.getText().toString().equals(" ");
        boolean N9 = show9.getText().toString().equals(" ");
        //------------------------------------------------------------------------------------------------------------------
        //這邊以下開始攻擊
        boolean A1 = show1.getText().toString().equals("O");
        boolean A2 = show2.getText().toString().equals("O");
        boolean A3 = show3.getText().toString().equals("O");
        boolean A4 = show4.getText().toString().equals("O");
        boolean A5 = show5.getText().toString().equals("O");
        boolean A6 = show6.getText().toString().equals("O");
        boolean A7 = show7.getText().toString().equals("O");
        boolean A8 = show8.getText().toString().equals("O");
        boolean A9 = show9.getText().toString().equals("O");

        //橫線-1
        if(A2 && A3 && N1 && !Ai_do)
        {
            show1.setText("O");
            show1.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check1 = true;
            Ai_do = true;
        }
        if(A1 && A3 && N2 && !Ai_do)
        {
            show2.setText("O");
            show2.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check2 = true;
            Ai_do = true;
        }
        if(A1 && A2 && N3 && !Ai_do)
        {
            show3.setText("O");
            show3.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check3 = true;
            Ai_do = true;
        }
        //橫線-2
        if(A5 && A6 && N4 && !Ai_do)
        {
            show4.setText("O");
            show4.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check4 = true;
            Ai_do = true;
        }
        if(A4 && A6 && N5 && !Ai_do)
        {
            show5.setText("O");
            show5.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check5 = true;
            Ai_do = true;
        }
        if(A4 && A5 && N6 && !Ai_do)
        {
            show6.setText("O");
            show6.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check6 = true;
            Ai_do = true;
        }
        //橫線-3
        if(A8 && A9 && N7 && !Ai_do)
        {
            show7.setText("O");
            show7.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check7 = true;
            Ai_do = true;
        }
        if(A7 && A9 && N8 && !Ai_do)
        {
            show8.setText("O");
            show8.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check8 = true;
            Ai_do = true;
        }
        if(A7 && A8 && N9 && !Ai_do)
        {
            show9.setText("O");
            show9.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check9 = true;
            Ai_do = true;
        }
        //直線 攻擊
        //直線-1
        if(A4 && A7 && N1 && !Ai_do)
        {
            show1.setText("O");
            show1.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check1 = true;
            Ai_do = true;
        }
        if(A1 && A7 && N4 && !Ai_do)
        {
            show4.setText("O");
            show4.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check4 = true;
            Ai_do = true;
        }
        if(A1 && A4 && N7 && !Ai_do)
        {
            show7.setText("O");
            show7.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check7 = true;
            Ai_do = true;
        }
        //直線-2
        if(A5 && A8 && N2 && !Ai_do)
        {
            show2.setText("O");
            show2.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check2 = true;
            Ai_do = true;
        }
        if(A2 && A8 && N5 && !Ai_do)
        {
            show5.setText("O");
            show5.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check5 = true;
            Ai_do = true;
        }
        if(A2 && A5 && N8 && !Ai_do)
        {
            show8.setText("O");
            show8.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check8 = true;
            Ai_do = true;
        }
        //直線-3
        if(A6 && A9 && N3 && !Ai_do)
        {
            show3.setText("O");
            show3.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check3 = true;
            Ai_do = true;
        }
        if(A3 && A9 && N6 && !Ai_do)
        {
            show6.setText("O");
            show6.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check6 = true;
            Ai_do = true;
        }
        if(A3 && A6 && N9 && !Ai_do)
        {
            show9.setText("O");
            show9.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check9 = true;
            Ai_do = true;
        }
        //斜線 攻擊
        //斜線-1
        if(A5 && A9 && N1 && !Ai_do)
        {
            show1.setText("O");
            show1.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check1 = true;
            Ai_do = true;
        }
        if(A1 && A9 && N5 && !Ai_do)
        {
            show5.setText("O");
            show5.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check5 = true;
            Ai_do = true;
        }
        if(A1 && A5 && N9 && !Ai_do)
        {
            show9.setText("O");
            show9.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check9 = true;
            Ai_do = true;
        }
        //斜線-2
        if(A5 && A7 && N3 && !Ai_do)
        {
            show3.setText("O");
            show3.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check3 = true;
            Ai_do = true;
        }
        if(A3 && A7 && N5 && !Ai_do)
        {
            show5.setText("O");
            show5.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check5 = true;
            Ai_do = true;
        }
        if(A3 && A5 && N7 && !Ai_do)
        {
            show7.setText("O");
            show7.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check7 = true;
            Ai_do = true;
        }
//---------------------------------------------------------------------------------------------------------------攻擊結束
        // 防禦
        //橫線-1
        if(c2 && c3 && N1 && !Ai_do)
        {
            show1.setText("O");
            show1.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check1 = true;
            Ai_do = true;
            check_end();
        }
        if(c1 && c3 && N2 && !Ai_do)
        {
            show2.setText("O");
            show2.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check2 = true;
            Ai_do = true;
            check_end();
        }
        if(c1 && c2 && N3 && !Ai_do)
        {
            show3.setText("O");
            show3.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check3 = true;
            Ai_do = true;
            check_end();
        }
        //橫線-2
        if(c5 && c6 && N4 && !Ai_do)
        {
            show4.setText("O");
            show4.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check4 = true;
            Ai_do = true;
            check_end();
        }
        if(c4 && c6 && N5 && !Ai_do)
        {
            show5.setText("O");
            show5.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check5 = true;
            Ai_do = true;
            check_end();
        }
        if(c4 && c5 && N6 && !Ai_do)
        {
            show6.setText("O");
            show6.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check6 = true;
            Ai_do = true;
            check_end();
        }
        //橫線-3
        if(c8 && c9 && N7 && !Ai_do)
        {
            show7.setText("O");
            show7.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check7 = true;
            Ai_do = true;
            check_end();
        }
        if(c7 && c9 && N8 && !Ai_do)
        {
            show8.setText("O");
            show8.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check8 = true;
            Ai_do = true;
            check_end();
        }
        if(c7 && c8 && N9 && !Ai_do)
        {
            show9.setText("O");
            show9.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check9 = true;
            Ai_do = true;
            check_end();
        }
        //直線防禦
        //直線-1
        if(c4 && c7 && N1 && !Ai_do)
        {
            show1.setText("O");
            show1.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check1 = true;
            Ai_do = true;
            check_end();
        }
        if(c1 && c7 && N4 && !Ai_do)
        {
            show4.setText("O");
            show4.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check4 = true;
            Ai_do = true;
            check_end();
        }
        if(c1 && c4 && N7 && !Ai_do)
        {
            show7.setText("O");
            show7.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check7 = true;
            Ai_do = true;
            check_end();
        }
        //直線-2
        if(c5 && c8 && N2 && !Ai_do)
        {
            show2.setText("O");
            show2.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check2 = true;
            Ai_do = true;
            check_end();
        }
        if(c2 && c8 && N5 && !Ai_do)
        {
            show5.setText("O");
            show5.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check5 = true;
            Ai_do = true;
            check_end();
        }
        if(c2 && c5 && N8 && !Ai_do)
        {
            show8.setText("O");
            show8.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check8 = true;
            Ai_do = true;
            check_end();
        }
        //直線-3
        if(c6 && c9 && N3 && !Ai_do)
        {
            show3.setText("O");
            show3.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check3 = true;
            Ai_do = true;
            check_end();
        }
        if(c3 && c9 && N6 && !Ai_do)
        {
            show6.setText("O");
            show6.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check6 = true;
            Ai_do = true;
            check_end();
        }
        if(c3 && c6 && N9 && !Ai_do)
        {
            show9.setText("O");
            show9.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check9 = true;
            Ai_do = true;
            check_end();
        }
        //斜線 防禦
        //斜線-1
        if(c5 && c9 && N1 && !Ai_do)
        {
            show1.setText("O");
            show1.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check1 = true;
            Ai_do = true;
            check_end();
        }
        if(c1 && c9 && N5 && !Ai_do)
        {
            show5.setText("O");
            show5.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check5 = true;
            Ai_do = true;
            check_end();
        }
        if(c1 && c5 && N9 && !Ai_do)
        {
            show9.setText("O");
            show9.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check9 = true;
            Ai_do = true;
            check_end();
        }
        //斜線-2
        if(c5 && c7 && N3 && !Ai_do)
        {
            show3.setText("O");
            show3.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check3 = true;
            Ai_do = true;
            check_end();
        }
        if(c3 && c7 && N5 && !Ai_do)
        {
            show5.setText("O");
            show5.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check5 = true;
            Ai_do = true;
            check_end();
        }
        if(c3 && c5 && N7 && !Ai_do)
        {
            show7.setText("O");
            show7.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check7 = true;
            Ai_do = true;
            check_end();
        }


        //單一攻擊 權重(角落>中間>邊邊)
        //角落攻擊要先攻擊下過後的中間
        if(N5 && !Ai_do) //中間
        {
            show5.setText("O");
            show5.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check5 = true;
            Ai_do = true;
        }
        if(N1 && !Ai_do) //角落1
        {
            show1.setText("O");
            show1.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check1 = true;
            Ai_do = true;
        }
        if(N3 && !Ai_do) //角落2
        {
            show3.setText("O");
            show3.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check3 = true;
            Ai_do = true;
        }
        if(N7 && !Ai_do) //角落3
        {
            show7.setText("O");
            show7.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check7 = true;
            Ai_do = true;
        }
        if(N9 && !Ai_do) //角落4
        {
            show9.setText("O");
            show9.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check9 = true;
            Ai_do = true;
        }

        if(N2 && !Ai_do) //邊邊1
        {
            show2.setText("O");
            show2.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check2 = true;
            Ai_do = true;
        }
        if(N4 && !Ai_do) //邊邊2
        {
            show4.setText("O");
            show4.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check4 = true;
            Ai_do = true;
        }
        if(N6 && !Ai_do) //邊邊3
        {
            show6.setText("O");
            show6.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check6 = true;
            Ai_do = true;
        }
        if(N8 && !Ai_do) //邊邊4
        {
            show8.setText("O");
            show8.setTextColor(Color.parseColor("#0000ff"));
            count++;
            check8 = true;
            Ai_do = true;
        }
    }

    private void check_win(){
        final Button show1 = (Button)findViewById(R.id.show1);
        final Button show2 = (Button)findViewById(R.id.show2);
        final Button show3 = (Button)findViewById(R.id.show3);
        final Button show4 = (Button)findViewById(R.id.show4);
        final Button show5 = (Button)findViewById(R.id.show5);
        final Button show6 = (Button)findViewById(R.id.show6);
        final Button show7 = (Button)findViewById(R.id.show7);
        final Button show8 = (Button)findViewById(R.id.show8);
        final Button show9 = (Button)findViewById(R.id.show9);
        boolean X1 = show1.getText().toString().equals("X");
        boolean X2 = show2.getText().toString().equals("X");
        boolean X3 = show3.getText().toString().equals("X");
        boolean X4 = show4.getText().toString().equals("X");
        boolean X5 = show5.getText().toString().equals("X");
        boolean X6 = show6.getText().toString().equals("X");
        boolean X7 = show7.getText().toString().equals("X");
        boolean X8 = show8.getText().toString().equals("X");
        boolean X9 = show9.getText().toString().equals("X");
        boolean O1 = show1.getText().toString().equals("O");
        boolean O2 = show2.getText().toString().equals("O");
        boolean O3 = show3.getText().toString().equals("O");
        boolean O4 = show4.getText().toString().equals("O");
        boolean O5 = show5.getText().toString().equals("O");
        boolean O6 = show6.getText().toString().equals("O");
        boolean O7 = show7.getText().toString().equals("O");
        boolean O8 = show8.getText().toString().equals("O");
        boolean O9 = show9.getText().toString().equals("O");
        // XXwin
        if((X1 && X2 && X3) || (X4 && X5 && X6) || (X7 && X8 && X9))
        {
            //先偵測橫線
            count+=9;
            winner_who = "you";
        }else if((X1 && X4 && X7) || (X2 && X5 && X8) || (X3 && X6 && X9)){
            //換直線
            count+=9;
            winner_who = "you";
        }else if ((X1 && X5 && X9) || (X3 && X5 && X7)){
            //換斜線
            count+=9;
            winner_who = "you";
        }

        //OOwin
        if((O1 && O2 && O3) || (O4 && O5 && O6) || (O7 && O8 && O9))
        {
            //先偵測橫線
            count+=9;
            winner_who = "computer";
        }else if((O1 && O4 && O7) || (O2 && O5 && O8) || (O3 && O6 && O9)){
            //直線
            count+=9;
            winner_who = "computer";
        }else if ((O1 && O5 && O9) || (O3 && O5 && O7))
        {
            //斜線
            count+=9;
            winner_who = "computer";
        }
    }

}
