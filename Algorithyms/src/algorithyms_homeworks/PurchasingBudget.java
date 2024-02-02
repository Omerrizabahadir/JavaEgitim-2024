package algorithyms_homeworks;

import java.util.Arrays;

public class PurchasingBudget {
    public static void main(String[] args) {

        int[] keyboards = {40, 50, 60};
        int[] drives = {5, 8, 12};
        int budget = 60;

        PurchasingBudget purchasingBudget = new PurchasingBudget();
        int[] newK = purchasingBudget.getMoneySpent(keyboards, drives, budget);
        int[] newD = purchasingBudget.getMoneySpent(drives, keyboards, budget);


        for (int keyboard : newK) {
            for (int drive : newD) {
                int spent = keyboard + drive;
                if (spent < budget) {
                    System.out.println(spent);
                } else if (spent == -1) {
                    System.out.println("üzgünüm");
                }

            }
        }
    }

    public int[] getMoneySpent(int[] m, int[] n, int b) {
        int depo1;
        depo1 = m[0];
        int depo2;
        depo2 = n[0];

        for (int i = 0; i < m.length; i++) {
            int keyboard = m[i];
            if (keyboard > depo1) {
                depo1 = keyboard;

                for (int j = 0; j < m.length; j++) {
                    int drive = n[j];
                    if (drive> depo2) {
                        depo2 = drive;
                        int spent = depo1 + depo2;

                    }
                }

            }

        }

        return m;
    }
}






