package polinema.ac.id.dtsdesigntolayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPassword extends AppCompatActivity {

    // Deklarasi EditText
    EditText editTextCode;
    EditText editTextPassword;
    EditText editTextConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        // Binding EditText
        editTextCode = findViewById(R.id.edt_txt_code);
        editTextPassword = findViewById(R.id.edt_new_password);
        editTextConfirmPassword = findViewById(R.id.edt_confirm_password);
    }

    public void postChangePassword(View view) {
        if(TextUtils.isEmpty(editTextPassword.getText().toString())) {
            // Validasi password kosong
            Toast.makeText(view.getContext(), "Password tidak boleh kosong!", Toast.LENGTH_LONG).show();
        }else if (TextUtils.getTrimmedLength(editTextPassword.getText().toString()) > 15){
            // Cek jumlah inputan password max 15 char
            Toast.makeText(view.getContext(), "Password melebihi batas!", Toast.LENGTH_LONG).show();
        } else if (!TextUtils.equals(editTextPassword.getText().toString(),editTextConfirmPassword.getText().toString())){
            // Cek inputan new dan confirm
            Toast.makeText(view.getContext(), "Password tidak sama!", Toast.LENGTH_LONG).show();
        } else {
            Intent i = new Intent(ResetPassword.this, SuccessActivity.class);
            startActivity(i);
        }
    }
}
