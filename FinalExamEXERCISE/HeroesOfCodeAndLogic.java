import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numHeroes = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> heroHPMap = new LinkedHashMap<>();
        Map<String, Integer> heroMPMap = new LinkedHashMap<>();

        for (int i = 1; i <= numHeroes; i++) {
            String[] info = scanner.nextLine().split(" ");
            String hero = info[0];
            int hitPoints = Integer.parseInt(info[1]);
            int manaPoints = Integer.parseInt(info[2]);

            heroHPMap.putIfAbsent(hero, hitPoints);
            heroMPMap.putIfAbsent(hero, manaPoints);
        }

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String commandName = command.split(" - ")[0];
            String heroName = command.split(" - ")[1];

            if (commandName.equals("CastSpell")) {
                int mpNeeded = Integer.parseInt(command.split(" - ")[2]);
                String spellName = command.split(" - ")[3];
                int currentMP = heroMPMap.get(heroName);

                if (currentMP >= mpNeeded) {
                    currentMP = currentMP - mpNeeded;
                    heroMPMap.replace(heroName, currentMP);
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, currentMP);
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                }


            } else if (commandName.equals("TakeDamage")) {
                int damage = Integer.parseInt(command.split(" - ")[2]);
                String attacker = command.split(" - ")[3];
                int currentDamage = heroHPMap.get(heroName);
                heroHPMap.put(heroName, currentDamage - damage);

                if (currentDamage - damage > 0) {
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, currentDamage - damage);

                } else {
                    heroHPMap.remove(heroName);
                    heroMPMap.remove(heroName);
                    System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                }


            } else if (commandName.equals("Recharge")) {
                int amount1 = Integer.parseInt(command.split(" - ")[2]);
                int currentMP = heroMPMap.get(heroName);
                int savedMP = currentMP;
                currentMP = currentMP + amount1;

                if (currentMP > 200) {
                    currentMP = 200;
                    heroMPMap.put(heroName, 200);
                    System.out.printf("%s recharged for %d MP!%n", heroName, 200 - savedMP);
                } else {
                    heroMPMap.put(heroName,currentMP);
                    System.out.printf("%s recharged for %d MP!%n", heroName, amount1);
                }


            } else if (commandName.equals("Heal")) {
                int amount = Integer.parseInt(command.split(" - ")[2]);
                int currentHP = heroHPMap.get(heroName);
                int savedHP = currentHP;
                currentHP = currentHP + amount;

                if (currentHP > 100) {
                    currentHP = 100;
                    heroHPMap.put(heroName, 100);
                    System.out.printf("%s healed for %d HP!%n", heroName, 100 - savedHP);
                } else {
                    heroHPMap.put(heroName,currentHP);
                    System.out.printf("%s healed for %d HP!%n", heroName, amount);
                }

            }

            command = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : heroHPMap.entrySet()) {
            System.out.printf("%s%n", entry.getKey());
            System.out.printf("HP: %d%n", entry.getValue());
            System.out.printf("MP: %d%n", heroMPMap.get(entry.getKey()));
        }


    }
}
