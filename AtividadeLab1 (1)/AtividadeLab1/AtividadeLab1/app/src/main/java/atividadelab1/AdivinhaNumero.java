package atividadelab1;
import java.util.Random;
import java.util.Scanner;

//IMPLEMENTE O EXERCICIO ABAIXO
class AdivinhaNumero {
    int numeroSecreto;
    int numTentativas;
    int palpiteAtual;
    public AdivinhaNumero() {
        Random random = new Random();
        numeroSecreto = random.nextInt(100) + 1;// Número entre 1 e 100
        numTentativas = 0;
    }
    public void fazPalpite(){
        Scanner leitor = new Scanner(System.in);
        int palpite = leitor.nextInt();

        palpiteAtual = palpite;
        numTentativas +=1;
    }
    public boolean verificaPalpite(){
        if(palpiteAtual == numeroSecreto){
            System.out.println("Palpite Correto");
            return true;
        } else if (palpiteAtual > numeroSecreto){
            System.out.println("Palpite maior que número secreto");
            return false;
        }
        System.out.println("Palpite menor que número secreto");
        return false;
    }
    public void imprimeTentativas(){
        System.out.println(numTentativas);
    }
    
}