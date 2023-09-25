package nezet;

import java.util.Scanner;
import modell.Pakli;
import static modell.Pakli.lapok;

public class KartyaTrukk {

    private static final Scanner sc = new Scanner(System.in);
    private Pakli pakli;

    public KartyaTrukk() {
        int oszlop = 0;
        this.pakli = new Pakli();
        for (int i = 0; i < 3; i++) {
            kirak();
            melyik(oszlop);
        }
        ezVolt();
    }

    private void melyik(int oszlop) {
        boolean jo;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        this.pakli.kever(oszlop);
    }

    private void kirak() {
        for (int i = 1; i < lapok.length; i++) {
            System.out.print(lapok[i].getLeiras());
            if (i % 3 == 0) {
                System.out.println(" ");
            }
        }
    }
    
    private String ezVolt() {
        return("A választott lap: " + lapok[11].getLeiras());
    }


}
