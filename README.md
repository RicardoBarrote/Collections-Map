<h1>
  Interface Map do Java
</h1>

<div>
  <h5>
    Map é uma estrutura de dados generica, passando dois tipos Map < K, V > tipo chave e o tipo valor.
  </h5>
      <h5>
        Através da chave conseguimos acessar o nosso valor ou seja a chave não pode ser repetida, caso haja duas chaves iguais será sobrescrita pela última chave(Atualização).
      </h5>
      <h5>
        Acesso, inserção e remoção dos elementos são rápidos.
      </h5>
      <h5>
        Faz parte do pacote Java.util.
      </h5>
</div>

##

![hierarquia_interface](https://github.com/RicardoBarrote/Collections-Map/assets/86330372/3c59891c-14c4-418e-bd93-33b255bb6000)
<p>
  Hierarquia da Interface Map
</p>

##

<div>
  <h5>
    Sintaxe: Map<E> mapNome = new Type<>();
  </h5>
      <p>
        Observação: < E > é o objeto declado, podendo conter valores Wrappers class ou Collections.
      </p>
          <p>
            Wrappers Class: Boolean, Caracter, Byte, Short, Integer, Long, Float, Double.
          </p>
          <p>
            Type: é o tipo da coleção a ser utilizada.
          </p> 
</div>
          
  ##
          
   <div>
          <h5>
            Principais implementações:
          </h5> 
          <p>
            HashMap - mais rápido e não ordenado.
          </p>
          <p>
            TreeMap - mais lento porém ordenado através do compareTo do objeto (ou Comparator).
          </p>
          <p>
            LinkedHashMap - velocidade média e elementos na ordem em que são adicionados.
          </p>
          <h5>
            Sintaxe 0.1: Map< String, String > telefonia = new HashMap <>();
          </h5>
              <h5>
                Sintaxe 0.2: Map<String, String> telefoniaOrdenado = new TreeMap <>(telefonia);
              </h5>
  </div>

  ##

  <div>
    <h5>
      Métodos importantes:
    </h5>
    <p>
      .put(Chave, valor) - Adiciona um elemento na chave com o seu valor.
    </p>
    <p>
      .remove(key) - remove uma chave
    </p>
    <p>
      .containsKey(chave) - Verifica se já contém uma chave 
    </p>
    <p>
      .getKey(chave) - Recupera um elemento pela chave
    </p>
    <p>
      Observação: Esses métodos são baseados em equals e hashCode, caso eles não existam e utilizado a comparação por ponteiros.
    </p>
    <p>
      .clear() - Limpar o conjunto
    </p>
    <p>
      .sie() - Verificar o tamanho do conjunto
    </p>
    <h5>
      .keySet(chave) - Retorna um Set < chave > com as chaves contida no Map
    </h5>
        <h5>
          .values() - Retorna um Collection < valor > 
        </h5>
  </div>

  ##

  <div>
    Fala Dev! Neste repositorio pratiquei três exercicios utilizando apenas a Interface Map, código está aberto para você melhor visualizar!
  </div>

  ##

  <div>
  <a href="https://www.instagram.com/ricardo_barrote/" target="_blank"><img src="https://img.shields.io/badge/-Instagram-%23E4405F?style=for-the-badge&logo=instagram&logoColor=white" target="_blank"></a>
  <a href = "mailto:ricardoambscfc@gmail.com"><img src="https://img.shields.io/badge/-Gmail-%23333?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>
  <a href="https://www.linkedin.com/in/ricardo-barrote/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a> 
</div>
