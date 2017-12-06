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
 * Model definition for MessagesTweetUpdate.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the tweet_api. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MessagesTweetUpdate extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String cuerdas;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String entityKey;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String marcagui;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String modelogui;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String precio;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String token;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String urlImage;

  /**
   * @return value or {@code null} for none
   */
  public String getCuerdas() {
    return cuerdas;
  }

  /**
   * @param cuerdas cuerdas or {@code null} for none
   */
  public MessagesTweetUpdate setCuerdas(String cuerdas) {
    this.cuerdas = cuerdas;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public String getEntityKey() {
    return entityKey;
  }

  /**
   * @param entityKey entityKey or {@code null} for none
   */
  public MessagesTweetUpdate setEntityKey(String entityKey) {
    this.entityKey = entityKey;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public String getMarcagui() {
    return marcagui;
  }

  /**
   * @param marcagui marcagui or {@code null} for none
   */
  public MessagesTweetUpdate setMarcagui(String marcagui) {
    this.marcagui = marcagui;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public String getModelogui() {
    return modelogui;
  }

  /**
   * @param modelogui modelogui or {@code null} for none
   */
  public MessagesTweetUpdate setModelogui(String modelogui) {
    this.modelogui = modelogui;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public String getPrecio() {
    return precio;
  }

  /**
   * @param precio precio or {@code null} for none
   */
  public MessagesTweetUpdate setPrecio(String precio) {
    this.precio = precio;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public String getToken() {
    return token;
  }

  /**
   * @param token token or {@code null} for none
   */
  public MessagesTweetUpdate setToken(String token) {
    this.token = token;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public String getUrlImage() {
    return urlImage;
  }

  /**
   * @param urlImage urlImage or {@code null} for none
   */
  public MessagesTweetUpdate setUrlImage(String urlImage) {
    this.urlImage = urlImage;
    return this;
  }

  @Override
  public MessagesTweetUpdate set(String fieldName, Object value) {
    return (MessagesTweetUpdate) super.set(fieldName, value);
  }

  @Override
  public MessagesTweetUpdate clone() {
    return (MessagesTweetUpdate) super.clone();
  }

}
