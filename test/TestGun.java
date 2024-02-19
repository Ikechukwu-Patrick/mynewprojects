import PackageOne.Gun;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGun {
    @Test
    public void testThatGunCanShoot() {
        Gun mygun = new Gun("Double barrel", true,12);
        assertEquals("Double barrel", mygun.getName());


    }
    @Test
    public void testThatGunCanBeOn() {
        Gun myGun = new Gun("Double barrel",true,12);
        assertEquals(true, myGun.corkGun());

    }


    @Test
    public void testThatGunAddBullet(){
        Gun myGun = new Gun("Double barrel", true, 12);
        assertEquals(13, myGun.loadBullet());

    }
}


