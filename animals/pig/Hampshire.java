package animals.pig;
import animals.Animal;
import animals.behaviours.*;

public class Hampshire extends Pig {

    public Hampshire() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Hampshire Pigs wandering...";
            }
        });

        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Hampshire Pigs are omnivores...\nEating roots and insects";
            }
        });

        setSoundBehavior(new SoundBehavior() {

            @Override
            public String makeSound() {
                return "OINK";
            }
        });
    }
}
