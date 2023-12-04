package com.rafsan.class230forlooppart2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewBreak,textViewContinue,textViewADD,textViewনামতা,textViewFactorial;
    Button buttonBreak,buttonContinue,buttonAdd,buttonনামতা,buttonFactorial;
    EditText editTextনামতা,editTextFactorial;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewBreak = findViewById(R.id.textViewBreak);
        textViewContinue = findViewById(R.id.textViewContinue);
        textViewADD = findViewById(R.id.textViewADD);
        textViewনামতা = findViewById(R.id.textViewনামতা);
        textViewFactorial = findViewById(R.id.textViewFactorial);


        editTextনামতা = findViewById(R.id.editTextনামতা);
        editTextFactorial = findViewById(R.id.editTextFactorial);

        buttonAdd = findViewById(R.id.buttonAdd);
        buttonBreak = findViewById(R.id.buttonBreak);
        buttonContinue = findViewById(R.id.buttonContinue);
        buttonনামতা = findViewById(R.id.buttonনামতা);
        buttonFactorial = findViewById(R.id.buttonFactorial);

        // ============= BREAK=====================
        buttonBreak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textViewBreak.setText("");
                for (int x=1; x<=20; x++){

                    if (x==10){
                        break;
                    }
                    textViewBreak.append(" "+x);

                }

            }
        });


        //===========CONTINUE====================
        buttonContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textViewContinue.setText("");
                for(int x=1; x<=15;x++){

                    if(x==10){
                        continue;
                    }
                    textViewContinue.append(" "+x);

                }

            }
        });

        // ================== ADD ================
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int sum=0;
//                textViewADD.setText(" ");
                for(int x=1; x<=10;x++){
                    sum = sum+x;
                    textViewADD.append(" "+sum);
                }
                textViewADD.setText("sum is ="+sum);

            }
        });

        //============= নামতা ==================
        buttonনামতা.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sNumber = editTextনামতা.getText().toString();

                if(sNumber.length() > 0){

                    int my_number = Integer.parseInt(sNumber);
                    for (int x=1; x<=10; x++){
                        int mul = my_number*x;
                        textViewনামতা.append(my_number +" *" +x+"= "+mul+"\n");
                    }
                }


            }
        });

        //============= FACTORIAL ==================
        buttonFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sFactorial = editTextFactorial.getText().toString();

                if(sFactorial.length() >0){

                    int my_factorial = Integer.parseInt(sFactorial);

                    int factorial=1;
                    for(int x=1; x<=my_factorial; x++){

                        textViewFactorial.append(""+ factorial*x +" = " + factorial + " *" + x + "\n");
                        factorial = factorial*x;

                    }

//                    textViewFactorial.setText("Factorial is = "+factorial);

                }

            }
        });


    }
}