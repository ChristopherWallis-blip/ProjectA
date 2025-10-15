package animals.goose;
import java.util.Random;
import animals.Animal;
import animals.behaviours.*;

public class Brent extends Goose {

    public Brent() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {

                Random r = new Random();
                if (r.nextInt() % 2 == 0) {
                  return "Brent Goose swimming...";
                } else {
					return "Brent Goose waddling...";
				}
            }
        });

        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Brent Geese are primarily herbivores...\nEating grasses and seeds";
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
