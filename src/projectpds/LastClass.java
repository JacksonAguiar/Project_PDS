/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpds;

/**
 * Classe para visualizar dados de um jogo.
 *
 * @authors: Jackson e João Pedro
 * @version 1.0
 * @since '06/08/2019'
 *
 */
public class LastClass {

    /**
     * Método que mostra um computador.
     *
     * @param pc String - um computador
     * @return String - visualização
     */
    public String pc(String pc) {
        return "Computador 1: " + pc;
    }

    /**
     * Método que mostra um smartphone.
     *
     * @param stphone String - um smartphone
     * @return String - visualização do smartphone
     */
    public String smartphone(String stphone) {
        return "Smartphone 1: " + stphone;
    }

    /**
     * Método que retorna o status do equipamento.
     *
     * @param st Boolean - status
     * @return String - visualização do status
     */
    public String status(Boolean st) {
        if (!st) {
            return "Não está funionando....";
        } else {
            return "Funcionando.";
        }

    }

}
