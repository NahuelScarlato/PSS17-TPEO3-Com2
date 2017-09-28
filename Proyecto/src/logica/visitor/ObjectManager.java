package logica.visitor;

import objeto.atravesable.*;
import objeto.noAtravesable.objetoConVida.personaje.*;
import logica.*;

public class ObjectManager {
	//metodos
	public void visit(Aliado a){
		boolean ataque=false;
		Tile actual = a.getTile().getLeft();
		for(int i=0; i<a.getAlcance() && !ataque; i++){
			if(actual.getComponente()!=null){
				ataque=actual.getComponente().serAtacado(a);;
			}
			actual=actual.getLeft();
		}
		if(!ataque)
			a.aumentarReloj();
	}
	
	public void visit(Enemigo e){
		boolean encontre=false;
		Tile actual=e.getTile();
		if (actual.getColumna()==11){
			encontre=true;
		}
		int restantes = 12 - (actual.getColumna()+e.getAlcance());
		for(int i=0; restantes > 0 && i<e.getAlcance() && !encontre; i++){
			actual=actual.getRight();
			if(actual.getComponente()!=null){
				encontre=true;
				actual.getComponente().serAtacado(e);
			}
		}
		if(!encontre){
			e.avanzar();
		}
	}
	public void visit(Agua a){
		if(a.getTile().getComponente()!=null)
			a.getTile().getComponente().serModificado(a);
		if(a.getTile().getColumna()!=11 && a.getTile().getRight().getComponente()!=null)
			a.getTile().getRight().getComponente().serNormalizado(a);
	}
}
