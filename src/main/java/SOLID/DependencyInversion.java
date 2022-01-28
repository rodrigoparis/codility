package SOLID;

class DependencyInversion {
    static class Warrior {
        private Weapon weapon;

        public Warrior(Weapon weapon) {
            this.weapon = weapon;
        }

        public void attack() {
            weapon.attack();
        }

        public void setWeapon(Weapon weapon) {
            this.weapon = weapon;
        }
    }

    interface Weapon {
        public void attack();
    }

    static class Axe implements Weapon {

        @Override
        public void attack() {
            System.out.println("Smahing enemies with my Axe");
        }
    }

    static class Sword implements Weapon {

        @Override
        public void attack() {
            System.out.println("Cutting enemies with my Sword");
        }
    }

    static class Client {
        public static void main(String[] args) {
            Warrior warrior = new Warrior(new Axe());
            warrior.attack();
            warrior.setWeapon(new Sword());
            warrior.attack();
        }
    }
}
