package com.example.a3labasorokin;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle ;
import android.view.View;
import android.widget.EditText;
public class ActivityThree extends Activity {
    EditText mEditText;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
    }
    public void back(View view){
        mEditText = findViewById(R.id.editText);
        String message = mEditText.getText().toString();
        Intent intent = new Intent(ActivityThree.this, MainActivity.class);
        intent.putExtra("message",message);
        startActivity(intent);
    }
}