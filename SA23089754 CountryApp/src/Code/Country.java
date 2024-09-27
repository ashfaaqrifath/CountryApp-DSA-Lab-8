/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author sa23089754
 */
public class Country {
    
    private int m49code;
    private String CountryName;
    private String alpha2Code;
    private String alpha3Code;


    public Country(int m49code, String CountryName, String alpha2Code, String alpha3Code) {
        this.m49code = m49code;
        this.CountryName = CountryName;
        this.alpha2Code = alpha2Code;
        this.alpha3Code = alpha3Code;
    }

    public int getM49code() {
        return m49code;
    }

    public String getCountryName() {
        return CountryName;
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }
    
}
