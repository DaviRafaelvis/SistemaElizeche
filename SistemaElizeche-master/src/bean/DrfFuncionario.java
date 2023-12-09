package bean;
// Generated 30/11/2023 10:16:28 by Hibernate Tools 4.3.1s


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DrfFuncionario generated by hbm2java
 */
@Entity
@Table(name="drf_funcionario"
    ,catalog="db_davi_elizeche"
)
public class DrfFuncionario  implements java.io.Serializable {


     private int drfIdFuncionario;
     private String drfNome;
     private String drfEmail;
     private String drfCpf;
     private String drfCep;
     private String drfTelefone;
     private String drfRg;
     private Date drfDataNascimento;
     private int drfSexo;
     private String drfCidade;
     private String drfBairro;
     private String drfCelular;
     private String drfPais;
     private String drfApelido;
 

    public DrfFuncionario() {
    }

	
    public DrfFuncionario(int drfIdFuncionario, String drfNome, String drfEmail, String drfCpf, String drfCep, String drfTelefone, String drfRg, Date drfDataNascimento, int drfSexo, String drfCidade, String drfBairro, String drfCelular, String drfPais, String drfApelido) {
        this.drfIdFuncionario = drfIdFuncionario;
        this.drfNome = drfNome;
        this.drfEmail = drfEmail;
        this.drfCpf = drfCpf;
        this.drfCep = drfCep;
        this.drfTelefone = drfTelefone;
        this.drfRg = drfRg;
        this.drfDataNascimento = drfDataNascimento;
        this.drfSexo = drfSexo;
        this.drfCidade = drfCidade;
        this.drfBairro = drfBairro;
        this.drfCelular = drfCelular;
        this.drfPais = drfPais;
        this.drfApelido = drfApelido;
    }
  
   
     @Id 

    
    @Column(name="drf_idFuncionario", unique=true, nullable=false)
    public int getDrfIdFuncionario() {
        return this.drfIdFuncionario;
    }
    
    public void setDrfIdFuncionario(int drfIdFuncionario) {
        this.drfIdFuncionario = drfIdFuncionario;
    }

    
    @Column(name="drf_nome", nullable=false, length=45)
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

    
    @Column(name="drf_cpf", nullable=false, length=18)
    public String getDrfCpf() {
        return this.drfCpf;
    }
    
    public void setDrfCpf(String drfCpf) {
        this.drfCpf = drfCpf;
    }

    
    @Column(name="drf_cep", nullable=false, length=22)
    public String getDrfCep() {
        return this.drfCep;
    }
    
    public void setDrfCep(String drfCep) {
        this.drfCep = drfCep;
    }

    
    @Column(name="drf_telefone", nullable=false, length=25)
    public String getDrfTelefone() {
        return this.drfTelefone;
    }
    
    public void setDrfTelefone(String drfTelefone) {
        this.drfTelefone = drfTelefone;
    }

    
    @Column(name="drf_rg", nullable=false, length=20)
    public String getDrfRg() {
        return this.drfRg;
    }
    
    public void setDrfRg(String drfRg) {
        this.drfRg = drfRg;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="drf_data_nascimento", nullable=false, length=10)
    public Date getDrfDataNascimento() {
        return this.drfDataNascimento;
    }
    
    public void setDrfDataNascimento(Date drfDataNascimento) {
        this.drfDataNascimento = drfDataNascimento;
    }

    
    @Column(name="drf_sexo", nullable=false)
    public int getDrfSexo() {
        return this.drfSexo;
    }
    
    public void setDrfSexo(int drfSexo) {
        this.drfSexo = drfSexo;
    }

    
    @Column(name="drf_cidade", nullable=false, length=25)
    public String getDrfCidade() {
        return this.drfCidade;
    }
    
    public void setDrfCidade(String drfCidade) {
        this.drfCidade = drfCidade;
    }

    
    @Column(name="drf_bairro", nullable=false, length=25)
    public String getDrfBairro() {
        return this.drfBairro;
    }
    
    public void setDrfBairro(String drfBairro) {
        this.drfBairro = drfBairro;
    }

    
    @Column(name="drf_celular", nullable=false, length=25)
    public String getDrfCelular() {
        return this.drfCelular;
    }
    
    public void setDrfCelular(String drfCelular) {
        this.drfCelular = drfCelular;
    }

    
    @Column(name="drf_pais", nullable=false, length=25)
    public String getDrfPais() {
        return this.drfPais;
    }
    
    public void setDrfPais(String drfPais) {
        this.drfPais = drfPais;
    }

    
    @Column(name="drf_apelido", nullable=false, length=45)
    public String getDrfApelido() {
        return this.drfApelido;
    }
    
    public void setDrfApelido(String drfApelido) {
        this.drfApelido = drfApelido;
    }

@Override
    public String toString(){
    return this.getDrfNome();
    }
    @Override
    public boolean equals (Object object){
    if(object instanceof DrfFuncionario){
      DrfFuncionario funcionario = (DrfFuncionario) object;
    if(this.getDrfIdFuncionario()==funcionario.getDrfIdFuncionario()){
    return true;
    } }
    return false;
}




}


