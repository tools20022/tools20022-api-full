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
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.entity.TaxPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.LegalOrganisation1;
import com.tools20022.repository.msg.PartyIdentification129;
import com.tools20022.repository.msg.TaxParty3;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies an entity involved in a trade activity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeParty4#mmPartyIdentification
 * TradeParty4.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeParty4#mmLegalOrganisation
 * TradeParty4.mmLegalOrganisation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeParty4#mmTaxParty
 * TradeParty4.mmTaxParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
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
 * "TradeParty4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies an entity involved in a trade activity."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.TradeParty3
 * TradeParty3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeParty4", propOrder = {"partyIdentification", "legalOrganisation", "taxParty"})
public class TradeParty4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PtyId", required = true)
	protected PartyIdentification129 partyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification129
	 * PartyIdentification129}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeParty4 TradeParty4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeParty3#mmPartyIdentification
	 * TradeParty3.mmPartyIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeParty4, PartyIdentification129> mmPartyIdentification = new MMMessageAssociationEnd<TradeParty4, PartyIdentification129>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeParty4.mmObject();
			isDerived = false;
			xmlTag = "PtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyIdentification";
			definition = "Unique identification, as assigned by an organisation, to unambiguously identify a party.";
			previousVersion_lazy = () -> TradeParty3.mmPartyIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification129.mmObject();
		}

		@Override
		public PartyIdentification129 getValue(TradeParty4 obj) {
			return obj.getPartyIdentification();
		}

		@Override
		public void setValue(TradeParty4 obj, PartyIdentification129 value) {
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeParty4 TradeParty4}</li>
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
	 * "Legally constituted organization specified for this trade party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeParty3#mmLegalOrganisation
	 * TradeParty3.mmLegalOrganisation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeParty4, Optional<LegalOrganisation1>> mmLegalOrganisation = new MMMessageAssociationEnd<TradeParty4, Optional<LegalOrganisation1>>() {
		{
			businessComponentTrace_lazy = () -> Organisation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeParty4.mmObject();
			isDerived = false;
			xmlTag = "LglOrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalOrganisation";
			definition = "Legally constituted organization specified for this trade party.";
			previousVersion_lazy = () -> TradeParty3.mmLegalOrganisation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LegalOrganisation1.mmObject();
		}

		@Override
		public Optional<LegalOrganisation1> getValue(TradeParty4 obj) {
			return obj.getLegalOrganisation();
		}

		@Override
		public void setValue(TradeParty4 obj, Optional<LegalOrganisation1> value) {
			obj.setLegalOrganisation(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxPty")
	protected List<TaxParty3> taxParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxParty3 TaxParty3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxPartyRole TaxPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeParty4 TradeParty4}</li>
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
	 * definition} = "Entity involved in an activity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeParty3#mmTaxParty
	 * TradeParty3.mmTaxParty}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeParty4, List<TaxParty3>> mmTaxParty = new MMMessageAssociationEnd<TradeParty4, List<TaxParty3>>() {
		{
			businessComponentTrace_lazy = () -> TaxPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeParty4.mmObject();
			isDerived = false;
			xmlTag = "TaxPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxParty";
			definition = "Entity involved in an activity.";
			previousVersion_lazy = () -> TradeParty3.mmTaxParty;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxParty3.mmObject();
		}

		@Override
		public List<TaxParty3> getValue(TradeParty4 obj) {
			return obj.getTaxParty();
		}

		@Override
		public void setValue(TradeParty4 obj, List<TaxParty3> value) {
			obj.setTaxParty(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeParty4.mmPartyIdentification, com.tools20022.repository.msg.TradeParty4.mmLegalOrganisation, com.tools20022.repository.msg.TradeParty4.mmTaxParty);
				trace_lazy = () -> Role.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeParty4";
				definition = "Specifies an entity involved in a trade activity.";
				previousVersion_lazy = () -> TradeParty3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification129 getPartyIdentification() {
		return partyIdentification;
	}

	public TradeParty4 setPartyIdentification(PartyIdentification129 partyIdentification) {
		this.partyIdentification = Objects.requireNonNull(partyIdentification);
		return this;
	}

	public Optional<LegalOrganisation1> getLegalOrganisation() {
		return legalOrganisation == null ? Optional.empty() : Optional.of(legalOrganisation);
	}

	public TradeParty4 setLegalOrganisation(LegalOrganisation1 legalOrganisation) {
		this.legalOrganisation = legalOrganisation;
		return this;
	}

	public List<TaxParty3> getTaxParty() {
		return taxParty == null ? taxParty = new ArrayList<>() : taxParty;
	}

	public TradeParty4 setTaxParty(List<TaxParty3> taxParty) {
		this.taxParty = Objects.requireNonNull(taxParty);
		return this;
	}
}