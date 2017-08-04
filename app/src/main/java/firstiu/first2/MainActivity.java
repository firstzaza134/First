package firstiu.first2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String Send1 = "Parinyawat";
    public static final String Send2 = "Promsena";
    public static final String Send3 = "First";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void GoSend(View view){

        Intent intent = new Intent(this, Main2Activity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        EditText editText3 = (EditText) findViewById(R.id.editText3);
        String message1 = editText.getText().toString();
        String message2 = editText2.getText().toString();
        String message3 = editText3.getText().toString();
        intent.putExtra(Send1, message1);
        intent.putExtra(Send2, message2);
        intent.putExtra(Send3, message3);
        startActivity(intent);


    }
}
