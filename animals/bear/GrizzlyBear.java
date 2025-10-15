package animals.bear;
import animals.Animal;
import animals.behaviours.*;

public class GrizzlyBear extends Bear {

    public GrizzlyBear() {

		setMovementBehavior(new MovementBehavior() {

			@Override
			public String move() {
				return "Grizzly Bear running...";
			}		
		});

		setDietBehavior(new DietBehavior() {

			@Override
			public String eat() {
				return "Grizzly Bears are omnivores...\nEating salmon and berrys";
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
