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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the rates related to securities movement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails2#mmAdditionalTax
 * RateDetails2.mmAdditionalTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails2#mmChargesFees
 * RateDetails2.mmChargesFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails2#mmFinalDividendRate
 * RateDetails2.mmFinalDividendRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails2#mmFiscalStamp
 * RateDetails2.mmFiscalStamp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails2#mmFullyFrankedRate
 * RateDetails2.mmFullyFrankedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails2#mmGrossDividendRate
 * RateDetails2.mmGrossDividendRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails2#mmCashIncentiveRate
 * RateDetails2.mmCashIncentiveRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails2#mmInterestRateUsedForPayment
 * RateDetails2.mmInterestRateUsedForPayment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails2#mmNetDividendRate
 * RateDetails2.mmNetDividendRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails2#mmNonResidentRate
 * RateDetails2.mmNonResidentRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails2#mmProvisionalDividendRate
 * RateDetails2.mmProvisionalDividendRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails2#mmApplicableRate
 * RateDetails2.mmApplicableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails2#mmSolicitationFeeRate
 * RateDetails2.mmSolicitationFeeRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails2#mmTaxCreditRate
 * RateDetails2.mmTaxCreditRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails2#mmTaxRelatedRate
 * RateDetails2.mmTaxRelatedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails2#mmWithholdingTaxRate
 * RateDetails2.mmWithholdingTaxRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails2#mmTaxOnIncome
 * RateDetails2.mmTaxOnIncome}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails2#mmTaxOnProfits
 * RateDetails2.mmTaxOnProfits}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails2#mmTaxReclaimRate
 * RateDetails2.mmTaxReclaimRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails2#mmWithholdingOfForeignTax
 * RateDetails2.mmWithholdingOfForeignTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails2#mmWithholdingOfLocalTax
 * RateDetails2.mmWithholdingOfLocalTax}</li>
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
 * "RateDetails2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about the rates related to securities movement."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails7 RateDetails7}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RateDetails2", propOrder = {"additionalTax", "chargesFees", "finalDividendRate", "fiscalStamp", "fullyFrankedRate", "grossDividendRate", "cashIncentiveRate", "interestRateUsedForPayment", "netDividendRate",
		"nonResidentRate", "provisionalDividendRate", "applicableRate", "solicitationFeeRate", "taxCreditRate", "taxRelatedRate", "withholdingTaxRate", "taxOnIncome", "taxOnProfits", "taxReclaimRate", "withholdingOfForeignTax",
		"withholdingOfLocalTax"})
public class RateDetails2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RateAndAmountFormat5Choice additionalTax;
	/**
	 * Rate used for additional tax that cannot be categorised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat5Choice
	 * RateAndAmountFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmTaxVoucher
	 * CorporateActionDistribution.mmTaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails2 RateDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate used for additional tax that cannot be categorised."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalTax = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmTaxVoucher;
			componentContext_lazy = () -> RateDetails2.mmObject();
			isDerived = false;
			xmlTag = "AddtlTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTax";
			definition = "Rate used for additional tax that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat5Choice.mmObject();
		}
	};
	protected RateAndAmountFormat5Choice chargesFees;
	/**
	 * Rate used to calculate the amount of the charges/fees that cannot be
	 * categorised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat5Choice
	 * RateAndAmountFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionCharge
	 * CorporateActionEvent.mmCorporateActionCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails2 RateDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate used to calculate the amount of the charges/fees that cannot be categorised."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmChargesFees = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionCharge;
			componentContext_lazy = () -> RateDetails2.mmObject();
			isDerived = false;
			xmlTag = "ChrgsFees";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesFees";
			definition = "Rate used to calculate the amount of the charges/fees that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat5Choice.mmObject();
		}
	};
	protected ActiveCurrencyAnd13DecimalAmount finalDividendRate;
	/**
	 * Dividend is final.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount
	 * ActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmFinalDividend
	 * Dividend.mmFinalDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails2 RateDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FnlDvddRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalDividendRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend is final."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinalDividendRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmFinalDividend;
			componentContext_lazy = () -> RateDetails2.mmObject();
			isDerived = false;
			xmlTag = "FnlDvddRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalDividendRate";
			definition = "Dividend is final.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	protected PercentageRate fiscalStamp;
	/**
	 * Percentage of fiscal tax to apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails2 RateDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FsclStmp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FiscalStamp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of fiscal tax to apply."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFiscalStamp = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> RateDetails2.mmObject();
			isDerived = false;
			xmlTag = "FsclStmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiscalStamp";
			definition = "Percentage of fiscal tax to apply.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected RateAndAmountFormat5Choice fullyFrankedRate;
	/**
	 * Rate resulting from a fully franked dividend paid by a company; rate
	 * includes tax credit for companies that have made sufficient tax payments
	 * during fiscal period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat5Choice
	 * RateAndAmountFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmFullyFrankedRateAndAmount
	 * Dividend.mmFullyFrankedRateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails2 RateDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FullyFrnkdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyFrankedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate resulting from a fully franked dividend paid by a company; rate includes tax credit for companies that have made sufficient tax payments during fiscal period."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFullyFrankedRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Dividend.mmFullyFrankedRateAndAmount;
			componentContext_lazy = () -> RateDetails2.mmObject();
			isDerived = false;
			xmlTag = "FullyFrnkdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyFrankedRate";
			definition = "Rate resulting from a fully franked dividend paid by a company; rate includes tax credit for companies that have made sufficient tax payments during fiscal period.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat5Choice.mmObject();
		}
	};
	protected List<GrossDividendRateFormat2Choice> grossDividendRate;
	/**
	 * Cash dividend amount per equity before deductions or allowances have been
	 * made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat2Choice
	 * GrossDividendRateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmGrossDividend
	 * Dividend.mmGrossDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails2 RateDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrssDvddRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash dividend amount per equity before deductions or allowances have been made."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGrossDividendRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Dividend.mmGrossDividend;
			componentContext_lazy = () -> RateDetails2.mmObject();
			isDerived = false;
			xmlTag = "GrssDvddRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate";
			definition = "Cash dividend amount per equity before deductions or allowances have been made.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GrossDividendRateFormat2Choice.mmObject();
		}
	};
	protected PercentageRate cashIncentiveRate;
	/**
	 * Rate of the cash premium made available if the securities holder consents
	 * or participates to an event, for example, consent fees.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmCashIncentiveRate
	 * CashProceedsDefinition.mmCashIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails2 RateDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshIncntivRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashIncentiveRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of the cash premium made available if the securities holder consents or participates to an event, for example, consent fees."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashIncentiveRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmCashIncentiveRate;
			componentContext_lazy = () -> RateDetails2.mmObject();
			isDerived = false;
			xmlTag = "CshIncntivRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashIncentiveRate";
			definition = "Rate of the cash premium made available if the securities holder consents or participates to an event, for example, consent fees.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected List<InterestRateUsedForPaymentFormat2Choice> interestRateUsedForPayment;
	/**
	 * Actual interest rate used for the payment of the interest for the
	 * specified interest period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat2Choice
	 * InterestRateUsedForPaymentFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails2 RateDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstRateUsdForPmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRateUsedForPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Actual interest rate used for the payment of the interest for the specified interest period."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInterestRateUsedForPayment = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> RateDetails2.mmObject();
			isDerived = false;
			xmlTag = "IntrstRateUsdForPmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRateUsedForPayment";
			definition = "Actual interest rate used for the payment of the interest for the specified interest period.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InterestRateUsedForPaymentFormat2Choice.mmObject();
		}
	};
	protected List<NetDividendRateFormat2Choice> netDividendRate;
	/**
	 * Cash dividend amount per equity after deductions or allowances have been
	 * made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat2Choice
	 * NetDividendRateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmNetDividend
	 * Dividend.mmNetDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails2 RateDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetDvddRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetDividendRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash dividend amount per equity after deductions or allowances have been made."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNetDividendRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Dividend.mmNetDividend;
			componentContext_lazy = () -> RateDetails2.mmObject();
			isDerived = false;
			xmlTag = "NetDvddRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate";
			definition = "Cash dividend amount per equity after deductions or allowances have been made.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NetDividendRateFormat2Choice.mmObject();
		}
	};
	protected RateAndAmountFormat5Choice nonResidentRate;
	/**
	 * Rate per share to which a non-resident is entitled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat5Choice
	 * RateAndAmountFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmRate
	 * Dividend.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails2 RateDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonResdtRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonResidentRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate per share to which a non-resident is entitled."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNonResidentRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Dividend.mmRate;
			componentContext_lazy = () -> RateDetails2.mmObject();
			isDerived = false;
			xmlTag = "NonResdtRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonResidentRate";
			definition = "Rate per share to which a non-resident is entitled.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat5Choice.mmObject();
		}
	};
	protected ActiveCurrencyAnd13DecimalAmount provisionalDividendRate;
	/**
	 * Dividend is provisional.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount
	 * ActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmProvisionalDividend
	 * Dividend.mmProvisionalDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails2 RateDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsnlDvddRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProvisionalDividendRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend is provisional."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProvisionalDividendRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmProvisionalDividend;
			componentContext_lazy = () -> RateDetails2.mmObject();
			isDerived = false;
			xmlTag = "PrvsnlDvddRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProvisionalDividendRate";
			definition = "Dividend is provisional.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	protected PercentageRate applicableRate;
	/**
	 * Rate applicable to the event announced, for example, redemption rate for
	 * a redemption event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmApplicableRate
	 * BiddingConditions.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails2 RateDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AplblRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicableRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate applicable to the event announced, for example, redemption rate for a redemption event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmApplicableRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmApplicableRate;
			componentContext_lazy = () -> RateDetails2.mmObject();
			isDerived = false;
			xmlTag = "AplblRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicableRate";
			definition = "Rate applicable to the event announced, for example, redemption rate for a redemption event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate solicitationFeeRate;
	/**
	 * Cash rate made available in an offer in order to encourage participation
	 * in the offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmSolicitationFee
	 * CorporateActionFeesAndCharges.mmSolicitationFee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails2 RateDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SlctnFeeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationFeeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash rate made available in an offer in order to encourage participation in the offer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSolicitationFeeRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionFeesAndCharges.mmSolicitationFee;
			componentContext_lazy = () -> RateDetails2.mmObject();
			isDerived = false;
			xmlTag = "SlctnFeeRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationFeeRate";
			definition = "Cash rate made available in an offer in order to encourage participation in the offer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected List<TaxCreditRateFormat2Choice> taxCreditRate;
	/**
	 * Amount of money per equity allocated as the result of a tax credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat2Choice
	 * TaxCreditRateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmCreditRate
	 * TaxVoucher.mmCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails2 RateDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxCdtRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money per equity allocated as the result of a tax credit."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxCreditRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmCreditRate;
			componentContext_lazy = () -> RateDetails2.mmObject();
			isDerived = false;
			xmlTag = "TaxCdtRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate";
			definition = "Amount of money per equity allocated as the result of a tax credit.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxCreditRateFormat2Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.RateTypeAndAmountAndStatus6> taxRelatedRate;
	/**
	 * Percentage of the gross dividend rate on which tax must be paid .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus6
	 * RateTypeAndAmountAndStatus6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails2 RateDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRltdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the gross dividend rate on which tax must be paid ."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxRelatedRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> RateDetails2.mmObject();
			isDerived = false;
			xmlTag = "TaxRltdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRate";
			definition = "Percentage of the gross dividend rate on which tax must be paid .";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RateTypeAndAmountAndStatus6.mmObject();
		}
	};
	protected PercentageRate withholdingTaxRate;
	/**
	 * Percentage of a cash distribution that will be withheld by a tax
	 * authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails2 RateDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhldgTaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of a cash distribution that will be withheld by a tax authority."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWithholdingTaxRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> RateDetails2.mmObject();
			isDerived = false;
			xmlTag = "WhldgTaxRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxRate";
			definition = "Percentage of a cash distribution that will be withheld by a tax authority.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate taxOnIncome;
	/**
	 * Taxation applied on an amount clearly identified as an income.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails2 RateDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxOnIncm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxOnIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Taxation applied on an amount clearly identified as an income."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxOnIncome = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> RateDetails2.mmObject();
			isDerived = false;
			xmlTag = "TaxOnIncm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxOnIncome";
			definition = "Taxation applied on an amount clearly identified as an income.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate taxOnProfits;
	/**
	 * Taxation applied on an amount clearly identified as capital profits,
	 * capital gains.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails2 RateDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxOnPrfts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxOnProfits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Taxation applied on an amount clearly identified as capital profits, capital gains."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxOnProfits = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> RateDetails2.mmObject();
			isDerived = false;
			xmlTag = "TaxOnPrfts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxOnProfits";
			definition = "Taxation applied on an amount clearly identified as capital profits, capital gains.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate taxReclaimRate;
	/**
	 * Percentage of cash that was paid in excess of actual tax obligation and
	 * was reclaimed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails2 RateDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRclmRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxReclaimRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of cash that was paid in excess of actual tax obligation and was reclaimed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxReclaimRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> RateDetails2.mmObject();
			isDerived = false;
			xmlTag = "TaxRclmRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReclaimRate";
			definition = "Percentage of cash that was paid in excess of actual tax obligation and was reclaimed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected RateAndAmountFormat5Choice withholdingOfForeignTax;
	/**
	 * Rate at which the income will be withheld by the jurisdiction in which
	 * the income was originally paid, for which relief at source and/or reclaim
	 * may be possible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat5Choice
	 * RateAndAmountFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails2 RateDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhldgOfFrgnTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingOfForeignTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate at which the income will be withheld by the jurisdiction in which the income was originally paid, for which relief at source and/or reclaim may be possible."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmWithholdingOfForeignTax = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> RateDetails2.mmObject();
			isDerived = false;
			xmlTag = "WhldgOfFrgnTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingOfForeignTax";
			definition = "Rate at which the income will be withheld by the jurisdiction in which the income was originally paid, for which relief at source and/or reclaim may be possible.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat5Choice.mmObject();
		}
	};
	protected RateAndAmountFormat5Choice withholdingOfLocalTax;
	/**
	 * Rate at which the income will be withheld by the jurisdiction in which
	 * the account owner is located, for which relief at source and/or reclaim
	 * may be possible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat5Choice
	 * RateAndAmountFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails2 RateDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhldgOfLclTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingOfLocalTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate at which the income will be withheld by the jurisdiction in which the account owner is located, for which relief at source and/or reclaim may be possible."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmWithholdingOfLocalTax = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> RateDetails2.mmObject();
			isDerived = false;
			xmlTag = "WhldgOfLclTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingOfLocalTax";
			definition = "Rate at which the income will be withheld by the jurisdiction in which the account owner is located, for which relief at source and/or reclaim may be possible.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat5Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RateDetails2.mmAdditionalTax, RateDetails2.mmChargesFees, RateDetails2.mmFinalDividendRate, RateDetails2.mmFiscalStamp, RateDetails2.mmFullyFrankedRate,
						RateDetails2.mmGrossDividendRate, RateDetails2.mmCashIncentiveRate, RateDetails2.mmInterestRateUsedForPayment, RateDetails2.mmNetDividendRate, RateDetails2.mmNonResidentRate, RateDetails2.mmProvisionalDividendRate,
						RateDetails2.mmApplicableRate, RateDetails2.mmSolicitationFeeRate, RateDetails2.mmTaxCreditRate, RateDetails2.mmTaxRelatedRate, RateDetails2.mmWithholdingTaxRate, RateDetails2.mmTaxOnIncome,
						RateDetails2.mmTaxOnProfits, RateDetails2.mmTaxReclaimRate, RateDetails2.mmWithholdingOfForeignTax, RateDetails2.mmWithholdingOfLocalTax);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RateDetails2";
				definition = "Provides information about the rates related to securities movement.";
				nextVersions_lazy = () -> Arrays.asList(RateDetails7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AddtlTax")
	public RateAndAmountFormat5Choice getAdditionalTax() {
		return additionalTax;
	}

	public void setAdditionalTax(RateAndAmountFormat5Choice additionalTax) {
		this.additionalTax = additionalTax;
	}

	@XmlElement(name = "ChrgsFees")
	public RateAndAmountFormat5Choice getChargesFees() {
		return chargesFees;
	}

	public void setChargesFees(RateAndAmountFormat5Choice chargesFees) {
		this.chargesFees = chargesFees;
	}

	@XmlElement(name = "FnlDvddRate")
	public ActiveCurrencyAnd13DecimalAmount getFinalDividendRate() {
		return finalDividendRate;
	}

	public void setFinalDividendRate(ActiveCurrencyAnd13DecimalAmount finalDividendRate) {
		this.finalDividendRate = finalDividendRate;
	}

	@XmlElement(name = "FsclStmp")
	public PercentageRate getFiscalStamp() {
		return fiscalStamp;
	}

	public void setFiscalStamp(PercentageRate fiscalStamp) {
		this.fiscalStamp = fiscalStamp;
	}

	@XmlElement(name = "FullyFrnkdRate")
	public RateAndAmountFormat5Choice getFullyFrankedRate() {
		return fullyFrankedRate;
	}

	public void setFullyFrankedRate(RateAndAmountFormat5Choice fullyFrankedRate) {
		this.fullyFrankedRate = fullyFrankedRate;
	}

	@XmlElement(name = "GrssDvddRate")
	public List<GrossDividendRateFormat2Choice> getGrossDividendRate() {
		return grossDividendRate;
	}

	public void setGrossDividendRate(List<GrossDividendRateFormat2Choice> grossDividendRate) {
		this.grossDividendRate = grossDividendRate;
	}

	@XmlElement(name = "CshIncntivRate")
	public PercentageRate getCashIncentiveRate() {
		return cashIncentiveRate;
	}

	public void setCashIncentiveRate(PercentageRate cashIncentiveRate) {
		this.cashIncentiveRate = cashIncentiveRate;
	}

	@XmlElement(name = "IntrstRateUsdForPmt")
	public List<InterestRateUsedForPaymentFormat2Choice> getInterestRateUsedForPayment() {
		return interestRateUsedForPayment;
	}

	public void setInterestRateUsedForPayment(List<InterestRateUsedForPaymentFormat2Choice> interestRateUsedForPayment) {
		this.interestRateUsedForPayment = interestRateUsedForPayment;
	}

	@XmlElement(name = "NetDvddRate")
	public List<NetDividendRateFormat2Choice> getNetDividendRate() {
		return netDividendRate;
	}

	public void setNetDividendRate(List<NetDividendRateFormat2Choice> netDividendRate) {
		this.netDividendRate = netDividendRate;
	}

	@XmlElement(name = "NonResdtRate")
	public RateAndAmountFormat5Choice getNonResidentRate() {
		return nonResidentRate;
	}

	public void setNonResidentRate(RateAndAmountFormat5Choice nonResidentRate) {
		this.nonResidentRate = nonResidentRate;
	}

	@XmlElement(name = "PrvsnlDvddRate")
	public ActiveCurrencyAnd13DecimalAmount getProvisionalDividendRate() {
		return provisionalDividendRate;
	}

	public void setProvisionalDividendRate(ActiveCurrencyAnd13DecimalAmount provisionalDividendRate) {
		this.provisionalDividendRate = provisionalDividendRate;
	}

	@XmlElement(name = "AplblRate")
	public PercentageRate getApplicableRate() {
		return applicableRate;
	}

	public void setApplicableRate(PercentageRate applicableRate) {
		this.applicableRate = applicableRate;
	}

	@XmlElement(name = "SlctnFeeRate")
	public PercentageRate getSolicitationFeeRate() {
		return solicitationFeeRate;
	}

	public void setSolicitationFeeRate(PercentageRate solicitationFeeRate) {
		this.solicitationFeeRate = solicitationFeeRate;
	}

	@XmlElement(name = "TaxCdtRate")
	public List<TaxCreditRateFormat2Choice> getTaxCreditRate() {
		return taxCreditRate;
	}

	public void setTaxCreditRate(List<TaxCreditRateFormat2Choice> taxCreditRate) {
		this.taxCreditRate = taxCreditRate;
	}

	@XmlElement(name = "TaxRltdRate")
	public List<RateTypeAndAmountAndStatus6> getTaxRelatedRate() {
		return taxRelatedRate;
	}

	public void setTaxRelatedRate(List<com.tools20022.repository.msg.RateTypeAndAmountAndStatus6> taxRelatedRate) {
		this.taxRelatedRate = taxRelatedRate;
	}

	@XmlElement(name = "WhldgTaxRate")
	public PercentageRate getWithholdingTaxRate() {
		return withholdingTaxRate;
	}

	public void setWithholdingTaxRate(PercentageRate withholdingTaxRate) {
		this.withholdingTaxRate = withholdingTaxRate;
	}

	@XmlElement(name = "TaxOnIncm")
	public PercentageRate getTaxOnIncome() {
		return taxOnIncome;
	}

	public void setTaxOnIncome(PercentageRate taxOnIncome) {
		this.taxOnIncome = taxOnIncome;
	}

	@XmlElement(name = "TaxOnPrfts")
	public PercentageRate getTaxOnProfits() {
		return taxOnProfits;
	}

	public void setTaxOnProfits(PercentageRate taxOnProfits) {
		this.taxOnProfits = taxOnProfits;
	}

	@XmlElement(name = "TaxRclmRate")
	public PercentageRate getTaxReclaimRate() {
		return taxReclaimRate;
	}

	public void setTaxReclaimRate(PercentageRate taxReclaimRate) {
		this.taxReclaimRate = taxReclaimRate;
	}

	@XmlElement(name = "WhldgOfFrgnTax")
	public RateAndAmountFormat5Choice getWithholdingOfForeignTax() {
		return withholdingOfForeignTax;
	}

	public void setWithholdingOfForeignTax(RateAndAmountFormat5Choice withholdingOfForeignTax) {
		this.withholdingOfForeignTax = withholdingOfForeignTax;
	}

	@XmlElement(name = "WhldgOfLclTax")
	public RateAndAmountFormat5Choice getWithholdingOfLocalTax() {
		return withholdingOfLocalTax;
	}

	public void setWithholdingOfLocalTax(RateAndAmountFormat5Choice withholdingOfLocalTax) {
		this.withholdingOfLocalTax = withholdingOfLocalTax;
	}
}