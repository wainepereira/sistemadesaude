/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosCadastro;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author G0011216
 */
@Entity
@Table(name = "clientes", catalog = "hospital", schema = "")
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c"),
    @NamedQuery(name = "Clientes.findByIdclientes", query = "SELECT c FROM Clientes c WHERE c.idclientes = :idclientes"),
    @NamedQuery(name = "Clientes.findByNome", query = "SELECT c FROM Clientes c WHERE c.nome = :nome"),
    @NamedQuery(name = "Clientes.findByEndereco", query = "SELECT c FROM Clientes c WHERE c.endereco = :endereco"),
    @NamedQuery(name = "Clientes.findByCpf", query = "SELECT c FROM Clientes c WHERE c.cpf = :cpf"),
    @NamedQuery(name = "Clientes.findByRg", query = "SELECT c FROM Clientes c WHERE c.rg = :rg"),
    @NamedQuery(name = "Clientes.findByCep", query = "SELECT c FROM Clientes c WHERE c.cep = :cep"),
    @NamedQuery(name = "Clientes.findByCidade", query = "SELECT c FROM Clientes c WHERE c.cidade = :cidade"),
    @NamedQuery(name = "Clientes.findByProfissao", query = "SELECT c FROM Clientes c WHERE c.profissao = :profissao"),
    @NamedQuery(name = "Clientes.findByPai", query = "SELECT c FROM Clientes c WHERE c.pai = :pai"),
    @NamedQuery(name = "Clientes.findByMae", query = "SELECT c FROM Clientes c WHERE c.mae = :mae"),
    @NamedQuery(name = "Clientes.findByTelefone", query = "SELECT c FROM Clientes c WHERE c.telefone = :telefone"),
    @NamedQuery(name = "Clientes.findByEmail", query = "SELECT c FROM Clientes c WHERE c.email = :email"),
    @NamedQuery(name = "Clientes.findByProntuario", query = "SELECT c FROM Clientes c WHERE c.prontuario = :prontuario"),
    @NamedQuery(name = "Clientes.findBySexo", query = "SELECT c FROM Clientes c WHERE c.sexo = :sexo"),
    @NamedQuery(name = "Clientes.findByUf", query = "SELECT c FROM Clientes c WHERE c.uf = :uf"),
    @NamedQuery(name = "Clientes.findByData", query = "SELECT c FROM Clientes c WHERE c.data = :data")})
public class Clientes implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idclientes")
    private Integer idclientes;
    @Column(name = "nome")
    private String nome;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "rg")
    private String rg;
    @Column(name = "cep")
    private String cep;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "profissao")
    private String profissao;
    @Column(name = "pai")
    private String pai;
    @Column(name = "mae")
    private String mae;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "email")
    private String email;
    @Column(name = "prontuario")
    private String prontuario;
    @Column(name = "sexo")
    private String sexo;
    @Basic(optional = false)
    @Column(name = "uf")
    private String uf;
    @Basic(optional = false)
    @Column(name = "data")
    private String data;

    public Clientes() {
    }

    public Clientes(Integer idclientes) {
        this.idclientes = idclientes;
    }

    public Clientes(Integer idclientes, String uf, String data) {
        this.idclientes = idclientes;
        this.uf = uf;
        this.data = data;
    }

    public Integer getIdclientes() {
        return idclientes;
    }

    public void setIdclientes(Integer idclientes) {
        Integer oldIdclientes = this.idclientes;
        this.idclientes = idclientes;
        changeSupport.firePropertyChange("idclientes", oldIdclientes, idclientes);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        changeSupport.firePropertyChange("endereco", oldEndereco, endereco);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        String oldRg = this.rg;
        this.rg = rg;
        changeSupport.firePropertyChange("rg", oldRg, rg);
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        String oldCep = this.cep;
        this.cep = cep;
        changeSupport.firePropertyChange("cep", oldCep, cep);
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        String oldCidade = this.cidade;
        this.cidade = cidade;
        changeSupport.firePropertyChange("cidade", oldCidade, cidade);
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        String oldProfissao = this.profissao;
        this.profissao = profissao;
        changeSupport.firePropertyChange("profissao", oldProfissao, profissao);
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        String oldPai = this.pai;
        this.pai = pai;
        changeSupport.firePropertyChange("pai", oldPai, pai);
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        String oldMae = this.mae;
        this.mae = mae;
        changeSupport.firePropertyChange("mae", oldMae, mae);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        String oldProntuario = this.prontuario;
        this.prontuario = prontuario;
        changeSupport.firePropertyChange("prontuario", oldProntuario, prontuario);
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        String oldSexo = this.sexo;
        this.sexo = sexo;
        changeSupport.firePropertyChange("sexo", oldSexo, sexo);
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        String oldUf = this.uf;
        this.uf = uf;
        changeSupport.firePropertyChange("uf", oldUf, uf);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        String oldData = this.data;
        this.data = data;
        changeSupport.firePropertyChange("data", oldData, data);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idclientes != null ? idclientes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.idclientes == null && other.idclientes != null) || (this.idclientes != null && !this.idclientes.equals(other.idclientes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hosCadastro.Clientes[ idclientes=" + idclientes + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
