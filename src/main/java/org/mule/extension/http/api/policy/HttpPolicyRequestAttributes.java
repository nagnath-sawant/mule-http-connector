/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.extension.http.api.policy;

import org.mule.extension.http.api.BaseHttpRequestAttributes;
import org.mule.runtime.api.util.MultiMap;

import java.util.Map;

/**
 * {@link BaseHttpRequestAttributes} subclass that allows modification of request attributes and
 * creation through the expression language.
 *
 * @since 1.0
 */
public class HttpPolicyRequestAttributes extends BaseHttpRequestAttributes {

  private static final long serialVersionUID = 7856582596752161400L;

  public HttpPolicyRequestAttributes(MultiMap<String, String> headers, MultiMap<String, String> queryParams,
                                     MultiMap<String, String> uriParams, String requestPath) {
    super(headers, queryParams, uriParams, requestPath);
  }

  public HttpPolicyRequestAttributes() {
    super(new MultiMap<>(), new MultiMap<>(), new MultiMap<>(), "");
  }

  public void setHeaders(Map<String, String> headers) {
    this.headers = new MultiMap<>(headers);
  }

  public void setQueryParams(Map<String, String> queryParams) {
    this.queryParams = new MultiMap<>(queryParams);
  }

  public void setUriParams(Map<String, String> uriParams) {
    this.uriParams = new MultiMap<>(uriParams);
  }

}
