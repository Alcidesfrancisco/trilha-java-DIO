package model;

import java.sql.Date;

public class Chamada {

    private Contato contato;
    private Date timeStamp;
    private String duracao;
    private String tipoChamada;
    private String statusChamada;

    public String getStatusChamada() {
        return statusChamada;
    }
    public void setStatusChamada(String statusChamada) {
        this.statusChamada = statusChamada;
    }
    public Contato getContato() {
        return contato;
    }
    public void setContato(Contato contato) {
        this.contato = contato;
    }
    public Date getTimeStamp() {
        return timeStamp;
    }
    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
    public String getDuracao() {
        return duracao;
    }
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
    public String getTipoChamada() {
        return tipoChamada;
    }
    public void setTipoChamada(String tipoChamada) {
        this.tipoChamada = tipoChamada;
    }

    
}
