package animals.bear;
import animals.Animal;
import animals.behaviours.*;

public class Panda extends Bear {

	public Panda() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Bear running...";
            } 
        });

        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Bears are omnivores...\nEating salmon and berrys";
         }
        });

        setSoundBehavior(new SoundBehavior() {
            @Override
            public String makeSound() {
              return "ROAR!";
            }
        });
    }
}
