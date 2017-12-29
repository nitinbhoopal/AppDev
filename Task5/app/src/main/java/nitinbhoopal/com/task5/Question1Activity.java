package nitinbhoopal.com.task5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Question1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
    }

    public void endQuiz (View view)
    {
        Intent intentEND = new Intent(this,ResultActivity.class);
        intentEND.putExtra("count",0);
        startActivity(intentEND);
    }

    public void rightAnswer (View view)
    {
        Intent intentRIGHT = new Intent(this,Question2Activity.class);
        intentRIGHT.putExtra("count",1);
        startActivity(intentRIGHT);
    }
    public void wrongAnswer (View view)
    {
        Intent intentWRONG = new Intent(this,Question2Activity.class);
        intentWRONG.putExtra("count",0);
        startActivity(intentWRONG);
    }
}
