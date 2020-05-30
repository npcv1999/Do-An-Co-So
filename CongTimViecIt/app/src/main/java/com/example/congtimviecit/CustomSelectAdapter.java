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
public class CustomSelectAdapter  extends BaseAdapter{

    private List<Selected> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomSelectAdapter(Context aContext,  List<Selected> listData) {
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
        CustomSelectAdapter.ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.select_item_layout, null);
            holder = new CustomSelectAdapter.ViewHolder();
            holder.hinhanhView = (ImageView) convertView.findViewById(R.id.imageView_flag);
            holder.congtyView = (TextView) convertView.findViewById(R.id.textView_countryName);
            holder.luongView = (TextView) convertView.findViewById(R.id.txtluong);
            holder.vitriView = (TextView) convertView.findViewById(R.id.txtDchi);
            holder.loaicvView = (TextView) convertView.findViewById(R.id.textView_population);
            convertView.setTag(holder);
        } else {
            holder = (CustomSelectAdapter.ViewHolder) convertView.getTag();
        }

        Selected congty = this.listData.get(position);
        holder.congtyView.setText(congty.getTencty());
        holder.luongView.setText("Mức lương: "+congty.getLuong());
        holder.loaicvView.setText("Vị trí: "+congty.getLoaicv());
        holder.vitriView.setText("Địa chỉ: " + congty.getVitri());

        int imageId = this.getMipmapResIdByName(congty.getTenhinh());

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
        TextView congtyView;
        TextView loaicvView;
        TextView luongView;
        TextView vitriView;
    }

}
