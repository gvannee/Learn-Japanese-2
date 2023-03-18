package edu.hanu.a1_2001040222.hellojapan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;


import java.util.List;



public class CharacterBaseAdapter extends BaseAdapter {
    Context context;
    List<Characters> btn;


    public CharacterBaseAdapter(Context context, List<Characters> btn) {
        this.context = context;
        this.btn = btn;
    }

    @Override
    public int getCount() {
        return btn.size();
    }

    @Override
    public Object getItem(int i) {
        return btn.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_button, null);
        }
        Button btnTest = view.findViewById(R.id.btnModel);
        btnTest.setBackgroundResource(btn.get(i).getImage());
        return view;
    }


}
