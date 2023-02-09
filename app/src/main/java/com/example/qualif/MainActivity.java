package com.example.qualif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtUsername, edtPassword;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        edtUsername = findViewById(R.id.edtMainUsername);
        edtPassword = findViewById(R.id.edtMainPassword);
        btnLogin = findViewById(R.id.btnMainLogin);
    }

    protected void onPause() {
        super.onPause();
        Log.wtf("Lifecycle", "pause");
    }
}