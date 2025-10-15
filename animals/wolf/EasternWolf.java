package animals.wolf;
import animals.Animal;
import animals.behaviours.*;

public class EasternWolf extends Wolf {

    public EasternWolf() {

        setMovementBehavior(new MovementBehavior() {
            
			@Override
            public String move() {
                return "Eastern Wolves wandering around...";
            }
        });

        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Eastern Wolves are carnivores...\nEating rabbits";
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
