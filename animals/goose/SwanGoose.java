package animals.goose;
import java.util.Random;
import animals.Animal;
import animals.behaviours.*;

public class SwanGoose extends Goose {

    public SwanGoose() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {

                Random r = new Random();
                if (r.nextInt() % 2 == 0) {
                  return "Swan Goose swimming...";
                } else {
					return "Swan Goose waddling...";
				}
            }
        });

        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Swan Geese are primarily herbivores...\nEating grasses and seeds";
            }
        });

        setSoundBehavior(new SoundBehavior() {

            @Override
            public String makeSound() {
                return "HONK";
            }
        });
    }
}
