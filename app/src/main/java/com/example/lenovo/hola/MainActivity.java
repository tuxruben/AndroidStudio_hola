package com.example.lenovo.hola;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText ptIn= findViewById(R.id.ptIn);
        Button btnEnviar=findViewById(R.id.btnEnviar);
        final TextView tvTexto= findViewById(R.id.tvTexto);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre =ptIn.getText().toString();
                tvTexto.setText("Biemvenido"+nombre);
            }
        });
    }
}
