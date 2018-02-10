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
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.codeset.IssuerTaxability1Code;
import com.tools20022.repository.codeset.NewSecuritiesIssuanceType1Code;
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
 * Provides information about the corporate action security option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#mmSecurityDetails
 * SecuritiesOption33.mmSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#mmCreditDebitIndicator
 * SecuritiesOption33.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#mmTemporaryFinancialInstrumentIndicator
 * SecuritiesOption33.mmTemporaryFinancialInstrumentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#mmNonEligibleProceedsIndicator
 * SecuritiesOption33.mmNonEligibleProceedsIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#mmIssuerOfferorTaxabilityIndicator
 * SecuritiesOption33.mmIssuerOfferorTaxabilityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#mmNewSecuritiesIssuanceIndicator
 * SecuritiesOption33.mmNewSecuritiesIssuanceIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#mmEntitledQuantity
 * SecuritiesOption33.mmEntitledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#mmFractionDisposition
 * SecuritiesOption33.mmFractionDisposition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#mmCurrencyOption
 * SecuritiesOption33.mmCurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#mmTradingPeriod
 * SecuritiesOption33.mmTradingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#mmDateDetails
 * SecuritiesOption33.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#mmRateDetails
 * SecuritiesOption33.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#mmPriceDetails
 * SecuritiesOption33.mmPriceDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionOption
 * CorporateActionOption}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forSecuritiesOption33
 * ConstraintCoexistenceQuantityRule.forSecuritiesOption33}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forSecuritiesOption33
 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption33}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesOption33"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about the corporate action security option."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption38
 * SecuritiesOption38}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24
 * SecuritiesOption24}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesOption33", propOrder = {"securityDetails", "creditDebitIndicator", "temporaryFinancialInstrumentIndicator", "nonEligibleProceedsIndicator", "issuerOfferorTaxabilityIndicator", "newSecuritiesIssuanceIndicator",
		"entitledQuantity", "fractionDisposition", "currencyOption", "tradingPeriod", "dateDetails", "rateDetails", "priceDetails"})
public class SecuritiesOption33 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctyDtls", required = true)
	protected FinancialInstrumentAttributes34 securityDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34
	 * FinancialInstrumentAttributes34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmUnderlyingSecurity
	 * CorporateActionEvent.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33
	 * SecuritiesOption33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R::FIA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides description of the financial instrument related to securities movement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecurityDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmUnderlyingSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption33.mmObject();
			isDerived = false;
			xmlTag = "SctyDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R::FIA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDetails";
			definition = "Provides description of the financial instrument related to securities movement.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes34.mmObject();
		}
	};
	@XmlElement(name = "CdtDbtInd", required = true)
	protected CreditDebitCode creditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmCreditDebitIndicator
	 * ProceedsDefinition.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33
	 * SecuritiesOption33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22H::CRDB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the value is a debit or credit."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditDebitIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption33.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22H::CRDB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Specifies whether the value is a debit or credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}
	};
	@XmlElement(name = "TempFinInstrmInd")
	protected TemporaryFinancialInstrumentIndicator1Choice temporaryFinancialInstrumentIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator1Choice
	 * TemporaryFinancialInstrumentIndicator1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmTemporaryFinancialInstrumentIndicator
	 * Security.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33
	 * SecuritiesOption33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TempFinInstrmInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TEMP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TemporaryFinancialInstrumentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the security identified  is a temporary security identification used for processing reasons, for example, contra security used in the US."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTemporaryFinancialInstrumentIndicator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmTemporaryFinancialInstrumentIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption33.mmObject();
			isDerived = false;
			xmlTag = "TempFinInstrmInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TEMP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TemporaryFinancialInstrumentIndicator";
			definition = "Specifies that the security identified  is a temporary security identification used for processing reasons, for example, contra security used in the US.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TemporaryFinancialInstrumentIndicator1Choice.mmObject();
		}
	};
	@XmlElement(name = "NonElgblPrcdsInd")
	protected NonEligibleProceedsIndicator1Choice nonEligibleProceedsIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator1Choice
	 * NonEligibleProceedsIndicator1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmNonEligibleProceedsIndicator
	 * ProceedsDefinition.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33
	 * SecuritiesOption33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonElgblPrcdsInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::NELP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonEligibleProceedsIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies information regarding outturn resources that cannot be processed by the Central Securities Depository (CSD). Special delivery instruction is required from the account owner for the corporate action outcome to be credited."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNonEligibleProceedsIndicator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmNonEligibleProceedsIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption33.mmObject();
			isDerived = false;
			xmlTag = "NonElgblPrcdsInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::NELP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonEligibleProceedsIndicator";
			definition = "Specifies information regarding outturn resources that cannot be processed by the Central Securities Depository (CSD). Special delivery instruction is required from the account owner for the corporate action outcome to be credited.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NonEligibleProceedsIndicator1Choice.mmObject();
		}
	};
	@XmlElement(name = "IssrOfferrTaxbltyInd")
	protected IssuerTaxability1Code issuerOfferorTaxabilityIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerTaxability1Code
	 * IssuerTaxability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmIssuerOfferorTaxabilityIndicator
	 * ProceedsDefinition.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33
	 * SecuritiesOption33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrOfferrTaxbltyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proceeds are taxable according to the information provided by the issuer / offeror."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuerOfferorTaxabilityIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmIssuerOfferorTaxabilityIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption33.mmObject();
			isDerived = false;
			xmlTag = "IssrOfferrTaxbltyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicator";
			definition = "Proceeds are taxable according to the information provided by the issuer / offeror.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IssuerTaxability1Code.mmObject();
		}
	};
	@XmlElement(name = "NewSctiesIssncInd")
	protected NewSecuritiesIssuanceType1Code newSecuritiesIssuanceIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType1Code
	 * NewSecuritiesIssuanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33
	 * SecuritiesOption33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewSctiesIssncInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewSecuritiesIssuanceIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the securities are newly issued or not."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNewSecuritiesIssuanceIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption33.mmObject();
			isDerived = false;
			xmlTag = "NewSctiesIssncInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewSecuritiesIssuanceIndicator";
			definition = "Indicates whether the securities are newly issued or not.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NewSecuritiesIssuanceType1Code.mmObject();
		}
	};
	@XmlElement(name = "EntitldQty")
	protected Quantity6Choice entitledQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Quantity6Choice
	 * Quantity6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement#mmEntitledSecuritiesQuantity
	 * CorporateActionSecuritiesEntitlement.mmEntitledSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33
	 * SecuritiesOption33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EntitldQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::ENTL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of securities based on the terms of the corporate action event and balance of underlying securities entitled to the account owner. (This quantity can be positive or negative)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEntitledQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionSecuritiesEntitlement.mmEntitledSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption33.mmObject();
			isDerived = false;
			xmlTag = "EntitldQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::ENTL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitledQuantity";
			definition = "Quantity of securities based on the terms of the corporate action event and balance of underlying securities entitled to the account owner. (This quantity can be positive or negative).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Quantity6Choice.mmObject();
		}
	};
	@XmlElement(name = "FrctnDspstn")
	protected FractionDispositionType19Choice fractionDisposition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType19Choice
	 * FractionDispositionType19Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmFractionDisposition
	 * CorporateActionOption.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33
	 * SecuritiesOption33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrctnDspstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::DISF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionDisposition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFractionDisposition = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmFractionDisposition;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption33.mmObject();
			isDerived = false;
			xmlTag = "FrctnDspstn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::DISF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionDisposition";
			definition = "Specifies how fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FractionDispositionType19Choice.mmObject();
		}
	};
	@XmlElement(name = "CcyOptn")
	protected ActiveCurrencyCode currencyOption;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmCurrencyOption
	 * CorporateActionOption.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33
	 * SecuritiesOption33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyOptn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :11A::OPTN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency in which the cash disbursed from an interest or dividend payment is offered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrencyOption = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmCurrencyOption;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption33.mmObject();
			isDerived = false;
			xmlTag = "CcyOptn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":11A::OPTN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyOption";
			definition = "Currency in which the cash disbursed from an interest or dividend payment is offered.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "TradgPrd")
	protected Period3Choice tradingPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period3Choice
	 * Period3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTradingPeriod
	 * CorporateActionEvent.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33
	 * SecuritiesOption33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::TRDP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which intermediate or outturn securities are tradable in a secondary market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradingPeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmTradingPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption33.mmObject();
			isDerived = false;
			xmlTag = "TradgPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::TRDP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingPeriod";
			definition = "Period during which intermediate or outturn securities are tradable in a secondary market.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}
	};
	@XmlElement(name = "DtDtls", required = true)
	protected SecurityDate9 dateDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecurityDate9
	 * SecurityDate9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmUnderlyingSecurity
	 * CorporateActionEvent.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33
	 * SecuritiesOption33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the dates related to securities movement."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDateDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmUnderlyingSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption33.mmObject();
			isDerived = false;
			xmlTag = "DtDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateDetails";
			definition = "Provides information about the dates related to securities movement.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityDate9.mmObject();
		}
	};
	@XmlElement(name = "RateDtls")
	protected CorporateActionRate28 rateDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionRate28
	 * CorporateActionRate28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33
	 * SecuritiesOption33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the rates related to securities movement."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRateDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption33.mmObject();
			isDerived = false;
			xmlTag = "RateDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateDetails";
			definition = "Provides information about the rates related to securities movement.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionRate28.mmObject();
		}
	};
	@XmlElement(name = "PricDtls")
	protected CorporateActionPrice38 priceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionPrice38
	 * CorporateActionPrice38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPrice
	 * CorporateActionEvent.mmCorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33
	 * SecuritiesOption33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the prices related to securities movement."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPriceDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption33.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Provides information about the prices related to securities movement.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice38.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesOption33.mmSecurityDetails, com.tools20022.repository.msg.SecuritiesOption33.mmCreditDebitIndicator,
						com.tools20022.repository.msg.SecuritiesOption33.mmTemporaryFinancialInstrumentIndicator, com.tools20022.repository.msg.SecuritiesOption33.mmNonEligibleProceedsIndicator,
						com.tools20022.repository.msg.SecuritiesOption33.mmIssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.SecuritiesOption33.mmNewSecuritiesIssuanceIndicator,
						com.tools20022.repository.msg.SecuritiesOption33.mmEntitledQuantity, com.tools20022.repository.msg.SecuritiesOption33.mmFractionDisposition, com.tools20022.repository.msg.SecuritiesOption33.mmCurrencyOption,
						com.tools20022.repository.msg.SecuritiesOption33.mmTradingPeriod, com.tools20022.repository.msg.SecuritiesOption33.mmDateDetails, com.tools20022.repository.msg.SecuritiesOption33.mmRateDetails,
						com.tools20022.repository.msg.SecuritiesOption33.mmPriceDetails);
				trace_lazy = () -> CorporateActionOption.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forSecuritiesOption33,
						com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption33);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SecuritiesOption33";
				definition = "Provides information about the corporate action security option.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesOption38.mmObject());
				previousVersion_lazy = () -> SecuritiesOption24.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public FinancialInstrumentAttributes34 getSecurityDetails() {
		return securityDetails;
	}

	public SecuritiesOption33 setSecurityDetails(com.tools20022.repository.msg.FinancialInstrumentAttributes34 securityDetails) {
		this.securityDetails = Objects.requireNonNull(securityDetails);
		return this;
	}

	public CreditDebitCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public SecuritiesOption33 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public Optional<TemporaryFinancialInstrumentIndicator1Choice> getTemporaryFinancialInstrumentIndicator() {
		return temporaryFinancialInstrumentIndicator == null ? Optional.empty() : Optional.of(temporaryFinancialInstrumentIndicator);
	}

	public SecuritiesOption33 setTemporaryFinancialInstrumentIndicator(TemporaryFinancialInstrumentIndicator1Choice temporaryFinancialInstrumentIndicator) {
		this.temporaryFinancialInstrumentIndicator = temporaryFinancialInstrumentIndicator;
		return this;
	}

	public Optional<NonEligibleProceedsIndicator1Choice> getNonEligibleProceedsIndicator() {
		return nonEligibleProceedsIndicator == null ? Optional.empty() : Optional.of(nonEligibleProceedsIndicator);
	}

	public SecuritiesOption33 setNonEligibleProceedsIndicator(NonEligibleProceedsIndicator1Choice nonEligibleProceedsIndicator) {
		this.nonEligibleProceedsIndicator = nonEligibleProceedsIndicator;
		return this;
	}

	public Optional<IssuerTaxability1Code> getIssuerOfferorTaxabilityIndicator() {
		return issuerOfferorTaxabilityIndicator == null ? Optional.empty() : Optional.of(issuerOfferorTaxabilityIndicator);
	}

	public SecuritiesOption33 setIssuerOfferorTaxabilityIndicator(IssuerTaxability1Code issuerOfferorTaxabilityIndicator) {
		this.issuerOfferorTaxabilityIndicator = issuerOfferorTaxabilityIndicator;
		return this;
	}

	public Optional<NewSecuritiesIssuanceType1Code> getNewSecuritiesIssuanceIndicator() {
		return newSecuritiesIssuanceIndicator == null ? Optional.empty() : Optional.of(newSecuritiesIssuanceIndicator);
	}

	public SecuritiesOption33 setNewSecuritiesIssuanceIndicator(NewSecuritiesIssuanceType1Code newSecuritiesIssuanceIndicator) {
		this.newSecuritiesIssuanceIndicator = newSecuritiesIssuanceIndicator;
		return this;
	}

	public Optional<Quantity6Choice> getEntitledQuantity() {
		return entitledQuantity == null ? Optional.empty() : Optional.of(entitledQuantity);
	}

	public SecuritiesOption33 setEntitledQuantity(Quantity6Choice entitledQuantity) {
		this.entitledQuantity = entitledQuantity;
		return this;
	}

	public Optional<FractionDispositionType19Choice> getFractionDisposition() {
		return fractionDisposition == null ? Optional.empty() : Optional.of(fractionDisposition);
	}

	public SecuritiesOption33 setFractionDisposition(FractionDispositionType19Choice fractionDisposition) {
		this.fractionDisposition = fractionDisposition;
		return this;
	}

	public Optional<ActiveCurrencyCode> getCurrencyOption() {
		return currencyOption == null ? Optional.empty() : Optional.of(currencyOption);
	}

	public SecuritiesOption33 setCurrencyOption(ActiveCurrencyCode currencyOption) {
		this.currencyOption = currencyOption;
		return this;
	}

	public Optional<Period3Choice> getTradingPeriod() {
		return tradingPeriod == null ? Optional.empty() : Optional.of(tradingPeriod);
	}

	public SecuritiesOption33 setTradingPeriod(Period3Choice tradingPeriod) {
		this.tradingPeriod = tradingPeriod;
		return this;
	}

	public SecurityDate9 getDateDetails() {
		return dateDetails;
	}

	public SecuritiesOption33 setDateDetails(com.tools20022.repository.msg.SecurityDate9 dateDetails) {
		this.dateDetails = Objects.requireNonNull(dateDetails);
		return this;
	}

	public Optional<CorporateActionRate28> getRateDetails() {
		return rateDetails == null ? Optional.empty() : Optional.of(rateDetails);
	}

	public SecuritiesOption33 setRateDetails(com.tools20022.repository.msg.CorporateActionRate28 rateDetails) {
		this.rateDetails = rateDetails;
		return this;
	}

	public Optional<CorporateActionPrice38> getPriceDetails() {
		return priceDetails == null ? Optional.empty() : Optional.of(priceDetails);
	}

	public SecuritiesOption33 setPriceDetails(com.tools20022.repository.msg.CorporateActionPrice38 priceDetails) {
		this.priceDetails = priceDetails;
		return this;
	}
}