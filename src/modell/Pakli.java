package modell;

public class Pakli {

    private static Lap[] lapok = new Lap[22];

    public Pakli() {
        feltolt();
    }

    private void feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int i = 1;
        for (String szin : szinek) {
            for (int e = 0; e < ertekek.length && i < lapok.length; e++) {
                lapok[i++] = new Lap(szin + "_" + ertekek[e]);
            }
        }
    }

    public static Lap[] getPakli() {
        return lapok;
    }

    public void kever(int oszlop) {
        Lap[] ujPakli = new Lap[22];
        switch (oszlop) {
            case 1:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = lapok[20 - (i - 1) * 3];
                    ujPakli[i + 7] = lapok[19 - (i - 1) * 3];
                    ujPakli[i + 14] = lapok[21 - (i - 1) * 3];
                }
                break;
            case 2:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = lapok[19 - (i - 1) * 3];
                    ujPakli[i + 7] = lapok[20 - (i - 1) * 3];
                    ujPakli[i + 14] = lapok[21 - (i - 1) * 3];
                }
                break;
            case 3:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = lapok[19 - (i - 1) * 3];
                    ujPakli[i + 7] = lapok[21 - (i - 1) * 3];
                    ujPakli[i + 14] = lapok[20 - (i - 1) * 3];
                }
                break;
        }
        lapok = ujPakli;
    }

    public static String ezVolt() {
        return lapok[11].getLeiras();
    }

}
