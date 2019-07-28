package com.example.faceapp.RecyclerViewAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.faceapp.R;


public class HistoryContentItemAdapter extends RecyclerView.Adapter<HistoryContentItemAdapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_history, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int date = position+1;
        holder.historyDate.setText(date+"");

    }

    @Override
    public int getItemCount() {
        return 30;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView historyDate;
        public TextView historyStartHour;
        public TextView historyEndHour;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            historyDate = (TextView) itemView.findViewById(R.id.history_date);
            historyStartHour = (TextView) itemView.findViewById(R.id.history_start_hour);
            historyEndHour = (TextView) itemView.findViewById(R.id.history_end_hour);



        }


    }
}
