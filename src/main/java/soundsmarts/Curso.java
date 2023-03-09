package soundsmarts;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Curso {
	
	public Curso() {
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Integer id;
	private String nome;
	private Integer id_preço;
	private Integer id_intrumento;
	
	
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
	public Integer getId_preço() {
		return id_preço;
	}
	public void setId_preço(Integer id_preço) {
		this.id_preço = id_preço;
	}
	public Integer getId_intrumento() {
		return id_intrumento;
	}
	public void setId_intrumento(Integer id_intrumento) {
		this.id_intrumento = id_intrumento;
	}
}
