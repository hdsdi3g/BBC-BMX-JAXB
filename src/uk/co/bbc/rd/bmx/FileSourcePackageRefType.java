//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.08.05 à 03:51:24 AM CEST 
//

package uk.co.bbc.rd.bmx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java pour file_source_package_ref_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="file_source_package_ref_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bbc.co.uk/rd/bmx/201312}package_ref_type">
 *       &lt;sequence>
 *         &lt;element name="file_uri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "file_source_package_ref_type", propOrder = { "fileUri" })
public class FileSourcePackageRefType extends PackageRefType {
	
	@XmlElement(name = "file_uri", required = true)
	@XmlSchemaType(name = "anyURI")
	protected String fileUri;
	
	/**
	 * Obtient la valeur de la propriété fileUri.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getFileUri() {
		return fileUri;
	}
	
	/**
	 * Définit la valeur de la propriété fileUri.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setFileUri(String value) {
		this.fileUri = value;
	}
	
}
