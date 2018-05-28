public class Tablice {

    public static void main(String[] args) {

        int tablica[] = new int[5]; //5 liczba pozycji w tablicy

        tablica[0] = 6; //zawsze zaczyna się od 0
        tablica[1] = 5;
        tablica[2] = 4;
        tablica[3] = 3;
        tablica[4] = 10;

        System.out.println(tablica[3]); //wyświetl pozycje numer 3

        //DRUKOWANIE CAŁEJ TABLICY

        for (int i = 0; i < 5; i++) { //pętla wyświetla całość

            System.out.println("Element tablicy = " + tablica[i]);



            //inną pętla do wyświetlania pętla FOREACH

            System.out.println("Teraz inna pętla");

            for (int b : tablica) { //pętla wyświetla całość

                System.out.println("Moja tablica = " + b);

            }
        }
    }
}
