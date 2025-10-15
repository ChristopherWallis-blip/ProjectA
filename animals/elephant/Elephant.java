package animals.elephant;
import animals.Animal;
import animals.behaviours.*;

public class Elephant extends Animal {

    public Elephant() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Elephant lumbering around...";
            }
        });

        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Elephants are herbivores...\nEating fruits, leaves, and grasses";
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

