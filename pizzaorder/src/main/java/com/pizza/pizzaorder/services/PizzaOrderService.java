package com.pizza.pizzaorder.services;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.pizza.pizzaorder.database.PizzaOrderDatabase;
import com.pizza.pizzaorder.dtos.PizzaOrderDto;

@Service
public class PizzaOrderService {

	public PizzaOrderDto getPizzaStatus(String phone, String order) {
		if(!StringUtils.isEmpty(order)) {
			return PizzaOrderDatabase.pizzaOrderByOrderNumber.get(order);
		} else if(!StringUtils.isEmpty(phone)) {
			System.out.println(phone);
			return PizzaOrderDatabase.pizzaOrderByPhone.get(phone);
		} else {
			return null;
		}
	}
}
