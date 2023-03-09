package soundsmarts;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Professor {
	
	
	public Professor(){
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nome;
	private Integer id_curso;
	private double avaliacoes;
	private Integer id_instrumento;

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
	public Integer getId_curso() {
		return id_curso;
	}
	public void setId_curso(Integer id_curso) {
		this.id_curso = id_curso;
	}
	public double getAvaliacoes() {
		return avaliacoes;
	}
	public void setAvaliacoes(double avaliacoes) {
		this.avaliacoes = avaliacoes;
	}
	public Integer getId_instrumento() {
		return id_instrumento;
	}
	public void setId_instrumento(Integer id_instrumento) {
		this.id_instrumento = id_instrumento;
	}
	
}