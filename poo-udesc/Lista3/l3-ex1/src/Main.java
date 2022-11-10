import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String nome;
        Animal animal;

        animal = new Gato();
        animal.setNome("Saiph");
        animal.toString();

        animal = new Gato();
        animal.setNome("Rucula");
        animal.toString();

        animal = new Cachorro();
        animal.setNome("Kimura");
        animal.toString();

        animal = new Cachorro();
        animal.setNome("Chineque");
        animal.toString();

        animal = new Pato();
        animal.setNome("Amendoim");
        animal.toString();

        animal = new Pato();
        animal.setNome("Tomatinho cereja");
        animal.toString();
    }
}