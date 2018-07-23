package com.example.nyxulric.enterprofiletamuku;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Member;

public class BuyerChatActivity extends AppCompatActivity {

//    private TextView yourOffer, productName, sellerName, rate, textViewChat;
//    private EditText priceOffer, textMessage;
//    private String roomName = "observable-room";
//    private ImageView sellerProfile;
//    private Button backBtn, notyBtn, alertBtn, sendBtn;
//    private ListView messagesView;
//    private MessageAdapter messageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyer_chat);

//        priceOffer = findViewById(R.id.editPriceOffer);
//        textMessage = findViewById(R.id.user_message_buyer);
//        backBtn = findViewById(R.id.btnBack);
//        notyBtn = findViewById(R.id.btnNoty);
//        alertBtn = findViewById(R.id.btnAlert);
//        sendBtn = findViewById(R.id.fab);
//        messagesView = findViewById(R.id.list_message);
//
//        messageAdapter = new MessageAdapter(this);
//        messagesView.setAdapter(messageAdapter);
//
//
//        sendBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                sendMessage(view);
//                onMessage();
//            }
//        });
//        backBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
//        notyBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
//        alertBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
//    }
//
//    public void sendMessage(View view) {
//        String message = textMessage.getText().toString();
//        String message2 = priceOffer.getText().toString();
//        if (message.length() > 0) {
//            textMessage.getText().clear();
//        } else if (message2.length()>0) {
//            priceOffer.setText("Hi there, I would like to offer your Samsung S9 for " + priceOffer.toString().trim());
//        }
//    }
//
//
//
//    public void onMessage() {
//        final Message message = new Message();
//        runOnUiThread(new Runnable() {
//            @Override
//            public void run() {
//                messageAdapter.add(message);
//                messagesView.setSelection(messagesView.getCount() - 1);
//            }
//        });
    }
}
