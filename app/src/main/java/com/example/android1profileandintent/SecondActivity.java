package com.example.android1profileandintent;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView textUsername, textPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textUsername = findViewById(R.id.textUsername);
        textPassword = findViewById(R.id.textPassword);

        SharedPreferences prefs = getSharedPreferences("UserPrefs", MODE_PRIVATE);
        String username = prefs.getString("username", "نامشخص");
        String password = prefs.getString("password", "نامشخص");

        textUsername.setText("نام کاربری: " + username);
        textPassword.setText("رمز عبور: " + password);
    }
}