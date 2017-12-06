/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2017-11-07 19:12:12 UTC)
 * on 2017-12-06 at 20:02:38 UTC 
 * Modify at your own risk.
 */

package com.tweet_api.model;

/**
 * Model definition for MessagesToken.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the tweet_api. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MessagesToken extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String tokenint;

  /**
   * @return value or {@code null} for none
   */
  public String getTokenint() {
    return tokenint;
  }

  /**
   * @param tokenint tokenint or {@code null} for none
   */
  public MessagesToken setTokenint(String tokenint) {
    this.tokenint = tokenint;
    return this;
  }

  @Override
  public MessagesToken set(String fieldName, Object value) {
    return (MessagesToken) super.set(fieldName, value);
  }

  @Override
  public MessagesToken clone() {
    return (MessagesToken) super.clone();
  }

}
