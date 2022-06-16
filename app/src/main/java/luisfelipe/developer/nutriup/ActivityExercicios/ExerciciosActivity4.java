package luisfelipe.developer.nutriup.ActivityExercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import luisfelipe.developer.nutriup.R;

public class ExerciciosActivity4 extends AppCompatActivity {

    Button btnProximo, btnAnterior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicios4);



        btnProximo = findViewById(R.id.btnProximo4);
        btnAnterior = findViewById(R.id.btnAnterior4);

        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExerciciosActivity4.this, ExerciciosActivity5.class);
                startActivity(intent);
            }
        });

        btnAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExerciciosActivity4.this, ExerciciosActivity3.class);
                startActivity(intent);
            }
        });
    }
}