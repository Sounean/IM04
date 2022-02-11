package com.example.moudule_hot.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.moudule_hot.R;
import com.example.moudule_hot.bean.acahtNews;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder>{
    List<acahtNews> mNewList;

    public NewsAdapter(List<acahtNews> list){
        mNewList = list;
    }

    @NonNull
    @Override
    public NewsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.activity_new_item,viewGroup,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdapter.ViewHolder viewHolder, int i) {
        acahtNews news = mNewList.get(i);
        viewHolder.tvTitle.setText(news.getTitle());
        viewHolder.tvData.setText(news.getData());
        viewHolder.tvUsername.setText(news.getUsername());
    }

    @Override
    public int getItemCount() {
        return mNewList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView tvTitle;
        private final TextView tvUsername;
        private final TextView tvData;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.tv_tittle);
            tvUsername = (TextView) itemView.findViewById(R.id.tv_username);
            tvData = (TextView) itemView.findViewById(R.id.tv_data);
        }
    }
}
