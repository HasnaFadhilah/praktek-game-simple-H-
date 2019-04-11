import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kangguru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kangguru extends Actor
{
    /**
     * Act - do whatever the kangguru wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       if(Greenfoot.isKeyDown("left")){
            move(-3);
    }    
    if(Greenfoot.isKeyDown("right")){
        move(3);
}
if(Greenfoot.isKeyDown("up")){
    turn(-3);
}
if(Greenfoot.isKeyDown("down")){
    turn(3);
}
Actor roti = getOneObjectAtOffset(0,0, roti.class);
if(roti != null) {
getWorld().removeObject(roti);
score.roti++;
}
if (score.roti == 5){
    getWorld().addObject(new kalah(),300,200);
    Greenfoot.stop();
}
}
}
