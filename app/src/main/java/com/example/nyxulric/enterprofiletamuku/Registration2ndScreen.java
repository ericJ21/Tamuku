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

import java.lang.reflect.Array;


public class Registration2ndScreen extends AppCompatActivity implements View.OnClickListener {

    private TextView pleaseEnterCode;
    private EditText code1, code2, code3, code4, code5, code6;
    private TextView resend;
    private TextView forwardAuthcode;

    private char s;

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

        code1.addTextChangedListener(new GenericTextWatcher(code1));
        code2.addTextChangedListener(new GenericTextWatcher(code2));
        code3.addTextChangedListener(new GenericTextWatcher(code3));
        code4.addTextChangedListener(new GenericTextWatcher(code4));
        code5.addTextChangedListener(new GenericTextWatcher(code5));
        code6.addTextChangedListener(new GenericTextWatcher(code6));

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

        ss.setSpan(clickableSpan, 0, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        resend.setText(ss);
        resend.setMovementMethod(LinkMovementMethod.getInstance());

        backButton.setOnClickListener(this);
        forwardButton.setOnClickListener(this);
    }

    public class GenericTextWatcher implements TextWatcher {

        private View view;

        private GenericTextWatcher(View view) {
            this.view = view;
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int count, int i2) {
            String text = charSequence.toString();
            switch (view.getId()){
                case R.id.editCode:
                    if (text.length()==1)
                        code2.requestFocus(View.FOCUS_DOWN);
                    else if (count == 0)
                        code1.requestFocus(View.FOCUS_DOWN);
                    break;
                case R.id.editCode2:
                    if (text.length()==1)
                        code3.requestFocus(View.FOCUS_DOWN);
                    else if (count == 0)
                        code2.requestFocus(View.FOCUS_DOWN);
                    break;
                case R.id.editCode3:
                    if (text.length()==1)
                        code4.requestFocus(View.FOCUS_DOWN);
                    else
                        if (text.length() == 0)
                        code3.requestFocus(View.FOCUS_DOWN);
                    break;
                case R.id.editCode4:
                    if (text.length()==1)
                        code5.requestFocus(View.FOCUS_DOWN);
                    else if (count == 0)
                        code4.requestFocus(View.FOCUS_DOWN);
                    break;
                case R.id.editCode5:
                    if (text.length()==1)
                        code6.requestFocus(View.FOCUS_DOWN);
                    else if (count == 0)
                        code5.requestFocus(View.FOCUS_DOWN);
                    break;
                case R.id.editCode6:
                    if (count == 0)
                        code6.requestFocus(View.FOCUS_DOWN);
                    break;
            }
        }

        @Override
        public void afterTextChanged(Editable editable) {
            String text = editable.toString();
            switch (view.getId()) {
                case R.id.editCode:
                    break;
                case R.id.editCode2:
                    if (text.length() == 0)
                        code1.requestFocus();
                    break;
                case R.id.editCode3:
                    if (text.length() == 0)
                        code2.requestFocus();
                    break;
                case R.id.editCode4:
                    if (text.length() == 0)
                        code3.requestFocus();
                    break;
                case R.id.editCode5:
                    if (text.length() == 0)
                        code4.requestFocus();
                    break;
                case R.id.editCode6:
                    if (text.length() == 0)
                        code5.requestFocus();
                    break;
            }
          }
    }


    @Override
    public void onClick(View view) {

    }
}
