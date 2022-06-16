package luisfelipe.developer.nutriup.ActivitySono;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import luisfelipe.developer.nutriup.R;

public class SonoActivity3 extends AppCompatActivity {

    Button btnProximo, btnAnterior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sono3);


        btnProximo = findViewById(R.id.btnProximo);
        btnAnterior = findViewById(R.id.btnAnterior);

        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SonoActivity3.this, SonoActivity4.class);
                startActivity(intent);
            }
        });

        btnAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SonoActivity3.this, SonoActivity2.class);
                startActivity(intent);
            }
        });

    }




}

