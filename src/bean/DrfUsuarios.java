package bean;
// Generated 22/09/2023 15:22:46 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DrfUsuarios generated by hbm2java
 */
@Entity
@Table(name="drf_usuarios"
    ,catalog="db_davielizeche"
)
public class DrfUsuarios  implements java.io.Serializable {


     private int drfIdUsuarios;
     private String drfNome;
     private String drfApelido;
     private String drfCpf;
     private Date drfDataNascimento;
     private String drfSenha;
     private int drfNivel;
     private String drfAtivo;

    public DrfUsuarios() {
    }

    public DrfUsuarios(int drfIdUsuarios, String drfNome, String drfApelido, String drfCpf, Date drfDataNascimento, String drfSenha, int drfNivel, String drfAtivo) {
       this.drfIdUsuarios = drfIdUsuarios;
       this.drfNome = drfNome;
       this.drfApelido = drfApelido;
       this.drfCpf = drfCpf;
       this.drfDataNascimento = drfDataNascimento;
       this.drfSenha = drfSenha;
       this.drfNivel = drfNivel;
       this.drfAtivo = drfAtivo;
    }
   
     @Id 

    
    @Column(name="drf_idUsuarios", unique=true, nullable=false)
    public int getDrfIdUsuarios() {
        return this.drfIdUsuarios;
    }
    
    public void setDrfIdUsuarios(int drfIdUsuarios) {
        this.drfIdUsuarios = drfIdUsuarios;
    }

    
    @Column(name="drf_nome", nullable=false, length=50)
    public String getDrfNome() {
        return this.drfNome;
    }
    
    public void setDrfNome(String drfNome) {
        this.drfNome = drfNome;
    }

    
    @Column(name="drf_apelido", nullable=false, length=25)
    public String getDrfApelido() {
        return this.drfApelido;
    }
    
    public void setDrfApelido(String drfApelido) {
        this.drfApelido = drfApelido;
    }

    
    @Column(name="drf_cpf", nullable=false, length=14)
    public String getDrfCpf() {
        return this.drfCpf;
    }
    
    public void setDrfCpf(String drfCpf) {
        this.drfCpf = drfCpf;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="drf_dataNascimento", nullable=false, length=10)
    public Date getDrfDataNascimento() {
        return this.drfDataNascimento;
    }
    
    public void setDrfDataNascimento(Date drfDataNascimento) {
        this.drfDataNascimento = drfDataNascimento;
    }

    
    @Column(name="drf_senha", nullable=false, length=45)
    public String getDrfSenha() {
        return this.drfSenha;
    }
    
    public void setDrfSenha(String drfSenha) {
        this.drfSenha = drfSenha;
    }

    
    @Column(name="drf_nivel", nullable=false)
    public int getDrfNivel() {
        return this.drfNivel;
    }
    
    public void setDrfNivel(int drfNivel) {
        this.drfNivel = drfNivel;
    }

    
    @Column(name="drf_ativo", nullable=false, length=1)
    public String getDrfAtivo() {
        return this.drfAtivo;
    }
    
    public void setDrfAtivo(String drfAtivo) {
        this.drfAtivo = drfAtivo;
    }




}


