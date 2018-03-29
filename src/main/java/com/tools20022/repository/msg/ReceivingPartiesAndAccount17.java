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
import com.tools20022.repository.msg.InvestmentAccount65;
import com.tools20022.repository.msg.PartyIdentification123;
import com.tools20022.repository.msg.PartyIdentificationAndAccount157;
import com.tools20022.repository.msg.PartyIdentificationAndAccount158;
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
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount17#mmReceiverDetails
 * ReceivingPartiesAndAccount17.mmReceiverDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount17#mmReceiversCustodianDetails
 * ReceivingPartiesAndAccount17.mmReceiversCustodianDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount17#mmReceiversIntermediary1Details
 * ReceivingPartiesAndAccount17.mmReceiversIntermediary1Details}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount17#mmReceiversIntermediary2Details
 * ReceivingPartiesAndAccount17.mmReceiversIntermediary2Details}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount17#mmReceivingAgentDetails
 * ReceivingPartiesAndAccount17.mmReceivingAgentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount17#mmSecuritiesSettlementSystem
 * ReceivingPartiesAndAccount17.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount17#mmPlaceOfSettlementDetails
 * ReceivingPartiesAndAccount17.mmPlaceOfSettlementDetails}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceivingPartiesAndAccount17
 * ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversIntermediary1DetailsRule#forReceivingPartiesAndAccount17
 * ConstraintReceiversIntermediary1DetailsRule.forReceivingPartiesAndAccount17}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReceivingPartiesAndAccount17"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13
 * ReceivingPartiesAndAccount13}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReceivingPartiesAndAccount17", propOrder = {"receiverDetails", "receiversCustodianDetails", "receiversIntermediary1Details", "receiversIntermediary2Details", "receivingAgentDetails", "securitiesSettlementSystem",
		"placeOfSettlementDetails"})
public class ReceivingPartiesAndAccount17 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RcvrDtls")
	protected InvestmentAccount65 receiverDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount65
	 * InvestmentAccount65}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount17
	 * ReceivingPartiesAndAccount17}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13#mmReceiverDetails
	 * ReceivingPartiesAndAccount13.mmReceiverDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReceivingPartiesAndAccount17, Optional<InvestmentAccount65>> mmReceiverDetails = new MMMessageAssociationEnd<ReceivingPartiesAndAccount17, Optional<InvestmentAccount65>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount17.mmObject();
			isDerived = false;
			xmlTag = "RcvrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverDetails";
			definition = "Party that buys goods or services, or a financial instrument.";
			previousVersion_lazy = () -> ReceivingPartiesAndAccount13.mmReceiverDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccount65.mmObject();
		}

		@Override
		public Optional<InvestmentAccount65> getValue(ReceivingPartiesAndAccount17 obj) {
			return obj.getReceiverDetails();
		}

		@Override
		public void setValue(ReceivingPartiesAndAccount17 obj, Optional<InvestmentAccount65> value) {
			obj.setReceiverDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvrsCtdnDtls")
	protected PartyIdentificationAndAccount157 receiversCustodianDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount157
	 * PartyIdentificationAndAccount157}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount17
	 * ReceivingPartiesAndAccount17}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13#mmReceiversCustodianDetails
	 * ReceivingPartiesAndAccount13.mmReceiversCustodianDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReceivingPartiesAndAccount17, Optional<PartyIdentificationAndAccount157>> mmReceiversCustodianDetails = new MMMessageAssociationEnd<ReceivingPartiesAndAccount17, Optional<PartyIdentificationAndAccount157>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount17.mmObject();
			isDerived = false;
			xmlTag = "RcvrsCtdnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetails";
			definition = "Party that acts on behalf of the buyer of securities when the buyer does not have a direct relationship with the receiving agent.";
			previousVersion_lazy = () -> ReceivingPartiesAndAccount13.mmReceiversCustodianDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount157.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount157> getValue(ReceivingPartiesAndAccount17 obj) {
			return obj.getReceiversCustodianDetails();
		}

		@Override
		public void setValue(ReceivingPartiesAndAccount17 obj, Optional<PartyIdentificationAndAccount157> value) {
			obj.setReceiversCustodianDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvrsIntrmy1Dtls")
	protected PartyIdentificationAndAccount157 receiversIntermediary1Details;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount157
	 * PartyIdentificationAndAccount157}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount17
	 * ReceivingPartiesAndAccount17}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13#mmReceiversIntermediary1Details
	 * ReceivingPartiesAndAccount13.mmReceiversIntermediary1Details}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReceivingPartiesAndAccount17, Optional<PartyIdentificationAndAccount157>> mmReceiversIntermediary1Details = new MMMessageAssociationEnd<ReceivingPartiesAndAccount17, Optional<PartyIdentificationAndAccount157>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount17.mmObject();
			isDerived = false;
			xmlTag = "RcvrsIntrmy1Dtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediary1Details";
			definition = "Party that the receiver's custodian uses to effect the receipt of a security, when the receiver's custodian does not have a direct relationship with the receiving agent.";
			previousVersion_lazy = () -> ReceivingPartiesAndAccount13.mmReceiversIntermediary1Details;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount157.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount157> getValue(ReceivingPartiesAndAccount17 obj) {
			return obj.getReceiversIntermediary1Details();
		}

		@Override
		public void setValue(ReceivingPartiesAndAccount17 obj, Optional<PartyIdentificationAndAccount157> value) {
			obj.setReceiversIntermediary1Details(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvrsIntrmy2Dtls")
	protected PartyIdentificationAndAccount157 receiversIntermediary2Details;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount157
	 * PartyIdentificationAndAccount157}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount17
	 * ReceivingPartiesAndAccount17}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13#mmReceiversIntermediary2Details
	 * ReceivingPartiesAndAccount13.mmReceiversIntermediary2Details}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReceivingPartiesAndAccount17, Optional<PartyIdentificationAndAccount157>> mmReceiversIntermediary2Details = new MMMessageAssociationEnd<ReceivingPartiesAndAccount17, Optional<PartyIdentificationAndAccount157>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount17.mmObject();
			isDerived = false;
			xmlTag = "RcvrsIntrmy2Dtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediary2Details";
			definition = "Party that interacts with the receiver’s intermediary.";
			previousVersion_lazy = () -> ReceivingPartiesAndAccount13.mmReceiversIntermediary2Details;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount157.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount157> getValue(ReceivingPartiesAndAccount17 obj) {
			return obj.getReceiversIntermediary2Details();
		}

		@Override
		public void setValue(ReceivingPartiesAndAccount17 obj, Optional<PartyIdentificationAndAccount157> value) {
			obj.setReceiversIntermediary2Details(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvgAgtDtls", required = true)
	protected PartyIdentificationAndAccount158 receivingAgentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount158
	 * PartyIdentificationAndAccount158}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount17
	 * ReceivingPartiesAndAccount17}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13#mmReceivingAgentDetails
	 * ReceivingPartiesAndAccount13.mmReceivingAgentDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReceivingPartiesAndAccount17, PartyIdentificationAndAccount158> mmReceivingAgentDetails = new MMMessageAssociationEnd<ReceivingPartiesAndAccount17, PartyIdentificationAndAccount158>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount17.mmObject();
			isDerived = false;
			xmlTag = "RcvgAgtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingAgentDetails";
			definition = "Party that receives securities from the delivering agent via the place of settlement, for example, securities central depository.";
			previousVersion_lazy = () -> ReceivingPartiesAndAccount13.mmReceivingAgentDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount158.mmObject();
		}

		@Override
		public PartyIdentificationAndAccount158 getValue(ReceivingPartiesAndAccount17 obj) {
			return obj.getReceivingAgentDetails();
		}

		@Override
		public void setValue(ReceivingPartiesAndAccount17 obj, PartyIdentificationAndAccount158 value) {
			obj.setReceivingAgentDetails(value);
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
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount17
	 * ReceivingPartiesAndAccount17}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13#mmSecuritiesSettlementSystem
	 * ReceivingPartiesAndAccount13.mmSecuritiesSettlementSystem}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReceivingPartiesAndAccount17, Optional<Max35Text>> mmSecuritiesSettlementSystem = new MMMessageAttribute<ReceivingPartiesAndAccount17, Optional<Max35Text>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesSettlementSystem.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount17.mmObject();
			isDerived = false;
			xmlTag = "SctiesSttlmSys";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementSystem";
			definition = "Identifies the securities settlement system to be used.";
			previousVersion_lazy = () -> ReceivingPartiesAndAccount13.mmSecuritiesSettlementSystem;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ReceivingPartiesAndAccount17 obj) {
			return obj.getSecuritiesSettlementSystem();
		}

		@Override
		public void setValue(ReceivingPartiesAndAccount17 obj, Optional<Max35Text> value) {
			obj.setSecuritiesSettlementSystem(value.orElse(null));
		}
	};
	@XmlElement(name = "PlcOfSttlmDtls")
	protected PartyIdentification123 placeOfSettlementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification123
	 * PartyIdentification123}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount17
	 * ReceivingPartiesAndAccount17}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13#mmPlaceOfSettlementDetails
	 * ReceivingPartiesAndAccount13.mmPlaceOfSettlementDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReceivingPartiesAndAccount17, Optional<PartyIdentification123>> mmPlaceOfSettlementDetails = new MMMessageAssociationEnd<ReceivingPartiesAndAccount17, Optional<PartyIdentification123>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount17.mmObject();
			isDerived = false;
			xmlTag = "PlcOfSttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfSettlementDetails";
			definition = "Place where settlement of the securities takes place.";
			previousVersion_lazy = () -> ReceivingPartiesAndAccount13.mmPlaceOfSettlementDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification123.mmObject();
		}

		@Override
		public Optional<PartyIdentification123> getValue(ReceivingPartiesAndAccount17 obj) {
			return obj.getPlaceOfSettlementDetails();
		}

		@Override
		public void setValue(ReceivingPartiesAndAccount17 obj, Optional<PartyIdentification123> value) {
			obj.setPlaceOfSettlementDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReceivingPartiesAndAccount17.mmReceiverDetails, com.tools20022.repository.msg.ReceivingPartiesAndAccount17.mmReceiversCustodianDetails,
						com.tools20022.repository.msg.ReceivingPartiesAndAccount17.mmReceiversIntermediary1Details, com.tools20022.repository.msg.ReceivingPartiesAndAccount17.mmReceiversIntermediary2Details,
						com.tools20022.repository.msg.ReceivingPartiesAndAccount17.mmReceivingAgentDetails, com.tools20022.repository.msg.ReceivingPartiesAndAccount17.mmSecuritiesSettlementSystem,
						com.tools20022.repository.msg.ReceivingPartiesAndAccount17.mmPlaceOfSettlementDetails);
				trace_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount17,
						com.tools20022.repository.constraints.ConstraintReceiversIntermediary1DetailsRule.forReceivingPartiesAndAccount17);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReceivingPartiesAndAccount17";
				definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
				previousVersion_lazy = () -> ReceivingPartiesAndAccount13.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<InvestmentAccount65> getReceiverDetails() {
		return receiverDetails == null ? Optional.empty() : Optional.of(receiverDetails);
	}

	public ReceivingPartiesAndAccount17 setReceiverDetails(InvestmentAccount65 receiverDetails) {
		this.receiverDetails = receiverDetails;
		return this;
	}

	public Optional<PartyIdentificationAndAccount157> getReceiversCustodianDetails() {
		return receiversCustodianDetails == null ? Optional.empty() : Optional.of(receiversCustodianDetails);
	}

	public ReceivingPartiesAndAccount17 setReceiversCustodianDetails(PartyIdentificationAndAccount157 receiversCustodianDetails) {
		this.receiversCustodianDetails = receiversCustodianDetails;
		return this;
	}

	public Optional<PartyIdentificationAndAccount157> getReceiversIntermediary1Details() {
		return receiversIntermediary1Details == null ? Optional.empty() : Optional.of(receiversIntermediary1Details);
	}

	public ReceivingPartiesAndAccount17 setReceiversIntermediary1Details(PartyIdentificationAndAccount157 receiversIntermediary1Details) {
		this.receiversIntermediary1Details = receiversIntermediary1Details;
		return this;
	}

	public Optional<PartyIdentificationAndAccount157> getReceiversIntermediary2Details() {
		return receiversIntermediary2Details == null ? Optional.empty() : Optional.of(receiversIntermediary2Details);
	}

	public ReceivingPartiesAndAccount17 setReceiversIntermediary2Details(PartyIdentificationAndAccount157 receiversIntermediary2Details) {
		this.receiversIntermediary2Details = receiversIntermediary2Details;
		return this;
	}

	public PartyIdentificationAndAccount158 getReceivingAgentDetails() {
		return receivingAgentDetails;
	}

	public ReceivingPartiesAndAccount17 setReceivingAgentDetails(PartyIdentificationAndAccount158 receivingAgentDetails) {
		this.receivingAgentDetails = Objects.requireNonNull(receivingAgentDetails);
		return this;
	}

	public Optional<Max35Text> getSecuritiesSettlementSystem() {
		return securitiesSettlementSystem == null ? Optional.empty() : Optional.of(securitiesSettlementSystem);
	}

	public ReceivingPartiesAndAccount17 setSecuritiesSettlementSystem(Max35Text securitiesSettlementSystem) {
		this.securitiesSettlementSystem = securitiesSettlementSystem;
		return this;
	}

	public Optional<PartyIdentification123> getPlaceOfSettlementDetails() {
		return placeOfSettlementDetails == null ? Optional.empty() : Optional.of(placeOfSettlementDetails);
	}

	public ReceivingPartiesAndAccount17 setPlaceOfSettlementDetails(PartyIdentification123 placeOfSettlementDetails) {
		this.placeOfSettlementDetails = placeOfSettlementDetails;
		return this;
	}
}