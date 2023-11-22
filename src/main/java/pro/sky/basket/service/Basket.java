package pro.sky.basket.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;

@SessionScope
@Component
public class Basket {
private ArrayList<Integer>basket;
public Basket(ArrayList<Integer>basket){
    this.basket = basket;
}
public void addInBasket(ArrayList<Integer> bask){
    basket.addAll(bask);
}
public  ArrayList<Integer> getBasket(){
    return basket;
}
public void setBasket(ArrayList<Integer> basket){
    this.basket = basket;
}
}
