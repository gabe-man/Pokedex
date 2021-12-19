package models;

public class Usuario {
	private String usuario;
	private String contrase�a;
	
	public Usuario(String usuario, String contrase�a) {
		super();
		this.usuario = usuario;
		this.contrase�a = contrase�a;
	}

	public String getUsuario() {
		return usuario;
	}
	
	private String getcontrase�a() {
		return contrase�a;
	}
	
	public boolean comprobarContrase�a(String contrase�a)
	{
		if(contrase�a.equals(getcontrase�a()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public String toString() {
		return "Usuario [usuario=" + usuario + "]";
	}
	
	
	
	

}
