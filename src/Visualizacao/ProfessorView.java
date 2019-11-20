/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualizacao;

/**
 *
 * @author hochforce
 */
public class ProfessorView {

    public void imprimeDetalhesProfessor(String professorNome, String professorSobrenome, Integer professorId, Integer professorIdade) {
        System.out.println("\nProfessor ");
        System.out.println("Id: "+professorId);
        System.out.println("Nome: "+professorNome);
        System.out.println("Sobrenome: "+professorSobrenome);
        System.out.println("Idade: "+professorIdade+"\n");
    }
}
