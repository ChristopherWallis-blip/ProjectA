package animals.cow;
import animals.Animal;
import animals.behaviours.*;

public class Hereford extends Cow {

    public Hereford() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Hereford Cow walking...";
            } 
        });
        
        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Hereford Cows are herbivores...eating grass";
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
