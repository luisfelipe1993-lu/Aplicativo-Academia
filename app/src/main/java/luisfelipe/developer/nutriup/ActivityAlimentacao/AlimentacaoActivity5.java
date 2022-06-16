package luisfelipe.developer.nutriup.ActivityAlimentacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import luisfelipe.developer.nutriup.R;

public class AlimentacaoActivity5 extends AppCompatActivity {

    Button btnAnterior, btnProximo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alimentecao5);



        btnProximo = findViewById(R.id.btnProximo5);
        btnAnterior = findViewById(R.id.btnAnterior5);


        btnAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlimentacaoActivity5.this, AlimentacaoActivity4.class);
                startActivity(intent);
            }
        });

        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlimentacaoActivity5.this, AlimentacaoActivity6.class);
                startActivity(intent);
            }
        });

    }


    }

