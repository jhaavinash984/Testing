dpackage com.test.jenkin;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootJenkinApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("Auto Start Job Triggered");
		String env = System.getProperty("Browser");
		System.out.println("Browser is : "+env);
	}

}
