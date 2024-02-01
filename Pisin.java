public class Pisin {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Ei parametreja");
            System.exit(0);
        }
        String pisin = "";
        for (String i: args) {
            if (i.length() > pisin.length()) {
                pisin = i;
            }
        }
        System.out.println("Pisin parametri: " + pisin);
    }
}