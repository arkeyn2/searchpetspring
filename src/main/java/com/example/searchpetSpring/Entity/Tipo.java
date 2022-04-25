package com.example.searchpetSpring.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "tipos")
public class Tipo implements Serializable {

	@Id
	@NotNull
	private Long id;

	@NotNull
	private String nombre;

	@NotNull
	private String detalle;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	private static final long serialVersionUID = 1L;
}
