package com.shifthunter.ppmtool;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class PPMToolTasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(PPMToolTasksApplication.class, args);
	}
	
	
	@Bean
	public TollProcessingTask tollProcessingTask() {
		return new TollProcessingTask();
	}
	
	
	// Defined Sub Class
	public class TollProcessingTask implements CommandLineRunner {
		
		@Override
		public void run(String... strings) throws Exception {
			
			//parameters stationid, lecense plate, timestamp
			if (null != strings) {
				System.out.println("parameters length" + strings.length);
			}
		}
	}

}
