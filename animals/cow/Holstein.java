package animals.cow;
import animals.Animal;
import animals.behaviours.*;

public class Holstein extends Cow {

    public Holstein() {

        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Holstein Cow walking...";
            } 
        });
        
        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Holstein Cows are herbivores...eating grass";
         }
        });

        setSoundBehavior(new SoundBehavior() {
            @Override
            public String makeSound() {
              return "MOOO!";
            }
        });
    }
}
