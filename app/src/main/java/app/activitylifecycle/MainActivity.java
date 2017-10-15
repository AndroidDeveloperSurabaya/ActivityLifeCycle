package app.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static String LOG = "MainActivity";
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(LOG, "OnCreate");

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();

        Log.d(LOG, "onStart");
    }

    @Override
    protected void onRestart(){
        super.onRestart();

        Log.d(LOG, "onRestart");
    }

    @Override
    protected void onResume(){
        super.onResume();

        Log.d(LOG, "onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();

        Log.d(LOG, "onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();

        Log.d(LOG, "onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

        Log.d(LOG, "onDestroy");
    }
}
