package com.example.moudule_hot;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import static com.example.lib_base.ConstMap.HOT_MAINACT;
import static com.example.lib_base.ConstMap.IM_MAINACT;

@Route(path = HOT_MAINACT)
public class HotActivity extends AppCompatActivity {
    BottomNavigationView hotBtnNav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 21){
            View decorView =  getWindow().getDecorView();
            decorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        setContentView(R.layout.activity_hot);

        initView();
    }

    private void initView() {
        hotBtnNav= findViewById(R.id.hotBtnNav);
        hotBtnNav.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            int itemId = item.getItemId();
            if (itemId == R.id.hot_bottom_jump) {
            } else if (itemId == R.id.chat_bottom_jump) {
                ARouter.getInstance().build(IM_MAINACT).navigation();
            }
            return false;
        }
    };

    /*public void Jump(View view) {
        ARouter.getInstance().build(IM_MAINACT).navigation();
    }*/
}
