import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


class DnDCharacter {
    int strength, dexterity, constitution, intelligence, wisdom, charisma, hitpoints;

    public DnDCharacter() {
        this.strength     = ability(rollDice());
        this.dexterity    = ability(rollDice());
        this.constitution = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom       = ability(rollDice());
        this.charisma     = ability(rollDice());
        this.hitpoints    = 10 + modifier(constitution);
    }

    int ability(List<Integer> scores) {
        return scores.stream()
                     .sorted(Collections.reverseOrder())
                     .limit(3)
                     .mapToInt(Integer::intValue)
                     .sum();
    }

    List<Integer> rollDice() {
        //        ArrayList<Integer> L = new ArrayList<>();
        //        for (int i = 0; i < 4; i++) L.add(new Random().nextInt(5) + 1);
        //        return L;

        return new Random().ints(4, 1, 7)
                           .boxed()
                           .collect(Collectors.toList());
    }

    int modifier(int input) {
        return (int) Math.floor((double) (input - 10) / 2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return hitpoints;
    }
}
