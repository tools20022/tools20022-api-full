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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between types of payment instrument, ie, cheque, credit transfer,
 * direct debit, investment account or payment card.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument12Choice#mmPaymentCardDetails
 * PaymentInstrument12Choice.mmPaymentCardDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument12Choice#mmCreditTransferDetails
 * PaymentInstrument12Choice.mmCreditTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument12Choice#mmDirectDebitDetails
 * PaymentInstrument12Choice.mmDirectDebitDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument12Choice#mmChequeDetails
 * PaymentInstrument12Choice.mmChequeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument12Choice#mmBankersDraftDetails
 * PaymentInstrument12Choice.mmBankersDraftDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument12Choice#mmCashAccountDetails
 * PaymentInstrument12Choice.mmCashAccountDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
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
 * "PaymentInstrument12Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between types of payment instrument, ie, cheque, credit transfer, direct debit, investment account or payment card."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentInstrument20Choice
 * PaymentInstrument20Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PaymentInstrument12Choice", propOrder = {"paymentCardDetails", "creditTransferDetails", "directDebitDetails", "chequeDetails", "bankersDraftDetails", "cashAccountDetails"})
public class PaymentInstrument12Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected PaymentCard2 paymentCardDetails;
	/**
	 * Electronic money product that provides the cardholder with a portable and
	 * specialised computer device, which typically contains a microprocessor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentCard2
	 * PaymentCard2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmPaymentCard
	 * CardPayment.mmPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument12Choice
	 * PaymentInstrument12Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtCardDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCardDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Electronic money product that provides the cardholder with a portable and specialised computer device, which typically contains a microprocessor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument20Choice#mmPaymentCardDetails
	 * PaymentInstrument20Choice.mmPaymentCardDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentCardDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmPaymentCard;
			componentContext_lazy = () -> PaymentInstrument12Choice.mmObject();
			isDerived = false;
			xmlTag = "PmtCardDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentCardDetails";
			definition = "Electronic money product that provides the cardholder with a portable and specialised computer device, which typically contains a microprocessor.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstrument20Choice.mmPaymentCardDetails);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PaymentCard2.mmObject();
		}
	};
	protected CreditTransfer6 creditTransferDetails;
	/**
	 * Payment instrument between a debtor and a creditor, which flows through
	 * one or more financial institutions or systems.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CreditTransfer6
	 * CreditTransfer6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CreditTransfer
	 * CreditTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument12Choice
	 * PaymentInstrument12Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtTrfDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditTransferDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment instrument between a debtor and a creditor, which flows through one or more financial institutions or systems."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument20Choice#mmCreditTransferDetails
	 * PaymentInstrument20Choice.mmCreditTransferDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditTransferDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CreditTransfer.mmObject();
			componentContext_lazy = () -> PaymentInstrument12Choice.mmObject();
			isDerived = false;
			xmlTag = "CdtTrfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditTransferDetails";
			definition = "Payment instrument between a debtor and a creditor, which flows through one or more financial institutions or systems.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstrument20Choice.mmCreditTransferDetails);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CreditTransfer6.mmObject();
		}
	};
	protected DirectDebitMandate4 directDebitDetails;
	/**
	 * Instruction, initiated by the creditor, to debit a debtor's account in
	 * favour of the creditor. A direct debit can be pre-authorised or not. In
	 * most countries, authorisation is in the form of a mandate between the
	 * debtor and creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DirectDebitMandate4
	 * DirectDebitMandate4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit DirectDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument12Choice
	 * PaymentInstrument12Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrctDbtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectDebitDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction, initiated by the creditor, to debit a debtor's account in favour of the creditor. A direct debit can be pre-authorised or not. In most countries, authorisation is in the form of a mandate between the debtor and creditor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument20Choice#mmDirectDebitDetails
	 * PaymentInstrument20Choice.mmDirectDebitDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDirectDebitDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> DirectDebit.mmObject();
			componentContext_lazy = () -> PaymentInstrument12Choice.mmObject();
			isDerived = false;
			xmlTag = "DrctDbtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectDebitDetails";
			definition = "Instruction, initiated by the creditor, to debit a debtor's account in favour of the creditor. A direct debit can be pre-authorised or not. In most countries, authorisation is in the form of a mandate between the debtor and creditor.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstrument20Choice.mmDirectDebitDetails);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DirectDebitMandate4.mmObject();
		}
	};
	protected Cheque3 chequeDetails;
	/**
	 * Written order on which instructions are given to an account holder (a
	 * financial institution) to pay a stated sum to a named recipient (the
	 * payee).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Cheque3 Cheque3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue ChequeIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument12Choice
	 * PaymentInstrument12Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChqDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Written order on which instructions are given to an account holder (a financial institution) to pay a stated sum to a named recipient (the payee)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument20Choice#mmChequeDetails
	 * PaymentInstrument20Choice.mmChequeDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmChequeDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ChequeIssue.mmObject();
			componentContext_lazy = () -> PaymentInstrument12Choice.mmObject();
			isDerived = false;
			xmlTag = "ChqDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeDetails";
			definition = "Written order on which instructions are given to an account holder (a financial institution) to pay a stated sum to a named recipient (the payee).";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstrument20Choice.mmChequeDetails);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Cheque3.mmObject();
		}
	};
	protected Cheque3 bankersDraftDetails;
	/**
	 * Cheque drawn by a bank on itself or its agent. A person who owes money to
	 * another buys the draft from a bank for cash and hands it to the creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Cheque3 Cheque3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue ChequeIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument12Choice
	 * PaymentInstrument12Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkrsDrftDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankersDraftDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cheque drawn by a bank on itself or its agent. A person who owes money to another buys the draft from a bank for cash and hands it to the creditor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument20Choice#mmBankersDraftDetails
	 * PaymentInstrument20Choice.mmBankersDraftDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBankersDraftDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ChequeIssue.mmObject();
			componentContext_lazy = () -> PaymentInstrument12Choice.mmObject();
			isDerived = false;
			xmlTag = "BkrsDrftDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankersDraftDetails";
			definition = "Cheque drawn by a bank on itself or its agent. A person who owes money to another buys the draft from a bank for cash and hands it to the creditor.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstrument20Choice.mmBankersDraftDetails);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Cheque3.mmObject();
		}
	};
	protected InvestmentAccount20 cashAccountDetails;
	/**
	 * Part of the investment account to or from which cash entries are made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount20
	 * InvestmentAccount20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmCashAccount
	 * InvestmentAccount.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument12Choice
	 * PaymentInstrument12Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of the investment account to or from which cash entries are made."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument20Choice#mmCashAccountDetails
	 * PaymentInstrument20Choice.mmCashAccountDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashAccountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmCashAccount;
			componentContext_lazy = () -> PaymentInstrument12Choice.mmObject();
			isDerived = false;
			xmlTag = "CshAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountDetails";
			definition = "Part of the investment account to or from which cash entries are made.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstrument20Choice.mmCashAccountDetails);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccount20.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PaymentInstrument12Choice.mmPaymentCardDetails, PaymentInstrument12Choice.mmCreditTransferDetails, PaymentInstrument12Choice.mmDirectDebitDetails,
						PaymentInstrument12Choice.mmChequeDetails, PaymentInstrument12Choice.mmBankersDraftDetails, PaymentInstrument12Choice.mmCashAccountDetails);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentInstrument12Choice";
				definition = "Choice between types of payment instrument, ie, cheque, credit transfer, direct debit, investment account or payment card.";
				nextVersions_lazy = () -> Arrays.asList(PaymentInstrument20Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PmtCardDtls", required = true)
	public PaymentCard2 getPaymentCardDetails() {
		return paymentCardDetails;
	}

	public void setPaymentCardDetails(PaymentCard2 paymentCardDetails) {
		this.paymentCardDetails = paymentCardDetails;
	}

	@XmlElement(name = "CdtTrfDtls", required = true)
	public CreditTransfer6 getCreditTransferDetails() {
		return creditTransferDetails;
	}

	public void setCreditTransferDetails(CreditTransfer6 creditTransferDetails) {
		this.creditTransferDetails = creditTransferDetails;
	}

	@XmlElement(name = "DrctDbtDtls", required = true)
	public DirectDebitMandate4 getDirectDebitDetails() {
		return directDebitDetails;
	}

	public void setDirectDebitDetails(DirectDebitMandate4 directDebitDetails) {
		this.directDebitDetails = directDebitDetails;
	}

	@XmlElement(name = "ChqDtls", required = true)
	public Cheque3 getChequeDetails() {
		return chequeDetails;
	}

	public void setChequeDetails(Cheque3 chequeDetails) {
		this.chequeDetails = chequeDetails;
	}

	@XmlElement(name = "BkrsDrftDtls", required = true)
	public Cheque3 getBankersDraftDetails() {
		return bankersDraftDetails;
	}

	public void setBankersDraftDetails(Cheque3 bankersDraftDetails) {
		this.bankersDraftDetails = bankersDraftDetails;
	}

	@XmlElement(name = "CshAcctDtls", required = true)
	public InvestmentAccount20 getCashAccountDetails() {
		return cashAccountDetails;
	}

	public void setCashAccountDetails(InvestmentAccount20 cashAccountDetails) {
		this.cashAccountDetails = cashAccountDetails;
	}
}