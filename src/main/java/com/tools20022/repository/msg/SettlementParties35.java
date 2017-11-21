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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SettlementParties35", propOrder = {"standingSettlementParties", "localMarketIdentification", "registrationDetails"})
public class SettlementParties35 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SettlementParties32 standingSettlementParties;
	/**
	 * Parties through which settlement is to take place.
	 * <p>
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
	public static final MMMessageAssociationEnd mmStandingSettlementParties = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SettlementParties35.mmObject();
			isDerived = false;
			xmlTag = "StgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementParties";
			definition = "Parties through which settlement is to take place.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementParties32.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.GenericIdentification49> localMarketIdentification;
	/**
	 * Identifier needed for settlement purposes. This identifier could be, for
	 * example, an identifier that identifies an institution or agent at a CDS
	 * or ICSD (Depository Trust Clearing Corporation (DTC) Institution ID or
	 * DTC Agent ID). It could also be a local tax identification number or an
	 * ‘investor identification’, as mandated by local market practice.
	 * <p>
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
	public static final MMMessageAssociationEnd mmLocalMarketIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SettlementParties35.mmObject();
			isDerived = false;
			xmlTag = "LclMktId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalMarketIdentification";
			definition = "Identifier needed for settlement purposes. This identifier could be, for example, an identifier that identifies an institution or agent at a CDS or ICSD (Depository Trust Clearing Corporation (DTC) Institution ID or DTC Agent ID). It could also be a local tax identification number or an ‘investor identification’, as mandated by local market practice.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification49.mmObject();
		}
	};
	protected PartyIdentification99Choice registrationDetails;
	/**
	 * Registration information required for settlement. For some markets, for
	 * example, Spain (Iberclear) registration details are mandatory and should
	 * be part of the SSI. In some cases, the name of the institution is
	 * different than what's provided in the BIC Directory. If this is the case,
	 * the name should be provided.
	 * <p>
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
	public static final MMMessageAssociationEnd mmRegistrationDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SettlementParties35.mmObject();
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
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SettlementParties35.mmStandingSettlementParties, SettlementParties35.mmLocalMarketIdentification, SettlementParties35.mmRegistrationDetails);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementParties35";
				definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "StgSttlmPties", required = true)
	public SettlementParties32 getStandingSettlementParties() {
		return standingSettlementParties;
	}

	public void setStandingSettlementParties(com.tools20022.repository.msg.SettlementParties32 standingSettlementParties) {
		this.standingSettlementParties = standingSettlementParties;
	}

	@XmlElement(name = "LclMktId")
	public List<GenericIdentification49> getLocalMarketIdentification() {
		return localMarketIdentification;
	}

	public void setLocalMarketIdentification(List<com.tools20022.repository.msg.GenericIdentification49> localMarketIdentification) {
		this.localMarketIdentification = localMarketIdentification;
	}

	@XmlElement(name = "RegnDtls")
	public PartyIdentification99Choice getRegistrationDetails() {
		return registrationDetails;
	}

	public void setRegistrationDetails(PartyIdentification99Choice registrationDetails) {
		this.registrationDetails = registrationDetails;
	}
}