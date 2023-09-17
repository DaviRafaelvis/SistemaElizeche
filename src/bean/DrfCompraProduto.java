package bean;
// Generated 16/09/2023 12:24:10 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * DrfCompraProduto generated by hbm2java
 */
@Entity
@Table(name="drf_compra_produto"
    ,catalog="db_davielizeche"
)
public class DrfCompraProduto  implements java.io.Serializable {


     private int drfIdcompraProduto;
     private DrfProduto drfProduto;
     private double drfQuantidade;
     private double drfValorUnitario;

    public DrfCompraProduto() {
    }

    public DrfCompraProduto(int drfIdcompraProduto, DrfProduto drfProduto, double drfQuantidade, double drfValorUnitario) {
       this.drfIdcompraProduto = drfIdcompraProduto;
       this.drfProduto = drfProduto;
       this.drfQuantidade = drfQuantidade;
       this.drfValorUnitario = drfValorUnitario;
    }
   
     @Id 

    
    @Column(name="drf_idcompra_produto", unique=true, nullable=false)
    public int getDrfIdcompraProduto() {
        return this.drfIdcompraProduto;
    }
    
    public void setDrfIdcompraProduto(int drfIdcompraProduto) {
        this.drfIdcompraProduto = drfIdcompraProduto;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="drf_id_produto", nullable=false)
    public DrfProduto getDrfProduto() {
        return this.drfProduto;
    }
    
    public void setDrfProduto(DrfProduto drfProduto) {
        this.drfProduto = drfProduto;
    }

    
    @Column(name="drf_quantidade", nullable=false, precision=12, scale=0)
    public double getDrfQuantidade() {
        return this.drfQuantidade;
    }
    
    public void setDrfQuantidade(double drfQuantidade) {
        this.drfQuantidade = drfQuantidade;
    }

    
    @Column(name="drf_valor_unitario", nullable=false, precision=12, scale=0)
    public double getDrfValorUnitario() {
        return this.drfValorUnitario;
    }
    
    public void setDrfValorUnitario(double drfValorUnitario) {
        this.drfValorUnitario = drfValorUnitario;
    }




}


