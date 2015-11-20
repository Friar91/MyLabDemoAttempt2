import java.text.DecimalFormat;
public class PennyLoan 
{
        private int amount ; // Amount of loan in pence
        private int length ; // length of subscription in months
		
        
        public PennyLoan(int a, int l) {
                amount = a ;
                length = l ;
        }

        /**
        * Calculate the monthly payment in pounds,
        * rounded up to the nearest penny.
        */
        
        public double paymentPerMonth() {
			DecimalFormat df = new DecimalFormat("#.##");
                double r = (double) amount/ (double) length;
                return df.format(r/100) ;
        }
}
