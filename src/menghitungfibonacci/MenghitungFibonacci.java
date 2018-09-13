package menghitungfibonacci;

import java.util.Scanner;
public class MenghitungFibonacci {

    private static void tampilJudul(String identitas) {
        System.out.println("Identitas : " + identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
        
    } 
    public static void main(String[] args) {
        
        String identitas = "Fara Nisha Sukma Gustika / XRPL2 / 14";
        tampilJudul(identitas);
        int n = tampilInput();
        
        }
    private static int tampilInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bilangan ke : ");
        int n = scanner.nextInt();
        
        return n;
    }
}
