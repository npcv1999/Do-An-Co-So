package com.example.congtimviecit;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomUngVienAdapter extends BaseAdapter {
    private List<Ungvien> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomUngVienAdapter(Context aContext,  List<Ungvien> listData) {
        this.context = aContext;
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        CustomUngVienAdapter.ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.ungvien_layout, null);
            holder = new CustomUngVienAdapter.ViewHolder();
            holder.hinhanhView = (ImageView) convertView.findViewById(R.id.imageView_flag);
            holder.tenungvienView= (TextView) convertView.findViewById(R.id.txtTenUngVien);

            convertView.setTag(holder);
        } else {
            holder = (CustomUngVienAdapter.ViewHolder) convertView.getTag();
        }

        Ungvien ungvien = this.listData.get(position);
        holder.tenungvienView.setText(ungvien.getTenungvien());


        int imageId = this.getMipmapResIdByName(ungvien.getTenhinh());

        holder.hinhanhView.setImageResource(imageId);

        return convertView;
    }

    // Find Image ID corresponding to the name of the image (in the directory mipmap).
    public int getMipmapResIdByName(String resName)  {
        String pkgName = context.getPackageName();
        // Return 0 if not found.
        int resID = context.getResources().getIdentifier(resName , "mipmap", pkgName);
        Log.i("CustomListView", "Res Name: "+ resName+"==> Res ID = "+ resID);
        return resID;
    }

    static class ViewHolder {
        ImageView hinhanhView;
        TextView tenungvienView;

    }
}
