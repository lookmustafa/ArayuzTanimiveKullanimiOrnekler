
public class VizeNotuHesaplama implements IDortIslem{

    @Override
    public void toplam() {
          System.out.println("Vize notu toplandı");
    }

    @Override
    public void cikarma() {
          System.out.println("Vize notu çikarıldı");
    }

    @Override
    public void carpma() {
          System.out.println("Vize notu çarpıldı");  
    }

    @Override
    public void bolme() {
          System.out.println("Vize notu bölündü");
    }
    
  
}
