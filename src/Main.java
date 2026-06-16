
public class Main {
    public static void main(String[] args) {
//task1
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }
//task2
        for (int b = 10; b >= 1; b=b-1) {
            System.out.println("b = " + b);
        }
//task3
        for (int a = 0; a <= 17; a=a+2) {
            System.out.println("a = " + a);
        }
//task4
        for (int c = 10; c >= -10; c--) {
            System.out.println("c = " + c);
        }
//task5
        for (int year = 1904; year <= 2096; year=year+4) {
            System.out.println("Високосный год: " + year);
        }
//task6
        for (int delSevn = 7; delSevn <= 98; delSevn=delSevn+7) {
            System.out.println("Кратные семи: " + delSevn);
        }
//task7
        for (int two = 1; two <= 512; two=two*2) {
            System.out.println("Степени двух: " +two);
        }
//task8
        int total=0;
        for (int month = 1; month <= 12; month++) {
            total=total+29000;
            System.out.println("Месяц: "+month+"Денег: "+total);
        }
//task9
        int total2=0;
        for (int month2 = 1; month2 <= 12; month2++) {
            total2=total2+29000/100;
            total2=total2+29000;
            System.out.println("Месяц: "+ month2 +"Денег: "+total2);
        }
//task10
        int meaning=2;

        for (int i = 1; i <= 10; i++) {
            int toTwo=meaning*i;
            System.out.println("2*"+i+"="+toTwo);
        }
    }

}
