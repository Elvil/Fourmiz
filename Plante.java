import java.awt.*;

class Plante implements Constantes
{

    private int x, y;
    private int taille;
    private static int taille_max = 30;
    private int temps_evo;
    private Placement pl = new Placement();
    private int type;
   
    public Plante(int x, int y, int taille)
    {
	this.x = x;
	this.y = y;
	this.taille = taille;
	type = (int) (Math.random() * 3);

	pl.obj = this;
	pl.new_x = x;
	pl.new_y = y;
	pl.live = true;
	temps_evo = 0;
    }

    public int getType()
    {
	return type;
    }

    public void placement() throws Placement
    {
	throw pl;
    }

    public void testLife() throws Placement
    {
	if(taille <= 0)
	    {
		pl.live = false;
		throw pl;
	    }
    }

    public void grandir()
    { 
	temps_evo ++;
	if(temps_evo == 20 && taille<taille_max)
	    {
		taille ++;		
		temps_evo = 0;
	    }
    }

    public void diminue()
    { 
	taille --;
    } 

    public int getX()
    {
	return x;
    }

    public int getY()
    {
	return y;
    }

    public int getTaille()
    {
	return taille;
    }

    public void setTaille(int t)
    {
	taille = t;
    }
}