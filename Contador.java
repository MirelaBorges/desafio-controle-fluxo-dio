import java.util.Scanner;

public class Contador {

        public static void main(String[] args) {
            Scanner terminal = new Scanner(System.in);

            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            int Resultado = parametroDois - parametroUm;
            
            if (parametroUm < parametroDois)
            {  
            if (Resultado < parametroUm)
            System.out.println ("Você não tem numeros sobressalentes");       
            
              for (int atributo; parametroUm <= Resultado; parametroUm++){
                System.out.println (parametroUm);
            } 
            }
              else{
                    System.out.println ("O segundo parâmetro deve ser maior que o primeiro");
                }
                
            }
        }
