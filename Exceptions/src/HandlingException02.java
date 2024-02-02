public class HandlingException02 {
    public static void main(String[] args) {
        String name="gdgg";

        try{
            name.length();
            System.out.println("hata yok isim: "+name);
        }catch (NullPointerException nullPointerException){
            System.out.println("catch bloğu hatayı yakaladı devam et");

        }finally {
            System.out.println("Her zaman devam et");
        }
        System.out.println("uygulama kapatılıyor");
    }
}
