import java.util.Scanner;

public class Time {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long hour =(((System.currentTimeMillis()/1000)/60)/60)%24;
        long minute =System.currentTimeMillis()/1000/60%60;
        long second =System.currentTimeMillis()/1000%60;

        System.out.print("GMT: ");
        System.out.println(hour+":"+minute+":"+second);
        System.out.print("Enter the city: ");
        String city = scanner.nextLine();
        if (city.equalsIgnoreCase("MSK")){
            System.out.println((hour+3)+":"+minute+":"+second);
        } else  if (city.equalsIgnoreCase("EKB")){
            System.out.println((hour+5)+":"+minute+":"+second);
        } else  if (city.equalsIgnoreCase("Kaliningrad")){
            System.out.println((hour+2)+":"+minute+":"+second);
        } else  if (city.equalsIgnoreCase("Magadan")){
            System.out.println((hour+11)+":"+minute+":"+second);
        } else  if (city.equalsIgnoreCase("Omsk")){
            System.out.println((hour+4)+":"+minute+":"+second);
        } else  if (city.equalsIgnoreCase("Krasnoyarsk")){
            System.out.println((hour+7)+":"+minute+":"+second);
        }
    }
}
