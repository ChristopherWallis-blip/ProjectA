package animals.pig;
import animals.Animal;
import animals.behaviours.*;

public class KuneKune extends Pig {

    public KuneKune() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "KuneKune Pigs wandering...";
            }
        });

        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "KuneKune Pigs are omnivores...\nEating roots and insects";
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
