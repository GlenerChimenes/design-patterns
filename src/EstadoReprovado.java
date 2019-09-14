
public class EstadoReprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {

		throw new RuntimeException("Or�amento reprovados n�o recebem desconto extra!");
		
		
	}

	@Override
	public void aprova(Orcamento orcamento) {

		throw new RuntimeException("Or�amentos reprovados n�o podem ser aprovados!");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos j� est� reprovado!");
		
	}

	@Override
	public void finalizado(Orcamento orcamento) {

		orcamento.estadoAtual = new Finalizado();
	}

	
	
	
}
