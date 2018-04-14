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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.DataModification2Code;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PaymentInstrument6;
import com.tools20022.repository.msg.PaymentInstrument7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Settlement instructions to be used to transfer cash from the Debtor to the
 * Creditor.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2#mmModificationScopeIndication
 * InvestmentFundCashSettlementInformation2.mmModificationScopeIndication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2#mmSubscriptionPaymentInstrument
 * InvestmentFundCashSettlementInformation2.mmSubscriptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2#mmRedemptionPaymentInstrument
 * InvestmentFundCashSettlementInformation2.mmRedemptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2#mmDividendPaymentInstrument
 * InvestmentFundCashSettlementInformation2.mmDividendPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2#mmSavingsPlanPaymentInstrument
 * InvestmentFundCashSettlementInformation2.mmSavingsPlanPaymentInstrument}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentFundCashSettlementInformation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Settlement instructions to be used to transfer cash from the Debtor to the Creditor."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentFundCashSettlementInformation2", propOrder = {"modificationScopeIndication", "subscriptionPaymentInstrument", "redemptionPaymentInstrument", "dividendPaymentInstrument", "savingsPlanPaymentInstrument"})
public class InvestmentFundCashSettlementInformation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ModScpIndctn", required = true)
	protected DataModification2Code modificationScopeIndication;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DataModification2Code
	 * DataModification2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2
	 * InvestmentFundCashSettlementInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModScpIndctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationScopeIndication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of modification to be applied on a set of information."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundCashSettlementInformation2, DataModification2Code> mmModificationScopeIndication = new MMMessageAttribute<InvestmentFundCashSettlementInformation2, DataModification2Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2.mmObject();
			isDerived = false;
			xmlTag = "ModScpIndctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationScopeIndication";
			definition = "Specifies the type of modification to be applied on a set of information.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DataModification2Code.mmObject();
		}

		@Override
		public DataModification2Code getValue(InvestmentFundCashSettlementInformation2 obj) {
			return obj.getModificationScopeIndication();
		}

		@Override
		public void setValue(InvestmentFundCashSettlementInformation2 obj, DataModification2Code value) {
			obj.setModificationScopeIndication(value);
		}
	};
	@XmlElement(name = "SbcptPmtInstrm")
	protected PaymentInstrument7 subscriptionPaymentInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentInstrument7
	 * PaymentInstrument7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2
	 * InvestmentFundCashSettlementInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcptPmtInstrm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionPaymentInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instrument that has or represents monetary value and is used to process a payment instruction for a subscription payment.\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentFundCashSettlementInformation2, Optional<PaymentInstrument7>> mmSubscriptionPaymentInstrument = new MMMessageAssociationEnd<InvestmentFundCashSettlementInformation2, Optional<PaymentInstrument7>>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2.mmObject();
			isDerived = false;
			xmlTag = "SbcptPmtInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionPaymentInstrument";
			definition = "Instrument that has or represents monetary value and is used to process a payment instruction for a subscription payment.\n.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentInstrument7.mmObject();
		}

		@Override
		public Optional<PaymentInstrument7> getValue(InvestmentFundCashSettlementInformation2 obj) {
			return obj.getSubscriptionPaymentInstrument();
		}

		@Override
		public void setValue(InvestmentFundCashSettlementInformation2 obj, Optional<PaymentInstrument7> value) {
			obj.setSubscriptionPaymentInstrument(value.orElse(null));
		}
	};
	@XmlElement(name = "RedPmtInstrm")
	protected PaymentInstrument6 redemptionPaymentInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentInstrument6
	 * PaymentInstrument6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2
	 * InvestmentFundCashSettlementInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedPmtInstrm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionPaymentInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instrument that has or represents monetary value and is used to process a payment instruction for a redemption payment.\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentFundCashSettlementInformation2, Optional<PaymentInstrument6>> mmRedemptionPaymentInstrument = new MMMessageAssociationEnd<InvestmentFundCashSettlementInformation2, Optional<PaymentInstrument6>>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2.mmObject();
			isDerived = false;
			xmlTag = "RedPmtInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionPaymentInstrument";
			definition = "Instrument that has or represents monetary value and is used to process a payment instruction for a redemption payment.\n.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentInstrument6.mmObject();
		}

		@Override
		public Optional<PaymentInstrument6> getValue(InvestmentFundCashSettlementInformation2 obj) {
			return obj.getRedemptionPaymentInstrument();
		}

		@Override
		public void setValue(InvestmentFundCashSettlementInformation2 obj, Optional<PaymentInstrument6> value) {
			obj.setRedemptionPaymentInstrument(value.orElse(null));
		}
	};
	@XmlElement(name = "DvddPmtInstrm")
	protected PaymentInstrument6 dividendPaymentInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentInstrument6
	 * PaymentInstrument6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2
	 * InvestmentFundCashSettlementInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DvddPmtInstrm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPaymentInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instrument that has or represents monetary value and is used to process a payment instruction for a dividend payment.\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentFundCashSettlementInformation2, Optional<PaymentInstrument6>> mmDividendPaymentInstrument = new MMMessageAssociationEnd<InvestmentFundCashSettlementInformation2, Optional<PaymentInstrument6>>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2.mmObject();
			isDerived = false;
			xmlTag = "DvddPmtInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPaymentInstrument";
			definition = "Instrument that has or represents monetary value and is used to process a payment instruction for a dividend payment.\n.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentInstrument6.mmObject();
		}

		@Override
		public Optional<PaymentInstrument6> getValue(InvestmentFundCashSettlementInformation2 obj) {
			return obj.getDividendPaymentInstrument();
		}

		@Override
		public void setValue(InvestmentFundCashSettlementInformation2 obj, Optional<PaymentInstrument6> value) {
			obj.setDividendPaymentInstrument(value.orElse(null));
		}
	};
	@XmlElement(name = "SvgsPlanPmtInstrm")
	protected PaymentInstrument7 savingsPlanPaymentInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentInstrument7
	 * PaymentInstrument7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2
	 * InvestmentFundCashSettlementInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvgsPlanPmtInstrm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SavingsPlanPaymentInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instrument that has or represents monetary value and is used to process a payment instruction for a savings plan payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentFundCashSettlementInformation2, Optional<PaymentInstrument7>> mmSavingsPlanPaymentInstrument = new MMMessageAssociationEnd<InvestmentFundCashSettlementInformation2, Optional<PaymentInstrument7>>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2.mmObject();
			isDerived = false;
			xmlTag = "SvgsPlanPmtInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SavingsPlanPaymentInstrument";
			definition = "Instrument that has or represents monetary value and is used to process a payment instruction for a savings plan payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentInstrument7.mmObject();
		}

		@Override
		public Optional<PaymentInstrument7> getValue(InvestmentFundCashSettlementInformation2 obj) {
			return obj.getSavingsPlanPaymentInstrument();
		}

		@Override
		public void setValue(InvestmentFundCashSettlementInformation2 obj, Optional<PaymentInstrument7> value) {
			obj.setSavingsPlanPaymentInstrument(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2.mmModificationScopeIndication,
						com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2.mmSubscriptionPaymentInstrument, com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2.mmRedemptionPaymentInstrument,
						com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2.mmDividendPaymentInstrument, com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2.mmSavingsPlanPaymentInstrument);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "InvestmentFundCashSettlementInformation2";
				definition = "Settlement instructions to be used to transfer cash from the Debtor to the Creditor.";
			}
		});
		return mmObject_lazy.get();
	}

	public DataModification2Code getModificationScopeIndication() {
		return modificationScopeIndication;
	}

	public InvestmentFundCashSettlementInformation2 setModificationScopeIndication(DataModification2Code modificationScopeIndication) {
		this.modificationScopeIndication = Objects.requireNonNull(modificationScopeIndication);
		return this;
	}

	public Optional<PaymentInstrument7> getSubscriptionPaymentInstrument() {
		return subscriptionPaymentInstrument == null ? Optional.empty() : Optional.of(subscriptionPaymentInstrument);
	}

	public InvestmentFundCashSettlementInformation2 setSubscriptionPaymentInstrument(PaymentInstrument7 subscriptionPaymentInstrument) {
		this.subscriptionPaymentInstrument = subscriptionPaymentInstrument;
		return this;
	}

	public Optional<PaymentInstrument6> getRedemptionPaymentInstrument() {
		return redemptionPaymentInstrument == null ? Optional.empty() : Optional.of(redemptionPaymentInstrument);
	}

	public InvestmentFundCashSettlementInformation2 setRedemptionPaymentInstrument(PaymentInstrument6 redemptionPaymentInstrument) {
		this.redemptionPaymentInstrument = redemptionPaymentInstrument;
		return this;
	}

	public Optional<PaymentInstrument6> getDividendPaymentInstrument() {
		return dividendPaymentInstrument == null ? Optional.empty() : Optional.of(dividendPaymentInstrument);
	}

	public InvestmentFundCashSettlementInformation2 setDividendPaymentInstrument(PaymentInstrument6 dividendPaymentInstrument) {
		this.dividendPaymentInstrument = dividendPaymentInstrument;
		return this;
	}

	public Optional<PaymentInstrument7> getSavingsPlanPaymentInstrument() {
		return savingsPlanPaymentInstrument == null ? Optional.empty() : Optional.of(savingsPlanPaymentInstrument);
	}

	public InvestmentFundCashSettlementInformation2 setSavingsPlanPaymentInstrument(PaymentInstrument7 savingsPlanPaymentInstrument) {
		this.savingsPlanPaymentInstrument = savingsPlanPaymentInstrument;
		return this;
	}
}