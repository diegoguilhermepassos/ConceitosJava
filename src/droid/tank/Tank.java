package droid.tank;

public class Tank {
	int x;
	int y;
	
	int ultimoX; 
	int ultimoY;
	
	int passo = 1;

	public Tank(int pX, int pY) {
		setX(pX);
		setY(pY);
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getPosition() {
		String texto = "X = " + x + ", Y = " + y;
		return texto;
	}

	public void subir() {
		y = y + passo;
	}

	public void esquerda() {
		x = x - passo;
	}

	public void direita() {
		x = x + passo;
	}

	public void descer() {
		y = y - passo;
	}
	
	public void atualizarPosicoes() {
		ultimoX = x;
		ultimoY = y;
	}
	
	public void voltarPosicoes() {
		x = ultimoX;
		y = ultimoY;
	}
	
	public Posicao simulateDireita() {
		Posicao p = new Posicao();
		p.x = x + passo;
		p.y = y;
		return p;
	}
	
	public Posicao simulateEsquerda() {
		Posicao p = new Posicao();
		p.x = x - passo;
		p.y = y;
		return p;
	}
	public Posicao simulateSubir() {
		Posicao p = new Posicao();
		p.y = y + passo;
		p.x = x;
		return p;
	}
	public Posicao simulateDescer() {
		Posicao p = new Posicao();
		p.y = y - passo;
		p.x = x;
		return p;
	}
}
