//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.08.05 à 03:51:24 AM CEST 
//

package uk.co.bbc.rd.bmx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java pour file_source_packages_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="file_source_packages_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bbc.co.uk/rd/bmx/201312}array_type">
 *       &lt;sequence>
 *         &lt;element name="file_source_package" type="{http://bbc.co.uk/rd/bmx/201312}package_type" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "file_source_packages_type", propOrder = { "fileSourcePackage" })
public class FileSourcePackagesType extends ArrayType {
	
	@XmlElement(name = "file_source_package", required = true)
	protected List<PackageType> fileSourcePackage;
	
	/**
	 * Gets the value of the fileSourcePackage property.
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the fileSourcePackage property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getFileSourcePackage().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link PackageType }
	 */
	public List<PackageType> getFileSourcePackage() {
		if (fileSourcePackage == null) {
			fileSourcePackage = new ArrayList<PackageType>();
		}
		return this.fileSourcePackage;
	}
	
}
