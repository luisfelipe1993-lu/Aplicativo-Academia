package luisfelipe.developer.nutriup.ActivityAlimentacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import luisfelipe.developer.nutriup.R;
import luisfelipe.developer.nutriup.Adapter.MenuActivity;


public class                                                                                                                                                                                                                                                                                   AlimentacaoActivity extends AppCompatActivity {

    Button btnAnterior, btnProximo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alimentacao);


        btnProximo = findViewById(R.id.btnProximo);
        btnAnterior = findViewById(R.id.btnAnterior);


        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlimentacaoActivity.this, AlimentacaoActivity2.class);
                startActivity(intent);
            }
        });

        btnAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlimentacaoActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

    }
}







