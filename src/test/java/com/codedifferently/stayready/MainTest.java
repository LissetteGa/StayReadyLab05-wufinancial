package com.codedifferently.stayready;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void dollarToEuroTest() {
        //Given
        Main dollar = new Main();
        double d = 20;
        double expected = 17.80;

        //When
        double actual = dollar.dollarToEuro(d);

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void euroToDollarTest() {
        //Given
        Main euro = new Main();
        double e = 20;
        String expected = "22.60";

        //When
        String actual = euro.euroToDollar(e);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void euroToPoundTest() {
        //Given
        Main pound = new Main();
        double p = 20;
        double expected = 18.00;

        //When
        double actual = pound.euroToPound(p);

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void poundToRupeeTest() {
        //Given
        Main rupee = new Main();
        double r = 20;
        double expected = 1895.60;

        //When
        double actual = rupee.poundToRupee(r);

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void rupeeToCanadianTest() {
        //Given
        Main canadian = new Main();
        double c = 20;
        double expected = .36;

        //When
        double actual = canadian.rupeeToCanadian(c);

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void canadianToSingaporeTest() {
        //Given
        Main singapore = new Main();
        double s = 20;
        double expected = 20.60;

        //When
        double actual = singapore.canadianToSingapore(s);

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void singaporeToFrancTest() {
        //Given
        Main franc = new Main();
        double f = 20;
        double expected = 13.40;

        //When
        double actual = franc.singaporeToFranc(f);

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void francToRingittTest() {
        //Given
        Main ringitt = new Main();
        double r = 20;
        double expected = 90.80;

        //When
        double actual = ringitt.francToRinggit(r);

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void ringittToYenTest() {
        //Given
        Main yen = new Main();
        double y = 20;
        double expected = 502.2;

        //When
        double actual = yen.ringittToYen(y);

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void yenToChineseTest() {
        //Given
        Main chinese = new Main();
        double c = 20;
        double expected = 1.312;

        //When
        double actual = chinese.yenToChinese(c);

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }
}
