package classe;

public class Funcionario extends Pessoa{
  private String cargo;
  private int id;
  private float salr;
  private Pessoa pessoa;

  public Funcionario(String cargo, int id, float salr, Pessoa pess) {
    this.pessoa=pess;
    this.cargo = cargo;
    this.id = id;
    this.salr = salr;
  }

  
  public Pessoa getPessoa() {
    return pessoa;
  }

  public void setPessoa(Pessoa pessoa) {
    this.pessoa = pessoa;
  }
  
  public String getCargo() {
    return cargo;
  }
  public void setCargo(String cargo) {
    this.cargo = cargo;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public float getSalr() {
    return salr;
  }
  public void setSalr(float salr) {
    this.salr = salr;
  }
  
  
}
