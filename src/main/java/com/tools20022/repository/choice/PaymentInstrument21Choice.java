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
import com.tools20022.repository.entity.ChequeIssue;
import com.tools20022.repository.entity.CreditTransfer;
import com.tools20022.repository.entity.InvestmentAccount;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Cheque9;
import com.tools20022.repository.msg.CreditTransfer8;
import com.tools20022.repository.msg.InvestmentAccount60;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between types of payment instrument, that is, cheque, credit transfer
 * or investment account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument21Choice#mmCreditTransferDetails
 * PaymentInstrument21Choice.mmCreditTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument21Choice#mmChequeDetails
 * PaymentInstrument21Choice.mmChequeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument21Choice#mmBankersDraftDetails
 * PaymentInstrument21Choice.mmBankersDraftDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument21Choice#mmCashAccountDetails
 * PaymentInstrument21Choice.mmCashAccountDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
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
 * "PaymentInstrument21Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between types of payment instrument, that is, cheque, credit transfer or investment account."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument11Choice
 * PaymentInstrument11Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentInstrument21Choice", propOrder = {"creditTransferDetails", "chequeDetails", "bankersDraftDetails", "cashAccountDetails"})
public class PaymentInstrument21Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CdtTrfDtls", required = true)
	protected CreditTransfer8 creditTransferDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CreditTransfer8
	 * CreditTransfer8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CreditTransfer
	 * CreditTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument21Choice
	 * PaymentInstrument21Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument11Choice#mmCreditTransferDetails
	 * PaymentInstrument11Choice.mmCreditTransferDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditTransferDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CreditTransfer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentInstrument21Choice.mmObject();
			isDerived = false;
			xmlTag = "CdtTrfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditTransferDetails";
			definition = "Payment instrument between a debtor and a creditor, which flows through one or more financial institutions or systems.";
			previousVersion_lazy = () -> PaymentInstrument11Choice.mmCreditTransferDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CreditTransfer8.mmObject();
		}
	};
	@XmlElement(name = "ChqDtls", required = true)
	protected Cheque9 chequeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Cheque9 Cheque9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue ChequeIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument21Choice
	 * PaymentInstrument21Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument11Choice#mmChequeDetails
	 * PaymentInstrument11Choice.mmChequeDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmChequeDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ChequeIssue.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentInstrument21Choice.mmObject();
			isDerived = false;
			xmlTag = "ChqDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeDetails";
			definition = "Written order on which instructions are given to an account holder (a financial institution) to pay a stated sum to a named recipient (the payee).";
			previousVersion_lazy = () -> PaymentInstrument11Choice.mmChequeDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Cheque9.mmObject();
		}
	};
	@XmlElement(name = "BkrsDrftDtls", required = true)
	protected Cheque9 bankersDraftDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Cheque9 Cheque9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue ChequeIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument21Choice
	 * PaymentInstrument21Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument11Choice#mmBankersDraftDetails
	 * PaymentInstrument11Choice.mmBankersDraftDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBankersDraftDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ChequeIssue.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentInstrument21Choice.mmObject();
			isDerived = false;
			xmlTag = "BkrsDrftDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankersDraftDetails";
			definition = "Cheque drawn by a bank on itself or its agent. A person who owes money to another buys the draft from a bank for cash and hands it to the creditor.";
			previousVersion_lazy = () -> PaymentInstrument11Choice.mmBankersDraftDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Cheque9.mmObject();
		}
	};
	@XmlElement(name = "CshAcctDtls", required = true)
	protected InvestmentAccount60 cashAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount60
	 * InvestmentAccount60}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmCashAccount
	 * InvestmentAccount.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument21Choice
	 * PaymentInstrument21Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument11Choice#mmCashAccountDetails
	 * PaymentInstrument11Choice.mmCashAccountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashAccountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentInstrument21Choice.mmObject();
			isDerived = false;
			xmlTag = "CshAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountDetails";
			definition = "Part of the investment account to or from which cash entries are made.";
			previousVersion_lazy = () -> PaymentInstrument11Choice.mmCashAccountDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccount60.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentInstrument21Choice.mmCreditTransferDetails, com.tools20022.repository.choice.PaymentInstrument21Choice.mmChequeDetails,
						com.tools20022.repository.choice.PaymentInstrument21Choice.mmBankersDraftDetails, com.tools20022.repository.choice.PaymentInstrument21Choice.mmCashAccountDetails);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentInstrument21Choice";
				definition = "Choice between types of payment instrument, that is, cheque, credit transfer or investment account.";
				previousVersion_lazy = () -> PaymentInstrument11Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CreditTransfer8 getCreditTransferDetails() {
		return creditTransferDetails;
	}

	public PaymentInstrument21Choice setCreditTransferDetails(CreditTransfer8 creditTransferDetails) {
		this.creditTransferDetails = Objects.requireNonNull(creditTransferDetails);
		return this;
	}

	public Cheque9 getChequeDetails() {
		return chequeDetails;
	}

	public PaymentInstrument21Choice setChequeDetails(Cheque9 chequeDetails) {
		this.chequeDetails = Objects.requireNonNull(chequeDetails);
		return this;
	}

	public Cheque9 getBankersDraftDetails() {
		return bankersDraftDetails;
	}

	public PaymentInstrument21Choice setBankersDraftDetails(Cheque9 bankersDraftDetails) {
		this.bankersDraftDetails = Objects.requireNonNull(bankersDraftDetails);
		return this;
	}

	public InvestmentAccount60 getCashAccountDetails() {
		return cashAccountDetails;
	}

	public PaymentInstrument21Choice setCashAccountDetails(InvestmentAccount60 cashAccountDetails) {
		this.cashAccountDetails = Objects.requireNonNull(cashAccountDetails);
		return this;
	}
}