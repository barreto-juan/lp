/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Juan
 */
@Entity
@Table(name = "vendas", catalog = "banco_vendas", schema = "")
@NamedQueries({
    @NamedQuery(name = "Vendas.findAll", query = "SELECT v FROM Vendas v")
    , @NamedQuery(name = "Vendas.findByIdvenda", query = "SELECT v FROM Vendas v WHERE v.idvenda = :idvenda")
    , @NamedQuery(name = "Vendas.findByVendedorIdvendedor", query = "SELECT v FROM Vendas v WHERE v.vendedorIdvendedor = :vendedorIdvendedor")
    , @NamedQuery(name = "Vendas.findByClienteIdcliente", query = "SELECT v FROM Vendas v WHERE v.clienteIdcliente = :clienteIdcliente")
    , @NamedQuery(name = "Vendas.findByProduto", query = "SELECT v FROM Vendas v WHERE v.produto = :produto")
    , @NamedQuery(name = "Vendas.findByDescricao", query = "SELECT v FROM Vendas v WHERE v.descricao = :descricao")
    , @NamedQuery(name = "Vendas.findByPreco", query = "SELECT v FROM Vendas v WHERE v.preco = :preco")
    , @NamedQuery(name = "Vendas.findByQuantidade", query = "SELECT v FROM Vendas v WHERE v.quantidade = :quantidade")
    , @NamedQuery(name = "Vendas.findByDtVenda", query = "SELECT v FROM Vendas v WHERE v.dtVenda = :dtVenda")})
public class Vendas implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idvenda")
    private Integer idvenda;
    @Column(name = "vendedor_idvendedor")
    private Integer vendedorIdvendedor;
    @Column(name = "cliente_idcliente")
    private Integer clienteIdcliente;
    @Column(name = "produto")
    private String produto;
    @Column(name = "descricao")
    private String descricao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preco")
    private Double preco;
    @Column(name = "quantidade")
    private Integer quantidade;
    @Column(name = "dtVenda")
    @Temporal(TemporalType.DATE)
    private Date dtVenda;

    public Vendas() {
    }

    public Vendas(Integer idvenda) {
        this.idvenda = idvenda;
    }

    public Integer getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(Integer idvenda) {
        Integer oldIdvenda = this.idvenda;
        this.idvenda = idvenda;
        changeSupport.firePropertyChange("idvenda", oldIdvenda, idvenda);
    }

    public Integer getVendedorIdvendedor() {
        return vendedorIdvendedor;
    }

    public void setVendedorIdvendedor(Integer vendedorIdvendedor) {
        Integer oldVendedorIdvendedor = this.vendedorIdvendedor;
        this.vendedorIdvendedor = vendedorIdvendedor;
        changeSupport.firePropertyChange("vendedorIdvendedor", oldVendedorIdvendedor, vendedorIdvendedor);
    }

    public Integer getClienteIdcliente() {
        return clienteIdcliente;
    }

    public void setClienteIdcliente(Integer clienteIdcliente) {
        Integer oldClienteIdcliente = this.clienteIdcliente;
        this.clienteIdcliente = clienteIdcliente;
        changeSupport.firePropertyChange("clienteIdcliente", oldClienteIdcliente, clienteIdcliente);
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        String oldProduto = this.produto;
        this.produto = produto;
        changeSupport.firePropertyChange("produto", oldProduto, produto);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        Double oldPreco = this.preco;
        this.preco = preco;
        changeSupport.firePropertyChange("preco", oldPreco, preco);
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        Integer oldQuantidade = this.quantidade;
        this.quantidade = quantidade;
        changeSupport.firePropertyChange("quantidade", oldQuantidade, quantidade);
    }

    public Date getDtVenda() {
        return dtVenda;
    }

    public void setDtVenda(Date dtVenda) {
        Date oldDtVenda = this.dtVenda;
        this.dtVenda = dtVenda;
        changeSupport.firePropertyChange("dtVenda", oldDtVenda, dtVenda);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvenda != null ? idvenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendas)) {
            return false;
        }
        Vendas other = (Vendas) object;
        if ((this.idvenda == null && other.idvenda != null) || (this.idvenda != null && !this.idvenda.equals(other.idvenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.Vendas[ idvenda=" + idvenda + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
