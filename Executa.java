package pages;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import Driver.Driver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "./src/test/resources/features",
			dryRun = false,
			monochrome = true,
			glue = "steps",
			tags = "@Executa",
			//tags = "@nExecuta",
			snippets = SnippetType.CAMELCASE
			
	)


	public class Executa extends Driver {
		
		 public static void abrirNavegador(boolean headless) {
			WebDriverManager.chromedriver().driverVersion("110.0.5481").setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			if(headless) {
				chromeOptions.addArguments("--headless");
			}
			chromeOptions.addArguments("--start-maximized");
			chromeOptions.addArguments("--remote-allow-origins=*"); 
			driver = new ChromeDriver(chromeOptions);
			driver.get("https://www.correios.com.br/");
			
		}
		
		
		public static void fecharNavegador() {
			driver.quit();
		}
	
	
}
