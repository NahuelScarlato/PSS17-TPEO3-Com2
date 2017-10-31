package objeto.noAtravesable.objetoConVida.Premios;

import game.display.PremioManager;
import game.gfx.ImageLoader;
import logica.Logica;
import logica.visitor.VisitorEscudo;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class Escudo extends Premio{
	protected VisitorEscudo visitor;

	public Escudo(){
		super();
		visitor = new VisitorEscudo();
		image = ImageLoader.pEscudo;
	}
	@Override
	public ObjetoNoAtravesable clone() {
		return new Escudo();
	}
	@Override
	public void efecto(int x, int y, Logica l) {
		l.getTile(x, y).getComponente().accept(visitor);
		if (x != 0 && y != 0)
			l.getTile(x-1, y-1).getComponente().accept(visitor);
		if (x != 0)
			l.getTile(x-1, y).getComponente().accept(visitor);
		if (x != 0 && y != l.getFilas()-1)
			l.getTile(x-1, y+1).getComponente().accept(visitor);
		if (y != 0)
			l.getTile(x, y-1).getComponente().accept(visitor);
		if (x != l.getColumnas()-1 && y != 0)
			l.getTile(x+1, y-1).getComponente().accept(visitor);
		if (x != l.getColumnas()-1)
			l.getTile(x+1, y).getComponente().accept(visitor);
		if (x != l.getColumnas()-1 && y != l.getFilas()-1)
			l.getTile(x+1, y+1).getComponente().accept(visitor);
		if (y != l.getFilas()-1)
			l.getTile(x, y+1).getComponente().accept(visitor);
	}
	public void accept(PremioManager pm) {
		pm.visit(this);
	}

}
