package entities;

public class PessoaJuridica extends Pessoa {
	private int numFunc;

	public PessoaJuridica() {

	}

	public PessoaJuridica(String nome, Double rendaAnual, int numFunc) {
		super(nome, rendaAnual);
		this.numFunc = numFunc;
	}

	public int getNumFunc() {
		return numFunc;
	}

	public void setNumFunc(int numFunc) {
		this.numFunc = numFunc;
	}

	@Override
	public double calculaImpostos() {
		// TODO Auto-generated method stub
		double imp = 0;
		if (numFunc > 10) {
			imp = super.getRendaAnual() * 14 / 100;
		} else {
			imp = super.getRendaAnual() * 16 / 100;

		}
		return imp;

	}

}
