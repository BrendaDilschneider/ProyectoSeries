package series.proyectoseries;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityBuscarSerie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_serie);

        final EditText serie_buscar = (EditText)findViewById(R.id.editBuscar);
        final String serie_usuario = serie_buscar.getText().toString();
        final TextView titulo = (TextView) findViewById(R.id.tituloSerie);

        final Button botonAceptar= (Button) findViewById(R.id.botonBuscar);
        botonAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }

        });


    }
}

