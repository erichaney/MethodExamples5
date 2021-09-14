class Fraction
{
    int n; //numerator
    int d; //denominator
    
    Fraction(int n, int d)
    {
        this.n = n;
        this.d = d;
        
        if (d == 0)
        {
            throw new IllegalArgumentException(
            "The denominator of a fraction cannot be zero.");
        }
    }
}