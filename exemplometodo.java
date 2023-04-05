import java.util.Arrays;
import java.util.Random;
public class exemplometodo{
    public static void main(String[] args) {

        //Programa para gerar um valor aleatorio entre 0 e 10
        //utilizando o classe random do pacoote java.util.random
        //e o metodo nexint para gerar o valor aleatorio
        Random rand = new Random();
        int randomNumber = rand.nextInt(11);
        System.out.println("O número aleatório gerado é: " + randomNumber);


        //Este exercicio utiliza a classe random para a
        // criacao de uma senha com o comprimento da senha
        //ja defenido, atraves do metodo nexint ele ira gerar
        //de forma aleatoria o indice de cada caratere e adicionando
        //este caratere a senha.
        int length = 10;
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        //Random rand = new Random();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = rand.nextInt(characters.length());
            password.append(characters.charAt(randomIndex));
        }
        int[] array = new int[0];
        System.out.println("A senha gerada é: " + password.toString());


        //Para este exercicio foi impotado a classe random e arrays foi criadouma instância da classe Random
        //e definido um array de inteiros depois o array sera percorrido e ira gerar um valor aleatorio
        //usando o método nextint ele trocara os elemntos de lugar conforme o indice gerado
        array = new int[]{1, 2, 3, 4, 5};
        //Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomIndex = rand.nextInt(array.length);
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
        System.out.println("O array embaralhado é: " + Arrays.toString(array));

    }
}
