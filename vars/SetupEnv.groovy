#!/usr/bin/env groovy

def call(script) {
  // Install awscli which is required by the other pipelines.
  script.sh """script.sh """echo 'Setting up environment...'
  """
}
