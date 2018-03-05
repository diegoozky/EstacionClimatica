/**
 * 
 * @author diego
 *
 */
public class TempDia {
	/**
	 * Definimos los atributos
	 */
	// atributos
	protected int DiaMedicion;
	protected int MesMedicion;
	protected int A�oMedicion;
	protected int TempMax;
	protected int TempMin;
	//constructor
	/**
	 * Constructor sin parametros
	 */
	TempDia(){
		this(0,0,0,0,0);
	}
	/**
	 * Constructor con parametro
	 * @param DiaMedicion El dia en el que se hace la medicion
	 * @param MesMedicion El mes en el que se hace la medicion
	 * @param A�oMedicion El a�o en el que se hace la medicion
	 * @param TempMax temperatura maxima en ese dia
	 * @param TempMin temperatura minima en ese dia
	 */
	TempDia(int DiaMedicion, int MesMedicion, int A�oMedicion, int TempMax, int TempMin){
		this.DiaMedicion = DiaMedicion;
		this.MesMedicion = MesMedicion;
		this.A�oMedicion = A�oMedicion;
		this.TempMax = TempMax;
		this.TempMin = TempMin;
	}
	//metodos
	/**
	 * imprime los datos 
	 */
	public String toString() {
		return ( DiaMedicion+"/"+MesMedicion+"/"+A�oMedicion + 
				" TempMax =" +TempMax+" TempMin="+TempMin+ "media temperatura=" + ((TempMin+TempMax)/2));
	}
	/**
	 * getter de DiaMedicion
	 * @return el dia de la medicion 
	 */
	public int getDiaMedicion() {
		return DiaMedicion;
	}
	/**
	 * Setter de DiaMedicion
	 * @param diaMedicion
	 */
	public void setDiaMedicion(int diaMedicion) {
		DiaMedicion = diaMedicion;
	}
	/**
	 * getter MesMedicion
	 * @return el mes de la medicion
	 */
	public int getMesMedicion() {
		return MesMedicion;
	}
	/**
	 * setter MesMedicion
	 * @param mesMedicion
	 */
	public void setMesMedicion(int mesMedicion) {
		MesMedicion = mesMedicion;
	}
	/**
	 * GETTER A�oMedicion
	 * @return A�o de la medicion
	 */
	public int getA�oMedicion() {
		return A�oMedicion;
	}
	/**
	 * Setter de A�oMedicion
	 * @param a�oMedicion
	 */
	public void setA�oMedicion(int a�oMedicion) {
		A�oMedicion = a�oMedicion;
	}
	/**
	 * getter TempMax
	 * @return TempMax
	 */
	public int getTempMax() {
		return TempMax;
	}
	/**
	 * setter TempMax
	 * @param tempMax
	 */
	public void setTempMax(int tempMax) {
		TempMax = tempMax;
	}
	/**
	 * getter de temperatura minima
	 * @return TempMin
	 */
	public int getTempMin() {
		return TempMin;
	}
	/**
	 * setter temperatura minima
	 * @param tempMin
	 */
	public void setTempMin(int tempMin) {
		TempMin = tempMin;
	}
	
	
}
