/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package fixx.exerciciodefix;

import entities.Entities;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author marcos
 */
public class Exerciciodefix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas: ");
        int quantity = sc.nextInt();
        int valor[] = new int[quantity];
        Entities enti = new Entities();
        List<Entities> user = new ArrayList<>();
        for (int i = 0; i < valor.length; i++) {
            System.out.println("Dados da " + (i + 1) + "° pessoa:");
            System.out.println("Nome: ");
            String name = sc.next();
            enti.setName(name);
            System.out.println("Idade: ");
            int y = sc.nextInt();
            enti.setYears_old(y);
            System.out.println("Altura: ");
            double H = sc.nextDouble();
            enti.setHeight(H);
            user.add(enti);

        }
        for(Entities en : user) {
            if (en.getName() != null) {
                System.out.println(enti);
            }
        }
    }
}
