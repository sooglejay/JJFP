package jzfp.com.precisionpoverty.adapter.serve;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import jzfp.com.precisionpoverty.R;
import jzfp.com.precisionpoverty.activity.serve.ServeDetailActivity;

/**
 * Created by JammyQtheLab on 2015/12/16.
 */
public class ServementAdapter extends BaseAdapter {

    public ServementAdapter(Activity activity) {
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
            view = View.inflate(activity, R.layout.item_adapter_serve, null);

            holder.item = (LinearLayout) view.findViewById(R.id.item);
            holder.listener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(activity, ServeDetailActivity.class);
                    activity.startActivity(intent);
                }
            };
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        holder.item.setOnClickListener(holder.listener);
        return view;
    }

    private static class ViewHolder {
        private TextView brand_name;
        private ImageView imageView;
        private LinearLayout item;
        private View.OnClickListener listener;

    }
}
