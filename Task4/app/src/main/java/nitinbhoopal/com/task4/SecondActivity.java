package nitinbhoopal.com.task4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent   = getIntent();
        String data = intent.getStringExtra("text");
        String data2 = intent.getStringExtra("text2");

        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("Name: " + data + "\n \nGenre: " + data2);
    }
}
