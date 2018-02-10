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
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13#mmReceiverDetails
 * ReceivingPartiesAndAccount13.mmReceiverDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13#mmReceiversCustodianDetails
 * ReceivingPartiesAndAccount13.mmReceiversCustodianDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13#mmReceiversIntermediary1Details
 * ReceivingPartiesAndAccount13.mmReceiversIntermediary1Details}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13#mmReceiversIntermediary2Details
 * ReceivingPartiesAndAccount13.mmReceiversIntermediary2Details}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13#mmReceivingAgentDetails
 * ReceivingPartiesAndAccount13.mmReceivingAgentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13#mmSecuritiesSettlementSystem
 * ReceivingPartiesAndAccount13.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13#mmPlaceOfSettlementDetails
 * ReceivingPartiesAndAccount13.mmPlaceOfSettlementDetails}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceivingPartiesAndAccount13
 * ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversIntermediary1DetailsRule#forReceivingPartiesAndAccount13
 * ConstraintReceiversIntermediary1DetailsRule.forReceivingPartiesAndAccount13}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReceivingPartiesAndAccount13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount14
 * ReceivingPartiesAndAccount14}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount9
 * ReceivingPartiesAndAccount9}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReceivingPartiesAndAccount13", propOrder = {"receiverDetails", "receiversCustodianDetails", "receiversIntermediary1Details", "receiversIntermediary2Details", "receivingAgentDetails", "securitiesSettlementSystem",
		"placeOfSettlementDetails"})
public class ReceivingPartiesAndAccount13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RcvrDtls")
	protected InvestmentAccount55 receiverDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount55
	 * InvestmentAccount55}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13
	 * ReceivingPartiesAndAccount13}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount9#mmReceiverDetails
	 * ReceivingPartiesAndAccount9.mmReceiverDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReceiverDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount13.mmObject();
			isDerived = false;
			xmlTag = "RcvrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverDetails";
			definition = "Party that buys goods or services, or a financial instrument.";
			previousVersion_lazy = () -> ReceivingPartiesAndAccount9.mmReceiverDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccount55.mmObject();
		}
	};
	@XmlElement(name = "RcvrsCtdnDtls")
	protected PartyIdentificationAndAccount124 receiversCustodianDetails;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13
	 * ReceivingPartiesAndAccount13}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount14#mmReceiversCustodianDetails
	 * ReceivingPartiesAndAccount14.mmReceiversCustodianDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount9#mmReceiversCustodianDetails
	 * ReceivingPartiesAndAccount9.mmReceiversCustodianDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReceiversCustodianDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount13.mmObject();
			isDerived = false;
			xmlTag = "RcvrsCtdnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetails";
			definition = "Party that acts on behalf of the buyer of securities when the buyer does not have a direct relationship with the receiving agent.";
			nextVersions_lazy = () -> Arrays.asList(ReceivingPartiesAndAccount14.mmReceiversCustodianDetails);
			previousVersion_lazy = () -> ReceivingPartiesAndAccount9.mmReceiversCustodianDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount124.mmObject();
		}
	};
	@XmlElement(name = "RcvrsIntrmy1Dtls")
	protected PartyIdentificationAndAccount124 receiversIntermediary1Details;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13
	 * ReceivingPartiesAndAccount13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvrsIntrmy1Dtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversIntermediary1Details"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that the receiver's custodian uses to effect the receipt of a security, when the receiver's custodian does not have a direct relationship with the receiving agent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount14#mmReceiversIntermediary1Details
	 * ReceivingPartiesAndAccount14.mmReceiversIntermediary1Details}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount9#mmReceiversIntermediaryDetails
	 * ReceivingPartiesAndAccount9.mmReceiversIntermediaryDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReceiversIntermediary1Details = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount13.mmObject();
			isDerived = false;
			xmlTag = "RcvrsIntrmy1Dtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediary1Details";
			definition = "Party that the receiver's custodian uses to effect the receipt of a security, when the receiver's custodian does not have a direct relationship with the receiving agent.";
			nextVersions_lazy = () -> Arrays.asList(ReceivingPartiesAndAccount14.mmReceiversIntermediary1Details);
			previousVersion_lazy = () -> ReceivingPartiesAndAccount9.mmReceiversIntermediaryDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount124.mmObject();
		}
	};
	@XmlElement(name = "RcvrsIntrmy2Dtls")
	protected PartyIdentificationAndAccount124 receiversIntermediary2Details;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13
	 * ReceivingPartiesAndAccount13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvrsIntrmy2Dtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversIntermediary2Details"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that interacts with the receiver’s intermediary."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount14#mmReceiversIntermediary2Details
	 * ReceivingPartiesAndAccount14.mmReceiversIntermediary2Details}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReceiversIntermediary2Details = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount13.mmObject();
			isDerived = false;
			xmlTag = "RcvrsIntrmy2Dtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediary2Details";
			definition = "Party that interacts with the receiver’s intermediary.";
			nextVersions_lazy = () -> Arrays.asList(ReceivingPartiesAndAccount14.mmReceiversIntermediary2Details);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount124.mmObject();
		}
	};
	@XmlElement(name = "RcvgAgtDtls", required = true)
	protected PartyIdentificationAndAccount123 receivingAgentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount123
	 * PartyIdentificationAndAccount123}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13
	 * ReceivingPartiesAndAccount13}</li>
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
	 * "Party that receives securities from the delivering agent via the place of settlement, for example, securities central depository."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount14#mmReceivingAgentDetails
	 * ReceivingPartiesAndAccount14.mmReceivingAgentDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount9#mmReceivingAgentDetails
	 * ReceivingPartiesAndAccount9.mmReceivingAgentDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReceivingAgentDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount13.mmObject();
			isDerived = false;
			xmlTag = "RcvgAgtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingAgentDetails";
			definition = "Party that receives securities from the delivering agent via the place of settlement, for example, securities central depository.";
			nextVersions_lazy = () -> Arrays.asList(ReceivingPartiesAndAccount14.mmReceivingAgentDetails);
			previousVersion_lazy = () -> ReceivingPartiesAndAccount9.mmReceivingAgentDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount123.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13
	 * ReceivingPartiesAndAccount13}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount14#mmSecuritiesSettlementSystem
	 * ReceivingPartiesAndAccount14.mmSecuritiesSettlementSystem}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount9#mmSecuritiesSettlementSystem
	 * ReceivingPartiesAndAccount9.mmSecuritiesSettlementSystem}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesSettlementSystem = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesSettlementSystem.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount13.mmObject();
			isDerived = false;
			xmlTag = "SctiesSttlmSys";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementSystem";
			definition = "Identifies the securities settlement system to be used.";
			nextVersions_lazy = () -> Arrays.asList(ReceivingPartiesAndAccount14.mmSecuritiesSettlementSystem);
			previousVersion_lazy = () -> ReceivingPartiesAndAccount9.mmSecuritiesSettlementSystem;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "PlcOfSttlmDtls")
	protected PartyIdentification97 placeOfSettlementDetails;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13
	 * ReceivingPartiesAndAccount13}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount14#mmPlaceOfSettlementDetails
	 * ReceivingPartiesAndAccount14.mmPlaceOfSettlementDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount9#mmPlaceOfSettlementDetails
	 * ReceivingPartiesAndAccount9.mmPlaceOfSettlementDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPlaceOfSettlementDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount13.mmObject();
			isDerived = false;
			xmlTag = "PlcOfSttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfSettlementDetails";
			definition = "Place where settlement of the securities takes place.";
			nextVersions_lazy = () -> Arrays.asList(ReceivingPartiesAndAccount14.mmPlaceOfSettlementDetails);
			previousVersion_lazy = () -> ReceivingPartiesAndAccount9.mmPlaceOfSettlementDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification97.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReceivingPartiesAndAccount13.mmReceiverDetails, com.tools20022.repository.msg.ReceivingPartiesAndAccount13.mmReceiversCustodianDetails,
						com.tools20022.repository.msg.ReceivingPartiesAndAccount13.mmReceiversIntermediary1Details, com.tools20022.repository.msg.ReceivingPartiesAndAccount13.mmReceiversIntermediary2Details,
						com.tools20022.repository.msg.ReceivingPartiesAndAccount13.mmReceivingAgentDetails, com.tools20022.repository.msg.ReceivingPartiesAndAccount13.mmSecuritiesSettlementSystem,
						com.tools20022.repository.msg.ReceivingPartiesAndAccount13.mmPlaceOfSettlementDetails);
				trace_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount13,
						com.tools20022.repository.constraints.ConstraintReceiversIntermediary1DetailsRule.forReceivingPartiesAndAccount13);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReceivingPartiesAndAccount13";
				definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
				nextVersions_lazy = () -> Arrays.asList(ReceivingPartiesAndAccount14.mmObject());
				previousVersion_lazy = () -> ReceivingPartiesAndAccount9.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<InvestmentAccount55> getReceiverDetails() {
		return receiverDetails == null ? Optional.empty() : Optional.of(receiverDetails);
	}

	public ReceivingPartiesAndAccount13 setReceiverDetails(com.tools20022.repository.msg.InvestmentAccount55 receiverDetails) {
		this.receiverDetails = receiverDetails;
		return this;
	}

	public Optional<PartyIdentificationAndAccount124> getReceiversCustodianDetails() {
		return receiversCustodianDetails == null ? Optional.empty() : Optional.of(receiversCustodianDetails);
	}

	public ReceivingPartiesAndAccount13 setReceiversCustodianDetails(com.tools20022.repository.msg.PartyIdentificationAndAccount124 receiversCustodianDetails) {
		this.receiversCustodianDetails = receiversCustodianDetails;
		return this;
	}

	public Optional<PartyIdentificationAndAccount124> getReceiversIntermediary1Details() {
		return receiversIntermediary1Details == null ? Optional.empty() : Optional.of(receiversIntermediary1Details);
	}

	public ReceivingPartiesAndAccount13 setReceiversIntermediary1Details(com.tools20022.repository.msg.PartyIdentificationAndAccount124 receiversIntermediary1Details) {
		this.receiversIntermediary1Details = receiversIntermediary1Details;
		return this;
	}

	public Optional<PartyIdentificationAndAccount124> getReceiversIntermediary2Details() {
		return receiversIntermediary2Details == null ? Optional.empty() : Optional.of(receiversIntermediary2Details);
	}

	public ReceivingPartiesAndAccount13 setReceiversIntermediary2Details(com.tools20022.repository.msg.PartyIdentificationAndAccount124 receiversIntermediary2Details) {
		this.receiversIntermediary2Details = receiversIntermediary2Details;
		return this;
	}

	public PartyIdentificationAndAccount123 getReceivingAgentDetails() {
		return receivingAgentDetails;
	}

	public ReceivingPartiesAndAccount13 setReceivingAgentDetails(com.tools20022.repository.msg.PartyIdentificationAndAccount123 receivingAgentDetails) {
		this.receivingAgentDetails = Objects.requireNonNull(receivingAgentDetails);
		return this;
	}

	public Optional<Max35Text> getSecuritiesSettlementSystem() {
		return securitiesSettlementSystem == null ? Optional.empty() : Optional.of(securitiesSettlementSystem);
	}

	public ReceivingPartiesAndAccount13 setSecuritiesSettlementSystem(Max35Text securitiesSettlementSystem) {
		this.securitiesSettlementSystem = securitiesSettlementSystem;
		return this;
	}

	public Optional<PartyIdentification97> getPlaceOfSettlementDetails() {
		return placeOfSettlementDetails == null ? Optional.empty() : Optional.of(placeOfSettlementDetails);
	}

	public ReceivingPartiesAndAccount13 setPlaceOfSettlementDetails(com.tools20022.repository.msg.PartyIdentification97 placeOfSettlementDetails) {
		this.placeOfSettlementDetails = placeOfSettlementDetails;
		return this;
	}
}