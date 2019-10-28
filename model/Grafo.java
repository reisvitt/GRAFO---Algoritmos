/*************************************************************************************
* OBS: O vertice foi abstraído para o indice do vetor de Adjascente;
* Logo, o vertice 0 eh o vertices[0] mesmo este sendo do tipo Adjascente e nao Vertice.
* Tal abstracao foi realizada, pois a Classe Vertice iria apenas esta apontando para a 
* lista de Adjascentes, nao possuindo nenhuma outra funcao. Portando, eliminada esta
* parte apenas para simplificacao. 
*/

package model;
public class Grafo{
  private Adjascente[] vertices;

  /********************************************************************************
   * Metodo: Grafo
   * Funcao: Construtor do Grafo, recebe a quantidade de vertices(tamanho do vetor)
   *         e instancia o vetor
   * Parametros: int
   * Retorno: void
   ********************************************************************************/
  public Grafo(int vertices){
    this.vertices = new Adjascente[vertices];
  }

  /************************************************************************
   * Metodo: addAresta
   * Funcao: Adiciona arestas interligando dois vertices(origem, destino)
   *         com um peso;
   * Parametros: int, int, int
   * Retorno: void
   ***********************************************************************/
  public void addAresta(int origem, int destino, int peso){
    if(origem >= 0 && origem < vertices.length && destino >= 0 && destino < vertices.length){ // verifica se o vertice existe no vetor
      if(this.vertices[origem] == null){ // verifica se o vertice jah possui adjascente
        this.vertices[origem] = new Adjascente(destino, peso); // cria a lista de adjascencia com a nova aresta inserida
        return;
      }
      this.vertices[origem].add(destino, peso); // insere a aresta ao final da lista de adjascencia

    }else{
      System.out.println("Vertice inválido! Vertices vão de 0 a " + vertices.length + ".");
    }
  }

  /************************************************************************
   * Metodo: imprimir
   * Funcao: Imprime o grafo se ele existir;
   * Parametros: void
   * Retorno: void
   ***********************************************************************/
  public void imprimir(){

    for(int i = 0; i < this.vertices.length; i++){ // varre cada vertice do vetor de vertices
      System.out.print("V" + i + " -> ");

      if(this.vertices[i] != null){ // se o vertice tiver vertices adjascentes
        
        this.vertices[i].imprimir(); // impre os vertices adjascentes
        System.out.println(); // quebrar linha
      }else{
        System.out.println("null"); // se nao tiver vertices adjascentes imprime null
      }
    }
  }

}// fim classe