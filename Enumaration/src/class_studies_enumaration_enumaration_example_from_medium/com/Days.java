package class_studies_enumaration_enumaration_example_from_medium.com;

public enum Days {

    PAZARTESI(1),SALI(2),CARSAMBA(3),PERSEMBE(4),CUMA(5),CUMARTESI(6),PAZAR(7);

    private int day;

    Days(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }
}
