public class Party {
    public static void main (String[] args) {
        int guests = 12;


        guests = guests - 1; // Absagen
        guests = guests + 3; // Zusagen

        System.out.println("Anzahl der Gäste kommen:" + guests);
    }
}
