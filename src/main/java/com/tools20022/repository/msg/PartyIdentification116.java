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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.SellerRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.LegalOrganisation1;
import com.tools20022.repository.msg.OrganisationIdentification28;
import com.tools20022.repository.msg.TaxParty1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Unique identification, as assigned by an organisation, to unambiguously
 * identify a party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification116#mmPartyIdentification
 * PartyIdentification116.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification116#mmLegalOrganisation
 * PartyIdentification116.mmLegalOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification116#mmTaxParty
 * PartyIdentification116.mmTaxParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SellerRole SellerRole}</li>
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
 * "PartyIdentification116"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Unique identification, as assigned by an organisation, to unambiguously identify a party."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyIdentification116", propOrder = {"partyIdentification", "legalOrganisation", "taxParty"})
public class PartyIdentification116 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PtyId", required = true)
	protected OrganisationIdentification28 partyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification28
	 * OrganisationIdentification28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification116
	 * PartyIdentification116}</li>
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
	 * "Unique identification, as assigned by an organisation, to unambiguously identify a party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentification116, OrganisationIdentification28> mmPartyIdentification = new MMMessageAssociationEnd<PartyIdentification116, OrganisationIdentification28>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentification116.mmObject();
			isDerived = false;
			xmlTag = "PtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyIdentification";
			definition = "Unique identification, as assigned by an organisation, to unambiguously identify a party.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OrganisationIdentification28.mmObject();
		}

		@Override
		public OrganisationIdentification28 getValue(PartyIdentification116 obj) {
			return obj.getPartyIdentification();
		}

		@Override
		public void setValue(PartyIdentification116 obj, OrganisationIdentification28 value) {
			obj.setPartyIdentification(value);
		}
	};
	@XmlElement(name = "LglOrg")
	protected LegalOrganisation1 legalOrganisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LegalOrganisation1
	 * LegalOrganisation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification116
	 * PartyIdentification116}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglOrg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalOrganisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier and name of an organisation that is allocated by an institution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentification116, Optional<LegalOrganisation1>> mmLegalOrganisation = new MMMessageAssociationEnd<PartyIdentification116, Optional<LegalOrganisation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentification116.mmObject();
			isDerived = false;
			xmlTag = "LglOrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalOrganisation";
			definition = "Identifier and name of an organisation that is allocated by an institution.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LegalOrganisation1.mmObject();
		}

		@Override
		public Optional<LegalOrganisation1> getValue(PartyIdentification116 obj) {
			return obj.getLegalOrganisation();
		}

		@Override
		public void setValue(PartyIdentification116 obj, Optional<LegalOrganisation1> value) {
			obj.setLegalOrganisation(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxPty")
	protected TaxParty1 taxParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxParty1 TaxParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification116
	 * PartyIdentification116}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TaxParty."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentification116, Optional<TaxParty1>> mmTaxParty = new MMMessageAssociationEnd<PartyIdentification116, Optional<TaxParty1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentification116.mmObject();
			isDerived = false;
			xmlTag = "TaxPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxParty";
			definition = "TaxParty.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxParty1.mmObject();
		}

		@Override
		public Optional<TaxParty1> getValue(PartyIdentification116 obj) {
			return obj.getTaxParty();
		}

		@Override
		public void setValue(PartyIdentification116 obj, Optional<TaxParty1> value) {
			obj.setTaxParty(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyIdentification116.mmPartyIdentification, com.tools20022.repository.msg.PartyIdentification116.mmLegalOrganisation,
						com.tools20022.repository.msg.PartyIdentification116.mmTaxParty);
				trace_lazy = () -> SellerRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIdentification116";
				definition = "Unique identification, as assigned by an organisation, to unambiguously identify a party.";
			}
		});
		return mmObject_lazy.get();
	}

	public OrganisationIdentification28 getPartyIdentification() {
		return partyIdentification;
	}

	public PartyIdentification116 setPartyIdentification(OrganisationIdentification28 partyIdentification) {
		this.partyIdentification = Objects.requireNonNull(partyIdentification);
		return this;
	}

	public Optional<LegalOrganisation1> getLegalOrganisation() {
		return legalOrganisation == null ? Optional.empty() : Optional.of(legalOrganisation);
	}

	public PartyIdentification116 setLegalOrganisation(LegalOrganisation1 legalOrganisation) {
		this.legalOrganisation = legalOrganisation;
		return this;
	}

	public Optional<TaxParty1> getTaxParty() {
		return taxParty == null ? Optional.empty() : Optional.of(taxParty);
	}

	public PartyIdentification116 setTaxParty(TaxParty1 taxParty) {
		this.taxParty = taxParty;
		return this;
	}
}