import java.sql.Array;
import java.sql.Time;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        int num = 5;
        String days = "Wednesday";
        boolean rainy = true;
        char letter = 'D';
        float rounded = 5.7896856f;
        double truncated = 7.88778686886865556577777777777d;

        float floatnum = num;
        int roundedint = (int) rounded;
        int feet = 7;
        feet += 10;
        System.out.println(feet);
        String name = "Kiruki";
        String nameCapitalized = name.toUpperCase();
        System.out.println(nameCapitalized);
        String lowerName = nameCapitalized.toLowerCase();
        System.out.println(lowerName);
        int ind = name.indexOf("i");
        String allNames = name.concat(" ").concat(nameCapitalized);
        System.out.println(allNames);
        System.out.println(num + days + rainy +  letter + rounded + truncated);
        System.out.println(floatnum);
        System.out.println(roundedint);
        int maximum = Math.max(num, feet);
        System.out.println(maximum);


        String evenings = "Madrid";
        System.out.println(evenings);

        int bundles = 20;
        if(bundles == 200){
            System.out.println("Telkom");
        }else if(bundles > 200){
            System.out.println("airtel");
        }else{System.out.println("Safaricom:(");}


        int age = 190;
        if(age < 18){
            System.out.println("not elligible");
        }else if(age == 18){
            System.out.println("lucky one");
        }else{
            System.out.println("beyond qualified");
        }

        //reference types
        Date today = new Date();
        System.out.println(today);
        today.getDay();
        long timer = today.getTime();
        System.out.println(timer);;


        //Arrays
        int[] numbers = {3,4,5,6,7,6,7,5};
        System.out.println(Array.toString(numbers));



    }
}
