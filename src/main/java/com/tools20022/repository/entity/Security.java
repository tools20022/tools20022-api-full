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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Identification
 * Security.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#RegisteredDistributionCountry
 * Security.RegisteredDistributionCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#DenominationCurrency
 * Security.DenominationCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#RegistrationForm
 * Security.RegistrationForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#DematerialisedIndicator
 * Security.DematerialisedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#EUSavingsDirective
 * Security.EUSavingsDirective}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#SecuritiesQuantity
 * Security.SecuritiesQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Fees Security.Fees}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Pricing
 * Security.Pricing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#SecuritiesAccount
 * Security.SecuritiesAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#TradingMarket
 * Security.TradingMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#PlaceOfListing
 * Security.PlaceOfListing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Registration
 * Security.Registration}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Restriction
 * Security.Restriction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#CorporateEvent
 * Security.CorporateEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#TemporaryFinancialInstrumentIndicator
 * Security.TemporaryFinancialInstrumentIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#AvailableDate
 * Security.AvailableDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#DeclarationDetails
 * Security.DeclarationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Spread
 * Security.Spread}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Dividend
 * Security.Dividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Balance
 * Security.Balance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#FungibleIndicator
 * Security.FungibleIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Appearance
 * Security.Appearance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#NearTermPositionLimit
 * Security.NearTermPositionLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#ContractSettlementMonth
 * Security.ContractSettlementMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#MinimumTradingPricingIncrement
 * Security.MinimumTradingPricingIncrement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Rating
 * Security.Rating}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#CouponAttached
 * Security.CouponAttached}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Sector
 * Security.Sector}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#WarrantAttachedOnDelivery
 * Security.WarrantAttachedOnDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#StrippableIndicator
 * Security.StrippableIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#FirstDealingDate
 * Security.FirstDealingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#TaxDetails
 * Security.TaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#SecuritiesTrade
 * Security.SecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#RegistrationJurisdiction
 * Security.RegistrationJurisdiction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#PartyRole
 * Security.PartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#SecurityStatus
 * Security.SecurityStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Modification
 * Security.Modification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#RedemptionSchedule
 * Security.RedemptionSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#SecuritiesSettlement
 * Security.SecuritiesSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#SecuritiesTransfer
 * Security.SecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#CorporateActionStandingInstructions
 * Security.CorporateActionStandingInstructions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Quote
 * Security.Quote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#SecuritiesOrder
 * Security.SecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#RelatedVariableInterest
 * Security.RelatedVariableInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Conversion
 * Security.Conversion}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#ComponentSecurity
 * Security.ComponentSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#RecompositionIndicator
 * Security.RecompositionIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Series
 * Security.Series}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#PercentageOfDebtClaim
 * Security.PercentageOfDebtClaim}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#CoverRate
 * Security.CoverRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#MaturityRedemption
 * Security.MaturityRedemption}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#RelatedMarginCall
 * Security.RelatedMarginCall}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#CloseLink
 * Security.CloseLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#PotentialEuroSystemEligibility
 * Security.PotentialEuroSystemEligibility}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#MinimumQuantity
 * Security.MinimumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#RestrictedIndicator
 * Security.RestrictedIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#IdentifiedSecurity
 * SecuritiesIdentification.IdentifiedSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#Security
 * Dividend.Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#Security
 * SecuritiesPricing.Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#CloseLinkSecurity
 * Party.CloseLinkSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RedemptionSchedule#Security
 * RedemptionSchedule.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#TradedSecurity
 * TradingMarket.TradedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#ListedSecurity
 * TradingMarket.ListedSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesAccount#Security
 * SecuritiesAccount.Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#Security
 * SecuritiesTax.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecurityIdentification
 * SecuritiesQuantity.SecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumQuantityDebt
 * SecuritiesQuantity.MinimumQuantityDebt}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#Security
 * SecuritiesTrade.Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTransfer#Security
 * SecuritiesTransfer.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#Security
 * SecuritiesPartyRole.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#Security
 * SecuritiesSettlement.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#Security
 * SecuritiesRelatedFees.Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesStatus#Security
 * SecuritiesStatus.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#BenchmarkReference
 * VariableInterest.BenchmarkReference}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CouponAttached#Security
 * CouponAttached.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#SecurityIdentification
 * SecuritiesConversion.SecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#Security
 * BasicSecuritiesRegistration.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#Security
 * SecuritiesRestriction.Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesBalance#Security
 * SecuritiesBalance.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#UnderlyingSecurity
 * CorporateActionEvent.UnderlyingSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#NewSecurityReferenceData
 * SecuritiesModification.NewSecurityReferenceData}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#BenchmarkSecurity
 * Spread.BenchmarkSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderedSecurity
 * SecuritiesOrder.OrderedSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Rating#Security
 * Rating.Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Sector#Security
 * Sector.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#RegisteredSecurities
 * Jurisdiction.RegisteredSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#Security
 * AgentCorporateActionStandingInstruction.Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#Security
 * MarginCall.Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#QuotedSecurity
 * Quote.QuotedSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ComponentSecurity#Security
 * ComponentSecurity.Security}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails1#FinancialInstrumentAttributes
 * FinancialInstrumentDetails1.FinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails4#FinancialInstrumentAttributes
 * FinancialInstrumentDetails4.FinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails6#FinancialInstrumentAttributes
 * FinancialInstrumentDetails6.FinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails7#FinancialInstrumentAttributes
 * FinancialInstrumentDetails7.FinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails10#FinancialInstrumentAttributes
 * FinancialInstrumentDetails10.FinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails12#FinancialInstrumentAttributes
 * FinancialInstrumentDetails12.FinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails14#FinancialInstrumentAttributes
 * FinancialInstrumentDetails14.FinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails15#FinancialInstrumentAttributes
 * FinancialInstrumentDetails15.FinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingFinancialInstrument1#Attributes
 * UnderlyingFinancialInstrument1.Attributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingFinancialInstrument2#Attributes
 * UnderlyingFinancialInstrument2.Attributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument14#InstrumentDescription
 * FinancialInstrument14.InstrumentDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument15#InstrumentDescription
 * FinancialInstrument15.InstrumentDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProposalType1Choice#SecuritiesCollateral
 * ProposalType1Choice.SecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Collateral4#SecuritiesCollateral
 * Collateral4.SecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution1#SecuritiesCollateral
 * CollateralSubstitution1.SecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#SecuritiesCollateralDetails
 * CollateralValuation1.SecuritiesCollateralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuePosition1#Securities
 * CollateralValuePosition1.Securities}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstrumentLeg2#LegStipulations
 * InstrumentLeg2.LegStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleQuote1#FinancialInstrumentDetails
 * SingleQuote1.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleQuote1#UnderlyingFinancialInstrumentDetails
 * SingleQuote1.UnderlyingFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleQuote1#FinancialInstrumentAttributes
 * SingleQuote1.FinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleQuote1#UnderlyingFinancialInstrumentAttributes
 * SingleQuote1.UnderlyingFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuoteCancellation1Choice#FinancialInstrumentDetails
 * QuoteCancellation1Choice.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuoteCancellation1Choice#FinancialInstrumentAttributes
 * QuoteCancellation1Choice.FinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuoteCancellation1Choice#UnderlyingFinancialInstrumentDetails
 * QuoteCancellation1Choice.UnderlyingFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuoteCancellation1Choice#UnderlyingFinancialInstrumentAttributes
 * QuoteCancellation1Choice.UnderlyingFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument1#Attributes
 * FinancialInstrument1.Attributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstrumentIdentification1Choice#OtherFinancialInstrument
 * InstrumentIdentification1Choice.OtherFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument2#Attributes
 * FinancialInstrument2.Attributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstrumentIdentification2Choice#OtherFinancialInstrument
 * InstrumentIdentification2Choice.OtherFinancialInstrument}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstrumentLeg1#LegStipulations
 * InstrumentLeg1.LegStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#FinancialInstrumentDetails
 * QuoteRequest1.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#FinancialInstrumentAttributes
 * QuoteRequest1.FinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#UnderlyingFinancialInstrumentDetails
 * QuoteRequest1.UnderlyingFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#UnderlyingFinancialInstrumentAttributes
 * QuoteRequest1.UnderlyingFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestForQuote#FinancialInstrumentDetails
 * RequestForQuote.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestForQuote#FinancialInstrumentAttributes
 * RequestForQuote.FinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestForQuote#UnderlyingFinancialInstrumentDetails
 * RequestForQuote.UnderlyingFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestForQuote#UnderlyingFinancialInstrumentAttributes
 * RequestForQuote.UnderlyingFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Quote1#FinancialInstrumentDetails
 * Quote1.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Quote1#UnderlyingFinancialInstrumentDetails
 * Quote1.UnderlyingFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Quote1#FinancialInstrumentAttributes
 * Quote1.FinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Quote1#UnderlyingFinancialAttributes
 * Quote1.UnderlyingFinancialAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution2#SecuritiesCollateral
 * CollateralSubstitution2.SecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#SecuritiesCollateral
 * CollateralValuation2.SecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Collateral7#SecuritiesCollateral
 * Collateral7.SecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Collateral8#SecuritiesCollateral
 * Collateral8.SecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution3#SecuritiesCollateral
 * CollateralSubstitution3.SecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails21#FinancialInstrumentAttributes
 * FinancialInstrumentDetails21.FinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5#SecuritiesCollateral
 * CollateralSubstitution5.SecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution4#SecuritiesCollateral
 * CollateralSubstitution4.SecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#SecuritiesCollateral
 * CollateralValuation5.SecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Collateral11#SecuritiesCollateral
 * Collateral11.SecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Collateral12#SecuritiesCollateral
 * Collateral12.SecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails22#FinancialInstrumentAttributes
 * FinancialInstrumentDetails22.FinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5#FinancialInstrumentGeneralAttributes
 * SecuritiesReferenceDataReport5.FinancialInstrumentGeneralAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription13#FinancialInstrumentGeneralAttributes
 * SecurityInstrumentDescription13.FinancialInstrumentGeneralAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails24#FinancialInstrumentAttributes
 * FinancialInstrumentDetails24.FinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Collateral16#SecuritiesCollateral
 * Collateral16.SecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Collateral17#SecuritiesCollateral
 * Collateral17.SecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails26#FinancialInstrumentAttributes
 * FinancialInstrumentDetails26.FinancialInstrumentAttributes}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
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
	/**
	 * Way(s) of identifying the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#IdentifiedSecurity
	 * SecuritiesIdentification.IdentifiedSecurity}</li>
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
	public static final MMBusinessAssociationEnd Identification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> ListBuilderForSecurity_00.addElems(new ArrayList<>());
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Way(s) of identifying the security.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.IdentifiedSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Country in which the processing characteristic applies.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#RegisteredDistributionCountry
	 * FinancialInstrument16.RegisteredDistributionCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification1#RegisteredDistributionCountry
	 * SecurityIdentification1.RegisteredDistributionCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#RegisteredDistributionCountry
	 * FinancialInstrument21.RegisteredDistributionCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument22#RegisteredDistributionCountry
	 * FinancialInstrument22.RegisteredDistributionCountry}</li>
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
	public static final MMBusinessAttribute RegisteredDistributionCountry = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument16.RegisteredDistributionCountry, com.tools20022.repository.msg.SecurityIdentification1.RegisteredDistributionCountry,
					com.tools20022.repository.msg.FinancialInstrument21.RegisteredDistributionCountry, com.tools20022.repository.msg.FinancialInstrument22.RegisteredDistributionCountry);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegisteredDistributionCountry";
			definition = "Country in which the processing characteristic applies.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	/**
	 * Currency in which a security is issued or redenominated.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#DenominationCurrency
	 * FinancialInstrument16.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument8#DenominationCurrency
	 * FinancialInstrument8.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#DenominationCurrency
	 * FinancialInstrumentAttributes8.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#DenominationCurrency
	 * FinancialInstrumentAttributes20.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#DenominationCurrency
	 * FinancialInstrumentAttributes35.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#DenominationCurrency
	 * FinancialInstrumentAttributes41.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#DenominationCurrency
	 * FinancialInstrumentAttributes6.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#DenominationCurrency
	 * FinancialInstrumentAttributes9.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#DenominationCurrency
	 * FinancialInstrumentAttributes18.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#DenominationCurrency
	 * FinancialInstrumentAttributes22.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#DenominationCurrency
	 * FinancialInstrumentAttributes32.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#DenominationCurrency
	 * FinancialInstrumentAttributes38.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#DenominationCurrency
	 * FinancialInstrumentAttributes7.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#DenominationCurrency
	 * FinancialInstrumentAttributes5.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#DenominationCurrency
	 * FinancialInstrumentAttributes11.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#DenominationCurrency
	 * FinancialInstrumentAttributes10.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#DenominationCurrency
	 * FinancialInstrumentAttributes19.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#DenominationCurrency
	 * FinancialInstrumentAttributes16.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#DenominationCurrency
	 * FinancialInstrumentAttributes23.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#DenominationCurrency
	 * FinancialInstrumentAttributes24.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#DenominationCurrency
	 * FinancialInstrumentAttributes33.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#DenominationCurrency
	 * FinancialInstrumentAttributes34.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#DenominationCurrency
	 * FinancialInstrumentAttributes39.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#DenominationCurrency
	 * FinancialInstrumentAttributes40.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#DenominationCurrency
	 * FinancialInstrumentAttributes43.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#DenominationCurrency
	 * FinancialInstrumentAttributes45.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#DenominationCurrency
	 * FinancialInstrumentAttributes4.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#DenominationCurrency
	 * FinancialInstrumentAttributes13.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#DenominationCurrency
	 * FinancialInstrumentAttributes21.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#DenominationCurrency
	 * FinancialInstrumentAttributes26.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#DenominationCurrency
	 * FinancialInstrumentAttributes36.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#DenominationCurrency
	 * FinancialInstrumentAttributes42.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#DenominationCurrency
	 * FinancialInstrumentAttributes27.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#DenominationCurrency
	 * FinancialInstrument21.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#DenominationCurrency
	 * FinancialInstrumentAttributes14.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument22#DenominationCurrency
	 * FinancialInstrument22.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#DenominationCurrency
	 * FinancialInstrumentAttributes30.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#DenominationCurrency
	 * FinancialInstrumentAttributes28.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#DenominationCurrency
	 * FinancialInstrumentAttributes1.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#Currency
	 * FinancialInstrumentStipulations.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#DenominationCurrency
	 * FinancialInstrumentAttributes31.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#Currency
	 * FinancialInstrumentStipulations2.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#DenominationCurrency
	 * FinancialInstrumentAttributes44.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#NewDenominationCurrency
	 * CorporateAction2.NewDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#DenominationCurrency
	 * FinancialInstrumentAttributes15.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#DenominationCurrency
	 * FinancialInstrumentAttributes29.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#DenominationCurrency
	 * CommonFinancialInstrumentAttributes1.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#DenominationCurrency
	 * FinancialInstrumentAttributes2.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#DenominationCurrency
	 * FinancialInstrumentAttributes48.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#DenominationCurrency
	 * FinancialInstrumentAttributes50.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#DenominationCurrency
	 * FinancialInstrumentAttributes49.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#DenominationCurrency
	 * FinancialInstrumentAttributes55.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#DenominationCurrency
	 * FinancialInstrumentAttributes57.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#DenominationCurrency
	 * FinancialInstrumentAttributes56.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#DenominationCurrency
	 * FinancialInstrumentAttributes63.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#DenominationCurrency
	 * FinancialInstrumentAttributes64.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#DenominationCurrency
	 * FinancialInstrumentAttributes66.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#DenominationCurrency
	 * FinancialInstrumentAttributes65.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#DenominationCurrency
	 * FinancialInstrumentAttributes67.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#DenominationCurrency
	 * FinancialInstrumentAttributes70.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#DenominationCurrency
	 * FinancialInstrumentAttributes69.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#DenominationCurrency
	 * FinancialInstrumentAttributes71.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#DenominationCurrency
	 * FinancialInstrumentAttributes75.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#DenominationCurrency
	 * FinancialInstrumentAttributes78.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#DenominationCurrency
	 * FinancialInstrumentAttributes79.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#DenominationCurrency
	 * FinancialInstrumentAttributes81.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#DenominationCurrency
	 * FinancialInstrumentAttributes80.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#DenominationCurrency
	 * FinancialInstrumentAttributes85.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#DenominationCurrency
	 * FinancialInstrumentAttributes84.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#DenominationCurrency
	 * FinancialInstrumentAttributes83.DenominationCurrency}</li>
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
	public static final MMBusinessAttribute DenominationCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument16.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrument8.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes8.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes20.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes41.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes6.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes9.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes18.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes22.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes32.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes38.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes7.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes5.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes11.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes10.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes19.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes16.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes23.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes24.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes33.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes34.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes39.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes40.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes43.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes45.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes13.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes26.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes42.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrument21.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes14.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrument22.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes28.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes1.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentStipulations.Currency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes31.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentStipulations2.Currency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes44.DenominationCurrency, com.tools20022.repository.msg.CorporateAction2.NewDenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes15.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes29.DenominationCurrency,
					com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes2.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes48.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes50.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes49.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes55.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes57.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes56.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes63.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes64.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes66.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes65.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes67.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes70.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes69.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes71.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes75.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes78.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes79.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes81.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes80.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes85.DenominationCurrency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes84.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes83.DenominationCurrency);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DenominationCurrency";
			definition = "Currency in which a security is issued or redenominated.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Specifies the form, ie, ownership, of the security.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#SecuritiesForm
	 * FinancialInstrument16.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument17#SecuritiesForm
	 * FinancialInstrument17.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument6#SecuritiesForm
	 * FinancialInstrument6.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument10#SecuritiesForm
	 * FinancialInstrument10.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29#SecuritiesForm
	 * FinancialInstrument29.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument3#SecuritiesForm
	 * FinancialInstrument3.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument5#SecuritiesForm
	 * FinancialInstrument5.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument8#SecuritiesForm
	 * FinancialInstrument8.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#SecuritiesForm
	 * InvestmentAccount10.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount11#SecuritiesForm
	 * InvestmentAccount11.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument13#SecuritiesForm
	 * FinancialInstrument13.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#SecuritiesForm
	 * InvestmentAccount22.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount24#SecuritiesForm
	 * InvestmentAccount24.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity1Choice#Code
	 * FormOfSecurity1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity1Choice#Proprietary
	 * FormOfSecurity1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity2Choice#Code
	 * FormOfSecurity2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity2Choice#Proprietary
	 * FormOfSecurity2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#RegistrationForm
	 * FinancialInstrumentAttributes8.RegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#RegistrationForm
	 * FinancialInstrumentAttributes20.RegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#RegistrationForm
	 * FinancialInstrumentAttributes35.RegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity3Choice#Code
	 * FormOfSecurity3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity3Choice#Proprietary
	 * FormOfSecurity3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#RegistrationForm
	 * FinancialInstrumentAttributes41.RegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#RegistrationForm
	 * FinancialInstrumentAttributes4.RegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#RegistrationForm
	 * FinancialInstrumentAttributes13.RegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#RegistrationForm
	 * FinancialInstrumentAttributes21.RegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#RegistrationForm
	 * FinancialInstrumentAttributes26.RegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#RegistrationForm
	 * FinancialInstrumentAttributes36.RegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#RegistrationForm
	 * FinancialInstrumentAttributes42.RegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#RegistrationForm
	 * FinancialInstrumentAttributes27.RegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#SecuritiesForm
	 * FinancialInstrument21.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#RegistrationForm
	 * FinancialInstrumentAttributes14.RegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument22#SecuritiesForm
	 * FinancialInstrument22.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument4#SecuritiesForm
	 * FinancialInstrument4.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#RegistrationForm
	 * FinancialInstrumentAttributes30.RegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#RegistrationForm
	 * FinancialInstrumentAttributes28.RegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#RegistrationForm
	 * FinancialInstrumentAttributes1.RegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity4Choice#Code
	 * FormOfSecurity4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity4Choice#Proprietary
	 * FormOfSecurity4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#RegistrationForm
	 * FinancialInstrumentAttributes31.RegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#RegistrationForm
	 * FinancialInstrumentAttributes44.RegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument9#SecuritiesForm
	 * FinancialInstrument9.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1#Form
	 * InvestmentFundTransactionsByFund1.Form}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund2#SecuritiesForm
	 * InvestmentFundTransactionsByFund2.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount9#SecurityHoldingForm
	 * SecuritiesAccount9.SecurityHoldingForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount12#SecurityHoldingForm
	 * SecuritiesAccount12.SecurityHoldingForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount8#SecurityHoldingForm
	 * SecuritiesAccount8.SecurityHoldingForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount10#SecurityHoldingForm
	 * SecuritiesAccount10.SecurityHoldingForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#RegistrationForm
	 * FinancialInstrumentAttributes15.RegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#RegistrationForm
	 * FinancialInstrumentAttributes29.RegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument19#SecuritiesForm
	 * FinancialInstrument19.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity5Choice#Code
	 * FormOfSecurity5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity5Choice#Proprietary
	 * FormOfSecurity5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#RegistrationForm
	 * FinancialInstrumentAttributes2.RegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#SecuritiesForm
	 * InvestmentAccount40.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount41#SecuritiesForm
	 * InvestmentAccount41.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund3#SecuritiesForm
	 * InvestmentFundTransactionsByFund3.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance1#HoldingForm
	 * AggregateHoldingBalance1.HoldingForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#RegistrationForm
	 * FinancialInstrumentAttributes63.RegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#RegistrationForm
	 * FinancialInstrumentAttributes64.RegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity6Choice#Code
	 * FormOfSecurity6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity6Choice#Proprietary
	 * FormOfSecurity6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#SecuritiesForm
	 * InvestmentAccount54.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#SecuritiesForm
	 * InvestmentAccount56.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#SecuritiesForm
	 * FinancialInstrument51.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#SecuritiesForm
	 * InvestmentAccount55.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument45#SecuritiesForm
	 * FinancialInstrument45.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument49#SecuritiesForm
	 * FinancialInstrument49.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#SecuritiesForm
	 * InvestmentAccount57.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#RegistrationForm
	 * FinancialInstrumentAttributes75.RegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#RegistrationForm
	 * FinancialInstrumentAttributes78.RegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity7Choice#Code
	 * FormOfSecurity7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity7Choice#Proprietary
	 * FormOfSecurity7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#SecuritiesForm
	 * FinancialInstrument57.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#SecuritiesForm
	 * FinancialInstrument56.SecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument55#SecuritiesForm
	 * FinancialInstrument55.SecuritiesForm}</li>
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
	public static final MMBusinessAttribute RegistrationForm = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument16.SecuritiesForm, com.tools20022.repository.msg.FinancialInstrument17.SecuritiesForm,
					com.tools20022.repository.msg.FinancialInstrument6.SecuritiesForm, com.tools20022.repository.msg.FinancialInstrument10.SecuritiesForm, com.tools20022.repository.msg.FinancialInstrument29.SecuritiesForm,
					com.tools20022.repository.msg.FinancialInstrument3.SecuritiesForm, com.tools20022.repository.msg.FinancialInstrument5.SecuritiesForm, com.tools20022.repository.msg.FinancialInstrument8.SecuritiesForm,
					com.tools20022.repository.msg.InvestmentAccount10.SecuritiesForm, com.tools20022.repository.msg.InvestmentAccount11.SecuritiesForm, com.tools20022.repository.msg.FinancialInstrument13.SecuritiesForm,
					com.tools20022.repository.msg.InvestmentAccount22.SecuritiesForm, com.tools20022.repository.msg.InvestmentAccount24.SecuritiesForm, com.tools20022.repository.choice.FormOfSecurity1Choice.Code,
					com.tools20022.repository.choice.FormOfSecurity1Choice.Proprietary, com.tools20022.repository.choice.FormOfSecurity2Choice.Code, com.tools20022.repository.choice.FormOfSecurity2Choice.Proprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes8.RegistrationForm, com.tools20022.repository.msg.FinancialInstrumentAttributes20.RegistrationForm,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.RegistrationForm, com.tools20022.repository.choice.FormOfSecurity3Choice.Code, com.tools20022.repository.choice.FormOfSecurity3Choice.Proprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes41.RegistrationForm, com.tools20022.repository.msg.FinancialInstrumentAttributes4.RegistrationForm,
					com.tools20022.repository.msg.FinancialInstrumentAttributes13.RegistrationForm, com.tools20022.repository.msg.FinancialInstrumentAttributes21.RegistrationForm,
					com.tools20022.repository.msg.FinancialInstrumentAttributes26.RegistrationForm, com.tools20022.repository.msg.FinancialInstrumentAttributes36.RegistrationForm,
					com.tools20022.repository.msg.FinancialInstrumentAttributes42.RegistrationForm, com.tools20022.repository.msg.FinancialInstrumentAttributes27.RegistrationForm,
					com.tools20022.repository.msg.FinancialInstrument21.SecuritiesForm, com.tools20022.repository.msg.FinancialInstrumentAttributes14.RegistrationForm, com.tools20022.repository.msg.FinancialInstrument22.SecuritiesForm,
					com.tools20022.repository.msg.FinancialInstrument4.SecuritiesForm, com.tools20022.repository.msg.FinancialInstrumentAttributes30.RegistrationForm,
					com.tools20022.repository.msg.FinancialInstrumentAttributes28.RegistrationForm, com.tools20022.repository.msg.FinancialInstrumentAttributes1.RegistrationForm, com.tools20022.repository.choice.FormOfSecurity4Choice.Code,
					com.tools20022.repository.choice.FormOfSecurity4Choice.Proprietary, com.tools20022.repository.msg.FinancialInstrumentAttributes31.RegistrationForm,
					com.tools20022.repository.msg.FinancialInstrumentAttributes44.RegistrationForm, com.tools20022.repository.msg.FinancialInstrument9.SecuritiesForm, com.tools20022.repository.msg.InvestmentFundTransactionsByFund1.Form,
					com.tools20022.repository.msg.InvestmentFundTransactionsByFund2.SecuritiesForm, com.tools20022.repository.msg.SecuritiesAccount9.SecurityHoldingForm,
					com.tools20022.repository.msg.SecuritiesAccount12.SecurityHoldingForm, com.tools20022.repository.msg.SecuritiesAccount8.SecurityHoldingForm, com.tools20022.repository.msg.SecuritiesAccount10.SecurityHoldingForm,
					com.tools20022.repository.msg.FinancialInstrumentAttributes15.RegistrationForm, com.tools20022.repository.msg.FinancialInstrumentAttributes29.RegistrationForm,
					com.tools20022.repository.msg.FinancialInstrument19.SecuritiesForm, com.tools20022.repository.choice.FormOfSecurity5Choice.Code, com.tools20022.repository.choice.FormOfSecurity5Choice.Proprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.RegistrationForm, com.tools20022.repository.msg.InvestmentAccount40.SecuritiesForm, com.tools20022.repository.msg.InvestmentAccount41.SecuritiesForm,
					com.tools20022.repository.msg.InvestmentFundTransactionsByFund3.SecuritiesForm, com.tools20022.repository.msg.AggregateHoldingBalance1.HoldingForm,
					com.tools20022.repository.msg.FinancialInstrumentAttributes63.RegistrationForm, com.tools20022.repository.msg.FinancialInstrumentAttributes64.RegistrationForm,
					com.tools20022.repository.choice.FormOfSecurity6Choice.Code, com.tools20022.repository.choice.FormOfSecurity6Choice.Proprietary, com.tools20022.repository.msg.InvestmentAccount54.SecuritiesForm,
					com.tools20022.repository.msg.InvestmentAccount56.SecuritiesForm, com.tools20022.repository.msg.FinancialInstrument51.SecuritiesForm, com.tools20022.repository.msg.InvestmentAccount55.SecuritiesForm,
					com.tools20022.repository.msg.FinancialInstrument45.SecuritiesForm, com.tools20022.repository.msg.FinancialInstrument49.SecuritiesForm, com.tools20022.repository.msg.InvestmentAccount57.SecuritiesForm,
					com.tools20022.repository.msg.FinancialInstrumentAttributes75.RegistrationForm, com.tools20022.repository.msg.FinancialInstrumentAttributes78.RegistrationForm,
					com.tools20022.repository.choice.FormOfSecurity7Choice.Code, com.tools20022.repository.choice.FormOfSecurity7Choice.Proprietary, com.tools20022.repository.msg.FinancialInstrument57.SecuritiesForm,
					com.tools20022.repository.msg.FinancialInstrument56.SecuritiesForm, com.tools20022.repository.msg.FinancialInstrument55.SecuritiesForm);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationForm";
			definition = "Specifies the form, ie, ownership, of the security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FormOfSecurityCode.mmObject();
		}
	};
	/**
	 * Indicates whether a security exists only as an electronic record, ie,
	 * there is no physical document representing the security.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#DematerialisedIndicator
	 * FinancialInstrument16.DematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#DematerialisedIndicator
	 * InvestmentAccount10.DematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount11#DematerialisedIndicator
	 * InvestmentAccount11.DematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#DematerialisedIndicator
	 * InvestmentAccount22.DematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount24#DematerialisedIndicator
	 * InvestmentAccount24.DematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#DematerialisedIndicator
	 * InvestmentAccount40.DematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount41#DematerialisedIndicator
	 * InvestmentAccount41.DematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#DematerialisedIndicator
	 * InvestmentAccount54.DematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#DematerialisedIndicator
	 * InvestmentAccount56.DematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#DematerialisedIndicator
	 * InvestmentAccount55.DematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#DematerialisedIndicator
	 * InvestmentAccount57.DematerialisedIndicator}</li>
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
	public static final MMBusinessAttribute DematerialisedIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument16.DematerialisedIndicator, com.tools20022.repository.msg.InvestmentAccount10.DematerialisedIndicator,
					com.tools20022.repository.msg.InvestmentAccount11.DematerialisedIndicator, com.tools20022.repository.msg.InvestmentAccount22.DematerialisedIndicator,
					com.tools20022.repository.msg.InvestmentAccount24.DematerialisedIndicator, com.tools20022.repository.msg.InvestmentAccount40.DematerialisedIndicator,
					com.tools20022.repository.msg.InvestmentAccount41.DematerialisedIndicator, com.tools20022.repository.msg.InvestmentAccount54.DematerialisedIndicator,
					com.tools20022.repository.msg.InvestmentAccount56.DematerialisedIndicator, com.tools20022.repository.msg.InvestmentAccount55.DematerialisedIndicator,
					com.tools20022.repository.msg.InvestmentAccount57.DematerialisedIndicator);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DematerialisedIndicator";
			definition = "Indicates whether a security exists only as an electronic record, ie, there is no physical document representing the security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the investment fund class is subject to the European
	 * Union Saving Directive.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#EUSavingsDirective
	 * FinancialInstrument16.EUSavingsDirective}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#EUSavingsDirective
	 * FinancialInstrument20.EUSavingsDirective}</li>
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
	public static final MMBusinessAttribute EUSavingsDirective = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument16.EUSavingsDirective, com.tools20022.repository.msg.FinancialInstrument20.EUSavingsDirective);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EUSavingsDirective";
			definition = "Indicates whether the investment fund class is subject to the European Union Saving Directive.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> EUSavingsDirectiveCode.mmObject();
		}
	};
	/**
	 * Specifies the quantity associated with a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecurityIdentification
	 * SecuritiesQuantity.SecurityIdentification}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument26#Quantity
	 * FinancialInstrument26.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument30#Quantity
	 * FinancialInstrument30.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument24#Quantity
	 * FinancialInstrument24.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument33#Quantity
	 * FinancialInstrument33.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument23#Quantity
	 * FinancialInstrument23.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument31#Quantity
	 * FinancialInstrument31.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification33#OwnedSecuritiesQuantity
	 * PartyIdentification33.OwnedSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity3#FinancialInstrumentQuantity
	 * AmountPricePerFinancialInstrumentQuantity3.FinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification34#OwnedSecuritiesQuantity
	 * PartyIdentification34.OwnedSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity4#FinancialInstrumentQuantity
	 * AmountPricePerFinancialInstrumentQuantity4.FinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification50#OwnedSecuritiesQuantity
	 * PartyIdentification50.OwnedSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification51#OwnedSecuritiesQuantity
	 * PartyIdentification51.OwnedSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification56#OwnedSecuritiesQuantity
	 * PartyIdentification56.OwnedSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification57#OwnedSecuritiesQuantity
	 * PartyIdentification57.OwnedSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes3#Quantity
	 * FinancialInstrumentAttributes3.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes12#Quantity
	 * FinancialInstrumentAttributes12.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes17#Quantity
	 * FinancialInstrumentAttributes17.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes25#Quantity
	 * FinancialInstrumentAttributes25.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes46#Quantity
	 * FinancialInstrumentAttributes46.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes47#Quantity
	 * FinancialInstrumentAttributes47.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAvailability#Quantity
	 * QuantityAndAvailability.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation3#Quantity
	 * AdditionalInformation3.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation4#Quantity
	 * AdditionalInformation4.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation7#Quantity
	 * AdditionalInformation7.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation8#Quantity
	 * AdditionalInformation8.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#Quantity
	 * UnderlyingAttributes.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#AdjustedQuantity
	 * UnderlyingAttributes.AdjustedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity1#FinancialInstrumentQuantity
	 * AmountPricePerFinancialInstrumentQuantity1.FinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#ElectedSecuritiesQuantity
	 * BeneficialOwner1.ElectedSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral1#Quantity
	 * SecuritiesCollateral1.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5#FinancialInstrumentQuantity
	 * AmountPricePerFinancialInstrumentQuantity5.FinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes2#Quantity
	 * UnderlyingAttributes2.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes2#AdjustedQuantity
	 * UnderlyingAttributes2.AdjustedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#PositionLimit
	 * CommonFinancialInstrumentAttributes1.PositionLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument37#Quantity
	 * FinancialInstrument37.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument35#Quantity
	 * FinancialInstrument35.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument34#Quantity
	 * FinancialInstrument34.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9#Quantity
	 * AdditionalInformation9.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation10#Quantity
	 * AdditionalInformation10.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument40#Quantity
	 * FinancialInstrument40.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39#Quantity
	 * FinancialInstrument39.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral2#Quantity
	 * SecuritiesCollateral2.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral2#BlockedQuantity
	 * SecuritiesCollateral2.BlockedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherTypeOfCollateral2#Quantity
	 * OtherTypeOfCollateral2.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#Quantity
	 * SecuritiesCollateral3.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#BlockedQuantity
	 * OtherCollateral3.BlockedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#Quantity
	 * SecuritiesCollateral4.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#Quantity
	 * SecuritiesTransaction1.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation11#Quantity
	 * AdditionalInformation11.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6#LegOrderQuantity
	 * InstrumentLeg6.LegOrderQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification93#OwnedSecuritiesQuantity
	 * PartyIdentification93.OwnedSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#Quantity
	 * FinancialInstrumentAttributes68.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity6#FinancialInstrumentQuantity
	 * AmountPricePerFinancialInstrumentQuantity6.FinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#Quantity
	 * FinancialInstrument48.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47#Quantity
	 * FinancialInstrument47.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#Quantity
	 * FinancialInstrument46.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#BlockedQuantity
	 * OtherCollateral6.BlockedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#Quantity
	 * SecuritiesCollateral6.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#BlockedQuantity
	 * SecuritiesCollateral6.BlockedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5#Quantity
	 * SecuritiesCollateral5.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#Quantity
	 * SecuritiesCollateral7.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification101#OwnedSecuritiesQuantity
	 * PartyIdentification101.OwnedSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes73#Quantity
	 * FinancialInstrumentAttributes73.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity7#FinancialInstrumentQuantity
	 * AmountPricePerFinancialInstrumentQuantity7.FinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation12#Quantity
	 * AdditionalInformation12.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation13#Quantity
	 * AdditionalInformation13.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#Quantity
	 * SecuritiesCollateral8.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation14#Quantity
	 * AdditionalInformation14.Quantity}</li>
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
	public static final MMBusinessAssociationEnd SecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument26.Quantity, com.tools20022.repository.msg.FinancialInstrument30.Quantity, com.tools20022.repository.msg.FinancialInstrument24.Quantity,
					com.tools20022.repository.msg.FinancialInstrument33.Quantity, com.tools20022.repository.msg.FinancialInstrument23.Quantity, com.tools20022.repository.msg.FinancialInstrument31.Quantity,
					com.tools20022.repository.msg.PartyIdentification33.OwnedSecuritiesQuantity, com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity3.FinancialInstrumentQuantity,
					com.tools20022.repository.msg.PartyIdentification34.OwnedSecuritiesQuantity, com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity4.FinancialInstrumentQuantity,
					com.tools20022.repository.msg.PartyIdentification50.OwnedSecuritiesQuantity, com.tools20022.repository.msg.PartyIdentification51.OwnedSecuritiesQuantity,
					com.tools20022.repository.msg.PartyIdentification56.OwnedSecuritiesQuantity, com.tools20022.repository.msg.PartyIdentification57.OwnedSecuritiesQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes3.Quantity, com.tools20022.repository.msg.FinancialInstrumentAttributes12.Quantity, com.tools20022.repository.msg.FinancialInstrumentAttributes17.Quantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes25.Quantity, com.tools20022.repository.msg.FinancialInstrumentAttributes46.Quantity, com.tools20022.repository.msg.FinancialInstrumentAttributes47.Quantity,
					com.tools20022.repository.msg.QuantityAndAvailability.Quantity, com.tools20022.repository.msg.AdditionalInformation3.Quantity, com.tools20022.repository.msg.AdditionalInformation4.Quantity,
					com.tools20022.repository.msg.AdditionalInformation7.Quantity, com.tools20022.repository.msg.AdditionalInformation8.Quantity, com.tools20022.repository.msg.UnderlyingAttributes.Quantity,
					com.tools20022.repository.msg.UnderlyingAttributes.AdjustedQuantity, com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity1.FinancialInstrumentQuantity,
					com.tools20022.repository.msg.BeneficialOwner1.ElectedSecuritiesQuantity, com.tools20022.repository.msg.SecuritiesCollateral1.Quantity,
					com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5.FinancialInstrumentQuantity, com.tools20022.repository.msg.UnderlyingAttributes2.Quantity,
					com.tools20022.repository.msg.UnderlyingAttributes2.AdjustedQuantity, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1.PositionLimit, com.tools20022.repository.msg.FinancialInstrument37.Quantity,
					com.tools20022.repository.msg.FinancialInstrument35.Quantity, com.tools20022.repository.msg.FinancialInstrument34.Quantity, com.tools20022.repository.msg.AdditionalInformation9.Quantity,
					com.tools20022.repository.msg.AdditionalInformation10.Quantity, com.tools20022.repository.msg.FinancialInstrument40.Quantity, com.tools20022.repository.msg.FinancialInstrument39.Quantity,
					com.tools20022.repository.msg.SecuritiesCollateral2.Quantity, com.tools20022.repository.msg.SecuritiesCollateral2.BlockedQuantity, com.tools20022.repository.msg.OtherTypeOfCollateral2.Quantity,
					com.tools20022.repository.msg.SecuritiesCollateral3.Quantity, com.tools20022.repository.msg.OtherCollateral3.BlockedQuantity, com.tools20022.repository.msg.SecuritiesCollateral4.Quantity,
					com.tools20022.repository.msg.SecuritiesTransaction1.Quantity, com.tools20022.repository.msg.AdditionalInformation11.Quantity, com.tools20022.repository.msg.InstrumentLeg6.LegOrderQuantity,
					com.tools20022.repository.msg.PartyIdentification93.OwnedSecuritiesQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes68.Quantity,
					com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity6.FinancialInstrumentQuantity, com.tools20022.repository.msg.FinancialInstrument48.Quantity,
					com.tools20022.repository.msg.FinancialInstrument47.Quantity, com.tools20022.repository.msg.FinancialInstrument46.Quantity, com.tools20022.repository.msg.OtherCollateral6.BlockedQuantity,
					com.tools20022.repository.msg.SecuritiesCollateral6.Quantity, com.tools20022.repository.msg.SecuritiesCollateral6.BlockedQuantity, com.tools20022.repository.msg.SecuritiesCollateral5.Quantity,
					com.tools20022.repository.msg.SecuritiesCollateral7.Quantity, com.tools20022.repository.msg.PartyIdentification101.OwnedSecuritiesQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes73.Quantity,
					com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity7.FinancialInstrumentQuantity, com.tools20022.repository.msg.AdditionalInformation12.Quantity,
					com.tools20022.repository.msg.AdditionalInformation13.Quantity, com.tools20022.repository.msg.SecuritiesCollateral8.Quantity, com.tools20022.repository.msg.AdditionalInformation14.Quantity);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Specifies the quantity associated with a security.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.SecurityIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Fees related to securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#Security
	 * SecuritiesRelatedFees.Security}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice6#ChargeDetails
	 * UnitPrice6.ChargeDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice15#ChargeDetails
	 * UnitPrice15.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation2#ChargeDetails
	 * DeliverInformation2.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation4#ChargeDetails
	 * DeliverInformation4.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation7#ChargeDetails
	 * DeliverInformation7.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation2#ChargeDetails
	 * ReceiveInformation2.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation4#ChargeDetails
	 * ReceiveInformation4.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation8#ChargeDetails
	 * ReceiveInformation8.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation6#ChargeDetails
	 * ReceiveInformation6.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation11#ChargeDetails
	 * ReceiveInformation11.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation11#ChargeDetails
	 * DeliverInformation11.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation3#ChargeDetails
	 * DeliverInformation3.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation8#ChargeDetails
	 * DeliverInformation8.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation3#ChargeDetails
	 * ReceiveInformation3.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation7#ChargeDetails
	 * ReceiveInformation7.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation5#ChargeDetails
	 * ReceiveInformation5.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#ChargeDetails
	 * ReceiveInformation9.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation5#ChargeDetails
	 * DeliverInformation5.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#ChargeDetails
	 * DeliverInformation9.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation6#ChargeDetails
	 * DeliverInformation6.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#MatchingConfirmationFee
	 * OtherAmounts16.MatchingConfirmationFee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#MarketMemberFeeAmount
	 * OtherAmounts16.MarketMemberFeeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts16#OddLotFee
	 * OtherAmounts16.OddLotFee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#ChargeDetails
	 * ReceiveInformation13.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12#ChargeDetails
	 * ReceiveInformation12.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation12#ChargeDetails
	 * DeliverInformation12.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#ChargeDetails
	 * DeliverInformation13.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#ChargeDetails
	 * DeliverInformation15.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation14#ChargeDetails
	 * DeliverInformation14.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#ChargeDetails
	 * ReceiveInformation15.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14#ChargeDetails
	 * ReceiveInformation14.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#ChargeDetails
	 * ReceiveInformation17.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#ChargeDetails
	 * ReceiveInformation16.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#ChargeDetails
	 * DeliverInformation16.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#ChargeDetails
	 * DeliverInformation17.ChargeDetails}</li>
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
	public static final MMBusinessAssociationEnd Fees = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnitPrice6.ChargeDetails, com.tools20022.repository.msg.UnitPrice15.ChargeDetails, com.tools20022.repository.msg.DeliverInformation2.ChargeDetails,
					com.tools20022.repository.msg.DeliverInformation4.ChargeDetails, com.tools20022.repository.msg.DeliverInformation7.ChargeDetails, com.tools20022.repository.msg.ReceiveInformation2.ChargeDetails,
					com.tools20022.repository.msg.ReceiveInformation4.ChargeDetails, com.tools20022.repository.msg.ReceiveInformation8.ChargeDetails, com.tools20022.repository.msg.ReceiveInformation6.ChargeDetails,
					com.tools20022.repository.msg.ReceiveInformation11.ChargeDetails, com.tools20022.repository.msg.DeliverInformation11.ChargeDetails, com.tools20022.repository.msg.DeliverInformation3.ChargeDetails,
					com.tools20022.repository.msg.DeliverInformation8.ChargeDetails, com.tools20022.repository.msg.ReceiveInformation3.ChargeDetails, com.tools20022.repository.msg.ReceiveInformation7.ChargeDetails,
					com.tools20022.repository.msg.ReceiveInformation5.ChargeDetails, com.tools20022.repository.msg.ReceiveInformation9.ChargeDetails, com.tools20022.repository.msg.DeliverInformation5.ChargeDetails,
					com.tools20022.repository.msg.DeliverInformation9.ChargeDetails, com.tools20022.repository.msg.DeliverInformation6.ChargeDetails, com.tools20022.repository.msg.OtherAmounts16.MatchingConfirmationFee,
					com.tools20022.repository.msg.OtherAmounts16.MarketMemberFeeAmount, com.tools20022.repository.msg.OtherAmounts16.OddLotFee, com.tools20022.repository.msg.ReceiveInformation13.ChargeDetails,
					com.tools20022.repository.msg.ReceiveInformation12.ChargeDetails, com.tools20022.repository.msg.DeliverInformation12.ChargeDetails, com.tools20022.repository.msg.DeliverInformation13.ChargeDetails,
					com.tools20022.repository.msg.DeliverInformation15.ChargeDetails, com.tools20022.repository.msg.DeliverInformation14.ChargeDetails, com.tools20022.repository.msg.ReceiveInformation15.ChargeDetails,
					com.tools20022.repository.msg.ReceiveInformation14.ChargeDetails, com.tools20022.repository.msg.ReceiveInformation17.ChargeDetails, com.tools20022.repository.msg.ReceiveInformation16.ChargeDetails,
					com.tools20022.repository.msg.DeliverInformation16.ChargeDetails, com.tools20022.repository.msg.DeliverInformation17.ChargeDetails);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Fees";
			definition = "Fees related to securities.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesRelatedFees.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesRelatedFees.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information on the price of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#Security
	 * SecuritiesPricing.Security}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Unit1#PriceDetails
	 * Unit1.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit3#PriceDetails
	 * Unit3.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#IssuePrice
	 * FinancialInstrumentAttributes5.IssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#IssuePrice
	 * FinancialInstrumentAttributes10.IssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#IssuePrice
	 * FinancialInstrumentAttributes16.IssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#IssuePrice
	 * FinancialInstrumentAttributes24.IssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#IssuePrice
	 * FinancialInstrumentAttributes34.IssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#IssuePrice
	 * FinancialInstrumentAttributes40.IssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7#PriceDetails
	 * AggregateBalancePerSafekeepingPlace7.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#PriceDetails
	 * AggregateBalanceInformation8.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10#PriceDetails
	 * AggregateBalancePerSafekeepingPlace10.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#PriceDetails
	 * AggregateBalanceInformation11.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2#PriceDetails
	 * AggregateBalancePerSafekeepingPlace2.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation2#PriceDetails
	 * AggregateBalanceInformation2.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#PriceDetails
	 * AggregateBalancePerSafekeepingPlace4.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#PriceDetails
	 * AggregateBalanceInformation3.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12#PriceDetails
	 * AggregateBalancePerSafekeepingPlace12.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#PriceDetails
	 * AggregateBalanceInformation13.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14#PriceDetails
	 * AggregateBalancePerSafekeepingPlace14.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#PriceDetails
	 * AggregateBalanceInformation15.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16#PriceDetails
	 * AggregateBalancePerSafekeepingPlace16.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#PriceDetails
	 * AggregateBalanceInformation17.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#PriceDetails
	 * AggregateBalancePerSafekeepingPlace18.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#PriceDetails
	 * AggregateBalanceInformation19.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21#PriceDetails
	 * AggregateBalancePerSafekeepingPlace21.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#PriceDetails
	 * AggregateBalanceInformation22.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22#PriceDetails
	 * AggregateBalancePerSafekeepingPlace22.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#PriceDetails
	 * AggregateBalanceInformation23.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8#PriceDetails
	 * AggregateBalancePerSafekeepingPlace8.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#PriceDetails
	 * AggregateBalanceInformation9.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9#PriceDetails
	 * AggregateBalancePerSafekeepingPlace9.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#PriceDetails
	 * AggregateBalanceInformation10.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#PriceDetails
	 * AggregateBalancePerSafekeepingPlace1.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1#PriceDetails
	 * AggregateBalanceInformation1.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#PriceDetails
	 * AggregateBalancePerSafekeepingPlace3.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#PriceDetails
	 * AggregateBalanceInformation4.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11#PriceDetails
	 * AggregateBalancePerSafekeepingPlace11.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#PriceDetails
	 * AggregateBalanceInformation12.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13#PriceDetails
	 * AggregateBalancePerSafekeepingPlace13.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#PriceDetails
	 * AggregateBalanceInformation14.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15#PriceDetails
	 * AggregateBalancePerSafekeepingPlace15.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#PriceDetails
	 * AggregateBalanceInformation16.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17#PriceDetails
	 * AggregateBalancePerSafekeepingPlace17.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#PriceDetails
	 * AggregateBalanceInformation18.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#PriceDetails
	 * AggregateBalancePerSafekeepingPlace20.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#PriceDetails
	 * AggregateBalanceInformation21.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23#PriceDetails
	 * AggregateBalancePerSafekeepingPlace23.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#PriceDetails
	 * AggregateBalanceInformation24.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails2#PriceDetails
	 * FinancialInstrumentDetails2.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails3#PriceDetails
	 * FinancialInstrumentDetails3.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails5#PriceDetails
	 * FinancialInstrumentDetails5.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails8#PriceDetails
	 * FinancialInstrumentDetails8.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails9#PriceDetails
	 * FinancialInstrumentDetails9.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails11#PriceDetails
	 * FinancialInstrumentDetails11.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails13#PriceDetails
	 * FinancialInstrumentDetails13.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails16#PriceDetails
	 * FinancialInstrumentDetails16.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingAttributes#Price
	 * UnderlyingAttributes.Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#EndPrice
	 * UnderlyingAttributes.EndPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#PriceRange
	 * FinancialInstrumentStipulations.PriceRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#PriceRange
	 * FinancialInstrumentStipulations2.PriceRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription1#StrikePrice
	 * SecurityInstrumentDescription1.StrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription2#StrikePrice
	 * SecurityInstrumentDescription2.StrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral1#Price
	 * SecuritiesCollateral1.Price}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFund1#Price
	 * InvestmentFund1.Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation5#PriceDetails
	 * AggregateBalanceInformation5.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes2#Price
	 * UnderlyingAttributes2.Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes2#EndPrice
	 * UnderlyingAttributes2.EndPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValue1#ValuationPrice
	 * CollateralValue1.ValuationPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19#PriceDetails
	 * AggregateBalancePerSafekeepingPlace19.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#PriceDetails
	 * AggregateBalanceInformation20.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#PreviousClosingPrice
	 * ListStrikePriceDetails1.PreviousClosingPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#PriceDetails
	 * AggregateBalancePerSafekeepingPlace6.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6#PriceDetails
	 * AggregateBalanceInformation6.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5#PriceDetails
	 * AggregateBalancePerSafekeepingPlace5.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#PriceDetails
	 * AggregateBalanceInformation7.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails17#PriceDetails
	 * FinancialInstrumentDetails17.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#IssuePrice
	 * FinancialInstrumentAttributes49.IssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#IssuePrice
	 * FinancialInstrumentAttributes56.IssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails18#PriceDetails
	 * FinancialInstrumentDetails18.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#PriceDetails
	 * AggregateBalanceInformation26.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#PriceDetails
	 * AggregateBalanceInformation25.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#PriceDetails
	 * AggregateBalancePerSafekeepingPlace24.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25#PriceDetails
	 * AggregateBalancePerSafekeepingPlace25.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral2#Price
	 * SecuritiesCollateral2.Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#Price
	 * SecuritiesCollateral3.Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#Price
	 * SecuritiesCollateral4.Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#PriceDetails
	 * AggregateBalanceInformation28.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#PriceDetails
	 * AggregateBalanceInformation27.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26#PriceDetails
	 * AggregateBalancePerSafekeepingPlace26.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#PriceDetails
	 * AggregateBalancePerSafekeepingPlace27.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#PriceDetails
	 * AggregateBalanceInformation30.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails20#PriceDetails
	 * FinancialInstrumentDetails20.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#PriceDetails
	 * AggregateBalanceInformation31.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#PriceDetails
	 * AggregateBalancePerSafekeepingPlace28.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#PriceDetails
	 * AggregateBalancePerSafekeepingPlace29.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#IssuePrice
	 * FinancialInstrumentAttributes67.IssuePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit6#PriceDetails
	 * Unit6.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#Price
	 * SecuritiesCollateral6.Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5#Price
	 * SecuritiesCollateral5.Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#Price
	 * SecuritiesCollateral7.Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#IssuePrice
	 * FinancialInstrumentAttributes71.IssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails23#PriceDetails
	 * FinancialInstrumentDetails23.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#PriceDetails
	 * AggregateBalanceInformation32.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#PriceDetails
	 * AggregateBalanceInformation33.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#PriceDetails
	 * AggregateBalancePerSafekeepingPlace31.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30#PriceDetails
	 * AggregateBalancePerSafekeepingPlace30.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#IssuePrice
	 * FinancialInstrumentAttributes80.IssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails25#PriceDetails
	 * FinancialInstrumentDetails25.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#Price
	 * SecuritiesCollateral8.Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails27#PriceDetails
	 * FinancialInstrumentDetails27.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#IssuePrice
	 * FinancialInstrumentAttributes83.IssuePrice}</li>
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
	public static final MMBusinessAssociationEnd Pricing = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Unit1.PriceDetails, com.tools20022.repository.msg.Unit3.PriceDetails, com.tools20022.repository.msg.FinancialInstrumentAttributes5.IssuePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes10.IssuePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes16.IssuePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes24.IssuePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes34.IssuePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes40.IssuePrice, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7.PriceDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation8.PriceDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10.PriceDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation11.PriceDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2.PriceDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation2.PriceDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4.PriceDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation3.PriceDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12.PriceDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation13.PriceDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14.PriceDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation15.PriceDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16.PriceDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation17.PriceDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.PriceDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation19.PriceDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21.PriceDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation22.PriceDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22.PriceDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation23.PriceDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8.PriceDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation9.PriceDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9.PriceDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation10.PriceDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.PriceDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation1.PriceDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3.PriceDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation4.PriceDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11.PriceDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation12.PriceDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13.PriceDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation14.PriceDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15.PriceDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation16.PriceDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17.PriceDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation18.PriceDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20.PriceDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation21.PriceDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23.PriceDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation24.PriceDetails, com.tools20022.repository.msg.FinancialInstrumentDetails2.PriceDetails, com.tools20022.repository.msg.FinancialInstrumentDetails3.PriceDetails,
					com.tools20022.repository.msg.FinancialInstrumentDetails5.PriceDetails, com.tools20022.repository.msg.FinancialInstrumentDetails8.PriceDetails, com.tools20022.repository.msg.FinancialInstrumentDetails9.PriceDetails,
					com.tools20022.repository.msg.FinancialInstrumentDetails11.PriceDetails, com.tools20022.repository.msg.FinancialInstrumentDetails13.PriceDetails, com.tools20022.repository.msg.FinancialInstrumentDetails16.PriceDetails,
					com.tools20022.repository.msg.UnderlyingAttributes.Price, com.tools20022.repository.msg.UnderlyingAttributes.EndPrice, com.tools20022.repository.msg.FinancialInstrumentStipulations.PriceRange,
					com.tools20022.repository.msg.FinancialInstrumentStipulations2.PriceRange, com.tools20022.repository.msg.SecurityInstrumentDescription1.StrikePrice,
					com.tools20022.repository.msg.SecurityInstrumentDescription2.StrikePrice, com.tools20022.repository.msg.SecuritiesCollateral1.Price, com.tools20022.repository.msg.InvestmentFund1.Price,
					com.tools20022.repository.msg.AggregateBalanceInformation5.PriceDetails, com.tools20022.repository.msg.UnderlyingAttributes2.Price, com.tools20022.repository.msg.UnderlyingAttributes2.EndPrice,
					com.tools20022.repository.msg.CollateralValue1.ValuationPrice, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19.PriceDetails, com.tools20022.repository.msg.AggregateBalanceInformation20.PriceDetails,
					com.tools20022.repository.msg.ListStrikePriceDetails1.PreviousClosingPrice, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.PriceDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation6.PriceDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5.PriceDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation7.PriceDetails, com.tools20022.repository.msg.FinancialInstrumentDetails17.PriceDetails, com.tools20022.repository.msg.FinancialInstrumentAttributes49.IssuePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes56.IssuePrice, com.tools20022.repository.msg.FinancialInstrumentDetails18.PriceDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation26.PriceDetails, com.tools20022.repository.msg.AggregateBalanceInformation25.PriceDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.PriceDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25.PriceDetails,
					com.tools20022.repository.msg.SecuritiesCollateral2.Price, com.tools20022.repository.msg.SecuritiesCollateral3.Price, com.tools20022.repository.msg.SecuritiesCollateral4.Price,
					com.tools20022.repository.msg.AggregateBalanceInformation28.PriceDetails, com.tools20022.repository.msg.AggregateBalanceInformation27.PriceDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26.PriceDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27.PriceDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation30.PriceDetails, com.tools20022.repository.msg.FinancialInstrumentDetails20.PriceDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation31.PriceDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.PriceDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29.PriceDetails, com.tools20022.repository.msg.FinancialInstrumentAttributes67.IssuePrice, com.tools20022.repository.msg.Unit6.PriceDetails,
					com.tools20022.repository.msg.SecuritiesCollateral6.Price, com.tools20022.repository.msg.SecuritiesCollateral5.Price, com.tools20022.repository.msg.SecuritiesCollateral7.Price,
					com.tools20022.repository.msg.FinancialInstrumentAttributes71.IssuePrice, com.tools20022.repository.msg.FinancialInstrumentDetails23.PriceDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation32.PriceDetails, com.tools20022.repository.msg.AggregateBalanceInformation33.PriceDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31.PriceDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30.PriceDetails,
					com.tools20022.repository.msg.FinancialInstrumentAttributes80.IssuePrice, com.tools20022.repository.msg.FinancialInstrumentDetails25.PriceDetails, com.tools20022.repository.msg.SecuritiesCollateral8.Price,
					com.tools20022.repository.msg.FinancialInstrumentDetails27.PriceDetails, com.tools20022.repository.msg.FinancialInstrumentAttributes83.IssuePrice);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Pricing";
			definition = "Information on the price of the security.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account on which the security is held.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#Security
	 * SecuritiesAccount.Security}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails41#SafekeepingAccount
	 * TransactionDetails41.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails43#SafekeepingAccount
	 * TransactionDetails43.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails12#SafekeepingAccount
	 * TransactionDetails12.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails19#SafekeepingAccount
	 * TransactionDetails19.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation3#SafekeepingAccount
	 * AdditionalInformation3.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation4#SafekeepingAccount
	 * AdditionalInformation4.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation7#SafekeepingAccount
	 * AdditionalInformation7.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation8#SafekeepingAccount
	 * AdditionalInformation8.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#SafekeepingAccount
	 * TransactionDetails5.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#SafekeepingAccount
	 * TransactionDetails9.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#SafekeepingAccount
	 * TransactionDetails22.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#SafekeepingAccount
	 * TransactionDetails23.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#SafekeepingAccount
	 * TransactionDetails36.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#SafekeepingAccount
	 * TransactionDetails47.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#SafekeepingAccount
	 * TransactionDetails53.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#SafekeepingAccount
	 * TransactionDetails58.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails13#SafekeepingAccount
	 * TransactionDetails13.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails4#SafekeepingAccount
	 * TransactionDetails4.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails30#SafekeepingAccount
	 * TransactionDetails30.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails11#SafekeepingAccount
	 * TransactionDetails11.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails21#SafekeepingAccount
	 * TransactionDetails21.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails40#SafekeepingAccount
	 * TransactionDetails40.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#SafekeepingAccount
	 * TransactionDetails42.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails15#SafekeepingAccount
	 * TransactionDetails15.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails14#SafekeepingAccount
	 * TransactionDetails14.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails35#SafekeepingAccount
	 * TransactionDetails35.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlement1#SafekeepingAccountDetails
	 * SecuritiesSettlement1.SafekeepingAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuePosition1#SecuritiesAccount
	 * CollateralValuePosition1.SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#SafekeepingAccount
	 * TransactionDetails61.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails64#SafekeepingAccount
	 * TransactionDetails64.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9#SafekeepingAccount
	 * AdditionalInformation9.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#SafekeepingAccount
	 * TransactionDetails66.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails65#SafekeepingAccount
	 * TransactionDetails65.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation10#SafekeepingAccount
	 * AdditionalInformation10.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#SafekeepingAccount
	 * TransactionDetails70.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral2#SafekeepingAccount
	 * SecuritiesCollateral2.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#SafekeepingAccount
	 * OtherCollateral2.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#SafekeepingAccount
	 * SecuritiesCollateral3.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#SafekeepingAccount
	 * OtherCollateral3.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#SafekeepingAccount
	 * OtherCollateral4.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#SafekeepingAccount
	 * SecuritiesCollateral4.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#SafekeepingAccount
	 * TransactionDetails71.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation11#SafekeepingAccount
	 * AdditionalInformation11.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#SafekeepingAccount
	 * TransactionDetails82.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#SafekeepingAccount
	 * TransactionDetails76.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#SafekeepingAccount
	 * TransactionDetails79.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails80#SafekeepingAccount
	 * TransactionDetails80.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#SafekeepingAccount
	 * OtherCollateral7.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#SafekeepingAccount
	 * OtherCollateral6.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#SafekeepingAccount
	 * SecuritiesCollateral6.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5#SafekeepingAccount
	 * SecuritiesCollateral5.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral5#SafekeepingAccount
	 * OtherCollateral5.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#SafekeepingAccount
	 * SecuritiesCollateral7.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation12#SafekeepingAccount
	 * AdditionalInformation12.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails88#SafekeepingAccount
	 * TransactionDetails88.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails92#SafekeepingAccount
	 * TransactionDetails92.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails85#SafekeepingAccount
	 * TransactionDetails85.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#SafekeepingAccount
	 * TransactionDetails87.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#SafekeepingAccount
	 * TransactionDetails97.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation13#SafekeepingAccount
	 * AdditionalInformation13.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#SafekeepingAccount
	 * SecuritiesCollateral8.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation14#SafekeepingAccount
	 * AdditionalInformation14.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#SafekeepingAccount
	 * TransactionDetails100.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails101#SafekeepingAccount
	 * TransactionDetails101.SafekeepingAccount}</li>
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
	public static final MMBusinessAssociationEnd SecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionDetails41.SafekeepingAccount, com.tools20022.repository.msg.TransactionDetails43.SafekeepingAccount,
					com.tools20022.repository.msg.TransactionDetails12.SafekeepingAccount, com.tools20022.repository.msg.TransactionDetails19.SafekeepingAccount, com.tools20022.repository.msg.AdditionalInformation3.SafekeepingAccount,
					com.tools20022.repository.msg.AdditionalInformation4.SafekeepingAccount, com.tools20022.repository.msg.AdditionalInformation7.SafekeepingAccount, com.tools20022.repository.msg.AdditionalInformation8.SafekeepingAccount,
					com.tools20022.repository.msg.TransactionDetails5.SafekeepingAccount, com.tools20022.repository.msg.TransactionDetails9.SafekeepingAccount, com.tools20022.repository.msg.TransactionDetails22.SafekeepingAccount,
					com.tools20022.repository.msg.TransactionDetails23.SafekeepingAccount, com.tools20022.repository.msg.TransactionDetails36.SafekeepingAccount, com.tools20022.repository.msg.TransactionDetails47.SafekeepingAccount,
					com.tools20022.repository.msg.TransactionDetails53.SafekeepingAccount, com.tools20022.repository.msg.TransactionDetails58.SafekeepingAccount, com.tools20022.repository.msg.TransactionDetails13.SafekeepingAccount,
					com.tools20022.repository.msg.TransactionDetails4.SafekeepingAccount, com.tools20022.repository.msg.TransactionDetails30.SafekeepingAccount, com.tools20022.repository.msg.TransactionDetails11.SafekeepingAccount,
					com.tools20022.repository.msg.TransactionDetails21.SafekeepingAccount, com.tools20022.repository.msg.TransactionDetails40.SafekeepingAccount, com.tools20022.repository.msg.TransactionDetails42.SafekeepingAccount,
					com.tools20022.repository.msg.TransactionDetails15.SafekeepingAccount, com.tools20022.repository.msg.TransactionDetails14.SafekeepingAccount, com.tools20022.repository.msg.TransactionDetails35.SafekeepingAccount,
					com.tools20022.repository.msg.SecuritiesSettlement1.SafekeepingAccountDetails, com.tools20022.repository.msg.CollateralValuePosition1.SecuritiesAccount,
					com.tools20022.repository.msg.TransactionDetails61.SafekeepingAccount, com.tools20022.repository.msg.TransactionDetails64.SafekeepingAccount, com.tools20022.repository.msg.AdditionalInformation9.SafekeepingAccount,
					com.tools20022.repository.msg.TransactionDetails66.SafekeepingAccount, com.tools20022.repository.msg.TransactionDetails65.SafekeepingAccount, com.tools20022.repository.msg.AdditionalInformation10.SafekeepingAccount,
					com.tools20022.repository.msg.TransactionDetails70.SafekeepingAccount, com.tools20022.repository.msg.SecuritiesCollateral2.SafekeepingAccount, com.tools20022.repository.msg.OtherCollateral2.SafekeepingAccount,
					com.tools20022.repository.msg.SecuritiesCollateral3.SafekeepingAccount, com.tools20022.repository.msg.OtherCollateral3.SafekeepingAccount, com.tools20022.repository.msg.OtherCollateral4.SafekeepingAccount,
					com.tools20022.repository.msg.SecuritiesCollateral4.SafekeepingAccount, com.tools20022.repository.msg.TransactionDetails71.SafekeepingAccount, com.tools20022.repository.msg.AdditionalInformation11.SafekeepingAccount,
					com.tools20022.repository.msg.TransactionDetails82.SafekeepingAccount, com.tools20022.repository.msg.TransactionDetails76.SafekeepingAccount, com.tools20022.repository.msg.TransactionDetails79.SafekeepingAccount,
					com.tools20022.repository.msg.TransactionDetails80.SafekeepingAccount, com.tools20022.repository.msg.OtherCollateral7.SafekeepingAccount, com.tools20022.repository.msg.OtherCollateral6.SafekeepingAccount,
					com.tools20022.repository.msg.SecuritiesCollateral6.SafekeepingAccount, com.tools20022.repository.msg.SecuritiesCollateral5.SafekeepingAccount, com.tools20022.repository.msg.OtherCollateral5.SafekeepingAccount,
					com.tools20022.repository.msg.SecuritiesCollateral7.SafekeepingAccount, com.tools20022.repository.msg.AdditionalInformation12.SafekeepingAccount, com.tools20022.repository.msg.TransactionDetails88.SafekeepingAccount,
					com.tools20022.repository.msg.TransactionDetails92.SafekeepingAccount, com.tools20022.repository.msg.TransactionDetails85.SafekeepingAccount, com.tools20022.repository.msg.TransactionDetails87.SafekeepingAccount,
					com.tools20022.repository.msg.TransactionDetails97.SafekeepingAccount, com.tools20022.repository.msg.AdditionalInformation13.SafekeepingAccount, com.tools20022.repository.msg.SecuritiesCollateral8.SafekeepingAccount,
					com.tools20022.repository.msg.AdditionalInformation14.SafekeepingAccount, com.tools20022.repository.msg.TransactionDetails100.SafekeepingAccount, com.tools20022.repository.msg.TransactionDetails101.SafekeepingAccount);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccount";
			definition = "Account on which the security is held.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Market(s) on which the security is traded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#TradedSecurity
	 * TradingMarket.TradedSecurity}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#LocalMarketAnnex
	 * FundProcessingPassport1.LocalMarketAnnex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#PlaceOfTrade
	 * SecuritiesTradeDetails25.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#PlaceOfTrade
	 * SecuritiesTradeDetails26.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#PlaceOfTrade
	 * SecuritiesTradeDetails27.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#PlaceOfTrade
	 * SecuritiesTradeDetails28.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption4#PlaceOfTrade
	 * CorporateActionOption4.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption14#PlaceOfTrade
	 * CorporateActionOption14.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption23#PlaceOfTrade
	 * CorporateActionOption23.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption31#PlaceOfTrade
	 * CorporateActionOption31.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption37#PlaceOfTrade
	 * CorporateActionOption37.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption46#PlaceOfTrade
	 * CorporateActionOption46.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#PlaceOfTrade
	 * CorporateActionOption53.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#PlaceOfTrade
	 * CorporateActionOption54.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#PlaceOfTrade
	 * SecuritiesTradeDetails6.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13#PlaceOfTrade
	 * SecuritiesTradeDetails13.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3#PlaceOfTrade
	 * SecuritiesTradeDetails3.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11#PlaceOfTrade
	 * SecuritiesTradeDetails11.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#PlaceOfTrade
	 * SecuritiesTradeDetails2.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#PlaceOfTrade
	 * SecuritiesTradeDetails16.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#PlaceOfTrade
	 * SecuritiesTradeDetails1.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#PlaceOfTrade
	 * SecuritiesTradeDetails15.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#PlaceOfTrade
	 * TransactionDetails5.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#PlaceOfTrade
	 * TransactionDetails9.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#PlaceOfTrade
	 * TransactionDetails22.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#PlaceOfTrade
	 * TransactionDetails23.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#PlaceOfTrade
	 * TransactionDetails36.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#PlaceOfTrade
	 * TransactionDetails47.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#PlaceOfTrade
	 * TransactionDetails53.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#PlaceOfTrade
	 * TransactionDetails58.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#PlaceOfTrade
	 * TransactionDetails7.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#PlaceOfTrade
	 * TransactionDetails8.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#PlaceOfTrade
	 * TransactionDetails16.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#PlaceOfTrade
	 * TransactionDetails17.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#PlaceOfTrade
	 * TransactionDetails26.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#PlaceOfTrade
	 * TransactionDetails25.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#PlaceOfTrade
	 * TransactionDetails27.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#PlaceOfTrade
	 * TransactionDetails33.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#PlaceOfTrade
	 * TransactionDetails39.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#PlaceOfTrade
	 * TransactionDetails50.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#PlaceOfTrade
	 * TransactionDetails56.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#PlaceOfTrade
	 * TransactionDetails59.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#PlaceOfTrade
	 * TransactionDetails6.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#PlaceOfTrade
	 * TransactionDetails18.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#PlaceOfTrade
	 * TransactionDetails24.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#PlaceOfTrade
	 * TransactionDetails34.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#PlaceOfTrade
	 * TransactionDetails37.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#PlaceOfTrade
	 * TransactionDetails48.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#PlaceOfTrade
	 * TransactionDetails57.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#PlaceOfTrade
	 * TransactionDetails60.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#PlaceOfTrade
	 * TransactionDetails1.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#PlaceOfTrade
	 * TransactionDetails3.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#PlaceOfTrade
	 * SecuritiesFinancingTransactionDetails2.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#PlaceOfTrade
	 * SecuritiesFinancingTransactionDetails8.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8#PlaceOfTrade
	 * SecuritiesTradeDetails8.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails18#PlaceOfTrade
	 * SecuritiesTradeDetails18.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#PlaceOfTrade
	 * SecuritiesTradeDetails4.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#PlaceOfTrade
	 * SecuritiesTradeDetails17.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#PlaceOfTrade
	 * SecuritiesFinancingTransactionDetails6.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#PlaceOfTrade
	 * SecuritiesFinancingTransactionDetails10.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#PlaceOfTrade
	 * SecuritiesFinancingTransactionDetails17.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#PlaceOfTrade
	 * SecuritiesFinancingTransactionDetails18.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9#PlaceOfTrade
	 * SecuritiesTradeDetails9.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails21#PlaceOfTrade
	 * SecuritiesTradeDetails21.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#PlaceOfTrade
	 * SecuritiesTradeDetails10.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#PlaceOfTrade
	 * SecuritiesTradeDetails22.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#PlaceOfTrade
	 * SecuritiesTradeDetails23.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#PlaceOfTrade
	 * SecuritiesTradeDetails29.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#PlaceOfTrade
	 * TransactionDetails51.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#TradingMarket
	 * CommonFinancialInstrumentAttributes1.TradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#PlaceOfTrade
	 * TransactionDetails61.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#PlaceOfTrade
	 * SecuritiesFinancingTransactionDetails21.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#PlaceOfTrade
	 * TransactionDetails62.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#PlaceOfTrade
	 * TransactionDetails63.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#PlaceOfTrade
	 * CorporateActionOption102.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#PlaceOfTrade
	 * SecuritiesTradeDetails31.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#PlaceOfTrade
	 * SecuritiesTradeDetails33.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#PlaceOfTrade
	 * SecuritiesTradeDetails35.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#PlaceOfTrade
	 * SecuritiesTradeDetails38.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#PlaceOfTrade
	 * SecuritiesTradeDetails37.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails36#PlaceOfTrade
	 * SecuritiesTradeDetails36.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#PlaceOfTrade
	 * SecuritiesTradeDetails34.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#PlaceOfTrade
	 * SecuritiesTradeDetails32.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption110#PlaceOfTrade
	 * CorporateActionOption110.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#PlaceOfTrade
	 * SecuritiesTradeDetails44.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39#PlaceOfTrade
	 * SecuritiesTradeDetails39.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#PlaceOfTrade
	 * SecuritiesTradeDetails43.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails41#PlaceOfTrade
	 * SecuritiesTradeDetails41.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#PlaceOfTrade
	 * SecuritiesFinancingTransactionDetails22.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40#PlaceOfTrade
	 * SecuritiesTradeDetails40.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#PlaceOfTrade
	 * TransactionDetails66.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#PlaceOfTrade
	 * SecuritiesTradeDetails42.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#PlaceOfTrade
	 * TransactionDetails67.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#PlaceOfTrade
	 * TransactionDetails68.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#PlaceOfTrade
	 * SecuritiesTradeDetails46.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#PlaceOfTrade
	 * SecuritiesTradeDetails47.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#PlaceOfTrade
	 * SecuritiesFinancingTransactionDetails24.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#PlaceOfTrade
	 * TransactionDetails70.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#PlaceOfTrade
	 * TransactionDetails69.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#PlaceOfTrade
	 * CorporateActionOption111.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption113#PlaceOfTrade
	 * CorporateActionOption113.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#PlaceOfTrade
	 * TransactionDetails71.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#PlaceOfTrade
	 * SecuritiesFinancingTransactionDetails25.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#PlaceOfTrade
	 * TransactionDetails72.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#PlaceOfTrade
	 * SecuritiesTradeDetails49.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#PlaceOfTrade
	 * SecuritiesFinancingTransactionDetails26.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#PlaceOfTrade
	 * TransactionDetails79.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#PlaceOfTrade
	 * TransactionDetails75.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#PlaceOfTrade
	 * TransactionDetails78.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#PlaceOfTrade
	 * SecuritiesTradeDetails51.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#PlaceOfTrade
	 * SecuritiesTradeDetails53.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#PlaceOfTrade
	 * SecuritiesTradeDetails55.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#PlaceOfTrade
	 * SecuritiesTradeDetails56.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#PlaceOfTrade
	 * SecuritiesTradeDetails54.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#PlaceOfTrade
	 * SecuritiesTradeDetails52.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#PlaceOfTrade
	 * SecuritiesTradeDetails50.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#PlaceOfTrade
	 * CorporateActionOption117.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption124#PlaceOfTrade
	 * CorporateActionOption124.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59#PlaceOfTrade
	 * SecuritiesTradeDetails59.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#PlaceOfTrade
	 * SecuritiesFinancingTransactionDetails33.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58#PlaceOfTrade
	 * SecuritiesTradeDetails58.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#PlaceOfTrade
	 * SecuritiesTradeDetails61.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#PlaceOfTrade
	 * SecuritiesTradeDetails63.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#PlaceOfTrade
	 * SecuritiesTradeDetails62.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#PlaceOfTrade
	 * TransactionDetails87.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails60#PlaceOfTrade
	 * SecuritiesTradeDetails60.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#PlaceOfTrade
	 * TransactionDetails91.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#PlaceOfTrade
	 * TransactionDetails90.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#PlaceOfTrade
	 * SecuritiesTradeDetails65.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#PlaceOfTrade
	 * SecuritiesTradeDetails66.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#PlaceOfTrade
	 * CorporateActionOption132.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#PlaceOfTrade
	 * SecuritiesTradeDetails67.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#PlaceOfTrade
	 * SecuritiesTradeDetails68.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#PlaceOfTrade
	 * TransactionDetails97.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#PlaceOfTrade
	 * SecuritiesFinancingTransactionDetails35.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#PlaceOfTrade
	 * TransactionDetails96.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#PlaceOfTrade
	 * TransactionDetails95.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#PlaceOfTrade
	 * SecuritiesTradeDetails69.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption136#PlaceOfTrade
	 * CorporateActionOption136.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#PlaceOfTrade
	 * SecuritiesTradeDetails70.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#PlaceOfTrade
	 * SecuritiesFinancingTransactionDetails36.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#PlaceOfTrade
	 * TransactionDetails100.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#PlaceOfTrade
	 * TransactionDetails99.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#PlaceOfTrade
	 * TransactionDetails98.PlaceOfTrade}</li>
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
	public static final MMBusinessAssociationEnd TradingMarket = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundProcessingPassport1.LocalMarketAnnex, com.tools20022.repository.msg.SecuritiesTradeDetails25.PlaceOfTrade,
					com.tools20022.repository.msg.SecuritiesTradeDetails26.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails27.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails28.PlaceOfTrade,
					com.tools20022.repository.msg.CorporateActionOption4.PlaceOfTrade, com.tools20022.repository.msg.CorporateActionOption14.PlaceOfTrade, com.tools20022.repository.msg.CorporateActionOption23.PlaceOfTrade,
					com.tools20022.repository.msg.CorporateActionOption31.PlaceOfTrade, com.tools20022.repository.msg.CorporateActionOption37.PlaceOfTrade, com.tools20022.repository.msg.CorporateActionOption46.PlaceOfTrade,
					com.tools20022.repository.msg.CorporateActionOption53.PlaceOfTrade, com.tools20022.repository.msg.CorporateActionOption54.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails6.PlaceOfTrade,
					com.tools20022.repository.msg.SecuritiesTradeDetails13.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails3.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails11.PlaceOfTrade,
					com.tools20022.repository.msg.SecuritiesTradeDetails2.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails16.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails1.PlaceOfTrade,
					com.tools20022.repository.msg.SecuritiesTradeDetails15.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails5.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails9.PlaceOfTrade,
					com.tools20022.repository.msg.TransactionDetails22.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails23.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails36.PlaceOfTrade,
					com.tools20022.repository.msg.TransactionDetails47.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails53.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails58.PlaceOfTrade,
					com.tools20022.repository.msg.TransactionDetails7.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails8.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails16.PlaceOfTrade,
					com.tools20022.repository.msg.TransactionDetails17.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails26.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails25.PlaceOfTrade,
					com.tools20022.repository.msg.TransactionDetails27.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails33.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails39.PlaceOfTrade,
					com.tools20022.repository.msg.TransactionDetails50.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails56.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails59.PlaceOfTrade,
					com.tools20022.repository.msg.TransactionDetails6.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails18.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails24.PlaceOfTrade,
					com.tools20022.repository.msg.TransactionDetails34.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails37.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails48.PlaceOfTrade,
					com.tools20022.repository.msg.TransactionDetails57.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails60.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails1.PlaceOfTrade,
					com.tools20022.repository.msg.TransactionDetails3.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.PlaceOfTrade,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails8.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails18.PlaceOfTrade,
					com.tools20022.repository.msg.SecuritiesTradeDetails4.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails17.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.PlaceOfTrade,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.PlaceOfTrade,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails9.PlaceOfTrade,
					com.tools20022.repository.msg.SecuritiesTradeDetails21.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails10.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails22.PlaceOfTrade,
					com.tools20022.repository.msg.SecuritiesTradeDetails23.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails29.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails51.PlaceOfTrade,
					com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1.TradingMarket, com.tools20022.repository.msg.TransactionDetails61.PlaceOfTrade,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails62.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails63.PlaceOfTrade,
					com.tools20022.repository.msg.CorporateActionOption102.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails31.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails33.PlaceOfTrade,
					com.tools20022.repository.msg.SecuritiesTradeDetails35.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails38.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails37.PlaceOfTrade,
					com.tools20022.repository.msg.SecuritiesTradeDetails36.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails34.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails32.PlaceOfTrade,
					com.tools20022.repository.msg.CorporateActionOption110.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails44.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails39.PlaceOfTrade,
					com.tools20022.repository.msg.SecuritiesTradeDetails43.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails41.PlaceOfTrade,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails40.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails66.PlaceOfTrade,
					com.tools20022.repository.msg.SecuritiesTradeDetails42.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails67.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails68.PlaceOfTrade,
					com.tools20022.repository.msg.SecuritiesTradeDetails46.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails47.PlaceOfTrade,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails70.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails69.PlaceOfTrade,
					com.tools20022.repository.msg.CorporateActionOption111.PlaceOfTrade, com.tools20022.repository.msg.CorporateActionOption113.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails71.PlaceOfTrade,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails72.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails49.PlaceOfTrade,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails79.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails75.PlaceOfTrade,
					com.tools20022.repository.msg.TransactionDetails78.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails51.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails53.PlaceOfTrade,
					com.tools20022.repository.msg.SecuritiesTradeDetails55.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails56.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails54.PlaceOfTrade,
					com.tools20022.repository.msg.SecuritiesTradeDetails52.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails50.PlaceOfTrade, com.tools20022.repository.msg.CorporateActionOption117.PlaceOfTrade,
					com.tools20022.repository.msg.CorporateActionOption124.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails59.PlaceOfTrade,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails58.PlaceOfTrade,
					com.tools20022.repository.msg.SecuritiesTradeDetails61.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails63.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails62.PlaceOfTrade,
					com.tools20022.repository.msg.TransactionDetails87.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails60.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails91.PlaceOfTrade,
					com.tools20022.repository.msg.TransactionDetails90.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails65.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails66.PlaceOfTrade,
					com.tools20022.repository.msg.CorporateActionOption132.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails67.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails68.PlaceOfTrade,
					com.tools20022.repository.msg.TransactionDetails97.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails96.PlaceOfTrade,
					com.tools20022.repository.msg.TransactionDetails95.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails69.PlaceOfTrade, com.tools20022.repository.msg.CorporateActionOption136.PlaceOfTrade,
					com.tools20022.repository.msg.SecuritiesTradeDetails70.PlaceOfTrade, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails100.PlaceOfTrade,
					com.tools20022.repository.msg.TransactionDetails99.PlaceOfTrade, com.tools20022.repository.msg.TransactionDetails98.PlaceOfTrade);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingMarket";
			definition = "Market(s) on which the security is traded.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.TradedSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Market(s) on which the security is listed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#ListedSecurity
	 * TradingMarket.ListedSecurity}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#PlaceOfListing
	 * FinancialInstrumentAttributes8.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#PlaceOfListing
	 * FinancialInstrumentAttributes20.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#PlaceOfListing
	 * FinancialInstrumentAttributes35.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#PlaceOfListing
	 * FinancialInstrumentAttributes41.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#PlaceOfListing
	 * FinancialInstrumentAttributes6.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#PlaceOfListing
	 * FinancialInstrumentAttributes9.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#PlaceOfListing
	 * FinancialInstrumentAttributes18.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#PlaceOfListing
	 * FinancialInstrumentAttributes22.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#PlaceOfListing
	 * FinancialInstrumentAttributes32.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#PlaceOfListing
	 * FinancialInstrumentAttributes38.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#PlaceOfListing
	 * FinancialInstrumentAttributes7.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#PlaceOfListing
	 * FinancialInstrumentAttributes5.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#PlaceOfListing
	 * FinancialInstrumentAttributes11.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#PlaceOfListing
	 * FinancialInstrumentAttributes10.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#PlaceOfListing
	 * FinancialInstrumentAttributes19.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#PlaceOfListing
	 * FinancialInstrumentAttributes16.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#PlaceOfListing
	 * FinancialInstrumentAttributes23.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#PlaceOfListing
	 * FinancialInstrumentAttributes24.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#PlaceOfListing
	 * FinancialInstrumentAttributes33.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#PlaceOfListing
	 * FinancialInstrumentAttributes34.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#PlaceOfListing
	 * FinancialInstrumentAttributes39.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#PlaceOfListing
	 * FinancialInstrumentAttributes40.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#PlaceOfListing
	 * FinancialInstrumentAttributes43.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#PlaceOfListing
	 * FinancialInstrumentAttributes45.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#PlaceOfListing
	 * FinancialInstrumentAttributes4.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#PlaceOfListing
	 * FinancialInstrumentAttributes13.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#PlaceOfListing
	 * FinancialInstrumentAttributes21.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#PlaceOfListing
	 * FinancialInstrumentAttributes26.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#PlaceOfListing
	 * FinancialInstrumentAttributes36.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#PlaceOfListing
	 * FinancialInstrumentAttributes42.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#PlaceOfListing
	 * FinancialInstrumentAttributes27.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace7.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#PlaceOfListing
	 * FinancialInstrumentAttributes14.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace10.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace12.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#PlaceOfListing
	 * FinancialInstrumentAttributes30.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace14.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace16.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace18.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace21.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace22.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace8.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace9.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace11.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace13.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace15.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace17.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace20.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace23.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#PlaceOfListing
	 * FinancialInstrumentAttributes28.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#PrimaryPlaceOfListingIdentification
	 * FinancialInstrumentAttributes1.PrimaryPlaceOfListingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#SecondaryPlaceOfListing
	 * FinancialInstrumentAttributes1.SecondaryPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#PlaceOfListing
	 * FinancialInstrumentAttributes31.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#PlaceOfListing
	 * FinancialInstrumentAttributes44.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDescription3#PlaceOfListing
	 * FinancialInstrumentDescription3.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#PlaceOfListing
	 * FinancialInstrumentAttributes15.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#PlaceOfListing
	 * FinancialInstrumentAttributes29.PlaceOfListing}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg2#PlaceOfListing
	 * TradeLeg2.PlaceOfListing}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg5#PlaceOfListing
	 * TradeLeg5.PlaceOfListing}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg1#PlaceOfListing
	 * TradeLeg1.PlaceOfListing}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg3#PlaceOfListing
	 * TradeLeg3.PlaceOfListing}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg6#PlaceOfListing
	 * TradeLeg6.PlaceOfListing}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg4#PlaceOfListing
	 * TradeLeg4.PlaceOfListing}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg7#PlaceOfListing
	 * TradeLeg7.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingParameters1#SecondaryPlaceOfListing
	 * TradingParameters1.SecondaryPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingParameters1#PrimaryPlaceOfListingIdentification
	 * TradingParameters1.PrimaryPlaceOfListingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace19.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#PlaceOfListing
	 * FinancialInstrumentAttributes2.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace6.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace5.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#PlaceOfListing
	 * FinancialInstrumentAttributes48.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#PlaceOfListing
	 * FinancialInstrumentAttributes50.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#PlaceOfListing
	 * FinancialInstrumentAttributes49.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#PlaceOfListing
	 * FinancialInstrumentAttributes55.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#PlaceOfListing
	 * FinancialInstrumentAttributes57.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#PlaceOfListing
	 * FinancialInstrumentAttributes56.PlaceOfListing}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#PlaceOfListing
	 * TradeLeg8.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace24.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace25.PlaceOfListing}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg10#PlaceOfListing
	 * TradeLeg10.PlaceOfListing}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#PlaceOfListing
	 * TradeLeg9.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace26.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace27.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace28.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace29.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#PlaceOfListing
	 * FinancialInstrumentAttributes63.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#PlaceOfListing
	 * FinancialInstrumentAttributes64.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#PlaceOfListing
	 * FinancialInstrumentAttributes66.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#PlaceOfListing
	 * FinancialInstrumentAttributes65.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#PlaceOfListing
	 * FinancialInstrumentAttributes67.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VolumeCapReport1#TradingVenue
	 * VolumeCapReport1.TradingVenue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#PlaceOfListing
	 * FinancialInstrumentAttributes70.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#PlaceOfListing
	 * FinancialInstrumentAttributes69.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#PlaceOfListing
	 * FinancialInstrumentAttributes71.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#PlaceOfListing
	 * FinancialInstrumentAttributes75.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#PlaceOfListing
	 * FinancialInstrumentAttributes78.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace31.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30#PlaceOfListing
	 * AggregateBalancePerSafekeepingPlace30.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#TradingVenue
	 * TransparencyDataReport11.TradingVenue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13#TradingVenue
	 * TransparencyDataReport13.TradingVenue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5#TradingVenueRelatedAttributes
	 * SecuritiesReferenceDataReport5.TradingVenueRelatedAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12#TradingVenue
	 * TransparencyDataReport12.TradingVenue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12#RelevantMarket
	 * TransparencyDataReport12.RelevantMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport15#TradingVenue
	 * TransparencyDataReport15.TradingVenue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#TradingVenue
	 * TransparencyDataReport10.TradingVenue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14#TradingVenue
	 * TransparencyDataReport14.TradingVenue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#PlaceOfListing
	 * FinancialInstrumentAttributes79.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#PlaceOfListing
	 * FinancialInstrumentAttributes81.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#PlaceOfListing
	 * FinancialInstrumentAttributes80.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#PlaceOfListing
	 * FinancialInstrumentAttributes85.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#PlaceOfListing
	 * FinancialInstrumentAttributes84.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#PlaceOfListing
	 * FinancialInstrumentAttributes83.PlaceOfListing}</li>
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
	public static final MMBusinessAssociationEnd PlaceOfListing = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes20.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes41.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes6.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes9.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes18.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes22.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes32.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes38.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes7.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes5.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes11.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes10.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes19.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes16.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes23.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes24.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes33.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes34.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes39.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes40.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes43.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes45.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes13.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes26.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes42.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.PlaceOfListing, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes14.PlaceOfListing, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10.PlaceOfListing,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes30.PlaceOfListing,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14.PlaceOfListing, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16.PlaceOfListing,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.PlaceOfListing, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21.PlaceOfListing,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22.PlaceOfListing, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8.PlaceOfListing,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9.PlaceOfListing, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11.PlaceOfListing,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13.PlaceOfListing, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15.PlaceOfListing,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17.PlaceOfListing, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20.PlaceOfListing,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes28.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes1.PrimaryPlaceOfListingIdentification, com.tools20022.repository.msg.FinancialInstrumentAttributes1.SecondaryPlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes31.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes44.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentDescription3.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes15.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes29.PlaceOfListing, com.tools20022.repository.msg.TradeLeg2.PlaceOfListing, com.tools20022.repository.msg.TradeLeg5.PlaceOfListing,
					com.tools20022.repository.msg.TradeLeg1.PlaceOfListing, com.tools20022.repository.msg.TradeLeg3.PlaceOfListing, com.tools20022.repository.msg.TradeLeg6.PlaceOfListing,
					com.tools20022.repository.msg.TradeLeg4.PlaceOfListing, com.tools20022.repository.msg.TradeLeg7.PlaceOfListing, com.tools20022.repository.msg.TradingParameters1.SecondaryPlaceOfListing,
					com.tools20022.repository.msg.TradingParameters1.PrimaryPlaceOfListingIdentification, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.PlaceOfListing, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.PlaceOfListing,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes48.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes50.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes49.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes55.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes57.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes56.PlaceOfListing, com.tools20022.repository.msg.TradeLeg8.PlaceOfListing, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.PlaceOfListing,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25.PlaceOfListing, com.tools20022.repository.msg.TradeLeg10.PlaceOfListing, com.tools20022.repository.msg.TradeLeg9.PlaceOfListing,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26.PlaceOfListing, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27.PlaceOfListing,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.PlaceOfListing, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes63.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes64.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes66.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes65.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes67.PlaceOfListing, com.tools20022.repository.msg.VolumeCapReport1.TradingVenue, com.tools20022.repository.msg.FinancialInstrumentAttributes70.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes69.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes71.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes75.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes78.PlaceOfListing,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31.PlaceOfListing, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30.PlaceOfListing,
					com.tools20022.repository.msg.TransparencyDataReport11.TradingVenue, com.tools20022.repository.msg.TransparencyDataReport13.TradingVenue,
					com.tools20022.repository.msg.SecuritiesReferenceDataReport5.TradingVenueRelatedAttributes, com.tools20022.repository.msg.TransparencyDataReport12.TradingVenue,
					com.tools20022.repository.msg.TransparencyDataReport12.RelevantMarket, com.tools20022.repository.msg.TransparencyDataReport15.TradingVenue, com.tools20022.repository.msg.TransparencyDataReport10.TradingVenue,
					com.tools20022.repository.msg.TransparencyDataReport14.TradingVenue, com.tools20022.repository.msg.FinancialInstrumentAttributes79.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes81.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes80.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes85.PlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes84.PlaceOfListing,
					com.tools20022.repository.msg.FinancialInstrumentAttributes83.PlaceOfListing);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfListing";
			definition = "Market(s) on which the security is listed.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.ListedSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information related to registration of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#Security
	 * BasicSecuritiesRegistration.Security}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#Registration
	 * SettlementDetails50.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation1#RegistrationDetails
	 * PartyTextInformation1.RegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails3.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails4.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails2.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#Registration
	 * SettlementDetails51.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation3#RegistrationDetails
	 * PartyTextInformation3.RegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails5.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails6.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails7.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldIndicator2#Reason
	 * HoldIndicator2.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldIndicator3#Reason
	 * HoldIndicator3.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldIndicator4#Reason
	 * HoldIndicator4.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldIndicator5#Reason
	 * HoldIndicator5.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#Registration
	 * SettlementDetails6.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#Registration
	 * SettlementDetails20.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#Registration
	 * SettlementDetails24.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#Registration
	 * SettlementDetails33.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#Registration
	 * SettlementDetails45.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#Registration
	 * SettlementDetails54.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#Registration
	 * SettlementDetails1.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#Registration
	 * SettlementDetails19.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#Registration
	 * SettlementDetails22.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#Registration
	 * SettlementDetails35.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#Registration
	 * SettlementDetails42.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#Registration
	 * SettlementDetails52.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails8.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails9.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails10.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails11.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails12.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails13.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#Registration
	 * SettlementDetails8.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#Registration
	 * SettlementDetails11.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#Registration
	 * SettlementDetails23.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#Registration
	 * SettlementDetails37.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#Registration
	 * SettlementDetails44.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#Registration
	 * SettlementDetails53.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#Registration
	 * SettlementDetails7.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#Registration
	 * SettlementDetails12.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#Registration
	 * SettlementDetails28.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#Registration
	 * SettlementDetails38.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#Registration
	 * SettlementDetails47.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#Registration
	 * SettlementDetails56.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#Registration
	 * SettlementDetails2.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#Registration
	 * SettlementDetails13.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#Registration
	 * SettlementDetails27.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#Registration
	 * SettlementDetails39.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#Registration
	 * SettlementDetails48.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#Registration
	 * SettlementDetails57.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#AdditionalPhysicalOrRegistrationDetails
	 * Order16.AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#AdditionalPhysicalOrRegistrationDetails
	 * Order14.AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#Registration
	 * SettlementDetails43.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount6#RegistrationDetails
	 * SecuritiesAccount6.RegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails4#Registration
	 * SettlementDetails4.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#Registration
	 * SettlementDetails5.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails25#Registration
	 * SettlementDetails25.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#Registration
	 * SettlementDetails26.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#Registration
	 * SettlementDetails15.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails34#Registration
	 * SettlementDetails34.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails49#Registration
	 * SettlementDetails49.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails58#Registration
	 * SettlementDetails58.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#Registration
	 * SettlementDetails36.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails18#Registration
	 * SettlementDetails18.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#Registration
	 * SettlementDetails66.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#Registration
	 * SettlementDetails67.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#Registration
	 * SettlementDetails70.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails16.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#Registration
	 * SettlementDetails68.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails14.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#Registration
	 * SettlementDetails69.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails15.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#Registration
	 * SettlementDetails75.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#Registration
	 * SettlementDetails74.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#AdditionalPhysicalOrRegistrationDetails
	 * Order17.AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#AdditionalPhysicalOrRegistrationDetails
	 * Order18.AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#Registration
	 * SettlementDetails81.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#Registration
	 * SettlementDetails80.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails17.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails18.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails19.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#Registration
	 * SettlementDetails87.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#Registration
	 * SettlementDetails83.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#Registration
	 * SettlementDetails86.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#Registration
	 * SettlementDetails85.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails21.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails22.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails20.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#Registration
	 * SettlementDetails93.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#Registration
	 * SettlementDetails90.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails99#Registration
	 * SettlementDetails99.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#Registration
	 * SettlementDetails94.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails100#Registration
	 * SettlementDetails100.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#Registration
	 * SettlementDetails95.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#Registration
	 * SettlementDetails91.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#Registration
	 * SettlementDetails92.Registration}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldIndicator6#Reason
	 * HoldIndicator6.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#Registration
	 * SettlementDetails101.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#Registration
	 * SettlementDetails111.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#Registration
	 * SettlementDetails112.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#Registration
	 * SettlementDetails110.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails108#Registration
	 * SettlementDetails108.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails103#Registration
	 * SettlementDetails103.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails23.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails25.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails24.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#Registration
	 * SettlementDetails115.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#Registration
	 * SettlementDetails117.Registration}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldIndicator7#Reason
	 * HoldIndicator7.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#Registration
	 * SettlementDetails116.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#Registration
	 * SettlementDetails113.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#Registration
	 * SettlementDetails128.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#Registration
	 * SettlementDetails120.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#Registration
	 * SettlementDetails119.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#Registration
	 * SettlementDetails125.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#Registration
	 * SettlementDetails126.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails27.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails28.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails26.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#Registration
	 * SettlementDetails122.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#Registration
	 * SettlementDetails127.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#Registration
	 * SettlementDetails121.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#Registration
	 * SettlementDetails134.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#Registration
	 * SettlementDetails137.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#Registration
	 * SettlementDetails132.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails30.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#Registration
	 * SettlementDetails138.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#Registration
	 * SettlementDetails130.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails131#Registration
	 * SettlementDetails131.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#Registration
	 * SettlementDetails133.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails29.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31#AdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails31.
	 * AdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#Registration
	 * SettlementDetails139.Registration}</li>
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
	public static final MMBusinessAssociationEnd Registration = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails50.Registration, com.tools20022.repository.msg.PartyTextInformation1.RegistrationDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3.AdditionalPhysicalOrRegistrationDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4.AdditionalPhysicalOrRegistrationDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2.AdditionalPhysicalOrRegistrationDetails, com.tools20022.repository.msg.SettlementDetails51.Registration,
					com.tools20022.repository.msg.PartyTextInformation3.RegistrationDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5.AdditionalPhysicalOrRegistrationDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6.AdditionalPhysicalOrRegistrationDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7.AdditionalPhysicalOrRegistrationDetails, com.tools20022.repository.msg.HoldIndicator2.Reason, com.tools20022.repository.msg.HoldIndicator3.Reason,
					com.tools20022.repository.msg.HoldIndicator4.Reason, com.tools20022.repository.msg.HoldIndicator5.Reason, com.tools20022.repository.msg.SettlementDetails6.Registration,
					com.tools20022.repository.msg.SettlementDetails20.Registration, com.tools20022.repository.msg.SettlementDetails24.Registration, com.tools20022.repository.msg.SettlementDetails33.Registration,
					com.tools20022.repository.msg.SettlementDetails45.Registration, com.tools20022.repository.msg.SettlementDetails54.Registration, com.tools20022.repository.msg.SettlementDetails1.Registration,
					com.tools20022.repository.msg.SettlementDetails19.Registration, com.tools20022.repository.msg.SettlementDetails22.Registration, com.tools20022.repository.msg.SettlementDetails35.Registration,
					com.tools20022.repository.msg.SettlementDetails42.Registration, com.tools20022.repository.msg.SettlementDetails52.Registration,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8.AdditionalPhysicalOrRegistrationDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9.AdditionalPhysicalOrRegistrationDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10.AdditionalPhysicalOrRegistrationDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11.AdditionalPhysicalOrRegistrationDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12.AdditionalPhysicalOrRegistrationDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13.AdditionalPhysicalOrRegistrationDetails, com.tools20022.repository.msg.SettlementDetails8.Registration,
					com.tools20022.repository.msg.SettlementDetails11.Registration, com.tools20022.repository.msg.SettlementDetails23.Registration, com.tools20022.repository.msg.SettlementDetails37.Registration,
					com.tools20022.repository.msg.SettlementDetails44.Registration, com.tools20022.repository.msg.SettlementDetails53.Registration, com.tools20022.repository.msg.SettlementDetails7.Registration,
					com.tools20022.repository.msg.SettlementDetails12.Registration, com.tools20022.repository.msg.SettlementDetails28.Registration, com.tools20022.repository.msg.SettlementDetails38.Registration,
					com.tools20022.repository.msg.SettlementDetails47.Registration, com.tools20022.repository.msg.SettlementDetails56.Registration, com.tools20022.repository.msg.SettlementDetails2.Registration,
					com.tools20022.repository.msg.SettlementDetails13.Registration, com.tools20022.repository.msg.SettlementDetails27.Registration, com.tools20022.repository.msg.SettlementDetails39.Registration,
					com.tools20022.repository.msg.SettlementDetails48.Registration, com.tools20022.repository.msg.SettlementDetails57.Registration, com.tools20022.repository.msg.Order16.AdditionalPhysicalOrRegistrationDetails,
					com.tools20022.repository.msg.Order14.AdditionalPhysicalOrRegistrationDetails, com.tools20022.repository.msg.SettlementDetails43.Registration, com.tools20022.repository.msg.SecuritiesAccount6.RegistrationDetails,
					com.tools20022.repository.msg.SettlementDetails4.Registration, com.tools20022.repository.msg.SettlementDetails5.Registration, com.tools20022.repository.msg.SettlementDetails25.Registration,
					com.tools20022.repository.msg.SettlementDetails26.Registration, com.tools20022.repository.msg.SettlementDetails15.Registration, com.tools20022.repository.msg.SettlementDetails34.Registration,
					com.tools20022.repository.msg.SettlementDetails49.Registration, com.tools20022.repository.msg.SettlementDetails58.Registration, com.tools20022.repository.msg.SettlementDetails36.Registration,
					com.tools20022.repository.msg.SettlementDetails18.Registration, com.tools20022.repository.msg.SettlementDetails66.Registration, com.tools20022.repository.msg.SettlementDetails67.Registration,
					com.tools20022.repository.msg.SettlementDetails70.Registration, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16.AdditionalPhysicalOrRegistrationDetails,
					com.tools20022.repository.msg.SettlementDetails68.Registration, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14.AdditionalPhysicalOrRegistrationDetails,
					com.tools20022.repository.msg.SettlementDetails69.Registration, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15.AdditionalPhysicalOrRegistrationDetails,
					com.tools20022.repository.msg.SettlementDetails75.Registration, com.tools20022.repository.msg.SettlementDetails74.Registration, com.tools20022.repository.msg.Order17.AdditionalPhysicalOrRegistrationDetails,
					com.tools20022.repository.msg.Order18.AdditionalPhysicalOrRegistrationDetails, com.tools20022.repository.msg.SettlementDetails81.Registration, com.tools20022.repository.msg.SettlementDetails80.Registration,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17.AdditionalPhysicalOrRegistrationDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18.AdditionalPhysicalOrRegistrationDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19.AdditionalPhysicalOrRegistrationDetails, com.tools20022.repository.msg.SettlementDetails87.Registration,
					com.tools20022.repository.msg.SettlementDetails83.Registration, com.tools20022.repository.msg.SettlementDetails86.Registration, com.tools20022.repository.msg.SettlementDetails85.Registration,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21.AdditionalPhysicalOrRegistrationDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22.AdditionalPhysicalOrRegistrationDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20.AdditionalPhysicalOrRegistrationDetails, com.tools20022.repository.msg.SettlementDetails93.Registration,
					com.tools20022.repository.msg.SettlementDetails90.Registration, com.tools20022.repository.msg.SettlementDetails99.Registration, com.tools20022.repository.msg.SettlementDetails94.Registration,
					com.tools20022.repository.msg.SettlementDetails100.Registration, com.tools20022.repository.msg.SettlementDetails95.Registration, com.tools20022.repository.msg.SettlementDetails91.Registration,
					com.tools20022.repository.msg.SettlementDetails92.Registration, com.tools20022.repository.msg.HoldIndicator6.Reason, com.tools20022.repository.msg.SettlementDetails101.Registration,
					com.tools20022.repository.msg.SettlementDetails111.Registration, com.tools20022.repository.msg.SettlementDetails112.Registration, com.tools20022.repository.msg.SettlementDetails110.Registration,
					com.tools20022.repository.msg.SettlementDetails108.Registration, com.tools20022.repository.msg.SettlementDetails103.Registration,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23.AdditionalPhysicalOrRegistrationDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25.AdditionalPhysicalOrRegistrationDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24.AdditionalPhysicalOrRegistrationDetails, com.tools20022.repository.msg.SettlementDetails115.Registration,
					com.tools20022.repository.msg.SettlementDetails117.Registration, com.tools20022.repository.msg.HoldIndicator7.Reason, com.tools20022.repository.msg.SettlementDetails116.Registration,
					com.tools20022.repository.msg.SettlementDetails113.Registration, com.tools20022.repository.msg.SettlementDetails128.Registration, com.tools20022.repository.msg.SettlementDetails120.Registration,
					com.tools20022.repository.msg.SettlementDetails119.Registration, com.tools20022.repository.msg.SettlementDetails125.Registration, com.tools20022.repository.msg.SettlementDetails126.Registration,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27.AdditionalPhysicalOrRegistrationDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28.AdditionalPhysicalOrRegistrationDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26.AdditionalPhysicalOrRegistrationDetails, com.tools20022.repository.msg.SettlementDetails122.Registration,
					com.tools20022.repository.msg.SettlementDetails127.Registration, com.tools20022.repository.msg.SettlementDetails121.Registration, com.tools20022.repository.msg.SettlementDetails134.Registration,
					com.tools20022.repository.msg.SettlementDetails137.Registration, com.tools20022.repository.msg.SettlementDetails132.Registration,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30.AdditionalPhysicalOrRegistrationDetails, com.tools20022.repository.msg.SettlementDetails138.Registration,
					com.tools20022.repository.msg.SettlementDetails130.Registration, com.tools20022.repository.msg.SettlementDetails131.Registration, com.tools20022.repository.msg.SettlementDetails133.Registration,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29.AdditionalPhysicalOrRegistrationDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31.AdditionalPhysicalOrRegistrationDetails, com.tools20022.repository.msg.SettlementDetails139.Registration);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Registration";
			definition = "Information related to registration of securities.";
			minOccurs = 0;
			type_lazy = () -> BasicSecuritiesRegistration.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Regulatory restriction(s) linked to the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#Security
	 * SecuritiesRestriction.Security}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#LegalRestrictions
	 * SettlementDetails50.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#LegalRestrictions
	 * SettlementDetails51.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative5#SecurityRestriction
	 * CorporateActionNarrative5.SecurityRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative15#SecurityRestriction
	 * CorporateActionNarrative15.SecurityRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative20#SecurityRestriction
	 * CorporateActionNarrative20.SecurityRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative22#SecurityRestriction
	 * CorporateActionNarrative22.SecurityRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#LegalRestrictions
	 * SettlementDetails9.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#LegalRestrictions
	 * SettlementDetails17.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#LegalRestrictions
	 * SettlementDetails30.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#LegalRestrictions
	 * SettlementDetails32.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#LegalRestrictions
	 * SettlementDetails60.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#LegalRestrictions
	 * SettlementDetails64.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#LegalRestrictions
	 * SettlementDetails3.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#LegalRestrictions
	 * SettlementDetails16.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#LegalRestrictions
	 * SettlementDetails31.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#LegalRestrictions
	 * SettlementDetails40.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#LegalRestrictions
	 * SettlementDetails62.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#LegalRestrictions
	 * SettlementDetails63.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#LegalRestrictions
	 * SettlementDetails6.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#LegalRestrictions
	 * SettlementDetails20.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#LegalRestrictions
	 * SettlementDetails24.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#LegalRestrictions
	 * SettlementDetails33.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#LegalRestrictions
	 * SettlementDetails45.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#LegalRestrictions
	 * SettlementDetails54.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#LegalRestrictions
	 * SettlementDetails1.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#LegalRestrictions
	 * SettlementDetails19.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#LegalRestrictions
	 * SettlementDetails22.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#LegalRestrictions
	 * SettlementDetails35.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#LegalRestrictions
	 * SettlementDetails42.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#LegalRestrictions
	 * SettlementDetails52.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#LegalRestrictions
	 * SettlementDetails8.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#LegalRestrictions
	 * SettlementDetails11.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#LegalRestrictions
	 * SettlementDetails23.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#LegalRestrictions
	 * SettlementDetails37.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#LegalRestrictions
	 * SettlementDetails44.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#LegalRestrictions
	 * SettlementDetails53.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#LegalRestrictions
	 * SettlementDetails7.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#LegalRestrictions
	 * SettlementDetails12.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#LegalRestrictions
	 * SettlementDetails28.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#LegalRestrictions
	 * SettlementDetails38.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#LegalRestrictions
	 * SettlementDetails47.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#LegalRestrictions
	 * SettlementDetails56.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#LegalRestrictions
	 * SettlementDetails2.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#LegalRestrictions
	 * SettlementDetails13.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#LegalRestrictions
	 * SettlementDetails27.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#LegalRestrictions
	 * SettlementDetails39.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#LegalRestrictions
	 * SettlementDetails48.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#LegalRestrictions
	 * SettlementDetails57.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#LegalRestrictions
	 * SettlementDetails43.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails4#LegalRestrictions
	 * SettlementDetails4.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#LegalRestrictions
	 * SettlementDetails10.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#LegalRestrictions
	 * SettlementDetails29.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#LegalRestrictions
	 * SettlementDetails5.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#LegalRestrictions
	 * SettlementDetails26.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#LegalRestrictions
	 * SettlementDetails65.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#LegalRestrictions
	 * SettlementDetails14.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#LegalRestrictions
	 * SettlementDetails41.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#LegalRestrictions
	 * SettlementDetails61.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#LegalRestrictions
	 * SettlementDetails59.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#LegalRestrictions
	 * SettlementDetails15.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#LegalRestrictions
	 * SettlementDetails36.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails18#LegalRestrictions
	 * SettlementDetails18.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#LegalRestrictions
	 * SettlementDetails66.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#LegalRestrictions
	 * CommonFinancialInstrumentAttributes1.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#LegalRestrictions
	 * SettlementDetails67.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#LegalRestrictions
	 * SettlementDetails70.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#LegalRestrictions
	 * SettlementDetails68.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#LegalRestrictions
	 * SettlementDetails69.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#LegalRestrictions
	 * SettlementDetails71.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#LegalRestrictions
	 * SettlementDetails72.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#LegalRestrictions
	 * SettlementDetails75.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#LegalRestrictions
	 * SettlementDetails73.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#LegalRestrictions
	 * SettlementDetails74.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#LegalRestrictions
	 * SettlementDetails81.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#LegalRestrictions
	 * SettlementDetails76.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#LegalRestrictions
	 * SettlementDetails80.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#LegalRestrictions
	 * SettlementDetails78.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#LegalRestrictions
	 * SettlementDetails77.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#LegalRestrictions
	 * SettlementDetails79.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#LegalRestrictions
	 * SettlementDetails87.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#LegalRestrictions
	 * SettlementDetails83.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#LegalRestrictions
	 * SettlementDetails86.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#LegalRestrictions
	 * SettlementDetails85.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#LegalRestrictions
	 * SettlementDetails93.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#LegalRestrictions
	 * SettlementDetails90.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#LegalRestrictions
	 * SettlementDetails96.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#LegalRestrictions
	 * SettlementDetails97.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#LegalRestrictions
	 * SettlementDetails94.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails100#LegalRestrictions
	 * SettlementDetails100.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#LegalRestrictions
	 * SettlementDetails95.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#LegalRestrictions
	 * SettlementDetails91.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#LegalRestrictions
	 * SettlementDetails92.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#LegalRestrictions
	 * SettlementDetails98.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative29#SecurityRestriction
	 * CorporateActionNarrative29.SecurityRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#LegalRestrictions
	 * SettlementDetails101.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative36#SecurityRestriction
	 * CorporateActionNarrative36.SecurityRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#LegalRestrictions
	 * SettlementDetails105.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#LegalRestrictions
	 * SettlementDetails106.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#LegalRestrictions
	 * SettlementDetails104.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#LegalRestrictions
	 * SettlementDetails111.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#LegalRestrictions
	 * SettlementDetails112.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#LegalRestrictions
	 * SettlementDetails110.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails103#LegalRestrictions
	 * SettlementDetails103.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#LegalRestrictions
	 * SettlementDetails107.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#LegalRestrictions
	 * SettlementDetails115.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#LegalRestrictions
	 * SettlementDetails117.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#LegalRestrictions
	 * SettlementDetails116.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#LegalRestrictions
	 * SettlementDetails113.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#LegalRestrictions
	 * SettlementDetails128.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#LegalRestrictions
	 * SettlementDetails120.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#LegalRestrictions
	 * SettlementDetails119.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#LegalRestrictions
	 * SettlementDetails126.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#LegalRestrictions
	 * SettlementDetails122.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#LegalRestrictions
	 * SettlementDetails127.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#LegalRestrictions
	 * SettlementDetails121.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#LegalRestrictions
	 * SettlementDetails134.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#LegalRestrictions
	 * SettlementDetails137.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#LegalRestrictions
	 * SettlementDetails132.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#LegalRestrictions
	 * SettlementDetails138.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#LegalRestrictions
	 * SettlementDetails130.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#LegalRestrictions
	 * SettlementDetails133.LegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#LegalRestrictions
	 * SettlementDetails139.LegalRestrictions}</li>
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
	public static final MMBusinessAssociationEnd Restriction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails50.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails51.LegalRestrictions,
					com.tools20022.repository.msg.CorporateActionNarrative5.SecurityRestriction, com.tools20022.repository.msg.CorporateActionNarrative15.SecurityRestriction,
					com.tools20022.repository.msg.CorporateActionNarrative20.SecurityRestriction, com.tools20022.repository.msg.CorporateActionNarrative22.SecurityRestriction,
					com.tools20022.repository.msg.SettlementDetails9.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails17.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails30.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails32.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails60.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails64.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails3.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails16.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails31.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails40.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails62.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails63.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails6.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails20.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails24.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails33.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails45.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails54.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails1.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails19.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails22.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails35.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails42.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails52.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails8.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails11.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails23.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails37.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails44.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails53.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails7.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails12.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails28.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails38.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails47.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails56.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails2.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails13.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails27.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails39.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails48.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails57.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails43.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails4.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails10.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails29.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails5.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails26.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails65.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails14.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails41.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails61.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails59.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails15.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails36.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails18.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails66.LegalRestrictions,
					com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails67.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails70.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails68.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails69.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails71.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails72.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails75.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails73.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails74.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails81.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails76.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails80.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails78.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails77.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails79.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails87.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails83.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails86.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails85.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails93.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails90.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails96.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails97.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails94.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails100.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails95.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails91.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails92.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails98.LegalRestrictions, com.tools20022.repository.msg.CorporateActionNarrative29.SecurityRestriction, com.tools20022.repository.msg.SettlementDetails101.LegalRestrictions,
					com.tools20022.repository.msg.CorporateActionNarrative36.SecurityRestriction, com.tools20022.repository.msg.SettlementDetails105.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails106.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails104.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails111.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails112.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails110.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails103.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails107.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails115.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails117.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails116.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails113.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails128.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails120.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails119.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails126.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails122.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails127.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails121.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails134.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails137.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails132.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails138.LegalRestrictions,
					com.tools20022.repository.msg.SettlementDetails130.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails133.LegalRestrictions, com.tools20022.repository.msg.SettlementDetails139.LegalRestrictions);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Restriction";
			definition = "Regulatory restriction(s) linked to the security.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesRestriction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesRestriction.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate event linked to the security
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#UnderlyingSecurity
	 * CorporateActionEvent.UnderlyingSecurity}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification6#CorporateActionEventAndBalance
	 * AccountIdentification6.CorporateActionEventAndBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification12#CorporateActionEventAndBalance
	 * AccountIdentification12.CorporateActionEventAndBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification16#CorporateActionEventAndBalance
	 * AccountIdentification16.CorporateActionEventAndBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification22#CorporateActionEventAndBalance
	 * AccountIdentification22.CorporateActionEventAndBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification23#CorporateActionEventAndBalance
	 * AccountIdentification23.CorporateActionEventAndBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification24#CorporateActionEventAndBalance
	 * AccountIdentification24.CorporateActionEventAndBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification25#CorporateActionEventAndBalance
	 * AccountIdentification25.CorporateActionEventAndBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification29#CorporateActionEventAndBalance
	 * AccountIdentification29.CorporateActionEventAndBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails2#CorporateActionEventType
	 * IntraPositionDetails2.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails8#CorporateActionEventType
	 * IntraPositionDetails8.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails12#CorporateActionEventType
	 * IntraPositionDetails12.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails13#CorporateActionEventType
	 * IntraPositionDetails13.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails22#CorporateActionEventType
	 * IntraPositionDetails22.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails26#CorporateActionEventType
	 * IntraPositionDetails26.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#CorporateActionEventType
	 * IntraPositionDetails27.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails29#CorporateActionEventType
	 * IntraPositionDetails29.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#CorporateAction
	 * EntryTransaction1.CorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#CorporateAction
	 * EntryTransaction2.CorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#CorporateAction
	 * EntryTransaction3.CorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#CorporateAction
	 * EntryTransaction4.CorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#CorporateAction
	 * EntryTransaction7.CorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#CorporateActionEventType
	 * IntraPositionDetails34.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#CorporateAction
	 * EntryTransaction8.CorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification33#CorporateActionEventAndBalance
	 * AccountIdentification33.CorporateActionEventAndBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification35#CorporateActionEventAndBalance
	 * AccountIdentification35.CorporateActionEventAndBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails35#CorporateActionEventType
	 * IntraPositionDetails35.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification40#CorporateActionEventAndBalance
	 * AccountIdentification40.CorporateActionEventAndBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#CorporateActionEventType
	 * IntraPositionDetails41.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails43#CorporateActionEventType
	 * IntraPositionDetails43.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification41#CorporateActionEventAndBalance
	 * AccountIdentification41.CorporateActionEventAndBalance}</li>
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
	public static final MMBusinessAssociationEnd CorporateEvent = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountIdentification6.CorporateActionEventAndBalance, com.tools20022.repository.msg.AccountIdentification12.CorporateActionEventAndBalance,
					com.tools20022.repository.msg.AccountIdentification16.CorporateActionEventAndBalance, com.tools20022.repository.msg.AccountIdentification22.CorporateActionEventAndBalance,
					com.tools20022.repository.msg.AccountIdentification23.CorporateActionEventAndBalance, com.tools20022.repository.msg.AccountIdentification24.CorporateActionEventAndBalance,
					com.tools20022.repository.msg.AccountIdentification25.CorporateActionEventAndBalance, com.tools20022.repository.msg.AccountIdentification29.CorporateActionEventAndBalance,
					com.tools20022.repository.msg.IntraPositionDetails2.CorporateActionEventType, com.tools20022.repository.msg.IntraPositionDetails8.CorporateActionEventType,
					com.tools20022.repository.msg.IntraPositionDetails12.CorporateActionEventType, com.tools20022.repository.msg.IntraPositionDetails13.CorporateActionEventType,
					com.tools20022.repository.msg.IntraPositionDetails22.CorporateActionEventType, com.tools20022.repository.msg.IntraPositionDetails26.CorporateActionEventType,
					com.tools20022.repository.msg.IntraPositionDetails27.CorporateActionEventType, com.tools20022.repository.msg.IntraPositionDetails29.CorporateActionEventType,
					com.tools20022.repository.msg.EntryTransaction1.CorporateAction, com.tools20022.repository.msg.EntryTransaction2.CorporateAction, com.tools20022.repository.msg.EntryTransaction3.CorporateAction,
					com.tools20022.repository.msg.EntryTransaction4.CorporateAction, com.tools20022.repository.msg.EntryTransaction7.CorporateAction, com.tools20022.repository.msg.IntraPositionDetails34.CorporateActionEventType,
					com.tools20022.repository.msg.EntryTransaction8.CorporateAction, com.tools20022.repository.msg.AccountIdentification33.CorporateActionEventAndBalance,
					com.tools20022.repository.msg.AccountIdentification35.CorporateActionEventAndBalance, com.tools20022.repository.msg.IntraPositionDetails35.CorporateActionEventType,
					com.tools20022.repository.msg.AccountIdentification40.CorporateActionEventAndBalance, com.tools20022.repository.msg.IntraPositionDetails41.CorporateActionEventType,
					com.tools20022.repository.msg.IntraPositionDetails43.CorporateActionEventType, com.tools20022.repository.msg.AccountIdentification41.CorporateActionEventAndBalance);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateEvent";
			definition = "Corporate event linked to the security";
			minOccurs = 0;
			type_lazy = () -> CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.UnderlyingSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies that the security is a temporary security.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator1Choice#TemporaryIndicator
	 * TemporaryFinancialInstrumentIndicator1Choice.TemporaryIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator1Choice#Proprietary
	 * TemporaryFinancialInstrumentIndicator1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption3#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption3.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator2Choice#TemporaryIndicator
	 * TemporaryFinancialInstrumentIndicator2Choice.TemporaryIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator2Choice#Proprietary
	 * TemporaryFinancialInstrumentIndicator2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption8#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption8.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption18#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption18.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption20#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption20.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption26#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption26.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption31#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption31.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption35#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption35.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption36#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption36.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption4#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption4.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption10#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption10.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption13#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption13.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption17#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption17.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption24.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption29#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption29.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption33.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption38#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption38.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption37#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption37.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption39#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption39.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption6#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption6.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption12#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption12.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption14#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption14.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption22#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption22.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption25#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption25.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption30.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#TemporaryFinancialInstrumentIndicator
	 * SecurityOption1.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption42#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption42.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption40#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption40.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption48#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption48.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption45#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption45.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption49.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator3Choice#TemporaryIndicator
	 * TemporaryFinancialInstrumentIndicator3Choice.TemporaryIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator3Choice#Proprietary
	 * TemporaryFinancialInstrumentIndicator3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption50.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption55.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption57.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator4Choice#TemporaryIndicator
	 * TemporaryFinancialInstrumentIndicator4Choice.TemporaryIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator4Choice#Proprietary
	 * TemporaryFinancialInstrumentIndicator4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption60.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption59.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption61.TemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63#TemporaryFinancialInstrumentIndicator
	 * SecuritiesOption63.TemporaryFinancialInstrumentIndicator}</li>
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
	public static final MMBusinessAttribute TemporaryFinancialInstrumentIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator1Choice.TemporaryIndicator, com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator1Choice.Proprietary,
					com.tools20022.repository.msg.SecuritiesOption3.TemporaryFinancialInstrumentIndicator, com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator2Choice.TemporaryIndicator,
					com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator2Choice.Proprietary, com.tools20022.repository.msg.SecuritiesOption8.TemporaryFinancialInstrumentIndicator,
					com.tools20022.repository.msg.SecuritiesOption18.TemporaryFinancialInstrumentIndicator, com.tools20022.repository.msg.SecuritiesOption20.TemporaryFinancialInstrumentIndicator,
					com.tools20022.repository.msg.SecuritiesOption26.TemporaryFinancialInstrumentIndicator, com.tools20022.repository.msg.SecuritiesOption31.TemporaryFinancialInstrumentIndicator,
					com.tools20022.repository.msg.SecuritiesOption35.TemporaryFinancialInstrumentIndicator, com.tools20022.repository.msg.SecuritiesOption36.TemporaryFinancialInstrumentIndicator,
					com.tools20022.repository.msg.SecuritiesOption4.TemporaryFinancialInstrumentIndicator, com.tools20022.repository.msg.SecuritiesOption10.TemporaryFinancialInstrumentIndicator,
					com.tools20022.repository.msg.SecuritiesOption13.TemporaryFinancialInstrumentIndicator, com.tools20022.repository.msg.SecuritiesOption17.TemporaryFinancialInstrumentIndicator,
					com.tools20022.repository.msg.SecuritiesOption24.TemporaryFinancialInstrumentIndicator, com.tools20022.repository.msg.SecuritiesOption29.TemporaryFinancialInstrumentIndicator,
					com.tools20022.repository.msg.SecuritiesOption33.TemporaryFinancialInstrumentIndicator, com.tools20022.repository.msg.SecuritiesOption38.TemporaryFinancialInstrumentIndicator,
					com.tools20022.repository.msg.SecuritiesOption37.TemporaryFinancialInstrumentIndicator, com.tools20022.repository.msg.SecuritiesOption39.TemporaryFinancialInstrumentIndicator,
					com.tools20022.repository.msg.SecuritiesOption6.TemporaryFinancialInstrumentIndicator, com.tools20022.repository.msg.SecuritiesOption12.TemporaryFinancialInstrumentIndicator,
					com.tools20022.repository.msg.SecuritiesOption14.TemporaryFinancialInstrumentIndicator, com.tools20022.repository.msg.SecuritiesOption22.TemporaryFinancialInstrumentIndicator,
					com.tools20022.repository.msg.SecuritiesOption25.TemporaryFinancialInstrumentIndicator, com.tools20022.repository.msg.SecuritiesOption30.TemporaryFinancialInstrumentIndicator,
					com.tools20022.repository.msg.SecurityOption1.TemporaryFinancialInstrumentIndicator, com.tools20022.repository.msg.SecuritiesOption42.TemporaryFinancialInstrumentIndicator,
					com.tools20022.repository.msg.SecuritiesOption40.TemporaryFinancialInstrumentIndicator, com.tools20022.repository.msg.SecuritiesOption48.TemporaryFinancialInstrumentIndicator,
					com.tools20022.repository.msg.SecuritiesOption45.TemporaryFinancialInstrumentIndicator, com.tools20022.repository.msg.SecuritiesOption49.TemporaryFinancialInstrumentIndicator,
					com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator3Choice.TemporaryIndicator, com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator3Choice.Proprietary,
					com.tools20022.repository.msg.SecuritiesOption50.TemporaryFinancialInstrumentIndicator, com.tools20022.repository.msg.SecuritiesOption55.TemporaryFinancialInstrumentIndicator,
					com.tools20022.repository.msg.SecuritiesOption57.TemporaryFinancialInstrumentIndicator, com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator4Choice.TemporaryIndicator,
					com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator4Choice.Proprietary, com.tools20022.repository.msg.SecuritiesOption60.TemporaryFinancialInstrumentIndicator,
					com.tools20022.repository.msg.SecuritiesOption59.TemporaryFinancialInstrumentIndicator, com.tools20022.repository.msg.SecuritiesOption61.TemporaryFinancialInstrumentIndicator,
					com.tools20022.repository.msg.SecuritiesOption63.TemporaryFinancialInstrumentIndicator);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TemporaryFinancialInstrumentIndicator";
			definition = "Specifies that the security is a temporary security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Date on which securities become available for sale.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecurityDate1#AvailableDate
	 * SecurityDate1.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate3#AvailableDate
	 * SecurityDate3.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate6#AvailableDate
	 * SecurityDate6.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate7#AvailableDate
	 * SecurityDate7.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate2#AvailableDate
	 * SecurityDate2.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate4#AvailableDate
	 * SecurityDate4.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate5#AvailableDate
	 * SecurityDate5.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate8#AvailableDate
	 * SecurityDate8.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate9#AvailableDate
	 * SecurityDate9.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate10#AvailableDate
	 * SecurityDate10.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails2#AvailableDate
	 * IntraPositionDetails2.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails8#AvailableDate
	 * IntraPositionDetails8.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails12#AvailableDate
	 * IntraPositionDetails12.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails13#AvailableDate
	 * IntraPositionDetails13.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails22#AvailableDate
	 * IntraPositionDetails22.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails26#AvailableDate
	 * IntraPositionDetails26.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#AvailableDate
	 * IntraPositionDetails27.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails29#AvailableDate
	 * IntraPositionDetails29.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails1#AvailableDate
	 * IntraPositionMovementDetails1.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails2#AvailableDate
	 * IntraPositionMovementDetails2.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails5#AvailableDate
	 * IntraPositionMovementDetails5.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#AvailableDate
	 * IntraPositionMovementDetails6.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails7#AvailableDate
	 * IntraPositionMovementDetails7.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails8#AvailableDate
	 * IntraPositionMovementDetails8.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails9#AvailableDate
	 * IntraPositionMovementDetails9.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails10#AvailableDate
	 * IntraPositionMovementDetails10.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3#AvailableDate
	 * CorporateActionDate3.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails3#AvailableDate
	 * IntraPositionMovementDetails3.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails4#AvailableDate
	 * IntraPositionMovementDetails4.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#AvailableDate
	 * IntraPositionDetails34.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails11#AvailableDate
	 * IntraPositionMovementDetails11.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate12#AvailableDate
	 * SecurityDate12.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate11#AvailableDate
	 * SecurityDate11.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate14#AvailableDate
	 * SecurityDate14.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate13#AvailableDate
	 * SecurityDate13.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails35#AvailableDate
	 * IntraPositionDetails35.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails12#AvailableDate
	 * IntraPositionMovementDetails12.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#AvailableDate
	 * IntraPositionDetails41.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13#AvailableDate
	 * IntraPositionMovementDetails13.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails43#AvailableDate
	 * IntraPositionDetails43.AvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails14#AvailableDate
	 * IntraPositionMovementDetails14.AvailableDate}</li>
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
	public static final MMBusinessAttribute AvailableDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityDate1.AvailableDate, com.tools20022.repository.msg.SecurityDate3.AvailableDate, com.tools20022.repository.msg.SecurityDate6.AvailableDate,
					com.tools20022.repository.msg.SecurityDate7.AvailableDate, com.tools20022.repository.msg.SecurityDate2.AvailableDate, com.tools20022.repository.msg.SecurityDate4.AvailableDate,
					com.tools20022.repository.msg.SecurityDate5.AvailableDate, com.tools20022.repository.msg.SecurityDate8.AvailableDate, com.tools20022.repository.msg.SecurityDate9.AvailableDate,
					com.tools20022.repository.msg.SecurityDate10.AvailableDate, com.tools20022.repository.msg.IntraPositionDetails2.AvailableDate, com.tools20022.repository.msg.IntraPositionDetails8.AvailableDate,
					com.tools20022.repository.msg.IntraPositionDetails12.AvailableDate, com.tools20022.repository.msg.IntraPositionDetails13.AvailableDate, com.tools20022.repository.msg.IntraPositionDetails22.AvailableDate,
					com.tools20022.repository.msg.IntraPositionDetails26.AvailableDate, com.tools20022.repository.msg.IntraPositionDetails27.AvailableDate, com.tools20022.repository.msg.IntraPositionDetails29.AvailableDate,
					com.tools20022.repository.msg.IntraPositionMovementDetails1.AvailableDate, com.tools20022.repository.msg.IntraPositionMovementDetails2.AvailableDate,
					com.tools20022.repository.msg.IntraPositionMovementDetails5.AvailableDate, com.tools20022.repository.msg.IntraPositionMovementDetails6.AvailableDate,
					com.tools20022.repository.msg.IntraPositionMovementDetails7.AvailableDate, com.tools20022.repository.msg.IntraPositionMovementDetails8.AvailableDate,
					com.tools20022.repository.msg.IntraPositionMovementDetails9.AvailableDate, com.tools20022.repository.msg.IntraPositionMovementDetails10.AvailableDate, com.tools20022.repository.msg.CorporateActionDate3.AvailableDate,
					com.tools20022.repository.msg.IntraPositionMovementDetails3.AvailableDate, com.tools20022.repository.msg.IntraPositionMovementDetails4.AvailableDate, com.tools20022.repository.msg.IntraPositionDetails34.AvailableDate,
					com.tools20022.repository.msg.IntraPositionMovementDetails11.AvailableDate, com.tools20022.repository.msg.SecurityDate12.AvailableDate, com.tools20022.repository.msg.SecurityDate11.AvailableDate,
					com.tools20022.repository.msg.SecurityDate14.AvailableDate, com.tools20022.repository.msg.SecurityDate13.AvailableDate, com.tools20022.repository.msg.IntraPositionDetails35.AvailableDate,
					com.tools20022.repository.msg.IntraPositionMovementDetails12.AvailableDate, com.tools20022.repository.msg.IntraPositionDetails41.AvailableDate, com.tools20022.repository.msg.IntraPositionMovementDetails13.AvailableDate,
					com.tools20022.repository.msg.IntraPositionDetails43.AvailableDate, com.tools20022.repository.msg.IntraPositionMovementDetails14.AvailableDate);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AvailableDate";
			definition = "Date on which securities become available for sale.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Provides declaration details narrative relative to the financial
	 * instrument, eg, beneficial ownership.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative4#DeclarationDetails
	 * CorporateActionNarrative4.DeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14#DeclarationDetails
	 * CorporateActionNarrative14.DeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative6#DeclarationDetails
	 * CorporateActionNarrative6.DeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative16#DeclarationDetails
	 * CorporateActionNarrative16.DeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative11#DeclarationDetails
	 * CorporateActionNarrative11.DeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17#DeclarationDetails
	 * CorporateActionNarrative17.DeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative2#DeclarationDetails
	 * CorporateActionNarrative2.DeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#DeclarationDetails
	 * BeneficialOwner1.DeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#DeclarationDetails
	 * BeneficialOwner2.DeclarationDetails}</li>
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
	public static final MMBusinessAttribute DeclarationDetails = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNarrative4.DeclarationDetails, com.tools20022.repository.msg.CorporateActionNarrative14.DeclarationDetails,
					com.tools20022.repository.msg.CorporateActionNarrative6.DeclarationDetails, com.tools20022.repository.msg.CorporateActionNarrative16.DeclarationDetails,
					com.tools20022.repository.msg.CorporateActionNarrative11.DeclarationDetails, com.tools20022.repository.msg.CorporateActionNarrative17.DeclarationDetails,
					com.tools20022.repository.msg.CorporateActionNarrative2.DeclarationDetails, com.tools20022.repository.msg.BeneficialOwner1.DeclarationDetails, com.tools20022.repository.msg.BeneficialOwner2.DeclarationDetails);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeclarationDetails";
			definition = "Provides declaration details narrative relative to the financial instrument, eg, beneficial ownership.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Spread that uses the security as benchmark reference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Spread#BenchmarkSecurity
	 * Spread.BenchmarkSecurity}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3#Spread
	 * CorporateActionRate3.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate14#Spread
	 * CorporateActionRate14.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate16#Spread
	 * CorporateActionRate16.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate24#Spread
	 * CorporateActionRate24.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate27#Spread
	 * CorporateActionRate27.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate32#Spread
	 * CorporateActionRate32.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate35#Spread
	 * CorporateActionRate35.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate41#Spread
	 * CorporateActionRate41.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate1#Spread
	 * CorporateActionRate1.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate43#Spread
	 * CorporateActionRate43.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate56#Spread
	 * CorporateActionRate56.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#Spread
	 * CorporateActionRate66.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate78#Spread
	 * CorporateActionRate78.Spread}</li>
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
	public static final MMBusinessAssociationEnd Spread = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate3.Spread, com.tools20022.repository.msg.CorporateActionRate14.Spread, com.tools20022.repository.msg.CorporateActionRate16.Spread,
					com.tools20022.repository.msg.CorporateActionRate24.Spread, com.tools20022.repository.msg.CorporateActionRate27.Spread, com.tools20022.repository.msg.CorporateActionRate32.Spread,
					com.tools20022.repository.msg.CorporateActionRate35.Spread, com.tools20022.repository.msg.CorporateActionRate41.Spread, com.tools20022.repository.msg.CorporateActionRate1.Spread,
					com.tools20022.repository.msg.CorporateActionRate43.Spread, com.tools20022.repository.msg.CorporateActionRate56.Spread, com.tools20022.repository.msg.CorporateActionRate66.Spread,
					com.tools20022.repository.msg.CorporateActionRate78.Spread);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Spread that uses the security as benchmark reference.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.BenchmarkSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Dividend per financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#Security
	 * Dividend.Security}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#DividendType
	 * CorporateAction3.DividendType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#DividendType
	 * CorporateAction4.DividendType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#DividendType
	 * CorporateAction7.DividendType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#DividendType
	 * CorporateAction8.DividendType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#DividendType
	 * CorporateAction10.DividendType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#DividendType
	 * CorporateAction11.DividendType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#DividendType
	 * CorporateAction2.DividendType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#DividendType
	 * CorporateAction12.DividendType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#DividendType
	 * CorporateAction17.DividendType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD13#DividendType
	 * CorporateActionSD13.DividendType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#DividendType
	 * CorporateAction31.DividendType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#DividendType
	 * CorporateAction40.DividendType}</li>
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
	public static final MMBusinessAssociationEnd Dividend = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateAction3.DividendType, com.tools20022.repository.msg.CorporateAction4.DividendType, com.tools20022.repository.msg.CorporateAction7.DividendType,
					com.tools20022.repository.msg.CorporateAction8.DividendType, com.tools20022.repository.msg.CorporateAction10.DividendType, com.tools20022.repository.msg.CorporateAction11.DividendType,
					com.tools20022.repository.msg.CorporateAction2.DividendType, com.tools20022.repository.msg.CorporateAction12.DividendType, com.tools20022.repository.msg.CorporateAction17.DividendType,
					com.tools20022.repository.msg.CorporateActionSD13.DividendType, com.tools20022.repository.msg.CorporateAction31.DividendType, com.tools20022.repository.msg.CorporateAction40.DividendType);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Dividend per financial instrument.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Balance of the account which holds a specific security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#Security
	 * SecuritiesBalance.Security}</li>
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
	public static final MMBusinessAssociationEnd Balance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Balance of the account which holds a specific security.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether a security is interchangeable, ie, the security is
	 * allowed to be replaced by another security, without loss of value.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount1#FungibleIndicator
	 * SafekeepingAccount1.FungibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification2#FungibleIndicator
	 * SubAccountIdentification2.FungibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount2#FungibleIndicator
	 * SafekeepingAccount2.FungibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification3#FungibleIndicator
	 * SubAccountIdentification3.FungibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification1#FungibleIndicator
	 * SubAccountIdentification1.FungibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification5#FungibleIndicator
	 * SubAccountIdentification5.FungibleIndicator}</li>
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
	public static final MMBusinessAttribute FungibleIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SafekeepingAccount1.FungibleIndicator, com.tools20022.repository.msg.SubAccountIdentification2.FungibleIndicator,
					com.tools20022.repository.msg.SafekeepingAccount2.FungibleIndicator, com.tools20022.repository.msg.SubAccountIdentification3.FungibleIndicator, com.tools20022.repository.msg.SubAccountIdentification1.FungibleIndicator,
					com.tools20022.repository.msg.SubAccountIdentification5.FungibleIndicator);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FungibleIndicator";
			definition = "Indicates whether a security is interchangeable, ie, the security is allowed to be replaced by another security, without loss of value.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the deliverability of a security.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#Appearance
	 * FinancialInstrumentAttributes1.Appearance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#Appearance
	 * FutureOrOptionDetails1.Appearance}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Appearance2Choice#Code
	 * Appearance2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Appearance2Choice#Proprietary
	 * Appearance2Choice.Proprietary}</li>
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
	public static final MMBusinessAttribute Appearance = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes1.Appearance, com.tools20022.repository.msg.FutureOrOptionDetails1.Appearance,
					com.tools20022.repository.choice.Appearance2Choice.Code, com.tools20022.repository.choice.Appearance2Choice.Proprietary);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Appearance";
			definition = "Specifies the deliverability of a security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AppearanceCode.mmObject();
		}
	};
	/**
	 * Position limit in the near-term contract for a given exchange-traded
	 * product.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#NTPositionLimit
	 * FinancialInstrumentAttributes1.NTPositionLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#NearTermPositionLimit
	 * FutureOrOptionDetails1.NearTermPositionLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#NearTermPositionLimit
	 * CommonFinancialInstrumentAttributes1.NearTermPositionLimit}</li>
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
	public static final MMBusinessAttribute NearTermPositionLimit = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes1.NTPositionLimit, com.tools20022.repository.msg.FutureOrOptionDetails1.NearTermPositionLimit,
					com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1.NearTermPositionLimit);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NearTermPositionLimit";
			definition = "Position limit in the near-term contract for a given exchange-traded product.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Specifies when the contract (i.e. MBS/TBA) will settle.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#ContractSettlementMonth
	 * FinancialInstrumentAttributes1.ContractSettlementMonth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#ContractSettlementMonth
	 * FutureOrOptionDetails1.ContractSettlementMonth}</li>
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
	 * name} = "ContractSettlementMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies when the contract (i.e. MBS/TBA) will settle."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ContractSettlementMonth = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes1.ContractSettlementMonth, com.tools20022.repository.msg.FutureOrOptionDetails1.ContractSettlementMonth);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContractSettlementMonth";
			definition = "Specifies when the contract (i.e. MBS/TBA) will settle.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}
	};
	/**
	 * Minimum price increase for a given exchange-traded Instrument
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#MinimumTradingPricingIncrement
	 * FinancialInstrumentAttributes1.MinimumTradingPricingIncrement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#MinimumTradingPricingIncrement
	 * FutureOrOptionDetails1.MinimumTradingPricingIncrement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingParameters1#MinimumTradingPricingIncrement
	 * TradingParameters1.MinimumTradingPricingIncrement}</li>
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
	public static final MMBusinessAttribute MinimumTradingPricingIncrement = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes1.MinimumTradingPricingIncrement, com.tools20022.repository.msg.FutureOrOptionDetails1.MinimumTradingPricingIncrement,
					com.tools20022.repository.msg.TradingParameters1.MinimumTradingPricingIncrement);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumTradingPricingIncrement";
			definition = "Minimum price increase for a given exchange-traded Instrument";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Rating(s) of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Rating#Security
	 * Rating.Security}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#Rating
	 * FinancialInstrumentAttributes1.Rating}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#Rating
	 * FinancialInstrumentStipulations.Rating}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#Rating
	 * FinancialInstrumentAttributes31.Rating}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#Rating
	 * FinancialInstrumentStipulations2.Rating}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#Rating
	 * FutureOrOptionDetails1.Rating}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#Rating
	 * FinancialInstrumentAttributes44.Rating}</li>
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
	public static final MMBusinessAssociationEnd Rating = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes1.Rating, com.tools20022.repository.msg.FinancialInstrumentStipulations.Rating,
					com.tools20022.repository.msg.FinancialInstrumentAttributes31.Rating, com.tools20022.repository.msg.FinancialInstrumentStipulations2.Rating, com.tools20022.repository.msg.FutureOrOptionDetails1.Rating,
					com.tools20022.repository.msg.FinancialInstrumentAttributes44.Rating);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rating";
			definition = "Rating(s) of the security.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Rating.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Rating.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Coupon information of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached#Security
	 * CouponAttached.Security}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#CouponRange
	 * FinancialInstrumentStipulations.CouponRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#CouponRange
	 * FinancialInstrumentStipulations2.CouponRange}</li>
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
	public static final MMBusinessAssociationEnd CouponAttached = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentStipulations.CouponRange, com.tools20022.repository.msg.FinancialInstrumentStipulations2.CouponRange);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CouponAttached";
			definition = "Coupon information of the security.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CouponAttached.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CouponAttached.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the market sector the security is classified as
	 * pharmaceuticals, automobile, housing, etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Sector#Security
	 * Sector.Security}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#Sector
	 * FinancialInstrumentStipulations.Sector}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#Sector
	 * FinancialInstrumentStipulations2.Sector}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#Sector Debt2.Sector}</li>
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
	public static final MMBusinessAssociationEnd Sector = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentStipulations.Sector, com.tools20022.repository.msg.FinancialInstrumentStipulations2.Sector, com.tools20022.repository.msg.Debt2.Sector);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Sector";
			definition = "Indicates the market sector the security is classified as pharmaceuticals, automobile, housing, etc.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Sector.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Sector.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the warrants on a financial instrument (which has been
	 * traded cum warrants) will be attached on delivery.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#WarrantAttachedOnDelivery
	 * FinancialInstrumentAttributes31.WarrantAttachedOnDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#WarrantAttachedOnDelivery
	 * FinancialInstrumentAttributes44.WarrantAttachedOnDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#WarrantAttachedOnDelivery
	 * FinancialInstrumentAttributes2.WarrantAttachedOnDelivery}</li>
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
	public static final MMBusinessAttribute WarrantAttachedOnDelivery = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes31.WarrantAttachedOnDelivery, com.tools20022.repository.msg.FinancialInstrumentAttributes44.WarrantAttachedOnDelivery,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.WarrantAttachedOnDelivery);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WarrantAttachedOnDelivery";
			definition = "Indicates whether the warrants on a financial instrument (which has been traded cum warrants) will be attached on delivery.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the interest is separable from the principal.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#StrippableIndicator
	 * FutureOrOptionDetails1.StrippableIndicator}</li>
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
	public static final MMBusinessAttribute StrippableIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FutureOrOptionDetails1.StrippableIndicator);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrippableIndicator";
			definition = "Indicates whether the interest is separable from the principal.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Date on which new securities begin trading.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#FirstDealingDate
	 * FutureOrOptionDetails1.FirstDealingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3#FirstDealingDate
	 * CorporateActionDate3.FirstDealingDate}</li>
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
	public static final MMBusinessAttribute FirstDealingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FutureOrOptionDetails1.FirstDealingDate, com.tools20022.repository.msg.CorporateActionDate3.FirstDealingDate);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstDealingDate";
			definition = "Date on which new securities begin trading.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Tax details of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#Security
	 * SecuritiesTax.Security}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount8#StampDuty
	 * SecuritiesAccount8.StampDuty}</li>
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
	public static final MMBusinessAssociationEnd TaxDetails = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesAccount8.StampDuty);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxDetails";
			definition = "Tax details of the security.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesTax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Trade in which the security is involved.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#Security
	 * SecuritiesTrade.Security}</li>
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
	public static final MMBusinessAssociationEnd SecuritiesTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTrade";
			definition = "Trade in which the security is involved.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Jurisdiction (country, county, state, province, city) in which the
	 * security is legally recorded for regulatory and/or tax purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction#RegisteredSecurities
	 * Jurisdiction.RegisteredSecurities}</li>
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
	public static final MMBusinessAssociationEnd RegistrationJurisdiction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationJurisdiction";
			definition = "Jurisdiction (country, county, state, province, city) in which the security is legally recorded for regulatory and/or tax purposes.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Jurisdiction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Jurisdiction.RegisteredSecurities;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies roles played by a party that are linked to the handling of
	 * securities but not related to a specific process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#Security
	 * SecuritiesPartyRole.Security}</li>
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
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies roles played by a party that are linked to the handling of securities but not related to a specific process.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the status of the security within its lifecycle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus#Security
	 * SecuritiesStatus.Security}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#SecurityStatus
	 * CommonFinancialInstrumentAttributes1.SecurityStatus}</li>
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
	public static final MMBusinessAssociationEnd SecurityStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1.SecurityStatus);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecurityStatus";
			definition = "Specifies the status of the security within its lifecycle.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesStatus.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Modification process which applies to a specific security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#NewSecurityReferenceData
	 * SecuritiesModification.NewSecurityReferenceData}</li>
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
	public static final MMBusinessAssociationEnd Modification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Modification";
			definition = "Modification process which applies to a specific security.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesModification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.NewSecurityReferenceData;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * RedemptionSchedule(s) linked to the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#Security
	 * RedemptionSchedule.Security}</li>
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
	public static final MMBusinessAssociationEnd RedemptionSchedule = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RedemptionSchedule";
			definition = "RedemptionSchedule(s) linked to the security.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Settlement of a specific security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#Security
	 * SecuritiesSettlement.Security}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#SettlementParameters
	 * SecuritiesCollateral3.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#SettlementParameters
	 * SecuritiesCollateral4.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5#SettlementParameters
	 * SecuritiesCollateral5.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#SettlementParameters
	 * SecuritiesCollateral7.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#SettlementParameters
	 * SecuritiesCollateral8.SettlementParameters}</li>
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
	public static final MMBusinessAssociationEnd SecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesCollateral3.SettlementParameters, com.tools20022.repository.msg.SecuritiesCollateral4.SettlementParameters,
					com.tools20022.repository.msg.SecuritiesCollateral5.SettlementParameters, com.tools20022.repository.msg.SecuritiesCollateral7.SettlementParameters,
					com.tools20022.repository.msg.SecuritiesCollateral8.SettlementParameters);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Settlement of a specific security.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Transfer process in which that security is transferred..
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#Security
	 * SecuritiesTransfer.Security}</li>
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
	public static final MMBusinessAssociationEnd SecuritiesTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTransfer";
			definition = "Transfer process in which that security is transferred..";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Standing instructions related to the security in the context of corporate
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#Security
	 * AgentCorporateActionStandingInstruction.Security}</li>
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
	public static final MMBusinessAssociationEnd CorporateActionStandingInstructions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStandingInstructions";
			definition = "Standing instructions related to the security in the context of corporate action.";
			minOccurs = 0;
			type_lazy = () -> AgentCorporateActionStandingInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quote of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#QuotedSecurity
	 * Quote.QuotedSecurity}</li>
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
	public static final MMBusinessAssociationEnd Quote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quote";
			definition = "Quote of a security.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.QuotedSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Order for which a specific security is indicated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderedSecurity
	 * SecuritiesOrder.OrderedSecurity}</li>
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
	public static final MMBusinessAssociationEnd SecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrder";
			definition = "Order for which a specific security is indicated.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.OrderedSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Variable interest parameters specified for interest related to a
	 * financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#BenchmarkReference
	 * VariableInterest.BenchmarkReference}</li>
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
	public static final MMBusinessAssociationEnd RelatedVariableInterest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedVariableInterest";
			definition = "Variable interest parameters specified for interest related to a financial instrument.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> VariableInterest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.VariableInterest.BenchmarkReference;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information on the conversion exchange of an entitlement or of preferred
	 * equities or of convertible bonds, into another form of securities,
	 * usually common equities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#SecurityIdentification
	 * SecuritiesConversion.SecurityIdentification}</li>
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
	public static final MMBusinessAssociationEnd Conversion = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Conversion";
			definition = "Information on the conversion exchange of an entitlement or of preferred equities or of convertible bonds, into another form of securities, usually common equities.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesConversion.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.SecurityIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * The security is part of the component security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ComponentSecurity#Security
	 * ComponentSecurity.Security}</li>
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
	public static final MMBusinessAssociationEnd ComponentSecurity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ComponentSecurity";
			definition = "The security is part of the component security.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.ComponentSecurity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ComponentSecurity.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the interest and the principal can be recomposed. This
	 * is the reverse operation of stripping.
	 * <p>
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
	public static final MMBusinessAttribute RecompositionIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RecompositionIndicator";
			definition = "Indicates whether the interest and the principal can be recomposed. This is the reverse operation of stripping.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Identifier that links multiple security classes.
	 * <p>
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
	public static final MMBusinessAttribute Series = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Series";
			definition = "Identifier that links multiple security classes.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Percentage of the underlying assets of a fund that represents a debt and
	 * is in the scope of the EU Savings directive.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#PercentageOfDebtClaim
	 * FinancialInstrumentAttributes7.PercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#PercentageOfDebtClaim
	 * FinancialInstrumentAttributes11.PercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#PercentageOfDebtClaim
	 * FinancialInstrumentAttributes19.PercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#PercentageOfDebtClaim
	 * FinancialInstrumentAttributes23.PercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#PercentageOfDebtClaim
	 * FinancialInstrumentAttributes33.PercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#PercentageOfDebtClaim
	 * FinancialInstrumentAttributes39.PercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#PercentageOfDebtClaim
	 * FinancialInstrumentAttributes43.PercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#PercentageOfDebtClaim
	 * FinancialInstrumentAttributes45.PercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#PercentageOfDebtClaims
	 * FinancialInstrumentAttributes31.PercentageOfDebtClaims}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#PercentageOfDebtClaims
	 * FinancialInstrumentAttributes44.PercentageOfDebtClaims}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#PercentageOfDebtClaim
	 * FinancialInstrumentAttributes48.PercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#PercentageOfDebtClaim
	 * FinancialInstrumentAttributes55.PercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#PercentageOfDebtClaim
	 * FinancialInstrumentAttributes66.PercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#PercentageOfDebtClaim
	 * FinancialInstrumentAttributes70.PercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#PercentageOfDebtClaim
	 * FinancialInstrumentAttributes79.PercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#PercentageOfDebtClaim
	 * FinancialInstrumentAttributes85.PercentageOfDebtClaim}</li>
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
	public static final MMBusinessAttribute PercentageOfDebtClaim = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes7.PercentageOfDebtClaim, com.tools20022.repository.msg.FinancialInstrumentAttributes11.PercentageOfDebtClaim,
					com.tools20022.repository.msg.FinancialInstrumentAttributes19.PercentageOfDebtClaim, com.tools20022.repository.msg.FinancialInstrumentAttributes23.PercentageOfDebtClaim,
					com.tools20022.repository.msg.FinancialInstrumentAttributes33.PercentageOfDebtClaim, com.tools20022.repository.msg.FinancialInstrumentAttributes39.PercentageOfDebtClaim,
					com.tools20022.repository.msg.FinancialInstrumentAttributes43.PercentageOfDebtClaim, com.tools20022.repository.msg.FinancialInstrumentAttributes45.PercentageOfDebtClaim,
					com.tools20022.repository.msg.FinancialInstrumentAttributes31.PercentageOfDebtClaims, com.tools20022.repository.msg.FinancialInstrumentAttributes44.PercentageOfDebtClaims,
					com.tools20022.repository.msg.FinancialInstrumentAttributes48.PercentageOfDebtClaim, com.tools20022.repository.msg.FinancialInstrumentAttributes55.PercentageOfDebtClaim,
					com.tools20022.repository.msg.FinancialInstrumentAttributes66.PercentageOfDebtClaim, com.tools20022.repository.msg.FinancialInstrumentAttributes70.PercentageOfDebtClaim,
					com.tools20022.repository.msg.FinancialInstrumentAttributes79.PercentageOfDebtClaim, com.tools20022.repository.msg.FinancialInstrumentAttributes85.PercentageOfDebtClaim);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PercentageOfDebtClaim";
			definition = "Percentage of the underlying assets of a fund that represents a debt and is in the scope of the EU Savings directive.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Amount of dividends the issuer intends to pay out the following year
	 * based on their normalised earnings.
	 * <p>
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
	public static final MMBusinessAttribute CoverRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CoverRate";
			definition = "Amount of dividends the issuer intends to pay out the following year based on their normalised earnings.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Return of an investor's principal in a security at maturity.
	 * <p>
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
	public static final MMBusinessAttribute MaturityRedemption = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityRedemption";
			definition = "Return of an investor's principal in a security at maturity.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MaturityRedemptionTypeCode.mmObject();
		}
	};
	/**
	 * Margin call for which the associated securities are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#Security
	 * MarginCall.Security}</li>
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
	public static final MMBusinessAssociationEnd RelatedMarginCall = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedMarginCall";
			definition = "Margin call for which the associated securities are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> MarginCall.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MarginCall.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Situation in which two entities are linked because one of these entities
	 * owns some of the capital of the other one, or has a control relationship
	 * with it.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Party#CloseLinkSecurity
	 * Party.CloseLinkSecurity}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CloseLink1#SecurityIdentification
	 * CloseLink1.SecurityIdentification}</li>
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
	public static final MMBusinessAssociationEnd CloseLink = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CloseLink1.SecurityIdentification);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CloseLink";
			definition = "Situation in which two entities are linked because one of these entities owns some of the capital of the other one, or has a control relationship with it.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Party.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Party.CloseLinkSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates that the security is intended to be held in a manner that could
	 * allow the Eurosystem eligibility.
	 * <p>
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
	public static final MMBusinessAttribute PotentialEuroSystemEligibility = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PotentialEuroSystemEligibility";
			definition = "Indicates that the security is intended to be held in a manner that could allow the Eurosystem eligibility.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates the minimum tradable quantity of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumQuantityDebt
	 * SecuritiesQuantity.MinimumQuantityDebt}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#MinimumNominalQuantity
	 * FinancialInstrumentAttributes8.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#MinimumNominalQuantity
	 * FinancialInstrumentAttributes20.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#MinimumNominalQuantity
	 * FinancialInstrumentAttributes35.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#MinimumNominalQuantity
	 * FinancialInstrumentAttributes41.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#MinimumNominalQuantity
	 * FinancialInstrumentAttributes6.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#MinimumNominalQuantity
	 * FinancialInstrumentAttributes9.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#MinimumNominalQuantity
	 * FinancialInstrumentAttributes18.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#MinimumNominalQuantity
	 * FinancialInstrumentAttributes22.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#MinimumNominalQuantity
	 * FinancialInstrumentAttributes32.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#MinimumNominalQuantity
	 * FinancialInstrumentAttributes38.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#MinimumNominalQuantity
	 * FinancialInstrumentAttributes7.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#MinimumNominalQuantity
	 * FinancialInstrumentAttributes5.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#MinimumNominalQuantity
	 * FinancialInstrumentAttributes11.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#MinimumNominalQuantity
	 * FinancialInstrumentAttributes10.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#MinimumNominalQuantity
	 * FinancialInstrumentAttributes19.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#MinimumNominalQuantity
	 * FinancialInstrumentAttributes16.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#MinimumNominalQuantity
	 * FinancialInstrumentAttributes23.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#MinimumNominalQuantity
	 * FinancialInstrumentAttributes24.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#MinimumNominalQuantity
	 * FinancialInstrumentAttributes33.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#MinimumNominalQuantity
	 * FinancialInstrumentAttributes34.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#MinimumNominalQuantity
	 * FinancialInstrumentAttributes39.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#MinimumNominalQuantity
	 * FinancialInstrumentAttributes40.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#MinimumNominalQuantity
	 * FinancialInstrumentAttributes43.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#MinimumNominalQuantity
	 * FinancialInstrumentAttributes45.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#MinimumNominalQuantity
	 * FinancialInstrumentAttributes4.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#MinimumNominalQuantity
	 * FinancialInstrumentAttributes13.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#MinimumNominalQuantity
	 * FinancialInstrumentAttributes21.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#MinimumNominalQuantity
	 * FinancialInstrumentAttributes26.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#MinimumNominalQuantity
	 * FinancialInstrumentAttributes36.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#MinimumNominalQuantity
	 * FinancialInstrumentAttributes42.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#MinimumNominalQuantity
	 * FinancialInstrumentAttributes27.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#MinimumNominalQuantity
	 * FinancialInstrumentAttributes14.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#MinimumNominalQuantity
	 * FinancialInstrumentAttributes30.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#MinimumNominalQuantity
	 * FinancialInstrumentAttributes28.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#MinimumQuantity
	 * FinancialInstrumentStipulations.MinimumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#MinimumNominalQuantity
	 * FinancialInstrumentAttributes31.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#MinimumQuantity
	 * FinancialInstrumentStipulations2.MinimumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#MinimumNominalQuantity
	 * FinancialInstrumentAttributes44.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#MinimumNominalQuantity
	 * FinancialInstrumentAttributes15.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#MinimumNominalQuantity
	 * FinancialInstrumentAttributes29.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#MinimumNominalQuantity
	 * FinancialInstrumentAttributes2.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#MinimumNominalQuantity
	 * FinancialInstrumentAttributes48.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#MinimumNominalQuantity
	 * FinancialInstrumentAttributes50.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#MinimumNominalQuantity
	 * FinancialInstrumentAttributes49.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#MinimumNominalQuantity
	 * FinancialInstrumentAttributes55.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#MinimumNominalQuantity
	 * FinancialInstrumentAttributes57.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#MinimumNominalQuantity
	 * FinancialInstrumentAttributes56.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#MinimumNominalQuantity
	 * FinancialInstrumentAttributes63.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#MinimumNominalQuantity
	 * FinancialInstrumentAttributes64.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#MinimumNominalQuantity
	 * FinancialInstrumentAttributes66.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#MinimumNominalQuantity
	 * FinancialInstrumentAttributes65.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#MinimumNominalQuantity
	 * FinancialInstrumentAttributes67.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#MinimumNominalQuantity
	 * FinancialInstrumentAttributes70.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#MinimumNominalQuantity
	 * FinancialInstrumentAttributes69.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#MinimumNominalQuantity
	 * FinancialInstrumentAttributes71.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#MinimumNominalQuantity
	 * FinancialInstrumentAttributes75.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#MinimumNominalQuantity
	 * FinancialInstrumentAttributes78.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#MinimumNominalQuantity
	 * FinancialInstrumentAttributes79.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#MinimumNominalQuantity
	 * FinancialInstrumentAttributes81.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#MinimumNominalQuantity
	 * FinancialInstrumentAttributes80.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#MinimumNominalQuantity
	 * FinancialInstrumentAttributes85.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#MinimumNominalQuantity
	 * FinancialInstrumentAttributes84.MinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#MinimumNominalQuantity
	 * FinancialInstrumentAttributes83.MinimumNominalQuantity}</li>
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
	public static final MMBusinessAssociationEnd MinimumQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes20.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes41.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes6.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes9.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes18.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes22.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes32.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes38.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes7.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes5.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes11.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes10.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes19.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes16.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes23.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes24.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes33.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes34.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes39.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes40.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes43.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes45.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes13.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes26.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes42.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes14.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes28.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentStipulations.MinimumQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes31.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentStipulations2.MinimumQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes44.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes15.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes29.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes48.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes50.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes49.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes55.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes57.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes56.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes63.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes64.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes66.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes65.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes67.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes70.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes69.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes71.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes75.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes79.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes81.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes80.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes85.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes84.MinimumNominalQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes83.MinimumNominalQuantity);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantity";
			definition = "Indicates the minimum tradable quantity of a security.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityDebt;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies if the securities is restricted or not (as per Rule 144 of the
	 * Securities and Exchange Commission,that sets the conditions under which
	 * restricted, unregistered and control securities can be sold).
	 * <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#RestrictedIndicator
	 * Debt2.RestrictedIndicator}</li>
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
	public static final MMBusinessAttribute RestrictedIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt2.RestrictedIndicator);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RestrictedIndicator";
			definition = "Identifies if the securities is restricted or not (as per Rule 144 of the Securities and Exchange Commission,that sets the conditions under which restricted, unregistered and control securities can be sold).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Security";
				definition = "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesIdentification.IdentifiedSecurity, com.tools20022.repository.entity.Dividend.Security,
						com.tools20022.repository.entity.SecuritiesPricing.Security, com.tools20022.repository.entity.Party.CloseLinkSecurity, com.tools20022.repository.entity.RedemptionSchedule.Security,
						com.tools20022.repository.entity.TradingMarket.TradedSecurity, com.tools20022.repository.entity.TradingMarket.ListedSecurity, com.tools20022.repository.entity.SecuritiesAccount.Security,
						com.tools20022.repository.entity.SecuritiesTax.Security, com.tools20022.repository.entity.SecuritiesQuantity.SecurityIdentification, com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityDebt,
						com.tools20022.repository.entity.SecuritiesTrade.Security, com.tools20022.repository.entity.SecuritiesTransfer.Security, com.tools20022.repository.entity.SecuritiesPartyRole.Security,
						com.tools20022.repository.entity.SecuritiesSettlement.Security, com.tools20022.repository.entity.SecuritiesRelatedFees.Security, com.tools20022.repository.entity.SecuritiesStatus.Security,
						com.tools20022.repository.entity.VariableInterest.BenchmarkReference, com.tools20022.repository.entity.CouponAttached.Security, com.tools20022.repository.entity.SecuritiesConversion.SecurityIdentification,
						com.tools20022.repository.entity.BasicSecuritiesRegistration.Security, com.tools20022.repository.entity.SecuritiesRestriction.Security, com.tools20022.repository.entity.SecuritiesBalance.Security,
						com.tools20022.repository.entity.CorporateActionEvent.UnderlyingSecurity, com.tools20022.repository.entity.SecuritiesModification.NewSecurityReferenceData, com.tools20022.repository.entity.Spread.BenchmarkSecurity,
						com.tools20022.repository.entity.SecuritiesOrder.OrderedSecurity, com.tools20022.repository.entity.Rating.Security, com.tools20022.repository.entity.Sector.Security,
						com.tools20022.repository.entity.Jurisdiction.RegisteredSecurities, com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.Security, com.tools20022.repository.entity.MarginCall.Security,
						com.tools20022.repository.entity.Quote.QuotedSecurity, com.tools20022.repository.entity.ComponentSecurity.Security);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentDetails1.FinancialInstrumentAttributes, com.tools20022.repository.msg.FinancialInstrumentDetails4.FinancialInstrumentAttributes,
						com.tools20022.repository.msg.FinancialInstrumentDetails6.FinancialInstrumentAttributes, com.tools20022.repository.msg.FinancialInstrumentDetails7.FinancialInstrumentAttributes,
						com.tools20022.repository.msg.FinancialInstrumentDetails10.FinancialInstrumentAttributes, com.tools20022.repository.msg.FinancialInstrumentDetails12.FinancialInstrumentAttributes,
						com.tools20022.repository.msg.FinancialInstrumentDetails14.FinancialInstrumentAttributes, com.tools20022.repository.msg.FinancialInstrumentDetails15.FinancialInstrumentAttributes,
						com.tools20022.repository.msg.UnderlyingFinancialInstrument1.Attributes, com.tools20022.repository.msg.UnderlyingFinancialInstrument2.Attributes,
						com.tools20022.repository.msg.FinancialInstrument14.InstrumentDescription, com.tools20022.repository.msg.FinancialInstrument15.InstrumentDescription,
						com.tools20022.repository.choice.ProposalType1Choice.SecuritiesCollateral, com.tools20022.repository.msg.Collateral4.SecuritiesCollateral, com.tools20022.repository.msg.CollateralSubstitution1.SecuritiesCollateral,
						com.tools20022.repository.msg.CollateralValuation1.SecuritiesCollateralDetails, com.tools20022.repository.msg.CollateralValuePosition1.Securities, com.tools20022.repository.msg.InstrumentLeg2.LegStipulations,
						com.tools20022.repository.msg.SingleQuote1.FinancialInstrumentDetails, com.tools20022.repository.msg.SingleQuote1.UnderlyingFinancialInstrumentDetails,
						com.tools20022.repository.msg.SingleQuote1.FinancialInstrumentAttributes, com.tools20022.repository.msg.SingleQuote1.UnderlyingFinancialInstrumentAttributes,
						com.tools20022.repository.choice.QuoteCancellation1Choice.FinancialInstrumentDetails, com.tools20022.repository.choice.QuoteCancellation1Choice.FinancialInstrumentAttributes,
						com.tools20022.repository.choice.QuoteCancellation1Choice.UnderlyingFinancialInstrumentDetails, com.tools20022.repository.choice.QuoteCancellation1Choice.UnderlyingFinancialInstrumentAttributes,
						com.tools20022.repository.msg.FinancialInstrument1.Attributes, com.tools20022.repository.choice.InstrumentIdentification1Choice.OtherFinancialInstrument,
						com.tools20022.repository.msg.FinancialInstrument2.Attributes, com.tools20022.repository.choice.InstrumentIdentification2Choice.OtherFinancialInstrument, com.tools20022.repository.msg.InstrumentLeg1.LegStipulations,
						com.tools20022.repository.msg.QuoteRequest1.FinancialInstrumentDetails, com.tools20022.repository.msg.QuoteRequest1.FinancialInstrumentAttributes,
						com.tools20022.repository.msg.QuoteRequest1.UnderlyingFinancialInstrumentDetails, com.tools20022.repository.msg.QuoteRequest1.UnderlyingFinancialInstrumentAttributes,
						com.tools20022.repository.msg.RequestForQuote.FinancialInstrumentDetails, com.tools20022.repository.msg.RequestForQuote.FinancialInstrumentAttributes,
						com.tools20022.repository.msg.RequestForQuote.UnderlyingFinancialInstrumentDetails, com.tools20022.repository.msg.RequestForQuote.UnderlyingFinancialInstrumentAttributes,
						com.tools20022.repository.msg.Quote1.FinancialInstrumentDetails, com.tools20022.repository.msg.Quote1.UnderlyingFinancialInstrumentDetails, com.tools20022.repository.msg.Quote1.FinancialInstrumentAttributes,
						com.tools20022.repository.msg.Quote1.UnderlyingFinancialAttributes, com.tools20022.repository.msg.CollateralSubstitution2.SecuritiesCollateral,
						com.tools20022.repository.msg.CollateralValuation2.SecuritiesCollateral, com.tools20022.repository.msg.Collateral7.SecuritiesCollateral, com.tools20022.repository.msg.Collateral8.SecuritiesCollateral,
						com.tools20022.repository.msg.CollateralSubstitution3.SecuritiesCollateral, com.tools20022.repository.msg.FinancialInstrumentDetails21.FinancialInstrumentAttributes,
						com.tools20022.repository.msg.CollateralSubstitution5.SecuritiesCollateral, com.tools20022.repository.msg.CollateralSubstitution4.SecuritiesCollateral,
						com.tools20022.repository.msg.CollateralValuation5.SecuritiesCollateral, com.tools20022.repository.msg.Collateral11.SecuritiesCollateral, com.tools20022.repository.msg.Collateral12.SecuritiesCollateral,
						com.tools20022.repository.msg.FinancialInstrumentDetails22.FinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesReferenceDataReport5.FinancialInstrumentGeneralAttributes,
						com.tools20022.repository.msg.SecurityInstrumentDescription13.FinancialInstrumentGeneralAttributes, com.tools20022.repository.msg.FinancialInstrumentDetails24.FinancialInstrumentAttributes,
						com.tools20022.repository.msg.Collateral16.SecuritiesCollateral, com.tools20022.repository.msg.Collateral17.SecuritiesCollateral,
						com.tools20022.repository.msg.FinancialInstrumentDetails26.FinancialInstrumentAttributes);
				subType_lazy = () -> Arrays.asList(InvestmentFundClass.mmObject(), Debt.mmObject(), Equity.mmObject(), Warrant.mmObject(), Entitlement.mmObject());
				superType_lazy = () -> Asset.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Identification, com.tools20022.repository.entity.Security.RegisteredDistributionCountry,
						com.tools20022.repository.entity.Security.DenominationCurrency, com.tools20022.repository.entity.Security.RegistrationForm, com.tools20022.repository.entity.Security.DematerialisedIndicator,
						com.tools20022.repository.entity.Security.EUSavingsDirective, com.tools20022.repository.entity.Security.SecuritiesQuantity, com.tools20022.repository.entity.Security.Fees,
						com.tools20022.repository.entity.Security.Pricing, com.tools20022.repository.entity.Security.SecuritiesAccount, com.tools20022.repository.entity.Security.TradingMarket,
						com.tools20022.repository.entity.Security.PlaceOfListing, com.tools20022.repository.entity.Security.Registration, com.tools20022.repository.entity.Security.Restriction,
						com.tools20022.repository.entity.Security.CorporateEvent, com.tools20022.repository.entity.Security.TemporaryFinancialInstrumentIndicator, com.tools20022.repository.entity.Security.AvailableDate,
						com.tools20022.repository.entity.Security.DeclarationDetails, com.tools20022.repository.entity.Security.Spread, com.tools20022.repository.entity.Security.Dividend, com.tools20022.repository.entity.Security.Balance,
						com.tools20022.repository.entity.Security.FungibleIndicator, com.tools20022.repository.entity.Security.Appearance, com.tools20022.repository.entity.Security.NearTermPositionLimit,
						com.tools20022.repository.entity.Security.ContractSettlementMonth, com.tools20022.repository.entity.Security.MinimumTradingPricingIncrement, com.tools20022.repository.entity.Security.Rating,
						com.tools20022.repository.entity.Security.CouponAttached, com.tools20022.repository.entity.Security.Sector, com.tools20022.repository.entity.Security.WarrantAttachedOnDelivery,
						com.tools20022.repository.entity.Security.StrippableIndicator, com.tools20022.repository.entity.Security.FirstDealingDate, com.tools20022.repository.entity.Security.TaxDetails,
						com.tools20022.repository.entity.Security.SecuritiesTrade, com.tools20022.repository.entity.Security.RegistrationJurisdiction, com.tools20022.repository.entity.Security.PartyRole,
						com.tools20022.repository.entity.Security.SecurityStatus, com.tools20022.repository.entity.Security.Modification, com.tools20022.repository.entity.Security.RedemptionSchedule,
						com.tools20022.repository.entity.Security.SecuritiesSettlement, com.tools20022.repository.entity.Security.SecuritiesTransfer, com.tools20022.repository.entity.Security.CorporateActionStandingInstructions,
						com.tools20022.repository.entity.Security.Quote, com.tools20022.repository.entity.Security.SecuritiesOrder, com.tools20022.repository.entity.Security.RelatedVariableInterest,
						com.tools20022.repository.entity.Security.Conversion, com.tools20022.repository.entity.Security.ComponentSecurity, com.tools20022.repository.entity.Security.RecompositionIndicator,
						com.tools20022.repository.entity.Security.Series, com.tools20022.repository.entity.Security.PercentageOfDebtClaim, com.tools20022.repository.entity.Security.CoverRate,
						com.tools20022.repository.entity.Security.MaturityRedemption, com.tools20022.repository.entity.Security.RelatedMarginCall, com.tools20022.repository.entity.Security.CloseLink,
						com.tools20022.repository.entity.Security.PotentialEuroSystemEligibility, com.tools20022.repository.entity.Security.MinimumQuantity, com.tools20022.repository.entity.Security.RestrictedIndicator);
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
		});
		return mmObject_lazy.get();
	}
}