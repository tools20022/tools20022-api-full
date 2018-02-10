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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies rates related to a corporate action option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87#mmAdditionalTax
 * CorporateActionRate87.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87#mmGrossDividendRate
 * CorporateActionRate87.mmGrossDividendRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87#mmNetDividendRate
 * CorporateActionRate87.mmNetDividendRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87#mmIndexFactor
 * CorporateActionRate87.mmIndexFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87#mmInterestRateUsedForPayment
 * CorporateActionRate87.mmInterestRateUsedForPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87#mmMaximumAllowedOversubscriptionRate
 * CorporateActionRate87.mmMaximumAllowedOversubscriptionRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87#mmProrationRate
 * CorporateActionRate87.mmProrationRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87#mmWithholdingTaxRate
 * CorporateActionRate87.mmWithholdingTaxRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87#mmSecondLevelTax
 * CorporateActionRate87.mmSecondLevelTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87#mmTaxableIncomePerDividendShare
 * CorporateActionRate87.mmTaxableIncomePerDividendShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87#mmIssuerDeclaredExchangeRate
 * CorporateActionRate87.mmIssuerDeclaredExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87#mmTaxOnIncome
 * CorporateActionRate87.mmTaxOnIncome}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate2Rule#forCorporateActionRate87
 * ConstraintGrossDividendRate2Rule.forCorporateActionRate87}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forCorporateActionRate87
 * ConstraintGrossDividendRate3Rule.forCorporateActionRate87}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate1Rule#forCorporateActionRate87
 * ConstraintNetDividendRate1Rule.forCorporateActionRate87}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forCorporateActionRate87
 * ConstraintNetDividendRate2Rule.forCorporateActionRate87}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecondLevelTax3Rule#forCorporateActionRate87
 * ConstraintSecondLevelTax3Rule.forCorporateActionRate87}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintWithholdingTaxRate1Rule#forCorporateActionRate87
 * ConstraintWithholdingTaxRate1Rule.forCorporateActionRate87}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintWithholdingTaxRate2Rule#forCorporateActionRate87
 * ConstraintWithholdingTaxRate2Rule.forCorporateActionRate87}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule#forCorporateActionRate87
 * ConstraintSecondLevelTax1Rule.forCorporateActionRate87}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecondLevelTax2Rule#forCorporateActionRate87
 * ConstraintSecondLevelTax2Rule.forCorporateActionRate87}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionRate87"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies rates related to a corporate action option."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80
 * CorporateActionRate80}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionRate87", propOrder = {"additionalTax", "grossDividendRate", "netDividendRate", "indexFactor", "interestRateUsedForPayment", "maximumAllowedOversubscriptionRate", "prorationRate", "withholdingTaxRate",
		"secondLevelTax", "taxableIncomePerDividendShare", "issuerDeclaredExchangeRate", "taxOnIncome"})
public class CorporateActionRate87 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AddtlTax")
	protected RateAndAmountFormat37Choice additionalTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat37Choice
	 * RateAndAmountFormat37Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87
	 * CorporateActionRate87}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::ATAX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate used for additional tax that cannot be categorised."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmAdditionalTax
	 * CorporateActionRate80.mmAdditionalTax}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalTax = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Tax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate87.mmObject();
			isDerived = false;
			xmlTag = "AddtlTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::ATAX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTax";
			definition = "Rate used for additional tax that cannot be categorised.";
			previousVersion_lazy = () -> CorporateActionRate80.mmAdditionalTax;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat37Choice.mmObject();
		}
	};
	@XmlElement(name = "GrssDvddRate")
	protected List<GrossDividendRateFormat27Choice> grossDividendRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat27Choice
	 * GrossDividendRateFormat27Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmGrossDividend
	 * Dividend.mmGrossDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87
	 * CorporateActionRate87}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrssDvddRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::GRSS</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmGrossDividendRate
	 * CorporateActionRate80.mmGrossDividendRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGrossDividendRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Dividend.mmGrossDividend;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate87.mmObject();
			isDerived = false;
			xmlTag = "GrssDvddRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::GRSS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate";
			definition = "Cash dividend amount per equity before deductions or allowances have been made.";
			previousVersion_lazy = () -> CorporateActionRate80.mmGrossDividendRate;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GrossDividendRateFormat27Choice.mmObject();
		}
	};
	@XmlElement(name = "NetDvddRate")
	protected List<NetDividendRateFormat29Choice> netDividendRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat29Choice
	 * NetDividendRateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmNetDividend
	 * Dividend.mmNetDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87
	 * CorporateActionRate87}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmNetDividendRate
	 * CorporateActionRate80.mmNetDividendRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNetDividendRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Dividend.mmNetDividend;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate87.mmObject();
			isDerived = false;
			xmlTag = "NetDvddRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate";
			definition = "Cash dividend amount per equity after deductions or allowances have been made.";
			previousVersion_lazy = () -> CorporateActionRate80.mmNetDividendRate;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NetDividendRateFormat29Choice.mmObject();
		}
	};
	@XmlElement(name = "IndxFctr")
	protected RateAndAmountFormat37Choice indexFactor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat37Choice
	 * RateAndAmountFormat37Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Index#mmIndexFactor
	 * Index.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87
	 * CorporateActionRate87}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndxFctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::INDX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Public index rate applied to the amount paid to adjust it to inflation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmIndexFactor
	 * CorporateActionRate80.mmIndexFactor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIndexFactor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Index.mmIndexFactor;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate87.mmObject();
			isDerived = false;
			xmlTag = "IndxFctr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::INDX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexFactor";
			definition = "Public index rate applied to the amount paid to adjust it to inflation.";
			previousVersion_lazy = () -> CorporateActionRate80.mmIndexFactor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat37Choice.mmObject();
		}
	};
	@XmlElement(name = "IntrstRateUsdForPmt")
	protected List<InterestRateUsedForPaymentFormat8Choice> interestRateUsedForPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice
	 * InterestRateUsedForPaymentFormat8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87
	 * CorporateActionRate87}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstRateUsdForPmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::INTP</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmInterestRateUsedForPayment
	 * CorporateActionRate80.mmInterestRateUsedForPayment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInterestRateUsedForPayment = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate87.mmObject();
			isDerived = false;
			xmlTag = "IntrstRateUsdForPmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::INTP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRateUsedForPayment";
			definition = "The actual interest rate used for the payment of the interest for the specified interest period. \nUsage guideline: It is used to provide the applicable rate for the current payment, after all calculations have been performed, that is, application of period and method of interest computation.";
			previousVersion_lazy = () -> CorporateActionRate80.mmInterestRateUsedForPayment;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InterestRateUsedForPaymentFormat8Choice.mmObject();
		}
	};
	@XmlElement(name = "MaxAllwdOvrsbcptRate")
	protected RateFormat3Choice maximumAllowedOversubscriptionRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat3Choice
	 * RateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumAllowedOverSubscription
	 * BiddingConditions.mmMaximumAllowedOverSubscription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87
	 * CorporateActionRate87}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxAllwdOvrsbcptRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::OVEP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAllowedOversubscriptionRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum percentage of shares available through the over subscription privilege, usually a percentage of the basic subscription shares, for example, an account owner subscribing to 100 shares may over subscribe to a maximum of 50 additional shares when the over subscription maximum is 50 percent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate80.mmMaximumAllowedOversubscriptionRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMaximumAllowedOversubscriptionRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmMaximumAllowedOverSubscription;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate87.mmObject();
			isDerived = false;
			xmlTag = "MaxAllwdOvrsbcptRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::OVEP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAllowedOversubscriptionRate";
			definition = "Maximum percentage of shares available through the over subscription privilege, usually a percentage of the basic subscription shares, for example, an account owner subscribing to 100 shares may over subscribe to a maximum of 50 additional shares when the over subscription maximum is 50 percent.";
			previousVersion_lazy = () -> CorporateActionRate80.mmMaximumAllowedOversubscriptionRate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat3Choice.mmObject();
		}
	};
	@XmlElement(name = "PrratnRate")
	protected RateFormat3Choice prorationRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat3Choice
	 * RateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmProrationRate
	 * BiddingConditions.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87
	 * CorporateActionRate87}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrratnRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::PROR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProrationRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of securities accepted by the offeror/issuer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmProrationRate
	 * CorporateActionRate80.mmProrationRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProrationRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmProrationRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate87.mmObject();
			isDerived = false;
			xmlTag = "PrratnRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::PROR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProrationRate";
			definition = "Percentage of securities accepted by the offeror/issuer.";
			previousVersion_lazy = () -> CorporateActionRate80.mmProrationRate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat3Choice.mmObject();
		}
	};
	@XmlElement(name = "WhldgTaxRate")
	protected List<RateAndAmountFormat41Choice> withholdingTaxRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat41Choice
	 * RateAndAmountFormat41Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87
	 * CorporateActionRate87}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhldgTaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::TAXR</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmWithholdingTaxRate
	 * CorporateActionRate80.mmWithholdingTaxRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmWithholdingTaxRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate87.mmObject();
			isDerived = false;
			xmlTag = "WhldgTaxRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::TAXR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxRate";
			definition = "Percentage of a cash distribution that will be withheld by the tax authorities of the jurisdiction of the issuer, for which a relief at source and/or reclaim may be possible.";
			previousVersion_lazy = () -> CorporateActionRate80.mmWithholdingTaxRate;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat41Choice.mmObject();
		}
	};
	@XmlElement(name = "ScndLvlTax")
	protected List<RateAndAmountFormat41Choice> secondLevelTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat41Choice
	 * RateAndAmountFormat41Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87
	 * CorporateActionRate87}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmSecondLevelTax
	 * CorporateActionRate80.mmSecondLevelTax}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecondLevelTax = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate87.mmObject();
			isDerived = false;
			xmlTag = "ScndLvlTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax";
			definition = "Rate at which the income will be withheld by a jurisdiction other than the jurisdiction of the issuer’s country of tax incorporation, for which a relief at source and/or reclaim may be possible. It is levied in complement or offset of the withholding tax rate (TAXR) levied by the jurisdiction of the issuer’s tax domicile.";
			previousVersion_lazy = () -> CorporateActionRate80.mmSecondLevelTax;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat41Choice.mmObject();
		}
	};
	@XmlElement(name = "TaxblIncmPerDvddShr")
	protected List<com.tools20022.repository.msg.RateTypeAndAmountAndStatus26> taxableIncomePerDividendShare;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus26
	 * RateTypeAndAmountAndStatus26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerDividendShare
	 * SecuritiesTax.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87
	 * CorporateActionRate87}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxblIncmPerDvddShr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerDividendShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount included in the dividend/NAV that is identified as gains directly or indirectly derived from interest payments, for example, in the context of the EU Savings directive."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmTaxableIncomePerDividendShare
	 * CorporateActionRate80.mmTaxableIncomePerDividendShare}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxableIncomePerDividendShare = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxableIncomePerDividendShare;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate87.mmObject();
			isDerived = false;
			xmlTag = "TaxblIncmPerDvddShr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableIncomePerDividendShare";
			definition = "Amount included in the dividend/NAV that is identified as gains directly or indirectly derived from interest payments, for example, in the context of the EU Savings directive.";
			previousVersion_lazy = () -> CorporateActionRate80.mmTaxableIncomePerDividendShare;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RateTypeAndAmountAndStatus26.mmObject();
		}
	};
	@XmlElement(name = "IssrDclrdXchgRate")
	protected ForeignExchangeTerms19 issuerDeclaredExchangeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms19
	 * ForeignExchangeTerms19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmExchangeRate
	 * CorporateActionEvent.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87
	 * CorporateActionRate87}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrDclrdXchgRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerDeclaredExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange rate (provided by the issuer) between the dividend or interest rate in the paid currency and the declared dividend or interest rate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmIssuerDeclaredExchangeRate
	 * CorporateActionRate80.mmIssuerDeclaredExchangeRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuerDeclaredExchangeRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate87.mmObject();
			isDerived = false;
			xmlTag = "IssrDclrdXchgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerDeclaredExchangeRate";
			definition = "Exchange rate (provided by the issuer) between the dividend or interest rate in the paid currency and the declared dividend or interest rate.";
			previousVersion_lazy = () -> CorporateActionRate80.mmIssuerDeclaredExchangeRate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ForeignExchangeTerms19.mmObject();
		}
	};
	@XmlElement(name = "TaxOnIncm")
	protected RateAndAmountFormat37Choice taxOnIncome;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat37Choice
	 * RateAndAmountFormat37Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87
	 * CorporateActionRate87}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmTaxOnIncome
	 * CorporateActionRate80.mmTaxOnIncome}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxOnIncome = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate87.mmObject();
			isDerived = false;
			xmlTag = "TaxOnIncm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxOnIncome";
			definition = "Overall tax withheld at source by fund managers prior to considering the tax obligation of each unit holder.";
			previousVersion_lazy = () -> CorporateActionRate80.mmTaxOnIncome;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat37Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate87.mmAdditionalTax, com.tools20022.repository.msg.CorporateActionRate87.mmGrossDividendRate,
						com.tools20022.repository.msg.CorporateActionRate87.mmNetDividendRate, com.tools20022.repository.msg.CorporateActionRate87.mmIndexFactor,
						com.tools20022.repository.msg.CorporateActionRate87.mmInterestRateUsedForPayment, com.tools20022.repository.msg.CorporateActionRate87.mmMaximumAllowedOversubscriptionRate,
						com.tools20022.repository.msg.CorporateActionRate87.mmProrationRate, com.tools20022.repository.msg.CorporateActionRate87.mmWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate87.mmSecondLevelTax,
						com.tools20022.repository.msg.CorporateActionRate87.mmTaxableIncomePerDividendShare, com.tools20022.repository.msg.CorporateActionRate87.mmIssuerDeclaredExchangeRate,
						com.tools20022.repository.msg.CorporateActionRate87.mmTaxOnIncome);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate2Rule.forCorporateActionRate87,
						com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate87, com.tools20022.repository.constraints.ConstraintNetDividendRate1Rule.forCorporateActionRate87,
						com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forCorporateActionRate87, com.tools20022.repository.constraints.ConstraintSecondLevelTax3Rule.forCorporateActionRate87,
						com.tools20022.repository.constraints.ConstraintWithholdingTaxRate1Rule.forCorporateActionRate87, com.tools20022.repository.constraints.ConstraintWithholdingTaxRate2Rule.forCorporateActionRate87,
						com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule.forCorporateActionRate87, com.tools20022.repository.constraints.ConstraintSecondLevelTax2Rule.forCorporateActionRate87);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionRate87";
				definition = "Specifies rates related to a corporate action option.";
				previousVersion_lazy = () -> CorporateActionRate80.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RateAndAmountFormat37Choice> getAdditionalTax() {
		return additionalTax == null ? Optional.empty() : Optional.of(additionalTax);
	}

	public CorporateActionRate87 setAdditionalTax(RateAndAmountFormat37Choice additionalTax) {
		this.additionalTax = additionalTax;
		return this;
	}

	public List<GrossDividendRateFormat27Choice> getGrossDividendRate() {
		return grossDividendRate == null ? grossDividendRate = new ArrayList<>() : grossDividendRate;
	}

	public CorporateActionRate87 setGrossDividendRate(List<GrossDividendRateFormat27Choice> grossDividendRate) {
		this.grossDividendRate = Objects.requireNonNull(grossDividendRate);
		return this;
	}

	public List<NetDividendRateFormat29Choice> getNetDividendRate() {
		return netDividendRate == null ? netDividendRate = new ArrayList<>() : netDividendRate;
	}

	public CorporateActionRate87 setNetDividendRate(List<NetDividendRateFormat29Choice> netDividendRate) {
		this.netDividendRate = Objects.requireNonNull(netDividendRate);
		return this;
	}

	public Optional<RateAndAmountFormat37Choice> getIndexFactor() {
		return indexFactor == null ? Optional.empty() : Optional.of(indexFactor);
	}

	public CorporateActionRate87 setIndexFactor(RateAndAmountFormat37Choice indexFactor) {
		this.indexFactor = indexFactor;
		return this;
	}

	public List<InterestRateUsedForPaymentFormat8Choice> getInterestRateUsedForPayment() {
		return interestRateUsedForPayment == null ? interestRateUsedForPayment = new ArrayList<>() : interestRateUsedForPayment;
	}

	public CorporateActionRate87 setInterestRateUsedForPayment(List<InterestRateUsedForPaymentFormat8Choice> interestRateUsedForPayment) {
		this.interestRateUsedForPayment = Objects.requireNonNull(interestRateUsedForPayment);
		return this;
	}

	public Optional<RateFormat3Choice> getMaximumAllowedOversubscriptionRate() {
		return maximumAllowedOversubscriptionRate == null ? Optional.empty() : Optional.of(maximumAllowedOversubscriptionRate);
	}

	public CorporateActionRate87 setMaximumAllowedOversubscriptionRate(RateFormat3Choice maximumAllowedOversubscriptionRate) {
		this.maximumAllowedOversubscriptionRate = maximumAllowedOversubscriptionRate;
		return this;
	}

	public Optional<RateFormat3Choice> getProrationRate() {
		return prorationRate == null ? Optional.empty() : Optional.of(prorationRate);
	}

	public CorporateActionRate87 setProrationRate(RateFormat3Choice prorationRate) {
		this.prorationRate = prorationRate;
		return this;
	}

	public List<RateAndAmountFormat41Choice> getWithholdingTaxRate() {
		return withholdingTaxRate == null ? withholdingTaxRate = new ArrayList<>() : withholdingTaxRate;
	}

	public CorporateActionRate87 setWithholdingTaxRate(List<RateAndAmountFormat41Choice> withholdingTaxRate) {
		this.withholdingTaxRate = Objects.requireNonNull(withholdingTaxRate);
		return this;
	}

	public List<RateAndAmountFormat41Choice> getSecondLevelTax() {
		return secondLevelTax == null ? secondLevelTax = new ArrayList<>() : secondLevelTax;
	}

	public CorporateActionRate87 setSecondLevelTax(List<RateAndAmountFormat41Choice> secondLevelTax) {
		this.secondLevelTax = Objects.requireNonNull(secondLevelTax);
		return this;
	}

	public List<RateTypeAndAmountAndStatus26> getTaxableIncomePerDividendShare() {
		return taxableIncomePerDividendShare == null ? taxableIncomePerDividendShare = new ArrayList<>() : taxableIncomePerDividendShare;
	}

	public CorporateActionRate87 setTaxableIncomePerDividendShare(List<com.tools20022.repository.msg.RateTypeAndAmountAndStatus26> taxableIncomePerDividendShare) {
		this.taxableIncomePerDividendShare = Objects.requireNonNull(taxableIncomePerDividendShare);
		return this;
	}

	public Optional<ForeignExchangeTerms19> getIssuerDeclaredExchangeRate() {
		return issuerDeclaredExchangeRate == null ? Optional.empty() : Optional.of(issuerDeclaredExchangeRate);
	}

	public CorporateActionRate87 setIssuerDeclaredExchangeRate(com.tools20022.repository.msg.ForeignExchangeTerms19 issuerDeclaredExchangeRate) {
		this.issuerDeclaredExchangeRate = issuerDeclaredExchangeRate;
		return this;
	}

	public Optional<RateAndAmountFormat37Choice> getTaxOnIncome() {
		return taxOnIncome == null ? Optional.empty() : Optional.of(taxOnIncome);
	}

	public CorporateActionRate87 setTaxOnIncome(RateAndAmountFormat37Choice taxOnIncome) {
		this.taxOnIncome = taxOnIncome;
		return this;
	}
}