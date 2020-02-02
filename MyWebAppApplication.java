package com.faithful.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyWebAppApplication.class, args);
		Repo r = new Repo("MyWebApp/com.faithful.demo/label.zpl");
		Service s = new Service(r);
		s.editFile();
		
	}

}
