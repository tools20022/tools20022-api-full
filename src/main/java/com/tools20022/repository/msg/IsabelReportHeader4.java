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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the header information for a query response file, as part of the
 * RequestForResponse flow.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader4#mmActualSenderIdentification
 * IsabelReportHeader4.mmActualSenderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader4#mmPayloadCreationDate
 * IsabelReportHeader4.mmPayloadCreationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader4#mmFileFormat
 * IsabelReportHeader4.mmFileFormat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader4#mmSendTimeStamp
 * IsabelReportHeader4.mmSendTimeStamp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader4#mmTransportIdentification
 * IsabelReportHeader4.mmTransportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader4#mmOriginalRequestIdentification
 * IsabelReportHeader4.mmOriginalRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader4#mmEmptyPayload
 * IsabelReportHeader4.mmEmptyPayload}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader4#mmBankReference
 * IsabelReportHeader4.mmBankReference}</li>
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
 * "IsabelReportHeader4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the header information for a query response file, as part of the RequestForResponse flow."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IsabelReportHeader4", propOrder = {"actualSenderIdentification", "payloadCreationDate", "fileFormat", "sendTimeStamp", "transportIdentification", "originalRequestIdentification", "emptyPayload", "bankReference"})
public class IsabelReportHeader4 {

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
	 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader4
	 * IsabelReportHeader4}</li>
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
	public static final MMMessageAttribute<IsabelReportHeader4, Max13AlphaNumericText> mmActualSenderIdentification = new MMMessageAttribute<IsabelReportHeader4, Max13AlphaNumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelReportHeader4.mmObject();
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
		public Max13AlphaNumericText getValue(IsabelReportHeader4 obj) {
			return obj.getActualSenderIdentification();
		}

		@Override
		public void setValue(IsabelReportHeader4 obj, Max13AlphaNumericText value) {
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
	 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader4
	 * IsabelReportHeader4}</li>
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
	public static final MMMessageAssociationEnd<IsabelReportHeader4, DateAndDateTimeChoice> mmPayloadCreationDate = new MMMessageAssociationEnd<IsabelReportHeader4, DateAndDateTimeChoice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelReportHeader4.mmObject();
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
		public DateAndDateTimeChoice getValue(IsabelReportHeader4 obj) {
			return obj.getPayloadCreationDate();
		}

		@Override
		public void setValue(IsabelReportHeader4 obj, DateAndDateTimeChoice value) {
			obj.setPayloadCreationDate(value);
		}
	};
	@XmlElement(name = "FileFrmt", required = true)
	protected Max16Text fileFormat;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader4
	 * IsabelReportHeader4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FileFrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FileFormat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Format of the file."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelReportHeader4, Max16Text> mmFileFormat = new MMMessageAttribute<IsabelReportHeader4, Max16Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelReportHeader4.mmObject();
			isDerived = false;
			xmlTag = "FileFrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FileFormat";
			definition = "Format of the file.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		@Override
		public Max16Text getValue(IsabelReportHeader4 obj) {
			return obj.getFileFormat();
		}

		@Override
		public void setValue(IsabelReportHeader4 obj, Max16Text value) {
			obj.setFileFormat(value);
		}
	};
	@XmlElement(name = "SndTmStmp", required = true)
	protected ISODateTime sendTimeStamp;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader4
	 * IsabelReportHeader4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndTmStmp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SendTimeStamp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time stamp on when the file is sent."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelReportHeader4, ISODateTime> mmSendTimeStamp = new MMMessageAttribute<IsabelReportHeader4, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelReportHeader4.mmObject();
			isDerived = false;
			xmlTag = "SndTmStmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SendTimeStamp";
			definition = "Time stamp on when the file is sent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(IsabelReportHeader4 obj) {
			return obj.getSendTimeStamp();
		}

		@Override
		public void setValue(IsabelReportHeader4 obj, ISODateTime value) {
			obj.setSendTimeStamp(value);
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
	 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader4
	 * IsabelReportHeader4}</li>
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
	public static final MMMessageAttribute<IsabelReportHeader4, Max14AlphaNumericText> mmTransportIdentification = new MMMessageAttribute<IsabelReportHeader4, Max14AlphaNumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelReportHeader4.mmObject();
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
		public Max14AlphaNumericText getValue(IsabelReportHeader4 obj) {
			return obj.getTransportIdentification();
		}

		@Override
		public void setValue(IsabelReportHeader4 obj, Max14AlphaNumericText value) {
			obj.setTransportIdentification(value);
		}
	};
	@XmlElement(name = "OrgnlReqId", required = true)
	protected Max38AlphaNumericText originalRequestIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max38AlphaNumericText
	 * Max38AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader4
	 * IsabelReportHeader4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of the actual sender of the file."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelReportHeader4, Max38AlphaNumericText> mmOriginalRequestIdentification = new MMMessageAttribute<IsabelReportHeader4, Max38AlphaNumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelReportHeader4.mmObject();
			isDerived = false;
			xmlTag = "OrgnlReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalRequestIdentification";
			definition = "Unique identification of the actual sender of the file.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max38AlphaNumericText.mmObject();
		}

		@Override
		public Max38AlphaNumericText getValue(IsabelReportHeader4 obj) {
			return obj.getOriginalRequestIdentification();
		}

		@Override
		public void setValue(IsabelReportHeader4 obj, Max38AlphaNumericText value) {
			obj.setOriginalRequestIdentification(value);
		}
	};
	@XmlElement(name = "MptyPyld", required = true)
	protected TrueFalseIndicator emptyPayload;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader4
	 * IsabelReportHeader4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MptyPyld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmptyPayload"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the payload is empty."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelReportHeader4, TrueFalseIndicator> mmEmptyPayload = new MMMessageAttribute<IsabelReportHeader4, TrueFalseIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelReportHeader4.mmObject();
			isDerived = false;
			xmlTag = "MptyPyld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmptyPayload";
			definition = "Specifies whether the payload is empty.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(IsabelReportHeader4 obj) {
			return obj.getEmptyPayload();
		}

		@Override
		public void setValue(IsabelReportHeader4 obj, TrueFalseIndicator value) {
			obj.setEmptyPayload(value);
		}
	};
	@XmlElement(name = "BkRef", required = true)
	protected Max64Text bankReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max64Text
	 * Max64Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader4
	 * IsabelReportHeader4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique reference as assigned by the bank to the report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelReportHeader4, Max64Text> mmBankReference = new MMMessageAttribute<IsabelReportHeader4, Max64Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelReportHeader4.mmObject();
			isDerived = false;
			xmlTag = "BkRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankReference";
			definition = "Unique reference as assigned by the bank to the report.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max64Text.mmObject();
		}

		@Override
		public Max64Text getValue(IsabelReportHeader4 obj) {
			return obj.getBankReference();
		}

		@Override
		public void setValue(IsabelReportHeader4 obj, Max64Text value) {
			obj.setBankReference(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IsabelReportHeader4.mmActualSenderIdentification, com.tools20022.repository.msg.IsabelReportHeader4.mmPayloadCreationDate,
						com.tools20022.repository.msg.IsabelReportHeader4.mmFileFormat, com.tools20022.repository.msg.IsabelReportHeader4.mmSendTimeStamp, com.tools20022.repository.msg.IsabelReportHeader4.mmTransportIdentification,
						com.tools20022.repository.msg.IsabelReportHeader4.mmOriginalRequestIdentification, com.tools20022.repository.msg.IsabelReportHeader4.mmEmptyPayload, com.tools20022.repository.msg.IsabelReportHeader4.mmBankReference);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IsabelReportHeader4";
				definition = "Specifies the header information for a query response file, as part of the RequestForResponse flow.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max13AlphaNumericText getActualSenderIdentification() {
		return actualSenderIdentification;
	}

	public IsabelReportHeader4 setActualSenderIdentification(Max13AlphaNumericText actualSenderIdentification) {
		this.actualSenderIdentification = Objects.requireNonNull(actualSenderIdentification);
		return this;
	}

	public DateAndDateTimeChoice getPayloadCreationDate() {
		return payloadCreationDate;
	}

	public IsabelReportHeader4 setPayloadCreationDate(DateAndDateTimeChoice payloadCreationDate) {
		this.payloadCreationDate = Objects.requireNonNull(payloadCreationDate);
		return this;
	}

	public Max16Text getFileFormat() {
		return fileFormat;
	}

	public IsabelReportHeader4 setFileFormat(Max16Text fileFormat) {
		this.fileFormat = Objects.requireNonNull(fileFormat);
		return this;
	}

	public ISODateTime getSendTimeStamp() {
		return sendTimeStamp;
	}

	public IsabelReportHeader4 setSendTimeStamp(ISODateTime sendTimeStamp) {
		this.sendTimeStamp = Objects.requireNonNull(sendTimeStamp);
		return this;
	}

	public Max14AlphaNumericText getTransportIdentification() {
		return transportIdentification;
	}

	public IsabelReportHeader4 setTransportIdentification(Max14AlphaNumericText transportIdentification) {
		this.transportIdentification = Objects.requireNonNull(transportIdentification);
		return this;
	}

	public Max38AlphaNumericText getOriginalRequestIdentification() {
		return originalRequestIdentification;
	}

	public IsabelReportHeader4 setOriginalRequestIdentification(Max38AlphaNumericText originalRequestIdentification) {
		this.originalRequestIdentification = Objects.requireNonNull(originalRequestIdentification);
		return this;
	}

	public TrueFalseIndicator getEmptyPayload() {
		return emptyPayload;
	}

	public IsabelReportHeader4 setEmptyPayload(TrueFalseIndicator emptyPayload) {
		this.emptyPayload = Objects.requireNonNull(emptyPayload);
		return this;
	}

	public Max64Text getBankReference() {
		return bankReference;
	}

	public IsabelReportHeader4 setBankReference(Max64Text bankReference) {
		this.bankReference = Objects.requireNonNull(bankReference);
		return this;
	}
}