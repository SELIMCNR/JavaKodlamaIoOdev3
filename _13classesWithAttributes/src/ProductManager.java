public class ProductManager {
    //Bir clas bir işi yapar
    //Ekle Product sınıfı içerisindeki product objesinden
    public  void Add(Product product){
        //JBC veritabanı

        //Eklenen nesne içerisindeki özellik yazdırıldı
        System.out.println("Ürün eklendi " + product.get_name());
    }


}
