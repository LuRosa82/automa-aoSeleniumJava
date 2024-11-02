import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Register.html");

        // Preenche campos de texto
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Luciana");
        //Thread.sleep(1000); // Pausa de 1 segundo
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Rosa");
        //Thread.sleep(1000);
        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Tereza Haguihara 876");
        //Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("luciana@example.com");
        //Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890");
        //Thread.sleep(1000);

        // Seleciona gênero
        driver.findElement(By.xpath("//input[@value='FeMale']")).click();
        //Thread.sleep(1000);

        // Seleciona hobbies
        driver.findElement(By.id("checkbox1")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("checkbox2")).click();
        //Thread.sleep(1000);

        // Seleciona idioma
        driver.findElement(By.id("msdd")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Portuguese']")).click();
        //Thread.sleep(1000);

        // Seleciona habilidades
        Select skills = new Select(driver.findElement(By.id("Skills")));
        skills.selectByVisibleText("Java");
        //Thread.sleep(1000);

        // Seleciona país
        driver.findElement(By.xpath("//span[@role='combobox']")).click();
        Thread.sleep(1000);
        WebElement countrySearch = driver.findElement(By.xpath("//input[@role='textbox']"));
        countrySearch.sendKeys("Australia");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[contains(text(),'Australia')]")).click();
        //Thread.sleep(1000);

        // Seleciona ano, mês e dia de nascimento
        Select year = new Select(driver.findElement(By.id("yearbox")));
        year.selectByVisibleText("2015");
        Thread.sleep(1000);

        Select month = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
        month.selectByVisibleText("November");
        Thread.sleep(1000);

        Select day = new Select(driver.findElement(By.id("daybox")));
        day.selectByVisibleText("1");
        Thread.sleep(1000);

        // Preenche senhas
        driver.findElement(By.id("firstpassword")).sendKeys("Password123");
        Thread.sleep(1000);
        driver.findElement(By.id("secondpassword")).sendKeys("Password123");
        Thread.sleep(1000);
        WebElement upload = driver.findElement(By.id("imagesrc"));
        upload.sendKeys("C:\\Imagem\\logo.jpg");



        // Rola a página e clica no botão de Submeter
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);

        driver.findElement(By.id("submitbtn")).click();
        Thread.sleep(1000);

        // Fecha o navegador
        driver.quit();
    }
}

