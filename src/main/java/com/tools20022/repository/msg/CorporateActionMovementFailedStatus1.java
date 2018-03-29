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
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.CorporateActionStatus;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FailedMovement1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the failure of the settlement of a movement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementFailedStatus1#mmAgentAccountIdentification
 * CorporateActionMovementFailedStatus1.mmAgentAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementFailedStatus1#mmClientAccountIdentification
 * CorporateActionMovementFailedStatus1.mmClientAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementFailedStatus1#mmAccountOwnerIdentification
 * CorporateActionMovementFailedStatus1.mmAccountOwnerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementFailedStatus1#mmResourceDetails
 * CorporateActionMovementFailedStatus1.mmResourceDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionStatus
 * CorporateActionStatus}</li>
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
 * "CorporateActionMovementFailedStatus1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about the failure of the settlement of a movement."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionMovementFailedStatus1", propOrder = {"agentAccountIdentification", "clientAccountIdentification", "accountOwnerIdentification", "resourceDetails"})
public class CorporateActionMovementFailedStatus1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AgtAcctId", required = true)
	protected Max35Text agentAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementFailedStatus1
	 * CorporateActionMovementFailedStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the agent account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionMovementFailedStatus1, Max35Text> mmAgentAccountIdentification = new MMMessageAttribute<CorporateActionMovementFailedStatus1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementFailedStatus1.mmObject();
			isDerived = false;
			xmlTag = "AgtAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentAccountIdentification";
			definition = "Identification of the agent account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CorporateActionMovementFailedStatus1 obj) {
			return obj.getAgentAccountIdentification();
		}

		@Override
		public void setValue(CorporateActionMovementFailedStatus1 obj, Max35Text value) {
			obj.setAgentAccountIdentification(value);
		}
	};
	@XmlElement(name = "ClntAcctId")
	protected Max35Text clientAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementFailedStatus1
	 * CorporateActionMovementFailedStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the client account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionMovementFailedStatus1, Optional<Max35Text>> mmClientAccountIdentification = new MMMessageAttribute<CorporateActionMovementFailedStatus1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementFailedStatus1.mmObject();
			isDerived = false;
			xmlTag = "ClntAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientAccountIdentification";
			definition = "Identification of the client account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CorporateActionMovementFailedStatus1 obj) {
			return obj.getClientAccountIdentification();
		}

		@Override
		public void setValue(CorporateActionMovementFailedStatus1 obj, Optional<Max35Text> value) {
			obj.setClientAccountIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctOwnrId")
	protected PartyIdentification2Choice accountOwnerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementFailedStatus1
	 * CorporateActionMovementFailedStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the party that owns the client account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionMovementFailedStatus1, Optional<PartyIdentification2Choice>> mmAccountOwnerIdentification = new MMMessageAttribute<CorporateActionMovementFailedStatus1, Optional<PartyIdentification2Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementFailedStatus1.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerIdentification";
			definition = "Identification of the party that owns the client account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification2Choice> getValue(CorporateActionMovementFailedStatus1 obj) {
			return obj.getAccountOwnerIdentification();
		}

		@Override
		public void setValue(CorporateActionMovementFailedStatus1 obj, Optional<PartyIdentification2Choice> value) {
			obj.setAccountOwnerIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "RsrcDtls", required = true)
	protected List<FailedMovement1> resourceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FailedMovement1
	 * FailedMovement1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementFailedStatus1
	 * CorporateActionMovementFailedStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsrcDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResourceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the resource movement that failed and the reason of the failure."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionMovementFailedStatus1, List<FailedMovement1>> mmResourceDetails = new MMMessageAssociationEnd<CorporateActionMovementFailedStatus1, List<FailedMovement1>>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementFailedStatus1.mmObject();
			isDerived = false;
			xmlTag = "RsrcDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResourceDetails";
			definition = "Provides information about the resource movement that failed and the reason of the failure.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FailedMovement1.mmObject();
		}

		@Override
		public List<FailedMovement1> getValue(CorporateActionMovementFailedStatus1 obj) {
			return obj.getResourceDetails();
		}

		@Override
		public void setValue(CorporateActionMovementFailedStatus1 obj, List<FailedMovement1> value) {
			obj.setResourceDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionMovementFailedStatus1.mmAgentAccountIdentification,
						com.tools20022.repository.msg.CorporateActionMovementFailedStatus1.mmClientAccountIdentification, com.tools20022.repository.msg.CorporateActionMovementFailedStatus1.mmAccountOwnerIdentification,
						com.tools20022.repository.msg.CorporateActionMovementFailedStatus1.mmResourceDetails);
				trace_lazy = () -> CorporateActionStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionMovementFailedStatus1";
				definition = "Provides information about the failure of the settlement of a movement.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getAgentAccountIdentification() {
		return agentAccountIdentification;
	}

	public CorporateActionMovementFailedStatus1 setAgentAccountIdentification(Max35Text agentAccountIdentification) {
		this.agentAccountIdentification = Objects.requireNonNull(agentAccountIdentification);
		return this;
	}

	public Optional<Max35Text> getClientAccountIdentification() {
		return clientAccountIdentification == null ? Optional.empty() : Optional.of(clientAccountIdentification);
	}

	public CorporateActionMovementFailedStatus1 setClientAccountIdentification(Max35Text clientAccountIdentification) {
		this.clientAccountIdentification = clientAccountIdentification;
		return this;
	}

	public Optional<PartyIdentification2Choice> getAccountOwnerIdentification() {
		return accountOwnerIdentification == null ? Optional.empty() : Optional.of(accountOwnerIdentification);
	}

	public CorporateActionMovementFailedStatus1 setAccountOwnerIdentification(PartyIdentification2Choice accountOwnerIdentification) {
		this.accountOwnerIdentification = accountOwnerIdentification;
		return this;
	}

	public List<FailedMovement1> getResourceDetails() {
		return resourceDetails == null ? resourceDetails = new ArrayList<>() : resourceDetails;
	}

	public CorporateActionMovementFailedStatus1 setResourceDetails(List<FailedMovement1> resourceDetails) {
		this.resourceDetails = Objects.requireNonNull(resourceDetails);
		return this;
	}
}