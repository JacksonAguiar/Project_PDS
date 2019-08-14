/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpds;

/**
 * Classe para visualizar dados de uma pessoa.
 *
 * @authors: Jackson e João Pedro
 * @version 1.0
 * @since '06/08/2019'
 *
 */
public class Mostrar {

    /**
     * Método que mostra um usuario
     *
     * @param usu String - Usuario a ser vizualizado
     */
    public void usuario(String usu) {
        System.out.println("-> " + usu);
    }

    /**
     * Método que mostra o Estado civil do usuario
     *
     * @param ec String - Estado civil a ser vizualizado
     * @return String - Estado civil
     */
    public String estadoCivil(String ec) {
        return ec;
    }

    /**
     * Método que mostra o Status de trabalho do usuario
     *
     * @param ds Boolean - Estado de trabalho
     * @return String - Retorna o status atualizado
     */
    public String empregado(Boolean ds) {
        if (ds) {
            return "Empregado";

        } else {
            return "Desempregado...";
        }
    }
}
