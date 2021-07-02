package com.bridgelabz.datadriven.utility;

import java.io.IOException;

public class DataProvider {

    @org.testng.annotations.DataProvider(name = "LoginDetails")
    public static Object[][] getDataFromProvider() throws  IOException {
        ExcelUtil readExcel = new ExcelUtil();

        return readExcel.readData("F:\\ExcelData\\TestData.xlsx", "LoginData");
    }
}
