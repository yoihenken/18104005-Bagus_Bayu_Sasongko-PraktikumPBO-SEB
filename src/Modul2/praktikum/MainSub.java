package Modul2.praktikum;

import Modul2.praktikum.protec.ModifierSubClass;

public class MainSub extends ModifierSubClass {

    public static void main(String[] args) {

        //Dari Subclass ke Superclass
        //Object
        MainSub mainSub = new MainSub();

        System.out.println( mainSub.teksPublic );
        System.out.println( mainSub.teksProtect );
//        System.out.println( mainSub.teksPrivate );
//        System.out.println( mainSub.teks );

    }

}
