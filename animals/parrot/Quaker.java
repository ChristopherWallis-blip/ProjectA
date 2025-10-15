package animals.parrot;
import animals.Animal;
import animals.behaviours.*;

public class Quaker extends Parrot {

    public Quaker() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Quaker Parrot flying...";
            }
        });

        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Quaker Parrots are omnivores...\nEating fruits, seeds, and insects";
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
