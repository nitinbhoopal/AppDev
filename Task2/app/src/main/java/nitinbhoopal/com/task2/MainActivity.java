package nitinbhoopal.com.task2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View v)
    {
        TextView tv = (TextView)findViewById(R.id.textView1);
        String input = tv.getText().toString();
        if(input.contentEquals("HELLO WORLD!")){
        tv.setText("GOODBYE WORLD!");
        }
        else{
        tv.setText("HELLO WORLD!");
        }
    }
}
