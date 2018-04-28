package promobi.newyorkimes.com.newyorkmvp.ui.topStories.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import promobi.newyorkimes.com.newyorkmvp.NewYorkTimesApplication;
import promobi.newyorkimes.com.newyorkmvp.R;
import promobi.newyorkimes.com.newyorkmvp.data.db.model.Result;
import promobi.newyorkimes.com.newyorkmvp.data.db.model.TopStoriesResponse;
import promobi.newyorkimes.com.newyorkmvp.di.scope.ApplicationContext;
import promobi.newyorkimes.com.newyorkmvp.ui.TopStoriesDetail.TopStoriesDetail;
import promobi.newyorkimes.com.newyorkmvp.ui.topStories.TopStories;

/**
 * Created by mazeqube on 4/27/18.
 */

public class TopStoriesAdapter extends RecyclerView.Adapter<TopStoriesAdapter.TopStoriesHolder> {


    private final Context context;
    private List<Result> result;

    public TopStoriesAdapter(Context context, List<Result> result){

        this.context = context;
        this.result = result;

    }


    @Override
    public TopStoriesAdapter.TopStoriesHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.top_stories_item,parent,false);
        return new TopStoriesHolder(view);
    }

    @Override
    public void onBindViewHolder(TopStoriesAdapter.TopStoriesHolder holder, final int position) {

        if(result.get(position).getMultimedia() != null && result.get(position).getMultimedia().size() > 0) {

            Glide.with(context).load(result.get(position).getMultimedia().get(0).getUrl()).into(holder.newsImage);

        }else {

            Glide.with(context).load(R.drawable.nytimes).into(holder.newsImage);

        }
        holder.shortDetail.setText(result.get(position).getTitle());

        holder.mainView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NewYorkTimesApplication.getInstance().setResults(result.get(position));

               Intent intent =  TopStoriesDetail.getStartIntent(context);
               context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return result.size();
    }

    public class TopStoriesHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.image_top_stories_item)
        ImageView newsImage;

        @BindView(R.id.short_detail_top_stories_item)
        TextView shortDetail;

        @BindView(R.id.main_view_top_stories_item)
        LinearLayout mainView;


        public TopStoriesHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this,itemView);
        }
    }
}
