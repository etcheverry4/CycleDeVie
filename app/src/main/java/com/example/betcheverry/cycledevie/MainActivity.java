package com.example.betcheverry.cycledevie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by METCHEVERRY on 28/02/2018.
 */

public class MainActivity extends AppCompatActivity {

    public Livre livre = null;

    Livre livre1 = new Livre("livre1", "A1", 248);
    Livre livre2 = new Livre("livre2", "A2", 497);
    Livre livre3 = new Livre("livre3", "A3", 652);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Create 1", Toast.LENGTH_LONG).show();

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityTwo.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Start 1", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Resume 1", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onSaveInstanceState(Bundle bundle){
        super.onSaveInstanceState(bundle);
        Toast.makeText(this, "SaveInstanceState 1", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRestoreInstanceState(Bundle bundle){
        super.onRestoreInstanceState(bundle);
        Toast.makeText(this, "RestoreInstanceState 1", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Pause 1", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Stop 1", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Restart 1", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Destroy 1", Toast.LENGTH_LONG).show();
    }
}
