public class ProductValdator {

    static {
        System.out.println("Static yapıcı blok çalıştı");
    }
    public ProductValdator(){
        System.out.println("Yapıcı blok çalıştı");
    }

        public static boolean isValid(Product product){
            if(product.price>0 && !product.name.isEmpty())
            {
                return  true;
            }
            else {
                return false;
            }
        }
        // Staticler direkt çalışır static olmayan newleyerek çalışır.
        public  void  birsey(){

        }

}
