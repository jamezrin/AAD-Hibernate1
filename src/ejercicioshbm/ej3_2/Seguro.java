package ejercicioshbm.ej3_2;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Formula;

@Entity
@Table(name = "seguro", catalog = "seguros", uniqueConstraints = @UniqueConstraint(columnNames = "nif"))
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
	private Boolean mayorEdad;

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

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idSeguro", unique = true, nullable = false)
	public Integer getIdSeguro() {
		return this.idSeguro;
	}

	public void setIdSeguro(Integer idSeguro) {
		this.idSeguro = idSeguro;
	}

	@Column(name = "nif", unique = true, nullable = false)
	public String getNif() {
		return this.nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	@Column(name = "nombre")
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "ape1")
	public String getApe1() {
		return this.ape1;
	}

	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}

	@Column(name = "ape2")
	public String getApe2() {
		return this.ape2;
	}

	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}

	@Column(name = "edad")
	public Integer getEdad() {
		return this.edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Column(name = "sexo")
	public Integer getSexo() {
		return this.sexo;
	}

	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

	@Column(name = "casado", length = 1)
	public Character getCasado() {
		return this.casado;
	}

	public void setCasado(Character casado) {
		this.casado = casado;
	}

	@Column(name = "numHijos")
	public Integer getNumHijos() {
		return this.numHijos;
	}

	public void setNumHijos(Integer numHijos) {
		this.numHijos = numHijos;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaCreacion", length = 19)
	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@Column(name = "tipoSeguro")
	public String getTipoSeguro() {
		return this.tipoSeguro;
	}

	public void setTipoSeguro(String tipoSeguro) {
		this.tipoSeguro = tipoSeguro;
	}
	
	@Formula(value = "edad >= 18")
	public Boolean getMayorEdad() {
		return mayorEdad;
	}

	public void setMayorEdad(Boolean mayorEdad) {
		this.mayorEdad = mayorEdad;
	}

	@Override
	public String toString() {
		return "Seguro [idSeguro=" + idSeguro + ", nif=" + nif + ", nombre=" + nombre + ", ape1=" + ape1 + ", ape2="
				+ ape2 + ", edad=" + edad + ", sexo=" + sexo + ", casado=" + casado + ", numHijos=" + numHijos
				+ ", fechaCreacion=" + fechaCreacion + ", tipoSeguro=" + tipoSeguro + ", mayorEdad=" + mayorEdad + "]";
	}
}
