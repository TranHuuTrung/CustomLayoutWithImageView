package com.example.admin.customlayout;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Admin on 10/3/2017.
 */

public class CustomAdapter extends ArrayAdapter<String> {
    private Activity context;
    private String[] name;
    private Integer[] imgId;

    public CustomAdapter(Activity context, String[] name, Integer[] imgId) {
        super(context, R.layout.row_item, name);
        this.context = context;
        this.name = name;
        this.imgId = imgId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.row_item, null, true);

        TextView tvName = (TextView) rowView.findViewById(R.id.tv_nuoc);
        ImageView imgCo = (ImageView) rowView.findViewById(R.id.img_Avatar);

        tvName.setText(name[position]);
        imgCo.setImageResource(imgId[position]);

        return rowView;
    }
    /*
    *   @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.row_item, parent, false);
            viewHolder.imgCo = (ImageView) convertView.findViewById(R.id.img_co);
            viewHolder.tvNuoc = (TextView) convertView.findViewById(R.id.tv_nuoc);

            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Item item = arrayList.get(position);
        viewHolder.imgCo.setBackgroundResource(item.getmCo());
        viewHolder.tvNuoc.setText(item.getmNuoc());

        return convertView;
    }
    public class ViewHolder{
        ImageView imgCo;
        TextView tvNuoc;
    }
}*/
}
