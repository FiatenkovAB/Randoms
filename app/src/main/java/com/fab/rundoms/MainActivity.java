package com.fab.rundoms;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    TextView answerView;
    Button buttons, restarts;
    EditText userText;
    int pc ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerView = findViewById(R.id.answerView);
        buttons = findViewById(R.id.buttons);
        userText = findViewById(R.id.userText);
        restarts = findViewById(R.id.restarts);

        pc = new Random().nextInt(30) + 1;

buttons.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        int num2 = Integer.parseInt(userText.getText().toString());

        if (num2 >= 31){
            answerView.setText("ввели слишком большое число");
        }else if (pc == num2){
              answerView.setText("поздравляем вы угадали");
        }else if(pc != num2){
            answerView.setText("Увы,попробуйте еще раз " + pc + " загаданное число");
        }
    }

});
restarts.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        answerView.setText("");

    }
});

    }



}