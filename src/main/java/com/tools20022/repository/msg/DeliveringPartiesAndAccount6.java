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
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesSettlementPartyRole;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters applied to the settlement of a security transfer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount6#mmDeliverersCustodianDetails
 * DeliveringPartiesAndAccount6.mmDeliverersCustodianDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount6#mmDeliverersIntermediaryDetails
 * DeliveringPartiesAndAccount6.mmDeliverersIntermediaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount6#mmDeliveringAgentDetails
 * DeliveringPartiesAndAccount6.mmDeliveringAgentDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
 * SecuritiesSettlementPartyRole}</li>
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
 * "DeliveringPartiesAndAccount6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters applied to the settlement of a security transfer."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DeliveringPartiesAndAccount6", propOrder = {"deliverersCustodianDetails", "deliverersIntermediaryDetails", "deliveringAgentDetails"})
public class DeliveringPartiesAndAccount6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentificationAndAccount13 deliverersCustodianDetails;
	/**
	 * Party that acts on behalf of the seller of securities when the seller
	 * does not have a direct relationship with the delivering agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount13
	 * PartyIdentificationAndAccount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount6
	 * DeliveringPartiesAndAccount6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrrsCtdnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that acts on behalf of the seller of securities when the seller does not have a direct relationship with the delivering agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeliverersCustodianDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> DeliveringPartiesAndAccount6.mmObject();
			isDerived = false;
			xmlTag = "DlvrrsCtdnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetails";
			definition = "Party that acts on behalf of the seller of securities when the seller does not have a direct relationship with the delivering agent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount13.mmObject();
		}
	};
	protected PartyIdentificationAndAccount13 deliverersIntermediaryDetails;
	/**
	 * Party that the deliverer's custodian uses to effect the delivery of a
	 * security, when the deliverer's custodian does not have a direct
	 * relationship with the delivering agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount13
	 * PartyIdentificationAndAccount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount6
	 * DeliveringPartiesAndAccount6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrrsIntrmyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersIntermediaryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that the deliverer's custodian uses to effect the delivery of a security, when the deliverer's custodian does not have a direct relationship with the delivering agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeliverersIntermediaryDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> DeliveringPartiesAndAccount6.mmObject();
			isDerived = false;
			xmlTag = "DlvrrsIntrmyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediaryDetails";
			definition = "Party that the deliverer's custodian uses to effect the delivery of a security, when the deliverer's custodian does not have a direct relationship with the delivering agent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount13.mmObject();
		}
	};
	protected PartyIdentificationAndAccount13 deliveringAgentDetails;
	/**
	 * Party that delivers securities to the receiving agent at the place of
	 * settlement, eg, central securities depository.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount13
	 * PartyIdentificationAndAccount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount6
	 * DeliveringPartiesAndAccount6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgAgtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringAgentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that delivers securities to the receiving agent at the place of settlement, eg, central securities depository."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeliveringAgentDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> DeliveringPartiesAndAccount6.mmObject();
			isDerived = false;
			xmlTag = "DlvrgAgtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringAgentDetails";
			definition = "Party that delivers securities to the receiving agent at the place of settlement, eg, central securities depository.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount13.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DeliveringPartiesAndAccount6.mmDeliverersCustodianDetails, DeliveringPartiesAndAccount6.mmDeliverersIntermediaryDetails, DeliveringPartiesAndAccount6.mmDeliveringAgentDetails);
				trace_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeliveringPartiesAndAccount6";
				definition = "Parameters applied to the settlement of a security transfer.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "DlvrrsCtdnDtls")
	public PartyIdentificationAndAccount13 getDeliverersCustodianDetails() {
		return deliverersCustodianDetails;
	}

	public void setDeliverersCustodianDetails(com.tools20022.repository.msg.PartyIdentificationAndAccount13 deliverersCustodianDetails) {
		this.deliverersCustodianDetails = deliverersCustodianDetails;
	}

	@XmlElement(name = "DlvrrsIntrmyDtls")
	public PartyIdentificationAndAccount13 getDeliverersIntermediaryDetails() {
		return deliverersIntermediaryDetails;
	}

	public void setDeliverersIntermediaryDetails(com.tools20022.repository.msg.PartyIdentificationAndAccount13 deliverersIntermediaryDetails) {
		this.deliverersIntermediaryDetails = deliverersIntermediaryDetails;
	}

	@XmlElement(name = "DlvrgAgtDtls", required = true)
	public PartyIdentificationAndAccount13 getDeliveringAgentDetails() {
		return deliveringAgentDetails;
	}

	public void setDeliveringAgentDetails(com.tools20022.repository.msg.PartyIdentificationAndAccount13 deliveringAgentDetails) {
		this.deliveringAgentDetails = deliveringAgentDetails;
	}
}