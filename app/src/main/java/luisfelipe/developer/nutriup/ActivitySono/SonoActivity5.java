package luisfelipe.developer.nutriup.ActivitySono;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import luisfelipe.developer.nutriup.R;

public class SonoActivity5 extends AppCompatActivity {

    Button btnProximo, btnAnterior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sono5);


        btnProximo = findViewById(R.id.btnProximo5);
        btnAnterior = findViewById(R.id.btnAnterior5);

        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SonoActivity5.this, SonoActivity52.class);
                startActivity(intent);
            }
        });

        btnAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SonoActivity5.this, SonoActivity4.class);
                startActivity(intent);
            }
        });

    }



}






