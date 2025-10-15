package animals.pig;
import animals.Animal;
import animals.behaviours.*;

public class Gilt extends Pig {

    public Gilt() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Gilt Pigs wandering...";
            }
        });

        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Gilt Pigs are omnivores...\nEating roots and insects";
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
