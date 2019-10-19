package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  {

    EditText viewText;
    Button one, two, three, four, five, six, seven, eight, nine, zero, bSub, bAdd, bDiv, bMul, bEqual,bClear;

    float numb1, numb2;

    boolean Addition, Subtract, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = findViewById(R.id.numOne);
        two = findViewById(R.id.numTwo);
        three = findViewById(R.id.numThree);
        four = findViewById(R.id.numFour);
        five = findViewById(R.id.numFive);
        six = findViewById(R.id.numSix);
        seven = findViewById(R.id.numSeven);
        eight = findViewById(R.id.numEight);
        nine = findViewById(R.id.numNine);
        zero = findViewById(R.id.numZero);
        bSub = findViewById(R.id.buttonSub);
        viewText = findViewById(R.id.numberView);
        bAdd = findViewById(R.id.buttonAdd);
        bDiv = findViewById(R.id.buttonDiv);
         bMul= findViewById(R.id.buttonMul);

        bEqual = findViewById(R.id.buttonEqual);

        bClear = findViewById(R.id.buttonClear);



        one.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                viewText.setText(viewText.getText() + "1");
            }
        } );
        two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                viewText.setText(viewText.getText() + "2");
            }
        } );

        three.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                viewText.setText(viewText.getText() + "3");
            }
        } );

        four.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                viewText.setText(viewText.getText() + "4");
            }
        } );

        five.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                viewText.setText(viewText.getText() + "5");
            }
        } );

        six.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                viewText.setText(viewText.getText() + "6");
            }
        } );

        seven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                viewText.setText(viewText.getText() + "7");
            }
        } );

        eight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                viewText.setText(viewText.getText() + "8");
            }
        } );

        nine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                viewText.setText(viewText.getText() + "9");
            }
        } );

        zero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                viewText.setText(viewText.getText() + "0");
            }
        } );

        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    numb1 = Float.parseFloat(viewText.getText() + "");
                    Addition = true;
                    viewText.setText(null);



            }
        });

        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb1 = Float.parseFloat(viewText.getText() + "");
                Subtract = true;
                viewText.setText(null);

            }
        });

        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb1 = Float.parseFloat(viewText.getText() + "");
                Multiplication = true;
                viewText.setText(null);

            }
        });



        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb1 = Float.parseFloat(viewText.getText() + "");
                Division = true;
                viewText.setText(null);

            }
        });





        bClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewText.setText("");
            }
        });
        bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb2 = Float.parseFloat(viewText.getText() + "");

                if (Addition == true) {
                    viewText.setText(numb1 + numb2+ "");
                    Addition = false;
                }

                if (Subtract == true) {
                    viewText.setText(numb1- numb2 + "");
                    Subtract = false;
                }

                if (Multiplication == true) {
                    viewText.setText(numb1 * numb2 + "");
                    Multiplication = false;
                }

                if (Division == true) {
                    viewText.setText(numb1/ numb2 + "");
                    Division = false;
                }
            }
        });



    }


}
