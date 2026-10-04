import java.util.Scanner;

public class WeatherSummary {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      while (scanner.hasNextDouble()){
        double temp = scanner.nextDouble();
        System.out.println(temp);
      }
    }
}
