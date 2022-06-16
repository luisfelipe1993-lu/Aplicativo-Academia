package luisfelipe.developer.nutriup.ActivitySono;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import luisfelipe.developer.nutriup.R;
import luisfelipe.developer.nutriup.Adapter.MenuActivity;

public class SonoActivity62 extends AppCompatActivity {

    Button btnInicio, btnAnterior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sono62);


        btnAnterior = findViewById(R.id.btnAnterior);
        btnInicio = findViewById(R.id.btnInicio);

        btnAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SonoActivity62.this, SonoActivity6.class);
                startActivity(intent);
            }
        });

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SonoActivity62.this, MenuActivity.class);
                startActivity(intent);
            }
        });

    }




}

