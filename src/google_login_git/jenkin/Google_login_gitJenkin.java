/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package google_login_git.jenkin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author rizwan
 */
public class Google_login_gitJenkin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.co.in");
        driver.manage().window().maximize();
        
        //declaring webEliment hor accessing globelly 
        
        WebElement search_box,search_button,clk_weki;
        
        search_box = driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
        search_box.sendKeys("wikipedia");
        
        search_button = driver.findElement(By.name("btnK"));
        search_button.click();
        
        clk_weki = driver.findElement(By.partialLinkText("Wikipedia"));
        clk_weki.click();
        
        String expected_title = "Wikipedia";
        System.out.println(driver.getTitle());
        
       if(expected_title.equals(driver.getTitle())){
           
           System.out.println("Your Test case is passed");
       }else{
           System.out.println("Sorry title not matched...");
       }
        
        
            
        
    }
    
}
