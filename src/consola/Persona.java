package consola;

import java.util.Iterator;

public class Persona implements Iterable<String>{
	private int codigo;
	private String nombre;
	
	public Persona() {
		this(0, ""); 
	}
	
	public Persona(int codigo, String nombre){
		super(); 
		setCodigo(codigo);
		setNombre(nombre);
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [Codigo()=" + getCodigo() + 
				", Nombre()=" + getNombre() + "]";
	}

	@Override
	public Iterator<String> iterator() {
		Iterator<String> it = new Iterator<String>() {
			int n = 0; 
			@Override
			public boolean hasNext() {
				//Nos dice si hay más elementos
				return n<2;  // 0 --> codigo
							//	1 --> nombre
			}

			@Override
			public String next() {
				String cadena = ""; 
				switch (n) {
				case 0: 
					cadena = Integer.toString(getCodigo()); 
					break;
				case 1: 
					cadena = getNombre(); 
					break; 
				}
				n++; 
				return cadena; 
			}
		};
		return it; 
	} 
}//fin class consola.Persona
