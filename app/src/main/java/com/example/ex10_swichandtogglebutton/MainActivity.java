package com.example.ex10_swichandtogglebutton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tb;
    Switch swtch;
    Button btn;
    ConstraintLayout back;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb = findViewById(R.id.tglBtn);
        swtch = findViewById(R.id.swtch);
        btn = findViewById(R.id.btn);
        back = findViewById(R.id.back);


    }

    public void dodge(View view)
    {
        if (tb.isChecked() && swtch.isChecked())
        {
            back.setBackgroundColor(0xFFD08DD3);
        }
        else if (tb.isChecked() && !swtch.isChecked())
        {
            back.setBackgroundColor(0xFF173ECA);
        }
        else if (tb.isChecked() && swtch.isChecked())
        {
            back.setBackgroundColor(0xFF28CA17);
        }
        else if (!tb.isChecked() && !swtch.isChecked())
        {
            back.setBackgroundColor(0xFFB53030);
        }
    }
}