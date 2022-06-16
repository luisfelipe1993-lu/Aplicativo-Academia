package luisfelipe.developer.nutriup.ActivityAlimentacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import luisfelipe.developer.nutriup.R;


public class AlimentacaoActivity3 extends AppCompatActivity {

    Button btnAnterior,btnProximo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alimentacao3);



        btnProximo = findViewById(R.id.btnProximo3);
        btnAnterior = findViewById(R.id.btnAnterior3);

        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlimentacaoActivity3.this, AlimentacaoActivity4.class);
                startActivity(intent);
            }
        });

        btnAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlimentacaoActivity3.this, AlimentacaoActivity2.class);
                startActivity(intent);
            }
        });

    }




    }

