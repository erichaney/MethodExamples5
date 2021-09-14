class MathExamples
{
    static double average(double a, double b)
    {
        return (a + b) / 2;
    }
    
    static double average(double a, double b, double c)
    {
        return (a + b + c) / 3;
    }
    
    static double abs(double x)
    {
        if (x >= 0)
        {
            return x;
        }
        else
        {
            return -1 * x;
        }
    }
    
    /**
     * Returns true if the input number is even and false otherwise.
     */
    static boolean isEven(int number)
    {
        if (number % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    static String coinFlip()
    {
        if (Math.random() > 0.5)
        {
            return "heads";
        }
        else
        {
            return "tails";
        }
    }
    
    /**
     * Returns the factorial of the given number.
     * 
     * For example:
     * factorial(5) = 5 * 4 * 3 * 2 * 1
     */
    static int factorial(int n)
    {
        int product = 1;
        
        while (n > 1)
        {
            product = product * n;
            n = n - 1;
        }
        
        return product;
    }
    
    static int ageInSeconds(int years)
    {
        return years * 365 * 24 * 60 * 60;
    }
    
    static double solveHypotenuse(double a, double b)
    {
        return Math.sqrt(a*a + b*b);
    }
    
    
}