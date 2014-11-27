public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        Klasser k = new Klasser();

        k.karoline();

        int tall1 = m.talletFem();
        int tall2 = talletTi();

        System.out.println(tall1);
        System.out.println(tall2);
    }

    public static int talletTi() {
        return 10;
    }

    public int talletFem() {
        return 5;
    }
}
