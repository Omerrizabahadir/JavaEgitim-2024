public class AritmeticOperators {

    public static void main(String[] args) {
        int number1 = 25, number2 = 3, number3 = 17;
        String webSiteName = "Web Sitemiz :";
        String webSiteUrl = "bilgeadam.com";

        System.out.print("Merhaba \n" + webSiteName + "\t" + webSiteUrl);
        System.out.println("\nhello!");

        System.out.println("number1 + number2 = " + number1 + number2);
        System.out.println("number1 + number2 = " + (number1 + number2));
        System.out.println("number1 - number2 = " + (number1 - number2));
        System.out.println("number1 * number2 = " + (number1 * number2));
        System.out.println("number1 / number2 = " + (number1 / number2));
        System.out.println("Mod alma:" + (number1 % number2));

        System.out.println("number1 + number2 * 2 = " + (number1 + number2) * 2);

        System.out.println("toplama=" + (1 + 2) * 6);

       /*integer olan number1 ve number2 'yi ondalıklı istiyorsak
        önlerine (float) olarak belirtmeliyiz*/

        float result = (float) number1 / number2;
        System.out.println("ondalıklı bölme işlemi :" + result);


    }
}
