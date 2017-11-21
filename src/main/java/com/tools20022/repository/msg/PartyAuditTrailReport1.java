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
import com.tools20022.repository.choice.AuditTrailOrBusinessError1Choice;
import com.tools20022.repository.choice.DateSearchChoice;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Report information about party reference data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport1#mmPartyAuditTrailOrError
 * PartyAuditTrailReport1.mmPartyAuditTrailOrError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport1#mmDatePeriod
 * PartyAuditTrailReport1.mmDatePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport1#mmPartyIdentification
 * PartyAuditTrailReport1.mmPartyIdentification}</li>
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
 * "PartyAuditTrailReport1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Report information about party reference data."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PartyAuditTrailReport1", propOrder = {"partyAuditTrailOrError", "datePeriod", "partyIdentification"})
public class PartyAuditTrailReport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AuditTrailOrBusinessError1Choice partyAuditTrailOrError;
	/**
	 * Identifies the returned party reference data or error information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AuditTrailOrBusinessError1Choice
	 * AuditTrailOrBusinessError1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport1
	 * PartyAuditTrailReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyAudtTrlOrErr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyAuditTrailOrError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the returned party reference data or error information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPartyAuditTrailOrError = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PartyAuditTrailReport1.mmObject();
			isDerived = false;
			xmlTag = "PtyAudtTrlOrErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyAuditTrailOrError";
			definition = "Identifies the returned party reference data or error information.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AuditTrailOrBusinessError1Choice.mmObject();
		}
	};
	protected DateSearchChoice datePeriod;
	/**
	 * Period in dates for which the audit trail is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateSearchChoice
	 * DateSearchChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport1
	 * PartyAuditTrailReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DatePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period in dates for which the audit trail is provided."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDatePeriod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyAuditTrailReport1.mmObject();
			isDerived = false;
			xmlTag = "DtPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DatePeriod";
			definition = "Period in dates for which the audit trail is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateSearchChoice.mmObject();
		}
	};
	protected SystemPartyIdentification3 partyIdentification;
	/**
	 * Identifies the party for which the audit trail is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification3
	 * SystemPartyIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport1
	 * PartyAuditTrailReport1}</li>
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
	 * definition} =
	 * "Identifies the party for which the audit trail is provided."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPartyIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PartyAuditTrailReport1.mmObject();
			isDerived = false;
			xmlTag = "PtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyIdentification";
			definition = "Identifies the party for which the audit trail is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemPartyIdentification3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PartyAuditTrailReport1.mmPartyAuditTrailOrError, PartyAuditTrailReport1.mmDatePeriod, PartyAuditTrailReport1.mmPartyIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PartyAuditTrailReport1";
				definition = "Report information about party reference data.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PtyAudtTrlOrErr", required = true)
	public AuditTrailOrBusinessError1Choice getPartyAuditTrailOrError() {
		return partyAuditTrailOrError;
	}

	public void setPartyAuditTrailOrError(AuditTrailOrBusinessError1Choice partyAuditTrailOrError) {
		this.partyAuditTrailOrError = partyAuditTrailOrError;
	}

	@XmlElement(name = "DtPrd")
	public DateSearchChoice getDatePeriod() {
		return datePeriod;
	}

	public void setDatePeriod(DateSearchChoice datePeriod) {
		this.datePeriod = datePeriod;
	}

	@XmlElement(name = "PtyId", required = true)
	public SystemPartyIdentification3 getPartyIdentification() {
		return partyIdentification;
	}

	public void setPartyIdentification(com.tools20022.repository.msg.SystemPartyIdentification3 partyIdentification) {
		this.partyIdentification = partyIdentification;
	}
}