import greenfoot.*;

/**
 * Write a description of class Minigame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Minigame extends World
{
    private Jugador jugador;
    private int contadorElementos =0;
    private GreenfootSound musiquitaFondo;
     
    public Minigame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        jugador = new Jugador();
        
        addObject(jugador, getWidth()/2, getHeight()/2);
        mostrarContadorElementos();
        musiquitaFondo = new GreenfootSound("Nyancat.wav");
        GreenfootImage fondo = getBackground();
        fondo.scale(600, 400);
        
    }
    public void started ()
    {
        musiquitaFondo.playLoop();
    }
    public void act()
    {
        if (Greenfoot.getRandomNumber(100) < 2) {
            addObject(new Obstaculo(), getWidth(), Greenfoot.getRandomNumber(getHeight()));
        }
        
        if (Greenfoot.getRandomNumber(100) < 1) {
            addObject(new Pizza(), getWidth(), Greenfoot.getRandomNumber(getHeight()));
        }
        
    }
    public void incrementarContadorElementos()
    {
        contadorElementos++;
        mostrarContadorElementos();
    }
    private void mostrarContadorElementos()
    {
        showText("Pizzitas: " + contadorElementos, 80, 20);
    }
}