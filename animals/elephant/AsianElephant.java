package animals.elephant;
import animals.Animal;
import animals.behaviours.*;

public class AsianElephant extends Elephant {

    public AsianElephant() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Asian Elephant lumbering around...";
            }
        });

        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Asain Elephants are herbivores...\nEating fruits, leaves, and grasses";
            }
        });

        setSoundBehavior(new SoundBehavior() {
            @Override
            public String makeSound() {
                return "Trumpet!";
            }
        });
    }
}
