package com.example.login1;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.firebase.auth.FirebaseAuth;

public class signup extends AppCompatActivity {
EditText Name;
EditText Email;
EditText password;
Button Signup;
TextView text;
FirebaseAuth mFirebaseAuth;
private FirebaseAuth.AuthStateListener mAuthStateListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Name = (EditText)findViewById(R.id.txtEmail);
        Email =(EditText)findViewById(R.id.txtEmail);
        password =(EditText)findViewById(R.id.txtEmail);
        Signup =(Button) findViewById(R.id.txtEmail);
        text =(TextView) findViewById(R.id.txtEmail);



        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkDataEntered();
            }
        });
    }
    boolean isEmail(EditText text) {
        CharSequence email = text.getText().toString();
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }

    void checkDataEntered() {
        if (isEmpty(Name)) {
            Toast.makeText(this, "You must enter first name to register!", Toast.LENGTH_SHORT).show();
        }

        if (isEmail(Email) == false) {
            Email.setError("Enter valid email!");
        }else {
            Intent  i = new Intent(this, Home.class);
            Toast.makeText(this,"Welcome home",Toast.LENGTH_SHORT).show();
        }

    }
}
