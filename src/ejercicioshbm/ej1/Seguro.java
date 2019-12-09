package ejercicioshbm.ej1;

import java.util.Date;

public class Seguro implements java.io.Serializable {

	private Integer idSeguro;
	private String nif;
	private String nombre;
	private String ape1;
	private String ape2;
	private Integer edad;
	private Integer sexo;
	private Character casado;
	private Integer numHijos;
	private Date fechaCreacion;
	private String tipoSeguro;

	public Seguro() {
	}

	public Seguro(String nif) {
		this.nif = nif;
	}

	public Seguro(String nif, String nombre, String ape1, String ape2, Integer edad, Integer sexo, Character casado,
			Integer numHijos, Date fechaCreacion, String tipoSeguro) {
		this.nif = nif;
		this.nombre = nombre;
		this.ape1 = ape1;
		this.ape2 = ape2;
		this.edad = edad;
		this.sexo = sexo;
		this.casado = casado;
		this.numHijos = numHijos;
		this.fechaCreacion = fechaCreacion;
		this.tipoSeguro = tipoSeguro;
	}

	public Integer getIdSeguro() {
		return this.idSeguro;
	}

	public void setIdSeguro(Integer idSeguro) {
		this.idSeguro = idSeguro;
	}

	public String getNif() {
		return this.nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApe1() {
		return this.ape1;
	}

	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}

	public String getApe2() {
		return this.ape2;
	}

	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}

	public Integer getEdad() {
		return this.edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getSexo() {
		return this.sexo;
	}

	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

	public Character getCasado() {
		return this.casado;
	}

	public void setCasado(Character casado) {
		this.casado = casado;
	}

	public Integer getNumHijos() {
		return this.numHijos;
	}

	public void setNumHijos(Integer numHijos) {
		this.numHijos = numHijos;
	}
	
	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	public String getTipoSeguro() {
		return this.tipoSeguro;
	}

	public void setTipoSeguro(String tipoSeguro) {
		this.tipoSeguro = tipoSeguro;
	}

	@Override
	public String toString() {
		return "Seguro [idSeguro=" + idSeguro + ", nif=" + nif + ", nombre=" + nombre + ", ape1=" + ape1 + ", ape2="
				+ ape2 + ", edad=" + edad + ", sexo=" + sexo + ", casado=" + casado + ", numHijos=" + numHijos
				+ ", fechaCreacion=" + fechaCreacion + ", tipoSeguro=" + tipoSeguro + "]";
	}

}
