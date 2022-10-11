import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma medida em metros: ");
        double metros = sc.nextDouble();
        sc.close();

        double centimetros = metros * 100;
        System.out.println(metros + "metros, corresponde à " + centimetros + " centímentros.");
    
    }
}
