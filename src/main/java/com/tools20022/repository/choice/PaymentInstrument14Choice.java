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
import com.tools20022.repository.entity.CreditTransfer;
import com.tools20022.repository.entity.InvestmentAccount;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CreditTransfer7;
import com.tools20022.repository.msg.InvestmentAccount32;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between types of payment instrument, for example, credit transfer, or
 * investment account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument14Choice#mmCreditTransferDetails
 * PaymentInstrument14Choice.mmCreditTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument14Choice#mmCashAccountDetails
 * PaymentInstrument14Choice.mmCashAccountDetails}</li>
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
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentInstrument14Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between types of payment instrument, for example, credit transfer, or investment account."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentInstrument14Choice", propOrder = {"creditTransferDetails", "cashAccountDetails"})
public class PaymentInstrument14Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CdtTrfDtls", required = true)
	protected CreditTransfer7 creditTransferDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CreditTransfer7
	 * CreditTransfer7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CreditTransfer
	 * CreditTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument14Choice
	 * PaymentInstrument14Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditTransferDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CreditTransfer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentInstrument14Choice.mmObject();
			isDerived = false;
			xmlTag = "CdtTrfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditTransferDetails";
			definition = "Payment instrument between a debtor and a creditor, which flows through one or more financial institutions or systems.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CreditTransfer7.mmObject();
		}
	};
	@XmlElement(name = "CshAcctDtls", required = true)
	protected InvestmentAccount32 cashAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount32
	 * InvestmentAccount32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmCashAccount
	 * InvestmentAccount.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument14Choice
	 * PaymentInstrument14Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashAccountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentInstrument14Choice.mmObject();
			isDerived = false;
			xmlTag = "CshAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountDetails";
			definition = "Part of the investment account to or from which cash entries are made.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccount32.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentInstrument14Choice.mmCreditTransferDetails, com.tools20022.repository.choice.PaymentInstrument14Choice.mmCashAccountDetails);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PaymentInstrument14Choice";
				definition = "Choice between types of payment instrument, for example, credit transfer, or investment account.";
			}
		});
		return mmObject_lazy.get();
	}

	public CreditTransfer7 getCreditTransferDetails() {
		return creditTransferDetails;
	}

	public PaymentInstrument14Choice setCreditTransferDetails(CreditTransfer7 creditTransferDetails) {
		this.creditTransferDetails = Objects.requireNonNull(creditTransferDetails);
		return this;
	}

	public InvestmentAccount32 getCashAccountDetails() {
		return cashAccountDetails;
	}

	public PaymentInstrument14Choice setCashAccountDetails(InvestmentAccount32 cashAccountDetails) {
		this.cashAccountDetails = Objects.requireNonNull(cashAccountDetails);
		return this;
	}
}