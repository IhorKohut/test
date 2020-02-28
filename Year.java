import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Year {

    public enum Seasons {
        Winter , Spring, Summer, Autumn;
    }

    public static void main(String[] args) throws IOException {
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Input month");
     String s = reader.readLine();


         switch(s)
             {
             case "February":
             case "January":
             case "December":
                 System.out.println(Seasons.Winter);
                 break;
             case "March":
             case "April":
             case "May":
                 System.out.println(Seasons.Spring);
                 break;
             case "June":
             case "July":
             case "August":
                 System.out.println(Seasons.Summer);
                 break;
             case "September":
             case "October":
             case "November":
                 System.out.println(Seasons.Autumn);
                 break;

                default: System.out.println("Incorrect");
             }
     }
}
