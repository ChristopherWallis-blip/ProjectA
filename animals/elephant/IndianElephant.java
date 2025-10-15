package animals.elephant;
import animals.Animal;
import animals.behaviours.*;

public class IndianElephant extends Elephant {

    public IndianElephant() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Indian Elephant lumbering around...";
            }
        });

        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "indian Elephants are herbivores...\nEating fruits, leaves, and grasses";
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
