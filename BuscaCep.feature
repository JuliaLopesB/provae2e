
Feature: Buscar Cep
Eu como usuario quero testar busca cep para validar sucesso

 @Executa
  Scenario: Cep valido
    Given esteja na pagina home do site  
    When digitar cep valido
    And enviar requisicao
    Then valido endereco valido
  @Executa  
    Scenario: Cep invalido
    Given esteja na pagina home do site correios  
    When digitar cep invalido
    And enviar requisicao invalida
    Then valido endereco invalido

