package com.example.foodapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.R;
import com.example.foodapp.model.AmericanFood;
import com.example.foodapp.model.PopularFood;

import java.util.List;


public class AmericanFoodAdapter extends RecyclerView.Adapter<AmericanFoodAdapter.AmericanFoodViewHolder> {
Context context;
List<AmericanFood> americanFoodList;

    public AmericanFoodAdapter(Context context, List<AmericanFood> popularFoodList) {
        this.context = context;
        this.americanFoodList =americanFoodList;
    }

    @NonNull
    @Override
    public AmericanFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.american_food_row_item,parent,false);

        return new AmericanFoodViewHolder(view);
    }


    @Override
    public void onBindViewHolder(AmericanFoodViewHolder holder, int position) {

        holder.foodImage.setImageResource(americanFoodList. get(position).getImageURL());
        holder.name.setText(americanFoodList.get(position).getName());
        holder.price.setText(americanFoodList.get(position).getPrice());
        holder.rating.setText(americanFoodList.get(position).getRating());
        holder.restaurantname.setText(americanFoodList.get(position).getRestaurantname());

    }

    @Override
    public int getItemCount() {
        return americanFoodList.size();
    }

    public static final class AmericanFoodViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView price, name,rating, restaurantname;
        public AmericanFoodViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.image_food);
            price = itemView.findViewById(R.id.price1);
            name = itemView.findViewById(R.id.name1);
            rating = itemView.findViewById(R.id.rating);
            restaurantname = itemView.findViewById(R.id.restaurant_name);
        }
    }


}
