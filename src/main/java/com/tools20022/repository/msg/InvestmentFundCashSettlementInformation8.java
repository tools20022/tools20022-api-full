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
import com.tools20022.repository.codeset.DataModification2Code;
import com.tools20022.repository.entity.Payment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Settlement instructions to be used to transfer cash from the debtor to the
 * creditor.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8#mmModificationScopeIndication
 * InvestmentFundCashSettlementInformation8.mmModificationScopeIndication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8#mmSubscriptionPaymentInstrument
 * InvestmentFundCashSettlementInformation8.mmSubscriptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8#mmRedemptionPaymentInstrument
 * InvestmentFundCashSettlementInformation8.mmRedemptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8#mmDividendPaymentInstrument
 * InvestmentFundCashSettlementInformation8.mmDividendPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8#mmSavingsPlanPaymentInstrument
 * InvestmentFundCashSettlementInformation8.mmSavingsPlanPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8#mmInterestPaymentInstrument
 * InvestmentFundCashSettlementInformation8.mmInterestPaymentInstrument}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmModifiedCashSettlement
 * AccountModificationInstructionV04.mmModifiedCashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05#mmModifiedCashSettlement
 * AccountModificationInstructionV05.mmModifiedCashSettlement}</li>
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
 * "InvestmentFundCashSettlementInformation8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Settlement instructions to be used to transfer cash from the debtor to the creditor."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6
 * InvestmentFundCashSettlementInformation6}</li>
 * </ul>
 */
public class InvestmentFundCashSettlementInformation8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DataModification2Code modificationScopeIndication;
	/**
	 * Specifies the type of modification to be applied on a set of information.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8
	 * InvestmentFundCashSettlementInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModScpIndctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationScopeIndication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of modification to be applied on a set of information."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashSettlement2#mmModificationScopeIndication
	 * CashSettlement2.mmModificationScopeIndication}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6#mmModificationScopeIndication
	 * InvestmentFundCashSettlementInformation6.mmModificationScopeIndication}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmModificationScopeIndication = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentFundCashSettlementInformation8.mmObject();
			isDerived = false;
			xmlTag = "ModScpIndctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationScopeIndication";
			definition = "Specifies the type of modification to be applied on a set of information.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashSettlement2.mmModificationScopeIndication);
			previousVersion_lazy = () -> com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6.mmModificationScopeIndication;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DataModification2Code.mmObject();
		}
	};
	protected PaymentInstrument11 subscriptionPaymentInstrument;
	/**
	 * Instrument that has or represents monetary value and is used to process a
	 * payment instruction for a subscription payment.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8
	 * InvestmentFundCashSettlementInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcptPmtInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionPaymentInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instrument that has or represents monetary value and is used to process a payment instruction for a subscription payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6#mmSubscriptionPaymentInstrument
	 * InvestmentFundCashSettlementInformation6.mmSubscriptionPaymentInstrument}
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubscriptionPaymentInstrument = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> InvestmentFundCashSettlementInformation8.mmObject();
			isDerived = false;
			xmlTag = "SbcptPmtInstrm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionPaymentInstrument";
			definition = "Instrument that has or represents monetary value and is used to process a payment instruction for a subscription payment.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6.mmSubscriptionPaymentInstrument;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentInstrument11.mmObject();
		}
	};
	protected PaymentInstrument12 redemptionPaymentInstrument;
	/**
	 * Instrument that has or represents monetary value and is used to process a
	 * payment instruction for a redemption payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentInstrument12
	 * PaymentInstrument12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8
	 * InvestmentFundCashSettlementInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedPmtInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionPaymentInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instrument that has or represents monetary value and is used to process a payment instruction for a redemption payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6#mmRedemptionPaymentInstrument
	 * InvestmentFundCashSettlementInformation6.mmRedemptionPaymentInstrument}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRedemptionPaymentInstrument = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> InvestmentFundCashSettlementInformation8.mmObject();
			isDerived = false;
			xmlTag = "RedPmtInstrm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionPaymentInstrument";
			definition = "Instrument that has or represents monetary value and is used to process a payment instruction for a redemption payment.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6.mmRedemptionPaymentInstrument;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentInstrument12.mmObject();
		}
	};
	protected PaymentInstrument12 dividendPaymentInstrument;
	/**
	 * Instrument that has or represents monetary value and is used to process a
	 * payment instruction for a dividend payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentInstrument12
	 * PaymentInstrument12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8
	 * InvestmentFundCashSettlementInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DvddPmtInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPaymentInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instrument that has or represents monetary value and is used to process a payment instruction for a dividend payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6#mmDividendPaymentInstrument
	 * InvestmentFundCashSettlementInformation6.mmDividendPaymentInstrument}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDividendPaymentInstrument = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> InvestmentFundCashSettlementInformation8.mmObject();
			isDerived = false;
			xmlTag = "DvddPmtInstrm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPaymentInstrument";
			definition = "Instrument that has or represents monetary value and is used to process a payment instruction for a dividend payment.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6.mmDividendPaymentInstrument;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentInstrument12.mmObject();
		}
	};
	protected PaymentInstrument11 savingsPlanPaymentInstrument;
	/**
	 * Instrument that has or represents monetary value and is used to process a
	 * payment instruction for a savings plan payment.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8
	 * InvestmentFundCashSettlementInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvgsPlanPmtInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SavingsPlanPaymentInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instrument that has or represents monetary value and is used to process a payment instruction for a savings plan payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6#mmSavingsPlanPaymentInstrument
	 * InvestmentFundCashSettlementInformation6.mmSavingsPlanPaymentInstrument}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSavingsPlanPaymentInstrument = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> InvestmentFundCashSettlementInformation8.mmObject();
			isDerived = false;
			xmlTag = "SvgsPlanPmtInstrm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SavingsPlanPaymentInstrument";
			definition = "Instrument that has or represents monetary value and is used to process a payment instruction for a savings plan payment.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6.mmSavingsPlanPaymentInstrument;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentInstrument11.mmObject();
		}
	};
	protected PaymentInstrument12 interestPaymentInstrument;
	/**
	 * Instrument that has or represents monetary value and is used to process a
	 * payment instruction for an interest payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument12
	 * PaymentInstrument12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8
	 * InvestmentFundCashSettlementInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstPmtInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaymentInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instrument that has or represents monetary value and is used to process a payment instruction for an interest payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6#mmInterestPaymentInstrument
	 * InvestmentFundCashSettlementInformation6.mmInterestPaymentInstrument}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestPaymentInstrument = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> InvestmentFundCashSettlementInformation8.mmObject();
			isDerived = false;
			xmlTag = "IntrstPmtInstrm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentInstrument";
			definition = "Instrument that has or represents monetary value and is used to process a payment instruction for an interest payment.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6.mmInterestPaymentInstrument;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PaymentInstrument12.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8.mmModificationScopeIndication,
						com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8.mmSubscriptionPaymentInstrument, com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8.mmRedemptionPaymentInstrument,
						com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8.mmDividendPaymentInstrument, com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8.mmSavingsPlanPaymentInstrument,
						com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8.mmInterestPaymentInstrument);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountModificationInstructionV04.mmModifiedCashSettlement,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV05.mmModifiedCashSettlement);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundCashSettlementInformation8";
				definition = "Settlement instructions to be used to transfer cash from the debtor to the creditor.";
				previousVersion_lazy = () -> InvestmentFundCashSettlementInformation6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public DataModification2Code getModificationScopeIndication() {
		return modificationScopeIndication;
	}

	public void setModificationScopeIndication(DataModification2Code modificationScopeIndication) {
		this.modificationScopeIndication = modificationScopeIndication;
	}

	public PaymentInstrument11 getSubscriptionPaymentInstrument() {
		return subscriptionPaymentInstrument;
	}

	public void setSubscriptionPaymentInstrument(com.tools20022.repository.msg.PaymentInstrument11 subscriptionPaymentInstrument) {
		this.subscriptionPaymentInstrument = subscriptionPaymentInstrument;
	}

	public PaymentInstrument12 getRedemptionPaymentInstrument() {
		return redemptionPaymentInstrument;
	}

	public void setRedemptionPaymentInstrument(com.tools20022.repository.msg.PaymentInstrument12 redemptionPaymentInstrument) {
		this.redemptionPaymentInstrument = redemptionPaymentInstrument;
	}

	public PaymentInstrument12 getDividendPaymentInstrument() {
		return dividendPaymentInstrument;
	}

	public void setDividendPaymentInstrument(com.tools20022.repository.msg.PaymentInstrument12 dividendPaymentInstrument) {
		this.dividendPaymentInstrument = dividendPaymentInstrument;
	}

	public PaymentInstrument11 getSavingsPlanPaymentInstrument() {
		return savingsPlanPaymentInstrument;
	}

	public void setSavingsPlanPaymentInstrument(com.tools20022.repository.msg.PaymentInstrument11 savingsPlanPaymentInstrument) {
		this.savingsPlanPaymentInstrument = savingsPlanPaymentInstrument;
	}

	public PaymentInstrument12 getInterestPaymentInstrument() {
		return interestPaymentInstrument;
	}

	public void setInterestPaymentInstrument(com.tools20022.repository.msg.PaymentInstrument12 interestPaymentInstrument) {
		this.interestPaymentInstrument = interestPaymentInstrument;
	}
}