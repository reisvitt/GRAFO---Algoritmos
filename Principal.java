/**********************************************************************************************
  * Autor: Vitor de Almeida Reis
  * Matricula: 201710793
  * Inicio: 28/10/2019
  * Ultima alteracao: 28/10/2019 
  * Nome: Grafo
  * Funcao: Insere arestas em grafo com quantidade de vertices pre-definidos;
  *         OBS: Grafo direcionado. Caso queira nao direcionado, deve fazer algumas alteracoes
  *         para que seja bidirecional ou insira outra vez com a origem e o destino invertidos.
  *********************************************************************************************/
import model.*;

public class Principal{
  public static void main(String args[]){
    Grafo grafo = new Grafo(5);

    grafo.addAresta(0, 6, 5);
    grafo.addAresta(3, 2, 10);
    grafo.addAresta(4, 2, 4);
    grafo.addAresta(4, 3, 1);
    grafo.addAresta(2, 4, 3);
    //grafo.addAresta(1, 0, 2);

    grafo.imprimir();

  }

}// fim classe