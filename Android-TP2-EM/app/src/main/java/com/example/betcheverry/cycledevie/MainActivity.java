package com.example.betcheverry.cycledevie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    public Livre livre = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Create 1", Toast.LENGTH_LONG);

        this.button = (Button)findViewById(R.id.button);
        this.button.setOnClickListener(this);
    }

    public void onClick(View v){
        final Intent intent = new Intent(MainActivity.this, ActivityTwo.class);
        this.startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Start 1", Toast.LENGTH_LONG);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Resume 1", Toast.LENGTH_LONG);
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
        Toast.makeText(this, "Pause 1", Toast.LENGTH_LONG);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Stop 1", Toast.LENGTH_LONG);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Restart 1", Toast.LENGTH_LONG);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Destroy 1", Toast.LENGTH_LONG);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
