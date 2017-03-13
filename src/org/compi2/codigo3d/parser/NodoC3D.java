package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private String etq_v;
    private String etq_f;

    public NodoC3D(String cad) {
        this.cad = cad;
        this.etq_v= "";
        this.etq_f = "";
    }
    
       public NodoC3D(String cad,String v, String f) {
        this.cad = cad;
        this.etq_v = v;
        this.etq_f = f;
    }
    
    public String getCad(){
        return cad;
    }
        
    public String get_ev() {
        return etq_v;
    }

    public void set_ev(String e) {
        this.etq_v = e;
    }

    public String get_ef() {
        return etq_f;
    }

    public void set_ef(String e) {
        this.etq_f = e;
    }

}
