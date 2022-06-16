package luisfelipe.developer.nutriup.ActivitySono;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import luisfelipe.developer.nutriup.R;

public class SonoActivity4 extends AppCompatActivity {

    Button btnProximo, btnAnterior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sono4);



            btnProximo = findViewById(R.id.btnProximo);
            btnAnterior = findViewById(R.id.btnAnterior);

            btnProximo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(SonoActivity4.this, SonoActivity42.class);
                    startActivity(intent);
                }
            });

            btnAnterior.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(SonoActivity4.this, SonoActivity3.class);
                    startActivity(intent);
                }
            });

        }



    }

