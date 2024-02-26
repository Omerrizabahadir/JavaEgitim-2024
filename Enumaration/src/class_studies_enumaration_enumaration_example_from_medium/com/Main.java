package class_studies_enumaration_enumaration_example_from_medium.com;

public class Main {
    public static void main(String[] args) {
        Days days=Days.CUMARTESI;
        Months months=Months.SUBAT;

        System.out.println(months+" yılın "+months.getMonth()+". ayıdır" );
        System.out.println(days+ " haftanın "+days.getDay()+". günüdür" );
    }
}
