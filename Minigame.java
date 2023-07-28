import greenfoot.*;

public class Minigame extends World
{
    private Jugador jugador;
    private int contadorElementos =0;
    private GreenfootSound musiquitaFondo;
     
    public Minigame()
    {    
        super(600, 400, 1);
        jugador = new Jugador();
        
        addObject(jugador, getWidth()/2, getHeight()/2);
        mostrarContadorElementos();
        musiquitaFondo = new GreenfootSound("Nyancat.wav");
        GreenfootImage fondo = getBackground();
        fondo.scale(600, 400);
        showText("¡Press ENTER to START!", 300, 300);
    }
    public void started ()
    {
        musiquitaFondo.playLoop();
    }
    public void ended()
    {
        musiquitaFondo.stop();
    }
    public void act()
    {
        if (Greenfoot.getRandomNumber(100) < 2) {
            addObject(new Obstaculo(), getWidth(), Greenfoot.getRandomNumber(getHeight()));
        }
        
        if (Greenfoot.getRandomNumber(100) < 1) {
            addObject(new Pizza(), getWidth(), Greenfoot.getRandomNumber(getHeight()));
        }
        
        if (Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld(new Minigame());
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
