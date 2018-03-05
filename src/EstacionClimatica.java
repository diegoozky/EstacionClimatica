
import java.util.Scanner; 
/**
 * 
 * @author diego
 *
 */
public class EstacionClimatica 
{ 
    // instance variables - replace the example below with your own 
	/**
	 * definimos parametros
	 */
    private String nombre; 
    private int a�o; 
    private TempHumDia mediciones[];  // Tabla de mediciones 
    private int nummediciones;      // Número de mediciones almacenadas 

    /** 
     * Constructor for objects of class EstacionClimatica 
     */ 
    public EstacionClimatica() 
    { 
         this.nombre = ""; 
         this.a�o = 2000;  
         mediciones = new TempHumDia[366];  // Por si el año es bisiesto.  
         nummediciones = 0; 
    } 
    /**
     * constructor con parametros
     * @param nombre
     * @param a�o
     */
    public EstacionClimatica( String nombre, int a�o) 
    { 
         this(); // Llamo al constructor por defecto 
         this.nombre = nombre; 
         this.a�o = a�o; 
         
    } 
    /**
     * Se a�ade una fecha con otros datos a la tabla
     * @param media
     * @return metido
     */
    public boolean addDia ( TempHumDia media){ 
    	boolean metido = true;
    	for(int i = 0; i<mediciones.length;i++) {
    		if (mediciones[i] == null) {
    			mediciones[i] = media;
    		}
    		if(mediciones[i].getA�oMedicion()!=media.getA�oMedicion()) {
    			mediciones[i] = null;
    			metido = false;
    		}
    	}
        return metido; // COMPLETAR 
    } 
    /**
     * Se elimina una fecha
     * @param media
     * @return true
     */
    public boolean delDia ( TempHumDia media){ 
    	for(int i = 0; i<mediciones.length ; i++) {
    		if(media.getDiaMedicion() == mediciones[i].getDiaMedicion() && media.getMesMedicion() == mediciones[i].getMesMedicion()
    				&& media.getA�oMedicion() == mediciones[i].getA�oMedicion()) {
    			mediciones[i]= null;
    		}
    	}
        return true;  // COMPLETAR 
    } 
    
    public void listarDias(){ 
    	for(int i = 0; i<mediciones.length;i++) {
           if (mediciones[i]!= null) {
        	  mediciones[i].toString();
           }

    	}
     
    } 
    
    // Método auxiliar que me indica si una fecha es correcta 
    /**
     * comprobamos si la fecha es correcta
     * @param dia
     * @param mes
     * @param a�o
     * @return comprobar
     */
    static boolean fechaOK ( int dia, int mes, int a�o){ 
    	boolean comprobar = true;
    	if(dia <= 30 &&(mes ==4|| mes == 6 || mes == 9 || mes == 11)) {
    		comprobar = true;
    	}
    	if(dia<=31 && mes == 1|| mes ==3|| mes ==7|| mes==8|| mes == 10 || mes == 12) {
    		comprobar = true;
    	}
    	if(dia<=28 && (mes ==2)) {
    		comprobar = true;
    	}
	
	
       // COMPLETAR 
       return comprobar; 
    
    } 
    
    /**
     * metodo para la introduccion de datos
     * @return medicion
     */
    static TempHumDia leerMedida () { 

         Scanner leer = new Scanner(System.in); 
         int dia,mes,a�o, tempmax, tempmin, hummax, hummin; 
         TempHumDia  medicion = null; 
         
        boolean error = true; 
        do { 
        System.out.println("Dia:"); dia = leer.nextInt(); 
        System.out.println("Mes:");  mes = leer.nextInt(); 
        System.out.println("A�o:");  a�o = leer.nextInt(); 
  
        if ( fechaOK( dia,mes,a�o) ) { 
             System.out.println ( " T� Maxima:"); tempmax = leer.nextInt(); 
             System.out.println ( " T� Minima:"); tempmin = leer.nextInt(); 
             System.out.println ( " H� Maxima:"); hummax = leer.nextInt(); 
             System.out.println ( " H� Minima:"); hummin = leer.nextInt(); 
             medicion = new TempHumDia ( dia,mes,a�o, tempmax, tempmin, hummax, hummin); 
             error = false; 
            } 
        else 
        { 
            System.out.println(" Fecha Erronea"); 
        } 
    
    } while (  error); 
    
    
    return medicion; 
}
}
