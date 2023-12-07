package org.lessons.java.wishlist;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Wishlist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<String> wishlist = new HashSet<>();

        boolean stop = false;
        while(!stop){
            System.out.print("Inserisci il nome del regalo: ");
            String answer = scan.nextLine();
            wishlist.add(answer);
            System.out.println("Numero di regali: " +  wishlist.size());
            System.out.println(wishlist);
            System.out.println("Vuoi aggiungerne un altro? (y/n)");
            String choise = scan.nextLine();
            if ((choise.equals("n"))){
                stop = true;
                System.out.println("Ecco la tua lista di regali: " + wishlist);
            }
        }
        scan.close();
    }
}
