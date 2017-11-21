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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesSettlementPartyRole;
import com.tools20022.repository.entity.SecuritiesSettlementSystem;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
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
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount14#mmDeliverersCustodianDetails
 * DeliveringPartiesAndAccount14.mmDeliverersCustodianDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount14#mmDeliverersIntermediary1Details
 * DeliveringPartiesAndAccount14.mmDeliverersIntermediary1Details}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount14#mmDeliverersIntermediary2Details
 * DeliveringPartiesAndAccount14.mmDeliverersIntermediary2Details}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount14#mmDeliveringAgentDetails
 * DeliveringPartiesAndAccount14.mmDeliveringAgentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount14#mmSecuritiesSettlementSystem
 * DeliveringPartiesAndAccount14.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount14#mmPlaceOfSettlementDetails
 * DeliveringPartiesAndAccount14.mmPlaceOfSettlementDetails}</li>
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
 * "DeliveringPartiesAndAccount14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13
 * DeliveringPartiesAndAccount13}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DeliveringPartiesAndAccount14", propOrder = {"deliverersCustodianDetails", "deliverersIntermediary1Details", "deliverersIntermediary2Details", "deliveringAgentDetails", "securitiesSettlementSystem",
		"placeOfSettlementDetails"})
public class DeliveringPartiesAndAccount14 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentificationAndAccount124 deliverersCustodianDetails;
	/**
	 * Party that acts on behalf of the seller of securities when the seller
	 * does not have a direct relationship with the delivering agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount124
	 * PartyIdentificationAndAccount124}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount14
	 * DeliveringPartiesAndAccount14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13#mmDeliverersCustodianDetails
	 * DeliveringPartiesAndAccount13.mmDeliverersCustodianDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeliverersCustodianDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> DeliveringPartiesAndAccount14.mmObject();
			isDerived = false;
			xmlTag = "DlvrrsCtdnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetails";
			definition = "Party that acts on behalf of the seller of securities when the seller does not have a direct relationship with the delivering agent.";
			previousVersion_lazy = () -> DeliveringPartiesAndAccount13.mmDeliverersCustodianDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount124.mmObject();
		}
	};
	protected PartyIdentificationAndAccount124 deliverersIntermediary1Details;
	/**
	 * Party that the deliverer's custodian uses to effect the delivery of a
	 * security, when the deliverer's custodian does not have a direct
	 * relationship with the delivering agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount124
	 * PartyIdentificationAndAccount124}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount14
	 * DeliveringPartiesAndAccount14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrrsIntrmy1Dtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersIntermediary1Details"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that the deliverer's custodian uses to effect the delivery of a security, when the deliverer's custodian does not have a direct relationship with the delivering agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13#mmDeliverersIntermediary1Details
	 * DeliveringPartiesAndAccount13.mmDeliverersIntermediary1Details}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeliverersIntermediary1Details = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> DeliveringPartiesAndAccount14.mmObject();
			isDerived = false;
			xmlTag = "DlvrrsIntrmy1Dtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediary1Details";
			definition = "Party that the deliverer's custodian uses to effect the delivery of a security, when the deliverer's custodian does not have a direct relationship with the delivering agent.";
			previousVersion_lazy = () -> DeliveringPartiesAndAccount13.mmDeliverersIntermediary1Details;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount124.mmObject();
		}
	};
	protected PartyIdentificationAndAccount124 deliverersIntermediary2Details;
	/**
	 * Party that interacts with the deliverer's intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount124
	 * PartyIdentificationAndAccount124}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount14
	 * DeliveringPartiesAndAccount14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrrsIntrmy2Dtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersIntermediary2Details"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that interacts with the deliverer's intermediary."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13#mmDeliverersIntermediary2Details
	 * DeliveringPartiesAndAccount13.mmDeliverersIntermediary2Details}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeliverersIntermediary2Details = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> DeliveringPartiesAndAccount14.mmObject();
			isDerived = false;
			xmlTag = "DlvrrsIntrmy2Dtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediary2Details";
			definition = "Party that interacts with the deliverer's intermediary.";
			previousVersion_lazy = () -> DeliveringPartiesAndAccount13.mmDeliverersIntermediary2Details;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount124.mmObject();
		}
	};
	protected PartyIdentificationAndAccount124 deliveringAgentDetails;
	/**
	 * Party that delivers securities to the receiving agent at the place of
	 * settlement, for example, central securities depository.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount124
	 * PartyIdentificationAndAccount124}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount14
	 * DeliveringPartiesAndAccount14}</li>
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
	 * "Party that delivers securities to the receiving agent at the place of settlement, for example, central securities depository."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13#mmDeliveringAgentDetails
	 * DeliveringPartiesAndAccount13.mmDeliveringAgentDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeliveringAgentDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> DeliveringPartiesAndAccount14.mmObject();
			isDerived = false;
			xmlTag = "DlvrgAgtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringAgentDetails";
			definition = "Party that delivers securities to the receiving agent at the place of settlement, for example, central securities depository.";
			previousVersion_lazy = () -> DeliveringPartiesAndAccount13.mmDeliveringAgentDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount124.mmObject();
		}
	};
	protected Max35Text securitiesSettlementSystem;
	/**
	 * Identifies the securities settlement system to be used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementSystem
	 * SecuritiesSettlementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount14
	 * DeliveringPartiesAndAccount14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSttlmSys"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the securities settlement system to be used."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13#mmSecuritiesSettlementSystem
	 * DeliveringPartiesAndAccount13.mmSecuritiesSettlementSystem}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesSettlementSystem = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesSettlementSystem.mmObject();
			componentContext_lazy = () -> DeliveringPartiesAndAccount14.mmObject();
			isDerived = false;
			xmlTag = "SctiesSttlmSys";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementSystem";
			definition = "Identifies the securities settlement system to be used.";
			previousVersion_lazy = () -> DeliveringPartiesAndAccount13.mmSecuritiesSettlementSystem;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PartyIdentification97 placeOfSettlementDetails;
	/**
	 * Place where settlement of the securities takes place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification97
	 * PartyIdentification97}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount14
	 * DeliveringPartiesAndAccount14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfSttlmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfSettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place where settlement of the securities takes place."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13#mmPlaceOfSettlementDetails
	 * DeliveringPartiesAndAccount13.mmPlaceOfSettlementDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPlaceOfSettlementDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> DeliveringPartiesAndAccount14.mmObject();
			isDerived = false;
			xmlTag = "PlcOfSttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfSettlementDetails";
			definition = "Place where settlement of the securities takes place.";
			previousVersion_lazy = () -> DeliveringPartiesAndAccount13.mmPlaceOfSettlementDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification97.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DeliveringPartiesAndAccount14.mmDeliverersCustodianDetails, DeliveringPartiesAndAccount14.mmDeliverersIntermediary1Details,
						DeliveringPartiesAndAccount14.mmDeliverersIntermediary2Details, DeliveringPartiesAndAccount14.mmDeliveringAgentDetails, DeliveringPartiesAndAccount14.mmSecuritiesSettlementSystem,
						DeliveringPartiesAndAccount14.mmPlaceOfSettlementDetails);
				trace_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeliveringPartiesAndAccount14";
				definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
				previousVersion_lazy = () -> DeliveringPartiesAndAccount13.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "DlvrrsCtdnDtls")
	public PartyIdentificationAndAccount124 getDeliverersCustodianDetails() {
		return deliverersCustodianDetails;
	}

	public void setDeliverersCustodianDetails(com.tools20022.repository.msg.PartyIdentificationAndAccount124 deliverersCustodianDetails) {
		this.deliverersCustodianDetails = deliverersCustodianDetails;
	}

	@XmlElement(name = "DlvrrsIntrmy1Dtls")
	public PartyIdentificationAndAccount124 getDeliverersIntermediary1Details() {
		return deliverersIntermediary1Details;
	}

	public void setDeliverersIntermediary1Details(com.tools20022.repository.msg.PartyIdentificationAndAccount124 deliverersIntermediary1Details) {
		this.deliverersIntermediary1Details = deliverersIntermediary1Details;
	}

	@XmlElement(name = "DlvrrsIntrmy2Dtls")
	public PartyIdentificationAndAccount124 getDeliverersIntermediary2Details() {
		return deliverersIntermediary2Details;
	}

	public void setDeliverersIntermediary2Details(com.tools20022.repository.msg.PartyIdentificationAndAccount124 deliverersIntermediary2Details) {
		this.deliverersIntermediary2Details = deliverersIntermediary2Details;
	}

	@XmlElement(name = "DlvrgAgtDtls", required = true)
	public PartyIdentificationAndAccount124 getDeliveringAgentDetails() {
		return deliveringAgentDetails;
	}

	public void setDeliveringAgentDetails(com.tools20022.repository.msg.PartyIdentificationAndAccount124 deliveringAgentDetails) {
		this.deliveringAgentDetails = deliveringAgentDetails;
	}

	@XmlElement(name = "SctiesSttlmSys")
	public Max35Text getSecuritiesSettlementSystem() {
		return securitiesSettlementSystem;
	}

	public void setSecuritiesSettlementSystem(Max35Text securitiesSettlementSystem) {
		this.securitiesSettlementSystem = securitiesSettlementSystem;
	}

	@XmlElement(name = "PlcOfSttlmDtls")
	public PartyIdentification97 getPlaceOfSettlementDetails() {
		return placeOfSettlementDetails;
	}

	public void setPlaceOfSettlementDetails(com.tools20022.repository.msg.PartyIdentification97 placeOfSettlementDetails) {
		this.placeOfSettlementDetails = placeOfSettlementDetails;
	}
}