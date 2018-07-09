package com.example.nyxulric.enterprofiletamuku;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class Registration2ndScreen extends AppCompatActivity {

    private TextView pleaseEnterCode;
    private EditText code1;
    private EditText code2;
    private EditText code3;
    private EditText code4;
    private EditText code5;
    private EditText code6;
    private TextView resend;
    private TextView forwardAuthcode;
    private TextView userNumber;

    private ImageButton backButton;

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
        forwardAuthcode = findViewById(R.id.textViewForward);
        userNumber = findViewById(R.id.userNumber);

        backButton = findViewById(R.id.button);

        String text = "Resend Code 2:00";

        SpannableString ss = new SpannableString(text);

        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Registration2ndScreen.this, "One", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.BLACK);
            }
        };

        ss.setSpan(clickableSpan,0,6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );

        resend.setText(ss);
        resend.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
