public class Main {
    public static void main(String[] args) {

        //Classtan Product adında yeni obje oluşturduk ve constructora değerler ekledik
        Product product = new Product(1,"Laptop","Hp laptop",3050.5,3,"mavi"); //Constructor yapıcı metot özellikleri eklendi


        //Oluşturulan obje içerisindeki özeliiklere değer atadık
        product.set_name("Laptop");
        product.setId(1);
        product.set_description("Hp Laptop");
        product.set_price(5000);
        product.set_stockAmount(3);

        //ProductManager classı içerisinden productManager adlı nesne oluşturuldu
        ProductManager productManager = new ProductManager();
        //productManager adlı oluşturulan nesne içerisindeki parametreli ADD metodu çalıştırıldı.
        productManager.Add(product);


        //Obje içerisinde değer atanan nesneyi yazdırdık.
        System.out.println(product.get_name());
        System.out.println(product.get_kod());




    }
}