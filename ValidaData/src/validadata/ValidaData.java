import java.util.Scanner; //leitura de dados

public class ValidaData {
    private static final int[] QTN_MAX_DIAS_POR_MES = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public static void main(String[] args) {
        int dia;
        int mes;
        int ano;

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o dia:\n");
        dia = ler.nextInt();

        System.out.print("Digite o mes:\n");
        mes = ler.nextInt();

        System.out.print("Digite o ano:\n");
        ano = ler.nextInt();

        if(dataVaida(dia, mes, ano)){
            System.out.println("Data Válida. A data digitada foi: " + dia + "/" + mes + "/" + ano);
        } else {
            System.out.println("Data Inválida");
        }

        ler.close();
    }

    private static boolean dataVaida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        int diaMaximo = QTN_MAX_DIAS_POR_MES[mes - 1];

        if (mes == 2 && verificaAnoBissexto(ano)) {
            diaMaximo = 29;
        }

        return dia >= 1 && dia <= diaMaximo;
    }

    private static boolean verificaAnoBissexto(int ano) {
        int divisivel4;
        int divisivel100;
        int divisivel400;

        divisivel4 = ano % 4;
        divisivel100 = ano % 100;
        divisivel400 = ano % 400;

        return (divisivel4 == 0 && divisivel100 != 0) || divisivel400 == 0;
    }
}