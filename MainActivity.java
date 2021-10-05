package com.example.realstate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonClick(View view){
        EditText et1=(EditText) findViewById(R.id.editTextTextEmailAddress);
        EditText et2=(EditText) findViewById(R.id.editTextTextPassword);

        String Email=et1.getText().toString();
        String Password=et2.getText().toString();
        String oemail="prabalsikarwar";
        String opassword="admin";
        if (Email.equals(oemail) && Password.equals(opassword)){
            Intent intent = new Intent(this,NavigationActivity.class);
            startActivity(intent);

        }else{
            Toast.makeText(this,"Invalid Email&Password",Toast.LENGTH_LONG).show();
        }
    }
}