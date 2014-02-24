/*
 * Copyright (C) 2011-2014 Chris Vest (mr.chrisvest@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package stormpot.bpool;

import stormpot.Config;
import stormpot.Poolable;

/**
 * @deprecated This class has been moved to the <code>stormpot</code> package.
 * @see stormpot.BlazePool
 */
@Deprecated
public class BlazePool<T extends Poolable> extends stormpot.BlazePool<T> {
  /**
   * Construct a new BlazePool instance based on the given {@link stormpot.Config}.
   *
   * @param config The pool configuration to use.
   */
  public BlazePool(Config<T> config) {
    super(config);
  }
}
