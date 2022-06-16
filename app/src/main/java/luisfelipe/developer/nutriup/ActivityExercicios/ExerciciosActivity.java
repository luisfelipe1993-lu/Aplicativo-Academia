package luisfelipe.developer.nutriup.ActivityExercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import luisfelipe.developer.nutriup.R;
import luisfelipe.developer.nutriup.Adapter.MenuActivity;
public class ExerciciosActivity extends AppCompatActivity {

    Button btnProximo, btnInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicios);


        btnProximo = findViewById(R.id.btnProximo);
        btnInicio = findViewById(R.id.btnInicio);

        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExerciciosActivity.this, ExerciciosActivity2.class);
                startActivity(intent);
            }
        });

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExerciciosActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

    }

    }

