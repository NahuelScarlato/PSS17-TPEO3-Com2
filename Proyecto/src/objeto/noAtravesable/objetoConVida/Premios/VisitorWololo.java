package objeto.noAtravesable.objetoConVida.Premios;

import logica.Tile;
import objeto.noAtravesable.objetoConVida.personaje.*;

public class VisitorWololo {
	public void visit(Goblin g, Tile t){
		g.restarVida(1000);
		Espadachin e = new Espadachin(t);
		t.agregarAliado(e);
	}
	public void visit(Grunt g, Tile t){
		g.restarVida(1000);
		EnanoCampeon ec = new EnanoCampeon(t);
		t.agregarAliado(ec);
	}
	public void visit(Brujo b, Tile t){
		b.restarVida(1000);
		Mago m = new Mago(t);
		t.agregarAliado(m);
	}
	public void visit(JefeOrco jo, Tile t){
		jo.restarVida(1000);
		Paladin p = new Paladin(t, t.getRight());
		t.agregarAliado(p);
	}
	public void visit(OrcoConBallesta ocb, Tile t){
		ocb.restarVida(1000);
		Arquero a = new Arquero(t);
		t.agregarAliado(a);
	}
}
