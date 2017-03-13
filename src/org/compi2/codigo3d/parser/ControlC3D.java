package org.compi2.codigo3d.parser;

/**
 *
 * @author esvux
 */
public class ControlC3D {
    
    private static int temp = 0;
    private static String c3d = "";
    private static int etq = 0;
    private static String etq_v = "";
    private static String etq_f = "";
    
    /**
     * Reinicia las variables estáticas relacionadas con la generación del
     * código de tres direcciones.
     */
    public static void reiniciar(){
        temp = 0;
        c3d = "";
        etq = 0;
        etq_v ="";
        etq_f = "";
    }
    
    /**
     * Genera el siguiente temporal.
     * @return El siguiente temporal (t$#)
     */
    public static String generaTemp(){
        return "t$"+temp++;
    }
    
    
     public static String generar_etiqueta(){
        return "L"+etq++;
    }
    /**
     * Agrega la sentencia que recibe como parámetro a la cadena de código
     * de tres direcciones que se va generando hasta ese momento.
     * @param sentencia Código 3D a agregar
     */
    public static void agregarC3D(String sentencia){
        c3d += sentencia;
    }
    
    /**
     * Devuelve el código 3D generao hasta el momento de su invocación.
     * @return Código 3D generado
     */
        public static String getC3D(){
        if(etq_v.equals("")||etq_f.equals("")){
            c3d += "Ultimo valor: t"+(temp-1);
            return c3d;
        }else{
            c3d += "Etiqueta(s) Verdadero: " + etq_v+"\n";
            c3d += "Etiqueta(s)  Falso: " + etq_f +"\n";
            return c3d;
        }
    }
    
    
        public static void agregar_Verdadero(String e){
        if(etq_v.equals("")){
            etq_v = e;
        }else{
            etq_v += ","+e;
        }
    }
    public static void agregar_Falso(String e){
        if(etq_f.equals("")){
            etq_f = e;
        }else{
            etq_f += ","+e;
        }
    }
}
