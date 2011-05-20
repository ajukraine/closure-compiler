/*
 * Copyright 2011 The Closure Compiler Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.debugging.sourcemap;

/**
 * A class representing a partial source map.
 * @author johnlenz@google.com (John Lenz)
 */
public class SourceMapSection {

  /**
   * A url for a valid source map file that represents a section of a generate
   * source file such as when multiple files are concatenated together.
   */
  private final String sectionUrl;
  private final int line;
  private final int column;

  /**
   * @param sectionUrl The url for the partial sourcemap
   * @param line The number of lines into the file where the represented section
   *    starts.
   * @param column The number of characters into the line where the represented
   *    section starts.
   */
  public SourceMapSection(String sectionUrl, int line, int column) {
    this.sectionUrl = sectionUrl;
    this.line = line;
    this.column = column;
  }

  /**
   * @return the name of the map
   */
  public String getSectionUrl() {
    return sectionUrl;
  }

  /**
   * @return the starting line for this section
   */
  public int getLine() {
    return line;
  }

  /**
   * @return the column for this section
   */
  public int getColumn() {
    return column;
  }
}
