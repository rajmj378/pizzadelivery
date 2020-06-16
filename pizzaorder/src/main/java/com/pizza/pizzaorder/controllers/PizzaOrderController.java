package com.pizza.pizzaorder.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.pizza.pizzaorder.dtos.PizzaOrderDto;
import com.pizza.pizzaorder.services.PizzaOrderService;

@RestController
@RequestMapping("/order")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PizzaOrderController {
	
	@Autowired
	private PizzaOrderService pizzaOrderService;

	@GetMapping("")
	public PizzaOrderDto getOrderStatusByPhone(@RequestParam(required = false) String phone, 
			@RequestParam(required = false) String order) throws Exception {
		System.out.println("api called for phone : " + phone);
		if(StringUtils.isEmpty(phone) && StringUtils.isEmpty(order)) {
			throw new ResponseStatusException(
			          HttpStatus.BAD_REQUEST, "Either Phone or Order Number must be provided");
		}
		
		PizzaOrderDto res = pizzaOrderService.getPizzaStatus(phone, order);
		if(res == null) {
			throw new ResponseStatusException(
			          HttpStatus.NOT_FOUND, "Order was not found");
		}
		System.out.println(res.toString());
		return res;
	}
}
