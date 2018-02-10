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
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmAdditionalTax
 * CorporateActionRate5.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmChargesFees
 * CorporateActionRate5.mmChargesFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmFinalDividendRate
 * CorporateActionRate5.mmFinalDividendRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmFiscalStamp
 * CorporateActionRate5.mmFiscalStamp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmFullyFrankedRate
 * CorporateActionRate5.mmFullyFrankedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmGrossDividendRate
 * CorporateActionRate5.mmGrossDividendRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmCashIncentiveRate
 * CorporateActionRate5.mmCashIncentiveRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmIndexFactor
 * CorporateActionRate5.mmIndexFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmInterestRateUsedForPayment
 * CorporateActionRate5.mmInterestRateUsedForPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmNetDividendRate
 * CorporateActionRate5.mmNetDividendRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmNonResidentRate
 * CorporateActionRate5.mmNonResidentRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmMaximumAllowedOversubscriptionRate
 * CorporateActionRate5.mmMaximumAllowedOversubscriptionRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmProvisionalDividendRate
 * CorporateActionRate5.mmProvisionalDividendRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmTaxCreditRate
 * CorporateActionRate5.mmTaxCreditRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmProrationRate
 * CorporateActionRate5.mmProrationRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmSolicitationFeeRate
 * CorporateActionRate5.mmSolicitationFeeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmEarlySolicitationFeeRate
 * CorporateActionRate5.mmEarlySolicitationFeeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmWithholdingTaxRate
 * CorporateActionRate5.mmWithholdingTaxRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmTaxOnIncome
 * CorporateActionRate5.mmTaxOnIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmTaxOnProfits
 * CorporateActionRate5.mmTaxOnProfits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmTaxReclaimRate
 * CorporateActionRate5.mmTaxReclaimRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmWithholdingOfForeignTax
 * CorporateActionRate5.mmWithholdingOfForeignTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmWithholdingOfLocalTax
 * CorporateActionRate5.mmWithholdingOfLocalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmTaxRelatedRate
 * CorporateActionRate5.mmTaxRelatedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmApplicableRate
 * CorporateActionRate5.mmApplicableRate}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate1Rule#forCorporateActionRate5
 * ConstraintGrossDividendRate1Rule.forCorporateActionRate5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxCreditRateRule#forCorporateActionRate5
 * ConstraintTaxCreditRateRule.forCorporateActionRate5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate2Rule#forCorporateActionRate5
 * ConstraintGrossDividendRate2Rule.forCorporateActionRate5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRateRule#forCorporateActionRate5
 * ConstraintNetDividendRateRule.forCorporateActionRate5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxRelatedRateRule#forCorporateActionRate5
 * ConstraintTaxRelatedRateRule.forCorporateActionRate5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionRate5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies rates related to a corporate action option."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionRate5", propOrder = {"additionalTax", "chargesFees", "finalDividendRate", "fiscalStamp", "fullyFrankedRate", "grossDividendRate", "cashIncentiveRate", "indexFactor", "interestRateUsedForPayment",
		"netDividendRate", "nonResidentRate", "maximumAllowedOversubscriptionRate", "provisionalDividendRate", "taxCreditRate", "prorationRate", "solicitationFeeRate", "earlySolicitationFeeRate", "withholdingTaxRate", "taxOnIncome",
		"taxOnProfits", "taxReclaimRate", "withholdingOfForeignTax", "withholdingOfLocalTax", "taxRelatedRate", "applicableRate"})
public class CorporateActionRate5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AddtlTax")
	protected RateAndAmountFormat3Choice additionalTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat3Choice
	 * RateAndAmountFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalTax = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Tax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate5.mmObject();
			isDerived = false;
			xmlTag = "AddtlTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::ATAX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTax";
			definition = "Rate used for additional tax that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat3Choice.mmObject();
		}
	};
	@XmlElement(name = "ChrgsFees")
	protected RateAndAmountFormat3Choice chargesFees;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat3Choice
	 * RateAndAmountFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionCharge
	 * CorporateActionEvent.mmCorporateActionCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::CHAR</li>
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
	public static final MMMessageAttribute mmChargesFees = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionCharge;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate5.mmObject();
			isDerived = false;
			xmlTag = "ChrgsFees";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::CHAR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesFees";
			definition = "Rate used to calculate the amount of the charges/fees that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat3Choice.mmObject();
		}
	};
	@XmlElement(name = "FnlDvddRate")
	protected RateAndAmountFormat4Choice finalDividendRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat4Choice
	 * RateAndAmountFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmFinalDividend
	 * Dividend.mmFinalDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FnlDvddRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::FDIV</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate5.mmObject();
			isDerived = false;
			xmlTag = "FnlDvddRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::FDIV"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalDividendRate";
			definition = "Dividend is final.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat4Choice.mmObject();
		}
	};
	@XmlElement(name = "FsclStmp")
	protected RateFormat2Choice fiscalStamp;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat2Choice
	 * RateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FsclStmp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::FISC</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate5.mmObject();
			isDerived = false;
			xmlTag = "FsclStmp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::FISC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiscalStamp";
			definition = "Percentage of fiscal tax to apply.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "FullyFrnkdRate")
	protected RateAndAmountFormat3Choice fullyFrankedRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat3Choice
	 * RateAndAmountFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmFullyFrankedRateAndAmount
	 * Dividend.mmFullyFrankedRateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FullyFrnkdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::FLFR</li>
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
	public static final MMMessageAttribute mmFullyFrankedRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmFullyFrankedRateAndAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate5.mmObject();
			isDerived = false;
			xmlTag = "FullyFrnkdRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::FLFR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyFrankedRate";
			definition = "Rate resulting from a fully franked dividend paid by a company; rate includes tax credit for companies that have made sufficient tax payments during fiscal period.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat3Choice.mmObject();
		}
	};
	@XmlElement(name = "GrssDvddRate")
	protected List<GrossDividendRateFormat1Choice> grossDividendRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat1Choice
	 * GrossDividendRateFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmGrossDividend
	 * Dividend.mmGrossDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmGrossDividendRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmGrossDividend;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate5.mmObject();
			isDerived = false;
			xmlTag = "GrssDvddRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::GRSS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate";
			definition = "Cash dividend amount per equity before deductions or allowances have been made.";
			minOccurs = 0;
			complexType_lazy = () -> GrossDividendRateFormat1Choice.mmObject();
		}
	};
	@XmlElement(name = "CshIncntivRate")
	protected RateFormat2Choice cashIncentiveRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat2Choice
	 * RateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmCashIncentiveRate
	 * CashProceedsDefinition.mmCashIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshIncntivRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::INCE</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate5.mmObject();
			isDerived = false;
			xmlTag = "CshIncntivRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::INCE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashIncentiveRate";
			definition = "Rate of the cash premium made available if the securities holder consents or participates to an event, for example, consent fees.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "IndxFctr")
	protected RateAndAmountFormat3Choice indexFactor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat3Choice
	 * RateAndAmountFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Index#mmIndexFactor
	 * Index.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmIndexFactor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Index.mmIndexFactor;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate5.mmObject();
			isDerived = false;
			xmlTag = "IndxFctr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::INDX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexFactor";
			definition = "Public index rate applied to the amount paid to adjust it to inflation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat3Choice.mmObject();
		}
	};
	@XmlElement(name = "IntrstRateUsdForPmt")
	protected List<InterestRateUsedForPaymentFormat1Choice> interestRateUsedForPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat1Choice
	 * InterestRateUsedForPaymentFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestRateUsedForPayment = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate5.mmObject();
			isDerived = false;
			xmlTag = "IntrstRateUsdForPmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::INTP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRateUsedForPayment";
			definition = "The actual interest rate used for the payment of the interest for the specified interest period. \nUsage guideline: It is used to provide the applicable rate for the current payment, after all calculations have been performed, that is, application of period and method of interest computation.";
			minOccurs = 0;
			complexType_lazy = () -> InterestRateUsedForPaymentFormat1Choice.mmObject();
		}
	};
	@XmlElement(name = "NetDvddRate")
	protected List<NetDividendRateFormat1Choice> netDividendRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat1Choice
	 * NetDividendRateFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmNetDividend
	 * Dividend.mmNetDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetDvddRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::NETT</li>
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
	public static final MMMessageAttribute mmNetDividendRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmNetDividend;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate5.mmObject();
			isDerived = false;
			xmlTag = "NetDvddRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::NETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate";
			definition = "Cash dividend amount per equity after deductions or allowances have been made.";
			minOccurs = 0;
			complexType_lazy = () -> NetDividendRateFormat1Choice.mmObject();
		}
	};
	@XmlElement(name = "NonResdtRate")
	protected RateAndAmountFormat3Choice nonResidentRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat3Choice
	 * RateAndAmountFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonResdtRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::NRES</li>
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
	public static final MMMessageAttribute mmNonResidentRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate5.mmObject();
			isDerived = false;
			xmlTag = "NonResdtRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::NRES"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonResidentRate";
			definition = "Rate per share to which a non-resident is entitled.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat3Choice.mmObject();
		}
	};
	@XmlElement(name = "MaxAllwdOvrsbcptRate")
	protected RateFormat2Choice maximumAllowedOversubscriptionRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat2Choice
	 * RateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumAllowedOverSubscription
	 * BiddingConditions.mmMaximumAllowedOverSubscription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumAllowedOversubscriptionRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmMaximumAllowedOverSubscription;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate5.mmObject();
			isDerived = false;
			xmlTag = "MaxAllwdOvrsbcptRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::OVEP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAllowedOversubscriptionRate";
			definition = "Maximum percentage of shares available through the over subscription privilege, usually a percentage of the basic subscription shares, for example, an account owner subscribing to 100 shares may over subscribe to a maximum of 50 additional shares when the over subscription maximum is 50 percent.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "PrvsnlDvddRate")
	protected RateAndAmountFormat4Choice provisionalDividendRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat4Choice
	 * RateAndAmountFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmProvisionalDividend
	 * Dividend.mmProvisionalDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsnlDvddRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::PDIV</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate5.mmObject();
			isDerived = false;
			xmlTag = "PrvsnlDvddRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::PDIV"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProvisionalDividendRate";
			definition = "Dividend is provisional.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat4Choice.mmObject();
		}
	};
	@XmlElement(name = "TaxCdtRate")
	protected List<TaxCreditRateFormat1Choice> taxCreditRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat1Choice
	 * TaxCreditRateFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmCreditRate
	 * TaxVoucher.mmCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxCdtRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::TAXC</li>
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
	public static final MMMessageAttribute mmTaxCreditRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmCreditRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate5.mmObject();
			isDerived = false;
			xmlTag = "TaxCdtRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::TAXC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate";
			definition = "Amount of money per equity allocated as the result of a tax credit.";
			minOccurs = 0;
			complexType_lazy = () -> TaxCreditRateFormat1Choice.mmObject();
		}
	};
	@XmlElement(name = "PrratnRate")
	protected RateFormat2Choice prorationRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat2Choice
	 * RateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmProrationRate
	 * BiddingConditions.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
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
	 * definition} = "Proportionate allocation used for the offer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProrationRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmProrationRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate5.mmObject();
			isDerived = false;
			xmlTag = "PrratnRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::PROR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProrationRate";
			definition = "Proportionate allocation used for the offer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "SlctnFeeRate")
	protected SolicitationFeeRateFormat1Choice solicitationFeeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat1Choice
	 * SolicitationFeeRateFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmSolicitationFee
	 * CorporateActionFeesAndCharges.mmSolicitationFee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SlctnFeeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::SOFE</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate5.mmObject();
			isDerived = false;
			xmlTag = "SlctnFeeRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::SOFE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationFeeRate";
			definition = "Cash rate made available in an offer in order to encourage participation in the offer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SolicitationFeeRateFormat1Choice.mmObject();
		}
	};
	@XmlElement(name = "EarlySlctnFeeRate")
	protected SolicitationFeeRateFormat1Choice earlySolicitationFeeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat1Choice
	 * SolicitationFeeRateFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmEarlySolicitationFeeRate
	 * CorporateActionFeesAndCharges.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlySlctnFeeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::ESOF</li>
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
	public static final MMMessageAttribute mmEarlySolicitationFeeRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionFeesAndCharges.mmEarlySolicitationFeeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate5.mmObject();
			isDerived = false;
			xmlTag = "EarlySlctnFeeRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::ESOF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlySolicitationFeeRate";
			definition = "Cash rate made available, as an incentive, in addition to the solicitation fee, in order to encourage early participation in an offer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SolicitationFeeRateFormat1Choice.mmObject();
		}
	};
	@XmlElement(name = "WhldgTaxRate")
	protected RateFormat2Choice withholdingTaxRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat2Choice
	 * RateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
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
	 * "Percentage of a cash distribution that will be withheld by a tax authority."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWithholdingTaxRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate5.mmObject();
			isDerived = false;
			xmlTag = "WhldgTaxRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::TAXR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxRate";
			definition = "Percentage of a cash distribution that will be withheld by a tax authority.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "TaxOnIncm")
	protected RateFormat2Choice taxOnIncome;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat2Choice
	 * RateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxOnIncm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::TXIN</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate5.mmObject();
			isDerived = false;
			xmlTag = "TaxOnIncm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::TXIN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxOnIncome";
			definition = "Taxation applied on an amount clearly identified as an income.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "TaxOnPrfts")
	protected RateFormat2Choice taxOnProfits;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat2Choice
	 * RateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxOnPrfts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::TXPR</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate5.mmObject();
			isDerived = false;
			xmlTag = "TaxOnPrfts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::TXPR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxOnProfits";
			definition = "Taxation applied on an amount clearly identified as capital profits, capital gains.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "TaxRclmRate")
	protected RateFormat2Choice taxReclaimRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat2Choice
	 * RateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRclmRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::TXRC</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate5.mmObject();
			isDerived = false;
			xmlTag = "TaxRclmRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::TXRC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReclaimRate";
			definition = "Percentage of cash that was paid in excess of actual tax obligation and was reclaimed.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "WhldgOfFrgnTax")
	protected RateAndAmountFormat3Choice withholdingOfForeignTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat3Choice
	 * RateAndAmountFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRelatedSecurityTax
	 * TaxVoucher.mmRelatedSecurityTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhldgOfFrgnTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::WITF</li>
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
	public static final MMMessageAttribute mmWithholdingOfForeignTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmRelatedSecurityTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate5.mmObject();
			isDerived = false;
			xmlTag = "WhldgOfFrgnTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::WITF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingOfForeignTax";
			definition = "Rate at which the income will be withheld by the jurisdiction in which the income was originally paid, for which relief at source and/or reclaim may be possible.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat3Choice.mmObject();
		}
	};
	@XmlElement(name = "WhldgOfLclTax")
	protected RateAndAmountFormat3Choice withholdingOfLocalTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat3Choice
	 * RateAndAmountFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRelatedSecurityTax
	 * TaxVoucher.mmRelatedSecurityTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhldgOfLclTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::WITL</li>
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
	public static final MMMessageAttribute mmWithholdingOfLocalTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmRelatedSecurityTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate5.mmObject();
			isDerived = false;
			xmlTag = "WhldgOfLclTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::WITL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingOfLocalTax";
			definition = "Rate at which the income will be withheld by the jurisdiction in which the account owner is located, for which relief at source and/or reclaim may be possible.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat3Choice.mmObject();
		}
	};
	@XmlElement(name = "TaxRltdRate")
	protected List<com.tools20022.repository.msg.RateTypeAndAmountAndStatus6> taxRelatedRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus6
	 * RateTypeAndAmountAndStatus6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRltdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::TAXE</li>
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
	public static final MMMessageAttribute mmTaxRelatedRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate5.mmObject();
			isDerived = false;
			xmlTag = "TaxRltdRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::TAXE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRate";
			definition = "Percentage of the gross dividend rate on which tax must be paid .";
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.RateTypeAndAmountAndStatus6.mmObject();
		}
	};
	@XmlElement(name = "AplblRate")
	protected RateFormat2Choice applicableRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat2Choice
	 * RateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmApplicableRate
	 * BiddingConditions.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AplblRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::RATE</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate5.mmObject();
			isDerived = false;
			xmlTag = "AplblRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::RATE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicableRate";
			definition = "Rate applicable to the event announced, for example, redemption rate for a redemption event.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat2Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate5.mmAdditionalTax, com.tools20022.repository.msg.CorporateActionRate5.mmChargesFees,
						com.tools20022.repository.msg.CorporateActionRate5.mmFinalDividendRate, com.tools20022.repository.msg.CorporateActionRate5.mmFiscalStamp, com.tools20022.repository.msg.CorporateActionRate5.mmFullyFrankedRate,
						com.tools20022.repository.msg.CorporateActionRate5.mmGrossDividendRate, com.tools20022.repository.msg.CorporateActionRate5.mmCashIncentiveRate, com.tools20022.repository.msg.CorporateActionRate5.mmIndexFactor,
						com.tools20022.repository.msg.CorporateActionRate5.mmInterestRateUsedForPayment, com.tools20022.repository.msg.CorporateActionRate5.mmNetDividendRate,
						com.tools20022.repository.msg.CorporateActionRate5.mmNonResidentRate, com.tools20022.repository.msg.CorporateActionRate5.mmMaximumAllowedOversubscriptionRate,
						com.tools20022.repository.msg.CorporateActionRate5.mmProvisionalDividendRate, com.tools20022.repository.msg.CorporateActionRate5.mmTaxCreditRate, com.tools20022.repository.msg.CorporateActionRate5.mmProrationRate,
						com.tools20022.repository.msg.CorporateActionRate5.mmSolicitationFeeRate, com.tools20022.repository.msg.CorporateActionRate5.mmEarlySolicitationFeeRate,
						com.tools20022.repository.msg.CorporateActionRate5.mmWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate5.mmTaxOnIncome, com.tools20022.repository.msg.CorporateActionRate5.mmTaxOnProfits,
						com.tools20022.repository.msg.CorporateActionRate5.mmTaxReclaimRate, com.tools20022.repository.msg.CorporateActionRate5.mmWithholdingOfForeignTax,
						com.tools20022.repository.msg.CorporateActionRate5.mmWithholdingOfLocalTax, com.tools20022.repository.msg.CorporateActionRate5.mmTaxRelatedRate, com.tools20022.repository.msg.CorporateActionRate5.mmApplicableRate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate1Rule.forCorporateActionRate5,
						com.tools20022.repository.constraints.ConstraintTaxCreditRateRule.forCorporateActionRate5, com.tools20022.repository.constraints.ConstraintGrossDividendRate2Rule.forCorporateActionRate5,
						com.tools20022.repository.constraints.ConstraintNetDividendRateRule.forCorporateActionRate5, com.tools20022.repository.constraints.ConstraintTaxRelatedRateRule.forCorporateActionRate5);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionRate5";
				definition = "Specifies rates related to a corporate action option.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RateAndAmountFormat3Choice> getAdditionalTax() {
		return additionalTax == null ? Optional.empty() : Optional.of(additionalTax);
	}

	public CorporateActionRate5 setAdditionalTax(RateAndAmountFormat3Choice additionalTax) {
		this.additionalTax = additionalTax;
		return this;
	}

	public Optional<RateAndAmountFormat3Choice> getChargesFees() {
		return chargesFees == null ? Optional.empty() : Optional.of(chargesFees);
	}

	public CorporateActionRate5 setChargesFees(RateAndAmountFormat3Choice chargesFees) {
		this.chargesFees = chargesFees;
		return this;
	}

	public Optional<RateAndAmountFormat4Choice> getFinalDividendRate() {
		return finalDividendRate == null ? Optional.empty() : Optional.of(finalDividendRate);
	}

	public CorporateActionRate5 setFinalDividendRate(RateAndAmountFormat4Choice finalDividendRate) {
		this.finalDividendRate = finalDividendRate;
		return this;
	}

	public Optional<RateFormat2Choice> getFiscalStamp() {
		return fiscalStamp == null ? Optional.empty() : Optional.of(fiscalStamp);
	}

	public CorporateActionRate5 setFiscalStamp(RateFormat2Choice fiscalStamp) {
		this.fiscalStamp = fiscalStamp;
		return this;
	}

	public Optional<RateAndAmountFormat3Choice> getFullyFrankedRate() {
		return fullyFrankedRate == null ? Optional.empty() : Optional.of(fullyFrankedRate);
	}

	public CorporateActionRate5 setFullyFrankedRate(RateAndAmountFormat3Choice fullyFrankedRate) {
		this.fullyFrankedRate = fullyFrankedRate;
		return this;
	}

	public List<GrossDividendRateFormat1Choice> getGrossDividendRate() {
		return grossDividendRate == null ? grossDividendRate = new ArrayList<>() : grossDividendRate;
	}

	public CorporateActionRate5 setGrossDividendRate(List<GrossDividendRateFormat1Choice> grossDividendRate) {
		this.grossDividendRate = Objects.requireNonNull(grossDividendRate);
		return this;
	}

	public Optional<RateFormat2Choice> getCashIncentiveRate() {
		return cashIncentiveRate == null ? Optional.empty() : Optional.of(cashIncentiveRate);
	}

	public CorporateActionRate5 setCashIncentiveRate(RateFormat2Choice cashIncentiveRate) {
		this.cashIncentiveRate = cashIncentiveRate;
		return this;
	}

	public Optional<RateAndAmountFormat3Choice> getIndexFactor() {
		return indexFactor == null ? Optional.empty() : Optional.of(indexFactor);
	}

	public CorporateActionRate5 setIndexFactor(RateAndAmountFormat3Choice indexFactor) {
		this.indexFactor = indexFactor;
		return this;
	}

	public List<InterestRateUsedForPaymentFormat1Choice> getInterestRateUsedForPayment() {
		return interestRateUsedForPayment == null ? interestRateUsedForPayment = new ArrayList<>() : interestRateUsedForPayment;
	}

	public CorporateActionRate5 setInterestRateUsedForPayment(List<InterestRateUsedForPaymentFormat1Choice> interestRateUsedForPayment) {
		this.interestRateUsedForPayment = Objects.requireNonNull(interestRateUsedForPayment);
		return this;
	}

	public List<NetDividendRateFormat1Choice> getNetDividendRate() {
		return netDividendRate == null ? netDividendRate = new ArrayList<>() : netDividendRate;
	}

	public CorporateActionRate5 setNetDividendRate(List<NetDividendRateFormat1Choice> netDividendRate) {
		this.netDividendRate = Objects.requireNonNull(netDividendRate);
		return this;
	}

	public Optional<RateAndAmountFormat3Choice> getNonResidentRate() {
		return nonResidentRate == null ? Optional.empty() : Optional.of(nonResidentRate);
	}

	public CorporateActionRate5 setNonResidentRate(RateAndAmountFormat3Choice nonResidentRate) {
		this.nonResidentRate = nonResidentRate;
		return this;
	}

	public Optional<RateFormat2Choice> getMaximumAllowedOversubscriptionRate() {
		return maximumAllowedOversubscriptionRate == null ? Optional.empty() : Optional.of(maximumAllowedOversubscriptionRate);
	}

	public CorporateActionRate5 setMaximumAllowedOversubscriptionRate(RateFormat2Choice maximumAllowedOversubscriptionRate) {
		this.maximumAllowedOversubscriptionRate = maximumAllowedOversubscriptionRate;
		return this;
	}

	public Optional<RateAndAmountFormat4Choice> getProvisionalDividendRate() {
		return provisionalDividendRate == null ? Optional.empty() : Optional.of(provisionalDividendRate);
	}

	public CorporateActionRate5 setProvisionalDividendRate(RateAndAmountFormat4Choice provisionalDividendRate) {
		this.provisionalDividendRate = provisionalDividendRate;
		return this;
	}

	public List<TaxCreditRateFormat1Choice> getTaxCreditRate() {
		return taxCreditRate == null ? taxCreditRate = new ArrayList<>() : taxCreditRate;
	}

	public CorporateActionRate5 setTaxCreditRate(List<TaxCreditRateFormat1Choice> taxCreditRate) {
		this.taxCreditRate = Objects.requireNonNull(taxCreditRate);
		return this;
	}

	public Optional<RateFormat2Choice> getProrationRate() {
		return prorationRate == null ? Optional.empty() : Optional.of(prorationRate);
	}

	public CorporateActionRate5 setProrationRate(RateFormat2Choice prorationRate) {
		this.prorationRate = prorationRate;
		return this;
	}

	public Optional<SolicitationFeeRateFormat1Choice> getSolicitationFeeRate() {
		return solicitationFeeRate == null ? Optional.empty() : Optional.of(solicitationFeeRate);
	}

	public CorporateActionRate5 setSolicitationFeeRate(SolicitationFeeRateFormat1Choice solicitationFeeRate) {
		this.solicitationFeeRate = solicitationFeeRate;
		return this;
	}

	public Optional<SolicitationFeeRateFormat1Choice> getEarlySolicitationFeeRate() {
		return earlySolicitationFeeRate == null ? Optional.empty() : Optional.of(earlySolicitationFeeRate);
	}

	public CorporateActionRate5 setEarlySolicitationFeeRate(SolicitationFeeRateFormat1Choice earlySolicitationFeeRate) {
		this.earlySolicitationFeeRate = earlySolicitationFeeRate;
		return this;
	}

	public Optional<RateFormat2Choice> getWithholdingTaxRate() {
		return withholdingTaxRate == null ? Optional.empty() : Optional.of(withholdingTaxRate);
	}

	public CorporateActionRate5 setWithholdingTaxRate(RateFormat2Choice withholdingTaxRate) {
		this.withholdingTaxRate = withholdingTaxRate;
		return this;
	}

	public Optional<RateFormat2Choice> getTaxOnIncome() {
		return taxOnIncome == null ? Optional.empty() : Optional.of(taxOnIncome);
	}

	public CorporateActionRate5 setTaxOnIncome(RateFormat2Choice taxOnIncome) {
		this.taxOnIncome = taxOnIncome;
		return this;
	}

	public Optional<RateFormat2Choice> getTaxOnProfits() {
		return taxOnProfits == null ? Optional.empty() : Optional.of(taxOnProfits);
	}

	public CorporateActionRate5 setTaxOnProfits(RateFormat2Choice taxOnProfits) {
		this.taxOnProfits = taxOnProfits;
		return this;
	}

	public Optional<RateFormat2Choice> getTaxReclaimRate() {
		return taxReclaimRate == null ? Optional.empty() : Optional.of(taxReclaimRate);
	}

	public CorporateActionRate5 setTaxReclaimRate(RateFormat2Choice taxReclaimRate) {
		this.taxReclaimRate = taxReclaimRate;
		return this;
	}

	public Optional<RateAndAmountFormat3Choice> getWithholdingOfForeignTax() {
		return withholdingOfForeignTax == null ? Optional.empty() : Optional.of(withholdingOfForeignTax);
	}

	public CorporateActionRate5 setWithholdingOfForeignTax(RateAndAmountFormat3Choice withholdingOfForeignTax) {
		this.withholdingOfForeignTax = withholdingOfForeignTax;
		return this;
	}

	public Optional<RateAndAmountFormat3Choice> getWithholdingOfLocalTax() {
		return withholdingOfLocalTax == null ? Optional.empty() : Optional.of(withholdingOfLocalTax);
	}

	public CorporateActionRate5 setWithholdingOfLocalTax(RateAndAmountFormat3Choice withholdingOfLocalTax) {
		this.withholdingOfLocalTax = withholdingOfLocalTax;
		return this;
	}

	public List<RateTypeAndAmountAndStatus6> getTaxRelatedRate() {
		return taxRelatedRate == null ? taxRelatedRate = new ArrayList<>() : taxRelatedRate;
	}

	public CorporateActionRate5 setTaxRelatedRate(List<com.tools20022.repository.msg.RateTypeAndAmountAndStatus6> taxRelatedRate) {
		this.taxRelatedRate = Objects.requireNonNull(taxRelatedRate);
		return this;
	}

	public Optional<RateFormat2Choice> getApplicableRate() {
		return applicableRate == null ? Optional.empty() : Optional.of(applicableRate);
	}

	public CorporateActionRate5 setApplicableRate(RateFormat2Choice applicableRate) {
		this.applicableRate = applicableRate;
		return this;
	}
}