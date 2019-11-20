
package Controlador;

public class EstudanteController {
	   private Modelo.EstudanteModel estudante;
	   private Visualizacao.EstudanteView view;
	   private Modelo.EstudanteService service;

	   public EstudanteController(Modelo.EstudanteModel model, Visualizacao.EstudanteView view){
	      this.estudante = model;
	      this.view = view;
	   }
	   
	   public EstudanteController(Modelo.EstudanteService service, Visualizacao.EstudanteView view){
		      this.service = service;
		      this.view = view;
		   }


	   public void setEstudanteNome(String nome){
	      estudante.setNome(nome);		
	   }

	   public String getEstudanteNome(){
	      return estudante.getNome();		
	   }

	   public void setEstudanteId(Integer id){
	      estudante.setId(id);		
	   }

	   public Integer getEstudanteId(){
	      return estudante.getId();		
	   }
	   
	   public void imprimirEstudantes(){
		   for (Modelo.EstudanteModel estudante : service.getEstudantes()) {
			   view.imprimeDetalhesEstudante(estudante.getNome(), estudante.getSobrenome(), estudante.getId(), estudante.getIdade());
		   }
	   }	
	   
	   public void alterarView(){				
	      view.imprimeDetalhesEstudante(estudante.getNome(), estudante.getSobrenome(), estudante.getId(),estudante.getIdade());
	   }	
	}
