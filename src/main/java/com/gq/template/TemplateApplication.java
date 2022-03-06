package <com.gq.template>;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("<com.gq.template>.repository.mapper")
public class <Template>Application {

	public static void main(String[] args) {
		SpringApplication.run(<Template>Application.class, args);
	}

}
