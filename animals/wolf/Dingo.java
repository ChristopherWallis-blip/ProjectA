package animals.wolf;
import animals.Animal;
import animals.behaviours.*;

public class Dingo extends Wolf {

    public Dingo() {

        setMovementBehavior(new MovementBehavior() {
            
			@Override
            public String move() {
                return "Dingos wandering around...";
            }
        });

        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Dingos are carnivores...\nEating rabbits";
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
