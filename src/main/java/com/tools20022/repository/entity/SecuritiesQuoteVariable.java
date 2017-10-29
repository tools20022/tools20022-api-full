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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.LegSwapTypeCode;
import com.tools20022.repository.codeset.PriceValueTypeCode;
import com.tools20022.repository.codeset.QualifierCode;
import com.tools20022.repository.codeset.QuoteTypeCode;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#Qualifier
 * SecuritiesQuoteVariable.Qualifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#Type
 * SecuritiesQuoteVariable.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#QuoteTradingSession
 * SecuritiesQuoteVariable.QuoteTradingSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#LegSwapType
 * SecuritiesQuoteVariable.LegSwapType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#PriceType
 * SecuritiesQuoteVariable.PriceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#MidSide
 * SecuritiesQuoteVariable.MidSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#BidSide
 * SecuritiesQuoteVariable.BidSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#OfferSide
 * SecuritiesQuoteVariable.OfferSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#RelatedQuote
 * SecuritiesQuoteVariable.RelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#SecuritiesOrder
 * SecuritiesQuoteVariable.SecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#Commission
 * SecuritiesQuoteVariable.Commission}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#RelatedQuote
 * Commission.RelatedQuote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#Quote
 * SecuritiesOrder.Quote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingSession#Quote
 * TradingSession.Quote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#MidSideQuoteVariable
 * Quote.MidSideQuoteVariable}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#BidSideQuoteVariable
 * Quote.BidSideQuoteVariable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Quote#OfferSideQuoteVariable
 * Quote.OfferSideQuoteVariable}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#SecurityQuoteVariable
 * Quote.SecurityQuoteVariable}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteSet2#QuoteEntryDetails
 * QuoteSet2.QuoteEntryDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteSet1#QuoteEntryDetails
 * QuoteSet1.QuoteEntryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SingleOrMassQuote1Choice#SingleQuoteDetails
 * SingleOrMassQuote1Choice.SingleQuoteDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SingleOrMassQuote2Choice#SingleQuoteDetails
 * SingleOrMassQuote2Choice.SingleQuoteDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteRequest1#QuoteDetails
 * QuoteRequest1.QuoteDetails}</li>
 * </ul>
 * </li>
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
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.SingleQuote1#Qualifier
	 * SingleQuote1.Qualifier}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Quote3#Qualifier
	 * Quote3.Qualifier}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Quote1#Qualifier
	 * Quote1.Qualifier}</li>
	 * </ul>
	 * </li>
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
	 * name} = "Qualifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Qualifies the use of the quote."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Qualifier = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SingleQuote1.Qualifier, com.tools20022.repository.msg.Quote3.Qualifier, com.tools20022.repository.msg.Quote1.Qualifier);
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Qualifier";
			definition = "Qualifies the use of the quote.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> QualifierCode.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Quote3#Type Quote3.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestForQuote#QuoteType
	 * RequestForQuote.QuoteType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Quote1#Type Quote1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Quote2#Type Quote2.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Quote4#Type Quote4.Type}</li>
	 * </ul>
	 * </li>
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
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the scenario in which the quote is (requested to be) used (ie, indicative, firm, restricted tradeable or counter)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Quote3.Type, com.tools20022.repository.msg.RequestForQuote.QuoteType, com.tools20022.repository.msg.Quote1.Type, com.tools20022.repository.msg.Quote2.Type,
					com.tools20022.repository.msg.Quote4.Type);
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Indicates the scenario in which the quote is (requested to be) used (ie, indicative, firm, restricted tradeable or counter).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> QuoteTypeCode.mmObject();
		}
	};
	/**
	 * Details of a specific trading session associated with a quote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession#Quote
	 * TradingSession.Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingSession
	 * TradingSession}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry2#TradingSessionDetails
	 * QuoteEntry2.TradingSessionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry1#TradingSessionDetails
	 * QuoteEntry1.TradingSessionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BidResponsePrice1#TradingSession
	 * BidResponsePrice1.TradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestForQuote#TradingSession
	 * RequestForQuote.TradingSession}</li>
	 * </ul>
	 * </li>
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
	 * name} = "QuoteTradingSession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of a specific trading session associated with a quote."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd QuoteTradingSession = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QuoteEntry2.TradingSessionDetails, com.tools20022.repository.msg.QuoteEntry1.TradingSessionDetails,
					com.tools20022.repository.msg.BidResponsePrice1.TradingSession, com.tools20022.repository.msg.RequestForQuote.TradingSession);
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuoteTradingSession";
			definition = "Details of a specific trading session associated with a quote.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TradingSession.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradingSession.Quote;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute LegSwapType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LegSwapType";
			definition = "Indicates that the sell-side is requested to calculate the quantity based on the opposite leg and is used instead of giving a quantity.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> LegSwapTypeCode.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Quote3#PriceType
	 * Quote3.PriceType}</li>
	 * </ul>
	 * </li>
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
	 * name} = "PriceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Initiator can specify the price type the quote needs to be quoted at. If not specified, the respondent has option to specify how quote is quoted."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PriceType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Quote3.PriceType);
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceType";
			definition = "Initiator can specify the price type the quote needs to be quoted at. If not specified, the respondent has option to specify how quote is quoted.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PriceValueTypeCode.mmObject();
		}
	};
	/**
	 * Indicates that the quote details are indicated as a mid of a security,
	 * commodity, currency (an average of the offer and the bid).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#MidSideQuoteVariable
	 * Quote.MidSideQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.QuoteEntry2#MidSide
	 * QuoteEntry2.MidSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.QuoteEntry1#MidSide
	 * QuoteEntry1.MidSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SingleQuote1#MidSide
	 * SingleQuote1.MidSide}</li>
	 * </ul>
	 * </li>
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
	 * name} = "MidSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the quote details are indicated as a mid of a security, commodity, currency (an average of the offer and the bid)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MidSide = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QuoteEntry2.MidSide, com.tools20022.repository.msg.QuoteEntry1.MidSide, com.tools20022.repository.msg.SingleQuote1.MidSide);
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MidSide";
			definition = "Indicates that the quote details are indicated as a mid of a security, commodity, currency (an average of the offer and the bid).";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Quote.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.MidSideQuoteVariable;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates that the quote details are indicated as a bid of a security,
	 * commodity, currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#BidSideQuoteVariable
	 * Quote.BidSideQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.QuoteEntry2#BidSide
	 * QuoteEntry2.BidSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.QuoteEntry1#BidSide
	 * QuoteEntry1.BidSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SingleQuote1#BidSide
	 * SingleQuote1.BidSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Bid2#BidResponsePriceDetails
	 * Bid2.BidResponsePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Bid3#BidResponsePriceDetails
	 * Bid3.BidResponsePriceDetails}</li>
	 * </ul>
	 * </li>
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
	 * name} = "BidSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the quote details are indicated as a bid of a security, commodity, currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BidSide = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QuoteEntry2.BidSide, com.tools20022.repository.msg.QuoteEntry1.BidSide, com.tools20022.repository.msg.SingleQuote1.BidSide,
					com.tools20022.repository.msg.Bid2.BidResponsePriceDetails, com.tools20022.repository.msg.Bid3.BidResponsePriceDetails);
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BidSide";
			definition = "Indicates that the quote details are indicated as a bid of a security, commodity, currency.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Quote.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.BidSideQuoteVariable;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates that the quote details are indicated as an offer of a security,
	 * commodity, currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#OfferSideQuoteVariable
	 * Quote.OfferSideQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.QuoteEntry2#OfferSide
	 * QuoteEntry2.OfferSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.QuoteEntry1#OfferSide
	 * QuoteEntry1.OfferSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SingleQuote1#OfferSide
	 * SingleQuote1.OfferSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.QuoteRequest1#Side
	 * QuoteRequest1.Side}</li>
	 * </ul>
	 * </li>
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
	 * name} = "OfferSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the quote details are indicated as an offer of a security, commodity, currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OfferSide = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QuoteEntry2.OfferSide, com.tools20022.repository.msg.QuoteEntry1.OfferSide, com.tools20022.repository.msg.SingleQuote1.OfferSide,
					com.tools20022.repository.msg.QuoteRequest1.Side);
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfferSide";
			definition = "Indicates that the quote details are indicated as an offer of a security, commodity, currency.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Quote.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.OfferSideQuoteVariable;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quote parameters related to a security quote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#SecurityQuoteVariable
	 * Quote.SecurityQuoteVariable}</li>
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
	public static final MMBusinessAssociationEnd RelatedQuote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedQuote";
			definition = "Quote parameters related to a security quote.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Quote.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.SecurityQuoteVariable;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Preliminary information on conditions of the order, specified in the
	 * quote (request).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#Quote
	 * SecuritiesOrder.Quote}</li>
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
	public static final MMBusinessAssociationEnd SecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrder";
			definition = "Preliminary information on conditions of the order, specified in the quote (request).";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.Quote;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Commission associated with a quote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Commission#RelatedQuote
	 * Commission.RelatedQuote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Commission
	 * Commission}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BidResponsePrice1#Commission
	 * BidResponsePrice1.Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BidResponsePrice2#Commission
	 * BidResponsePrice2.Commission}</li>
	 * </ul>
	 * </li>
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
	 * name} = "Commission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission associated with a quote."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Commission = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BidResponsePrice1.Commission, com.tools20022.repository.msg.BidResponsePrice2.Commission);
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Commission associated with a quote.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Commission.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Commission.RelatedQuote;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesQuoteVariable";
				definition = "Proposition of price for a financial instrument.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Commission.RelatedQuote, com.tools20022.repository.entity.SecuritiesOrder.Quote, com.tools20022.repository.entity.TradingSession.Quote,
						com.tools20022.repository.entity.Quote.MidSideQuoteVariable, com.tools20022.repository.entity.Quote.BidSideQuoteVariable, com.tools20022.repository.entity.Quote.OfferSideQuoteVariable,
						com.tools20022.repository.entity.Quote.SecurityQuoteVariable);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QuoteSet2.QuoteEntryDetails, com.tools20022.repository.msg.QuoteSet1.QuoteEntryDetails,
						com.tools20022.repository.choice.SingleOrMassQuote1Choice.SingleQuoteDetails, com.tools20022.repository.choice.SingleOrMassQuote2Choice.SingleQuoteDetails, com.tools20022.repository.msg.QuoteRequest1.QuoteDetails);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesQuoteVariable.Qualifier, com.tools20022.repository.entity.SecuritiesQuoteVariable.Type,
						com.tools20022.repository.entity.SecuritiesQuoteVariable.QuoteTradingSession, com.tools20022.repository.entity.SecuritiesQuoteVariable.LegSwapType, com.tools20022.repository.entity.SecuritiesQuoteVariable.PriceType,
						com.tools20022.repository.entity.SecuritiesQuoteVariable.MidSide, com.tools20022.repository.entity.SecuritiesQuoteVariable.BidSide, com.tools20022.repository.entity.SecuritiesQuoteVariable.OfferSide,
						com.tools20022.repository.entity.SecuritiesQuoteVariable.RelatedQuote, com.tools20022.repository.entity.SecuritiesQuoteVariable.SecuritiesOrder, com.tools20022.repository.entity.SecuritiesQuoteVariable.Commission);
				derivationComponent_lazy = () -> Arrays.asList(QuoteEntry2.mmObject(), QuoteSet2.mmObject(), QuoteEntry1.mmObject(), QuoteSet1.mmObject(), SingleQuote1.mmObject(), Quote3.mmObject(), QuoteRequest1.mmObject(),
						RequestForQuote.mmObject(), Quote1.mmObject(), Quote2.mmObject(), Quote4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}