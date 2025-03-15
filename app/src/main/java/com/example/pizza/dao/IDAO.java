package com.example.pizza.dao;

import java.util.List;

public interface IDAO<P> {
    public void create(P p);
    public void delete(P p);
    public void  update(P p);
    public P findById(int id);
    public List<P> findAll();

}
