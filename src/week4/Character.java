package week4;

public class Character {

    private WeaponBehaviour weapon;

    public void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehaviour w) {
        weapon = w;
    }
}
