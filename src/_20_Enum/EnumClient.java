package _20_Enum;

enum  Calender {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
}
public class EnumClient {
    public static void main(String[] args) {
        Calender[] days = Calender.values();
        for(Calender i :days) {
            System.out.print(i +  " ");
        }
    }
}
