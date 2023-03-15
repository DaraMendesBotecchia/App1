package mendes.botecchia.app1;

// Importando as classes necessárias
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

// Definindo a classe NextActivity que estende a classe AppCompatActivity
public class NextActivity extends AppCompatActivity {

    // O método onCreate é chamado quando a Activity é iniciada
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Define o layout da atividade
        setContentView(R.layout.activity_next);
        // Obtém a intenção que iniciou essa atividade
        Intent intent = getIntent();
        // Obtém o texto enviado pela atividade anterior como um extra
        String texto = intent.getStringExtra("texto");
        // Obtém uma referência ao TextView para exibir o texto recebido
        TextView tvExibir = findViewById(R.id.tvExibir);
        // Define o texto recebido no TextView
        tvExibir.setText(texto);

    }
}