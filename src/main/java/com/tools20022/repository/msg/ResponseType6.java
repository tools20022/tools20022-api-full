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
import com.tools20022.repository.codeset.Response2Code;
import com.tools20022.repository.codeset.ResultDetail3Code;
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
 * <li>{@linkplain com.tools20022.repository.msg.ResponseType6#mmResponse
 * ResponseType6.mmResponse}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ResponseType6#mmResponseDetail
 * ResponseType6.mmResponseDetail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ResponseType6#mmAdditionalResponse
 * ResponseType6.mmAdditionalResponse}</li>
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
 * "ResponseType6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Response of a requested service."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ResponseType5
 * ResponseType5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ResponseType6", propOrder = {"response", "responseDetail", "additionalResponse"})
public class ResponseType6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Rspn", required = true)
	protected Response2Code response;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Response2Code
	 * Response2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ResponseType6 ResponseType6}</li>
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
	 * definition} = "Response of the terminal manager."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ResponseType5#mmResponse
	 * ResponseType5.mmResponse}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ResponseType6, Response2Code> mmResponse = new MMMessageAttribute<ResponseType6, Response2Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ResponseType6.mmObject();
			isDerived = false;
			xmlTag = "Rspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Response";
			definition = "Response of the terminal manager.";
			previousVersion_lazy = () -> ResponseType5.mmResponse;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Response2Code.mmObject();
		}

		@Override
		public Response2Code getValue(ResponseType6 obj) {
			return obj.getResponse();
		}

		@Override
		public void setValue(ResponseType6 obj, Response2Code value) {
			obj.setResponse(value);
		}
	};
	@XmlElement(name = "RspnDtl")
	protected ResultDetail3Code responseDetail;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail3Code
	 * ResultDetail3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Response#mmResponseReason
	 * Response.mmResponseReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ResponseType6 ResponseType6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnDtl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseDetail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detail of the response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ResponseType5#mmResponseReason
	 * ResponseType5.mmResponseReason}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ResponseType6, Optional<ResultDetail3Code>> mmResponseDetail = new MMMessageAttribute<ResponseType6, Optional<ResultDetail3Code>>() {
		{
			businessElementTrace_lazy = () -> Response.mmResponseReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.ResponseType6.mmObject();
			isDerived = false;
			xmlTag = "RspnDtl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseDetail";
			definition = "Detail of the response.";
			previousVersion_lazy = () -> ResponseType5.mmResponseReason;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ResultDetail3Code.mmObject();
		}

		@Override
		public Optional<ResultDetail3Code> getValue(ResponseType6 obj) {
			return obj.getResponseDetail();
		}

		@Override
		public void setValue(ResponseType6 obj, Optional<ResultDetail3Code> value) {
			obj.setResponseDetail(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlRspn")
	protected Max140Text additionalResponse;
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
	 * {@linkplain com.tools20022.repository.msg.ResponseType6 ResponseType6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRspn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information on the response for further examination."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ResponseType5#mmAdditionalResponseInformation
	 * ResponseType5.mmAdditionalResponseInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ResponseType6, Optional<Max140Text>> mmAdditionalResponse = new MMMessageAttribute<ResponseType6, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ResponseType6.mmObject();
			isDerived = false;
			xmlTag = "AddtlRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalResponse";
			definition = "Additional information on the response for further examination.";
			previousVersion_lazy = () -> ResponseType5.mmAdditionalResponseInformation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(ResponseType6 obj) {
			return obj.getAdditionalResponse();
		}

		@Override
		public void setValue(ResponseType6 obj, Optional<Max140Text> value) {
			obj.setAdditionalResponse(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ResponseType6.mmResponse, com.tools20022.repository.msg.ResponseType6.mmResponseDetail,
						com.tools20022.repository.msg.ResponseType6.mmAdditionalResponse);
				trace_lazy = () -> Response.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ResponseType6";
				definition = "Response of a requested service.";
				previousVersion_lazy = () -> ResponseType5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Response2Code getResponse() {
		return response;
	}

	public ResponseType6 setResponse(Response2Code response) {
		this.response = Objects.requireNonNull(response);
		return this;
	}

	public Optional<ResultDetail3Code> getResponseDetail() {
		return responseDetail == null ? Optional.empty() : Optional.of(responseDetail);
	}

	public ResponseType6 setResponseDetail(ResultDetail3Code responseDetail) {
		this.responseDetail = responseDetail;
		return this;
	}

	public Optional<Max140Text> getAdditionalResponse() {
		return additionalResponse == null ? Optional.empty() : Optional.of(additionalResponse);
	}

	public ResponseType6 setAdditionalResponse(Max140Text additionalResponse) {
		this.additionalResponse = additionalResponse;
		return this;
	}
}