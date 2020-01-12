package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    Double firstArg;
    Double seconArg;
    Double result;
    String operation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.one:
                textView.append("1");
                break;
            case R.id.two:
                textView.append("2");
                break;
            case R.id.three:
                textView.append("3");
                break;
            case R.id.four:
                textView.append("4");
                break;
            case R.id.five:
                textView.append("5");
                break;
            case R.id.six:
                textView.append("6");
                break;
            case R.id.seven:
                textView.append("7");
                break;
            case R.id.eight:
                textView.append("8");
                break;
            case R.id.nine:
                textView.append("9");
                break;
            case R.id.zero:
                textView.append("0");
                break;
            case R.id.point:
                if (textView != null && textView.length() > 0) {
                    textView.append(".");
                } else {
                    {
                        textView.setText("");
                    }
                }
                break;
            case R.id.clean:
                textView.setText("");
                break;


        }

    }

    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.minus:
                operation = "-";
                firstArg = Double.valueOf(textView.getText().toString());
                textView.setText(firstArg + "-");
                break;
            case R.id.plus:
                operation = "+";
                firstArg = Double.valueOf(textView.getText().toString());
                textView.setText(firstArg + "+");
                break;
            case R.id.division:
                operation = "/";
                firstArg = Double.valueOf(textView.getText().toString());
                textView.setText(firstArg + "/");
                break;
            case R.id.multiplication:
                operation = "*";
                firstArg = Double.valueOf(textView.getText().toString());
                textView.setText(firstArg + "*");
                break;
            case R.id.equal:
                if (operation != null) {
                    String second = textView.getText().toString().replace(firstArg + operation + "", "");
                    seconArg = Double.valueOf(second);
                    switch (operation) {
                        case "+":
                            result = firstArg + seconArg;
                            textView.setText(firstArg + "+" + seconArg + "=" + result);
                            break;
                        case "-":
                            result = firstArg - seconArg;
                            textView.setText(firstArg + "-" + seconArg + "=" + result);
                            break;
                        case "/":
                            result = firstArg / seconArg;
                            textView.setText(firstArg + "/" + seconArg + "=" + result);
                            break;
                        case "*":
                            result = firstArg + seconArg;
                            textView.setText(firstArg + "*" + seconArg + "=" + result);
                            break;

                    }
                }
                break;


        }

    }
}
