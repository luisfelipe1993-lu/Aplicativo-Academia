package luisfelipe.developer.nutriup.ActivityAgua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import luisfelipe.developer.nutriup.Adapter.MenuActivity;
import luisfelipe.developer.nutriup.R;

public class AguaActivity extends AppCompatActivity {

    private Button btnProximo;
    private Button btnAnterior;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agua);


        btnProximo = findViewById(R.id.btnProximo);
        btnAnterior = findViewById(R.id.btnAnterior);

        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AguaActivity.this, AguaActivity2.class);
                startActivity(intent);
            }
        });

        btnAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AguaActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

      }
    }





