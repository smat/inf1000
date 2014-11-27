public class PrivatePublic {

    public static void publicMetode() {
        System.out.println("Public metode");
    }

    // Kun tilgjengelig i denne fila
    private static void privateMetode() {
        System.out.println("Private metode");
    }

    public static void regnUtFibonacci() {
        int start = 1;
        int nesteFibonacci = nesteFibonacci(start, start);
        System.out.println(start);
        System.out.println(nesteFibonacci);
    }

    // Kun tilgjengelig i denne fila
    private static int nesteFibonacci(int tall1, int tall2) {
        return tall1 + tall2;
    }

}
