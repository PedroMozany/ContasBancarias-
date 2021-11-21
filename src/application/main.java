package application;
/**
 * Classe basica de teste.
 */
public class main {

	public static void main(String[] args) {
		Aluno alunos = new Aluno("Davi Santos", 1101);
		Aluno alunos2 = new Aluno("Davi Santos", 1102);
		System.out.println(alunos.smallerThan(alunos2));
		Aluno alunos3 = new Aluno("Davi Santos", 1103);
		Aluno alunos4 = new Aluno("Davi Santos", 1104);
		Aluno alunos5 = new Aluno("Davi Santos", 1105);
		Aluno alunos6 = new Aluno("Davi Santos", 1106);
		Aluno alunos7 = new Aluno("Davi Santos", 1107);
		Aluno alunos8 = new Aluno("Davi Santos", 1108);
		abb<Aluno> arvore = new abb((Aluno)alunos4);
		arvore.insert(alunos2, arvore);
		arvore.insert(alunos7, arvore);
		arvore.insert(alunos, arvore);
		arvore.insert(alunos6, arvore);
		arvore.insert(alunos5, arvore);
		arvore.insert(alunos3, arvore);
		System.out.println(arvore.inOrder(arvore));
		if(arvore.search(alunos8, arvore) !=null)
			System.out.println(arvore.search(alunos8, arvore).dice());
		
	}

}
