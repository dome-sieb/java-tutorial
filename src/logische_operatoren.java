public class logische_operatoren {
    public static void main(String[] args) {
        double temperatur = 25.5;

        if(temperatur > 20) {
            if(temperatur < 35) {
                System.out.println("Angenehm");
            }
        }else {
            System.out.println("Kalt");
        }
    }
}
