
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
 *         &lt;element name="CountriesUsingCurrencyResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftCountryCodeAndName"/>
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
    "countriesUsingCurrencyResult"
})
@XmlRootElement(name = "CountriesUsingCurrencyResponse")
public class CountriesUsingCurrencyResponse {

    @XmlElement(name = "CountriesUsingCurrencyResult", required = true)
    protected ArrayOftCountryCodeAndName countriesUsingCurrencyResult;

    /**
     * Ruft den Wert der countriesUsingCurrencyResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftCountryCodeAndName }
     *     
     */
    public ArrayOftCountryCodeAndName getCountriesUsingCurrencyResult() {
        return countriesUsingCurrencyResult;
    }

    /**
     * Legt den Wert der countriesUsingCurrencyResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftCountryCodeAndName }
     *     
     */
    public void setCountriesUsingCurrencyResult(ArrayOftCountryCodeAndName value) {
        this.countriesUsingCurrencyResult = value;
    }

}
