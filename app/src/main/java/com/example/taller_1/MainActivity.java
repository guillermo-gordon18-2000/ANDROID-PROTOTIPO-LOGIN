package com.example.taller_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.example.taller_1.Dialogs.Alerta;

public class MainActivity extends AppCompatActivity {
     EditText txtNum1,txtNum2;
     RadioButton Button1,Button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InicializarControles();
    }


    private void InicializarControles(){
        txtNum1 = (EditText)findViewById(R.id.txtNum1);
        txtNum2 = (EditText)findViewById(R.id.txtNum2);



        Button1 = (RadioButton) findViewById(R.id.RadioButton1);
        Button2=(RadioButton) findViewById(R.id.RadioButton2);

    }


    public void Login(View vista){
        try {
            int num1, num2, res=0, ope;
            String nombre ,pass,pass2="1234",mesage;


            nombre=txtNum1.getText().toString();
            pass=txtNum2.getText().toString();


            if (pass.equals(pass2) && nombre.equals("guillermo") && (Button1.isChecked()||Button2.isChecked())) {


                          if(Button2.isChecked())
                          { mesage="El profesor no puede ingresar ";}else{ mesage="a ingresado de forma exitosa estudiante";}
                Alerta alerta = new Alerta(mesage);
                alerta.show(getSupportFragmentManager(), "tag");

            }else{
                mesage="error en el login";
                Alerta alerta = new Alerta(mesage);
                alerta.show(getSupportFragmentManager(), "tag");

            }
        }catch (Exception e){
            Toast.makeText(this, "Error" + e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }





}