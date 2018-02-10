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
import com.tools20022.metamodel.MMMessageAssociationEnd;
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
 * <li>{@linkplain com.tools20022.repository.msg.CashParties26#mmDebtor
 * CashParties26.mmDebtor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties26#mmDebtorAgent
 * CashParties26.mmDebtorAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties26#mmCreditor
 * CashParties26.mmCreditor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties26#mmCreditorAgent
 * CashParties26.mmCreditorAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties26#mmIntermediary
 * CashParties26.mmIntermediary}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV06#mmCashParties
 * SecuritiesSettlementTransactionInstructionV06.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06#mmCashParties
 * SecuritiesSettlementTransactionConfirmationV06.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV06#mmCashParties
 * SecuritiesFinancingInstructionV06.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06#mmCashParties
 * SecuritiesSettlementTransactionGenerationNotificationV06.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV06#mmCashParties
 * SecuritiesFinancingConfirmationV06.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV07#mmCashParties
 * SecuritiesFinancingInstructionV07.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV07#mmCashParties
 * SecuritiesSettlementTransactionGenerationNotificationV07.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07#mmCashParties
 * SecuritiesSettlementTransactionConfirmationV07.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV07#mmCashParties
 * SecuritiesFinancingConfirmationV07.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV07#mmCashParties
 * SecuritiesSettlementTransactionInstructionV07.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV08#mmCashParties
 * SecuritiesSettlementTransactionGenerationNotificationV08.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV08#mmCashParties
 * SecuritiesSettlementTransactionConfirmationV08.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV08#mmCashParties
 * SecuritiesFinancingInstructionV08.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV08#mmCashParties
 * SecuritiesFinancingConfirmationV08.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV08#mmCashParties
 * SecuritiesSettlementTransactionInstructionV08.mmCashParties}</li>
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
 * "CashParties26"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Payment processes required to transfer cash from the debtor to the creditor."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.CashParties17
 * CashParties17}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashParties26", propOrder = {"debtor", "debtorAgent", "creditor", "creditorAgent", "intermediary"})
public class CashParties26 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Dbtr")
	protected PartyIdentificationAndAccount111 debtor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount111
	 * PartyIdentificationAndAccount111}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashParties26 CashParties26}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashParties17#mmDebtor
	 * CashParties17.mmDebtor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDebtor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashParties26.mmObject();
			isDerived = false;
			xmlTag = "Dbtr";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "452"), new FIXSynonym(this, "448"), new FIXSynonym(this, "447"), new ISO15022Synonym(this, ":95a::DEBT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debtor";
			definition = "Party that owes an amount of money to the (ultimate) creditor.";
			previousVersion_lazy = () -> CashParties17.mmDebtor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount111.mmObject();
		}
	};
	@XmlElement(name = "DbtrAgt")
	protected PartyIdentificationAndAccount112 debtorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112
	 * PartyIdentificationAndAccount112}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashParties26 CashParties26}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashParties17#mmDebtorAgent
	 * CashParties17.mmDebtorAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDebtorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashParties26.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "452"), new FIXSynonym(this, "448"), new FIXSynonym(this, "447"), new ISO15022Synonym(this, ":95a::PAYE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgent";
			definition = "Financial institution servicing an account for the debtor.";
			previousVersion_lazy = () -> CashParties17.mmDebtorAgent;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount112.mmObject();
		}
	};
	@XmlElement(name = "Cdtr")
	protected PartyIdentificationAndAccount111 creditor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount111
	 * PartyIdentificationAndAccount111}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashParties26 CashParties26}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashParties17#mmCreditor
	 * CashParties17.mmCreditor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashParties26.mmObject();
			isDerived = false;
			xmlTag = "Cdtr";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "452"), new FIXSynonym(this, "448"), new FIXSynonym(this, "447"), new ISO15022Synonym(this, ":95a::BENM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Party to which an amount of money is due.";
			previousVersion_lazy = () -> CashParties17.mmCreditor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount111.mmObject();
		}
	};
	@XmlElement(name = "CdtrAgt")
	protected PartyIdentificationAndAccount112 creditorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112
	 * PartyIdentificationAndAccount112}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashParties26 CashParties26}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashParties17#mmCreditorAgent
	 * CashParties17.mmCreditorAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashParties26.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "452"), new FIXSynonym(this, "448"), new FIXSynonym(this, "447"), new ISO15022Synonym(this, ":95a::ACCW"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgent";
			definition = "Financial institution servicing an account for the creditor.";
			previousVersion_lazy = () -> CashParties17.mmCreditorAgent;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount112.mmObject();
		}
	};
	@XmlElement(name = "Intrmy")
	protected PartyIdentificationAndAccount112 intermediary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112
	 * PartyIdentificationAndAccount112}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashParties26 CashParties26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrmy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution through which the transaction must pass to reach the account with institution."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashParties17#mmIntermediary
	 * CashParties17.mmIntermediary}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntermediary = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashParties26.mmObject();
			isDerived = false;
			xmlTag = "Intrmy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediary";
			definition = "Financial institution through which the transaction must pass to reach the account with institution.";
			previousVersion_lazy = () -> CashParties17.mmIntermediary;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount112.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashParties26.mmDebtor, com.tools20022.repository.msg.CashParties26.mmDebtorAgent, com.tools20022.repository.msg.CashParties26.mmCreditor,
						com.tools20022.repository.msg.CashParties26.mmCreditorAgent, com.tools20022.repository.msg.CashParties26.mmIntermediary);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionInstructionV06.mmCashParties, SecuritiesSettlementTransactionConfirmationV06.mmCashParties, SecuritiesFinancingInstructionV06.mmCashParties,
						SecuritiesSettlementTransactionGenerationNotificationV06.mmCashParties, SecuritiesFinancingConfirmationV06.mmCashParties, SecuritiesFinancingInstructionV07.mmCashParties,
						SecuritiesSettlementTransactionGenerationNotificationV07.mmCashParties, SecuritiesSettlementTransactionConfirmationV07.mmCashParties, SecuritiesFinancingConfirmationV07.mmCashParties,
						SecuritiesSettlementTransactionInstructionV07.mmCashParties, SecuritiesSettlementTransactionGenerationNotificationV08.mmCashParties, SecuritiesSettlementTransactionConfirmationV08.mmCashParties,
						SecuritiesFinancingInstructionV08.mmCashParties, SecuritiesFinancingConfirmationV08.mmCashParties, SecuritiesSettlementTransactionInstructionV08.mmCashParties);
				trace_lazy = () -> PaymentPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashParties26";
				definition = "Payment processes required to transfer cash from the debtor to the creditor.";
				previousVersion_lazy = () -> CashParties17.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PartyIdentificationAndAccount111> getDebtor() {
		return debtor == null ? Optional.empty() : Optional.of(debtor);
	}

	public CashParties26 setDebtor(com.tools20022.repository.msg.PartyIdentificationAndAccount111 debtor) {
		this.debtor = debtor;
		return this;
	}

	public Optional<PartyIdentificationAndAccount112> getDebtorAgent() {
		return debtorAgent == null ? Optional.empty() : Optional.of(debtorAgent);
	}

	public CashParties26 setDebtorAgent(com.tools20022.repository.msg.PartyIdentificationAndAccount112 debtorAgent) {
		this.debtorAgent = debtorAgent;
		return this;
	}

	public Optional<PartyIdentificationAndAccount111> getCreditor() {
		return creditor == null ? Optional.empty() : Optional.of(creditor);
	}

	public CashParties26 setCreditor(com.tools20022.repository.msg.PartyIdentificationAndAccount111 creditor) {
		this.creditor = creditor;
		return this;
	}

	public Optional<PartyIdentificationAndAccount112> getCreditorAgent() {
		return creditorAgent == null ? Optional.empty() : Optional.of(creditorAgent);
	}

	public CashParties26 setCreditorAgent(com.tools20022.repository.msg.PartyIdentificationAndAccount112 creditorAgent) {
		this.creditorAgent = creditorAgent;
		return this;
	}

	public Optional<PartyIdentificationAndAccount112> getIntermediary() {
		return intermediary == null ? Optional.empty() : Optional.of(intermediary);
	}

	public CashParties26 setIntermediary(com.tools20022.repository.msg.PartyIdentificationAndAccount112 intermediary) {
		this.intermediary = intermediary;
		return this;
	}
}