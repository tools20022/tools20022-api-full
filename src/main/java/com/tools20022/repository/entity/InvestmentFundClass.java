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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Security that is a sub-set of an investment fund, and is governed by the same
 * investment fund policy, for example, a dividend option or valuation currency.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentFundClass" src="doc-files/InvestmentFundClass.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#ClassType
 * InvestmentFundClass.ClassType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#DistributionPolicy
 * InvestmentFundClass.DistributionPolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#DividendPolicy
 * InvestmentFundClass.DividendPolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#DualFundIndicator
 * InvestmentFundClass.DualFundIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#RequestedNAVCurrency
 * InvestmentFundClass.RequestedNAVCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#TradingCurrency
 * InvestmentFundClass.TradingCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#InvestmentFund
 * InvestmentFundClass.InvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#PhysicalBearerSecurities
 * InvestmentFundClass.PhysicalBearerSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#DematerialisedBearerSecurities
 * InvestmentFundClass.DematerialisedBearerSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#PhysicalRegisteredSecurities
 * InvestmentFundClass.PhysicalRegisteredSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#DematerialisedRegisteredSecurities
 * InvestmentFundClass.DematerialisedRegisteredSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#ProcessingCharacteristics
 * InvestmentFundClass.ProcessingCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#ProductGroup
 * InvestmentFundClass.ProductGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#InvestmentAccount
 * InvestmentFundClass.InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#NetAssetValueCalculation
 * InvestmentFundClass.NetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#InvestmentFundTransaction
 * InvestmentFundClass.InvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#SeriesIssueIdentificationDate
 * InvestmentFundClass.SeriesIssueIdentificationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#SeriesName
 * InvestmentFundClass.SeriesName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#NewIssueIndicator
 * InvestmentFundClass.NewIssueIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#Equalisation
 * InvestmentFundClass.Equalisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#TopUpAmount
 * InvestmentFundClass.TopUpAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#HoldBackAmount
 * InvestmentFundClass.HoldBackAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#HoldBackReleaseDate
 * InvestmentFundClass.HoldBackReleaseDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#LotDescription
 * InvestmentFundClass.LotDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#FundClassification
 * InvestmentFundClass.FundClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#UnderlyingAssetType
 * InvestmentFundClass.UnderlyingAssetType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#InvestorType
 * InvestmentFundClass.InvestorType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#Reinvestment
 * InvestmentFundClass.Reinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#OutstandingUnits
 * InvestmentFundClass.OutstandingUnits}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForInvestmentFundClass
 * GenericIdentification.IdentificationForInvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#InvestmentFundClass
 * InvestmentFund.InvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#FundClass
 * InvestmentFundClassProcessingCharacteristics.FundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#RelatedFund
 * NetAssetValueCalculation.RelatedFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#InvestmentFundClass
 * InvestmentAccount.InvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#InvestmentFundClass
 * InvestmentFundTransaction.InvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Equalisation#RelatedInvestmentFundTransaction
 * Equalisation.RelatedInvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reinvestment#InvestmentFundClass
 * Reinvestment.InvestmentFundClass}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Repartition1#FinancialInstrument
 * Repartition1.FinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan4#SecurityDetails
 * InvestmentPlan4.SecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails1#BlockedHolding
 * BlockedHoldingDetails1.BlockedHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29#BlockedHoldingDetails
 * FinancialInstrument29.BlockedHoldingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Repartition2#FinancialInstrument
 * Repartition2.FinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan6#SecurityDetails
 * InvestmentPlan6.SecurityDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer1#Assets
 * PEPISATransfer1.Assets}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer6#FinancialInstrumentAssetForTransfer
 * PEPISATransfer6.FinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer4#FinancialInstrumentAssetForTransfer
 * ISATransfer4.FinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer6#FinancialInstrumentAssetForTransfer
 * ISATransfer6.FinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan5#SecurityDetails
 * InvestmentPlan5.SecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan3#SecurityDetails
 * InvestmentPlan3.SecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#SecurityDetails
 * InvestmentPlan7.SecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer8#FinancialInstrumentAssetForTransfer
 * PEPISATransfer8.FinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer3#FinancialInstrumentAssetForTransfer
 * ISATransfer3.FinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer8#FinancialInstrumentAssetForTransfer
 * ISATransfer8.FinancialInstrumentAssetForTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Unit2#Instrument
 * Unit2.Instrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer4#FinancialInstrumentAssetForTransfer
 * PEPISATransfer4.FinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer2#FinancialInstrumentAssetForTransfer
 * ISATransfer2.FinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer10#FinancialInstrumentAssetForTransfer
 * ISATransfer10.FinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer3#FinancialInstrumentAssetForTransfer
 * PEPISATransfer3.FinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer1#FinancialInstrumentAssetForTransfer
 * ISATransfer1.FinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer7#FinancialInstrumentAssetForTransfer
 * ISATransfer7.FinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferIn1#FinancialInstrumentDetails
 * TransferIn1.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferIn4#FinancialInstrumentDetails
 * TransferIn4.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer17#FinancialInstrumentDetails
 * Transfer17.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferOut1#FinancialInstrumentDetails
 * TransferOut1.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferOut6#FinancialInstrumentDetails
 * TransferOut6.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer14#FinancialInstrumentDetails
 * Transfer14.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer24#FinancialInstrumentDetails
 * Transfer24.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer25#FinancialInstrumentDetails
 * Transfer25.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferIn2#FinancialInstrumentDetails
 * TransferIn2.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferIn3#FinancialInstrumentDetails
 * TransferIn3.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer16#FinancialInstrumentDetails
 * Transfer16.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferOut2#FinancialInstrumentDetails
 * TransferOut2.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferOut5#FinancialInstrumentDetails
 * TransferOut5.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer12#FinancialInstrumentDetails
 * Transfer12.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer20#FinancialInstrumentDetails
 * Transfer20.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer22#FinancialInstrumentDetails
 * Transfer22.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer18#FinancialInstrumentDetails
 * Transfer18.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer26#FinancialInstrumentDetails
 * Transfer26.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer15#FinancialInstrumentDetails
 * Transfer15.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer21#FinancialInstrumentDetails
 * Transfer21.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer13#FinancialInstrumentDetails
 * Transfer13.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer23#FinancialInstrumentDetails
 * Transfer23.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer11#FinancialInstrumentDetails
 * Transfer11.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer19#FinancialInstrumentDetails
 * Transfer19.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#InvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation8.InvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#InvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation11.InvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation2#FinancialInstrumentDetails
 * AggregateBalanceInformation2.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#FinancialInstrumentDetails
 * AggregateBalanceInformation3.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#InvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation13.InvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#InvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation15.InvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#InvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation17.InvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#InvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation19.InvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#InvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation22.InvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#InvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation23.InvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#InvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation9.InvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#InvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation10.InvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1#FinancialInstrumentDetails
 * AggregateBalanceInformation1.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#FinancialInstrumentDetails
 * AggregateBalanceInformation4.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#InvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation12.InvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#InvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation14.InvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#InvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation16.InvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#InvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation18.InvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#InvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation21.InvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#InvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation24.InvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer5#FinancialInstrumentAssetForTransfer
 * PEPISATransfer5.FinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer5#FinancialInstrumentAssetForTransfer
 * ISATransfer5.FinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFund1#FinancialInstrumentIdentification
 * InvestmentFund1.FinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#InvestmentFundDetails
 * TotalPortfolioValuation1.InvestmentFundDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation5#FinancialInstrumentDetails
 * AggregateBalanceInformation5.FinancialInstrumentDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISACashTransfer1#Assets
 * PEPISACashTransfer1.Assets}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitsAndCash#Instrument
 * UnitsAndCash.Instrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#InvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation20.InvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstrumentIdentification1Choice#InvestmentFund
 * InstrumentIdentification1Choice.InvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstrumentIdentification2Choice#InvestmentFund
 * InstrumentIdentification2Choice.InvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan9#SecurityDetails
 * InvestmentPlan9.SecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#SecurityDetails
 * InvestmentPlan8.SecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer27#FinancialInstrumentDetails
 * Transfer27.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer28#FinancialInstrumentDetails
 * Transfer28.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer29#FinancialInstrumentDetails
 * Transfer29.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer15#FinancialInstrumentAssetForTransfer
 * ISATransfer15.FinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer16#FinancialInstrumentAssetForTransfer
 * ISATransfer16.FinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer13#FinancialInstrumentAssetForTransfer
 * ISATransfer13.FinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer14#FinancialInstrumentAssetForTransfer
 * ISATransfer14.FinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer21#FinancialInstrumentAssetForTransfer
 * ISATransfer21.FinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#SecurityDetails
 * InvestmentPlan10.SecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer18#FinancialInstrumentAssetForTransfer
 * ISATransfer18.FinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Repartition3#FinancialInstrument
 * Repartition3.FinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#SecurityDetails
 * InvestmentPlan11.SecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#InvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation26.InvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#InvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation25.InvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#InvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation28.InvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#InvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation27.InvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#InvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation30.InvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#InvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation31.InvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer23#FinancialInstrumentAssetForTransfer
 * ISATransfer23.FinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#SecurityDetails
 * InvestmentPlan12.SecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer26#FinancialInstrumentAssetForTransfer
 * ISATransfer26.FinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer31#FinancialInstrumentDetails
 * Transfer31.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer30#FinancialInstrumentDetails
 * Transfer30.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer32#FinancialInstrumentDetails
 * Transfer32.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer27#FinancialInstrumentAssetForTransfer
 * ISATransfer27.FinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer33#FinancialInstrumentDetails
 * Transfer33.FinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer22#FinancialInstrumentAssetForTransfer
 * ISATransfer22.FinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#BlockedHoldingDetails
 * FinancialInstrument51.BlockedHoldingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#SecurityDetails
 * InvestmentPlan13.SecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Repartition4#FinancialInstrument
 * Repartition4.FinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails2#BlockedHolding
 * BlockedHoldingDetails2.BlockedHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#InvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation32.InvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#InvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation33.InvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#SecurityDetails
 * InvestmentPlan14.SecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#SecurityDetails
 * InvestmentPlan15.SecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Repartition5#FinancialInstrument
 * Repartition5.FinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#BlockedHoldingDetails
 * FinancialInstrument56.BlockedHoldingDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument16
 * FinancialInstrument16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument20
 * FinancialInstrument20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument17
 * FinancialInstrument17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument6
 * FinancialInstrument6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument10
 * FinancialInstrument10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BlockedHoldingDetails1
 * BlockedHoldingDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument29
 * FinancialInstrument29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Repartition2 Repartition2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument7
 * FinancialInstrument7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument12
 * FinancialInstrument12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument26
 * FinancialInstrument26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument30
 * FinancialInstrument30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument11
 * FinancialInstrument11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument25
 * FinancialInstrument25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument27
 * FinancialInstrument27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument32
 * FinancialInstrument32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument24
 * FinancialInstrument24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument33
 * FinancialInstrument33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument23
 * FinancialInstrument23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument31
 * FinancialInstrument31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument3
 * FinancialInstrument3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument5
 * FinancialInstrument5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument8
 * FinancialInstrument8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument13
 * FinancialInstrument13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument21
 * FinancialInstrument21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument22
 * FinancialInstrument22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument4
 * FinancialInstrument4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument9
 * FinancialInstrument9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFund1
 * InvestmentFund1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument18
 * FinancialInstrument18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.HoldBackInformation1
 * HoldBackInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument19
 * FinancialInstrument19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument37
 * FinancialInstrument37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument35
 * FinancialInstrument35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument34
 * FinancialInstrument34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument36
 * FinancialInstrument36}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument40
 * FinancialInstrument40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Repartition3 Repartition3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument39
 * FinancialInstrument39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument51
 * FinancialInstrument51}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument50
 * FinancialInstrument50}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Repartition4 Repartition4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument45
 * FinancialInstrument45}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument49
 * FinancialInstrument49}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument48
 * FinancialInstrument48}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BlockedHoldingDetails2
 * BlockedHoldingDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument47
 * FinancialInstrument47}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument46
 * FinancialInstrument46}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Series1 Series1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument57
 * FinancialInstrument57}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Repartition5 Repartition5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument56
 * FinancialInstrument56}</li>
 * <li>{@linkplain com.tools20022.repository.msg.HoldBackInformation2
 * HoldBackInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument55
 * FinancialInstrument55}</li>
 * <li>{@linkplain com.tools20022.repository.msg.HoldBackInformation3
 * HoldBackInformation3}</li>
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
 * "InvestmentFundClass"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, for example, a dividend option or valuation currency."
 * </li>
 * </ul>
 */
public class InvestmentFundClass extends Security {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Features of units offered by a fund. For example, a unit may have a
	 * specific load structure, eg, front end or back end, an income policy, eg,
	 * pay out or accumulate, or a trailer policy, eg, with or without. Fund
	 * classes are typically denoted by a single character, eg, 'Class A',
	 * 'Class 2'.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#ClassType
	 * FinancialInstrument16.ClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification1#ClassType
	 * SecurityIdentification1.ClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument17#ClassType
	 * FinancialInstrument17.ClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument6#ClassType
	 * FinancialInstrument6.ClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument10#ClassType
	 * FinancialInstrument10.ClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29#ClassType
	 * FinancialInstrument29.ClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument3#ClassType
	 * FinancialInstrument3.ClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument5#ClassType
	 * FinancialInstrument5.ClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument8#ClassType
	 * FinancialInstrument8.ClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument13#ClassType
	 * FinancialInstrument13.ClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#ClassType
	 * FinancialInstrument21.ClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument22#ClassType
	 * FinancialInstrument22.ClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument4#ClassType
	 * FinancialInstrument4.ClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument9#ClassType
	 * FinancialInstrument9.ClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1#ClassType
	 * InvestmentFundTransactionsByFund1.ClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund2#ClassType
	 * InvestmentFundTransactionsByFund2.ClassType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFund1#ClassType
	 * InvestmentFund1.ClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument19#ClassType
	 * FinancialInstrument19.ClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund3#ClassType
	 * InvestmentFundTransactionsByFund3.ClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#ClassType
	 * FinancialInstrument51.ClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument45#ClassType
	 * FinancialInstrument45.ClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument49#ClassType
	 * FinancialInstrument49.ClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#ClassType
	 * FinancialInstrument57.ClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#ClassType
	 * FinancialInstrument56.ClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument55#ClassType
	 * FinancialInstrument55.ClassType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Features of units offered by a fund. For example, a unit may have a specific load structure, eg, front end or back end, an income policy, eg, pay out or accumulate, or a trailer policy, eg, with or without. Fund classes are typically denoted by a single character, eg, 'Class A', 'Class 2'."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ClassType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument16.ClassType, com.tools20022.repository.msg.SecurityIdentification1.ClassType,
					com.tools20022.repository.msg.FinancialInstrument17.ClassType, com.tools20022.repository.msg.FinancialInstrument6.ClassType, com.tools20022.repository.msg.FinancialInstrument10.ClassType,
					com.tools20022.repository.msg.FinancialInstrument29.ClassType, com.tools20022.repository.msg.FinancialInstrument3.ClassType, com.tools20022.repository.msg.FinancialInstrument5.ClassType,
					com.tools20022.repository.msg.FinancialInstrument8.ClassType, com.tools20022.repository.msg.FinancialInstrument13.ClassType, com.tools20022.repository.msg.FinancialInstrument21.ClassType,
					com.tools20022.repository.msg.FinancialInstrument22.ClassType, com.tools20022.repository.msg.FinancialInstrument4.ClassType, com.tools20022.repository.msg.FinancialInstrument9.ClassType,
					com.tools20022.repository.msg.InvestmentFundTransactionsByFund1.ClassType, com.tools20022.repository.msg.InvestmentFundTransactionsByFund2.ClassType, com.tools20022.repository.msg.InvestmentFund1.ClassType,
					com.tools20022.repository.msg.FinancialInstrument19.ClassType, com.tools20022.repository.msg.InvestmentFundTransactionsByFund3.ClassType, com.tools20022.repository.msg.FinancialInstrument51.ClassType,
					com.tools20022.repository.msg.FinancialInstrument45.ClassType, com.tools20022.repository.msg.FinancialInstrument49.ClassType, com.tools20022.repository.msg.FinancialInstrument57.ClassType,
					com.tools20022.repository.msg.FinancialInstrument56.ClassType, com.tools20022.repository.msg.FinancialInstrument55.ClassType);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClassType";
			definition = "Features of units offered by a fund. For example, a unit may have a specific load structure, eg, front end or back end, an income policy, eg, pay out or accumulate, or a trailer policy, eg, with or without. Fund classes are typically denoted by a single character, eg, 'Class A', 'Class 2'.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Income policy relating to a class type, ie, if income is paid out or
	 * retained in the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionPolicyCode
	 * DistributionPolicyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#DistributionPolicy
	 * FinancialInstrument16.DistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#DistributionPolicy
	 * FinancialInstrument20.DistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument17#DistributionPolicy
	 * FinancialInstrument17.DistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument6#DistributionPolicy
	 * FinancialInstrument6.DistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument10#DistributionPolicy
	 * FinancialInstrument10.DistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29#DistributionPolicy
	 * FinancialInstrument29.DistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument3#DistributionPolicy
	 * FinancialInstrument3.DistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument5#DistributionPolicy
	 * FinancialInstrument5.DistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument8#DistributionPolicy
	 * FinancialInstrument8.DistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument13#DistributionPolicy
	 * FinancialInstrument13.DistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#DistributionPolicy
	 * FinancialInstrument21.DistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument22#DistributionPolicy
	 * FinancialInstrument22.DistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument4#DistributionPolicy
	 * FinancialInstrument4.DistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument9#DistributionPolicy
	 * FinancialInstrument9.DistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1#DistributionPolicy
	 * InvestmentFundTransactionsByFund1.DistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund2#DistributionPolicy
	 * InvestmentFundTransactionsByFund2.DistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund3#DistributionPolicy
	 * InvestmentFundTransactionsByFund3.DistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#DistributionPolicy
	 * FinancialInstrument51.DistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument45#DistributionPolicy
	 * FinancialInstrument45.DistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument49#DistributionPolicy
	 * FinancialInstrument49.DistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#DistributionPolicy
	 * FinancialInstrument57.DistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#DistributionPolicy
	 * FinancialInstrument56.DistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument55#DistributionPolicy
	 * FinancialInstrument55.DistributionPolicy}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributionPolicy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Income policy relating to a class type, ie, if income is paid out or retained in the fund."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DistributionPolicy = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument16.DistributionPolicy, com.tools20022.repository.msg.FinancialInstrument20.DistributionPolicy,
					com.tools20022.repository.msg.FinancialInstrument17.DistributionPolicy, com.tools20022.repository.msg.FinancialInstrument6.DistributionPolicy, com.tools20022.repository.msg.FinancialInstrument10.DistributionPolicy,
					com.tools20022.repository.msg.FinancialInstrument29.DistributionPolicy, com.tools20022.repository.msg.FinancialInstrument3.DistributionPolicy, com.tools20022.repository.msg.FinancialInstrument5.DistributionPolicy,
					com.tools20022.repository.msg.FinancialInstrument8.DistributionPolicy, com.tools20022.repository.msg.FinancialInstrument13.DistributionPolicy, com.tools20022.repository.msg.FinancialInstrument21.DistributionPolicy,
					com.tools20022.repository.msg.FinancialInstrument22.DistributionPolicy, com.tools20022.repository.msg.FinancialInstrument4.DistributionPolicy, com.tools20022.repository.msg.FinancialInstrument9.DistributionPolicy,
					com.tools20022.repository.msg.InvestmentFundTransactionsByFund1.DistributionPolicy, com.tools20022.repository.msg.InvestmentFundTransactionsByFund2.DistributionPolicy,
					com.tools20022.repository.msg.InvestmentFundTransactionsByFund3.DistributionPolicy, com.tools20022.repository.msg.FinancialInstrument51.DistributionPolicy,
					com.tools20022.repository.msg.FinancialInstrument45.DistributionPolicy, com.tools20022.repository.msg.FinancialInstrument49.DistributionPolicy, com.tools20022.repository.msg.FinancialInstrument57.DistributionPolicy,
					com.tools20022.repository.msg.FinancialInstrument56.DistributionPolicy, com.tools20022.repository.msg.FinancialInstrument55.DistributionPolicy);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistributionPolicy";
			definition = "Income policy relating to a class type, ie, if income is paid out or retained in the fund.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DistributionPolicyCode.mmObject();
		}
	};
	/**
	 * Dividend policy of the fund, eg, cash, units.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DividendPolicyCode
	 * DividendPolicyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#DividendPolicy
	 * FinancialInstrument16.DividendPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#DividendPolicy
	 * FinancialInstrument20.DividendPolicy}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPolicy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend policy of the fund, eg, cash, units."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DividendPolicy = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument16.DividendPolicy, com.tools20022.repository.msg.FinancialInstrument20.DividendPolicy);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DividendPolicy";
			definition = "Dividend policy of the fund, eg, cash, units.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DividendPolicyCode.mmObject();
		}
	};
	/**
	 * Indicates whether the fund has two prices.
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
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics#DualFundIndicator
	 * ValuationDealingProcessingCharacteristics.DualFundIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2#DualFundIndicator
	 * ValuationDealingProcessingCharacteristics2.DualFundIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument5#DualFundIndicator
	 * FinancialInstrument5.DualFundIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument8#DualFundIndicator
	 * FinancialInstrument8.DualFundIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#DualFundIndicator
	 * FinancialInstrument21.DualFundIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument22#DualFundIndicator
	 * FinancialInstrument22.DualFundIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument9#DualFundIndicator
	 * FinancialInstrument9.DualFundIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DualFundIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the fund has two prices."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DualFundIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.DualFundIndicator, com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2.DualFundIndicator,
					com.tools20022.repository.msg.FinancialInstrument5.DualFundIndicator, com.tools20022.repository.msg.FinancialInstrument8.DualFundIndicator, com.tools20022.repository.msg.FinancialInstrument21.DualFundIndicator,
					com.tools20022.repository.msg.FinancialInstrument22.DualFundIndicator, com.tools20022.repository.msg.FinancialInstrument9.DualFundIndicator);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DualFundIndicator";
			definition = "Indicates whether the fund has two prices.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Currency to be used for pricing the fund. This currency must be among the
	 * set of currencies in which the price may be expressed, as stated in the
	 * prospectus.
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
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics#PriceCurrency
	 * ValuationDealingProcessingCharacteristics.PriceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2#PriceCurrency
	 * ValuationDealingProcessingCharacteristics2.PriceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument3#RequestedNAVCurrency
	 * FinancialInstrument3.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument5#RequestedNAVCurrency
	 * FinancialInstrument5.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#RequestedNAVCurrency
	 * FinancialInstrument21.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument22#RequestedNAVCurrency
	 * FinancialInstrument22.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument9#RequestedNAVCurrency
	 * FinancialInstrument9.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder2#RequestedNAVCurrency
	 * RedemptionBulkOrder2.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#RequestedNAVCurrency
	 * RedemptionBulkOrder3.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution2#RequestedNAVCurrency
	 * RedemptionBulkExecution2.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#RequestedNAVCurrency
	 * RedemptionBulkExecution3.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#RequestedNAVCurrency
	 * RedemptionBulkOrder4.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#RequestedNAVCurrency
	 * RedemptionOrder4.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#RequestedNAVCurrency
	 * RedemptionOrder6.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#RequestedNAVCurrency
	 * RedemptionExecution4.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#RequestedNAVCurrency
	 * RedemptionExecution6.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#RequestedNAVCurrency
	 * RedemptionOrder8.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder2#RequestedNAVCurrency
	 * SubscriptionBulkOrder2.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3#RequestedNAVCurrency
	 * SubscriptionBulkOrder3.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution2#RequestedNAVCurrency
	 * SubscriptionBulkExecution2.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3#RequestedNAVCurrency
	 * SubscriptionBulkExecution3.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4#RequestedNAVCurrency
	 * SubscriptionBulkOrder4.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#RequestedNAVCurrency
	 * SubscriptionOrder4.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#RequestedNAVCurrency
	 * SubscriptionOrder6.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#RequestedNAVCurrency
	 * SubscriptionExecution4.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#RequestedNAVCurrency
	 * SubscriptionExecution6.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#RequestedNAVCurrency
	 * SubscriptionOrder8.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder2#RequestedNAVCurrency
	 * SwitchRedemptionLegOrder2.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#RequestedNAVCurrency
	 * SwitchSubscriptionLegOrder2.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#RequestedNAVCurrency
	 * SwitchRedemptionLegOrder3.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#RequestedNAVCurrency
	 * SwitchSubscriptionLegOrder3.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#RequestedNAVCurrency
	 * SwitchRedemptionLegExecution2.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#RequestedNAVCurrency
	 * SwitchSubscriptionLegExecution2.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#RequestedNAVCurrency
	 * SwitchRedemptionLegExecution3.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#RequestedNAVCurrency
	 * SwitchSubscriptionLegExecution3.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#RequestedNAVCurrency
	 * RedemptionOrder11.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#RequestedNAVCurrency
	 * RedemptionExecution12.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#RequestedNAVCurrency
	 * SubscriptionOrder11.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#RequestedNAVCurrency
	 * SubscriptionExecution9.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Reinvestment1#RequestedNAVCurrency
	 * Reinvestment1.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Reinvestment2#RequestedNAVCurrency
	 * Reinvestment2.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#RequestedNAVCurrency
	 * SubscriptionBulkOrder5.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#RequestedNAVCurrency
	 * RedemptionBulkExecution5.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#RequestedNAVCurrency
	 * SubscriptionBulkExecution4.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#RequestedNAVCurrency
	 * RedemptionBulkOrder6.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#RequestedNAVCurrency
	 * RedemptionOrder14.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#RequestedNAVCurrency
	 * SwitchSubscriptionLegOrder6.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#RequestedNAVCurrency
	 * SubscriptionExecution13.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Reinvestment3#RequestedNAVCurrency
	 * Reinvestment3.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#RequestedNAVCurrency
	 * SwitchRedemptionLegOrder6.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#RequestedNAVCurrency
	 * SubscriptionOrder14.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#RequestedNAVCurrency
	 * SwitchSubscriptionLegExecution4.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#RequestedNAVCurrency
	 * RedemptionExecution15.RequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#RequestedNAVCurrency
	 * SwitchRedemptionLegExecution4.RequestedNAVCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedNAVCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency to be used for pricing the fund. This currency must be among the set of currencies in which the price may be expressed, as stated in the prospectus."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RequestedNAVCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.PriceCurrency, com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2.PriceCurrency,
					com.tools20022.repository.msg.FinancialInstrument3.RequestedNAVCurrency, com.tools20022.repository.msg.FinancialInstrument5.RequestedNAVCurrency, com.tools20022.repository.msg.FinancialInstrument21.RequestedNAVCurrency,
					com.tools20022.repository.msg.FinancialInstrument22.RequestedNAVCurrency, com.tools20022.repository.msg.FinancialInstrument9.RequestedNAVCurrency, com.tools20022.repository.msg.RedemptionBulkOrder2.RequestedNAVCurrency,
					com.tools20022.repository.msg.RedemptionBulkOrder3.RequestedNAVCurrency, com.tools20022.repository.msg.RedemptionBulkExecution2.RequestedNAVCurrency,
					com.tools20022.repository.msg.RedemptionBulkExecution3.RequestedNAVCurrency, com.tools20022.repository.msg.RedemptionBulkOrder4.RequestedNAVCurrency, com.tools20022.repository.msg.RedemptionOrder4.RequestedNAVCurrency,
					com.tools20022.repository.msg.RedemptionOrder6.RequestedNAVCurrency, com.tools20022.repository.msg.RedemptionExecution4.RequestedNAVCurrency, com.tools20022.repository.msg.RedemptionExecution6.RequestedNAVCurrency,
					com.tools20022.repository.msg.RedemptionOrder8.RequestedNAVCurrency, com.tools20022.repository.msg.SubscriptionBulkOrder2.RequestedNAVCurrency, com.tools20022.repository.msg.SubscriptionBulkOrder3.RequestedNAVCurrency,
					com.tools20022.repository.msg.SubscriptionBulkExecution2.RequestedNAVCurrency, com.tools20022.repository.msg.SubscriptionBulkExecution3.RequestedNAVCurrency,
					com.tools20022.repository.msg.SubscriptionBulkOrder4.RequestedNAVCurrency, com.tools20022.repository.msg.SubscriptionOrder4.RequestedNAVCurrency, com.tools20022.repository.msg.SubscriptionOrder6.RequestedNAVCurrency,
					com.tools20022.repository.msg.SubscriptionExecution4.RequestedNAVCurrency, com.tools20022.repository.msg.SubscriptionExecution6.RequestedNAVCurrency,
					com.tools20022.repository.msg.SubscriptionOrder8.RequestedNAVCurrency, com.tools20022.repository.msg.SwitchRedemptionLegOrder2.RequestedNAVCurrency,
					com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.RequestedNAVCurrency, com.tools20022.repository.msg.SwitchRedemptionLegOrder3.RequestedNAVCurrency,
					com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.RequestedNAVCurrency, com.tools20022.repository.msg.SwitchRedemptionLegExecution2.RequestedNAVCurrency,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution2.RequestedNAVCurrency, com.tools20022.repository.msg.SwitchRedemptionLegExecution3.RequestedNAVCurrency,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.RequestedNAVCurrency, com.tools20022.repository.msg.RedemptionOrder11.RequestedNAVCurrency,
					com.tools20022.repository.msg.RedemptionExecution12.RequestedNAVCurrency, com.tools20022.repository.msg.SubscriptionOrder11.RequestedNAVCurrency,
					com.tools20022.repository.msg.SubscriptionExecution9.RequestedNAVCurrency, com.tools20022.repository.msg.Reinvestment1.RequestedNAVCurrency, com.tools20022.repository.msg.Reinvestment2.RequestedNAVCurrency,
					com.tools20022.repository.msg.SubscriptionBulkOrder5.RequestedNAVCurrency, com.tools20022.repository.msg.RedemptionBulkExecution5.RequestedNAVCurrency,
					com.tools20022.repository.msg.SubscriptionBulkExecution4.RequestedNAVCurrency, com.tools20022.repository.msg.RedemptionBulkOrder6.RequestedNAVCurrency,
					com.tools20022.repository.msg.RedemptionOrder14.RequestedNAVCurrency, com.tools20022.repository.msg.SwitchSubscriptionLegOrder6.RequestedNAVCurrency,
					com.tools20022.repository.msg.SubscriptionExecution13.RequestedNAVCurrency, com.tools20022.repository.msg.Reinvestment3.RequestedNAVCurrency, com.tools20022.repository.msg.SwitchRedemptionLegOrder6.RequestedNAVCurrency,
					com.tools20022.repository.msg.SubscriptionOrder14.RequestedNAVCurrency, com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.RequestedNAVCurrency,
					com.tools20022.repository.msg.RedemptionExecution15.RequestedNAVCurrency, com.tools20022.repository.msg.SwitchRedemptionLegExecution4.RequestedNAVCurrency);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedNAVCurrency";
			definition = "Currency to be used for pricing the fund. This currency must be among the set of currencies in which the price may be expressed, as stated in the prospectus.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Currency of the investment fund class.
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
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification1#BaseCurrency
	 * SecurityIdentification1.BaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#BaseCurrency
	 * FinancialInstrument21.BaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument22#BaseCurrency
	 * FinancialInstrument22.BaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast1#InvestmentCurrency
	 * FundCashForecast1.InvestmentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#InvestmentCurrency
	 * FundCashForecast3.InvestmentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast2#InvestmentCurrency
	 * FundCashForecast2.InvestmentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#InvestmentCurrency
	 * FundCashForecast4.InvestmentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast2#InvestmentCurrency
	 * EstimatedFundCashForecast2.InvestmentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast4#InvestmentCurrency
	 * EstimatedFundCashForecast4.InvestmentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1#InvestmentCurrency
	 * EstimatedFundCashForecast1.InvestmentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#InvestmentCurrency
	 * EstimatedFundCashForecast3.InvestmentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#InvestmentCurrency
	 * FundCashForecast7.InvestmentCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund2#Currency
	 * Fund2.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#InvestmentCurrency
	 * EstimatedFundCashForecast6.InvestmentCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund1#Currency
	 * Fund1.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#InvestmentCurrency
	 * FundCashForecast6.InvestmentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#InvestmentCurrency
	 * EstimatedFundCashForecast5.InvestmentCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund3#Currency
	 * Fund3.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund4#Currency
	 * Fund4.Currency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the investment fund class."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TradingCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityIdentification1.BaseCurrency, com.tools20022.repository.msg.FinancialInstrument21.BaseCurrency,
					com.tools20022.repository.msg.FinancialInstrument22.BaseCurrency, com.tools20022.repository.msg.FundCashForecast1.InvestmentCurrency, com.tools20022.repository.msg.FundCashForecast3.InvestmentCurrency,
					com.tools20022.repository.msg.FundCashForecast2.InvestmentCurrency, com.tools20022.repository.msg.FundCashForecast4.InvestmentCurrency, com.tools20022.repository.msg.EstimatedFundCashForecast2.InvestmentCurrency,
					com.tools20022.repository.msg.EstimatedFundCashForecast4.InvestmentCurrency, com.tools20022.repository.msg.EstimatedFundCashForecast1.InvestmentCurrency,
					com.tools20022.repository.msg.EstimatedFundCashForecast3.InvestmentCurrency, com.tools20022.repository.msg.FundCashForecast7.InvestmentCurrency, com.tools20022.repository.msg.Fund2.Currency,
					com.tools20022.repository.msg.EstimatedFundCashForecast6.InvestmentCurrency, com.tools20022.repository.msg.Fund1.Currency, com.tools20022.repository.msg.FundCashForecast6.InvestmentCurrency,
					com.tools20022.repository.msg.EstimatedFundCashForecast5.InvestmentCurrency, com.tools20022.repository.msg.Fund3.Currency, com.tools20022.repository.msg.Fund4.Currency);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingCurrency";
			definition = "Currency of the investment fund class.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Investment fund which is related to the investment fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund#InvestmentFundClass
	 * InvestmentFund.InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast1#FinancialInstrumentDetails
	 * FundCashForecast1.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#FinancialInstrumentDetails
	 * FundCashForecast3.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast2#FinancialInstrumentDetails
	 * FundCashForecast2.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#FinancialInstrumentDetails
	 * FundCashForecast4.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast2#FinancialInstrumentDetails
	 * EstimatedFundCashForecast2.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast4#FinancialInstrumentDetails
	 * EstimatedFundCashForecast4.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1#FinancialInstrumentDetails
	 * EstimatedFundCashForecast1.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#FinancialInstrumentDetails
	 * EstimatedFundCashForecast3.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#FinancialInstrumentDetails
	 * FundCashForecast7.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#FinancialInstrumentDetails
	 * EstimatedFundCashForecast6.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#FinancialInstrumentDetails
	 * FundCashForecast6.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#FinancialInstrumentDetails
	 * EstimatedFundCashForecast5.FinancialInstrumentDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund which is related to the investment fund class."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentFund = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashForecast1.FinancialInstrumentDetails, com.tools20022.repository.msg.FundCashForecast3.FinancialInstrumentDetails,
					com.tools20022.repository.msg.FundCashForecast2.FinancialInstrumentDetails, com.tools20022.repository.msg.FundCashForecast4.FinancialInstrumentDetails,
					com.tools20022.repository.msg.EstimatedFundCashForecast2.FinancialInstrumentDetails, com.tools20022.repository.msg.EstimatedFundCashForecast4.FinancialInstrumentDetails,
					com.tools20022.repository.msg.EstimatedFundCashForecast1.FinancialInstrumentDetails, com.tools20022.repository.msg.EstimatedFundCashForecast3.FinancialInstrumentDetails,
					com.tools20022.repository.msg.FundCashForecast7.FinancialInstrumentDetails, com.tools20022.repository.msg.EstimatedFundCashForecast6.FinancialInstrumentDetails,
					com.tools20022.repository.msg.FundCashForecast6.FinancialInstrumentDetails, com.tools20022.repository.msg.EstimatedFundCashForecast5.FinancialInstrumentDetails);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFund";
			definition = "Investment fund which is related to the investment fund class.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFund.InvestmentFundClass;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether or not it is possible to hold bearer units/shares in
	 * this class in certified form
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#PhysicalBearerSecurities
	 * FinancialInstrument20.PhysicalBearerSecurities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalBearerSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not it is possible to hold bearer units/shares in this class in certified form"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PhysicalBearerSecurities = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument20.PhysicalBearerSecurities);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhysicalBearerSecurities";
			definition = "Indicates whether or not it is possible to hold bearer units/shares in this class in certified form";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicate whether or not it is possible to hold bearer units/shares in
	 * paperless form
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#DematerialisedBearerSecurities
	 * FinancialInstrument20.DematerialisedBearerSecurities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DematerialisedBearerSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicate whether or not it is possible to hold bearer units/shares in paperless form"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DematerialisedBearerSecurities = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument20.DematerialisedBearerSecurities);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DematerialisedBearerSecurities";
			definition = "Indicate whether or not it is possible to hold bearer units/shares in paperless form";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicate whether or not it is possible to hold registered units/shares in
	 * this class in paperless form
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#PhysicalRegisteredSecurities
	 * FinancialInstrument20.PhysicalRegisteredSecurities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalRegisteredSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicate whether or not it is possible to hold registered units/shares in this class in paperless form"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PhysicalRegisteredSecurities = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument20.PhysicalRegisteredSecurities);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhysicalRegisteredSecurities";
			definition = "Indicate whether or not it is possible to hold registered units/shares in this class in paperless form";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicate whether or not it is possible to hold registered units/shares in
	 * this class in paperless form
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#DematerialisedRegisteredSecurities
	 * FinancialInstrument20.DematerialisedRegisteredSecurities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DematerialisedRegisteredSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicate whether or not it is possible to hold registered units/shares in this class in paperless form"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DematerialisedRegisteredSecurities = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument20.DematerialisedRegisteredSecurities);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DematerialisedRegisteredSecurities";
			definition = "Indicate whether or not it is possible to hold registered units/shares in this class in paperless form";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Processing characteristics linked to the investment fund class, ie, not
	 * to the market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#FundClass
	 * InvestmentFundClassProcessingCharacteristics.FundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LocalMarketAnnex2#SubscriptionProcessingCharacteristics
	 * LocalMarketAnnex2.SubscriptionProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LocalMarketAnnex2#RedemptionProcessingCharacteristics
	 * LocalMarketAnnex2.RedemptionProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#ValuationDealingCharacteristics
	 * FundProcessingPassport1.ValuationDealingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#SubscriptionProcessingCharacteristics
	 * FundProcessingPassport1.SubscriptionProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#RedemptionProcessingCharacteristics
	 * FundProcessingPassport1.RedemptionProcessingCharacteristics}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingCharacteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Processing characteristics linked to the investment fund class, ie, not to  the market."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ProcessingCharacteristics = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LocalMarketAnnex2.SubscriptionProcessingCharacteristics, com.tools20022.repository.msg.LocalMarketAnnex2.RedemptionProcessingCharacteristics,
					com.tools20022.repository.msg.FundProcessingPassport1.ValuationDealingCharacteristics, com.tools20022.repository.msg.FundProcessingPassport1.SubscriptionProcessingCharacteristics,
					com.tools20022.repository.msg.FundProcessingPassport1.RedemptionProcessingCharacteristics);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessingCharacteristics";
			definition = "Processing characteristics linked to the investment fund class, ie, not to  the market.";
			minOccurs = 1;
			type_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.FundClass;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Company specific description of a group of funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument17#ProductGroup
	 * FinancialInstrument17.ProductGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument6#ProductGroup
	 * FinancialInstrument6.ProductGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument10#ProductGroup
	 * FinancialInstrument10.ProductGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29#ProductGroup
	 * FinancialInstrument29.ProductGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#ProductGroup
	 * FinancialInstrument21.ProductGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument22#ProductGroup
	 * FinancialInstrument22.ProductGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#ProductGroup
	 * FinancialInstrument51.ProductGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument45#ProductGroup
	 * FinancialInstrument45.ProductGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#ProductGroup
	 * FinancialInstrument57.ProductGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#ProductGroup
	 * FinancialInstrument56.ProductGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument55#ProductGroup
	 * FinancialInstrument55.ProductGroup}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductGroup"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Company specific description of a group of funds."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ProductGroup = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument17.ProductGroup, com.tools20022.repository.msg.FinancialInstrument6.ProductGroup,
					com.tools20022.repository.msg.FinancialInstrument10.ProductGroup, com.tools20022.repository.msg.FinancialInstrument29.ProductGroup, com.tools20022.repository.msg.FinancialInstrument21.ProductGroup,
					com.tools20022.repository.msg.FinancialInstrument22.ProductGroup, com.tools20022.repository.msg.FinancialInstrument51.ProductGroup, com.tools20022.repository.msg.FinancialInstrument45.ProductGroup,
					com.tools20022.repository.msg.FinancialInstrument57.ProductGroup, com.tools20022.repository.msg.FinancialInstrument56.ProductGroup, com.tools20022.repository.msg.FinancialInstrument55.ProductGroup);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductGroup";
			definition = "Company specific description of a group of funds.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Account which holds investment fund classes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#InvestmentFundClass
	 * InvestmentAccount.InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument26#TransfereeAccount
	 * FinancialInstrument26.TransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument30#TransfereeAccount
	 * FinancialInstrument30.TransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument25#TransfereeAccount
	 * FinancialInstrument25.TransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument27#TransfereeAccount
	 * FinancialInstrument27.TransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument32#TransfereeAccount
	 * FinancialInstrument32.TransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument24#TransfereeAccount
	 * FinancialInstrument24.TransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument33#TransfereeAccount
	 * FinancialInstrument33.TransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument23#TransfereeAccount
	 * FinancialInstrument23.TransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument31#TransfereeAccount
	 * FinancialInstrument31.TransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument37#TransfereeAccount
	 * FinancialInstrument37.TransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument37#SubAccountDetails
	 * FinancialInstrument37.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument35#TransfereeAccount
	 * FinancialInstrument35.TransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument35#SubAccountDetails
	 * FinancialInstrument35.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument34#TransfereeAccount
	 * FinancialInstrument34.TransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument34#SubAccountDetails
	 * FinancialInstrument34.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument36#TransfereeAccount
	 * FinancialInstrument36.TransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument36#SubAccountDetails
	 * FinancialInstrument36.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument40#TransfereeAccount
	 * FinancialInstrument40.TransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument40#SubAccountDetails
	 * FinancialInstrument40.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39#TransfereeAccount
	 * FinancialInstrument39.TransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39#SubAccountDetails
	 * FinancialInstrument39.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument50#TransfereeAccount
	 * FinancialInstrument50.TransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument50#SubAccountDetails
	 * FinancialInstrument50.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#TransfereeAccount
	 * FinancialInstrument48.TransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#SubAccountDetails
	 * FinancialInstrument48.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47#TransfereeAccount
	 * FinancialInstrument47.TransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47#SubAccountDetails
	 * FinancialInstrument47.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#TransfereeAccount
	 * FinancialInstrument46.TransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#SubAccountDetails
	 * FinancialInstrument46.SubAccountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account which holds investment fund classes."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument26.TransfereeAccount, com.tools20022.repository.msg.FinancialInstrument30.TransfereeAccount,
					com.tools20022.repository.msg.FinancialInstrument25.TransfereeAccount, com.tools20022.repository.msg.FinancialInstrument27.TransfereeAccount, com.tools20022.repository.msg.FinancialInstrument32.TransfereeAccount,
					com.tools20022.repository.msg.FinancialInstrument24.TransfereeAccount, com.tools20022.repository.msg.FinancialInstrument33.TransfereeAccount, com.tools20022.repository.msg.FinancialInstrument23.TransfereeAccount,
					com.tools20022.repository.msg.FinancialInstrument31.TransfereeAccount, com.tools20022.repository.msg.FinancialInstrument37.TransfereeAccount, com.tools20022.repository.msg.FinancialInstrument37.SubAccountDetails,
					com.tools20022.repository.msg.FinancialInstrument35.TransfereeAccount, com.tools20022.repository.msg.FinancialInstrument35.SubAccountDetails, com.tools20022.repository.msg.FinancialInstrument34.TransfereeAccount,
					com.tools20022.repository.msg.FinancialInstrument34.SubAccountDetails, com.tools20022.repository.msg.FinancialInstrument36.TransfereeAccount, com.tools20022.repository.msg.FinancialInstrument36.SubAccountDetails,
					com.tools20022.repository.msg.FinancialInstrument40.TransfereeAccount, com.tools20022.repository.msg.FinancialInstrument40.SubAccountDetails, com.tools20022.repository.msg.FinancialInstrument39.TransfereeAccount,
					com.tools20022.repository.msg.FinancialInstrument39.SubAccountDetails, com.tools20022.repository.msg.FinancialInstrument50.TransfereeAccount, com.tools20022.repository.msg.FinancialInstrument50.SubAccountDetails,
					com.tools20022.repository.msg.FinancialInstrument48.TransfereeAccount, com.tools20022.repository.msg.FinancialInstrument48.SubAccountDetails, com.tools20022.repository.msg.FinancialInstrument47.TransfereeAccount,
					com.tools20022.repository.msg.FinancialInstrument47.SubAccountDetails, com.tools20022.repository.msg.FinancialInstrument46.TransfereeAccount, com.tools20022.repository.msg.FinancialInstrument46.SubAccountDetails);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccount";
			definition = "Account which holds investment fund classes.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.InvestmentFundClass;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Calculation of the value of the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#RelatedFund
	 * NetAssetValueCalculation.RelatedFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAssetValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Calculation of the value of the fund."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Calculation of the value of the fund.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.RelatedFund;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Transaction which is related to the fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#InvestmentFundClass
	 * InvestmentFundTransaction.InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction which is related to the fund class."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentFundTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundTransaction";
			definition = "Transaction which is related to the fund class.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentFundClass;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date that identifies the issue of a fund series. Typically applicable to
	 * a redemption or order confirmation, but may be specified in the
	 * subscription, if known.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument18#SeriesIssueIdentificationDate
	 * FinancialInstrument18.SeriesIssueIdentificationDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Series1#SeriesDate
	 * Series1.SeriesDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DateFormat42Choice#YearMonth
	 * DateFormat42Choice.YearMonth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DateFormat42Choice#YearMonthDay
	 * DateFormat42Choice.YearMonthDay}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SeriesIssueIdentificationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date that identifies the issue of a fund series. Typically applicable to a redemption or order confirmation, but may be specified in the subscription, if known."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SeriesIssueIdentificationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument18.SeriesIssueIdentificationDate, com.tools20022.repository.msg.Series1.SeriesDate,
					com.tools20022.repository.choice.DateFormat42Choice.YearMonth, com.tools20022.repository.choice.DateFormat42Choice.YearMonthDay);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SeriesIssueIdentificationDate";
			definition = "Date that identifies the issue of a fund series. Typically applicable to a redemption or order confirmation, but may be specified in the subscription, if known.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Identifies the name of a fund series. Typically applicable to a
	 * redemption or order confirmation, but may be specified in the
	 * subscription, if known.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument18#SeriesName
	 * FinancialInstrument18.SeriesName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Series1#SeriesName
	 * Series1.SeriesName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#SeriesIdentification
	 * FinancialInstrument57.SeriesIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SeriesName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the name of a fund series. Typically applicable to a redemption or order confirmation, but may be specified in the subscription, if known."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SeriesName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument18.SeriesName, com.tools20022.repository.msg.Series1.SeriesName, com.tools20022.repository.msg.FinancialInstrument57.SeriesIdentification);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SeriesName";
			definition = "Identifies the name of a fund series. Typically applicable to a redemption or order confirmation, but may be specified in the subscription, if known.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Indicates that the financial instrument and/or series included in the
	 * message is a new issue.
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument18#NewIssueIndicator
	 * FinancialInstrument18.NewIssueIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewIssueIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the financial instrument and/or series included in the message is a new issue."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NewIssueIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument18.NewIssueIndicator);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewIssueIndicator";
			definition = "Indicates that the financial instrument and/or series included in the message is a new issue.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Part of an investor's subscription amount that is held by the fund in
	 * order to pay incentive / performance fees at the end of the fiscal year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Equalisation#RelatedInvestmentFundTransaction
	 * Equalisation.RelatedInvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Equalisation
	 * Equalisation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#Equalisation
	 * RedemptionOrder5.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#Equalisation
	 * RedemptionExecution5.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#Equalisation
	 * RedemptionOrder7.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#Equalisation
	 * RedemptionOrder6.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#Equalisation
	 * RedemptionExecution6.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#Equalisation
	 * RedemptionOrder8.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#Equalisation
	 * SubscriptionOrder5.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#Equalisation
	 * SubscriptionExecution5.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#Equalisation
	 * SubscriptionOrder7.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#Equalisation
	 * SubscriptionOrder6.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#Equalisation
	 * SubscriptionExecution6.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#Equalisation
	 * SubscriptionOrder8.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#Equalisation
	 * SwitchRedemptionLegOrder3.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#Equalisation
	 * SwitchSubscriptionLegOrder3.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#Equalisation
	 * SwitchRedemptionLegExecution3.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#Equalisation
	 * SwitchSubscriptionLegExecution3.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation5#EqualisationBalance
	 * AggregateBalanceInformation5.EqualisationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#Equalisation
	 * RedemptionExecution10.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#Equalisation
	 * SubscriptionExecution7.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#Equalisation
	 * RedemptionOrder14.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#Equalisation
	 * SwitchSubscriptionLegOrder6.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#Equalisation
	 * SubscriptionExecution13.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#Equalisation
	 * SubscriptionExecution12.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#Equalisation
	 * SubscriptionOrder15.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#Equalisation
	 * SwitchRedemptionLegOrder6.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#Equalisation
	 * RedemptionOrder15.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#Equalisation
	 * RedemptionExecution16.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#Equalisation
	 * SubscriptionOrder14.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#Equalisation
	 * SwitchSubscriptionLegExecution4.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#Equalisation
	 * RedemptionExecution15.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#Equalisation
	 * SwitchRedemptionLegExecution4.Equalisation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equalisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of an investor's subscription amount that is held by the fund in order to pay incentive / performance fees at the end of the fiscal year."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Equalisation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionOrder5.Equalisation, com.tools20022.repository.msg.RedemptionExecution5.Equalisation, com.tools20022.repository.msg.RedemptionOrder7.Equalisation,
					com.tools20022.repository.msg.RedemptionOrder6.Equalisation, com.tools20022.repository.msg.RedemptionExecution6.Equalisation, com.tools20022.repository.msg.RedemptionOrder8.Equalisation,
					com.tools20022.repository.msg.SubscriptionOrder5.Equalisation, com.tools20022.repository.msg.SubscriptionExecution5.Equalisation, com.tools20022.repository.msg.SubscriptionOrder7.Equalisation,
					com.tools20022.repository.msg.SubscriptionOrder6.Equalisation, com.tools20022.repository.msg.SubscriptionExecution6.Equalisation, com.tools20022.repository.msg.SubscriptionOrder8.Equalisation,
					com.tools20022.repository.msg.SwitchRedemptionLegOrder3.Equalisation, com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.Equalisation, com.tools20022.repository.msg.SwitchRedemptionLegExecution3.Equalisation,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.Equalisation, com.tools20022.repository.msg.AggregateBalanceInformation5.EqualisationBalance,
					com.tools20022.repository.msg.RedemptionExecution10.Equalisation, com.tools20022.repository.msg.SubscriptionExecution7.Equalisation, com.tools20022.repository.msg.RedemptionOrder14.Equalisation,
					com.tools20022.repository.msg.SwitchSubscriptionLegOrder6.Equalisation, com.tools20022.repository.msg.SubscriptionExecution13.Equalisation, com.tools20022.repository.msg.SubscriptionExecution12.Equalisation,
					com.tools20022.repository.msg.SubscriptionOrder15.Equalisation, com.tools20022.repository.msg.SwitchRedemptionLegOrder6.Equalisation, com.tools20022.repository.msg.RedemptionOrder15.Equalisation,
					com.tools20022.repository.msg.RedemptionExecution16.Equalisation, com.tools20022.repository.msg.SubscriptionOrder14.Equalisation, com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.Equalisation,
					com.tools20022.repository.msg.RedemptionExecution15.Equalisation, com.tools20022.repository.msg.SwitchRedemptionLegExecution4.Equalisation);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Equalisation";
			definition = "Part of an investor's subscription amount that is held by the fund in order to pay incentive / performance fees at the end of the fiscal year.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Equalisation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Equalisation.RelatedInvestmentFundTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Additional amount of money (top-up amount) required to meet the minimum
	 * subscription amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3#TopUpAmount
	 * ExpectedExecutionDetails3.TopUpAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TopUpAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional amount of money (top-up amount) required to meet the minimum subscription amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TopUpAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExpectedExecutionDetails3.TopUpAmount);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TopUpAmount";
			definition = "Additional amount of money (top-up amount) required to meet the minimum subscription amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Value of the redemption amount subject to hold back.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation1#HoldBackAmount
	 * HoldBackInformation1.HoldBackAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2#Amount
	 * HoldBackInformation2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3#Amount
	 * HoldBackInformation3.Amount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldBackAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the redemption amount subject to hold back."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute HoldBackAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.HoldBackInformation1.HoldBackAmount, com.tools20022.repository.msg.HoldBackInformation2.Amount, com.tools20022.repository.msg.HoldBackInformation3.Amount);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldBackAmount";
			definition = "Value of the redemption amount subject to hold back.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Date on which the hold back amount is to be released.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation1#HoldBackReleaseDate
	 * HoldBackInformation1.HoldBackReleaseDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2#ExpectedReleaseDate
	 * HoldBackInformation2.ExpectedReleaseDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3#ExpectedReleaseDate
	 * HoldBackInformation3.ExpectedReleaseDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldBackReleaseDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the hold back amount is to be released."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute HoldBackReleaseDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.HoldBackInformation1.HoldBackReleaseDate, com.tools20022.repository.msg.HoldBackInformation2.ExpectedReleaseDate,
					com.tools20022.repository.msg.HoldBackInformation3.ExpectedReleaseDate);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldBackReleaseDate";
			definition = "Date on which the hold back amount is to be released.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Description of the lot.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the lot."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LotDescription = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LotDescription";
			definition = "Description of the lot.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Method of classifying a fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForInvestmentFundClass
	 * GenericIdentification.IdentificationForInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method of classifying a fund."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FundClassification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundClassification";
			definition = "Method of classifying a fund.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> GenericIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.IdentificationForInvestmentFundClass;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of assets in which the fund invests.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingAssetType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of assets in which the fund invests."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute UnderlyingAssetType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingAssetType";
			definition = "Specifies the type of assets in which the fund invests.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
		}
	};
	/**
	 * Type of investor that can invest in the fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorTypeCode
	 * InvestorTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of investor that can invest in the fund class."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InvestorType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestorType";
			definition = "Type of investor that can invest in the fund class.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InvestorTypeCode.mmObject();
		}
	};
	/**
	 * Reinvestment information which involves this investment fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reinvestment#InvestmentFundClass
	 * Reinvestment.InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Reinvestment
	 * Reinvestment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reinvestment information which involves this investment fund class."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Reinvestment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reinvestment";
			definition = "Reinvestment information which involves this investment fund class.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Reinvestment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Reinvestment.InvestmentFundClass;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Investment fund class currently held by shareholders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFund1#TotalUnitsOutstanding
	 * InvestmentFund1.TotalUnitsOutstanding}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutstandingUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment fund class currently held by shareholders."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OutstandingUnits = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFund1.TotalUnitsOutstanding);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OutstandingUnits";
			definition = "Investment fund class currently held by shareholders.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundClass";
				definition = "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, for example, a dividend option or valuation currency.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.IdentificationForInvestmentFundClass, com.tools20022.repository.entity.InvestmentFund.InvestmentFundClass,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.FundClass, com.tools20022.repository.entity.NetAssetValueCalculation.RelatedFund,
						com.tools20022.repository.entity.InvestmentAccount.InvestmentFundClass, com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentFundClass,
						com.tools20022.repository.entity.Equalisation.RelatedInvestmentFundTransaction, com.tools20022.repository.entity.Reinvestment.InvestmentFundClass);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Repartition1.FinancialInstrument, com.tools20022.repository.msg.InvestmentPlan4.SecurityDetails,
						com.tools20022.repository.msg.BlockedHoldingDetails1.BlockedHolding, com.tools20022.repository.msg.FinancialInstrument29.BlockedHoldingDetails, com.tools20022.repository.msg.Repartition2.FinancialInstrument,
						com.tools20022.repository.msg.InvestmentPlan6.SecurityDetails, com.tools20022.repository.msg.PEPISATransfer1.Assets, com.tools20022.repository.msg.PEPISATransfer6.FinancialInstrumentAssetForTransfer,
						com.tools20022.repository.msg.ISATransfer4.FinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.ISATransfer6.FinancialInstrumentAssetForTransfer,
						com.tools20022.repository.msg.InvestmentPlan5.SecurityDetails, com.tools20022.repository.msg.InvestmentPlan3.SecurityDetails, com.tools20022.repository.msg.InvestmentPlan7.SecurityDetails,
						com.tools20022.repository.msg.PEPISATransfer8.FinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.ISATransfer3.FinancialInstrumentAssetForTransfer,
						com.tools20022.repository.msg.ISATransfer8.FinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.Unit2.Instrument, com.tools20022.repository.msg.PEPISATransfer4.FinancialInstrumentAssetForTransfer,
						com.tools20022.repository.msg.ISATransfer2.FinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.ISATransfer10.FinancialInstrumentAssetForTransfer,
						com.tools20022.repository.msg.PEPISATransfer3.FinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.ISATransfer1.FinancialInstrumentAssetForTransfer,
						com.tools20022.repository.msg.ISATransfer7.FinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.TransferIn1.FinancialInstrumentDetails,
						com.tools20022.repository.msg.TransferIn4.FinancialInstrumentDetails, com.tools20022.repository.msg.Transfer17.FinancialInstrumentDetails, com.tools20022.repository.msg.TransferOut1.FinancialInstrumentDetails,
						com.tools20022.repository.msg.TransferOut6.FinancialInstrumentDetails, com.tools20022.repository.msg.Transfer14.FinancialInstrumentDetails, com.tools20022.repository.msg.Transfer24.FinancialInstrumentDetails,
						com.tools20022.repository.msg.Transfer25.FinancialInstrumentDetails, com.tools20022.repository.msg.TransferIn2.FinancialInstrumentDetails, com.tools20022.repository.msg.TransferIn3.FinancialInstrumentDetails,
						com.tools20022.repository.msg.Transfer16.FinancialInstrumentDetails, com.tools20022.repository.msg.TransferOut2.FinancialInstrumentDetails, com.tools20022.repository.msg.TransferOut5.FinancialInstrumentDetails,
						com.tools20022.repository.msg.Transfer12.FinancialInstrumentDetails, com.tools20022.repository.msg.Transfer20.FinancialInstrumentDetails, com.tools20022.repository.msg.Transfer22.FinancialInstrumentDetails,
						com.tools20022.repository.msg.Transfer18.FinancialInstrumentDetails, com.tools20022.repository.msg.Transfer26.FinancialInstrumentDetails, com.tools20022.repository.msg.Transfer15.FinancialInstrumentDetails,
						com.tools20022.repository.msg.Transfer21.FinancialInstrumentDetails, com.tools20022.repository.msg.Transfer13.FinancialInstrumentDetails, com.tools20022.repository.msg.Transfer23.FinancialInstrumentDetails,
						com.tools20022.repository.msg.Transfer11.FinancialInstrumentDetails, com.tools20022.repository.msg.Transfer19.FinancialInstrumentDetails,
						com.tools20022.repository.msg.AggregateBalanceInformation8.InvestmentFundsFinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation11.InvestmentFundsFinancialInstrumentAttributes,
						com.tools20022.repository.msg.AggregateBalanceInformation2.FinancialInstrumentDetails, com.tools20022.repository.msg.AggregateBalanceInformation3.FinancialInstrumentDetails,
						com.tools20022.repository.msg.AggregateBalanceInformation13.InvestmentFundsFinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation15.InvestmentFundsFinancialInstrumentAttributes,
						com.tools20022.repository.msg.AggregateBalanceInformation17.InvestmentFundsFinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation19.InvestmentFundsFinancialInstrumentAttributes,
						com.tools20022.repository.msg.AggregateBalanceInformation22.InvestmentFundsFinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation23.InvestmentFundsFinancialInstrumentAttributes,
						com.tools20022.repository.msg.AggregateBalanceInformation9.InvestmentFundsFinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation10.InvestmentFundsFinancialInstrumentAttributes,
						com.tools20022.repository.msg.AggregateBalanceInformation1.FinancialInstrumentDetails, com.tools20022.repository.msg.AggregateBalanceInformation4.FinancialInstrumentDetails,
						com.tools20022.repository.msg.AggregateBalanceInformation12.InvestmentFundsFinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation14.InvestmentFundsFinancialInstrumentAttributes,
						com.tools20022.repository.msg.AggregateBalanceInformation16.InvestmentFundsFinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation18.InvestmentFundsFinancialInstrumentAttributes,
						com.tools20022.repository.msg.AggregateBalanceInformation21.InvestmentFundsFinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation24.InvestmentFundsFinancialInstrumentAttributes,
						com.tools20022.repository.msg.PEPISATransfer5.FinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.ISATransfer5.FinancialInstrumentAssetForTransfer,
						com.tools20022.repository.msg.InvestmentFund1.FinancialInstrumentIdentification, com.tools20022.repository.msg.TotalPortfolioValuation1.InvestmentFundDetails,
						com.tools20022.repository.msg.AggregateBalanceInformation5.FinancialInstrumentDetails, com.tools20022.repository.msg.PEPISACashTransfer1.Assets, com.tools20022.repository.msg.UnitsAndCash.Instrument,
						com.tools20022.repository.msg.AggregateBalanceInformation20.InvestmentFundsFinancialInstrumentAttributes, com.tools20022.repository.choice.InstrumentIdentification1Choice.InvestmentFund,
						com.tools20022.repository.choice.InstrumentIdentification2Choice.InvestmentFund, com.tools20022.repository.msg.InvestmentPlan9.SecurityDetails, com.tools20022.repository.msg.InvestmentPlan8.SecurityDetails,
						com.tools20022.repository.msg.Transfer27.FinancialInstrumentDetails, com.tools20022.repository.msg.Transfer28.FinancialInstrumentDetails, com.tools20022.repository.msg.Transfer29.FinancialInstrumentDetails,
						com.tools20022.repository.msg.ISATransfer15.FinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.ISATransfer16.FinancialInstrumentAssetForTransfer,
						com.tools20022.repository.msg.ISATransfer13.FinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.ISATransfer14.FinancialInstrumentAssetForTransfer,
						com.tools20022.repository.msg.ISATransfer21.FinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.InvestmentPlan10.SecurityDetails,
						com.tools20022.repository.msg.ISATransfer18.FinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.Repartition3.FinancialInstrument, com.tools20022.repository.msg.InvestmentPlan11.SecurityDetails,
						com.tools20022.repository.msg.AggregateBalanceInformation26.InvestmentFundsFinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation25.InvestmentFundsFinancialInstrumentAttributes,
						com.tools20022.repository.msg.AggregateBalanceInformation28.InvestmentFundsFinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation27.InvestmentFundsFinancialInstrumentAttributes,
						com.tools20022.repository.msg.AggregateBalanceInformation30.InvestmentFundsFinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation31.InvestmentFundsFinancialInstrumentAttributes,
						com.tools20022.repository.msg.ISATransfer23.FinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.InvestmentPlan12.SecurityDetails,
						com.tools20022.repository.msg.ISATransfer26.FinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.Transfer31.FinancialInstrumentDetails,
						com.tools20022.repository.msg.Transfer30.FinancialInstrumentDetails, com.tools20022.repository.msg.Transfer32.FinancialInstrumentDetails,
						com.tools20022.repository.msg.ISATransfer27.FinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.Transfer33.FinancialInstrumentDetails,
						com.tools20022.repository.msg.ISATransfer22.FinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.FinancialInstrument51.BlockedHoldingDetails,
						com.tools20022.repository.msg.InvestmentPlan13.SecurityDetails, com.tools20022.repository.msg.Repartition4.FinancialInstrument, com.tools20022.repository.msg.BlockedHoldingDetails2.BlockedHolding,
						com.tools20022.repository.msg.AggregateBalanceInformation32.InvestmentFundsFinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation33.InvestmentFundsFinancialInstrumentAttributes,
						com.tools20022.repository.msg.InvestmentPlan14.SecurityDetails, com.tools20022.repository.msg.InvestmentPlan15.SecurityDetails, com.tools20022.repository.msg.Repartition5.FinancialInstrument,
						com.tools20022.repository.msg.FinancialInstrument56.BlockedHoldingDetails);
				superType_lazy = () -> Security.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.ClassType, com.tools20022.repository.entity.InvestmentFundClass.DistributionPolicy,
						com.tools20022.repository.entity.InvestmentFundClass.DividendPolicy, com.tools20022.repository.entity.InvestmentFundClass.DualFundIndicator, com.tools20022.repository.entity.InvestmentFundClass.RequestedNAVCurrency,
						com.tools20022.repository.entity.InvestmentFundClass.TradingCurrency, com.tools20022.repository.entity.InvestmentFundClass.InvestmentFund,
						com.tools20022.repository.entity.InvestmentFundClass.PhysicalBearerSecurities, com.tools20022.repository.entity.InvestmentFundClass.DematerialisedBearerSecurities,
						com.tools20022.repository.entity.InvestmentFundClass.PhysicalRegisteredSecurities, com.tools20022.repository.entity.InvestmentFundClass.DematerialisedRegisteredSecurities,
						com.tools20022.repository.entity.InvestmentFundClass.ProcessingCharacteristics, com.tools20022.repository.entity.InvestmentFundClass.ProductGroup,
						com.tools20022.repository.entity.InvestmentFundClass.InvestmentAccount, com.tools20022.repository.entity.InvestmentFundClass.NetAssetValueCalculation,
						com.tools20022.repository.entity.InvestmentFundClass.InvestmentFundTransaction, com.tools20022.repository.entity.InvestmentFundClass.SeriesIssueIdentificationDate,
						com.tools20022.repository.entity.InvestmentFundClass.SeriesName, com.tools20022.repository.entity.InvestmentFundClass.NewIssueIndicator, com.tools20022.repository.entity.InvestmentFundClass.Equalisation,
						com.tools20022.repository.entity.InvestmentFundClass.TopUpAmount, com.tools20022.repository.entity.InvestmentFundClass.HoldBackAmount, com.tools20022.repository.entity.InvestmentFundClass.HoldBackReleaseDate,
						com.tools20022.repository.entity.InvestmentFundClass.LotDescription, com.tools20022.repository.entity.InvestmentFundClass.FundClassification, com.tools20022.repository.entity.InvestmentFundClass.UnderlyingAssetType,
						com.tools20022.repository.entity.InvestmentFundClass.InvestorType, com.tools20022.repository.entity.InvestmentFundClass.Reinvestment, com.tools20022.repository.entity.InvestmentFundClass.OutstandingUnits);
				derivationComponent_lazy = () -> Arrays.asList(FinancialInstrument16.mmObject(), FinancialInstrument20.mmObject(), FinancialInstrument17.mmObject(), FinancialInstrument6.mmObject(), FinancialInstrument10.mmObject(),
						BlockedHoldingDetails1.mmObject(), FinancialInstrument29.mmObject(), Repartition2.mmObject(), FinancialInstrument7.mmObject(), FinancialInstrument12.mmObject(), FinancialInstrument26.mmObject(),
						FinancialInstrument30.mmObject(), FinancialInstrument11.mmObject(), FinancialInstrument25.mmObject(), FinancialInstrument27.mmObject(), FinancialInstrument32.mmObject(), FinancialInstrument24.mmObject(),
						FinancialInstrument33.mmObject(), FinancialInstrument23.mmObject(), FinancialInstrument31.mmObject(), FinancialInstrument3.mmObject(), FinancialInstrument5.mmObject(), FinancialInstrument8.mmObject(),
						FinancialInstrument13.mmObject(), FinancialInstrument21.mmObject(), FinancialInstrument22.mmObject(), FinancialInstrument4.mmObject(), FinancialInstrument9.mmObject(), InvestmentFund1.mmObject(),
						FinancialInstrument18.mmObject(), HoldBackInformation1.mmObject(), FinancialInstrument19.mmObject(), FinancialInstrument37.mmObject(), FinancialInstrument35.mmObject(), FinancialInstrument34.mmObject(),
						FinancialInstrument36.mmObject(), FinancialInstrument40.mmObject(), Repartition3.mmObject(), FinancialInstrument39.mmObject(), FinancialInstrument51.mmObject(), FinancialInstrument50.mmObject(),
						Repartition4.mmObject(), FinancialInstrument45.mmObject(), FinancialInstrument49.mmObject(), FinancialInstrument48.mmObject(), BlockedHoldingDetails2.mmObject(), FinancialInstrument47.mmObject(),
						FinancialInstrument46.mmObject(), Series1.mmObject(), FinancialInstrument57.mmObject(), Repartition5.mmObject(), FinancialInstrument56.mmObject(), HoldBackInformation2.mmObject(), FinancialInstrument55.mmObject(),
						HoldBackInformation3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}