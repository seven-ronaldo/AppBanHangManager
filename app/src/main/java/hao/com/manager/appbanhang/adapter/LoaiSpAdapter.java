package hao.com.manager.appbanhang.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import hao.com.manager.appbanhang.R;
import hao.com.manager.appbanhang.model.LoaiSp;

public class LoaiSpAdapter extends BaseAdapter {
    List<LoaiSp> array;
    Context context;

    public LoaiSpAdapter(Context context, List<LoaiSp> array) {
        this.array = array;
        this.context = context;
    }

    @Override
    public int getCount() {
        return array.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public class ViewHolder{
        TextView textensp;
        ImageView imghinhanh;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.item_sanpham, null);
            viewHolder.textensp = convertView.findViewById(R.id.item_tensp);
            viewHolder.imghinhanh = convertView.findViewById(R.id.item_image);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.textensp.setText(array.get(position).getTensanpham());
        Glide.with(context)
                .load(array.get(position).getHinhanh())
                .into(viewHolder.imghinhanh);

        return convertView;
    }
}
