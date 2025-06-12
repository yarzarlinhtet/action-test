package com.yarzarlinhtet.action_test;

import org.springframework.boot.SpringApplication;

public class TestActionTestApplication {

	public static void main(String[] args) {
		SpringApplication.from(ActionTestApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
