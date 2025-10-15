package animals.chicken;
import animals.Animal;
import animals.behaviours.*;

public class Leghorn extends Chicken {

    public Leghorn() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Leghorn Chicken crossing the road...";
            } 
        });
        
        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Leghorn Chickens are omnivores...eating seeds and worms";
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
