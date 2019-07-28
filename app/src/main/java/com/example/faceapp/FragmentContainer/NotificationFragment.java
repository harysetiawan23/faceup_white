package com.example.faceapp.FragmentContainer;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.faceapp.R;
import com.example.faceapp.RecyclerViewAdapter.NotificationContentItemAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationFragment extends Fragment {
    private View fragmentView;


    public NotificationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentView = inflater.inflate(R.layout.fragment_notification, container, false);
        setHasOptionsMenu(true);
        RecyclerView recyclerView = (RecyclerView)fragmentView.findViewById(R.id.notification_rv);
        RecyclerView.Adapter adapter = new NotificationContentItemAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL,false));
        recyclerView.setAdapter(adapter);
        return fragmentView;
    }

}
