package animals.lion;
import java.util.Random;
import animals.Animal;
import animals.behaviours.*;

public class CongoLion extends Lion {

    public CongoLion() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Congo Lion padding around...";
            }
        });

        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {

                Random r = new Random();
                if (r.nextInt() % 4 == 0) {
                    return "Congo Lions are carnivores...\nEating gazelle";
                } else {
					return "Congo Lions are carnivores...\nEating wildebeest";
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
