package nitinbhoopal.com.taskthree;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;



public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Snackbar snackbar = null;
        snackbar = Snackbar.make(findViewById(android.R.id.content), "Second Activity", snackbar.LENGTH_LONG);
        snackbar.show();

    }



}
