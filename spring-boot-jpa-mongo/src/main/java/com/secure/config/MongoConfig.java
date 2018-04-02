package com.secure.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.secure.model.User;
import com.secure.repository.UserRepository;

@EnableMongoRepositories(basePackages = "com")
@Configuration
public class MongoConfig {

	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository) {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				userRepository.save(new User(1, "RAHUL", 8956565L, "M"));
				userRepository.save(new User(2, "VERTY", 8956565L, "M"));
				userRepository.save(new User(3, "VIDLY", 8956565L, "F"));
			}
		};
	}
}
