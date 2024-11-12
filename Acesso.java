package AcessoSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Acesso {
	
	private WebDriver driver;
	
		
	
	@Given("que acesso o site")
	public void que_acesso_o_site() {
		
		
		driver = new ChromeDriver ();
		
		System.setProperty("webdriver.chrome.driver","c://Users//Poliana//eclipse-workspace//chromedriver-win64//chromedriver.exe");
		driver.get("https://imobiliario.desenvolvimento.taya.com.br/cadastro-parceiro");
		
	}
	
	
	@Given("cadastro cnpj {string}")
	public void cadastro_cnpj(String cnpj) {
	
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(":rl:")));
		driver.findElement(By.id(":rl:")).sendKeys(cnpj);

	}

	@Given("cadastro razao {string}")
	public void cadastro_razao(String razao) {
	
		driver.findElement(By.id(":rm:")).sendKeys(razao);

	}
	

	@Given("cadastro nome pessoa {string}")
	public void cadastro_nome(String nome) {

		
		driver.findElement(By.id(":rn:")).sendKeys(nome);

	}

	@Given("cadastro site {string}")
	public void cadastro_site(String site) {
		
		driver.findElement(By.id(":ro:")).sendKeys(site);

	}

	@Given("cadastro telefone {string}")
	public void cadastro_telefone(String telefone) {
		
		driver.findElement(By.id(":rp:")).sendKeys(telefone);

	}

	@When("clico no botão proxima pagina")
	public void clico_no_botão_proxima_pagina() {
	}

	@Then("o sistena passa para a proxima pagina")
	public void o_sistena_passa_para_a_proxima_pagina() {
		
		driver.findElement(By.className("MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-fullWidth MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-fullWidth css-rbcx11")).click();

	}


	@Given("logo após o login")
	public void logo_após_o_login() {
		
		
	}
	
	@Given("cadastro nome {string}")
	public void cadastro_nome_pessoa(String nomepessoa) {
		
		driver.findElement(By.id(":rg:")).sendKeys(nomepessoa);

			}
	
	@Given("cadastro cpf {string}")
	public void cadastro_cpf(String cpf) {

		driver.findElement(By.id(":rh:")).sendKeys(cpf);

		
	}
	@Given("cadastro rg {string}")
	public void cadastro_rg(String rg) {
		
		driver.findElement(By.id(":ri:")).sendKeys(rg);


	
	}
	@Given("cadastro celular {string}")
	public void cadastro_celular(String celular) {
		
		driver.findElement(By.id(":rj:")).sendKeys(celular);

		
		
	}
	@Given("cadastro email {string}")
	public void cadastro_email(String email_pessoa) {
		
		driver.findElement(By.id(":rk:")).sendKeys(email_pessoa);

	}
	@When("clico em enviar")
	public void clico_em_enviar() {
		
		driver.findElement(By.xpath("//checkbox[@input class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3']")).click();
		driver.findElement(By.xpath("//button[@button class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-fullWidth MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-fullWidth css-17my5vf' ]")).click();


		
	}
	
	@Then("o sistena retorna para a tela de login")
	public void o_sistena_retorna_para_a_tela_de_login() {
	}

		
		

}