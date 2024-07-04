package pom_pagefactory_with_ddf;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

public class testclass {



    public static void main(String[] args) throws IOException {


        FileInputStream file=new FileInputStream("D:\\Software Testing\\New Microsoft Excel Worksheet.xlsx");
        Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));


        loginpage log=new loginpage(driver);

        String username = sh.getRow(0).getCell(0).getStringCellValue();
        log.inputloginpageusername(username);

        String password = sh.getRow(0).getCell(1).getStringCellValue();
        log.inputloginpagepassword(password);

        log.cliclloginpageloginbtn();

        // 2nd pom page
        homepage home=new homepage(driver);

        String explogo = sh.getRow(8).getCell(0).getStringCellValue();
        home.verifylogotext(explogo);

        home.clickhomepagemenu();



        //3rd pom page
      logoutpage l=new logoutpage(driver);
      l.setLogoutbtn();







    }
}
