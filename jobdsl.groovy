pipelineJob('DSL-Pipeline-HappyTrip') {
    definition {
        cpsScm {
            scm { 
      git('https://github.com/jenkinsci/job-dsl-plugin.git','master','GitHub-Credential')
    }
          scriptPath('Code/Jenkins.txt')
        }
    }
}
