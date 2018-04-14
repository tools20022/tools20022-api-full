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
import com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03;
import com.tools20022.repository.area.acmt.AccountOpeningInstructionV03;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PaymentInstrument10;
import com.tools20022.repository.msg.PaymentInstrument11;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5#mmSubscriptionPaymentInstrument
 * InvestmentFundCashSettlementInformation5.mmSubscriptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5#mmRedemptionPaymentInstrument
 * InvestmentFundCashSettlementInformation5.mmRedemptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5#mmDividendPaymentInstrument
 * InvestmentFundCashSettlementInformation5.mmDividendPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5#mmSavingsPlanPaymentInstrument
 * InvestmentFundCashSettlementInformation5.mmSavingsPlanPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5#mmInterestPaymentInstrument
 * InvestmentFundCashSettlementInformation5.mmInterestPaymentInstrument}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#mmCashSettlement
 * AccountDetailsConfirmationV03.mmCashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmCashSettlement
 * AccountOpeningInstructionV03.mmCashSettlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentFundCashSettlementInformation5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Settlement instructions to be used to transfer cash from the Debtor to the Creditor."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation7
 * InvestmentFundCashSettlementInformation7}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation3
 * InvestmentFundCashSettlementInformation3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentFundCashSettlementInformation5", propOrder = {"subscriptionPaymentInstrument", "redemptionPaymentInstrument", "dividendPaymentInstrument", "savingsPlanPaymentInstrument", "interestPaymentInstrument"})
public class InvestmentFundCashSettlementInformation5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SbcptPmtInstrm")
	protected PaymentInstrument11 subscriptionPaymentInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentInstrument11
	 * PaymentInstrument11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5
	 * InvestmentFundCashSettlementInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcptPmtInstrm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionPaymentInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instrument that has or represents monetary value and is used to process a payment instruction for a subscription payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation7#mmSubscriptionPaymentInstrument
	 * InvestmentFundCashSettlementInformation7.mmSubscriptionPaymentInstrument}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentFundCashSettlementInformation5, Optional<PaymentInstrument11>> mmSubscriptionPaymentInstrument = new MMMessageAssociationEnd<InvestmentFundCashSettlementInformation5, Optional<PaymentInstrument11>>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5.mmObject();
			isDerived = false;
			xmlTag = "SbcptPmtInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionPaymentInstrument";
			definition = "Instrument that has or represents monetary value and is used to process a payment instruction for a subscription payment.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentFundCashSettlementInformation7.mmSubscriptionPaymentInstrument);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentInstrument11.mmObject();
		}

		@Override
		public Optional<PaymentInstrument11> getValue(InvestmentFundCashSettlementInformation5 obj) {
			return obj.getSubscriptionPaymentInstrument();
		}

		@Override
		public void setValue(InvestmentFundCashSettlementInformation5 obj, Optional<PaymentInstrument11> value) {
			obj.setSubscriptionPaymentInstrument(value.orElse(null));
		}
	};
	@XmlElement(name = "RedPmtInstrm")
	protected PaymentInstrument10 redemptionPaymentInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentInstrument10
	 * PaymentInstrument10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5
	 * InvestmentFundCashSettlementInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedPmtInstrm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionPaymentInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instrument that has or represents monetary value and is used to process a payment instruction for a redemption payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation7#mmRedemptionPaymentInstrument
	 * InvestmentFundCashSettlementInformation7.mmRedemptionPaymentInstrument}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentFundCashSettlementInformation5, Optional<PaymentInstrument10>> mmRedemptionPaymentInstrument = new MMMessageAssociationEnd<InvestmentFundCashSettlementInformation5, Optional<PaymentInstrument10>>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5.mmObject();
			isDerived = false;
			xmlTag = "RedPmtInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionPaymentInstrument";
			definition = "Instrument that has or represents monetary value and is used to process a payment instruction for a redemption payment.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentFundCashSettlementInformation7.mmRedemptionPaymentInstrument);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentInstrument10.mmObject();
		}

		@Override
		public Optional<PaymentInstrument10> getValue(InvestmentFundCashSettlementInformation5 obj) {
			return obj.getRedemptionPaymentInstrument();
		}

		@Override
		public void setValue(InvestmentFundCashSettlementInformation5 obj, Optional<PaymentInstrument10> value) {
			obj.setRedemptionPaymentInstrument(value.orElse(null));
		}
	};
	@XmlElement(name = "DvddPmtInstrm")
	protected PaymentInstrument10 dividendPaymentInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentInstrument10
	 * PaymentInstrument10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5
	 * InvestmentFundCashSettlementInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DvddPmtInstrm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPaymentInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instrument that has or represents monetary value and is used to process a payment instruction for a dividend payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation7#mmDividendPaymentInstrument
	 * InvestmentFundCashSettlementInformation7.mmDividendPaymentInstrument}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentFundCashSettlementInformation5, Optional<PaymentInstrument10>> mmDividendPaymentInstrument = new MMMessageAssociationEnd<InvestmentFundCashSettlementInformation5, Optional<PaymentInstrument10>>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5.mmObject();
			isDerived = false;
			xmlTag = "DvddPmtInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPaymentInstrument";
			definition = "Instrument that has or represents monetary value and is used to process a payment instruction for a dividend payment.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentFundCashSettlementInformation7.mmDividendPaymentInstrument);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentInstrument10.mmObject();
		}

		@Override
		public Optional<PaymentInstrument10> getValue(InvestmentFundCashSettlementInformation5 obj) {
			return obj.getDividendPaymentInstrument();
		}

		@Override
		public void setValue(InvestmentFundCashSettlementInformation5 obj, Optional<PaymentInstrument10> value) {
			obj.setDividendPaymentInstrument(value.orElse(null));
		}
	};
	@XmlElement(name = "SvgsPlanPmtInstrm")
	protected PaymentInstrument11 savingsPlanPaymentInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentInstrument11
	 * PaymentInstrument11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5
	 * InvestmentFundCashSettlementInformation5}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation7#mmSavingsPlanPaymentInstrument
	 * InvestmentFundCashSettlementInformation7.mmSavingsPlanPaymentInstrument}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentFundCashSettlementInformation5, Optional<PaymentInstrument11>> mmSavingsPlanPaymentInstrument = new MMMessageAssociationEnd<InvestmentFundCashSettlementInformation5, Optional<PaymentInstrument11>>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5.mmObject();
			isDerived = false;
			xmlTag = "SvgsPlanPmtInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SavingsPlanPaymentInstrument";
			definition = "Instrument that has or represents monetary value and is used to process a payment instruction for a savings plan payment.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentFundCashSettlementInformation7.mmSavingsPlanPaymentInstrument);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentInstrument11.mmObject();
		}

		@Override
		public Optional<PaymentInstrument11> getValue(InvestmentFundCashSettlementInformation5 obj) {
			return obj.getSavingsPlanPaymentInstrument();
		}

		@Override
		public void setValue(InvestmentFundCashSettlementInformation5 obj, Optional<PaymentInstrument11> value) {
			obj.setSavingsPlanPaymentInstrument(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrstPmtInstrm")
	protected PaymentInstrument10 interestPaymentInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument10
	 * PaymentInstrument10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5
	 * InvestmentFundCashSettlementInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstPmtInstrm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaymentInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instrument that has or represents monetary value and is used to process a payment instruction for an interest payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation7#mmInterestPaymentInstrument
	 * InvestmentFundCashSettlementInformation7.mmInterestPaymentInstrument}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundCashSettlementInformation5, Optional<PaymentInstrument10>> mmInterestPaymentInstrument = new MMMessageAttribute<InvestmentFundCashSettlementInformation5, Optional<PaymentInstrument10>>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5.mmObject();
			isDerived = false;
			xmlTag = "IntrstPmtInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentInstrument";
			definition = "Instrument that has or represents monetary value and is used to process a payment instruction for an interest payment.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentFundCashSettlementInformation7.mmInterestPaymentInstrument);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PaymentInstrument10.mmObject();
		}

		@Override
		public Optional<PaymentInstrument10> getValue(InvestmentFundCashSettlementInformation5 obj) {
			return obj.getInterestPaymentInstrument();
		}

		@Override
		public void setValue(InvestmentFundCashSettlementInformation5 obj, Optional<PaymentInstrument10> value) {
			obj.setInterestPaymentInstrument(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5.mmSubscriptionPaymentInstrument,
						com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5.mmRedemptionPaymentInstrument, com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5.mmDividendPaymentInstrument,
						com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5.mmSavingsPlanPaymentInstrument, com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5.mmInterestPaymentInstrument);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountDetailsConfirmationV03.mmCashSettlement, AccountOpeningInstructionV03.mmCashSettlement);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundCashSettlementInformation5";
				definition = "Settlement instructions to be used to transfer cash from the Debtor to the Creditor.";
				nextVersions_lazy = () -> Arrays.asList(InvestmentFundCashSettlementInformation7.mmObject());
				previousVersion_lazy = () -> InvestmentFundCashSettlementInformation3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PaymentInstrument11> getSubscriptionPaymentInstrument() {
		return subscriptionPaymentInstrument == null ? Optional.empty() : Optional.of(subscriptionPaymentInstrument);
	}

	public InvestmentFundCashSettlementInformation5 setSubscriptionPaymentInstrument(PaymentInstrument11 subscriptionPaymentInstrument) {
		this.subscriptionPaymentInstrument = subscriptionPaymentInstrument;
		return this;
	}

	public Optional<PaymentInstrument10> getRedemptionPaymentInstrument() {
		return redemptionPaymentInstrument == null ? Optional.empty() : Optional.of(redemptionPaymentInstrument);
	}

	public InvestmentFundCashSettlementInformation5 setRedemptionPaymentInstrument(PaymentInstrument10 redemptionPaymentInstrument) {
		this.redemptionPaymentInstrument = redemptionPaymentInstrument;
		return this;
	}

	public Optional<PaymentInstrument10> getDividendPaymentInstrument() {
		return dividendPaymentInstrument == null ? Optional.empty() : Optional.of(dividendPaymentInstrument);
	}

	public InvestmentFundCashSettlementInformation5 setDividendPaymentInstrument(PaymentInstrument10 dividendPaymentInstrument) {
		this.dividendPaymentInstrument = dividendPaymentInstrument;
		return this;
	}

	public Optional<PaymentInstrument11> getSavingsPlanPaymentInstrument() {
		return savingsPlanPaymentInstrument == null ? Optional.empty() : Optional.of(savingsPlanPaymentInstrument);
	}

	public InvestmentFundCashSettlementInformation5 setSavingsPlanPaymentInstrument(PaymentInstrument11 savingsPlanPaymentInstrument) {
		this.savingsPlanPaymentInstrument = savingsPlanPaymentInstrument;
		return this;
	}

	public Optional<PaymentInstrument10> getInterestPaymentInstrument() {
		return interestPaymentInstrument == null ? Optional.empty() : Optional.of(interestPaymentInstrument);
	}

	public InvestmentFundCashSettlementInformation5 setInterestPaymentInstrument(PaymentInstrument10 interestPaymentInstrument) {
		this.interestPaymentInstrument = interestPaymentInstrument;
		return this;
	}
}