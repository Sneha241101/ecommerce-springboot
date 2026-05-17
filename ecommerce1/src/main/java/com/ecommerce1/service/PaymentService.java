package com.ecommerce1.service;

import org.json.JSONObject;

public interface PaymentService {
	  JSONObject createOrder(
	            Integer amount
	    ) throws Exception;

}
