package animals.duck;
import animals.Animal;
import animals.behaviours.*;

public class Muscovy extends Duck {

    public Muscovy() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Muscovy Duck swimming...";
            } 
        });
        
        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Muscovy Ducks are omnivores...eating bread and insects";
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
