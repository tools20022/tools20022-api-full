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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

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
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmPostingAmount
 * CorporateActionAmounts12.mmPostingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmGrossCashAmount
 * CorporateActionAmounts12.mmGrossCashAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmNetCashAmount
 * CorporateActionAmounts12.mmNetCashAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmSolicitationFees
 * CorporateActionAmounts12.mmSolicitationFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmCashInLieuOfShare
 * CorporateActionAmounts12.mmCashInLieuOfShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmCapitalGain
 * CorporateActionAmounts12.mmCapitalGain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmInterestAmount
 * CorporateActionAmounts12.mmInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmMarketClaimAmount
 * CorporateActionAmounts12.mmMarketClaimAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmIndemnityAmount
 * CorporateActionAmounts12.mmIndemnityAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmManufacturedDividendPaymentAmount
 * CorporateActionAmounts12.mmManufacturedDividendPaymentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmReinvestmentAmount
 * CorporateActionAmounts12.mmReinvestmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmFullyFrankedAmount
 * CorporateActionAmounts12.mmFullyFrankedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmUnfrankedAmount
 * CorporateActionAmounts12.mmUnfrankedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmSundryOrOtherAmount
 * CorporateActionAmounts12.mmSundryOrOtherAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmCashIncentive
 * CorporateActionAmounts12.mmCashIncentive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmTaxFreeAmount
 * CorporateActionAmounts12.mmTaxFreeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmTaxDeferredAmount
 * CorporateActionAmounts12.mmTaxDeferredAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmValueAddedTaxAmount
 * CorporateActionAmounts12.mmValueAddedTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmStampDutyAmount
 * CorporateActionAmounts12.mmStampDutyAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmTaxReclaimAmount
 * CorporateActionAmounts12.mmTaxReclaimAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmTaxCreditAmount
 * CorporateActionAmounts12.mmTaxCreditAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmWithholdingOfForeignTaxAmount
 * CorporateActionAmounts12.mmWithholdingOfForeignTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmWithholdingOfLocalTaxAmount
 * CorporateActionAmounts12.mmWithholdingOfLocalTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmAdditionalTaxAmount
 * CorporateActionAmounts12.mmAdditionalTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmWithholdingTaxAmount
 * CorporateActionAmounts12.mmWithholdingTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmFiscalStampAmount
 * CorporateActionAmounts12.mmFiscalStampAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmExecutingBrokerAmount
 * CorporateActionAmounts12.mmExecutingBrokerAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmPayingAgentCommissionAmount
 * CorporateActionAmounts12.mmPayingAgentCommissionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmLocalBrokerCommissionAmount
 * CorporateActionAmounts12.mmLocalBrokerCommissionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmPostageFeeAmount
 * CorporateActionAmounts12.mmPostageFeeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmRegulatoryFeesAmount
 * CorporateActionAmounts12.mmRegulatoryFeesAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmShippingFeesAmount
 * CorporateActionAmounts12.mmShippingFeesAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmChargesAmount
 * CorporateActionAmounts12.mmChargesAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmCashAmountBroughtForward
 * CorporateActionAmounts12.mmCashAmountBroughtForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmCashAmountCarriedForward
 * CorporateActionAmounts12.mmCashAmountCarriedForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmNotionalDividendPayableAmount
 * CorporateActionAmounts12.mmNotionalDividendPayableAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmNotionalTaxAmount
 * CorporateActionAmounts12.mmNotionalTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmTaxArrearsAmount
 * CorporateActionAmounts12.mmTaxArrearsAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmOriginalAmount
 * CorporateActionAmounts12.mmOriginalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmPrincipalOrCorpus
 * CorporateActionAmounts12.mmPrincipalOrCorpus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmRedemptionPremiumAmount
 * CorporateActionAmounts12.mmRedemptionPremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmIncomePortion
 * CorporateActionAmounts12.mmIncomePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmStockExchangeTax
 * CorporateActionAmounts12.mmStockExchangeTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmEUTaxRetentionAmount
 * CorporateActionAmounts12.mmEUTaxRetentionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmAccruedInterestAmount
 * CorporateActionAmounts12.mmAccruedInterestAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionAmounts12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies amounts in the framework of a corporate action event."</li>
 * </ul>
 */
public class CorporateActionAmounts12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RestrictedFINActiveCurrencyAndAmount postingAmount;
	/**
	 * Amount of money that is to be/was posted to the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmPostingAmount
	 * CorporateActionDistribution.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstngAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money that is to be/was posted to the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPostingAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmPostingAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "PstngAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostingAmount";
			definition = "Amount of money that is to be/was posted to the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount grossCashAmount;
	/**
	 * Amount of money before any deductions and allowances have been made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmGrossCashAmount
	 * CorporateActionCashEntitlement.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrssCshAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossCashAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money before any deductions and allowances have been made."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGrossCashAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionCashEntitlement.mmGrossCashAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "GrssCshAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossCashAmount";
			definition = "Amount of money before any deductions and allowances have been made.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount netCashAmount;
	/**
	 * Amount of money after deductions and allowances have been made, if any,
	 * that is, the total amount +/- charges/fees.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmNetCashAmount
	 * CorporateActionCashEntitlement.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetCshAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetCashAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money after deductions and allowances have been made, if any, that is, the total amount +/- charges/fees."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetCashAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionCashEntitlement.mmNetCashAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "NetCshAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetCashAmount";
			definition = "Amount of money after deductions and allowances have been made, if any, that is, the total amount +/- charges/fees.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount solicitationFees;
	/**
	 * Amount of cash premium made available in order to encourage participation
	 * in the offer. Payment is made to a third party who has solicited an
	 * entity to take part in the offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmSolicitationFee
	 * CorporateActionFeesAndCharges.mmSolicitationFee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SlctnFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of cash premium made available in order to encourage participation in the offer. Payment is made to a third party who has solicited an entity to take part in the offer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSolicitationFees = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionFeesAndCharges.mmSolicitationFee;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "SlctnFees";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationFees";
			definition = "Amount of cash premium made available in order to encourage participation in the offer. Payment is made to a third party who has solicited an entity to take part in the offer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount cashInLieuOfShare;
	/**
	 * Cash disbursement in lieu of a fractional quantity of, for example,
	 * equity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmCashInLieuOfShare
	 * CorporateActionCashEntitlement.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshInLieuOfShr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash disbursement in lieu of a fractional quantity of, for example, equity."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashInLieuOfShare = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionCashEntitlement.mmCashInLieuOfShare;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "CshInLieuOfShr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieuOfShare";
			definition = "Cash disbursement in lieu of a fractional quantity of, for example, equity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount capitalGain;
	/**
	 * Amount of money distributed as the result of a capital gain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmCapitalGain
	 * CorporateActionCashEntitlement.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CptlGn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money distributed as the result of a capital gain."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCapitalGain = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionCashEntitlement.mmCapitalGain;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "CptlGn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGain";
			definition = "Amount of money distributed as the result of a capital gain.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount interestAmount;
	/**
	 * Amount of money representing a coupon payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAmount
	 * Interest.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money representing a coupon payment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "IntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestAmount";
			definition = "Amount of money representing a coupon payment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount marketClaimAmount;
	/**
	 * Amount of money resulting from a market claim.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarketClaim#mmMarketClaimAmount
	 * MarketClaim.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktClmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClaimAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money resulting from a market claim."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMarketClaimAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MarketClaim.mmMarketClaimAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "MktClmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClaimAmount";
			definition = "Amount of money resulting from a market claim.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount indemnityAmount;
	/**
	 * (Unique to France) Amount due to a buyer of securities dealt prior to ex
	 * date which may be subject to different rate of taxation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmIndemnityAmount
	 * CashProceedsDefinition.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndmntyAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndemnityAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "(Unique to France) Amount due to a buyer of securities dealt prior to ex date which may be subject to different rate of taxation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIndemnityAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmIndemnityAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "IndmntyAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndemnityAmount";
			definition = "(Unique to France) Amount due to a buyer of securities dealt prior to ex date which may be subject to different rate of taxation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount manufacturedDividendPaymentAmount;
	/**
	 * Amount of money that the borrower pays to the lender as a compensation.
	 * It does not entitle the lender to reclaim any tax credit and is sometimes
	 * treated differently by the local tax authorities of the lender. Also
	 * covers compensation/indemnity of missed dividend concerning early/late
	 * settlements if applicable to a market.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ManfctrdDvddPmtAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManufacturedDividendPaymentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money that the borrower pays to the lender as a compensation. It does not entitle the lender to reclaim any tax credit and is sometimes treated differently by the local tax authorities of the lender. Also covers compensation/indemnity of missed dividend concerning early/late settlements if applicable to a market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmManufacturedDividendPaymentAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmManufacturedDividendAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "ManfctrdDvddPmtAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManufacturedDividendPaymentAmount";
			definition = "Amount of money that the borrower pays to the lender as a compensation. It does not entitle the lender to reclaim any tax credit and is sometimes treated differently by the local tax authorities of the lender. Also covers compensation/indemnity of missed dividend concerning early/late settlements if applicable to a market.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount reinvestmentAmount;
	/**
	 * Amount of money reinvested in additional securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmReinvestmentAmount
	 * SecuritiesProceedsDefinition.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RinvstmtAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money reinvested in additional securities."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReinvestmentAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmReinvestmentAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "RinvstmtAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentAmount";
			definition = "Amount of money reinvested in additional securities.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount fullyFrankedAmount;
	/**
	 * Amount resulting from a fully franked dividend paid by a company; amount
	 * includes tax credit for companies that have made sufficient tax payments
	 * during the fiscal period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmAmount
	 * RateAndAmount.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FullyFrnkdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyFrankedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount resulting from a fully franked dividend paid by a company; amount includes tax credit for companies that have made sufficient tax payments during the fiscal period."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFullyFrankedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> RateAndAmount.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "FullyFrnkdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyFrankedAmount";
			definition = "Amount resulting from a fully franked dividend paid by a company; amount includes tax credit for companies that have made sufficient tax payments during the fiscal period.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount unfrankedAmount;
	/**
	 * Amount resulting from an unfranked dividend paid by a company; the amount
	 * does not include tax credit and is subject to withholding tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmUnfrankedAmount
	 * Dividend.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UfrnkdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnfrankedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount resulting from an unfranked dividend paid by a company; the amount does not include tax credit and is subject to withholding tax."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnfrankedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmUnfrankedAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "UfrnkdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnfrankedAmount";
			definition = "Amount resulting from an unfranked dividend paid by a company; the amount does not include tax credit and is subject to withholding tax.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount sundryOrOtherAmount;
	/**
	 * Amount of money related to taxable income that cannot be categorised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmSundryOrOtherAmount
	 * TaxVoucher.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndryOrOthrAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SundryOrOtherAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money related to taxable income that cannot be categorised."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSundryOrOtherAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmSundryOrOtherAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "SndryOrOthrAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SundryOrOtherAmount";
			definition = "Amount of money related to taxable income that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount cashIncentive;
	/**
	 * Cash premium made available if the securities holder consents or
	 * participates to an event, for example, consent fees or solicitation fees.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmCashIncentiveAmount
	 * CashProceedsDefinition.mmCashIncentiveAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshIncntiv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashIncentive"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash premium made available if the securities holder consents or participates to an event, for example, consent fees or solicitation fees."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashIncentive = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmCashIncentiveAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "CshIncntiv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashIncentive";
			definition = "Cash premium made available if the securities holder consents or participates to an event, for example, consent fees or solicitation fees.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount taxFreeAmount;
	/**
	 * Amount of money that has not been subject to taxation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxFreeAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxFreeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money that has not been subject to taxation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxFreeAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "TaxFreeAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxFreeAmount";
			definition = "Amount of money that has not been subject to taxation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount taxDeferredAmount;
	/**
	 * Amount of income eligible for deferred taxation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxDfrrdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDeferredAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of income eligible for deferred taxation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxDeferredAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "TaxDfrrdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDeferredAmount";
			definition = "Amount of income eligible for deferred taxation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount valueAddedTaxAmount;
	/**
	 * Tax on value added.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValAddedTaxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax on value added."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValueAddedTaxAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "ValAddedTaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAddedTaxAmount";
			definition = "Tax on value added.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount stampDutyAmount;
	/**
	 * Amount of stamp duty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmpDtyAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDutyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of stamp duty."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStampDutyAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "StmpDtyAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDutyAmount";
			definition = "Amount of stamp duty.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount taxReclaimAmount;
	/**
	 * Amount that was paid in excess of actual tax obligation and was
	 * reclaimed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRclmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxReclaimAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount that was paid in excess of actual tax obligation and was reclaimed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxReclaimAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "TaxRclmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReclaimAmount";
			definition = "Amount that was paid in excess of actual tax obligation and was reclaimed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount taxCreditAmount;
	/**
	 * Amount of taxes that have been previously paid in relation to the taxable
	 * event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmCreditAmount
	 * TaxVoucher.mmCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxCdtAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of taxes that have been previously paid in relation to the taxable event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxCreditAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmCreditAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "TaxCdtAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditAmount";
			definition = "Amount of taxes that have been previously paid in relation to the taxable event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount withholdingOfForeignTaxAmount;
	/**
	 * Amount of money withheld by the jurisdiction in which the income was
	 * originally paid, for which relief at source and/or reclaim may be
	 * possible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhldgOfFrgnTaxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingOfForeignTaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money withheld by the jurisdiction in which the income was originally paid, for which relief at source and/or reclaim may be possible."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWithholdingOfForeignTaxAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "WhldgOfFrgnTaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingOfForeignTaxAmount";
			definition = "Amount of money withheld by the jurisdiction in which the income was originally paid, for which relief at source and/or reclaim may be possible.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount withholdingOfLocalTaxAmount;
	/**
	 * Amount of money withheld by the jurisdiction in which the account owner
	 * is located, for which relief at source and/or reclaim may be possible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhldgOfLclTaxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingOfLocalTaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money withheld by the jurisdiction in which the account owner is located, for which relief at source and/or reclaim may be possible."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWithholdingOfLocalTaxAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "WhldgOfLclTaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingOfLocalTaxAmount";
			definition = "Amount of money withheld by the jurisdiction in which the account owner is located, for which relief at source and/or reclaim may be possible.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount additionalTaxAmount;
	/**
	 * Amount of additional taxes that cannot be categorised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlTaxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of additional taxes that cannot be categorised."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalTaxAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "AddtlTaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTaxAmount";
			definition = "Amount of additional taxes that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount withholdingTaxAmount;
	/**
	 * Amount of a cash distribution that will be withheld by a tax authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhldgTaxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of a cash distribution that will be withheld by a tax authority."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWithholdingTaxAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "WhldgTaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxAmount";
			definition = "Amount of a cash distribution that will be withheld by a tax authority.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount fiscalStampAmount;
	/**
	 * Amount of fiscal tax to apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FsclStmpAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FiscalStampAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of fiscal tax to apply."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFiscalStampAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "FsclStmpAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiscalStampAmount";
			definition = "Amount of fiscal tax to apply.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount executingBrokerAmount;
	/**
	 * Amount of money paid to an executing broker as a commission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctgBrkrAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutingBrokerAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money paid to an executing broker as a commission."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExecutingBrokerAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "ExctgBrkrAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutingBrokerAmount";
			definition = "Amount of money paid to an executing broker as a commission.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount payingAgentCommissionAmount;
	/**
	 * Amount of paying/sub-paying agent commission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PngAgtComssnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayingAgentCommissionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of paying/sub-paying agent commission."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPayingAgentCommissionAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "PngAgtComssnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgentCommissionAmount";
			definition = "Amount of paying/sub-paying agent commission.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount localBrokerCommissionAmount;
	/**
	 * Local broker's commission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclBrkrComssnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalBrokerCommissionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Local broker's commission."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLocalBrokerCommissionAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "LclBrkrComssnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalBrokerCommissionAmount";
			definition = "Local broker's commission.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount postageFeeAmount;
	/**
	 * Amount of money paid for delivery by regular post mail.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmPostageFeeAmount
	 * SecuritiesRelatedFees.mmPostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstgFeeAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostageFeeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money paid for delivery by regular post mail."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPostageFeeAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesRelatedFees.mmPostageFeeAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "PstgFeeAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostageFeeAmount";
			definition = "Amount of money paid for delivery by regular post mail.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount regulatoryFeesAmount;
	/**
	 * Amount of money charged by a regulatory authority, for example,
	 * Securities and Exchange fees.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmRegulatoryFeesAmount
	 * SecuritiesRelatedFees.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RgltryFeesAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryFeesAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money charged by a regulatory authority, for example, Securities and Exchange fees."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegulatoryFeesAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesRelatedFees.mmRegulatoryFeesAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "RgltryFeesAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryFeesAmount";
			definition = "Amount of money charged by a regulatory authority, for example, Securities and Exchange fees.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount shippingFeesAmount;
	/**
	 * Amount of money (including insurance) paid for delivery by carrier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmShippingFeesAmount
	 * SecuritiesRelatedFees.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShppgFeesAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingFeesAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money (including insurance) paid for delivery by carrier."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmShippingFeesAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesRelatedFees.mmShippingFeesAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "ShppgFeesAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingFeesAmount";
			definition = "Amount of money (including insurance) paid for delivery by carrier.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount chargesAmount;
	/**
	 * Amount of money paid for the provision of financial services that cannot
	 * be categorised by another qualifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money paid for the provision of financial services that cannot be categorised by another qualifier."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChargesAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "ChrgsAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAmount";
			definition = "Amount of money paid for the provision of financial services that cannot be categorised by another qualifier.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount cashAmountBroughtForward;
	/**
	 * Indicates cash retained from previous dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmCashAmountBroughtForward
	 * TaxVoucher.mmCashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAmtBrghtFwd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAmountBroughtForward"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates cash retained from previous dividend."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashAmountBroughtForward = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmCashAmountBroughtForward;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "CshAmtBrghtFwd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAmountBroughtForward";
			definition = "Indicates cash retained from previous dividend.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount cashAmountCarriedForward;
	/**
	 * Indicates the balance carried forward to next dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmCashAmountCarriedForward
	 * TaxVoucher.mmCashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAmtCrrdFwd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAmountCarriedForward"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the balance carried forward to next dividend."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashAmountCarriedForward = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmCashAmountCarriedForward;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "CshAmtCrrdFwd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAmountCarriedForward";
			definition = "Indicates the balance carried forward to next dividend.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount notionalDividendPayableAmount;
	/**
	 * Amount of cash that would have been payable if the dividend had been
	 * taken in the form of cash rather than shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmNotionalDividendPayableAmount
	 * Dividend.mmNotionalDividendPayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtnlDvddPyblAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalDividendPayableAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of cash that would have been payable if the dividend had been taken in the form of cash rather than shares."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotionalDividendPayableAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmNotionalDividendPayableAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "NtnlDvddPyblAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalDividendPayableAmount";
			definition = "Amount of cash that would have been payable if the dividend had been taken in the form of cash rather than shares.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount notionalTaxAmount;
	/**
	 * Where new securities are issued in lieu of a cash dividend, the notional
	 * tax is the tax on the amount of cash that would have been paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmNotionalTaxAmount
	 * TaxVoucher.mmNotionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtnlTaxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalTaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Where new securities are issued in lieu of a cash dividend, the notional tax is the tax on the amount of cash that would have been paid."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotionalTaxAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmNotionalTaxAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "NtnlTaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalTaxAmount";
			definition = "Where new securities are issued in lieu of a cash dividend, the notional tax is the tax on the amount of cash that would have been paid.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount taxArrearsAmount;
	/**
	 * Amount of money paid by the Tax Authorities in addition to the payment of
	 * the tax refund itself.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxArrearsAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxArrearsAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money paid by the Tax Authorities in addition to the payment of the tax refund itself."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxArrearsAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "TaxArrearsAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxArrearsAmount";
			definition = "Amount of money paid by the Tax Authorities in addition to the payment of the tax refund itself.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount originalAmount;
	/**
	 * Posting/settlement Amount in its original currency when conversion
	 * from/into another currency has occurred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmOriginalAmount
	 * CurrencyExchange.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Posting/settlement Amount in its original currency when conversion from/into another currency has occurred."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmOriginalAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "OrgnlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalAmount";
			definition = "Posting/settlement Amount in its original currency when conversion from/into another currency has occurred.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount principalOrCorpus;
	/**
	 * Amount of money representing a distribution of a bond's principal, for
	 * example, repayment of outstanding debt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmPrincipalOrCorpus
	 * CashProceedsDefinition.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrncplOrCrps"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalOrCorpus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money representing a distribution of a bond's principal, for example, repayment of outstanding debt."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPrincipalOrCorpus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmPrincipalOrCorpus;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "PrncplOrCrps";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalOrCorpus";
			definition = "Amount of money representing a distribution of a bond's principal, for example, repayment of outstanding debt.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount redemptionPremiumAmount;
	/**
	 * Amount of money (not interest) in addition to the principal at the
	 * redemption of a bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmRedemptionPremiumAmount
	 * CashProceedsDefinition.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedPrmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionPremiumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money (not interest) in addition to the principal at the redemption of a bond."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRedemptionPremiumAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmRedemptionPremiumAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "RedPrmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionPremiumAmount";
			definition = "Amount of money (not interest) in addition to the principal at the redemption of a bond.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount incomePortion;
	/**
	 * Amount relating to the underlying security for which income is
	 * distributed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmIncomePortion
	 * CashProceedsDefinition.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncmPrtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePortion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount relating to the underlying security for which income is distributed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIncomePortion = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmIncomePortion;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "IncmPrtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePortion";
			definition = "Amount relating to the underlying security for which income is distributed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount stockExchangeTax;
	/**
	 * Amount of stock exchange tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StockXchgTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockExchangeTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of stock exchange tax."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStockExchangeTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "StockXchgTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockExchangeTax";
			definition = "Amount of stock exchange tax.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount eUTaxRetentionAmount;
	/**
	 * Total amount of tax withheld at source in conformance with the EU Savings
	 * Directive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EUTaxRtntnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUTaxRetentionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of tax withheld at source in conformance with the EU Savings Directive."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEUTaxRetentionAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "EUTaxRtntnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUTaxRetentionAmount";
			definition = "Total amount of tax withheld at source in conformance with the EU Savings Directive.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount accruedInterestAmount;
	/**
	 * Amount of interest that has been accrued in between coupon payment
	 * periods
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
	 * Interest.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12
	 * CorporateActionAmounts12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of interest that has been accrued in between coupon payment periods"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccruedInterestAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> CorporateActionAmounts12.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Amount of interest that has been accrued in between coupon payment periods";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionAmounts12.mmPostingAmount, CorporateActionAmounts12.mmGrossCashAmount, CorporateActionAmounts12.mmNetCashAmount, CorporateActionAmounts12.mmSolicitationFees,
						CorporateActionAmounts12.mmCashInLieuOfShare, CorporateActionAmounts12.mmCapitalGain, CorporateActionAmounts12.mmInterestAmount, CorporateActionAmounts12.mmMarketClaimAmount,
						CorporateActionAmounts12.mmIndemnityAmount, CorporateActionAmounts12.mmManufacturedDividendPaymentAmount, CorporateActionAmounts12.mmReinvestmentAmount, CorporateActionAmounts12.mmFullyFrankedAmount,
						CorporateActionAmounts12.mmUnfrankedAmount, CorporateActionAmounts12.mmSundryOrOtherAmount, CorporateActionAmounts12.mmCashIncentive, CorporateActionAmounts12.mmTaxFreeAmount,
						CorporateActionAmounts12.mmTaxDeferredAmount, CorporateActionAmounts12.mmValueAddedTaxAmount, CorporateActionAmounts12.mmStampDutyAmount, CorporateActionAmounts12.mmTaxReclaimAmount,
						CorporateActionAmounts12.mmTaxCreditAmount, CorporateActionAmounts12.mmWithholdingOfForeignTaxAmount, CorporateActionAmounts12.mmWithholdingOfLocalTaxAmount, CorporateActionAmounts12.mmAdditionalTaxAmount,
						CorporateActionAmounts12.mmWithholdingTaxAmount, CorporateActionAmounts12.mmFiscalStampAmount, CorporateActionAmounts12.mmExecutingBrokerAmount, CorporateActionAmounts12.mmPayingAgentCommissionAmount,
						CorporateActionAmounts12.mmLocalBrokerCommissionAmount, CorporateActionAmounts12.mmPostageFeeAmount, CorporateActionAmounts12.mmRegulatoryFeesAmount, CorporateActionAmounts12.mmShippingFeesAmount,
						CorporateActionAmounts12.mmChargesAmount, CorporateActionAmounts12.mmCashAmountBroughtForward, CorporateActionAmounts12.mmCashAmountCarriedForward, CorporateActionAmounts12.mmNotionalDividendPayableAmount,
						CorporateActionAmounts12.mmNotionalTaxAmount, CorporateActionAmounts12.mmTaxArrearsAmount, CorporateActionAmounts12.mmOriginalAmount, CorporateActionAmounts12.mmPrincipalOrCorpus,
						CorporateActionAmounts12.mmRedemptionPremiumAmount, CorporateActionAmounts12.mmIncomePortion, CorporateActionAmounts12.mmStockExchangeTax, CorporateActionAmounts12.mmEUTaxRetentionAmount,
						CorporateActionAmounts12.mmAccruedInterestAmount);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CorporateActionAmounts12";
				definition = "Specifies amounts in the framework of a corporate action event.";
			}
		});
		return mmObject_lazy.get();
	}

	public RestrictedFINActiveCurrencyAndAmount getPostingAmount() {
		return postingAmount;
	}

	public void setPostingAmount(RestrictedFINActiveCurrencyAndAmount postingAmount) {
		this.postingAmount = postingAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getGrossCashAmount() {
		return grossCashAmount;
	}

	public void setGrossCashAmount(RestrictedFINActiveCurrencyAndAmount grossCashAmount) {
		this.grossCashAmount = grossCashAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getNetCashAmount() {
		return netCashAmount;
	}

	public void setNetCashAmount(RestrictedFINActiveCurrencyAndAmount netCashAmount) {
		this.netCashAmount = netCashAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getSolicitationFees() {
		return solicitationFees;
	}

	public void setSolicitationFees(RestrictedFINActiveCurrencyAndAmount solicitationFees) {
		this.solicitationFees = solicitationFees;
	}

	public RestrictedFINActiveCurrencyAndAmount getCashInLieuOfShare() {
		return cashInLieuOfShare;
	}

	public void setCashInLieuOfShare(RestrictedFINActiveCurrencyAndAmount cashInLieuOfShare) {
		this.cashInLieuOfShare = cashInLieuOfShare;
	}

	public RestrictedFINActiveCurrencyAndAmount getCapitalGain() {
		return capitalGain;
	}

	public void setCapitalGain(RestrictedFINActiveCurrencyAndAmount capitalGain) {
		this.capitalGain = capitalGain;
	}

	public RestrictedFINActiveCurrencyAndAmount getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(RestrictedFINActiveCurrencyAndAmount interestAmount) {
		this.interestAmount = interestAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getMarketClaimAmount() {
		return marketClaimAmount;
	}

	public void setMarketClaimAmount(RestrictedFINActiveCurrencyAndAmount marketClaimAmount) {
		this.marketClaimAmount = marketClaimAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getIndemnityAmount() {
		return indemnityAmount;
	}

	public void setIndemnityAmount(RestrictedFINActiveCurrencyAndAmount indemnityAmount) {
		this.indemnityAmount = indemnityAmount;
	}

	public ActiveCurrencyAndAmount getManufacturedDividendPaymentAmount() {
		return manufacturedDividendPaymentAmount;
	}

	public void setManufacturedDividendPaymentAmount(ActiveCurrencyAndAmount manufacturedDividendPaymentAmount) {
		this.manufacturedDividendPaymentAmount = manufacturedDividendPaymentAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getReinvestmentAmount() {
		return reinvestmentAmount;
	}

	public void setReinvestmentAmount(RestrictedFINActiveCurrencyAndAmount reinvestmentAmount) {
		this.reinvestmentAmount = reinvestmentAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getFullyFrankedAmount() {
		return fullyFrankedAmount;
	}

	public void setFullyFrankedAmount(RestrictedFINActiveCurrencyAndAmount fullyFrankedAmount) {
		this.fullyFrankedAmount = fullyFrankedAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getUnfrankedAmount() {
		return unfrankedAmount;
	}

	public void setUnfrankedAmount(RestrictedFINActiveCurrencyAndAmount unfrankedAmount) {
		this.unfrankedAmount = unfrankedAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getSundryOrOtherAmount() {
		return sundryOrOtherAmount;
	}

	public void setSundryOrOtherAmount(RestrictedFINActiveCurrencyAndAmount sundryOrOtherAmount) {
		this.sundryOrOtherAmount = sundryOrOtherAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getCashIncentive() {
		return cashIncentive;
	}

	public void setCashIncentive(RestrictedFINActiveCurrencyAndAmount cashIncentive) {
		this.cashIncentive = cashIncentive;
	}

	public RestrictedFINActiveCurrencyAndAmount getTaxFreeAmount() {
		return taxFreeAmount;
	}

	public void setTaxFreeAmount(RestrictedFINActiveCurrencyAndAmount taxFreeAmount) {
		this.taxFreeAmount = taxFreeAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getTaxDeferredAmount() {
		return taxDeferredAmount;
	}

	public void setTaxDeferredAmount(RestrictedFINActiveCurrencyAndAmount taxDeferredAmount) {
		this.taxDeferredAmount = taxDeferredAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getValueAddedTaxAmount() {
		return valueAddedTaxAmount;
	}

	public void setValueAddedTaxAmount(RestrictedFINActiveCurrencyAndAmount valueAddedTaxAmount) {
		this.valueAddedTaxAmount = valueAddedTaxAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getStampDutyAmount() {
		return stampDutyAmount;
	}

	public void setStampDutyAmount(RestrictedFINActiveCurrencyAndAmount stampDutyAmount) {
		this.stampDutyAmount = stampDutyAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getTaxReclaimAmount() {
		return taxReclaimAmount;
	}

	public void setTaxReclaimAmount(RestrictedFINActiveCurrencyAndAmount taxReclaimAmount) {
		this.taxReclaimAmount = taxReclaimAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getTaxCreditAmount() {
		return taxCreditAmount;
	}

	public void setTaxCreditAmount(RestrictedFINActiveCurrencyAndAmount taxCreditAmount) {
		this.taxCreditAmount = taxCreditAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getWithholdingOfForeignTaxAmount() {
		return withholdingOfForeignTaxAmount;
	}

	public void setWithholdingOfForeignTaxAmount(RestrictedFINActiveCurrencyAndAmount withholdingOfForeignTaxAmount) {
		this.withholdingOfForeignTaxAmount = withholdingOfForeignTaxAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getWithholdingOfLocalTaxAmount() {
		return withholdingOfLocalTaxAmount;
	}

	public void setWithholdingOfLocalTaxAmount(RestrictedFINActiveCurrencyAndAmount withholdingOfLocalTaxAmount) {
		this.withholdingOfLocalTaxAmount = withholdingOfLocalTaxAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getAdditionalTaxAmount() {
		return additionalTaxAmount;
	}

	public void setAdditionalTaxAmount(RestrictedFINActiveCurrencyAndAmount additionalTaxAmount) {
		this.additionalTaxAmount = additionalTaxAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getWithholdingTaxAmount() {
		return withholdingTaxAmount;
	}

	public void setWithholdingTaxAmount(RestrictedFINActiveCurrencyAndAmount withholdingTaxAmount) {
		this.withholdingTaxAmount = withholdingTaxAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getFiscalStampAmount() {
		return fiscalStampAmount;
	}

	public void setFiscalStampAmount(RestrictedFINActiveCurrencyAndAmount fiscalStampAmount) {
		this.fiscalStampAmount = fiscalStampAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getExecutingBrokerAmount() {
		return executingBrokerAmount;
	}

	public void setExecutingBrokerAmount(RestrictedFINActiveCurrencyAndAmount executingBrokerAmount) {
		this.executingBrokerAmount = executingBrokerAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getPayingAgentCommissionAmount() {
		return payingAgentCommissionAmount;
	}

	public void setPayingAgentCommissionAmount(RestrictedFINActiveCurrencyAndAmount payingAgentCommissionAmount) {
		this.payingAgentCommissionAmount = payingAgentCommissionAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getLocalBrokerCommissionAmount() {
		return localBrokerCommissionAmount;
	}

	public void setLocalBrokerCommissionAmount(RestrictedFINActiveCurrencyAndAmount localBrokerCommissionAmount) {
		this.localBrokerCommissionAmount = localBrokerCommissionAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getPostageFeeAmount() {
		return postageFeeAmount;
	}

	public void setPostageFeeAmount(RestrictedFINActiveCurrencyAndAmount postageFeeAmount) {
		this.postageFeeAmount = postageFeeAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getRegulatoryFeesAmount() {
		return regulatoryFeesAmount;
	}

	public void setRegulatoryFeesAmount(RestrictedFINActiveCurrencyAndAmount regulatoryFeesAmount) {
		this.regulatoryFeesAmount = regulatoryFeesAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getShippingFeesAmount() {
		return shippingFeesAmount;
	}

	public void setShippingFeesAmount(RestrictedFINActiveCurrencyAndAmount shippingFeesAmount) {
		this.shippingFeesAmount = shippingFeesAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getChargesAmount() {
		return chargesAmount;
	}

	public void setChargesAmount(RestrictedFINActiveCurrencyAndAmount chargesAmount) {
		this.chargesAmount = chargesAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getCashAmountBroughtForward() {
		return cashAmountBroughtForward;
	}

	public void setCashAmountBroughtForward(RestrictedFINActiveCurrencyAndAmount cashAmountBroughtForward) {
		this.cashAmountBroughtForward = cashAmountBroughtForward;
	}

	public RestrictedFINActiveCurrencyAndAmount getCashAmountCarriedForward() {
		return cashAmountCarriedForward;
	}

	public void setCashAmountCarriedForward(RestrictedFINActiveCurrencyAndAmount cashAmountCarriedForward) {
		this.cashAmountCarriedForward = cashAmountCarriedForward;
	}

	public RestrictedFINActiveCurrencyAndAmount getNotionalDividendPayableAmount() {
		return notionalDividendPayableAmount;
	}

	public void setNotionalDividendPayableAmount(RestrictedFINActiveCurrencyAndAmount notionalDividendPayableAmount) {
		this.notionalDividendPayableAmount = notionalDividendPayableAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getNotionalTaxAmount() {
		return notionalTaxAmount;
	}

	public void setNotionalTaxAmount(RestrictedFINActiveCurrencyAndAmount notionalTaxAmount) {
		this.notionalTaxAmount = notionalTaxAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getTaxArrearsAmount() {
		return taxArrearsAmount;
	}

	public void setTaxArrearsAmount(RestrictedFINActiveCurrencyAndAmount taxArrearsAmount) {
		this.taxArrearsAmount = taxArrearsAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getOriginalAmount() {
		return originalAmount;
	}

	public void setOriginalAmount(RestrictedFINActiveCurrencyAndAmount originalAmount) {
		this.originalAmount = originalAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getPrincipalOrCorpus() {
		return principalOrCorpus;
	}

	public void setPrincipalOrCorpus(RestrictedFINActiveCurrencyAndAmount principalOrCorpus) {
		this.principalOrCorpus = principalOrCorpus;
	}

	public RestrictedFINActiveCurrencyAndAmount getRedemptionPremiumAmount() {
		return redemptionPremiumAmount;
	}

	public void setRedemptionPremiumAmount(RestrictedFINActiveCurrencyAndAmount redemptionPremiumAmount) {
		this.redemptionPremiumAmount = redemptionPremiumAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getIncomePortion() {
		return incomePortion;
	}

	public void setIncomePortion(RestrictedFINActiveCurrencyAndAmount incomePortion) {
		this.incomePortion = incomePortion;
	}

	public RestrictedFINActiveCurrencyAndAmount getStockExchangeTax() {
		return stockExchangeTax;
	}

	public void setStockExchangeTax(RestrictedFINActiveCurrencyAndAmount stockExchangeTax) {
		this.stockExchangeTax = stockExchangeTax;
	}

	public RestrictedFINActiveCurrencyAndAmount getEUTaxRetentionAmount() {
		return eUTaxRetentionAmount;
	}

	public void setEUTaxRetentionAmount(RestrictedFINActiveCurrencyAndAmount eUTaxRetentionAmount) {
		this.eUTaxRetentionAmount = eUTaxRetentionAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getAccruedInterestAmount() {
		return accruedInterestAmount;
	}

	public void setAccruedInterestAmount(RestrictedFINActiveCurrencyAndAmount accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
	}
}