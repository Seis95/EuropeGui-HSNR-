
package gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfCountryNamesByCodeResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftCountryCodeAndName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listOfCountryNamesByCodeResult"
})
@XmlRootElement(name = "ListOfCountryNamesByCodeResponse")
public class ListOfCountryNamesByCodeResponse {

    @XmlElement(name = "ListOfCountryNamesByCodeResult", required = true)
    protected ArrayOftCountryCodeAndName listOfCountryNamesByCodeResult;

    /**
     * Ruft den Wert der listOfCountryNamesByCodeResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftCountryCodeAndName }
     *     
     */
    public ArrayOftCountryCodeAndName getListOfCountryNamesByCodeResult() {
        return listOfCountryNamesByCodeResult;
    }

    /**
     * Legt den Wert der listOfCountryNamesByCodeResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftCountryCodeAndName }
     *     
     */
    public void setListOfCountryNamesByCodeResult(ArrayOftCountryCodeAndName value) {
        this.listOfCountryNamesByCodeResult = value;
    }

}
