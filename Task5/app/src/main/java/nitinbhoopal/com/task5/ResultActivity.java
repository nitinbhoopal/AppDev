package nitinbhoopal.com.task5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        int score = intent.getIntExtra("count",0);
        TextView textView = (TextView)findViewById(R.id.textView4);
        textView.setText("Your final score is "+ score);
    }
}
