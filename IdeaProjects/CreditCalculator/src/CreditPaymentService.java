public class CreditPaymentService {
    public double calculate(double term, int sum, double rate) {


        double monthRate = rate/(100*12);
        double payment = sum*(monthRate/(1-(Math.pow(1+monthRate, -term))));

        return payment;

    }

}
