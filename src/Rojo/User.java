
package Rojo;




public class User {
    
    private String user;
    private String pass;
    private String nombre;
    private String apellido;
    private String sexo;

    public User(String user, String pass, String nombre, String apellido, String sexo) {
        this.user = user;
        this.pass = pass;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        
    }

    

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
}
