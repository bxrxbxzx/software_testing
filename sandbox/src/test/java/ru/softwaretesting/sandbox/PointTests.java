package ru.softwaretesting.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.softwaretesting.sandbox.MyFirstProgram.distance;

@Test
public class PointTests {

    public void testDistance(){
        Point p1 = new Point(5, 15);
        Point p2 = new Point(7, 22);
        assert p1.distance(p2) == 7.280109889280518;
        Assert.assertEquals(p2.x - p1.x,2.0);
        Assert.assertEquals(p2.y - p1.y,7.0);

    }
}
