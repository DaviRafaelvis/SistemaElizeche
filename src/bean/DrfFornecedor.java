package bean;
// Generated 22/09/2023 15:22:46 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * DrfFornecedor generated by hbm2java
 */
@Entity
@Table(name="drf_fornecedor"
    ,catalog="db_davielizeche"
)
public class DrfFornecedor  implements java.io.Serializable {


     private int drfIdfornecedor;
     private String drfNome;
     private String drfEmail;
     private String drfTelefone;
     private String drfCnpj;
     private String drfEndereco;
     

    public DrfFornecedor() {
    }

	
    public DrfFornecedor(int drfIdfornecedor, String drfNome, String drfEmail, String drfTelefone, String drfCnpj, String drfEndereco) {
        this.drfIdfornecedor = drfIdfornecedor;
        this.drfNome = drfNome;
        this.drfEmail = drfEmail;
        this.drfTelefone = drfTelefone;
        this.drfCnpj = drfCnpj;
        this.drfEndereco = drfEndereco;
    }
   
   
     @Id 

    
    @Column(name="drf_idfornecedor", unique=true, nullable=false)
    public int getDrfIdfornecedor() {
        return this.drfIdfornecedor;
    }
    
    public void setDrfIdfornecedor(int drfIdfornecedor) {
        this.drfIdfornecedor = drfIdfornecedor;
    }

    
    @Column(name="drf_nome", nullable=false, length=50)
    public String getDrfNome() {
        return this.drfNome;
    }
    
    public void setDrfNome(String drfNome) {
        this.drfNome = drfNome;
    }

    
    @Column(name="drf_email", nullable=false, length=50)
    public String getDrfEmail() {
        return this.drfEmail;
    }
    
    public void setDrfEmail(String drfEmail) {
        this.drfEmail = drfEmail;
    }

    
    @Column(name="drf_telefone", nullable=false, length=20)
    public String getDrfTelefone() {
        return this.drfTelefone;
    }
    
    public void setDrfTelefone(String drfTelefone) {
        this.drfTelefone = drfTelefone;
    }

    
    @Column(name="drf_cnpj", nullable=false, length=18)
    public String getDrfCnpj() {
        return this.drfCnpj;
    }
    
    public void setDrfCnpj(String drfCnpj) {
        this.drfCnpj = drfCnpj;
    }

    
    @Column(name="drf_endereco", nullable=false, length=45)
    public String getDrfEndereco() {
        return this.drfEndereco;
    }
    
    public void setDrfEndereco(String drfEndereco) {
        this.drfEndereco = drfEndereco;
    }






}


