# Documentação: Exceções Checadas em Java

## O que foi implementado

- Criação de uma exceção personalizada (EletronicosException) que estende Exception, tornando-a uma exceção checada.
- Implementação de métodos que lançam e propagam exceções checadas.
- Demonstração do tratamento obrigatório de exceções checadas em Java.

## Passos realizados

### 1. Criação da exceção personalizada
Arquivo: `EletronicosException.java`

```java
public class EletronicosException extends Exception {
    public EletronicosException() {
        super();
    }
    public EletronicosException(Boolean ligar) {
        super(String.valueOf(ligar));
    }
}
```

- **Explicação:**
  - Estende Exception, tornando-a checada.
  - Possui construtor padrão e construtor com mensagem.

### 2. Métodos que lançam e propagam exceção
Arquivo: `TestaEletronicos.java`

```java
public static void testarLigarEletronico() throws EletronicosException {
    throw new EletronicosException(false);
}

public static void testarReiniciarEletronico() throws EletronicosException {
    testarLigarEletronico();
}
```

- **Explicação:**
  - `testarLigarEletronico` lança a exceção.
  - `testarReiniciarEletronico` chama o método anterior e também lança na assinatura.

### 3. Tratamento da exceção no método main

```java
public static void main(String[] args) {
    try {
        testarLigarEletronico();
    } catch (EletronicosException e) {
        System.out.println("Exceção capturada: " + e.getMessage());
    }
    try {
        testarReiniciarEletronico();
    } catch (EletronicosException e) {
        System.out.println("Exceção capturada: " + e.getMessage());
    }
}
```

- **Explicação:**
  - O compilador obriga o tratamento da exceção checada.
  - O tratamento é feito com try-catch, exibindo a mensagem da exceção.

## Conceitos aprendidos

- **Exceção checada:** Deve ser tratada obrigatoriamente (try-catch ou throws).
- **throw new:** Instancia e lança a exceção.
- **throws na assinatura:** Propaga a exceção para quem chama o método.
- **try-catch:** Bloco para capturar e tratar exceções.
- **Boas práticas:** Tratar exceções no método main, evitando repassar para a JVM.

## Dicas para fixação

- Sempre trate exceções checadas com try-catch ou repasse com throws.
- Use mensagens claras nas exceções para facilitar o entendimento do erro.
- Prefira tratar exceções no main para evitar encerramento abrupto do programa.

---

*Documentação gerada com apoio do GitHub Copilot para estudo e fixação de exceções em Java.*

