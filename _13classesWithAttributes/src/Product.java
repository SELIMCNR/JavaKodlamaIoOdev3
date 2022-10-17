public class Product {

    //Bir class bir işi yapar

    //Constructor yapılandırıcı metot eklendi
    public Product(int id ,String name,String description,Double price,int stockAmount,String renk){
        System.out.println("Yapıcı blok çalıştı");
        this._id = id;    //constructor parametrelerini set ettik
        this._renk = renk;
        this._name= name;
        this._price=price;
        this._description=description;
        this._stockAmount=stockAmount;
    } //Constructor kuruldu



    // attribute & field : Özellik

    private int _id;
    //Private sadece o class yada o alana ait kodlar,
    //Public heryerden erişilebilir kodlar
 private String _name;
 private String _description;
 private double _price;
 private int _stockAmount;
 private String _renk;
 private String _kod;

 //Getter Setter
    public int getId(){
        //Id'iyi okuyabilir ama id'yi yazamaz
        return _id;
    }
    public void setId(int id){
        this. _id=id;
        //this id bu clasdaki id

    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        this._name = name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String description) {
        this._description = description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double price) {
        this._price = price;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int stockAmount) {
        this._stockAmount = stockAmount;
    }

    public String get_renk() {
        return _renk;
    }

    public void set_renk(String renk) {
        this._renk = renk;
    }

    public String get_kod() {

        return this._name.substring(0,1) + _id;
    }


}
