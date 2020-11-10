package entities;

public class PessoaFisica extends Pessoa {

	private Double gastosSaude;

	public PessoaFisica() {

	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double calculaImpostos() {
		// TODO Auto-generated method stub
		double imp = 0;
		if (super.getRendaAnual() < 20000) {
			imp = super.getRendaAnual() * 15 / 100;
			if (gastosSaude > 0) {
				imp = imp - (gastosSaude / 2);
			}
		} else {
			imp = super.getRendaAnual() * 25 / 100;
			if (gastosSaude > 0) {
				imp = imp - (gastosSaude / 2);
			}
		}
		return imp;
	}
}
