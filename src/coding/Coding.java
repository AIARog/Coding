/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coding;
import java.util.Date;
import java.awt.*;
import java.util.Arrays;

/**
 *
 * @author arielrogalla
 */
public class Coding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte /*int kann man verwenden bentutzt aber mehr speicher*/ age = 30/*,temperature=20 neue variable mit int kann man so deklarieren*/;
        byte/*int*/ temperature = 20;//ist schöner 
        int /*auch hier sollte man byte verwenden*/ herage = age;
        long views = 3_123_456_789L; // wie 10.000 leichtere lesbarkeit
        float price = 10.99F; // bei long and float muss man ein l oder f hinterdie zahlsetzen
        char letter = 'a';
        boolean istberechtigt = false;
        temperature = age; // so kann man variablen gleichstezen
        age = 35; // variablen kann ma im nachhinen so ändern
        
        
        System.out.println("age: " + age);
        System.out.println("temperature: " + temperature);
        System.out.println("herage:  " + herage);
        System.out.println("views: " + views);
        
    //reference Type; ...  ...= new ...()
        
        Date now = new Date();
        Point point1 = new Point( 1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println("now: "+ now);
        System.out.println("point" + point2);
        
        //String reference type aber ohne new String()
        
      /*  String message = "     Hello World";
        String verbinden = "Hello World" + "!!";
        String anfürhungszeichen = "Hallo \"ariel\""; // wenn ein \ da stehen soll muss man \\...\\ eingeben
        System.out.println("verbinden" + verbinden);
        System.out.println("verbinden endet mit zwei !!: " + verbinden.endsWith("!!"));
        System.out.println("verbinden begint mit mit zwei !!: " + verbinden.startsWith("!!"));
        System.out.println("länge von verbinden: " + verbinden.length());
        System.out.println("überbrüfung von der stelle wo l steht: " + verbinden.indexOf("e"));
        System.out.println("replace ! mit *" + verbinden.replace("!", "*"));
        System.out.println("verbinden nach replace: " + verbinden); //strings sind nicht änderbar
        System.out.println("alles kleinschreiben" + verbinden.toLowerCase()); // alles Groß toUpperCase
        System.out.println(message);
        System.out.println("lerzeichen am beginn erntfernen: " + message.trim());
        System.out.println("anführungszeichen: "+ anfürhungszeichen );
        System.out.println("absatz:\n "+verbinden);//tab ist \t*/
        
        //Arrays
        
        int [] numbers = {1,4,3,5,6};   //int [] numbers = new int[5];
                                        //numbers[0] = 1;
                                        //numbers[1] = 2; ...
        Arrays.sort(numbers);           // sortiert numbers‚‚‚
        System.out.println("länge des Arrays: " + numbers.length);
        System.out.println("numbers[]: "+ Arrays.toString(numbers));
        
        // 2++ D Arrays
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(Arrays.deepToString(myNumbers));
        
        // Constance
        
        final float PI = 3.14F; // um Konstanten zu machen schreiben wir vor unserer Varriable final vor     
        
        //arithmetic expression + - * / %
        
        int result = 10 + 3;
        double devision = (double)10 / (double)3;
        int x = 1;
        x++;                    // +1
        int y = x++;
        int z = ++x;
        int a = 1;
        a += 2;                // a = a + 2
                               // a -= 2, a /= 2 und a *= 2
        System.out.println("a: "+ a);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
        System.out.println(result);
        System.out.println("geteilt 10 / 3= " + devision);
    }
    
}
