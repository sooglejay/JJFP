package jzfp.com.precisionpoverty.widgets;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import jzfp.com.precisionpoverty.R;


public class TitleBar extends FrameLayout {
    private LinearLayout container;
    private TextView tvLeft;
    private LinearLayout layoutSearch;
    private LinearLayout layoutPlus;

    public TitleBar(Context context) {
        super(context);
        setUpViews(context);
    }

    public TitleBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        setUpViews(context);
    }

    public TitleBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setUpViews(context);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public TitleBar(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setUpViews(context);
    }

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2016-04-17 16:11:44 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews(Context context) {
        View view = View.inflate(context,R.layout.view_titlebar,this);
        container = (LinearLayout)view.findViewById(R.id.container);
        tvLeft = (TextView)view.findViewById(R.id.tv_left);
        layoutSearch = (LinearLayout)view.findViewById(R.id.layout_search);
        layoutPlus = (LinearLayout)view.findViewById(R.id.layout_plus);
    }

    public void setOnTitleBarClickListener(OnTitleBarClickListener onTitleBarClickListener) {
        this.onTitleBarClickListener = onTitleBarClickListener;
    }

    OnTitleBarClickListener onTitleBarClickListener;

    private void setUpViews(Context context){
        findViews(context);
        layoutPlus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                onTitleBarClickListener.onPlus(v);
            }
        });

        layoutSearch.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                onTitleBarClickListener.onSearch(v);
            }
        });
    }

    public interface OnTitleBarClickListener {
        public void onSearch(View v);

        public void onPlus(View v);
    }


}
