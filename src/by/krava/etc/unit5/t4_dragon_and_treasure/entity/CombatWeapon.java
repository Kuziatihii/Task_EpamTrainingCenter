package by.krava.etc.unit5.t4_dragon_and_treasure.entity;

public class CombatWeapon extends Treasure {
    private String name;
    private int value;
    private String descriptionOfTreasure;

    public CombatWeapon(String name, int value, String descriptionOfTreasure) {
        this.name = name;
        this.value = value;
        this.descriptionOfTreasure = descriptionOfTreasure;
    }

    @Override
    public String getDescriptionOfTreasure() {
        return descriptionOfTreasure;
    }

    @Override
    public void setDescriptionOfTreasure(String descriptionOfTreasure) {
        this.descriptionOfTreasure = descriptionOfTreasure;
    }

    @Override
    public String toString() {
        return String.format("%-18s %-40s value: %-5d description: %-40s", "Combat Weapon:", name, value,descriptionOfTreasure);
    }
}
