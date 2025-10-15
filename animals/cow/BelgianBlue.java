package animals.cow;
import animals.Animal;
import animals.behaviours.*;

public class BelgianBlue extends Cow {

    public BelgianBlue() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Belgian Blue Cow walking...";
            } 
        });
        
        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Belgian Blue Cows are herbivores...eating grass";
			}
        });

        setSoundBehavior(new SoundBehavior() {
            @Override
            public String makeSound() {
              return "MOOO!";
            }
        });
    }
}
