/*
* File: Hengfel.java
* Author: Fülöp Ervin
* Copyright: 2024, Fülöp Ervin
* Group: II/2/N
* Date: 2024-12-19
* Github: https://github.com/Ervincsao/
* Licenc: MIT
*/
import java.util.Scanner;

public class Hengfel {
    public void doit() {
                Scanner scanner = new Scanner(System.in);

        System.out.print("Sugár:  ");
        double radius = scanner.nextDouble();

        System.out.print("Magasság:  ");
        double height = scanner.nextDouble();

        double surfaceArea = 2 * Math.PI * radius * (radius + height);
        System.out.println("Felszine: " + surfaceArea);

        scanner.close();
    }
}
