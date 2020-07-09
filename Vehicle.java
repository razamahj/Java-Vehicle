
/**
 * This class is for your week 1 portfolio project.
 * You need to draw a picture of a vehicle and add methods to move
 * the vehicle right and left across the canvas.
 * Put your name into the template below:
 * 
 * @author (Junaid Mahmood) 
 * @version (28/09/2015)
 */
public class Vehicle
{
    private Rectangle chasis;
    private Rectangle split;
    private Rectangle windows;
    private Rectangle siren;
    private Rectangle exhaust;
    private Rectangle exhaust1;
    private Circle wheel;
    private Circle wheel1;
    
    
    

    /**
     * Constructor for objects of class Vehicle.
     */
    public Vehicle()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw your vehicle.
     */
    public void draw()
    {
        chasis = new Rectangle ();
        chasis.moveHorizontal (150);
        chasis.moveVertical (150);
        chasis.changeSize (400,100);
        chasis.makeVisible ();
        
        
        split = new Rectangle ();
        split.changeSize (150,100);
        split.moveHorizontal (350);
        split.moveVertical (150);
        split.changeSize (2,100);
        split.makeVisible ();
        split.changeColor ("blue");
       
        
        windows = new Rectangle ();
        windows.changeSize (200,50);
        windows.moveHorizontal (260);
        windows.moveVertical (100);
        windows.makeVisible ();
        windows.changeColor ("blue");
        windows.setOutline ();
        
        siren = new Rectangle ();
        siren.changeSize (40,40);
        siren.moveHorizontal (330);
        siren.moveVertical (60);
        siren.makeVisible ();
        siren.changeColor ("blue");
       
        exhaust = new Rectangle ();
        exhaust.changeSize (60,30);
        exhaust.moveHorizontal (550);
        exhaust.moveVertical (180);
        exhaust.makeVisible ();
        exhaust.changeColor ("black");
        
        wheel = new Circle ();
        wheel.changeSize(95);
        wheel.moveHorizontal (440);
        wheel.moveVertical ( 280);
        wheel.makeVisible ();
        wheel.changeColor ("black");
       
        wheel1 = new Circle ();
        wheel1.changeSize(95);
        wheel1.moveHorizontal (230);
        wheel1.moveVertical (280);
        wheel1.makeVisible ();
        wheel1.changeColor ("black");
     
    }

    /**
     * Move your vehicle a little to the right.
     */
    public void moveRight()
    
    {
        chasis.moveHorizontal(140);
        split.moveHorizontal(140);
        windows.moveHorizontal(140);
        siren.moveHorizontal(140);
        exhaust.moveHorizontal(140);
        wheel.moveHorizontal(140);
        wheel1.moveHorizontal(140);
        
        chasis.moveHorizontal(140);
        split.moveHorizontal(140);
        windows.moveHorizontal(140);
        siren.moveHorizontal(140);
        exhaust.moveHorizontal(140);
        wheel.moveHorizontal(140);
        wheel1.moveHorizontal(140);
        
        chasis.moveHorizontal(140);
        split.moveHorizontal(140);
        windows.moveHorizontal(140);
        siren.moveHorizontal(140);
        exhaust.moveHorizontal(140);
        wheel.moveHorizontal(140);
        wheel1.moveHorizontal(140);
        
        
    }

    /**
     * Move your vehicle a little to the left.
     */
    public void moveLeft()
    {
       chasis.moveHorizontal(-140);
       split.moveHorizontal(-140);
       windows.moveHorizontal(-140);
       siren.moveHorizontal(-140);
       exhaust.moveHorizontal(-140);
       wheel.moveHorizontal(-140);
       wheel1.moveHorizontal(-140); 
        
       chasis.moveHorizontal(-140);
       split.moveHorizontal(-140);
       windows.moveHorizontal(-140);
       siren.moveHorizontal(-140);
       exhaust.moveHorizontal(-140);
       wheel.moveHorizontal(-140);
       wheel1.moveHorizontal(-140); 
        
       chasis.moveHorizontal(-140);
       split.moveHorizontal(-140);
       windows.moveHorizontal(-140);
       siren.moveHorizontal(-140);
       exhaust.moveHorizontal(-140);
       wheel.moveHorizontal(-140);
       wheel1.moveHorizontal(-140); 
        
    }
}
