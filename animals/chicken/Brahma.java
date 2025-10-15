package animals.chicken;
import animals.Animal;
import animals.behaviours.*;

public class Brahma extends Chicken {

    public Brahma() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Brahma Chicken crossing the road...";
            } 
        });
        
        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Brahma Chickens are omnivores...eating seeds and worms";
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
