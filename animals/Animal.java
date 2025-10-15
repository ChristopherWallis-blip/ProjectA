package animals;
import animals.behaviours.*;
/**
 * Abstract Animal class, defines shared fields and methods for all animals
 */
public abstract class Animal {
    private MovementBehavior movementBehavior;
    private SoundBehavior soundBehavior;
    private DietBehavior dietBehavior;

    public void setMovementBehavior(MovementBehavior movementBehavior) {
        this.movementBehavior = movementBehavior;}

    public void setSoundBehavior(SoundBehavior soundBehavior) {
        this.soundBehavior = soundBehavior;}

    public void setDietBehavior(DietBehavior dietBehavior) {
        this.dietBehavior = dietBehavior;}

    public String performMove() {
        return this.movementBehavior.move();}

    public String performSound() {
        return this.soundBehavior.makeSound();}

    public String performEat() {
        return this.dietBehavior.eat();}
 }
