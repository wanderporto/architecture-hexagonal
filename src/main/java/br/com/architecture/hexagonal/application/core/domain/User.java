package br.com.architecture.hexagonal.application.core.domain;

import java.time.LocalDate;

public class User {

    private Long id;
    private String name;
    private String instragam;
    private String linkdin;
    private LocalDate birth;
    private Address address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Address getEndereço() {
        return address;
    }

    public void setEndereço(Address address) {
        this.address = address;
    }
}
