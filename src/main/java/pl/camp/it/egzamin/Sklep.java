package pl.camp.it.egzamin;

import java.util.Scanner;

public class Sklep {

    public static void zakupy(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz liczbe jablek:");
        int apple = Integer.parseInt(scanner.nextLine());
        System.out.println("Wpisz liczbe pomaranczy:");
        int oranges = Integer.parseInt(scanner.nextLine());
        System.out.println("Wpisz liczbę monet:");
        int coin = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < coin; i++){
            if(apple <= oranges) {
                apple++;
            }else{
                oranges++;
            }
        }
        int roznica = Math.abs(apple-oranges);

        System.out.println("Liczba jablek " + apple);
        System.out.println("liczba pomaranczy " + oranges);
        System.out.println("różnica " + roznica);
        scanner.close();
    }
}
