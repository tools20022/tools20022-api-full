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
import com.tools20022.repository.msg.InvestmentAccount24;
import com.tools20022.repository.msg.PartyIdentification21;
import com.tools20022.repository.msg.PartyIdentificationAndAccount4;
import com.tools20022.repository.msg.PartyIdentificationAndAccount5;
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
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount8#mmReceiverDetails
 * ReceivingPartiesAndAccount8.mmReceiverDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount8#mmReceiversCustodianDetails
 * ReceivingPartiesAndAccount8.mmReceiversCustodianDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount8#mmReceiversIntermediaryDetails
 * ReceivingPartiesAndAccount8.mmReceiversIntermediaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount8#mmReceivingAgentDetails
 * ReceivingPartiesAndAccount8.mmReceivingAgentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount8#mmSecuritiesSettlementSystem
 * ReceivingPartiesAndAccount8.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount8#mmPlaceOfSettlementDetails
 * ReceivingPartiesAndAccount8.mmPlaceOfSettlementDetails}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceivingPartiesAndAccount8
 * ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount8}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReceivingPartiesAndAccount8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount9
 * ReceivingPartiesAndAccount9}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount4
 * ReceivingPartiesAndAccount4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReceivingPartiesAndAccount8", propOrder = {"receiverDetails", "receiversCustodianDetails", "receiversIntermediaryDetails", "receivingAgentDetails", "securitiesSettlementSystem", "placeOfSettlementDetails"})
public class ReceivingPartiesAndAccount8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RcvrDtls")
	protected InvestmentAccount24 receiverDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount24
	 * InvestmentAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount8
	 * ReceivingPartiesAndAccount8}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount9#mmReceiverDetails
	 * ReceivingPartiesAndAccount9.mmReceiverDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReceivingPartiesAndAccount8, Optional<InvestmentAccount24>> mmReceiverDetails = new MMMessageAssociationEnd<ReceivingPartiesAndAccount8, Optional<InvestmentAccount24>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount8.mmObject();
			isDerived = false;
			xmlTag = "RcvrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverDetails";
			definition = "Party that buys goods or services, or a financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(ReceivingPartiesAndAccount9.mmReceiverDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccount24.mmObject();
		}

		@Override
		public Optional<InvestmentAccount24> getValue(ReceivingPartiesAndAccount8 obj) {
			return obj.getReceiverDetails();
		}

		@Override
		public void setValue(ReceivingPartiesAndAccount8 obj, Optional<InvestmentAccount24> value) {
			obj.setReceiverDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvrsCtdnDtls")
	protected PartyIdentificationAndAccount5 receiversCustodianDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount5
	 * PartyIdentificationAndAccount5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount8
	 * ReceivingPartiesAndAccount8}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount9#mmReceiversCustodianDetails
	 * ReceivingPartiesAndAccount9.mmReceiversCustodianDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReceivingPartiesAndAccount8, Optional<PartyIdentificationAndAccount5>> mmReceiversCustodianDetails = new MMMessageAssociationEnd<ReceivingPartiesAndAccount8, Optional<PartyIdentificationAndAccount5>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount8.mmObject();
			isDerived = false;
			xmlTag = "RcvrsCtdnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetails";
			definition = "Party that acts on behalf of the buyer of securities when the buyer does not have a direct relationship with the receiving agent.";
			nextVersions_lazy = () -> Arrays.asList(ReceivingPartiesAndAccount9.mmReceiversCustodianDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount5.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount5> getValue(ReceivingPartiesAndAccount8 obj) {
			return obj.getReceiversCustodianDetails();
		}

		@Override
		public void setValue(ReceivingPartiesAndAccount8 obj, Optional<PartyIdentificationAndAccount5> value) {
			obj.setReceiversCustodianDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvrsIntrmyDtls")
	protected PartyIdentificationAndAccount5 receiversIntermediaryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount5
	 * PartyIdentificationAndAccount5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount8
	 * ReceivingPartiesAndAccount8}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount9#mmReceiversIntermediaryDetails
	 * ReceivingPartiesAndAccount9.mmReceiversIntermediaryDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReceivingPartiesAndAccount8, Optional<PartyIdentificationAndAccount5>> mmReceiversIntermediaryDetails = new MMMessageAssociationEnd<ReceivingPartiesAndAccount8, Optional<PartyIdentificationAndAccount5>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount8.mmObject();
			isDerived = false;
			xmlTag = "RcvrsIntrmyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediaryDetails";
			definition = "Party that the Receiver's custodian uses to effect the receipt of a security, when the Receiver's custodian does not have a direct relationship with the Receiver agent.";
			nextVersions_lazy = () -> Arrays.asList(ReceivingPartiesAndAccount9.mmReceiversIntermediaryDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount5.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount5> getValue(ReceivingPartiesAndAccount8 obj) {
			return obj.getReceiversIntermediaryDetails();
		}

		@Override
		public void setValue(ReceivingPartiesAndAccount8 obj, Optional<PartyIdentificationAndAccount5> value) {
			obj.setReceiversIntermediaryDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvgAgtDtls", required = true)
	protected PartyIdentificationAndAccount4 receivingAgentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount4
	 * PartyIdentificationAndAccount4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount8
	 * ReceivingPartiesAndAccount8}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount9#mmReceivingAgentDetails
	 * ReceivingPartiesAndAccount9.mmReceivingAgentDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReceivingPartiesAndAccount8, PartyIdentificationAndAccount4> mmReceivingAgentDetails = new MMMessageAssociationEnd<ReceivingPartiesAndAccount8, PartyIdentificationAndAccount4>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount8.mmObject();
			isDerived = false;
			xmlTag = "RcvgAgtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingAgentDetails";
			definition = "Party that receives securities from the delivering agent via the place of settlement, eg, securities central depository.";
			nextVersions_lazy = () -> Arrays.asList(ReceivingPartiesAndAccount9.mmReceivingAgentDetails);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount4.mmObject();
		}

		@Override
		public PartyIdentificationAndAccount4 getValue(ReceivingPartiesAndAccount8 obj) {
			return obj.getReceivingAgentDetails();
		}

		@Override
		public void setValue(ReceivingPartiesAndAccount8 obj, PartyIdentificationAndAccount4 value) {
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
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount8
	 * ReceivingPartiesAndAccount8}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount9#mmSecuritiesSettlementSystem
	 * ReceivingPartiesAndAccount9.mmSecuritiesSettlementSystem}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReceivingPartiesAndAccount8, Optional<Max35Text>> mmSecuritiesSettlementSystem = new MMMessageAttribute<ReceivingPartiesAndAccount8, Optional<Max35Text>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesSettlementSystem.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount8.mmObject();
			isDerived = false;
			xmlTag = "SctiesSttlmSys";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementSystem";
			definition = "Identifies the securities settlement system to be used.";
			nextVersions_lazy = () -> Arrays.asList(ReceivingPartiesAndAccount9.mmSecuritiesSettlementSystem);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ReceivingPartiesAndAccount8 obj) {
			return obj.getSecuritiesSettlementSystem();
		}

		@Override
		public void setValue(ReceivingPartiesAndAccount8 obj, Optional<Max35Text> value) {
			obj.setSecuritiesSettlementSystem(value.orElse(null));
		}
	};
	@XmlElement(name = "PlcOfSttlmDtls")
	protected PartyIdentification21 placeOfSettlementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification21
	 * PartyIdentification21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount8
	 * ReceivingPartiesAndAccount8}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount9#mmPlaceOfSettlementDetails
	 * ReceivingPartiesAndAccount9.mmPlaceOfSettlementDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReceivingPartiesAndAccount8, Optional<PartyIdentification21>> mmPlaceOfSettlementDetails = new MMMessageAssociationEnd<ReceivingPartiesAndAccount8, Optional<PartyIdentification21>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount8.mmObject();
			isDerived = false;
			xmlTag = "PlcOfSttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfSettlementDetails";
			definition = "Place where settlement of the securities takes place.";
			nextVersions_lazy = () -> Arrays.asList(ReceivingPartiesAndAccount9.mmPlaceOfSettlementDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification21.mmObject();
		}

		@Override
		public Optional<PartyIdentification21> getValue(ReceivingPartiesAndAccount8 obj) {
			return obj.getPlaceOfSettlementDetails();
		}

		@Override
		public void setValue(ReceivingPartiesAndAccount8 obj, Optional<PartyIdentification21> value) {
			obj.setPlaceOfSettlementDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReceivingPartiesAndAccount8.mmReceiverDetails, com.tools20022.repository.msg.ReceivingPartiesAndAccount8.mmReceiversCustodianDetails,
						com.tools20022.repository.msg.ReceivingPartiesAndAccount8.mmReceiversIntermediaryDetails, com.tools20022.repository.msg.ReceivingPartiesAndAccount8.mmReceivingAgentDetails,
						com.tools20022.repository.msg.ReceivingPartiesAndAccount8.mmSecuritiesSettlementSystem, com.tools20022.repository.msg.ReceivingPartiesAndAccount8.mmPlaceOfSettlementDetails);
				trace_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount8);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReceivingPartiesAndAccount8";
				definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
				nextVersions_lazy = () -> Arrays.asList(ReceivingPartiesAndAccount9.mmObject());
				previousVersion_lazy = () -> ReceivingPartiesAndAccount4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<InvestmentAccount24> getReceiverDetails() {
		return receiverDetails == null ? Optional.empty() : Optional.of(receiverDetails);
	}

	public ReceivingPartiesAndAccount8 setReceiverDetails(InvestmentAccount24 receiverDetails) {
		this.receiverDetails = receiverDetails;
		return this;
	}

	public Optional<PartyIdentificationAndAccount5> getReceiversCustodianDetails() {
		return receiversCustodianDetails == null ? Optional.empty() : Optional.of(receiversCustodianDetails);
	}

	public ReceivingPartiesAndAccount8 setReceiversCustodianDetails(PartyIdentificationAndAccount5 receiversCustodianDetails) {
		this.receiversCustodianDetails = receiversCustodianDetails;
		return this;
	}

	public Optional<PartyIdentificationAndAccount5> getReceiversIntermediaryDetails() {
		return receiversIntermediaryDetails == null ? Optional.empty() : Optional.of(receiversIntermediaryDetails);
	}

	public ReceivingPartiesAndAccount8 setReceiversIntermediaryDetails(PartyIdentificationAndAccount5 receiversIntermediaryDetails) {
		this.receiversIntermediaryDetails = receiversIntermediaryDetails;
		return this;
	}

	public PartyIdentificationAndAccount4 getReceivingAgentDetails() {
		return receivingAgentDetails;
	}

	public ReceivingPartiesAndAccount8 setReceivingAgentDetails(PartyIdentificationAndAccount4 receivingAgentDetails) {
		this.receivingAgentDetails = Objects.requireNonNull(receivingAgentDetails);
		return this;
	}

	public Optional<Max35Text> getSecuritiesSettlementSystem() {
		return securitiesSettlementSystem == null ? Optional.empty() : Optional.of(securitiesSettlementSystem);
	}

	public ReceivingPartiesAndAccount8 setSecuritiesSettlementSystem(Max35Text securitiesSettlementSystem) {
		this.securitiesSettlementSystem = securitiesSettlementSystem;
		return this;
	}

	public Optional<PartyIdentification21> getPlaceOfSettlementDetails() {
		return placeOfSettlementDetails == null ? Optional.empty() : Optional.of(placeOfSettlementDetails);
	}

	public ReceivingPartiesAndAccount8 setPlaceOfSettlementDetails(PartyIdentification21 placeOfSettlementDetails) {
		this.placeOfSettlementDetails = placeOfSettlementDetails;
		return this;
	}
}