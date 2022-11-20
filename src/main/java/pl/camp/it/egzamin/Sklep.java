package pl.camp.it.egzamin;

import java.util.Scanner;

public class Sklep {

    public static void zakupy(){
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wpisz liczbe jablek:");
            int apple = Integer.parseInt(scanner.nextLine());
            System.out.println("Wpisz liczbe pomaranczy:");
            int oranges = Integer.parseInt(scanner.nextLine());
            System.out.println("Wpisz liczbę monet:");
            int coin = Integer.parseInt(scanner.nextLine());
            if (apple < 0 || oranges < 0 || coin < 0) {
                System.out.println("niepoprawne wartosci");
                flag = false;
            }else {

                for (int i = 0; i < coin; i++) {
                    if (apple <= oranges) {
                        apple++;
                    } else {
                        oranges++;
                    }
                }
                int difference = Math.abs(apple - oranges);

                System.out.println("Liczba jablek " + apple);
                System.out.println("liczba pomaranczy " + oranges);
                System.out.println("różnica " + difference);
                scanner.close();
                flag = false;
            }
        }
    }
}
