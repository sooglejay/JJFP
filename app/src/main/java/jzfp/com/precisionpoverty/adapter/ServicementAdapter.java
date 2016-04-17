package jzfp.com.precisionpoverty.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import jzfp.com.precisionpoverty.R;

/**
 * Created by JammyQtheLab on 2015/12/16.
 */
public class ServicementAdapter extends BaseAdapter {

    public ServicementAdapter(Activity activity) {
        this.activity = activity;
    }

    private Activity activity;

    @Override
    public int getCount() {
        return 8;
    }

    @Override
    public Object getItem(int i) {
        return new Object();
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = new ViewHolder();
        if (view == null) {
            view = View.inflate(activity, R.layout.item_adapter_service, null);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        return view;
    }

    private static class ViewHolder {
        private TextView brand_name;
        private ImageView imageView;
        private LinearLayout item;
        private View.OnClickListener listener;

    }
}
