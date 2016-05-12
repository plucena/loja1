package net.mybluemix.seleniumTest;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NovoFornecedor {
	
	public static String url = "http://loja.mybluemix.net/app/#/fornecedores/novo";
	
	
    public static void main(String[] args) {
    
    	 WebDriver driver = new ChromeDriver();
         driver.get(url);
         WebElement element = driver.findElement(By.name("input-cnpj"));
         Random rand = new Random();
         int  cnpj = rand.nextInt(50000000) + 1;
         element.sendKeys("" + cnpj);
         element = driver.findElement(By.name("input-nome"));
         element.sendKeys("Selenium tecidos");
         element = driver.findElement(By.name("input-email"));
         element.sendKeys("selenium@java.net");
         element = driver.findElement(By.name("input-telefone"));
         element.sendKeys("55 19 99998881");
         
         driver.quit();

	}
}
