package src.in.valtech.cl.front.pages;

public class A {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*  System.setProperty("webdriver.chrome.driver",
		  System.getProperty("user.dir")+"\\resources\\drivers\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.get("https://homologation.wms.eu.clb.livexp.eu/");
		  driver.findElement(By.xpath("//input[@id='login']")).sendKeys("t.aut_11");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Louboutin2022!"); 
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[contains(text(),'Packing')]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='scan-input']")).sendKeys("153");
		  Thread.sleep(2000); 
		  driver.findElement(By.xpath("//button[@class='btn btn-info scan-search-icon']")).click();
		  Thread.sleep(10000);
		  int productscount=Integer.valueOf(driver.findElements(By.xpath("//div[contains(@class,'weborderitem card text-center')]")).size()); 
		  System.out.println(productscount);
		  for(int k=0;k<productscount;k++) 
		  { 
			  int shippingweight=Integer.valueOf(driver.findElements(By.xpath("(//div[contains(@class,'weborderitem card text-center')]//span[@class='totalToScan'])")).get(k).getText()); 
			  System.out.println(shippingweight);
			  for(int i=1;i<=shippingweight;i++) 
			  { 
				  String SkuId=driver.findElements(By.xpath("//div[contains(@class,'weborderitem card text-center')]//div[contains(text(),'Sku:')]")).get(k).getText().replaceAll("[^0-9.]", "");
				  Thread.sleep(2000);
		          //GUIFunctions.typeTxtboxValue(driver,WMS_SKUID_serachfield, SkuId); 
		          By WMS_SKUID_serachfield= By.xpath("//input[@id='scan-input']");
		          driver.findElement(WMS_SKUID_serachfield).sendKeys(SkuId);
		          Thread.sleep(2000); 
		      } 
	     }  */
		String a=" INT2_ 11000 000027 ";
		String strPlainTxtAct= a.replaceAll("\\W", ""); 
		//String b=a.OrderConfirmationId.replaceAll("[^0-9.]", "");
		System.out.println(strPlainTxtAct);
	}

}
