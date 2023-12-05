public class Temperature {
    double farenheit;
    public Temperature (int farenheit)
    {
        this.farenheit = farenheit;
    }
    double celsius ()
    {
        return 5*(farenheit - 32)/9;
    }
}
