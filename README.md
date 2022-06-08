# Teste Renner via DBC Company
Projeto de Automação Portal_PJ_Automacao.
Observação : Eu consegui concluir a automação de front, e não a de API, espero que vocês levem em consideração o trabalho que eu realizei na automação.
Objetivo:
	
	Automatizar testes UI (User Interface) utilizando ferramentas como: Cucumber, jUnit, Appium, Selenium Webdriver, Java,
	Maven, validar e documentar a execução dos cenários de testes das funcionalidades da aplicação.

Pré-requisitos de instalação:

	1. Java JDK 11.
	
	2. Eclipse Java EE 
	
	3. Maven - baixar e descompactar no C raiz.
	
	4. Plug-in do Maven no Eclipse - baixar e instalar pelo Eclipse Marketplace.
	
	5. Google Chrome
	


	

Pré-requisitos de configuração:

	1. Criar variável de ambiente JAVA_HOME.

	2. Criar variável de ambiente MAVEN_HOME.

	3. Adicionar %JAVA_HOME%\bin na variável de ambiente PATH.

	4. Adicionar %MAVEN_HOME%\bin na variável de ambiente PATH.

	5. Ter o projeto baixado (.git).
		



Configurar o projeto seguindo o passo-a-passo abaixo:

	1. Criar o caminho de pastas: C:\Projeto Renner\automation_practice.
	
	2. Clonar o projeto do meu GiTHub (https://github.com/diogorangel).
	
	3. Criar uma workspace vazia no Eclipse Java EE.
	
	4. Eclipse > Window > Preferences > Java > Installed JREs > Manter apenas o JDK 11 LTS.
	
	5. Eclipse > File > Import > Maven > Existing Maven Project > Apontar para o projeto e finalizar.	
		
	6. Alt + F5 no projeto.
	
	PRONTO! Projeto configurado!
	
	
Estrutura do projeto:

	1. src/main/java > package utilitarios
		core já tem a implementação de grande parte dos métodos comuns para automação UI, eles já estão sido estendidos pelo e UtilsWeb. 				Verificar a documentação dos métodos do core antes de qualquer implementação nessas classes. 
		
	2. src/main/resources
		Onde ficam todos os recursos necessários para darem suporte ao core do framework, qualquer alteração aqui pode quebrar a estrutura.
		Importante: o config.properties que configura toda a execução, define: qual navegador, alterar nos respectivos campos do config.properties.
		
	3. src/test/java e src/test/resources
		Nestas pastas o analista de automação irá ser realizada.
		
	4. src/test/java > package pagesweb
		Aqui onde se cria todas as pages web do projeto, cada tela da aplicação corresponde a uma classe page.
		
	5. src/test/java > package runners
		Onde ficam as classes para execuções dos testes locais em Cucumber, cada funcionalidade da aplicação terá uma classe runner.
		
	6. src/test/java > package steps
		Onde ficam os passos dos cenários, aqui é onde se implementa a lógica do passo. Cada funcionalidade da aplicação terá uma classe step,
		respeitando sempre a plataforma.
		
	7. src/test/resources > pasta features
		Onde ficam os cenários escritos em Gherkin. 
