package animals.duck;
import animals.Animal;
import animals.behaviours.*;

public class Harlequin extends Duck {

    public Harlequin() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Harlequin Duck swimming...";
            } 
        });
        
        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Harlequin Ducks are omnivores...eating bread and insects";
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
