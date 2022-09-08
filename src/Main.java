public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 18;
        if (age>=18) {
            System.out.println("Поздравляем с совершенолетием!");
        }
        if (age<=18){
            System.out.println("Совершенолетие еще не наступило");
        }

        System.out.println("Задание 2");
        int age1 = 7;
        int age2 = 18;
        int age3 = 24;
        if (age1>=7){
            System.out.println("Ребенок ходит в школу");
        }
        if (age2>=18){
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age3>=24){
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        System.out.println("Задание 3");
        int capacityCarriage =102;
        int sittingPlace =60;
        if (capacityCarriage>=102){
            System.out.println("Вагон забит");
        }
        if (sittingPlace<60){
            System.out.println("Есть сидячие места");
        }
        if (sittingPlace>=60){
            System.out.println("Только стоячие места");
        }
    }
}