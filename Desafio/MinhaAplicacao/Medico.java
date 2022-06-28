public class Medico {
    Long id;
    String nome;
    String crm;
    String email;
    String telefone;

    // método construtor

    public Medico(String crm, String nome) {
        this.crm = crm;
        this.nome = nome;
    }

    public Medico(String crm) {
        this.crm = crm;
    }

    // Getters e Setters e toString

    public String getcrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // método toString
    public String toString() {
        return this.crm + " " + this.nome + " " + this.email + " " + this.telefone;
    }
}