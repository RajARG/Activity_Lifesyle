package com.guptaamey.activitylifesyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;

import android.os.Bundle;
import android.preference.PreferenceManager;

import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView a, b, c, d, e, f, g;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        a = findViewById(R.id.onCreateCtr);
        b = findViewById(R.id.onStartCtr);
        c = findViewById(R.id.onResumeCtr);
        d = findViewById(R.id.onStopCtr);
        e = findViewById(R.id.onPauseCtr);
        f = findViewById(R.id.onRestartCtr);
        g = findViewById(R.id.onDestroyCtr);

        a.setText("0, " + sharedPreferences.getInt( a.getId() + "", 0));
        b.setText("0, " + sharedPreferences.getInt( a.getId() + "", 0));
        c.setText("0, " + sharedPreferences.getInt( a.getId() + "", 0));
        d.setText("0, " + sharedPreferences.getInt( a.getId() + "", 0));
        e.setText("0, " + sharedPreferences.getInt( a.getId() + "", 0));
        f.setText("0, " + sharedPreferences.getInt( a.getId() + "", 0));
        g.setText("0, " + sharedPreferences.getInt( a.getId() + "", 0));

        String[] counters = a.getText().toString().split(", ");

        editor.remove(a.getId() + "");
        editor.apply();

        editor.putInt(a.getId() + "", Integer.parseInt(counters[1]) + 1);
        editor.apply();

        a.setText(Integer.parseInt(counters[0])+ 1);

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
