package com.example.nyxulric.enterprofiletamuku;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MessageAdapter extends BaseAdapter{

    List<Message> messages = new ArrayList<Message>();
    Context context;

    public MessageAdapter (Context context){
        this.context = context;
    }

    public void add(Message message){
        this.messages.add(message);
        notifyDataSetChanged(); //to render the list we need to notify
    }

    @Override
    public int getCount() {
        return messages.size();
    }

    @Override
    public Object getItem(int i) {
        return messages.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        MessageViewHolder holder = new MessageViewHolder();
        LayoutInflater messageInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        Message message = messages.get(i);

        if (message == null) { // this message was sent by us so let's create a basic chat bubble on the right
            convertView = messageInflater.inflate(R.layout.list_item_message_send, null);
            holder.name = convertView.findViewById(R.id.send_name);
            holder.messageBody = convertView.findViewById(R.id.text_message_send);
            convertView.setTag(holder);
            holder.messageBody.setText(message.getText());

        } else { // this message was sent by someone else so let's create an advanced chat bubble on the left
            convertView = messageInflater.inflate(R.layout.list_item_message_recv, null);
            holder.name = convertView.findViewById(R.id.recv_name);
            holder.messageBody = convertView.findViewById(R.id.text_message_recv);
            convertView.setTag(holder);

        //    holder.name.setText(message.getData().getName());
            holder.messageBody.setText(message.getText());
        //    GradientDrawable drawable = (GradientDrawable) holder.avatar.getBackground();
        //    drawable.setColor(Color.parseColor(message.getData().getColor()));
        }

        return convertView;
    }

    private class MessageViewHolder {
        public TextView name;
        public TextView messageBody;
    }
}
