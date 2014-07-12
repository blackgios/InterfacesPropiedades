/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.zazil.propiedades.interfaces;

import mx.zazil.propiedades.entity.interfaces.ParametrosInterface;
import mx.zazil.service.Pingeable;

/**
 *
 * @author Hector Rodriguez
 */
public interface PropiedadesFondoDeAhorroOperacion extends Pingeable{
    ParametrosInterface getParametro(String idParametro);
}
