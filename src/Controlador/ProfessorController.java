
package Controlador;

public class ProfessorController {
    private Modelo.ProfessorModel professor;
    private Visualizacao.ProfessorView view;
    private Modelo.ProfessorService service;
    
    public ProfessorController(Modelo.ProfessorModel model, Visualizacao.ProfessorView view){
        this.professor = model;
        this.view = view;
    }
    
    public ProfessorController(Modelo.ProfessorService service, Visualizacao.ProfessorView view){
        this.service = service;
        this.view = view;
    }
    
    public void setProfessorNome(String nome){
        professor.setNome(nome);
    }
    
    public String getProfessorNome(){
        return professor.getNome();
    }
    
    public void setProfessorId(Integer id){
        professor.setId(id);
    }
    
    public Integer getProfessorId(){
        return professor.getId();
    }
    
    public void setProfessorSobrenome(String sobrenome){
        professor.setSobrenome(sobrenome);
    }
    
    public String getProfessorSobrenome(){
        return professor.getSobrenome();
    }
    
    public void imprimirProfessores(){
        for (Modelo.ProfessorModel professor : service.getProfessores()) {
           view.imprimeDetalhesProfessor(professor.getNome(), professor.getSobrenome(), professor.getId(), professor.getIdade()); 
        }
    }
    
    public void alterarView(){
        view.imprimeDetalhesProfessor(professor.getNome(), professor.getSobrenome(), professor.getId(), professor.getIdade());
    }
}
