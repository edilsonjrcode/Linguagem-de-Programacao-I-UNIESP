package Estrutura;

import java.util.Date;

public class Atendente extends Cliente {

    NivelSuporte nivelSuporte;

    public Atendente(){

    }

    public Atendente(String nome, String cpf, Date dataNascimento, String profissao, String email) {
        super(nome, cpf, dataNascimento, profissao, email);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getCpf() {
        return super.getCpf();
    }

    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf);
    }

    @Override
    public Date getDataNascimento() {
        return super.getDataNascimento();
    }

    @Override
    public void setDataNascimento(Date dataNascimento) {
        super.setDataNascimento(dataNascimento);
    }

    @Override
    public String getProfissao() {
        return super.getProfissao();
    }

    @Override
    public void setProfissao(String profissao) {
        super.setProfissao(profissao);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }



}

