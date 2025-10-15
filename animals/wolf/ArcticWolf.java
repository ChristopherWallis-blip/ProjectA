package animals.wolf;
import animals.Animal;
import animals.behaviours.*;

public class ArcticWolf extends Wolf {

    public ArcticWolf() {

        setMovementBehavior(new MovementBehavior() {
            
			@Override
            public String move() {
                return "Arctic Wolves wandering around...";
            }
        });

        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Arctic Wolves are carnivores...\nEating rabbits";
            }
        });

        setSoundBehavior(new SoundBehavior() {

            @Override
            public String makeSound() {
                return "HOWL";
            }
        });
    }
}
