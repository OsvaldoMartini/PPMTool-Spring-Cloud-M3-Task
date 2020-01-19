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
	    for(String arg:args) {
            System.out.println(arg);
        }
	}
	
	
	@Bean
	public TollProcessingTask tollProcessingTask() {
		return new TollProcessingTask();
	}
	
	
	// Defined Sub Class
	public class TollProcessingTask implements CommandLineRunner {
		
		@Override
		public void run(String...strings) throws Exception {
			
			//parameters: stationid, license plate, timestamp
			if(null != strings){
				System.out.println("parameter length: " + strings.length);
				
				if(strings.length > 0){
					String pathSource = strings[0];
					String pathSchemaDestiny = strings[1];
					String pathDataDestiny = strings[2];
					String pathSpecPrefix = strings[3];
					String operationName = strings[4];
					
					System.out.println("pathSource: " + pathSource +System.lineSeparator() + "pathSchemaDestiny: " + pathSchemaDestiny +System.lineSeparator() + "pathDataDestiny: " + pathDataDestiny);
					System.out.println("pathSpecPrefix: " + pathSpecPrefix+System.lineSeparator() +"operationName: " + operationName );
					
				}
			}
			
			System.out.println("Task completed.");
			
		}
	}

}
