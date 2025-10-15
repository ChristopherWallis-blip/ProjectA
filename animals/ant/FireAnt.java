package animals.ant;
import animals.Animal;
import animals.behaviours.*;

public class FireAnt extends Ant {

    public FireAnt() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Fire Ant marching...";
            } 
        });
        
        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Fire Ants are omnivores...eating seeds and road kill";
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
