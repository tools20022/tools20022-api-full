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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesSettlementPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification75;
import com.tools20022.repository.msg.PartyIdentificationAndAccount106;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.SettlementParties36#mmDepository
 * SettlementParties36.mmDepository}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties36#mmParty1
 * SettlementParties36.mmParty1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties36#mmParty2
 * SettlementParties36.mmParty2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties36#mmParty3
 * SettlementParties36.mmParty3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties36#mmParty4
 * SettlementParties36.mmParty4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties36#mmParty5
 * SettlementParties36.mmParty5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
 * SecuritiesSettlementPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV06#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionInstructionV06.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV06#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionInstructionV06.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionConfirmationV06.mmDeliveringSettlementParties}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionConfirmationV06.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV06#mmDeliveringSettlementParties
 * SecuritiesFinancingInstructionV06.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV06#mmReceivingSettlementParties
 * SecuritiesFinancingInstructionV06.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionGenerationNotificationV06.
 * mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionGenerationNotificationV06.
 * mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionReversalAdviceV05.
 * mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionReversalAdviceV05.mmReceivingSettlementParties
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV06#mmDeliveringSettlementParties
 * SecuritiesFinancingConfirmationV06.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV06#mmReceivingSettlementParties
 * SecuritiesFinancingConfirmationV06.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05#mmDeliveringSettlementParties
 * SecuritiesFinancingModificationInstructionV05.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05#mmReceivingSettlementParties
 * SecuritiesFinancingModificationInstructionV05.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV05#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionAllegementNotificationV05.
 * mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV05#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionAllegementNotificationV05.
 * mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV07#mmDeliveringSettlementParties
 * SecuritiesFinancingInstructionV07.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV07#mmReceivingSettlementParties
 * SecuritiesFinancingInstructionV07.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV06#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionAllegementNotificationV06.
 * mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV06#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionAllegementNotificationV06.
 * mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV07#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionGenerationNotificationV07.
 * mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV07#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionGenerationNotificationV07.
 * mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionConfirmationV07.mmDeliveringSettlementParties}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionConfirmationV07.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV06#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionReversalAdviceV06.
 * mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV06#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionReversalAdviceV06.mmReceivingSettlementParties
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06#mmDeliveringSettlementParties
 * SecuritiesFinancingModificationInstructionV06.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06#mmReceivingSettlementParties
 * SecuritiesFinancingModificationInstructionV06.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV07#mmDeliveringSettlementParties
 * SecuritiesFinancingConfirmationV07.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV07#mmReceivingSettlementParties
 * SecuritiesFinancingConfirmationV07.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV07#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionInstructionV07.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV07#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionInstructionV07.mmReceivingSettlementParties}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintParty2PresenceRule#forSettlementParties36
 * ConstraintParty2PresenceRule.forSettlementParties36}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintParty3PresenceRule#forSettlementParties36
 * ConstraintParty3PresenceRule.forSettlementParties36}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintParty4PresenceRule#forSettlementParties36
 * ConstraintParty4PresenceRule.forSettlementParties36}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintParty5PresenceRule#forSettlementParties36
 * ConstraintParty5PresenceRule.forSettlementParties36}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementChainGuideline#forSettlementParties36
 * ConstraintSettlementChainGuideline.forSettlementParties36}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryGuideline#forSettlementParties36
 * ConstraintDepositoryGuideline.forSettlementParties36}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBookTransferGuideline#forSettlementParties36
 * ConstraintBookTransferGuideline.forSettlementParties36}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementParties36"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties62
 * SettlementParties62}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SettlementParties10
 * SettlementParties10}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementParties36", propOrder = {"depository", "party1", "party2", "party3", "party4", "party5"})
public class SettlementParties36 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Dpstry")
	protected PartyIdentification75 depository;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification75
	 * PartyIdentification75}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties36
	 * SettlementParties36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dpstry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::PSET</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Depository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "First party in the settlement chain. In a plain vanilla settlement, it is the Central Securities Depository where the counterparty requests to receive the financial instrument or from where the counterparty delivers the financial instruments."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties62#mmDepository
	 * SettlementParties62.mmDepository}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties10#mmDepository
	 * SettlementParties10.mmDepository}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementParties36, Optional<PartyIdentification75>> mmDepository = new MMMessageAssociationEnd<SettlementParties36, Optional<PartyIdentification75>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementParties36.mmObject();
			isDerived = false;
			xmlTag = "Dpstry";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::PSET"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Depository";
			definition = "First party in the settlement chain. In a plain vanilla settlement, it is the Central Securities Depository where the counterparty requests to receive the financial instrument or from where the counterparty delivers the financial instruments.";
			nextVersions_lazy = () -> Arrays.asList(SettlementParties62.mmDepository);
			previousVersion_lazy = () -> SettlementParties10.mmDepository;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification75.mmObject();
		}

		@Override
		public Optional<PartyIdentification75> getValue(SettlementParties36 obj) {
			return obj.getDepository();
		}

		@Override
		public void setValue(SettlementParties36 obj, Optional<PartyIdentification75> value) {
			obj.setDepository(value.orElse(null));
		}
	};
	@XmlElement(name = "Pty1")
	protected PartyIdentificationAndAccount106 party1;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount106
	 * PartyIdentificationAndAccount106}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties36
	 * SettlementParties36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::REAG or DEAG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that, in a settlement chain interacts with the depository."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties62#mmParty1
	 * SettlementParties62.mmParty1}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties10#mmParty1
	 * SettlementParties10.mmParty1}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementParties36, Optional<PartyIdentificationAndAccount106>> mmParty1 = new MMMessageAssociationEnd<SettlementParties36, Optional<PartyIdentificationAndAccount106>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementParties36.mmObject();
			isDerived = false;
			xmlTag = "Pty1";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::REAG or DEAG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party1";
			definition = "Party that, in a settlement chain interacts with the depository.";
			nextVersions_lazy = () -> Arrays.asList(SettlementParties62.mmParty1);
			previousVersion_lazy = () -> SettlementParties10.mmParty1;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount106.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount106> getValue(SettlementParties36 obj) {
			return obj.getParty1();
		}

		@Override
		public void setValue(SettlementParties36 obj, Optional<PartyIdentificationAndAccount106> value) {
			obj.setParty1(value.orElse(null));
		}
	};
	@XmlElement(name = "Pty2")
	protected PartyIdentificationAndAccount106 party2;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount106
	 * PartyIdentificationAndAccount106}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties36
	 * SettlementParties36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::REI2 or DEI2, ISO15022Synonym:
	 * :95a::REI1 or DEI1, ISO15022Synonym: :95a::RECU or DECU, ISO15022Synonym:
	 * :95a::BUYR or SELL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that, in a settlement chain interacts with the party 1."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties62#mmParty2
	 * SettlementParties62.mmParty2}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties10#mmParty2
	 * SettlementParties10.mmParty2}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementParties36, Optional<PartyIdentificationAndAccount106>> mmParty2 = new MMMessageAssociationEnd<SettlementParties36, Optional<PartyIdentificationAndAccount106>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementParties36.mmObject();
			isDerived = false;
			xmlTag = "Pty2";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::REI2 or DEI2"), new ISO15022Synonym(this, ":95a::REI1 or DEI1"), new ISO15022Synonym(this, ":95a::RECU or DECU"), new ISO15022Synonym(this,
					":95a::BUYR or SELL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party2";
			definition = "Party that, in a settlement chain interacts with the party 1.";
			nextVersions_lazy = () -> Arrays.asList(SettlementParties62.mmParty2);
			previousVersion_lazy = () -> SettlementParties10.mmParty2;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount106.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount106> getValue(SettlementParties36 obj) {
			return obj.getParty2();
		}

		@Override
		public void setValue(SettlementParties36 obj, Optional<PartyIdentificationAndAccount106> value) {
			obj.setParty2(value.orElse(null));
		}
	};
	@XmlElement(name = "Pty3")
	protected PartyIdentificationAndAccount106 party3;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount106
	 * PartyIdentificationAndAccount106}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties36
	 * SettlementParties36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::REI1 or DEI1, ISO15022Synonym:
	 * :95a::RECU or DECU, ISO15022Synonym: :95a::BUYR or SELL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that, in a settlement chain interacts with the party 2."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties62#mmParty3
	 * SettlementParties62.mmParty3}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties10#mmParty3
	 * SettlementParties10.mmParty3}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementParties36, Optional<PartyIdentificationAndAccount106>> mmParty3 = new MMMessageAssociationEnd<SettlementParties36, Optional<PartyIdentificationAndAccount106>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementParties36.mmObject();
			isDerived = false;
			xmlTag = "Pty3";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::REI1 or DEI1"), new ISO15022Synonym(this, ":95a::RECU or DECU"), new ISO15022Synonym(this, ":95a::BUYR or SELL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party3";
			definition = "Party that, in a settlement chain interacts with the party 2.";
			nextVersions_lazy = () -> Arrays.asList(SettlementParties62.mmParty3);
			previousVersion_lazy = () -> SettlementParties10.mmParty3;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount106.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount106> getValue(SettlementParties36 obj) {
			return obj.getParty3();
		}

		@Override
		public void setValue(SettlementParties36 obj, Optional<PartyIdentificationAndAccount106> value) {
			obj.setParty3(value.orElse(null));
		}
	};
	@XmlElement(name = "Pty4")
	protected PartyIdentificationAndAccount106 party4;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount106
	 * PartyIdentificationAndAccount106}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties36
	 * SettlementParties36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::RECU or DECU, ISO15022Synonym:
	 * :95a::BUYR or SELL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that, in a settlement chain interacts with the party 3."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties62#mmParty4
	 * SettlementParties62.mmParty4}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties10#mmParty4
	 * SettlementParties10.mmParty4}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementParties36, Optional<PartyIdentificationAndAccount106>> mmParty4 = new MMMessageAssociationEnd<SettlementParties36, Optional<PartyIdentificationAndAccount106>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementParties36.mmObject();
			isDerived = false;
			xmlTag = "Pty4";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::RECU or DECU"), new ISO15022Synonym(this, ":95a::BUYR or SELL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party4";
			definition = "Party that, in a settlement chain interacts with the party 3.";
			nextVersions_lazy = () -> Arrays.asList(SettlementParties62.mmParty4);
			previousVersion_lazy = () -> SettlementParties10.mmParty4;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount106.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount106> getValue(SettlementParties36 obj) {
			return obj.getParty4();
		}

		@Override
		public void setValue(SettlementParties36 obj, Optional<PartyIdentificationAndAccount106> value) {
			obj.setParty4(value.orElse(null));
		}
	};
	@XmlElement(name = "Pty5")
	protected PartyIdentificationAndAccount106 party5;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount106
	 * PartyIdentificationAndAccount106}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties36
	 * SettlementParties36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty5"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::BUYR or SELL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party5"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that, in a settlement chain interacts with the party 4."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties62#mmParty5
	 * SettlementParties62.mmParty5}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties10#mmParty5
	 * SettlementParties10.mmParty5}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementParties36, Optional<PartyIdentificationAndAccount106>> mmParty5 = new MMMessageAssociationEnd<SettlementParties36, Optional<PartyIdentificationAndAccount106>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementParties36.mmObject();
			isDerived = false;
			xmlTag = "Pty5";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::BUYR or SELL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party5";
			definition = "Party that, in a settlement chain interacts with the party 4.";
			nextVersions_lazy = () -> Arrays.asList(SettlementParties62.mmParty5);
			previousVersion_lazy = () -> SettlementParties10.mmParty5;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount106.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount106> getValue(SettlementParties36 obj) {
			return obj.getParty5();
		}

		@Override
		public void setValue(SettlementParties36 obj, Optional<PartyIdentificationAndAccount106> value) {
			obj.setParty5(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementParties36.mmDepository, com.tools20022.repository.msg.SettlementParties36.mmParty1,
						com.tools20022.repository.msg.SettlementParties36.mmParty2, com.tools20022.repository.msg.SettlementParties36.mmParty3, com.tools20022.repository.msg.SettlementParties36.mmParty4,
						com.tools20022.repository.msg.SettlementParties36.mmParty5);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionInstructionV06.mmDeliveringSettlementParties, SecuritiesSettlementTransactionInstructionV06.mmReceivingSettlementParties,
						SecuritiesSettlementTransactionConfirmationV06.mmDeliveringSettlementParties, SecuritiesSettlementTransactionConfirmationV06.mmReceivingSettlementParties,
						SecuritiesFinancingInstructionV06.mmDeliveringSettlementParties, SecuritiesFinancingInstructionV06.mmReceivingSettlementParties,
						SecuritiesSettlementTransactionGenerationNotificationV06.mmDeliveringSettlementParties, SecuritiesSettlementTransactionGenerationNotificationV06.mmReceivingSettlementParties,
						SecuritiesSettlementTransactionReversalAdviceV05.mmDeliveringSettlementParties, SecuritiesSettlementTransactionReversalAdviceV05.mmReceivingSettlementParties,
						SecuritiesFinancingConfirmationV06.mmDeliveringSettlementParties, SecuritiesFinancingConfirmationV06.mmReceivingSettlementParties, SecuritiesFinancingModificationInstructionV05.mmDeliveringSettlementParties,
						SecuritiesFinancingModificationInstructionV05.mmReceivingSettlementParties, SecuritiesSettlementTransactionAllegementNotificationV05.mmDeliveringSettlementParties,
						SecuritiesSettlementTransactionAllegementNotificationV05.mmReceivingSettlementParties, SecuritiesFinancingInstructionV07.mmDeliveringSettlementParties, SecuritiesFinancingInstructionV07.mmReceivingSettlementParties,
						SecuritiesSettlementTransactionAllegementNotificationV06.mmDeliveringSettlementParties, SecuritiesSettlementTransactionAllegementNotificationV06.mmReceivingSettlementParties,
						SecuritiesSettlementTransactionGenerationNotificationV07.mmDeliveringSettlementParties, SecuritiesSettlementTransactionGenerationNotificationV07.mmReceivingSettlementParties,
						SecuritiesSettlementTransactionConfirmationV07.mmDeliveringSettlementParties, SecuritiesSettlementTransactionConfirmationV07.mmReceivingSettlementParties,
						SecuritiesSettlementTransactionReversalAdviceV06.mmDeliveringSettlementParties, SecuritiesSettlementTransactionReversalAdviceV06.mmReceivingSettlementParties,
						SecuritiesFinancingModificationInstructionV06.mmDeliveringSettlementParties, SecuritiesFinancingModificationInstructionV06.mmReceivingSettlementParties,
						SecuritiesFinancingConfirmationV07.mmDeliveringSettlementParties, SecuritiesFinancingConfirmationV07.mmReceivingSettlementParties, SecuritiesSettlementTransactionInstructionV07.mmDeliveringSettlementParties,
						SecuritiesSettlementTransactionInstructionV07.mmReceivingSettlementParties);
				trace_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintParty2PresenceRule.forSettlementParties36, com.tools20022.repository.constraints.ConstraintParty3PresenceRule.forSettlementParties36,
						com.tools20022.repository.constraints.ConstraintParty4PresenceRule.forSettlementParties36, com.tools20022.repository.constraints.ConstraintParty5PresenceRule.forSettlementParties36,
						com.tools20022.repository.constraints.ConstraintSettlementChainGuideline.forSettlementParties36, com.tools20022.repository.constraints.ConstraintDepositoryGuideline.forSettlementParties36,
						com.tools20022.repository.constraints.ConstraintBookTransferGuideline.forSettlementParties36);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementParties36";
				definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
				nextVersions_lazy = () -> Arrays.asList(SettlementParties62.mmObject());
				previousVersion_lazy = () -> SettlementParties10.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PartyIdentification75> getDepository() {
		return depository == null ? Optional.empty() : Optional.of(depository);
	}

	public SettlementParties36 setDepository(PartyIdentification75 depository) {
		this.depository = depository;
		return this;
	}

	public Optional<PartyIdentificationAndAccount106> getParty1() {
		return party1 == null ? Optional.empty() : Optional.of(party1);
	}

	public SettlementParties36 setParty1(PartyIdentificationAndAccount106 party1) {
		this.party1 = party1;
		return this;
	}

	public Optional<PartyIdentificationAndAccount106> getParty2() {
		return party2 == null ? Optional.empty() : Optional.of(party2);
	}

	public SettlementParties36 setParty2(PartyIdentificationAndAccount106 party2) {
		this.party2 = party2;
		return this;
	}

	public Optional<PartyIdentificationAndAccount106> getParty3() {
		return party3 == null ? Optional.empty() : Optional.of(party3);
	}

	public SettlementParties36 setParty3(PartyIdentificationAndAccount106 party3) {
		this.party3 = party3;
		return this;
	}

	public Optional<PartyIdentificationAndAccount106> getParty4() {
		return party4 == null ? Optional.empty() : Optional.of(party4);
	}

	public SettlementParties36 setParty4(PartyIdentificationAndAccount106 party4) {
		this.party4 = party4;
		return this;
	}

	public Optional<PartyIdentificationAndAccount106> getParty5() {
		return party5 == null ? Optional.empty() : Optional.of(party5);
	}

	public SettlementParties36 setParty5(PartyIdentificationAndAccount106 party5) {
		this.party5 = party5;
		return this;
	}
}