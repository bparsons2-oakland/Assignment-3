import java.util.Scanner;

abstract class converter {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String metric = "0";
        String exit = "-1";

        while (!metric.equalsIgnoreCase(exit)) {
            System.out.println("Enter a number value [###]");
            float measurement = scanner.nextFloat();
            float number = measurement;
            System.out.println("Then enter the abbreviated form of the starting measurement \n[currently [kg] -> lb, [g] -> oz, [km] -> mi, [mm] -> in are supported]\n");
            String input = scanner.next();
            metric = input;

            if (metric.equalsIgnoreCase("kg")) {
                number = (float) (number * 2.20462);
            }
            if (metric.equalsIgnoreCase("g")) {
                number = (float) (number * 0.03527);
            }
            if (metric.equalsIgnoreCase("km")) {
                number = (float) (number / 1.6094);
            }
            if (metric.equalsIgnoreCase("mm")) {
                number = (float) (number / 25.4);
            }
            Boolean fail = false;
            if (metric.equalsIgnoreCase("kg")||metric.equalsIgnoreCase("g")||metric.equalsIgnoreCase("km")||metric.equalsIgnoreCase("mm")) {
                fail = false;
                System.out.println("Your conversion is: " + number);
                System.out.println("Enter any key if you would like to continue or type -1 to leave");
                metric = scanner.next();   
            }
            else {
                System.out.println("Please try again. Only kg, g, km, and mm are currently supported.");
            } 
        } 
        scanner.close();        
    }
}

