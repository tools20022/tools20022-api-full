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
import com.tools20022.repository.choice.PartyIdentification99Choice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification49;
import com.tools20022.repository.msg.SettlementParties32;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Chain of parties involved in the settlement of a transaction, including
 * receipts and deliveries, book transfers, treasury deals, or other activities,
 * resulting in the movement of a security or amount of money from one account
 * to another.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementParties35#mmStandingSettlementParties
 * SettlementParties35.mmStandingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementParties35#mmLocalMarketIdentification
 * SettlementParties35.mmLocalMarketIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementParties35#mmRegistrationDetails
 * SettlementParties35.mmRegistrationDetails}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementParties35"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementParties35", propOrder = {"standingSettlementParties", "localMarketIdentification", "registrationDetails"})
public class SettlementParties35 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StgSttlmPties", required = true)
	protected SettlementParties32 standingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties32
	 * SettlementParties32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties35
	 * SettlementParties35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parties through which settlement is to take place."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementParties35, SettlementParties32> mmStandingSettlementParties = new MMMessageAssociationEnd<SettlementParties35, SettlementParties32>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementParties35.mmObject();
			isDerived = false;
			xmlTag = "StgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementParties";
			definition = "Parties through which settlement is to take place.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementParties32.mmObject();
		}

		@Override
		public SettlementParties32 getValue(SettlementParties35 obj) {
			return obj.getStandingSettlementParties();
		}

		@Override
		public void setValue(SettlementParties35 obj, SettlementParties32 value) {
			obj.setStandingSettlementParties(value);
		}
	};
	@XmlElement(name = "LclMktId")
	protected List<GenericIdentification49> localMarketIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification49
	 * GenericIdentification49}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties35
	 * SettlementParties35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclMktId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalMarketIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier needed for settlement purposes. This identifier could be, for example, an identifier that identifies an institution or agent at a CDS or ICSD (Depository Trust Clearing Corporation (DTC) Institution ID or DTC Agent ID). It could also be a local tax identification number or an ‘investor identification’, as mandated by local market practice."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementParties35, List<GenericIdentification49>> mmLocalMarketIdentification = new MMMessageAssociationEnd<SettlementParties35, List<GenericIdentification49>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementParties35.mmObject();
			isDerived = false;
			xmlTag = "LclMktId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalMarketIdentification";
			definition = "Identifier needed for settlement purposes. This identifier could be, for example, an identifier that identifies an institution or agent at a CDS or ICSD (Depository Trust Clearing Corporation (DTC) Institution ID or DTC Agent ID). It could also be a local tax identification number or an ‘investor identification’, as mandated by local market practice.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification49.mmObject();
		}

		@Override
		public List<GenericIdentification49> getValue(SettlementParties35 obj) {
			return obj.getLocalMarketIdentification();
		}

		@Override
		public void setValue(SettlementParties35 obj, List<GenericIdentification49> value) {
			obj.setLocalMarketIdentification(value);
		}
	};
	@XmlElement(name = "RegnDtls")
	protected PartyIdentification99Choice registrationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification99Choice
	 * PartyIdentification99Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties35
	 * SettlementParties35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Registration information required for settlement. For some markets, for example, Spain (Iberclear) registration details are mandatory and should be part of the SSI. In some cases, the name of the institution is different than what's provided in the BIC Directory. If this is the case, the name should be provided."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementParties35, Optional<PartyIdentification99Choice>> mmRegistrationDetails = new MMMessageAssociationEnd<SettlementParties35, Optional<PartyIdentification99Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementParties35.mmObject();
			isDerived = false;
			xmlTag = "RegnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDetails";
			definition = "Registration information required for settlement. For some markets, for example, Spain (Iberclear) registration details are mandatory and should be part of the SSI. In some cases, the name of the institution is different than what's provided in the BIC Directory. If this is the case, the name should be provided.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification99Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification99Choice> getValue(SettlementParties35 obj) {
			return obj.getRegistrationDetails();
		}

		@Override
		public void setValue(SettlementParties35 obj, Optional<PartyIdentification99Choice> value) {
			obj.setRegistrationDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementParties35.mmStandingSettlementParties, com.tools20022.repository.msg.SettlementParties35.mmLocalMarketIdentification,
						com.tools20022.repository.msg.SettlementParties35.mmRegistrationDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementParties35";
				definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
			}
		});
		return mmObject_lazy.get();
	}

	public SettlementParties32 getStandingSettlementParties() {
		return standingSettlementParties;
	}

	public SettlementParties35 setStandingSettlementParties(SettlementParties32 standingSettlementParties) {
		this.standingSettlementParties = Objects.requireNonNull(standingSettlementParties);
		return this;
	}

	public List<GenericIdentification49> getLocalMarketIdentification() {
		return localMarketIdentification == null ? localMarketIdentification = new ArrayList<>() : localMarketIdentification;
	}

	public SettlementParties35 setLocalMarketIdentification(List<GenericIdentification49> localMarketIdentification) {
		this.localMarketIdentification = Objects.requireNonNull(localMarketIdentification);
		return this;
	}

	public Optional<PartyIdentification99Choice> getRegistrationDetails() {
		return registrationDetails == null ? Optional.empty() : Optional.of(registrationDetails);
	}

	public SettlementParties35 setRegistrationDetails(PartyIdentification99Choice registrationDetails) {
		this.registrationDetails = registrationDetails;
		return this;
	}
}