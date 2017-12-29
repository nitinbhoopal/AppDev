package nitinbhoopal.com.task5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Question2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
    }
    public void endQuiz (View view)
    {
        Intent intentEND = getIntent();
        int count = intentEND.getIntExtra("count",0);
        intentEND = new Intent(this,ResultActivity.class);
        intentEND.putExtra("count",count);
        startActivity(intentEND);
    }

    public void rightAnswer (View view)
    {
        Intent intentRIGHT = getIntent();
        int count = intentRIGHT.getIntExtra("count",0);
        intentRIGHT = new Intent(this,Question3Activity.class);
        count = count + 1;
        intentRIGHT.putExtra("count",count);
        startActivity(intentRIGHT);
    }
    public void wrongAnswer (View view)
    {
        Intent intentWRONG = getIntent();
        int count = intentWRONG.getIntExtra("count",0);
        intentWRONG = new Intent(this,Question3Activity.class);
        intentWRONG.putExtra("count",0);
        startActivity(intentWRONG);
    }
}
