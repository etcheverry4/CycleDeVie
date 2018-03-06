package com.example.betcheverry.cycledevie;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by METCHEVERRY on 28/02/2018.
 */

public class ActivityTwo  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toast.makeText(this, "Create 2", Toast.LENGTH_SHORT).show();

        Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityTwo.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Start 2", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Resume 2", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onSaveInstanceState(Bundle bundle){
        super.onSaveInstanceState(bundle);
        Toast.makeText(this, "SaveInstanceState 2", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRestoreInstanceState(Bundle bundle){
        super.onRestoreInstanceState(bundle);
        Toast.makeText(this, "RestoreInstanceState 2", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Pause 2", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Stop 2", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Restart 2", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Destroy 2", Toast.LENGTH_LONG).show();
    }
}
