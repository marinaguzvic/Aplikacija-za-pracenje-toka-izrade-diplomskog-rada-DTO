/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.diplomskiraddtos;

/**
 *
 * @author Marina Guzvic
 */
public class TemaSearchDTO implements ISearchDTO{
    private String nazivTeme;
    private Boolean diplomski;

    public TemaSearchDTO() {
    }

    public TemaSearchDTO(String nazivTeme, Boolean diplomski) {
        this.nazivTeme = nazivTeme;
        this.diplomski = diplomski;
    }

    public Boolean getDiplomski() {
        return diplomski;
    }

    public void setDiplomski(Boolean diplomski) {
        this.diplomski = diplomski;
    }

    public String getNazivTeme() {
        return nazivTeme;
    }

    public void setNazivTeme(String nazivTeme) {
        this.nazivTeme = nazivTeme;
    }
    
    
}
