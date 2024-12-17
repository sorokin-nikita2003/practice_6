package com.example.a3labasorokin;
import static android.provider.AlarmClock.EXTRA_MESSAGE;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle ;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    static String message;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mButton1 = findViewById(R.id.button);
        TextView mTextView = findViewById(R.id.textView);
        mTextView.setText((String)getIntent().getSerializableExtra("message"));
        mButton1.setOnClickListener(this);
    }
    @SuppressLint("NonConstantResourceId")
    public void onClick(View view) {
        if (view.getId() == R.id.button) {
            EditText edittext = (EditText) findViewById(R.id.editText1);
            message = edittext.getText().toString();
            Intent intent = new Intent(getApplicationContext(), ActivityTwo.class);
            startActivity(intent);
        }
    }
    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
    }
}