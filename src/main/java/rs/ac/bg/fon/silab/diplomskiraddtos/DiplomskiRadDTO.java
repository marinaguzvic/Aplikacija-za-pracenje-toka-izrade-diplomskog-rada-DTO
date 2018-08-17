/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.diplomskiraddtos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marina Guzvic
 */
public class DiplomskiRadDTO extends AbstractDTO {

    private Long diplomskiRadId;
    private String datumPrijave;
    private String datumOdobravanja;
    private String datumOdbrane;
    private String datumPredaje;
    private Integer ocena;
    private String status;
    private List<ClanKaKlijentuDTO> clans;
    private StudentDTO studentIdFk;
    private TemaDiplomskogRadaDTO temaIdFk;
    private List<String> dokuments;

    public DiplomskiRadDTO() {
    }

    public DiplomskiRadDTO(Long diplomskiRadId, String datumPrijave, String datumOdobravanja, String datumOdbrane, String datumPredaje, Integer ocena, String status, List<ClanKaKlijentuDTO> clans, StudentDTO studentIdFk, TemaDiplomskogRadaDTO temaIdFk, List<String> dokuments) {
        this.diplomskiRadId = diplomskiRadId;
        this.datumPrijave = datumPrijave;
        this.datumOdobravanja = datumOdobravanja;
        this.datumOdbrane = datumOdbrane;
        this.datumPredaje = datumPredaje;
        this.ocena = ocena;
        this.status = status;
        this.clans = clans;
        this.studentIdFk = studentIdFk;
        this.temaIdFk = temaIdFk;
        this.dokuments = dokuments;
    }

    public Long getDiplomskiRadId() {
        return diplomskiRadId;
    }

    public void setDiplomskiRadId(Long diplomskiRadId) {
        this.diplomskiRadId = diplomskiRadId;
    }

    public String getDatumPrijave() {
        return datumPrijave;
    }

    public void setDatumPrijave(String datumPrijave) {
        this.datumPrijave = datumPrijave;
    }

    public String getDatumOdobravanja() {
        return datumOdobravanja;
    }

    public void setDatumOdobravanja(String datumOdobravanja) {
        this.datumOdobravanja = datumOdobravanja;
    }

    public String getDatumOdbrane() {
        return datumOdbrane;
    }

    public void setDatumOdbrane(String datumOdbrane) {
        this.datumOdbrane = datumOdbrane;
    }

    public String getDatumPredaje() {
        return datumPredaje;
    }

    public void setDatumPredaje(String datumPredaje) {
        this.datumPredaje = datumPredaje;
    }

    public Integer getOcena() {
        return ocena;
    }

    public void setOcena(Integer ocena) {
        this.ocena = ocena;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ClanKaKlijentuDTO> getClans() {
        return clans;
    }

    public void setClans(List<ClanKaKlijentuDTO> clans) {
        this.clans = clans;
    }

    public StudentDTO getStudentIdFk() {
        return studentIdFk;
    }

    public void setStudentIdFk(StudentDTO studentIdFk) {
        this.studentIdFk = studentIdFk;
    }

    public TemaDiplomskogRadaDTO getTemaIdFk() {
        return temaIdFk;
    }

    public void setTemaIdFk(TemaDiplomskogRadaDTO temaIdFk) {
        this.temaIdFk = temaIdFk;
    }

    public List<String> getDokuments() {
        return dokuments;
    }

    public void setDokuments(List<String> dokuments) {
        this.dokuments = dokuments;
    }

    public String getPropertyByName(String property) {

        switch (property) {
            case "Student":
                return studentIdFk.getIme() + " " + studentIdFk.getPrezime() + " " + studentIdFk.getBrojIndeksa();
            case "Tema":
                return temaIdFk.getNazivTeme() + "<br>" + temaIdFk.getOpisTeme() + "<br>" + temaIdFk.getPredmetIdFk().getNazivPredmeta() + "<br>" + temaIdFk.getPredmetIdFk().getKatedra();

            case "Status":
                return status;
            case "Datum prijave":
                return datumPrijave;
            case "Datum odobravanja":
                return datumOdobravanja;
            case "Datum predaje":
                return datumPredaje;
            case "Datum odbrane":
                return datumOdbrane;
            case "Clanovi komisije":
                String clanovi = "";
                for (ClanKaKlijentuDTO clan : clans) {
                    clanovi = clanovi.concat(clan.getNastavnikIdFk().ime + " " + clan.getNastavnikIdFk().prezime + (clan.getUlogaClanaKomisije().equalsIgnoreCase("MENTOR") ? " MENTOR" : "") + "<br>");
                }
                return clanovi;
            case "Ocena":
                return ocena + "";
            default:
                return null;

        }
    }

    public List<String> getProperties() {
        List<String> list = new ArrayList<>();
        list.add("Student");
        list.add("Tema");
        list.add("Status");
        list.add("Datum prijave");
        list.add("Datum odobravanja");
        list.add("Datum predaje");
        list.add("Datum odbrane");
        list.add("Clanovi komisije");
        list.add("Ocena");
        return list;
    }

    public List<String> getNotNullProperties() {
        List<String> list = new ArrayList<>();
        if (studentIdFk != null) {
            list.add("Student");
        }
        if (temaIdFk != null) {
            list.add("Tema");
        }
        if (status != null) {
            list.add("Status");
        }
        if (datumPrijave != null) {
            list.add("Datum prijave");
        }
        if (datumOdobravanja != null) {
            list.add("Datum odobravanja");
        }
        if (datumPredaje != null) {
            list.add("Datum predaje");
        }
        if (datumOdbrane != null) {
            list.add("Datum odbrane");
        }
        if (clans != null && !clans.isEmpty()) {
            list.add("Clanovi komisije");
        }
        if (ocena != null) {
            list.add("Ocena");
        }
        return list;
    }
}
