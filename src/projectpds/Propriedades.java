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
public class Propriedades {

    /**
     * Método que retorna a sua casa.
     *
     * @param house String - a casa do jogo
     * @return String - o nome da casa
     */
    public String house(String house) {
        return "Casa: " + house;
    }

    /**
     * Método que retorna o seu carro.
     *
     * @param car String - o carro do jogo
     * @return String - o nome do carro
     */
    public String car(String car) {
        return "Carro: " + car;
    }

    /**
     * Método que retorna a seus pontos de vida.
     *
     * @param life String - pontos de vida no jogo
     * @return String - a vida do jogador.
     */
    public String life(int life) {
        return "life: " + life;
    }

}
