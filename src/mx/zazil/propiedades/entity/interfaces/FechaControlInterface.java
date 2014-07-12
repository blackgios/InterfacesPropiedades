/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.zazil.propiedades.entity.interfaces;

import java.util.Date;

/**
 *
 * @author Hector Rodriguez
 */
public interface FechaControlInterface {
    public Date getFechaInicioMes();
    public Date getFecha12Hrs();
    public Date getFecha24Hrs();
    public Date getFecha48Hrs();
    public Date getFecha72Hrs();
    public Date getFecha96Hrs();
    public Date getFechaAyer();
    public Date getFechaFinAño();
    public Date getFechaFinAñoAnt();
    public Date getFechaFinAñoAntNat();
    public Date getFechaFinMes();
    public Date getFechaFinMesAnt();
    public Date getFechaFinMesAntNat();
    public Date getFechaHoy();
    public Date getFechaIniAñoAnt();
    public Date getFechaIniAñoAntNat();
    public Date getFechaIniMesAnt();
    public Date getFechaIniMesAntNat();
    public Date getFechaInicioAño();
}
