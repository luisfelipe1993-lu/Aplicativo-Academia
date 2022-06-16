package luisfelipe.developer.nutriup.ActivityAgua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import luisfelipe.developer.nutriup.R;


public class AguaActivity2 extends AppCompatActivity {

    Button btnProximo, btnAnterior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agua2);


        btnProximo = findViewById(R.id.btnProximo2);
        btnAnterior = findViewById(R.id.btnAnterior2);

        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AguaActivity2.this, AguaActivity3.class);
                startActivity(intent);
            }
        });

        btnAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AguaActivity2.this, AguaActivity.class);
                startActivity(intent);
            }
        });

    }
}





