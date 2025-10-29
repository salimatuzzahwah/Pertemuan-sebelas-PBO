/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan11;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Salimatuz Zahwah
 */
@Entity
@Table(name = "kendaraan")
@NamedQueries({
    @NamedQuery(name = "Kendaraan.findAll", query = "SELECT k FROM Kendaraan k"),
    @NamedQuery(name = "Kendaraan.findByPlatnomor", query = "SELECT k FROM Kendaraan k WHERE k.platnomor = :platnomor"),
    @NamedQuery(name = "Kendaraan.findByMerk", query = "SELECT k FROM Kendaraan k WHERE k.merk = :merk"),
    @NamedQuery(name = "Kendaraan.findByWarna", query = "SELECT k FROM Kendaraan k WHERE k.warna = :warna"),
    @NamedQuery(name = "Kendaraan.findByTanggalproduksi", query = "SELECT k FROM Kendaraan k WHERE k.tanggalproduksi = :tanggalproduksi")})
public class Kendaraan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "platnomor")
    private String platnomor;
    @Column(name = "merk")
    private String merk;
    @Column(name = "warna")
    private String warna;
    @Column(name = "tanggalproduksi")
    private String tanggalproduksi;

    public Kendaraan() {
    }

    public Kendaraan(String platnomor) {
        this.platnomor = platnomor;
    }

    public String getPlatnomor() {
        return platnomor;
    }

    public void setPlatnomor(String platnomor) {
        this.platnomor = platnomor;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getTanggalproduksi() {
        return tanggalproduksi;
    }

    public void setTanggalproduksi(String tanggalproduksi) {
        this.tanggalproduksi = tanggalproduksi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (platnomor != null ? platnomor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kendaraan)) {
            return false;
        }
        Kendaraan other = (Kendaraan) object;
        if ((this.platnomor == null && other.platnomor != null) || (this.platnomor != null && !this.platnomor.equals(other.platnomor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pertemuan11.Kendaraan[ platnomor=" + platnomor + " ]";
    }
    
}
