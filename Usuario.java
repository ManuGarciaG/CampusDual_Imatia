package es.imatia.redsocial;

import java.util.ArrayList;
import java.util.Objects;

/*
 * 
 * Contendrá nombre, una lista de los usuarios a los que sigue, lista de posts.
 * 
 * */

public class Usuario {

	private String nombre;
	private ArrayList<Usuario> seguidores = new ArrayList<>();
	private ArrayList<Post> posts = new ArrayList<>();
	
	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
		System.out.println("SE HA CREADO ESTE USUARIO:"+this);

	}
	public Usuario(String nombre, ArrayList<Usuario> seguidores, ArrayList<Post> posts) {
		super();
		this.nombre = nombre;
		this.seguidores = seguidores;
		this.posts = posts;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Usuario> getSeguidores() {
		return seguidores;
	}

	public void setSeguidores(ArrayList<Usuario> seguidores) {
		this.seguidores = seguidores;
	}

	public ArrayList<Post> getPosts() {
		return posts;
	}

	public void setPosts(Post posts) {
		this.posts.add(posts);
	
	}
	public String validateUsuario() {
		/*funcion para validar si el usuario existe*/
		return "";
	}
	public void seguirUsuario(Usuario user) {
		System.out.println("ENTRO"+this.seguidores.size());
		if(this.seguidores.size()==0) {
			this.seguidores.add(user);
			System.out.println(this.nombre+" está siguiendo a "+user.nombre);			
		}else {
		for(int i=0;i<this.seguidores.size();i++) {
			
			if(this.seguidores.get(i)==user) {
				
				System.out.println("Ya sigues a este usuario");
			}else {
				
				this.seguidores.add(user);
				System.out.println(this.nombre+" está siguiendo a "+user.nombre);			
			}
		}	
		}
	}
	public void noSeguirUsuario(Usuario user) {
		if(this.seguidores.size()==0) {
			System.out.println(this.nombre+" no estás siguiendo a "+user.nombre);	
		}else {
		for(int i=0;i<this.seguidores.size();i++) {
			
			if(this.seguidores.get(i)==user) {
				this.seguidores.remove(i);
				System.out.println("Ya NO sigues a este usuario");
			}else {
				
				System.out.println(this.nombre+" no estás siguiendo a "+user.nombre);			
			}
		}	
		}
	}	
	
	public static void listarComentarios(ArrayList<Usuario> usuarios,String nombre,String titulo) {
		System.out.println("dentro funcion");
		
		for(Usuario user: usuarios){
					
			System.out.println("for 1");
					if(user.getNombre().equals(nombre)) {
						
						for(Post post:user.getPosts()) {
							System.out.println("for 2 GETTITULO="+post.getTitulo());
							System.out.println("for 2 TITULO="+titulo);
							System.out.println("for 2 COMPARACION="+Objects.equals(post.getTitulo(),titulo));
							
							if(post.getTitulo().equals(titulo)) {
								System.out.println("if");
								for(Comentarios comentario:post.getComentario()) {
								//post.listarNumeroComentarios();
									System.out.println(comentario.getTitulo());
									System.out.println(comentario.getTexto());
									System.out.println(comentario.getFecha());
							}
							}
							
						}
					}
				}	
		
	}
	public void eliminarPost(String titulo) {
		for(Post mispost:this.posts) {
			if(mispost.getTitulo().equals(titulo)) {
				System.out.println("BORRADO"+mispost.getTitulo());
				mispost=null;
			}
		}
	}
	
}
