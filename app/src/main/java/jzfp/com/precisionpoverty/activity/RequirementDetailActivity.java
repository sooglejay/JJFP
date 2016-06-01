package jzfp.com.precisionpoverty.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ListView;

import jzfp.com.precisionpoverty.R;
import jzfp.com.precisionpoverty.widgets.ScrollableViewPager;
import jzfp.com.precisionpoverty.widgets.TitleBar;

/**
 * Created by Jerry on 16/5/25.
 */
public class RequirementDetailActivity extends BaseActivity {
    private ListView listView;
    private View headerOfListView;
    private TitleBar titleBar;
    private ScrollableViewPager viewPager;
    private Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requirement_detail);
        activity = this;
        setUpViews();
        setUpDatas();
        setUpLisenters();
    }

    private void setUpLisenters() {

    }

    private void setUpDatas() {

    }

    private void setUpViews() {

        titleBar = (TitleBar) findViewById(R.id.title_bar);

        listView = (ListView) findViewById(R.id.list_view);
        headerOfListView = View.inflate(activity, R.layout.header_requirement_detail_listview, null);
        viewPager = (ScrollableViewPager) headerOfListView.findViewById(R.id.view_pager);
        listView.addHeaderView(headerOfListView);
    }
}
