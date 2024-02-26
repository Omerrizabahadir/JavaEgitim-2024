package class_studies_enumaration_enumaration_example_from_medium.com;

public enum Months {
    OCAK(1),SUBAT(2),MART(3),NISAN(4),MAYIS(5),
    HAZIRAN(6),TEMMUZ(7),AGUSTOS(8),EYLUL(9),
    EKIM(10),KASIM(11),ARALIK(12);

    private int month;

    Months(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }
}
