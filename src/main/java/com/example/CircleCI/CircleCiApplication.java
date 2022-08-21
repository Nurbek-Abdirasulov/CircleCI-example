package com.example.CircleCI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CircleCiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircleCiApplication.class, args);
	}

	@GetMapping
	public String hello(){
		return """
				 <!DOCTYPE html>
				                <html lang="en">
				                <head>
				                    <meta charset="UTF-8">
				                    <meta http-equiv="X-UA-Compatible" content="IE=edge">
				                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
				                    <title>Document</title>
				                </head>
				                <body>
				                <p>Hello</p>
				                    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT-XeHzex9qlQR_V8_1kNeNFl6TFyVEynoRuA&usqp=CAU">
				                </body>
				                </html>
				""";
	}

}
