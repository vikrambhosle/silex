/*
 * This file is part of the "silex" library of helpers for Apache Spark.
 *
 * Copyright (c) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.redhat.et.silex.util

object logging {
  import org.apache.log4j.{Logger, ConsoleAppender, Level}

  private def consoleAppender =
    Logger.getRootLogger().getAppender("console").asInstanceOf[ConsoleAppender]

  def consoleLogLevel(lev: Level) { consoleAppender.setThreshold(lev) }
  def consoleLogInfo { consoleLogLevel(Level.INFO) }
  def consoleLogWarn { consoleLogLevel(Level.WARN) }
  def consoleLogError { consoleLogLevel(Level.ERROR) }
}

