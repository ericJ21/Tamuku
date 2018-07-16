package com.example.nyxulric.enterprofiletamuku;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatCheckBox;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegistrationActivity1 extends AppCompatActivity implements View.OnClickListener{

    private TextView textViewEnter;
    private TextView textViewServiceTerm;
    private EditText editTextMobileNumber;
    private Button buttonClose;
    private Button buttonForward;
    private Button checkBox;

    int i =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration1);

        textViewEnter = findViewById(R.id.textViewEnter);
        textViewServiceTerm = findViewById(R.id.textViewService);
        editTextMobileNumber = findViewById(R.id.editMobileNumber);
        buttonClose = findViewById(R.id.buttonClose);
        buttonForward = findViewById(R.id.buttonForward);
        checkBox = findViewById(R.id.buttonCheck);

        String text = "I agree to Tamuku's Terms of Service and Privacy Policy.";

        SpannableString ss = new SpannableString(text);

        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RegistrationActivity1.this, "Tamuku's Term of Service", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.rgb(138,214,248));
            }
        };

        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RegistrationActivity1.this, "Policy Term", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.rgb(138,214,248));
            }
        };

        ss.setSpan(clickableSpan, 20, 36, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan1, 41, 55, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textViewServiceTerm.setText(ss);
        textViewServiceTerm.setMovementMethod(LinkMovementMethod.getInstance());

        buttonForward.setOnClickListener(this);
        buttonClose.setOnClickListener(this);
    }

    public void checkMe(View view){
        if(view == checkBox){
            i++;
            if(i%2==0){
                checkBox.setBackgroundResource(R.drawable.check);
            }else{
                checkBox.setBackgroundResource(R.drawable.checkcircle);
            }
        }
    }

    @Override
    public void onClick(View view) {
        if (view==buttonForward){
            finish();
            startActivity(new Intent(this, Registration2ndScreen.class));
        }
    }
}
