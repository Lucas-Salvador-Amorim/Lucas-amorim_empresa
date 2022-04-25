public class Principal{
    public static void main(String[] args) {
        
    
    
Vendedor v = new Vendedor();
		v.setDataDeEntrada("10/01/2010");
		v.setDepartamento("Vendas");
		v.setEstaNaEmpresa(true);
		v.setNome("Eduardo");
		v.setRg("45");
		//v.calculaSalario();		
		 
		
		Gerente g1 = new Gerente();
		g1.departamento = "Vendas";
		g1.dataDeEntrada = "03/02/1990";
		g1.estaNaEmpresa = true;
		g1.nome = "Eric";		
		g1.rg = "48";
		g1.salario = 3500.0;
		//g1.calculaSalario();
		
		
		g1.setLogin("eric");
		g1.setSenha("123");
		
		Supervisor supervisor = new Supervisor();
		supervisor.salario = 5000.0;


        System.out.println(v.getDataDeEntrada());
		System.out.println(v.getDepartamento());
		System.out.println(v.getNome());
		System.out.println(v.getRg());
		System.out.println(v.getSalario());
		System.out.println(v.isEstaNaEmpresa());
		
}
}