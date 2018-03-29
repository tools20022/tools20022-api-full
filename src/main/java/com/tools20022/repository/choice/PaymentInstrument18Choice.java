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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.ChequePayment;
import com.tools20022.repository.entity.DirectDebit;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DirectDebitMandate5;
import com.tools20022.repository.msg.PaymentCard18;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of payment instruments.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument18Choice#mmPaymentCardDetails
 * PaymentInstrument18Choice.mmPaymentCardDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument18Choice#mmDirectDebitDetails
 * PaymentInstrument18Choice.mmDirectDebitDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument18Choice#mmCheque
 * PaymentInstrument18Choice.mmCheque}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument18Choice#mmBankersDraft
 * PaymentInstrument18Choice.mmBankersDraft}</li>
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
 * "PaymentInstrument18Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of payment instruments."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument17Choice
 * PaymentInstrument17Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentInstrument18Choice", propOrder = {"paymentCardDetails", "directDebitDetails", "cheque", "bankersDraft"})
public class PaymentInstrument18Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtCardDtls", required = true)
	protected PaymentCard18 paymentCardDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentCard18
	 * PaymentCard18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmPaymentCard
	 * CardPayment.mmPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument18Choice
	 * PaymentInstrument18Choice}</li>
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
	 * definition} = "Settlement instructions for a payment by card."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument17Choice#mmPaymentCardDetails
	 * PaymentInstrument17Choice.mmPaymentCardDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstrument18Choice, PaymentCard18> mmPaymentCardDetails = new MMMessageAssociationEnd<PaymentInstrument18Choice, PaymentCard18>() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmPaymentCard;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentInstrument18Choice.mmObject();
			isDerived = false;
			xmlTag = "PmtCardDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentCardDetails";
			definition = "Settlement instructions for a payment by card.";
			previousVersion_lazy = () -> PaymentInstrument17Choice.mmPaymentCardDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PaymentCard18.mmObject();
		}

		@Override
		public PaymentCard18 getValue(PaymentInstrument18Choice obj) {
			return obj.getPaymentCardDetails();
		}

		@Override
		public void setValue(PaymentInstrument18Choice obj, PaymentCard18 value) {
			obj.setPaymentCardDetails(value);
		}
	};
	@XmlElement(name = "DrctDbtDtls", required = true)
	protected DirectDebitMandate5 directDebitDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DirectDebitMandate5
	 * DirectDebitMandate5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit DirectDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument18Choice
	 * PaymentInstrument18Choice}</li>
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
	 * definition} = "Settlement instructions for a payment by direct debit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument17Choice#mmDirectDebitDetails
	 * PaymentInstrument17Choice.mmDirectDebitDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstrument18Choice, DirectDebitMandate5> mmDirectDebitDetails = new MMMessageAssociationEnd<PaymentInstrument18Choice, DirectDebitMandate5>() {
		{
			businessComponentTrace_lazy = () -> DirectDebit.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentInstrument18Choice.mmObject();
			isDerived = false;
			xmlTag = "DrctDbtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectDebitDetails";
			definition = "Settlement instructions for a payment by direct debit.";
			previousVersion_lazy = () -> PaymentInstrument17Choice.mmDirectDebitDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DirectDebitMandate5.mmObject();
		}

		@Override
		public DirectDebitMandate5 getValue(PaymentInstrument18Choice obj) {
			return obj.getDirectDebitDetails();
		}

		@Override
		public void setValue(PaymentInstrument18Choice obj, DirectDebitMandate5 value) {
			obj.setDirectDebitDetails(value);
		}
	};
	@XmlElement(name = "Chq", required = true)
	protected YesNoIndicator cheque;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ChequePayment ChequePayment}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument18Choice
	 * PaymentInstrument18Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Chq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the payment is done via cheque."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument17Choice#mmCheque
	 * PaymentInstrument17Choice.mmCheque}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstrument18Choice, YesNoIndicator> mmCheque = new MMMessageAttribute<PaymentInstrument18Choice, YesNoIndicator>() {
		{
			businessComponentTrace_lazy = () -> ChequePayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentInstrument18Choice.mmObject();
			isDerived = false;
			xmlTag = "Chq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cheque";
			definition = "Indicates whether the payment is done via cheque.";
			previousVersion_lazy = () -> PaymentInstrument17Choice.mmCheque;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(PaymentInstrument18Choice obj) {
			return obj.getCheque();
		}

		@Override
		public void setValue(PaymentInstrument18Choice obj, YesNoIndicator value) {
			obj.setCheque(value);
		}
	};
	@XmlElement(name = "BkrsDrft", required = true)
	protected YesNoIndicator bankersDraft;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ChequePayment ChequePayment}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument18Choice
	 * PaymentInstrument18Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkrsDrft"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankersDraft"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the payment is done via draft."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument17Choice#mmBankersDraft
	 * PaymentInstrument17Choice.mmBankersDraft}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstrument18Choice, YesNoIndicator> mmBankersDraft = new MMMessageAttribute<PaymentInstrument18Choice, YesNoIndicator>() {
		{
			businessComponentTrace_lazy = () -> ChequePayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentInstrument18Choice.mmObject();
			isDerived = false;
			xmlTag = "BkrsDrft";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankersDraft";
			definition = "Indicates whether the payment is done via draft.";
			previousVersion_lazy = () -> PaymentInstrument17Choice.mmBankersDraft;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(PaymentInstrument18Choice obj) {
			return obj.getBankersDraft();
		}

		@Override
		public void setValue(PaymentInstrument18Choice obj, YesNoIndicator value) {
			obj.setBankersDraft(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentInstrument18Choice.mmPaymentCardDetails, com.tools20022.repository.choice.PaymentInstrument18Choice.mmDirectDebitDetails,
						com.tools20022.repository.choice.PaymentInstrument18Choice.mmCheque, com.tools20022.repository.choice.PaymentInstrument18Choice.mmBankersDraft);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentInstrument18Choice";
				definition = "Choice of payment instruments.";
				previousVersion_lazy = () -> PaymentInstrument17Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PaymentCard18 getPaymentCardDetails() {
		return paymentCardDetails;
	}

	public PaymentInstrument18Choice setPaymentCardDetails(PaymentCard18 paymentCardDetails) {
		this.paymentCardDetails = Objects.requireNonNull(paymentCardDetails);
		return this;
	}

	public DirectDebitMandate5 getDirectDebitDetails() {
		return directDebitDetails;
	}

	public PaymentInstrument18Choice setDirectDebitDetails(DirectDebitMandate5 directDebitDetails) {
		this.directDebitDetails = Objects.requireNonNull(directDebitDetails);
		return this;
	}

	public YesNoIndicator getCheque() {
		return cheque;
	}

	public PaymentInstrument18Choice setCheque(YesNoIndicator cheque) {
		this.cheque = Objects.requireNonNull(cheque);
		return this;
	}

	public YesNoIndicator getBankersDraft() {
		return bankersDraft;
	}

	public PaymentInstrument18Choice setBankersDraft(YesNoIndicator bankersDraft) {
		this.bankersDraft = Objects.requireNonNull(bankersDraft);
		return this;
	}
}