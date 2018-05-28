public class Operatory {

    public static void main(String[] args) {

        int a = 5;
        int b = 8;
        int result = a + b;

        System.out.println(result); // wynik 13

        result++;

        System.out.println(result); //wynik 14 = result++ zwiększanie result o 1

        result --;

        System.out.println (result); // wynik 13 = result-- oznacza zmniejszenie o 1

        int c = b%a;
        System.out.println(c); //%modulo czyli RESZTA Z DZIELENIA w liczbie 8 liczba 5 mieści się jeden raz i zostaje 3;

    }
}
