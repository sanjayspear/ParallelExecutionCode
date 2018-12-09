public class paralleldemo2 {

	@Test
	public void google2() throws Exception {
		BrowserFactory browserFactory = BrowserFactory.getInstance();
		browserFactory.setDriver("chrome");
		browserFactory.getDriver().get("http://www.google.com");
		browserFactory.getDriver().findElement(By.name("q"))
				.sendKeys("Contract");
		Thread.sleep(3000);
		Actions act = new Actions(browserFactory.getDriver());
		// browserFactory.getDriver().findElement(By.name("btnK")).click();
		act.sendKeys(browserFactory.getDriver().findElement(By.name("q")),
				Keys.TAB).build().perform();
		Thread.sleep(3000);
		browserFactory.getDriver().findElements(By.name("btnK")).get(1).click();
		// act.keyUp(Keys.ENTER);
		Thread.sleep(8000);
		browserFactory.getDriver().quit();
	}

}
