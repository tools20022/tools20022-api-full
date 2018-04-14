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
import com.tools20022.repository.codeset.Priority4Code;
import com.tools20022.repository.datatype.Max13AlphaNumericText;
import com.tools20022.repository.datatype.Max6Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.IsabelEnhancedHeader1;
import com.tools20022.repository.msg.IsabelFile1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the header information for a payment initiation file.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelPaymentHeader2#mmActualSenderIdentification
 * IsabelPaymentHeader2.mmActualSenderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelPaymentHeader2#mmSenderPKIIdentification
 * IsabelPaymentHeader2.mmSenderPKIIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelPaymentHeader2#mmContractIdentification
 * IsabelPaymentHeader2.mmContractIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelPaymentHeader2#mmPayloadCreationDate
 * IsabelPaymentHeader2.mmPayloadCreationDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IsabelPaymentHeader2#mmFile
 * IsabelPaymentHeader2.mmFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelPaymentHeader2#mmQualifiedTransactionType
 * IsabelPaymentHeader2.mmQualifiedTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelPaymentHeader2#mmUrgencyCode
 * IsabelPaymentHeader2.mmUrgencyCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelPaymentHeader2#mmEnhanced
 * IsabelPaymentHeader2.mmEnhanced}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IsabelPaymentHeader2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the header information for a payment initiation file."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IsabelPaymentHeader2", propOrder = {"actualSenderIdentification", "senderPKIIdentification", "contractIdentification", "payloadCreationDate", "file", "qualifiedTransactionType", "urgencyCode", "enhanced"})
public class IsabelPaymentHeader2 {

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
	 * {@linkplain com.tools20022.repository.msg.IsabelPaymentHeader2
	 * IsabelPaymentHeader2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActlSndrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualSenderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of the actual sender of the file."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelPaymentHeader2, Max13AlphaNumericText> mmActualSenderIdentification = new MMMessageAttribute<IsabelPaymentHeader2, Max13AlphaNumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelPaymentHeader2.mmObject();
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
		public Max13AlphaNumericText getValue(IsabelPaymentHeader2 obj) {
			return obj.getActualSenderIdentification();
		}

		@Override
		public void setValue(IsabelPaymentHeader2 obj, Max13AlphaNumericText value) {
			obj.setActualSenderIdentification(value);
		}
	};
	@XmlElement(name = "SndrPKIId", required = true)
	protected Max13AlphaNumericText senderPKIIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.IsabelPaymentHeader2
	 * IsabelPaymentHeader2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndrPKIId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderPKIIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the public key identification user identification of the sender of the file."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelPaymentHeader2, Max13AlphaNumericText> mmSenderPKIIdentification = new MMMessageAttribute<IsabelPaymentHeader2, Max13AlphaNumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelPaymentHeader2.mmObject();
			isDerived = false;
			xmlTag = "SndrPKIId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderPKIIdentification";
			definition = "Unique identification of the public key identification user identification of the sender of the file.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max13AlphaNumericText.mmObject();
		}

		@Override
		public Max13AlphaNumericText getValue(IsabelPaymentHeader2 obj) {
			return obj.getSenderPKIIdentification();
		}

		@Override
		public void setValue(IsabelPaymentHeader2 obj, Max13AlphaNumericText value) {
			obj.setSenderPKIIdentification(value);
		}
	};
	@XmlElement(name = "CtrctId", required = true)
	protected Max13AlphaNumericText contractIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.IsabelPaymentHeader2
	 * IsabelPaymentHeader2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Administrative contract identification of the e-banking contract in which context this payment has been sent (and as such should be validated and executed)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelPaymentHeader2, Max13AlphaNumericText> mmContractIdentification = new MMMessageAttribute<IsabelPaymentHeader2, Max13AlphaNumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelPaymentHeader2.mmObject();
			isDerived = false;
			xmlTag = "CtrctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractIdentification";
			definition = "Administrative contract identification of the e-banking contract in which context this payment has been sent (and as such should be validated and executed).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max13AlphaNumericText.mmObject();
		}

		@Override
		public Max13AlphaNumericText getValue(IsabelPaymentHeader2 obj) {
			return obj.getContractIdentification();
		}

		@Override
		public void setValue(IsabelPaymentHeader2 obj, Max13AlphaNumericText value) {
			obj.setContractIdentification(value);
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
	 * {@linkplain com.tools20022.repository.msg.IsabelPaymentHeader2
	 * IsabelPaymentHeader2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PyldCreDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayloadCreationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the file in the payload was actually created."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IsabelPaymentHeader2, DateAndDateTimeChoice> mmPayloadCreationDate = new MMMessageAssociationEnd<IsabelPaymentHeader2, DateAndDateTimeChoice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelPaymentHeader2.mmObject();
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
		public DateAndDateTimeChoice getValue(IsabelPaymentHeader2 obj) {
			return obj.getPayloadCreationDate();
		}

		@Override
		public void setValue(IsabelPaymentHeader2 obj, DateAndDateTimeChoice value) {
			obj.setPayloadCreationDate(value);
		}
	};
	@XmlElement(name = "File", required = true)
	protected IsabelFile1 file;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IsabelFile1
	 * IsabelFile1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelPaymentHeader2
	 * IsabelPaymentHeader2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "File"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "File"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Characteristics of the file contained in the payload."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IsabelPaymentHeader2, IsabelFile1> mmFile = new MMMessageAssociationEnd<IsabelPaymentHeader2, IsabelFile1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelPaymentHeader2.mmObject();
			isDerived = false;
			xmlTag = "File";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "File";
			definition = "Characteristics of the file contained in the payload.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IsabelFile1.mmObject();
		}

		@Override
		public IsabelFile1 getValue(IsabelPaymentHeader2 obj) {
			return obj.getFile();
		}

		@Override
		public void setValue(IsabelPaymentHeader2 obj, IsabelFile1 value) {
			obj.setFile(value);
		}
	};
	@XmlElement(name = "QlfdTxTp", required = true)
	protected Max6Text qualifiedTransactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max6Text
	 * Max6Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelPaymentHeader2
	 * IsabelPaymentHeader2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QlfdTxTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualifiedTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "High level category of transactions provided in the payload file, such as a salary payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelPaymentHeader2, Max6Text> mmQualifiedTransactionType = new MMMessageAttribute<IsabelPaymentHeader2, Max6Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelPaymentHeader2.mmObject();
			isDerived = false;
			xmlTag = "QlfdTxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedTransactionType";
			definition = "High level category of transactions provided in the payload file, such as a salary payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max6Text.mmObject();
		}

		@Override
		public Max6Text getValue(IsabelPaymentHeader2 obj) {
			return obj.getQualifiedTransactionType();
		}

		@Override
		public void setValue(IsabelPaymentHeader2 obj, Max6Text value) {
			obj.setQualifiedTransactionType(value);
		}
	};
	@XmlElement(name = "UrgcyCd", required = true)
	protected Priority4Code urgencyCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Priority4Code
	 * Priority4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelPaymentHeader2
	 * IsabelPaymentHeader2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UrgcyCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UrgencyCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Urgency level of file in the payload."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelPaymentHeader2, Priority4Code> mmUrgencyCode = new MMMessageAttribute<IsabelPaymentHeader2, Priority4Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelPaymentHeader2.mmObject();
			isDerived = false;
			xmlTag = "UrgcyCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UrgencyCode";
			definition = "Urgency level of file in the payload.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Priority4Code.mmObject();
		}

		@Override
		public Priority4Code getValue(IsabelPaymentHeader2 obj) {
			return obj.getUrgencyCode();
		}

		@Override
		public void setValue(IsabelPaymentHeader2 obj, Priority4Code value) {
			obj.setUrgencyCode(value);
		}
	};
	@XmlElement(name = "Nhncd")
	protected IsabelEnhancedHeader1 enhanced;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1
	 * IsabelEnhancedHeader1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelPaymentHeader2
	 * IsabelPaymentHeader2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nhncd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Enhanced"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Enhanced parameters for an Isabel payment initiation file."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IsabelPaymentHeader2, Optional<IsabelEnhancedHeader1>> mmEnhanced = new MMMessageAssociationEnd<IsabelPaymentHeader2, Optional<IsabelEnhancedHeader1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelPaymentHeader2.mmObject();
			isDerived = false;
			xmlTag = "Nhncd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Enhanced";
			definition = "Enhanced parameters for an Isabel payment initiation file.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IsabelEnhancedHeader1.mmObject();
		}

		@Override
		public Optional<IsabelEnhancedHeader1> getValue(IsabelPaymentHeader2 obj) {
			return obj.getEnhanced();
		}

		@Override
		public void setValue(IsabelPaymentHeader2 obj, Optional<IsabelEnhancedHeader1> value) {
			obj.setEnhanced(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IsabelPaymentHeader2.mmActualSenderIdentification, com.tools20022.repository.msg.IsabelPaymentHeader2.mmSenderPKIIdentification,
						com.tools20022.repository.msg.IsabelPaymentHeader2.mmContractIdentification, com.tools20022.repository.msg.IsabelPaymentHeader2.mmPayloadCreationDate, com.tools20022.repository.msg.IsabelPaymentHeader2.mmFile,
						com.tools20022.repository.msg.IsabelPaymentHeader2.mmQualifiedTransactionType, com.tools20022.repository.msg.IsabelPaymentHeader2.mmUrgencyCode, com.tools20022.repository.msg.IsabelPaymentHeader2.mmEnhanced);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IsabelPaymentHeader2";
				definition = "Specifies the header information for a payment initiation file.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max13AlphaNumericText getActualSenderIdentification() {
		return actualSenderIdentification;
	}

	public IsabelPaymentHeader2 setActualSenderIdentification(Max13AlphaNumericText actualSenderIdentification) {
		this.actualSenderIdentification = Objects.requireNonNull(actualSenderIdentification);
		return this;
	}

	public Max13AlphaNumericText getSenderPKIIdentification() {
		return senderPKIIdentification;
	}

	public IsabelPaymentHeader2 setSenderPKIIdentification(Max13AlphaNumericText senderPKIIdentification) {
		this.senderPKIIdentification = Objects.requireNonNull(senderPKIIdentification);
		return this;
	}

	public Max13AlphaNumericText getContractIdentification() {
		return contractIdentification;
	}

	public IsabelPaymentHeader2 setContractIdentification(Max13AlphaNumericText contractIdentification) {
		this.contractIdentification = Objects.requireNonNull(contractIdentification);
		return this;
	}

	public DateAndDateTimeChoice getPayloadCreationDate() {
		return payloadCreationDate;
	}

	public IsabelPaymentHeader2 setPayloadCreationDate(DateAndDateTimeChoice payloadCreationDate) {
		this.payloadCreationDate = Objects.requireNonNull(payloadCreationDate);
		return this;
	}

	public IsabelFile1 getFile() {
		return file;
	}

	public IsabelPaymentHeader2 setFile(IsabelFile1 file) {
		this.file = Objects.requireNonNull(file);
		return this;
	}

	public Max6Text getQualifiedTransactionType() {
		return qualifiedTransactionType;
	}

	public IsabelPaymentHeader2 setQualifiedTransactionType(Max6Text qualifiedTransactionType) {
		this.qualifiedTransactionType = Objects.requireNonNull(qualifiedTransactionType);
		return this;
	}

	public Priority4Code getUrgencyCode() {
		return urgencyCode;
	}

	public IsabelPaymentHeader2 setUrgencyCode(Priority4Code urgencyCode) {
		this.urgencyCode = Objects.requireNonNull(urgencyCode);
		return this;
	}

	public Optional<IsabelEnhancedHeader1> getEnhanced() {
		return enhanced == null ? Optional.empty() : Optional.of(enhanced);
	}

	public IsabelPaymentHeader2 setEnhanced(IsabelEnhancedHeader1 enhanced) {
		this.enhanced = enhanced;
		return this;
	}
}