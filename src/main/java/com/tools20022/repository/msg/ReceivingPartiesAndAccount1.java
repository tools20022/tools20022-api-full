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
import com.tools20022.repository.entity.InvestmentAccount;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesSettlementPartyRole;
import com.tools20022.repository.entity.SecuritiesSettlementSystem;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount1#mmReceiverDetails
 * ReceivingPartiesAndAccount1.mmReceiverDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount1#mmReceiversCustodianDetails
 * ReceivingPartiesAndAccount1.mmReceiversCustodianDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount1#mmReceiversIntermediaryDetails
 * ReceivingPartiesAndAccount1.mmReceiversIntermediaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount1#mmReceivingAgentDetails
 * ReceivingPartiesAndAccount1.mmReceivingAgentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount1#mmSecuritiesSettlementSystem
 * ReceivingPartiesAndAccount1.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount1#mmPlaceOfSettlementDetails
 * ReceivingPartiesAndAccount1.mmPlaceOfSettlementDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
 * SecuritiesSettlementPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceivingPartiesAndAccount1
 * ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementPlaceRule#forReceivingPartiesAndAccount1
 * ConstraintSettlementPlaceRule.forReceivingPartiesAndAccount1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReceivingPartiesAndAccount1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReceivingPartiesAndAccount1", propOrder = {"receiverDetails", "receiversCustodianDetails", "receiversIntermediaryDetails", "receivingAgentDetails", "securitiesSettlementSystem", "placeOfSettlementDetails"})
public class ReceivingPartiesAndAccount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RcvrDtls", required = true)
	protected InvestmentAccount11 receiverDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount11
	 * InvestmentAccount11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount1
	 * ReceivingPartiesAndAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiverDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that buys goods or services, or a financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReceiverDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount1.mmObject();
			isDerived = false;
			xmlTag = "RcvrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverDetails";
			definition = "Party that buys goods or services, or a financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccount11.mmObject();
		}
	};
	@XmlElement(name = "RcvrsCtdnDtls")
	protected PartyIdentificationAndAccount2 receiversCustodianDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount2
	 * PartyIdentificationAndAccount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount1
	 * ReceivingPartiesAndAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvrsCtdnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that acts on behalf of the buyer of securities when the buyer does not have a direct relationship with the receiving agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReceiversCustodianDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount1.mmObject();
			isDerived = false;
			xmlTag = "RcvrsCtdnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetails";
			definition = "Party that acts on behalf of the buyer of securities when the buyer does not have a direct relationship with the receiving agent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount2.mmObject();
		}
	};
	@XmlElement(name = "RcvrsIntrmyDtls")
	protected PartyIdentificationAndAccount2 receiversIntermediaryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount2
	 * PartyIdentificationAndAccount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount1
	 * ReceivingPartiesAndAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvrsIntrmyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversIntermediaryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that the Receiver's custodian uses to effect the receipt of a security, when the Receiver's custodian does not have a direct relationship with the Receiver agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReceiversIntermediaryDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount1.mmObject();
			isDerived = false;
			xmlTag = "RcvrsIntrmyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediaryDetails";
			definition = "Party that the Receiver's custodian uses to effect the receipt of a security, when the Receiver's custodian does not have a direct relationship with the Receiver agent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount2.mmObject();
		}
	};
	@XmlElement(name = "RcvgAgtDtls", required = true)
	protected PartyIdentificationAndAccount2 receivingAgentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount2
	 * PartyIdentificationAndAccount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount1
	 * ReceivingPartiesAndAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgAgtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingAgentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that receives securities from the delivering agent via the place of settlement, eg, securities central depository."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReceivingAgentDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount1.mmObject();
			isDerived = false;
			xmlTag = "RcvgAgtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingAgentDetails";
			definition = "Party that receives securities from the delivering agent via the place of settlement, eg, securities central depository.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount2.mmObject();
		}
	};
	@XmlElement(name = "SctiesSttlmSys")
	protected Max35Text securitiesSettlementSystem;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementSystem
	 * SecuritiesSettlementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount1
	 * ReceivingPartiesAndAccount1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesSettlementSystem = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesSettlementSystem.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount1.mmObject();
			isDerived = false;
			xmlTag = "SctiesSttlmSys";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementSystem";
			definition = "Identifies the securities settlement system to be used.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "PlcOfSttlmDtls", required = true)
	protected PartyIdentificationAndAccount2 placeOfSettlementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount2
	 * PartyIdentificationAndAccount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount1
	 * ReceivingPartiesAndAccount1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPlaceOfSettlementDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount1.mmObject();
			isDerived = false;
			xmlTag = "PlcOfSttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfSettlementDetails";
			definition = "Place where settlement of the securities takes place.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReceivingPartiesAndAccount1.mmReceiverDetails, com.tools20022.repository.msg.ReceivingPartiesAndAccount1.mmReceiversCustodianDetails,
						com.tools20022.repository.msg.ReceivingPartiesAndAccount1.mmReceiversIntermediaryDetails, com.tools20022.repository.msg.ReceivingPartiesAndAccount1.mmReceivingAgentDetails,
						com.tools20022.repository.msg.ReceivingPartiesAndAccount1.mmSecuritiesSettlementSystem, com.tools20022.repository.msg.ReceivingPartiesAndAccount1.mmPlaceOfSettlementDetails);
				trace_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount1,
						com.tools20022.repository.constraints.ConstraintSettlementPlaceRule.forReceivingPartiesAndAccount1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReceivingPartiesAndAccount1";
				definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
			}
		});
		return mmObject_lazy.get();
	}

	public InvestmentAccount11 getReceiverDetails() {
		return receiverDetails;
	}

	public ReceivingPartiesAndAccount1 setReceiverDetails(com.tools20022.repository.msg.InvestmentAccount11 receiverDetails) {
		this.receiverDetails = Objects.requireNonNull(receiverDetails);
		return this;
	}

	public Optional<PartyIdentificationAndAccount2> getReceiversCustodianDetails() {
		return receiversCustodianDetails == null ? Optional.empty() : Optional.of(receiversCustodianDetails);
	}

	public ReceivingPartiesAndAccount1 setReceiversCustodianDetails(com.tools20022.repository.msg.PartyIdentificationAndAccount2 receiversCustodianDetails) {
		this.receiversCustodianDetails = receiversCustodianDetails;
		return this;
	}

	public Optional<PartyIdentificationAndAccount2> getReceiversIntermediaryDetails() {
		return receiversIntermediaryDetails == null ? Optional.empty() : Optional.of(receiversIntermediaryDetails);
	}

	public ReceivingPartiesAndAccount1 setReceiversIntermediaryDetails(com.tools20022.repository.msg.PartyIdentificationAndAccount2 receiversIntermediaryDetails) {
		this.receiversIntermediaryDetails = receiversIntermediaryDetails;
		return this;
	}

	public PartyIdentificationAndAccount2 getReceivingAgentDetails() {
		return receivingAgentDetails;
	}

	public ReceivingPartiesAndAccount1 setReceivingAgentDetails(com.tools20022.repository.msg.PartyIdentificationAndAccount2 receivingAgentDetails) {
		this.receivingAgentDetails = Objects.requireNonNull(receivingAgentDetails);
		return this;
	}

	public Optional<Max35Text> getSecuritiesSettlementSystem() {
		return securitiesSettlementSystem == null ? Optional.empty() : Optional.of(securitiesSettlementSystem);
	}

	public ReceivingPartiesAndAccount1 setSecuritiesSettlementSystem(Max35Text securitiesSettlementSystem) {
		this.securitiesSettlementSystem = securitiesSettlementSystem;
		return this;
	}

	public PartyIdentificationAndAccount2 getPlaceOfSettlementDetails() {
		return placeOfSettlementDetails;
	}

	public ReceivingPartiesAndAccount1 setPlaceOfSettlementDetails(com.tools20022.repository.msg.PartyIdentificationAndAccount2 placeOfSettlementDetails) {
		this.placeOfSettlementDetails = Objects.requireNonNull(placeOfSettlementDetails);
		return this;
	}
}