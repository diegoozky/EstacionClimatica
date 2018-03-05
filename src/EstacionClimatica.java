
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
    private int año; 
    private TempHumDia mediciones[];  // Tabla de mediciones 
    private int nummediciones;      // NÃºmero de mediciones almacenadas 

    /** 
     * Constructor for objects of class EstacionClimatica 
     */ 
    public EstacionClimatica() 
    { 
         this.nombre = ""; 
         this.año = 2000;  
         mediciones = new TempHumDia[366];  // Por si el aÃ±o es bisiesto.  
         nummediciones = 0; 
    } 
    /**
     * constructor con parametros
     * @param nombre
     * @param año
     */
    public EstacionClimatica( String nombre, int año) 
    { 
         this(); // Llamo al constructor por defecto 
         this.nombre = nombre; 
         this.año = año; 
         
    } 
    /**
     * Se añade una fecha con otros datos a la tabla
     * @param media
     * @return metido
     */
    public boolean addDia ( TempHumDia media){ 
    	boolean metido = true;
    	for(int i = 0; i<mediciones.length;i++) {
    		if (mediciones[i] == null) {
    			mediciones[i] = media;
    		}
    		if(mediciones[i].getAñoMedicion()!=media.getAñoMedicion()) {
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
    				&& media.getAñoMedicion() == mediciones[i].getAñoMedicion()) {
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
    
    // MÃ©todo auxiliar que me indica si una fecha es correcta 
    /**
     * comprobamos si la fecha es correcta
     * @param dia
     * @param mes
     * @param año
     * @return comprobar
     */
    static boolean fechaOK ( int dia, int mes, int año){ 
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
         int dia,mes,año, tempmax, tempmin, hummax, hummin; 
         TempHumDia  medicion = null; 
         
        boolean error = true; 
        do { 
        System.out.println("Dia:"); dia = leer.nextInt(); 
        System.out.println("Mes:");  mes = leer.nextInt(); 
        System.out.println("Año:");  año = leer.nextInt(); 
  
        if ( fechaOK( dia,mes,año) ) { 
             System.out.println ( " Tª Maxima:"); tempmax = leer.nextInt(); 
             System.out.println ( " Tª Minima:"); tempmin = leer.nextInt(); 
             System.out.println ( " Hª Maxima:"); hummax = leer.nextInt(); 
             System.out.println ( " Hª Minima:"); hummin = leer.nextInt(); 
             medicion = new TempHumDia ( dia,mes,año, tempmax, tempmin, hummax, hummin); 
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
