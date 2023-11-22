package pro.sky.basket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.basket.service.BasketService;

import java.lang.Integer;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/order")
public class BasketController {
    BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public void addInBasket(@RequestParam("ids") ArrayList<Integer> list) {
        basketService.addInBasket((ArrayList<Integer>) list);
    }

    @GetMapping("/get")
    public List<Integer> getBasket() {
        return basketService.getBasket();
    }
}

