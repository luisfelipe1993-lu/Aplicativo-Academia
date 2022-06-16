package luisfelipe.developer.nutriup.ActivityAlimentacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import luisfelipe.developer.nutriup.R;

public class AlimentacaoActivity7 extends AppCompatActivity {

    Button btnProximo, btnAnterior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alimentacao7);

        btnProximo = findViewById(R.id.btnProximo7);
        btnAnterior = findViewById(R.id.btnAnterior7);


        btnAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlimentacaoActivity7.this, AlimentacaoActivity6.class);
                startActivity(intent);
            }
        });

        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlimentacaoActivity7.this, AlimentacaoActivity8.class);
                startActivity(intent);
            }
        });

    }

    }

