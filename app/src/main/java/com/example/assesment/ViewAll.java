package com.example.assesment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.assesment.MainActivity.buffer;

public class ViewAll extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all);
        textView=findViewById(R.id.tv1);
        textView.setText(buffer);
    }
}
