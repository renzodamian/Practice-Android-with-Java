package com.example.renzo.appstatusnotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etfis;
    private EditText etqui;
    private EditText etmat;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etfis = (EditText) findViewById(R.id.txtfis);
        etqui = (EditText) findViewById(R.id.txtqui);
        etmat = (EditText) findViewById(R.id.txtmat);
        tv1 = (TextView) findViewById(R.id.txtstatus);




    }
    /* Metodo para evaluar Notas
     */
    public void Promedio(View view){
        String mat_string =etfis.getText().toString();
        String fis_string =etqui.getText().toString();
        String qui_string =etmat.getText().toString();

        int mat_int = Integer.parseInt(mat_string);
        int fis_int = Integer.parseInt(fis_string);
        int qui_int = Integer.parseInt(qui_string);

        int promedio = (mat_int+fis_int+qui_int)/3;
        if  (promedio <= 5) {

            tv1.setText("Reprobado: "+promedio);
        }else{
            tv1.setText("Aprobado: "+promedio);
        }

    }
}