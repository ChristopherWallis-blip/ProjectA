public class Chicken extends Animal
{
    public Chicken()
    {
        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Chicken crossing the road...";
            }
            
        });
        
        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Chickens are omnivores...eating seeds and worms";
         } 

        });

        setSoundBehavior(new SoundBehavior() {
            @Override
            public String makeSound() {
              return "BAKAAA!";
            }
        });

    
    }
}