package es.imatia.redsocial;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
	/*BUSCAR POR NOMBRE UN USUARIO*/
	static Usuario buscarNombre(ArrayList<Usuario> usuarios,String nombre) {
		Usuario seguirSi=null;
		for(Usuario user: usuarios) {
            if(user.getNombre().equals(nombre)) {
            	 System.out.println("existe="+user);  
            	seguirSi=user;	
            } 
        }
		return seguirSi;
		}
/*BORRAR UN USUARIO*/
	static void deleteUser(ArrayList<Usuario> usuarios,String nombre) {
		
		for(Usuario user: usuarios) {		
			
			if(user.getNombre().equals(nombre)) {
				
				user=null;
						
			}
		}	
		
	}
	/*BORRAR UN post*/
	static void deletePost(ArrayList<Usuario> usuarios,String nombre,String titulo) {
		
		for(Usuario user: usuarios) {
			
			
			if(user.getNombre().equals(nombre)) {
				
				for(Post posts:user.getPosts()) {
					if(posts.getTitulo().equals(titulo)) {
						posts=null;
					}
					
				}
			}
		}	
		
		
	}/*BORRAR UN comentario*/
	static void deleteComentarioUser(ArrayList<Usuario> usuarios,String nombre,String tituloPost,String tituloComentario) {
	
		for(Usuario user:usuarios) {
			
			
			if(user.getNombre().equals(nombre)) {
				
				for(Post post:user.getPosts()) {
					if(post.getTitulo().equals(tituloPost)) {
						for(int j=0;j<post.getComentario().size();j++) {
							
							if(post.getComentario().get(j).getTitulo().equals(tituloComentario)) {
								post.getComentario().remove(j);
							}
						}
					}
					
				}
			}
		}	
		
		
	}
	/*LISTAR Post*/
	static void listarPostsUsers(ArrayList<Usuario> usuarios,String nombre) {
		
		for(Usuario user:usuarios) {
					
					
					if(user.getNombre().equals(nombre)) {
						
						for(Post posts:user.getPosts()) {
							
							posts.listarPost();
							
							
						}
					}
				}	
			}
	
	
	/*LISTAR COMENTARIOS DE UN POST*/
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
								post.listarNumeroComentarios();
									System.out.println(comentario.getTitulo());
									System.out.println(comentario.getTexto());
									System.out.println(comentario.getFecha());
							}
							}
							
						}
					}
				}	
		
	}
	public static void main(String[] args) {
		
		ArrayList<Usuario> usuarios= new ArrayList<>(); 
		Usuario manuel= new Usuario("manuel");
		System.out.println(manuel);
		Usuario Jose= new Usuario("pepe");
		System.out.println(Jose);
		Usuario ana= new Usuario("Ana");
		System.out.println(ana);
		
		
		usuarios.add(manuel);
		usuarios.add(Jose);
		usuarios.add(ana);
		buscarNombre(usuarios,"pepe");
		manuel.seguirUsuario(ana);
		manuel.noSeguirUsuario(ana);
		deleteUser(usuarios,"manuel");
	
		Tipos tipos=Tipos.VIDEO;
		switch(tipos) {
		
		case IMAGEN:
			Post te=new Post(LocalDateTime.now(), "manuel",Tipos.IMAGEN,"ET","200,300");
			


			break;
		case VIDEO:
			Post te2=new Post(LocalDateTime.now(), "antonio",Tipos.IMAGEN,"ET",Calidad.MEDIA,45);
			Post te3=new Post(LocalDateTime.now(), "fernando",Tipos.IMAGEN,"JOSE",Calidad.MEDIA,45);
			Jose.setPosts(te2);
			Jose.setPosts(te3);
			Comentarios comentario1=new Comentarios("comentario1", LocalDateTime.now(), Jose,"Titulo1");
			Comentarios comentario12=new Comentarios("comentario2", LocalDateTime.now(), Jose,"Titulo2");
			Comentarios comentario122=new Comentarios("comentario2", LocalDateTime.now(), Jose,"Otro");
			te2.setComentario(comentario1);
			te2.setComentario(comentario12);
			te3.setComentario(comentario122);
			break;
		case TEXTO:
			
			break;
		default:
		
		}
		
		try (Scanner sn = new Scanner(System.in)) {
			boolean salir = false;
			int opcion; //Guardaremos la opcion del usuario
 
			while (!salir) {
 
			    System.out.println("1. Añadir Usuario");
			    System.out.println("2. Añadir Post");
			    System.out.println("3. Añadir Comentario");
			    System.out.println("4. Seguir Usuario");
			    System.out.println("5. Dejar de seguir usuario");
			    System.out.println("6. Eliminar Usuario");
			    System.out.println("7. Eliminar Post");
			    System.out.println("8. Eliminar Comentario");
			    System.out.println("9. Listar todos los post de un usuario");
			    System.out.println("10. Listar los comentarios de un usario");
			    System.out.println("11. Mostrar el número de comentarios que tiene un post");
			    System.out.println("12. Salir");
 
			    try {
 
			        System.out.println("Escribe una de las opciones");
			        opcion = sn.nextInt();
 
			        switch (opcion) {
			            case 1:
			            	 sn.nextLine();
			                System.out.println("Ingresa el nomre de Usuario");
			                String nombre=sn.nextLine();
			                Usuario nuevo= new Usuario(nombre);
			                System.out.println("Usuario Creado="+nombre);
			                break;
			            case 2:
			            	  sn.nextLine();
			                  System.out.println("Ingresa tú nombre de Usuario");
			                  String nombre1=sn.nextLine();
			                  	/*como hacer el submenu*/	
			                  //sn.nextLine();
			                  System.out.println("Ingresa tipo de post");
			                  String usuarioSeguir=sn.nextLine();
			                Post te2=new Post(LocalDateTime.now(), nombre1,Tipos.IMAGEN,"ET",Calidad.MEDIA,45);
			                break;
			            case 3:
			                System.out.println("Has seleccionado la opcion 3");
			                break;
			            case 4:
			            	
			                 sn.nextLine();
			                 System.out.println("Ingresa tú nombre de Usuario");
			                 String nombre11=sn.nextLine();
			                 	if(buscarNombre(usuarios,nombre11)!=null) {
			                 		Usuario user =buscarNombre(usuarios,nombre11);
			                 		System.out.println("Ingresa el nombre del Usuario a Seguir");
			                 		String usuarioSeguir1=sn.nextLine();
			                 		user.seguirUsuario(buscarNombre(usuarios,usuarioSeguir1));
			                 	}
			            	break;
			            case 5:
			            	 sn.nextLine();
			                 System.out.println("Ingresa tú nombre de Usuario");
			                 String dejaSeguir=sn.nextLine();
			                 	if(buscarNombre(usuarios,dejaSeguir)!=null) {
			                 		Usuario user =buscarNombre(usuarios,dejaSeguir);
			                 		System.out.println("Ingresa el nombre del Usuario a dejar de Seguir");
			                 		String dejaSeguir1=sn.nextLine();
			                 		user.noSeguirUsuario(buscarNombre(usuarios,dejaSeguir1));
			                 	}
			            	break;
			            case 6:
			            	sn.nextLine();
			            	System.out.println("Ingresa tú nombre de Usuario");
			            	String eliminarUsuario1=sn.nextLine();
			            	deleteUser(usuarios, eliminarUsuario1);
			            	break;
			            case 7:
			            	sn.nextLine();
			            	System.out.println("Ingresa tú nombre de Usuario");
			            	String eliminarUsuario=sn.nextLine();
			             	if(buscarNombre(usuarios,eliminarUsuario)!=null) {
			             		Usuario user =buscarNombre(usuarios,eliminarUsuario);
			             		System.out.println("Ingresa el nombre del post a borrar");
			             		String borrarPost=sn.nextLine();
			             		user.eliminarPost(borrarPost);
			             	}
			            	break;
			            case 8:
			            	sn.nextLine();
			            	System.out.println("Ingresa tú nombre de Usuario");
			            	String nombreUsuario=sn.nextLine();
			            	sn.nextLine();
			            	System.out.println("Ingresa tú nombre de Post");
			            	String nombrePost=sn.nextLine();
			            	sn.nextLine();
			            	System.out.println("Ingresa titulo comentario");
			            	String nombreComentario=sn.nextLine();
			            	deleteComentarioUser(usuarios,nombreUsuario,nombrePost,nombreComentario);
			            	break;
			            case 9:
			            	sn.nextLine();
			            	
			           	 	System.out.println("Ingresa tú nombre de Usuario");
			                String nombre111=sn.nextLine();

			                System.out.println("nombre111="+nombre111);
			                listarPostsUsers(usuarios,nombre111);
			           	sn.nextLine();
			            	
			            	break;
			            case 10:
			            	sn.nextLine();
			            	
			            	 System.out.println("Ingresa tú nombre de Usuario");
			                 String nombreUsuario1=sn.nextLine();
			                 System.out.println("Ingresa Título del Post");
			                 String tituloPost=sn.nextLine();
			                 
			                 sn.nextLine();
			                
			            	listarComentarios(usuarios,nombreUsuario1,tituloPost);
			            	sn.nextLine();
			            	break;
			            case 11:
			            	sn.nextLine();
			            	
			           	 System.out.println("Ingresa tú nombre de Usuario");
			                String nombreUsuarioUsuario=sn.nextLine();
			                System.out.println("Ingresa Título del Post");
			                String tituloPostUsuario=sn.nextLine();
			                
			                sn.nextLine();
			            	listarComentarios(usuarios,nombreUsuarioUsuario,tituloPostUsuario);
			            	sn.nextLine();
			            	break;
			            case 12:
			                salir = true;
			                break;
			            default:
			                System.out.println("Solo números entre 1 y 4");
			        }
			    } catch (InputMismatchException e) {
			        System.out.println("Debes insertar un número");
			        sn.next();
			    }
			}
		}
 
	}
	/******************************************************************************/


}
