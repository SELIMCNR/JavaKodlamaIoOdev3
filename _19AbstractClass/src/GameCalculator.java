public abstract class GameCalculator {
    public abstract void Hesapla(); // hesapla var diğer classlar kendi içinde override edecek

    public final void gameOver(){
        System.out.println("Oyun bitti.");
    }

}
