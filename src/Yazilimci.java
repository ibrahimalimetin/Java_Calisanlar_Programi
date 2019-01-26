/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrahim Ali Metin
 */
public class Yazilimci extends Calisan{
    private String diller;
    
    public Yazilimci(String ad, String soyad, int id, String diller) {
        super(ad, soyad, id);
        this.diller = diller;
        
    }
    public void formatAt (String isletim_sistemi){
        System.out.println(getAd() + "  " + isletim_sistemi + "  yüklüyor...");
    }

    @Override
    public void BilgileriGoste() {
        super.BilgileriGoste(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Yazılımcının bildiği dilleri  :" + diller);
    }
    
}
