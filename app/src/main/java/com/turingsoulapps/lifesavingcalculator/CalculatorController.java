package com.turingsoulapps.lifesavingcalculator;

public class CalculatorController {
    private static String operator = "";

    public static String setOperation(String view)
    {
        if(isOperator(view) == true)
        {
            operator = view;
            return CalculatorModel.GetLastNumber()+operator+CalculatorModel.GetCurrentNumber();
        }

        else if(view == "clear")
        {
            operator = "";
            CalculatorModel.Clear();
            return "";
        }

        else if(view == "delete")
        {
            if(operator == "") CalculatorModel.DeleteLastNumber();
            else
            {
                if(CalculatorModel.GetCurrentNumber() == "") operator = "";
                else CalculatorModel.DeleteCurrentNumber();
            }

            return CalculatorModel.GetLastNumber()+operator+CalculatorModel.GetCurrentNumber();
        }

        else if(view == "=")
        {
            if(operator == "+") return CalculatorModel.Add();
            if(operator == "-") return CalculatorModel.Subtract();
            if(operator == "*") return CalculatorModel.Multiply();
            if(operator == "/") return CalculatorModel.Division();
            if(operator == "^") return CalculatorModel.Power();
            if(operator == "%") return CalculatorModel.Mod();
            if(operator == "Sqrt of ") return CalculatorModel.Sqrt();
            else return "MATH ERROR";
        }

        else
        {
            if(CalculatorModel.GetCurrentNumber().length() + CalculatorModel.GetLastNumber().length() + operator.length() >= 10)
            {
                return CalculatorModel.GetLastNumber()+operator+CalculatorModel.GetCurrentNumber();

            }
            else if(operator == "") CalculatorModel.SetLastNumber(view);
            else CalculatorModel.SetCurrentNumber(view);
            return CalculatorModel.GetLastNumber()+operator+CalculatorModel.GetCurrentNumber();
        }
    }

    private static boolean isOperator(String op)
    {
        if(op == "+" || op == "-" || op == "*" || op == "/" || op == "^" || op == "%" || op == "Sqrt of ") return true;
        return false;
    }
}
