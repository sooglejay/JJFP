package jzfp.com.precisionpoverty.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import jzfp.com.precisionpoverty.R;

/**
 * Created by JammyQtheLab on 2015/12/16.
 */
public class AreaSpinnerAdapter extends BaseAdapter {

    private List<String> mDatas = new ArrayList<>();

    public AreaSpinnerAdapter(Activity activity, List<String> mDatas) {
        this.activity = activity;
        this.mDatas = mDatas;
    }

    private Activity activity;

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public String getItem(int i) {
        return mDatas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = new ViewHolder();
        if (view == null) {
            view = View.inflate(activity, R.layout.item_adapter_spinner_area, null);
            holder.tvName = (TextView) view.findViewById(R.id.tv_name);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        holder.tvName.setText(getItem(i));
        return view;
    }

    private static class ViewHolder {
        private TextView tvName;
        private View.OnClickListener listener;
    }
}
