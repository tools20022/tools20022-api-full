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
import com.tools20022.repository.codeset.Response3Code;
import com.tools20022.repository.codeset.ResultDetail1Code;
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
 * <li>{@linkplain com.tools20022.repository.msg.ResponseType2#mmResult
 * ResponseType2.mmResult}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ResponseType2#mmResultDetails
 * ResponseType2.mmResultDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ResponseType2#mmAdditionalResultInformation
 * ResponseType2.mmAdditionalResultInformation}</li>
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
 * "ResponseType2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Response of a requested service."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ResponseType3 ResponseType3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ResponseType1
 * ResponseType1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ResponseType2", propOrder = {"result", "resultDetails", "additionalResultInformation"})
public class ResponseType2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Rslt", required = true)
	protected Response3Code result;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Response3Code
	 * Response3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Response Response}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ResponseType2 ResponseType2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Result"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of the request message or advice message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ResponseType3#mmResponse
	 * ResponseType3.mmResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ResponseType2, Response3Code> mmResult = new MMMessageAttribute<ResponseType2, Response3Code>() {
		{
			businessComponentTrace_lazy = () -> Response.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ResponseType2.mmObject();
			isDerived = false;
			xmlTag = "Rslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Result";
			definition = "Result of the request message or advice message.";
			nextVersions_lazy = () -> Arrays.asList(ResponseType3.mmResponse);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Response3Code.mmObject();
		}

		@Override
		public Response3Code getValue(ResponseType2 obj) {
			return obj.getResult();
		}

		@Override
		public void setValue(ResponseType2 obj, Response3Code value) {
			obj.setResult(value);
		}
	};
	@XmlElement(name = "RsltDtls")
	protected ResultDetail1Code resultDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Response#mmResponseReason
	 * Response.mmResponseReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ResponseType2 ResponseType2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsltDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detail of the result."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResponseType3#mmResponseReason
	 * ResponseType3.mmResponseReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ResponseType2, Optional<ResultDetail1Code>> mmResultDetails = new MMMessageAttribute<ResponseType2, Optional<ResultDetail1Code>>() {
		{
			businessElementTrace_lazy = () -> Response.mmResponseReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.ResponseType2.mmObject();
			isDerived = false;
			xmlTag = "RsltDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResultDetails";
			definition = "Detail of the result.";
			nextVersions_lazy = () -> Arrays.asList(ResponseType3.mmResponseReason);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ResultDetail1Code.mmObject();
		}

		@Override
		public Optional<ResultDetail1Code> getValue(ResponseType2 obj) {
			return obj.getResultDetails();
		}

		@Override
		public void setValue(ResponseType2 obj, Optional<ResultDetail1Code> value) {
			obj.setResultDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlRsltInf")
	protected Max140Text additionalResultInformation;
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
	 * {@linkplain com.tools20022.repository.msg.ResponseType2 ResponseType2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRsltInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalResultInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information to be logged for further examination."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResponseType3#mmAdditionalResponseInformation
	 * ResponseType3.mmAdditionalResponseInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ResponseType2, Optional<Max140Text>> mmAdditionalResultInformation = new MMMessageAttribute<ResponseType2, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ResponseType2.mmObject();
			isDerived = false;
			xmlTag = "AddtlRsltInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalResultInformation";
			definition = "Additional information to be logged for further examination.";
			nextVersions_lazy = () -> Arrays.asList(ResponseType3.mmAdditionalResponseInformation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(ResponseType2 obj) {
			return obj.getAdditionalResultInformation();
		}

		@Override
		public void setValue(ResponseType2 obj, Optional<Max140Text> value) {
			obj.setAdditionalResultInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ResponseType2.mmResult, com.tools20022.repository.msg.ResponseType2.mmResultDetails,
						com.tools20022.repository.msg.ResponseType2.mmAdditionalResultInformation);
				trace_lazy = () -> Response.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ResponseType2";
				definition = "Response of a requested service.";
				nextVersions_lazy = () -> Arrays.asList(ResponseType3.mmObject());
				previousVersion_lazy = () -> ResponseType1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Response3Code getResult() {
		return result;
	}

	public ResponseType2 setResult(Response3Code result) {
		this.result = Objects.requireNonNull(result);
		return this;
	}

	public Optional<ResultDetail1Code> getResultDetails() {
		return resultDetails == null ? Optional.empty() : Optional.of(resultDetails);
	}

	public ResponseType2 setResultDetails(ResultDetail1Code resultDetails) {
		this.resultDetails = resultDetails;
		return this;
	}

	public Optional<Max140Text> getAdditionalResultInformation() {
		return additionalResultInformation == null ? Optional.empty() : Optional.of(additionalResultInformation);
	}

	public ResponseType2 setAdditionalResultInformation(Max140Text additionalResultInformation) {
		this.additionalResultInformation = additionalResultInformation;
		return this;
	}
}