package abstractFactory;

public interface GoalFactory {
    MealPlan createMealPlan();
    WorkoutPlan createWorkoutPlan();
}
