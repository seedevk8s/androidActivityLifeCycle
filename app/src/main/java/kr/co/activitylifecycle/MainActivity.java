package kr.co.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);
        setTitle("액티비티 라이프사이클");

        android.util.Log.i("액티비티 생명주기", "onCreate()");


        Button btnDial = findViewById(R.id.btnDial);
        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel:010-3077-0710");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });


        Button btnFinish = findViewById(R.id.btnFinish);
        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        android.util.Log.i("액티비티 생명주기", "onDestroy()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        android.util.Log.i("액티비티 생명주기", "onPause()");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        android.util.Log.i("액티비티 생명주기", "onRestart()");
    }


    @Override
    protected void onResume() {
        super.onResume();
        android.util.Log.i("액티비티 생명주기", "onResume()");
    }


    @Override
    protected void onStart() {
        super.onStart();
        android.util.Log.i("액티비티 생명주기", "onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        android.util.Log.i("액티비티 생명주기", "onStop()");
    }
}























