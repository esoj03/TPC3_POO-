package foxrabbitsv1;

import javax.xml.stream.Location;
import java.lang.reflect.Field;
import java.util.List;

public class Hunter extends Animal
{
    private Field field;

    private Location location;

    public Hunter(Field field, Location newLocation)
    {
        this.field = field;
        setLocation(newLocation);
    }

    public <Actor> void act(List<Actor> newHunters){

    }

    private Location findTarget()
    {

        return null;
    }

    public Location getLocation()
    {
        return location;
    }


    public void setLocation(Location newLocation)
    {
    }

    public void getField()
    {
        return ;
    }
}