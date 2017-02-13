package series.proyectoseries;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    private long splashRetraso=2000; // Segundos que se va a retrasar y mostrar el splash

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
            Intent nuevoLayout;
                nuevoLayout= new Intent(SplashScreen.this,MainActivity.class );
                startActivity(nuevoLayout);

                SplashScreen.this.finish();
            }
        };

        Timer timer = new Timer();
        timer.schedule(task,splashRetraso);
    }

}
