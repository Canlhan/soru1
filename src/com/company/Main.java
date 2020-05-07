package com.company;

import java.util.Scanner;
import java.util.concurrent.ForkJoinTask;

public class Main {

    public static void main(String[] args) {
        boolean doğrulama=true;
        Scanner istek=new Scanner(System.in);
        while(doğrulama)
        {
            System.out.println("*** sonuçları getirmek için 1' e çıkmak için lütfen 2'ye basınız");
            String işlem=istek.next();
            if(işlem.matches("1"))
            {
                kullanıcıdanVeriAlma();

            }
            else if(işlem.matches("2"))
            {
                doğrulama=false;
            }
            else
                {
                    System.out.println("lütfen geçerli bir işlem seçiniz");
                }
        }
    }
    public static void ortalama(int x,int y,int z)
    {
       float orta=(float)(x+y+z)/3;
        System.out.println("sayıların ortalamsaı: "+orta);
    }
    public static void toplama(int x,int y,int z)
    {
        int toplam=x+y+z;
        System.out.println("sayıların toplamı: "+toplam);
    }
    public static void kullanıcıdanVeriAlma()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz x:");
        int x=input.nextInt();
        System.out.println("ikinci sayıyı giriniz y:");
        int y=input.nextInt();
        System.out.println("üçüncü sayıyı giriniz z:");
        int z=input.nextInt();
        ortalama(x,y,z);
        toplama(x,y,z);
    }
}
