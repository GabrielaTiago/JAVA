package systemproperties;

import java.util.Date;

public class SytemTime {
   public static void main(String[] args) {
    Date currentTime = new Date();
    System.out.println("A hora do sistema é:");
    System.out.println(currentTime.toString());
   }
}
