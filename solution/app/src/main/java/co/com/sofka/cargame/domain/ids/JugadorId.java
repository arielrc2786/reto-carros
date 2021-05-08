/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sofka.cargame.domain.ids;

import java.util.UUID;

/**
 *
 * @author Ariel Rivera Correa <arielriverac@hotmail.com>
 */
public class JugadorId {

    private UUID id;

    public JugadorId(UUID id) {
        this.id = id;
    }

    public String getId() {
        return id.toString();
    }

}
