public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();

        Enemy boss = new Enemy();

        boss.damage = 50;
        boss.health = 500;
        boss.armor = 100;
        boss.hasMagicImmunity = true;
        boss.name = "Roshan";
        boss.enemyDialogue();

        Enemy skeleton = new Enemy();

        skeleton.damage = 5;
        skeleton.health = 10;
        skeleton.armor = 5;
        skeleton.hasMagicImmunity = false;
        skeleton.name = "Common Skeleton Warrior";
        skeleton.enemyDialogue();

        Enemy dragon = new Enemy();

        dragon.damage = 40;
        dragon.health = 400;
        dragon.armor = 75;
        dragon.hasMagicImmunity = false;
        dragon.name = "Ancient Wyvern";
        dragon.enemyDialogue();

        Gear Helmet = new Gear();

        Helmet.Name = "Ulo ni yoshi";
        Helmet.Type = "Helmet";
        Helmet.Rarity = "Rare";
        Helmet.Weight = 4.7f;
        Helmet.Description = "Yoshi's current Helmet";
        Helmet.geardesc();
        Helmet.showgear();

        Gear BodyA = new Gear();

        BodyA.Name = "Basta katawan to";
        BodyA.Type = "Body Armor";
        BodyA.Rarity = "Epic";
        BodyA.Weight = 7.7f;
        BodyA.Description = "Yoshi's current Body Armor";
        BodyA.geardesc();
        BodyA.showgear();

        Gear Boots = new Gear();

        Boots.Name = "Yeezy's";
        Boots.Type = "Boots";
        Boots.Rarity = "Common";
        Boots.Weight = 3.0f;
        Boots.Description = "Yoshi's current Boots";
        Boots.geardesc();
        Boots.showgear();

        Weapon Gun = new Weapon();

        Gun.Name = "Pistol Pete";
        Gun.Type = "Range weapon";
        Gun.Rarity = "Common";
        Gun.Weight = 2.0f;
        Gun.Description = "Yoshi's Gun(Pistol Pete)";
        Gun.Damage ="-10HP per bullet";
        Gun.weapondesc();
        Gun.showweapondesc();
    }
}
