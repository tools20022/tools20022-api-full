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
import com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03;
import com.tools20022.repository.choice.SafekeepingPlaceFormat3Choice;
import com.tools20022.repository.codeset.CorporateActionOption5Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Overall position, in a single security, held in a securities account at a
 * specified place of safekeeping.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmFinancialInstrumentIdentification
 * AggregateBalanceInformation8.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmFinancialInstrumentAttributes
 * AggregateBalanceInformation8.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation8.mmInvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmAdditionalDerivativeAttributes
 * AggregateBalanceInformation8.mmAdditionalDerivativeAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmAggregateBalance
 * AggregateBalanceInformation8.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmSafekeepingPlace
 * AggregateBalanceInformation8.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmCorporateActionOptionType
 * AggregateBalanceInformation8.mmCorporateActionOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmPriceDetails
 * AggregateBalanceInformation8.mmPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmForeignExchangeDetails
 * AggregateBalanceInformation8.mmForeignExchangeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmDaysAccrued
 * AggregateBalanceInformation8.mmDaysAccrued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmAccountBaseCurrencyAmounts
 * AggregateBalanceInformation8.mmAccountBaseCurrencyAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmInstrumentCurrencyAmounts
 * AggregateBalanceInformation8.mmInstrumentCurrencyAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmAlternateReportingCurrencyAmounts
 * AggregateBalanceInformation8.mmAlternateReportingCurrencyAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmQuantityBreakdown
 * AggregateBalanceInformation8.mmQuantityBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmBalanceBreakdown
 * AggregateBalanceInformation8.mmBalanceBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmAdditionalBalanceBreakdown
 * AggregateBalanceInformation8.mmAdditionalBalanceBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmBalanceAtSafekeepingPlace
 * AggregateBalanceInformation8.mmBalanceAtSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmHoldingAdditionalDetails
 * AggregateBalanceInformation8.mmHoldingAdditionalDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmExtension
 * AggregateBalanceInformation8.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
 * SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03#mmBalanceForAccount
 * SecuritiesBalanceAccountingReportV03.mmBalanceForAccount}</li>
 * </ul>
 * </li>
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
 * "AggregateBalanceInformation8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Overall position, in a single security, held in a securities account at a specified place of safekeeping."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AggregateBalanceInformation8", propOrder = {"financialInstrumentIdentification", "financialInstrumentAttributes", "investmentFundsFinancialInstrumentAttributes", "additionalDerivativeAttributes", "aggregateBalance",
		"safekeepingPlace", "corporateActionOptionType", "priceDetails", "foreignExchangeDetails", "daysAccrued", "accountBaseCurrencyAmounts", "instrumentCurrencyAmounts", "alternateReportingCurrencyAmounts", "quantityBreakdown",
		"balanceBreakdown", "additionalBalanceBreakdown", "balanceAtSafekeepingPlace", "holdingAdditionalDetails", "extension"})
public class AggregateBalanceInformation8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SecurityIdentification11 financialInstrumentIdentification;
	/**
	 * Financial instruments representing a sum of rights of the investor
	 * vis-a-vis the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification11
	 * SecurityIdentification11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8
	 * AggregateBalanceInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> AggregateBalanceInformation8.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification11.mmObject();
		}
	};
	protected FinancialInstrumentAttributes8 financialInstrumentAttributes;
	/**
	 * Elements characterising a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8
	 * FinancialInstrumentAttributes8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecurity
	 * SecuritiesBalance.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8
	 * AggregateBalanceInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Elements characterising a financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentAttributes = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecurity;
			componentContext_lazy = () -> AggregateBalanceInformation8.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Elements characterising a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes8.mmObject();
		}
	};
	protected FinancialInstrument21 investmentFundsFinancialInstrumentAttributes;
	/**
	 * Elements characterising an investment funds financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument21
	 * FinancialInstrument21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8
	 * AggregateBalanceInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtFndsFinInstrmAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundsFinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements characterising an investment funds financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestmentFundsFinancialInstrumentAttributes = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> AggregateBalanceInformation8.mmObject();
			isDerived = false;
			xmlTag = "InvstmtFndsFinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentFundsFinancialInstrumentAttributes";
			definition = "Elements characterising an investment funds financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument21.mmObject();
		}
	};
	protected DerivativeBasicAttributes1 additionalDerivativeAttributes;
	/**
	 * Details of the swap contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeBasicAttributes1
	 * DerivativeBasicAttributes1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmDerivative
	 * Asset.mmDerivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8
	 * AggregateBalanceInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlDerivAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDerivativeAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the swap contract."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalDerivativeAttributes = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Asset.mmDerivative;
			componentContext_lazy = () -> AggregateBalanceInformation8.mmObject();
			isDerived = false;
			xmlTag = "AddtlDerivAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDerivativeAttributes";
			definition = "Details of the swap contract.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DerivativeBasicAttributes1.mmObject();
		}
	};
	protected Balance1 aggregateBalance;
	/**
	 * Total quantity of financial instruments of the balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Balance1 Balance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8
	 * AggregateBalanceInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AggtBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregateBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of financial instruments of the balance."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAggregateBalance = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> AggregateBalanceInformation8.mmObject();
			isDerived = false;
			xmlTag = "AggtBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateBalance";
			definition = "Total quantity of financial instruments of the balance.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Balance1.mmObject();
		}
	};
	protected SafekeepingPlaceFormat3Choice safekeepingPlace;
	/**
	 * Place where the securities are safe-kept, physically or notionally. This
	 * place can be, for example, a local custodian, a Central Securities
	 * Depository (CSD) or an International Central Securities Depository
	 * (ICSD).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat3Choice
	 * SafekeepingPlaceFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8
	 * AggregateBalanceInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place where the securities are safe-kept, physically or notionally.  This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSafekeepingPlace = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> AggregateBalanceInformation8.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place where the securities are safe-kept, physically or notionally.  This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SafekeepingPlaceFormat3Choice.mmObject();
		}
	};
	protected CorporateActionOption5Code corporateActionOptionType;
	/**
	 * Specifies the corporate action options available to the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption5Code
	 * CorporateActionOption5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionType
	 * CorporateActionOption.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8
	 * AggregateBalanceInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnOptnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionOptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the corporate action options available to the account owner."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCorporateActionOptionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionType;
			componentContext_lazy = () -> AggregateBalanceInformation8.mmObject();
			isDerived = false;
			xmlTag = "CorpActnOptnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionOptionType";
			definition = "Specifies the corporate action options available to the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CorporateActionOption5Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PriceInformation5> priceDetails;
	/**
	 * Price of the financial instrument in one or more currencies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PriceInformation5
	 * PriceInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPricing
	 * Security.mmPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8
	 * AggregateBalanceInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price of the financial instrument in one or more currencies."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPriceDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmPricing;
			componentContext_lazy = () -> AggregateBalanceInformation8.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Price of the financial instrument in one or more currencies.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PriceInformation5.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ForeignExchangeTerms1> foreignExchangeDetails;
	/**
	 * Information needed to process a currency exchange or conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms1
	 * ForeignExchangeTerms1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmExchangeRate
	 * SecuritiesBalance.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8
	 * AggregateBalanceInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FXDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information needed to process a currency exchange or conversion."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmForeignExchangeDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmExchangeRate;
			componentContext_lazy = () -> AggregateBalanceInformation8.mmObject();
			isDerived = false;
			xmlTag = "FXDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Information needed to process a currency exchange or conversion.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ForeignExchangeTerms1.mmObject();
		}
	};
	protected Number daysAccrued;
	/**
	 * Specifies the number of days used for calculating the accrued interest
	 * amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmNumberOfDays
	 * DateTimePeriod.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8
	 * AggregateBalanceInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DaysAcrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DaysAccrued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of days used for calculating the accrued interest amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDaysAccrued = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> AggregateBalanceInformation8.mmObject();
			isDerived = false;
			xmlTag = "DaysAcrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DaysAccrued";
			definition = "Specifies the number of days used for calculating the accrued interest amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected BalanceAmounts1 accountBaseCurrencyAmounts;
	/**
	 * Valuation amounts provided in the base currency of the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BalanceAmounts1
	 * BalanceAmounts1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmAssetHolding
	 * Balance.mmAssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8
	 * AggregateBalanceInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctBaseCcyAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBaseCurrencyAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation amounts provided in the base currency of the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountBaseCurrencyAmounts = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Balance.mmAssetHolding;
			componentContext_lazy = () -> AggregateBalanceInformation8.mmObject();
			isDerived = false;
			xmlTag = "AcctBaseCcyAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBaseCurrencyAmounts";
			definition = "Valuation amounts provided in the base currency of the account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BalanceAmounts1.mmObject();
		}
	};
	protected BalanceAmounts1 instrumentCurrencyAmounts;
	/**
	 * Valuation amounts provided in the currency of the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BalanceAmounts1
	 * BalanceAmounts1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmAssetHolding
	 * Balance.mmAssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8
	 * AggregateBalanceInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrmCcyAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstrumentCurrencyAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation amounts provided in the currency of the financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstrumentCurrencyAmounts = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Balance.mmAssetHolding;
			componentContext_lazy = () -> AggregateBalanceInformation8.mmObject();
			isDerived = false;
			xmlTag = "InstrmCcyAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstrumentCurrencyAmounts";
			definition = "Valuation amounts provided in the currency of the financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BalanceAmounts1.mmObject();
		}
	};
	protected BalanceAmounts1 alternateReportingCurrencyAmounts;
	/**
	 * Valuation amounts provided in another currency than the base currency of
	 * the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BalanceAmounts1
	 * BalanceAmounts1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmAssetHolding
	 * Balance.mmAssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8
	 * AggregateBalanceInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AltrnRptgCcyAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlternateReportingCurrencyAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation amounts provided in another currency than the base currency of the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAlternateReportingCurrencyAmounts = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Balance.mmAssetHolding;
			componentContext_lazy = () -> AggregateBalanceInformation8.mmObject();
			isDerived = false;
			xmlTag = "AltrnRptgCcyAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlternateReportingCurrencyAmounts";
			definition = "Valuation amounts provided in another currency than the base currency of the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BalanceAmounts1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.QuantityBreakdown4> quantityBreakdown;
	/**
	 * Breakdown of the aggregate quantity reported into significant lots, for
	 * example, tax lots.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.QuantityBreakdown4
	 * QuantityBreakdown4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLotBreakdown
	 * SecuritiesQuantity.mmLotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8
	 * AggregateBalanceInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyBrkdwn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Breakdown of the aggregate quantity reported into significant lots, for example, tax lots."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmQuantityBreakdown = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmLotBreakdown;
			componentContext_lazy = () -> AggregateBalanceInformation8.mmObject();
			isDerived = false;
			xmlTag = "QtyBrkdwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityBreakdown";
			definition = "Breakdown of the aggregate quantity reported into significant lots, for example, tax lots.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.QuantityBreakdown4.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SubBalanceInformation6> balanceBreakdown;
	/**
	 * Breakdown of the aggregate balance per meaningful sub-balances and
	 * availability.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SubBalanceInformation6
	 * SubBalanceInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesSubBalance
	 * SecuritiesBalance.mmSecuritiesSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8
	 * AggregateBalanceInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalBrkdwn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Breakdown of the aggregate balance per meaningful sub-balances and availability."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBalanceBreakdown = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesSubBalance;
			componentContext_lazy = () -> AggregateBalanceInformation8.mmObject();
			isDerived = false;
			xmlTag = "BalBrkdwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceBreakdown";
			definition = "Breakdown of the aggregate balance per meaningful sub-balances and availability.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SubBalanceInformation6.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AdditionalBalanceInformation6> additionalBalanceBreakdown;
	/**
	 * Provides additional instrument sub-balance information on all or parts of
	 * the reported financial instrument (unregistered, tax exempt, etc.).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation6
	 * AdditionalBalanceInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesSubBalance
	 * SecuritiesBalance.mmSecuritiesSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8
	 * AggregateBalanceInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlBalBrkdwn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalBalanceBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional instrument sub-balance information on all or parts of the reported financial instrument (unregistered, tax exempt, etc.)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalBalanceBreakdown = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesSubBalance;
			componentContext_lazy = () -> AggregateBalanceInformation8.mmObject();
			isDerived = false;
			xmlTag = "AddtlBalBrkdwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalBalanceBreakdown";
			definition = "Provides additional instrument sub-balance information on all or parts of the reported financial instrument (unregistered, tax exempt, etc.).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AdditionalBalanceInformation6.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7> balanceAtSafekeepingPlace;
	/**
	 * Breakdown of positions per place of safekeeping (and optionally per place
	 * of listing).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7
	 * AggregateBalancePerSafekeepingPlace7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesSubBalance
	 * SecuritiesBalance.mmSecuritiesSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8
	 * AggregateBalanceInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalAtSfkpgPlc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceAtSafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Breakdown of positions per place of safekeeping (and optionally per place of listing)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBalanceAtSafekeepingPlace = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesSubBalance;
			componentContext_lazy = () -> AggregateBalanceInformation8.mmObject();
			isDerived = false;
			xmlTag = "BalAtSfkpgPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceAtSafekeepingPlace";
			definition = "Breakdown of positions per place of safekeeping (and optionally per place of listing).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7.mmObject();
		}
	};
	protected Max350Text holdingAdditionalDetails;
	/**
	 * Provides additional information on the holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8
	 * AggregateBalanceInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldgAddtlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingAdditionalDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides additional information on the holding."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHoldingAdditionalDetails = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AggregateBalanceInformation8.mmObject();
			isDerived = false;
			xmlTag = "HldgAddtlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingAdditionalDetails";
			definition = "Provides additional information on the holding.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Extension2> extension;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Extension2 Extension2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8
	 * AggregateBalanceInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExtension = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AggregateBalanceInformation8.mmObject();
			isDerived = false;
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Extension2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AggregateBalanceInformation8.mmFinancialInstrumentIdentification, AggregateBalanceInformation8.mmFinancialInstrumentAttributes,
						AggregateBalanceInformation8.mmInvestmentFundsFinancialInstrumentAttributes, AggregateBalanceInformation8.mmAdditionalDerivativeAttributes, AggregateBalanceInformation8.mmAggregateBalance,
						AggregateBalanceInformation8.mmSafekeepingPlace, AggregateBalanceInformation8.mmCorporateActionOptionType, AggregateBalanceInformation8.mmPriceDetails, AggregateBalanceInformation8.mmForeignExchangeDetails,
						AggregateBalanceInformation8.mmDaysAccrued, AggregateBalanceInformation8.mmAccountBaseCurrencyAmounts, AggregateBalanceInformation8.mmInstrumentCurrencyAmounts,
						AggregateBalanceInformation8.mmAlternateReportingCurrencyAmounts, AggregateBalanceInformation8.mmQuantityBreakdown, AggregateBalanceInformation8.mmBalanceBreakdown,
						AggregateBalanceInformation8.mmAdditionalBalanceBreakdown, AggregateBalanceInformation8.mmBalanceAtSafekeepingPlace, AggregateBalanceInformation8.mmHoldingAdditionalDetails, AggregateBalanceInformation8.mmExtension);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesBalanceAccountingReportV03.mmBalanceForAccount);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "AggregateBalanceInformation8";
				definition = "Overall position, in a single security, held in a securities account at a specified place of safekeeping.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "FinInstrmId", required = true)
	public SecurityIdentification11 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(com.tools20022.repository.msg.SecurityIdentification11 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
	}

	@XmlElement(name = "FinInstrmAttrbts")
	public FinancialInstrumentAttributes8 getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes;
	}

	public void setFinancialInstrumentAttributes(com.tools20022.repository.msg.FinancialInstrumentAttributes8 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
	}

	@XmlElement(name = "InvstmtFndsFinInstrmAttrbts")
	public FinancialInstrument21 getInvestmentFundsFinancialInstrumentAttributes() {
		return investmentFundsFinancialInstrumentAttributes;
	}

	public void setInvestmentFundsFinancialInstrumentAttributes(com.tools20022.repository.msg.FinancialInstrument21 investmentFundsFinancialInstrumentAttributes) {
		this.investmentFundsFinancialInstrumentAttributes = investmentFundsFinancialInstrumentAttributes;
	}

	@XmlElement(name = "AddtlDerivAttrbts")
	public DerivativeBasicAttributes1 getAdditionalDerivativeAttributes() {
		return additionalDerivativeAttributes;
	}

	public void setAdditionalDerivativeAttributes(com.tools20022.repository.msg.DerivativeBasicAttributes1 additionalDerivativeAttributes) {
		this.additionalDerivativeAttributes = additionalDerivativeAttributes;
	}

	@XmlElement(name = "AggtBal", required = true)
	public Balance1 getAggregateBalance() {
		return aggregateBalance;
	}

	public void setAggregateBalance(com.tools20022.repository.msg.Balance1 aggregateBalance) {
		this.aggregateBalance = aggregateBalance;
	}

	@XmlElement(name = "SfkpgPlc")
	public SafekeepingPlaceFormat3Choice getSafekeepingPlace() {
		return safekeepingPlace;
	}

	public void setSafekeepingPlace(SafekeepingPlaceFormat3Choice safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
	}

	@XmlElement(name = "CorpActnOptnTp")
	public CorporateActionOption5Code getCorporateActionOptionType() {
		return corporateActionOptionType;
	}

	public void setCorporateActionOptionType(CorporateActionOption5Code corporateActionOptionType) {
		this.corporateActionOptionType = corporateActionOptionType;
	}

	@XmlElement(name = "PricDtls", required = true)
	public List<PriceInformation5> getPriceDetails() {
		return priceDetails;
	}

	public void setPriceDetails(List<com.tools20022.repository.msg.PriceInformation5> priceDetails) {
		this.priceDetails = priceDetails;
	}

	@XmlElement(name = "FXDtls")
	public List<ForeignExchangeTerms1> getForeignExchangeDetails() {
		return foreignExchangeDetails;
	}

	public void setForeignExchangeDetails(List<com.tools20022.repository.msg.ForeignExchangeTerms1> foreignExchangeDetails) {
		this.foreignExchangeDetails = foreignExchangeDetails;
	}

	@XmlElement(name = "DaysAcrd")
	public Number getDaysAccrued() {
		return daysAccrued;
	}

	public void setDaysAccrued(Number daysAccrued) {
		this.daysAccrued = daysAccrued;
	}

	@XmlElement(name = "AcctBaseCcyAmts", required = true)
	public BalanceAmounts1 getAccountBaseCurrencyAmounts() {
		return accountBaseCurrencyAmounts;
	}

	public void setAccountBaseCurrencyAmounts(com.tools20022.repository.msg.BalanceAmounts1 accountBaseCurrencyAmounts) {
		this.accountBaseCurrencyAmounts = accountBaseCurrencyAmounts;
	}

	@XmlElement(name = "InstrmCcyAmts")
	public BalanceAmounts1 getInstrumentCurrencyAmounts() {
		return instrumentCurrencyAmounts;
	}

	public void setInstrumentCurrencyAmounts(com.tools20022.repository.msg.BalanceAmounts1 instrumentCurrencyAmounts) {
		this.instrumentCurrencyAmounts = instrumentCurrencyAmounts;
	}

	@XmlElement(name = "AltrnRptgCcyAmts")
	public BalanceAmounts1 getAlternateReportingCurrencyAmounts() {
		return alternateReportingCurrencyAmounts;
	}

	public void setAlternateReportingCurrencyAmounts(com.tools20022.repository.msg.BalanceAmounts1 alternateReportingCurrencyAmounts) {
		this.alternateReportingCurrencyAmounts = alternateReportingCurrencyAmounts;
	}

	@XmlElement(name = "QtyBrkdwn")
	public List<QuantityBreakdown4> getQuantityBreakdown() {
		return quantityBreakdown;
	}

	public void setQuantityBreakdown(List<com.tools20022.repository.msg.QuantityBreakdown4> quantityBreakdown) {
		this.quantityBreakdown = quantityBreakdown;
	}

	@XmlElement(name = "BalBrkdwn")
	public List<SubBalanceInformation6> getBalanceBreakdown() {
		return balanceBreakdown;
	}

	public void setBalanceBreakdown(List<com.tools20022.repository.msg.SubBalanceInformation6> balanceBreakdown) {
		this.balanceBreakdown = balanceBreakdown;
	}

	@XmlElement(name = "AddtlBalBrkdwn")
	public List<AdditionalBalanceInformation6> getAdditionalBalanceBreakdown() {
		return additionalBalanceBreakdown;
	}

	public void setAdditionalBalanceBreakdown(List<com.tools20022.repository.msg.AdditionalBalanceInformation6> additionalBalanceBreakdown) {
		this.additionalBalanceBreakdown = additionalBalanceBreakdown;
	}

	@XmlElement(name = "BalAtSfkpgPlc")
	public List<AggregateBalancePerSafekeepingPlace7> getBalanceAtSafekeepingPlace() {
		return balanceAtSafekeepingPlace;
	}

	public void setBalanceAtSafekeepingPlace(List<com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7> balanceAtSafekeepingPlace) {
		this.balanceAtSafekeepingPlace = balanceAtSafekeepingPlace;
	}

	@XmlElement(name = "HldgAddtlDtls")
	public Max350Text getHoldingAdditionalDetails() {
		return holdingAdditionalDetails;
	}

	public void setHoldingAdditionalDetails(Max350Text holdingAdditionalDetails) {
		this.holdingAdditionalDetails = holdingAdditionalDetails;
	}

	@XmlElement(name = "Xtnsn")
	public List<Extension2> getExtension() {
		return extension;
	}

	public void setExtension(List<com.tools20022.repository.msg.Extension2> extension) {
		this.extension = extension;
	}
}