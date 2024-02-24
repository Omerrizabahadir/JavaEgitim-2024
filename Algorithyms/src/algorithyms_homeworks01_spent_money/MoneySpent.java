package algorithyms_homeworks01_spent_money;

public class MoneySpent {
    public static void main(String[] args) {
        int[] keyboards = {40, 50, 60};
        int[] drives = {5, 8, 12};
        int budget = 60;


        MoneySpent moneySpent = new MoneySpent();
        int maxSpent =moneySpent.getMoneySpent(keyboards, drives, budget);
        System.out.println("Maksimum alınabilecek ürünleriniz: "+maxSpent);

    }

    public int getMoneySpent(int[] keyboard, int[] drive, int b) {
        int maxSpent = -1;
        int invoice = 0;
        for (int i = 0; i < keyboard.length; i++) {
            for (int j = 0; j < drive.length; j++) {

                invoice = keyboard[i] + drive[j];

                if (invoice<= b && invoice > maxSpent) {
                    maxSpent = invoice;
                }
            }

        }

        return maxSpent;
    }
}
