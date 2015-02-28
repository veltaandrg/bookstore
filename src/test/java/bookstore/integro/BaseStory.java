package bookstore.integro;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;

public class BaseStory extends JUnitStory {
    
    @Override
    public Configuration configuration() {
        StoryReporterBuilder reporter = new StoryReporterBuilder();
        reporter = reporter.withDefaultFormats().withFormats(Format.CONSOLE, Format.TXT);
        Configuration config = new MostUsefulConfiguration();
        config = config.useStoryLoader(new LoadFromClasspath(this.getClass()));
        config = config.useStoryReporterBuilder(reporter);
        return config;
    }
    
}
