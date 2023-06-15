package ec.edu.espe.arquitectura.examen.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Version;

public class OfiSede {
    @Id
    @Column(name = "COD_SEDE", length = 8, nullable = false)
    private String id;
    @Column(name = "COD_INSTITUCION", nullable = false)
    private Integer codigoInstitucion;
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    @Column(name = "DIRECCION", nullable = false, length = 200)
    private String direccion;
    @Column(name = "ES_PRINCIPAL", nullable = false)
    private Boolean esPrincipal;
    @Column(name = "FECHA_CREACION", nullable = false)
    private Date fechaCreacion;
    @Version
    @Column(name = "VERSION", nullable = false)
    private Integer version;

    @ManyToOne
    @JoinColumn(name = "COD_INSTITUCION", referencedColumnName = "COD_INSTITUCION", insertable = false, updatable = false, nullable = false)
    private OfiInstitucion ofiInstitucion;

    public OfiSede() {
    }

    public OfiSede(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCodigoInstitucion() {
        return codigoInstitucion;
    }

    public void setCodigoInstitucion(Integer codigoInstitucion) {
        this.codigoInstitucion = codigoInstitucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getEsPrincipal() {
        return esPrincipal;
    }

    public void setEsPrincipal(Boolean esPrincipal) {
        this.esPrincipal = esPrincipal;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public OfiInstitucion getOfiInstitucion() {
        return ofiInstitucion;
    }

    public void setOfiInstitucion(OfiInstitucion ofiInstitucion) {
        this.ofiInstitucion = ofiInstitucion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OfiSede other = (OfiSede) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OfiSede [id=" + id + ", codigoInstitucion=" + codigoInstitucion + ", nombre=" + nombre + ", direccion="
                + direccion + ", esPrincipal=" + esPrincipal + ", fechaCreacion=" + fechaCreacion + ", version="
                + version + ", ofiInstitucion=" + ofiInstitucion + "]";
    }

}
