package Modul7.praktikum.contoh2;

public class Kucing extends Hewan{
    @Override
    void bersuara() {
        super.bersuara();
        System.out.println("Meow... Meow...");
    }

    @Override
    void terbang() {
        super.terbang();
    }
}
