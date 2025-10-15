package animals.lion;
import java.util.Random;
import animals.Animal;
import animals.behaviours.*;

public class Lion extends Animal {

    public Lion() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Lion padding around...";
            }
        });

        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {

                Random r = new Random();
                if (r.nextInt() % 4 == 0) {
                    return "Lions are carnivores...\nEating gazelle";
                } else {
					return "Lions are carnivores...\nEating wildebeest";
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

