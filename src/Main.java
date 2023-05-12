
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double fiyat,kfiyat,fark,kdvoran;

        System.out.print("Fiyat giriniz:");
        Scanner inpt=new Scanner(System.in);
        fiyat=inpt.nextDouble();
     //   kfiyat=fiyat+(fiyat*kdvoran);
     //   fark=kfiyat-fiyat;
    if(fiyat>0&&fiyat<=1000){
       kdvoran=0.18;
        kfiyat=fiyat+(fiyat*kdvoran);
        fark=kfiyat-fiyat;
    }

    else if(fiyat>1000){
        kdvoran=0.08;
        kfiyat=fiyat+(fiyat*kdvoran);
        fark=kfiyat-fiyat;
    }
    else{
        kdvoran=0;
        System.out.println("Boyle bir tutar bulunamamaktadır.");
        fiyat=0;
        kfiyat=0;
        fark=0;
    }
    System.out.println("KDV\'siz fiyat:"+fiyat);
    System.out.println("KDV\'li fiyat:"+kfiyat);
    System.out.println("KDV oranı:"+fark);





    }
}