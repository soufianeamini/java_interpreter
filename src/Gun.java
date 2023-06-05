public class Gun {
    int ammo;
    public Gun(int ammo) {
        this.ammo = ammo;
    }
    public void shoot() {
        if (ammo > 0) {
            System.out.println("BANG!");
            ammo--;
        } else
            System.out.println("The gun has no more ammo.");
    }
}
