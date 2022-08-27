package com.cursoFundamentoSprintboot.platzi.FundamentosSprint;
import com.cursoFundamentoSprintboot.platzi.FundamentosSprint.Component.ComponetDependecy;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosSprintApplication implements CommandLineRunner {
	private ComponetDependecy componenteDependency;

	public FundamentosSprintApplication(ComponetDependecy componente_dependency) {
		this.componenteDependency = componente_dependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosSprintApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		componenteDependency.saludar();
	}
}
