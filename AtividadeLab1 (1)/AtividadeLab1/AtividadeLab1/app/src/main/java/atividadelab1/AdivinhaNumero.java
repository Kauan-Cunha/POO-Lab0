package atividadelab1;
import java.util.Random;
import java.util.Scanner;

//IMPLEMENTE O EXERCICIO ABAIXO
class AdivinhaNumero {
    int numeroSecreto;

    public AdivinhaNumero() {
        Random random = new Random();
        numeroSecreto = random.nextInt(100) + 1; // Número entre 1 e 100
        
    }

    
}