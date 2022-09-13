package es.imatia.redsocial;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

/*
 * Contendrá fecha y lista de comentarios. 
 * Además, podrá ser un texto (que deberá tener un String con el contenido), 
 * una imagen (deberá tener un título y dimensiones) o un vídeo (que tendrá título, calidad y duración en segundos).
*/
public class Post {
	
	private LocalDateTime fecha;
	
	private Tipos tipo;
	private String usuario;
	private ArrayList<Comentarios> comentario = new ArrayList<Comentarios>();
	private String titulo;
	private String contenido;
	private String dimensiones;
	private Calidad calidad;
	private int duracion;
	
	public Post(LocalDateTime fecha, String usuario,Tipos tipo, String contenido) {//TIPO TEXTO
		super();
		this.fecha = fecha;
		this.usuario = usuario;
		this.tipo=tipo;
		this.contenido=contenido;
		System.out.println(this.comentario);
	}
	public Post(LocalDateTime fecha, String usuario,Tipos tipo,String titulo,String dimensiones) {//TIPO IMAGEN
		super();
		this.fecha = fecha;
		this.usuario = usuario;
		this.tipo=tipo;
		this.titulo=titulo;
		this.dimensiones=dimensiones;
		System.out.println(this.comentario);
	}
	public Post(LocalDateTime fecha, String usuario,Tipos tipo,String titulo,Calidad calidad, int duracion) {//TIPO VIDEO
		super();
		this.fecha = fecha;
		this.usuario = usuario;
		this.tipo=tipo;
		this.titulo=titulo;
		this.calidad=calidad;
		this.duracion=duracion;
		System.out.println(this.comentario);
	}
	public ArrayList<Comentarios> getComentario() {
		return comentario;
	}
	public void setComentario(Comentarios comentario) {
		this.comentario.add(comentario);
	}
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getContenido() {
		return this.contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public String getDimensiones() {
		return dimensiones;
	}
	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}
	public Calidad getCalidad() {
		return calidad;
	}
	public void setCalidad(Calidad calidad) {
		this.calidad = calidad;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Tipos getTipo() {
		return tipo;
	}

	public void setTipo(Tipos tipo) {
		this.tipo = tipo;
		System.out.println(this.tipo);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public void listarPost() {
		System.out.println("Título Post="+this.getTitulo());
		System.out.println("Contenido="+this.getContenido()+"/n");
		
	}
	public void listarNumeroComentarios() {
		System.out.println("Numero de Comentarios="+this.getComentario().size());
		
	}
	

}
