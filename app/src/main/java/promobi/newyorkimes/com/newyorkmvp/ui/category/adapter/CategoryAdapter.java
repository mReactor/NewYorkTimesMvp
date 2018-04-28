package promobi.newyorkimes.com.newyorkmvp.ui.category.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import promobi.newyorkimes.com.newyorkmvp.R;
import promobi.newyorkimes.com.newyorkmvp.ui.topStories.TopStories;

/**
 * Created by mazeqube on 4/27/18.
 */

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryHolder> {

    private Context context;
    private List<String> category = new ArrayList<>();

    public CategoryAdapter(Context context, List<String> category){

        this.context = context;
        this.category = category;
    }

    @Override
    public CategoryAdapter.CategoryHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view  = LayoutInflater.from(context).inflate(R.layout.category_item_list,parent,false);

        return new CategoryHolder(view);
    }

    @Override
    public void onBindViewHolder(CategoryAdapter.CategoryHolder holder, int position) {

        holder.categoryTitle.setText(category.get(position));

        if(position%2 == 0){

            holder.backgroundImage.setBackgroundResource(R.drawable.a);
        }else if(position%3 == 0){
            holder.backgroundImage.setBackgroundResource(R.drawable.r);
        }else{
            holder.backgroundImage.setBackgroundResource(R.drawable.b);
        }

        holder.mainViewGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = TopStories.getstartIntent(context);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return 7;
    }

    public class CategoryHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.backgroundImageCategoryItemList)
        ImageView backgroundImage;

        @BindView(R.id.titleCategoryItemList)
        TextView categoryTitle;

        @BindView(R.id.mainViewGroupCategoryItemList)
        LinearLayout mainViewGroup;


        public CategoryHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this,itemView);
        }
    }
}
