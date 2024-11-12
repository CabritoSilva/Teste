Feature: Acessar o site

  Scenario Outline: Cadastrar os dados
    Given logo após o login
    And cadastro nome pessoa <nomepessoa>
    And cadastro cpf <cpf>
    And cadastro rg <rg>
    And cadastro celular <celular>
    And cadastro email <email_pessoa>
    When clico em enviar
    Then o sistena retorna para a tela de login

    Examples: 
      | nomepessoa | cpf            | rg          | celular       | email_pessoa       |
      | "teste"    | "116433047045" | "288677776" | "21997861123" | "carlos@ig.com.br" |
