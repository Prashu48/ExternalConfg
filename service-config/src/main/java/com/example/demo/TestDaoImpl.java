package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Profile("test")
@Repository
public class TestDaoImpl {

	static {
		System.out.println("Test-Dao Initialised");
	}
}
