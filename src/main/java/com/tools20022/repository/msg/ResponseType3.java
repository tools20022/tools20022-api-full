/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.Response4Code;
import com.tools20022.repository.codeset.ResultDetail2Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.Response;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Response of a requested service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ResponseType3#mmResponse
 * ResponseType3.mmResponse}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ResponseType3#mmResponseReason
 * ResponseType3.mmResponseReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ResponseType3#mmAdditionalResponseInformation
 * ResponseType3.mmAdditionalResponseInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Response Response}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ResponseType3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Response of a requested service."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ResponseType2
 * ResponseType2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ResponseType3", propOrder = {"response", "responseReason", "additionalResponseInformation"})
public class ResponseType3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Rspn", required = true)
	protected Response4Code response;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Response4Code
	 * Response4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ResponseType3 ResponseType3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rspn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Response"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of the requested transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ResponseType2#mmResult
	 * ResponseType2.mmResult}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ResponseType3, Response4Code> mmResponse = new MMMessageAttribute<ResponseType3, Response4Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ResponseType3.mmObject();
			isDerived = false;
			xmlTag = "Rspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Response";
			definition = "Result of the requested transaction.";
			previousVersion_lazy = () -> ResponseType2.mmResult;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Response4Code.mmObject();
		}

		@Override
		public Response4Code getValue(ResponseType3 obj) {
			return obj.getResponse();
		}

		@Override
		public void setValue(ResponseType3 obj, Response4Code value) {
			obj.setResponse(value);
		}
	};
	@XmlElement(name = "RspnRsn")
	protected ResultDetail2Code responseReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ResponseType3 ResponseType3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detail of the response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ResponseType2#mmResultDetails
	 * ResponseType2.mmResultDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ResponseType3, Optional<ResultDetail2Code>> mmResponseReason = new MMMessageAttribute<ResponseType3, Optional<ResultDetail2Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ResponseType3.mmObject();
			isDerived = false;
			xmlTag = "RspnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseReason";
			definition = "Detail of the response.";
			previousVersion_lazy = () -> ResponseType2.mmResultDetails;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ResultDetail2Code.mmObject();
		}

		@Override
		public Optional<ResultDetail2Code> getValue(ResponseType3 obj) {
			return obj.getResponseReason();
		}

		@Override
		public void setValue(ResponseType3 obj, Optional<ResultDetail2Code> value) {
			obj.setResponseReason(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlRspnInf")
	protected Max140Text additionalResponseInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ResponseType3 ResponseType3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRspnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalResponseInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information to be logged for further examination."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ResponseType2#mmAdditionalResultInformation
	 * ResponseType2.mmAdditionalResultInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ResponseType3, Optional<Max140Text>> mmAdditionalResponseInformation = new MMMessageAttribute<ResponseType3, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ResponseType3.mmObject();
			isDerived = false;
			xmlTag = "AddtlRspnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalResponseInformation";
			definition = "Additional information to be logged for further examination.";
			previousVersion_lazy = () -> ResponseType2.mmAdditionalResultInformation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(ResponseType3 obj) {
			return obj.getAdditionalResponseInformation();
		}

		@Override
		public void setValue(ResponseType3 obj, Optional<Max140Text> value) {
			obj.setAdditionalResponseInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ResponseType3.mmResponse, com.tools20022.repository.msg.ResponseType3.mmResponseReason,
						com.tools20022.repository.msg.ResponseType3.mmAdditionalResponseInformation);
				trace_lazy = () -> Response.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ResponseType3";
				definition = "Response of a requested service.";
				previousVersion_lazy = () -> ResponseType2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Response4Code getResponse() {
		return response;
	}

	public ResponseType3 setResponse(Response4Code response) {
		this.response = Objects.requireNonNull(response);
		return this;
	}

	public Optional<ResultDetail2Code> getResponseReason() {
		return responseReason == null ? Optional.empty() : Optional.of(responseReason);
	}

	public ResponseType3 setResponseReason(ResultDetail2Code responseReason) {
		this.responseReason = responseReason;
		return this;
	}

	public Optional<Max140Text> getAdditionalResponseInformation() {
		return additionalResponseInformation == null ? Optional.empty() : Optional.of(additionalResponseInformation);
	}

	public ResponseType3 setAdditionalResponseInformation(Max140Text additionalResponseInformation) {
		this.additionalResponseInformation = additionalResponseInformation;
		return this;
	}
}