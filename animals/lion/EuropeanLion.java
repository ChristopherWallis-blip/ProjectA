package animals.lion;
import java.util.Random;
import animals.Animal;
import animals.behaviours.*;

public class EuropeanLion extends Lion {

    public EuropeanLion() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "European Lion padding around...";
            }
        });

        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {

                Random r = new Random();
                if (r.nextInt() % 4 == 0) {
                    return "European Lions are carnivores...\nEating gazelle";
                } else {
					return "European Lions are carnivores...\nEating wildebeest";
				}
			}
        });

        setSoundBehavior(new SoundBehavior() {

            @Override
            public String makeSound() {
                return "ROAR";
            }
        });
    }
}
