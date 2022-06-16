package luisfelipe.developer.nutriup.ActivityExercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import luisfelipe.developer.nutriup.R;
import luisfelipe.developer.nutriup.Adapter.MenuActivity;

public class ExerciciosActivity5 extends AppCompatActivity {

    Button btnInicio, btnAnterior;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicios5);


        btnAnterior = findViewById(R.id.btnAnterior5);
        btnInicio = findViewById(R.id.btnInicio5);

        btnAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExerciciosActivity5.this, ExerciciosActivity4.class);
                startActivity(intent);
            }
        });

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExerciciosActivity5.this, MenuActivity.class);
                startActivity(intent);
            }
        });
    }


    }

