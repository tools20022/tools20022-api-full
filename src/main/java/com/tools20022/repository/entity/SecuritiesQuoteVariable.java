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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.SingleOrMassQuote1Choice;
import com.tools20022.repository.choice.SingleOrMassQuote2Choice;
import com.tools20022.repository.codeset.LegSwapTypeCode;
import com.tools20022.repository.codeset.PriceValueTypeCode;
import com.tools20022.repository.codeset.QualifierCode;
import com.tools20022.repository.codeset.QuoteTypeCode;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Proposition of price for a financial instrument.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesQuoteVariable"
 * src="doc-files/SecuritiesQuoteVariable.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteEntry2 QuoteEntry2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteSet2 QuoteSet2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteEntry1 QuoteEntry1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteSet1 QuoteSet1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleQuote1 SingleQuote1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote3 Quote3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteRequest1 QuoteRequest1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestForQuote
 * RequestForQuote}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote1 Quote1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote2 Quote2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote4 Quote4}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#mmRelatedQuote
 * Commission.mmRelatedQuote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmQuote
 * SecuritiesOrder.mmQuote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingSession#mmQuote
 * TradingSession.mmQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Quote#mmMidSideQuoteVariable
 * Quote.mmMidSideQuoteVariable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Quote#mmBidSideQuoteVariable
 * Quote.mmBidSideQuoteVariable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Quote#mmOfferSideQuoteVariable
 * Quote.mmOfferSideQuoteVariable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Quote#mmSecurityQuoteVariable
 * Quote.mmSecurityQuoteVariable}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteSet2#mmQuoteEntryDetails
 * QuoteSet2.mmQuoteEntryDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteSet1#mmQuoteEntryDetails
 * QuoteSet1.mmQuoteEntryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SingleOrMassQuote1Choice#mmSingleQuoteDetails
 * SingleOrMassQuote1Choice.mmSingleQuoteDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SingleOrMassQuote2Choice#mmSingleQuoteDetails
 * SingleOrMassQuote2Choice.mmSingleQuoteDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteRequest1#mmQuoteDetails
 * QuoteRequest1.mmQuoteDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmQualifier
 * SecuritiesQuoteVariable.mmQualifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmType
 * SecuritiesQuoteVariable.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmQuoteTradingSession
 * SecuritiesQuoteVariable.mmQuoteTradingSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmLegSwapType
 * SecuritiesQuoteVariable.mmLegSwapType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmPriceType
 * SecuritiesQuoteVariable.mmPriceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmMidSide
 * SecuritiesQuoteVariable.mmMidSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmBidSide
 * SecuritiesQuoteVariable.mmBidSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmOfferSide
 * SecuritiesQuoteVariable.mmOfferSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmRelatedQuote
 * SecuritiesQuoteVariable.mmRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmSecuritiesOrder
 * SecuritiesQuoteVariable.mmSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmCommission
 * SecuritiesQuoteVariable.mmCommission}</li>
 * </ul>
 * </li>
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
 * "SecuritiesQuoteVariable"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Proposition of price for a financial instrument."</li>
 * </ul>
 */
public class SecuritiesQuoteVariable {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected QualifierCode qualifier;
	/**
	 * Qualifies the use of the quote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.QualifierCode
	 * QualifierCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.SingleQuote1#mmQualifier
	 * SingleQuote1.mmQualifier}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Quote3#mmQualifier
	 * Quote3.mmQualifier}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Quote1#mmQualifier
	 * Quote1.mmQualifier}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Qualifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Qualifies the use of the quote."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmQualifier = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SingleQuote1.mmQualifier, Quote3.mmQualifier, Quote1.mmQualifier);
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Qualifier";
			definition = "Qualifies the use of the quote.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QualifierCode.mmObject();
		}
	};
	protected QuoteTypeCode type;
	/**
	 * Indicates the scenario in which the quote is (requested to be) used (ie,
	 * indicative, firm, restricted tradeable or counter).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteTypeCode
	 * QuoteTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Quote3#mmType
	 * Quote3.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestForQuote#mmQuoteType
	 * RequestForQuote.mmQuoteType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Quote1#mmType
	 * Quote1.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Quote2#mmType
	 * Quote2.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Quote4#mmType
	 * Quote4.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the scenario in which the quote is (requested to be) used (ie, indicative, firm, restricted tradeable or counter)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Quote3.mmType, RequestForQuote.mmQuoteType, Quote1.mmType, Quote2.mmType, Quote4.mmType);
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Indicates the scenario in which the quote is (requested to be) used (ie, indicative, firm, restricted tradeable or counter).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QuoteTypeCode.mmObject();
		}
	};
	protected TradingSession quoteTradingSession;
	/**
	 * Details of a specific trading session associated with a quote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession#mmQuote
	 * TradingSession.mmQuote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingSession
	 * TradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry2#mmTradingSessionDetails
	 * QuoteEntry2.mmTradingSessionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry1#mmTradingSessionDetails
	 * QuoteEntry1.mmTradingSessionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BidResponsePrice1#mmTradingSession
	 * BidResponsePrice1.mmTradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestForQuote#mmTradingSession
	 * RequestForQuote.mmTradingSession}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteTradingSession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of a specific trading session associated with a quote."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmQuoteTradingSession = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(QuoteEntry2.mmTradingSessionDetails, QuoteEntry1.mmTradingSessionDetails, BidResponsePrice1.mmTradingSession, RequestForQuote.mmTradingSession);
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuoteTradingSession";
			definition = "Details of a specific trading session associated with a quote.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingSession.mmQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
		}
	};
	protected LegSwapTypeCode legSwapType;
	/**
	 * Indicates that the sell-side is requested to calculate the quantity based
	 * on the opposite leg and is used instead of giving a quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LegSwapTypeCode
	 * LegSwapTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegSwapType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the sell-side is requested to calculate the quantity based on the opposite leg and is used instead of giving a quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLegSwapType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LegSwapType";
			definition = "Indicates that the sell-side is requested to calculate the quantity based on the opposite leg and is used instead of giving a quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LegSwapTypeCode.mmObject();
		}
	};
	protected PriceValueTypeCode priceType;
	/**
	 * Initiator can specify the price type the quote needs to be quoted at. If
	 * not specified, the respondent has option to specify how quote is quoted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Quote3#mmPriceType
	 * Quote3.mmPriceType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Initiator can specify the price type the quote needs to be quoted at. If not specified, the respondent has option to specify how quote is quoted."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPriceType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Quote3.mmPriceType);
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceType";
			definition = "Initiator can specify the price type the quote needs to be quoted at. If not specified, the respondent has option to specify how quote is quoted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriceValueTypeCode.mmObject();
		}
	};
	protected Quote midSide;
	/**
	 * Indicates that the quote details are indicated as a mid of a security,
	 * commodity, currency (an average of the offer and the bid).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmMidSideQuoteVariable
	 * Quote.mmMidSideQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.QuoteEntry2#mmMidSide
	 * QuoteEntry2.mmMidSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.QuoteEntry1#mmMidSide
	 * QuoteEntry1.mmMidSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SingleQuote1#mmMidSide
	 * SingleQuote1.mmMidSide}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MidSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the quote details are indicated as a mid of a security, commodity, currency (an average of the offer and the bid)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMidSide = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(QuoteEntry2.mmMidSide, QuoteEntry1.mmMidSide, SingleQuote1.mmMidSide);
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MidSide";
			definition = "Indicates that the quote details are indicated as a mid of a security, commodity, currency (an average of the offer and the bid).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.mmMidSideQuoteVariable;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
		}
	};
	protected Quote bidSide;
	/**
	 * Indicates that the quote details are indicated as a bid of a security,
	 * commodity, currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmBidSideQuoteVariable
	 * Quote.mmBidSideQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.QuoteEntry2#mmBidSide
	 * QuoteEntry2.mmBidSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.QuoteEntry1#mmBidSide
	 * QuoteEntry1.mmBidSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SingleQuote1#mmBidSide
	 * SingleQuote1.mmBidSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Bid2#mmBidResponsePriceDetails
	 * Bid2.mmBidResponsePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Bid3#mmBidResponsePriceDetails
	 * Bid3.mmBidResponsePriceDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the quote details are indicated as a bid of a security, commodity, currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBidSide = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(QuoteEntry2.mmBidSide, QuoteEntry1.mmBidSide, SingleQuote1.mmBidSide, Bid2.mmBidResponsePriceDetails, Bid3.mmBidResponsePriceDetails);
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BidSide";
			definition = "Indicates that the quote details are indicated as a bid of a security, commodity, currency.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.mmBidSideQuoteVariable;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
		}
	};
	protected Quote offerSide;
	/**
	 * Indicates that the quote details are indicated as an offer of a security,
	 * commodity, currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmOfferSideQuoteVariable
	 * Quote.mmOfferSideQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.QuoteEntry2#mmOfferSide
	 * QuoteEntry2.mmOfferSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.QuoteEntry1#mmOfferSide
	 * QuoteEntry1.mmOfferSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SingleQuote1#mmOfferSide
	 * SingleQuote1.mmOfferSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.QuoteRequest1#mmSide
	 * QuoteRequest1.mmSide}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the quote details are indicated as an offer of a security, commodity, currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOfferSide = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(QuoteEntry2.mmOfferSide, QuoteEntry1.mmOfferSide, SingleQuote1.mmOfferSide, QuoteRequest1.mmSide);
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfferSide";
			definition = "Indicates that the quote details are indicated as an offer of a security, commodity, currency.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.mmOfferSideQuoteVariable;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
		}
	};
	protected Quote relatedQuote;
	/**
	 * Quote parameters related to a security quote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmSecurityQuoteVariable
	 * Quote.mmSecurityQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote parameters related to a security quote."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedQuote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedQuote";
			definition = "Quote parameters related to a security quote.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.mmSecurityQuoteVariable;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
		}
	};
	protected SecuritiesOrder securitiesOrder;
	/**
	 * Preliminary information on conditions of the order, specified in the
	 * quote (request).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmQuote
	 * SecuritiesOrder.mmQuote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Preliminary information on conditions of the order, specified in the quote (request)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrder";
			definition = "Preliminary information on conditions of the order, specified in the quote (request).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Commission> commission;
	/**
	 * Commission associated with a quote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Commission#mmRelatedQuote
	 * Commission.mmRelatedQuote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Commission
	 * Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BidResponsePrice1#mmCommission
	 * BidResponsePrice1.mmCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BidResponsePrice2#mmCommission
	 * BidResponsePrice2.mmCommission}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission associated with a quote."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCommission = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(BidResponsePrice1.mmCommission, BidResponsePrice2.mmCommission);
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Commission associated with a quote.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Commission.mmRelatedQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Commission.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesQuoteVariable";
				definition = "Proposition of price for a financial instrument.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Commission.mmRelatedQuote, com.tools20022.repository.entity.SecuritiesOrder.mmQuote, com.tools20022.repository.entity.TradingSession.mmQuote,
						com.tools20022.repository.entity.Quote.mmMidSideQuoteVariable, com.tools20022.repository.entity.Quote.mmBidSideQuoteVariable, com.tools20022.repository.entity.Quote.mmOfferSideQuoteVariable,
						com.tools20022.repository.entity.Quote.mmSecurityQuoteVariable);
				derivationElement_lazy = () -> Arrays.asList(QuoteSet2.mmQuoteEntryDetails, QuoteSet1.mmQuoteEntryDetails, SingleOrMassQuote1Choice.mmSingleQuoteDetails, SingleOrMassQuote2Choice.mmSingleQuoteDetails,
						QuoteRequest1.mmQuoteDetails);
				element_lazy = () -> Arrays.asList(SecuritiesQuoteVariable.mmQualifier, SecuritiesQuoteVariable.mmType, SecuritiesQuoteVariable.mmQuoteTradingSession, SecuritiesQuoteVariable.mmLegSwapType,
						SecuritiesQuoteVariable.mmPriceType, SecuritiesQuoteVariable.mmMidSide, SecuritiesQuoteVariable.mmBidSide, SecuritiesQuoteVariable.mmOfferSide, SecuritiesQuoteVariable.mmRelatedQuote,
						SecuritiesQuoteVariable.mmSecuritiesOrder, SecuritiesQuoteVariable.mmCommission);
				derivationComponent_lazy = () -> Arrays.asList(QuoteEntry2.mmObject(), QuoteSet2.mmObject(), QuoteEntry1.mmObject(), QuoteSet1.mmObject(), SingleQuote1.mmObject(), Quote3.mmObject(), QuoteRequest1.mmObject(),
						RequestForQuote.mmObject(), Quote1.mmObject(), Quote2.mmObject(), Quote4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public QualifierCode getQualifier() {
		return qualifier;
	}

	public void setQualifier(QualifierCode qualifier) {
		this.qualifier = qualifier;
	}

	public QuoteTypeCode getType() {
		return type;
	}

	public void setType(QuoteTypeCode type) {
		this.type = type;
	}

	public TradingSession getQuoteTradingSession() {
		return quoteTradingSession;
	}

	public void setQuoteTradingSession(com.tools20022.repository.entity.TradingSession quoteTradingSession) {
		this.quoteTradingSession = quoteTradingSession;
	}

	public LegSwapTypeCode getLegSwapType() {
		return legSwapType;
	}

	public void setLegSwapType(LegSwapTypeCode legSwapType) {
		this.legSwapType = legSwapType;
	}

	public PriceValueTypeCode getPriceType() {
		return priceType;
	}

	public void setPriceType(PriceValueTypeCode priceType) {
		this.priceType = priceType;
	}

	public Quote getMidSide() {
		return midSide;
	}

	public void setMidSide(com.tools20022.repository.entity.Quote midSide) {
		this.midSide = midSide;
	}

	public Quote getBidSide() {
		return bidSide;
	}

	public void setBidSide(com.tools20022.repository.entity.Quote bidSide) {
		this.bidSide = bidSide;
	}

	public Quote getOfferSide() {
		return offerSide;
	}

	public void setOfferSide(com.tools20022.repository.entity.Quote offerSide) {
		this.offerSide = offerSide;
	}

	public Quote getRelatedQuote() {
		return relatedQuote;
	}

	public void setRelatedQuote(com.tools20022.repository.entity.Quote relatedQuote) {
		this.relatedQuote = relatedQuote;
	}

	public SecuritiesOrder getSecuritiesOrder() {
		return securitiesOrder;
	}

	public void setSecuritiesOrder(com.tools20022.repository.entity.SecuritiesOrder securitiesOrder) {
		this.securitiesOrder = securitiesOrder;
	}

	public List<Commission> getCommission() {
		return commission;
	}

	public void setCommission(List<com.tools20022.repository.entity.Commission> commission) {
		this.commission = commission;
	}
}