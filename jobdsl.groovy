pipelineJob('DSL-Pipeline-HappyTrip') {
    definition {
        cpsScm {
            scm { 
        git { 
            remote { 
                github('jha-raghav/HappyTrip', 'ssh') 
                credentials('GitHub-Credential') 
            } 
        } 
    }
          scriptPath('Code/Jenkins.txt')
        }
    }
}
