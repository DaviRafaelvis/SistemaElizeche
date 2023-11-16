package bean;
// Generated 22/09/2023 15:22:46 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DrfCompra generated by hbm2java
 */
@Entity
@Table(name="drf_compra"
    ,catalog="db_davi_elizeche"
)
public class DrfCompra  implements java.io.Serializable {


     private int drfIdcompra;
     private DrfFornecedor drfFornecedor;
     private int drfIdFuncionario;
     private Date drfDataCompra;
     private double drfValorTotalCompra;
     private int drfFormaPagamento;
     private int drfStatusCompra;

    public DrfCompra() {
    }

    public DrfCompra(int drfIdcompra, DrfFornecedor drfFornecedor, int drfIdFuncionario, Date drfDataCompra, double drfValorTotalCompra, int drfFormaPagamento, int drfStatusCompra) {
       this.drfIdcompra = drfIdcompra;
       this.drfFornecedor = drfFornecedor;
       this.drfIdFuncionario = drfIdFuncionario;
       this.drfDataCompra = drfDataCompra;
       this.drfValorTotalCompra = drfValorTotalCompra;
       this.drfFormaPagamento = drfFormaPagamento;
       this.drfStatusCompra = drfStatusCompra;
    }
   
     @Id 

    
    @Column(name="drf_idcompra", unique=true, nullable=false)
    public int getDrfIdcompra() {
        return this.drfIdcompra;
    }
    
    public void setDrfIdcompra(int drfIdcompra) {
        this.drfIdcompra = drfIdcompra;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="drf_id_fornecedor", nullable=false)
    public DrfFornecedor getDrfFornecedor() {
        return this.drfFornecedor;
    }
    
    public void setDrfFornecedor(DrfFornecedor drfFornecedor) {
        this.drfFornecedor = drfFornecedor;
    }

    
    @Column(name="drf_id_funcionario", nullable=false)
    public int getDrfIdFuncionario() {
        return this.drfIdFuncionario;
    }
    
    public void setDrfIdFuncionario(int drfIdFuncionario) {
        this.drfIdFuncionario = drfIdFuncionario;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="drf_data_compra", nullable=false, length=10)
    public Date getDrfDataCompra() {
        return this.drfDataCompra;
    }
    
    public void setDrfDataCompra(Date drfDataCompra) {
        this.drfDataCompra = drfDataCompra;
    }

    
    @Column(name="drf_valor_total_compra", nullable=false, precision=10, scale=0)
    public double getDrfValorTotalCompra() {
        return this.drfValorTotalCompra;
    }
    
    public void setDrfValorTotalCompra(double drfValorTotalCompra) {
        this.drfValorTotalCompra = drfValorTotalCompra;
    }

    
    @Column(name="drf_forma_pagamento", nullable=false, length=45)
    public int getDrfFormaPagamento() {
        return this.drfFormaPagamento;
    }
    
    public void setDrfFormaPagamento(int drfFormaPagamento) {
        this.drfFormaPagamento = drfFormaPagamento;
    }

    
    @Column(name="drf_status_compra", nullable=false)
    public int getDrfStatusCompra() {
        return this.drfStatusCompra;
    }
    
    public void setDrfStatusCompra(int drfStatusCompra) {
        this.drfStatusCompra = drfStatusCompra;
    }




}


