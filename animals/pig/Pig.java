package animals.pig;
import animals.Animal;
import animals.behaviours.*;

public class Pig extends Animal {

    public Pig() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Pigs wandering...";
            }
        });

        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Pigs are omnivores...\nEating roots and insects";
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

