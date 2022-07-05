package br.com.architecture.hexagonal.adapters.inbound.dto;

import java.time.LocalDate;

public class UserRequest {
    private String name;
    private String instragam;
    private String linkdin;
    private LocalDate birth;
    private String cep;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstragam() {
        return instragam;
    }

    public void setInstragam(String instragam) {
        this.instragam = instragam;
    }

    public String getLinkdin() {
        return linkdin;
    }

    public void setLinkdin(String linkdin) {
        this.linkdin = linkdin;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
