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
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails28#mmAdditionalTax
 * RateDetails28.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails28#mmGrossDividendRate
 * RateDetails28.mmGrossDividendRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails28#mmInterestRateUsedForPayment
 * RateDetails28.mmInterestRateUsedForPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails28#mmWithholdingTaxRate
 * RateDetails28.mmWithholdingTaxRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails28#mmSecondLevelTax
 * RateDetails28.mmSecondLevelTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails28#mmChargesFees
 * RateDetails28.mmChargesFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails28#mmEarlySolicitationFeeRate
 * RateDetails28.mmEarlySolicitationFeeRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails28#mmFiscalStamp
 * RateDetails28.mmFiscalStamp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails28#mmThirdPartyIncentiveRate
 * RateDetails28.mmThirdPartyIncentiveRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails28#mmNetDividendRate
 * RateDetails28.mmNetDividendRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails28#mmNonResidentRate
 * RateDetails28.mmNonResidentRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails28#mmApplicableRate
 * RateDetails28.mmApplicableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails28#mmSolicitationFeeRate
 * RateDetails28.mmSolicitationFeeRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails28#mmTaxCreditRate
 * RateDetails28.mmTaxCreditRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails28#mmTaxOnIncome
 * RateDetails28.mmTaxOnIncome}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails28#mmTaxOnProfits
 * RateDetails28.mmTaxOnProfits}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails28#mmTaxReclaimRate
 * RateDetails28.mmTaxReclaimRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails28#mmEqualisationRate
 * RateDetails28.mmEqualisationRate}</li>
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
 * "RateDetails28"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about the rates related to securities movement."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RateDetails28", propOrder = {"additionalTax", "grossDividendRate", "interestRateUsedForPayment", "withholdingTaxRate", "secondLevelTax", "chargesFees", "earlySolicitationFeeRate", "fiscalStamp", "thirdPartyIncentiveRate",
		"netDividendRate", "nonResidentRate", "applicableRate", "solicitationFeeRate", "taxCreditRate", "taxOnIncome", "taxOnProfits", "taxReclaimRate", "equalisationRate"})
public class RateDetails28 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RateAndAmountFormat46Choice additionalTax;
	/**
	 * Rate used for additional tax that cannot be categorised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat46Choice
	 * RateAndAmountFormat46Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmTaxVoucher
	 * CorporateActionDistribution.mmTaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails28 RateDetails28}</li>
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
			componentContext_lazy = () -> RateDetails28.mmObject();
			isDerived = false;
			xmlTag = "AddtlTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTax";
			definition = "Rate used for additional tax that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat46Choice.mmObject();
		}
	};
	protected List<GrossDividendRateFormat26Choice> grossDividendRate;
	/**
	 * Cash dividend amount per equity before deductions or allowances have been
	 * made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat26Choice
	 * GrossDividendRateFormat26Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmGrossDividend
	 * Dividend.mmGrossDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails28 RateDetails28}</li>
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
			componentContext_lazy = () -> RateDetails28.mmObject();
			isDerived = false;
			xmlTag = "GrssDvddRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate";
			definition = "Cash dividend amount per equity before deductions or allowances have been made.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GrossDividendRateFormat26Choice.mmObject();
		}
	};
	protected List<InterestRateUsedForPaymentFormat10Choice> interestRateUsedForPayment;
	/**
	 * The actual interest rate used for the payment of the interest for the
	 * specified interest period. Usage guideline: It is used to provide the
	 * applicable rate for the current payment, after all calculations have been
	 * performed, that is, application of period and method of interest
	 * computation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat10Choice
	 * InterestRateUsedForPaymentFormat10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails28 RateDetails28}</li>
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
	 * "The actual interest rate used for the payment of the interest for the specified interest period. \nUsage guideline: It is used to provide the applicable rate for the current payment, after all calculations have been performed, that is, application of period and method of interest computation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInterestRateUsedForPayment = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> RateDetails28.mmObject();
			isDerived = false;
			xmlTag = "IntrstRateUsdForPmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRateUsedForPayment";
			definition = "The actual interest rate used for the payment of the interest for the specified interest period. \nUsage guideline: It is used to provide the applicable rate for the current payment, after all calculations have been performed, that is, application of period and method of interest computation.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InterestRateUsedForPaymentFormat10Choice.mmObject();
		}
	};
	protected List<RateAndAmountFormat47Choice> withholdingTaxRate;
	/**
	 * Percentage of a cash distribution that will be withheld by the tax
	 * authorities of the jurisdiction of the issuer, for which a relief at
	 * source and/or reclaim may be possible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat47Choice
	 * RateAndAmountFormat47Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails28 RateDetails28}</li>
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
	 * "Percentage of a cash distribution that will be withheld by the tax authorities of the jurisdiction of the issuer, for which a relief at source and/or reclaim may be possible."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmWithholdingTaxRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> RateDetails28.mmObject();
			isDerived = false;
			xmlTag = "WhldgTaxRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxRate";
			definition = "Percentage of a cash distribution that will be withheld by the tax authorities of the jurisdiction of the issuer, for which a relief at source and/or reclaim may be possible.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat47Choice.mmObject();
		}
	};
	protected List<RateAndAmountFormat47Choice> secondLevelTax;
	/**
	 * Rate at which the income will be withheld by a jurisdiction other than
	 * the jurisdiction of the issuer’s country of tax incorporation, for which
	 * a relief at source and/or reclaim may be possible. It is levied in
	 * complement or offset of the withholding tax rate (TAXR) levied by the
	 * jurisdiction of the issuer’s tax domicile.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat47Choice
	 * RateAndAmountFormat47Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails28 RateDetails28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndLvlTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate at which the income will be withheld by a jurisdiction other than the jurisdiction of the issuer’s country of tax incorporation, for which a relief at source and/or reclaim may be possible. It is levied in complement or offset of the withholding tax rate (TAXR) levied by the jurisdiction of the issuer’s tax domicile."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecondLevelTax = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> RateDetails28.mmObject();
			isDerived = false;
			xmlTag = "ScndLvlTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax";
			definition = "Rate at which the income will be withheld by a jurisdiction other than the jurisdiction of the issuer’s country of tax incorporation, for which a relief at source and/or reclaim may be possible. It is levied in complement or offset of the withholding tax rate (TAXR) levied by the jurisdiction of the issuer’s tax domicile.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat47Choice.mmObject();
		}
	};
	protected RateAndAmountFormat46Choice chargesFees;
	/**
	 * Rate used to calculate the amount of the charges/fees that cannot be
	 * categorised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat46Choice
	 * RateAndAmountFormat46Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionCharge
	 * CorporateActionEvent.mmCorporateActionCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails28 RateDetails28}</li>
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
			componentContext_lazy = () -> RateDetails28.mmObject();
			isDerived = false;
			xmlTag = "ChrgsFees";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesFees";
			definition = "Rate used to calculate the amount of the charges/fees that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat46Choice.mmObject();
		}
	};
	protected SolicitationFeeRateFormat10Choice earlySolicitationFeeRate;
	/**
	 * Cash rate made available, as an incentive, in addition to the
	 * solicitation fee, in order to encourage early participation in an offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat10Choice
	 * SolicitationFeeRateFormat10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmEarlySolicitationFeeRate
	 * CorporateActionFeesAndCharges.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails28 RateDetails28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlySlctnFeeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlySolicitationFeeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash rate made available, as an incentive, in addition to the solicitation fee, in order to encourage early participation in an offer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEarlySolicitationFeeRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionFeesAndCharges.mmEarlySolicitationFeeRate;
			componentContext_lazy = () -> RateDetails28.mmObject();
			isDerived = false;
			xmlTag = "EarlySlctnFeeRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlySolicitationFeeRate";
			definition = "Cash rate made available, as an incentive, in addition to the solicitation fee, in order to encourage early participation in an offer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SolicitationFeeRateFormat10Choice.mmObject();
		}
	};
	protected RateFormat3Choice fiscalStamp;
	/**
	 * Percentage of fiscal tax to apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat3Choice
	 * RateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails28 RateDetails28}</li>
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
	public static final MMMessageAssociationEnd mmFiscalStamp = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> RateDetails28.mmObject();
			isDerived = false;
			xmlTag = "FsclStmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiscalStamp";
			definition = "Percentage of fiscal tax to apply.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat3Choice.mmObject();
		}
	};
	protected RateFormat21Choice thirdPartyIncentiveRate;
	/**
	 * Cash rate made available in an event in order to encourage participation
	 * in the offer. As information, payment is made to a third party who has
	 * solicited an entity to take part in the offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat21Choice
	 * RateFormat21Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmCashIncentiveRate
	 * CashProceedsDefinition.mmCashIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails28 RateDetails28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ThrdPtyIncntivRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdPartyIncentiveRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash rate made available in an event in order to encourage participation in the offer. As information, payment is made to a third party who has solicited an entity to take part in the offer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmThirdPartyIncentiveRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmCashIncentiveRate;
			componentContext_lazy = () -> RateDetails28.mmObject();
			isDerived = false;
			xmlTag = "ThrdPtyIncntivRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdPartyIncentiveRate";
			definition = "Cash rate made available in an event in order to encourage participation in the offer. As information, payment is made to a third party who has solicited an entity to take part in the offer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat21Choice.mmObject();
		}
	};
	protected List<NetDividendRateFormat28Choice> netDividendRate;
	/**
	 * Cash dividend amount per equity after deductions or allowances have been
	 * made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat28Choice
	 * NetDividendRateFormat28Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmNetDividend
	 * Dividend.mmNetDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails28 RateDetails28}</li>
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
			componentContext_lazy = () -> RateDetails28.mmObject();
			isDerived = false;
			xmlTag = "NetDvddRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate";
			definition = "Cash dividend amount per equity after deductions or allowances have been made.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NetDividendRateFormat28Choice.mmObject();
		}
	};
	protected RateAndAmountFormat46Choice nonResidentRate;
	/**
	 * Rate per share to which a non-resident is entitled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat46Choice
	 * RateAndAmountFormat46Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmRate
	 * Dividend.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails28 RateDetails28}</li>
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
			componentContext_lazy = () -> RateDetails28.mmObject();
			isDerived = false;
			xmlTag = "NonResdtRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonResidentRate";
			definition = "Rate per share to which a non-resident is entitled.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat46Choice.mmObject();
		}
	};
	protected RateFormat3Choice applicableRate;
	/**
	 * Rate applicable to the event announced, for example, redemption rate for
	 * a redemption event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat3Choice
	 * RateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmApplicableRate
	 * BiddingConditions.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails28 RateDetails28}</li>
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
	public static final MMMessageAssociationEnd mmApplicableRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmApplicableRate;
			componentContext_lazy = () -> RateDetails28.mmObject();
			isDerived = false;
			xmlTag = "AplblRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicableRate";
			definition = "Rate applicable to the event announced, for example, redemption rate for a redemption event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat3Choice.mmObject();
		}
	};
	protected SolicitationFeeRateFormat10Choice solicitationFeeRate;
	/**
	 * Rate of the cash premium made available if the securities holder consents
	 * or participates to an event, for example consent fees or solicitation
	 * fee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat10Choice
	 * SolicitationFeeRateFormat10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmSolicitationFee
	 * CorporateActionFeesAndCharges.mmSolicitationFee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails28 RateDetails28}</li>
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
	 * "Rate of the cash premium made available if the securities holder consents or participates to an event, for example consent fees or solicitation fee."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSolicitationFeeRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionFeesAndCharges.mmSolicitationFee;
			componentContext_lazy = () -> RateDetails28.mmObject();
			isDerived = false;
			xmlTag = "SlctnFeeRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationFeeRate";
			definition = "Rate of the cash premium made available if the securities holder consents or participates to an event, for example consent fees or solicitation fee.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SolicitationFeeRateFormat10Choice.mmObject();
		}
	};
	protected List<TaxCreditRateFormat10Choice> taxCreditRate;
	/**
	 * Amount of money per equity allocated as the result of a tax credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat10Choice
	 * TaxCreditRateFormat10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmCreditRate
	 * TaxVoucher.mmCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails28 RateDetails28}</li>
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
			componentContext_lazy = () -> RateDetails28.mmObject();
			isDerived = false;
			xmlTag = "TaxCdtRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate";
			definition = "Amount of money per equity allocated as the result of a tax credit.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxCreditRateFormat10Choice.mmObject();
		}
	};
	protected RateAndAmountFormat46Choice taxOnIncome;
	/**
	 * Overall tax withheld at source by fund managers prior to considering the
	 * tax obligation of each unit holder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat46Choice
	 * RateAndAmountFormat46Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails28 RateDetails28}</li>
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
	 * "Overall tax withheld at source by fund managers prior to considering the tax obligation of each unit holder."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxOnIncome = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> RateDetails28.mmObject();
			isDerived = false;
			xmlTag = "TaxOnIncm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxOnIncome";
			definition = "Overall tax withheld at source by fund managers prior to considering the tax obligation of each unit holder.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat46Choice.mmObject();
		}
	};
	protected RateFormat3Choice taxOnProfits;
	/**
	 * Taxation applied on an amount clearly identified as capital profits,
	 * capital gains.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat3Choice
	 * RateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails28 RateDetails28}</li>
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
	public static final MMMessageAssociationEnd mmTaxOnProfits = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> RateDetails28.mmObject();
			isDerived = false;
			xmlTag = "TaxOnPrfts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxOnProfits";
			definition = "Taxation applied on an amount clearly identified as capital profits, capital gains.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat3Choice.mmObject();
		}
	};
	protected RateFormat3Choice taxReclaimRate;
	/**
	 * Percentage of cash that was paid in excess of actual tax obligation and
	 * was reclaimed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat3Choice
	 * RateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails28 RateDetails28}</li>
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
	public static final MMMessageAssociationEnd mmTaxReclaimRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> RateDetails28.mmObject();
			isDerived = false;
			xmlTag = "TaxRclmRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReclaimRate";
			definition = "Percentage of cash that was paid in excess of actual tax obligation and was reclaimed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat3Choice.mmObject();
		}
	};
	protected RateAndAmountFormat48Choice equalisationRate;
	/**
	 * Portion of the fund distribution which represents the average accrued
	 * income included in the purchase price for units bought during the account
	 * period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat48Choice
	 * RateAndAmountFormat48Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Equalisation#mmRate
	 * Equalisation.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails28 RateDetails28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EqulstnRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EqualisationRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portion of the fund distribution which represents the average accrued income included in the purchase price for units bought during the account period."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEqualisationRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Equalisation.mmRate;
			componentContext_lazy = () -> RateDetails28.mmObject();
			isDerived = false;
			xmlTag = "EqulstnRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EqualisationRate";
			definition = "Portion of the fund distribution which represents the average accrued income included in the purchase price for units bought during the account period.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat48Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RateDetails28.mmAdditionalTax, RateDetails28.mmGrossDividendRate, RateDetails28.mmInterestRateUsedForPayment, RateDetails28.mmWithholdingTaxRate, RateDetails28.mmSecondLevelTax,
						RateDetails28.mmChargesFees, RateDetails28.mmEarlySolicitationFeeRate, RateDetails28.mmFiscalStamp, RateDetails28.mmThirdPartyIncentiveRate, RateDetails28.mmNetDividendRate, RateDetails28.mmNonResidentRate,
						RateDetails28.mmApplicableRate, RateDetails28.mmSolicitationFeeRate, RateDetails28.mmTaxCreditRate, RateDetails28.mmTaxOnIncome, RateDetails28.mmTaxOnProfits, RateDetails28.mmTaxReclaimRate,
						RateDetails28.mmEqualisationRate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RateDetails28";
				definition = "Provides information about the rates related to securities movement.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AddtlTax")
	public RateAndAmountFormat46Choice getAdditionalTax() {
		return additionalTax;
	}

	public void setAdditionalTax(RateAndAmountFormat46Choice additionalTax) {
		this.additionalTax = additionalTax;
	}

	@XmlElement(name = "GrssDvddRate")
	public List<GrossDividendRateFormat26Choice> getGrossDividendRate() {
		return grossDividendRate;
	}

	public void setGrossDividendRate(List<GrossDividendRateFormat26Choice> grossDividendRate) {
		this.grossDividendRate = grossDividendRate;
	}

	@XmlElement(name = "IntrstRateUsdForPmt")
	public List<InterestRateUsedForPaymentFormat10Choice> getInterestRateUsedForPayment() {
		return interestRateUsedForPayment;
	}

	public void setInterestRateUsedForPayment(List<InterestRateUsedForPaymentFormat10Choice> interestRateUsedForPayment) {
		this.interestRateUsedForPayment = interestRateUsedForPayment;
	}

	@XmlElement(name = "WhldgTaxRate")
	public List<RateAndAmountFormat47Choice> getWithholdingTaxRate() {
		return withholdingTaxRate;
	}

	public void setWithholdingTaxRate(List<RateAndAmountFormat47Choice> withholdingTaxRate) {
		this.withholdingTaxRate = withholdingTaxRate;
	}

	@XmlElement(name = "ScndLvlTax")
	public List<RateAndAmountFormat47Choice> getSecondLevelTax() {
		return secondLevelTax;
	}

	public void setSecondLevelTax(List<RateAndAmountFormat47Choice> secondLevelTax) {
		this.secondLevelTax = secondLevelTax;
	}

	@XmlElement(name = "ChrgsFees")
	public RateAndAmountFormat46Choice getChargesFees() {
		return chargesFees;
	}

	public void setChargesFees(RateAndAmountFormat46Choice chargesFees) {
		this.chargesFees = chargesFees;
	}

	@XmlElement(name = "EarlySlctnFeeRate")
	public SolicitationFeeRateFormat10Choice getEarlySolicitationFeeRate() {
		return earlySolicitationFeeRate;
	}

	public void setEarlySolicitationFeeRate(SolicitationFeeRateFormat10Choice earlySolicitationFeeRate) {
		this.earlySolicitationFeeRate = earlySolicitationFeeRate;
	}

	@XmlElement(name = "FsclStmp")
	public RateFormat3Choice getFiscalStamp() {
		return fiscalStamp;
	}

	public void setFiscalStamp(RateFormat3Choice fiscalStamp) {
		this.fiscalStamp = fiscalStamp;
	}

	@XmlElement(name = "ThrdPtyIncntivRate")
	public RateFormat21Choice getThirdPartyIncentiveRate() {
		return thirdPartyIncentiveRate;
	}

	public void setThirdPartyIncentiveRate(RateFormat21Choice thirdPartyIncentiveRate) {
		this.thirdPartyIncentiveRate = thirdPartyIncentiveRate;
	}

	@XmlElement(name = "NetDvddRate")
	public List<NetDividendRateFormat28Choice> getNetDividendRate() {
		return netDividendRate;
	}

	public void setNetDividendRate(List<NetDividendRateFormat28Choice> netDividendRate) {
		this.netDividendRate = netDividendRate;
	}

	@XmlElement(name = "NonResdtRate")
	public RateAndAmountFormat46Choice getNonResidentRate() {
		return nonResidentRate;
	}

	public void setNonResidentRate(RateAndAmountFormat46Choice nonResidentRate) {
		this.nonResidentRate = nonResidentRate;
	}

	@XmlElement(name = "AplblRate")
	public RateFormat3Choice getApplicableRate() {
		return applicableRate;
	}

	public void setApplicableRate(RateFormat3Choice applicableRate) {
		this.applicableRate = applicableRate;
	}

	@XmlElement(name = "SlctnFeeRate")
	public SolicitationFeeRateFormat10Choice getSolicitationFeeRate() {
		return solicitationFeeRate;
	}

	public void setSolicitationFeeRate(SolicitationFeeRateFormat10Choice solicitationFeeRate) {
		this.solicitationFeeRate = solicitationFeeRate;
	}

	@XmlElement(name = "TaxCdtRate")
	public List<TaxCreditRateFormat10Choice> getTaxCreditRate() {
		return taxCreditRate;
	}

	public void setTaxCreditRate(List<TaxCreditRateFormat10Choice> taxCreditRate) {
		this.taxCreditRate = taxCreditRate;
	}

	@XmlElement(name = "TaxOnIncm")
	public RateAndAmountFormat46Choice getTaxOnIncome() {
		return taxOnIncome;
	}

	public void setTaxOnIncome(RateAndAmountFormat46Choice taxOnIncome) {
		this.taxOnIncome = taxOnIncome;
	}

	@XmlElement(name = "TaxOnPrfts")
	public RateFormat3Choice getTaxOnProfits() {
		return taxOnProfits;
	}

	public void setTaxOnProfits(RateFormat3Choice taxOnProfits) {
		this.taxOnProfits = taxOnProfits;
	}

	@XmlElement(name = "TaxRclmRate")
	public RateFormat3Choice getTaxReclaimRate() {
		return taxReclaimRate;
	}

	public void setTaxReclaimRate(RateFormat3Choice taxReclaimRate) {
		this.taxReclaimRate = taxReclaimRate;
	}

	@XmlElement(name = "EqulstnRate")
	public RateAndAmountFormat48Choice getEqualisationRate() {
		return equalisationRate;
	}

	public void setEqualisationRate(RateAndAmountFormat48Choice equalisationRate) {
		this.equalisationRate = equalisationRate;
	}
}