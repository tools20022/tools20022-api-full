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
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails14#mmAdditionalTax
 * RateDetails14.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmGrossDividendRate
 * RateDetails14.mmGrossDividendRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmInterestRateUsedForPayment
 * RateDetails14.mmInterestRateUsedForPayment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails14#mmTaxRelatedRate
 * RateDetails14.mmTaxRelatedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmWithholdingTaxRate
 * RateDetails14.mmWithholdingTaxRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails14#mmChargesFees
 * RateDetails14.mmChargesFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmEarlySolicitationFeeRate
 * RateDetails14.mmEarlySolicitationFeeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmFinalDividendRate
 * RateDetails14.mmFinalDividendRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails14#mmFiscalStamp
 * RateDetails14.mmFiscalStamp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmFullyFrankedRate
 * RateDetails14.mmFullyFrankedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmThirdPartyIncentiveRate
 * RateDetails14.mmThirdPartyIncentiveRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmNetDividendRate
 * RateDetails14.mmNetDividendRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmNonResidentRate
 * RateDetails14.mmNonResidentRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmProvisionalDividendRate
 * RateDetails14.mmProvisionalDividendRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails14#mmApplicableRate
 * RateDetails14.mmApplicableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmSolicitationFeeRate
 * RateDetails14.mmSolicitationFeeRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails14#mmTaxCreditRate
 * RateDetails14.mmTaxCreditRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails14#mmTaxOnIncome
 * RateDetails14.mmTaxOnIncome}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails14#mmTaxOnProfits
 * RateDetails14.mmTaxOnProfits}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails14#mmTaxReclaimRate
 * RateDetails14.mmTaxReclaimRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmWithholdingOfForeignTax
 * RateDetails14.mmWithholdingOfForeignTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmWithholdingOfLocalTax
 * RateDetails14.mmWithholdingOfLocalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmEqualisationRate
 * RateDetails14.mmEqualisationRate}</li>
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
 * "RateDetails14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about the rates related to securities movement."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails22 RateDetails22}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.RateDetails10
 * RateDetails10}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RateDetails14", propOrder = {"additionalTax", "grossDividendRate", "interestRateUsedForPayment", "taxRelatedRate", "withholdingTaxRate", "chargesFees", "earlySolicitationFeeRate", "finalDividendRate", "fiscalStamp",
		"fullyFrankedRate", "thirdPartyIncentiveRate", "netDividendRate", "nonResidentRate", "provisionalDividendRate", "applicableRate", "solicitationFeeRate", "taxCreditRate", "taxOnIncome", "taxOnProfits", "taxReclaimRate",
		"withholdingOfForeignTax", "withholdingOfLocalTax", "equalisationRate"})
public class RateDetails14 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RateAndAmountFormat14Choice additionalTax;
	/**
	 * Rate used for additional tax that cannot be categorised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat14Choice
	 * RateAndAmountFormat14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmTaxVoucher
	 * CorporateActionDistribution.mmTaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails14 RateDetails14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmAdditionalTax
	 * RateDetails22.mmAdditionalTax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmAdditionalTax
	 * RateDetails10.mmAdditionalTax}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalTax = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmTaxVoucher;
			componentContext_lazy = () -> RateDetails14.mmObject();
			isDerived = false;
			xmlTag = "AddtlTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTax";
			definition = "Rate used for additional tax that cannot be categorised.";
			nextVersions_lazy = () -> Arrays.asList(RateDetails22.mmAdditionalTax);
			previousVersion_lazy = () -> RateDetails10.mmAdditionalTax;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat14Choice.mmObject();
		}
	};
	protected List<GrossDividendRateFormat7Choice> grossDividendRate;
	/**
	 * Cash dividend amount per equity before deductions or allowances have been
	 * made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat7Choice
	 * GrossDividendRateFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmGrossDividend
	 * Dividend.mmGrossDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails14 RateDetails14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmGrossDividendRate
	 * RateDetails22.mmGrossDividendRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmGrossDividendRate
	 * RateDetails10.mmGrossDividendRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGrossDividendRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Dividend.mmGrossDividend;
			componentContext_lazy = () -> RateDetails14.mmObject();
			isDerived = false;
			xmlTag = "GrssDvddRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate";
			definition = "Cash dividend amount per equity before deductions or allowances have been made.";
			nextVersions_lazy = () -> Arrays.asList(RateDetails22.mmGrossDividendRate);
			previousVersion_lazy = () -> RateDetails10.mmGrossDividendRate;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GrossDividendRateFormat7Choice.mmObject();
		}
	};
	protected List<InterestRateUsedForPaymentFormat5Choice> interestRateUsedForPayment;
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
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat5Choice
	 * InterestRateUsedForPaymentFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails14 RateDetails14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmInterestRateUsedForPayment
	 * RateDetails22.mmInterestRateUsedForPayment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmInterestRateUsedForPayment
	 * RateDetails10.mmInterestRateUsedForPayment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInterestRateUsedForPayment = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> RateDetails14.mmObject();
			isDerived = false;
			xmlTag = "IntrstRateUsdForPmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRateUsedForPayment";
			definition = "The actual interest rate used for the payment of the interest for the specified interest period. \nUsage guideline: It is used to provide the applicable rate for the current payment, after all calculations have been performed, that is, application of period and method of interest computation.";
			nextVersions_lazy = () -> Arrays.asList(RateDetails22.mmInterestRateUsedForPayment);
			previousVersion_lazy = () -> RateDetails10.mmInterestRateUsedForPayment;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InterestRateUsedForPaymentFormat5Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RateDetails14 RateDetails14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmTaxRelatedRate
	 * RateDetails10.mmTaxRelatedRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxRelatedRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> RateDetails14.mmObject();
			isDerived = false;
			xmlTag = "TaxRltdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRate";
			definition = "Percentage of the gross dividend rate on which tax must be paid .";
			previousVersion_lazy = () -> RateDetails10.mmTaxRelatedRate;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RateTypeAndAmountAndStatus6.mmObject();
		}
	};
	protected List<RateFormat10Choice> withholdingTaxRate;
	/**
	 * Percentage of a cash distribution that will be withheld by a tax
	 * authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat10Choice
	 * RateFormat10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails14 RateDetails14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmWithholdingTaxRate
	 * RateDetails22.mmWithholdingTaxRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmWithholdingTaxRate
	 * RateDetails10.mmWithholdingTaxRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmWithholdingTaxRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> RateDetails14.mmObject();
			isDerived = false;
			xmlTag = "WhldgTaxRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxRate";
			definition = "Percentage of a cash distribution that will be withheld by a tax authority.";
			nextVersions_lazy = () -> Arrays.asList(RateDetails22.mmWithholdingTaxRate);
			previousVersion_lazy = () -> RateDetails10.mmWithholdingTaxRate;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat10Choice.mmObject();
		}
	};
	protected RateAndAmountFormat14Choice chargesFees;
	/**
	 * Rate used to calculate the amount of the charges/fees that cannot be
	 * categorised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat14Choice
	 * RateAndAmountFormat14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionCharge
	 * CorporateActionEvent.mmCorporateActionCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails14 RateDetails14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmChargesFees
	 * RateDetails22.mmChargesFees}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmChargesFees
	 * RateDetails10.mmChargesFees}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmChargesFees = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionCharge;
			componentContext_lazy = () -> RateDetails14.mmObject();
			isDerived = false;
			xmlTag = "ChrgsFees";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesFees";
			definition = "Rate used to calculate the amount of the charges/fees that cannot be categorised.";
			nextVersions_lazy = () -> Arrays.asList(RateDetails22.mmChargesFees);
			previousVersion_lazy = () -> RateDetails10.mmChargesFees;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat14Choice.mmObject();
		}
	};
	protected SolicitationFeeRateFormat5Choice earlySolicitationFeeRate;
	/**
	 * Cash rate made available, as an incentive, in addition to the
	 * solicitation fee, in order to encourage early participation in an offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat5Choice
	 * SolicitationFeeRateFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmEarlySolicitationFeeRate
	 * CorporateActionFeesAndCharges.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails14 RateDetails14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmEarlySolicitationFeeRate
	 * RateDetails22.mmEarlySolicitationFeeRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmEarlySolicitationFeeRate
	 * RateDetails10.mmEarlySolicitationFeeRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEarlySolicitationFeeRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionFeesAndCharges.mmEarlySolicitationFeeRate;
			componentContext_lazy = () -> RateDetails14.mmObject();
			isDerived = false;
			xmlTag = "EarlySlctnFeeRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlySolicitationFeeRate";
			definition = "Cash rate made available, as an incentive, in addition to the solicitation fee, in order to encourage early participation in an offer.";
			nextVersions_lazy = () -> Arrays.asList(RateDetails22.mmEarlySolicitationFeeRate);
			previousVersion_lazy = () -> RateDetails10.mmEarlySolicitationFeeRate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SolicitationFeeRateFormat5Choice.mmObject();
		}
	};
	protected RateAndAmountFormat15Choice finalDividendRate;
	/**
	 * Dividend is final.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat15Choice
	 * RateAndAmountFormat15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmFinalDividend
	 * Dividend.mmFinalDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails14 RateDetails14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmFinalDividendRate
	 * RateDetails10.mmFinalDividendRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinalDividendRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Dividend.mmFinalDividend;
			componentContext_lazy = () -> RateDetails14.mmObject();
			isDerived = false;
			xmlTag = "FnlDvddRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalDividendRate";
			definition = "Dividend is final.";
			previousVersion_lazy = () -> RateDetails10.mmFinalDividendRate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat15Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RateDetails14 RateDetails14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmFiscalStamp
	 * RateDetails22.mmFiscalStamp}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmFiscalStamp
	 * RateDetails10.mmFiscalStamp}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFiscalStamp = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> RateDetails14.mmObject();
			isDerived = false;
			xmlTag = "FsclStmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiscalStamp";
			definition = "Percentage of fiscal tax to apply.";
			nextVersions_lazy = () -> Arrays.asList(RateDetails22.mmFiscalStamp);
			previousVersion_lazy = () -> RateDetails10.mmFiscalStamp;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat3Choice.mmObject();
		}
	};
	protected RateAndAmountFormat14Choice fullyFrankedRate;
	/**
	 * Rate resulting from a fully franked dividend paid by a company; rate
	 * includes tax credit for companies that have made sufficient tax payments
	 * during fiscal period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat14Choice
	 * RateAndAmountFormat14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmFullyFrankedRateAndAmount
	 * Dividend.mmFullyFrankedRateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails14 RateDetails14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmFullyFrankedRate
	 * RateDetails22.mmFullyFrankedRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmFullyFrankedRate
	 * RateDetails10.mmFullyFrankedRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFullyFrankedRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Dividend.mmFullyFrankedRateAndAmount;
			componentContext_lazy = () -> RateDetails14.mmObject();
			isDerived = false;
			xmlTag = "FullyFrnkdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyFrankedRate";
			definition = "Rate resulting from a fully franked dividend paid by a company; rate includes tax credit for companies that have made sufficient tax payments during fiscal period.";
			nextVersions_lazy = () -> Arrays.asList(RateDetails22.mmFullyFrankedRate);
			previousVersion_lazy = () -> RateDetails10.mmFullyFrankedRate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat14Choice.mmObject();
		}
	};
	protected RateFormat8Choice thirdPartyIncentiveRate;
	/**
	 * Cash rate made available in an event in order to encourage participation
	 * in the offer. As information, payment is made to a third party who has
	 * solicited an entity to take part in the offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat8Choice
	 * RateFormat8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmCashIncentiveRate
	 * CashProceedsDefinition.mmCashIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails14 RateDetails14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmThirdPartyIncentiveRate
	 * RateDetails22.mmThirdPartyIncentiveRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmThirdPartyIncentiveRate
	 * RateDetails10.mmThirdPartyIncentiveRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmThirdPartyIncentiveRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmCashIncentiveRate;
			componentContext_lazy = () -> RateDetails14.mmObject();
			isDerived = false;
			xmlTag = "ThrdPtyIncntivRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdPartyIncentiveRate";
			definition = "Cash rate made available in an event in order to encourage participation in the offer. As information, payment is made to a third party who has solicited an entity to take part in the offer.";
			nextVersions_lazy = () -> Arrays.asList(RateDetails22.mmThirdPartyIncentiveRate);
			previousVersion_lazy = () -> RateDetails10.mmThirdPartyIncentiveRate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat8Choice.mmObject();
		}
	};
	protected List<NetDividendRateFormat9Choice> netDividendRate;
	/**
	 * Cash dividend amount per equity after deductions or allowances have been
	 * made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat9Choice
	 * NetDividendRateFormat9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmNetDividend
	 * Dividend.mmNetDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails14 RateDetails14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmNetDividendRate
	 * RateDetails22.mmNetDividendRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmNetDividendRate
	 * RateDetails10.mmNetDividendRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNetDividendRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Dividend.mmNetDividend;
			componentContext_lazy = () -> RateDetails14.mmObject();
			isDerived = false;
			xmlTag = "NetDvddRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate";
			definition = "Cash dividend amount per equity after deductions or allowances have been made.";
			nextVersions_lazy = () -> Arrays.asList(RateDetails22.mmNetDividendRate);
			previousVersion_lazy = () -> RateDetails10.mmNetDividendRate;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NetDividendRateFormat9Choice.mmObject();
		}
	};
	protected RateAndAmountFormat14Choice nonResidentRate;
	/**
	 * Rate per share to which a non-resident is entitled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat14Choice
	 * RateAndAmountFormat14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmRate
	 * Dividend.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails14 RateDetails14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmNonResidentRate
	 * RateDetails22.mmNonResidentRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmNonResidentRate
	 * RateDetails10.mmNonResidentRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNonResidentRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Dividend.mmRate;
			componentContext_lazy = () -> RateDetails14.mmObject();
			isDerived = false;
			xmlTag = "NonResdtRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonResidentRate";
			definition = "Rate per share to which a non-resident is entitled.";
			nextVersions_lazy = () -> Arrays.asList(RateDetails22.mmNonResidentRate);
			previousVersion_lazy = () -> RateDetails10.mmNonResidentRate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat14Choice.mmObject();
		}
	};
	protected RateAndAmountFormat15Choice provisionalDividendRate;
	/**
	 * Dividend is provisional.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat15Choice
	 * RateAndAmountFormat15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmProvisionalDividend
	 * Dividend.mmProvisionalDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails14 RateDetails14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmProvisionalDividendRate
	 * RateDetails10.mmProvisionalDividendRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProvisionalDividendRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Dividend.mmProvisionalDividend;
			componentContext_lazy = () -> RateDetails14.mmObject();
			isDerived = false;
			xmlTag = "PrvsnlDvddRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProvisionalDividendRate";
			definition = "Dividend is provisional.";
			previousVersion_lazy = () -> RateDetails10.mmProvisionalDividendRate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat15Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RateDetails14 RateDetails14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmApplicableRate
	 * RateDetails22.mmApplicableRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmApplicableRate
	 * RateDetails10.mmApplicableRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmApplicableRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmApplicableRate;
			componentContext_lazy = () -> RateDetails14.mmObject();
			isDerived = false;
			xmlTag = "AplblRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicableRate";
			definition = "Rate applicable to the event announced, for example, redemption rate for a redemption event.";
			nextVersions_lazy = () -> Arrays.asList(RateDetails22.mmApplicableRate);
			previousVersion_lazy = () -> RateDetails10.mmApplicableRate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat3Choice.mmObject();
		}
	};
	protected SolicitationFeeRateFormat5Choice solicitationFeeRate;
	/**
	 * Rate of the cash premium made available if the securities holder consents
	 * or participates to an event, for example consent fees or solicitation
	 * fee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat5Choice
	 * SolicitationFeeRateFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmSolicitationFee
	 * CorporateActionFeesAndCharges.mmSolicitationFee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails14 RateDetails14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmSolicitationFeeRate
	 * RateDetails22.mmSolicitationFeeRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmSolicitationFeeRate
	 * RateDetails10.mmSolicitationFeeRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSolicitationFeeRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionFeesAndCharges.mmSolicitationFee;
			componentContext_lazy = () -> RateDetails14.mmObject();
			isDerived = false;
			xmlTag = "SlctnFeeRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationFeeRate";
			definition = "Rate of the cash premium made available if the securities holder consents or participates to an event, for example consent fees or solicitation fee.";
			nextVersions_lazy = () -> Arrays.asList(RateDetails22.mmSolicitationFeeRate);
			previousVersion_lazy = () -> RateDetails10.mmSolicitationFeeRate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SolicitationFeeRateFormat5Choice.mmObject();
		}
	};
	protected List<TaxCreditRateFormat5Choice> taxCreditRate;
	/**
	 * Amount of money per equity allocated as the result of a tax credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat5Choice
	 * TaxCreditRateFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmCreditRate
	 * TaxVoucher.mmCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails14 RateDetails14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmTaxCreditRate
	 * RateDetails22.mmTaxCreditRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmTaxCreditRate
	 * RateDetails10.mmTaxCreditRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxCreditRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmCreditRate;
			componentContext_lazy = () -> RateDetails14.mmObject();
			isDerived = false;
			xmlTag = "TaxCdtRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate";
			definition = "Amount of money per equity allocated as the result of a tax credit.";
			nextVersions_lazy = () -> Arrays.asList(RateDetails22.mmTaxCreditRate);
			previousVersion_lazy = () -> RateDetails10.mmTaxCreditRate;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxCreditRateFormat5Choice.mmObject();
		}
	};
	protected RateAndAmountFormat14Choice taxOnIncome;
	/**
	 * Overall tax withheld at source by fund managers prior to considering the
	 * tax obligation of each unit holder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat14Choice
	 * RateAndAmountFormat14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails14 RateDetails14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmTaxOnIncome
	 * RateDetails22.mmTaxOnIncome}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmTaxOnIncome
	 * RateDetails10.mmTaxOnIncome}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxOnIncome = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> RateDetails14.mmObject();
			isDerived = false;
			xmlTag = "TaxOnIncm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxOnIncome";
			definition = "Overall tax withheld at source by fund managers prior to considering the tax obligation of each unit holder.";
			nextVersions_lazy = () -> Arrays.asList(RateDetails22.mmTaxOnIncome);
			previousVersion_lazy = () -> RateDetails10.mmTaxOnIncome;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat14Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RateDetails14 RateDetails14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmTaxOnProfits
	 * RateDetails22.mmTaxOnProfits}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmTaxOnProfits
	 * RateDetails10.mmTaxOnProfits}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxOnProfits = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> RateDetails14.mmObject();
			isDerived = false;
			xmlTag = "TaxOnPrfts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxOnProfits";
			definition = "Taxation applied on an amount clearly identified as capital profits, capital gains.";
			nextVersions_lazy = () -> Arrays.asList(RateDetails22.mmTaxOnProfits);
			previousVersion_lazy = () -> RateDetails10.mmTaxOnProfits;
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
	 * {@linkplain com.tools20022.repository.msg.RateDetails14 RateDetails14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmTaxReclaimRate
	 * RateDetails22.mmTaxReclaimRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmTaxReclaimRate
	 * RateDetails10.mmTaxReclaimRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxReclaimRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> RateDetails14.mmObject();
			isDerived = false;
			xmlTag = "TaxRclmRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReclaimRate";
			definition = "Percentage of cash that was paid in excess of actual tax obligation and was reclaimed.";
			nextVersions_lazy = () -> Arrays.asList(RateDetails22.mmTaxReclaimRate);
			previousVersion_lazy = () -> RateDetails10.mmTaxReclaimRate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat3Choice.mmObject();
		}
	};
	protected List<RateAndAmountFormat20Choice> withholdingOfForeignTax;
	/**
	 * Rate at which the income will be withheld by the jurisdiction in which
	 * the income was originally paid, for which relief at source and/or reclaim
	 * may be possible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat20Choice
	 * RateAndAmountFormat20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails14 RateDetails14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmWithholdingOfForeignTax
	 * RateDetails10.mmWithholdingOfForeignTax}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmWithholdingOfForeignTax = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> RateDetails14.mmObject();
			isDerived = false;
			xmlTag = "WhldgOfFrgnTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingOfForeignTax";
			definition = "Rate at which the income will be withheld by the jurisdiction in which the income was originally paid, for which relief at source and/or reclaim may be possible.";
			previousVersion_lazy = () -> RateDetails10.mmWithholdingOfForeignTax;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat20Choice.mmObject();
		}
	};
	protected List<RateAndAmountFormat20Choice> withholdingOfLocalTax;
	/**
	 * Rate at which the income will be withheld by the jurisdiction in which
	 * the account owner is located, for which relief at source and/or reclaim
	 * may be possible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat20Choice
	 * RateAndAmountFormat20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails14 RateDetails14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmWithholdingOfLocalTax
	 * RateDetails10.mmWithholdingOfLocalTax}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmWithholdingOfLocalTax = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> RateDetails14.mmObject();
			isDerived = false;
			xmlTag = "WhldgOfLclTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingOfLocalTax";
			definition = "Rate at which the income will be withheld by the jurisdiction in which the account owner is located, for which relief at source and/or reclaim may be possible.";
			previousVersion_lazy = () -> RateDetails10.mmWithholdingOfLocalTax;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat20Choice.mmObject();
		}
	};
	protected RateAndAmountFormat15Choice equalisationRate;
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
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat15Choice
	 * RateAndAmountFormat15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Equalisation#mmRate
	 * Equalisation.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails14 RateDetails14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmEqualisationRate
	 * RateDetails22.mmEqualisationRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmEqualisationRate
	 * RateDetails10.mmEqualisationRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEqualisationRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Equalisation.mmRate;
			componentContext_lazy = () -> RateDetails14.mmObject();
			isDerived = false;
			xmlTag = "EqulstnRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EqualisationRate";
			definition = "Portion of the fund distribution which represents the average accrued income included in the purchase price for units bought during the account period.";
			nextVersions_lazy = () -> Arrays.asList(RateDetails22.mmEqualisationRate);
			previousVersion_lazy = () -> RateDetails10.mmEqualisationRate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat15Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RateDetails14.mmAdditionalTax, RateDetails14.mmGrossDividendRate, RateDetails14.mmInterestRateUsedForPayment, RateDetails14.mmTaxRelatedRate, RateDetails14.mmWithholdingTaxRate,
						RateDetails14.mmChargesFees, RateDetails14.mmEarlySolicitationFeeRate, RateDetails14.mmFinalDividendRate, RateDetails14.mmFiscalStamp, RateDetails14.mmFullyFrankedRate, RateDetails14.mmThirdPartyIncentiveRate,
						RateDetails14.mmNetDividendRate, RateDetails14.mmNonResidentRate, RateDetails14.mmProvisionalDividendRate, RateDetails14.mmApplicableRate, RateDetails14.mmSolicitationFeeRate, RateDetails14.mmTaxCreditRate,
						RateDetails14.mmTaxOnIncome, RateDetails14.mmTaxOnProfits, RateDetails14.mmTaxReclaimRate, RateDetails14.mmWithholdingOfForeignTax, RateDetails14.mmWithholdingOfLocalTax, RateDetails14.mmEqualisationRate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RateDetails14";
				definition = "Provides information about the rates related to securities movement.";
				nextVersions_lazy = () -> Arrays.asList(RateDetails22.mmObject());
				previousVersion_lazy = () -> RateDetails10.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AddtlTax")
	public RateAndAmountFormat14Choice getAdditionalTax() {
		return additionalTax;
	}

	public void setAdditionalTax(RateAndAmountFormat14Choice additionalTax) {
		this.additionalTax = additionalTax;
	}

	@XmlElement(name = "GrssDvddRate")
	public List<GrossDividendRateFormat7Choice> getGrossDividendRate() {
		return grossDividendRate;
	}

	public void setGrossDividendRate(List<GrossDividendRateFormat7Choice> grossDividendRate) {
		this.grossDividendRate = grossDividendRate;
	}

	@XmlElement(name = "IntrstRateUsdForPmt")
	public List<InterestRateUsedForPaymentFormat5Choice> getInterestRateUsedForPayment() {
		return interestRateUsedForPayment;
	}

	public void setInterestRateUsedForPayment(List<InterestRateUsedForPaymentFormat5Choice> interestRateUsedForPayment) {
		this.interestRateUsedForPayment = interestRateUsedForPayment;
	}

	@XmlElement(name = "TaxRltdRate")
	public List<RateTypeAndAmountAndStatus6> getTaxRelatedRate() {
		return taxRelatedRate;
	}

	public void setTaxRelatedRate(List<com.tools20022.repository.msg.RateTypeAndAmountAndStatus6> taxRelatedRate) {
		this.taxRelatedRate = taxRelatedRate;
	}

	@XmlElement(name = "WhldgTaxRate")
	public List<RateFormat10Choice> getWithholdingTaxRate() {
		return withholdingTaxRate;
	}

	public void setWithholdingTaxRate(List<RateFormat10Choice> withholdingTaxRate) {
		this.withholdingTaxRate = withholdingTaxRate;
	}

	@XmlElement(name = "ChrgsFees")
	public RateAndAmountFormat14Choice getChargesFees() {
		return chargesFees;
	}

	public void setChargesFees(RateAndAmountFormat14Choice chargesFees) {
		this.chargesFees = chargesFees;
	}

	@XmlElement(name = "EarlySlctnFeeRate")
	public SolicitationFeeRateFormat5Choice getEarlySolicitationFeeRate() {
		return earlySolicitationFeeRate;
	}

	public void setEarlySolicitationFeeRate(SolicitationFeeRateFormat5Choice earlySolicitationFeeRate) {
		this.earlySolicitationFeeRate = earlySolicitationFeeRate;
	}

	@XmlElement(name = "FnlDvddRate")
	public RateAndAmountFormat15Choice getFinalDividendRate() {
		return finalDividendRate;
	}

	public void setFinalDividendRate(RateAndAmountFormat15Choice finalDividendRate) {
		this.finalDividendRate = finalDividendRate;
	}

	@XmlElement(name = "FsclStmp")
	public RateFormat3Choice getFiscalStamp() {
		return fiscalStamp;
	}

	public void setFiscalStamp(RateFormat3Choice fiscalStamp) {
		this.fiscalStamp = fiscalStamp;
	}

	@XmlElement(name = "FullyFrnkdRate")
	public RateAndAmountFormat14Choice getFullyFrankedRate() {
		return fullyFrankedRate;
	}

	public void setFullyFrankedRate(RateAndAmountFormat14Choice fullyFrankedRate) {
		this.fullyFrankedRate = fullyFrankedRate;
	}

	@XmlElement(name = "ThrdPtyIncntivRate")
	public RateFormat8Choice getThirdPartyIncentiveRate() {
		return thirdPartyIncentiveRate;
	}

	public void setThirdPartyIncentiveRate(RateFormat8Choice thirdPartyIncentiveRate) {
		this.thirdPartyIncentiveRate = thirdPartyIncentiveRate;
	}

	@XmlElement(name = "NetDvddRate")
	public List<NetDividendRateFormat9Choice> getNetDividendRate() {
		return netDividendRate;
	}

	public void setNetDividendRate(List<NetDividendRateFormat9Choice> netDividendRate) {
		this.netDividendRate = netDividendRate;
	}

	@XmlElement(name = "NonResdtRate")
	public RateAndAmountFormat14Choice getNonResidentRate() {
		return nonResidentRate;
	}

	public void setNonResidentRate(RateAndAmountFormat14Choice nonResidentRate) {
		this.nonResidentRate = nonResidentRate;
	}

	@XmlElement(name = "PrvsnlDvddRate")
	public RateAndAmountFormat15Choice getProvisionalDividendRate() {
		return provisionalDividendRate;
	}

	public void setProvisionalDividendRate(RateAndAmountFormat15Choice provisionalDividendRate) {
		this.provisionalDividendRate = provisionalDividendRate;
	}

	@XmlElement(name = "AplblRate")
	public RateFormat3Choice getApplicableRate() {
		return applicableRate;
	}

	public void setApplicableRate(RateFormat3Choice applicableRate) {
		this.applicableRate = applicableRate;
	}

	@XmlElement(name = "SlctnFeeRate")
	public SolicitationFeeRateFormat5Choice getSolicitationFeeRate() {
		return solicitationFeeRate;
	}

	public void setSolicitationFeeRate(SolicitationFeeRateFormat5Choice solicitationFeeRate) {
		this.solicitationFeeRate = solicitationFeeRate;
	}

	@XmlElement(name = "TaxCdtRate")
	public List<TaxCreditRateFormat5Choice> getTaxCreditRate() {
		return taxCreditRate;
	}

	public void setTaxCreditRate(List<TaxCreditRateFormat5Choice> taxCreditRate) {
		this.taxCreditRate = taxCreditRate;
	}

	@XmlElement(name = "TaxOnIncm")
	public RateAndAmountFormat14Choice getTaxOnIncome() {
		return taxOnIncome;
	}

	public void setTaxOnIncome(RateAndAmountFormat14Choice taxOnIncome) {
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

	@XmlElement(name = "WhldgOfFrgnTax")
	public List<RateAndAmountFormat20Choice> getWithholdingOfForeignTax() {
		return withholdingOfForeignTax;
	}

	public void setWithholdingOfForeignTax(List<RateAndAmountFormat20Choice> withholdingOfForeignTax) {
		this.withholdingOfForeignTax = withholdingOfForeignTax;
	}

	@XmlElement(name = "WhldgOfLclTax")
	public List<RateAndAmountFormat20Choice> getWithholdingOfLocalTax() {
		return withholdingOfLocalTax;
	}

	public void setWithholdingOfLocalTax(List<RateAndAmountFormat20Choice> withholdingOfLocalTax) {
		this.withholdingOfLocalTax = withholdingOfLocalTax;
	}

	@XmlElement(name = "EqulstnRate")
	public RateAndAmountFormat15Choice getEqualisationRate() {
		return equalisationRate;
	}

	public void setEqualisationRate(RateAndAmountFormat15Choice equalisationRate) {
		this.equalisationRate = equalisationRate;
	}
}