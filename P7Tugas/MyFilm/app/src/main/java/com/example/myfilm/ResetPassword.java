package com.example.myfilm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPassword extends AppCompatActivity {

    EditText editTextCode;
    EditText editTextPassword;
    EditText editTextConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        editTextCode = findViewById(R.id.edt_txt_code);
        editTextPassword = findViewById(R.id.edt_new_password);
        editTextConfirmPassword = findViewById(R.id.edt_confirm_password);
    }

    public void postChangePassword(View view) {
        if(TextUtils.isEmpty(editTextPassword.getText().toString())) {
            Toast.makeText(view.getContext(), "Password tidak boleh kosong!", Toast.LENGTH_LONG).show();
        }else if (TextUtils.getTrimmedLength(editTextPassword.getText().toString()) > 15){
            Toast.makeText(view.getContext(), "Password melebihi batas!", Toast.LENGTH_LONG).show();
        } else if (!TextUtils.equals(editTextPassword.getText().toString(),editTextConfirmPassword.getText().toString())){
            Toast.makeText(view.getContext(), "Password tidak sama!", Toast.LENGTH_LONG).show();
        } else {
            Intent i = new Intent(ResetPassword.this, SuccesResetPassword.class);
            startActivity(i);
        }
    }
}