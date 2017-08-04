package firstiu.first2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.Send1);
        String message2 = intent.getStringExtra(MainActivity.Send2);
        String message3 = intent.getStringExtra(MainActivity.Send3);
        TextView textView = (TextView) findViewById(R.id.textView);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView.setText(message);
        textView2.setText(message2);
        textView3.setText(message3);
    }
    public void Goback(View view){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
