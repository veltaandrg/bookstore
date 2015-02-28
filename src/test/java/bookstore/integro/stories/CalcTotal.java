package bookstore.integro.stories;

import bookstore.integro.BaseStory;
import bookstore.integro.steps.TotalCalcSteps;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

public class CalcTotal extends BaseStory {
    
    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(
                configuration(), new TotalCalcSteps());
    }
    
}
