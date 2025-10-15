package animals.ant;
import animals.Animal;
import animals.behaviours.*;

public class CarpenterAnt extends Ant {

    public CarpenterAnt() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Carpenter Ant marching...";
            } 
        });
        
        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Carpenter Ants are omnivores...eating seeds and road kill";
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
