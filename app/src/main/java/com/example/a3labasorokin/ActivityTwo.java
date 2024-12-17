package com.example.a3labasorokin;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle ;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityTwo extends AppCompatActivity {
    EditText mEditText;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        String message = MainActivity.message; // Получаем значение из статической переменной
        TextView textView = findViewById(R.id.textViewMessage);
        textView.setText(message);
    }
    public void back(View view){
        mEditText = findViewById(R.id.editText);
        String message = mEditText.getText().toString();
        Intent intent = new Intent(ActivityTwo.this, ActivityThree.class);
        intent.putExtra("message",message);
        startActivity(intent);
    }
}