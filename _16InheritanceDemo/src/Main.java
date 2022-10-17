public class Main {
    public static void main(String[] args) {
            OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
            ogretmenKrediManager.Hesapla();

            KrediUı krediUı = new KrediUı();
            //KrediUı Sınıfı içerisinde Ogretmenkredimanager sınıfı metot içerisine
           //eklendi ve yazdırıldı
            krediUı.KrediHesapla(new OgretmenKrediManager());
    }
}