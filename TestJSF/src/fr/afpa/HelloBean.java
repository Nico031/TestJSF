package fr.afpa;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

	@ManagedBean	// bean g�r� par JSF - respecter les convetions de nommage.
	@SessionScoped	//stock�e dans la session (Si @RequestScoped => stock�e dans la requete )
	
	public class HelloBean implements Serializable {
	 
	    private static final long serialVersionUID = 1L;
	 
	    private String name;
	    
	    private String password;
	 
	    public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	   


}
