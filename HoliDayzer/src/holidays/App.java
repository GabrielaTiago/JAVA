package holidays;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String inputHoliday;
        String inputAllHolidays;

        AllHolidays holidays = new AllHolidays();

        Scanner controlHoliday = new Scanner(System.in);
        Scanner controlHolidaysList = new Scanner(System.in);

        System.out.print("Digite uma data para pesquisar por um feriado: ");
        inputHoliday = controlHoliday.nextLine();

        holidays.getHoliday(inputHoliday);



        System.out.print("Deseja ver todos os feriados cadastrados? [S/n]");
        inputAllHolidays = controlHolidaysList.nextLine();

        if (inputAllHolidays.equals("S") || inputAllHolidays.equals("s")) {
            holidays.getALlHolidays();
        } else {
            System.out.println("Ok.");
        }

        controlHoliday.close();
        controlHolidaysList.close();
    }

}
