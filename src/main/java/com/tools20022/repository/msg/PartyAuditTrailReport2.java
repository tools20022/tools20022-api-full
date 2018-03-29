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
import com.tools20022.repository.choice.AuditTrailOrBusinessError2Choice;
import com.tools20022.repository.choice.DateSearchChoice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SystemPartyIdentification3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport2#mmPartyAuditTrailOrError
 * PartyAuditTrailReport2.mmPartyAuditTrailOrError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport2#mmDatePeriod
 * PartyAuditTrailReport2.mmDatePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport2#mmPartyIdentification
 * PartyAuditTrailReport2.mmPartyIdentification}</li>
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
 * "PartyAuditTrailReport2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Report information about party reference data."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAuditTrailReport3
 * PartyAuditTrailReport3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport1
 * PartyAuditTrailReport1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyAuditTrailReport2", propOrder = {"partyAuditTrailOrError", "datePeriod", "partyIdentification"})
public class PartyAuditTrailReport2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PtyAudtTrlOrErr", required = true)
	protected AuditTrailOrBusinessError2Choice partyAuditTrailOrError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AuditTrailOrBusinessError2Choice
	 * AuditTrailOrBusinessError2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport2
	 * PartyAuditTrailReport2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport3#mmPartyAuditTrailOrError
	 * PartyAuditTrailReport3.mmPartyAuditTrailOrError}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport1#mmPartyAuditTrailOrError
	 * PartyAuditTrailReport1.mmPartyAuditTrailOrError}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyAuditTrailReport2, AuditTrailOrBusinessError2Choice> mmPartyAuditTrailOrError = new MMMessageAssociationEnd<PartyAuditTrailReport2, AuditTrailOrBusinessError2Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyAuditTrailReport2.mmObject();
			isDerived = false;
			xmlTag = "PtyAudtTrlOrErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyAuditTrailOrError";
			definition = "Identifies the returned party reference data or error information.";
			nextVersions_lazy = () -> Arrays.asList(PartyAuditTrailReport3.mmPartyAuditTrailOrError);
			previousVersion_lazy = () -> PartyAuditTrailReport1.mmPartyAuditTrailOrError;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AuditTrailOrBusinessError2Choice.mmObject();
		}

		@Override
		public AuditTrailOrBusinessError2Choice getValue(PartyAuditTrailReport2 obj) {
			return obj.getPartyAuditTrailOrError();
		}

		@Override
		public void setValue(PartyAuditTrailReport2 obj, AuditTrailOrBusinessError2Choice value) {
			obj.setPartyAuditTrailOrError(value);
		}
	};
	@XmlElement(name = "DtPrd")
	protected DateSearchChoice datePeriod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport2
	 * PartyAuditTrailReport2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport3#mmDatePeriod
	 * PartyAuditTrailReport3.mmDatePeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport1#mmDatePeriod
	 * PartyAuditTrailReport1.mmDatePeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyAuditTrailReport2, Optional<DateSearchChoice>> mmDatePeriod = new MMMessageAttribute<PartyAuditTrailReport2, Optional<DateSearchChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyAuditTrailReport2.mmObject();
			isDerived = false;
			xmlTag = "DtPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DatePeriod";
			definition = "Period in dates for which the audit trail is provided.";
			nextVersions_lazy = () -> Arrays.asList(PartyAuditTrailReport3.mmDatePeriod);
			previousVersion_lazy = () -> PartyAuditTrailReport1.mmDatePeriod;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateSearchChoice.mmObject();
		}

		@Override
		public Optional<DateSearchChoice> getValue(PartyAuditTrailReport2 obj) {
			return obj.getDatePeriod();
		}

		@Override
		public void setValue(PartyAuditTrailReport2 obj, Optional<DateSearchChoice> value) {
			obj.setDatePeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "PtyId", required = true)
	protected SystemPartyIdentification3 partyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification3
	 * SystemPartyIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport2
	 * PartyAuditTrailReport2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport3#mmPartyIdentification
	 * PartyAuditTrailReport3.mmPartyIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport1#mmPartyIdentification
	 * PartyAuditTrailReport1.mmPartyIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyAuditTrailReport2, SystemPartyIdentification3> mmPartyIdentification = new MMMessageAssociationEnd<PartyAuditTrailReport2, SystemPartyIdentification3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyAuditTrailReport2.mmObject();
			isDerived = false;
			xmlTag = "PtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyIdentification";
			definition = "Identifies the party for which the audit trail is provided.";
			nextVersions_lazy = () -> Arrays.asList(PartyAuditTrailReport3.mmPartyIdentification);
			previousVersion_lazy = () -> PartyAuditTrailReport1.mmPartyIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification3.mmObject();
		}

		@Override
		public SystemPartyIdentification3 getValue(PartyAuditTrailReport2 obj) {
			return obj.getPartyIdentification();
		}

		@Override
		public void setValue(PartyAuditTrailReport2 obj, SystemPartyIdentification3 value) {
			obj.setPartyIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyAuditTrailReport2.mmPartyAuditTrailOrError, com.tools20022.repository.msg.PartyAuditTrailReport2.mmDatePeriod,
						com.tools20022.repository.msg.PartyAuditTrailReport2.mmPartyIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PartyAuditTrailReport2";
				definition = "Report information about party reference data.";
				nextVersions_lazy = () -> Arrays.asList(PartyAuditTrailReport3.mmObject());
				previousVersion_lazy = () -> PartyAuditTrailReport1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public AuditTrailOrBusinessError2Choice getPartyAuditTrailOrError() {
		return partyAuditTrailOrError;
	}

	public PartyAuditTrailReport2 setPartyAuditTrailOrError(AuditTrailOrBusinessError2Choice partyAuditTrailOrError) {
		this.partyAuditTrailOrError = Objects.requireNonNull(partyAuditTrailOrError);
		return this;
	}

	public Optional<DateSearchChoice> getDatePeriod() {
		return datePeriod == null ? Optional.empty() : Optional.of(datePeriod);
	}

	public PartyAuditTrailReport2 setDatePeriod(DateSearchChoice datePeriod) {
		this.datePeriod = datePeriod;
		return this;
	}

	public SystemPartyIdentification3 getPartyIdentification() {
		return partyIdentification;
	}

	public PartyAuditTrailReport2 setPartyIdentification(SystemPartyIdentification3 partyIdentification) {
		this.partyIdentification = Objects.requireNonNull(partyIdentification);
		return this;
	}
}