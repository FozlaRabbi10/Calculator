package com.turingsoulapps.lifesavingcalculator;

public class CalculatorModel {

    private static String lastNumber = "";
    private static String currentNumber = "";

    public static void SetLastNumber(String _lastNumber)
    {
        lastNumber = lastNumber + _lastNumber;
    }

    public static String GetLastNumber()
    {
        return lastNumber;
    }

    public static void SetCurrentNumber(String _currentNumber)
    {
        currentNumber = currentNumber + _currentNumber;
    }

    public static String GetCurrentNumber()
    {
        return currentNumber;
    }

    public static String Add()
    {
        double a = Double.parseDouble(lastNumber);
        double b = Double.parseDouble(currentNumber);

        double res = a+b;

        String result = String.format("%.1f",res);

        return result;
    }

    public static String Subtract()
    {
        double a = Double.parseDouble(lastNumber);
        double b = Double.parseDouble(currentNumber);

        double res = a-b;

        String result = String.format("%.1f",res);

        return result;
    }

    public static String Multiply()
    {
        double a = Double.parseDouble(lastNumber);
        double b = Double.parseDouble(currentNumber);

        double res = a*b;

        String result = String.format("%.1f",res);

        return result;
    }

    public static String Division()
    {
        double a = Double.parseDouble(lastNumber);
        double b = Double.parseDouble(currentNumber);

        if(b == 0.0) return "MATH ERROR";

        double res = a/b;

        String result = String.format("%.1f",res);

        return result;
    }

    public static String Power()
    {
        double a = Double.parseDouble(lastNumber);
        double b = Double.parseDouble(currentNumber);

        double res = Math.pow(a,b);

        String result = String.format("%.1f",res);

        return result;
    }

    public static String Mod()
    {
        double a = Double.parseDouble(lastNumber);
        double b = Double.parseDouble(currentNumber);

        double res = a%b;

        String result = String.format("%.1f",res);

        return result;
    }

    public static String Sqrt()
    {
        double b = Double.parseDouble(currentNumber);

        if(b < 0) return "MATH ERROR";

        double res = Math.sqrt(b);

        String result = String.format("%.1f",res);

        return result;
    }

    public static void Clear()
    {
        lastNumber = "";
        currentNumber = "";
    }

    public static void DeleteLastNumber()
    {
        StringBuilder build = new StringBuilder(lastNumber);
        build.deleteCharAt(lastNumber.length()-1);
        lastNumber = "";
        lastNumber += build;
    }

    public static void DeleteCurrentNumber()
    {
        StringBuilder build = new StringBuilder(currentNumber);
        build.deleteCharAt(currentNumber.length()-1);
        currentNumber = "";
        currentNumber += build;
    }

}
