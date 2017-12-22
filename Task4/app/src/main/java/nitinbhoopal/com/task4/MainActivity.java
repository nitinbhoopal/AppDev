package nitinbhoopal.com.task4;

        import android.content.Intent;
        import android.sax.StartElementListener;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchActivity(View view) {
         Intent intent = new Intent(this, SecondActivity.class);
         EditText editText = (EditText) findViewById(R.id.editText);
         EditText editText2 = (EditText) findViewById(R.id.editText2);
         intent.putExtra("text", editText.getText().toString());
         intent.putExtra("text2", editText2.getText().toString());
         startActivity(intent);
   }
}
