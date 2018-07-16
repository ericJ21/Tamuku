package com.example.nyxulric.enterprofiletamuku;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class Registration2ndScreen extends AppCompatActivity implements View.OnClickListener{

    private TextView pleaseEnterCode;
    private EditText code1;
    private EditText code2;
    private EditText code3;
    private EditText code4;
    private EditText code5;
    private EditText code6;
    private TextView resend;
    private TextView forwardAuthcode;

    private Button backButton;
    private Button forwardButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration2ndscreen);

        pleaseEnterCode = findViewById(R.id.textPleaseEnterAuthCode);
        code1 = findViewById(R.id.editCode);
        code2 = findViewById(R.id.editCode2);
        code3 = findViewById(R.id.editCode3);
        code4 = findViewById(R.id.editCode4);
        code5 = findViewById(R.id.editCode5);
        code6 = findViewById(R.id.editCode6);
        resend = findViewById(R.id.textCode);


        code1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                if (code1.getText().toString().length()==1){
                    code2.requestFocus(View.FOCUS_DOWN);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        code2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                if (code2.getText().toString().length()==1){
                    code3.requestFocus(View.FOCUS_DOWN);
                }else {
                    if (count == 0){
                        code1.requestFocus(View.FOCUS_DOWN);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        code3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                if (code3.getText().toString().length()==1){
                    code4.requestFocus(View.FOCUS_DOWN);
                }else {
                    if (count == 0){
                        code2.requestFocus(View.FOCUS_DOWN);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        code4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                if (code4.getText().toString().length()==1){
                    code5.requestFocus(View.FOCUS_DOWN);
                }else {
                    if (count == 0){
                        code3.requestFocus(View.FOCUS_DOWN);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        code5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                if (code5.getText().toString().length()==1){
                    code6.requestFocus(View.FOCUS_DOWN);
                }else {
                    if (count == 0){
                        code4.requestFocus(View.FOCUS_DOWN);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        code6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                if (count == 0){
                    code5.requestFocus(View.FOCUS_DOWN);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        forwardAuthcode = findViewById(R.id.textViewForward);

        forwardButton = findViewById(R.id.buttonForward);
        backButton = findViewById(R.id.button);

        String text = "Resend Code 2:00";

        SpannableString ss = new SpannableString(text);

        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Registration2ndScreen.this, "Resend Message", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.GRAY);
            }
        };

        ss.setSpan(clickableSpan,0,6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );

        resend.setText(ss);
        resend.setMovementMethod(LinkMovementMethod.getInstance());

        backButton.setOnClickListener(this);
        forwardButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}
