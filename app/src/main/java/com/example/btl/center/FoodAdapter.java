package com.example.btl.center;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.example.btl.R;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodHolder> implements Filterable {
    private Context mcontext;
    private List<foodatv> mListFood;
    private List<foodatv> mListFood2;

    public FoodAdapter(Context context, List<foodatv> mListFood) {
        this.mcontext = context;
        this.mListFood = mListFood;
        this.mListFood2 = mListFood;
    }
    public class FoodHolder extends RecyclerView.ViewHolder{
        private RelativeLayout layoutItem;
        private CircleImageView imgFood;
        private TextView tvnameFood;
        private TextView moTaFood;
        public FoodHolder(@NonNull View itemView) {
            super(itemView);
            layoutItem = itemView.findViewById(R.id.layout_item);
            imgFood = itemView.findViewById(R.id.imgFood);
            tvnameFood = itemView.findViewById(R.id.tv_name_food);
            moTaFood = itemView.findViewById(R.id.mota);

        }
    }
    @NonNull
    @Override
    public FoodHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemfood, parent, false);
        return new FoodHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodHolder holder, int position) {
        foodatv food = mListFood.get(position);
        if( food == null)
        {
            return;
        }
        holder.imgFood.setImageResource(food.getImgfood());
        holder.tvnameFood.setText(food.getFoodname());
        holder.moTaFood.setText(food.getMotafood());
        holder.layoutItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickGoto(food);
            }
        });
    }
    private void onClickGoto(foodatv food) {

        Intent intent = new Intent(mcontext, HienThiMonAn.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("obj_food", food);
        intent.putExtras(bundle);
        mcontext.startActivity(intent);
    }
    public void release()
    {
        mcontext = null;
    }
    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence contains) {
                String strSeach = contains.toString();
                if (strSeach.isEmpty())
                {
                    mListFood = mListFood2;
                }
                else
                {
                    List<foodatv> list= new ArrayList<>();
                    for (foodatv food : mListFood2)
                    {
                        if(food.getFoodname().toLowerCase().contains(strSeach.toLowerCase()))
                        {
                            list.add(food);
                        }
                    }
                    mListFood = list;
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = mListFood;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                mListFood = (List<foodatv>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }



    @Override
    public int getItemCount() {
        if(mListFood != null)
        {
            return mListFood.size();
        }
        return 0;
    }



}
