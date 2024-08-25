package com.example.howtoinstallcode;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.util.Log;

import com.example.howtoinstallcode.codeclass.Datum;
import com.example.howtoinstallcode.codeclass.Howtoinstallcode;

import java.util.ArrayList;
import java.util.List;

public class AdapterFragment extends BaseAdapter {
    private Context context;
    private List<Datum> data;

    public AdapterFragment(Context context, List<Datum> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(this.context);
            view = layoutInflater.inflate(R.layout.grid_item, viewGroup, false);
        }

        ImageView imageView = view.findViewById(R.id.front_button);
        int resourceId = context.getResources().getIdentifier(data.get(i).getProgramName(), "drawable", context.getPackageName());
        Log.d("TAG", "getViews: " + resourceId);
        Log.d("TAG", "getViews: " + data.get(i).getProgramName());

        imageView.setImageResource(resourceId);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return view;
    }
}
