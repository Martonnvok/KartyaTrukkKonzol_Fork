package kartyatrukkkonzolon;

import java.util.Scanner;


public class Kartyatrukk {
    private Scanner sc = new Scanner(System.in);

    public Kartyatrukk() {
        Pakli p = new Pakli();
        int oszlop = 2;
        melyik(oszlop);
    }

    private int melyik(int oszlop) {
        boolean jo;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }
    

    

   
}