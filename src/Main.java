import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double rendaSalario, rendaPrestServico, rendaCapital, gastosMedicos, gastosEduc,
		impostoSalario, impostoServico, impostoCapital, impostoTotal, abateMax, abateTotal;
		
		System.out.print("Renda anual com salário: ");
		rendaSalario = sc.nextDouble();
		
		System.out.print("Renda anual com prestação de serviço: ");
		rendaPrestServico = sc.nextDouble();
		
		System.out.print("Renda anual com ganho de capital: ");
		rendaCapital = sc.nextDouble();
		
		System.out.print("Gastos médicos: ");
		gastosMedicos = sc.nextDouble();
		
		System.out.print("Gastos educacionais: ");
		gastosEduc = sc.nextDouble();
		
		if(rendaSalario/12 <3000) {
			impostoSalario = 0;
		}
		else if(rendaSalario/12 <5000) {
			impostoSalario = rendaSalario *0.1;
		}
		else {
			impostoSalario = rendaSalario * 0.2;
		}
		
		if(rendaPrestServico > 0) {		
			impostoServico = rendaPrestServico * 0.15;
		}else {
			impostoServico = 0;
		}
		
		if(rendaCapital > 0) {
			impostoCapital = rendaCapital * 0.2;
		}else {			
			impostoCapital = 0;
		}		
		
		impostoTotal = impostoSalario + impostoServico + impostoCapital;
		abateMax = (impostoTotal) * 0.3;
		abateTotal = gastosMedicos + gastosEduc;
		
		 System.out.printf("%nRELATÓRIO DE IMPOSTO DE RENDA");
		 System.out.printf("%n%nCONSOLIDADO DE RENDA:");
		 System.out.printf("%nImposto sobre salário: %.2f", impostoSalario);
		 System.out.printf("%nImposto sobre serviços: %.2f", impostoServico);
		 System.out.printf("%nImposto sobre ganho de capital: %.2f", impostoCapital);
		 
		System.out.printf("%n%nDEDUÇÕES:");
		System.out.printf("%nMáximo dedutível: %.2f", abateMax);
		System.out.printf("%nGastos dedutíveis: %.2f", abateTotal);
		
		System.out.printf("%n%nRESUMO:");
		if(abateTotal > abateMax) {
			System.out.printf("%nImposto bruto total: %.2f", impostoTotal);
			System.out.printf("%nAbatimento: %.2f", abateMax );
			System.out.printf("%nImposto devido: %.2f",  impostoTotal - abateMax);
		}else {
			System.out.printf("%nImposto bruto total: %.2f", impostoTotal);
			System.out.printf("%nAbatimento: %.2f", abateTotal );
			System.out.printf("%nImposto devido: %.2f",  impostoTotal - abateTotal);
		}
		
		
		
		
		
		sc.close();
	}

}
