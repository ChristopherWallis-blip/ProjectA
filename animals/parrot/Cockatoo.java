package animals.parrot;
import animals.Animal;
import animals.behaviours.*;

public class Cockatoo extends Parrot {

    public Cockatoo() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Cockatoo Parrot flying...";
            }
        });

        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Cockatoo Parrots are omnivores...\nEating fruits, seeds, and insects";
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
