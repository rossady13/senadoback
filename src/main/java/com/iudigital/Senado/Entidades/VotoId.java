package com.iudigital.Senado.Entidades;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class VotoId implements Serializable {
    private Long senadorId;
    private Long proyectoId;

    public VotoId(Long senadorId, Long proyectoId) {

    }

    public Long getSenadorId() {
        return senadorId;
    }

    public void setSenadorId(Long senadorId) {
        this.senadorId = senadorId;
    }

    public Long getProyectoId() {
        return proyectoId;
    }

    public void setProyectoId(Long proyectoId) {
        this.proyectoId = proyectoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VotoId votoId = (VotoId) o;
        return Objects.equals(senadorId, votoId.senadorId) && Objects.equals(proyectoId, votoId.proyectoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(senadorId, proyectoId);
    }
}
