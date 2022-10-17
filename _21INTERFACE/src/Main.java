public class Main {
    public static void main(String[] args) {


        // implement işlemlerinde kullanılır.
        //Katmanlar arası geçişlerde kullanılır.
        //Newlenmez imza taşır

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    }
}

