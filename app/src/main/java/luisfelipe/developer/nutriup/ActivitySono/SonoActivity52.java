package luisfelipe.developer.nutriup.ActivitySono;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import luisfelipe.developer.nutriup.R;

public class SonoActivity52 extends AppCompatActivity {

    Button btnAnterio, btnProximo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sono52);


        btnProximo = findViewById(R.id.btnProximo);
        btnAnterio = findViewById(R.id.btnAnterior);

        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SonoActivity52.this, SonoActivity6.class);
                startActivity(intent);
            }
        });

        btnAnterio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SonoActivity52.this, SonoActivity5.class);
                startActivity(intent);
            }
        });

    }
  }


