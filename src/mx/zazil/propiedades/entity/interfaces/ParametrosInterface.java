/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.zazil.propiedades.entity.interfaces;

import java.util.Date;
import mx.zazil.propiedades.entity.detalle.FolioDetalle;

/**
 *
 * @author Hector Rodriguez
 */
public interface ParametrosInterface {
    public String getParametro();
    public Date getValorFecha();
    public Double getValorNumero();
    public String getValorString();
    public Long folioContratoId(FolioDetalle f);
    public String obtenCuentaPropia();
}
