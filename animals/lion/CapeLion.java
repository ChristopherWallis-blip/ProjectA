package animals.lion;
import java.util.Random;
import animals.Animal;
import animals.behaviours.*;

public class CapeLion extends Lion {

    public CapeLion() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Cape Lion padding around...";
            }
        });

        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {

                Random r = new Random();
                if (r.nextInt() % 4 == 0) {
                    return "Cape Lions are carnivores...\nEating gazelle";
                } else {
					return "Cape Lions are carnivores...\nEating wildebeest";
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
