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
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies security rate details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58#mmAdditionalQuantityForSubscribedResultantSecurities
 * CorporateActionRate58.mmAdditionalQuantityForSubscribedResultantSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58#mmAdditionalQuantityForExistingSecurities
 * CorporateActionRate58.mmAdditionalQuantityForExistingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58#mmNewToOld
 * CorporateActionRate58.mmNewToOld}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58#mmTransformationRate
 * CorporateActionRate58.mmTransformationRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58#mmChargesFees
 * CorporateActionRate58.mmChargesFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58#mmFiscalStamp
 * CorporateActionRate58.mmFiscalStamp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58#mmApplicableRate
 * CorporateActionRate58.mmApplicableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58#mmTaxCreditRate
 * CorporateActionRate58.mmTaxCreditRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58#mmFinancialTransactionTaxRate
 * CorporateActionRate58.mmFinancialTransactionTaxRate}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule#forCorporateActionRate58
 * ConstraintTaxCreditRate1Rule.forCorporateActionRate58}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxCreditRate2Rule#forCorporateActionRate58
 * ConstraintTaxCreditRate2Rule.forCorporateActionRate58}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionRate58"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies security rate details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionRate58", propOrder = {"additionalQuantityForSubscribedResultantSecurities", "additionalQuantityForExistingSecurities", "newToOld", "transformationRate", "chargesFees", "fiscalStamp", "applicableRate",
		"taxCreditRate", "financialTransactionTaxRate"})
public class CorporateActionRate58 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AddtlQtyForSbcbdRsltntScties")
	protected RatioFormat13Choice additionalQuantityForSubscribedResultantSecurities;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RatioFormat13Choice
	 * RatioFormat13Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmAdditionalQuantityForSubscribedResultantSecurities
	 * SecuritiesProceedsDefinition.
	 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58
	 * CorporateActionRate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlQtyForSbcbdRsltntScties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::ADSR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalQuantityForSubscribedResultantSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of additional intermediate securities/new equities awarded for a given quantity of securities derived from subscription."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalQuantityForSubscribedResultantSecurities = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmAdditionalQuantityForSubscribedResultantSecurities;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate58.mmObject();
			isDerived = false;
			xmlTag = "AddtlQtyForSbcbdRsltntScties";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::ADSR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalQuantityForSubscribedResultantSecurities";
			definition = "Quantity of additional intermediate securities/new equities awarded for a given quantity of securities derived from subscription.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RatioFormat13Choice.mmObject();
		}
	};
	@XmlElement(name = "AddtlQtyForExstgScties")
	protected RatioFormat13Choice additionalQuantityForExistingSecurities;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RatioFormat13Choice
	 * RatioFormat13Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmAdditionalQuantityForExistingSecurities
	 * SecuritiesProceedsDefinition.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58
	 * CorporateActionRate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlQtyForExstgScties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::ADEX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalQuantityForExistingSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of additional securities for a given quantity of underlying securities where underlying securities are not exchanged or debited, for example, 1 for 1: 1 new equity credited for every 1 underlying equity = 2 resulting equities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalQuantityForExistingSecurities = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmAdditionalQuantityForExistingSecurities;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate58.mmObject();
			isDerived = false;
			xmlTag = "AddtlQtyForExstgScties";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::ADEX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalQuantityForExistingSecurities";
			definition = "Quantity of additional securities for a given quantity of underlying securities where underlying securities are not exchanged or debited, for example, 1 for 1: 1 new equity credited for every 1 underlying equity = 2 resulting equities.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RatioFormat13Choice.mmObject();
		}
	};
	@XmlElement(name = "NewToOd")
	protected RatioFormat14Choice newToOld;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RatioFormat14Choice
	 * RatioFormat14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmNewToOld
	 * SecuritiesProceedsDefinition.mmNewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58
	 * CorporateActionRate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewToOd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::NEWO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewToOld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of new securities for a given quantity of underlying securities, where the underlying securities will be exchanged or debited, for example, 2 for 1: 2 new equities credited for every 1 underlying equity debited = 2 resulting equities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNewToOld = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmNewToOld;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate58.mmObject();
			isDerived = false;
			xmlTag = "NewToOd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::NEWO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewToOld";
			definition = "Quantity of new securities for a given quantity of underlying securities, where the underlying securities will be exchanged or debited, for example, 2 for 1: 2 new equities credited for every 1 underlying equity debited = 2 resulting equities.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RatioFormat14Choice.mmObject();
		}
	};
	@XmlElement(name = "TrfrmatnRate")
	protected PercentageRate transformationRate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmTransformationRate
	 * BiddingConditions.mmTransformationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58
	 * CorporateActionRate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfrmatnRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransformationRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate used to determine the cash consideration split across outturn settlement transactions that are the result of a transformation of the parent transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransformationRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmTransformationRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate58.mmObject();
			isDerived = false;
			xmlTag = "TrfrmatnRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransformationRate";
			definition = "Rate used to determine the cash consideration split across outturn settlement transactions that are the result of a transformation of the parent transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "ChrgsFees")
	protected RateAndAmountFormat16Choice chargesFees;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat16Choice
	 * RateAndAmountFormat16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionCharge
	 * CorporateActionEvent.mmCorporateActionCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58
	 * CorporateActionRate58}</li>
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
	public static final MMMessageAttribute mmChargesFees = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionCharge;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate58.mmObject();
			isDerived = false;
			xmlTag = "ChrgsFees";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesFees";
			definition = "Rate used to calculate the amount of the charges/fees that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat16Choice.mmObject();
		}
	};
	@XmlElement(name = "FsclStmp")
	protected RateFormat3Choice fiscalStamp;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat3Choice
	 * RateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58
	 * CorporateActionRate58}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate58.mmObject();
			isDerived = false;
			xmlTag = "FsclStmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiscalStamp";
			definition = "Percentage of fiscal tax to apply.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat3Choice.mmObject();
		}
	};
	@XmlElement(name = "AplblRate")
	protected RateFormat3Choice applicableRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat3Choice
	 * RateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmApplicableRate
	 * BiddingConditions.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58
	 * CorporateActionRate58}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate58.mmObject();
			isDerived = false;
			xmlTag = "AplblRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicableRate";
			definition = "Rate applicable to the event announced, for example, redemption rate for a redemption event.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat3Choice.mmObject();
		}
	};
	@XmlElement(name = "TaxCdtRate")
	protected List<TaxCreditRateFormat6Choice> taxCreditRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat6Choice
	 * TaxCreditRateFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmCreditRate
	 * TaxVoucher.mmCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58
	 * CorporateActionRate58}</li>
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
	public static final MMMessageAttribute mmTaxCreditRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmCreditRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate58.mmObject();
			isDerived = false;
			xmlTag = "TaxCdtRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate";
			definition = "Amount of money per equity allocated as the result of a tax credit.";
			minOccurs = 0;
			complexType_lazy = () -> TaxCreditRateFormat6Choice.mmObject();
		}
	};
	@XmlElement(name = "FinTxTaxRate")
	protected RateFormat3Choice financialTransactionTaxRate;
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTransactionTax
	 * CorporateActionEvent.mmTransactionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58
	 * CorporateActionRate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinTxTaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialTransactionTaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate of financial transaction tax."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialTransactionTaxRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmTransactionTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate58.mmObject();
			isDerived = false;
			xmlTag = "FinTxTaxRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialTransactionTaxRate";
			definition = "Rate of financial transaction tax.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat3Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate58.mmAdditionalQuantityForSubscribedResultantSecurities,
						com.tools20022.repository.msg.CorporateActionRate58.mmAdditionalQuantityForExistingSecurities, com.tools20022.repository.msg.CorporateActionRate58.mmNewToOld,
						com.tools20022.repository.msg.CorporateActionRate58.mmTransformationRate, com.tools20022.repository.msg.CorporateActionRate58.mmChargesFees, com.tools20022.repository.msg.CorporateActionRate58.mmFiscalStamp,
						com.tools20022.repository.msg.CorporateActionRate58.mmApplicableRate, com.tools20022.repository.msg.CorporateActionRate58.mmTaxCreditRate,
						com.tools20022.repository.msg.CorporateActionRate58.mmFinancialTransactionTaxRate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule.forCorporateActionRate58, com.tools20022.repository.constraints.ConstraintTaxCreditRate2Rule.forCorporateActionRate58);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionRate58";
				definition = "Specifies security rate details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RatioFormat13Choice> getAdditionalQuantityForSubscribedResultantSecurities() {
		return additionalQuantityForSubscribedResultantSecurities == null ? Optional.empty() : Optional.of(additionalQuantityForSubscribedResultantSecurities);
	}

	public CorporateActionRate58 setAdditionalQuantityForSubscribedResultantSecurities(RatioFormat13Choice additionalQuantityForSubscribedResultantSecurities) {
		this.additionalQuantityForSubscribedResultantSecurities = additionalQuantityForSubscribedResultantSecurities;
		return this;
	}

	public Optional<RatioFormat13Choice> getAdditionalQuantityForExistingSecurities() {
		return additionalQuantityForExistingSecurities == null ? Optional.empty() : Optional.of(additionalQuantityForExistingSecurities);
	}

	public CorporateActionRate58 setAdditionalQuantityForExistingSecurities(RatioFormat13Choice additionalQuantityForExistingSecurities) {
		this.additionalQuantityForExistingSecurities = additionalQuantityForExistingSecurities;
		return this;
	}

	public Optional<RatioFormat14Choice> getNewToOld() {
		return newToOld == null ? Optional.empty() : Optional.of(newToOld);
	}

	public CorporateActionRate58 setNewToOld(RatioFormat14Choice newToOld) {
		this.newToOld = newToOld;
		return this;
	}

	public Optional<PercentageRate> getTransformationRate() {
		return transformationRate == null ? Optional.empty() : Optional.of(transformationRate);
	}

	public CorporateActionRate58 setTransformationRate(PercentageRate transformationRate) {
		this.transformationRate = transformationRate;
		return this;
	}

	public Optional<RateAndAmountFormat16Choice> getChargesFees() {
		return chargesFees == null ? Optional.empty() : Optional.of(chargesFees);
	}

	public CorporateActionRate58 setChargesFees(RateAndAmountFormat16Choice chargesFees) {
		this.chargesFees = chargesFees;
		return this;
	}

	public Optional<RateFormat3Choice> getFiscalStamp() {
		return fiscalStamp == null ? Optional.empty() : Optional.of(fiscalStamp);
	}

	public CorporateActionRate58 setFiscalStamp(RateFormat3Choice fiscalStamp) {
		this.fiscalStamp = fiscalStamp;
		return this;
	}

	public Optional<RateFormat3Choice> getApplicableRate() {
		return applicableRate == null ? Optional.empty() : Optional.of(applicableRate);
	}

	public CorporateActionRate58 setApplicableRate(RateFormat3Choice applicableRate) {
		this.applicableRate = applicableRate;
		return this;
	}

	public List<TaxCreditRateFormat6Choice> getTaxCreditRate() {
		return taxCreditRate == null ? taxCreditRate = new ArrayList<>() : taxCreditRate;
	}

	public CorporateActionRate58 setTaxCreditRate(List<TaxCreditRateFormat6Choice> taxCreditRate) {
		this.taxCreditRate = Objects.requireNonNull(taxCreditRate);
		return this;
	}

	public Optional<RateFormat3Choice> getFinancialTransactionTaxRate() {
		return financialTransactionTaxRate == null ? Optional.empty() : Optional.of(financialTransactionTaxRate);
	}

	public CorporateActionRate58 setFinancialTransactionTaxRate(RateFormat3Choice financialTransactionTaxRate) {
		this.financialTransactionTaxRate = financialTransactionTaxRate;
		return this;
	}
}