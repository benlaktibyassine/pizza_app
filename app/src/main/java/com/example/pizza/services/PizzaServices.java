package com.example.pizza.services;

import com.example.pizza.dao.IDAO;
import com.example.pizza.beans.Pizza;
import java.util.ArrayList;
import java.util.List;

public class PizzaServices implements IDAO<Pizza> {

    private List<Pizza> pizzas;

    public PizzaServices() {
        this.pizzas = new ArrayList<>();
    }

    @Override
    public void create(Pizza o) {
        Pizza pizza =  o;
        pizzas.add(pizza);
    }

    @Override
    public void delete(Pizza o) {
        Pizza pizza =  o;
        pizzas.remove(pizza);
    }


    public void update(Pizza o) {
        for (Pizza pizza : pizzas) {
            if (pizza.getId() == o.getId()) {
                pizza = o;
            }
        }
    }

    @Override
    public Pizza findById(int id) {
        for (Pizza pizza : pizzas) {
            if (pizza.getId() == id) {
                return pizza;
            }
        }
        return null;
    }

    @Override
    public List<Pizza> findAll() {
        return pizzas;
    }
}