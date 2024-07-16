package DIO.padroes_de_projeto_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PadroesDeProjetoJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesDeProjetoJavaApplication.class, args);
	}

}
