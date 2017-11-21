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
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmGrossCashAmount
 * CorporateActionAmounts10.mmGrossCashAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmNetCashAmount
 * CorporateActionAmounts10.mmNetCashAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmSolicitationFees
 * CorporateActionAmounts10.mmSolicitationFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmCashInLieuOfShare
 * CorporateActionAmounts10.mmCashInLieuOfShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmCapitalGain
 * CorporateActionAmounts10.mmCapitalGain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmInterestAmount
 * CorporateActionAmounts10.mmInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmIndemnityAmount
 * CorporateActionAmounts10.mmIndemnityAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmManufacturedDividendPaymentAmount
 * CorporateActionAmounts10.mmManufacturedDividendPaymentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmReinvestmentAmount
 * CorporateActionAmounts10.mmReinvestmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmFullyFrankedAmount
 * CorporateActionAmounts10.mmFullyFrankedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmUnfrankedAmount
 * CorporateActionAmounts10.mmUnfrankedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmSundryOrOtherAmount
 * CorporateActionAmounts10.mmSundryOrOtherAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmCashIncentive
 * CorporateActionAmounts10.mmCashIncentive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmTaxFreeAmount
 * CorporateActionAmounts10.mmTaxFreeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmTaxDeferredAmount
 * CorporateActionAmounts10.mmTaxDeferredAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmValueAddedTaxAmount
 * CorporateActionAmounts10.mmValueAddedTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmStampDutyAmount
 * CorporateActionAmounts10.mmStampDutyAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmTaxReclaimAmount
 * CorporateActionAmounts10.mmTaxReclaimAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmTaxCreditAmount
 * CorporateActionAmounts10.mmTaxCreditAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmWithholdingOfForeignTaxAmount
 * CorporateActionAmounts10.mmWithholdingOfForeignTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmWithholdingOfLocalTaxAmount
 * CorporateActionAmounts10.mmWithholdingOfLocalTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmAdditionalTaxAmount
 * CorporateActionAmounts10.mmAdditionalTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmWithholdingTaxAmount
 * CorporateActionAmounts10.mmWithholdingTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmFiscalStampAmount
 * CorporateActionAmounts10.mmFiscalStampAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmExecutingBrokerAmount
 * CorporateActionAmounts10.mmExecutingBrokerAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmPayingAgentCommissionAmount
 * CorporateActionAmounts10.mmPayingAgentCommissionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmLocalBrokerCommissionAmount
 * CorporateActionAmounts10.mmLocalBrokerCommissionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmPostageFeeAmount
 * CorporateActionAmounts10.mmPostageFeeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmRegulatoryFeesAmount
 * CorporateActionAmounts10.mmRegulatoryFeesAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmShippingFeesAmount
 * CorporateActionAmounts10.mmShippingFeesAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmChargesAmount
 * CorporateActionAmounts10.mmChargesAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmEntitledAmount
 * CorporateActionAmounts10.mmEntitledAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmOriginalAmount
 * CorporateActionAmounts10.mmOriginalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmPrincipalOrCorpus
 * CorporateActionAmounts10.mmPrincipalOrCorpus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmRedemptionPremiumAmount
 * CorporateActionAmounts10.mmRedemptionPremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmIncomePortion
 * CorporateActionAmounts10.mmIncomePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmStockExchangeTax
 * CorporateActionAmounts10.mmStockExchangeTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmEUTaxRetentionAmount
 * CorporateActionAmounts10.mmEUTaxRetentionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmAccruedInterestAmount
 * CorporateActionAmounts10.mmAccruedInterestAmount}</li>
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
 * "CorporateActionAmounts10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies amounts in the framework of a corporate action event."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionAmounts15
 * CorporateActionAmounts15}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionAmounts10", propOrder = {"grossCashAmount", "netCashAmount", "solicitationFees", "cashInLieuOfShare", "capitalGain", "interestAmount", "indemnityAmount", "manufacturedDividendPaymentAmount",
		"reinvestmentAmount", "fullyFrankedAmount", "unfrankedAmount", "sundryOrOtherAmount", "cashIncentive", "taxFreeAmount", "taxDeferredAmount", "valueAddedTaxAmount", "stampDutyAmount", "taxReclaimAmount", "taxCreditAmount",
		"withholdingOfForeignTaxAmount", "withholdingOfLocalTaxAmount", "additionalTaxAmount", "withholdingTaxAmount", "fiscalStampAmount", "executingBrokerAmount", "payingAgentCommissionAmount", "localBrokerCommissionAmount",
		"postageFeeAmount", "regulatoryFeesAmount", "shippingFeesAmount", "chargesAmount", "entitledAmount", "originalAmount", "principalOrCorpus", "redemptionPremiumAmount", "incomePortion", "stockExchangeTax", "EUTaxRetentionAmount",
		"accruedInterestAmount"})
public class CorporateActionAmounts10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount grossCashAmount;
	/**
	 * Amount of money before any deductions and allowances have been made.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmGrossCashAmount
	 * CorporateActionCashEntitlement.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "GrssCshAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossCashAmount";
			definition = "Amount of money before any deductions and allowances have been made.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount netCashAmount;
	/**
	 * Amount of money after deductions and allowances have been made, if any,
	 * that is, the total amount +/- charges/fees.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmNetCashAmount
	 * CorporateActionCashEntitlement.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "NetCshAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetCashAmount";
			definition = "Amount of money after deductions and allowances have been made, if any, that is, the total amount +/- charges/fees.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount solicitationFees;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "SlctnFees";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationFees";
			definition = "Amount of cash premium made available in order to encourage participation in the offer. Payment is made to a third party who has solicited an entity to take part in the offer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount cashInLieuOfShare;
	/**
	 * Cash disbursement in lieu of a fractional quantity of, for example,
	 * equity.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmCashInLieuOfShare
	 * CorporateActionCashEntitlement.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "CshInLieuOfShr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieuOfShare";
			definition = "Cash disbursement in lieu of a fractional quantity of, for example, equity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount capitalGain;
	/**
	 * Amount of money distributed as the result of a capital gain.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmCapitalGain
	 * CorporateActionCashEntitlement.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "CptlGn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGain";
			definition = "Amount of money distributed as the result of a capital gain.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount interestAmount;
	/**
	 * Amount of money representing a coupon payment.
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
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAmount
	 * Interest.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "IntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestAmount";
			definition = "Amount of money representing a coupon payment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount indemnityAmount;
	/**
	 * (Unique to France) Amount due to a buyer of securities dealt prior to ex
	 * date which may be subject to different rate of taxation.
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
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmIndemnityAmount
	 * CashProceedsDefinition.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "IndmntyAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndemnityAmount";
			definition = "(Unique to France) Amount due to a buyer of securities dealt prior to ex date which may be subject to different rate of taxation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
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
	protected ActiveCurrencyAndAmount reinvestmentAmount;
	/**
	 * Amount of money reinvested in additional securities.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmReinvestmentAmount
	 * SecuritiesProceedsDefinition.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "RinvstmtAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentAmount";
			definition = "Amount of money reinvested in additional securities.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount fullyFrankedAmount;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "FullyFrnkdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyFrankedAmount";
			definition = "Amount resulting from a fully franked dividend paid by a company; amount includes tax credit for companies that have made sufficient tax payments during the fiscal period.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount unfrankedAmount;
	/**
	 * Amount resulting from an unfranked dividend paid by a company; the amount
	 * does not include tax credit and is subject to withholding tax.
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
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmUnfrankedAmount
	 * Dividend.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "UfrnkdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnfrankedAmount";
			definition = "Amount resulting from an unfranked dividend paid by a company; the amount does not include tax credit and is subject to withholding tax.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount sundryOrOtherAmount;
	/**
	 * Amount of money related to taxable income that cannot be categorised.
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
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmSundryOrOtherAmount
	 * TaxVoucher.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "SndryOrOthrAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SundryOrOtherAmount";
			definition = "Amount of money related to taxable income that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount cashIncentive;
	/**
	 * Cash premium made available if the securities holder consents or
	 * participates to an event, for example, consent fees or solicitation fees.
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
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmCashIncentiveAmount
	 * CashProceedsDefinition.mmCashIncentiveAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "CshIncntiv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashIncentive";
			definition = "Cash premium made available if the securities holder consents or participates to an event, for example, consent fees or solicitation fees.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount taxFreeAmount;
	/**
	 * Amount of money that has not been subject to taxation.
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "TaxFreeAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxFreeAmount";
			definition = "Amount of money that has not been subject to taxation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount taxDeferredAmount;
	/**
	 * Amount of income eligible for deferred taxation.
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "TaxDfrrdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDeferredAmount";
			definition = "Amount of income eligible for deferred taxation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount valueAddedTaxAmount;
	/**
	 * Amount of value added tax.
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
	 * definition} = "Amount of value added tax."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValueAddedTaxAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "ValAddedTaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAddedTaxAmount";
			definition = "Amount of value added tax.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount stampDutyAmount;
	/**
	 * Amount of stamp duty.
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "StmpDtyAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDutyAmount";
			definition = "Amount of stamp duty.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount taxReclaimAmount;
	/**
	 * Amount that was paid in excess of actual tax obligation and was
	 * reclaimed.
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "TaxRclmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReclaimAmount";
			definition = "Amount that was paid in excess of actual tax obligation and was reclaimed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount taxCreditAmount;
	/**
	 * Amount of taxes that have been previously paid in relation to the taxable
	 * event.
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
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmCreditAmount
	 * TaxVoucher.mmCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "TaxCdtAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditAmount";
			definition = "Amount of taxes that have been previously paid in relation to the taxable event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount withholdingOfForeignTaxAmount;
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
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "WhldgOfFrgnTaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingOfForeignTaxAmount";
			definition = "Amount of money withheld by the jurisdiction in which the income was originally paid, for which relief at source and/or reclaim may be possible.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount withholdingOfLocalTaxAmount;
	/**
	 * Amount of money withheld by the jurisdiction in which the account owner
	 * is located, for which relief at source and/or reclaim may be possible.
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "WhldgOfLclTaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingOfLocalTaxAmount";
			definition = "Amount of money withheld by the jurisdiction in which the account owner is located, for which relief at source and/or reclaim may be possible.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount additionalTaxAmount;
	/**
	 * Amount of additional taxes that cannot be categorised.
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "AddtlTaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTaxAmount";
			definition = "Amount of additional taxes that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount withholdingTaxAmount;
	/**
	 * Amount of a cash distribution that will be withheld by a tax authority.
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "WhldgTaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxAmount";
			definition = "Amount of a cash distribution that will be withheld by a tax authority.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount fiscalStampAmount;
	/**
	 * Amount of fiscal tax to apply.
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "FsclStmpAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiscalStampAmount";
			definition = "Amount of fiscal tax to apply.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount executingBrokerAmount;
	/**
	 * Amount of money paid to an executing broker as a commission.
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "ExctgBrkrAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutingBrokerAmount";
			definition = "Amount of money paid to an executing broker as a commission.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount payingAgentCommissionAmount;
	/**
	 * Amount of paying/sub-paying agent commission.
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "PngAgtComssnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgentCommissionAmount";
			definition = "Amount of paying/sub-paying agent commission.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount localBrokerCommissionAmount;
	/**
	 * Local broker's commission.
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "LclBrkrComssnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalBrokerCommissionAmount";
			definition = "Local broker's commission.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount postageFeeAmount;
	/**
	 * Amount of money paid for delivery by regular post mail.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmPostageFeeAmount
	 * SecuritiesRelatedFees.mmPostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "PstgFeeAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostageFeeAmount";
			definition = "Amount of money paid for delivery by regular post mail.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount regulatoryFeesAmount;
	/**
	 * Amount of money charged by a regulatory authority, for example,
	 * securities and exchange fees.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmRegulatoryFeesAmount
	 * SecuritiesRelatedFees.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
	 * "Amount of money charged by a regulatory authority, for example, securities and exchange fees."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegulatoryFeesAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesRelatedFees.mmRegulatoryFeesAmount;
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "RgltryFeesAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryFeesAmount";
			definition = "Amount of money charged by a regulatory authority, for example, securities and exchange fees.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount shippingFeesAmount;
	/**
	 * Amount of money (including insurance) paid for delivery by carrier.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmShippingFeesAmount
	 * SecuritiesRelatedFees.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "ShppgFeesAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingFeesAmount";
			definition = "Amount of money (including insurance) paid for delivery by carrier.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount chargesAmount;
	/**
	 * Amount of money paid for the provision of financial services that cannot
	 * be categorised by another qualifier.
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "ChrgsAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAmount";
			definition = "Amount of money paid for the provision of financial services that cannot be categorised by another qualifier.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount entitledAmount;
	/**
	 * Cash amount based on terms of corporate action event and balance of
	 * underlying securities, entitled to/from account owner (which may be
	 * positive or negative).
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmEntitledCashAmount
	 * CorporateActionCashEntitlement.mmEntitledCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EntitldAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitledAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash amount based on terms of corporate action event and balance of underlying securities, entitled to/from account owner (which may be positive or negative)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntitledAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionCashEntitlement.mmEntitledCashAmount;
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "EntitldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitledAmount";
			definition = "Cash amount based on terms of corporate action event and balance of underlying securities, entitled to/from account owner (which may be positive or negative).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount originalAmount;
	/**
	 * Posting/settlement amount in its original currency when conversion
	 * from/into another currency has occurred.
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
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmOriginalAmount
	 * CurrencyExchange.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
	 * "Posting/settlement amount in its original currency when conversion from/into another currency has occurred."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmOriginalAmount;
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "OrgnlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalAmount";
			definition = "Posting/settlement amount in its original currency when conversion from/into another currency has occurred.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount principalOrCorpus;
	/**
	 * Amount of money representing a distribution of a bond's principal, for
	 * example, repayment of outstanding debt.
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
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmPrincipalOrCorpus
	 * CashProceedsDefinition.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "PrncplOrCrps";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalOrCorpus";
			definition = "Amount of money representing a distribution of a bond's principal, for example, repayment of outstanding debt.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount redemptionPremiumAmount;
	/**
	 * Amount of money (not interest) in addition to the principal at the
	 * redemption of a bond.
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
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmRedemptionPremiumAmount
	 * CashProceedsDefinition.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "RedPrmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionPremiumAmount";
			definition = "Amount of money (not interest) in addition to the principal at the redemption of a bond.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount incomePortion;
	/**
	 * Amount relating to the underlying security for which income is
	 * distributed.
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
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmIncomePortion
	 * CashProceedsDefinition.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "IncmPrtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePortion";
			definition = "Amount relating to the underlying security for which income is distributed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount stockExchangeTax;
	/**
	 * Amount of stock exchange tax.
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "StockXchgTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockExchangeTax";
			definition = "Amount of stock exchange tax.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount eUTaxRetentionAmount;
	/**
	 * Total amount of tax withheld at source in conformance with the EU Savings
	 * Directive.
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "EUTaxRtntnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUTaxRetentionAmount";
			definition = "Total amount of tax withheld at source in conformance with the EU Savings Directive.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount accruedInterestAmount;
	/**
	 * Amount of interest that has been accrued in between coupon payment
	 * periods
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
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
	 * Interest.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10
	 * CorporateActionAmounts10}</li>
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
			componentContext_lazy = () -> CorporateActionAmounts10.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Amount of interest that has been accrued in between coupon payment periods";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionAmounts10.mmGrossCashAmount, CorporateActionAmounts10.mmNetCashAmount, CorporateActionAmounts10.mmSolicitationFees, CorporateActionAmounts10.mmCashInLieuOfShare,
						CorporateActionAmounts10.mmCapitalGain, CorporateActionAmounts10.mmInterestAmount, CorporateActionAmounts10.mmIndemnityAmount, CorporateActionAmounts10.mmManufacturedDividendPaymentAmount,
						CorporateActionAmounts10.mmReinvestmentAmount, CorporateActionAmounts10.mmFullyFrankedAmount, CorporateActionAmounts10.mmUnfrankedAmount, CorporateActionAmounts10.mmSundryOrOtherAmount,
						CorporateActionAmounts10.mmCashIncentive, CorporateActionAmounts10.mmTaxFreeAmount, CorporateActionAmounts10.mmTaxDeferredAmount, CorporateActionAmounts10.mmValueAddedTaxAmount,
						CorporateActionAmounts10.mmStampDutyAmount, CorporateActionAmounts10.mmTaxReclaimAmount, CorporateActionAmounts10.mmTaxCreditAmount, CorporateActionAmounts10.mmWithholdingOfForeignTaxAmount,
						CorporateActionAmounts10.mmWithholdingOfLocalTaxAmount, CorporateActionAmounts10.mmAdditionalTaxAmount, CorporateActionAmounts10.mmWithholdingTaxAmount, CorporateActionAmounts10.mmFiscalStampAmount,
						CorporateActionAmounts10.mmExecutingBrokerAmount, CorporateActionAmounts10.mmPayingAgentCommissionAmount, CorporateActionAmounts10.mmLocalBrokerCommissionAmount, CorporateActionAmounts10.mmPostageFeeAmount,
						CorporateActionAmounts10.mmRegulatoryFeesAmount, CorporateActionAmounts10.mmShippingFeesAmount, CorporateActionAmounts10.mmChargesAmount, CorporateActionAmounts10.mmEntitledAmount,
						CorporateActionAmounts10.mmOriginalAmount, CorporateActionAmounts10.mmPrincipalOrCorpus, CorporateActionAmounts10.mmRedemptionPremiumAmount, CorporateActionAmounts10.mmIncomePortion,
						CorporateActionAmounts10.mmStockExchangeTax, CorporateActionAmounts10.mmEUTaxRetentionAmount, CorporateActionAmounts10.mmAccruedInterestAmount);
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
				name = "CorporateActionAmounts10";
				definition = "Specifies amounts in the framework of a corporate action event.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts15.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "GrssCshAmt")
	public ActiveCurrencyAndAmount getGrossCashAmount() {
		return grossCashAmount;
	}

	public void setGrossCashAmount(ActiveCurrencyAndAmount grossCashAmount) {
		this.grossCashAmount = grossCashAmount;
	}

	@XmlElement(name = "NetCshAmt")
	public ActiveCurrencyAndAmount getNetCashAmount() {
		return netCashAmount;
	}

	public void setNetCashAmount(ActiveCurrencyAndAmount netCashAmount) {
		this.netCashAmount = netCashAmount;
	}

	@XmlElement(name = "SlctnFees")
	public ActiveCurrencyAndAmount getSolicitationFees() {
		return solicitationFees;
	}

	public void setSolicitationFees(ActiveCurrencyAndAmount solicitationFees) {
		this.solicitationFees = solicitationFees;
	}

	@XmlElement(name = "CshInLieuOfShr")
	public ActiveCurrencyAndAmount getCashInLieuOfShare() {
		return cashInLieuOfShare;
	}

	public void setCashInLieuOfShare(ActiveCurrencyAndAmount cashInLieuOfShare) {
		this.cashInLieuOfShare = cashInLieuOfShare;
	}

	@XmlElement(name = "CptlGn")
	public ActiveCurrencyAndAmount getCapitalGain() {
		return capitalGain;
	}

	public void setCapitalGain(ActiveCurrencyAndAmount capitalGain) {
		this.capitalGain = capitalGain;
	}

	@XmlElement(name = "IntrstAmt")
	public ActiveCurrencyAndAmount getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(ActiveCurrencyAndAmount interestAmount) {
		this.interestAmount = interestAmount;
	}

	@XmlElement(name = "IndmntyAmt")
	public ActiveCurrencyAndAmount getIndemnityAmount() {
		return indemnityAmount;
	}

	public void setIndemnityAmount(ActiveCurrencyAndAmount indemnityAmount) {
		this.indemnityAmount = indemnityAmount;
	}

	@XmlElement(name = "ManfctrdDvddPmtAmt")
	public ActiveCurrencyAndAmount getManufacturedDividendPaymentAmount() {
		return manufacturedDividendPaymentAmount;
	}

	public void setManufacturedDividendPaymentAmount(ActiveCurrencyAndAmount manufacturedDividendPaymentAmount) {
		this.manufacturedDividendPaymentAmount = manufacturedDividendPaymentAmount;
	}

	@XmlElement(name = "RinvstmtAmt")
	public ActiveCurrencyAndAmount getReinvestmentAmount() {
		return reinvestmentAmount;
	}

	public void setReinvestmentAmount(ActiveCurrencyAndAmount reinvestmentAmount) {
		this.reinvestmentAmount = reinvestmentAmount;
	}

	@XmlElement(name = "FullyFrnkdAmt")
	public ActiveCurrencyAndAmount getFullyFrankedAmount() {
		return fullyFrankedAmount;
	}

	public void setFullyFrankedAmount(ActiveCurrencyAndAmount fullyFrankedAmount) {
		this.fullyFrankedAmount = fullyFrankedAmount;
	}

	@XmlElement(name = "UfrnkdAmt")
	public ActiveCurrencyAndAmount getUnfrankedAmount() {
		return unfrankedAmount;
	}

	public void setUnfrankedAmount(ActiveCurrencyAndAmount unfrankedAmount) {
		this.unfrankedAmount = unfrankedAmount;
	}

	@XmlElement(name = "SndryOrOthrAmt")
	public ActiveCurrencyAndAmount getSundryOrOtherAmount() {
		return sundryOrOtherAmount;
	}

	public void setSundryOrOtherAmount(ActiveCurrencyAndAmount sundryOrOtherAmount) {
		this.sundryOrOtherAmount = sundryOrOtherAmount;
	}

	@XmlElement(name = "CshIncntiv")
	public ActiveCurrencyAndAmount getCashIncentive() {
		return cashIncentive;
	}

	public void setCashIncentive(ActiveCurrencyAndAmount cashIncentive) {
		this.cashIncentive = cashIncentive;
	}

	@XmlElement(name = "TaxFreeAmt")
	public ActiveCurrencyAndAmount getTaxFreeAmount() {
		return taxFreeAmount;
	}

	public void setTaxFreeAmount(ActiveCurrencyAndAmount taxFreeAmount) {
		this.taxFreeAmount = taxFreeAmount;
	}

	@XmlElement(name = "TaxDfrrdAmt")
	public ActiveCurrencyAndAmount getTaxDeferredAmount() {
		return taxDeferredAmount;
	}

	public void setTaxDeferredAmount(ActiveCurrencyAndAmount taxDeferredAmount) {
		this.taxDeferredAmount = taxDeferredAmount;
	}

	@XmlElement(name = "ValAddedTaxAmt")
	public ActiveCurrencyAndAmount getValueAddedTaxAmount() {
		return valueAddedTaxAmount;
	}

	public void setValueAddedTaxAmount(ActiveCurrencyAndAmount valueAddedTaxAmount) {
		this.valueAddedTaxAmount = valueAddedTaxAmount;
	}

	@XmlElement(name = "StmpDtyAmt")
	public ActiveCurrencyAndAmount getStampDutyAmount() {
		return stampDutyAmount;
	}

	public void setStampDutyAmount(ActiveCurrencyAndAmount stampDutyAmount) {
		this.stampDutyAmount = stampDutyAmount;
	}

	@XmlElement(name = "TaxRclmAmt")
	public ActiveCurrencyAndAmount getTaxReclaimAmount() {
		return taxReclaimAmount;
	}

	public void setTaxReclaimAmount(ActiveCurrencyAndAmount taxReclaimAmount) {
		this.taxReclaimAmount = taxReclaimAmount;
	}

	@XmlElement(name = "TaxCdtAmt")
	public ActiveCurrencyAndAmount getTaxCreditAmount() {
		return taxCreditAmount;
	}

	public void setTaxCreditAmount(ActiveCurrencyAndAmount taxCreditAmount) {
		this.taxCreditAmount = taxCreditAmount;
	}

	@XmlElement(name = "WhldgOfFrgnTaxAmt")
	public ActiveCurrencyAndAmount getWithholdingOfForeignTaxAmount() {
		return withholdingOfForeignTaxAmount;
	}

	public void setWithholdingOfForeignTaxAmount(ActiveCurrencyAndAmount withholdingOfForeignTaxAmount) {
		this.withholdingOfForeignTaxAmount = withholdingOfForeignTaxAmount;
	}

	@XmlElement(name = "WhldgOfLclTaxAmt")
	public ActiveCurrencyAndAmount getWithholdingOfLocalTaxAmount() {
		return withholdingOfLocalTaxAmount;
	}

	public void setWithholdingOfLocalTaxAmount(ActiveCurrencyAndAmount withholdingOfLocalTaxAmount) {
		this.withholdingOfLocalTaxAmount = withholdingOfLocalTaxAmount;
	}

	@XmlElement(name = "AddtlTaxAmt")
	public ActiveCurrencyAndAmount getAdditionalTaxAmount() {
		return additionalTaxAmount;
	}

	public void setAdditionalTaxAmount(ActiveCurrencyAndAmount additionalTaxAmount) {
		this.additionalTaxAmount = additionalTaxAmount;
	}

	@XmlElement(name = "WhldgTaxAmt")
	public ActiveCurrencyAndAmount getWithholdingTaxAmount() {
		return withholdingTaxAmount;
	}

	public void setWithholdingTaxAmount(ActiveCurrencyAndAmount withholdingTaxAmount) {
		this.withholdingTaxAmount = withholdingTaxAmount;
	}

	@XmlElement(name = "FsclStmpAmt")
	public ActiveCurrencyAndAmount getFiscalStampAmount() {
		return fiscalStampAmount;
	}

	public void setFiscalStampAmount(ActiveCurrencyAndAmount fiscalStampAmount) {
		this.fiscalStampAmount = fiscalStampAmount;
	}

	@XmlElement(name = "ExctgBrkrAmt")
	public ActiveCurrencyAndAmount getExecutingBrokerAmount() {
		return executingBrokerAmount;
	}

	public void setExecutingBrokerAmount(ActiveCurrencyAndAmount executingBrokerAmount) {
		this.executingBrokerAmount = executingBrokerAmount;
	}

	@XmlElement(name = "PngAgtComssnAmt")
	public ActiveCurrencyAndAmount getPayingAgentCommissionAmount() {
		return payingAgentCommissionAmount;
	}

	public void setPayingAgentCommissionAmount(ActiveCurrencyAndAmount payingAgentCommissionAmount) {
		this.payingAgentCommissionAmount = payingAgentCommissionAmount;
	}

	@XmlElement(name = "LclBrkrComssnAmt")
	public ActiveCurrencyAndAmount getLocalBrokerCommissionAmount() {
		return localBrokerCommissionAmount;
	}

	public void setLocalBrokerCommissionAmount(ActiveCurrencyAndAmount localBrokerCommissionAmount) {
		this.localBrokerCommissionAmount = localBrokerCommissionAmount;
	}

	@XmlElement(name = "PstgFeeAmt")
	public ActiveCurrencyAndAmount getPostageFeeAmount() {
		return postageFeeAmount;
	}

	public void setPostageFeeAmount(ActiveCurrencyAndAmount postageFeeAmount) {
		this.postageFeeAmount = postageFeeAmount;
	}

	@XmlElement(name = "RgltryFeesAmt")
	public ActiveCurrencyAndAmount getRegulatoryFeesAmount() {
		return regulatoryFeesAmount;
	}

	public void setRegulatoryFeesAmount(ActiveCurrencyAndAmount regulatoryFeesAmount) {
		this.regulatoryFeesAmount = regulatoryFeesAmount;
	}

	@XmlElement(name = "ShppgFeesAmt")
	public ActiveCurrencyAndAmount getShippingFeesAmount() {
		return shippingFeesAmount;
	}

	public void setShippingFeesAmount(ActiveCurrencyAndAmount shippingFeesAmount) {
		this.shippingFeesAmount = shippingFeesAmount;
	}

	@XmlElement(name = "ChrgsAmt")
	public ActiveCurrencyAndAmount getChargesAmount() {
		return chargesAmount;
	}

	public void setChargesAmount(ActiveCurrencyAndAmount chargesAmount) {
		this.chargesAmount = chargesAmount;
	}

	@XmlElement(name = "EntitldAmt")
	public ActiveCurrencyAndAmount getEntitledAmount() {
		return entitledAmount;
	}

	public void setEntitledAmount(ActiveCurrencyAndAmount entitledAmount) {
		this.entitledAmount = entitledAmount;
	}

	@XmlElement(name = "OrgnlAmt")
	public ActiveCurrencyAndAmount getOriginalAmount() {
		return originalAmount;
	}

	public void setOriginalAmount(ActiveCurrencyAndAmount originalAmount) {
		this.originalAmount = originalAmount;
	}

	@XmlElement(name = "PrncplOrCrps")
	public ActiveCurrencyAndAmount getPrincipalOrCorpus() {
		return principalOrCorpus;
	}

	public void setPrincipalOrCorpus(ActiveCurrencyAndAmount principalOrCorpus) {
		this.principalOrCorpus = principalOrCorpus;
	}

	@XmlElement(name = "RedPrmAmt")
	public ActiveCurrencyAndAmount getRedemptionPremiumAmount() {
		return redemptionPremiumAmount;
	}

	public void setRedemptionPremiumAmount(ActiveCurrencyAndAmount redemptionPremiumAmount) {
		this.redemptionPremiumAmount = redemptionPremiumAmount;
	}

	@XmlElement(name = "IncmPrtn")
	public ActiveCurrencyAndAmount getIncomePortion() {
		return incomePortion;
	}

	public void setIncomePortion(ActiveCurrencyAndAmount incomePortion) {
		this.incomePortion = incomePortion;
	}

	@XmlElement(name = "StockXchgTax")
	public ActiveCurrencyAndAmount getStockExchangeTax() {
		return stockExchangeTax;
	}

	public void setStockExchangeTax(ActiveCurrencyAndAmount stockExchangeTax) {
		this.stockExchangeTax = stockExchangeTax;
	}

	@XmlElement(name = "EUTaxRtntnAmt")
	public ActiveCurrencyAndAmount getEUTaxRetentionAmount() {
		return eUTaxRetentionAmount;
	}

	public void setEUTaxRetentionAmount(ActiveCurrencyAndAmount eUTaxRetentionAmount) {
		this.eUTaxRetentionAmount = eUTaxRetentionAmount;
	}

	@XmlElement(name = "AcrdIntrstAmt")
	public ActiveCurrencyAndAmount getAccruedInterestAmount() {
		return accruedInterestAmount;
	}

	public void setAccruedInterestAmount(ActiveCurrencyAndAmount accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
	}
}