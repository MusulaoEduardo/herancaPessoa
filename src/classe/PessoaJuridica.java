package classe;

public class PessoaJuridica extends Pessoa {
  private String cnpj;

  public PessoaJuridica(String nome, String cnpj, int idade, String email, String fone) {
    this.setNome(nome);
    this.setCnpj(cnpj);
    this.setIdade(idade);
    this.setFone(fone);
    this.setEmail(email);

  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  @Override
  public String toString() {
    return "PessoaJuridica [Nome=" + getNome() + ", Cnpj=" + getCnpj() + ", idade=" + getIdade() + ", email="
        + getEmail() + "fone:" + getFone() + "]";
  }

}
