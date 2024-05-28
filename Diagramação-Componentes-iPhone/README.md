# Diagrama UML do Sistema

Neste repositório foi feito um diagrama UML para um sistema que inclui poucas funcionalidades de um smartphone como: Reprodutor de musica e Navegar na internet. O diagrama foi criado usando a sintaxe Mermaid.

## Funcionalidades Modeladas

- **Reprodutor Musical**
  - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`

- **Aparelho Telefônico**
  - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`

- **Navegador na Internet**
  - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

As interfaces definem os métodos, e as classes implementam essas interfaces para fornecer a funcionalidade desejada.

## Funcionalidades

- **Prefixo (I)**
    - Inidica Interface.

- **Implementa a interface**
    - Através da seta "<|.."

- **Utiliza**
    - A seta "-->" demonstra a utilização do recurso, como por exemplo: `AparelhoTelefonico --> ReprodutorMusical : utiliza` indica que AparelhoTelefonico utiliza ReprodutorMusical.



## Visualização do Diagrama

```mermaid
classDiagram
    class IReprodutorMusical {
        +void tocar()
        +void pausar()
        +void selecionarMusica(String musica)
    }

    class IAparelhoTelefonico {
        +void ligar(String numero)
        +void atender()
        +void iniciarCorreioVoz()
    }

    class INavegarNaInternet {
        +void exibirPagina(String url)
        +void adicionarNovaAba()
        +void atualizarPagina()
    }

    class ReprodutorMusical {
        +void tocar()
        +void pausar()
        +void selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +void ligar(String numero)
        +void atender()
        +void iniciarCorreioVoz()
    }

    class NavegarNaInternet {
        +void exibirPagina(String url)
        +void adicionarNovaAba()
        +void atualizarPagina()
    }

    IReprodutorMusical <|.. ReprodutorMusical
    IAparelhoTelefonico <|.. AparelhoTelefonico
    INavegadorNaInternet <|.. NavegadorNaInternet

    AparelhoTelefonico --> ReprodutorMusical : utiliza
    NavegadorNaInternet --> ReprodutorMusical : exibe
