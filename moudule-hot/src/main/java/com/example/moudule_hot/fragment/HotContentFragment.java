package com.example.moudule_hot.fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.RemoteViews;

import com.example.moudule_hot.R;
import com.example.moudule_hot.adapter.NewsAdapter;
import com.example.moudule_hot.bean.acahtNews;
import com.example.moudule_hot.util.GlideImageLoader;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import java.util.ArrayList;
import java.util.List;

public class HotContentFragment extends Fragment {

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_content_fragment);
    }*/


    /*
    * 首页轮播图所需
    * */
    private List<String> imageArray;
    private List<String> imageTitle;
    private Banner mBanner;

    /*
    * 评论区所需要的评论数据
    * */
    private List<acahtNews> newsList = new ArrayList<>();


    RecyclerView rvNews;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_hot_content_fragment , container , false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        initData();
        initRv();   // 初始化recycl
    }

    private void initRv() {
        // 创建一个LinearLayoutManager对象，并把它设置进入RecyclerView中去，LinearLayoutManager用于指定RecyclerView的布局方式，这里用LinearLayoutManager是线性布局的意思，可以实现和ListView类似的效果。
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        rvNews.setLayoutManager(linearLayoutManager);
        // 我们创建了FruitAdapter的实例，并将水果的数据传入到FruitAdapter的构造函数中去。
        NewsAdapter fruitAdapter = new NewsAdapter(newsList);
        // 最后调用recyclerView的setAdapter()方法来完成适配器设置，这样RecyclerView和数据之间的关联就完成了。
        rvNews.setAdapter(fruitAdapter);
    }

    private void initData() {
        imageArray = new ArrayList<>();
        imageArray.add("http://www.52hrttpic.com/image/infoImage/201903/04/G1551322047922.jpeg");
        imageArray.add("http://www.52hrttpic.com/image/infoImage/201903/04/G1551322047921.jpeg");
        imageArray.add("http://www.52hrttpic.com/image/infoImage/201903/04/G1551322047910.jpeg");
        //设置图片标题集合
        imageTitle=new ArrayList<>();
        imageTitle.add("这是杭科院滴大门~");
        imageTitle.add("李XX学长的xx公司成功上市~");
        imageTitle.add("校园春色");
        //设置banner样式
        mBanner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);
        //设置图片加载器
        mBanner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        mBanner.setImages(imageArray);
        //设置banner动画效果
        mBanner.setBannerAnimation(Transformer.RotateDown);
        //设置标题集合（当banner样式有显示title时）
        mBanner.setBannerTitles(imageTitle);
        //设置轮播时间
        mBanner.setDelayTime(1500);
        //设置指示器位置（当banner模式中有指示器时）
        mBanner.setIndicatorGravity(BannerConfig.CENTER);
        //banner设置方法全部调用完毕时最后调用
        mBanner.start();

        /*
        * 初始化了news的数据
        * */
        acahtNews news1 = new acahtNews("移动互联大赛报名" , "于2096年6月14号有一场移动互联大赛，有意向的同学，联系王同学，校友聊号:2017002520.让他拉你进群。");
        acahtNews news2 = new acahtNews("凛冬将至" , "今天有降温，请大家即时穿衣！！！！");
        acahtNews news3 = new acahtNews("猪肉涨价拉！！！" , "今天猪肉涨价0.00000000000001分");
        acahtNews news4 = new acahtNews("大家答辩准备好了嘛？" , "十一号答辩，大家今天项目已经做好了嘛？");
        acahtNews news5 = new acahtNews("实习情况" , "很好！！！！");
        acahtNews news6 = new acahtNews("晨间测试" , "今天猪肉涨价0.00000000000001分");
            newsList.add(news1);
            newsList.add(news2);
            newsList.add(news3);
            newsList.add(news4);
        newsList.add(news5);
        newsList.add(news6);

    }

    private void initView() {
        mBanner = getView().findViewById(R.id.banner);
        rvNews = getView().findViewById(R.id.rv_news);
    }
}
