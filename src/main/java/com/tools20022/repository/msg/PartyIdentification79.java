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
import com.tools20022.repository.choice.PersonOrOrganisation2Choice;
import com.tools20022.repository.entity.AccountOwnerRole;
import com.tools20022.repository.entity.BuyerRole;
import com.tools20022.repository.entity.RolePlayer;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification76;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to identify an account owner and the associated decision
 * maker.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification79#mmAccountOwner
 * PartyIdentification79.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification79#mmDecisionMaker
 * PartyIdentification79.mmDecisionMaker}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RolePlayer RolePlayer}</li>
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
 * "PartyIdentification79"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to identify an account owner and the associated decision maker."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PartyIdentification76
 * PartyIdentification76}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyIdentification79", propOrder = {"accountOwner", "decisionMaker"})
public class PartyIdentification79 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctOwnr", required = true)
	protected List<PartyIdentification76> accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification76
	 * PartyIdentification76}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountOwnerRole
	 * AccountOwnerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification79
	 * PartyIdentification79}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the account which is used to acquire or sell financial instruments."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentification79, List<PartyIdentification76>> mmAccountOwner = new MMMessageAssociationEnd<PartyIdentification79, List<PartyIdentification76>>() {
		{
			businessComponentTrace_lazy = () -> AccountOwnerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentification79.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Identifies the account which is used to acquire or sell financial instruments.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification76.mmObject();
		}

		@Override
		public List<PartyIdentification76> getValue(PartyIdentification79 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(PartyIdentification79 obj, List<PartyIdentification76> value) {
			obj.setAccountOwner(value);
		}
	};
	@XmlElement(name = "DcsnMakr")
	protected List<PersonOrOrganisation2Choice> decisionMaker;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation2Choice
	 * PersonOrOrganisation2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BuyerRole BuyerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification79
	 * PartyIdentification79}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DcsnMakr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DecisionMaker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the person who makes the decision on the financial instrument, acquire in case the of a buyer or to sell in case of the seller."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentification79, List<PersonOrOrganisation2Choice>> mmDecisionMaker = new MMMessageAssociationEnd<PartyIdentification79, List<PersonOrOrganisation2Choice>>() {
		{
			businessComponentTrace_lazy = () -> BuyerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentification79.mmObject();
			isDerived = false;
			xmlTag = "DcsnMakr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DecisionMaker";
			definition = "Identifies the person who makes the decision on the financial instrument, acquire in case the of a buyer or to sell in case of the seller.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PersonOrOrganisation2Choice.mmObject();
		}

		@Override
		public List<PersonOrOrganisation2Choice> getValue(PartyIdentification79 obj) {
			return obj.getDecisionMaker();
		}

		@Override
		public void setValue(PartyIdentification79 obj, List<PersonOrOrganisation2Choice> value) {
			obj.setDecisionMaker(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyIdentification79.mmAccountOwner, com.tools20022.repository.msg.PartyIdentification79.mmDecisionMaker);
				trace_lazy = () -> RolePlayer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIdentification79";
				definition = "Set of elements used to identify an account owner and the associated decision maker.";
				previousVersion_lazy = () -> PartyIdentification76.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<PartyIdentification76> getAccountOwner() {
		return accountOwner == null ? accountOwner = new ArrayList<>() : accountOwner;
	}

	public PartyIdentification79 setAccountOwner(List<PartyIdentification76> accountOwner) {
		this.accountOwner = Objects.requireNonNull(accountOwner);
		return this;
	}

	public List<PersonOrOrganisation2Choice> getDecisionMaker() {
		return decisionMaker == null ? decisionMaker = new ArrayList<>() : decisionMaker;
	}

	public PartyIdentification79 setDecisionMaker(List<PersonOrOrganisation2Choice> decisionMaker) {
		this.decisionMaker = Objects.requireNonNull(decisionMaker);
		return this;
	}
}