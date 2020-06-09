package tw.pu.edu.tw.s1071465.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity5);
        getSupportActionBar().hide(); //隱藏標題
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN); //隱藏狀態
        AlertDialog.Builder dialog = new AlertDialog.Builder(activity5.this);
        dialog.setTitle("恭喜你完成了所有挑戰");
        dialog.setMessage("Good job!");
        dialog.setNegativeButton("結束",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                Intent it = new Intent(activity5.this, MainActivity.class);
                startActivity(it);
            }
        });
        dialog.setPositiveButton("再來一次",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                Intent it = new Intent(activity5.this, activity4.class);
                startActivity(it);
            }

        });
        dialog.show();
    }
}
