import gen.CountryInfoService;
import gen.CountryInfoServiceSoapType;
import gen.TCountryInfo;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.List;

public class Controller {

    @FXML
    Label land;
    @FXML
    Label code;
    @FXML
    Label hauptstadt;
    @FXML
    Label wahrung;
    @FXML
    Label isocode;
    @FXML
    Label telefonnummer;
    @FXML
    Label sprachen;
    @FXML
    ImageView bild;
    @FXML
    TextField input;



    public void go(){
        String code = input.getText();
        if (!(code.length() == 0))
        pupulateData(code);
    }

    public void islandB(){
        pupulateData("IS");
    }

    public void ukB(){
        pupulateData("GB");
    }

    public void irlandB(){
        pupulateData("IE");
    }

    public void frankreichB(){
        pupulateData("FR");
    }

    public void belgienB(){
        pupulateData("BE");
    }

    public void schweizB(){
        pupulateData("CH");
    }

    public void polenB(){
        pupulateData("PL");
    }

    public void norwegenB(){
        pupulateData("NO");
    }

    public void schwedenB(){
        pupulateData("SE");
    }

    public void finnlandB(){
        pupulateData("FI");
    }

    public void russlandB(){
        pupulateData("RU");
    }

    public void danemarkB(){
        pupulateData("DK");
    }

    public void osterreichB(){
        pupulateData("AT");
    }

    public void spanienB(){
        pupulateData("ES");
    }

    public void portugalB(){
        pupulateData("PT");
    }

    public void italienB(){
        pupulateData("IT");
    }

    public void niederlandeB(){
        pupulateData("NL");
    }

    public void tschechienB(){
        pupulateData("CZ");
    }

    public void deutschlandB(){
        pupulateData("DE");
    }

    public void ukraineB(){
        pupulateData("UA");
    }

    public void kroatienB(){
        pupulateData("HR");
    }

    public void bosnienB(){
        pupulateData("BA");
    }

    public void rumanienB(){
        pupulateData("RO");
    }

    public void weissrusslandB(){
        pupulateData("BY");
    }

    public void turkeiB(){
        pupulateData("TR");
    }

    public void serbienB(){
        pupulateData("CS");
    }

    public void ungarnB(){
        pupulateData("HU");
    }

    public void montenegroB(){
       System.out.println("Keine Daten. Gehört zu Serbien");
    }

    public void mazedonienB(){
        pupulateData("MK");
    }

    public void griechenlandB(){
        pupulateData("GR");
    }

    public void estlandB(){
        pupulateData("EE");
    }

    public void LettlandB(){
        pupulateData("LV");
    }

    public void LitauenB(){
        pupulateData("LT");
    }

    public void moldavienB(){
        pupulateData("MD");
    }

    public void slowakaiB(){
        pupulateData("SK");
    }

    public void bulgarienB(){
        pupulateData("BG");
    }

    public void albanienB(){
        pupulateData("AL");
    }

    public void luxemburgB(){
        pupulateData("LU");
    }

    private TCountryInfo getCountyInformation(String country){
        CountryInfoService countryInfoService = new CountryInfoService();
        CountryInfoServiceSoapType service = countryInfoService.getCountryInfoServiceSoap();
        return service.fullCountryInfo(country);
    }
    private void pupulateData(String country){
        TCountryInfo tCountryInfo = getCountyInformation(country);
        try {
            bild.setImage(new Image(tCountryInfo.getSCountryFlag()));
        }catch (Exception e){
            System.out.println("Kein Bild gefunden");
        }
        land.setText("Name: "+ tCountryInfo.getSName());
        code.setText("Kontinent: "+ tCountryInfo.getSContinentCode());
        hauptstadt.setText("Hauptstadt: "+ tCountryInfo.getSCapitalCity());
        wahrung.setText("Waehrung: "+ tCountryInfo.getSCurrencyISOCode());
        isocode.setText("ISOCode: "+ tCountryInfo.getSISOCode());
        telefonnummer.setText("Telefonnummer: "+ tCountryInfo.getSPhoneCode());
        sprachen.setText("Sprachen: "+getSprachen(tCountryInfo));
    }

    public String getSprachen(TCountryInfo tCountryInfo){
        String sprache ="";
        for (int i = 0; i < tCountryInfo.getLanguages().getTLanguage().size(); i++) {
            sprache = sprache + " " + tCountryInfo.getLanguages().getTLanguage().get(i).getSName();
        }
        return sprache;
    }
}


