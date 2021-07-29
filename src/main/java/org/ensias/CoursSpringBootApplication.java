package org.ensias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CoursSpringBootApplication {

	public static void main(String[] args) {
            //System.out.println("org.ensias.CoursSpringBootApplication.main()");
		SpringApplication.run(CoursSpringBootApplication.class, args);
	}

}
