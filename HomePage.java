package pages;

import java.io.IOException;

import org.openqa.selenium.By;

public class HomePage {

	
	By CampoCep = By.xpath("//*[@id=\"relaxation\"]");
	By LupaBtn = By.xpath("//*[@id=\"content\"]/div[3]/div/div[2]/div[2]/form/div[2]/button");
	By CookieBtn = By.xpath("//*[@id=\"btnCookie\"]");
	By CookieCarol = By.xpath("//*[@id=\"carol-fecha\"]");
	By EsperaElemento = By.xpath("//*[@id=\"resultado-DNEC\"]/thead/tr/th[1]");
	
	
	
	

	public void PreencherCep(String cep) {
		Metodos.esperaThread();
		Metodos.esperaThread();
		Metodos.clicar(CookieCarol);
		Metodos.clicar(CookieBtn);
		Metodos.scroll(0, 250);
		Metodos.escrever(cep, CampoCep);
	}

	public void EnviarReq() {
		Metodos.clicar(LupaBtn);
		Metodos.espera(EsperaElemento);

	}

	public void Evidencia(String teste) throws IOException {
		Metodos.evidencias(teste);
		Metodos.esperaThread();
		Metodos.fecharNavegador();
	}
	
}
