package dio.padroesdeprojeto.designpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto desenvolvido em atividade do bootcamp Dio TQI
 * Desafio de projeto Design Patterns
 * Módulos adicionados via Spring Initializr:
 * - Spring Data JPA
 * - Spring Web
 * - H2
 * - OpenFeign
 *
 * Projeto realizado a partir do projeto referência disponibibilizado no curso;
 *
 * @author GustavoBrito
 *
*/

@EnableFeignClients
@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
	}

}
