public class ProductManager {
    public  void add(Product product){
        ProductValdator valdator = new ProductValdator();
        if(valdator.isValid(product)){
            System.out.println("Eklendi");
        }
        else {
            System.out.println("Ürün bilgileri geçersiz");
        }

        System.out.println("Eklendi");

    }
}
