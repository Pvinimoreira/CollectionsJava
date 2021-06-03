import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ExercicioList1 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        List <Double> temperatura = new ArrayList();

        Double soma = 0.0;

        for (int i = 1; i <= 6; i++){
            System.out.println("Digite a temperatura do mês " + i + ":");
            Double valorTemp = dados.nextDouble();
            temperatura.add(valorTemp);
            soma = soma + valorTemp;
        }

        Double mediaTemp = soma / temperatura.size();

        System.out.println(temperatura);
        System.out.println("Valor da media da temperatura no primeiro semestre foi de " + mediaTemp + " celsius");

        for (double valorTemp : temperatura) {
            if (valorTemp > mediaTemp) {
                int index = temperatura.indexOf(valorTemp);
                switch (index) {
                    case 0:
                        System.out.println((index + 1) + " - JANEIRO: " + valorTemp + " celsius");
                        break;
                    case 1:
                        System.out.println((index + 1) + " - FEVEREIRO: " + valorTemp + " celsius");
                        break;
                    case 2:
                        System.out.println((index + 1) + " - MARÇO: " + valorTemp + " celsius");
                        break;
                    case 3:
                        System.out.println((index + 1) + " - ABRIL: " + valorTemp + " celsius");
                        break;
                    case 4:
                        System.out.println((index + 1) + " - MAIO: " + valorTemp + " celsius");
                        break;
                    case 5:
                        System.out.println((index + 1) + " - JUNHO: " + valorTemp + " celsius");
                        break;
                    default:
                        break;
                }
            }
        }

    }
}
