package br.com.alura.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class ForumApplication {

	public static void main(String[] args) {

		SpringApplication.run(ForumApplication.class, args);
		LocalDateTime data = LocalDateTime.now();
		System.out.println("Sistema iniciado com êxito ás "+data.getHour()+":"+data.getMinute()+":"+data.getMinute());


	}

}
