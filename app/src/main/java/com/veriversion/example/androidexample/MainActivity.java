package com.veriversion.example.androidexample;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.main_demo_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //#veriversion performance start Test button_click
                EditText editText = findViewById(R.id.main_demo_edit_text);
                ((TextView) findViewById(R.id.main_demo_text)).setText(editText.getText());
                //#veriversion performance stop Test button_click
            }
        });
        ((TextView) findViewById(R.id.main_demo_version)).setText(R.string.main_demo_resource);
//        throw new RuntimeException("Boom!");
    }
}
