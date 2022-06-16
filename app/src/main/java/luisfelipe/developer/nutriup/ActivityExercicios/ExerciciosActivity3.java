package luisfelipe.developer.nutriup.ActivityExercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import luisfelipe.developer.nutriup.R;

public class ExerciciosActivity3 extends AppCompatActivity {

    Button btnProximo, btnAnterior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicios3);


        btnProximo = findViewById(R.id.btnProximo3);
        btnAnterior = findViewById(R.id.btnAnterior3);

        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExerciciosActivity3.this, ExerciciosActivity4.class);
                startActivity(intent);
            }
        });

        btnAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExerciciosActivity3.this, ExerciciosActivity2.class);
                startActivity(intent);
            }
        });
    }
  }