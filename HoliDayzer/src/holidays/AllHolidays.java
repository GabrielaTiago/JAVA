package holidays;

import java.util.ArrayList;

public class AllHolidays {
    ArrayList<Holiday> holidays = new ArrayList<>();

    public AllHolidays() {
        Holiday holiday1 = new Holiday("01/01/2023", "Confraternização mundial");
        Holiday holiday2 = new Holiday("21/02/2023", "Carnaval");
        Holiday holiday3 = new Holiday("09/04/2023", "Páscoa");
        Holiday holiday4 = new Holiday("21/04/2023", "Tiradentes");
        Holiday holiday5 = new Holiday("01/05/2023", "Dia do trabalho");
        Holiday holiday6 = new Holiday("08/06/2023", "Corpus Christi");
        Holiday holiday7 = new Holiday("07/09/2023", "Independência do Brasil");
        Holiday holiday8 = new Holiday("12/10/2023", "Nossa Senhora Aparecida");
        Holiday holiday9 = new Holiday("02/11/2023", "Finados");
        Holiday holiday10 = new Holiday("15/11/2023", "Proclamação da República");
        Holiday holiday11 = new Holiday("25/12/2023", "Natal");

        holidays.add(holiday1);
        holidays.add(holiday2);
        holidays.add(holiday3);
        holidays.add(holiday4);
        holidays.add(holiday5);
        holidays.add(holiday6);
        holidays.add(holiday7);
        holidays.add(holiday8);
        holidays.add(holiday9);
        holidays.add(holiday10);
        holidays.add(holiday11);
    }

    public void getALlHolidays() {
        int size = holidays.size();

        System.out.println("Lista dos feriados:" + "\n");

        for (int i = 0; i < size; i++) {
            String day = holidays.get(i).getDay();
            String name = holidays.get(i).getName();

            System.out.println("Dia: " + day + ", " + "Nome do feriado: " + name);
        }
    }

    public void getHoliday(String date) {
        int size = holidays.size();
        boolean holidayExits = false;
        String day = "";
        String name = "";

        for (int i = 0; i < size; i++) {
            day = holidays.get(i).getDay();
            name = holidays.get(i).getName();

            if (date.equals(day)) {
                holidayExits = true;
                break;
            }
        }

        if (holidayExits) {
            System.out.println("O feriado do dia " + day + " tem nome de: " + name);
        } else {
            System.out.println("Feriado " + date + " não encontrado. Tente no formato DD/MM/AAAA");
        }
    }
}
