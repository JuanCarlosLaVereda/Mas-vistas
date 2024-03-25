package es.ieslavereda.masvistas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText entrada;
    private TextView salida;

    private Button boton0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entrada = findViewById(R.id.entrada);
        salida = findViewById(R.id.salida);
        boton0 = findViewById(R.id.boton0);

        boton0.setOnClickListener(view -> entrada.setText(entrada.getText()+view.getTag().toString()));
    }

    public void sePulsa(View view){
        //Toast.makeText(this,"Pulsado", Toast.LENGTH_SHORT).show();
        salida.setText(String.valueOf(Double.parseDouble(entrada.getText().toString())*2));
    }

/*    public void sePulsa0(View view){
        entrada.setText(entrada.getText()+view.getTag().toString());
    }*/
}