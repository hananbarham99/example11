package hanan.birzeit.comp438.example.example11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 private EditText editName;
 private EditText editPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName = findViewById(R.id.editName);
        editPassword = findViewById(R.id.editPassword);
    }

    public void btnSubmitOnClick(View view) {
      String name = editName.getText().toString();
      String pass = editPassword.getText().toString();
      String msg = "name :"+ name + "  ,pass :" +pass  ;
        Toast.makeText(this,msg, Toast.LENGTH_LONG).show();
    }
}