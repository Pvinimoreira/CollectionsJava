import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioList2 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        List<String> perguntas = new ArrayList();

        System.out.println("Digite s para sim e n para não.");
        System.out.println("Telefonou para a vítima?");
        String resposta = dados.next();
        perguntas.add(resposta);

        System.out.println("Esteve no local do crime?");
        resposta = dados.next();
        perguntas.add(resposta);

        System.out.println("Mora perto da vítima?");
        resposta = dados.next();
        perguntas.add(resposta);

        System.out.println("Devia para a vítima?");
        resposta = dados.next();
        perguntas.add(resposta);

        System.out.println("Já trabalhou com a vítima?");
        resposta = dados.next();
        perguntas.add(resposta);

        System.out.println(perguntas);

        int resultado = 0;

        Iterator<String> contador = perguntas.iterator();
        while (contador.hasNext()){
            String soma = contador.next();
            if(soma.contains("s")){
                resultado++;
            }

        }

        switch(resultado) {
            case 2:

            case 3:
                System.out.println(" SUSPEITA ");
                break;
            case 4:
                System.out.println(" CÚMPLICE ");
                break;
            case 5:
                System.out.println(" ASSASSINO ");
                break;
            default:
                System.out.println(" INOCENTE ");
                break;
        }
    }
 }
