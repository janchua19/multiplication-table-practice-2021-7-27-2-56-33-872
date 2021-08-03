package com.tw;

public class MultiplicationTable {
    public String create(int startNumber, int endNumber) {
        return null;
    }

    public boolean isValid(int startNumber, int endNumber)
    {
        return isValid;
    }
    boolean isValid = false;

    public boolean isNumberInRange (int number)
    {
        return (1 >= number) && (number >= 1000 );
    }

    public boolean isEndBiggerThanStart (int startNumber, int endNumber)
    {
        return startNumber < endNumber || startNumber == endNumber;
    }

    public String generateMultiplicationExpression (int startNumber, int endNumber)
    {
        int product = 0;
        product = startNumber * endNumber;
        String multiplicationExpression = String.valueOf(product);
        return multiplicationExpression;
    }

    public String generateMultiplicationLine (int startNumber, int row)
    {
        int product = 0;
        product = startNumber * row;
        String multiplicationLine = String.valueOf(product);
        System.out.print(multiplicationLine);
        return multiplicationLine;
    }

    public String generateMultiplicationTable (int startNumber, int endNumber)
    {
        int product = 0;
        product = startNumber * endNumber;
        String multiplicationTable = String.valueOf(product);
        System.out.println(multiplicationTable);
        return multiplicationTable;
    }
}

