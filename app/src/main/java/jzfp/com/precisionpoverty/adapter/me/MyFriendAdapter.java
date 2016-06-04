package jzfp.com.precisionpoverty.adapter.me;

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
public class MyFriendAdapter extends BaseAdapter {

    public MyFriendAdapter(Activity activity) {
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
            view = View.inflate(activity, R.layout.item_adapter_my_friend, null);
            holder.item = (LinearLayout) view.findViewById(R.id.item);
            holder.listener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Intent intent = new Intent(activity, ServeDetailActivity.class);
//                    activity.startActivity(intent);
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
