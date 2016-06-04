package jzfp.com.precisionpoverty.activity.requirement;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import jzfp.com.precisionpoverty.R;
import jzfp.com.precisionpoverty.activity.main.BaseActivity;
import jzfp.com.precisionpoverty.widgets.TitleBarWithoutSearch;

/**
 * Created by Jerry on 16/5/25.
 */
public class RequirementDetailActivity extends BaseActivity {
    private TitleBarWithoutSearch titleBar;
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
        titleBar.setOnTitleBarClickListener(new TitleBarWithoutSearch.OnTitleBarClickListener() {
            @Override
            public void onLeftButtonClick(View v) {
                finish();
            }

            @Override
            public void onRightButtonClick(View v) {

            }
        });
    }

    private void setUpDatas() {

    }

    private void setUpViews() {

        titleBar = (TitleBarWithoutSearch) findViewById(R.id.title_bar);
        titleBar.initTitleBarInfo("需求介绍", R.drawable.arrow_left, -1, "", "");

    }
}
