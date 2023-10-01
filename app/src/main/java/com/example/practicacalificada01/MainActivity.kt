package com.example.practicacalificada01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        private EditText etEP, etEF, etPEP;
        private TextView tvResultado;
        private Button btnCalcular;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            etEP = findViewById(R.id.txtEP);
            etEF = findViewById(R.id.txtEF);
            etPEP = findViewById(R.id.txtPEP);
            tvResultado = findViewById(R.id.tvResultado);
            btnCalcular = findViewById(R.id.btnCalcular);

            btnCalcular.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    calcularNotaFinal();
                }
            });
        }

        private void calcularNotaFinal() {
            try {
                double notaEP = Double.parseDouble(etEP.getText().toString());
                double notaEF = Double.parseDouble(etEF.getText().toString());
                double notaPEP = Double.parseDouble(etPEP.getText().toString());

                // Aplicar las ponderaciones
                double notaFinal = (notaEP * 0.2) + (notaEF * 0.2) + (notaPEP * 0.6);

                tvResultado.setText("Nota Final: " + notaFinal);
            } catch (NumberFormatException e) {
                tvResultado.setText("Ingresa todas las notas correctamente.");
            }
        }


    }




}