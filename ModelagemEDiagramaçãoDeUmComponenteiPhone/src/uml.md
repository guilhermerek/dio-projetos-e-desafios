classDiagram
    %% Definições para as classes
    class IPhone {
        +void tocar()
        +void pausar()
        +void selecionarMusica(String novaMusica)
        -void trocandoMusica(String novaMusica)
        +void ligar(String numero)
        +void atender()
        +void recusar()
        +void iniciarCorreioVoz()
        +void exibirPagina(String url)
        +void adicionarNovaAba()
        +void atualizarPagina()
    }

    class ReprodutorMusica {
        +void tocar()
        +void pausar()
        +void selecionarMusica(String novaMusica)
        -void trocandoMusica(String novaMusica)
    }

    class AparelhoTelefonico {
        +void ligar(String numero)
        +void atender()
        +void recusar()
        +void iniciarCorreioVoz()
    }

    class SafariBrowser {
        +void exibirPagina(String url)
        +void adicionarNovaAba()
        +void atualizarPagina()
    }

    %% Interfaces
    class SafariBrowserInterface {
        +void exibirPagina(String url)
        +void adicionarNovaAba()
        +void atualizarPagina()
    }

    class AparelhoTelefonicoInterface {
        +void ligar(String numero)
        +void atender()
        +void recusar()
        +void iniciarCorreioVoz()
    }

    class ReprodutorMusicaInterface {
        +void tocar()
        +void pausar()
        +void selecionarMusica(String novaMusica)
    }

    %% Relações entre classes e interfaces
    IPhone --|> SafariBrowserInterface
    IPhone --|> AparelhoTelefonicoInterface
    IPhone --|> ReprodutorMusicaInterface

    ReprodutorMusica --|> ReprodutorMusicaInterface
    AparelhoTelefonico --|> AparelhoTelefonicoInterface
    SafariBrowser --|> SafariBrowserInterface
