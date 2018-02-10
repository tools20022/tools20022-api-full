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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.setr.*;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesSettlementPartyRole;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.repository.msg.SettlementParties23#mmDepository
 * SettlementParties23.mmDepository}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties23#mmParty1
 * SettlementParties23.mmParty1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties23#mmParty2
 * SettlementParties23.mmParty2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties23#mmParty3
 * SettlementParties23.mmParty3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties23#mmParty4
 * SettlementParties23.mmParty4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties23#mmParty5
 * SettlementParties23.mmParty5}</li>
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
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01#mmDeliveringSettlementParties
 * SecuritiesTradeConfirmationStatusAdviceV01.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01#mmReceivingSettlementParties
 * SecuritiesTradeConfirmationStatusAdviceV01.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmDeliveringSettlementParties
 * SecuritiesTradeConfirmationV01.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmReceivingSettlementParties
 * SecuritiesTradeConfirmationV01.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV02#mmDeliveringSettlementParties
 * SecuritiesTradeConfirmationV02.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV02#mmReceivingSettlementParties
 * SecuritiesTradeConfirmationV02.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmDeliveringSettlementParties
 * SecuritiesTradeConfirmationV03.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmReceivingSettlementParties
 * SecuritiesTradeConfirmationV03.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02#mmDeliveringSettlementParties
 * SecuritiesTradeConfirmationStatusAdviceV02.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02#mmReceivingSettlementParties
 * SecuritiesTradeConfirmationStatusAdviceV02.mmReceivingSettlementParties}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintParty2PresenceRule#forSettlementParties23
 * ConstraintParty2PresenceRule.forSettlementParties23}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintParty3PresenceRule#forSettlementParties23
 * ConstraintParty3PresenceRule.forSettlementParties23}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintParty4PresenceRule#forSettlementParties23
 * ConstraintParty4PresenceRule.forSettlementParties23}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintParty5PresenceRule#forSettlementParties23
 * ConstraintParty5PresenceRule.forSettlementParties23}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryGuideline#forSettlementParties23
 * ConstraintDepositoryGuideline.forSettlementParties23}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementParties23"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementParties23", propOrder = {"depository", "party1", "party2", "party3", "party4", "party5"})
public class SettlementParties23 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Dpstry")
	protected PartyIdentification55 depository;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification55
	 * PartyIdentification55}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties23
	 * SettlementParties23}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmDepository = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementParties23.mmObject();
			isDerived = false;
			xmlTag = "Dpstry";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::PSET"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Depository";
			definition = "First party in the settlement chain. In a plain vanilla settlement, it is the Central Securities Depository where the counterparty requests to receive the financial instrument or from where the counterparty delivers the financial instruments.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentification55.mmObject();
		}
	};
	@XmlElement(name = "Pty1")
	protected PartyIdentificationAndAccount34 party1;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount34
	 * PartyIdentificationAndAccount34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties23
	 * SettlementParties23}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmParty1 = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementParties23.mmObject();
			isDerived = false;
			xmlTag = "Pty1";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::REAG or DEAG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party1";
			definition = "Party that, in a settlement chain interacts with the depository.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount34.mmObject();
		}
	};
	@XmlElement(name = "Pty2")
	protected PartyIdentificationAndAccount34 party2;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount34
	 * PartyIdentificationAndAccount34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties23
	 * SettlementParties23}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmParty2 = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementParties23.mmObject();
			isDerived = false;
			xmlTag = "Pty2";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::REI2 or DEI2"), new ISO15022Synonym(this, ":95a::REI1 or DEI1"), new ISO15022Synonym(this, ":95a::RECU or DECU"), new ISO15022Synonym(this,
					":95a::BUYR or SELL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party2";
			definition = "Party that, in a settlement chain interacts with the party 1.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount34.mmObject();
		}
	};
	@XmlElement(name = "Pty3")
	protected PartyIdentificationAndAccount34 party3;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount34
	 * PartyIdentificationAndAccount34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties23
	 * SettlementParties23}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmParty3 = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementParties23.mmObject();
			isDerived = false;
			xmlTag = "Pty3";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::REI1 or DEI1"), new ISO15022Synonym(this, ":95a::RECU or DECU"), new ISO15022Synonym(this, ":95a::BUYR or SELL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party3";
			definition = "Party that, in a settlement chain interacts with the party 2.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount34.mmObject();
		}
	};
	@XmlElement(name = "Pty4")
	protected PartyIdentificationAndAccount34 party4;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount34
	 * PartyIdentificationAndAccount34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties23
	 * SettlementParties23}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmParty4 = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementParties23.mmObject();
			isDerived = false;
			xmlTag = "Pty4";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::RECU or DECU"), new ISO15022Synonym(this, ":95a::BUYR or SELL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party4";
			definition = "Party that, in a settlement chain interacts with the party 3.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount34.mmObject();
		}
	};
	@XmlElement(name = "Pty5")
	protected PartyIdentificationAndAccount34 party5;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount34
	 * PartyIdentificationAndAccount34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties23
	 * SettlementParties23}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmParty5 = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementParties23.mmObject();
			isDerived = false;
			xmlTag = "Pty5";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::BUYR or SELL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party5";
			definition = "Party that, in a settlement chain interacts with the party 4.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount34.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementParties23.mmDepository, com.tools20022.repository.msg.SettlementParties23.mmParty1,
						com.tools20022.repository.msg.SettlementParties23.mmParty2, com.tools20022.repository.msg.SettlementParties23.mmParty3, com.tools20022.repository.msg.SettlementParties23.mmParty4,
						com.tools20022.repository.msg.SettlementParties23.mmParty5);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesTradeConfirmationStatusAdviceV01.mmDeliveringSettlementParties, SecuritiesTradeConfirmationStatusAdviceV01.mmReceivingSettlementParties,
						SecuritiesTradeConfirmationV01.mmDeliveringSettlementParties, SecuritiesTradeConfirmationV01.mmReceivingSettlementParties, SecuritiesTradeConfirmationV02.mmDeliveringSettlementParties,
						SecuritiesTradeConfirmationV02.mmReceivingSettlementParties, SecuritiesTradeConfirmationV03.mmDeliveringSettlementParties, SecuritiesTradeConfirmationV03.mmReceivingSettlementParties,
						SecuritiesTradeConfirmationStatusAdviceV02.mmDeliveringSettlementParties, SecuritiesTradeConfirmationStatusAdviceV02.mmReceivingSettlementParties);
				trace_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintParty2PresenceRule.forSettlementParties23, com.tools20022.repository.constraints.ConstraintParty3PresenceRule.forSettlementParties23,
						com.tools20022.repository.constraints.ConstraintParty4PresenceRule.forSettlementParties23, com.tools20022.repository.constraints.ConstraintParty5PresenceRule.forSettlementParties23,
						com.tools20022.repository.constraints.ConstraintDepositoryGuideline.forSettlementParties23);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementParties23";
				definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PartyIdentification55> getDepository() {
		return depository == null ? Optional.empty() : Optional.of(depository);
	}

	public SettlementParties23 setDepository(com.tools20022.repository.msg.PartyIdentification55 depository) {
		this.depository = depository;
		return this;
	}

	public Optional<PartyIdentificationAndAccount34> getParty1() {
		return party1 == null ? Optional.empty() : Optional.of(party1);
	}

	public SettlementParties23 setParty1(com.tools20022.repository.msg.PartyIdentificationAndAccount34 party1) {
		this.party1 = party1;
		return this;
	}

	public Optional<PartyIdentificationAndAccount34> getParty2() {
		return party2 == null ? Optional.empty() : Optional.of(party2);
	}

	public SettlementParties23 setParty2(com.tools20022.repository.msg.PartyIdentificationAndAccount34 party2) {
		this.party2 = party2;
		return this;
	}

	public Optional<PartyIdentificationAndAccount34> getParty3() {
		return party3 == null ? Optional.empty() : Optional.of(party3);
	}

	public SettlementParties23 setParty3(com.tools20022.repository.msg.PartyIdentificationAndAccount34 party3) {
		this.party3 = party3;
		return this;
	}

	public Optional<PartyIdentificationAndAccount34> getParty4() {
		return party4 == null ? Optional.empty() : Optional.of(party4);
	}

	public SettlementParties23 setParty4(com.tools20022.repository.msg.PartyIdentificationAndAccount34 party4) {
		this.party4 = party4;
		return this;
	}

	public Optional<PartyIdentificationAndAccount34> getParty5() {
		return party5 == null ? Optional.empty() : Optional.of(party5);
	}

	public SettlementParties23 setParty5(com.tools20022.repository.msg.PartyIdentificationAndAccount34 party5) {
		this.party5 = party5;
		return this;
	}
}