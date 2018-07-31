package com.example.nyxulric.enterprofiletamuku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class SplashScreenHome extends AppCompatActivity {

    private Button logout;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreenhome);

        firebaseAuth = FirebaseAuth.getInstance();

        logout = findViewById(R.id.btn_logout);


        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firebaseAuth.signOut();
                finish();
                startActivity(new Intent(SplashScreenHome.this, MainActivity.class));
            }
        });
    }


}
