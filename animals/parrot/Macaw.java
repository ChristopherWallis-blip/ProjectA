package animals.parrot;
import animals.Animal;
import animals.behaviours.*;

public class Macaw extends Parrot {

    public Macaw() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Macaw Parrot flying...";
            }
        });

        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Macaw Parrots are omnivores...\nEating fruits, seeds, and insects";
            }
        });

        setSoundBehavior(new SoundBehavior() {

            @Override
            public String makeSound() {
                return "SQUAWK";
            }
        });
    }
}
