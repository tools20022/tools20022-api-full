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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.codeset.RequestModeType1Code;
import com.tools20022.repository.datatype.Max13AlphaNumericText;
import com.tools20022.repository.datatype.Max14AlphaNumericText;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the header information for a query file, as part of the
 * RequestForResponse flow.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelQueryHeader1#mmActualSenderIdentification
 * IsabelQueryHeader1.mmActualSenderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelQueryHeader1#mmPayloadCreationDate
 * IsabelQueryHeader1.mmPayloadCreationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelQueryHeader1#mmTransportIdentification
 * IsabelQueryHeader1.mmTransportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelQueryHeader1#mmRequestModeAndType
 * IsabelQueryHeader1.mmRequestModeAndType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IsabelQueryHeader1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the header information for a query file, as part of the RequestForResponse flow."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IsabelQueryHeader1", propOrder = {"actualSenderIdentification", "payloadCreationDate", "transportIdentification", "requestModeAndType"})
public class IsabelQueryHeader1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ActlSndrId", required = true)
	protected Max13AlphaNumericText actualSenderIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max13AlphaNumericText
	 * Max13AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelQueryHeader1
	 * IsabelQueryHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActlSndrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualSenderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of the actual sender of the file."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelQueryHeader1, Max13AlphaNumericText> mmActualSenderIdentification = new MMMessageAttribute<IsabelQueryHeader1, Max13AlphaNumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelQueryHeader1.mmObject();
			isDerived = false;
			xmlTag = "ActlSndrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualSenderIdentification";
			definition = "Unique identification of the actual sender of the file.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max13AlphaNumericText.mmObject();
		}

		@Override
		public Max13AlphaNumericText getValue(IsabelQueryHeader1 obj) {
			return obj.getActualSenderIdentification();
		}

		@Override
		public void setValue(IsabelQueryHeader1 obj, Max13AlphaNumericText value) {
			obj.setActualSenderIdentification(value);
		}
	};
	@XmlElement(name = "PyldCreDt", required = true)
	protected DateAndDateTimeChoice payloadCreationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelQueryHeader1
	 * IsabelQueryHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PyldCreDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayloadCreationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the file in the payload was actually created."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IsabelQueryHeader1, DateAndDateTimeChoice> mmPayloadCreationDate = new MMMessageAssociationEnd<IsabelQueryHeader1, DateAndDateTimeChoice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelQueryHeader1.mmObject();
			isDerived = false;
			xmlTag = "PyldCreDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayloadCreationDate";
			definition = "Date and time at which the file in the payload was actually created.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(IsabelQueryHeader1 obj) {
			return obj.getPayloadCreationDate();
		}

		@Override
		public void setValue(IsabelQueryHeader1 obj, DateAndDateTimeChoice value) {
			obj.setPayloadCreationDate(value);
		}
	};
	@XmlElement(name = "TrnsprtId", required = true)
	protected Max14AlphaNumericText transportIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max14AlphaNumericText
	 * Max14AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelQueryHeader1
	 * IsabelQueryHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsprtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of the transport."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelQueryHeader1, Max14AlphaNumericText> mmTransportIdentification = new MMMessageAttribute<IsabelQueryHeader1, Max14AlphaNumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelQueryHeader1.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportIdentification";
			definition = "Unique identification of the transport.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max14AlphaNumericText.mmObject();
		}

		@Override
		public Max14AlphaNumericText getValue(IsabelQueryHeader1 obj) {
			return obj.getTransportIdentification();
		}

		@Override
		public void setValue(IsabelQueryHeader1 obj, Max14AlphaNumericText value) {
			obj.setTransportIdentification(value);
		}
	};
	@XmlElement(name = "ReqMdAndTp", required = true)
	protected RequestModeType1Code requestModeAndType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RequestModeType1Code
	 * RequestModeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelQueryHeader1
	 * IsabelQueryHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqMdAndTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestModeAndType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Request criteria to identify the information to be returned in the response to the query."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelQueryHeader1, RequestModeType1Code> mmRequestModeAndType = new MMMessageAttribute<IsabelQueryHeader1, RequestModeType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelQueryHeader1.mmObject();
			isDerived = false;
			xmlTag = "ReqMdAndTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestModeAndType";
			definition = "Request criteria to identify the information to be returned in the response to the query.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestModeType1Code.mmObject();
		}

		@Override
		public RequestModeType1Code getValue(IsabelQueryHeader1 obj) {
			return obj.getRequestModeAndType();
		}

		@Override
		public void setValue(IsabelQueryHeader1 obj, RequestModeType1Code value) {
			obj.setRequestModeAndType(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IsabelQueryHeader1.mmActualSenderIdentification, com.tools20022.repository.msg.IsabelQueryHeader1.mmPayloadCreationDate,
						com.tools20022.repository.msg.IsabelQueryHeader1.mmTransportIdentification, com.tools20022.repository.msg.IsabelQueryHeader1.mmRequestModeAndType);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IsabelQueryHeader1";
				definition = "Specifies the header information for a query file, as part of the RequestForResponse flow.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max13AlphaNumericText getActualSenderIdentification() {
		return actualSenderIdentification;
	}

	public IsabelQueryHeader1 setActualSenderIdentification(Max13AlphaNumericText actualSenderIdentification) {
		this.actualSenderIdentification = Objects.requireNonNull(actualSenderIdentification);
		return this;
	}

	public DateAndDateTimeChoice getPayloadCreationDate() {
		return payloadCreationDate;
	}

	public IsabelQueryHeader1 setPayloadCreationDate(DateAndDateTimeChoice payloadCreationDate) {
		this.payloadCreationDate = Objects.requireNonNull(payloadCreationDate);
		return this;
	}

	public Max14AlphaNumericText getTransportIdentification() {
		return transportIdentification;
	}

	public IsabelQueryHeader1 setTransportIdentification(Max14AlphaNumericText transportIdentification) {
		this.transportIdentification = Objects.requireNonNull(transportIdentification);
		return this;
	}

	public RequestModeType1Code getRequestModeAndType() {
		return requestModeAndType;
	}

	public IsabelQueryHeader1 setRequestModeAndType(RequestModeType1Code requestModeAndType) {
		this.requestModeAndType = Objects.requireNonNull(requestModeAndType);
		return this;
	}
}