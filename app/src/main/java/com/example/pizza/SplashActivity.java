package com.example.pizza;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.pizza.adapters.PizzaAdapter;
import com.example.pizza.beans.Pizza;

import java.util.ArrayList;
import java.util.List;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.pizza_list);

        // Create sample data
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(new Pizza(
                "PEPPERONI-SAUSAGE STUFFED PIZZA",
                R.mipmap.p1,
                "- 1 package (1/4 ounce) active dry yeast\n- 1-1/4 cups warm water (110° to 115°)\n- 2 tablespoons olive oil\n- 1-1/2 teaspoons salt\n- 1 teaspoon sugar\n- 3-1/2 to 4 cups all-purpose flour",
                "45 min",
                5.0,
                "For 30 years, friends have been telling me to open a pizzeria using this recipe. It even freezes well. —Elizabeth Wolff, Carmel, Indiana",
                12
        ));

        pizzas.add(new Pizza(
                "MARGHERITA PIZZA",
                R.mipmap.p2,
                "- 2 cups all-purpose flour\n- 1/2 teaspoon salt\n- 3/4 cup warm water\n- 1 teaspoon yeast\n- 1 tablespoon olive oil\n- 1/2 cup pizza sauce\n- 1 cup fresh mozzarella\n- Fresh basil leaves",
                "30 min",
                4.5,
                "A classic Italian pizza with fresh mozzarella, tomato sauce, and basil for a simple yet delicious taste.",
                8
        ));

        pizzas.add(new Pizza(
                "BBQ CHICKEN PIZZA",
                R.mipmap.p3,
                "- 1 cup cooked chicken (shredded)\n- 1/2 cup BBQ sauce\n- 1 small red onion (sliced)\n- 1 cup mozzarella cheese\n- 1 pizza dough",
                "40 min",
                6.0,
                "A delicious pizza topped with BBQ chicken, red onions, and lots of cheese.",
                10
        ));

        pizzas.add(new Pizza(
                "VEGETARIAN DELIGHT",
                R.mipmap.p4,
                "- 1/2 cup bell peppers (sliced)\n- 1/2 cup mushrooms (sliced)\n- 1/2 cup onions (sliced)\n- 1/2 cup black olives\n- 1 cup mozzarella cheese",
                "35 min",
                5.5,
                "A fresh and healthy pizza loaded with colorful vegetables and cheese.",
                9
        ));

        pizzas.add(new Pizza(
                "MEAT LOVERS PIZZA",
                R.mipmap.p5,
                "- 1/2 cup pepperoni\n- 1/2 cup sausage\n- 1/2 cup bacon\n- 1 cup mozzarella cheese\n- 1/2 cup pizza sauce",
                "50 min",
                7.5,
                "For those who love extra meat, this pizza is packed with pepperoni, sausage, and bacon.",
                10
        ));

        pizzas.add(new Pizza(
                "FOUR CHEESE PIZZA",
                R.mipmap.p6,
                "- 1/2 cup mozzarella cheese\n- 1/2 cup cheddar cheese\n- 1/2 cup Parmesan cheese\n- 1/2 cup provolone cheese\n- 1/2 cup pizza sauce",
                "35 min",
                6.5,
                "A cheesy delight with four different types of cheese melting together on a crispy crust.",
                8
        ));

        pizzas.add(new Pizza(
                "SPICY BUFFALO CHICKEN PIZZA",
                R.mipmap.p1,
                "- 1 cup cooked chicken (shredded)\n- 1/2 cup buffalo sauce\n- 1/2 cup ranch dressing\n- 1 cup mozzarella cheese",
                "40 min",
                6.8,
                "A spicy and tangy pizza with buffalo chicken and ranch dressing.",
                10
        ));

        pizzas.add(new Pizza(
                "MEDITERRANEAN PIZZA",
                R.mipmap.p2,
                "- 1/2 cup feta cheese\n- 1/2 cup Kalamata olives\n- 1/2 cup cherry tomatoes\n- 1/2 cup spinach\n- 1/2 cup red onions",
                "40 min",
                6.2,
                "A taste of the Mediterranean with feta, olives, spinach, and fresh tomatoes.",
                9
        ));

        pizzas.add(new Pizza(
                "HAWAIIAN PIZZA",
                R.mipmap.p3,
                "- 1/2 cup ham\n- 1/2 cup pineapple\n- 1 cup mozzarella cheese\n- 1/2 cup pizza sauce",
                "40 min",
                5.8,
                "A sweet and savory combination of ham and pineapple on a cheesy crust.",
                8
        ));

        pizzas.add(new Pizza(
                "WHITE GARLIC PIZZA",
                R.mipmap.p4,
                "- 1/2 cup ricotta cheese\n- 1/2 cup Parmesan cheese\n- 1/4 cup garlic butter\n- 1/2 cup mozzarella cheese",
                "30 min",
                5.2,
                "A rich and creamy pizza with a garlic butter base and multiple cheeses.",
                7
        ));



        // Set up adapter
        PizzaAdapter adapter = new PizzaAdapter(this, pizzas);
        listView.setAdapter(adapter);
    }
}