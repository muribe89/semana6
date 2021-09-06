package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestNgLogin_correcto {
	private WebDriver driver;
	
	  @BeforeClass
		  public void abrir_chrome() {
			    System.out.println("En este paso abre el navegador google chrome");
				System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://localhost:8070/login/index.jsp");
		  }
	  @Test
	  public void login() {
			System.out.println("Este paso ingresa el nombre de usuario y contrase�a correctos en la pagina de login");
			driver.findElement(By.id("username")).sendKeys("roly");
			driver.findElement(By.id("password")).sendKeys("1234");
	  }
	  

	  @AfterClass
	  public void salir() {
		  System.out.println("En este paso inicia sesion con los datos ingresados");
			driver.findElement(By.id("loginBtn")).click();
			System.out.println("En este paso se procede a salir del perfil");
			driver.findElement(By.id("salir")).click();
			driver.quit();
	  }
}
