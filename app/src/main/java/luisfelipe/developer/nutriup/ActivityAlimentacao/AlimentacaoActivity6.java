package luisfelipe.developer.nutriup.ActivityAlimentacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import luisfelipe.developer.nutriup.R;

public class AlimentacaoActivity6 extends AppCompatActivity {

    Button btnProximo, btnAnterior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_alimentacao6);



        btnProximo = findViewById(R.id.btnProximo6);
        btnAnterior = findViewById(R.id.btnAnterior6);


        btnAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlimentacaoActivity6.this, AlimentacaoActivity5.class);
                startActivity(intent);
            }
        });

        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlimentacaoActivity6.this, AlimentacaoActivity7.class);
                startActivity(intent);
            }
        });

    }




}

