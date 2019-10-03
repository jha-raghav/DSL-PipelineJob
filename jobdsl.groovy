pipelineJob('DSL-Pipeline-HappyTrip') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/jha-raghav/HappyTrip.git','master','GitHub_Credential_raghav')
            }
          scriptPath('Code/Jenkins.txt')
        }
    }
}
