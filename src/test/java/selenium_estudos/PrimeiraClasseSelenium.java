package selenium_estudos;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiraClasseSelenium {
	@Test
	public void testeLogin() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com.br/");

	}

}
