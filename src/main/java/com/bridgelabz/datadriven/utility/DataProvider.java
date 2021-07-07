package com.bridgelabz.datadriven.utility;

import java.io.IOException;

public class DataProvider {

    @org.testng.annotations.DataProvider(name = "LoginDetails")
    public static Object[][] getDataFromProvider() throws  IOException {
        ExcelData readExcel = new ExcelData ();
        return readExcel.readData("F:\\ExcelData\\LoginData.xlsx", "LoginData");
    }
}
