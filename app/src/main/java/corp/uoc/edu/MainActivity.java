package corp.uoc.edu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int mat = 5;
        int quim = 5;
        int fis = 5;
        int prom = 0;

        prom = (mat + quim + fis) / 3;

        if(prom >   = 6) {
            Toast.makeText(this, "Aprovat", Toast.LENGTH_SHORT).show();
        } else if (prom <=5) {
            Toast.makeText(this, "Suspès", Toast.LENGTH_SHORT).show();
        }
    }
}