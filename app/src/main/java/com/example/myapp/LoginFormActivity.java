package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
      //  getSupportActionBar().setTitle("Login_forn Form");
    }

    public void btnSignUpForm(View view) {
        startActivity(new Intent(getApplicationContext(),SignUp_form.class));
    }

    public void btnLoginForm(View view) {
        startActivity(new Intent(getApplicationContext(), LoginFormActivity.class) );
    }
}
