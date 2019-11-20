package Modelo;

public class EstudanteModel {
	 private Integer id;
	 private Integer idade;
	 private String nome;
	 private String sobrenome;
	 	   
	 public Integer getId() {
		 return id;
	 }
	   
	 public void setId(Integer id) {
		 this.id = id;
	 }
	   
	 public String getNome() {
	      return nome;
	 }
	   
	 public void setNome(String nome) {
		 this.nome = nome;
	 }

	 public Integer getIdade() {
		return idade;
	 }

	 public void setIdade(Integer idade) {
		this.idade = idade;
	 }

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}
