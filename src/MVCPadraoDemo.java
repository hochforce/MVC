
public class MVCPadraoDemo {

    public static void main(String[] args) {
        

        //Cria a view para escrever os detalhes do estudante no console
        Visualizacao.EstudanteView estudanteView = new Visualizacao.EstudanteView();
        Modelo.EstudanteService estudanteService = new Modelo.EstudanteService();
        estudanteService.loadEstudantes();
        
        // Instancia o controlador para a classe estudante
        Controlador.EstudanteController estudanteController = new Controlador.EstudanteController(estudanteService, estudanteView);
        estudanteController.imprimirEstudantes();


        //Cria a view para escrever os detalhes do estudante no console
        Visualizacao.ProfessorView professorView = new Visualizacao.ProfessorView();
        Modelo.ProfessorService professorService = new Modelo.ProfessorService();
        professorService.loadProfessores();
        
        // Instancia o controlador para a classe estudante
        Controlador.ProfessorController professorController = new Controlador.ProfessorController(professorService, professorView);
        professorController.imprimirProfessores();

    }

}
