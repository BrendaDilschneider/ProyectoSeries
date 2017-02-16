package series.proyectoseries;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button et1 = (Button)findViewById(R.id.buscar_series);
        et1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {

                Intent intent = new Intent(view.getContext(),ActivityBuscarSerie.class);
                startActivity(intent);
            }
        });

    }
}
