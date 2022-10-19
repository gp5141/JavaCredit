public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();





        System.out.println();
        System.out.println("1 год");
        System.out.println(Math.round(service.calculate(12,1000000,9.99)));

        System.out.println();
        System.out.println("2 года");
        System.out.println(Math.round(service.calculate(24,1000000,9.99)));

        System.out.println();
        System.out.println("3 года");
        System.out.println(Math.round(service.calculate(36,1000000,9.99)));



    }
}