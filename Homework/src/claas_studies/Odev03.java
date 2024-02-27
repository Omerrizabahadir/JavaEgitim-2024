package claas_studies;

public class Odev03 {
    public static void main(String[] args) {
Odev03 odev03=new Odev03();
        odev03.toplamBul();
    }
    public void toplamBul(){
        int sum=0;
        int tekToplam=0;
        int ciftToplam=0;
        for (int i=1;i<=100;i++){
            tekToplam++;
            ciftToplam++;
            sum=sum+i;
        }
        System.out.println("genel toplam : "+sum);
        System.out.println("tek toplam : "+tekToplam);
        System.out.println("çift toplam : "+tekToplam);
    }


}
