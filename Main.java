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
    }
}
