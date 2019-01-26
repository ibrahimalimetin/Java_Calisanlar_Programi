
import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrahim Ali Metin
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Çalışanlar Programına Hoşgeldiniz");
        String islemler = "İşlemler... \n"
                           + "1. Yazılımcı İşlemler \n"
                           + "2. Yönetici İşlemleri \n"
                           + "Çıkış için q basın!";
        
        System.out.println("********************************************");
        System.out.println(islemler);
        System.out.println("********************************************");
        
        while (true)
        {
            System.out.print("İşlemi seçiniz ?");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")){
                System.out.println("Programdan çıkış yapılıyor.....");
                break;
            }
            else if (islem.equals("1")){
                
                Yazilimci yazilimci = new Yazilimci("İbrahim Ali", "Metin", 2803, "Java, C, SQL");
                String yazilimci_islem = "1. Format At\n"
                                        +"2. Yazılımcı Bilgilerini Göster\n"
                                        +"Çıkış için q 'ya basınız....";
                
                System.out.println(yazilimci_islem);
                
                while (true)
                {
                    System.out.println("İşleminizi seçiniz???");
                    String y_islem = scanner.nextLine();
                    
                    if (y_islem.equals("q")){
                        System.out.println("Yazılımcı işlemlerinden çıkış yapılıyor...");
                        break;
                    }
                    else if (y_islem.equals("1")){
                        System.out.print("İşletim Sistemi : ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                        
                    }
                    else if (y_islem.equals("2")){
                        
                        yazilimci.BilgileriGoste();
                    }
                    
                    else
                    {
                        System.out.println("Geçersiz seçim....");    
                    }
                }
              
            }
            else if (islem.equals("2")){
                
                Yonetici yonetici = new Yonetici("Ali", "Veli", 0001 , 10);
                
                String yonetici_islemler = "Yönetici İşlemleri\n"
                                +"1. Zam Yap\n"
                                +"2. Bilgileri Göster\n"
                                +"Çıkış için q'ya bas";
                
               System.out.println(yonetici_islemler);
               while (true){ 
               
                System.out.println("İşleminizi seçiniz???");
                String y_islem = scanner.nextLine();
                
                if (y_islem.equals("q"))
                {
                    System.out.println("Yönetici işlemlerinden çıkılıyor.....");
                    break;
                }
                else if (y_islem.equals("1"))
                {
                    System.out.print("Yapmak istediğiniz zam miktarını giriniz: ");
                    int zam = scanner.nextInt();
                    scanner.nextLine();
                    yonetici.zamYap(zam);
                    
                }
                else if (y_islem.equals("2"))
                {
                    yonetici.BilgileriGoste();
                }
                else{
                    System.out.println("Geçersiz yönetici işlemleri seçimi yaptınız!!!");
                    
                }
            }
            }
            else{
                System.out.println("Geçersiz işlem !!!");
            }
            
        }
            
    }
}
