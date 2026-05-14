package com.riskbridgeai.transaction_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RiskBridgeTransactionApplication {

	public static void main(String[] args) {

		SpringApplication.run(RiskBridgeTransactionApplication.class, args);
	}

}
