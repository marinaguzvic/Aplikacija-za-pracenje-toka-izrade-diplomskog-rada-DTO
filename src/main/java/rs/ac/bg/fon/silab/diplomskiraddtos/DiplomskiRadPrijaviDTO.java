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
public class DiplomskiRadPrijaviDTO extends AbstractDTO {
    private Long studentIdFk;
    private Long temaIdFk;

    public DiplomskiRadPrijaviDTO() {
    }

    public DiplomskiRadPrijaviDTO(Long studentIdFk, Long temaIdFk) {
        this.studentIdFk = studentIdFk;
        this.temaIdFk = temaIdFk;
    }



    

    public Long getStudentIdFk() {
        return studentIdFk;
    }

    public void setStudentIdFk(Long studentIdFk) {
        this.studentIdFk = studentIdFk;
    }

    public Long getTemaIdFk() {
        return temaIdFk;
    }

    public void setTemaIdFk(Long temaIdFk) {
        this.temaIdFk = temaIdFk;
    }
    
    
}
