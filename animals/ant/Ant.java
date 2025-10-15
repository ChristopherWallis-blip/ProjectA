package animals.ant;
import animals.Animal;
import animals.behaviours.*;

public class Ant extends Animal {

    public Ant() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Ant marching...";
            }     
        });
        
        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Ants are omnivores...eating seeds and road kill";
			}
        });

        setSoundBehavior(new SoundBehavior() {
            @Override
            public String makeSound() {
              return "...";
            }
        });
    }
}
