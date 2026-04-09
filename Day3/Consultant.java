package Day3;

public class Consultant implements TaxPayer{
    @Override
    public double calculateTax(){
        return 1000;
    }
}
