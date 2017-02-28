package rachelmiller.inclassassignment05_rachelm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox;
    private EditText nameLine;
    private EditText distanceLine;
    private EditText messageLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = (CheckBox) findViewById(R.id.canWeLive);
        nameLine = (EditText) findViewById(R.id.planetName);
        distanceLine = (EditText) findViewById(R.id.planetDistance);
        messageLine = (EditText) findViewById(R.id.messageField);

    }

    public void submit(View view) {
        Intent msIntent =  new Intent(this, SecondActivity.class);
        startActivity(msIntent);
    }
}
