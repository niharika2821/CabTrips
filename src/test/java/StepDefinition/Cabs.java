package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cabs {
	WebDriver driver;
	@Given("I am on home page")
	public void i_am_on_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement frame = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='webklipper-publisher-widget-container-notification-frame']")));
		driver.switchTo().frame(frame); 
		WebElement clsBtn =driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']"));
		clsBtn.click();
		String parentWindowHandle=driver.getWindowHandle();
		driver.switchTo().window(parentWindowHandle);
	}

	@When("I click on Cabs")
	public void i_click_on_cabs() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chCabs']")).click();
	}

	@When("I am on Outstation One-Way")
	public void i_am_on_outstation_one_way() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("I select From as {string}")
	public void i_select_from_as(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement city = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fromCity")));
		city.click();
		WebElement from = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='From']")));
		Thread.sleep(5000);
		from.sendKeys("Hyderabad");
		from.click();
		Actions actions = new Actions(driver);
		actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER).build().perform();
	}

	@When("I select To as {string}")
	public void i_select_to_as(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement city1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='To']")));
		city1.click();
		WebElement to = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@title='To']")));
		Thread.sleep(4000);
		to.sendKeys("Mumbai");
		to.click();
		Actions actions = new Actions(driver);
		actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER).build().perform();

	}

	@When("I select Departure date as {string}")
	public void i_select_departure_date_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement dateField=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Departure']")));
		dateField.click();
		WebElement date = driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--today']/following-sibling::div[1]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", date);
	}

	@When("I click on search")
	public void i_click_on_search() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement search=driver.findElement(By.xpath("//a[contains(@class,'primaryBtn font24')]"));
		search.click();
	}

	@When("I select filter Cab Type as {string}")
	public void i_select_filter_cab_type_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement check=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='SEDAN']")));
		check.click();
	}

	@Then("I able to view the car details based on preferences")
	public void i_able_to_view_the_car_details_based_on_preferences() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("I am on Cabs")
	public void i_am_on_cabs() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver=new ChromeDriver();
		driver.navigate().to("https://www.makemytrip.com/cabs/");
		driver.manage().window().maximize();
	}

	@When("I click on round trip")
	public void i_click_on_round_trip() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//li[@data-cy='outstationRoundTrip']//span[1]")).click();
	}

	@When("I select From city as {string}")
	public void i_select_from_city_as(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement city2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fromCity")));
		city2.click();
		WebElement from2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='From']")));
		Thread.sleep(5000);
		from2.sendKeys("Goa");
		from2.click();
		Actions actions = new Actions(driver);
		actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER).build().perform();
	}

	@When("I select To city as {string}")
	public void i_select_to_city_as(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement city3 =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='To']")));
		city3.click();
		WebElement to3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@title='To']")));
		Thread.sleep(4000);
		to3.sendKeys("Bengaluru");
		to3.click();
		Actions actions = new Actions(driver);
		actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER).build().perform();
	}

	@When("I select Departure as {string}")
	public void i_select_departure_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement dateF=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Departure']")));
		dateF.click();
		WebElement date1 = driver.findElement(By.xpath("//div[contains(@class,'DayPicker-Day DayPicker-Day--start')]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", date1);
	}

	@When("I select return date as {string}")
	public void i_select_return_date_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement rdate=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Return']")));
		rdate.click();
		WebElement date2 = driver.findElement(By.xpath("//div[contains(@class,'DayPicker-Day DayPicker-Day--end')]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", date2);
		
	}

	@When("I click on search button")
	public void i_click_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement search1=driver.findElement(By.xpath("//a[contains(@class,'primaryBtn font24')]"));
		search1.click();
	}

	@When("I select type as {string}")
	public void i_select_type_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement check1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='SEDAN']")));
		check1.click();
	}

	@Then("I able to view the car details for return date")
	public void i_able_to_view_the_car_details_for_return_date() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("I click on Airport transfers")
	public void i_click_on_airport_transfers() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver=new ChromeDriver();
		driver.navigate().to("https://www.makemytrip.com/cabs/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@data-cy='airportTransfer']//span[1]")).click();
	}

	@When("I select pickup type as {string}")
	public void i_select_pickup_type_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement air=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Pickup Type']")));
		air.click();
		WebElement fromair=driver.findElement(By.xpath("//li[text()='From the Airport']"));
		fromair.click();
		WebElement place=driver.findElement(By.id("fromCity"));
		place.click();
	}

	@When("I select Airport as {string}")
	public void i_select_airport_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement loc=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='AIRPORT']")));
		loc.sendKeys("Rajiv Gandhi");
		loc.click();
		Actions actions = new Actions(driver);
		actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER).build().perform();
	}

	@When("I select Drop Location as {string}")
	public void i_select_drop_location_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement drop1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='To']")));
		drop1.click();
		WebElement droploc=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='To']")));
		droploc.sendKeys("Jubilee Hills");
		droploc.click();
		Actions actions = new Actions(driver);
		actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER).build().perform();
	}

	@When("I select date as {string}")
	public void i_select_date_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement dep=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Departure']")));
		dep.click();
		WebElement dat = driver.findElement(By.xpath(("//div[@aria-label='Mon Apr 01 2024']")));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", dat);
	}

	@When("I click on search for details")
	public void i_click_on_search_for_details() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement search2=driver.findElement(By.xpath("//p[@data-cy='airportTransferSearch']//a[1]"));
		search2.click();
	}

	@Then("I able to view the car details for specific date")
	public void i_able_to_view_the_car_details_for_specific_date() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("I click on Hourly Rentals")
	public void i_click_on_hourly_rentals() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver=new ChromeDriver();
		driver.navigate().to("https://www.makemytrip.com/cabs/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@data-cy='CabsLandingPage_393']")).click();
	}

	@When("I select pickup location as {string}")
	public void i_select_pickup_location_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement place1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='fromCity']")));
		place1.click();
		WebElement select=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='From']")));
		select.sendKeys("Chennai");
		select.click();
		Actions actions = new Actions(driver);
		actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER).build().perform();
	}

	@When("I select Pickup-Date as {string}")
	public void i_select_pickup_date_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement pickdate=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Pickup Date']")));
		pickdate.click();
		WebElement pdate=driver.findElement(By.xpath("//div[@aria-label='Fri Apr 05 2024']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", pdate);
	}

	@When("I select package as {string}")
	public void i_select_package_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement pack=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Select Package']")));
		pack.click();
		WebElement packages=driver.findElement(By.xpath("//li[text()='2 hrs 20 kms']"));
		packages.click();
	}

	@When("I click on search for cabs")
	public void i_click_on_search_for_cabs() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement search4=driver.findElement(By.xpath("//p[@data-cy='hourlyRentalSearch']//a[1]"));
		search4.click();
	}

	@Then("I able to view the car details for location")
	public void i_able_to_view_the_car_details_for_location() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("I select Cab type  as {string}")
	public void i_select_cab_type_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement cab=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='HATCHBACK']")));
		cab.click();
	}

	@When("I select Fuel type as {string}")
	public void i_select_fuel_type_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement fuel=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='DIESEL']")));
		fuel.click();
	}

	@Then("I able to view the car details for package")
	public void i_able_to_view_the_car_details_for_package() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}




}
