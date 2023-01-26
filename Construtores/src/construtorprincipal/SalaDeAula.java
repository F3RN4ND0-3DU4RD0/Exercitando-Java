package construtorprincipal;
/*
 * Exercicio com a utilização de construtor.
 * Crie uma classe Aluno, que tenha um construtor e
 * na classe principal desenvolva código para calcular a média
 * de 4 notas de um Aluno.
 * Após isto, mostre na tela se ele está aprovado, de recuperação ou foi reprovado.
 */
public class SalaDeAula {

	public static void main(String[] args) {
		//Instanciando objeto Aluno
		Aluno aluno = new Aluno(7, 6, 7, 2);
		
		//Criação da variável média
		float media = (aluno.nota1 + aluno.nota2 + aluno.nota3 + aluno.nota4)/4;
		
		//Cálculo da média.
		if (media > 7) {
			System.out.println("Aprovado com excelência!");
			System.out.println("Sua média foi de: " + media);
		} else if(media > 5.5){
			System.out.println("Aluno foi Aprovado.");
			System.out.println("Sua média foi de: " + media);
		}else {
			System.out.println("Aluno está Reprovado.");
			System.out.println("Sua média foi de: " + media);
		}
		
	}
}
