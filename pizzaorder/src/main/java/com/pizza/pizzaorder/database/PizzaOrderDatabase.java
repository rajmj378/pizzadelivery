package com.pizza.pizzaorder.database;

import java.util.HashMap;
import java.util.Map;

import com.pizza.pizzaorder.dtos.OrderStatus;
import com.pizza.pizzaorder.dtos.PizzaOrderDto;

public class PizzaOrderDatabase {
	
	public static Map<String, PizzaOrderDto> pizzaOrderByPhone = new HashMap<String, PizzaOrderDto>();
	
	public static Map<String, PizzaOrderDto> pizzaOrderByOrderNumber = new HashMap<String, PizzaOrderDto>();
	
	static {
		PizzaOrderDto dto1 = new PizzaOrderDto();
		dto1.setOrderNumber("1234567");
		dto1.setPhone("3023456728");
		dto1.setStatus(OrderStatus.BAKING);
		
		PizzaOrderDto dto2 = new PizzaOrderDto();
		dto2.setOrderNumber("1234568");
		dto2.setPhone("3021236728");
		dto2.setStatus(OrderStatus.MAKING);
		
		PizzaOrderDto dto3 = new PizzaOrderDto();
		dto3.setOrderNumber("1234569");
		dto3.setPhone("4021232428");
		dto3.setStatus(OrderStatus.ON_ITS_WAY);
		
		PizzaOrderDto dto4 = new PizzaOrderDto();
		dto4.setOrderNumber("1234570");
		dto4.setPhone("1239853710");
		dto4.setStatus(OrderStatus.DELIVERED);
		
		PizzaOrderDto dto5 = new PizzaOrderDto();
		dto5.setOrderNumber("1234571");
		dto5.setPhone("1242603710");
		dto5.setStatus(OrderStatus.BOXING);
		
		pizzaOrderByOrderNumber.put("1234567", dto1);
		pizzaOrderByOrderNumber.put("1234568", dto2);
		pizzaOrderByOrderNumber.put("1234569", dto3);
		pizzaOrderByOrderNumber.put("1234570", dto4);
		pizzaOrderByOrderNumber.put("1234571", dto5);
		
		pizzaOrderByPhone.put("3023456728", dto1);
		pizzaOrderByPhone.put("3021236728", dto2);
		pizzaOrderByPhone.put("4021232428", dto3);
		pizzaOrderByPhone.put("1239853710", dto4);
		pizzaOrderByPhone.put("1242603710", dto5);
	}

}
