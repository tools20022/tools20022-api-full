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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionMovementFailedStatus1", propOrder = {"agentAccountIdentification", "clientAccountIdentification", "accountOwnerIdentification", "resourceDetails"})
public class CorporateActionMovementFailedStatus1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text agentAccountIdentification;
	/**
	 * Identification of the agent account.
	 * <p>
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
	public static final MMMessageAttribute mmAgentAccountIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> CorporateActionMovementFailedStatus1.mmObject();
			isDerived = false;
			xmlTag = "AgtAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentAccountIdentification";
			definition = "Identification of the agent account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text clientAccountIdentification;
	/**
	 * Identification of the client account.
	 * <p>
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
	public static final MMMessageAttribute mmClientAccountIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> CorporateActionMovementFailedStatus1.mmObject();
			isDerived = false;
			xmlTag = "ClntAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientAccountIdentification";
			definition = "Identification of the client account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PartyIdentification2Choice accountOwnerIdentification;
	/**
	 * Identification of the party that owns the client account.
	 * <p>
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
	public static final MMMessageAttribute mmAccountOwnerIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> CorporateActionMovementFailedStatus1.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerIdentification";
			definition = "Identification of the party that owns the client account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.FailedMovement1> resourceDetails;
	/**
	 * Provides information about the resource movement that failed and the
	 * reason of the failure.
	 * <p>
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
	public static final MMMessageAssociationEnd mmResourceDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatus.mmObject();
			componentContext_lazy = () -> CorporateActionMovementFailedStatus1.mmObject();
			isDerived = false;
			xmlTag = "RsrcDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResourceDetails";
			definition = "Provides information about the resource movement that failed and the reason of the failure.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FailedMovement1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionMovementFailedStatus1.mmAgentAccountIdentification, CorporateActionMovementFailedStatus1.mmClientAccountIdentification,
						CorporateActionMovementFailedStatus1.mmAccountOwnerIdentification, CorporateActionMovementFailedStatus1.mmResourceDetails);
				trace_lazy = () -> CorporateActionStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionMovementFailedStatus1";
				definition = "Provides information about the failure of the settlement of a movement.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AgtAcctId", required = true)
	public Max35Text getAgentAccountIdentification() {
		return agentAccountIdentification;
	}

	public void setAgentAccountIdentification(Max35Text agentAccountIdentification) {
		this.agentAccountIdentification = agentAccountIdentification;
	}

	@XmlElement(name = "ClntAcctId")
	public Max35Text getClientAccountIdentification() {
		return clientAccountIdentification;
	}

	public void setClientAccountIdentification(Max35Text clientAccountIdentification) {
		this.clientAccountIdentification = clientAccountIdentification;
	}

	@XmlElement(name = "AcctOwnrId")
	public PartyIdentification2Choice getAccountOwnerIdentification() {
		return accountOwnerIdentification;
	}

	public void setAccountOwnerIdentification(PartyIdentification2Choice accountOwnerIdentification) {
		this.accountOwnerIdentification = accountOwnerIdentification;
	}

	@XmlElement(name = "RsrcDtls", required = true)
	public List<FailedMovement1> getResourceDetails() {
		return resourceDetails;
	}

	public void setResourceDetails(List<com.tools20022.repository.msg.FailedMovement1> resourceDetails) {
		this.resourceDetails = resourceDetails;
	}
}