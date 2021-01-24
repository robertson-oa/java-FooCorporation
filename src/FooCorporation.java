public class FooCorporation {

    public static void totalPay (  double basePay,double hoursWorked){

        double overtime = ( hoursWorked - 40)*basePay;
        double calculatePay = 40 * basePay;

        if (( hoursWorked<=40 )&& basePay>=8.00) {
            System.out.println(calculatePay);
        }
        else if ( (hoursWorked > 40) && (hoursWorked<=60)&& (basePay>=8.00)){
            System.out.println(calculatePay+overtime);
        }
        else
            System.out.println("Error");
    }
}
