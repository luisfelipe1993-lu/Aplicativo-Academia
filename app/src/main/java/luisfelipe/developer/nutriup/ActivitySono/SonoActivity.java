package luisfelipe.developer.nutriup.ActivitySono;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import luisfelipe.developer.nutriup.R;
import luisfelipe.developer.nutriup.Adapter.MenuActivity;

public class SonoActivity extends AppCompatActivity {

    Button btnProximo, btnInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sono);


        btnProximo = findViewById(R.id.btnProximo);
        btnInicio = findViewById(R.id.btnInicio);

        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SonoActivity.this, SonoActivity2.class);
                startActivity(intent);
            }
        });

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SonoActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

    }





    }

