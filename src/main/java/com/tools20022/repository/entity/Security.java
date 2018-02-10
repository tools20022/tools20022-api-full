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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Financial instruments representing a sum of rights of the investor vis-a-vis
 * the issuer.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Security" src="doc-files/Security.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmIdentification
 * Security.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmRegisteredDistributionCountry
 * Security.mmRegisteredDistributionCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmDenominationCurrency
 * Security.mmDenominationCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmRegistrationForm
 * Security.mmRegistrationForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmDematerialisedIndicator
 * Security.mmDematerialisedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmEUSavingsDirective
 * Security.mmEUSavingsDirective}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesQuantity
 * Security.mmSecuritiesQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmFees
 * Security.mmFees}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmPricing
 * Security.mmPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesAccount
 * Security.mmSecuritiesAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmTradingMarket
 * Security.mmTradingMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmPlaceOfListing
 * Security.mmPlaceOfListing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmRegistration
 * Security.mmRegistration}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmRestriction
 * Security.mmRestriction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmCorporateEvent
 * Security.mmCorporateEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmTemporaryFinancialInstrumentIndicator
 * Security.mmTemporaryFinancialInstrumentIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmAvailableDate
 * Security.mmAvailableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmDeclarationDetails
 * Security.mmDeclarationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSpread
 * Security.mmSpread}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmDividend
 * Security.mmDividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmBalance
 * Security.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmFungibleIndicator
 * Security.mmFungibleIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmAppearance
 * Security.mmAppearance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmNearTermPositionLimit
 * Security.mmNearTermPositionLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmContractSettlementMonth
 * Security.mmContractSettlementMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmMinimumTradingPricingIncrement
 * Security.mmMinimumTradingPricingIncrement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmRating
 * Security.mmRating}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmCouponAttached
 * Security.mmCouponAttached}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSector
 * Security.mmSector}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmWarrantAttachedOnDelivery
 * Security.mmWarrantAttachedOnDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmStrippableIndicator
 * Security.mmStrippableIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmFirstDealingDate
 * Security.mmFirstDealingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmTaxDetails
 * Security.mmTaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSecuritiesTrade
 * Security.mmSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmRegistrationJurisdiction
 * Security.mmRegistrationJurisdiction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmPartyRole
 * Security.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSecurityStatus
 * Security.mmSecurityStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmModification
 * Security.mmModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmRedemptionSchedule
 * Security.mmRedemptionSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesSettlement
 * Security.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesTransfer
 * Security.mmSecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmCorporateActionStandingInstructions
 * Security.mmCorporateActionStandingInstructions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmQuote
 * Security.mmQuote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSecuritiesOrder
 * Security.mmSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmRelatedVariableInterest
 * Security.mmRelatedVariableInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmConversion
 * Security.mmConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmComponentSecurity
 * Security.mmComponentSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmRecompositionIndicator
 * Security.mmRecompositionIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSeries
 * Security.mmSeries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmPercentageOfDebtClaim
 * Security.mmPercentageOfDebtClaim}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmCoverRate
 * Security.mmCoverRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmMaturityRedemption
 * Security.mmMaturityRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmRelatedMarginCall
 * Security.mmRelatedMarginCall}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmCloseLink
 * Security.mmCloseLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmPotentialEuroSystemEligibility
 * Security.mmPotentialEuroSystemEligibility}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmMinimumQuantity
 * Security.mmMinimumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmRestrictedIndicator
 * Security.mmRestrictedIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmIdentifiedSecurity
 * SecuritiesIdentification.mmIdentifiedSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmSecurity
 * Dividend.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSecurity
 * SecuritiesPricing.mmSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmCloseLinkSecurity
 * Party.mmCloseLinkSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmSecurity
 * RedemptionSchedule.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmTradedSecurity
 * TradingMarket.mmTradedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmListedSecurity
 * TradingMarket.mmListedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecurity
 * SecuritiesAccount.mmSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#mmSecurity
 * SecuritiesTax.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecurityIdentification
 * SecuritiesQuantity.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumQuantityDebt
 * SecuritiesQuantity.mmMinimumQuantityDebt}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecurity
 * SecuritiesTrade.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmSecurity
 * SecuritiesTransfer.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#mmSecurity
 * SecuritiesPartyRole.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecurity
 * SecuritiesSettlement.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmSecurity
 * SecuritiesRelatedFees.mmSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesStatus#mmSecurity
 * SecuritiesStatus.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmBenchmarkReference
 * VariableInterest.mmBenchmarkReference}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CouponAttached#mmSecurity
 * CouponAttached.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmSecurityIdentification
 * SecuritiesConversion.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmSecurity
 * BasicSecuritiesRegistration.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#mmSecurity
 * SecuritiesRestriction.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecurity
 * SecuritiesBalance.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmUnderlyingSecurity
 * CorporateActionEvent.mmUnderlyingSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmNewSecurityReferenceData
 * SecuritiesModification.mmNewSecurityReferenceData}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmBenchmarkSecurity
 * Spread.mmBenchmarkSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedSecurity
 * SecuritiesOrder.mmOrderedSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Rating#mmSecurity
 * Rating.mmSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Sector#mmSecurity
 * Sector.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmRegisteredSecurities
 * Jurisdiction.mmRegisteredSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#mmSecurity
 * AgentCorporateActionStandingInstruction.mmSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#mmSecurity
 * MarginCall.mmSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmQuotedSecurity
 * Quote.mmQuotedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ComponentSecurity#mmSecurity
 * ComponentSecurity.mmSecurity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails1#mmFinancialInstrumentAttributes
 * FinancialInstrumentDetails1.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails4#mmFinancialInstrumentAttributes
 * FinancialInstrumentDetails4.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails6#mmFinancialInstrumentAttributes
 * FinancialInstrumentDetails6.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails7#mmFinancialInstrumentAttributes
 * FinancialInstrumentDetails7.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails10#mmFinancialInstrumentAttributes
 * FinancialInstrumentDetails10.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails12#mmFinancialInstrumentAttributes
 * FinancialInstrumentDetails12.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails14#mmFinancialInstrumentAttributes
 * FinancialInstrumentDetails14.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails15#mmFinancialInstrumentAttributes
 * FinancialInstrumentDetails15.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingFinancialInstrument1#mmAttributes
 * UnderlyingFinancialInstrument1.mmAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingFinancialInstrument2#mmAttributes
 * UnderlyingFinancialInstrument2.mmAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument14#mmInstrumentDescription
 * FinancialInstrument14.mmInstrumentDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument15#mmInstrumentDescription
 * FinancialInstrument15.mmInstrumentDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProposalType1Choice#mmSecuritiesCollateral
 * ProposalType1Choice.mmSecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Collateral4#mmSecuritiesCollateral
 * Collateral4.mmSecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution1#mmSecuritiesCollateral
 * CollateralSubstitution1.mmSecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmSecuritiesCollateralDetails
 * CollateralValuation1.mmSecuritiesCollateralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuePosition1#mmSecurities
 * CollateralValuePosition1.mmSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmLegStipulations
 * InstrumentLeg2.mmLegStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleQuote1#mmFinancialInstrumentDetails
 * SingleQuote1.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleQuote1#mmUnderlyingFinancialInstrumentDetails
 * SingleQuote1.mmUnderlyingFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleQuote1#mmFinancialInstrumentAttributes
 * SingleQuote1.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleQuote1#mmUnderlyingFinancialInstrumentAttributes
 * SingleQuote1.mmUnderlyingFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuoteCancellation1Choice#mmFinancialInstrumentDetails
 * QuoteCancellation1Choice.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuoteCancellation1Choice#mmFinancialInstrumentAttributes
 * QuoteCancellation1Choice.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuoteCancellation1Choice#mmUnderlyingFinancialInstrumentDetails
 * QuoteCancellation1Choice.mmUnderlyingFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuoteCancellation1Choice#mmUnderlyingFinancialInstrumentAttributes
 * QuoteCancellation1Choice.mmUnderlyingFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument1#mmAttributes
 * FinancialInstrument1.mmAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstrumentIdentification1Choice#mmOtherFinancialInstrument
 * InstrumentIdentification1Choice.mmOtherFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument2#mmAttributes
 * FinancialInstrument2.mmAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstrumentIdentification2Choice#mmOtherFinancialInstrument
 * InstrumentIdentification2Choice.mmOtherFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg1#mmLegStipulations
 * InstrumentLeg1.mmLegStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#mmFinancialInstrumentDetails
 * QuoteRequest1.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#mmFinancialInstrumentAttributes
 * QuoteRequest1.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#mmUnderlyingFinancialInstrumentDetails
 * QuoteRequest1.mmUnderlyingFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#mmUnderlyingFinancialInstrumentAttributes
 * QuoteRequest1.mmUnderlyingFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestForQuote#mmFinancialInstrumentDetails
 * RequestForQuote.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestForQuote#mmFinancialInstrumentAttributes
 * RequestForQuote.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestForQuote#mmUnderlyingFinancialInstrumentDetails
 * RequestForQuote.mmUnderlyingFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestForQuote#mmUnderlyingFinancialInstrumentAttributes
 * RequestForQuote.mmUnderlyingFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Quote1#mmFinancialInstrumentDetails
 * Quote1.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Quote1#mmUnderlyingFinancialInstrumentDetails
 * Quote1.mmUnderlyingFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Quote1#mmFinancialInstrumentAttributes
 * Quote1.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Quote1#mmUnderlyingFinancialAttributes
 * Quote1.mmUnderlyingFinancialAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution2#mmSecuritiesCollateral
 * CollateralSubstitution2.mmSecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmSecuritiesCollateral
 * CollateralValuation2.mmSecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Collateral7#mmSecuritiesCollateral
 * Collateral7.mmSecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Collateral8#mmSecuritiesCollateral
 * Collateral8.mmSecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution3#mmSecuritiesCollateral
 * CollateralSubstitution3.mmSecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails21#mmFinancialInstrumentAttributes
 * FinancialInstrumentDetails21.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5#mmSecuritiesCollateral
 * CollateralSubstitution5.mmSecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution4#mmSecuritiesCollateral
 * CollateralSubstitution4.mmSecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmSecuritiesCollateral
 * CollateralValuation5.mmSecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Collateral11#mmSecuritiesCollateral
 * Collateral11.mmSecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Collateral12#mmSecuritiesCollateral
 * Collateral12.mmSecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails22#mmFinancialInstrumentAttributes
 * FinancialInstrumentDetails22.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5#mmFinancialInstrumentGeneralAttributes
 * SecuritiesReferenceDataReport5.mmFinancialInstrumentGeneralAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription13#mmFinancialInstrumentGeneralAttributes
 * SecurityInstrumentDescription13.mmFinancialInstrumentGeneralAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails24#mmFinancialInstrumentAttributes
 * FinancialInstrumentDetails24.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Collateral16#mmSecuritiesCollateral
 * Collateral16.mmSecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Collateral17#mmSecuritiesCollateral
 * Collateral17.mmSecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails26#mmFinancialInstrumentAttributes
 * FinancialInstrumentDetails26.mmFinancialInstrumentAttributes}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFundClass
 * InvestmentFundClass}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt Debt}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Equity Equity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Warrant Warrant}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entitlement Entitlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.FormOfSecurity1Choice
 * FormOfSecurity1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.FormOfSecurity2Choice
 * FormOfSecurity2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentDirection1Choice
 * PaymentDirection1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentDirection2Choice
 * PaymentDirection2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.FormOfSecurity3Choice
 * FormOfSecurity3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingSecurity1
 * UnderlyingSecurity1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingSecurity2
 * UnderlyingSecurity2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingSecurity3
 * UnderlyingSecurity3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator1Choice
 * TemporaryFinancialInstrumentIndicator1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator2Choice
 * TemporaryFinancialInstrumentIndicator2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate9 SecurityDate9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate10 SecurityDate10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentDirection3Choice
 * PaymentDirection3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails1
 * FinancialInstrumentDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails4
 * FinancialInstrumentDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails6
 * FinancialInstrumentDetails6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails7
 * FinancialInstrumentDetails7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails10
 * FinancialInstrumentDetails10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails12
 * FinancialInstrumentDetails12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails14
 * FinancialInstrumentDetails14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails15
 * FinancialInstrumentDetails15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails2
 * FinancialInstrumentDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails3
 * FinancialInstrumentDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails5
 * FinancialInstrumentDetails5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails8
 * FinancialInstrumentDetails8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails9
 * FinancialInstrumentDetails9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails11
 * FinancialInstrumentDetails11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails13
 * FinancialInstrumentDetails13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails16
 * FinancialInstrumentDetails16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
 * FinancialInstrumentStipulations}</li>
 * <li>{@linkplain com.tools20022.repository.choice.FormOfSecurity4Choice
 * FormOfSecurity4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingFinancialInstrument1
 * UnderlyingFinancialInstrument1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
 * FinancialInstrumentStipulations2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingFinancialInstrument2
 * UnderlyingFinancialInstrument2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDescription3
 * FinancialInstrumentDescription3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription1
 * SecurityInstrumentDescription1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument14
 * FinancialInstrument14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription2
 * SecurityInstrumentDescription2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument15
 * FinancialInstrument15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCollateral1
 * SecuritiesCollateral1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument28
 * FinancialInstrument28}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Appearance2Choice
 * Appearance2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.FormOfSecurity5Choice
 * FormOfSecurity5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1
 * CommonFinancialInstrumentAttributes1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CloseLink1 CloseLink1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument1
 * FinancialInstrument1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstrumentIdentification1Choice
 * InstrumentIdentification1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument2
 * FinancialInstrument2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstrumentIdentification2Choice
 * InstrumentIdentification2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails17
 * FinancialInstrumentDetails17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails18
 * FinancialInstrumentDetails18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCollateral2
 * SecuritiesCollateral2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCollateral3
 * SecuritiesCollateral3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCollateral4
 * SecuritiesCollateral4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails20
 * FinancialInstrumentDetails20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails21
 * FinancialInstrumentDetails21}</li>
 * <li>{@linkplain com.tools20022.repository.choice.FormOfSecurity6Choice
 * FormOfSecurity6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate12 SecurityDate12}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator3Choice
 * TemporaryFinancialInstrumentIndicator3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCollateral6
 * SecuritiesCollateral6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCollateral5
 * SecuritiesCollateral5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCollateral7
 * SecuritiesCollateral7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator4Choice
 * TemporaryFinancialInstrumentIndicator4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate14 SecurityDate14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails23
 * FinancialInstrumentDetails23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails22
 * FinancialInstrumentDetails22}</li>
 * <li>{@linkplain com.tools20022.repository.choice.FormOfSecurity7Choice
 * FormOfSecurity7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9
 * SecurityInstrumentDescription9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription11
 * SecurityInstrumentDescription11}</li>
 * <li>{@linkplain com.tools20022.repository.choice.FinancialInstrument46Choice
 * FinancialInstrument46Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument53
 * FinancialInstrument53}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransparencyDataReport11
 * TransparencyDataReport11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransparencyDataReport13
 * TransparencyDataReport13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5
 * SecuritiesReferenceDataReport5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransparencyDataReport12
 * TransparencyDataReport12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransparencyDataReport15
 * TransparencyDataReport15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransparencyDataReport10
 * TransparencyDataReport10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransparencyDataReport14
 * TransparencyDataReport14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument58
 * FinancialInstrument58}</li>
 * <li>{@linkplain com.tools20022.repository.choice.FinancialInstrument48Choice
 * FinancialInstrument48Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentAttributes3Choice
 * FinancialInstrumentAttributes3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription13
 * SecurityInstrumentDescription13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails25
 * FinancialInstrumentDetails25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails24
 * FinancialInstrumentDetails24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCollateral8
 * SecuritiesCollateral8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails27
 * FinancialInstrumentDetails27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails26
 * FinancialInstrumentDetails26}</li>
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
 * "Security"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer."
 * </li>
 * </ul>
 */
public class Security extends Asset {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.SecuritiesIdentification> identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmIdentifiedSecurity
	 * SecuritiesIdentification.mmIdentifiedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} = List of 520 elements</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Way(s) of identifying the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> ListBuilderForSecurity_00.addElems(new ArrayList<>());
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Way(s) of identifying the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmIdentifiedSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
		}
	};
	protected CountryCode registeredDistributionCountry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#mmRegisteredDistributionCountry
	 * FinancialInstrument16.mmRegisteredDistributionCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification1#mmRegisteredDistributionCountry
	 * SecurityIdentification1.mmRegisteredDistributionCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmRegisteredDistributionCountry
	 * FinancialInstrument21.mmRegisteredDistributionCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument22#mmRegisteredDistributionCountry
	 * FinancialInstrument22.mmRegisteredDistributionCountry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredDistributionCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country in which the processing characteristic applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRegisteredDistributionCountry = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrument16.mmRegisteredDistributionCountry, SecurityIdentification1.mmRegisteredDistributionCountry, FinancialInstrument21.mmRegisteredDistributionCountry,
					FinancialInstrument22.mmRegisteredDistributionCountry);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegisteredDistributionCountry";
			definition = "Country in which the processing characteristic applies.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getRegisteredDistributionCountry", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode denominationCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#mmDenominationCurrency
	 * FinancialInstrument16.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument8#mmDenominationCurrency
	 * FinancialInstrument8.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmDenominationCurrency
	 * FinancialInstrumentAttributes8.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmDenominationCurrency
	 * FinancialInstrumentAttributes20.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmDenominationCurrency
	 * FinancialInstrumentAttributes35.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmDenominationCurrency
	 * FinancialInstrumentAttributes41.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#mmDenominationCurrency
	 * FinancialInstrumentAttributes6.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#mmDenominationCurrency
	 * FinancialInstrumentAttributes9.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#mmDenominationCurrency
	 * FinancialInstrumentAttributes18.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#mmDenominationCurrency
	 * FinancialInstrumentAttributes22.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#mmDenominationCurrency
	 * FinancialInstrumentAttributes32.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#mmDenominationCurrency
	 * FinancialInstrumentAttributes38.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#mmDenominationCurrency
	 * FinancialInstrumentAttributes7.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#mmDenominationCurrency
	 * FinancialInstrumentAttributes5.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#mmDenominationCurrency
	 * FinancialInstrumentAttributes11.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#mmDenominationCurrency
	 * FinancialInstrumentAttributes10.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#mmDenominationCurrency
	 * FinancialInstrumentAttributes19.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#mmDenominationCurrency
	 * FinancialInstrumentAttributes16.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#mmDenominationCurrency
	 * FinancialInstrumentAttributes23.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#mmDenominationCurrency
	 * FinancialInstrumentAttributes24.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#mmDenominationCurrency
	 * FinancialInstrumentAttributes33.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#mmDenominationCurrency
	 * FinancialInstrumentAttributes34.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#mmDenominationCurrency
	 * FinancialInstrumentAttributes39.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#mmDenominationCurrency
	 * FinancialInstrumentAttributes40.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#mmDenominationCurrency
	 * FinancialInstrumentAttributes43.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#mmDenominationCurrency
	 * FinancialInstrumentAttributes45.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmDenominationCurrency
	 * FinancialInstrumentAttributes4.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmDenominationCurrency
	 * FinancialInstrumentAttributes13.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmDenominationCurrency
	 * FinancialInstrumentAttributes21.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmDenominationCurrency
	 * FinancialInstrumentAttributes26.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmDenominationCurrency
	 * FinancialInstrumentAttributes36.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmDenominationCurrency
	 * FinancialInstrumentAttributes42.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmDenominationCurrency
	 * FinancialInstrumentAttributes27.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmDenominationCurrency
	 * FinancialInstrument21.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmDenominationCurrency
	 * FinancialInstrumentAttributes14.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument22#mmDenominationCurrency
	 * FinancialInstrument22.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmDenominationCurrency
	 * FinancialInstrumentAttributes30.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmDenominationCurrency
	 * FinancialInstrumentAttributes28.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmDenominationCurrency
	 * FinancialInstrumentAttributes1.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmCurrency
	 * FinancialInstrumentStipulations.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmDenominationCurrency
	 * FinancialInstrumentAttributes31.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmCurrency
	 * FinancialInstrumentStipulations2.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmDenominationCurrency
	 * FinancialInstrumentAttributes44.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmNewDenominationCurrency
	 * CorporateAction2.mmNewDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmDenominationCurrency
	 * FinancialInstrumentAttributes15.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmDenominationCurrency
	 * FinancialInstrumentAttributes29.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#mmDenominationCurrency
	 * CommonFinancialInstrumentAttributes1.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmDenominationCurrency
	 * FinancialInstrumentAttributes2.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmDenominationCurrency
	 * FinancialInstrumentAttributes48.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#mmDenominationCurrency
	 * FinancialInstrumentAttributes50.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmDenominationCurrency
	 * FinancialInstrumentAttributes49.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#mmDenominationCurrency
	 * FinancialInstrumentAttributes55.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#mmDenominationCurrency
	 * FinancialInstrumentAttributes57.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#mmDenominationCurrency
	 * FinancialInstrumentAttributes56.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmDenominationCurrency
	 * FinancialInstrumentAttributes63.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmDenominationCurrency
	 * FinancialInstrumentAttributes64.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmDenominationCurrency
	 * FinancialInstrumentAttributes66.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#mmDenominationCurrency
	 * FinancialInstrumentAttributes65.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmDenominationCurrency
	 * FinancialInstrumentAttributes67.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#mmDenominationCurrency
	 * FinancialInstrumentAttributes70.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#mmDenominationCurrency
	 * FinancialInstrumentAttributes69.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#mmDenominationCurrency
	 * FinancialInstrumentAttributes71.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmDenominationCurrency
	 * FinancialInstrumentAttributes75.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmDenominationCurrency
	 * FinancialInstrumentAttributes78.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmDenominationCurrency
	 * FinancialInstrumentAttributes79.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmDenominationCurrency
	 * FinancialInstrumentAttributes81.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmDenominationCurrency
	 * FinancialInstrumentAttributes80.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#mmDenominationCurrency
	 * FinancialInstrumentAttributes85.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#mmDenominationCurrency
	 * FinancialInstrumentAttributes84.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#mmDenominationCurrency
	 * FinancialInstrumentAttributes83.mmDenominationCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which a security is issued or redenominated."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDenominationCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrument16.mmDenominationCurrency, FinancialInstrument8.mmDenominationCurrency, FinancialInstrumentAttributes8.mmDenominationCurrency,
					FinancialInstrumentAttributes20.mmDenominationCurrency, FinancialInstrumentAttributes35.mmDenominationCurrency, FinancialInstrumentAttributes41.mmDenominationCurrency,
					FinancialInstrumentAttributes6.mmDenominationCurrency, FinancialInstrumentAttributes9.mmDenominationCurrency, FinancialInstrumentAttributes18.mmDenominationCurrency,
					FinancialInstrumentAttributes22.mmDenominationCurrency, FinancialInstrumentAttributes32.mmDenominationCurrency, FinancialInstrumentAttributes38.mmDenominationCurrency,
					FinancialInstrumentAttributes7.mmDenominationCurrency, FinancialInstrumentAttributes5.mmDenominationCurrency, FinancialInstrumentAttributes11.mmDenominationCurrency,
					FinancialInstrumentAttributes10.mmDenominationCurrency, FinancialInstrumentAttributes19.mmDenominationCurrency, FinancialInstrumentAttributes16.mmDenominationCurrency,
					FinancialInstrumentAttributes23.mmDenominationCurrency, FinancialInstrumentAttributes24.mmDenominationCurrency, FinancialInstrumentAttributes33.mmDenominationCurrency,
					FinancialInstrumentAttributes34.mmDenominationCurrency, FinancialInstrumentAttributes39.mmDenominationCurrency, FinancialInstrumentAttributes40.mmDenominationCurrency,
					FinancialInstrumentAttributes43.mmDenominationCurrency, FinancialInstrumentAttributes45.mmDenominationCurrency, FinancialInstrumentAttributes4.mmDenominationCurrency,
					FinancialInstrumentAttributes13.mmDenominationCurrency, FinancialInstrumentAttributes21.mmDenominationCurrency, FinancialInstrumentAttributes26.mmDenominationCurrency,
					FinancialInstrumentAttributes36.mmDenominationCurrency, FinancialInstrumentAttributes42.mmDenominationCurrency, FinancialInstrumentAttributes27.mmDenominationCurrency, FinancialInstrument21.mmDenominationCurrency,
					FinancialInstrumentAttributes14.mmDenominationCurrency, FinancialInstrument22.mmDenominationCurrency, FinancialInstrumentAttributes30.mmDenominationCurrency, FinancialInstrumentAttributes28.mmDenominationCurrency,
					FinancialInstrumentAttributes1.mmDenominationCurrency, FinancialInstrumentStipulations.mmCurrency, FinancialInstrumentAttributes31.mmDenominationCurrency, FinancialInstrumentStipulations2.mmCurrency,
					FinancialInstrumentAttributes44.mmDenominationCurrency, CorporateAction2.mmNewDenominationCurrency, FinancialInstrumentAttributes15.mmDenominationCurrency, FinancialInstrumentAttributes29.mmDenominationCurrency,
					CommonFinancialInstrumentAttributes1.mmDenominationCurrency, FinancialInstrumentAttributes2.mmDenominationCurrency, FinancialInstrumentAttributes48.mmDenominationCurrency,
					FinancialInstrumentAttributes50.mmDenominationCurrency, FinancialInstrumentAttributes49.mmDenominationCurrency, FinancialInstrumentAttributes55.mmDenominationCurrency,
					FinancialInstrumentAttributes57.mmDenominationCurrency, FinancialInstrumentAttributes56.mmDenominationCurrency, FinancialInstrumentAttributes63.mmDenominationCurrency,
					FinancialInstrumentAttributes64.mmDenominationCurrency, FinancialInstrumentAttributes66.mmDenominationCurrency, FinancialInstrumentAttributes65.mmDenominationCurrency,
					FinancialInstrumentAttributes67.mmDenominationCurrency, FinancialInstrumentAttributes70.mmDenominationCurrency, FinancialInstrumentAttributes69.mmDenominationCurrency,
					FinancialInstrumentAttributes71.mmDenominationCurrency, FinancialInstrumentAttributes75.mmDenominationCurrency, FinancialInstrumentAttributes78.mmDenominationCurrency,
					FinancialInstrumentAttributes79.mmDenominationCurrency, FinancialInstrumentAttributes81.mmDenominationCurrency, FinancialInstrumentAttributes80.mmDenominationCurrency,
					FinancialInstrumentAttributes85.mmDenominationCurrency, FinancialInstrumentAttributes84.mmDenominationCurrency, FinancialInstrumentAttributes83.mmDenominationCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DenominationCurrency";
			definition = "Currency in which a security is issued or redenominated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getDenominationCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FormOfSecurityCode registrationForm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FormOfSecurityCode
	 * FormOfSecurityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#mmSecuritiesForm
	 * FinancialInstrument16.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument17#mmSecuritiesForm
	 * FinancialInstrument17.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument6#mmSecuritiesForm
	 * FinancialInstrument6.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument10#mmSecuritiesForm
	 * FinancialInstrument10.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29#mmSecuritiesForm
	 * FinancialInstrument29.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument3#mmSecuritiesForm
	 * FinancialInstrument3.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument5#mmSecuritiesForm
	 * FinancialInstrument5.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument8#mmSecuritiesForm
	 * FinancialInstrument8.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#mmSecuritiesForm
	 * InvestmentAccount10.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount11#mmSecuritiesForm
	 * InvestmentAccount11.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument13#mmSecuritiesForm
	 * FinancialInstrument13.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#mmSecuritiesForm
	 * InvestmentAccount22.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount24#mmSecuritiesForm
	 * InvestmentAccount24.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity1Choice#mmCode
	 * FormOfSecurity1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity1Choice#mmProprietary
	 * FormOfSecurity1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity2Choice#mmCode
	 * FormOfSecurity2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity2Choice#mmProprietary
	 * FormOfSecurity2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmRegistrationForm
	 * FinancialInstrumentAttributes8.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmRegistrationForm
	 * FinancialInstrumentAttributes20.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmRegistrationForm
	 * FinancialInstrumentAttributes35.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity3Choice#mmCode
	 * FormOfSecurity3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity3Choice#mmProprietary
	 * FormOfSecurity3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmRegistrationForm
	 * FinancialInstrumentAttributes41.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmRegistrationForm
	 * FinancialInstrumentAttributes4.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmRegistrationForm
	 * FinancialInstrumentAttributes13.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmRegistrationForm
	 * FinancialInstrumentAttributes21.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmRegistrationForm
	 * FinancialInstrumentAttributes26.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmRegistrationForm
	 * FinancialInstrumentAttributes36.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmRegistrationForm
	 * FinancialInstrumentAttributes42.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmRegistrationForm
	 * FinancialInstrumentAttributes27.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmSecuritiesForm
	 * FinancialInstrument21.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmRegistrationForm
	 * FinancialInstrumentAttributes14.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument22#mmSecuritiesForm
	 * FinancialInstrument22.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument4#mmSecuritiesForm
	 * FinancialInstrument4.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmRegistrationForm
	 * FinancialInstrumentAttributes30.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmRegistrationForm
	 * FinancialInstrumentAttributes28.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmRegistrationForm
	 * FinancialInstrumentAttributes1.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity4Choice#mmCode
	 * FormOfSecurity4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity4Choice#mmProprietary
	 * FormOfSecurity4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmRegistrationForm
	 * FinancialInstrumentAttributes31.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmRegistrationForm
	 * FinancialInstrumentAttributes44.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument9#mmSecuritiesForm
	 * FinancialInstrument9.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1#mmForm
	 * InvestmentFundTransactionsByFund1.mmForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund2#mmSecuritiesForm
	 * InvestmentFundTransactionsByFund2.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount9#mmSecurityHoldingForm
	 * SecuritiesAccount9.mmSecurityHoldingForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount12#mmSecurityHoldingForm
	 * SecuritiesAccount12.mmSecurityHoldingForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount8#mmSecurityHoldingForm
	 * SecuritiesAccount8.mmSecurityHoldingForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount10#mmSecurityHoldingForm
	 * SecuritiesAccount10.mmSecurityHoldingForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmRegistrationForm
	 * FinancialInstrumentAttributes15.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmRegistrationForm
	 * FinancialInstrumentAttributes29.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument19#mmSecuritiesForm
	 * FinancialInstrument19.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity5Choice#mmCode
	 * FormOfSecurity5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity5Choice#mmProprietary
	 * FormOfSecurity5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmRegistrationForm
	 * FinancialInstrumentAttributes2.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#mmSecuritiesForm
	 * InvestmentAccount40.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount41#mmSecuritiesForm
	 * InvestmentAccount41.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund3#mmSecuritiesForm
	 * InvestmentFundTransactionsByFund3.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance1#mmHoldingForm
	 * AggregateHoldingBalance1.mmHoldingForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmRegistrationForm
	 * FinancialInstrumentAttributes63.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmRegistrationForm
	 * FinancialInstrumentAttributes64.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity6Choice#mmCode
	 * FormOfSecurity6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity6Choice#mmProprietary
	 * FormOfSecurity6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#mmSecuritiesForm
	 * InvestmentAccount54.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#mmSecuritiesForm
	 * InvestmentAccount56.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmSecuritiesForm
	 * FinancialInstrument51.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#mmSecuritiesForm
	 * InvestmentAccount55.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument45#mmSecuritiesForm
	 * FinancialInstrument45.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument49#mmSecuritiesForm
	 * FinancialInstrument49.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#mmSecuritiesForm
	 * InvestmentAccount57.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmRegistrationForm
	 * FinancialInstrumentAttributes75.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmRegistrationForm
	 * FinancialInstrumentAttributes78.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity7Choice#mmCode
	 * FormOfSecurity7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity7Choice#mmProprietary
	 * FormOfSecurity7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#mmSecuritiesForm
	 * FinancialInstrument57.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmSecuritiesForm
	 * FinancialInstrument56.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument55#mmSecuritiesForm
	 * FinancialInstrument55.mmSecuritiesForm}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the form, ie, ownership, of the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRegistrationForm = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrument16.mmSecuritiesForm, FinancialInstrument17.mmSecuritiesForm, FinancialInstrument6.mmSecuritiesForm, FinancialInstrument10.mmSecuritiesForm,
					FinancialInstrument29.mmSecuritiesForm, FinancialInstrument3.mmSecuritiesForm, FinancialInstrument5.mmSecuritiesForm, FinancialInstrument8.mmSecuritiesForm, InvestmentAccount10.mmSecuritiesForm,
					InvestmentAccount11.mmSecuritiesForm, FinancialInstrument13.mmSecuritiesForm, InvestmentAccount22.mmSecuritiesForm, InvestmentAccount24.mmSecuritiesForm, FormOfSecurity1Choice.mmCode,
					FormOfSecurity1Choice.mmProprietary, FormOfSecurity2Choice.mmCode, FormOfSecurity2Choice.mmProprietary, FinancialInstrumentAttributes8.mmRegistrationForm, FinancialInstrumentAttributes20.mmRegistrationForm,
					FinancialInstrumentAttributes35.mmRegistrationForm, FormOfSecurity3Choice.mmCode, FormOfSecurity3Choice.mmProprietary, FinancialInstrumentAttributes41.mmRegistrationForm,
					FinancialInstrumentAttributes4.mmRegistrationForm, FinancialInstrumentAttributes13.mmRegistrationForm, FinancialInstrumentAttributes21.mmRegistrationForm, FinancialInstrumentAttributes26.mmRegistrationForm,
					FinancialInstrumentAttributes36.mmRegistrationForm, FinancialInstrumentAttributes42.mmRegistrationForm, FinancialInstrumentAttributes27.mmRegistrationForm, FinancialInstrument21.mmSecuritiesForm,
					FinancialInstrumentAttributes14.mmRegistrationForm, FinancialInstrument22.mmSecuritiesForm, FinancialInstrument4.mmSecuritiesForm, FinancialInstrumentAttributes30.mmRegistrationForm,
					FinancialInstrumentAttributes28.mmRegistrationForm, FinancialInstrumentAttributes1.mmRegistrationForm, FormOfSecurity4Choice.mmCode, FormOfSecurity4Choice.mmProprietary,
					FinancialInstrumentAttributes31.mmRegistrationForm, FinancialInstrumentAttributes44.mmRegistrationForm, FinancialInstrument9.mmSecuritiesForm, InvestmentFundTransactionsByFund1.mmForm,
					InvestmentFundTransactionsByFund2.mmSecuritiesForm, SecuritiesAccount9.mmSecurityHoldingForm, SecuritiesAccount12.mmSecurityHoldingForm, SecuritiesAccount8.mmSecurityHoldingForm,
					SecuritiesAccount10.mmSecurityHoldingForm, FinancialInstrumentAttributes15.mmRegistrationForm, FinancialInstrumentAttributes29.mmRegistrationForm, FinancialInstrument19.mmSecuritiesForm, FormOfSecurity5Choice.mmCode,
					FormOfSecurity5Choice.mmProprietary, FinancialInstrumentAttributes2.mmRegistrationForm, InvestmentAccount40.mmSecuritiesForm, InvestmentAccount41.mmSecuritiesForm, InvestmentFundTransactionsByFund3.mmSecuritiesForm,
					AggregateHoldingBalance1.mmHoldingForm, FinancialInstrumentAttributes63.mmRegistrationForm, FinancialInstrumentAttributes64.mmRegistrationForm, FormOfSecurity6Choice.mmCode, FormOfSecurity6Choice.mmProprietary,
					InvestmentAccount54.mmSecuritiesForm, InvestmentAccount56.mmSecuritiesForm, FinancialInstrument51.mmSecuritiesForm, InvestmentAccount55.mmSecuritiesForm, FinancialInstrument45.mmSecuritiesForm,
					FinancialInstrument49.mmSecuritiesForm, InvestmentAccount57.mmSecuritiesForm, FinancialInstrumentAttributes75.mmRegistrationForm, FinancialInstrumentAttributes78.mmRegistrationForm, FormOfSecurity7Choice.mmCode,
					FormOfSecurity7Choice.mmProprietary, FinancialInstrument57.mmSecuritiesForm, FinancialInstrument56.mmSecuritiesForm, FinancialInstrument55.mmSecuritiesForm);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationForm";
			definition = "Specifies the form, ie, ownership, of the security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FormOfSecurityCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getRegistrationForm", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator dematerialisedIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#mmDematerialisedIndicator
	 * FinancialInstrument16.mmDematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#mmDematerialisedIndicator
	 * InvestmentAccount10.mmDematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount11#mmDematerialisedIndicator
	 * InvestmentAccount11.mmDematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#mmDematerialisedIndicator
	 * InvestmentAccount22.mmDematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount24#mmDematerialisedIndicator
	 * InvestmentAccount24.mmDematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#mmDematerialisedIndicator
	 * InvestmentAccount40.mmDematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount41#mmDematerialisedIndicator
	 * InvestmentAccount41.mmDematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#mmDematerialisedIndicator
	 * InvestmentAccount54.mmDematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#mmDematerialisedIndicator
	 * InvestmentAccount56.mmDematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#mmDematerialisedIndicator
	 * InvestmentAccount55.mmDematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#mmDematerialisedIndicator
	 * InvestmentAccount57.mmDematerialisedIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DematerialisedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a security exists only as an electronic record, ie, there is no physical document representing the security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDematerialisedIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrument16.mmDematerialisedIndicator, InvestmentAccount10.mmDematerialisedIndicator, InvestmentAccount11.mmDematerialisedIndicator, InvestmentAccount22.mmDematerialisedIndicator,
					InvestmentAccount24.mmDematerialisedIndicator, InvestmentAccount40.mmDematerialisedIndicator, InvestmentAccount41.mmDematerialisedIndicator, InvestmentAccount54.mmDematerialisedIndicator,
					InvestmentAccount56.mmDematerialisedIndicator, InvestmentAccount55.mmDematerialisedIndicator, InvestmentAccount57.mmDematerialisedIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DematerialisedIndicator";
			definition = "Indicates whether a security exists only as an electronic record, ie, there is no physical document representing the security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getDematerialisedIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected EUSavingsDirectiveCode eUSavingsDirective;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EUSavingsDirectiveCode
	 * EUSavingsDirectiveCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#mmEUSavingsDirective
	 * FinancialInstrument16.mmEUSavingsDirective}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#mmEUSavingsDirective
	 * FinancialInstrument20.mmEUSavingsDirective}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUSavingsDirective"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the investment fund class is subject to the European Union Saving Directive."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEUSavingsDirective = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrument16.mmEUSavingsDirective, FinancialInstrument20.mmEUSavingsDirective);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EUSavingsDirective";
			definition = "Indicates whether the investment fund class is subject to the European Union Saving Directive.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EUSavingsDirectiveCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getEUSavingsDirective", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesQuantity> securitiesQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecurityIdentification
	 * SecuritiesQuantity.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument26#mmQuantity
	 * FinancialInstrument26.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument30#mmQuantity
	 * FinancialInstrument30.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument24#mmQuantity
	 * FinancialInstrument24.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument33#mmQuantity
	 * FinancialInstrument33.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument23#mmQuantity
	 * FinancialInstrument23.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument31#mmQuantity
	 * FinancialInstrument31.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification33#mmOwnedSecuritiesQuantity
	 * PartyIdentification33.mmOwnedSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity3#mmFinancialInstrumentQuantity
	 * AmountPricePerFinancialInstrumentQuantity3.mmFinancialInstrumentQuantity}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification34#mmOwnedSecuritiesQuantity
	 * PartyIdentification34.mmOwnedSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity4#mmFinancialInstrumentQuantity
	 * AmountPricePerFinancialInstrumentQuantity4.mmFinancialInstrumentQuantity}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification50#mmOwnedSecuritiesQuantity
	 * PartyIdentification50.mmOwnedSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification51#mmOwnedSecuritiesQuantity
	 * PartyIdentification51.mmOwnedSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification56#mmOwnedSecuritiesQuantity
	 * PartyIdentification56.mmOwnedSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification57#mmOwnedSecuritiesQuantity
	 * PartyIdentification57.mmOwnedSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes3#mmQuantity
	 * FinancialInstrumentAttributes3.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes12#mmQuantity
	 * FinancialInstrumentAttributes12.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes17#mmQuantity
	 * FinancialInstrumentAttributes17.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes25#mmQuantity
	 * FinancialInstrumentAttributes25.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes46#mmQuantity
	 * FinancialInstrumentAttributes46.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes47#mmQuantity
	 * FinancialInstrumentAttributes47.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAvailability#mmQuantity
	 * QuantityAndAvailability.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation3#mmQuantity
	 * AdditionalInformation3.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation4#mmQuantity
	 * AdditionalInformation4.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation7#mmQuantity
	 * AdditionalInformation7.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation8#mmQuantity
	 * AdditionalInformation8.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#mmQuantity
	 * UnderlyingAttributes.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#mmAdjustedQuantity
	 * UnderlyingAttributes.mmAdjustedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity1#mmFinancialInstrumentQuantity
	 * AmountPricePerFinancialInstrumentQuantity1.mmFinancialInstrumentQuantity}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmElectedSecuritiesQuantity
	 * BeneficialOwner1.mmElectedSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral1#mmQuantity
	 * SecuritiesCollateral1.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5#mmFinancialInstrumentQuantity
	 * AmountPricePerFinancialInstrumentQuantity5.mmFinancialInstrumentQuantity}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes2#mmQuantity
	 * UnderlyingAttributes2.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes2#mmAdjustedQuantity
	 * UnderlyingAttributes2.mmAdjustedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#mmPositionLimit
	 * CommonFinancialInstrumentAttributes1.mmPositionLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument37#mmQuantity
	 * FinancialInstrument37.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument35#mmQuantity
	 * FinancialInstrument35.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument34#mmQuantity
	 * FinancialInstrument34.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9#mmQuantity
	 * AdditionalInformation9.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation10#mmQuantity
	 * AdditionalInformation10.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument40#mmQuantity
	 * FinancialInstrument40.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39#mmQuantity
	 * FinancialInstrument39.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral2#mmQuantity
	 * SecuritiesCollateral2.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral2#mmBlockedQuantity
	 * SecuritiesCollateral2.mmBlockedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherTypeOfCollateral2#mmQuantity
	 * OtherTypeOfCollateral2.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#mmQuantity
	 * SecuritiesCollateral3.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#mmBlockedQuantity
	 * OtherCollateral3.mmBlockedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#mmQuantity
	 * SecuritiesCollateral4.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmQuantity
	 * SecuritiesTransaction1.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation11#mmQuantity
	 * AdditionalInformation11.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6#mmLegOrderQuantity
	 * InstrumentLeg6.mmLegOrderQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification93#mmOwnedSecuritiesQuantity
	 * PartyIdentification93.mmOwnedSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#mmQuantity
	 * FinancialInstrumentAttributes68.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity6#mmFinancialInstrumentQuantity
	 * AmountPricePerFinancialInstrumentQuantity6.mmFinancialInstrumentQuantity}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#mmQuantity
	 * FinancialInstrument48.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47#mmQuantity
	 * FinancialInstrument47.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#mmQuantity
	 * FinancialInstrument46.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmBlockedQuantity
	 * OtherCollateral6.mmBlockedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#mmQuantity
	 * SecuritiesCollateral6.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#mmBlockedQuantity
	 * SecuritiesCollateral6.mmBlockedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5#mmQuantity
	 * SecuritiesCollateral5.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmQuantity
	 * SecuritiesCollateral7.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification101#mmOwnedSecuritiesQuantity
	 * PartyIdentification101.mmOwnedSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes73#mmQuantity
	 * FinancialInstrumentAttributes73.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity7#mmFinancialInstrumentQuantity
	 * AmountPricePerFinancialInstrumentQuantity7.mmFinancialInstrumentQuantity}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation12#mmQuantity
	 * AdditionalInformation12.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation13#mmQuantity
	 * AdditionalInformation13.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#mmQuantity
	 * SecuritiesCollateral8.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation14#mmQuantity
	 * AdditionalInformation14.mmQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the quantity associated with a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrument26.mmQuantity, FinancialInstrument30.mmQuantity, FinancialInstrument24.mmQuantity, FinancialInstrument33.mmQuantity, FinancialInstrument23.mmQuantity,
					FinancialInstrument31.mmQuantity, PartyIdentification33.mmOwnedSecuritiesQuantity, AmountPricePerFinancialInstrumentQuantity3.mmFinancialInstrumentQuantity, PartyIdentification34.mmOwnedSecuritiesQuantity,
					AmountPricePerFinancialInstrumentQuantity4.mmFinancialInstrumentQuantity, PartyIdentification50.mmOwnedSecuritiesQuantity, PartyIdentification51.mmOwnedSecuritiesQuantity,
					PartyIdentification56.mmOwnedSecuritiesQuantity, PartyIdentification57.mmOwnedSecuritiesQuantity, FinancialInstrumentAttributes3.mmQuantity, FinancialInstrumentAttributes12.mmQuantity,
					FinancialInstrumentAttributes17.mmQuantity, FinancialInstrumentAttributes25.mmQuantity, FinancialInstrumentAttributes46.mmQuantity, FinancialInstrumentAttributes47.mmQuantity, QuantityAndAvailability.mmQuantity,
					AdditionalInformation3.mmQuantity, AdditionalInformation4.mmQuantity, AdditionalInformation7.mmQuantity, AdditionalInformation8.mmQuantity, UnderlyingAttributes.mmQuantity, UnderlyingAttributes.mmAdjustedQuantity,
					AmountPricePerFinancialInstrumentQuantity1.mmFinancialInstrumentQuantity, BeneficialOwner1.mmElectedSecuritiesQuantity, SecuritiesCollateral1.mmQuantity,
					AmountPricePerFinancialInstrumentQuantity5.mmFinancialInstrumentQuantity, UnderlyingAttributes2.mmQuantity, UnderlyingAttributes2.mmAdjustedQuantity, CommonFinancialInstrumentAttributes1.mmPositionLimit,
					FinancialInstrument37.mmQuantity, FinancialInstrument35.mmQuantity, FinancialInstrument34.mmQuantity, AdditionalInformation9.mmQuantity, AdditionalInformation10.mmQuantity, FinancialInstrument40.mmQuantity,
					FinancialInstrument39.mmQuantity, SecuritiesCollateral2.mmQuantity, SecuritiesCollateral2.mmBlockedQuantity, OtherTypeOfCollateral2.mmQuantity, SecuritiesCollateral3.mmQuantity, OtherCollateral3.mmBlockedQuantity,
					SecuritiesCollateral4.mmQuantity, SecuritiesTransaction1.mmQuantity, AdditionalInformation11.mmQuantity, InstrumentLeg6.mmLegOrderQuantity, PartyIdentification93.mmOwnedSecuritiesQuantity,
					FinancialInstrumentAttributes68.mmQuantity, AmountPricePerFinancialInstrumentQuantity6.mmFinancialInstrumentQuantity, FinancialInstrument48.mmQuantity, FinancialInstrument47.mmQuantity, FinancialInstrument46.mmQuantity,
					OtherCollateral6.mmBlockedQuantity, SecuritiesCollateral6.mmQuantity, SecuritiesCollateral6.mmBlockedQuantity, SecuritiesCollateral5.mmQuantity, SecuritiesCollateral7.mmQuantity,
					PartyIdentification101.mmOwnedSecuritiesQuantity, FinancialInstrumentAttributes73.mmQuantity, AmountPricePerFinancialInstrumentQuantity7.mmFinancialInstrumentQuantity, AdditionalInformation12.mmQuantity,
					AdditionalInformation13.mmQuantity, SecuritiesCollateral8.mmQuantity, AdditionalInformation14.mmQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Specifies the quantity associated with a security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmSecurityIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesRelatedFees> fees;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmSecurity
	 * SecuritiesRelatedFees.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees
	 * SecuritiesRelatedFees}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice6#mmChargeDetails
	 * UnitPrice6.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmChargeDetails
	 * UnitPrice15.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation2#mmChargeDetails
	 * DeliverInformation2.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation4#mmChargeDetails
	 * DeliverInformation4.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation7#mmChargeDetails
	 * DeliverInformation7.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation2#mmChargeDetails
	 * ReceiveInformation2.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation4#mmChargeDetails
	 * ReceiveInformation4.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation8#mmChargeDetails
	 * ReceiveInformation8.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation6#mmChargeDetails
	 * ReceiveInformation6.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation11#mmChargeDetails
	 * ReceiveInformation11.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation11#mmChargeDetails
	 * DeliverInformation11.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation3#mmChargeDetails
	 * DeliverInformation3.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation8#mmChargeDetails
	 * DeliverInformation8.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation3#mmChargeDetails
	 * ReceiveInformation3.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation7#mmChargeDetails
	 * ReceiveInformation7.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation5#mmChargeDetails
	 * ReceiveInformation5.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#mmChargeDetails
	 * ReceiveInformation9.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation5#mmChargeDetails
	 * DeliverInformation5.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#mmChargeDetails
	 * DeliverInformation9.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation6#mmChargeDetails
	 * DeliverInformation6.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmMatchingConfirmationFee
	 * OtherAmounts16.mmMatchingConfirmationFee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmMarketMemberFeeAmount
	 * OtherAmounts16.mmMarketMemberFeeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts16#mmOddLotFee
	 * OtherAmounts16.mmOddLotFee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#mmChargeDetails
	 * ReceiveInformation13.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12#mmChargeDetails
	 * ReceiveInformation12.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation12#mmChargeDetails
	 * DeliverInformation12.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#mmChargeDetails
	 * DeliverInformation13.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#mmChargeDetails
	 * DeliverInformation15.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation14#mmChargeDetails
	 * DeliverInformation14.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#mmChargeDetails
	 * ReceiveInformation15.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14#mmChargeDetails
	 * ReceiveInformation14.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#mmChargeDetails
	 * ReceiveInformation17.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#mmChargeDetails
	 * ReceiveInformation16.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmChargeDetails
	 * DeliverInformation16.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#mmChargeDetails
	 * DeliverInformation17.mmChargeDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fees related to securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmFees = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(UnitPrice6.mmChargeDetails, UnitPrice15.mmChargeDetails, DeliverInformation2.mmChargeDetails, DeliverInformation4.mmChargeDetails, DeliverInformation7.mmChargeDetails,
					ReceiveInformation2.mmChargeDetails, ReceiveInformation4.mmChargeDetails, ReceiveInformation8.mmChargeDetails, ReceiveInformation6.mmChargeDetails, ReceiveInformation11.mmChargeDetails,
					DeliverInformation11.mmChargeDetails, DeliverInformation3.mmChargeDetails, DeliverInformation8.mmChargeDetails, ReceiveInformation3.mmChargeDetails, ReceiveInformation7.mmChargeDetails,
					ReceiveInformation5.mmChargeDetails, ReceiveInformation9.mmChargeDetails, DeliverInformation5.mmChargeDetails, DeliverInformation9.mmChargeDetails, DeliverInformation6.mmChargeDetails,
					OtherAmounts16.mmMatchingConfirmationFee, OtherAmounts16.mmMarketMemberFeeAmount, OtherAmounts16.mmOddLotFee, ReceiveInformation13.mmChargeDetails, ReceiveInformation12.mmChargeDetails,
					DeliverInformation12.mmChargeDetails, DeliverInformation13.mmChargeDetails, DeliverInformation15.mmChargeDetails, DeliverInformation14.mmChargeDetails, ReceiveInformation15.mmChargeDetails,
					ReceiveInformation14.mmChargeDetails, ReceiveInformation17.mmChargeDetails, ReceiveInformation16.mmChargeDetails, DeliverInformation16.mmChargeDetails, DeliverInformation17.mmChargeDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Fees";
			definition = "Fees related to securities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesRelatedFees.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesRelatedFees.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesPricing> pricing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSecurity
	 * SecuritiesPricing.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit1#mmPriceDetails
	 * Unit1.mmPriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit3#mmPriceDetails
	 * Unit3.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#mmIssuePrice
	 * FinancialInstrumentAttributes5.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#mmIssuePrice
	 * FinancialInstrumentAttributes10.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#mmIssuePrice
	 * FinancialInstrumentAttributes16.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#mmIssuePrice
	 * FinancialInstrumentAttributes24.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#mmIssuePrice
	 * FinancialInstrumentAttributes34.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#mmIssuePrice
	 * FinancialInstrumentAttributes40.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace7.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmPriceDetails
	 * AggregateBalanceInformation8.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace10.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#mmPriceDetails
	 * AggregateBalanceInformation11.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace2.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation2#mmPriceDetails
	 * AggregateBalanceInformation2.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace4.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#mmPriceDetails
	 * AggregateBalanceInformation3.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace12.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#mmPriceDetails
	 * AggregateBalanceInformation13.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace14.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#mmPriceDetails
	 * AggregateBalanceInformation15.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace16.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#mmPriceDetails
	 * AggregateBalanceInformation17.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace18.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#mmPriceDetails
	 * AggregateBalanceInformation19.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace21.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#mmPriceDetails
	 * AggregateBalanceInformation22.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace22.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#mmPriceDetails
	 * AggregateBalanceInformation23.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace8.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#mmPriceDetails
	 * AggregateBalanceInformation9.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace9.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#mmPriceDetails
	 * AggregateBalanceInformation10.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace1.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1#mmPriceDetails
	 * AggregateBalanceInformation1.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace3.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#mmPriceDetails
	 * AggregateBalanceInformation4.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace11.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#mmPriceDetails
	 * AggregateBalanceInformation12.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace13.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#mmPriceDetails
	 * AggregateBalanceInformation14.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace15.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#mmPriceDetails
	 * AggregateBalanceInformation16.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace17.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#mmPriceDetails
	 * AggregateBalanceInformation18.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace20.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#mmPriceDetails
	 * AggregateBalanceInformation21.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace23.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#mmPriceDetails
	 * AggregateBalanceInformation24.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails2#mmPriceDetails
	 * FinancialInstrumentDetails2.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails3#mmPriceDetails
	 * FinancialInstrumentDetails3.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails5#mmPriceDetails
	 * FinancialInstrumentDetails5.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails8#mmPriceDetails
	 * FinancialInstrumentDetails8.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails9#mmPriceDetails
	 * FinancialInstrumentDetails9.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails11#mmPriceDetails
	 * FinancialInstrumentDetails11.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails13#mmPriceDetails
	 * FinancialInstrumentDetails13.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails16#mmPriceDetails
	 * FinancialInstrumentDetails16.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#mmPrice
	 * UnderlyingAttributes.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#mmEndPrice
	 * UnderlyingAttributes.mmEndPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmPriceRange
	 * FinancialInstrumentStipulations.mmPriceRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmPriceRange
	 * FinancialInstrumentStipulations2.mmPriceRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription1#mmStrikePrice
	 * SecurityInstrumentDescription1.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription2#mmStrikePrice
	 * SecurityInstrumentDescription2.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral1#mmPrice
	 * SecuritiesCollateral1.mmPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFund1#mmPrice
	 * InvestmentFund1.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation5#mmPriceDetails
	 * AggregateBalanceInformation5.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes2#mmPrice
	 * UnderlyingAttributes2.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes2#mmEndPrice
	 * UnderlyingAttributes2.mmEndPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValue1#mmValuationPrice
	 * CollateralValue1.mmValuationPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace19.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#mmPriceDetails
	 * AggregateBalanceInformation20.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#mmPreviousClosingPrice
	 * ListStrikePriceDetails1.mmPreviousClosingPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace6.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6#mmPriceDetails
	 * AggregateBalanceInformation6.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace5.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#mmPriceDetails
	 * AggregateBalanceInformation7.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails17#mmPriceDetails
	 * FinancialInstrumentDetails17.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmIssuePrice
	 * FinancialInstrumentAttributes49.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#mmIssuePrice
	 * FinancialInstrumentAttributes56.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails18#mmPriceDetails
	 * FinancialInstrumentDetails18.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#mmPriceDetails
	 * AggregateBalanceInformation26.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#mmPriceDetails
	 * AggregateBalanceInformation25.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace24.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace25.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral2#mmPrice
	 * SecuritiesCollateral2.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#mmPrice
	 * SecuritiesCollateral3.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#mmPrice
	 * SecuritiesCollateral4.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#mmPriceDetails
	 * AggregateBalanceInformation28.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#mmPriceDetails
	 * AggregateBalanceInformation27.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace26.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace27.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmPriceDetails
	 * AggregateBalanceInformation30.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails20#mmPriceDetails
	 * FinancialInstrumentDetails20.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmPriceDetails
	 * AggregateBalanceInformation31.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace28.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace29.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmIssuePrice
	 * FinancialInstrumentAttributes67.mmIssuePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit6#mmPriceDetails
	 * Unit6.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#mmPrice
	 * SecuritiesCollateral6.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5#mmPrice
	 * SecuritiesCollateral5.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmPrice
	 * SecuritiesCollateral7.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#mmIssuePrice
	 * FinancialInstrumentAttributes71.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails23#mmPriceDetails
	 * FinancialInstrumentDetails23.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#mmPriceDetails
	 * AggregateBalanceInformation32.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmPriceDetails
	 * AggregateBalanceInformation33.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace31.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace30.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmIssuePrice
	 * FinancialInstrumentAttributes80.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails25#mmPriceDetails
	 * FinancialInstrumentDetails25.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#mmPrice
	 * SecuritiesCollateral8.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails27#mmPriceDetails
	 * FinancialInstrumentDetails27.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#mmIssuePrice
	 * FinancialInstrumentAttributes83.mmIssuePrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pricing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information on the price of the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPricing = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Unit1.mmPriceDetails, Unit3.mmPriceDetails, FinancialInstrumentAttributes5.mmIssuePrice, FinancialInstrumentAttributes10.mmIssuePrice, FinancialInstrumentAttributes16.mmIssuePrice,
					FinancialInstrumentAttributes24.mmIssuePrice, FinancialInstrumentAttributes34.mmIssuePrice, FinancialInstrumentAttributes40.mmIssuePrice, AggregateBalancePerSafekeepingPlace7.mmPriceDetails,
					AggregateBalanceInformation8.mmPriceDetails, AggregateBalancePerSafekeepingPlace10.mmPriceDetails, AggregateBalanceInformation11.mmPriceDetails, AggregateBalancePerSafekeepingPlace2.mmPriceDetails,
					AggregateBalanceInformation2.mmPriceDetails, AggregateBalancePerSafekeepingPlace4.mmPriceDetails, AggregateBalanceInformation3.mmPriceDetails, AggregateBalancePerSafekeepingPlace12.mmPriceDetails,
					AggregateBalanceInformation13.mmPriceDetails, AggregateBalancePerSafekeepingPlace14.mmPriceDetails, AggregateBalanceInformation15.mmPriceDetails, AggregateBalancePerSafekeepingPlace16.mmPriceDetails,
					AggregateBalanceInformation17.mmPriceDetails, AggregateBalancePerSafekeepingPlace18.mmPriceDetails, AggregateBalanceInformation19.mmPriceDetails, AggregateBalancePerSafekeepingPlace21.mmPriceDetails,
					AggregateBalanceInformation22.mmPriceDetails, AggregateBalancePerSafekeepingPlace22.mmPriceDetails, AggregateBalanceInformation23.mmPriceDetails, AggregateBalancePerSafekeepingPlace8.mmPriceDetails,
					AggregateBalanceInformation9.mmPriceDetails, AggregateBalancePerSafekeepingPlace9.mmPriceDetails, AggregateBalanceInformation10.mmPriceDetails, AggregateBalancePerSafekeepingPlace1.mmPriceDetails,
					AggregateBalanceInformation1.mmPriceDetails, AggregateBalancePerSafekeepingPlace3.mmPriceDetails, AggregateBalanceInformation4.mmPriceDetails, AggregateBalancePerSafekeepingPlace11.mmPriceDetails,
					AggregateBalanceInformation12.mmPriceDetails, AggregateBalancePerSafekeepingPlace13.mmPriceDetails, AggregateBalanceInformation14.mmPriceDetails, AggregateBalancePerSafekeepingPlace15.mmPriceDetails,
					AggregateBalanceInformation16.mmPriceDetails, AggregateBalancePerSafekeepingPlace17.mmPriceDetails, AggregateBalanceInformation18.mmPriceDetails, AggregateBalancePerSafekeepingPlace20.mmPriceDetails,
					AggregateBalanceInformation21.mmPriceDetails, AggregateBalancePerSafekeepingPlace23.mmPriceDetails, AggregateBalanceInformation24.mmPriceDetails, FinancialInstrumentDetails2.mmPriceDetails,
					FinancialInstrumentDetails3.mmPriceDetails, FinancialInstrumentDetails5.mmPriceDetails, FinancialInstrumentDetails8.mmPriceDetails, FinancialInstrumentDetails9.mmPriceDetails,
					FinancialInstrumentDetails11.mmPriceDetails, FinancialInstrumentDetails13.mmPriceDetails, FinancialInstrumentDetails16.mmPriceDetails, UnderlyingAttributes.mmPrice, UnderlyingAttributes.mmEndPrice,
					FinancialInstrumentStipulations.mmPriceRange, FinancialInstrumentStipulations2.mmPriceRange, SecurityInstrumentDescription1.mmStrikePrice, SecurityInstrumentDescription2.mmStrikePrice, SecuritiesCollateral1.mmPrice,
					InvestmentFund1.mmPrice, AggregateBalanceInformation5.mmPriceDetails, UnderlyingAttributes2.mmPrice, UnderlyingAttributes2.mmEndPrice, CollateralValue1.mmValuationPrice,
					AggregateBalancePerSafekeepingPlace19.mmPriceDetails, AggregateBalanceInformation20.mmPriceDetails, ListStrikePriceDetails1.mmPreviousClosingPrice, AggregateBalancePerSafekeepingPlace6.mmPriceDetails,
					AggregateBalanceInformation6.mmPriceDetails, AggregateBalancePerSafekeepingPlace5.mmPriceDetails, AggregateBalanceInformation7.mmPriceDetails, FinancialInstrumentDetails17.mmPriceDetails,
					FinancialInstrumentAttributes49.mmIssuePrice, FinancialInstrumentAttributes56.mmIssuePrice, FinancialInstrumentDetails18.mmPriceDetails, AggregateBalanceInformation26.mmPriceDetails,
					AggregateBalanceInformation25.mmPriceDetails, AggregateBalancePerSafekeepingPlace24.mmPriceDetails, AggregateBalancePerSafekeepingPlace25.mmPriceDetails, SecuritiesCollateral2.mmPrice, SecuritiesCollateral3.mmPrice,
					SecuritiesCollateral4.mmPrice, AggregateBalanceInformation28.mmPriceDetails, AggregateBalanceInformation27.mmPriceDetails, AggregateBalancePerSafekeepingPlace26.mmPriceDetails,
					AggregateBalancePerSafekeepingPlace27.mmPriceDetails, AggregateBalanceInformation30.mmPriceDetails, FinancialInstrumentDetails20.mmPriceDetails, AggregateBalanceInformation31.mmPriceDetails,
					AggregateBalancePerSafekeepingPlace28.mmPriceDetails, AggregateBalancePerSafekeepingPlace29.mmPriceDetails, FinancialInstrumentAttributes67.mmIssuePrice, Unit6.mmPriceDetails, SecuritiesCollateral6.mmPrice,
					SecuritiesCollateral5.mmPrice, SecuritiesCollateral7.mmPrice, FinancialInstrumentAttributes71.mmIssuePrice, FinancialInstrumentDetails23.mmPriceDetails, AggregateBalanceInformation32.mmPriceDetails,
					AggregateBalanceInformation33.mmPriceDetails, AggregateBalancePerSafekeepingPlace31.mmPriceDetails, AggregateBalancePerSafekeepingPlace30.mmPriceDetails, FinancialInstrumentAttributes80.mmIssuePrice,
					FinancialInstrumentDetails25.mmPriceDetails, SecuritiesCollateral8.mmPrice, FinancialInstrumentDetails27.mmPriceDetails, FinancialInstrumentAttributes83.mmIssuePrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pricing";
			definition = "Information on the price of the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesAccount securitiesAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecurity
	 * SecuritiesAccount.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails41#mmSafekeepingAccount
	 * TransactionDetails41.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails43#mmSafekeepingAccount
	 * TransactionDetails43.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails12#mmSafekeepingAccount
	 * TransactionDetails12.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails19#mmSafekeepingAccount
	 * TransactionDetails19.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation3#mmSafekeepingAccount
	 * AdditionalInformation3.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation4#mmSafekeepingAccount
	 * AdditionalInformation4.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation7#mmSafekeepingAccount
	 * AdditionalInformation7.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation8#mmSafekeepingAccount
	 * AdditionalInformation8.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#mmSafekeepingAccount
	 * TransactionDetails5.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#mmSafekeepingAccount
	 * TransactionDetails9.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#mmSafekeepingAccount
	 * TransactionDetails22.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#mmSafekeepingAccount
	 * TransactionDetails23.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#mmSafekeepingAccount
	 * TransactionDetails36.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#mmSafekeepingAccount
	 * TransactionDetails47.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#mmSafekeepingAccount
	 * TransactionDetails53.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#mmSafekeepingAccount
	 * TransactionDetails58.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails13#mmSafekeepingAccount
	 * TransactionDetails13.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails4#mmSafekeepingAccount
	 * TransactionDetails4.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails30#mmSafekeepingAccount
	 * TransactionDetails30.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails11#mmSafekeepingAccount
	 * TransactionDetails11.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails21#mmSafekeepingAccount
	 * TransactionDetails21.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails40#mmSafekeepingAccount
	 * TransactionDetails40.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#mmSafekeepingAccount
	 * TransactionDetails42.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails15#mmSafekeepingAccount
	 * TransactionDetails15.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails14#mmSafekeepingAccount
	 * TransactionDetails14.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails35#mmSafekeepingAccount
	 * TransactionDetails35.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlement1#mmSafekeepingAccountDetails
	 * SecuritiesSettlement1.mmSafekeepingAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuePosition1#mmSecuritiesAccount
	 * CollateralValuePosition1.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#mmSafekeepingAccount
	 * TransactionDetails61.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails64#mmSafekeepingAccount
	 * TransactionDetails64.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9#mmSafekeepingAccount
	 * AdditionalInformation9.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#mmSafekeepingAccount
	 * TransactionDetails66.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails65#mmSafekeepingAccount
	 * TransactionDetails65.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation10#mmSafekeepingAccount
	 * AdditionalInformation10.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#mmSafekeepingAccount
	 * TransactionDetails70.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral2#mmSafekeepingAccount
	 * SecuritiesCollateral2.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmSafekeepingAccount
	 * OtherCollateral2.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#mmSafekeepingAccount
	 * SecuritiesCollateral3.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#mmSafekeepingAccount
	 * OtherCollateral3.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#mmSafekeepingAccount
	 * OtherCollateral4.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#mmSafekeepingAccount
	 * SecuritiesCollateral4.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#mmSafekeepingAccount
	 * TransactionDetails71.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation11#mmSafekeepingAccount
	 * AdditionalInformation11.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#mmSafekeepingAccount
	 * TransactionDetails82.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#mmSafekeepingAccount
	 * TransactionDetails76.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#mmSafekeepingAccount
	 * TransactionDetails79.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails80#mmSafekeepingAccount
	 * TransactionDetails80.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmSafekeepingAccount
	 * OtherCollateral7.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmSafekeepingAccount
	 * OtherCollateral6.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#mmSafekeepingAccount
	 * SecuritiesCollateral6.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5#mmSafekeepingAccount
	 * SecuritiesCollateral5.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral5#mmSafekeepingAccount
	 * OtherCollateral5.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmSafekeepingAccount
	 * SecuritiesCollateral7.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation12#mmSafekeepingAccount
	 * AdditionalInformation12.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails88#mmSafekeepingAccount
	 * TransactionDetails88.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails92#mmSafekeepingAccount
	 * TransactionDetails92.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails85#mmSafekeepingAccount
	 * TransactionDetails85.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#mmSafekeepingAccount
	 * TransactionDetails87.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmSafekeepingAccount
	 * TransactionDetails97.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation13#mmSafekeepingAccount
	 * AdditionalInformation13.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#mmSafekeepingAccount
	 * SecuritiesCollateral8.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation14#mmSafekeepingAccount
	 * AdditionalInformation14.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#mmSafekeepingAccount
	 * TransactionDetails100.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails101#mmSafekeepingAccount
	 * TransactionDetails101.mmSafekeepingAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account on which the security is held."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionDetails41.mmSafekeepingAccount, TransactionDetails43.mmSafekeepingAccount, TransactionDetails12.mmSafekeepingAccount, TransactionDetails19.mmSafekeepingAccount,
					AdditionalInformation3.mmSafekeepingAccount, AdditionalInformation4.mmSafekeepingAccount, AdditionalInformation7.mmSafekeepingAccount, AdditionalInformation8.mmSafekeepingAccount,
					TransactionDetails5.mmSafekeepingAccount, TransactionDetails9.mmSafekeepingAccount, TransactionDetails22.mmSafekeepingAccount, TransactionDetails23.mmSafekeepingAccount, TransactionDetails36.mmSafekeepingAccount,
					TransactionDetails47.mmSafekeepingAccount, TransactionDetails53.mmSafekeepingAccount, TransactionDetails58.mmSafekeepingAccount, TransactionDetails13.mmSafekeepingAccount, TransactionDetails4.mmSafekeepingAccount,
					TransactionDetails30.mmSafekeepingAccount, TransactionDetails11.mmSafekeepingAccount, TransactionDetails21.mmSafekeepingAccount, TransactionDetails40.mmSafekeepingAccount, TransactionDetails42.mmSafekeepingAccount,
					TransactionDetails15.mmSafekeepingAccount, TransactionDetails14.mmSafekeepingAccount, TransactionDetails35.mmSafekeepingAccount, SecuritiesSettlement1.mmSafekeepingAccountDetails,
					CollateralValuePosition1.mmSecuritiesAccount, TransactionDetails61.mmSafekeepingAccount, TransactionDetails64.mmSafekeepingAccount, AdditionalInformation9.mmSafekeepingAccount, TransactionDetails66.mmSafekeepingAccount,
					TransactionDetails65.mmSafekeepingAccount, AdditionalInformation10.mmSafekeepingAccount, TransactionDetails70.mmSafekeepingAccount, SecuritiesCollateral2.mmSafekeepingAccount, OtherCollateral2.mmSafekeepingAccount,
					SecuritiesCollateral3.mmSafekeepingAccount, OtherCollateral3.mmSafekeepingAccount, OtherCollateral4.mmSafekeepingAccount, SecuritiesCollateral4.mmSafekeepingAccount, TransactionDetails71.mmSafekeepingAccount,
					AdditionalInformation11.mmSafekeepingAccount, TransactionDetails82.mmSafekeepingAccount, TransactionDetails76.mmSafekeepingAccount, TransactionDetails79.mmSafekeepingAccount, TransactionDetails80.mmSafekeepingAccount,
					OtherCollateral7.mmSafekeepingAccount, OtherCollateral6.mmSafekeepingAccount, SecuritiesCollateral6.mmSafekeepingAccount, SecuritiesCollateral5.mmSafekeepingAccount, OtherCollateral5.mmSafekeepingAccount,
					SecuritiesCollateral7.mmSafekeepingAccount, AdditionalInformation12.mmSafekeepingAccount, TransactionDetails88.mmSafekeepingAccount, TransactionDetails92.mmSafekeepingAccount, TransactionDetails85.mmSafekeepingAccount,
					TransactionDetails87.mmSafekeepingAccount, TransactionDetails97.mmSafekeepingAccount, AdditionalInformation13.mmSafekeepingAccount, SecuritiesCollateral8.mmSafekeepingAccount,
					AdditionalInformation14.mmSafekeepingAccount, TransactionDetails100.mmSafekeepingAccount, TransactionDetails101.mmSafekeepingAccount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccount";
			definition = "Account on which the security is held.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.TradingMarket> tradingMarket;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmTradedSecurity
	 * TradingMarket.mmTradedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingMarket
	 * TradingMarket}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#mmLocalMarketAnnex
	 * FundProcessingPassport1.mmLocalMarketAnnex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#mmPlaceOfTrade
	 * SecuritiesTradeDetails25.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#mmPlaceOfTrade
	 * SecuritiesTradeDetails26.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#mmPlaceOfTrade
	 * SecuritiesTradeDetails27.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#mmPlaceOfTrade
	 * SecuritiesTradeDetails28.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption4#mmPlaceOfTrade
	 * CorporateActionOption4.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption14#mmPlaceOfTrade
	 * CorporateActionOption14.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption23#mmPlaceOfTrade
	 * CorporateActionOption23.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption31#mmPlaceOfTrade
	 * CorporateActionOption31.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption37#mmPlaceOfTrade
	 * CorporateActionOption37.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption46#mmPlaceOfTrade
	 * CorporateActionOption46.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#mmPlaceOfTrade
	 * CorporateActionOption53.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#mmPlaceOfTrade
	 * CorporateActionOption54.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#mmPlaceOfTrade
	 * SecuritiesTradeDetails6.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13#mmPlaceOfTrade
	 * SecuritiesTradeDetails13.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3#mmPlaceOfTrade
	 * SecuritiesTradeDetails3.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11#mmPlaceOfTrade
	 * SecuritiesTradeDetails11.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#mmPlaceOfTrade
	 * SecuritiesTradeDetails2.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#mmPlaceOfTrade
	 * SecuritiesTradeDetails16.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmPlaceOfTrade
	 * SecuritiesTradeDetails1.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#mmPlaceOfTrade
	 * SecuritiesTradeDetails15.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#mmPlaceOfTrade
	 * TransactionDetails5.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#mmPlaceOfTrade
	 * TransactionDetails9.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#mmPlaceOfTrade
	 * TransactionDetails22.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#mmPlaceOfTrade
	 * TransactionDetails23.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#mmPlaceOfTrade
	 * TransactionDetails36.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#mmPlaceOfTrade
	 * TransactionDetails47.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#mmPlaceOfTrade
	 * TransactionDetails53.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#mmPlaceOfTrade
	 * TransactionDetails58.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#mmPlaceOfTrade
	 * TransactionDetails7.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#mmPlaceOfTrade
	 * TransactionDetails8.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#mmPlaceOfTrade
	 * TransactionDetails16.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#mmPlaceOfTrade
	 * TransactionDetails17.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#mmPlaceOfTrade
	 * TransactionDetails26.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#mmPlaceOfTrade
	 * TransactionDetails25.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#mmPlaceOfTrade
	 * TransactionDetails27.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#mmPlaceOfTrade
	 * TransactionDetails33.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#mmPlaceOfTrade
	 * TransactionDetails39.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#mmPlaceOfTrade
	 * TransactionDetails50.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#mmPlaceOfTrade
	 * TransactionDetails56.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#mmPlaceOfTrade
	 * TransactionDetails59.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#mmPlaceOfTrade
	 * TransactionDetails6.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#mmPlaceOfTrade
	 * TransactionDetails18.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#mmPlaceOfTrade
	 * TransactionDetails24.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#mmPlaceOfTrade
	 * TransactionDetails34.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#mmPlaceOfTrade
	 * TransactionDetails37.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#mmPlaceOfTrade
	 * TransactionDetails48.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#mmPlaceOfTrade
	 * TransactionDetails57.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#mmPlaceOfTrade
	 * TransactionDetails60.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#mmPlaceOfTrade
	 * TransactionDetails1.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#mmPlaceOfTrade
	 * TransactionDetails3.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmPlaceOfTrade
	 * SecuritiesFinancingTransactionDetails2.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmPlaceOfTrade
	 * SecuritiesFinancingTransactionDetails8.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8#mmPlaceOfTrade
	 * SecuritiesTradeDetails8.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails18#mmPlaceOfTrade
	 * SecuritiesTradeDetails18.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmPlaceOfTrade
	 * SecuritiesTradeDetails4.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmPlaceOfTrade
	 * SecuritiesTradeDetails17.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmPlaceOfTrade
	 * SecuritiesFinancingTransactionDetails6.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmPlaceOfTrade
	 * SecuritiesFinancingTransactionDetails10.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmPlaceOfTrade
	 * SecuritiesFinancingTransactionDetails17.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmPlaceOfTrade
	 * SecuritiesFinancingTransactionDetails18.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9#mmPlaceOfTrade
	 * SecuritiesTradeDetails9.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails21#mmPlaceOfTrade
	 * SecuritiesTradeDetails21.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmPlaceOfTrade
	 * SecuritiesTradeDetails10.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmPlaceOfTrade
	 * SecuritiesTradeDetails22.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmPlaceOfTrade
	 * SecuritiesTradeDetails23.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmPlaceOfTrade
	 * SecuritiesTradeDetails29.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#mmPlaceOfTrade
	 * TransactionDetails51.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#mmTradingMarket
	 * CommonFinancialInstrumentAttributes1.mmTradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#mmPlaceOfTrade
	 * TransactionDetails61.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmPlaceOfTrade
	 * SecuritiesFinancingTransactionDetails21.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#mmPlaceOfTrade
	 * TransactionDetails62.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#mmPlaceOfTrade
	 * TransactionDetails63.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#mmPlaceOfTrade
	 * CorporateActionOption102.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#mmPlaceOfTrade
	 * SecuritiesTradeDetails31.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmPlaceOfTrade
	 * SecuritiesTradeDetails33.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmPlaceOfTrade
	 * SecuritiesTradeDetails35.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#mmPlaceOfTrade
	 * SecuritiesTradeDetails38.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmPlaceOfTrade
	 * SecuritiesTradeDetails37.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails36#mmPlaceOfTrade
	 * SecuritiesTradeDetails36.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#mmPlaceOfTrade
	 * SecuritiesTradeDetails34.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#mmPlaceOfTrade
	 * SecuritiesTradeDetails32.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption110#mmPlaceOfTrade
	 * CorporateActionOption110.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#mmPlaceOfTrade
	 * SecuritiesTradeDetails44.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39#mmPlaceOfTrade
	 * SecuritiesTradeDetails39.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#mmPlaceOfTrade
	 * SecuritiesTradeDetails43.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails41#mmPlaceOfTrade
	 * SecuritiesTradeDetails41.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmPlaceOfTrade
	 * SecuritiesFinancingTransactionDetails22.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40#mmPlaceOfTrade
	 * SecuritiesTradeDetails40.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#mmPlaceOfTrade
	 * TransactionDetails66.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmPlaceOfTrade
	 * SecuritiesTradeDetails42.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#mmPlaceOfTrade
	 * TransactionDetails67.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#mmPlaceOfTrade
	 * TransactionDetails68.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#mmPlaceOfTrade
	 * SecuritiesTradeDetails46.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#mmPlaceOfTrade
	 * SecuritiesTradeDetails47.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmPlaceOfTrade
	 * SecuritiesFinancingTransactionDetails24.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#mmPlaceOfTrade
	 * TransactionDetails70.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#mmPlaceOfTrade
	 * TransactionDetails69.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#mmPlaceOfTrade
	 * CorporateActionOption111.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption113#mmPlaceOfTrade
	 * CorporateActionOption113.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#mmPlaceOfTrade
	 * TransactionDetails71.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmPlaceOfTrade
	 * SecuritiesFinancingTransactionDetails25.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#mmPlaceOfTrade
	 * TransactionDetails72.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmPlaceOfTrade
	 * SecuritiesTradeDetails49.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmPlaceOfTrade
	 * SecuritiesFinancingTransactionDetails26.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#mmPlaceOfTrade
	 * TransactionDetails79.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#mmPlaceOfTrade
	 * TransactionDetails75.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmPlaceOfTrade
	 * TransactionDetails78.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmPlaceOfTrade
	 * SecuritiesTradeDetails51.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#mmPlaceOfTrade
	 * SecuritiesTradeDetails53.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmPlaceOfTrade
	 * SecuritiesTradeDetails55.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmPlaceOfTrade
	 * SecuritiesTradeDetails56.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#mmPlaceOfTrade
	 * SecuritiesTradeDetails54.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmPlaceOfTrade
	 * SecuritiesTradeDetails52.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#mmPlaceOfTrade
	 * SecuritiesTradeDetails50.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmPlaceOfTrade
	 * CorporateActionOption117.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption124#mmPlaceOfTrade
	 * CorporateActionOption124.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59#mmPlaceOfTrade
	 * SecuritiesTradeDetails59.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmPlaceOfTrade
	 * SecuritiesFinancingTransactionDetails33.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58#mmPlaceOfTrade
	 * SecuritiesTradeDetails58.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmPlaceOfTrade
	 * SecuritiesTradeDetails61.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmPlaceOfTrade
	 * SecuritiesTradeDetails63.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmPlaceOfTrade
	 * SecuritiesTradeDetails62.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#mmPlaceOfTrade
	 * TransactionDetails87.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails60#mmPlaceOfTrade
	 * SecuritiesTradeDetails60.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#mmPlaceOfTrade
	 * TransactionDetails91.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#mmPlaceOfTrade
	 * TransactionDetails90.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#mmPlaceOfTrade
	 * SecuritiesTradeDetails65.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#mmPlaceOfTrade
	 * SecuritiesTradeDetails66.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmPlaceOfTrade
	 * CorporateActionOption132.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmPlaceOfTrade
	 * SecuritiesTradeDetails67.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmPlaceOfTrade
	 * SecuritiesTradeDetails68.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmPlaceOfTrade
	 * TransactionDetails97.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmPlaceOfTrade
	 * SecuritiesFinancingTransactionDetails35.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmPlaceOfTrade
	 * TransactionDetails96.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmPlaceOfTrade
	 * TransactionDetails95.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmPlaceOfTrade
	 * SecuritiesTradeDetails69.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption136#mmPlaceOfTrade
	 * CorporateActionOption136.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#mmPlaceOfTrade
	 * SecuritiesTradeDetails70.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmPlaceOfTrade
	 * SecuritiesFinancingTransactionDetails36.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#mmPlaceOfTrade
	 * TransactionDetails100.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#mmPlaceOfTrade
	 * TransactionDetails99.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#mmPlaceOfTrade
	 * TransactionDetails98.mmPlaceOfTrade}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market(s) on which the security is traded."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTradingMarket = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FundProcessingPassport1.mmLocalMarketAnnex, SecuritiesTradeDetails25.mmPlaceOfTrade, SecuritiesTradeDetails26.mmPlaceOfTrade, SecuritiesTradeDetails27.mmPlaceOfTrade,
					SecuritiesTradeDetails28.mmPlaceOfTrade, CorporateActionOption4.mmPlaceOfTrade, CorporateActionOption14.mmPlaceOfTrade, CorporateActionOption23.mmPlaceOfTrade, CorporateActionOption31.mmPlaceOfTrade,
					CorporateActionOption37.mmPlaceOfTrade, CorporateActionOption46.mmPlaceOfTrade, CorporateActionOption53.mmPlaceOfTrade, CorporateActionOption54.mmPlaceOfTrade, SecuritiesTradeDetails6.mmPlaceOfTrade,
					SecuritiesTradeDetails13.mmPlaceOfTrade, SecuritiesTradeDetails3.mmPlaceOfTrade, SecuritiesTradeDetails11.mmPlaceOfTrade, SecuritiesTradeDetails2.mmPlaceOfTrade, SecuritiesTradeDetails16.mmPlaceOfTrade,
					SecuritiesTradeDetails1.mmPlaceOfTrade, SecuritiesTradeDetails15.mmPlaceOfTrade, TransactionDetails5.mmPlaceOfTrade, TransactionDetails9.mmPlaceOfTrade, TransactionDetails22.mmPlaceOfTrade,
					TransactionDetails23.mmPlaceOfTrade, TransactionDetails36.mmPlaceOfTrade, TransactionDetails47.mmPlaceOfTrade, TransactionDetails53.mmPlaceOfTrade, TransactionDetails58.mmPlaceOfTrade,
					TransactionDetails7.mmPlaceOfTrade, TransactionDetails8.mmPlaceOfTrade, TransactionDetails16.mmPlaceOfTrade, TransactionDetails17.mmPlaceOfTrade, TransactionDetails26.mmPlaceOfTrade, TransactionDetails25.mmPlaceOfTrade,
					TransactionDetails27.mmPlaceOfTrade, TransactionDetails33.mmPlaceOfTrade, TransactionDetails39.mmPlaceOfTrade, TransactionDetails50.mmPlaceOfTrade, TransactionDetails56.mmPlaceOfTrade,
					TransactionDetails59.mmPlaceOfTrade, TransactionDetails6.mmPlaceOfTrade, TransactionDetails18.mmPlaceOfTrade, TransactionDetails24.mmPlaceOfTrade, TransactionDetails34.mmPlaceOfTrade,
					TransactionDetails37.mmPlaceOfTrade, TransactionDetails48.mmPlaceOfTrade, TransactionDetails57.mmPlaceOfTrade, TransactionDetails60.mmPlaceOfTrade, TransactionDetails1.mmPlaceOfTrade, TransactionDetails3.mmPlaceOfTrade,
					SecuritiesFinancingTransactionDetails2.mmPlaceOfTrade, SecuritiesFinancingTransactionDetails8.mmPlaceOfTrade, SecuritiesTradeDetails8.mmPlaceOfTrade, SecuritiesTradeDetails18.mmPlaceOfTrade,
					SecuritiesTradeDetails4.mmPlaceOfTrade, SecuritiesTradeDetails17.mmPlaceOfTrade, SecuritiesFinancingTransactionDetails6.mmPlaceOfTrade, SecuritiesFinancingTransactionDetails10.mmPlaceOfTrade,
					SecuritiesFinancingTransactionDetails17.mmPlaceOfTrade, SecuritiesFinancingTransactionDetails18.mmPlaceOfTrade, SecuritiesTradeDetails9.mmPlaceOfTrade, SecuritiesTradeDetails21.mmPlaceOfTrade,
					SecuritiesTradeDetails10.mmPlaceOfTrade, SecuritiesTradeDetails22.mmPlaceOfTrade, SecuritiesTradeDetails23.mmPlaceOfTrade, SecuritiesTradeDetails29.mmPlaceOfTrade, TransactionDetails51.mmPlaceOfTrade,
					CommonFinancialInstrumentAttributes1.mmTradingMarket, TransactionDetails61.mmPlaceOfTrade, SecuritiesFinancingTransactionDetails21.mmPlaceOfTrade, TransactionDetails62.mmPlaceOfTrade,
					TransactionDetails63.mmPlaceOfTrade, CorporateActionOption102.mmPlaceOfTrade, SecuritiesTradeDetails31.mmPlaceOfTrade, SecuritiesTradeDetails33.mmPlaceOfTrade, SecuritiesTradeDetails35.mmPlaceOfTrade,
					SecuritiesTradeDetails38.mmPlaceOfTrade, SecuritiesTradeDetails37.mmPlaceOfTrade, SecuritiesTradeDetails36.mmPlaceOfTrade, SecuritiesTradeDetails34.mmPlaceOfTrade, SecuritiesTradeDetails32.mmPlaceOfTrade,
					CorporateActionOption110.mmPlaceOfTrade, SecuritiesTradeDetails44.mmPlaceOfTrade, SecuritiesTradeDetails39.mmPlaceOfTrade, SecuritiesTradeDetails43.mmPlaceOfTrade, SecuritiesTradeDetails41.mmPlaceOfTrade,
					SecuritiesFinancingTransactionDetails22.mmPlaceOfTrade, SecuritiesTradeDetails40.mmPlaceOfTrade, TransactionDetails66.mmPlaceOfTrade, SecuritiesTradeDetails42.mmPlaceOfTrade, TransactionDetails67.mmPlaceOfTrade,
					TransactionDetails68.mmPlaceOfTrade, SecuritiesTradeDetails46.mmPlaceOfTrade, SecuritiesTradeDetails47.mmPlaceOfTrade, SecuritiesFinancingTransactionDetails24.mmPlaceOfTrade, TransactionDetails70.mmPlaceOfTrade,
					TransactionDetails69.mmPlaceOfTrade, CorporateActionOption111.mmPlaceOfTrade, CorporateActionOption113.mmPlaceOfTrade, TransactionDetails71.mmPlaceOfTrade, SecuritiesFinancingTransactionDetails25.mmPlaceOfTrade,
					TransactionDetails72.mmPlaceOfTrade, SecuritiesTradeDetails49.mmPlaceOfTrade, SecuritiesFinancingTransactionDetails26.mmPlaceOfTrade, TransactionDetails79.mmPlaceOfTrade, TransactionDetails75.mmPlaceOfTrade,
					TransactionDetails78.mmPlaceOfTrade, SecuritiesTradeDetails51.mmPlaceOfTrade, SecuritiesTradeDetails53.mmPlaceOfTrade, SecuritiesTradeDetails55.mmPlaceOfTrade, SecuritiesTradeDetails56.mmPlaceOfTrade,
					SecuritiesTradeDetails54.mmPlaceOfTrade, SecuritiesTradeDetails52.mmPlaceOfTrade, SecuritiesTradeDetails50.mmPlaceOfTrade, CorporateActionOption117.mmPlaceOfTrade, CorporateActionOption124.mmPlaceOfTrade,
					SecuritiesTradeDetails59.mmPlaceOfTrade, SecuritiesFinancingTransactionDetails33.mmPlaceOfTrade, SecuritiesTradeDetails58.mmPlaceOfTrade, SecuritiesTradeDetails61.mmPlaceOfTrade, SecuritiesTradeDetails63.mmPlaceOfTrade,
					SecuritiesTradeDetails62.mmPlaceOfTrade, TransactionDetails87.mmPlaceOfTrade, SecuritiesTradeDetails60.mmPlaceOfTrade, TransactionDetails91.mmPlaceOfTrade, TransactionDetails90.mmPlaceOfTrade,
					SecuritiesTradeDetails65.mmPlaceOfTrade, SecuritiesTradeDetails66.mmPlaceOfTrade, CorporateActionOption132.mmPlaceOfTrade, SecuritiesTradeDetails67.mmPlaceOfTrade, SecuritiesTradeDetails68.mmPlaceOfTrade,
					TransactionDetails97.mmPlaceOfTrade, SecuritiesFinancingTransactionDetails35.mmPlaceOfTrade, TransactionDetails96.mmPlaceOfTrade, TransactionDetails95.mmPlaceOfTrade, SecuritiesTradeDetails69.mmPlaceOfTrade,
					CorporateActionOption136.mmPlaceOfTrade, SecuritiesTradeDetails70.mmPlaceOfTrade, SecuritiesFinancingTransactionDetails36.mmPlaceOfTrade, TransactionDetails100.mmPlaceOfTrade, TransactionDetails99.mmPlaceOfTrade,
					TransactionDetails98.mmPlaceOfTrade);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingMarket";
			definition = "Market(s) on which the security is traded.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmTradedSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.TradingMarket> placeOfListing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmListedSecurity
	 * TradingMarket.mmListedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingMarket
	 * TradingMarket}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmPlaceOfListing
	 * FinancialInstrumentAttributes8.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmPlaceOfListing
	 * FinancialInstrumentAttributes20.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmPlaceOfListing
	 * FinancialInstrumentAttributes35.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmPlaceOfListing
	 * FinancialInstrumentAttributes41.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#mmPlaceOfListing
	 * FinancialInstrumentAttributes6.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#mmPlaceOfListing
	 * FinancialInstrumentAttributes9.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#mmPlaceOfListing
	 * FinancialInstrumentAttributes18.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#mmPlaceOfListing
	 * FinancialInstrumentAttributes22.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#mmPlaceOfListing
	 * FinancialInstrumentAttributes32.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#mmPlaceOfListing
	 * FinancialInstrumentAttributes38.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#mmPlaceOfListing
	 * FinancialInstrumentAttributes7.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#mmPlaceOfListing
	 * FinancialInstrumentAttributes5.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#mmPlaceOfListing
	 * FinancialInstrumentAttributes11.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#mmPlaceOfListing
	 * FinancialInstrumentAttributes10.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#mmPlaceOfListing
	 * FinancialInstrumentAttributes19.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#mmPlaceOfListing
	 * FinancialInstrumentAttributes16.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#mmPlaceOfListing
	 * FinancialInstrumentAttributes23.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#mmPlaceOfListing
	 * FinancialInstrumentAttributes24.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#mmPlaceOfListing
	 * FinancialInstrumentAttributes33.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#mmPlaceOfListing
	 * FinancialInstrumentAttributes34.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#mmPlaceOfListing
	 * FinancialInstrumentAttributes39.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#mmPlaceOfListing
	 * FinancialInstrumentAttributes40.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#mmPlaceOfListing
	 * FinancialInstrumentAttributes43.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#mmPlaceOfListing
	 * FinancialInstrumentAttributes45.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmPlaceOfListing
	 * FinancialInstrumentAttributes4.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmPlaceOfListing
	 * FinancialInstrumentAttributes13.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmPlaceOfListing
	 * FinancialInstrumentAttributes21.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmPlaceOfListing
	 * FinancialInstrumentAttributes26.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmPlaceOfListing
	 * FinancialInstrumentAttributes36.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmPlaceOfListing
	 * FinancialInstrumentAttributes42.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmPlaceOfListing
	 * FinancialInstrumentAttributes27.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace7.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmPlaceOfListing
	 * FinancialInstrumentAttributes14.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace10.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace12.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmPlaceOfListing
	 * FinancialInstrumentAttributes30.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace14.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace16.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace18.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace21.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace22.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace8.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace9.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace11.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace13.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace15.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace17.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace20.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace23.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmPlaceOfListing
	 * FinancialInstrumentAttributes28.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmPrimaryPlaceOfListingIdentification
	 * FinancialInstrumentAttributes1.mmPrimaryPlaceOfListingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmSecondaryPlaceOfListing
	 * FinancialInstrumentAttributes1.mmSecondaryPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmPlaceOfListing
	 * FinancialInstrumentAttributes31.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmPlaceOfListing
	 * FinancialInstrumentAttributes44.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDescription3#mmPlaceOfListing
	 * FinancialInstrumentDescription3.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmPlaceOfListing
	 * FinancialInstrumentAttributes15.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmPlaceOfListing
	 * FinancialInstrumentAttributes29.mmPlaceOfListing}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg2#mmPlaceOfListing
	 * TradeLeg2.mmPlaceOfListing}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg5#mmPlaceOfListing
	 * TradeLeg5.mmPlaceOfListing}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg1#mmPlaceOfListing
	 * TradeLeg1.mmPlaceOfListing}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg3#mmPlaceOfListing
	 * TradeLeg3.mmPlaceOfListing}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg6#mmPlaceOfListing
	 * TradeLeg6.mmPlaceOfListing}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg4#mmPlaceOfListing
	 * TradeLeg4.mmPlaceOfListing}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg7#mmPlaceOfListing
	 * TradeLeg7.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingParameters1#mmSecondaryPlaceOfListing
	 * TradingParameters1.mmSecondaryPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingParameters1#mmPrimaryPlaceOfListingIdentification
	 * TradingParameters1.mmPrimaryPlaceOfListingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace19.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmPlaceOfListing
	 * FinancialInstrumentAttributes2.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace6.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace5.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmPlaceOfListing
	 * FinancialInstrumentAttributes48.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#mmPlaceOfListing
	 * FinancialInstrumentAttributes50.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmPlaceOfListing
	 * FinancialInstrumentAttributes49.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#mmPlaceOfListing
	 * FinancialInstrumentAttributes55.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#mmPlaceOfListing
	 * FinancialInstrumentAttributes57.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#mmPlaceOfListing
	 * FinancialInstrumentAttributes56.mmPlaceOfListing}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmPlaceOfListing
	 * TradeLeg8.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace24.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace25.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#mmPlaceOfListing
	 * TradeLeg10.mmPlaceOfListing}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmPlaceOfListing
	 * TradeLeg9.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace26.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace27.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace28.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace29.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmPlaceOfListing
	 * FinancialInstrumentAttributes63.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmPlaceOfListing
	 * FinancialInstrumentAttributes64.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmPlaceOfListing
	 * FinancialInstrumentAttributes66.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#mmPlaceOfListing
	 * FinancialInstrumentAttributes65.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmPlaceOfListing
	 * FinancialInstrumentAttributes67.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VolumeCapReport1#mmTradingVenue
	 * VolumeCapReport1.mmTradingVenue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#mmPlaceOfListing
	 * FinancialInstrumentAttributes70.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#mmPlaceOfListing
	 * FinancialInstrumentAttributes69.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#mmPlaceOfListing
	 * FinancialInstrumentAttributes71.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmPlaceOfListing
	 * FinancialInstrumentAttributes75.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmPlaceOfListing
	 * FinancialInstrumentAttributes78.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace31.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace30.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#mmTradingVenue
	 * TransparencyDataReport11.mmTradingVenue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13#mmTradingVenue
	 * TransparencyDataReport13.mmTradingVenue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5#mmTradingVenueRelatedAttributes
	 * SecuritiesReferenceDataReport5.mmTradingVenueRelatedAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12#mmTradingVenue
	 * TransparencyDataReport12.mmTradingVenue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12#mmRelevantMarket
	 * TransparencyDataReport12.mmRelevantMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport15#mmTradingVenue
	 * TransparencyDataReport15.mmTradingVenue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmTradingVenue
	 * TransparencyDataReport10.mmTradingVenue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14#mmTradingVenue
	 * TransparencyDataReport14.mmTradingVenue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmPlaceOfListing
	 * FinancialInstrumentAttributes79.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmPlaceOfListing
	 * FinancialInstrumentAttributes81.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmPlaceOfListing
	 * FinancialInstrumentAttributes80.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#mmPlaceOfListing
	 * FinancialInstrumentAttributes85.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#mmPlaceOfListing
	 * FinancialInstrumentAttributes84.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#mmPlaceOfListing
	 * FinancialInstrumentAttributes83.mmPlaceOfListing}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market(s) on which the security is listed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPlaceOfListing = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes8.mmPlaceOfListing, FinancialInstrumentAttributes20.mmPlaceOfListing, FinancialInstrumentAttributes35.mmPlaceOfListing,
					FinancialInstrumentAttributes41.mmPlaceOfListing, FinancialInstrumentAttributes6.mmPlaceOfListing, FinancialInstrumentAttributes9.mmPlaceOfListing, FinancialInstrumentAttributes18.mmPlaceOfListing,
					FinancialInstrumentAttributes22.mmPlaceOfListing, FinancialInstrumentAttributes32.mmPlaceOfListing, FinancialInstrumentAttributes38.mmPlaceOfListing, FinancialInstrumentAttributes7.mmPlaceOfListing,
					FinancialInstrumentAttributes5.mmPlaceOfListing, FinancialInstrumentAttributes11.mmPlaceOfListing, FinancialInstrumentAttributes10.mmPlaceOfListing, FinancialInstrumentAttributes19.mmPlaceOfListing,
					FinancialInstrumentAttributes16.mmPlaceOfListing, FinancialInstrumentAttributes23.mmPlaceOfListing, FinancialInstrumentAttributes24.mmPlaceOfListing, FinancialInstrumentAttributes33.mmPlaceOfListing,
					FinancialInstrumentAttributes34.mmPlaceOfListing, FinancialInstrumentAttributes39.mmPlaceOfListing, FinancialInstrumentAttributes40.mmPlaceOfListing, FinancialInstrumentAttributes43.mmPlaceOfListing,
					FinancialInstrumentAttributes45.mmPlaceOfListing, FinancialInstrumentAttributes4.mmPlaceOfListing, FinancialInstrumentAttributes13.mmPlaceOfListing, FinancialInstrumentAttributes21.mmPlaceOfListing,
					FinancialInstrumentAttributes26.mmPlaceOfListing, FinancialInstrumentAttributes36.mmPlaceOfListing, FinancialInstrumentAttributes42.mmPlaceOfListing, FinancialInstrumentAttributes27.mmPlaceOfListing,
					AggregateBalancePerSafekeepingPlace7.mmPlaceOfListing, FinancialInstrumentAttributes14.mmPlaceOfListing, AggregateBalancePerSafekeepingPlace10.mmPlaceOfListing, AggregateBalancePerSafekeepingPlace12.mmPlaceOfListing,
					FinancialInstrumentAttributes30.mmPlaceOfListing, AggregateBalancePerSafekeepingPlace14.mmPlaceOfListing, AggregateBalancePerSafekeepingPlace16.mmPlaceOfListing, AggregateBalancePerSafekeepingPlace18.mmPlaceOfListing,
					AggregateBalancePerSafekeepingPlace21.mmPlaceOfListing, AggregateBalancePerSafekeepingPlace22.mmPlaceOfListing, AggregateBalancePerSafekeepingPlace8.mmPlaceOfListing,
					AggregateBalancePerSafekeepingPlace9.mmPlaceOfListing, AggregateBalancePerSafekeepingPlace11.mmPlaceOfListing, AggregateBalancePerSafekeepingPlace13.mmPlaceOfListing,
					AggregateBalancePerSafekeepingPlace15.mmPlaceOfListing, AggregateBalancePerSafekeepingPlace17.mmPlaceOfListing, AggregateBalancePerSafekeepingPlace20.mmPlaceOfListing,
					AggregateBalancePerSafekeepingPlace23.mmPlaceOfListing, FinancialInstrumentAttributes28.mmPlaceOfListing, FinancialInstrumentAttributes1.mmPrimaryPlaceOfListingIdentification,
					FinancialInstrumentAttributes1.mmSecondaryPlaceOfListing, FinancialInstrumentAttributes31.mmPlaceOfListing, FinancialInstrumentAttributes44.mmPlaceOfListing, FinancialInstrumentDescription3.mmPlaceOfListing,
					FinancialInstrumentAttributes15.mmPlaceOfListing, FinancialInstrumentAttributes29.mmPlaceOfListing, TradeLeg2.mmPlaceOfListing, TradeLeg5.mmPlaceOfListing, TradeLeg1.mmPlaceOfListing, TradeLeg3.mmPlaceOfListing,
					TradeLeg6.mmPlaceOfListing, TradeLeg4.mmPlaceOfListing, TradeLeg7.mmPlaceOfListing, TradingParameters1.mmSecondaryPlaceOfListing, TradingParameters1.mmPrimaryPlaceOfListingIdentification,
					AggregateBalancePerSafekeepingPlace19.mmPlaceOfListing, FinancialInstrumentAttributes2.mmPlaceOfListing, AggregateBalancePerSafekeepingPlace6.mmPlaceOfListing, AggregateBalancePerSafekeepingPlace5.mmPlaceOfListing,
					FinancialInstrumentAttributes48.mmPlaceOfListing, FinancialInstrumentAttributes50.mmPlaceOfListing, FinancialInstrumentAttributes49.mmPlaceOfListing, FinancialInstrumentAttributes55.mmPlaceOfListing,
					FinancialInstrumentAttributes57.mmPlaceOfListing, FinancialInstrumentAttributes56.mmPlaceOfListing, TradeLeg8.mmPlaceOfListing, AggregateBalancePerSafekeepingPlace24.mmPlaceOfListing,
					AggregateBalancePerSafekeepingPlace25.mmPlaceOfListing, TradeLeg10.mmPlaceOfListing, TradeLeg9.mmPlaceOfListing, AggregateBalancePerSafekeepingPlace26.mmPlaceOfListing,
					AggregateBalancePerSafekeepingPlace27.mmPlaceOfListing, AggregateBalancePerSafekeepingPlace28.mmPlaceOfListing, AggregateBalancePerSafekeepingPlace29.mmPlaceOfListing, FinancialInstrumentAttributes63.mmPlaceOfListing,
					FinancialInstrumentAttributes64.mmPlaceOfListing, FinancialInstrumentAttributes66.mmPlaceOfListing, FinancialInstrumentAttributes65.mmPlaceOfListing, FinancialInstrumentAttributes67.mmPlaceOfListing,
					VolumeCapReport1.mmTradingVenue, FinancialInstrumentAttributes70.mmPlaceOfListing, FinancialInstrumentAttributes69.mmPlaceOfListing, FinancialInstrumentAttributes71.mmPlaceOfListing,
					FinancialInstrumentAttributes75.mmPlaceOfListing, FinancialInstrumentAttributes78.mmPlaceOfListing, AggregateBalancePerSafekeepingPlace31.mmPlaceOfListing, AggregateBalancePerSafekeepingPlace30.mmPlaceOfListing,
					TransparencyDataReport11.mmTradingVenue, TransparencyDataReport13.mmTradingVenue, SecuritiesReferenceDataReport5.mmTradingVenueRelatedAttributes, TransparencyDataReport12.mmTradingVenue,
					TransparencyDataReport12.mmRelevantMarket, TransparencyDataReport15.mmTradingVenue, TransparencyDataReport10.mmTradingVenue, TransparencyDataReport14.mmTradingVenue, FinancialInstrumentAttributes79.mmPlaceOfListing,
					FinancialInstrumentAttributes81.mmPlaceOfListing, FinancialInstrumentAttributes80.mmPlaceOfListing, FinancialInstrumentAttributes85.mmPlaceOfListing, FinancialInstrumentAttributes84.mmPlaceOfListing,
					FinancialInstrumentAttributes83.mmPlaceOfListing);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfListing";
			definition = "Market(s) on which the security is listed.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmListedSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.BasicSecuritiesRegistration> registration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmSecurity
	 * BasicSecuritiesRegistration.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmRegistration
	 * SettlementDetails50.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation1#mmRegistrationDetails
	 * PartyTextInformation1.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails3.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails4.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails2.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#mmRegistration
	 * SettlementDetails51.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation3#mmRegistrationDetails
	 * PartyTextInformation3.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails5.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails6.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails7.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldIndicator2#mmReason
	 * HoldIndicator2.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldIndicator3#mmReason
	 * HoldIndicator3.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldIndicator4#mmReason
	 * HoldIndicator4.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldIndicator5#mmReason
	 * HoldIndicator5.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#mmRegistration
	 * SettlementDetails6.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmRegistration
	 * SettlementDetails20.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#mmRegistration
	 * SettlementDetails24.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#mmRegistration
	 * SettlementDetails33.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#mmRegistration
	 * SettlementDetails45.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#mmRegistration
	 * SettlementDetails54.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#mmRegistration
	 * SettlementDetails1.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#mmRegistration
	 * SettlementDetails19.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmRegistration
	 * SettlementDetails22.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmRegistration
	 * SettlementDetails35.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmRegistration
	 * SettlementDetails42.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmRegistration
	 * SettlementDetails52.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails8.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails9.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails10.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails11.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails12.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails13.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#mmRegistration
	 * SettlementDetails8.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#mmRegistration
	 * SettlementDetails11.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#mmRegistration
	 * SettlementDetails23.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#mmRegistration
	 * SettlementDetails37.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmRegistration
	 * SettlementDetails44.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#mmRegistration
	 * SettlementDetails53.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#mmRegistration
	 * SettlementDetails7.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#mmRegistration
	 * SettlementDetails12.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#mmRegistration
	 * SettlementDetails28.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#mmRegistration
	 * SettlementDetails38.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#mmRegistration
	 * SettlementDetails47.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#mmRegistration
	 * SettlementDetails56.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#mmRegistration
	 * SettlementDetails2.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#mmRegistration
	 * SettlementDetails13.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#mmRegistration
	 * SettlementDetails27.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#mmRegistration
	 * SettlementDetails39.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#mmRegistration
	 * SettlementDetails48.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#mmRegistration
	 * SettlementDetails57.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#mmAdditionalPhysicalOrRegistrationDetails
	 * Order16.mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#mmAdditionalPhysicalOrRegistrationDetails
	 * Order14.mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmRegistration
	 * SettlementDetails43.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount6#mmRegistrationDetails
	 * SecuritiesAccount6.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails4#mmRegistration
	 * SettlementDetails4.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#mmRegistration
	 * SettlementDetails5.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails25#mmRegistration
	 * SettlementDetails25.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#mmRegistration
	 * SettlementDetails26.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#mmRegistration
	 * SettlementDetails15.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails34#mmRegistration
	 * SettlementDetails34.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails49#mmRegistration
	 * SettlementDetails49.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails58#mmRegistration
	 * SettlementDetails58.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#mmRegistration
	 * SettlementDetails36.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails18#mmRegistration
	 * SettlementDetails18.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#mmRegistration
	 * SettlementDetails66.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmRegistration
	 * SettlementDetails67.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#mmRegistration
	 * SettlementDetails70.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails16.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmRegistration
	 * SettlementDetails68.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails14.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmRegistration
	 * SettlementDetails69.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails15.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#mmRegistration
	 * SettlementDetails75.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#mmRegistration
	 * SettlementDetails74.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmAdditionalPhysicalOrRegistrationDetails
	 * Order17.mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmAdditionalPhysicalOrRegistrationDetails
	 * Order18.mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmRegistration
	 * SettlementDetails81.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#mmRegistration
	 * SettlementDetails80.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails17.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails18.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails19.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#mmRegistration
	 * SettlementDetails87.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#mmRegistration
	 * SettlementDetails83.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#mmRegistration
	 * SettlementDetails86.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#mmRegistration
	 * SettlementDetails85.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails21.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails22.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails20.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmRegistration
	 * SettlementDetails93.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#mmRegistration
	 * SettlementDetails90.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails99#mmRegistration
	 * SettlementDetails99.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmRegistration
	 * SettlementDetails94.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails100#mmRegistration
	 * SettlementDetails100.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#mmRegistration
	 * SettlementDetails95.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#mmRegistration
	 * SettlementDetails91.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#mmRegistration
	 * SettlementDetails92.mmRegistration}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldIndicator6#mmReason
	 * HoldIndicator6.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmRegistration
	 * SettlementDetails101.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmRegistration
	 * SettlementDetails111.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmRegistration
	 * SettlementDetails112.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#mmRegistration
	 * SettlementDetails110.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails108#mmRegistration
	 * SettlementDetails108.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails103#mmRegistration
	 * SettlementDetails103.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails23.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails25.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails24.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#mmRegistration
	 * SettlementDetails115.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#mmRegistration
	 * SettlementDetails117.mmRegistration}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldIndicator7#mmReason
	 * HoldIndicator7.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#mmRegistration
	 * SettlementDetails116.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#mmRegistration
	 * SettlementDetails113.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmRegistration
	 * SettlementDetails128.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmRegistration
	 * SettlementDetails120.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmRegistration
	 * SettlementDetails119.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#mmRegistration
	 * SettlementDetails125.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmRegistration
	 * SettlementDetails126.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails27.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails28.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails26.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmRegistration
	 * SettlementDetails122.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmRegistration
	 * SettlementDetails127.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmRegistration
	 * SettlementDetails121.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#mmRegistration
	 * SettlementDetails134.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmRegistration
	 * SettlementDetails137.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmRegistration
	 * SettlementDetails132.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails30.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#mmRegistration
	 * SettlementDetails138.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#mmRegistration
	 * SettlementDetails130.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails131#mmRegistration
	 * SettlementDetails131.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#mmRegistration
	 * SettlementDetails133.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails29.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails31.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#mmRegistration
	 * SettlementDetails139.mmRegistration}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to registration of securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRegistration = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails50.mmRegistration, PartyTextInformation1.mmRegistrationDetails, SecuritiesSettlementTransactionDetails3.mmAdditionalPhysicalOrRegistrationDetails,
					SecuritiesSettlementTransactionDetails4.mmAdditionalPhysicalOrRegistrationDetails, SecuritiesSettlementTransactionDetails2.mmAdditionalPhysicalOrRegistrationDetails, SettlementDetails51.mmRegistration,
					PartyTextInformation3.mmRegistrationDetails, SecuritiesSettlementTransactionDetails5.mmAdditionalPhysicalOrRegistrationDetails, SecuritiesSettlementTransactionDetails6.mmAdditionalPhysicalOrRegistrationDetails,
					SecuritiesSettlementTransactionDetails7.mmAdditionalPhysicalOrRegistrationDetails, HoldIndicator2.mmReason, HoldIndicator3.mmReason, HoldIndicator4.mmReason, HoldIndicator5.mmReason, SettlementDetails6.mmRegistration,
					SettlementDetails20.mmRegistration, SettlementDetails24.mmRegistration, SettlementDetails33.mmRegistration, SettlementDetails45.mmRegistration, SettlementDetails54.mmRegistration, SettlementDetails1.mmRegistration,
					SettlementDetails19.mmRegistration, SettlementDetails22.mmRegistration, SettlementDetails35.mmRegistration, SettlementDetails42.mmRegistration, SettlementDetails52.mmRegistration,
					SecuritiesSettlementTransactionDetails8.mmAdditionalPhysicalOrRegistrationDetails, SecuritiesSettlementTransactionDetails9.mmAdditionalPhysicalOrRegistrationDetails,
					SecuritiesSettlementTransactionDetails10.mmAdditionalPhysicalOrRegistrationDetails, SecuritiesSettlementTransactionDetails11.mmAdditionalPhysicalOrRegistrationDetails,
					SecuritiesSettlementTransactionDetails12.mmAdditionalPhysicalOrRegistrationDetails, SecuritiesSettlementTransactionDetails13.mmAdditionalPhysicalOrRegistrationDetails, SettlementDetails8.mmRegistration,
					SettlementDetails11.mmRegistration, SettlementDetails23.mmRegistration, SettlementDetails37.mmRegistration, SettlementDetails44.mmRegistration, SettlementDetails53.mmRegistration, SettlementDetails7.mmRegistration,
					SettlementDetails12.mmRegistration, SettlementDetails28.mmRegistration, SettlementDetails38.mmRegistration, SettlementDetails47.mmRegistration, SettlementDetails56.mmRegistration, SettlementDetails2.mmRegistration,
					SettlementDetails13.mmRegistration, SettlementDetails27.mmRegistration, SettlementDetails39.mmRegistration, SettlementDetails48.mmRegistration, SettlementDetails57.mmRegistration,
					Order16.mmAdditionalPhysicalOrRegistrationDetails, Order14.mmAdditionalPhysicalOrRegistrationDetails, SettlementDetails43.mmRegistration, SecuritiesAccount6.mmRegistrationDetails, SettlementDetails4.mmRegistration,
					SettlementDetails5.mmRegistration, SettlementDetails25.mmRegistration, SettlementDetails26.mmRegistration, SettlementDetails15.mmRegistration, SettlementDetails34.mmRegistration, SettlementDetails49.mmRegistration,
					SettlementDetails58.mmRegistration, SettlementDetails36.mmRegistration, SettlementDetails18.mmRegistration, SettlementDetails66.mmRegistration, SettlementDetails67.mmRegistration, SettlementDetails70.mmRegistration,
					SecuritiesSettlementTransactionDetails16.mmAdditionalPhysicalOrRegistrationDetails, SettlementDetails68.mmRegistration, SecuritiesSettlementTransactionDetails14.mmAdditionalPhysicalOrRegistrationDetails,
					SettlementDetails69.mmRegistration, SecuritiesSettlementTransactionDetails15.mmAdditionalPhysicalOrRegistrationDetails, SettlementDetails75.mmRegistration, SettlementDetails74.mmRegistration,
					Order17.mmAdditionalPhysicalOrRegistrationDetails, Order18.mmAdditionalPhysicalOrRegistrationDetails, SettlementDetails81.mmRegistration, SettlementDetails80.mmRegistration,
					SecuritiesSettlementTransactionDetails17.mmAdditionalPhysicalOrRegistrationDetails, SecuritiesSettlementTransactionDetails18.mmAdditionalPhysicalOrRegistrationDetails,
					SecuritiesSettlementTransactionDetails19.mmAdditionalPhysicalOrRegistrationDetails, SettlementDetails87.mmRegistration, SettlementDetails83.mmRegistration, SettlementDetails86.mmRegistration,
					SettlementDetails85.mmRegistration, SecuritiesSettlementTransactionDetails21.mmAdditionalPhysicalOrRegistrationDetails, SecuritiesSettlementTransactionDetails22.mmAdditionalPhysicalOrRegistrationDetails,
					SecuritiesSettlementTransactionDetails20.mmAdditionalPhysicalOrRegistrationDetails, SettlementDetails93.mmRegistration, SettlementDetails90.mmRegistration, SettlementDetails99.mmRegistration,
					SettlementDetails94.mmRegistration, SettlementDetails100.mmRegistration, SettlementDetails95.mmRegistration, SettlementDetails91.mmRegistration, SettlementDetails92.mmRegistration, HoldIndicator6.mmReason,
					SettlementDetails101.mmRegistration, SettlementDetails111.mmRegistration, SettlementDetails112.mmRegistration, SettlementDetails110.mmRegistration, SettlementDetails108.mmRegistration,
					SettlementDetails103.mmRegistration, SecuritiesSettlementTransactionDetails23.mmAdditionalPhysicalOrRegistrationDetails, SecuritiesSettlementTransactionDetails25.mmAdditionalPhysicalOrRegistrationDetails,
					SecuritiesSettlementTransactionDetails24.mmAdditionalPhysicalOrRegistrationDetails, SettlementDetails115.mmRegistration, SettlementDetails117.mmRegistration, HoldIndicator7.mmReason, SettlementDetails116.mmRegistration,
					SettlementDetails113.mmRegistration, SettlementDetails128.mmRegistration, SettlementDetails120.mmRegistration, SettlementDetails119.mmRegistration, SettlementDetails125.mmRegistration,
					SettlementDetails126.mmRegistration, SecuritiesSettlementTransactionDetails27.mmAdditionalPhysicalOrRegistrationDetails, SecuritiesSettlementTransactionDetails28.mmAdditionalPhysicalOrRegistrationDetails,
					SecuritiesSettlementTransactionDetails26.mmAdditionalPhysicalOrRegistrationDetails, SettlementDetails122.mmRegistration, SettlementDetails127.mmRegistration, SettlementDetails121.mmRegistration,
					SettlementDetails134.mmRegistration, SettlementDetails137.mmRegistration, SettlementDetails132.mmRegistration, SecuritiesSettlementTransactionDetails30.mmAdditionalPhysicalOrRegistrationDetails,
					SettlementDetails138.mmRegistration, SettlementDetails130.mmRegistration, SettlementDetails131.mmRegistration, SettlementDetails133.mmRegistration,
					SecuritiesSettlementTransactionDetails29.mmAdditionalPhysicalOrRegistrationDetails, SecuritiesSettlementTransactionDetails31.mmAdditionalPhysicalOrRegistrationDetails, SettlementDetails139.mmRegistration);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Registration";
			definition = "Information related to registration of securities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesRestriction> restriction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#mmSecurity
	 * SecuritiesRestriction.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction
	 * SecuritiesRestriction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmLegalRestrictions
	 * SettlementDetails50.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#mmLegalRestrictions
	 * SettlementDetails51.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative5#mmSecurityRestriction
	 * CorporateActionNarrative5.mmSecurityRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative15#mmSecurityRestriction
	 * CorporateActionNarrative15.mmSecurityRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative20#mmSecurityRestriction
	 * CorporateActionNarrative20.mmSecurityRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative22#mmSecurityRestriction
	 * CorporateActionNarrative22.mmSecurityRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#mmLegalRestrictions
	 * SettlementDetails9.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#mmLegalRestrictions
	 * SettlementDetails17.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#mmLegalRestrictions
	 * SettlementDetails30.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#mmLegalRestrictions
	 * SettlementDetails32.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#mmLegalRestrictions
	 * SettlementDetails60.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#mmLegalRestrictions
	 * SettlementDetails64.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#mmLegalRestrictions
	 * SettlementDetails3.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#mmLegalRestrictions
	 * SettlementDetails16.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#mmLegalRestrictions
	 * SettlementDetails31.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#mmLegalRestrictions
	 * SettlementDetails40.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmLegalRestrictions
	 * SettlementDetails62.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#mmLegalRestrictions
	 * SettlementDetails63.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#mmLegalRestrictions
	 * SettlementDetails6.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmLegalRestrictions
	 * SettlementDetails20.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#mmLegalRestrictions
	 * SettlementDetails24.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#mmLegalRestrictions
	 * SettlementDetails33.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#mmLegalRestrictions
	 * SettlementDetails45.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#mmLegalRestrictions
	 * SettlementDetails54.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#mmLegalRestrictions
	 * SettlementDetails1.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#mmLegalRestrictions
	 * SettlementDetails19.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmLegalRestrictions
	 * SettlementDetails22.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmLegalRestrictions
	 * SettlementDetails35.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmLegalRestrictions
	 * SettlementDetails42.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmLegalRestrictions
	 * SettlementDetails52.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#mmLegalRestrictions
	 * SettlementDetails8.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#mmLegalRestrictions
	 * SettlementDetails11.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#mmLegalRestrictions
	 * SettlementDetails23.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#mmLegalRestrictions
	 * SettlementDetails37.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmLegalRestrictions
	 * SettlementDetails44.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#mmLegalRestrictions
	 * SettlementDetails53.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#mmLegalRestrictions
	 * SettlementDetails7.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#mmLegalRestrictions
	 * SettlementDetails12.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#mmLegalRestrictions
	 * SettlementDetails28.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#mmLegalRestrictions
	 * SettlementDetails38.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#mmLegalRestrictions
	 * SettlementDetails47.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#mmLegalRestrictions
	 * SettlementDetails56.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#mmLegalRestrictions
	 * SettlementDetails2.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#mmLegalRestrictions
	 * SettlementDetails13.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#mmLegalRestrictions
	 * SettlementDetails27.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#mmLegalRestrictions
	 * SettlementDetails39.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#mmLegalRestrictions
	 * SettlementDetails48.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#mmLegalRestrictions
	 * SettlementDetails57.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmLegalRestrictions
	 * SettlementDetails43.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails4#mmLegalRestrictions
	 * SettlementDetails4.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#mmLegalRestrictions
	 * SettlementDetails10.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#mmLegalRestrictions
	 * SettlementDetails29.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#mmLegalRestrictions
	 * SettlementDetails5.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#mmLegalRestrictions
	 * SettlementDetails26.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#mmLegalRestrictions
	 * SettlementDetails65.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#mmLegalRestrictions
	 * SettlementDetails14.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#mmLegalRestrictions
	 * SettlementDetails41.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#mmLegalRestrictions
	 * SettlementDetails61.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#mmLegalRestrictions
	 * SettlementDetails59.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#mmLegalRestrictions
	 * SettlementDetails15.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#mmLegalRestrictions
	 * SettlementDetails36.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails18#mmLegalRestrictions
	 * SettlementDetails18.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#mmLegalRestrictions
	 * SettlementDetails66.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#mmLegalRestrictions
	 * CommonFinancialInstrumentAttributes1.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmLegalRestrictions
	 * SettlementDetails67.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#mmLegalRestrictions
	 * SettlementDetails70.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmLegalRestrictions
	 * SettlementDetails68.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmLegalRestrictions
	 * SettlementDetails69.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#mmLegalRestrictions
	 * SettlementDetails71.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmLegalRestrictions
	 * SettlementDetails72.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#mmLegalRestrictions
	 * SettlementDetails75.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#mmLegalRestrictions
	 * SettlementDetails73.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#mmLegalRestrictions
	 * SettlementDetails74.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmLegalRestrictions
	 * SettlementDetails81.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#mmLegalRestrictions
	 * SettlementDetails76.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#mmLegalRestrictions
	 * SettlementDetails80.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#mmLegalRestrictions
	 * SettlementDetails78.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#mmLegalRestrictions
	 * SettlementDetails77.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#mmLegalRestrictions
	 * SettlementDetails79.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#mmLegalRestrictions
	 * SettlementDetails87.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#mmLegalRestrictions
	 * SettlementDetails83.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#mmLegalRestrictions
	 * SettlementDetails86.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#mmLegalRestrictions
	 * SettlementDetails85.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmLegalRestrictions
	 * SettlementDetails93.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#mmLegalRestrictions
	 * SettlementDetails90.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmLegalRestrictions
	 * SettlementDetails96.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmLegalRestrictions
	 * SettlementDetails97.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmLegalRestrictions
	 * SettlementDetails94.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails100#mmLegalRestrictions
	 * SettlementDetails100.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#mmLegalRestrictions
	 * SettlementDetails95.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#mmLegalRestrictions
	 * SettlementDetails91.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#mmLegalRestrictions
	 * SettlementDetails92.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmLegalRestrictions
	 * SettlementDetails98.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative29#mmSecurityRestriction
	 * CorporateActionNarrative29.mmSecurityRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmLegalRestrictions
	 * SettlementDetails101.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative36#mmSecurityRestriction
	 * CorporateActionNarrative36.mmSecurityRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#mmLegalRestrictions
	 * SettlementDetails105.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#mmLegalRestrictions
	 * SettlementDetails106.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#mmLegalRestrictions
	 * SettlementDetails104.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmLegalRestrictions
	 * SettlementDetails111.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmLegalRestrictions
	 * SettlementDetails112.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#mmLegalRestrictions
	 * SettlementDetails110.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails103#mmLegalRestrictions
	 * SettlementDetails103.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#mmLegalRestrictions
	 * SettlementDetails107.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#mmLegalRestrictions
	 * SettlementDetails115.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#mmLegalRestrictions
	 * SettlementDetails117.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#mmLegalRestrictions
	 * SettlementDetails116.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#mmLegalRestrictions
	 * SettlementDetails113.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmLegalRestrictions
	 * SettlementDetails128.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmLegalRestrictions
	 * SettlementDetails120.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmLegalRestrictions
	 * SettlementDetails119.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmLegalRestrictions
	 * SettlementDetails126.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmLegalRestrictions
	 * SettlementDetails122.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmLegalRestrictions
	 * SettlementDetails127.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmLegalRestrictions
	 * SettlementDetails121.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#mmLegalRestrictions
	 * SettlementDetails134.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmLegalRestrictions
	 * SettlementDetails137.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmLegalRestrictions
	 * SettlementDetails132.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#mmLegalRestrictions
	 * SettlementDetails138.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#mmLegalRestrictions
	 * SettlementDetails130.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#mmLegalRestrictions
	 * SettlementDetails133.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#mmLegalRestrictions
	 * SettlementDetails139.mmLegalRestrictions}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Regulatory restriction(s) linked to the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRestriction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails50.mmLegalRestrictions, SettlementDetails51.mmLegalRestrictions, CorporateActionNarrative5.mmSecurityRestriction, CorporateActionNarrative15.mmSecurityRestriction,
					CorporateActionNarrative20.mmSecurityRestriction, CorporateActionNarrative22.mmSecurityRestriction, SettlementDetails9.mmLegalRestrictions, SettlementDetails17.mmLegalRestrictions,
					SettlementDetails30.mmLegalRestrictions, SettlementDetails32.mmLegalRestrictions, SettlementDetails60.mmLegalRestrictions, SettlementDetails64.mmLegalRestrictions, SettlementDetails3.mmLegalRestrictions,
					SettlementDetails16.mmLegalRestrictions, SettlementDetails31.mmLegalRestrictions, SettlementDetails40.mmLegalRestrictions, SettlementDetails62.mmLegalRestrictions, SettlementDetails63.mmLegalRestrictions,
					SettlementDetails6.mmLegalRestrictions, SettlementDetails20.mmLegalRestrictions, SettlementDetails24.mmLegalRestrictions, SettlementDetails33.mmLegalRestrictions, SettlementDetails45.mmLegalRestrictions,
					SettlementDetails54.mmLegalRestrictions, SettlementDetails1.mmLegalRestrictions, SettlementDetails19.mmLegalRestrictions, SettlementDetails22.mmLegalRestrictions, SettlementDetails35.mmLegalRestrictions,
					SettlementDetails42.mmLegalRestrictions, SettlementDetails52.mmLegalRestrictions, SettlementDetails8.mmLegalRestrictions, SettlementDetails11.mmLegalRestrictions, SettlementDetails23.mmLegalRestrictions,
					SettlementDetails37.mmLegalRestrictions, SettlementDetails44.mmLegalRestrictions, SettlementDetails53.mmLegalRestrictions, SettlementDetails7.mmLegalRestrictions, SettlementDetails12.mmLegalRestrictions,
					SettlementDetails28.mmLegalRestrictions, SettlementDetails38.mmLegalRestrictions, SettlementDetails47.mmLegalRestrictions, SettlementDetails56.mmLegalRestrictions, SettlementDetails2.mmLegalRestrictions,
					SettlementDetails13.mmLegalRestrictions, SettlementDetails27.mmLegalRestrictions, SettlementDetails39.mmLegalRestrictions, SettlementDetails48.mmLegalRestrictions, SettlementDetails57.mmLegalRestrictions,
					SettlementDetails43.mmLegalRestrictions, SettlementDetails4.mmLegalRestrictions, SettlementDetails10.mmLegalRestrictions, SettlementDetails29.mmLegalRestrictions, SettlementDetails5.mmLegalRestrictions,
					SettlementDetails26.mmLegalRestrictions, SettlementDetails65.mmLegalRestrictions, SettlementDetails14.mmLegalRestrictions, SettlementDetails41.mmLegalRestrictions, SettlementDetails61.mmLegalRestrictions,
					SettlementDetails59.mmLegalRestrictions, SettlementDetails15.mmLegalRestrictions, SettlementDetails36.mmLegalRestrictions, SettlementDetails18.mmLegalRestrictions, SettlementDetails66.mmLegalRestrictions,
					CommonFinancialInstrumentAttributes1.mmLegalRestrictions, SettlementDetails67.mmLegalRestrictions, SettlementDetails70.mmLegalRestrictions, SettlementDetails68.mmLegalRestrictions,
					SettlementDetails69.mmLegalRestrictions, SettlementDetails71.mmLegalRestrictions, SettlementDetails72.mmLegalRestrictions, SettlementDetails75.mmLegalRestrictions, SettlementDetails73.mmLegalRestrictions,
					SettlementDetails74.mmLegalRestrictions, SettlementDetails81.mmLegalRestrictions, SettlementDetails76.mmLegalRestrictions, SettlementDetails80.mmLegalRestrictions, SettlementDetails78.mmLegalRestrictions,
					SettlementDetails77.mmLegalRestrictions, SettlementDetails79.mmLegalRestrictions, SettlementDetails87.mmLegalRestrictions, SettlementDetails83.mmLegalRestrictions, SettlementDetails86.mmLegalRestrictions,
					SettlementDetails85.mmLegalRestrictions, SettlementDetails93.mmLegalRestrictions, SettlementDetails90.mmLegalRestrictions, SettlementDetails96.mmLegalRestrictions, SettlementDetails97.mmLegalRestrictions,
					SettlementDetails94.mmLegalRestrictions, SettlementDetails100.mmLegalRestrictions, SettlementDetails95.mmLegalRestrictions, SettlementDetails91.mmLegalRestrictions, SettlementDetails92.mmLegalRestrictions,
					SettlementDetails98.mmLegalRestrictions, CorporateActionNarrative29.mmSecurityRestriction, SettlementDetails101.mmLegalRestrictions, CorporateActionNarrative36.mmSecurityRestriction,
					SettlementDetails105.mmLegalRestrictions, SettlementDetails106.mmLegalRestrictions, SettlementDetails104.mmLegalRestrictions, SettlementDetails111.mmLegalRestrictions, SettlementDetails112.mmLegalRestrictions,
					SettlementDetails110.mmLegalRestrictions, SettlementDetails103.mmLegalRestrictions, SettlementDetails107.mmLegalRestrictions, SettlementDetails115.mmLegalRestrictions, SettlementDetails117.mmLegalRestrictions,
					SettlementDetails116.mmLegalRestrictions, SettlementDetails113.mmLegalRestrictions, SettlementDetails128.mmLegalRestrictions, SettlementDetails120.mmLegalRestrictions, SettlementDetails119.mmLegalRestrictions,
					SettlementDetails126.mmLegalRestrictions, SettlementDetails122.mmLegalRestrictions, SettlementDetails127.mmLegalRestrictions, SettlementDetails121.mmLegalRestrictions, SettlementDetails134.mmLegalRestrictions,
					SettlementDetails137.mmLegalRestrictions, SettlementDetails132.mmLegalRestrictions, SettlementDetails138.mmLegalRestrictions, SettlementDetails130.mmLegalRestrictions, SettlementDetails133.mmLegalRestrictions,
					SettlementDetails139.mmLegalRestrictions);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Restriction";
			definition = "Regulatory restriction(s) linked to the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesRestriction.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesRestriction.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionEvent> corporateEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmUnderlyingSecurity
	 * CorporateActionEvent.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification6#mmCorporateActionEventAndBalance
	 * AccountIdentification6.mmCorporateActionEventAndBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification12#mmCorporateActionEventAndBalance
	 * AccountIdentification12.mmCorporateActionEventAndBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification16#mmCorporateActionEventAndBalance
	 * AccountIdentification16.mmCorporateActionEventAndBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification22#mmCorporateActionEventAndBalance
	 * AccountIdentification22.mmCorporateActionEventAndBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification23#mmCorporateActionEventAndBalance
	 * AccountIdentification23.mmCorporateActionEventAndBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification24#mmCorporateActionEventAndBalance
	 * AccountIdentification24.mmCorporateActionEventAndBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification25#mmCorporateActionEventAndBalance
	 * AccountIdentification25.mmCorporateActionEventAndBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification29#mmCorporateActionEventAndBalance
	 * AccountIdentification29.mmCorporateActionEventAndBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails2#mmCorporateActionEventType
	 * IntraPositionDetails2.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails8#mmCorporateActionEventType
	 * IntraPositionDetails8.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails12#mmCorporateActionEventType
	 * IntraPositionDetails12.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails13#mmCorporateActionEventType
	 * IntraPositionDetails13.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails22#mmCorporateActionEventType
	 * IntraPositionDetails22.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails26#mmCorporateActionEventType
	 * IntraPositionDetails26.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#mmCorporateActionEventType
	 * IntraPositionDetails27.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails29#mmCorporateActionEventType
	 * IntraPositionDetails29.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmCorporateAction
	 * EntryTransaction1.mmCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmCorporateAction
	 * EntryTransaction2.mmCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#mmCorporateAction
	 * EntryTransaction3.mmCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmCorporateAction
	 * EntryTransaction4.mmCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmCorporateAction
	 * EntryTransaction7.mmCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#mmCorporateActionEventType
	 * IntraPositionDetails34.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmCorporateAction
	 * EntryTransaction8.mmCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification33#mmCorporateActionEventAndBalance
	 * AccountIdentification33.mmCorporateActionEventAndBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification35#mmCorporateActionEventAndBalance
	 * AccountIdentification35.mmCorporateActionEventAndBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails35#mmCorporateActionEventType
	 * IntraPositionDetails35.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification40#mmCorporateActionEventAndBalance
	 * AccountIdentification40.mmCorporateActionEventAndBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmCorporateActionEventType
	 * IntraPositionDetails41.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails43#mmCorporateActionEventType
	 * IntraPositionDetails43.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification41#mmCorporateActionEventAndBalance
	 * AccountIdentification41.mmCorporateActionEventAndBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate event linked to the security"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateEvent = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AccountIdentification6.mmCorporateActionEventAndBalance, AccountIdentification12.mmCorporateActionEventAndBalance, AccountIdentification16.mmCorporateActionEventAndBalance,
					AccountIdentification22.mmCorporateActionEventAndBalance, AccountIdentification23.mmCorporateActionEventAndBalance, AccountIdentification24.mmCorporateActionEventAndBalance,
					AccountIdentification25.mmCorporateActionEventAndBalance, AccountIdentification29.mmCorporateActionEventAndBalance, IntraPositionDetails2.mmCorporateActionEventType, IntraPositionDetails8.mmCorporateActionEventType,
					IntraPositionDetails12.mmCorporateActionEventType, IntraPositionDetails13.mmCorporateActionEventType, IntraPositionDetails22.mmCorporateActionEventType, IntraPositionDetails26.mmCorporateActionEventType,
					IntraPositionDetails27.mmCorporateActionEventType, IntraPositionDetails29.mmCorporateActionEventType, EntryTransaction1.mmCorporateAction, EntryTransaction2.mmCorporateAction, EntryTransaction3.mmCorporateAction,
					EntryTransaction4.mmCorporateAction, EntryTransaction7.mmCorporateAction, IntraPositionDetails34.mmCorporateActionEventType, EntryTransaction8.mmCorporateAction, AccountIdentification33.mmCorporateActionEventAndBalance,
					AccountIdentification35.mmCorporateActionEventAndBalance, IntraPositionDetails35.mmCorporateActionEventType, AccountIdentification40.mmCorporateActionEventAndBalance, IntraPositionDetails41.mmCorporateActionEventType,
					IntraPositionDetails43.mmCorporateActionEventType, AccountIdentification41.mmCorporateActionEventAndBalance);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateEvent";
			definition = "Corporate event linked to the security";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmUnderlyingSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected YesNoIndicator temporaryFinancialInstrumentIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator1Choice#mmTemporaryIndicator
	 * TemporaryFinancialInstrumentIndicator1Choice.mmTemporaryIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator1Choice#mmProprietary
	 * TemporaryFinancialInstrumentIndicator1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption3#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption3.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator2Choice#mmTemporaryIndicator
	 * TemporaryFinancialInstrumentIndicator2Choice.mmTemporaryIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator2Choice#mmProprietary
	 * TemporaryFinancialInstrumentIndicator2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption8#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption8.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption18#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption18.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption20#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption20.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption26#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption26.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption31#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption31.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption35#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption35.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption36#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption36.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption4#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption4.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption10#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption10.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption13#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption13.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption17#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption17.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption24.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption29#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption29.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption33.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption38#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption38.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption37#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption37.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption39#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption39.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption6#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption6.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption12#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption12.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption14#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption14.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption22#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption22.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption25#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption25.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption30.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmTemporaryFinancialInstrumentIndicator
	 * SecurityOption1.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption42#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption42.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption40#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption40.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption48#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption48.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption45#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption45.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption49.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator3Choice#mmTemporaryIndicator
	 * TemporaryFinancialInstrumentIndicator3Choice.mmTemporaryIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator3Choice#mmProprietary
	 * TemporaryFinancialInstrumentIndicator3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption50.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption55.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption57.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator4Choice#mmTemporaryIndicator
	 * TemporaryFinancialInstrumentIndicator4Choice.mmTemporaryIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator4Choice#mmProprietary
	 * TemporaryFinancialInstrumentIndicator4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption60.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption59.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption61.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption63.mmTemporaryFinancialInstrumentIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TemporaryFinancialInstrumentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies that the security is a temporary security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTemporaryFinancialInstrumentIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TemporaryFinancialInstrumentIndicator1Choice.mmTemporaryIndicator, TemporaryFinancialInstrumentIndicator1Choice.mmProprietary, SecuritiesOption3.mmTemporaryFinancialInstrumentIndicator,
					TemporaryFinancialInstrumentIndicator2Choice.mmTemporaryIndicator, TemporaryFinancialInstrumentIndicator2Choice.mmProprietary, SecuritiesOption8.mmTemporaryFinancialInstrumentIndicator,
					SecuritiesOption18.mmTemporaryFinancialInstrumentIndicator, SecuritiesOption20.mmTemporaryFinancialInstrumentIndicator, SecuritiesOption26.mmTemporaryFinancialInstrumentIndicator,
					SecuritiesOption31.mmTemporaryFinancialInstrumentIndicator, SecuritiesOption35.mmTemporaryFinancialInstrumentIndicator, SecuritiesOption36.mmTemporaryFinancialInstrumentIndicator,
					SecuritiesOption4.mmTemporaryFinancialInstrumentIndicator, SecuritiesOption10.mmTemporaryFinancialInstrumentIndicator, SecuritiesOption13.mmTemporaryFinancialInstrumentIndicator,
					SecuritiesOption17.mmTemporaryFinancialInstrumentIndicator, SecuritiesOption24.mmTemporaryFinancialInstrumentIndicator, SecuritiesOption29.mmTemporaryFinancialInstrumentIndicator,
					SecuritiesOption33.mmTemporaryFinancialInstrumentIndicator, SecuritiesOption38.mmTemporaryFinancialInstrumentIndicator, SecuritiesOption37.mmTemporaryFinancialInstrumentIndicator,
					SecuritiesOption39.mmTemporaryFinancialInstrumentIndicator, SecuritiesOption6.mmTemporaryFinancialInstrumentIndicator, SecuritiesOption12.mmTemporaryFinancialInstrumentIndicator,
					SecuritiesOption14.mmTemporaryFinancialInstrumentIndicator, SecuritiesOption22.mmTemporaryFinancialInstrumentIndicator, SecuritiesOption25.mmTemporaryFinancialInstrumentIndicator,
					SecuritiesOption30.mmTemporaryFinancialInstrumentIndicator, SecurityOption1.mmTemporaryFinancialInstrumentIndicator, SecuritiesOption42.mmTemporaryFinancialInstrumentIndicator,
					SecuritiesOption40.mmTemporaryFinancialInstrumentIndicator, SecuritiesOption48.mmTemporaryFinancialInstrumentIndicator, SecuritiesOption45.mmTemporaryFinancialInstrumentIndicator,
					SecuritiesOption49.mmTemporaryFinancialInstrumentIndicator, TemporaryFinancialInstrumentIndicator3Choice.mmTemporaryIndicator, TemporaryFinancialInstrumentIndicator3Choice.mmProprietary,
					SecuritiesOption50.mmTemporaryFinancialInstrumentIndicator, SecuritiesOption55.mmTemporaryFinancialInstrumentIndicator, SecuritiesOption57.mmTemporaryFinancialInstrumentIndicator,
					TemporaryFinancialInstrumentIndicator4Choice.mmTemporaryIndicator, TemporaryFinancialInstrumentIndicator4Choice.mmProprietary, SecuritiesOption60.mmTemporaryFinancialInstrumentIndicator,
					SecuritiesOption59.mmTemporaryFinancialInstrumentIndicator, SecuritiesOption61.mmTemporaryFinancialInstrumentIndicator, SecuritiesOption63.mmTemporaryFinancialInstrumentIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TemporaryFinancialInstrumentIndicator";
			definition = "Specifies that the security is a temporary security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getTemporaryFinancialInstrumentIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime availableDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate1#mmAvailableDate
	 * SecurityDate1.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate3#mmAvailableDate
	 * SecurityDate3.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate6#mmAvailableDate
	 * SecurityDate6.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate7#mmAvailableDate
	 * SecurityDate7.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate2#mmAvailableDate
	 * SecurityDate2.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate4#mmAvailableDate
	 * SecurityDate4.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate5#mmAvailableDate
	 * SecurityDate5.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate8#mmAvailableDate
	 * SecurityDate8.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate9#mmAvailableDate
	 * SecurityDate9.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate10#mmAvailableDate
	 * SecurityDate10.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails2#mmAvailableDate
	 * IntraPositionDetails2.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails8#mmAvailableDate
	 * IntraPositionDetails8.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails12#mmAvailableDate
	 * IntraPositionDetails12.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails13#mmAvailableDate
	 * IntraPositionDetails13.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails22#mmAvailableDate
	 * IntraPositionDetails22.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails26#mmAvailableDate
	 * IntraPositionDetails26.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#mmAvailableDate
	 * IntraPositionDetails27.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails29#mmAvailableDate
	 * IntraPositionDetails29.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails1#mmAvailableDate
	 * IntraPositionMovementDetails1.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails2#mmAvailableDate
	 * IntraPositionMovementDetails2.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails5#mmAvailableDate
	 * IntraPositionMovementDetails5.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#mmAvailableDate
	 * IntraPositionMovementDetails6.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails7#mmAvailableDate
	 * IntraPositionMovementDetails7.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails8#mmAvailableDate
	 * IntraPositionMovementDetails8.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails9#mmAvailableDate
	 * IntraPositionMovementDetails9.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails10#mmAvailableDate
	 * IntraPositionMovementDetails10.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3#mmAvailableDate
	 * CorporateActionDate3.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails3#mmAvailableDate
	 * IntraPositionMovementDetails3.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails4#mmAvailableDate
	 * IntraPositionMovementDetails4.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#mmAvailableDate
	 * IntraPositionDetails34.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails11#mmAvailableDate
	 * IntraPositionMovementDetails11.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate12#mmAvailableDate
	 * SecurityDate12.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate11#mmAvailableDate
	 * SecurityDate11.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate14#mmAvailableDate
	 * SecurityDate14.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate13#mmAvailableDate
	 * SecurityDate13.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails35#mmAvailableDate
	 * IntraPositionDetails35.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails12#mmAvailableDate
	 * IntraPositionMovementDetails12.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmAvailableDate
	 * IntraPositionDetails41.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13#mmAvailableDate
	 * IntraPositionMovementDetails13.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails43#mmAvailableDate
	 * IntraPositionDetails43.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails14#mmAvailableDate
	 * IntraPositionMovementDetails14.mmAvailableDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which securities become available for sale."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAvailableDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityDate1.mmAvailableDate, SecurityDate3.mmAvailableDate, SecurityDate6.mmAvailableDate, SecurityDate7.mmAvailableDate, SecurityDate2.mmAvailableDate, SecurityDate4.mmAvailableDate,
					SecurityDate5.mmAvailableDate, SecurityDate8.mmAvailableDate, SecurityDate9.mmAvailableDate, SecurityDate10.mmAvailableDate, IntraPositionDetails2.mmAvailableDate, IntraPositionDetails8.mmAvailableDate,
					IntraPositionDetails12.mmAvailableDate, IntraPositionDetails13.mmAvailableDate, IntraPositionDetails22.mmAvailableDate, IntraPositionDetails26.mmAvailableDate, IntraPositionDetails27.mmAvailableDate,
					IntraPositionDetails29.mmAvailableDate, IntraPositionMovementDetails1.mmAvailableDate, IntraPositionMovementDetails2.mmAvailableDate, IntraPositionMovementDetails5.mmAvailableDate,
					IntraPositionMovementDetails6.mmAvailableDate, IntraPositionMovementDetails7.mmAvailableDate, IntraPositionMovementDetails8.mmAvailableDate, IntraPositionMovementDetails9.mmAvailableDate,
					IntraPositionMovementDetails10.mmAvailableDate, CorporateActionDate3.mmAvailableDate, IntraPositionMovementDetails3.mmAvailableDate, IntraPositionMovementDetails4.mmAvailableDate, IntraPositionDetails34.mmAvailableDate,
					IntraPositionMovementDetails11.mmAvailableDate, SecurityDate12.mmAvailableDate, SecurityDate11.mmAvailableDate, SecurityDate14.mmAvailableDate, SecurityDate13.mmAvailableDate, IntraPositionDetails35.mmAvailableDate,
					IntraPositionMovementDetails12.mmAvailableDate, IntraPositionDetails41.mmAvailableDate, IntraPositionMovementDetails13.mmAvailableDate, IntraPositionDetails43.mmAvailableDate,
					IntraPositionMovementDetails14.mmAvailableDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AvailableDate";
			definition = "Date on which securities become available for sale.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getAvailableDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max350Text declarationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative4#mmDeclarationDetails
	 * CorporateActionNarrative4.mmDeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14#mmDeclarationDetails
	 * CorporateActionNarrative14.mmDeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative6#mmDeclarationDetails
	 * CorporateActionNarrative6.mmDeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative16#mmDeclarationDetails
	 * CorporateActionNarrative16.mmDeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative11#mmDeclarationDetails
	 * CorporateActionNarrative11.mmDeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17#mmDeclarationDetails
	 * CorporateActionNarrative17.mmDeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative2#mmDeclarationDetails
	 * CorporateActionNarrative2.mmDeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmDeclarationDetails
	 * BeneficialOwner1.mmDeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmDeclarationDetails
	 * BeneficialOwner2.mmDeclarationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclarationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides declaration details narrative relative to the financial instrument, eg, beneficial ownership."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDeclarationDetails = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionNarrative4.mmDeclarationDetails, CorporateActionNarrative14.mmDeclarationDetails, CorporateActionNarrative6.mmDeclarationDetails,
					CorporateActionNarrative16.mmDeclarationDetails, CorporateActionNarrative11.mmDeclarationDetails, CorporateActionNarrative17.mmDeclarationDetails, CorporateActionNarrative2.mmDeclarationDetails,
					BeneficialOwner1.mmDeclarationDetails, BeneficialOwner2.mmDeclarationDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeclarationDetails";
			definition = "Provides declaration details narrative relative to the financial instrument, eg, beneficial ownership.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getDeclarationDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Spread spread;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Spread#mmBenchmarkSecurity
	 * Spread.mmBenchmarkSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Spread Spread}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3#mmSpread
	 * CorporateActionRate3.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate14#mmSpread
	 * CorporateActionRate14.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate16#mmSpread
	 * CorporateActionRate16.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate24#mmSpread
	 * CorporateActionRate24.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate27#mmSpread
	 * CorporateActionRate27.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate32#mmSpread
	 * CorporateActionRate32.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate35#mmSpread
	 * CorporateActionRate35.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate41#mmSpread
	 * CorporateActionRate41.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate1#mmSpread
	 * CorporateActionRate1.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate43#mmSpread
	 * CorporateActionRate43.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate56#mmSpread
	 * CorporateActionRate56.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#mmSpread
	 * CorporateActionRate66.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate78#mmSpread
	 * CorporateActionRate78.mmSpread}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Spread that uses the security as benchmark reference."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSpread = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate3.mmSpread, CorporateActionRate14.mmSpread, CorporateActionRate16.mmSpread, CorporateActionRate24.mmSpread, CorporateActionRate27.mmSpread,
					CorporateActionRate32.mmSpread, CorporateActionRate35.mmSpread, CorporateActionRate41.mmSpread, CorporateActionRate1.mmSpread, CorporateActionRate43.mmSpread, CorporateActionRate56.mmSpread,
					CorporateActionRate66.mmSpread, CorporateActionRate78.mmSpread);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Spread that uses the security as benchmark reference.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.mmBenchmarkSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Dividend> dividend;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmSecurity
	 * Dividend.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#mmDividendType
	 * CorporateAction3.mmDividendType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#mmDividendType
	 * CorporateAction4.mmDividendType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#mmDividendType
	 * CorporateAction7.mmDividendType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#mmDividendType
	 * CorporateAction8.mmDividendType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmDividendType
	 * CorporateAction10.mmDividendType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#mmDividendType
	 * CorporateAction11.mmDividendType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmDividendType
	 * CorporateAction2.mmDividendType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmDividendType
	 * CorporateAction12.mmDividendType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmDividendType
	 * CorporateAction17.mmDividendType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD13#mmDividendType
	 * CorporateActionSD13.mmDividendType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmDividendType
	 * CorporateAction31.mmDividendType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmDividendType
	 * CorporateAction40.mmDividendType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend per financial instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDividend = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction3.mmDividendType, CorporateAction4.mmDividendType, CorporateAction7.mmDividendType, CorporateAction8.mmDividendType, CorporateAction10.mmDividendType,
					CorporateAction11.mmDividendType, CorporateAction2.mmDividendType, CorporateAction12.mmDividendType, CorporateAction17.mmDividendType, CorporateActionSD13.mmDividendType, CorporateAction31.mmDividendType,
					CorporateAction40.mmDividendType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Dividend per financial instrument.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
		}
	};
	protected SecuritiesBalance balance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecurity
	 * SecuritiesBalance.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of the account which holds a specific security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Balance of the account which holds a specific security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	protected YesNoIndicator fungibleIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount1#mmFungibleIndicator
	 * SafekeepingAccount1.mmFungibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification2#mmFungibleIndicator
	 * SubAccountIdentification2.mmFungibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount2#mmFungibleIndicator
	 * SafekeepingAccount2.mmFungibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification3#mmFungibleIndicator
	 * SubAccountIdentification3.mmFungibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification1#mmFungibleIndicator
	 * SubAccountIdentification1.mmFungibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification5#mmFungibleIndicator
	 * SubAccountIdentification5.mmFungibleIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FungibleIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a security is interchangeable, ie, the security is allowed to be replaced by another security, without loss of value."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFungibleIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SafekeepingAccount1.mmFungibleIndicator, SubAccountIdentification2.mmFungibleIndicator, SafekeepingAccount2.mmFungibleIndicator, SubAccountIdentification3.mmFungibleIndicator,
					SubAccountIdentification1.mmFungibleIndicator, SubAccountIdentification5.mmFungibleIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FungibleIndicator";
			definition = "Indicates whether a security is interchangeable, ie, the security is allowed to be replaced by another security, without loss of value.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getFungibleIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AppearanceCode appearance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AppearanceCode
	 * AppearanceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmAppearance
	 * FinancialInstrumentAttributes1.mmAppearance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmAppearance
	 * FutureOrOptionDetails1.mmAppearance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Appearance2Choice#mmCode
	 * Appearance2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Appearance2Choice#mmProprietary
	 * Appearance2Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Appearance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the deliverability of a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAppearance = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes1.mmAppearance, FutureOrOptionDetails1.mmAppearance, Appearance2Choice.mmCode, Appearance2Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Appearance";
			definition = "Specifies the deliverability of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AppearanceCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getAppearance", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number nearTermPositionLimit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmNTPositionLimit
	 * FinancialInstrumentAttributes1.mmNTPositionLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmNearTermPositionLimit
	 * FutureOrOptionDetails1.mmNearTermPositionLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#mmNearTermPositionLimit
	 * CommonFinancialInstrumentAttributes1.mmNearTermPositionLimit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NearTermPositionLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position limit in the near-term contract for a given exchange-traded product."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNearTermPositionLimit = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes1.mmNTPositionLimit, FutureOrOptionDetails1.mmNearTermPositionLimit, CommonFinancialInstrumentAttributes1.mmNearTermPositionLimit);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NearTermPositionLimit";
			definition = "Position limit in the near-term contract for a given exchange-traded product.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getNearTermPositionLimit", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISOYearMonth contractSettlementMonth;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISOYearMonth ISOYearMonth}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmContractSettlementMonth
	 * FinancialInstrumentAttributes1.mmContractSettlementMonth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmContractSettlementMonth
	 * FutureOrOptionDetails1.mmContractSettlementMonth}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 667</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractSettlementMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies when the contract (i.e. MBS/TBA) will settle."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmContractSettlementMonth = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes1.mmContractSettlementMonth, FutureOrOptionDetails1.mmContractSettlementMonth);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "667"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContractSettlementMonth";
			definition = "Specifies when the contract (i.e. MBS/TBA) will settle.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getContractSettlementMonth", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number minimumTradingPricingIncrement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmMinimumTradingPricingIncrement
	 * FinancialInstrumentAttributes1.mmMinimumTradingPricingIncrement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmMinimumTradingPricingIncrement
	 * FutureOrOptionDetails1.mmMinimumTradingPricingIncrement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingParameters1#mmMinimumTradingPricingIncrement
	 * TradingParameters1.mmMinimumTradingPricingIncrement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumTradingPricingIncrement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum price increase for a given exchange-traded Instrument"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMinimumTradingPricingIncrement = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes1.mmMinimumTradingPricingIncrement, FutureOrOptionDetails1.mmMinimumTradingPricingIncrement, TradingParameters1.mmMinimumTradingPricingIncrement);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumTradingPricingIncrement";
			definition = "Minimum price increase for a given exchange-traded Instrument";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getMinimumTradingPricingIncrement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Rating> rating;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Rating#mmSecurity
	 * Rating.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Rating Rating}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmRating
	 * FinancialInstrumentAttributes1.mmRating}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmRating
	 * FinancialInstrumentStipulations.mmRating}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmRating
	 * FinancialInstrumentAttributes31.mmRating}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmRating
	 * FinancialInstrumentStipulations2.mmRating}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmRating
	 * FutureOrOptionDetails1.mmRating}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmRating
	 * FinancialInstrumentAttributes44.mmRating}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rating"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rating(s) of the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRating = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes1.mmRating, FinancialInstrumentStipulations.mmRating, FinancialInstrumentAttributes31.mmRating, FinancialInstrumentStipulations2.mmRating,
					FutureOrOptionDetails1.mmRating, FinancialInstrumentAttributes44.mmRating);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rating";
			definition = "Rating(s) of the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Rating.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Rating.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CouponAttached> couponAttached;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached#mmSecurity
	 * CouponAttached.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CouponAttached
	 * CouponAttached}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmCouponRange
	 * FinancialInstrumentStipulations.mmCouponRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmCouponRange
	 * FinancialInstrumentStipulations2.mmCouponRange}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponAttached"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Coupon information of the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCouponAttached = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentStipulations.mmCouponRange, FinancialInstrumentStipulations2.mmCouponRange);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CouponAttached";
			definition = "Coupon information of the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CouponAttached.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CouponAttached.mmObject();
		}
	};
	protected Sector sector;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Sector#mmSecurity
	 * Sector.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Sector Sector}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmSector
	 * FinancialInstrumentStipulations.mmSector}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmSector
	 * FinancialInstrumentStipulations2.mmSector}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmSector
	 * Debt2.mmSector}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sector"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the market sector the security is classified as pharmaceuticals, automobile, housing, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSector = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentStipulations.mmSector, FinancialInstrumentStipulations2.mmSector, Debt2.mmSector);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Sector";
			definition = "Indicates the market sector the security is classified as pharmaceuticals, automobile, housing, etc.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Sector.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Sector.mmObject();
		}
	};
	protected YesNoIndicator warrantAttachedOnDelivery;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmWarrantAttachedOnDelivery
	 * FinancialInstrumentAttributes31.mmWarrantAttachedOnDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmWarrantAttachedOnDelivery
	 * FinancialInstrumentAttributes44.mmWarrantAttachedOnDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmWarrantAttachedOnDelivery
	 * FinancialInstrumentAttributes2.mmWarrantAttachedOnDelivery}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantAttachedOnDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the warrants on a financial instrument (which has been traded cum warrants) will be attached on delivery."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmWarrantAttachedOnDelivery = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes31.mmWarrantAttachedOnDelivery, FinancialInstrumentAttributes44.mmWarrantAttachedOnDelivery, FinancialInstrumentAttributes2.mmWarrantAttachedOnDelivery);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WarrantAttachedOnDelivery";
			definition = "Indicates whether the warrants on a financial instrument (which has been traded cum warrants) will be attached on delivery.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getWarrantAttachedOnDelivery", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator strippableIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmStrippableIndicator
	 * FutureOrOptionDetails1.mmStrippableIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrippableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interest is separable from the principal."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStrippableIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FutureOrOptionDetails1.mmStrippableIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StrippableIndicator";
			definition = "Indicates whether the interest is separable from the principal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getStrippableIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime firstDealingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmFirstDealingDate
	 * FutureOrOptionDetails1.mmFirstDealingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3#mmFirstDealingDate
	 * CorporateActionDate3.mmFirstDealingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstDealingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which new securities begin trading."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFirstDealingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FutureOrOptionDetails1.mmFirstDealingDate, CorporateActionDate3.mmFirstDealingDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstDealingDate";
			definition = "Date on which new securities begin trading.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getFirstDealingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesTax> taxDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmSecurity
	 * SecuritiesTax.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTax
	 * SecuritiesTax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount8#mmStampDuty
	 * SecuritiesAccount8.mmStampDuty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax details of the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTaxDetails = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesAccount8.mmStampDuty);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxDetails";
			definition = "Tax details of the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
		}
	};
	protected SecuritiesTrade securitiesTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecurity
	 * SecuritiesTrade.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade in which the security is involved."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTrade";
			definition = "Trade in which the security is involved.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
		}
	};
	protected Jurisdiction registrationJurisdiction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmRegisteredSecurities
	 * Jurisdiction.mmRegisteredSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Jurisdiction
	 * Jurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationJurisdiction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Jurisdiction (country, county, state, province, city) in which the security is legally recorded for regulatory and/or tax purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRegistrationJurisdiction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationJurisdiction";
			definition = "Jurisdiction (country, county, state, province, city) in which the security is legally recorded for regulatory and/or tax purposes.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmRegisteredSecurities;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesPartyRole> partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#mmSecurity
	 * SecuritiesPartyRole.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole
	 * SecuritiesPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies roles played by a party that are linked to the handling of securities but not related to a specific process."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies roles played by a party that are linked to the handling of securities but not related to a specific process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesStatus> securityStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus#mmSecurity
	 * SecuritiesStatus.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesStatus
	 * SecuritiesStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#mmSecurityStatus
	 * CommonFinancialInstrumentAttributes1.mmSecurityStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the security within its lifecycle."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecurityStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CommonFinancialInstrumentAttributes1.mmSecurityStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityStatus";
			definition = "Specifies the status of the security within its lifecycle.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesStatus.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesStatus.mmObject();
		}
	};
	protected SecuritiesModification modification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmNewSecurityReferenceData
	 * SecuritiesModification.mmNewSecurityReferenceData}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification process which applies to a specific security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmModification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Modification";
			definition = "Modification process which applies to a specific security.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmNewSecurityReferenceData;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.RedemptionSchedule> redemptionSchedule;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmSecurity
	 * RedemptionSchedule.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RedemptionSchedule
	 * RedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionSchedule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "RedemptionSchedule(s) linked to the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRedemptionSchedule = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RedemptionSchedule";
			definition = "RedemptionSchedule(s) linked to the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesSettlement> securitiesSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecurity
	 * SecuritiesSettlement.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#mmSettlementParameters
	 * SecuritiesCollateral3.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#mmSettlementParameters
	 * SecuritiesCollateral4.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5#mmSettlementParameters
	 * SecuritiesCollateral5.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmSettlementParameters
	 * SecuritiesCollateral7.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#mmSettlementParameters
	 * SecuritiesCollateral8.mmSettlementParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement of a specific security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesCollateral3.mmSettlementParameters, SecuritiesCollateral4.mmSettlementParameters, SecuritiesCollateral5.mmSettlementParameters, SecuritiesCollateral7.mmSettlementParameters,
					SecuritiesCollateral8.mmSettlementParameters);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Settlement of a specific security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};
	protected SecuritiesTransfer securitiesTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmSecurity
	 * SecuritiesTransfer.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer process in which that security is transferred.."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTransfer";
			definition = "Transfer process in which that security is transferred..";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.AgentCorporateActionStandingInstruction> corporateActionStandingInstructions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#mmSecurity
	 * AgentCorporateActionStandingInstruction.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction
	 * AgentCorporateActionStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionStandingInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Standing instructions related to the security in the context of corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateActionStandingInstructions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStandingInstructions";
			definition = "Standing instructions related to the security in the context of corporate action.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.mmObject();
		}
	};
	protected Quote quote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmQuotedSecurity
	 * Quote.mmQuotedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote of a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quote";
			definition = "Quote of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.mmQuotedSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
		}
	};
	protected SecuritiesOrder securitiesOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedSecurity
	 * SecuritiesOrder.mmOrderedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order for which a specific security is indicated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrder";
			definition = "Order for which a specific security is indicated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmOrderedSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	protected VariableInterest relatedVariableInterest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmBenchmarkReference
	 * VariableInterest.mmBenchmarkReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedVariableInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Variable interest parameters specified for interest related to a financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedVariableInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedVariableInterest";
			definition = "Variable interest parameters specified for interest related to a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmBenchmarkReference;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesConversion> conversion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmSecurityIdentification
	 * SecuritiesConversion.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Conversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the conversion exchange of an entitlement or of preferred equities or of convertible bonds, into another form of securities, usually common equities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmConversion = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Conversion";
			definition = "Information on the conversion exchange of an entitlement or of preferred equities or of convertible bonds, into another form of securities, usually common equities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmSecurityIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ComponentSecurity> componentSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ComponentSecurity#mmSecurity
	 * ComponentSecurity.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ComponentSecurity
	 * ComponentSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComponentSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The security is part of the component security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmComponentSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ComponentSecurity";
			definition = "The security is part of the component security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ComponentSecurity.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ComponentSecurity.mmObject();
		}
	};
	protected YesNoIndicator recompositionIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecompositionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interest and the principal can be recomposed. This is the reverse operation of stripping."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRecompositionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RecompositionIndicator";
			definition = "Indicates whether the interest and the principal can be recomposed. This is the reverse operation of stripping.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getRecompositionIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text series;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Series"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier that links multiple security classes."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSeries = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Series";
			definition = "Identifier that links multiple security classes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getSeries", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate percentageOfDebtClaim;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#mmPercentageOfDebtClaim
	 * FinancialInstrumentAttributes7.mmPercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#mmPercentageOfDebtClaim
	 * FinancialInstrumentAttributes11.mmPercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#mmPercentageOfDebtClaim
	 * FinancialInstrumentAttributes19.mmPercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#mmPercentageOfDebtClaim
	 * FinancialInstrumentAttributes23.mmPercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#mmPercentageOfDebtClaim
	 * FinancialInstrumentAttributes33.mmPercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#mmPercentageOfDebtClaim
	 * FinancialInstrumentAttributes39.mmPercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#mmPercentageOfDebtClaim
	 * FinancialInstrumentAttributes43.mmPercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#mmPercentageOfDebtClaim
	 * FinancialInstrumentAttributes45.mmPercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmPercentageOfDebtClaims
	 * FinancialInstrumentAttributes31.mmPercentageOfDebtClaims}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmPercentageOfDebtClaims
	 * FinancialInstrumentAttributes44.mmPercentageOfDebtClaims}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmPercentageOfDebtClaim
	 * FinancialInstrumentAttributes48.mmPercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#mmPercentageOfDebtClaim
	 * FinancialInstrumentAttributes55.mmPercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmPercentageOfDebtClaim
	 * FinancialInstrumentAttributes66.mmPercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#mmPercentageOfDebtClaim
	 * FinancialInstrumentAttributes70.mmPercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmPercentageOfDebtClaim
	 * FinancialInstrumentAttributes79.mmPercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#mmPercentageOfDebtClaim
	 * FinancialInstrumentAttributes85.mmPercentageOfDebtClaim}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOfDebtClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the underlying assets of a fund that represents a debt and is in the scope of the EU Savings directive."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPercentageOfDebtClaim = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes7.mmPercentageOfDebtClaim, FinancialInstrumentAttributes11.mmPercentageOfDebtClaim, FinancialInstrumentAttributes19.mmPercentageOfDebtClaim,
					FinancialInstrumentAttributes23.mmPercentageOfDebtClaim, FinancialInstrumentAttributes33.mmPercentageOfDebtClaim, FinancialInstrumentAttributes39.mmPercentageOfDebtClaim,
					FinancialInstrumentAttributes43.mmPercentageOfDebtClaim, FinancialInstrumentAttributes45.mmPercentageOfDebtClaim, FinancialInstrumentAttributes31.mmPercentageOfDebtClaims,
					FinancialInstrumentAttributes44.mmPercentageOfDebtClaims, FinancialInstrumentAttributes48.mmPercentageOfDebtClaim, FinancialInstrumentAttributes55.mmPercentageOfDebtClaim,
					FinancialInstrumentAttributes66.mmPercentageOfDebtClaim, FinancialInstrumentAttributes70.mmPercentageOfDebtClaim, FinancialInstrumentAttributes79.mmPercentageOfDebtClaim,
					FinancialInstrumentAttributes85.mmPercentageOfDebtClaim);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PercentageOfDebtClaim";
			definition = "Percentage of the underlying assets of a fund that represents a debt and is in the scope of the EU Savings directive.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getPercentageOfDebtClaim", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate coverRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of dividends the issuer intends to pay out the following year based on their normalised earnings."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCoverRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CoverRate";
			definition = "Amount of dividends the issuer intends to pay out the following year based on their normalised earnings.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getCoverRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MaturityRedemptionTypeCode maturityRedemption;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MaturityRedemptionTypeCode
	 * MaturityRedemptionTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityRedemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Return of an investor's principal in a security at maturity."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMaturityRedemption = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityRedemption";
			definition = "Return of an investor's principal in a security at maturity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MaturityRedemptionTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getMaturityRedemption", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MarginCall relatedMarginCall;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmSecurity
	 * MarginCall.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MarginCall
	 * MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMarginCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin call for which the associated securities are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedMarginCall = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedMarginCall";
			definition = "Margin call for which the associated securities are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.MarginCall.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
		}
	};
	protected Party closeLink;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmCloseLinkSecurity
	 * Party.mmCloseLinkSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CloseLink1#mmSecurityIdentification
	 * CloseLink1.mmSecurityIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CloseLink"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Situation in which two entities are linked because one of these entities owns some of the capital of the other one, or has a control relationship with it."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCloseLink = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CloseLink1.mmSecurityIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CloseLink";
			definition = "Situation in which two entities are linked because one of these entities owns some of the capital of the other one, or has a control relationship with it.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Party.mmCloseLinkSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
		}
	};
	protected YesNoIndicator potentialEuroSystemEligibility;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PotentialEuroSystemEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the security is intended to be held in a manner that could allow the Eurosystem eligibility."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPotentialEuroSystemEligibility = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PotentialEuroSystemEligibility";
			definition = "Indicates that the security is intended to be held in a manner that could allow the Eurosystem eligibility.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getPotentialEuroSystemEligibility", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity minimumQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumQuantityDebt
	 * SecuritiesQuantity.mmMinimumQuantityDebt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes8.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes20.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes35.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes41.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes6.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes9.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes18.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes22.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes32.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes38.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes7.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes5.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes11.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes10.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes19.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes16.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes23.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes24.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes33.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes34.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes39.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes40.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes43.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes45.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes4.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes13.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes21.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes26.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes36.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes42.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes27.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes14.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes30.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes28.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmMinimumQuantity
	 * FinancialInstrumentStipulations.mmMinimumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes31.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmMinimumQuantity
	 * FinancialInstrumentStipulations2.mmMinimumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes44.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes15.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes29.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes2.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes48.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes50.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes49.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes55.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes57.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes56.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes63.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes64.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes66.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes65.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes67.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes70.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes69.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes71.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes75.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes78.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes79.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes81.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes80.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes85.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes84.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes83.mmMinimumNominalQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the minimum tradable quantity of a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMinimumQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes8.mmMinimumNominalQuantity, FinancialInstrumentAttributes20.mmMinimumNominalQuantity, FinancialInstrumentAttributes35.mmMinimumNominalQuantity,
					FinancialInstrumentAttributes41.mmMinimumNominalQuantity, FinancialInstrumentAttributes6.mmMinimumNominalQuantity, FinancialInstrumentAttributes9.mmMinimumNominalQuantity,
					FinancialInstrumentAttributes18.mmMinimumNominalQuantity, FinancialInstrumentAttributes22.mmMinimumNominalQuantity, FinancialInstrumentAttributes32.mmMinimumNominalQuantity,
					FinancialInstrumentAttributes38.mmMinimumNominalQuantity, FinancialInstrumentAttributes7.mmMinimumNominalQuantity, FinancialInstrumentAttributes5.mmMinimumNominalQuantity,
					FinancialInstrumentAttributes11.mmMinimumNominalQuantity, FinancialInstrumentAttributes10.mmMinimumNominalQuantity, FinancialInstrumentAttributes19.mmMinimumNominalQuantity,
					FinancialInstrumentAttributes16.mmMinimumNominalQuantity, FinancialInstrumentAttributes23.mmMinimumNominalQuantity, FinancialInstrumentAttributes24.mmMinimumNominalQuantity,
					FinancialInstrumentAttributes33.mmMinimumNominalQuantity, FinancialInstrumentAttributes34.mmMinimumNominalQuantity, FinancialInstrumentAttributes39.mmMinimumNominalQuantity,
					FinancialInstrumentAttributes40.mmMinimumNominalQuantity, FinancialInstrumentAttributes43.mmMinimumNominalQuantity, FinancialInstrumentAttributes45.mmMinimumNominalQuantity,
					FinancialInstrumentAttributes4.mmMinimumNominalQuantity, FinancialInstrumentAttributes13.mmMinimumNominalQuantity, FinancialInstrumentAttributes21.mmMinimumNominalQuantity,
					FinancialInstrumentAttributes26.mmMinimumNominalQuantity, FinancialInstrumentAttributes36.mmMinimumNominalQuantity, FinancialInstrumentAttributes42.mmMinimumNominalQuantity,
					FinancialInstrumentAttributes27.mmMinimumNominalQuantity, FinancialInstrumentAttributes14.mmMinimumNominalQuantity, FinancialInstrumentAttributes30.mmMinimumNominalQuantity,
					FinancialInstrumentAttributes28.mmMinimumNominalQuantity, FinancialInstrumentStipulations.mmMinimumQuantity, FinancialInstrumentAttributes31.mmMinimumNominalQuantity, FinancialInstrumentStipulations2.mmMinimumQuantity,
					FinancialInstrumentAttributes44.mmMinimumNominalQuantity, FinancialInstrumentAttributes15.mmMinimumNominalQuantity, FinancialInstrumentAttributes29.mmMinimumNominalQuantity,
					FinancialInstrumentAttributes2.mmMinimumNominalQuantity, FinancialInstrumentAttributes48.mmMinimumNominalQuantity, FinancialInstrumentAttributes50.mmMinimumNominalQuantity,
					FinancialInstrumentAttributes49.mmMinimumNominalQuantity, FinancialInstrumentAttributes55.mmMinimumNominalQuantity, FinancialInstrumentAttributes57.mmMinimumNominalQuantity,
					FinancialInstrumentAttributes56.mmMinimumNominalQuantity, FinancialInstrumentAttributes63.mmMinimumNominalQuantity, FinancialInstrumentAttributes64.mmMinimumNominalQuantity,
					FinancialInstrumentAttributes66.mmMinimumNominalQuantity, FinancialInstrumentAttributes65.mmMinimumNominalQuantity, FinancialInstrumentAttributes67.mmMinimumNominalQuantity,
					FinancialInstrumentAttributes70.mmMinimumNominalQuantity, FinancialInstrumentAttributes69.mmMinimumNominalQuantity, FinancialInstrumentAttributes71.mmMinimumNominalQuantity,
					FinancialInstrumentAttributes75.mmMinimumNominalQuantity, FinancialInstrumentAttributes78.mmMinimumNominalQuantity, FinancialInstrumentAttributes79.mmMinimumNominalQuantity,
					FinancialInstrumentAttributes81.mmMinimumNominalQuantity, FinancialInstrumentAttributes80.mmMinimumNominalQuantity, FinancialInstrumentAttributes85.mmMinimumNominalQuantity,
					FinancialInstrumentAttributes84.mmMinimumNominalQuantity, FinancialInstrumentAttributes83.mmMinimumNominalQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantity";
			definition = "Indicates the minimum tradable quantity of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumQuantityDebt;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected YesNoIndicator restrictedIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmRestrictedIndicator
	 * Debt2.mmRestrictedIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies if the securities is restricted or not (as per Rule 144 of the Securities and Exchange Commission,that sets the conditions under which restricted, unregistered and control securities can be sold)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRestrictedIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Debt2.mmRestrictedIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RestrictedIndicator";
			definition = "Identifies if the securities is restricted or not (as per Rule 144 of the Securities and Exchange Commission,that sets the conditions under which restricted, unregistered and control securities can be sold).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getRestrictedIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Security";
				definition = "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesIdentification.mmIdentifiedSecurity, com.tools20022.repository.entity.Dividend.mmSecurity,
						com.tools20022.repository.entity.SecuritiesPricing.mmSecurity, com.tools20022.repository.entity.Party.mmCloseLinkSecurity, com.tools20022.repository.entity.RedemptionSchedule.mmSecurity,
						com.tools20022.repository.entity.TradingMarket.mmTradedSecurity, com.tools20022.repository.entity.TradingMarket.mmListedSecurity, com.tools20022.repository.entity.SecuritiesAccount.mmSecurity,
						com.tools20022.repository.entity.SecuritiesTax.mmSecurity, com.tools20022.repository.entity.SecuritiesQuantity.mmSecurityIdentification, com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumQuantityDebt,
						com.tools20022.repository.entity.SecuritiesTrade.mmSecurity, com.tools20022.repository.entity.SecuritiesTransfer.mmSecurity, com.tools20022.repository.entity.SecuritiesPartyRole.mmSecurity,
						com.tools20022.repository.entity.SecuritiesSettlement.mmSecurity, com.tools20022.repository.entity.SecuritiesRelatedFees.mmSecurity, com.tools20022.repository.entity.SecuritiesStatus.mmSecurity,
						com.tools20022.repository.entity.VariableInterest.mmBenchmarkReference, com.tools20022.repository.entity.CouponAttached.mmSecurity, com.tools20022.repository.entity.SecuritiesConversion.mmSecurityIdentification,
						com.tools20022.repository.entity.BasicSecuritiesRegistration.mmSecurity, com.tools20022.repository.entity.SecuritiesRestriction.mmSecurity, com.tools20022.repository.entity.SecuritiesBalance.mmSecurity,
						com.tools20022.repository.entity.CorporateActionEvent.mmUnderlyingSecurity, com.tools20022.repository.entity.SecuritiesModification.mmNewSecurityReferenceData,
						com.tools20022.repository.entity.Spread.mmBenchmarkSecurity, com.tools20022.repository.entity.SecuritiesOrder.mmOrderedSecurity, com.tools20022.repository.entity.Rating.mmSecurity,
						com.tools20022.repository.entity.Sector.mmSecurity, com.tools20022.repository.entity.Jurisdiction.mmRegisteredSecurities, com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.mmSecurity,
						com.tools20022.repository.entity.MarginCall.mmSecurity, com.tools20022.repository.entity.Quote.mmQuotedSecurity, com.tools20022.repository.entity.ComponentSecurity.mmSecurity);
				derivationElement_lazy = () -> Arrays.asList(FinancialInstrumentDetails1.mmFinancialInstrumentAttributes, FinancialInstrumentDetails4.mmFinancialInstrumentAttributes,
						FinancialInstrumentDetails6.mmFinancialInstrumentAttributes, FinancialInstrumentDetails7.mmFinancialInstrumentAttributes, FinancialInstrumentDetails10.mmFinancialInstrumentAttributes,
						FinancialInstrumentDetails12.mmFinancialInstrumentAttributes, FinancialInstrumentDetails14.mmFinancialInstrumentAttributes, FinancialInstrumentDetails15.mmFinancialInstrumentAttributes,
						UnderlyingFinancialInstrument1.mmAttributes, UnderlyingFinancialInstrument2.mmAttributes, FinancialInstrument14.mmInstrumentDescription, FinancialInstrument15.mmInstrumentDescription,
						ProposalType1Choice.mmSecuritiesCollateral, Collateral4.mmSecuritiesCollateral, CollateralSubstitution1.mmSecuritiesCollateral, CollateralValuation1.mmSecuritiesCollateralDetails,
						CollateralValuePosition1.mmSecurities, InstrumentLeg2.mmLegStipulations, SingleQuote1.mmFinancialInstrumentDetails, SingleQuote1.mmUnderlyingFinancialInstrumentDetails, SingleQuote1.mmFinancialInstrumentAttributes,
						SingleQuote1.mmUnderlyingFinancialInstrumentAttributes, QuoteCancellation1Choice.mmFinancialInstrumentDetails, QuoteCancellation1Choice.mmFinancialInstrumentAttributes,
						QuoteCancellation1Choice.mmUnderlyingFinancialInstrumentDetails, QuoteCancellation1Choice.mmUnderlyingFinancialInstrumentAttributes, FinancialInstrument1.mmAttributes,
						InstrumentIdentification1Choice.mmOtherFinancialInstrument, FinancialInstrument2.mmAttributes, InstrumentIdentification2Choice.mmOtherFinancialInstrument, InstrumentLeg1.mmLegStipulations,
						QuoteRequest1.mmFinancialInstrumentDetails, QuoteRequest1.mmFinancialInstrumentAttributes, QuoteRequest1.mmUnderlyingFinancialInstrumentDetails, QuoteRequest1.mmUnderlyingFinancialInstrumentAttributes,
						RequestForQuote.mmFinancialInstrumentDetails, RequestForQuote.mmFinancialInstrumentAttributes, RequestForQuote.mmUnderlyingFinancialInstrumentDetails, RequestForQuote.mmUnderlyingFinancialInstrumentAttributes,
						Quote1.mmFinancialInstrumentDetails, Quote1.mmUnderlyingFinancialInstrumentDetails, Quote1.mmFinancialInstrumentAttributes, Quote1.mmUnderlyingFinancialAttributes, CollateralSubstitution2.mmSecuritiesCollateral,
						CollateralValuation2.mmSecuritiesCollateral, Collateral7.mmSecuritiesCollateral, Collateral8.mmSecuritiesCollateral, CollateralSubstitution3.mmSecuritiesCollateral,
						FinancialInstrumentDetails21.mmFinancialInstrumentAttributes, CollateralSubstitution5.mmSecuritiesCollateral, CollateralSubstitution4.mmSecuritiesCollateral, CollateralValuation5.mmSecuritiesCollateral,
						Collateral11.mmSecuritiesCollateral, Collateral12.mmSecuritiesCollateral, FinancialInstrumentDetails22.mmFinancialInstrumentAttributes, SecuritiesReferenceDataReport5.mmFinancialInstrumentGeneralAttributes,
						SecurityInstrumentDescription13.mmFinancialInstrumentGeneralAttributes, FinancialInstrumentDetails24.mmFinancialInstrumentAttributes, Collateral16.mmSecuritiesCollateral, Collateral17.mmSecuritiesCollateral,
						FinancialInstrumentDetails26.mmFinancialInstrumentAttributes);
				subType_lazy = () -> Arrays.asList(InvestmentFundClass.mmObject(), Debt.mmObject(), Equity.mmObject(), Warrant.mmObject(), Entitlement.mmObject());
				superType_lazy = () -> Asset.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmIdentification, com.tools20022.repository.entity.Security.mmRegisteredDistributionCountry,
						com.tools20022.repository.entity.Security.mmDenominationCurrency, com.tools20022.repository.entity.Security.mmRegistrationForm, com.tools20022.repository.entity.Security.mmDematerialisedIndicator,
						com.tools20022.repository.entity.Security.mmEUSavingsDirective, com.tools20022.repository.entity.Security.mmSecuritiesQuantity, com.tools20022.repository.entity.Security.mmFees,
						com.tools20022.repository.entity.Security.mmPricing, com.tools20022.repository.entity.Security.mmSecuritiesAccount, com.tools20022.repository.entity.Security.mmTradingMarket,
						com.tools20022.repository.entity.Security.mmPlaceOfListing, com.tools20022.repository.entity.Security.mmRegistration, com.tools20022.repository.entity.Security.mmRestriction,
						com.tools20022.repository.entity.Security.mmCorporateEvent, com.tools20022.repository.entity.Security.mmTemporaryFinancialInstrumentIndicator, com.tools20022.repository.entity.Security.mmAvailableDate,
						com.tools20022.repository.entity.Security.mmDeclarationDetails, com.tools20022.repository.entity.Security.mmSpread, com.tools20022.repository.entity.Security.mmDividend,
						com.tools20022.repository.entity.Security.mmBalance, com.tools20022.repository.entity.Security.mmFungibleIndicator, com.tools20022.repository.entity.Security.mmAppearance,
						com.tools20022.repository.entity.Security.mmNearTermPositionLimit, com.tools20022.repository.entity.Security.mmContractSettlementMonth, com.tools20022.repository.entity.Security.mmMinimumTradingPricingIncrement,
						com.tools20022.repository.entity.Security.mmRating, com.tools20022.repository.entity.Security.mmCouponAttached, com.tools20022.repository.entity.Security.mmSector,
						com.tools20022.repository.entity.Security.mmWarrantAttachedOnDelivery, com.tools20022.repository.entity.Security.mmStrippableIndicator, com.tools20022.repository.entity.Security.mmFirstDealingDate,
						com.tools20022.repository.entity.Security.mmTaxDetails, com.tools20022.repository.entity.Security.mmSecuritiesTrade, com.tools20022.repository.entity.Security.mmRegistrationJurisdiction,
						com.tools20022.repository.entity.Security.mmPartyRole, com.tools20022.repository.entity.Security.mmSecurityStatus, com.tools20022.repository.entity.Security.mmModification,
						com.tools20022.repository.entity.Security.mmRedemptionSchedule, com.tools20022.repository.entity.Security.mmSecuritiesSettlement, com.tools20022.repository.entity.Security.mmSecuritiesTransfer,
						com.tools20022.repository.entity.Security.mmCorporateActionStandingInstructions, com.tools20022.repository.entity.Security.mmQuote, com.tools20022.repository.entity.Security.mmSecuritiesOrder,
						com.tools20022.repository.entity.Security.mmRelatedVariableInterest, com.tools20022.repository.entity.Security.mmConversion, com.tools20022.repository.entity.Security.mmComponentSecurity,
						com.tools20022.repository.entity.Security.mmRecompositionIndicator, com.tools20022.repository.entity.Security.mmSeries, com.tools20022.repository.entity.Security.mmPercentageOfDebtClaim,
						com.tools20022.repository.entity.Security.mmCoverRate, com.tools20022.repository.entity.Security.mmMaturityRedemption, com.tools20022.repository.entity.Security.mmRelatedMarginCall,
						com.tools20022.repository.entity.Security.mmCloseLink, com.tools20022.repository.entity.Security.mmPotentialEuroSystemEligibility, com.tools20022.repository.entity.Security.mmMinimumQuantity,
						com.tools20022.repository.entity.Security.mmRestrictedIndicator);
				derivationComponent_lazy = () -> Arrays.asList(FormOfSecurity1Choice.mmObject(), FormOfSecurity2Choice.mmObject(), PaymentDirection1Choice.mmObject(), PaymentDirection2Choice.mmObject(), FormOfSecurity3Choice.mmObject(),
						UnderlyingSecurity1.mmObject(), UnderlyingSecurity2.mmObject(), UnderlyingSecurity3.mmObject(), TemporaryFinancialInstrumentIndicator1Choice.mmObject(), TemporaryFinancialInstrumentIndicator2Choice.mmObject(),
						SecurityDate9.mmObject(), SecurityDate10.mmObject(), PaymentDirection3Choice.mmObject(), FinancialInstrumentDetails1.mmObject(), FinancialInstrumentDetails4.mmObject(), FinancialInstrumentDetails6.mmObject(),
						FinancialInstrumentDetails7.mmObject(), FinancialInstrumentDetails10.mmObject(), FinancialInstrumentDetails12.mmObject(), FinancialInstrumentDetails14.mmObject(), FinancialInstrumentDetails15.mmObject(),
						FinancialInstrumentDetails2.mmObject(), FinancialInstrumentDetails3.mmObject(), FinancialInstrumentDetails5.mmObject(), FinancialInstrumentDetails8.mmObject(), FinancialInstrumentDetails9.mmObject(),
						FinancialInstrumentDetails11.mmObject(), FinancialInstrumentDetails13.mmObject(), FinancialInstrumentDetails16.mmObject(), FinancialInstrumentStipulations.mmObject(), FormOfSecurity4Choice.mmObject(),
						UnderlyingFinancialInstrument1.mmObject(), FinancialInstrumentStipulations2.mmObject(), UnderlyingFinancialInstrument2.mmObject(), FinancialInstrumentDescription3.mmObject(),
						SecurityInstrumentDescription1.mmObject(), FinancialInstrument14.mmObject(), SecurityInstrumentDescription2.mmObject(), FinancialInstrument15.mmObject(), SecuritiesCollateral1.mmObject(),
						FinancialInstrument28.mmObject(), Appearance2Choice.mmObject(), FormOfSecurity5Choice.mmObject(), CommonFinancialInstrumentAttributes1.mmObject(), CloseLink1.mmObject(), FinancialInstrument1.mmObject(),
						InstrumentIdentification1Choice.mmObject(), FinancialInstrument2.mmObject(), InstrumentIdentification2Choice.mmObject(), FinancialInstrumentDetails17.mmObject(), FinancialInstrumentDetails18.mmObject(),
						SecuritiesCollateral2.mmObject(), SecuritiesCollateral3.mmObject(), SecuritiesCollateral4.mmObject(), FinancialInstrumentDetails20.mmObject(), FinancialInstrumentDetails21.mmObject(),
						FormOfSecurity6Choice.mmObject(), SecurityDate12.mmObject(), TemporaryFinancialInstrumentIndicator3Choice.mmObject(), SecuritiesCollateral6.mmObject(), SecuritiesCollateral5.mmObject(),
						SecuritiesCollateral7.mmObject(), TemporaryFinancialInstrumentIndicator4Choice.mmObject(), SecurityDate14.mmObject(), FinancialInstrumentDetails23.mmObject(), FinancialInstrumentDetails22.mmObject(),
						FormOfSecurity7Choice.mmObject(), SecurityInstrumentDescription9.mmObject(), SecurityInstrumentDescription11.mmObject(), FinancialInstrument46Choice.mmObject(), FinancialInstrument53.mmObject(),
						TransparencyDataReport11.mmObject(), TransparencyDataReport13.mmObject(), SecuritiesReferenceDataReport5.mmObject(), TransparencyDataReport12.mmObject(), TransparencyDataReport15.mmObject(),
						TransparencyDataReport10.mmObject(), TransparencyDataReport14.mmObject(), FinancialInstrument58.mmObject(), FinancialInstrument48Choice.mmObject(), FinancialInstrumentAttributes3Choice.mmObject(),
						SecurityInstrumentDescription13.mmObject(), FinancialInstrumentDetails25.mmObject(), FinancialInstrumentDetails24.mmObject(), SecuritiesCollateral8.mmObject(), FinancialInstrumentDetails27.mmObject(),
						FinancialInstrumentDetails26.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Security.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesIdentification> getIdentification() {
		return identification == null ? identification = new ArrayList<>() : identification;
	}

	public Security setIdentification(List<com.tools20022.repository.entity.SecuritiesIdentification> identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public CountryCode getRegisteredDistributionCountry() {
		return registeredDistributionCountry;
	}

	public Security setRegisteredDistributionCountry(CountryCode registeredDistributionCountry) {
		this.registeredDistributionCountry = Objects.requireNonNull(registeredDistributionCountry);
		return this;
	}

	public CurrencyCode getDenominationCurrency() {
		return denominationCurrency;
	}

	public Security setDenominationCurrency(CurrencyCode denominationCurrency) {
		this.denominationCurrency = Objects.requireNonNull(denominationCurrency);
		return this;
	}

	public FormOfSecurityCode getRegistrationForm() {
		return registrationForm;
	}

	public Security setRegistrationForm(FormOfSecurityCode registrationForm) {
		this.registrationForm = Objects.requireNonNull(registrationForm);
		return this;
	}

	public YesNoIndicator getDematerialisedIndicator() {
		return dematerialisedIndicator;
	}

	public Security setDematerialisedIndicator(YesNoIndicator dematerialisedIndicator) {
		this.dematerialisedIndicator = Objects.requireNonNull(dematerialisedIndicator);
		return this;
	}

	public EUSavingsDirectiveCode getEUSavingsDirective() {
		return eUSavingsDirective;
	}

	public Security setEUSavingsDirective(EUSavingsDirectiveCode eUSavingsDirective) {
		this.eUSavingsDirective = Objects.requireNonNull(eUSavingsDirective);
		return this;
	}

	public List<SecuritiesQuantity> getSecuritiesQuantity() {
		return securitiesQuantity == null ? securitiesQuantity = new ArrayList<>() : securitiesQuantity;
	}

	public Security setSecuritiesQuantity(List<com.tools20022.repository.entity.SecuritiesQuantity> securitiesQuantity) {
		this.securitiesQuantity = Objects.requireNonNull(securitiesQuantity);
		return this;
	}

	public List<SecuritiesRelatedFees> getFees() {
		return fees == null ? fees = new ArrayList<>() : fees;
	}

	public Security setFees(List<com.tools20022.repository.entity.SecuritiesRelatedFees> fees) {
		this.fees = Objects.requireNonNull(fees);
		return this;
	}

	public List<SecuritiesPricing> getPricing() {
		return pricing == null ? pricing = new ArrayList<>() : pricing;
	}

	public Security setPricing(List<com.tools20022.repository.entity.SecuritiesPricing> pricing) {
		this.pricing = Objects.requireNonNull(pricing);
		return this;
	}

	public SecuritiesAccount getSecuritiesAccount() {
		return securitiesAccount;
	}

	public Security setSecuritiesAccount(com.tools20022.repository.entity.SecuritiesAccount securitiesAccount) {
		this.securitiesAccount = Objects.requireNonNull(securitiesAccount);
		return this;
	}

	public List<TradingMarket> getTradingMarket() {
		return tradingMarket == null ? tradingMarket = new ArrayList<>() : tradingMarket;
	}

	public Security setTradingMarket(List<com.tools20022.repository.entity.TradingMarket> tradingMarket) {
		this.tradingMarket = Objects.requireNonNull(tradingMarket);
		return this;
	}

	public List<TradingMarket> getPlaceOfListing() {
		return placeOfListing == null ? placeOfListing = new ArrayList<>() : placeOfListing;
	}

	public Security setPlaceOfListing(List<com.tools20022.repository.entity.TradingMarket> placeOfListing) {
		this.placeOfListing = Objects.requireNonNull(placeOfListing);
		return this;
	}

	public List<BasicSecuritiesRegistration> getRegistration() {
		return registration == null ? registration = new ArrayList<>() : registration;
	}

	public Security setRegistration(List<com.tools20022.repository.entity.BasicSecuritiesRegistration> registration) {
		this.registration = Objects.requireNonNull(registration);
		return this;
	}

	public List<SecuritiesRestriction> getRestriction() {
		return restriction == null ? restriction = new ArrayList<>() : restriction;
	}

	public Security setRestriction(List<com.tools20022.repository.entity.SecuritiesRestriction> restriction) {
		this.restriction = Objects.requireNonNull(restriction);
		return this;
	}

	public List<CorporateActionEvent> getCorporateEvent() {
		return corporateEvent == null ? corporateEvent = new ArrayList<>() : corporateEvent;
	}

	public Security setCorporateEvent(List<com.tools20022.repository.entity.CorporateActionEvent> corporateEvent) {
		this.corporateEvent = Objects.requireNonNull(corporateEvent);
		return this;
	}

	public YesNoIndicator getTemporaryFinancialInstrumentIndicator() {
		return temporaryFinancialInstrumentIndicator;
	}

	public Security setTemporaryFinancialInstrumentIndicator(YesNoIndicator temporaryFinancialInstrumentIndicator) {
		this.temporaryFinancialInstrumentIndicator = Objects.requireNonNull(temporaryFinancialInstrumentIndicator);
		return this;
	}

	public ISODateTime getAvailableDate() {
		return availableDate;
	}

	public Security setAvailableDate(ISODateTime availableDate) {
		this.availableDate = Objects.requireNonNull(availableDate);
		return this;
	}

	public Max350Text getDeclarationDetails() {
		return declarationDetails;
	}

	public Security setDeclarationDetails(Max350Text declarationDetails) {
		this.declarationDetails = Objects.requireNonNull(declarationDetails);
		return this;
	}

	public Optional<Spread> getSpread() {
		return spread == null ? Optional.empty() : Optional.of(spread);
	}

	public Security setSpread(com.tools20022.repository.entity.Spread spread) {
		this.spread = spread;
		return this;
	}

	public List<Dividend> getDividend() {
		return dividend == null ? dividend = new ArrayList<>() : dividend;
	}

	public Security setDividend(List<com.tools20022.repository.entity.Dividend> dividend) {
		this.dividend = Objects.requireNonNull(dividend);
		return this;
	}

	public SecuritiesBalance getBalance() {
		return balance;
	}

	public Security setBalance(com.tools20022.repository.entity.SecuritiesBalance balance) {
		this.balance = Objects.requireNonNull(balance);
		return this;
	}

	public YesNoIndicator getFungibleIndicator() {
		return fungibleIndicator;
	}

	public Security setFungibleIndicator(YesNoIndicator fungibleIndicator) {
		this.fungibleIndicator = Objects.requireNonNull(fungibleIndicator);
		return this;
	}

	public AppearanceCode getAppearance() {
		return appearance;
	}

	public Security setAppearance(AppearanceCode appearance) {
		this.appearance = Objects.requireNonNull(appearance);
		return this;
	}

	public Number getNearTermPositionLimit() {
		return nearTermPositionLimit;
	}

	public Security setNearTermPositionLimit(Number nearTermPositionLimit) {
		this.nearTermPositionLimit = Objects.requireNonNull(nearTermPositionLimit);
		return this;
	}

	public ISOYearMonth getContractSettlementMonth() {
		return contractSettlementMonth;
	}

	public Security setContractSettlementMonth(ISOYearMonth contractSettlementMonth) {
		this.contractSettlementMonth = Objects.requireNonNull(contractSettlementMonth);
		return this;
	}

	public Number getMinimumTradingPricingIncrement() {
		return minimumTradingPricingIncrement;
	}

	public Security setMinimumTradingPricingIncrement(Number minimumTradingPricingIncrement) {
		this.minimumTradingPricingIncrement = Objects.requireNonNull(minimumTradingPricingIncrement);
		return this;
	}

	public List<Rating> getRating() {
		return rating == null ? rating = new ArrayList<>() : rating;
	}

	public Security setRating(List<com.tools20022.repository.entity.Rating> rating) {
		this.rating = Objects.requireNonNull(rating);
		return this;
	}

	public List<CouponAttached> getCouponAttached() {
		return couponAttached == null ? couponAttached = new ArrayList<>() : couponAttached;
	}

	public Security setCouponAttached(List<com.tools20022.repository.entity.CouponAttached> couponAttached) {
		this.couponAttached = Objects.requireNonNull(couponAttached);
		return this;
	}

	public Sector getSector() {
		return sector;
	}

	public Security setSector(com.tools20022.repository.entity.Sector sector) {
		this.sector = Objects.requireNonNull(sector);
		return this;
	}

	public YesNoIndicator getWarrantAttachedOnDelivery() {
		return warrantAttachedOnDelivery;
	}

	public Security setWarrantAttachedOnDelivery(YesNoIndicator warrantAttachedOnDelivery) {
		this.warrantAttachedOnDelivery = Objects.requireNonNull(warrantAttachedOnDelivery);
		return this;
	}

	public YesNoIndicator getStrippableIndicator() {
		return strippableIndicator;
	}

	public Security setStrippableIndicator(YesNoIndicator strippableIndicator) {
		this.strippableIndicator = Objects.requireNonNull(strippableIndicator);
		return this;
	}

	public ISODateTime getFirstDealingDate() {
		return firstDealingDate;
	}

	public Security setFirstDealingDate(ISODateTime firstDealingDate) {
		this.firstDealingDate = Objects.requireNonNull(firstDealingDate);
		return this;
	}

	public List<SecuritiesTax> getTaxDetails() {
		return taxDetails == null ? taxDetails = new ArrayList<>() : taxDetails;
	}

	public Security setTaxDetails(List<com.tools20022.repository.entity.SecuritiesTax> taxDetails) {
		this.taxDetails = Objects.requireNonNull(taxDetails);
		return this;
	}

	public SecuritiesTrade getSecuritiesTrade() {
		return securitiesTrade;
	}

	public Security setSecuritiesTrade(com.tools20022.repository.entity.SecuritiesTrade securitiesTrade) {
		this.securitiesTrade = Objects.requireNonNull(securitiesTrade);
		return this;
	}

	public Jurisdiction getRegistrationJurisdiction() {
		return registrationJurisdiction;
	}

	public Security setRegistrationJurisdiction(com.tools20022.repository.entity.Jurisdiction registrationJurisdiction) {
		this.registrationJurisdiction = Objects.requireNonNull(registrationJurisdiction);
		return this;
	}

	public List<SecuritiesPartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public Security setPartyRole(List<com.tools20022.repository.entity.SecuritiesPartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public List<SecuritiesStatus> getSecurityStatus() {
		return securityStatus == null ? securityStatus = new ArrayList<>() : securityStatus;
	}

	public Security setSecurityStatus(List<com.tools20022.repository.entity.SecuritiesStatus> securityStatus) {
		this.securityStatus = Objects.requireNonNull(securityStatus);
		return this;
	}

	public Optional<SecuritiesModification> getModification() {
		return modification == null ? Optional.empty() : Optional.of(modification);
	}

	public Security setModification(com.tools20022.repository.entity.SecuritiesModification modification) {
		this.modification = modification;
		return this;
	}

	public List<RedemptionSchedule> getRedemptionSchedule() {
		return redemptionSchedule == null ? redemptionSchedule = new ArrayList<>() : redemptionSchedule;
	}

	public Security setRedemptionSchedule(List<com.tools20022.repository.entity.RedemptionSchedule> redemptionSchedule) {
		this.redemptionSchedule = Objects.requireNonNull(redemptionSchedule);
		return this;
	}

	public List<SecuritiesSettlement> getSecuritiesSettlement() {
		return securitiesSettlement == null ? securitiesSettlement = new ArrayList<>() : securitiesSettlement;
	}

	public Security setSecuritiesSettlement(List<com.tools20022.repository.entity.SecuritiesSettlement> securitiesSettlement) {
		this.securitiesSettlement = Objects.requireNonNull(securitiesSettlement);
		return this;
	}

	public SecuritiesTransfer getSecuritiesTransfer() {
		return securitiesTransfer;
	}

	public Security setSecuritiesTransfer(com.tools20022.repository.entity.SecuritiesTransfer securitiesTransfer) {
		this.securitiesTransfer = Objects.requireNonNull(securitiesTransfer);
		return this;
	}

	public List<AgentCorporateActionStandingInstruction> getCorporateActionStandingInstructions() {
		return corporateActionStandingInstructions == null ? corporateActionStandingInstructions = new ArrayList<>() : corporateActionStandingInstructions;
	}

	public Security setCorporateActionStandingInstructions(List<com.tools20022.repository.entity.AgentCorporateActionStandingInstruction> corporateActionStandingInstructions) {
		this.corporateActionStandingInstructions = Objects.requireNonNull(corporateActionStandingInstructions);
		return this;
	}

	public Optional<Quote> getQuote() {
		return quote == null ? Optional.empty() : Optional.of(quote);
	}

	public Security setQuote(com.tools20022.repository.entity.Quote quote) {
		this.quote = quote;
		return this;
	}

	public SecuritiesOrder getSecuritiesOrder() {
		return securitiesOrder;
	}

	public Security setSecuritiesOrder(com.tools20022.repository.entity.SecuritiesOrder securitiesOrder) {
		this.securitiesOrder = Objects.requireNonNull(securitiesOrder);
		return this;
	}

	public Optional<VariableInterest> getRelatedVariableInterest() {
		return relatedVariableInterest == null ? Optional.empty() : Optional.of(relatedVariableInterest);
	}

	public Security setRelatedVariableInterest(com.tools20022.repository.entity.VariableInterest relatedVariableInterest) {
		this.relatedVariableInterest = relatedVariableInterest;
		return this;
	}

	public List<SecuritiesConversion> getConversion() {
		return conversion == null ? conversion = new ArrayList<>() : conversion;
	}

	public Security setConversion(List<com.tools20022.repository.entity.SecuritiesConversion> conversion) {
		this.conversion = Objects.requireNonNull(conversion);
		return this;
	}

	public List<ComponentSecurity> getComponentSecurity() {
		return componentSecurity == null ? componentSecurity = new ArrayList<>() : componentSecurity;
	}

	public Security setComponentSecurity(List<com.tools20022.repository.entity.ComponentSecurity> componentSecurity) {
		this.componentSecurity = Objects.requireNonNull(componentSecurity);
		return this;
	}

	public YesNoIndicator getRecompositionIndicator() {
		return recompositionIndicator;
	}

	public Security setRecompositionIndicator(YesNoIndicator recompositionIndicator) {
		this.recompositionIndicator = Objects.requireNonNull(recompositionIndicator);
		return this;
	}

	public Max35Text getSeries() {
		return series;
	}

	public Security setSeries(Max35Text series) {
		this.series = Objects.requireNonNull(series);
		return this;
	}

	public PercentageRate getPercentageOfDebtClaim() {
		return percentageOfDebtClaim;
	}

	public Security setPercentageOfDebtClaim(PercentageRate percentageOfDebtClaim) {
		this.percentageOfDebtClaim = Objects.requireNonNull(percentageOfDebtClaim);
		return this;
	}

	public PercentageRate getCoverRate() {
		return coverRate;
	}

	public Security setCoverRate(PercentageRate coverRate) {
		this.coverRate = Objects.requireNonNull(coverRate);
		return this;
	}

	public MaturityRedemptionTypeCode getMaturityRedemption() {
		return maturityRedemption;
	}

	public Security setMaturityRedemption(MaturityRedemptionTypeCode maturityRedemption) {
		this.maturityRedemption = Objects.requireNonNull(maturityRedemption);
		return this;
	}

	public MarginCall getRelatedMarginCall() {
		return relatedMarginCall;
	}

	public Security setRelatedMarginCall(com.tools20022.repository.entity.MarginCall relatedMarginCall) {
		this.relatedMarginCall = Objects.requireNonNull(relatedMarginCall);
		return this;
	}

	public Party getCloseLink() {
		return closeLink;
	}

	public Security setCloseLink(com.tools20022.repository.entity.Party closeLink) {
		this.closeLink = Objects.requireNonNull(closeLink);
		return this;
	}

	public YesNoIndicator getPotentialEuroSystemEligibility() {
		return potentialEuroSystemEligibility;
	}

	public Security setPotentialEuroSystemEligibility(YesNoIndicator potentialEuroSystemEligibility) {
		this.potentialEuroSystemEligibility = Objects.requireNonNull(potentialEuroSystemEligibility);
		return this;
	}

	public SecuritiesQuantity getMinimumQuantity() {
		return minimumQuantity;
	}

	public Security setMinimumQuantity(com.tools20022.repository.entity.SecuritiesQuantity minimumQuantity) {
		this.minimumQuantity = Objects.requireNonNull(minimumQuantity);
		return this;
	}

	public YesNoIndicator getRestrictedIndicator() {
		return restrictedIndicator;
	}

	public Security setRestrictedIndicator(YesNoIndicator restrictedIndicator) {
		this.restrictedIndicator = Objects.requireNonNull(restrictedIndicator);
		return this;
	}
}