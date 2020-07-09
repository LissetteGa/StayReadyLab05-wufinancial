package com.codedifferently.stayready;

public class Main {

    public double dollarToEuro(double dollar) {
        double euro = dollar *  0.89;
        return euro;
    }

    public String euroToDollar(double euro) {
        double dollar = euro * 1.13;
        return String.format("%.2f", dollar);
    }

    public double euroToPound(double euro){
        double pound = euro * 0.90;
        return pound;
    }

    public double poundToRupee(double pound) {
        double rupee = pound * 94.78;
        return rupee;
    }

    public double rupeeToCanadian(double rupee) {
        double canadian = rupee * .018;
        return canadian;
    }

    public double canadianToSingapore(double canadian) {
        double singapore = canadian * 1.03;
        return singapore;
    }

    public double singaporeToFranc(double singapore) {
        double franc = singapore * 0.67;
        return franc;
    }

    public double francToRinggit(double franc) {
        double ringitt = franc * 4.54;
        return ringitt;
    }

    public double ringittToYen(double ringitt) {
        double yen = ringitt * 25.11;
        return yen;
    }

    public double yenToChinese(double yen) {
        double chinese = yen * 0.0656;
        return chinese;
     }
}
