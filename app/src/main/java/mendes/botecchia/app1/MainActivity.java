package mendes.botecchia.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnEnviar=findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText etDigiteAqui= findViewById(R.id.etDigiteAqui);
                String texto = etDigiteAqui.getText().toString();
                Intent intent = new Intent(MainActivity.this,NextActivity.class);
                intent.putExtra( "texto", texto);
                startActivity(intent);



            }
        });

    }
}