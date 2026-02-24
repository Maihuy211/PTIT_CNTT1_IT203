package miniproject;

public class Mage extends GameCharacter implements ISkill {
    private int mana;
    public Mage(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = mana;
    }
    public int getMana() {
        return mana;
    }
    @Override
    public void attack(GameCharacter target) {
        int damage;
        if (mana >= 5) {
            damage = attackPower;
            mana -= 5;
            System.out.println(name + " dùng phép thường gây " + damage + " sát thương! (-5 mana)");
        } else {
            damage = attackPower / 2;
            System.out.println(name + " không đủ mana! Đánh thường yếu gây " + damage + " sát thương.");
        }
        target.takeDamage(damage);
        System.out.println("Mana còn lại: " + mana);
    }
    @Override
    public void useUltimate(GameCharacter target) {
        if (mana >= 50) {
            int damage = attackPower * 3;
            mana -= 50;
            System.out.println(name + " sử dụng chiêu cuối: HỎA CẦU 🔥");
            System.out.println("Gây " + damage + " sát thương! (-50 mana)");
            target.takeDamage(damage);
            System.out.println("Mana còn lại: " + mana);
        } else {
            System.out.println(name + " không đủ mana để dùng Hỏa cầu!");
        }
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Mana: " + mana);
    }
}
