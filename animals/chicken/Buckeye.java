package animals.chicken;
import animals.Animal;
import animals.behaviours.*;

public class Buckeye extends Chicken {

    public Buckeye() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Buckeye Chicken crossing the road...";
            }    
        });
        
        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Buckeye Chickens are omnivores...eating seeds and worms";
			}
        });

        setSoundBehavior(new SoundBehavior() {
            @Override
            public String makeSound() {
              return "BAKAAA!";
            }
        });
    }
}
