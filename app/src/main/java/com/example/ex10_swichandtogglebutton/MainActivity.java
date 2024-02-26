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
        tb = findViewById(R.id.tglBtn);
        swtch = findViewById(R.id.swtch);
        btn = findViewById(R.id.btn);
        back = findViewById(R.id.back);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dodge(View view)
    {
        if (tb.isChecked() && swtch.isChecked())
        {
            back.setBackgroundColor(0x00FF00);
        }
        else if (tb.isChecked() && !swtch.isChecked())
        {
            back.setBackgroundColor(0xE6C5D5);
        }
        else if (tb.isChecked() && swtch.isChecked())
        {
            back.setBackgroundColor(0x0000FF);
        }

    }
}