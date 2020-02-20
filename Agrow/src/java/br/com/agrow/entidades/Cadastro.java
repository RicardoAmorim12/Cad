/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agrow.entidades;

import java.util.Date;


/**
 *
 * @author ricar
 */
public class Cadastro {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the solicitante
     */
    public String getSolicitante() {
        return solicitante;
    }

    /**
     * @param solicitante the solicitante to set
     */
    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the data_limite
     */
    public Date getData_limite() {
        return data_limite;
    }

    /**
     * @param data_limite the data_limite to set
     */
    public void setData_limite(Date data_limite) {
        this.data_limite = data_limite;
    }

    /**
     * @return the responsavel
     */
    public String getResponsavel() {
        return responsavel;
    }

    /**
     * @param responsavel the responsavel to set
     */
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    private int id;
    private String cliente;
    private String solicitante;
    private String descricao;
    private Date data_limite;
    private String responsavel;
}
