package com.app.customers.ui.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.customers.R;
import com.app.customers.domain.model.Customer;
import com.app.customers.ui.holders.AbstractRecyclerViewHolder;
import com.app.customers.ui.utils.GetMD5Hash;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by Stefan
 */

public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.ViewHolder> {

    private List<Customer> models;

    public CustomerAdapter() {
        models = new ArrayList<Customer>();
    }

    public CustomerAdapter(List<Customer> models) {
        this.models = models;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View modelView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view, viewGroup, false);
        return new ViewHolder(modelView);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        Customer customer = models.get(position);

        String gravatar = "";

        String defaultEmail = "something@yahoo.com";

        String email = "";

        if (customer.getEmail() != null) {

            email = new GetMD5Hash().emailHash(customer.getEmail());

        }

        if (customer.getEmail() != null && customer.getEmail().length() > 0) {

            gravatar = "https://www.gravatar.com/avatar/" +
                    //"0" +
                    email +
                    "?s=200";

        } else
            gravatar = "https://www.gravatar.com/avatar/" +
                    defaultEmail +
                    "?s=200";

        viewHolder.name.setText(customer.getName());
        viewHolder.expectedTime.setText(customer.getExpectedTime());

        Picasso.with(viewHolder.view.getContext())
                .load(gravatar)
                .into(viewHolder.image);

    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class ViewHolder extends AbstractRecyclerViewHolder {

        View view;

        @BindView(R.id.model_title)
        TextView name;
        @BindView(R.id.expected_time)
        TextView expectedTime;
        @BindView(R.id.model_image)
        ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);
            this.view = itemView;
        }
    }

}
