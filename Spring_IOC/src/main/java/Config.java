import org.springframework.context.annotation.Bean;

public class Config {
	@Bean
	public Student getStudent() {
		return new Student();
	}

}
