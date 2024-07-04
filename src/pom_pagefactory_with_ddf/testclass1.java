package pom_pagefactory_with_ddf;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class testclass1 {

    public static void main(String[] args) throws IOException {

        FileInputStream file=new FileInputStream("D:\\Software Testing\\New Microsoft Excel Worksheet.xlsx");
        Sheet sh = WorkbookFactory.create(file).getSheet("sheet3");




        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
        regularclass1 rc=new regularclass1(driver);

        String un = sh.getRow(0).getCell(0).getStringCellValue();
        rc.inputinstagramusername(un);

        String pw = sh.getRow(0).getCell(1).getStringCellValue();
        rc.inputinstagrampassword(pw);

        rc.clickinstgramloginbtn();



        regularclass2 rc2=new regularclass2(driver);

        rc2.removepopup();
        rc2.setVerifylogo();

        String name = sh.getRow(0).getCell(2).getStringCellValue();
        rc2.clickonmenubtn(name);





    }
}
