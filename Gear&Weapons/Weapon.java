public class Weapon {
    String Name;
    String Type;
    String Rarity;
    float Weight;
    String Description;
    String Damage;

    public void weapondesc() {
        System.out.println(Description);
    }
    public void showweapondesc() {
        System.out.println("Name: " + Name);
        System.out.println("Type: " + Type);
        System.out.println("Rarity: " + Rarity);
        System.out.println("Weight: " + Weight);
        System.out.println("Damage: " + Damage);
    }
}
