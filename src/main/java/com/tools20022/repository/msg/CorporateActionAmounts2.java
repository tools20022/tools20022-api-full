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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies amounts in the framework of a corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmPostingAmount
 * CorporateActionAmounts2.mmPostingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmGrossCashAmount
 * CorporateActionAmounts2.mmGrossCashAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmNetCashAmount
 * CorporateActionAmounts2.mmNetCashAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmSolicitationFees
 * CorporateActionAmounts2.mmSolicitationFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmCashInLieuOfShare
 * CorporateActionAmounts2.mmCashInLieuOfShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmCapitalGain
 * CorporateActionAmounts2.mmCapitalGain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmInterestAmount
 * CorporateActionAmounts2.mmInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmMarketClaimAmount
 * CorporateActionAmounts2.mmMarketClaimAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmIndemnityAmount
 * CorporateActionAmounts2.mmIndemnityAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmManufacturedDividendAmount
 * CorporateActionAmounts2.mmManufacturedDividendAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmReinvestmentAmount
 * CorporateActionAmounts2.mmReinvestmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmFullyFrankedAmount
 * CorporateActionAmounts2.mmFullyFrankedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmUnfrankedAmount
 * CorporateActionAmounts2.mmUnfrankedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmSundryOrOtherAmount
 * CorporateActionAmounts2.mmSundryOrOtherAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmCashIncentive
 * CorporateActionAmounts2.mmCashIncentive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmTaxFreeAmount
 * CorporateActionAmounts2.mmTaxFreeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmTaxDeferredAmount
 * CorporateActionAmounts2.mmTaxDeferredAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmValueAddedTaxAmount
 * CorporateActionAmounts2.mmValueAddedTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmStampDutyAmount
 * CorporateActionAmounts2.mmStampDutyAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmTaxReclaimAmount
 * CorporateActionAmounts2.mmTaxReclaimAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmTaxCreditAmount
 * CorporateActionAmounts2.mmTaxCreditAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmWithholdingOfForeignTaxAmount
 * CorporateActionAmounts2.mmWithholdingOfForeignTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmWithholdingOfLocalTaxAmount
 * CorporateActionAmounts2.mmWithholdingOfLocalTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmAdditionalTaxAmount
 * CorporateActionAmounts2.mmAdditionalTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmWithholdingTaxAmount
 * CorporateActionAmounts2.mmWithholdingTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmFiscalStampAmount
 * CorporateActionAmounts2.mmFiscalStampAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmExecutingBrokerAmount
 * CorporateActionAmounts2.mmExecutingBrokerAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmPayingAgentCommissionAmount
 * CorporateActionAmounts2.mmPayingAgentCommissionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmLocalBrokerCommissionAmount
 * CorporateActionAmounts2.mmLocalBrokerCommissionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmPostageFeeAmount
 * CorporateActionAmounts2.mmPostageFeeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmRegulatoryFeesAmount
 * CorporateActionAmounts2.mmRegulatoryFeesAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmShippingFeesAmount
 * CorporateActionAmounts2.mmShippingFeesAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmChargesAmount
 * CorporateActionAmounts2.mmChargesAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmCashAmountBroughtForward
 * CorporateActionAmounts2.mmCashAmountBroughtForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmCashAmountCarriedForward
 * CorporateActionAmounts2.mmCashAmountCarriedForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmNotionalDividendPayableAmount
 * CorporateActionAmounts2.mmNotionalDividendPayableAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmNotionalTaxAmount
 * CorporateActionAmounts2.mmNotionalTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmTaxArrearsAmount
 * CorporateActionAmounts2.mmTaxArrearsAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmOriginalAmount
 * CorporateActionAmounts2.mmOriginalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmPrincipalOrCorpus
 * CorporateActionAmounts2.mmPrincipalOrCorpus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmRedemptionPremiumAmount
 * CorporateActionAmounts2.mmRedemptionPremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmIncomePortion
 * CorporateActionAmounts2.mmIncomePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmStockExchangeTax
 * CorporateActionAmounts2.mmStockExchangeTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmEUTaxRetentionAmount
 * CorporateActionAmounts2.mmEUTaxRetentionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmAccruedInterestAmount
 * CorporateActionAmounts2.mmAccruedInterestAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionAmounts2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies amounts in the framework of a corporate action event."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forCorporateActionAmounts2
 * ConstraintCoexistenceAmountRule.forCorporateActionAmounts2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionAmounts2", propOrder = {"postingAmount", "grossCashAmount", "netCashAmount", "solicitationFees", "cashInLieuOfShare", "capitalGain", "interestAmount", "marketClaimAmount", "indemnityAmount",
		"manufacturedDividendAmount", "reinvestmentAmount", "fullyFrankedAmount", "unfrankedAmount", "sundryOrOtherAmount", "cashIncentive", "taxFreeAmount", "taxDeferredAmount", "valueAddedTaxAmount", "stampDutyAmount",
		"taxReclaimAmount", "taxCreditAmount", "withholdingOfForeignTaxAmount", "withholdingOfLocalTaxAmount", "additionalTaxAmount", "withholdingTaxAmount", "fiscalStampAmount", "executingBrokerAmount", "payingAgentCommissionAmount",
		"localBrokerCommissionAmount", "postageFeeAmount", "regulatoryFeesAmount", "shippingFeesAmount", "chargesAmount", "cashAmountBroughtForward", "cashAmountCarriedForward", "notionalDividendPayableAmount", "notionalTaxAmount",
		"taxArrearsAmount", "originalAmount", "principalOrCorpus", "redemptionPremiumAmount", "incomePortion", "stockExchangeTax", "eUTaxRetentionAmount", "accruedInterestAmount"})
public class CorporateActionAmounts2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PstngAmt", required = true)
	protected ActiveCurrencyAndAmount postingAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmPostingAmount
	 * CorporateActionDistribution.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstngAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money that is to be/was posted to the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::PSTA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, ActiveCurrencyAndAmount> mmPostingAmount = new MMMessageAttribute<CorporateActionAmounts2, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmPostingAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "PstngAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::PSTA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostingAmount";
			definition = "Amount of money that is to be/was posted to the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(CorporateActionAmounts2 obj) {
			return obj.getPostingAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, ActiveCurrencyAndAmount value) {
			obj.setPostingAmount(value);
		}
	};
	@XmlElement(name = "GrssCshAmt")
	protected ActiveCurrencyAndAmount grossCashAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmGrossCashAmount
	 * CorporateActionCashEntitlement.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrssCshAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossCashAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money before any deductions and allowances have been made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::GRSS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmGrossCashAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionCashEntitlement.mmGrossCashAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "GrssCshAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::GRSS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossCashAmount";
			definition = "Amount of money before any deductions and allowances have been made.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getGrossCashAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setGrossCashAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "NetCshAmt")
	protected ActiveCurrencyAndAmount netCashAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmNetCashAmount
	 * CorporateActionCashEntitlement.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetCshAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetCashAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money after deductions and allowances have been made, if any, that is, the total amount +/- charges/fees."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::NETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmNetCashAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionCashEntitlement.mmNetCashAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "NetCshAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::NETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetCashAmount";
			definition = "Amount of money after deductions and allowances have been made, if any, that is, the total amount +/- charges/fees.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getNetCashAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setNetCashAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "SlctnFees")
	protected ActiveCurrencyAndAmount solicitationFees;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmSolicitationFee
	 * CorporateActionFeesAndCharges.mmSolicitationFee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SlctnFees"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of cash premium made available in order to encourage participation in the offer. Payment is made to a third party who has solicited an entity to take part in the offer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::SOFE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmSolicitationFees = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionFeesAndCharges.mmSolicitationFee;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "SlctnFees";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::SOFE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationFees";
			definition = "Amount of cash premium made available in order to encourage participation in the offer. Payment is made to a third party who has solicited an entity to take part in the offer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getSolicitationFees();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setSolicitationFees(value.orElse(null));
		}
	};
	@XmlElement(name = "CshInLieuOfShr")
	protected ActiveCurrencyAndAmount cashInLieuOfShare;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmCashInLieuOfShare
	 * CorporateActionCashEntitlement.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshInLieuOfShr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash disbursement in lieu of a fractional quantity of, for example, equity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::CINL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmCashInLieuOfShare = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionCashEntitlement.mmCashInLieuOfShare;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "CshInLieuOfShr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::CINL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieuOfShare";
			definition = "Cash disbursement in lieu of a fractional quantity of, for example, equity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getCashInLieuOfShare();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setCashInLieuOfShare(value.orElse(null));
		}
	};
	@XmlElement(name = "CptlGn")
	protected ActiveCurrencyAndAmount capitalGain;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmCapitalGain
	 * CorporateActionCashEntitlement.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CptlGn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money distributed as the result of a capital gain."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::CAPG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmCapitalGain = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionCashEntitlement.mmCapitalGain;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "CptlGn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::CAPG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGain";
			definition = "Amount of money distributed as the result of a capital gain.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getCapitalGain();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setCapitalGain(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrstAmt")
	protected ActiveCurrencyAndAmount interestAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAmount
	 * Interest.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money representing a coupon payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::INTR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmInterestAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "IntrstAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::INTR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestAmount";
			definition = "Amount of money representing a coupon payment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getInterestAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setInterestAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "MktClmAmt")
	protected ActiveCurrencyAndAmount marketClaimAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarketClaim#mmMarketClaimAmount
	 * MarketClaim.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktClmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClaimAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money resulting from a market claim."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::MKTC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmMarketClaimAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> MarketClaim.mmMarketClaimAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "MktClmAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::MKTC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClaimAmount";
			definition = "Amount of money resulting from a market claim.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getMarketClaimAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setMarketClaimAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "IndmntyAmt")
	protected ActiveCurrencyAndAmount indemnityAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmIndemnityAmount
	 * CashProceedsDefinition.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndmntyAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndemnityAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "(Unique to France) Amount due to a buyer of securities dealt prior to ex date which may be subject to different rate of taxation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::INDM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmIndemnityAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmIndemnityAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "IndmntyAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::INDM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndemnityAmount";
			definition = "(Unique to France) Amount due to a buyer of securities dealt prior to ex date which may be subject to different rate of taxation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getIndemnityAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setIndemnityAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ManfctrdDvddAmt")
	protected ActiveCurrencyAndAmount manufacturedDividendAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmManufacturedDividendAmount
	 * Dividend.mmManufacturedDividendAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ManfctrdDvddAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManufacturedDividendAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money that the borrower pays to the lender as a compensation. It does not entitle the lender to reclaim any tax credit and is sometimes treated differently by the local tax authorities of the lender."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::MFDV</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmManufacturedDividendAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmManufacturedDividendAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "ManfctrdDvddAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::MFDV"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManufacturedDividendAmount";
			definition = "Amount of money that the borrower pays to the lender as a compensation. It does not entitle the lender to reclaim any tax credit and is sometimes treated differently by the local tax authorities of the lender.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getManufacturedDividendAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setManufacturedDividendAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "RinvstmtAmt")
	protected ActiveCurrencyAndAmount reinvestmentAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmReinvestmentAmount
	 * SecuritiesProceedsDefinition.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RinvstmtAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money reinvested in additional securities."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::REIN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmReinvestmentAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmReinvestmentAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "RinvstmtAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::REIN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentAmount";
			definition = "Amount of money reinvested in additional securities.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getReinvestmentAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setReinvestmentAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "FullyFrnkdAmt")
	protected ActiveCurrencyAndAmount fullyFrankedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmAmount
	 * RateAndAmount.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FullyFrnkdAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyFrankedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount resulting from a fully franked dividend paid by a company; amount includes tax credit for companies that have made sufficient tax payments during the fiscal period."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::FLFR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmFullyFrankedAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> RateAndAmount.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "FullyFrnkdAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::FLFR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyFrankedAmount";
			definition = "Amount resulting from a fully franked dividend paid by a company; amount includes tax credit for companies that have made sufficient tax payments during the fiscal period.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getFullyFrankedAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setFullyFrankedAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "UfrnkdAmt")
	protected ActiveCurrencyAndAmount unfrankedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmUnfrankedAmount
	 * Dividend.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UfrnkdAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnfrankedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount resulting from an unfranked dividend paid by a company; the amount does not include tax credit and is subject to withholding tax."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::UNFR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmUnfrankedAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmUnfrankedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "UfrnkdAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::UNFR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnfrankedAmount";
			definition = "Amount resulting from an unfranked dividend paid by a company; the amount does not include tax credit and is subject to withholding tax.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getUnfrankedAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setUnfrankedAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "SndryOrOthrAmt")
	protected ActiveCurrencyAndAmount sundryOrOtherAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmSundryOrOtherAmount
	 * TaxVoucher.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndryOrOthrAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SundryOrOtherAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money related to taxable income that cannot be categorised."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::SOIC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmSundryOrOtherAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmSundryOrOtherAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "SndryOrOthrAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::SOIC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SundryOrOtherAmount";
			definition = "Amount of money related to taxable income that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getSundryOrOtherAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setSundryOrOtherAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "CshIncntiv")
	protected ActiveCurrencyAndAmount cashIncentive;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmCashIncentiveAmount
	 * CashProceedsDefinition.mmCashIncentiveAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshIncntiv"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashIncentive"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash premium made available if the securities holder consents or participates to an event, for example, consent fees or solicitation fees."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::INCE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmCashIncentive = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmCashIncentiveAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "CshIncntiv";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::INCE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashIncentive";
			definition = "Cash premium made available if the securities holder consents or participates to an event, for example, consent fees or solicitation fees.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getCashIncentive();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setCashIncentive(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxFreeAmt")
	protected ActiveCurrencyAndAmount taxFreeAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxFreeAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxFreeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money that has not been subject to taxation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::TXFR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmTaxFreeAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "TaxFreeAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::TXFR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxFreeAmount";
			definition = "Amount of money that has not been subject to taxation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getTaxFreeAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTaxFreeAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxDfrrdAmt")
	protected ActiveCurrencyAndAmount taxDeferredAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxDfrrdAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDeferredAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of income eligible for deferred taxation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::TXDF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmTaxDeferredAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "TaxDfrrdAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::TXDF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDeferredAmount";
			definition = "Amount of income eligible for deferred taxation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getTaxDeferredAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTaxDeferredAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ValAddedTaxAmt")
	protected ActiveCurrencyAndAmount valueAddedTaxAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValAddedTaxAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax on value added."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::VATA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmValueAddedTaxAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "ValAddedTaxAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::VATA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAddedTaxAmount";
			definition = "Tax on value added.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getValueAddedTaxAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setValueAddedTaxAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "StmpDtyAmt")
	protected ActiveCurrencyAndAmount stampDutyAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmpDtyAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDutyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of stamp duty."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::STAM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmStampDutyAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "StmpDtyAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::STAM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDutyAmount";
			definition = "Amount of stamp duty.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getStampDutyAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setStampDutyAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxRclmAmt")
	protected ActiveCurrencyAndAmount taxReclaimAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRclmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxReclaimAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount that was paid in excess of actual tax obligation and was reclaimed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::TXRC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmTaxReclaimAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "TaxRclmAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::TXRC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReclaimAmount";
			definition = "Amount that was paid in excess of actual tax obligation and was reclaimed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getTaxReclaimAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTaxReclaimAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxCdtAmt")
	protected ActiveCurrencyAndAmount taxCreditAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmCreditAmount
	 * TaxVoucher.mmCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxCdtAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of taxes that have been previously paid in relation to the taxable event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::TAXC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmTaxCreditAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmCreditAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "TaxCdtAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::TAXC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditAmount";
			definition = "Amount of taxes that have been previously paid in relation to the taxable event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getTaxCreditAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTaxCreditAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "WhldgOfFrgnTaxAmt")
	protected ActiveCurrencyAndAmount withholdingOfForeignTaxAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhldgOfFrgnTaxAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingOfForeignTaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money withheld by the jurisdiction in which the income was originally paid, for which relief at source and/or reclaim may be possible."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::WITF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmWithholdingOfForeignTaxAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "WhldgOfFrgnTaxAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::WITF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingOfForeignTaxAmount";
			definition = "Amount of money withheld by the jurisdiction in which the income was originally paid, for which relief at source and/or reclaim may be possible.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getWithholdingOfForeignTaxAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setWithholdingOfForeignTaxAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "WhldgOfLclTaxAmt")
	protected ActiveCurrencyAndAmount withholdingOfLocalTaxAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhldgOfLclTaxAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingOfLocalTaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money withheld by the jurisdiction in which the account owner is located, for which relief at source and/or reclaim may be possible."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::WITL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmWithholdingOfLocalTaxAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "WhldgOfLclTaxAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::WITL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingOfLocalTaxAmount";
			definition = "Amount of money withheld by the jurisdiction in which the account owner is located, for which relief at source and/or reclaim may be possible.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getWithholdingOfLocalTaxAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setWithholdingOfLocalTaxAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlTaxAmt")
	protected ActiveCurrencyAndAmount additionalTaxAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlTaxAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of additional taxes that cannot be categorised."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::ATAX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmAdditionalTaxAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "AddtlTaxAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::ATAX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTaxAmount";
			definition = "Amount of additional taxes that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getAdditionalTaxAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setAdditionalTaxAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "WhldgTaxAmt")
	protected ActiveCurrencyAndAmount withholdingTaxAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhldgTaxAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of a cash distribution that will be withheld by a tax authority."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::TAXR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmWithholdingTaxAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "WhldgTaxAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::TAXR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxAmount";
			definition = "Amount of a cash distribution that will be withheld by a tax authority.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getWithholdingTaxAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setWithholdingTaxAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "FsclStmpAmt")
	protected ActiveCurrencyAndAmount fiscalStampAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FsclStmpAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FiscalStampAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of fiscal tax to apply."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::FISC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmFiscalStampAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "FsclStmpAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::FISC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiscalStampAmount";
			definition = "Amount of fiscal tax to apply.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getFiscalStampAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setFiscalStampAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ExctgBrkrAmt")
	protected ActiveCurrencyAndAmount executingBrokerAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctgBrkrAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutingBrokerAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money paid to an executing broker as a commission."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::EXEC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmExecutingBrokerAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "ExctgBrkrAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::EXEC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutingBrokerAmount";
			definition = "Amount of money paid to an executing broker as a commission.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getExecutingBrokerAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setExecutingBrokerAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "PngAgtComssnAmt")
	protected ActiveCurrencyAndAmount payingAgentCommissionAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PngAgtComssnAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayingAgentCommissionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of paying/sub-paying agent commission."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::PAMM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmPayingAgentCommissionAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "PngAgtComssnAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::PAMM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgentCommissionAmount";
			definition = "Amount of paying/sub-paying agent commission.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getPayingAgentCommissionAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setPayingAgentCommissionAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "LclBrkrComssnAmt")
	protected ActiveCurrencyAndAmount localBrokerCommissionAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclBrkrComssnAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalBrokerCommissionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Local broker's commission."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::LOCO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmLocalBrokerCommissionAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "LclBrkrComssnAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::LOCO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalBrokerCommissionAmount";
			definition = "Local broker's commission.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getLocalBrokerCommissionAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setLocalBrokerCommissionAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "PstgFeeAmt")
	protected ActiveCurrencyAndAmount postageFeeAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmPostageFeeAmount
	 * SecuritiesRelatedFees.mmPostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstgFeeAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostageFeeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money paid for delivery by regular post mail."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::POST</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmPostageFeeAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesRelatedFees.mmPostageFeeAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "PstgFeeAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::POST"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostageFeeAmount";
			definition = "Amount of money paid for delivery by regular post mail.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getPostageFeeAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setPostageFeeAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "RgltryFeesAmt")
	protected ActiveCurrencyAndAmount regulatoryFeesAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmRegulatoryFeesAmount
	 * SecuritiesRelatedFees.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RgltryFeesAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryFeesAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money charged by a regulatory authority, for example, Securities and Exchange fees."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::REGF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmRegulatoryFeesAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesRelatedFees.mmRegulatoryFeesAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "RgltryFeesAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::REGF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryFeesAmount";
			definition = "Amount of money charged by a regulatory authority, for example, Securities and Exchange fees.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getRegulatoryFeesAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setRegulatoryFeesAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ShppgFeesAmt")
	protected ActiveCurrencyAndAmount shippingFeesAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmShippingFeesAmount
	 * SecuritiesRelatedFees.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShppgFeesAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingFeesAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money (including insurance) paid for delivery by carrier."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::SHIP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmShippingFeesAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesRelatedFees.mmShippingFeesAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "ShppgFeesAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::SHIP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingFeesAmount";
			definition = "Amount of money (including insurance) paid for delivery by carrier.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getShippingFeesAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setShippingFeesAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ChrgsAmt")
	protected ActiveCurrencyAndAmount chargesAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money paid for the provision of financial services that cannot be categorised by another qualifier."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::CHAR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmChargesAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "ChrgsAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::CHAR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAmount";
			definition = "Amount of money paid for the provision of financial services that cannot be categorised by another qualifier.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getChargesAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setChargesAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "CshAmtBrghtFwd")
	protected ActiveCurrencyAndAmount cashAmountBroughtForward;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmCashAmountBroughtForward
	 * TaxVoucher.mmCashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAmtBrghtFwd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAmountBroughtForward"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates cash retained from previous dividend."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::CABF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmCashAmountBroughtForward = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmCashAmountBroughtForward;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "CshAmtBrghtFwd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::CABF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAmountBroughtForward";
			definition = "Indicates cash retained from previous dividend.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getCashAmountBroughtForward();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setCashAmountBroughtForward(value.orElse(null));
		}
	};
	@XmlElement(name = "CshAmtCrrdFwd")
	protected ActiveCurrencyAndAmount cashAmountCarriedForward;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmCashAmountCarriedForward
	 * TaxVoucher.mmCashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAmtCrrdFwd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAmountCarriedForward"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the balance carried forward to next dividend."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::CACF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmCashAmountCarriedForward = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmCashAmountCarriedForward;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "CshAmtCrrdFwd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::CACF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAmountCarriedForward";
			definition = "Indicates the balance carried forward to next dividend.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getCashAmountCarriedForward();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setCashAmountCarriedForward(value.orElse(null));
		}
	};
	@XmlElement(name = "NtnlDvddPyblAmt")
	protected ActiveCurrencyAndAmount notionalDividendPayableAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmNotionalDividendPayableAmount
	 * Dividend.mmNotionalDividendPayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtnlDvddPyblAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalDividendPayableAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of cash that would have been payable if the dividend had been taken in the form of cash rather than shares."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::NDIP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmNotionalDividendPayableAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmNotionalDividendPayableAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "NtnlDvddPyblAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::NDIP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalDividendPayableAmount";
			definition = "Amount of cash that would have been payable if the dividend had been taken in the form of cash rather than shares.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getNotionalDividendPayableAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setNotionalDividendPayableAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "NtnlTaxAmt")
	protected ActiveCurrencyAndAmount notionalTaxAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmNotionalTaxAmount
	 * TaxVoucher.mmNotionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtnlTaxAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalTaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Where new securities are issued in lieu of a cash dividend, the notional tax is the tax on the amount of cash that would have been paid."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::NTAX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmNotionalTaxAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmNotionalTaxAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "NtnlTaxAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::NTAX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalTaxAmount";
			definition = "Where new securities are issued in lieu of a cash dividend, the notional tax is the tax on the amount of cash that would have been paid.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getNotionalTaxAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setNotionalTaxAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxArrearsAmt")
	protected ActiveCurrencyAndAmount taxArrearsAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxArrearsAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxArrearsAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money paid by the Tax Authorities in addition to the payment of the tax refund itself."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::ARRE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmTaxArrearsAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "TaxArrearsAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::ARRE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxArrearsAmount";
			definition = "Amount of money paid by the Tax Authorities in addition to the payment of the tax refund itself.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getTaxArrearsAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTaxArrearsAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlAmt")
	protected ActiveCurrencyAndAmount originalAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmOriginalAmount
	 * CurrencyExchange.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Posting/settlement Amount in its original currency when conversion from/into another currency has occurred."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::OCMT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmOriginalAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmOriginalAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::OCMT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalAmount";
			definition = "Posting/settlement Amount in its original currency when conversion from/into another currency has occurred.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getOriginalAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setOriginalAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "PrncplOrCrps")
	protected ActiveCurrencyAndAmount principalOrCorpus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmPrincipalOrCorpus
	 * CashProceedsDefinition.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrncplOrCrps"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalOrCorpus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money representing a distribution of a bond's principal, for example, repayment of outstanding debt."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B:PRIN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmPrincipalOrCorpus = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmPrincipalOrCorpus;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "PrncplOrCrps";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B:PRIN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalOrCorpus";
			definition = "Amount of money representing a distribution of a bond's principal, for example, repayment of outstanding debt.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getPrincipalOrCorpus();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setPrincipalOrCorpus(value.orElse(null));
		}
	};
	@XmlElement(name = "RedPrmAmt")
	protected ActiveCurrencyAndAmount redemptionPremiumAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmRedemptionPremiumAmount
	 * CashProceedsDefinition.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedPrmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionPremiumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money (not interest) in addition to the principal at the redemption of a bond."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B:REDP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmRedemptionPremiumAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmRedemptionPremiumAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "RedPrmAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B:REDP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionPremiumAmount";
			definition = "Amount of money (not interest) in addition to the principal at the redemption of a bond.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getRedemptionPremiumAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setRedemptionPremiumAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "IncmPrtn")
	protected ActiveCurrencyAndAmount incomePortion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmIncomePortion
	 * CashProceedsDefinition.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncmPrtn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePortion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount relating to the underlying security for which income is distributed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B:INCO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmIncomePortion = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmIncomePortion;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "IncmPrtn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B:INCO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePortion";
			definition = "Amount relating to the underlying security for which income is distributed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getIncomePortion();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setIncomePortion(value.orElse(null));
		}
	};
	@XmlElement(name = "StockXchgTax")
	protected ActiveCurrencyAndAmount stockExchangeTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StockXchgTax"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockExchangeTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of stock exchange tax."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::STEX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmStockExchangeTax = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "StockXchgTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::STEX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockExchangeTax";
			definition = "Amount of stock exchange tax.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getStockExchangeTax();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setStockExchangeTax(value.orElse(null));
		}
	};
	@XmlElement(name = "EUTaxRtntnAmt")
	protected ActiveCurrencyAndAmount eUTaxRetentionAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EUTaxRtntnAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUTaxRetentionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of tax withheld at source in conformance with the EU Savings Directive."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B:EUTR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmEUTaxRetentionAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "EUTaxRtntnAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B:EUTR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUTaxRetentionAmount";
			definition = "Total amount of tax withheld at source in conformance with the EU Savings Directive.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getEUTaxRetentionAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setEUTaxRetentionAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "AcrdIntrstAmt")
	protected ActiveCurrencyAndAmount accruedInterestAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
	 * Interest.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2
	 * CorporateActionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of interest that has been accrued in between coupon payment periods."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::ACRU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>> mmAccruedInterestAmount = new MMMessageAttribute<CorporateActionAmounts2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::ACRU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Amount of interest that has been accrued in between coupon payment periods.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionAmounts2 obj) {
			return obj.getAccruedInterestAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setAccruedInterestAmount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionAmounts2.mmPostingAmount, com.tools20022.repository.msg.CorporateActionAmounts2.mmGrossCashAmount,
						com.tools20022.repository.msg.CorporateActionAmounts2.mmNetCashAmount, com.tools20022.repository.msg.CorporateActionAmounts2.mmSolicitationFees,
						com.tools20022.repository.msg.CorporateActionAmounts2.mmCashInLieuOfShare, com.tools20022.repository.msg.CorporateActionAmounts2.mmCapitalGain, com.tools20022.repository.msg.CorporateActionAmounts2.mmInterestAmount,
						com.tools20022.repository.msg.CorporateActionAmounts2.mmMarketClaimAmount, com.tools20022.repository.msg.CorporateActionAmounts2.mmIndemnityAmount,
						com.tools20022.repository.msg.CorporateActionAmounts2.mmManufacturedDividendAmount, com.tools20022.repository.msg.CorporateActionAmounts2.mmReinvestmentAmount,
						com.tools20022.repository.msg.CorporateActionAmounts2.mmFullyFrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts2.mmUnfrankedAmount,
						com.tools20022.repository.msg.CorporateActionAmounts2.mmSundryOrOtherAmount, com.tools20022.repository.msg.CorporateActionAmounts2.mmCashIncentive,
						com.tools20022.repository.msg.CorporateActionAmounts2.mmTaxFreeAmount, com.tools20022.repository.msg.CorporateActionAmounts2.mmTaxDeferredAmount,
						com.tools20022.repository.msg.CorporateActionAmounts2.mmValueAddedTaxAmount, com.tools20022.repository.msg.CorporateActionAmounts2.mmStampDutyAmount,
						com.tools20022.repository.msg.CorporateActionAmounts2.mmTaxReclaimAmount, com.tools20022.repository.msg.CorporateActionAmounts2.mmTaxCreditAmount,
						com.tools20022.repository.msg.CorporateActionAmounts2.mmWithholdingOfForeignTaxAmount, com.tools20022.repository.msg.CorporateActionAmounts2.mmWithholdingOfLocalTaxAmount,
						com.tools20022.repository.msg.CorporateActionAmounts2.mmAdditionalTaxAmount, com.tools20022.repository.msg.CorporateActionAmounts2.mmWithholdingTaxAmount,
						com.tools20022.repository.msg.CorporateActionAmounts2.mmFiscalStampAmount, com.tools20022.repository.msg.CorporateActionAmounts2.mmExecutingBrokerAmount,
						com.tools20022.repository.msg.CorporateActionAmounts2.mmPayingAgentCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts2.mmLocalBrokerCommissionAmount,
						com.tools20022.repository.msg.CorporateActionAmounts2.mmPostageFeeAmount, com.tools20022.repository.msg.CorporateActionAmounts2.mmRegulatoryFeesAmount,
						com.tools20022.repository.msg.CorporateActionAmounts2.mmShippingFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts2.mmChargesAmount,
						com.tools20022.repository.msg.CorporateActionAmounts2.mmCashAmountBroughtForward, com.tools20022.repository.msg.CorporateActionAmounts2.mmCashAmountCarriedForward,
						com.tools20022.repository.msg.CorporateActionAmounts2.mmNotionalDividendPayableAmount, com.tools20022.repository.msg.CorporateActionAmounts2.mmNotionalTaxAmount,
						com.tools20022.repository.msg.CorporateActionAmounts2.mmTaxArrearsAmount, com.tools20022.repository.msg.CorporateActionAmounts2.mmOriginalAmount,
						com.tools20022.repository.msg.CorporateActionAmounts2.mmPrincipalOrCorpus, com.tools20022.repository.msg.CorporateActionAmounts2.mmRedemptionPremiumAmount,
						com.tools20022.repository.msg.CorporateActionAmounts2.mmIncomePortion, com.tools20022.repository.msg.CorporateActionAmounts2.mmStockExchangeTax,
						com.tools20022.repository.msg.CorporateActionAmounts2.mmEUTaxRetentionAmount, com.tools20022.repository.msg.CorporateActionAmounts2.mmAccruedInterestAmount);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forCorporateActionAmounts2);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CorporateActionAmounts2";
				definition = "Specifies amounts in the framework of a corporate action event.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getPostingAmount() {
		return postingAmount;
	}

	public CorporateActionAmounts2 setPostingAmount(ActiveCurrencyAndAmount postingAmount) {
		this.postingAmount = Objects.requireNonNull(postingAmount);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getGrossCashAmount() {
		return grossCashAmount == null ? Optional.empty() : Optional.of(grossCashAmount);
	}

	public CorporateActionAmounts2 setGrossCashAmount(ActiveCurrencyAndAmount grossCashAmount) {
		this.grossCashAmount = grossCashAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getNetCashAmount() {
		return netCashAmount == null ? Optional.empty() : Optional.of(netCashAmount);
	}

	public CorporateActionAmounts2 setNetCashAmount(ActiveCurrencyAndAmount netCashAmount) {
		this.netCashAmount = netCashAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getSolicitationFees() {
		return solicitationFees == null ? Optional.empty() : Optional.of(solicitationFees);
	}

	public CorporateActionAmounts2 setSolicitationFees(ActiveCurrencyAndAmount solicitationFees) {
		this.solicitationFees = solicitationFees;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getCashInLieuOfShare() {
		return cashInLieuOfShare == null ? Optional.empty() : Optional.of(cashInLieuOfShare);
	}

	public CorporateActionAmounts2 setCashInLieuOfShare(ActiveCurrencyAndAmount cashInLieuOfShare) {
		this.cashInLieuOfShare = cashInLieuOfShare;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getCapitalGain() {
		return capitalGain == null ? Optional.empty() : Optional.of(capitalGain);
	}

	public CorporateActionAmounts2 setCapitalGain(ActiveCurrencyAndAmount capitalGain) {
		this.capitalGain = capitalGain;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getInterestAmount() {
		return interestAmount == null ? Optional.empty() : Optional.of(interestAmount);
	}

	public CorporateActionAmounts2 setInterestAmount(ActiveCurrencyAndAmount interestAmount) {
		this.interestAmount = interestAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getMarketClaimAmount() {
		return marketClaimAmount == null ? Optional.empty() : Optional.of(marketClaimAmount);
	}

	public CorporateActionAmounts2 setMarketClaimAmount(ActiveCurrencyAndAmount marketClaimAmount) {
		this.marketClaimAmount = marketClaimAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getIndemnityAmount() {
		return indemnityAmount == null ? Optional.empty() : Optional.of(indemnityAmount);
	}

	public CorporateActionAmounts2 setIndemnityAmount(ActiveCurrencyAndAmount indemnityAmount) {
		this.indemnityAmount = indemnityAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getManufacturedDividendAmount() {
		return manufacturedDividendAmount == null ? Optional.empty() : Optional.of(manufacturedDividendAmount);
	}

	public CorporateActionAmounts2 setManufacturedDividendAmount(ActiveCurrencyAndAmount manufacturedDividendAmount) {
		this.manufacturedDividendAmount = manufacturedDividendAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getReinvestmentAmount() {
		return reinvestmentAmount == null ? Optional.empty() : Optional.of(reinvestmentAmount);
	}

	public CorporateActionAmounts2 setReinvestmentAmount(ActiveCurrencyAndAmount reinvestmentAmount) {
		this.reinvestmentAmount = reinvestmentAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getFullyFrankedAmount() {
		return fullyFrankedAmount == null ? Optional.empty() : Optional.of(fullyFrankedAmount);
	}

	public CorporateActionAmounts2 setFullyFrankedAmount(ActiveCurrencyAndAmount fullyFrankedAmount) {
		this.fullyFrankedAmount = fullyFrankedAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getUnfrankedAmount() {
		return unfrankedAmount == null ? Optional.empty() : Optional.of(unfrankedAmount);
	}

	public CorporateActionAmounts2 setUnfrankedAmount(ActiveCurrencyAndAmount unfrankedAmount) {
		this.unfrankedAmount = unfrankedAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getSundryOrOtherAmount() {
		return sundryOrOtherAmount == null ? Optional.empty() : Optional.of(sundryOrOtherAmount);
	}

	public CorporateActionAmounts2 setSundryOrOtherAmount(ActiveCurrencyAndAmount sundryOrOtherAmount) {
		this.sundryOrOtherAmount = sundryOrOtherAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getCashIncentive() {
		return cashIncentive == null ? Optional.empty() : Optional.of(cashIncentive);
	}

	public CorporateActionAmounts2 setCashIncentive(ActiveCurrencyAndAmount cashIncentive) {
		this.cashIncentive = cashIncentive;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTaxFreeAmount() {
		return taxFreeAmount == null ? Optional.empty() : Optional.of(taxFreeAmount);
	}

	public CorporateActionAmounts2 setTaxFreeAmount(ActiveCurrencyAndAmount taxFreeAmount) {
		this.taxFreeAmount = taxFreeAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTaxDeferredAmount() {
		return taxDeferredAmount == null ? Optional.empty() : Optional.of(taxDeferredAmount);
	}

	public CorporateActionAmounts2 setTaxDeferredAmount(ActiveCurrencyAndAmount taxDeferredAmount) {
		this.taxDeferredAmount = taxDeferredAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getValueAddedTaxAmount() {
		return valueAddedTaxAmount == null ? Optional.empty() : Optional.of(valueAddedTaxAmount);
	}

	public CorporateActionAmounts2 setValueAddedTaxAmount(ActiveCurrencyAndAmount valueAddedTaxAmount) {
		this.valueAddedTaxAmount = valueAddedTaxAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getStampDutyAmount() {
		return stampDutyAmount == null ? Optional.empty() : Optional.of(stampDutyAmount);
	}

	public CorporateActionAmounts2 setStampDutyAmount(ActiveCurrencyAndAmount stampDutyAmount) {
		this.stampDutyAmount = stampDutyAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTaxReclaimAmount() {
		return taxReclaimAmount == null ? Optional.empty() : Optional.of(taxReclaimAmount);
	}

	public CorporateActionAmounts2 setTaxReclaimAmount(ActiveCurrencyAndAmount taxReclaimAmount) {
		this.taxReclaimAmount = taxReclaimAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTaxCreditAmount() {
		return taxCreditAmount == null ? Optional.empty() : Optional.of(taxCreditAmount);
	}

	public CorporateActionAmounts2 setTaxCreditAmount(ActiveCurrencyAndAmount taxCreditAmount) {
		this.taxCreditAmount = taxCreditAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getWithholdingOfForeignTaxAmount() {
		return withholdingOfForeignTaxAmount == null ? Optional.empty() : Optional.of(withholdingOfForeignTaxAmount);
	}

	public CorporateActionAmounts2 setWithholdingOfForeignTaxAmount(ActiveCurrencyAndAmount withholdingOfForeignTaxAmount) {
		this.withholdingOfForeignTaxAmount = withholdingOfForeignTaxAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getWithholdingOfLocalTaxAmount() {
		return withholdingOfLocalTaxAmount == null ? Optional.empty() : Optional.of(withholdingOfLocalTaxAmount);
	}

	public CorporateActionAmounts2 setWithholdingOfLocalTaxAmount(ActiveCurrencyAndAmount withholdingOfLocalTaxAmount) {
		this.withholdingOfLocalTaxAmount = withholdingOfLocalTaxAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getAdditionalTaxAmount() {
		return additionalTaxAmount == null ? Optional.empty() : Optional.of(additionalTaxAmount);
	}

	public CorporateActionAmounts2 setAdditionalTaxAmount(ActiveCurrencyAndAmount additionalTaxAmount) {
		this.additionalTaxAmount = additionalTaxAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getWithholdingTaxAmount() {
		return withholdingTaxAmount == null ? Optional.empty() : Optional.of(withholdingTaxAmount);
	}

	public CorporateActionAmounts2 setWithholdingTaxAmount(ActiveCurrencyAndAmount withholdingTaxAmount) {
		this.withholdingTaxAmount = withholdingTaxAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getFiscalStampAmount() {
		return fiscalStampAmount == null ? Optional.empty() : Optional.of(fiscalStampAmount);
	}

	public CorporateActionAmounts2 setFiscalStampAmount(ActiveCurrencyAndAmount fiscalStampAmount) {
		this.fiscalStampAmount = fiscalStampAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getExecutingBrokerAmount() {
		return executingBrokerAmount == null ? Optional.empty() : Optional.of(executingBrokerAmount);
	}

	public CorporateActionAmounts2 setExecutingBrokerAmount(ActiveCurrencyAndAmount executingBrokerAmount) {
		this.executingBrokerAmount = executingBrokerAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getPayingAgentCommissionAmount() {
		return payingAgentCommissionAmount == null ? Optional.empty() : Optional.of(payingAgentCommissionAmount);
	}

	public CorporateActionAmounts2 setPayingAgentCommissionAmount(ActiveCurrencyAndAmount payingAgentCommissionAmount) {
		this.payingAgentCommissionAmount = payingAgentCommissionAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getLocalBrokerCommissionAmount() {
		return localBrokerCommissionAmount == null ? Optional.empty() : Optional.of(localBrokerCommissionAmount);
	}

	public CorporateActionAmounts2 setLocalBrokerCommissionAmount(ActiveCurrencyAndAmount localBrokerCommissionAmount) {
		this.localBrokerCommissionAmount = localBrokerCommissionAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getPostageFeeAmount() {
		return postageFeeAmount == null ? Optional.empty() : Optional.of(postageFeeAmount);
	}

	public CorporateActionAmounts2 setPostageFeeAmount(ActiveCurrencyAndAmount postageFeeAmount) {
		this.postageFeeAmount = postageFeeAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getRegulatoryFeesAmount() {
		return regulatoryFeesAmount == null ? Optional.empty() : Optional.of(regulatoryFeesAmount);
	}

	public CorporateActionAmounts2 setRegulatoryFeesAmount(ActiveCurrencyAndAmount regulatoryFeesAmount) {
		this.regulatoryFeesAmount = regulatoryFeesAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getShippingFeesAmount() {
		return shippingFeesAmount == null ? Optional.empty() : Optional.of(shippingFeesAmount);
	}

	public CorporateActionAmounts2 setShippingFeesAmount(ActiveCurrencyAndAmount shippingFeesAmount) {
		this.shippingFeesAmount = shippingFeesAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getChargesAmount() {
		return chargesAmount == null ? Optional.empty() : Optional.of(chargesAmount);
	}

	public CorporateActionAmounts2 setChargesAmount(ActiveCurrencyAndAmount chargesAmount) {
		this.chargesAmount = chargesAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getCashAmountBroughtForward() {
		return cashAmountBroughtForward == null ? Optional.empty() : Optional.of(cashAmountBroughtForward);
	}

	public CorporateActionAmounts2 setCashAmountBroughtForward(ActiveCurrencyAndAmount cashAmountBroughtForward) {
		this.cashAmountBroughtForward = cashAmountBroughtForward;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getCashAmountCarriedForward() {
		return cashAmountCarriedForward == null ? Optional.empty() : Optional.of(cashAmountCarriedForward);
	}

	public CorporateActionAmounts2 setCashAmountCarriedForward(ActiveCurrencyAndAmount cashAmountCarriedForward) {
		this.cashAmountCarriedForward = cashAmountCarriedForward;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getNotionalDividendPayableAmount() {
		return notionalDividendPayableAmount == null ? Optional.empty() : Optional.of(notionalDividendPayableAmount);
	}

	public CorporateActionAmounts2 setNotionalDividendPayableAmount(ActiveCurrencyAndAmount notionalDividendPayableAmount) {
		this.notionalDividendPayableAmount = notionalDividendPayableAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getNotionalTaxAmount() {
		return notionalTaxAmount == null ? Optional.empty() : Optional.of(notionalTaxAmount);
	}

	public CorporateActionAmounts2 setNotionalTaxAmount(ActiveCurrencyAndAmount notionalTaxAmount) {
		this.notionalTaxAmount = notionalTaxAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTaxArrearsAmount() {
		return taxArrearsAmount == null ? Optional.empty() : Optional.of(taxArrearsAmount);
	}

	public CorporateActionAmounts2 setTaxArrearsAmount(ActiveCurrencyAndAmount taxArrearsAmount) {
		this.taxArrearsAmount = taxArrearsAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getOriginalAmount() {
		return originalAmount == null ? Optional.empty() : Optional.of(originalAmount);
	}

	public CorporateActionAmounts2 setOriginalAmount(ActiveCurrencyAndAmount originalAmount) {
		this.originalAmount = originalAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getPrincipalOrCorpus() {
		return principalOrCorpus == null ? Optional.empty() : Optional.of(principalOrCorpus);
	}

	public CorporateActionAmounts2 setPrincipalOrCorpus(ActiveCurrencyAndAmount principalOrCorpus) {
		this.principalOrCorpus = principalOrCorpus;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getRedemptionPremiumAmount() {
		return redemptionPremiumAmount == null ? Optional.empty() : Optional.of(redemptionPremiumAmount);
	}

	public CorporateActionAmounts2 setRedemptionPremiumAmount(ActiveCurrencyAndAmount redemptionPremiumAmount) {
		this.redemptionPremiumAmount = redemptionPremiumAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getIncomePortion() {
		return incomePortion == null ? Optional.empty() : Optional.of(incomePortion);
	}

	public CorporateActionAmounts2 setIncomePortion(ActiveCurrencyAndAmount incomePortion) {
		this.incomePortion = incomePortion;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getStockExchangeTax() {
		return stockExchangeTax == null ? Optional.empty() : Optional.of(stockExchangeTax);
	}

	public CorporateActionAmounts2 setStockExchangeTax(ActiveCurrencyAndAmount stockExchangeTax) {
		this.stockExchangeTax = stockExchangeTax;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getEUTaxRetentionAmount() {
		return eUTaxRetentionAmount == null ? Optional.empty() : Optional.of(eUTaxRetentionAmount);
	}

	public CorporateActionAmounts2 setEUTaxRetentionAmount(ActiveCurrencyAndAmount eUTaxRetentionAmount) {
		this.eUTaxRetentionAmount = eUTaxRetentionAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getAccruedInterestAmount() {
		return accruedInterestAmount == null ? Optional.empty() : Optional.of(accruedInterestAmount);
	}

	public CorporateActionAmounts2 setAccruedInterestAmount(ActiveCurrencyAndAmount accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
		return this;
	}
}