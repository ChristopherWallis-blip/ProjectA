package animals.bear;
import animals.Animal;
import animals.behaviours.*;

public class BlackBear extends Bear {

    public BlackBear() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Black Bear running...";
            } 
        });

        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Black Bears are omnivores...\nEating salmon and berrys";
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
