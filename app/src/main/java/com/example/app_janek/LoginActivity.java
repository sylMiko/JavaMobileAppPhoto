package com.example.app_janek;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class LoginActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        EditText email = findViewById(R.id.et_email);
        EditText password = findViewById(R.id.et_password);
        Button sign = findViewById(R.id.btn_login);
        mAuth = FirebaseAuth.getInstance();

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email_str = email.getText().toString().trim();
                String haslo_str = password.getText().toString().trim();

                if (email_str.isEmpty() || haslo_str.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Podaj wszystkie dane!", Toast.LENGTH_SHORT).show();
                } else {
                    mAuth.signInWithEmailAndPassword(email_str, haslo_str).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(LoginActivity.this, "Logowanie udane", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(LoginActivity.this, MainScreen.class));
                            } else {
                                Toast.makeText(LoginActivity.this, "Logowanie nieudane", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });
    }
}