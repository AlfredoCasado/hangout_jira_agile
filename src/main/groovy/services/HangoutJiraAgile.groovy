package services

import com.yammer.dropwizard.Service
import com.yammer.dropwizard.config.Bootstrap
import com.yammer.dropwizard.config.Environment
import com.yammer.dropwizard.config.Configuration
import com.yammer.dropwizard.assets.AssetsBundle

import resources.HelloWorld

class HangoutJiraAgile extends Service<Configuration> {
    
    public static void main(String[] args) {
        new HangoutJiraAgile().run(args)
    }

    def helloWorld = new HelloWorld()

    @Override
    public void initialize(Bootstrap<Configuration> bootstrap) {
        bootstrap.addBundle(new AssetsBundle("/widgets","/"));
    }

    @Override
    public void run(Configuration configuration, Environment environment) {
        environment.addResource helloWorld
    }
}
