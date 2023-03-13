package Lesson_013;

public class HomeWork_1 {
    
}

class Monaten {
    public static void dayQuantity(int n) {
        switch(n){
            case 2:
                System.out.println("Dieser Monat hat 28 Tagen");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Dieser Monat hat 30 Tagen");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Dieser Monat hat 31 Tagen");
                break;
            default:
                System.out.println("Monatsnummer ist falsch");
        }
    }
    public static void main(String[] args) {
        Monaten.dayQuantity(0);
        dayQuantity(1);
        Monaten.dayQuantity(2);
        dayQuantity(4);
        Monaten.dayQuantity(-5);
    }
}
