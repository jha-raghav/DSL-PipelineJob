pipelineJob('DSL-Pipeline-HappyTrip') {
    definition {
        cpsScm {
            scm { 
       git {
            remote {
                url('https://github.com/jha-raghav/HappyTrip.git')
				credentials('GitHub-Credential')
            }
			branch('master')
			
    }
          scriptPath('Code/Jenkins.txt')
        }
    }
}
}
