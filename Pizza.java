import greenfoot.*;

public class Pizza extends Actor
{
    public Pizza()
    {
        GreenfootImage sprite = getImage();
        sprite.scale(64, 64);
        setImage(sprite);
    }
    public void act()
    {
        move(-2);
        if (getX() == 0) {
            getWorld().removeObject(this);
        }
    }
}

