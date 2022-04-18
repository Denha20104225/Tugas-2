package T2;

/**
 *
 * @Ade Denha Gunawan 20104225
 */
public class volumebalok {
    double volume;
    double panjang;
    double lebar;
    double tinggi;
    
    public volumebalok(double Pj, double Lb, double Tg){
        this.setPj (Pj);
        this.setLb(Lb);
        this.setTg(Tg);
        
        this.panjang = Pj;
        this.lebar = Lb;
        this.tinggi = Tg;
    }
       public void setPj(double Pj) {
        this.panjang = Pj;
       }
       public void setTg (double Tg){
        this.tinggi = Tg;
       }
       public void setLb (double Lb) {
        this.lebar = Lb;
       }
       double Hitungvolume (){
           this.volume = this.panjang*this.lebar*this.tinggi;
           return this.volume;
       }
       public void cetakvolume (){
        this.Hitungvolume();
        System.out.println(">>>>>>>>>MENGHITUNG VOLUME BALOK>>>>>>>>>>");
        System.out.println("NILAI PANJANG   :"+this.panjang+"cm");
        System.out.println("NILAI LEBAR     :"+this.lebar+"cm");
        System.out.println("NILAI TINGGI    :"+this.tinggi+"cm");
        System.out.println("VOLUME BALOK    :"+this.volume+"cm");
       }
       
    }
    