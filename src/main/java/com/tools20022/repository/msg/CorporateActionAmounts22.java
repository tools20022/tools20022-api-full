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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmGrossCashAmount
 * CorporateActionAmounts22.mmGrossCashAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmNetCashAmount
 * CorporateActionAmounts22.mmNetCashAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmSolicitationFees
 * CorporateActionAmounts22.mmSolicitationFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmCashInLieuOfShare
 * CorporateActionAmounts22.mmCashInLieuOfShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmCapitalGain
 * CorporateActionAmounts22.mmCapitalGain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmInterestAmount
 * CorporateActionAmounts22.mmInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmMarketClaimAmount
 * CorporateActionAmounts22.mmMarketClaimAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmIndemnityAmount
 * CorporateActionAmounts22.mmIndemnityAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmManufacturedDividendPaymentAmount
 * CorporateActionAmounts22.mmManufacturedDividendPaymentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmReinvestmentAmount
 * CorporateActionAmounts22.mmReinvestmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmFullyFrankedAmount
 * CorporateActionAmounts22.mmFullyFrankedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmUnfrankedAmount
 * CorporateActionAmounts22.mmUnfrankedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmSundryOrOtherAmount
 * CorporateActionAmounts22.mmSundryOrOtherAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmTaxFreeAmount
 * CorporateActionAmounts22.mmTaxFreeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmTaxDeferredAmount
 * CorporateActionAmounts22.mmTaxDeferredAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmValueAddedTaxAmount
 * CorporateActionAmounts22.mmValueAddedTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmStampDutyAmount
 * CorporateActionAmounts22.mmStampDutyAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmTaxReclaimAmount
 * CorporateActionAmounts22.mmTaxReclaimAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmTaxCreditAmount
 * CorporateActionAmounts22.mmTaxCreditAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmWithholdingOfForeignTaxAmount
 * CorporateActionAmounts22.mmWithholdingOfForeignTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmWithholdingOfLocalTaxAmount
 * CorporateActionAmounts22.mmWithholdingOfLocalTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmAdditionalTaxAmount
 * CorporateActionAmounts22.mmAdditionalTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmWithholdingTaxAmount
 * CorporateActionAmounts22.mmWithholdingTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmFiscalStampAmount
 * CorporateActionAmounts22.mmFiscalStampAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmExecutingBrokerAmount
 * CorporateActionAmounts22.mmExecutingBrokerAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmPayingAgentCommissionAmount
 * CorporateActionAmounts22.mmPayingAgentCommissionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmLocalBrokerCommissionAmount
 * CorporateActionAmounts22.mmLocalBrokerCommissionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmRegulatoryFeesAmount
 * CorporateActionAmounts22.mmRegulatoryFeesAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmShippingFeesAmount
 * CorporateActionAmounts22.mmShippingFeesAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmChargesAmount
 * CorporateActionAmounts22.mmChargesAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmEntitledAmount
 * CorporateActionAmounts22.mmEntitledAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmOriginalAmount
 * CorporateActionAmounts22.mmOriginalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmAccruedInterestAmount
 * CorporateActionAmounts22.mmAccruedInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmIncomePortion
 * CorporateActionAmounts22.mmIncomePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmEqualisationAmount
 * CorporateActionAmounts22.mmEqualisationAmount}</li>
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
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionAmounts22"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies amounts in the framework of a corporate action event."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionAmounts28
 * CorporateActionAmounts28}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16
 * CorporateActionAmounts16}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionAmounts22", propOrder = {"grossCashAmount", "netCashAmount", "solicitationFees", "cashInLieuOfShare", "capitalGain", "interestAmount", "marketClaimAmount", "indemnityAmount",
		"manufacturedDividendPaymentAmount", "reinvestmentAmount", "fullyFrankedAmount", "unfrankedAmount", "sundryOrOtherAmount", "taxFreeAmount", "taxDeferredAmount", "valueAddedTaxAmount", "stampDutyAmount", "taxReclaimAmount",
		"taxCreditAmount", "withholdingOfForeignTaxAmount", "withholdingOfLocalTaxAmount", "additionalTaxAmount", "withholdingTaxAmount", "fiscalStampAmount", "executingBrokerAmount", "payingAgentCommissionAmount",
		"localBrokerCommissionAmount", "regulatoryFeesAmount", "shippingFeesAmount", "chargesAmount", "entitledAmount", "originalAmount", "accruedInterestAmount", "incomePortion", "equalisationAmount"})
public class CorporateActionAmounts22 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmGrossCashAmount
	 * CorporateActionAmounts28.mmGrossCashAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGrossCashAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionCashEntitlement.mmGrossCashAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "GrssCshAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossCashAmount";
			definition = "Amount of money before any deductions and allowances have been made.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmGrossCashAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmNetCashAmount
	 * CorporateActionAmounts28.mmNetCashAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetCashAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionCashEntitlement.mmNetCashAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "NetCshAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetCashAmount";
			definition = "Amount of money after deductions and allowances have been made, if any, that is, the total amount +/- charges/fees.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmNetCashAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount solicitationFees;
	/**
	 * Cash premium made available if the securities holder consents or
	 * participates to an event, for example consent fees or solicitation fees.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * "Cash premium made available if the securities holder consents or participates to an event, for example consent fees or solicitation fees."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmSolicitationFees
	 * CorporateActionAmounts28.mmSolicitationFees}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSolicitationFees = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionFeesAndCharges.mmSolicitationFee;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "SlctnFees";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationFees";
			definition = "Cash premium made available if the securities holder consents or participates to an event, for example consent fees or solicitation fees.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmSolicitationFees);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmCashInLieuOfShare
	 * CorporateActionAmounts28.mmCashInLieuOfShare}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashInLieuOfShare = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionCashEntitlement.mmCashInLieuOfShare;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "CshInLieuOfShr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieuOfShare";
			definition = "Cash disbursement in lieu of a fractional quantity of, for example, equity.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmCashInLieuOfShare);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmCapitalGain
	 * CorporateActionAmounts28.mmCapitalGain}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCapitalGain = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionCashEntitlement.mmCapitalGain;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "CptlGn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGain";
			definition = "Amount of money distributed as the result of a capital gain.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmCapitalGain);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmInterestAmount
	 * CorporateActionAmounts28.mmInterestAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "IntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestAmount";
			definition = "Amount of money representing a coupon payment.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmInterestAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount marketClaimAmount;
	/**
	 * Amount of money resulting from a market claim.
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
	 * {@linkplain com.tools20022.repository.entity.MarketClaim#mmMarketClaimAmount
	 * MarketClaim.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmMarketClaimAmount
	 * CorporateActionAmounts28.mmMarketClaimAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMarketClaimAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MarketClaim.mmMarketClaimAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "MktClmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClaimAmount";
			definition = "Amount of money resulting from a market claim.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmMarketClaimAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmIndemnityAmount
	 * CorporateActionAmounts28.mmIndemnityAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIndemnityAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmIndemnityAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "IndmntyAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndemnityAmount";
			definition = "(Unique to France) Amount due to a buyer of securities dealt prior to ex date which may be subject to different rate of taxation.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmIndemnityAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts28.mmManufacturedDividendPaymentAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmManufacturedDividendPaymentAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmManufacturedDividendAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "ManfctrdDvddPmtAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManufacturedDividendPaymentAmount";
			definition = "Amount of money that the borrower pays to the lender as a compensation. It does not entitle the lender to reclaim any tax credit and is sometimes treated differently by the local tax authorities of the lender. Also covers compensation/indemnity of missed dividend concerning early/late settlements if applicable to a market.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmManufacturedDividendPaymentAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmReinvestmentAmount
	 * CorporateActionAmounts28.mmReinvestmentAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReinvestmentAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmReinvestmentAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "RinvstmtAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentAmount";
			definition = "Amount of money reinvested in additional securities.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmReinvestmentAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmFullyFrankedAmount
	 * CorporateActionAmounts28.mmFullyFrankedAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFullyFrankedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> RateAndAmount.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "FullyFrnkdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyFrankedAmount";
			definition = "Amount resulting from a fully franked dividend paid by a company; amount includes tax credit for companies that have made sufficient tax payments during the fiscal period.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmFullyFrankedAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmUnfrankedAmount
	 * CorporateActionAmounts28.mmUnfrankedAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnfrankedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmUnfrankedAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "UfrnkdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnfrankedAmount";
			definition = "Amount resulting from an unfranked dividend paid by a company; the amount does not include tax credit and is subject to withholding tax.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmUnfrankedAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmSundryOrOtherAmount
	 * CorporateActionAmounts28.mmSundryOrOtherAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSundryOrOtherAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmSundryOrOtherAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "SndryOrOthrAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SundryOrOtherAmount";
			definition = "Amount of money related to taxable income that cannot be categorised.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmSundryOrOtherAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmTaxFreeAmount
	 * CorporateActionAmounts28.mmTaxFreeAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxFreeAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "TaxFreeAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxFreeAmount";
			definition = "Amount of money that has not been subject to taxation.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmTaxFreeAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmTaxDeferredAmount
	 * CorporateActionAmounts28.mmTaxDeferredAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxDeferredAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "TaxDfrrdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDeferredAmount";
			definition = "Amount of income eligible for deferred taxation.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmTaxDeferredAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmValueAddedTaxAmount
	 * CorporateActionAmounts28.mmValueAddedTaxAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValueAddedTaxAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "ValAddedTaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAddedTaxAmount";
			definition = "Amount of value added tax.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmValueAddedTaxAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmStampDutyAmount
	 * CorporateActionAmounts28.mmStampDutyAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStampDutyAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "StmpDtyAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDutyAmount";
			definition = "Amount of stamp duty.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmStampDutyAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmTaxReclaimAmount
	 * CorporateActionAmounts28.mmTaxReclaimAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxReclaimAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "TaxRclmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReclaimAmount";
			definition = "Amount that was paid in excess of actual tax obligation and was reclaimed.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmTaxReclaimAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmTaxCreditAmount
	 * CorporateActionAmounts28.mmTaxCreditAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxCreditAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmCreditAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "TaxCdtAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditAmount";
			definition = "Amount of taxes that have been previously paid in relation to the taxable event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmTaxCreditAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmWithholdingOfForeignTaxAmount
	 * CorporateActionAmounts28.mmWithholdingOfForeignTaxAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWithholdingOfForeignTaxAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "WhldgOfFrgnTaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingOfForeignTaxAmount";
			definition = "Amount of money withheld by the jurisdiction in which the income was originally paid, for which relief at source and/or reclaim may be possible.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmWithholdingOfForeignTaxAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmWithholdingOfLocalTaxAmount
	 * CorporateActionAmounts28.mmWithholdingOfLocalTaxAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWithholdingOfLocalTaxAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "WhldgOfLclTaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingOfLocalTaxAmount";
			definition = "Amount of money withheld by the jurisdiction in which the account owner is located, for which relief at source and/or reclaim may be possible.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmWithholdingOfLocalTaxAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmAdditionalTaxAmount
	 * CorporateActionAmounts28.mmAdditionalTaxAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalTaxAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "AddtlTaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTaxAmount";
			definition = "Amount of additional taxes that cannot be categorised.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmAdditionalTaxAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmWithholdingTaxAmount
	 * CorporateActionAmounts28.mmWithholdingTaxAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWithholdingTaxAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "WhldgTaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxAmount";
			definition = "Amount of a cash distribution that will be withheld by a tax authority.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmWithholdingTaxAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmFiscalStampAmount
	 * CorporateActionAmounts28.mmFiscalStampAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFiscalStampAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "FsclStmpAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiscalStampAmount";
			definition = "Amount of fiscal tax to apply.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmFiscalStampAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmExecutingBrokerAmount
	 * CorporateActionAmounts28.mmExecutingBrokerAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExecutingBrokerAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "ExctgBrkrAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutingBrokerAmount";
			definition = "Amount of money paid to an executing broker as a commission.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmExecutingBrokerAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts28.mmPayingAgentCommissionAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPayingAgentCommissionAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "PngAgtComssnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgentCommissionAmount";
			definition = "Amount of paying/sub-paying agent commission.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmPayingAgentCommissionAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts28.mmLocalBrokerCommissionAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLocalBrokerCommissionAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "LclBrkrComssnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalBrokerCommissionAmount";
			definition = "Local broker's commission.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmLocalBrokerCommissionAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmRegulatoryFeesAmount
	 * CorporateActionAmounts28.mmRegulatoryFeesAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegulatoryFeesAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesRelatedFees.mmRegulatoryFeesAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "RgltryFeesAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryFeesAmount";
			definition = "Amount of money charged by a regulatory authority, for example, securities and exchange fees.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmRegulatoryFeesAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount shippingFeesAmount;
	/**
	 * All costs related to the physical delivery of documents such as stamps,
	 * postage, carrier fees, insurances or messenger services.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * "All costs related to the physical delivery of documents such as stamps, postage, carrier fees, insurances or messenger services."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmShippingFeesAmount
	 * CorporateActionAmounts28.mmShippingFeesAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmShippingFeesAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesRelatedFees.mmShippingFeesAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "ShppgFeesAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingFeesAmount";
			definition = "All costs related to the physical delivery of documents such as stamps, postage, carrier fees, insurances or messenger services.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmShippingFeesAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmChargesAmount
	 * CorporateActionAmounts28.mmChargesAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChargesAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "ChrgsAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAmount";
			definition = "Amount of money paid for the provision of financial services that cannot be categorised by another qualifier.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmChargesAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmEntitledAmount
	 * CorporateActionAmounts28.mmEntitledAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntitledAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionCashEntitlement.mmEntitledCashAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "EntitldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitledAmount";
			definition = "Cash amount based on terms of corporate action event and balance of underlying securities, entitled to/from account owner (which may be positive or negative).";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmEntitledAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmOriginalAmount
	 * CorporateActionAmounts28.mmOriginalAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmOriginalAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "OrgnlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalAmount";
			definition = "Posting/settlement amount in its original currency when conversion from/into another currency has occurred.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmOriginalAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmAccruedInterestAmount
	 * CorporateActionAmounts28.mmAccruedInterestAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccruedInterestAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Amount of interest that has been accrued in between coupon payment periods";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmAccruedInterestAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmIncomePortion
	 * CorporateActionAmounts28.mmIncomePortion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIncomePortion = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmIncomePortion;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "IncmPrtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePortion";
			definition = "Amount relating to the underlying security for which income is distributed.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmIncomePortion);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount equalisationAmount;
	/**
	 * Portion of the fund distribution amount which represents the average
	 * accrued income included in the purchase price for units bought during the
	 * account period.
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
	 * {@linkplain com.tools20022.repository.entity.Equalisation#mmAmount
	 * Equalisation.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22
	 * CorporateActionAmounts22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EqulstnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EqualisationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portion of the fund distribution amount which represents the average accrued income included in the purchase price for units bought during the account period."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmEqualisationAmount
	 * CorporateActionAmounts28.mmEqualisationAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEqualisationAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Equalisation.mmAmount;
			componentContext_lazy = () -> CorporateActionAmounts22.mmObject();
			isDerived = false;
			xmlTag = "EqulstnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EqualisationAmount";
			definition = "Portion of the fund distribution amount which represents the average accrued income included in the purchase price for units bought during the account period.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmEqualisationAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionAmounts22.mmGrossCashAmount, CorporateActionAmounts22.mmNetCashAmount, CorporateActionAmounts22.mmSolicitationFees, CorporateActionAmounts22.mmCashInLieuOfShare,
						CorporateActionAmounts22.mmCapitalGain, CorporateActionAmounts22.mmInterestAmount, CorporateActionAmounts22.mmMarketClaimAmount, CorporateActionAmounts22.mmIndemnityAmount,
						CorporateActionAmounts22.mmManufacturedDividendPaymentAmount, CorporateActionAmounts22.mmReinvestmentAmount, CorporateActionAmounts22.mmFullyFrankedAmount, CorporateActionAmounts22.mmUnfrankedAmount,
						CorporateActionAmounts22.mmSundryOrOtherAmount, CorporateActionAmounts22.mmTaxFreeAmount, CorporateActionAmounts22.mmTaxDeferredAmount, CorporateActionAmounts22.mmValueAddedTaxAmount,
						CorporateActionAmounts22.mmStampDutyAmount, CorporateActionAmounts22.mmTaxReclaimAmount, CorporateActionAmounts22.mmTaxCreditAmount, CorporateActionAmounts22.mmWithholdingOfForeignTaxAmount,
						CorporateActionAmounts22.mmWithholdingOfLocalTaxAmount, CorporateActionAmounts22.mmAdditionalTaxAmount, CorporateActionAmounts22.mmWithholdingTaxAmount, CorporateActionAmounts22.mmFiscalStampAmount,
						CorporateActionAmounts22.mmExecutingBrokerAmount, CorporateActionAmounts22.mmPayingAgentCommissionAmount, CorporateActionAmounts22.mmLocalBrokerCommissionAmount, CorporateActionAmounts22.mmRegulatoryFeesAmount,
						CorporateActionAmounts22.mmShippingFeesAmount, CorporateActionAmounts22.mmChargesAmount, CorporateActionAmounts22.mmEntitledAmount, CorporateActionAmounts22.mmOriginalAmount,
						CorporateActionAmounts22.mmAccruedInterestAmount, CorporateActionAmounts22.mmIncomePortion, CorporateActionAmounts22.mmEqualisationAmount);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionAmounts22";
				definition = "Specifies amounts in the framework of a corporate action event.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionAmounts28.mmObject());
				previousVersion_lazy = () -> CorporateActionAmounts16.mmObject();
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

	@XmlElement(name = "MktClmAmt")
	public ActiveCurrencyAndAmount getMarketClaimAmount() {
		return marketClaimAmount;
	}

	public void setMarketClaimAmount(ActiveCurrencyAndAmount marketClaimAmount) {
		this.marketClaimAmount = marketClaimAmount;
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

	@XmlElement(name = "AcrdIntrstAmt")
	public ActiveCurrencyAndAmount getAccruedInterestAmount() {
		return accruedInterestAmount;
	}

	public void setAccruedInterestAmount(ActiveCurrencyAndAmount accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
	}

	@XmlElement(name = "IncmPrtn")
	public ActiveCurrencyAndAmount getIncomePortion() {
		return incomePortion;
	}

	public void setIncomePortion(ActiveCurrencyAndAmount incomePortion) {
		this.incomePortion = incomePortion;
	}

	@XmlElement(name = "EqulstnAmt")
	public ActiveCurrencyAndAmount getEqualisationAmount() {
		return equalisationAmount;
	}

	public void setEqualisationAmount(ActiveCurrencyAndAmount equalisationAmount) {
		this.equalisationAmount = equalisationAmount;
	}
}