package kartyatrukkkonzolon;

public class Pakli {

    private String[] pakli = new String[22];

    public Pakli() {
        feltolt();
        kirak();
        kever();
        ezVolt();

    }

    private void feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int i = 1;
        for (String szin : szinek) {
            for (int e = 0; e < ertekek.length && i < pakli.length; e++) {
                pakli[i++] = szin + "_" + ertekek[e];
            }
        }
    }

    private void kirak() {
        for (int i = 1; i < pakli.length; i++) {
            System.out.printf("%-8s", pakli[i]);
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
    }

    private void kever() {
        //megkeveri a lapokat
    }

    private void ezVolt() {
        System.out.println("A választott lap: " + pakli[11]);
    }

    public String[] getPakli() {
        return pakli;
    }

    public void setPakli(String[] pakli) {
        this.pakli = pakli;
    }

}
