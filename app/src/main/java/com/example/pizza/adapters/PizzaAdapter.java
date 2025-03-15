package com.example.pizza.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizza.DetailsActivity;
import com.example.pizza.R;
import com.example.pizza.beans.Pizza;

import java.util.List;

public class PizzaAdapter extends ArrayAdapter<Pizza> {

    // Constructor to initialize the adapter with a context and a list of pizzas
    public PizzaAdapter(Context context, List<Pizza> pizzas) {
        super(context, 0, pizzas);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // If the view is null, inflate it from the layout
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_pizza, parent, false);
        }

        // Get the pizza at the current position in the list
        Pizza pizza = getItem(position);

        // Bind views from the list_item_pizza layout
        ImageView pizzaImage = convertView.findViewById(R.id.pizza_image);
        TextView nameTextView = convertView.findViewById(R.id.pizza_name);
        TextView priceTextView = convertView.findViewById(R.id.pizza_price);
        TextView durationTextView = convertView.findViewById(R.id.pizza_duration);
        TextView descriptionTextView = convertView.findViewById(R.id.pizza_description);
        TextView ingredientsTextView = convertView.findViewById(R.id.pizza_ingredients);
        Button orderButton = convertView.findViewById(R.id.order_button);

        // Set data for each view if pizza is not null
        if (pizza != null) {
            pizzaImage.setImageResource(pizza.getImage()); // Assuming pizza.getImage() returns a valid resource ID
            nameTextView.setText(pizza.getNom());
            priceTextView.setText("$" + pizza.getPrix());
            durationTextView.setText("⏳ " + pizza.getDurre());
            descriptionTextView.setText(pizza.getDescription());
            ingredientsTextView.setText("Ingredients: " + pizza.getIngredient());

            // Handle order button click to start the DetailsActivity
            orderButton.setOnClickListener(v -> {
                // Create an Intent to open the DetailsActivity
                Intent intent = new Intent(getContext(), DetailsActivity.class);

                // Pass pizza details as extras to the Intent
                intent.putExtra("pizza_name", pizza.getNom());
                intent.putExtra("pizza_price", pizza.getPrix());
                intent.putExtra("pizza_ingredients", pizza.getIngredient());
                intent.putExtra("pizza_description", pizza.getDescription());
                intent.putExtra("pizza_image", pizza.getImage()); // Ensure this returns a valid resource ID

                // Start the DetailsActivity
                getContext().startActivity(intent);
            });
        }

        // Return the view that has been created and populated
        return convertView;
    }
}
