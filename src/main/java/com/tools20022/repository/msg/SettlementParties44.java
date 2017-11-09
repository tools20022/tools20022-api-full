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
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesSettlementPartyRole;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.SettlementParties44#mmDepository
 * SettlementParties44.mmDepository}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties44#mmParty1
 * SettlementParties44.mmParty1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties44#mmParty2
 * SettlementParties44.mmParty2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties44#mmParty3
 * SettlementParties44.mmParty3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties44#mmParty4
 * SettlementParties44.mmParty4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties44#mmParty5
 * SettlementParties44.mmParty5}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotification002V05#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionAllegementNotification002V05.
 * mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotification002V05#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionAllegementNotification002V05.
 * mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdvice002V05#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionReversalAdvice002V05.
 * mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdvice002V05#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionReversalAdvice002V05.
 * mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V06#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionConfirmation002V06.
 * mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V06#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionConfirmation002V06.
 * mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstruction002V05#mmDeliveringSettlementParties
 * SecuritiesFinancingModificationInstruction002V05.
 * mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstruction002V05#mmReceivingSettlementParties
 * SecuritiesFinancingModificationInstruction002V05.mmReceivingSettlementParties
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotification002V06#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionGenerationNotification002V06.
 * mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotification002V06#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionGenerationNotification002V06.
 * mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionInstruction002V06.
 * mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionInstruction002V06.mmReceivingSettlementParties
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06#mmDeliveringSettlementParties
 * SecuritiesFinancingInstruction002V06.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06#mmReceivingSettlementParties
 * SecuritiesFinancingInstruction002V06.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V06#mmDeliveringSettlementParties
 * SecuritiesFinancingConfirmation002V06.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V06#mmReceivingSettlementParties
 * SecuritiesFinancingConfirmation002V06.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotification002V06#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionAllegementNotification002V06.
 * mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotification002V06#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionAllegementNotification002V06.
 * mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V07#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionInstruction002V07.
 * mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V07#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionInstruction002V07.mmReceivingSettlementParties
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07#mmDeliveringSettlementParties
 * SecuritiesFinancingConfirmation002V07.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07#mmReceivingSettlementParties
 * SecuritiesFinancingConfirmation002V07.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V07#mmDeliveringSettlementParties
 * SecuritiesFinancingInstruction002V07.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V07#mmReceivingSettlementParties
 * SecuritiesFinancingInstruction002V07.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotification002V07#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionGenerationNotification002V07.
 * mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotification002V07#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionGenerationNotification002V07.
 * mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstruction002V06#mmDeliveringSettlementParties
 * SecuritiesFinancingModificationInstruction002V06.
 * mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstruction002V06#mmReceivingSettlementParties
 * SecuritiesFinancingModificationInstruction002V06.mmReceivingSettlementParties
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V07#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionConfirmation002V07.
 * mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V07#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionConfirmation002V07.
 * mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdvice002V06#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionReversalAdvice002V06.
 * mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdvice002V06#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionReversalAdvice002V06.
 * mmReceivingSettlementParties}</li>
 * </ul>
 * </li>
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
 * "SettlementParties44"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
 * </li>
 * </ul>
 */
public class SettlementParties44 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentification103 depository;
	/**
	 * First party in the settlement chain. In a plain vanilla settlement, it is
	 * the Central Securities Depository where the counterparty requests to
	 * receive the financial instrument or from where the counterparty delivers
	 * the financial instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification103
	 * PartyIdentification103}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties44
	 * SettlementParties44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dpstry"</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDepository = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> SettlementParties44.mmObject();
			isDerived = false;
			xmlTag = "Dpstry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Depository";
			definition = "First party in the settlement chain. In a plain vanilla settlement, it is the Central Securities Depository where the counterparty requests to receive the financial instrument or from where the counterparty delivers the financial instruments.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification103.mmObject();
		}
	};
	protected PartyIdentificationAndAccount131 party1;
	/**
	 * Party that, in a settlement chain interacts with the depository.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount131
	 * PartyIdentificationAndAccount131}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties44
	 * SettlementParties44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty1"</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmParty1 = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> SettlementParties44.mmObject();
			isDerived = false;
			xmlTag = "Pty1";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party1";
			definition = "Party that, in a settlement chain interacts with the depository.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount131.mmObject();
		}
	};
	protected PartyIdentificationAndAccount131 party2;
	/**
	 * Party that, in a settlement chain interacts with the party 1.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount131
	 * PartyIdentificationAndAccount131}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties44
	 * SettlementParties44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty2"</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmParty2 = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> SettlementParties44.mmObject();
			isDerived = false;
			xmlTag = "Pty2";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party2";
			definition = "Party that, in a settlement chain interacts with the party 1.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount131.mmObject();
		}
	};
	protected PartyIdentificationAndAccount131 party3;
	/**
	 * Party that, in a settlement chain interacts with the party 2.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount131
	 * PartyIdentificationAndAccount131}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties44
	 * SettlementParties44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty3"</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmParty3 = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> SettlementParties44.mmObject();
			isDerived = false;
			xmlTag = "Pty3";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party3";
			definition = "Party that, in a settlement chain interacts with the party 2.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount131.mmObject();
		}
	};
	protected PartyIdentificationAndAccount131 party4;
	/**
	 * Party that, in a settlement chain interacts with the party 3.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount131
	 * PartyIdentificationAndAccount131}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties44
	 * SettlementParties44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty4"</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmParty4 = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> SettlementParties44.mmObject();
			isDerived = false;
			xmlTag = "Pty4";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party4";
			definition = "Party that, in a settlement chain interacts with the party 3.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount131.mmObject();
		}
	};
	protected PartyIdentificationAndAccount131 party5;
	/**
	 * Party that, in a settlement chain interacts with the party 4.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount131
	 * PartyIdentificationAndAccount131}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties44
	 * SettlementParties44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty5"</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmParty5 = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> SettlementParties44.mmObject();
			isDerived = false;
			xmlTag = "Pty5";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party5";
			definition = "Party that, in a settlement chain interacts with the party 4.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount131.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SettlementParties44.mmDepository, SettlementParties44.mmParty1, SettlementParties44.mmParty2, SettlementParties44.mmParty3, SettlementParties44.mmParty4,
						SettlementParties44.mmParty5);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionAllegementNotification002V05.mmDeliveringSettlementParties,
						SecuritiesSettlementTransactionAllegementNotification002V05.mmReceivingSettlementParties, SecuritiesSettlementTransactionReversalAdvice002V05.mmDeliveringSettlementParties,
						SecuritiesSettlementTransactionReversalAdvice002V05.mmReceivingSettlementParties, SecuritiesSettlementTransactionConfirmation002V06.mmDeliveringSettlementParties,
						SecuritiesSettlementTransactionConfirmation002V06.mmReceivingSettlementParties, SecuritiesFinancingModificationInstruction002V05.mmDeliveringSettlementParties,
						SecuritiesFinancingModificationInstruction002V05.mmReceivingSettlementParties, SecuritiesSettlementTransactionGenerationNotification002V06.mmDeliveringSettlementParties,
						SecuritiesSettlementTransactionGenerationNotification002V06.mmReceivingSettlementParties, SecuritiesSettlementTransactionInstruction002V06.mmDeliveringSettlementParties,
						SecuritiesSettlementTransactionInstruction002V06.mmReceivingSettlementParties, SecuritiesFinancingInstruction002V06.mmDeliveringSettlementParties, SecuritiesFinancingInstruction002V06.mmReceivingSettlementParties,
						SecuritiesFinancingConfirmation002V06.mmDeliveringSettlementParties, SecuritiesFinancingConfirmation002V06.mmReceivingSettlementParties,
						SecuritiesSettlementTransactionAllegementNotification002V06.mmDeliveringSettlementParties, SecuritiesSettlementTransactionAllegementNotification002V06.mmReceivingSettlementParties,
						SecuritiesSettlementTransactionInstruction002V07.mmDeliveringSettlementParties, SecuritiesSettlementTransactionInstruction002V07.mmReceivingSettlementParties,
						SecuritiesFinancingConfirmation002V07.mmDeliveringSettlementParties, SecuritiesFinancingConfirmation002V07.mmReceivingSettlementParties, SecuritiesFinancingInstruction002V07.mmDeliveringSettlementParties,
						SecuritiesFinancingInstruction002V07.mmReceivingSettlementParties, SecuritiesSettlementTransactionGenerationNotification002V07.mmDeliveringSettlementParties,
						SecuritiesSettlementTransactionGenerationNotification002V07.mmReceivingSettlementParties, SecuritiesFinancingModificationInstruction002V06.mmDeliveringSettlementParties,
						SecuritiesFinancingModificationInstruction002V06.mmReceivingSettlementParties, SecuritiesSettlementTransactionConfirmation002V07.mmDeliveringSettlementParties,
						SecuritiesSettlementTransactionConfirmation002V07.mmReceivingSettlementParties, SecuritiesSettlementTransactionReversalAdvice002V06.mmDeliveringSettlementParties,
						SecuritiesSettlementTransactionReversalAdvice002V06.mmReceivingSettlementParties);
				trace_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementParties44";
				definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification103 getDepository() {
		return depository;
	}

	public void setDepository(com.tools20022.repository.msg.PartyIdentification103 depository) {
		this.depository = depository;
	}

	public PartyIdentificationAndAccount131 getParty1() {
		return party1;
	}

	public void setParty1(com.tools20022.repository.msg.PartyIdentificationAndAccount131 party1) {
		this.party1 = party1;
	}

	public PartyIdentificationAndAccount131 getParty2() {
		return party2;
	}

	public void setParty2(com.tools20022.repository.msg.PartyIdentificationAndAccount131 party2) {
		this.party2 = party2;
	}

	public PartyIdentificationAndAccount131 getParty3() {
		return party3;
	}

	public void setParty3(com.tools20022.repository.msg.PartyIdentificationAndAccount131 party3) {
		this.party3 = party3;
	}

	public PartyIdentificationAndAccount131 getParty4() {
		return party4;
	}

	public void setParty4(com.tools20022.repository.msg.PartyIdentificationAndAccount131 party4) {
		this.party4 = party4;
	}

	public PartyIdentificationAndAccount131 getParty5() {
		return party5;
	}

	public void setParty5(com.tools20022.repository.msg.PartyIdentificationAndAccount131 party5) {
		this.party5 = party5;
	}
}