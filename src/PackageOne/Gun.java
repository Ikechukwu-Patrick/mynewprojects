package PackageOne;

public class Gun {
    private int bulletSize;
    private boolean isCorck;
    private String name;

    public Gun(String name, boolean isCorck, int bulletSize) {
        this.isCorck = false;
        this.name = name;
        this.bulletSize = bulletSize;



    }

    public int getBulletSize() {

        return bulletSize;
    }

    public void loadBullet(int bullet) {
        if (bullet >= 0 && bullet < 12) {
            this.bulletSize = bullet;
        }
    }
    public int loadBullet() {
        if (bulletSize >= 0 && bulletSize <= 12) {
            this.bulletSize = bulletSize + 1;

        }
        return bulletSize;
    }

    public boolean corkGun() {
        return isCorck = true;
    }

    public void unCorkGun() {
        this.isCorck=false;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    }

