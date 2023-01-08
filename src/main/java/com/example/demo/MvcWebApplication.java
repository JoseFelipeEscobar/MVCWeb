package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvcWebApplication implements CommandLineRunner{
private static Logger LOG = LoggerFactory.getLogger(MvcWebApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(MvcWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	LOG.info("mensaje a consola");

		
	}

}
