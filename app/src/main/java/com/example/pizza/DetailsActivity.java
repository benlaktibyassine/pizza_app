package com.example.pizza;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    private ImageView pizzaImageView;
    private TextView pizzaNameTextView;
    private TextView pizzaPriceTextView;
    private TextView pizzaIngredientsTextView;
    private TextView pizzaDescriptionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);

        // Initialize the views
        pizzaImageView = findViewById(R.id.pizza_image);
        pizzaNameTextView = findViewById(R.id.pizza_name);
        pizzaPriceTextView = findViewById(R.id.pizza_price);
        pizzaIngredientsTextView = findViewById(R.id.pizza_ingredients);
        pizzaDescriptionTextView = findViewById(R.id.pizza_description);

        // Get the data from the Intent
        Intent intent = getIntent();
        String pizzaName = intent.getStringExtra("pizza_name");
        double pizzaPrice = intent.getDoubleExtra("pizza_price", 0.0);
        String pizzaIngredients = intent.getStringExtra("pizza_ingredients");
        String pizzaDescription = intent.getStringExtra("pizza_description");
        int pizzaImageResId = intent.getIntExtra("pizza_image", 1);

        // Set the data to the views
        pizzaNameTextView.setText(pizzaName);
        pizzaPriceTextView.setText("$" + pizzaPrice);
        pizzaIngredientsTextView.setText(pizzaIngredients);
        pizzaDescriptionTextView.setText(pizzaDescription);
        pizzaImageView.setImageResource(pizzaImageResId);
    }
}
