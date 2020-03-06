package com.guptaamey.activitylifesyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;

import android.os.Bundle;
import android.preference.PreferenceManager;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView a, b, c, d, e, f, g;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        editor = sharedPreferences.edit();

        a = findViewById(R.id.onCreateCtr);
        b = findViewById(R.id.onStartCtr);
        c = findViewById(R.id.onResumeCtr);
        d = findViewById(R.id.onStopCtr);
        e = findViewById(R.id.onPauseCtr);
        f = findViewById(R.id.onRestartCtr);
        g = findViewById(R.id.onDestroyCtr);

        editor.putInt(a.getId() + "", 0);
        editor.putInt(b.getId() + "", 0);
        editor.putInt(c.getId() + "", 0);
        editor.putInt(d.getId() + "", 0);
        editor.putInt(e.getId() + "", 0);
        editor.putInt(f.getId() + "", 0);
        editor.putInt(g.getId() + "", 0);

        a.setText("0, " + sharedPreferences.getInt( a.getId() + "", 0));
        b.setText("0, " + sharedPreferences.getInt( a.getId() + "", 0));
        c.setText("0, " + sharedPreferences.getInt( a.getId() + "", 0));
        d.setText("0, " + sharedPreferences.getInt( a.getId() + "", 0));
        e.setText("0, " + sharedPreferences.getInt( a.getId() + "", 0));
        f.setText("0, " + sharedPreferences.getInt( a.getId() + "", 0));
        g.setText("0, " + sharedPreferences.getInt( a.getId() + "", 0));

        clear = findViewById(R.id.clickButton);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();

                editor.putInt(a.getId() + "", 0);
                editor.putInt(b.getId() + "", 0);
                editor.putInt(c.getId() + "", 0);
                editor.putInt(d.getId() + "", 0);
                editor.putInt(e.getId() + "", 0);
                editor.putInt(f.getId() + "", 0);
                editor.putInt(g.getId() + "", 0);
                editor.apply();

                a.setText("0, 0");
                b.setText("0, 0");
                c.setText("0, 0");
                d.setText("0, 0");
                e.setText("0, 0");
                f.setText("0, 0");
                g.setText("0, 0");
            }
        });

        String[] counters = a.getText().toString().split(", ");
        int[] count = {Integer.parseInt(counters[0])+1, Integer.parseInt(counters[1])+1};

        editor.remove(a.getId() + "");
        editor.apply();
        editor.putInt(a.getId() + "", count[1]);
        editor.apply();

        String newText= count[0] + ", " + count[1];
        a.setText(newText);
    }

    @Override
    protected void onStart() {
        super.onStart();
        editor = sharedPreferences.edit();

        String[] counters = b.getText().toString().split(", ");
        int[] count = {Integer.parseInt(counters[0])+1, Integer.parseInt(counters[1])+1};

        editor.remove(b.getId() + "");
        editor.apply();
        editor.putInt(b.getId() + "", count[1]);
        editor.apply();

        String newText= count[0] + ", " + count[1];
        b.setText(newText);
    }

    @Override
    protected void onResume() {
        super.onResume();
        editor = sharedPreferences.edit();

        String[] counters = c.getText().toString().split(", ");
        int[] count = {Integer.parseInt(counters[0])+1, Integer.parseInt(counters[1])+1};

        editor.remove(c.getId() + "");
        editor.apply();
        editor.putInt(c.getId() + "", count[1]);
        editor.apply();

        String newText= count[0] + ", " + count[1];
        c.setText(newText);
    }

    @Override
    protected void onPause() {
        super.onPause();
        editor = sharedPreferences.edit();

        String[] counters = d.getText().toString().split(", ");
        int[] count = {Integer.parseInt(counters[0])+1, Integer.parseInt(counters[1])+1};

        editor.remove(d.getId() + "");
        editor.apply();
        editor.putInt(d.getId() + "", count[1]);
        editor.apply();

        String newText= count[0] + ", " + count[1];
        d.setText(newText);
    }

    @Override
    protected void onStop() {
        super.onStop();
        editor = sharedPreferences.edit();

        String[] counters = e.getText().toString().split(", ");
        int[] count = {Integer.parseInt(counters[0])+1, Integer.parseInt(counters[1])+1};

        editor.remove(e.getId() + "");
        editor.apply();
        editor.putInt(e.getId() + "", count[1]);
        editor.apply();

        String newText= count[0] + ", " + count[1];
        e.setText(newText);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        editor = sharedPreferences.edit();

        String[] counters = f.getText().toString().split(", ");
        int[] count = {Integer.parseInt(counters[0])+1, Integer.parseInt(counters[1])+1};

        editor.remove(f.getId() + "");
        editor.apply();
        editor.putInt(f.getId() + "", count[1]);
        editor.apply();

        String newText= count[0] + ", " + count[1];
        f.setText(newText);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        editor = sharedPreferences.edit();

        String[] counters = g.getText().toString().split(", ");
        int[] count = {Integer.parseInt(counters[0])+1, Integer.parseInt(counters[1])+1};

        editor.remove(g.getId() + "");
        editor.apply();
        editor.putInt(g.getId() + "", count[1]);
        editor.apply();

        String newText= count[0] + ", " + count[1];
        g.setText(newText);
    }

}
