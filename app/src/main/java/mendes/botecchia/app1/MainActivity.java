package mendes.botecchia.app1;
// Importando as classes necessárias
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

// Definindo a classe MainActivity que estende a classe AppCompatActivity
public class MainActivity extends AppCompatActivity {

    // O método onCreate é chamado quando a Activity é iniciada
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Define o layout da atividade
        setContentView(R.layout.activity_main);
        // Obtém uma referência ao botão enviar do layout
        Button btnEnviar=findViewById(R.id.btnEnviar);
        // Define um listener para o botão enviar
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtém uma referência ao EditText para entrada de texto do layout
                EditText etDigiteAqui= findViewById(R.id.etDigiteAqui);
                // Obtém o texto inserido pelo usuário no EditText
                String texto = etDigiteAqui.getText().toString();
                // Cria uma nova intenção para chamar a próxima atividade
                Intent intent = new Intent(MainActivity.this,NextActivity.class);
                // Adiciona o texto inserido pelo usuário como um extra para a intenção
                intent.putExtra( "texto", texto);
                // Inicia a próxima atividade
                startActivity(intent);



            }
        });

    }
}