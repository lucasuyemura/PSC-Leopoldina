import java.util.Scanner;

public class DiarioNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha sua opção de acordo com sua necessidade: [1] Aluno | [2] Professor: ");
        String usuario = sc.nextLine();
        
        switch (usuario) {
            case "1":
            System.out.println("Aluno");
            
            break;

            case "2":
            System.out.println("Professor");
            
            break;
        
            default:
            System.out.println("Entrada inválida");
            break;   
        
            }
            }
        }
    