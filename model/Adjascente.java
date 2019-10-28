package model;
public class Adjascente{

  private int verticeDestino;
  private int peso;
  private Adjascente prox;

  /********************************************************************************
   * Metodo: Adjascente
   * Funcao: Construtor de Adjascente, recebe o vertice destino e o peso
   * Parametros: int, int
   * Retorno: void
   ********************************************************************************/
  public Adjascente(int destino, int peso){
    this.verticeDestino = destino;
    this.peso = peso;
    this.prox = null;
  }

  /****************************GETTERS AND SETTERS**********************************/
  public void setVerticeDestino(int verticeDestino){
    this.verticeDestino = verticeDestino;
  }

  public Integer getVerticeDestino(){
    return this.verticeDestino;
  }

  public void setPeso(int peso){
    this.peso = peso;
  }

  public int getPeso(){
    return this.peso;
  }

  public Adjascente setProx(Adjascente prox){
    return this.prox = prox;
  }

  public Adjascente getProx(){
    return this.prox;
  }
  /**************************END GETTERS AND SETTERS*******************************/

  /********************************************************************************
   * Metodo: add
   * Funcao: Verifica se existe mais algum vertice na lista de adjascencia e insere
   *         e insere o novo vertice(aresta);
   * Parametros: int, int
   * Retorno: void
   ********************************************************************************/
  public void add(int destino, int peso){
    if(this.prox != null){
      this.prox.add(destino, peso);
    }else{
      this.prox = new Adjascente(destino, peso);
    }
  }

  /************************************************************************
   * Metodo: imprimir
   * Funcao: Imprime o vertice adjascente se ele existir;
   * Parametros: void
   * Retorno: void
   ***********************************************************************/
  public void imprimir(){
    System.out.print(this.verticeDestino + "(" + this.peso + ")");
    if(this.prox != null){
      System.out.print(", ");
      this.prox.imprimir();
    }
  }

}// fim classe