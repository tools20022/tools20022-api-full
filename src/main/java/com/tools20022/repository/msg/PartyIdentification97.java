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
import com.tools20022.repository.choice.PartyIdentification70Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.ContactPersonRole;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Party involved in the settlement chain.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification97#mmPartyIdentification
 * PartyIdentification97.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification97#mmProcessingReference
 * PartyIdentification97.mmProcessingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification97#mmProcessingDate
 * PartyIdentification97.mmProcessingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification97#mmContactPerson
 * PartyIdentification97.mmContactPerson}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyIdentification97"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party involved in the settlement chain."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PartyIdentification21
 * PartyIdentification21}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PartyIdentification97", propOrder = {"partyIdentification", "processingReference", "processingDate", "contactPerson"})
public class PartyIdentification97 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentification70Choice partyIdentification;
	/**
	 * Party that legally owns the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice
	 * PartyIdentification70Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification97
	 * PartyIdentification97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification21#mmPartyIdentification
	 * PartyIdentification21.mmPartyIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartyIdentification = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			componentContext_lazy = () -> PartyIdentification97.mmObject();
			isDerived = false;
			xmlTag = "PtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyIdentification";
			definition = "Party that legally owns the account.";
			previousVersion_lazy = () -> PartyIdentification21.mmPartyIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification70Choice.mmObject();
		}
	};
	protected Max35Text processingReference;
	/**
	 * Specifies the reference of the transaction at the party identified in the
	 * sequence.
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
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification97
	 * PartyIdentification97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reference of the transaction at the party identified in the sequence."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification21#mmProcessingReference
	 * PartyIdentification21.mmProcessingReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProcessingReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyIdentification97.mmObject();
			isDerived = false;
			xmlTag = "PrcgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingReference";
			definition = "Specifies the reference of the transaction at the party identified in the sequence.";
			previousVersion_lazy = () -> PartyIdentification21.mmProcessingReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DateAndDateTimeChoice processingDate;
	/**
	 * Date and optionally the time, at which this transaction was processed by
	 * the party identified in this sequence.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification97
	 * PartyIdentification97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and optionally the time, at which this transaction was processed by the party identified in this sequence."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification21#mmProcessingDate
	 * PartyIdentification21.mmProcessingDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProcessingDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyIdentification97.mmObject();
			isDerived = false;
			xmlTag = "PrcgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingDate";
			definition = "Date and optionally the time, at which this transaction was processed by the party identified in this sequence.";
			previousVersion_lazy = () -> PartyIdentification21.mmProcessingDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected ContactIdentification2 contactPerson;
	/**
	 * Contact person and contact information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ContactIdentification2
	 * ContactIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ContactPersonRole
	 * ContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification97
	 * PartyIdentification97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contact person and contact information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification21#mmContactPerson
	 * PartyIdentification21.mmContactPerson}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmContactPerson = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ContactPersonRole.mmObject();
			componentContext_lazy = () -> PartyIdentification97.mmObject();
			isDerived = false;
			xmlTag = "CtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactPerson";
			definition = "Contact person and contact information.";
			previousVersion_lazy = () -> PartyIdentification21.mmContactPerson;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContactIdentification2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PartyIdentification97.mmPartyIdentification, PartyIdentification97.mmProcessingReference, PartyIdentification97.mmProcessingDate, PartyIdentification97.mmContactPerson);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIdentification97";
				definition = "Party involved in the settlement chain.";
				previousVersion_lazy = () -> PartyIdentification21.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PtyId", required = true)
	public PartyIdentification70Choice getPartyIdentification() {
		return partyIdentification;
	}

	public void setPartyIdentification(PartyIdentification70Choice partyIdentification) {
		this.partyIdentification = partyIdentification;
	}

	@XmlElement(name = "PrcgRef")
	public Max35Text getProcessingReference() {
		return processingReference;
	}

	public void setProcessingReference(Max35Text processingReference) {
		this.processingReference = processingReference;
	}

	@XmlElement(name = "PrcgDt")
	public DateAndDateTimeChoice getProcessingDate() {
		return processingDate;
	}

	public void setProcessingDate(DateAndDateTimeChoice processingDate) {
		this.processingDate = processingDate;
	}

	@XmlElement(name = "CtctPrsn")
	public ContactIdentification2 getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(com.tools20022.repository.msg.ContactIdentification2 contactPerson) {
		this.contactPerson = contactPerson;
	}
}