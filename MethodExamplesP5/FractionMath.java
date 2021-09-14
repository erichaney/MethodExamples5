class FractionMath
{
    
    static Fraction multiply(Fraction a, Fraction b)
    {
        Fraction c = new Fraction(a.n * b.n, a.d * b.d);
        return c;
    }
    
    static Fraction reciprocal(Fraction a)
    {
        Fraction c = new Fraction(a.d, a.n);
        return c;
    }
    
    static Fraction divide(Fraction a, Fraction b)
    {
        Fraction c = multiply(a, reciprocal(b));
        return c;
    }
    
    static Fraction add(Fraction a, Fraction b)
    {
        Fraction c = new Fraction(a.n * b.d + a.d * b.n, a.d * b.d);
        return c;
    }
    
    static Fraction subtract(Fraction a, Fraction b)
    {
        return null;
    }
}