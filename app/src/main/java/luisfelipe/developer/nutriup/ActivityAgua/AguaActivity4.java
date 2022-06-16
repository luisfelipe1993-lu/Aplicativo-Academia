package luisfelipe.developer.nutriup.ActivityAgua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import luisfelipe.developer.nutriup.Adapter.MenuActivity;
import luisfelipe.developer.nutriup.R;

public class AguaActivity4 extends AppCompatActivity {

    Button btnAnterior, btnInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agua4);


        btnAnterior = findViewById(R.id.btnAnterior4);
        btnInicio = findViewById(R.id.btnInicio4);

        btnAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AguaActivity4.this, AguaActivity3.class);
                startActivity(intent);
            }
        });

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AguaActivity4.this, MenuActivity.class);
                startActivity(intent);
            }
        });

    }

    }

