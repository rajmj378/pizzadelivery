package com.pizza.pizzaorder.dtos;

public class PizzaOrderDto {

	private String orderNumber;
	private String phone;
	private OrderStatus status;

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "PizzaOrderDto [orderNumber=" + orderNumber + ", phone=" + phone + ", status=" + status + "]";
	}

}
