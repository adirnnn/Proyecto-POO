import greenfoot.*;

public class Obstaculo extends Actor
{
    public Obstaculo()
    {
        GreenfootImage sprite = getImage();
        sprite.scale(60, 60); 
        setImage(sprite);
    }
    public void act()
    {
        move(-3);
        if (getX() == 0) {
            getWorld().removeObject(this);
        }
    }
}
