package com.educandoweb.course.entities.enums;

public enum OrderStatus {
	
	Aguardando_pgto(1),
	Pago(2),
	Enviado(3),
	Entregue(4),
	Cancelado(5);
	
	private int code;
	private OrderStatus(int code) {
		this.code=code;
	}
public int getCode() {
	return code;
}
public static OrderStatus valueOf(int code) {
	for(OrderStatus value : OrderStatus.values()) {
		if(value.getCode()==code) {
			return value;
		}
	}
	throw new IllegalArgumentException("Invalid OrderStatus code");
}
}
