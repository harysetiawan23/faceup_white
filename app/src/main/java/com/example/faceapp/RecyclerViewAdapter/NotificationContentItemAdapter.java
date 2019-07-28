package com.example.faceapp.RecyclerViewAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.faceapp.R;


public class NotificationContentItemAdapter extends RecyclerView.Adapter<NotificationContentItemAdapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_notification, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if(position==3){
            holder.notificationTitle.setText("Dont Forget your Driving License");
            holder.notificationMessage.setText("Hey Jhon Doe, A Good driver wont lose his driving license");
        }else if(position==2){
            holder.notificationTitle.setText("A New Card Added");
            holder.notificationMessage.setText("Hey Jhon Doe, A BPJS Card has been registred");
        }
        else if(position==1){
            holder.notificationTitle.setText("KIP Card is Expired");
            holder.notificationMessage.setText("Hey Jhon Doe, Your KIP Card is already Expired");
        }
        else if(position==0){
            holder.notificationTitle.setText("Welcome New User");
            holder.notificationMessage.setText("Hey Jhon Doe, Welcome to DIGID your personal identity card with biometric identification");
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView notificationTitle;
        public TextView notificationMessage;

        public LinearLayout notifiactionContent;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            notificationTitle = (TextView) itemView.findViewById(R.id.notification_title);
            notificationMessage = (TextView) itemView.findViewById(R.id.notification_message);


            notifiactionContent = itemView.findViewById(R.id.notification_content);
        }


    }
}
