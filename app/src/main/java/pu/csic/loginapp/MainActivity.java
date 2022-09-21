package pu.csic.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button_input);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = findViewById(R.id.edName);
                EditText pw = findViewById(R.id.paName);

                if(name.getText().toString().equals("john")&&pw.getText().toString().equals("pw")){
                    Intent it = new Intent(getApplicationContext(),UserActivity.class);
                    startActivity(it);
                    Toast.makeText(getApplicationContext(),"成功",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"登入失敗",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}