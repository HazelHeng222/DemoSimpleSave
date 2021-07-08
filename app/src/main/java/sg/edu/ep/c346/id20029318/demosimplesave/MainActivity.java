package sg.edu.ep.c346.id20029318.demosimplesave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed = findViewById(R.id.ed);
    }


    @Override
    protected void onResume() {
        super.onResume();

        String msg = "No Greetings";
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        String msg = "Activity is closed";
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();

        String data = ed.getText().toString();

        //Store data

        SharedPreferences pref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor prefEd = pref.edit();
        prefEd.putString("greetings","Hello!");
        prefEd.commit();
    }
}