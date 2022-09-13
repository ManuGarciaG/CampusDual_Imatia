package es.imatia.redsocial;

import java.time.LocalDateTime;


/*
 * Los comentarios tendrán un texto, una fecha y un propietario que ha de ser un usuario.
*/
public class Comentarios {
	private String texto;

	private LocalDateTime fecha;
	private Usuario propietario;
	private String titulo;
	
	public Comentarios(String texto, LocalDateTime fecha, Usuario propietario,String titulo) {
		super();
		this.texto = texto;
		this.fecha = fecha;
		this.propietario = propietario;
		this.titulo=titulo;
	}
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Usuario getPropietario() {
		return propietario;
	}

	public void setPropietario(Usuario propietario) {
		this.propietario = propietario;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void listarComentarios() {
		System.out.println("Título Comentario="+this.getTitulo());
		System.out.println("Texto="+this.getTexto()+"/n");
	}

}
