package startandroid.ru.pm_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.editText);
        btnSearch = findViewById(R.id.btnSearch);
    }

    public void SearchClick(View v){

        if(TextUtils.isEmpty(editText.getText().toString())){
            Toast toast =Toast.makeText(MainActivity.this,
                    "Введите номер электро двигателя",Toast.LENGTH_LONG);toast.show();
        }else {
            Intent intent = new Intent(this, ViewActivity.class);
            intent.putExtra("", editText.getText().toString());
            startActivity(intent);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        editText.setText("");
    }

}
