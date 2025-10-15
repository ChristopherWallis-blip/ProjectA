package animals.elephant;
import animals.Animal;
import animals.behaviours.*;

public class AfricanElephant extends Elephant {

    public AfricanElephant() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "African Elephant lumbering around...";
            }
        });

        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "African Elephants are herbivores...\nEating fruits, leaves, and grasses";
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
