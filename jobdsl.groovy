pipelineJob('DSL-Pipeline-HappyTrip') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/jha-raghav/HappyTrip.git')
            }
          scriptPath('Code/Jenkins.txt')
        }
    }
}
