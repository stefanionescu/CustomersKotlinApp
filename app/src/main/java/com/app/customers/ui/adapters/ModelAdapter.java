package com.app.customers.ui.adapters;

/**
 * Created by Stefan
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.customers.R;
import com.app.customers.data.model.CustomersList;
import com.app.customers.ui.holders.AbstractRecyclerViewHolder;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * @author stefan
 */
public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.ViewHolder> {

    private List<CustomersList> customers;

    public ModelAdapter() {
        customers = new ArrayList<CustomersList>();
    }

    public ModelAdapter(List<CustomersList> models) {
        this.customers = models;
    }

    @Override

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View modelView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view, viewGroup, false);
        return new ViewHolder(modelView);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        CustomersList model = customers.get(position);



    }

    @Override
    public int getItemCount() {
        return customers.size();
    }

    public class ViewHolder extends AbstractRecyclerViewHolder {

        View view;

        @BindView(R.id.model_title)
        TextView name;
        @BindView(R.id.model_image)
        ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);
            this.view = itemView;
        }
    }
}