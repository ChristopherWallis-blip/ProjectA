public class Cow extends Animal
{
    public Cow()
    {
        setMovementBehavior(new MovementBehavior() {

            @Override
            public String move() {
                return "Cow walking...";
            }
            
        });
        
        setDietBehavior(new DietBehavior() {

            @Override
            public String eat() {
                return "Cows are herbivores...eating grass";
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