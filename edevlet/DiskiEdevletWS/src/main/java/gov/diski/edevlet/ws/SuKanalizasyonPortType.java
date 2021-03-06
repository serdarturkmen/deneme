package gov.diski.edevlet.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "SuKanalizasyonPortType", targetNamespace = "http://belediye.turkiye.gov.tr/v2")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SuKanalizasyonPortType {

	/**
	 * 
	 * @param part1
	 * @return returns gov.diski.edevlet.ws.SuAnalizSorgulamaCType
	 */
	@WebMethod(action = "http://belediye.turkiye.gov.tr/v2/suAnalizSorgula")
	@WebResult(name = "suAnalizSorgulamaC", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1")
	public SuAnalizSorgulamaCType guncelSuAnalizSorgula(
			@WebParam(name = "suAnalizSorgulamaG", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1") SorguParametreType part1);

	/**
	 * 
	 * @param part1
	 * @return returns gov.diski.edevlet.ws.SuAboneBilgisiCType
	 */
	@WebMethod(action = "http://belediye.turkiye.gov.tr/v2/suAboneSorgula")
	@WebResult(name = "suAboneSorgulamaC", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1")
	public SuAboneBilgisiCType suAboneSorgula(
			@WebParam(name = "suAboneSorgulamaG", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1") KisiselSorgulamaGType part1);

	/**
	 * 
	 * @param part1
	 * @return returns gov.diski.edevlet.ws.SuFaturaSorgulamaCType
	 */
	@WebMethod(action = "http://belediye.turkiye.gov.tr/v2/suFaturaSorgula")
	@WebResult(name = "suFaturaSorgulamaC", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1")
	public SuFaturaSorgulamaCType suFaturaSorgula(
			@WebParam(name = "suFaturaSorgulamaG", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1") SuFaturaSorgulamaGType part1);

	/**
	 * 
	 * @param part1
	 * @return returns gov.diski.edevlet.ws.ArizaBilgisiCtype
	 */
	@WebMethod(action = "http://belediye.turkiye.gov.tr/v2/arizaSorgula")
	@WebResult(name = "arizaSorgulamaC", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1")
	public ArizaBilgisiCtype arizaSorgulama(
			@WebParam(name = "arizaSorgulamaG", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1") SorguParametreType part1);

	/**
	 * 
	 * @param part1
	 * @return returns gov.diski.edevlet.ws.FaaliyetBilgisiCType
	 */
	@WebMethod(action = "http://belediye.turkiye.gov.tr/v2/gunlukFaaliyetSorgula")
	@WebResult(name = "gunlukFaaliyetSorgulamaC", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1")
	public FaaliyetBilgisiCType gunlukFaaliyetSorgula(
			@WebParam(name = "gunlukFaaliyetSorgulamaG", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1") SorguParametreType part1);

	/**
	 * 
	 * @param part1
	 * @return returns gov.diski.edevlet.ws.SOKTipiBilgisiCType
	 */
	@WebMethod(operationName = "SOKTipiSorgula", action = "http://belediye.turkiye.gov.tr/v2/SOKTipiSorgula")
	@WebResult(name = "SOKTipiBilgisiSorgulamaC", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1")
	public SOKTipiBilgisiCType sokTipiSorgula(
			@WebParam(name = "SOKTipiBilgisiSorgulamaG", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1") SorguParametreType part1);

	/**
	 * 
	 * @param part1
	 * @return returns gov.diski.edevlet.ws.IlceBilgisiSorgulamaCType
	 */
	@WebMethod(action = "http://belediye.turkiye.gov.tr/v2/ilceSorgula")
	@WebResult(name = "ilceSorgulamaC", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1")
	public IlceBilgisiSorgulamaCType ilceSorgula(
			@WebParam(name = "ilceSorgulamaG", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1") SorguParametreType part1);

	/**
	 * 
	 * @param part1
	 * @return returns gov.diski.edevlet.ws.MahalleSorgulamaCType
	 */
	@WebMethod(action = "http://belediye.turkiye.gov.tr/v2/mahalleSorgula")
	@WebResult(name = "mahalleSorgulamaC", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1")
	public MahalleSorgulamaCType mahalleSorgula(
			@WebParam(name = "mahalleSorgulamaG", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1") MahalleSorgulamaGType part1);

	/**
	 * 
	 * @param part1
	 * @return returns gov.diski.edevlet.ws.SokakCaddeSorgulamaCType
	 */
	@WebMethod(action = "http://belediye.turkiye.gov.tr/v2/sokakCaddeSorgula")
	@WebResult(name = "sokakCaddeSorgulamaC", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1")
	public SokakCaddeSorgulamaCType sokakCaddeSorgula(
			@WebParam(name = "sokakCaddeSorgulamaG", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1") SokakCaddeSorgulamaGType part1);

	/**
	 * 
	 * @param part1
	 * @return returns gov.diski.edevlet.ws.SOKBasvuruYapCType
	 */
	@WebMethod(operationName = "SOKBasvuruYap", action = "http://belediye.turkiye.gov.tr/v2/SOKBasvuruYap")
	@WebResult(name = "SOKBasvuruYapC", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1")
	public SOKBasvuruYapCType sokBasvuruYap(
			@WebParam(name = "SOKBasvuruYapG", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1") SOKBasvuruYapGType part1);

	/**
	 * 
	 * @param part1
	 * @return returns gov.diski.edevlet.ws.SOKBasvuruDurumCType
	 */
	@WebMethod(operationName = "SOKBasvuruDurumSorgula", action = "http://belediye.turkiye.gov.tr/v2/SOKBasvuruDurumSorgula")
	@WebResult(name = "SOKBasvuruDurumSorgulamaC", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1")
	public SOKBasvuruDurumCType sokBasvuruDurumSorgula(
			@WebParam(name = "SOKBasvuruDurumSorgulamaG", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1") KisiselSorgulamaGType part1);

	/**
	 * 
	 * @param part1
	 * @return returns gov.diski.edevlet.ws.SOKBasvuruDetaySorgulamaCType
	 */
	@WebMethod(operationName = "SOKBasvuruDetaySorgula", action = "http://belediye.turkiye.gov.tr/v2/SOKBasvuruDetaySorgula")
	@WebResult(name = "SOKBasvuruDetaySorgulamaC", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1")
	public SOKBasvuruDetaySorgulamaCType sokBasvuruDetaySorgula(
			@WebParam(name = "SOKBasvuruDetaySorgulamaG", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1") SOKBasvuruDetaySorgulaGType part1);

	/**
	 * 
	 * @param part1
	 * @return returns gov.diski.edevlet.ws.BarajDolulukBilgisiCType
	 */
	@WebMethod(action = "http://belediye.turkiye.gov.tr/v2/barajDolulukSorgula")
	@WebResult(name = "barajDolulukSorgulamaC", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1")
	public BarajDolulukBilgisiCType barajDolulukSorgula(
			@WebParam(name = "barajDolulukSorgulamaG", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1") SorguParametreType part1);

	/**
	 * 
	 * @param part1
	 * @return returns gov.diski.edevlet.ws.SuAnalizDokumanIndirCType
	 */
	@WebMethod(action = "http://belediye.turkiye.gov.tr/v2/suAnalizDokumanIndir")
	@WebResult(name = "suAnalizDokumanIndirC", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1")
	public SuAnalizDokumanIndirCType suAnalizDokumanIndir(
			@WebParam(name = "suAnalizDokumanIndirG", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1") SorguParametreType part1);

	/**
	 * 
	 * @param part1
	 * @return returns gov.diski.edevlet.ws.BinaBilgisiSorgulamaCType
	 */
	@WebMethod
	@WebResult(name = "binaSorgulamaC", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1")
	public BinaBilgisiSorgulamaCType binaSorgula(
			@WebParam(name = "binaSorgulamaG", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1") BinaBilgisiSorgulamaGType part1);

	/**
	 * 
	 * @param part1
	 * @return returns gov.diski.edevlet.ws.DaireBilgisiSorgulamaCType
	 */
	@WebMethod
	@WebResult(name = "daireSorgulamaC", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1")
	public DaireBilgisiSorgulamaCType daireSorgula(
			@WebParam(name = "daireSorgulamaG", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1") DaireBilgisiSorgulamaGType part1);

	/**
	 * 
	 * @param part1
	 * @return returns gov.diski.edevlet.ws.AbonelikYapilabilirMiCType
	 */
	@WebMethod
	@WebResult(name = "abonelikYapilabilirMiC", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1")
	public AbonelikYapilabilirMiCType abonelikYapilabilirMi(
			@WebParam(name = "abonelikYapilabilirMiG", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1") AbonelikYapilabilirMiGType part1);

	/**
	 * 
	 * @param part1
	 * @return returns gov.diski.edevlet.ws.DaskKontrolCType
	 */
	@WebMethod
	@WebResult(name = "daskKontrolC", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1")
	public DaskKontrolCType daskKontrol(
			@WebParam(name = "daskKontrolG", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1") DaskKontrolGType part1);

	/**
	 * 
	 * @param part1
	 * @return returns gov.diski.edevlet.ws.SozlesmeIndirCtype
	 */
	@WebMethod
	@WebResult(name = "sozlesmeIndirC", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1")
	public SozlesmeIndirCtype sozlesmeIndir(
			@WebParam(name = "sozlesmeIndirG", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1") SozlesmeIndirGType part1);

	/**
	 * 
	 * @param part1
	 * @return returns gov.diski.edevlet.ws.AbonelikbasvuruCType
	 */
	@WebMethod
	@WebResult(name = "abonelikBasvuruC", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1")
	public AbonelikbasvuruCType abonelikBasvuru(
			@WebParam(name = "abonelikBasvuruG", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1") AbonelikBasvuruGType part1);

	/**
	 * 
	 * @param part1
	 * @return returns gov.diski.edevlet.ws.AbonelikBasvuruSorgulamaCType
	 */
	@WebMethod
	@WebResult(name = "abonelikBasvuruSorgulamaC", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1")
	public AbonelikBasvuruSorgulamaCType abonelikBasvuruSorgula(
			@WebParam(name = "abonelikBasvuruSorgulamaG", targetNamespace = "http://belediye.turkiye.gov.tr/v2", partName = "part1") KisiselSorgulamaGType part1);

}
