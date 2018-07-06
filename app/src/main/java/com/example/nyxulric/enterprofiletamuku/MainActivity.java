package com.example.nyxulric.enterprofiletamuku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textViewPleasefillin;
    private ImageButton imageButtonProfile;
    private TextView textViewUpload;
    private EditText editTextUsername;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private EditText editTextConfirmPassword;
    private Button continueButton;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButtonProfile = findViewById(R.id.imageProfile);
        textViewPleasefillin = findViewById(R.id.textviewFill);
        textViewUpload = findViewById(R.id.textUploadProfile);
        editTextUsername = findViewById(R.id.editUserName);
        editTextEmail = findViewById(R.id.editEmailAddress);
        editTextPassword = findViewById(R.id.editPassword);
        editTextConfirmPassword = findViewById(R.id.editConfirmPassword);
        continueButton = findViewById(R.id.buttonContinue);
        view = findViewById(R.id.viewbotBg);

        continueButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}
