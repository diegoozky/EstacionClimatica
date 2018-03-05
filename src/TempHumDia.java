/**
 * 
 * @author diego
 *
 */
public class TempHumDia extends TempDia{
	/**
	 * definimos los atributos
	 */
	//atributos
	protected int HumMax;
	protected int HumMin;
	//constructor
	/**
	 * constructor con parametros
	 * @param DiaMedicion
	 * @param MesMedicion
	 * @param AñoMedicion
	 * @param TempMax
	 * @param TempMin
	 * @param HumMax
	 * @param HumMin
	 */
	TempHumDia(int DiaMedicion, int MesMedicion, int AñoMedicion,
				int TempMax, int TempMin, int HumMax, int HumMin){
		super(DiaMedicion,MesMedicion,AñoMedicion,TempMax,TempMin);
		this.HumMax = HumMax;
		this.HumMin = HumMin;
	}
	/**
	 * Imprime los datos
	 */
	public String toString() {
		int HumMed= (HumMin+HumMax/2);
		return super.toString() + " HumMax = "+HumMax+" HumMin ="+HumMin+ "HumMedia="+HumMed; 
		
	}
	/**
	 * getter de humedad maxima
	 * @return humedad maxima
	 */
	public int getHumMax() {
		return HumMax;
	}
	/**
	 * setter humedad maxima
	 * @param humMax
	 */
	public void setHumMax(int humMax) {
		HumMax = humMax;
	}
	/**
	 * getter humedad minima
	 * @return HumMin
	 */
	public int getHumMin() {
		return HumMin;
	}
	/**
	 * setter de humedad minima
	 * @param humMin
	 */
	public void setHumMin(int humMin) {
		HumMin = humMin;
	}

}
