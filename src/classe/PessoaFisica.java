package classe;

public class PessoaFisica extends Pessoa {
  private String cpf;
  private String rg;

  public PessoaFisica(String nome, String cpf, int idade, String rg, String email, String fone) {
    this.setNome(nome);
    this.setCpf(cpf);
    this.setIdade(idade);
    this.setRg(rg);
    this.setEmail(email);
    this.setFone(fone);
  }

  @Override
  public String toString() {
    return "PessoaFisica [Nome=" + getNome() + ", CPF=" + getCpf() + ", Idade=" + getIdade() + ", Rg=" + getRg()
        + " email=" + getEmail() + " fone=" + getFone() + "]";
  }

  public String getRg() {
    return rg;
  }

  public void setRg(String rg) {
    this.rg = rg;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

}
