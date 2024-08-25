classDiagram
    %% Definições para o pacote iPhone
    package iPhone {
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
    }

    %% Definições para o pacote player
    package player {
        class ReprodutorMusica {
            +void tocar()
            +void pausar()
            +void selecionarMusica(String novaMusica)
            -void trocandoMusica(String novaMusica)
        }
    }

    %% Definições para o pacote phone
    package phone {
        class AparelhoTelefonico {
            +void ligar(String numero)
            +void atender()
            +void recusar()
            +void iniciarCorreioVoz()
        }
    }

    %% Definições para o pacote internetBrowser
    package internetBrowser {
        class SafariBrowser {
            +void exibirPagina(String url)
            +void adicionarNovaAba()
            +void atualizarPagina()
        }
    }

    %% Interfaces
    interface SafariBrowserInterface {
        +void exibirPagina(String url)
        +void adicionarNovaAba()
        +void atualizarPagina()
    }

    interface AparelhoTelefonicoInterface {
        +void ligar(String numero)
        +void atender()
        +void recusar()
        +void iniciarCorreioVoz()
    }

    interface ReprodutorMusicaInterface {
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
