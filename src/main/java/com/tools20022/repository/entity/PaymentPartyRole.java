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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Role played by a party in the context of a payment.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentPartyRole" src="doc-files/PaymentPartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
 * PaymentPartyRole.mmCashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmPayment
 * PaymentPartyRole.mmPayment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InstructingAgentRole
 * InstructingAgentRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InstructedAgentRole
 * InstructedAgentRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DebtorRole DebtorRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DebtorAgentRole
 * DebtorAgentRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CreditorRole CreditorRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.IntermediaryAgentRole
 * IntermediaryAgentRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CreditorAgentRole
 * CreditorAgentRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ForwardingAgentRole
 * ForwardingAgentRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InitiatingPartyRole
 * InitiatingPartyRole}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransactionParty
 * PaymentTransactionParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransactionParty2
 * PaymentTransactionParty2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties1 CashParties1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties3 CashParties3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties8 CashParties8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties14 CashParties14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties2 CashParties2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties5 CashParties5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties10 CashParties10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties12 CashParties12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties4 CashParties4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties7 CashParties7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties13 CashParties13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties17 CashParties17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties19 CashParties19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties6 CashParties6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionParty1
 * TransactionParty1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionParty2
 * TransactionParty2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionParties3
 * TransactionParties3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties18 CashParties18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties1
 * SettlementParties1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties9
 * SettlementParties9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties29
 * SettlementParties29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties11 CashParties11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties9 CashParties9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties15 CashParties15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties16 CashParties16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties24 CashParties24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties21 CashParties21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties23 CashParties23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties26 CashParties26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties25 CashParties25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties28 CashParties28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties29 CashParties29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties30 CashParties30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties32 CashParties32}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmPaymentPartyRole
 * CashAccount.mmPaymentPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPartyRole
 * Payment.mmPartyRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch4#mmParties
 * PaymentSearch4.mmParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmCashParties
 * SecuritiesTradeDetails4.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmCashParties
 * SecuritiesTradeDetails10.mmCashParties}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmCashParties
 * InstrumentLeg2.mmCashParties}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleQuote1#mmCashParties
 * SingleQuote1.mmCashParties}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstrumentLeg3#mmCashParties
 * InstrumentLeg3.mmCashParties}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteRequest1#mmCashParties
 * QuoteRequest1.mmCashParties}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestForQuote#mmCashParties
 * RequestForQuote.mmCashParties}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch5#mmParties
 * PaymentSearch5.mmParties}</li>
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
 * "PaymentPartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Role played by a party in the context of a payment."</li>
 * </ul>
 */
public class PaymentPartyRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.CashAccount> cashAccount;
	/**
	 * Unambiguous identification of the account used in the context of the
	 * party role such as debtor account, instructing agent account...
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmPaymentPartyRole
	 * CashAccount.mmPaymentPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} = List of 503 elements</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole
	 * PaymentPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account used in the context of the party role such as debtor account, instructing agent account..."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> ListBuilderForPaymentPartyRole_00.addElems(new ArrayList<>());
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Unambiguous identification of the account used in the context of the party role such as debtor account, instructing agent account...";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmPaymentPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Payment> payment;
	/**
	 * Identifies the payment in which a party plays a role.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPartyRole
	 * Payment.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole
	 * PaymentPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the payment in which a party plays a role."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Identifies the payment in which a party plays a role.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentPartyRole";
				definition = "Role played by a party in the context of a payment.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmPaymentPartyRole, com.tools20022.repository.entity.Payment.mmPartyRole);
				derivationElement_lazy = () -> Arrays.asList(PaymentSearch4.mmParties, SecuritiesTradeDetails4.mmCashParties, SecuritiesTradeDetails10.mmCashParties, InstrumentLeg2.mmCashParties, SingleQuote1.mmCashParties,
						InstrumentLeg3.mmCashParties, QuoteRequest1.mmCashParties, RequestForQuote.mmCashParties, PaymentSearch5.mmParties);
				subType_lazy = () -> Arrays.asList(InstructingAgentRole.mmObject(), InstructedAgentRole.mmObject(), DebtorRole.mmObject(), DebtorAgentRole.mmObject(), CreditorRole.mmObject(), IntermediaryAgentRole.mmObject(),
						CreditorAgentRole.mmObject(), ForwardingAgentRole.mmObject(), InitiatingPartyRole.mmObject());
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentPartyRole.mmCashAccount, com.tools20022.repository.entity.PaymentPartyRole.mmPayment);
				derivationComponent_lazy = () -> Arrays.asList(PaymentTransactionParty.mmObject(), PaymentTransactionParty2.mmObject(), CashParties1.mmObject(), CashParties3.mmObject(), CashParties8.mmObject(), CashParties14.mmObject(),
						CashParties2.mmObject(), CashParties5.mmObject(), CashParties10.mmObject(), CashParties12.mmObject(), CashParties4.mmObject(), CashParties7.mmObject(), CashParties13.mmObject(), CashParties17.mmObject(),
						CashParties19.mmObject(), CashParties6.mmObject(), TransactionParty1.mmObject(), TransactionParty2.mmObject(), TransactionParties3.mmObject(), CashParties18.mmObject(), SettlementParties1.mmObject(),
						SettlementParties9.mmObject(), SettlementParties29.mmObject(), CashParties11.mmObject(), CashParties9.mmObject(), CashParties15.mmObject(), CashParties16.mmObject(), CashParties24.mmObject(),
						CashParties21.mmObject(), CashParties23.mmObject(), CashParties26.mmObject(), CashParties25.mmObject(), CashParties28.mmObject(), CashParties29.mmObject(), CashParties30.mmObject(), CashParties32.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentPartyRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<CashAccount> getCashAccount() {
		return cashAccount;
	}

	public void setCashAccount(List<com.tools20022.repository.entity.CashAccount> cashAccount) {
		this.cashAccount = cashAccount;
	}

	public List<Payment> getPayment() {
		return payment;
	}

	public void setPayment(List<com.tools20022.repository.entity.Payment> payment) {
		this.payment = payment;
	}
}