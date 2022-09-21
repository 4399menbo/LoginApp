package pu.csic.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);


        Button dialbtn = findViewById(R.id.dialbut);
        dialbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri phone = Uri.parse("tel://123456");
                Intent it = new Intent(Intent.ACTION_DIAL,phone);
                startActivity(it);
            }
        });

        Button webbtn = findViewById(R.id.webbut);
        webbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri web = Uri.parse("http://www.pu.edu.tw");
                Intent it = new Intent(Intent.ACTION_VIEW,web);
                startActivity(it);
            }
        });

        Button exitbtn = findViewById(R.id.exitbut);
        exitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}