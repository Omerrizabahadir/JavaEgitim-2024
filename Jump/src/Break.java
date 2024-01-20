public class Break {
    public static void main(String[] args) {

           for(int i=0;i<10;i++){
               if(i==5)    //if {} küme parantezi kullanırsan hata verir.Çünkü if bloğunda break olmaz
                   break;   //for föngüsünde if kullanacaksan if teki küme parantezini yapmazsan sorun olmaz
                   System.out.println("i:" + i);

           }
        System.out.println("out of loop");
        } }


