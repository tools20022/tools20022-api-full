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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.SecuritiesSettlementPartyRole;
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
 * {@linkplain com.tools20022.repository.msg.SettlementParties32#mmDepository
 * SettlementParties32.mmDepository}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties32#mmParty1
 * SettlementParties32.mmParty1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties32#mmParty2
 * SettlementParties32.mmParty2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties32#mmParty3
 * SettlementParties32.mmParty3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties32#mmParty4
 * SettlementParties32.mmParty4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties32#mmParty5
 * SettlementParties32.mmParty5}</li>
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
 * "SettlementParties32"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SettlementParties32", propOrder = {"depository", "party1", "party2", "party3", "party4", "party5"})
public class SettlementParties32 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentification63 depository;
	/**
	 * First party in the settlement chain. In a plain vanilla settlement, it is
	 * the central securities depository where the counterparty requests to
	 * receive the financial instrument or from where the counterparty delivers
	 * the financial instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification63
	 * PartyIdentification63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties32
	 * SettlementParties32}</li>
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
	 * "First party in the settlement chain. In a plain vanilla settlement, it is the central securities depository where the counterparty requests to receive the financial instrument or from where the counterparty delivers the financial instruments."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDepository = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
			componentContext_lazy = () -> SettlementParties32.mmObject();
			isDerived = false;
			xmlTag = "Dpstry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Depository";
			definition = "First party in the settlement chain. In a plain vanilla settlement, it is the central securities depository where the counterparty requests to receive the financial instrument or from where the counterparty delivers the financial instruments.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentification63.mmObject();
		}
	};
	protected PartyIdentificationAndAccount95 party1;
	/**
	 * Party that, in a settlement chain, interacts with the depository. This
	 * may also be known as the “local agent”, “sub-custodian”, “receiving
	 * agent” or “delivering agent”.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount95
	 * PartyIdentificationAndAccount95}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties32
	 * SettlementParties32}</li>
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
	 * "Party that, in a settlement chain, interacts with the depository. This may also be known as the “local agent”, “sub-custodian”, “receiving agent” or “delivering agent”."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmParty1 = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
			componentContext_lazy = () -> SettlementParties32.mmObject();
			isDerived = false;
			xmlTag = "Pty1";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party1";
			definition = "Party that, in a settlement chain, interacts with the depository. This may also be known as the “local agent”, “sub-custodian”, “receiving agent” or “delivering agent”.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount95.mmObject();
		}
	};
	protected PartyIdentificationAndAccount95 party2;
	/**
	 * Party that, in a settlement chain, interacts with party 1. This may also
	 * be known as the “investment manager” or “custodian”.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount95
	 * PartyIdentificationAndAccount95}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties32
	 * SettlementParties32}</li>
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
	 * "Party that, in a settlement chain, interacts with party 1. This may also be known as the “investment manager” or “custodian”."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmParty2 = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
			componentContext_lazy = () -> SettlementParties32.mmObject();
			isDerived = false;
			xmlTag = "Pty2";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party2";
			definition = "Party that, in a settlement chain, interacts with party 1. This may also be known as the “investment manager” or “custodian”.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount95.mmObject();
		}
	};
	protected PartyIdentificationAndAccount95 party3;
	/**
	 * Party that, in a settlement chain, interacts with party 2.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount95
	 * PartyIdentificationAndAccount95}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties32
	 * SettlementParties32}</li>
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
	 * "Party that, in a settlement chain, interacts with party 2."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmParty3 = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
			componentContext_lazy = () -> SettlementParties32.mmObject();
			isDerived = false;
			xmlTag = "Pty3";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party3";
			definition = "Party that, in a settlement chain, interacts with party 2.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount95.mmObject();
		}
	};
	protected PartyIdentificationAndAccount95 party4;
	/**
	 * Party that, in a settlement chain, interacts with party 3.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount95
	 * PartyIdentificationAndAccount95}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties32
	 * SettlementParties32}</li>
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
	 * "Party that, in a settlement chain, interacts with party 3."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmParty4 = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
			componentContext_lazy = () -> SettlementParties32.mmObject();
			isDerived = false;
			xmlTag = "Pty4";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party4";
			definition = "Party that, in a settlement chain, interacts with party 3.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount95.mmObject();
		}
	};
	protected PartyIdentificationAndAccount95 party5;
	/**
	 * Party that, in a settlement chain, interacts with party 4.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount95
	 * PartyIdentificationAndAccount95}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties32
	 * SettlementParties32}</li>
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
	 * "Party that, in a settlement chain, interacts with party 4."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmParty5 = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
			componentContext_lazy = () -> SettlementParties32.mmObject();
			isDerived = false;
			xmlTag = "Pty5";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party5";
			definition = "Party that, in a settlement chain, interacts with party 4.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount95.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SettlementParties32.mmDepository, SettlementParties32.mmParty1, SettlementParties32.mmParty2, SettlementParties32.mmParty3, SettlementParties32.mmParty4,
						SettlementParties32.mmParty5);
				trace_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementParties32";
				definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Dpstry", required = true)
	public PartyIdentification63 getDepository() {
		return depository;
	}

	public void setDepository(com.tools20022.repository.msg.PartyIdentification63 depository) {
		this.depository = depository;
	}

	@XmlElement(name = "Pty1")
	public PartyIdentificationAndAccount95 getParty1() {
		return party1;
	}

	public void setParty1(com.tools20022.repository.msg.PartyIdentificationAndAccount95 party1) {
		this.party1 = party1;
	}

	@XmlElement(name = "Pty2")
	public PartyIdentificationAndAccount95 getParty2() {
		return party2;
	}

	public void setParty2(com.tools20022.repository.msg.PartyIdentificationAndAccount95 party2) {
		this.party2 = party2;
	}

	@XmlElement(name = "Pty3")
	public PartyIdentificationAndAccount95 getParty3() {
		return party3;
	}

	public void setParty3(com.tools20022.repository.msg.PartyIdentificationAndAccount95 party3) {
		this.party3 = party3;
	}

	@XmlElement(name = "Pty4")
	public PartyIdentificationAndAccount95 getParty4() {
		return party4;
	}

	public void setParty4(com.tools20022.repository.msg.PartyIdentificationAndAccount95 party4) {
		this.party4 = party4;
	}

	@XmlElement(name = "Pty5")
	public PartyIdentificationAndAccount95 getParty5() {
		return party5;
	}

	public void setParty5(com.tools20022.repository.msg.PartyIdentificationAndAccount95 party5) {
		this.party5 = party5;
	}
}