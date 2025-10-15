public class Parrot extends Animal
{
    public Parrot()
    {
        setMovementBehavior(new MovementBehavior() 
        {
            @Override
            public String move()
            {
                return "Parrot flying...";
            }
        });

        setDietBehavior(new DietBehavior()
        {
            @Override
            public String eat()
            {
                return "Parrots are omnivores...\nEating fruits, seeds, and insects";
            }
        });

        setSoundBehavior(new SoundBehavior()
        {
            @Override
            public String makeSound()
            {
                return "SQUAWK";
            }
        });
    }
}    
