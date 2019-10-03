pipelineJob('DSL-Pipeline-HappyTrip') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/jha-raghav/HappyTrip.git','master')
            }
          scriptPath('Code/Jenkins.txt')
        }
    }
}
