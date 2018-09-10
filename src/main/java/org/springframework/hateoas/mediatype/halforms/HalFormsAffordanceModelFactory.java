/*
 * Copyright 2017 the original author or authors.
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
package org.springframework.hateoas.mediatype.halforms;

import lombok.Getter;

import org.springframework.hateoas.Affordance;
import org.springframework.hateoas.AffordanceModel;
import org.springframework.hateoas.mediatype.MediaTypes;
import org.springframework.hateoas.core.AffordanceModelFactory;
import org.springframework.hateoas.core.DummyInvocationUtils.MethodInvocation;
import org.springframework.http.MediaType;
import org.springframework.web.util.UriComponents;

/**
 * Factory for creating {@link HalFormsAffordanceModel}s.
 *
 * @author Greg Turnquist
 * @author Oliver Gierke
 */
class HalFormsAffordanceModelFactory implements AffordanceModelFactory {

	private final @Getter MediaType mediaType = MediaTypes.HAL_FORMS_JSON;

	/*
	 * (non-Javadoc)
	 * @see org.springframework.hateoas.AffordanceModelFactory#getAffordanceModel(org.springframework.hateoas.Affordance, org.springframework.hateoas.core.DummyInvocationUtils.MethodInvocation, org.springframework.web.util.UriComponents)
	 */
	@Override
	public AffordanceModel getAffordanceModel(Affordance affordance, MethodInvocation invocationValue,
			UriComponents components) {
		return new HalFormsAffordanceModel(affordance, components);
	}
}