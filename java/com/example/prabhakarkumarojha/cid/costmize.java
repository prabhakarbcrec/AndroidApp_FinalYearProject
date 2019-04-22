package com.example.prabhakarkumarojha.cid;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Prabhakar Kumar Ojha on 31-03-2018.
 */

public class costmize extends ArrayAdapter {
    private Activity context;
    private String[] tname;
    Integer[] imgid;
    private String[] dept;

    public costmize(Activity context, String[] tname, String[] dept, Integer[] imgid) {
        super(context, R.layout.costmize, tname);
        this.context = context;
        this.tname = tname;

        this.dept = dept;
        this.imgid = imgid;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r = convertView;
        Viewholder viewholder = null;
        if (r == null) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.costmize, null, true);
            viewholder = new Viewholder(r);
            r.setTag(viewholder);
        } else {
            viewholder = (Viewholder) r.getTag();

        }
        viewholder.imageView2.setImageResource(imgid[position]);
        viewholder.tv1.setText(tname[position]);
        viewholder.tv2.setText(dept[position]);

        return r;
    }

    class Viewholder {
        TextView tv1;
        TextView tv2;
        ImageView imageView2;

        Viewholder(View v) {
            tv1 = (TextView) v.findViewById(R.id.textView1);
            tv2 = (TextView) v.findViewById(R.id.textView2);
            imageView2 = (ImageView) v.findViewById(R.id.imageView);


        }

    }
}
