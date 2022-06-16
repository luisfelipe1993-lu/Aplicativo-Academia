package luisfelipe.developer.nutriup.ActivityAgua;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import luisfelipe.developer.nutriup.Adapter.MenuActivity;
import luisfelipe.developer.nutriup.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                abrirMenuActivity();            }
        },3000);


    }

    private void abrirMenuActivity(){
        Intent i = new Intent (SplashActivity.this, MenuActivity.class);
        startActivity(i);
        finish();
    }
}






