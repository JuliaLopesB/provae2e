package steps;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Executa;
import pages.HomePage;


public class BuscaCepTeste {
	
	HomePage home = new HomePage();

	@Given("esteja na pagina home do site")
	public void esteja_na_pagina_home_do_site() {
	   Executa.abrirNavegador(false);
	}

	@When("digitar cep valido")
	public void digitar_cep_valido() {
	 home.PreencherCep("06657-530");
	}

	@When("enviar requisicao")
	public void enviar_requisicao() {
	 home.EnviarReq();
	}

	@Then("valido endereco valido")
	public void valido_endereco_valido() throws IOException {
	  home.Evidencia("teste-positivo");
	}

	@Given("esteja na pagina home do site correios")
	public void esteja_na_pagina_home_do_site_correios() {
		Executa.abrirNavegador(false);
	}

	@When("digitar cep invalido")
	public void digitar_cep_invalido() {
		home.PreencherCep("00000-100");
	  
	}

	@When("enviar requisicao invalida")
	public void enviar_requisicao_invalida() {
		 home.EnviarReq();
	    
	}

	@Then("valido endereco invalido")
	public void valido_endereco_invalido() throws IOException {
		home.Evidencia("teste-negativo");
	}
}
