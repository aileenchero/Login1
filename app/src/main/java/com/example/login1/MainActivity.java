package com.example.login1;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    EditText email;
    EditText password;
    Button login;
    TextView register;
    FirebaseAuth mFirebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            email = (EditText) findViewById(R.id.txtEmail);
            password = (EditText) findViewById(R.id.txtPwd);
            login = (Button) findViewById(R.id.btnLogin);
            register = (TextView) findViewById(R.id.lnkRegister);



            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                        if (email.getText().toString().equals("admin") &&
                                password.getText().toString().equals("admin")) {
                            Toast.makeText(getApplicationContext(),
                                    "Redirecting...", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();

                        }

                }
            });
            register.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, signup.class);
                    startActivity(intent);
                }
            });

        }
    }





