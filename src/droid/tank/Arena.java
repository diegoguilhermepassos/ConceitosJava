package droid.tank;

public class Arena {
	
	int linhas;
	int colunas;
	
	public Arena(int linhas, int colunas) {
		this.colunas = colunas;
		this.linhas = linhas;
	}
	
	public String arenaToString(Tank tank) {
		String str = "";
		
		for (int y = 0; y < linhas; y++) {
			for (int x = 0; x < colunas; x++) {
				if(tank.x == x && tank.y == y) {
					str = str + " T ";
				}else {
					str = str + " . ";	
				}
			}
			str = str + "\n";
		}
		
		return str;
	}

	public boolean isDentro(Tank tank) {
		if (tank.x < colunas && tank.y < linhas && tank.y >= 0 && tank.x >= 0) {
			return true;
		}else {
			return false;	
		}
	}
	
	public boolean isDentro(Posicao posicao) {
		if (posicao.x < colunas && posicao.y < linhas && posicao.y >= 0 && posicao.x >= 0) {
			return true;
		}else {
			return false;	
		}
	}



}
