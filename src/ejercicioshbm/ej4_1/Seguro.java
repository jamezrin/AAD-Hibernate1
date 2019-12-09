package ejercicioshbm.ej4_1;

import java.util.Arrays;
import java.util.Date;

public class Seguro implements java.io.Serializable {

	private Integer idSeguro;
	private String nif;
	private String nombre;
	private String ape1;
	private String ape2;
	private Integer edad;
	private Sexo sexo;
	private boolean casado;
	private Integer numHijos;
	private Date fechaCreacion;
	private TipoSeguro tipoSeguro;
	private Boolean mayorEdad;
	private Date fechaNacimiento;
	private Date horaContacto;
	private char[] claves;
	private String comentarios;

	public Seguro() {
	}

	public Seguro(String nif) {
		this.nif = nif;
	}

	public Seguro(String nif, String nombre, String ape1, String ape2, Integer edad, Sexo sexo, boolean casado,
			Integer numHijos, Date fechaCreacion, TipoSeguro tipoSeguro, Date fechaNacimiento, 
			Date horaContacto, char[] claves, String comentarios) {
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
		this.fechaNacimiento = fechaNacimiento;
		this.horaContacto = horaContacto;
		this.claves = claves;
		this.comentarios = comentarios;
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

	public Sexo getSexo() {
		return this.sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public boolean getCasado() {
		return this.casado;
	}

	public void setCasado(boolean casado) {
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
	
	public TipoSeguro getTipoSeguro() {
		return this.tipoSeguro;
	}

	public void setTipoSeguro(TipoSeguro tipoSeguro) {
		this.tipoSeguro = tipoSeguro;
	}
	
	public Boolean getMayorEdad() {
		return mayorEdad;
	}

	public void setMayorEdad(Boolean mayorEdad) {
		this.mayorEdad = mayorEdad;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Date getHoraContacto() {
		return horaContacto;
	}

	public void setHoraContacto(Date horaContacto) {
		this.horaContacto = horaContacto;
	}
	
	public char[] getClaves() {
		return claves;
	}

	public void setClaves(char[] claves) {
		this.claves = claves;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
	enum TipoSeguro {
		HOGAR, COCHE, MOTO, VIAJE
	}
	
	enum Sexo {
		HOMBRE, MUJER
	}

	@Override
	public String toString() {
		return "Seguro [idSeguro=" + idSeguro + ", nif=" + nif + ", nombre=" + nombre + ", ape1=" + ape1 + ", ape2="
				+ ape2 + ", edad=" + edad + ", sexo=" + sexo + ", casado=" + casado + ", numHijos=" + numHijos
				+ ", fechaCreacion=" + fechaCreacion + ", tipoSeguro=" + tipoSeguro + ", mayorEdad=" + mayorEdad
				+ ", fechaNacimiento=" + fechaNacimiento + ", horaContacto=" + horaContacto + ", claves="
				+ Arrays.toString(claves) + ", comentarios=" + comentarios + "]";
	}
}
