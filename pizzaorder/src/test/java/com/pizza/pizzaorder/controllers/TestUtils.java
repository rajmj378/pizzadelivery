package com.pizza.pizzaorder.controllers;

import com.pizza.pizzaorder.dtos.OrderStatus;
import com.pizza.pizzaorder.dtos.PizzaOrderDto;

public class TestUtils {

	public static PizzaOrderDto dummyPizzaOrder() {

		PizzaOrderDto dto = new PizzaOrderDto();
		dto.setOrderNumber("1234570");
		dto.setPhone("1239853710");
		dto.setStatus(OrderStatus.DELIVERED);
		return dto;
	}

	public static String dummyPizzaOrderResponse() {

		return "{\n" + "\"orderNumber\": \"1234570\",\n" + "\"phone\": \"1239853710\",\n"
				+ "\"status\": \"DELIVERED\"\n" + "}";
	}

}
