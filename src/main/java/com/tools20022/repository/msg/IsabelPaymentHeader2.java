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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IsabelPaymentHeader2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the header information for a payment initiation file."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "IsabelPaymentHeader2", propOrder = {"actualSenderIdentification", "senderPKIIdentification", "contractIdentification", "payloadCreationDate", "file", "qualifiedTransactionType", "urgencyCode", "enhanced"})
public class IsabelPaymentHeader2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max13AlphaNumericText actualSenderIdentification;
	/**
	 * Unique identification of the actual sender of the file.
	 * <p>
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
	public static final MMMessageAttribute mmActualSenderIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelPaymentHeader2.mmObject();
			isDerived = false;
			xmlTag = "ActlSndrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualSenderIdentification";
			definition = "Unique identification of the actual sender of the file.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max13AlphaNumericText.mmObject();
		}
	};
	protected Max13AlphaNumericText senderPKIIdentification;
	/**
	 * Unique identification of the public key identification user
	 * identification of the sender of the file.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderPKIIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the public key identification user identification of the sender of the file."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSenderPKIIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelPaymentHeader2.mmObject();
			isDerived = false;
			xmlTag = "SndrPKIId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderPKIIdentification";
			definition = "Unique identification of the public key identification user identification of the sender of the file.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max13AlphaNumericText.mmObject();
		}
	};
	protected Max13AlphaNumericText contractIdentification;
	/**
	 * Administrative contract identification of the e-banking contract in which
	 * context this payment has been sent (and as such should be validated and
	 * executed).
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Administrative contract identification of the e-banking contract in which context this payment has been sent (and as such should be validated and executed)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContractIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelPaymentHeader2.mmObject();
			isDerived = false;
			xmlTag = "CtrctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractIdentification";
			definition = "Administrative contract identification of the e-banking contract in which context this payment has been sent (and as such should be validated and executed).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max13AlphaNumericText.mmObject();
		}
	};
	protected DateAndDateTimeChoice payloadCreationDate;
	/**
	 * Date and time at which the file in the payload was actually created.
	 * <p>
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
	public static final MMMessageAssociationEnd mmPayloadCreationDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IsabelPaymentHeader2.mmObject();
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
	};
	protected IsabelFile1 file;
	/**
	 * Characteristics of the file contained in the payload.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "File"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Characteristics of the file contained in the payload."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFile = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IsabelPaymentHeader2.mmObject();
			isDerived = false;
			xmlTag = "File";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "File";
			definition = "Characteristics of the file contained in the payload.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.IsabelFile1.mmObject();
		}
	};
	protected Max6Text qualifiedTransactionType;
	/**
	 * High level category of transactions provided in the payload file, such as
	 * a salary payment.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualifiedTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "High level category of transactions provided in the payload file, such as a salary payment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQualifiedTransactionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelPaymentHeader2.mmObject();
			isDerived = false;
			xmlTag = "QlfdTxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedTransactionType";
			definition = "High level category of transactions provided in the payload file, such as a salary payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max6Text.mmObject();
		}
	};
	protected Priority4Code urgencyCode;
	/**
	 * Urgency level of file in the payload.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UrgencyCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Urgency level of file in the payload."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUrgencyCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelPaymentHeader2.mmObject();
			isDerived = false;
			xmlTag = "UrgcyCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UrgencyCode";
			definition = "Urgency level of file in the payload.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Priority4Code.mmObject();
		}
	};
	protected IsabelEnhancedHeader1 enhanced;
	/**
	 * Enhanced parameters for an Isabel payment initiation file.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Enhanced"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Enhanced parameters for an Isabel payment initiation file."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEnhanced = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IsabelPaymentHeader2.mmObject();
			isDerived = false;
			xmlTag = "Nhncd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Enhanced";
			definition = "Enhanced parameters for an Isabel payment initiation file.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.IsabelEnhancedHeader1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(IsabelPaymentHeader2.mmActualSenderIdentification, IsabelPaymentHeader2.mmSenderPKIIdentification, IsabelPaymentHeader2.mmContractIdentification,
						IsabelPaymentHeader2.mmPayloadCreationDate, IsabelPaymentHeader2.mmFile, IsabelPaymentHeader2.mmQualifiedTransactionType, IsabelPaymentHeader2.mmUrgencyCode, IsabelPaymentHeader2.mmEnhanced);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IsabelPaymentHeader2";
				definition = "Specifies the header information for a payment initiation file.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ActlSndrId", required = true)
	public Max13AlphaNumericText getActualSenderIdentification() {
		return actualSenderIdentification;
	}

	public void setActualSenderIdentification(Max13AlphaNumericText actualSenderIdentification) {
		this.actualSenderIdentification = actualSenderIdentification;
	}

	@XmlElement(name = "SndrPKIId", required = true)
	public Max13AlphaNumericText getSenderPKIIdentification() {
		return senderPKIIdentification;
	}

	public void setSenderPKIIdentification(Max13AlphaNumericText senderPKIIdentification) {
		this.senderPKIIdentification = senderPKIIdentification;
	}

	@XmlElement(name = "CtrctId", required = true)
	public Max13AlphaNumericText getContractIdentification() {
		return contractIdentification;
	}

	public void setContractIdentification(Max13AlphaNumericText contractIdentification) {
		this.contractIdentification = contractIdentification;
	}

	@XmlElement(name = "PyldCreDt", required = true)
	public DateAndDateTimeChoice getPayloadCreationDate() {
		return payloadCreationDate;
	}

	public void setPayloadCreationDate(DateAndDateTimeChoice payloadCreationDate) {
		this.payloadCreationDate = payloadCreationDate;
	}

	@XmlElement(name = "File", required = true)
	public IsabelFile1 getFile() {
		return file;
	}

	public void setFile(com.tools20022.repository.msg.IsabelFile1 file) {
		this.file = file;
	}

	@XmlElement(name = "QlfdTxTp", required = true)
	public Max6Text getQualifiedTransactionType() {
		return qualifiedTransactionType;
	}

	public void setQualifiedTransactionType(Max6Text qualifiedTransactionType) {
		this.qualifiedTransactionType = qualifiedTransactionType;
	}

	@XmlElement(name = "UrgcyCd", required = true)
	public Priority4Code getUrgencyCode() {
		return urgencyCode;
	}

	public void setUrgencyCode(Priority4Code urgencyCode) {
		this.urgencyCode = urgencyCode;
	}

	@XmlElement(name = "Nhncd")
	public IsabelEnhancedHeader1 getEnhanced() {
		return enhanced;
	}

	public void setEnhanced(com.tools20022.repository.msg.IsabelEnhancedHeader1 enhanced) {
		this.enhanced = enhanced;
	}
}