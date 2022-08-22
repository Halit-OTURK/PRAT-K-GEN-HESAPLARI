 import  java.util.Scanner;

public class dikUcgen {
    public static void main(String[] args) {
        double uzunluk1,uzunluk2,hipotenus,cevre,alan,u;
        Scanner inp= new Scanner (System.in);
        System.out.print("1.KENARI YAZINIZ:");
        uzunluk1 = inp.nextDouble();
        System.out.print("2.KENARI YAZINIZ:");
        uzunluk2 = inp.nextDouble();
        hipotenus= Math.sqrt((uzunluk1*uzunluk1)+(uzunluk2*uzunluk2));
        System.out.println("HIPOTENUS:"+hipotenus);
        cevre=uzunluk1+uzunluk2+hipotenus;
        System.out.println("ÇEVRE"+cevre);
        u= (cevre/2);
        alan=Math.sqrt(u*(u-uzunluk1)*(u-uzunluk2)*(u-hipotenus));
        System.out.println("ALAN"+alan);




    }

}
