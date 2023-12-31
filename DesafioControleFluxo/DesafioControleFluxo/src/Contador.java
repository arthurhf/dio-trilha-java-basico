import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        //Adicionei o try catch para pegar exceção também no input do usuário
        try {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		} catch (Exception exception){
            System.out.println("Os parâmetros de entrada devem ser números do tipo inteiro.");
        }

	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }

		int contagem = parametroDois - parametroUm;

        //realizar o for para imprimir os números com base na variável contagem

        for(int passo=1;passo<=contagem;passo++){

            System.out.println("Imprimindo o número "+passo);
        }
	}
}
