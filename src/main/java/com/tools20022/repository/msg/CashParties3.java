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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.PaymentPartyRole;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Payment processes required to transfer cash from the debtor to the creditor.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties3#mmDebtor
 * CashParties3.mmDebtor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties3#mmDebtorAgent
 * CashParties3.mmDebtorAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties3#mmCreditor
 * CashParties3.mmCreditor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties3#mmCreditorAgent
 * CashParties3.mmCreditorAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentPartyRole
 * PaymentPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#mmCashParties
 * SecuritiesFinancingConfirmationV01.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#mmCashParties
 * SecuritiesFinancingInstructionV01.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#mmCashParties
 * SecuritiesSettlementTransactionConfirmationV01.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV01#mmCashParties
 * SecuritiesSettlementTransactionGenerationNotificationV01.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV01#mmCashParties
 * SecuritiesSettlementTransactionInstructionV01.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV01#mmCashParties
 * SecuritiesSettlementTransactionAllegementNotificationV01.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV01#mmCashParties
 * SecuritiesSettlementTransactionReversalAdviceV01.mmCashParties}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashParties3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Payment processes required to transfer cash from the debtor to the creditor."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashParties3", propOrder = {"debtor", "debtorAgent", "creditor", "creditorAgent"})
public class CashParties3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Dbtr")
	protected PartyIdentificationAndAccount20 debtor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount20
	 * PartyIdentificationAndAccount20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashParties3 CashParties3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dbtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 452, FIXSynonym: 448, FIXSynonym: 447,
	 * ISO15022Synonym: :95a::DEBT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that owes an amount of money to the (ultimate) creditor."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDebtor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashParties3.mmObject();
			isDerived = false;
			xmlTag = "Dbtr";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "452"), new FIXSynonym(this, "448"), new FIXSynonym(this, "447"), new ISO15022Synonym(this, ":95a::DEBT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debtor";
			definition = "Party that owes an amount of money to the (ultimate) creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount20.mmObject();
		}
	};
	@XmlElement(name = "DbtrAgt")
	protected PartyIdentificationAndAccount15 debtorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount15
	 * PartyIdentificationAndAccount15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashParties3 CashParties3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 452, FIXSynonym: 448, FIXSynonym: 447,
	 * ISO15022Synonym: :95a::PAYE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution servicing an account for the debtor."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDebtorAgent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashParties3.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "452"), new FIXSynonym(this, "448"), new FIXSynonym(this, "447"), new ISO15022Synonym(this, ":95a::PAYE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgent";
			definition = "Financial institution servicing an account for the debtor.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount15.mmObject();
		}
	};
	@XmlElement(name = "Cdtr")
	protected PartyIdentificationAndAccount20 creditor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount20
	 * PartyIdentificationAndAccount20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashParties3 CashParties3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cdtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 452, FIXSynonym: 448, FIXSynonym: 447,
	 * ISO15022Synonym: :95a::BENM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to which an amount of money is due."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashParties3.mmObject();
			isDerived = false;
			xmlTag = "Cdtr";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "452"), new FIXSynonym(this, "448"), new FIXSynonym(this, "447"), new ISO15022Synonym(this, ":95a::BENM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Party to which an amount of money is due.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount20.mmObject();
		}
	};
	@XmlElement(name = "CdtrAgt")
	protected PartyIdentificationAndAccount15 creditorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount15
	 * PartyIdentificationAndAccount15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashParties3 CashParties3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 452, FIXSynonym: 448, FIXSynonym: 447,
	 * ISO15022Synonym: :95a::ACCW</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution servicing an account for the creditor."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditorAgent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashParties3.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "452"), new FIXSynonym(this, "448"), new FIXSynonym(this, "447"), new ISO15022Synonym(this, ":95a::ACCW"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgent";
			definition = "Financial institution servicing an account for the creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount15.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashParties3.mmDebtor, com.tools20022.repository.msg.CashParties3.mmDebtorAgent, com.tools20022.repository.msg.CashParties3.mmCreditor,
						com.tools20022.repository.msg.CashParties3.mmCreditorAgent);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV01.mmCashParties, SecuritiesFinancingInstructionV01.mmCashParties, SecuritiesSettlementTransactionConfirmationV01.mmCashParties,
						SecuritiesSettlementTransactionGenerationNotificationV01.mmCashParties, SecuritiesSettlementTransactionInstructionV01.mmCashParties, SecuritiesSettlementTransactionAllegementNotificationV01.mmCashParties,
						SecuritiesSettlementTransactionReversalAdviceV01.mmCashParties);
				trace_lazy = () -> PaymentPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashParties3";
				definition = "Payment processes required to transfer cash from the debtor to the creditor.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PartyIdentificationAndAccount20> getDebtor() {
		return debtor == null ? Optional.empty() : Optional.of(debtor);
	}

	public CashParties3 setDebtor(com.tools20022.repository.msg.PartyIdentificationAndAccount20 debtor) {
		this.debtor = debtor;
		return this;
	}

	public Optional<PartyIdentificationAndAccount15> getDebtorAgent() {
		return debtorAgent == null ? Optional.empty() : Optional.of(debtorAgent);
	}

	public CashParties3 setDebtorAgent(com.tools20022.repository.msg.PartyIdentificationAndAccount15 debtorAgent) {
		this.debtorAgent = debtorAgent;
		return this;
	}

	public Optional<PartyIdentificationAndAccount20> getCreditor() {
		return creditor == null ? Optional.empty() : Optional.of(creditor);
	}

	public CashParties3 setCreditor(com.tools20022.repository.msg.PartyIdentificationAndAccount20 creditor) {
		this.creditor = creditor;
		return this;
	}

	public Optional<PartyIdentificationAndAccount15> getCreditorAgent() {
		return creditorAgent == null ? Optional.empty() : Optional.of(creditorAgent);
	}

	public CashParties3 setCreditorAgent(com.tools20022.repository.msg.PartyIdentificationAndAccount15 creditorAgent) {
		this.creditorAgent = creditorAgent;
		return this;
	}
}