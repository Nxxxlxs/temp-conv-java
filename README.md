# *tempconv*
Biblioteca originalmente escrita em Go,  **traduzida para Java** para conversões simples de temperatura. [Clique aqui para acessar o repositório original](https://github.com/ufla-gcc259/aula-git-parte-2)

## 1. Como usar

### 1.1 Configurando o ambiente
Abrir um terminal e verificar se o JDK (Java Development Kit) está instalado em sua máquina através do comando:

```
java -version
```

A saída esperada caso esteja instalado deve ser semelhante à:

```
java version "13.0.2"
```

**Recomenda-se** a instalação de uma **versão igual ou superior** ao mostrado acima, podendo ser realizado seu download [clicando aqui](https://www.oracle.com/java/technologies/downloads/) e escolhendo a versão **compatível com seu sistema operacional**.

### 1.2 Instalando o JDK
**Caso seja necessária** a instalação da JDK, recomenda-se realizar os passos descritos nesse [tutorial](https://mauriciogeneroso.medium.com/configurando-java-4-como-configurar-as-vari%C3%A1veis-java-home-path-e-classpath-no-windows-46040950638f) e em seguida realizar novamente a abertura de um terminal e a execução do comando:

```
java -version
```

Em caso de sucesso, a mensagem com a versão do Java deve ser exibida.

## 2. Executando o código
Abra um terminal na pasta onde se encontra o arquivo **Main.java** e execute a seguinte linha de comando:

```
javac Main.java
```

Por fim execute no terminal a linha de comando:

```
java Main.java
```

### 2.1 Resultado
O resultado a ser obtido deve ser:

```
Que frio! -273.15 °C
Fervendo! 212.0 °F
```

## 3. Importando a biblioteca
Para importar a biblioteca em outros arquivos, basta referenciar o caminho dos diretórios em relação ao arquivo onde se quer usar conforme feito no arquivo Main.java:

```java 
import conversor.Tempconv
``` 
