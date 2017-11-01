package objeto.noAtravesable.objetoConVida.Premios;

import logica.Tile;
import objeto.noAtravesable.objetoConVida.personaje.*;

public class VisitorWololo {
	public void visit(Goblin g, Tile t){
		g.restarVida(1000);
		new Espadachin(t);
	}
	public void visit(Grunt g, Tile t){
		g.restarVida(1000);
		new EnanoCampeon(t);
	}
	public void visit(Brujo b, Tile t){
		b.restarVida(1000);
		new Mago(t);
	}
	public void visit(JefeOrco jo, Tile t){
		jo.restarVida(1000);
		new Paladin(t, t.getRight());
	}
	public void visit(OrcoConBallesta ocb, Tile t){
		ocb.restarVida(1000);
		new Arquero(t);
	}
}
