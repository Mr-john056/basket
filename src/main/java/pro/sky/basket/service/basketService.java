package pro.sky.basket.service;

import org.springframework.stereotype.Service;
import pro.sky.basket.controller.basketController;
import pro.sky.basket.exception.badRequestException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service

public abstract class basketService{
    public abstract String add(String ids) throws badRequestException;

    public abstract HashMap<Integer, Integer> get();

    public abstract basketController add(int id, String nameOfProduct, int price);
}
