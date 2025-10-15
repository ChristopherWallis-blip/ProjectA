package animals.ant;
import animals.Animal;
import animals.behaviours.*;

public class BulletAnt extends Ant {

	public BulletAnt() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Bullet Ant marching...";
            } 
        });
        
        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Bullet Ants are omnivores...eating seeds and road kill";
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
