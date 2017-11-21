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
import com.tools20022.repository.choice.PartyIdentification71Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria to extract the message(s) which should be resent.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria1#mmBusinessDate
 * ResendSearchCriteria1.mmBusinessDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria1#mmSequenceNumber
 * ResendSearchCriteria1.mmSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria1#mmOriginalMessageNameIdentification
 * ResendSearchCriteria1.mmOriginalMessageNameIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria1#mmFileReference
 * ResendSearchCriteria1.mmFileReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria1#mmRecipient
 * ResendSearchCriteria1.mmRecipient}</li>
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
 * "ResendSearchCriteria1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the criteria to extract the message(s) which should be resent."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ResendSearchCriteria1", propOrder = {"businessDate", "sequenceNumber", "originalMessageNameIdentification", "fileReference", "recipient"})
public class ResendSearchCriteria1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate businessDate;
	/**
	 * Date of the business day of the requested messages the resend function is
	 * used for.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria1
	 * ResendSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date of the business day of the requested messages the resend function is used for."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBusinessDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ResendSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "BizDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessDate";
			definition = "Date of the business day of the requested messages the resend function is used for.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Max35Text sequenceNumber;
	/**
	 * Independent counter for message sequence, which is available once per
	 * party technical address. Specifies the identification sequence number for
	 * a specific couple sender/receiver.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria1
	 * ResendSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Independent counter for message sequence, which is available once per party technical address.\nSpecifies the identification sequence number for a specific couple sender/receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ResendSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumber";
			definition = "Independent counter for message sequence, which is available once per party technical address.\nSpecifies the identification sequence number for a specific couple sender/receiver.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text originalMessageNameIdentification;
	/**
	 * Unambiguously identifies the original bsiness message, which was
	 * delivered by the business sender.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria1
	 * ResendSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgNmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageNameIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguously identifies the original bsiness message, which was delivered by the business sender."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalMessageNameIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ResendSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgNmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageNameIdentification";
			definition = "Unambiguously identifies the original bsiness message, which was delivered by the business sender.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text fileReference;
	/**
	 * String of characters that uniquely identifies the file, which was
	 * delivered by the sender.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria1
	 * ResendSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FileRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FileReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "String of characters that uniquely identifies the file, which was delivered by the sender."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFileReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ResendSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "FileRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FileReference";
			definition = "String of characters that uniquely identifies the file, which was delivered by the sender.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PartyIdentification71Choice recipient;
	/**
	 * Unique identification to unambiguously identify the recipient of the
	 * report message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria1
	 * ResendSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rcpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Recipient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification to unambiguously identify the recipient of the report message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRecipient = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ResendSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Rcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Recipient";
			definition = "Unique identification to unambiguously identify the recipient of the report message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification71Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ResendSearchCriteria1.mmBusinessDate, ResendSearchCriteria1.mmSequenceNumber, ResendSearchCriteria1.mmOriginalMessageNameIdentification, ResendSearchCriteria1.mmFileReference,
						ResendSearchCriteria1.mmRecipient);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ResendSearchCriteria1";
				definition = "Defines the criteria to extract the message(s) which should be resent.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "BizDt")
	public ISODate getBusinessDate() {
		return businessDate;
	}

	public void setBusinessDate(ISODate businessDate) {
		this.businessDate = businessDate;
	}

	@XmlElement(name = "SeqNb")
	public Max35Text getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(Max35Text sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	@XmlElement(name = "OrgnlMsgNmId")
	public Max35Text getOriginalMessageNameIdentification() {
		return originalMessageNameIdentification;
	}

	public void setOriginalMessageNameIdentification(Max35Text originalMessageNameIdentification) {
		this.originalMessageNameIdentification = originalMessageNameIdentification;
	}

	@XmlElement(name = "FileRef")
	public Max35Text getFileReference() {
		return fileReference;
	}

	public void setFileReference(Max35Text fileReference) {
		this.fileReference = fileReference;
	}

	@XmlElement(name = "Rcpt", required = true)
	public PartyIdentification71Choice getRecipient() {
		return recipient;
	}

	public void setRecipient(PartyIdentification71Choice recipient) {
		this.recipient = recipient;
	}
}