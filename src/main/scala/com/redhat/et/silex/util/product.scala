/*
 * product.scala
 * author:  RJ Nowling <rnowling@redhat.com>
 *
 * Copyright (c) 2016 Red Hat, Inc.
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

package io.radanalytics.silex.utils

object crossProduct {
  /**
   * Compute the cross product of two iteratables.
   */
  def apply[A, B](sa: TraversableOnce[A], sb: TraversableOnce[B]): Iterator[(A, B)] =
    for(
      a <- sa.toIterator;
      b <- sb.toIterator
    ) yield (a, b)
}
