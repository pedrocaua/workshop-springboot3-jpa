package com.pedrocaua.course.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT("Aguadando Pagamento"),
	PAID("Pago"),
	SHIPPED("Enviado"),
	DELIVERED("Entregue"),
	CANCELED("Cancelado");
	
	private String code;
	
	private OrderStatus(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
	
	public static OrderStatus valueOfCode(String code) {
	    for (OrderStatus value : OrderStatus.values()) {
	        if (value.getCode().equals(code)) {  // Use .equals() para comparar Strings
	            return value;
	        }
	    }
	    throw new IllegalArgumentException("Invalid OrderStatus code");
	}
	
	
}
