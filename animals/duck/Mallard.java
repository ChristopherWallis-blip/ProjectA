package animals.duck;
import animals.Animal;
import animals.behaviours.*;

public class Mallard extends Duck {

    public Mallard() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Mallard Duck swimming...";
            }  
        });
        
        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Mallard Ducks are omnivores...eating bread and insects";
			}
        });

        setSoundBehavior(new SoundBehavior() {
            @Override
            public String makeSound() {
              return "QUACK!";
            }
        });
    }
}
