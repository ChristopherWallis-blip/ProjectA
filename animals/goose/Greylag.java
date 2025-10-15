package animals.goose;
import java.util.Random;
import animals.Animal;
import animals.behaviours.*;

public class Greylag extends Goose {

    public Greylag() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {

                Random r = new Random();
                if (r.nextInt() % 2 == 0) {
                  return "Greylag Goose swimming...";
                } else {
					return "Greylag Goose waddling...";
				}
            }
        });

        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Greylag Geese are primarily herbivores...\nEating grasses and seeds";
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
