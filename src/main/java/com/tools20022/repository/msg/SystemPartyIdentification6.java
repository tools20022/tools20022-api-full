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
import com.tools20022.repository.entity.OrganisationIdentification;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SystemPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstitutionIdentification12;
import com.tools20022.repository.msg.PartyIdentification91;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Unique and unambiguous way to identify a system party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification6#mmRelatedPartyIdentification
 * SystemPartyIdentification6.mmRelatedPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification6#mmResponsiblePartyIdentification
 * SystemPartyIdentification6.mmResponsiblePartyIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SystemPartyRole
 * SystemPartyRole}</li>
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
 * "SystemPartyIdentification6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unique and unambiguous way to identify a system party."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification5
 * SystemPartyIdentification5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SystemPartyIdentification6", propOrder = {"relatedPartyIdentification", "responsiblePartyIdentification"})
public class SystemPartyIdentification6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RltdPtyId", required = true)
	protected PartyIdentification91 relatedPartyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification91
	 * PartyIdentification91}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification6
	 * SystemPartyIdentification6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdPtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the party referenced by a request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification5#mmRelatedPartyIdentification
	 * SystemPartyIdentification5.mmRelatedPartyIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SystemPartyIdentification6, PartyIdentification91> mmRelatedPartyIdentification = new MMMessageAssociationEnd<SystemPartyIdentification6, PartyIdentification91>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemPartyIdentification6.mmObject();
			isDerived = false;
			xmlTag = "RltdPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartyIdentification";
			definition = "Unique identification of the party referenced by a request.";
			previousVersion_lazy = () -> SystemPartyIdentification5.mmRelatedPartyIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification91.mmObject();
		}

		@Override
		public PartyIdentification91 getValue(SystemPartyIdentification6 obj) {
			return obj.getRelatedPartyIdentification();
		}

		@Override
		public void setValue(SystemPartyIdentification6 obj, PartyIdentification91 value) {
			obj.setRelatedPartyIdentification(value);
		}
	};
	@XmlElement(name = "RspnsblPtyId")
	protected FinancialInstitutionIdentification12 responsiblePartyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification12
	 * FinancialInstitutionIdentification12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBICFI
	 * OrganisationIdentification.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification6
	 * SystemPartyIdentification6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnsblPtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponsiblePartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the party responsible for the maintenance of the party reference data."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification5#mmResponsiblePartyIdentification
	 * SystemPartyIdentification5.mmResponsiblePartyIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemPartyIdentification6, Optional<FinancialInstitutionIdentification12>> mmResponsiblePartyIdentification = new MMMessageAttribute<SystemPartyIdentification6, Optional<FinancialInstitutionIdentification12>>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmBICFI;
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemPartyIdentification6.mmObject();
			isDerived = false;
			xmlTag = "RspnsblPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponsiblePartyIdentification";
			definition = "Unique identification of the party responsible for the maintenance of the party reference data.";
			previousVersion_lazy = () -> SystemPartyIdentification5.mmResponsiblePartyIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstitutionIdentification12.mmObject();
		}

		@Override
		public Optional<FinancialInstitutionIdentification12> getValue(SystemPartyIdentification6 obj) {
			return obj.getResponsiblePartyIdentification();
		}

		@Override
		public void setValue(SystemPartyIdentification6 obj, Optional<FinancialInstitutionIdentification12> value) {
			obj.setResponsiblePartyIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SystemPartyIdentification6.mmRelatedPartyIdentification, com.tools20022.repository.msg.SystemPartyIdentification6.mmResponsiblePartyIdentification);
				trace_lazy = () -> SystemPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SystemPartyIdentification6";
				definition = "Unique and unambiguous way to identify a system party.";
				previousVersion_lazy = () -> SystemPartyIdentification5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification91 getRelatedPartyIdentification() {
		return relatedPartyIdentification;
	}

	public SystemPartyIdentification6 setRelatedPartyIdentification(PartyIdentification91 relatedPartyIdentification) {
		this.relatedPartyIdentification = Objects.requireNonNull(relatedPartyIdentification);
		return this;
	}

	public Optional<FinancialInstitutionIdentification12> getResponsiblePartyIdentification() {
		return responsiblePartyIdentification == null ? Optional.empty() : Optional.of(responsiblePartyIdentification);
	}

	public SystemPartyIdentification6 setResponsiblePartyIdentification(FinancialInstitutionIdentification12 responsiblePartyIdentification) {
		this.responsiblePartyIdentification = responsiblePartyIdentification;
		return this;
	}
}