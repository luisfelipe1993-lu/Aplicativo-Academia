package luisfelipe.developer.nutriup.Adapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import luisfelipe.developer.nutriup.ActivityAgua.AguaActivity;
import luisfelipe.developer.nutriup.ActivityAlimentacao.AlimentacaoActivity;
import luisfelipe.developer.nutriup.ActivityExercicios.ExerciciosActivity;
import luisfelipe.developer.nutriup.ActivitySono.SonoActivity;
import luisfelipe.developer.nutriup.ActivitySono.SonoActivity6;
import luisfelipe.developer.nutriup.ActivitySono.SonoActivity62;
import luisfelipe.developer.nutriup.R;

public class MenuActivity extends AppCompatActivity {

    CardView c1,c2,c3,c4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        c1 = findViewById(R.id.carAgua);
        c2 = findViewById(R.id.carAli);
        c3 = findViewById(R.id.carEx);
        c4 = findViewById(R.id.carSon);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, AguaActivity.class);
                startActivity(intent);
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, AlimentacaoActivity.class);
                startActivity(intent);
            }
        });

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, ExerciciosActivity.class);
                startActivity(intent);
            }
        });

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, SonoActivity.class);
                startActivity(intent);
            }
        });


    }
}