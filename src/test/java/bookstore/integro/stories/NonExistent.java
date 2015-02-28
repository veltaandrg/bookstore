package bookstore.integro.stories;

import bookstore.integro.BaseStory;
import bookstore.integro.steps.NonExistentSteps;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

public class NonExistent extends BaseStory {
    
    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(
                configuration(), new NonExistentSteps());
    }
    
}
