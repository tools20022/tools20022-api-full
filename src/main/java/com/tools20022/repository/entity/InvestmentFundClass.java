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
import java.util.List;

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
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmClassType
 * InvestmentFundClass.mmClassType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmDistributionPolicy
 * InvestmentFundClass.mmDistributionPolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmDividendPolicy
 * InvestmentFundClass.mmDividendPolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmDualFundIndicator
 * InvestmentFundClass.mmDualFundIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmRequestedNAVCurrency
 * InvestmentFundClass.mmRequestedNAVCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmTradingCurrency
 * InvestmentFundClass.mmTradingCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentFund
 * InvestmentFundClass.mmInvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmPhysicalBearerSecurities
 * InvestmentFundClass.mmPhysicalBearerSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmDematerialisedBearerSecurities
 * InvestmentFundClass.mmDematerialisedBearerSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmPhysicalRegisteredSecurities
 * InvestmentFundClass.mmPhysicalRegisteredSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmDematerialisedRegisteredSecurities
 * InvestmentFundClass.mmDematerialisedRegisteredSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmProcessingCharacteristics
 * InvestmentFundClass.mmProcessingCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmProductGroup
 * InvestmentFundClass.mmProductGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentAccount
 * InvestmentFundClass.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmNetAssetValueCalculation
 * InvestmentFundClass.mmNetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentFundTransaction
 * InvestmentFundClass.mmInvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmSeriesIssueIdentificationDate
 * InvestmentFundClass.mmSeriesIssueIdentificationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmSeriesName
 * InvestmentFundClass.mmSeriesName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmNewIssueIndicator
 * InvestmentFundClass.mmNewIssueIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmEqualisation
 * InvestmentFundClass.mmEqualisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmTopUpAmount
 * InvestmentFundClass.mmTopUpAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmHoldBackAmount
 * InvestmentFundClass.mmHoldBackAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmHoldBackReleaseDate
 * InvestmentFundClass.mmHoldBackReleaseDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmLotDescription
 * InvestmentFundClass.mmLotDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmFundClassification
 * InvestmentFundClass.mmFundClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmUnderlyingAssetType
 * InvestmentFundClass.mmUnderlyingAssetType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestorType
 * InvestmentFundClass.mmInvestorType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmReinvestment
 * InvestmentFundClass.mmReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmOutstandingUnits
 * InvestmentFundClass.mmOutstandingUnits}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForInvestmentFundClass
 * GenericIdentification.mmIdentificationForInvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmInvestmentFundClass
 * InvestmentFund.mmInvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmFundClass
 * InvestmentFundClassProcessingCharacteristics.mmFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmRelatedFund
 * NetAssetValueCalculation.mmRelatedFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundClass
 * InvestmentAccount.mmInvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Equalisation#mmRelatedInvestmentFundTransaction
 * Equalisation.mmRelatedInvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reinvestment#mmInvestmentFundClass
 * Reinvestment.mmInvestmentFundClass}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Repartition1#mmFinancialInstrument
 * Repartition1.mmFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan4#mmSecurityDetails
 * InvestmentPlan4.mmSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails1#mmBlockedHolding
 * BlockedHoldingDetails1.mmBlockedHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29#mmBlockedHoldingDetails
 * FinancialInstrument29.mmBlockedHoldingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Repartition2#mmFinancialInstrument
 * Repartition2.mmFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan6#mmSecurityDetails
 * InvestmentPlan6.mmSecurityDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer1#mmAssets
 * PEPISATransfer1.mmAssets}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer6#mmFinancialInstrumentAssetForTransfer
 * PEPISATransfer6.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer4#mmFinancialInstrumentAssetForTransfer
 * ISATransfer4.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer6#mmFinancialInstrumentAssetForTransfer
 * ISATransfer6.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan5#mmSecurityDetails
 * InvestmentPlan5.mmSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan3#mmSecurityDetails
 * InvestmentPlan3.mmSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmSecurityDetails
 * InvestmentPlan7.mmSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer8#mmFinancialInstrumentAssetForTransfer
 * PEPISATransfer8.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer3#mmFinancialInstrumentAssetForTransfer
 * ISATransfer3.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer8#mmFinancialInstrumentAssetForTransfer
 * ISATransfer8.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Unit2#mmInstrument
 * Unit2.mmInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer4#mmFinancialInstrumentAssetForTransfer
 * PEPISATransfer4.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer2#mmFinancialInstrumentAssetForTransfer
 * ISATransfer2.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer10#mmFinancialInstrumentAssetForTransfer
 * ISATransfer10.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer3#mmFinancialInstrumentAssetForTransfer
 * PEPISATransfer3.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer1#mmFinancialInstrumentAssetForTransfer
 * ISATransfer1.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer7#mmFinancialInstrumentAssetForTransfer
 * ISATransfer7.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferIn1#mmFinancialInstrumentDetails
 * TransferIn1.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferIn4#mmFinancialInstrumentDetails
 * TransferIn4.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer17#mmFinancialInstrumentDetails
 * Transfer17.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferOut1#mmFinancialInstrumentDetails
 * TransferOut1.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferOut6#mmFinancialInstrumentDetails
 * TransferOut6.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer14#mmFinancialInstrumentDetails
 * Transfer14.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer24#mmFinancialInstrumentDetails
 * Transfer24.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer25#mmFinancialInstrumentDetails
 * Transfer25.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferIn2#mmFinancialInstrumentDetails
 * TransferIn2.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferIn3#mmFinancialInstrumentDetails
 * TransferIn3.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer16#mmFinancialInstrumentDetails
 * Transfer16.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferOut2#mmFinancialInstrumentDetails
 * TransferOut2.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferOut5#mmFinancialInstrumentDetails
 * TransferOut5.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer12#mmFinancialInstrumentDetails
 * Transfer12.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer20#mmFinancialInstrumentDetails
 * Transfer20.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer22#mmFinancialInstrumentDetails
 * Transfer22.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer18#mmFinancialInstrumentDetails
 * Transfer18.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer26#mmFinancialInstrumentDetails
 * Transfer26.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer15#mmFinancialInstrumentDetails
 * Transfer15.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer21#mmFinancialInstrumentDetails
 * Transfer21.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer13#mmFinancialInstrumentDetails
 * Transfer13.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer23#mmFinancialInstrumentDetails
 * Transfer23.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer11#mmFinancialInstrumentDetails
 * Transfer11.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer19#mmFinancialInstrumentDetails
 * Transfer19.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation8.mmInvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation11.mmInvestmentFundsFinancialInstrumentAttributes}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation2#mmFinancialInstrumentDetails
 * AggregateBalanceInformation2.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#mmFinancialInstrumentDetails
 * AggregateBalanceInformation3.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation13.mmInvestmentFundsFinancialInstrumentAttributes}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation15.mmInvestmentFundsFinancialInstrumentAttributes}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation17.mmInvestmentFundsFinancialInstrumentAttributes}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation19.mmInvestmentFundsFinancialInstrumentAttributes}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation22.mmInvestmentFundsFinancialInstrumentAttributes}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation23.mmInvestmentFundsFinancialInstrumentAttributes}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation9.mmInvestmentFundsFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation10.mmInvestmentFundsFinancialInstrumentAttributes}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1#mmFinancialInstrumentDetails
 * AggregateBalanceInformation1.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#mmFinancialInstrumentDetails
 * AggregateBalanceInformation4.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation12.mmInvestmentFundsFinancialInstrumentAttributes}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation14.mmInvestmentFundsFinancialInstrumentAttributes}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation16.mmInvestmentFundsFinancialInstrumentAttributes}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation18.mmInvestmentFundsFinancialInstrumentAttributes}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation21.mmInvestmentFundsFinancialInstrumentAttributes}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation24.mmInvestmentFundsFinancialInstrumentAttributes}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer5#mmFinancialInstrumentAssetForTransfer
 * PEPISATransfer5.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer5#mmFinancialInstrumentAssetForTransfer
 * ISATransfer5.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFund1#mmFinancialInstrumentIdentification
 * InvestmentFund1.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#mmInvestmentFundDetails
 * TotalPortfolioValuation1.mmInvestmentFundDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation5#mmFinancialInstrumentDetails
 * AggregateBalanceInformation5.mmFinancialInstrumentDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISACashTransfer1#mmAssets
 * PEPISACashTransfer1.mmAssets}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitsAndCash#mmInstrument
 * UnitsAndCash.mmInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation20.mmInvestmentFundsFinancialInstrumentAttributes}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstrumentIdentification1Choice#mmInvestmentFund
 * InstrumentIdentification1Choice.mmInvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstrumentIdentification2Choice#mmInvestmentFund
 * InstrumentIdentification2Choice.mmInvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan9#mmSecurityDetails
 * InvestmentPlan9.mmSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmSecurityDetails
 * InvestmentPlan8.mmSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer27#mmFinancialInstrumentDetails
 * Transfer27.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer28#mmFinancialInstrumentDetails
 * Transfer28.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer29#mmFinancialInstrumentDetails
 * Transfer29.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer15#mmFinancialInstrumentAssetForTransfer
 * ISATransfer15.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer16#mmFinancialInstrumentAssetForTransfer
 * ISATransfer16.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer13#mmFinancialInstrumentAssetForTransfer
 * ISATransfer13.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer14#mmFinancialInstrumentAssetForTransfer
 * ISATransfer14.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer21#mmFinancialInstrumentAssetForTransfer
 * ISATransfer21.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmSecurityDetails
 * InvestmentPlan10.mmSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer18#mmFinancialInstrumentAssetForTransfer
 * ISATransfer18.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Repartition3#mmFinancialInstrument
 * Repartition3.mmFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmSecurityDetails
 * InvestmentPlan11.mmSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation26.mmInvestmentFundsFinancialInstrumentAttributes}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation25.mmInvestmentFundsFinancialInstrumentAttributes}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation28.mmInvestmentFundsFinancialInstrumentAttributes}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation27.mmInvestmentFundsFinancialInstrumentAttributes}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation30.mmInvestmentFundsFinancialInstrumentAttributes}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation31.mmInvestmentFundsFinancialInstrumentAttributes}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer23#mmFinancialInstrumentAssetForTransfer
 * ISATransfer23.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmSecurityDetails
 * InvestmentPlan12.mmSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer26#mmFinancialInstrumentAssetForTransfer
 * ISATransfer26.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer31#mmFinancialInstrumentDetails
 * Transfer31.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer30#mmFinancialInstrumentDetails
 * Transfer30.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer32#mmFinancialInstrumentDetails
 * Transfer32.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer27#mmFinancialInstrumentAssetForTransfer
 * ISATransfer27.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer33#mmFinancialInstrumentDetails
 * Transfer33.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer22#mmFinancialInstrumentAssetForTransfer
 * ISATransfer22.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmBlockedHoldingDetails
 * FinancialInstrument51.mmBlockedHoldingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmSecurityDetails
 * InvestmentPlan13.mmSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Repartition4#mmFinancialInstrument
 * Repartition4.mmFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails2#mmBlockedHolding
 * BlockedHoldingDetails2.mmBlockedHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation32.mmInvestmentFundsFinancialInstrumentAttributes}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation33.mmInvestmentFundsFinancialInstrumentAttributes}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmSecurityDetails
 * InvestmentPlan14.mmSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmSecurityDetails
 * InvestmentPlan15.mmSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Repartition5#mmFinancialInstrument
 * Repartition5.mmFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmBlockedHoldingDetails
 * FinancialInstrument56.mmBlockedHoldingDetails}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected Max35Text classType;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#mmClassType
	 * FinancialInstrument16.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification1#mmClassType
	 * SecurityIdentification1.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument17#mmClassType
	 * FinancialInstrument17.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument6#mmClassType
	 * FinancialInstrument6.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument10#mmClassType
	 * FinancialInstrument10.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29#mmClassType
	 * FinancialInstrument29.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument3#mmClassType
	 * FinancialInstrument3.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument5#mmClassType
	 * FinancialInstrument5.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument8#mmClassType
	 * FinancialInstrument8.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument13#mmClassType
	 * FinancialInstrument13.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmClassType
	 * FinancialInstrument21.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument22#mmClassType
	 * FinancialInstrument22.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument4#mmClassType
	 * FinancialInstrument4.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument9#mmClassType
	 * FinancialInstrument9.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1#mmClassType
	 * InvestmentFundTransactionsByFund1.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund2#mmClassType
	 * InvestmentFundTransactionsByFund2.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFund1#mmClassType
	 * InvestmentFund1.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument19#mmClassType
	 * FinancialInstrument19.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund3#mmClassType
	 * InvestmentFundTransactionsByFund3.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmClassType
	 * FinancialInstrument51.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument45#mmClassType
	 * FinancialInstrument45.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument49#mmClassType
	 * FinancialInstrument49.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#mmClassType
	 * FinancialInstrument57.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmClassType
	 * FinancialInstrument56.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument55#mmClassType
	 * FinancialInstrument55.mmClassType}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmClassType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument16.mmClassType, com.tools20022.repository.msg.SecurityIdentification1.mmClassType,
					com.tools20022.repository.msg.FinancialInstrument17.mmClassType, com.tools20022.repository.msg.FinancialInstrument6.mmClassType, com.tools20022.repository.msg.FinancialInstrument10.mmClassType,
					com.tools20022.repository.msg.FinancialInstrument29.mmClassType, com.tools20022.repository.msg.FinancialInstrument3.mmClassType, com.tools20022.repository.msg.FinancialInstrument5.mmClassType,
					com.tools20022.repository.msg.FinancialInstrument8.mmClassType, com.tools20022.repository.msg.FinancialInstrument13.mmClassType, com.tools20022.repository.msg.FinancialInstrument21.mmClassType,
					com.tools20022.repository.msg.FinancialInstrument22.mmClassType, com.tools20022.repository.msg.FinancialInstrument4.mmClassType, com.tools20022.repository.msg.FinancialInstrument9.mmClassType,
					com.tools20022.repository.msg.InvestmentFundTransactionsByFund1.mmClassType, com.tools20022.repository.msg.InvestmentFundTransactionsByFund2.mmClassType, com.tools20022.repository.msg.InvestmentFund1.mmClassType,
					com.tools20022.repository.msg.FinancialInstrument19.mmClassType, com.tools20022.repository.msg.InvestmentFundTransactionsByFund3.mmClassType, com.tools20022.repository.msg.FinancialInstrument51.mmClassType,
					com.tools20022.repository.msg.FinancialInstrument45.mmClassType, com.tools20022.repository.msg.FinancialInstrument49.mmClassType, com.tools20022.repository.msg.FinancialInstrument57.mmClassType,
					com.tools20022.repository.msg.FinancialInstrument56.mmClassType, com.tools20022.repository.msg.FinancialInstrument55.mmClassType);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClassType";
			definition = "Features of units offered by a fund. For example, a unit may have a specific load structure, eg, front end or back end, an income policy, eg, pay out or accumulate, or a trailer policy, eg, with or without. Fund classes are typically denoted by a single character, eg, 'Class A', 'Class 2'.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DistributionPolicyCode distributionPolicy;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#mmDistributionPolicy
	 * FinancialInstrument16.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#mmDistributionPolicy
	 * FinancialInstrument20.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument17#mmDistributionPolicy
	 * FinancialInstrument17.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument6#mmDistributionPolicy
	 * FinancialInstrument6.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument10#mmDistributionPolicy
	 * FinancialInstrument10.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29#mmDistributionPolicy
	 * FinancialInstrument29.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument3#mmDistributionPolicy
	 * FinancialInstrument3.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument5#mmDistributionPolicy
	 * FinancialInstrument5.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument8#mmDistributionPolicy
	 * FinancialInstrument8.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument13#mmDistributionPolicy
	 * FinancialInstrument13.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmDistributionPolicy
	 * FinancialInstrument21.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument22#mmDistributionPolicy
	 * FinancialInstrument22.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument4#mmDistributionPolicy
	 * FinancialInstrument4.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument9#mmDistributionPolicy
	 * FinancialInstrument9.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1#mmDistributionPolicy
	 * InvestmentFundTransactionsByFund1.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund2#mmDistributionPolicy
	 * InvestmentFundTransactionsByFund2.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund3#mmDistributionPolicy
	 * InvestmentFundTransactionsByFund3.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmDistributionPolicy
	 * FinancialInstrument51.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument45#mmDistributionPolicy
	 * FinancialInstrument45.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument49#mmDistributionPolicy
	 * FinancialInstrument49.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#mmDistributionPolicy
	 * FinancialInstrument57.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmDistributionPolicy
	 * FinancialInstrument56.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument55#mmDistributionPolicy
	 * FinancialInstrument55.mmDistributionPolicy}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmDistributionPolicy = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument16.mmDistributionPolicy, com.tools20022.repository.msg.FinancialInstrument20.mmDistributionPolicy,
					com.tools20022.repository.msg.FinancialInstrument17.mmDistributionPolicy, com.tools20022.repository.msg.FinancialInstrument6.mmDistributionPolicy,
					com.tools20022.repository.msg.FinancialInstrument10.mmDistributionPolicy, com.tools20022.repository.msg.FinancialInstrument29.mmDistributionPolicy,
					com.tools20022.repository.msg.FinancialInstrument3.mmDistributionPolicy, com.tools20022.repository.msg.FinancialInstrument5.mmDistributionPolicy, com.tools20022.repository.msg.FinancialInstrument8.mmDistributionPolicy,
					com.tools20022.repository.msg.FinancialInstrument13.mmDistributionPolicy, com.tools20022.repository.msg.FinancialInstrument21.mmDistributionPolicy,
					com.tools20022.repository.msg.FinancialInstrument22.mmDistributionPolicy, com.tools20022.repository.msg.FinancialInstrument4.mmDistributionPolicy, com.tools20022.repository.msg.FinancialInstrument9.mmDistributionPolicy,
					com.tools20022.repository.msg.InvestmentFundTransactionsByFund1.mmDistributionPolicy, com.tools20022.repository.msg.InvestmentFundTransactionsByFund2.mmDistributionPolicy,
					com.tools20022.repository.msg.InvestmentFundTransactionsByFund3.mmDistributionPolicy, com.tools20022.repository.msg.FinancialInstrument51.mmDistributionPolicy,
					com.tools20022.repository.msg.FinancialInstrument45.mmDistributionPolicy, com.tools20022.repository.msg.FinancialInstrument49.mmDistributionPolicy,
					com.tools20022.repository.msg.FinancialInstrument57.mmDistributionPolicy, com.tools20022.repository.msg.FinancialInstrument56.mmDistributionPolicy,
					com.tools20022.repository.msg.FinancialInstrument55.mmDistributionPolicy);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistributionPolicy";
			definition = "Income policy relating to a class type, ie, if income is paid out or retained in the fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DistributionPolicyCode.mmObject();
		}
	};
	protected DividendPolicyCode dividendPolicy;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#mmDividendPolicy
	 * FinancialInstrument16.mmDividendPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#mmDividendPolicy
	 * FinancialInstrument20.mmDividendPolicy}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmDividendPolicy = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument16.mmDividendPolicy, com.tools20022.repository.msg.FinancialInstrument20.mmDividendPolicy);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DividendPolicy";
			definition = "Dividend policy of the fund, eg, cash, units.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DividendPolicyCode.mmObject();
		}
	};
	protected YesNoIndicator dualFundIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics#mmDualFundIndicator
	 * ValuationDealingProcessingCharacteristics.mmDualFundIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2#mmDualFundIndicator
	 * ValuationDealingProcessingCharacteristics2.mmDualFundIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument5#mmDualFundIndicator
	 * FinancialInstrument5.mmDualFundIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument8#mmDualFundIndicator
	 * FinancialInstrument8.mmDualFundIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmDualFundIndicator
	 * FinancialInstrument21.mmDualFundIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument22#mmDualFundIndicator
	 * FinancialInstrument22.mmDualFundIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument9#mmDualFundIndicator
	 * FinancialInstrument9.mmDualFundIndicator}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmDualFundIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmDualFundIndicator, com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2.mmDualFundIndicator,
					com.tools20022.repository.msg.FinancialInstrument5.mmDualFundIndicator, com.tools20022.repository.msg.FinancialInstrument8.mmDualFundIndicator, com.tools20022.repository.msg.FinancialInstrument21.mmDualFundIndicator,
					com.tools20022.repository.msg.FinancialInstrument22.mmDualFundIndicator, com.tools20022.repository.msg.FinancialInstrument9.mmDualFundIndicator);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DualFundIndicator";
			definition = "Indicates whether the fund has two prices.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected CurrencyCode requestedNAVCurrency;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics#mmPriceCurrency
	 * ValuationDealingProcessingCharacteristics.mmPriceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2#mmPriceCurrency
	 * ValuationDealingProcessingCharacteristics2.mmPriceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument3#mmRequestedNAVCurrency
	 * FinancialInstrument3.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument5#mmRequestedNAVCurrency
	 * FinancialInstrument5.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmRequestedNAVCurrency
	 * FinancialInstrument21.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument22#mmRequestedNAVCurrency
	 * FinancialInstrument22.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument9#mmRequestedNAVCurrency
	 * FinancialInstrument9.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder2#mmRequestedNAVCurrency
	 * RedemptionBulkOrder2.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#mmRequestedNAVCurrency
	 * RedemptionBulkOrder3.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution2#mmRequestedNAVCurrency
	 * RedemptionBulkExecution2.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmRequestedNAVCurrency
	 * RedemptionBulkExecution3.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#mmRequestedNAVCurrency
	 * RedemptionBulkOrder4.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#mmRequestedNAVCurrency
	 * RedemptionOrder4.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmRequestedNAVCurrency
	 * RedemptionOrder6.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmRequestedNAVCurrency
	 * RedemptionExecution4.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmRequestedNAVCurrency
	 * RedemptionExecution6.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmRequestedNAVCurrency
	 * RedemptionOrder8.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder2#mmRequestedNAVCurrency
	 * SubscriptionBulkOrder2.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3#mmRequestedNAVCurrency
	 * SubscriptionBulkOrder3.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution2#mmRequestedNAVCurrency
	 * SubscriptionBulkExecution2.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3#mmRequestedNAVCurrency
	 * SubscriptionBulkExecution3.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4#mmRequestedNAVCurrency
	 * SubscriptionBulkOrder4.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#mmRequestedNAVCurrency
	 * SubscriptionOrder4.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmRequestedNAVCurrency
	 * SubscriptionOrder6.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmRequestedNAVCurrency
	 * SubscriptionExecution4.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmRequestedNAVCurrency
	 * SubscriptionExecution6.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmRequestedNAVCurrency
	 * SubscriptionOrder8.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder2#mmRequestedNAVCurrency
	 * SwitchRedemptionLegOrder2.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#mmRequestedNAVCurrency
	 * SwitchSubscriptionLegOrder2.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#mmRequestedNAVCurrency
	 * SwitchRedemptionLegOrder3.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmRequestedNAVCurrency
	 * SwitchSubscriptionLegOrder3.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#mmRequestedNAVCurrency
	 * SwitchRedemptionLegExecution2.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#mmRequestedNAVCurrency
	 * SwitchSubscriptionLegExecution2.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#mmRequestedNAVCurrency
	 * SwitchRedemptionLegExecution3.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#mmRequestedNAVCurrency
	 * SwitchSubscriptionLegExecution3.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#mmRequestedNAVCurrency
	 * RedemptionOrder11.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmRequestedNAVCurrency
	 * RedemptionExecution12.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#mmRequestedNAVCurrency
	 * SubscriptionOrder11.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmRequestedNAVCurrency
	 * SubscriptionExecution9.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Reinvestment1#mmRequestedNAVCurrency
	 * Reinvestment1.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Reinvestment2#mmRequestedNAVCurrency
	 * Reinvestment2.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#mmRequestedNAVCurrency
	 * SubscriptionBulkOrder5.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmRequestedNAVCurrency
	 * RedemptionBulkExecution5.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#mmRequestedNAVCurrency
	 * SubscriptionBulkExecution4.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#mmRequestedNAVCurrency
	 * RedemptionBulkOrder6.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmRequestedNAVCurrency
	 * RedemptionOrder14.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmRequestedNAVCurrency
	 * SwitchSubscriptionLegOrder6.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmRequestedNAVCurrency
	 * SubscriptionExecution13.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Reinvestment3#mmRequestedNAVCurrency
	 * Reinvestment3.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmRequestedNAVCurrency
	 * SwitchRedemptionLegOrder6.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmRequestedNAVCurrency
	 * SubscriptionOrder14.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmRequestedNAVCurrency
	 * SwitchSubscriptionLegExecution4.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmRequestedNAVCurrency
	 * RedemptionExecution15.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmRequestedNAVCurrency
	 * SwitchRedemptionLegExecution4.mmRequestedNAVCurrency}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmRequestedNAVCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmPriceCurrency, com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2.mmPriceCurrency,
					com.tools20022.repository.msg.FinancialInstrument3.mmRequestedNAVCurrency, com.tools20022.repository.msg.FinancialInstrument5.mmRequestedNAVCurrency,
					com.tools20022.repository.msg.FinancialInstrument21.mmRequestedNAVCurrency, com.tools20022.repository.msg.FinancialInstrument22.mmRequestedNAVCurrency,
					com.tools20022.repository.msg.FinancialInstrument9.mmRequestedNAVCurrency, com.tools20022.repository.msg.RedemptionBulkOrder2.mmRequestedNAVCurrency,
					com.tools20022.repository.msg.RedemptionBulkOrder3.mmRequestedNAVCurrency, com.tools20022.repository.msg.RedemptionBulkExecution2.mmRequestedNAVCurrency,
					com.tools20022.repository.msg.RedemptionBulkExecution3.mmRequestedNAVCurrency, com.tools20022.repository.msg.RedemptionBulkOrder4.mmRequestedNAVCurrency,
					com.tools20022.repository.msg.RedemptionOrder4.mmRequestedNAVCurrency, com.tools20022.repository.msg.RedemptionOrder6.mmRequestedNAVCurrency, com.tools20022.repository.msg.RedemptionExecution4.mmRequestedNAVCurrency,
					com.tools20022.repository.msg.RedemptionExecution6.mmRequestedNAVCurrency, com.tools20022.repository.msg.RedemptionOrder8.mmRequestedNAVCurrency,
					com.tools20022.repository.msg.SubscriptionBulkOrder2.mmRequestedNAVCurrency, com.tools20022.repository.msg.SubscriptionBulkOrder3.mmRequestedNAVCurrency,
					com.tools20022.repository.msg.SubscriptionBulkExecution2.mmRequestedNAVCurrency, com.tools20022.repository.msg.SubscriptionBulkExecution3.mmRequestedNAVCurrency,
					com.tools20022.repository.msg.SubscriptionBulkOrder4.mmRequestedNAVCurrency, com.tools20022.repository.msg.SubscriptionOrder4.mmRequestedNAVCurrency,
					com.tools20022.repository.msg.SubscriptionOrder6.mmRequestedNAVCurrency, com.tools20022.repository.msg.SubscriptionExecution4.mmRequestedNAVCurrency,
					com.tools20022.repository.msg.SubscriptionExecution6.mmRequestedNAVCurrency, com.tools20022.repository.msg.SubscriptionOrder8.mmRequestedNAVCurrency,
					com.tools20022.repository.msg.SwitchRedemptionLegOrder2.mmRequestedNAVCurrency, com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.mmRequestedNAVCurrency,
					com.tools20022.repository.msg.SwitchRedemptionLegOrder3.mmRequestedNAVCurrency, com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmRequestedNAVCurrency,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution2.mmRequestedNAVCurrency, com.tools20022.repository.msg.SwitchSubscriptionLegExecution2.mmRequestedNAVCurrency,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution3.mmRequestedNAVCurrency, com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.mmRequestedNAVCurrency,
					com.tools20022.repository.msg.RedemptionOrder11.mmRequestedNAVCurrency, com.tools20022.repository.msg.RedemptionExecution12.mmRequestedNAVCurrency,
					com.tools20022.repository.msg.SubscriptionOrder11.mmRequestedNAVCurrency, com.tools20022.repository.msg.SubscriptionExecution9.mmRequestedNAVCurrency, com.tools20022.repository.msg.Reinvestment1.mmRequestedNAVCurrency,
					com.tools20022.repository.msg.Reinvestment2.mmRequestedNAVCurrency, com.tools20022.repository.msg.SubscriptionBulkOrder5.mmRequestedNAVCurrency,
					com.tools20022.repository.msg.RedemptionBulkExecution5.mmRequestedNAVCurrency, com.tools20022.repository.msg.SubscriptionBulkExecution4.mmRequestedNAVCurrency,
					com.tools20022.repository.msg.RedemptionBulkOrder6.mmRequestedNAVCurrency, com.tools20022.repository.msg.RedemptionOrder14.mmRequestedNAVCurrency,
					com.tools20022.repository.msg.SwitchSubscriptionLegOrder6.mmRequestedNAVCurrency, com.tools20022.repository.msg.SubscriptionExecution13.mmRequestedNAVCurrency,
					com.tools20022.repository.msg.Reinvestment3.mmRequestedNAVCurrency, com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmRequestedNAVCurrency,
					com.tools20022.repository.msg.SubscriptionOrder14.mmRequestedNAVCurrency, com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.mmRequestedNAVCurrency,
					com.tools20022.repository.msg.RedemptionExecution15.mmRequestedNAVCurrency, com.tools20022.repository.msg.SwitchRedemptionLegExecution4.mmRequestedNAVCurrency);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedNAVCurrency";
			definition = "Currency to be used for pricing the fund. This currency must be among the set of currencies in which the price may be expressed, as stated in the prospectus.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected CurrencyCode tradingCurrency;
	/**
	 * Currency of the investment fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification1#mmBaseCurrency
	 * SecurityIdentification1.mmBaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmBaseCurrency
	 * FinancialInstrument21.mmBaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument22#mmBaseCurrency
	 * FinancialInstrument22.mmBaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast1#mmInvestmentCurrency
	 * FundCashForecast1.mmInvestmentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmInvestmentCurrency
	 * FundCashForecast3.mmInvestmentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast2#mmInvestmentCurrency
	 * FundCashForecast2.mmInvestmentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmInvestmentCurrency
	 * FundCashForecast4.mmInvestmentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast2#mmInvestmentCurrency
	 * EstimatedFundCashForecast2.mmInvestmentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast4#mmInvestmentCurrency
	 * EstimatedFundCashForecast4.mmInvestmentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1#mmInvestmentCurrency
	 * EstimatedFundCashForecast1.mmInvestmentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmInvestmentCurrency
	 * EstimatedFundCashForecast3.mmInvestmentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmInvestmentCurrency
	 * FundCashForecast7.mmInvestmentCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund2#mmCurrency
	 * Fund2.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmInvestmentCurrency
	 * EstimatedFundCashForecast6.mmInvestmentCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund1#mmCurrency
	 * Fund1.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmInvestmentCurrency
	 * FundCashForecast6.mmInvestmentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmInvestmentCurrency
	 * EstimatedFundCashForecast5.mmInvestmentCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund3#mmCurrency
	 * Fund3.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund4#mmCurrency
	 * Fund4.mmCurrency}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmTradingCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityIdentification1.mmBaseCurrency, com.tools20022.repository.msg.FinancialInstrument21.mmBaseCurrency,
					com.tools20022.repository.msg.FinancialInstrument22.mmBaseCurrency, com.tools20022.repository.msg.FundCashForecast1.mmInvestmentCurrency, com.tools20022.repository.msg.FundCashForecast3.mmInvestmentCurrency,
					com.tools20022.repository.msg.FundCashForecast2.mmInvestmentCurrency, com.tools20022.repository.msg.FundCashForecast4.mmInvestmentCurrency, com.tools20022.repository.msg.EstimatedFundCashForecast2.mmInvestmentCurrency,
					com.tools20022.repository.msg.EstimatedFundCashForecast4.mmInvestmentCurrency, com.tools20022.repository.msg.EstimatedFundCashForecast1.mmInvestmentCurrency,
					com.tools20022.repository.msg.EstimatedFundCashForecast3.mmInvestmentCurrency, com.tools20022.repository.msg.FundCashForecast7.mmInvestmentCurrency, com.tools20022.repository.msg.Fund2.mmCurrency,
					com.tools20022.repository.msg.EstimatedFundCashForecast6.mmInvestmentCurrency, com.tools20022.repository.msg.Fund1.mmCurrency, com.tools20022.repository.msg.FundCashForecast6.mmInvestmentCurrency,
					com.tools20022.repository.msg.EstimatedFundCashForecast5.mmInvestmentCurrency, com.tools20022.repository.msg.Fund3.mmCurrency, com.tools20022.repository.msg.Fund4.mmCurrency);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingCurrency";
			definition = "Currency of the investment fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected InvestmentFund investmentFund;
	/**
	 * Investment fund which is related to the investment fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmInvestmentFundClass
	 * InvestmentFund.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast1#mmFinancialInstrumentDetails
	 * FundCashForecast1.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmFinancialInstrumentDetails
	 * FundCashForecast3.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast2#mmFinancialInstrumentDetails
	 * FundCashForecast2.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmFinancialInstrumentDetails
	 * FundCashForecast4.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast2#mmFinancialInstrumentDetails
	 * EstimatedFundCashForecast2.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast4#mmFinancialInstrumentDetails
	 * EstimatedFundCashForecast4.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1#mmFinancialInstrumentDetails
	 * EstimatedFundCashForecast1.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmFinancialInstrumentDetails
	 * EstimatedFundCashForecast3.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmFinancialInstrumentDetails
	 * FundCashForecast7.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmFinancialInstrumentDetails
	 * EstimatedFundCashForecast6.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmFinancialInstrumentDetails
	 * FundCashForecast6.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmFinancialInstrumentDetails
	 * EstimatedFundCashForecast5.mmFinancialInstrumentDetails}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmInvestmentFund = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashForecast1.mmFinancialInstrumentDetails, com.tools20022.repository.msg.FundCashForecast3.mmFinancialInstrumentDetails,
					com.tools20022.repository.msg.FundCashForecast2.mmFinancialInstrumentDetails, com.tools20022.repository.msg.FundCashForecast4.mmFinancialInstrumentDetails,
					com.tools20022.repository.msg.EstimatedFundCashForecast2.mmFinancialInstrumentDetails, com.tools20022.repository.msg.EstimatedFundCashForecast4.mmFinancialInstrumentDetails,
					com.tools20022.repository.msg.EstimatedFundCashForecast1.mmFinancialInstrumentDetails, com.tools20022.repository.msg.EstimatedFundCashForecast3.mmFinancialInstrumentDetails,
					com.tools20022.repository.msg.FundCashForecast7.mmFinancialInstrumentDetails, com.tools20022.repository.msg.EstimatedFundCashForecast6.mmFinancialInstrumentDetails,
					com.tools20022.repository.msg.FundCashForecast6.mmFinancialInstrumentDetails, com.tools20022.repository.msg.EstimatedFundCashForecast5.mmFinancialInstrumentDetails);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFund";
			definition = "Investment fund which is related to the investment fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmInvestmentFundClass;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
		}
	};
	protected YesNoIndicator physicalBearerSecurities;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#mmPhysicalBearerSecurities
	 * FinancialInstrument20.mmPhysicalBearerSecurities}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmPhysicalBearerSecurities = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument20.mmPhysicalBearerSecurities);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhysicalBearerSecurities";
			definition = "Indicates whether or not it is possible to hold bearer units/shares in this class in certified form";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator dematerialisedBearerSecurities;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#mmDematerialisedBearerSecurities
	 * FinancialInstrument20.mmDematerialisedBearerSecurities}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmDematerialisedBearerSecurities = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument20.mmDematerialisedBearerSecurities);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DematerialisedBearerSecurities";
			definition = "Indicate whether or not it is possible to hold bearer units/shares in paperless form";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator physicalRegisteredSecurities;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#mmPhysicalRegisteredSecurities
	 * FinancialInstrument20.mmPhysicalRegisteredSecurities}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmPhysicalRegisteredSecurities = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument20.mmPhysicalRegisteredSecurities);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhysicalRegisteredSecurities";
			definition = "Indicate whether or not it is possible to hold registered units/shares in this class in paperless form";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator dematerialisedRegisteredSecurities;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#mmDematerialisedRegisteredSecurities
	 * FinancialInstrument20.mmDematerialisedRegisteredSecurities}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmDematerialisedRegisteredSecurities = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument20.mmDematerialisedRegisteredSecurities);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DematerialisedRegisteredSecurities";
			definition = "Indicate whether or not it is possible to hold registered units/shares in this class in paperless form";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics> processingCharacteristics;
	/**
	 * Processing characteristics linked to the investment fund class, ie, not
	 * to the market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmFundClass
	 * InvestmentFundClassProcessingCharacteristics.mmFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LocalMarketAnnex2#mmSubscriptionProcessingCharacteristics
	 * LocalMarketAnnex2.mmSubscriptionProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LocalMarketAnnex2#mmRedemptionProcessingCharacteristics
	 * LocalMarketAnnex2.mmRedemptionProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#mmValuationDealingCharacteristics
	 * FundProcessingPassport1.mmValuationDealingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#mmSubscriptionProcessingCharacteristics
	 * FundProcessingPassport1.mmSubscriptionProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#mmRedemptionProcessingCharacteristics
	 * FundProcessingPassport1.mmRedemptionProcessingCharacteristics}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmProcessingCharacteristics = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LocalMarketAnnex2.mmSubscriptionProcessingCharacteristics, com.tools20022.repository.msg.LocalMarketAnnex2.mmRedemptionProcessingCharacteristics,
					com.tools20022.repository.msg.FundProcessingPassport1.mmValuationDealingCharacteristics, com.tools20022.repository.msg.FundProcessingPassport1.mmSubscriptionProcessingCharacteristics,
					com.tools20022.repository.msg.FundProcessingPassport1.mmRedemptionProcessingCharacteristics);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessingCharacteristics";
			definition = "Processing characteristics linked to the investment fund class, ie, not to  the market.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmFundClass;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
		}
	};
	protected Max140Text productGroup;
	/**
	 * Company specific description of a group of funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument17#mmProductGroup
	 * FinancialInstrument17.mmProductGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument6#mmProductGroup
	 * FinancialInstrument6.mmProductGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument10#mmProductGroup
	 * FinancialInstrument10.mmProductGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29#mmProductGroup
	 * FinancialInstrument29.mmProductGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmProductGroup
	 * FinancialInstrument21.mmProductGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument22#mmProductGroup
	 * FinancialInstrument22.mmProductGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmProductGroup
	 * FinancialInstrument51.mmProductGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument45#mmProductGroup
	 * FinancialInstrument45.mmProductGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#mmProductGroup
	 * FinancialInstrument57.mmProductGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmProductGroup
	 * FinancialInstrument56.mmProductGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument55#mmProductGroup
	 * FinancialInstrument55.mmProductGroup}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmProductGroup = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument17.mmProductGroup, com.tools20022.repository.msg.FinancialInstrument6.mmProductGroup,
					com.tools20022.repository.msg.FinancialInstrument10.mmProductGroup, com.tools20022.repository.msg.FinancialInstrument29.mmProductGroup, com.tools20022.repository.msg.FinancialInstrument21.mmProductGroup,
					com.tools20022.repository.msg.FinancialInstrument22.mmProductGroup, com.tools20022.repository.msg.FinancialInstrument51.mmProductGroup, com.tools20022.repository.msg.FinancialInstrument45.mmProductGroup,
					com.tools20022.repository.msg.FinancialInstrument57.mmProductGroup, com.tools20022.repository.msg.FinancialInstrument56.mmProductGroup, com.tools20022.repository.msg.FinancialInstrument55.mmProductGroup);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductGroup";
			definition = "Company specific description of a group of funds.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentAccount> investmentAccount;
	/**
	 * Account which holds investment fund classes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundClass
	 * InvestmentAccount.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument26#mmTransfereeAccount
	 * FinancialInstrument26.mmTransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument30#mmTransfereeAccount
	 * FinancialInstrument30.mmTransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument25#mmTransfereeAccount
	 * FinancialInstrument25.mmTransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument27#mmTransfereeAccount
	 * FinancialInstrument27.mmTransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument32#mmTransfereeAccount
	 * FinancialInstrument32.mmTransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument24#mmTransfereeAccount
	 * FinancialInstrument24.mmTransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument33#mmTransfereeAccount
	 * FinancialInstrument33.mmTransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument23#mmTransfereeAccount
	 * FinancialInstrument23.mmTransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument31#mmTransfereeAccount
	 * FinancialInstrument31.mmTransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument37#mmTransfereeAccount
	 * FinancialInstrument37.mmTransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument37#mmSubAccountDetails
	 * FinancialInstrument37.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument35#mmTransfereeAccount
	 * FinancialInstrument35.mmTransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument35#mmSubAccountDetails
	 * FinancialInstrument35.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument34#mmTransfereeAccount
	 * FinancialInstrument34.mmTransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument34#mmSubAccountDetails
	 * FinancialInstrument34.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument36#mmTransfereeAccount
	 * FinancialInstrument36.mmTransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument36#mmSubAccountDetails
	 * FinancialInstrument36.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument40#mmTransfereeAccount
	 * FinancialInstrument40.mmTransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument40#mmSubAccountDetails
	 * FinancialInstrument40.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39#mmTransfereeAccount
	 * FinancialInstrument39.mmTransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39#mmSubAccountDetails
	 * FinancialInstrument39.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument50#mmTransfereeAccount
	 * FinancialInstrument50.mmTransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument50#mmSubAccountDetails
	 * FinancialInstrument50.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#mmTransfereeAccount
	 * FinancialInstrument48.mmTransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#mmSubAccountDetails
	 * FinancialInstrument48.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47#mmTransfereeAccount
	 * FinancialInstrument47.mmTransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47#mmSubAccountDetails
	 * FinancialInstrument47.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#mmTransfereeAccount
	 * FinancialInstrument46.mmTransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#mmSubAccountDetails
	 * FinancialInstrument46.mmSubAccountDetails}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmInvestmentAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument26.mmTransfereeAccount, com.tools20022.repository.msg.FinancialInstrument30.mmTransfereeAccount,
					com.tools20022.repository.msg.FinancialInstrument25.mmTransfereeAccount, com.tools20022.repository.msg.FinancialInstrument27.mmTransfereeAccount, com.tools20022.repository.msg.FinancialInstrument32.mmTransfereeAccount,
					com.tools20022.repository.msg.FinancialInstrument24.mmTransfereeAccount, com.tools20022.repository.msg.FinancialInstrument33.mmTransfereeAccount, com.tools20022.repository.msg.FinancialInstrument23.mmTransfereeAccount,
					com.tools20022.repository.msg.FinancialInstrument31.mmTransfereeAccount, com.tools20022.repository.msg.FinancialInstrument37.mmTransfereeAccount, com.tools20022.repository.msg.FinancialInstrument37.mmSubAccountDetails,
					com.tools20022.repository.msg.FinancialInstrument35.mmTransfereeAccount, com.tools20022.repository.msg.FinancialInstrument35.mmSubAccountDetails, com.tools20022.repository.msg.FinancialInstrument34.mmTransfereeAccount,
					com.tools20022.repository.msg.FinancialInstrument34.mmSubAccountDetails, com.tools20022.repository.msg.FinancialInstrument36.mmTransfereeAccount, com.tools20022.repository.msg.FinancialInstrument36.mmSubAccountDetails,
					com.tools20022.repository.msg.FinancialInstrument40.mmTransfereeAccount, com.tools20022.repository.msg.FinancialInstrument40.mmSubAccountDetails, com.tools20022.repository.msg.FinancialInstrument39.mmTransfereeAccount,
					com.tools20022.repository.msg.FinancialInstrument39.mmSubAccountDetails, com.tools20022.repository.msg.FinancialInstrument50.mmTransfereeAccount, com.tools20022.repository.msg.FinancialInstrument50.mmSubAccountDetails,
					com.tools20022.repository.msg.FinancialInstrument48.mmTransfereeAccount, com.tools20022.repository.msg.FinancialInstrument48.mmSubAccountDetails, com.tools20022.repository.msg.FinancialInstrument47.mmTransfereeAccount,
					com.tools20022.repository.msg.FinancialInstrument47.mmSubAccountDetails, com.tools20022.repository.msg.FinancialInstrument46.mmTransfereeAccount, com.tools20022.repository.msg.FinancialInstrument46.mmSubAccountDetails);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccount";
			definition = "Account which holds investment fund classes.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmInvestmentFundClass;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
		}
	};
	protected NetAssetValueCalculation netAssetValueCalculation;
	/**
	 * Calculation of the value of the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmRelatedFund
	 * NetAssetValueCalculation.mmRelatedFund}</li>
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
	public static final MMBusinessAssociationEnd mmNetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Calculation of the value of the fund.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmRelatedFund;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentFundTransaction> investmentFundTransaction;
	/**
	 * Transaction which is related to the fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
	 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
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
	public static final MMBusinessAssociationEnd mmInvestmentFundTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundTransaction";
			definition = "Transaction which is related to the fund class.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundClass;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
		}
	};
	protected ISODate seriesIssueIdentificationDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument18#mmSeriesIssueIdentificationDate
	 * FinancialInstrument18.mmSeriesIssueIdentificationDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Series1#mmSeriesDate
	 * Series1.mmSeriesDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DateFormat42Choice#mmYearMonth
	 * DateFormat42Choice.mmYearMonth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DateFormat42Choice#mmYearMonthDay
	 * DateFormat42Choice.mmYearMonthDay}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmSeriesIssueIdentificationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument18.mmSeriesIssueIdentificationDate, com.tools20022.repository.msg.Series1.mmSeriesDate,
					com.tools20022.repository.choice.DateFormat42Choice.mmYearMonth, com.tools20022.repository.choice.DateFormat42Choice.mmYearMonthDay);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SeriesIssueIdentificationDate";
			definition = "Date that identifies the issue of a fund series. Typically applicable to a redemption or order confirmation, but may be specified in the subscription, if known.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Max35Text seriesName;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument18#mmSeriesName
	 * FinancialInstrument18.mmSeriesName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Series1#mmSeriesName
	 * Series1.mmSeriesName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#mmSeriesIdentification
	 * FinancialInstrument57.mmSeriesIdentification}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmSeriesName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument18.mmSeriesName, com.tools20022.repository.msg.Series1.mmSeriesName,
					com.tools20022.repository.msg.FinancialInstrument57.mmSeriesIdentification);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SeriesName";
			definition = "Identifies the name of a fund series. Typically applicable to a redemption or order confirmation, but may be specified in the subscription, if known.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected YesNoIndicator newIssueIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument18#mmNewIssueIndicator
	 * FinancialInstrument18.mmNewIssueIndicator}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmNewIssueIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument18.mmNewIssueIndicator);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewIssueIndicator";
			definition = "Indicates that the financial instrument and/or series included in the message is a new issue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Equalisation equalisation;
	/**
	 * Part of an investor's subscription amount that is held by the fund in
	 * order to pay incentive / performance fees at the end of the fiscal year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Equalisation#mmRelatedInvestmentFundTransaction
	 * Equalisation.mmRelatedInvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Equalisation
	 * Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmEqualisation
	 * RedemptionOrder5.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmEqualisation
	 * RedemptionExecution5.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmEqualisation
	 * RedemptionOrder7.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmEqualisation
	 * RedemptionOrder6.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmEqualisation
	 * RedemptionExecution6.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmEqualisation
	 * RedemptionOrder8.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmEqualisation
	 * SubscriptionOrder5.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmEqualisation
	 * SubscriptionExecution5.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmEqualisation
	 * SubscriptionOrder7.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmEqualisation
	 * SubscriptionOrder6.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmEqualisation
	 * SubscriptionExecution6.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmEqualisation
	 * SubscriptionOrder8.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#mmEqualisation
	 * SwitchRedemptionLegOrder3.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmEqualisation
	 * SwitchSubscriptionLegOrder3.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#mmEqualisation
	 * SwitchRedemptionLegExecution3.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#mmEqualisation
	 * SwitchSubscriptionLegExecution3.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation5#mmEqualisationBalance
	 * AggregateBalanceInformation5.mmEqualisationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmEqualisation
	 * RedemptionExecution10.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmEqualisation
	 * SubscriptionExecution7.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmEqualisation
	 * RedemptionOrder14.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmEqualisation
	 * SwitchSubscriptionLegOrder6.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmEqualisation
	 * SubscriptionExecution13.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmEqualisation
	 * SubscriptionExecution12.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmEqualisation
	 * SubscriptionOrder15.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmEqualisation
	 * SwitchRedemptionLegOrder6.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmEqualisation
	 * RedemptionOrder15.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmEqualisation
	 * RedemptionExecution16.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmEqualisation
	 * SubscriptionOrder14.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmEqualisation
	 * SwitchSubscriptionLegExecution4.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmEqualisation
	 * RedemptionExecution15.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmEqualisation
	 * SwitchRedemptionLegExecution4.mmEqualisation}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmEqualisation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionOrder5.mmEqualisation, com.tools20022.repository.msg.RedemptionExecution5.mmEqualisation,
					com.tools20022.repository.msg.RedemptionOrder7.mmEqualisation, com.tools20022.repository.msg.RedemptionOrder6.mmEqualisation, com.tools20022.repository.msg.RedemptionExecution6.mmEqualisation,
					com.tools20022.repository.msg.RedemptionOrder8.mmEqualisation, com.tools20022.repository.msg.SubscriptionOrder5.mmEqualisation, com.tools20022.repository.msg.SubscriptionExecution5.mmEqualisation,
					com.tools20022.repository.msg.SubscriptionOrder7.mmEqualisation, com.tools20022.repository.msg.SubscriptionOrder6.mmEqualisation, com.tools20022.repository.msg.SubscriptionExecution6.mmEqualisation,
					com.tools20022.repository.msg.SubscriptionOrder8.mmEqualisation, com.tools20022.repository.msg.SwitchRedemptionLegOrder3.mmEqualisation, com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmEqualisation,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution3.mmEqualisation, com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.mmEqualisation,
					com.tools20022.repository.msg.AggregateBalanceInformation5.mmEqualisationBalance, com.tools20022.repository.msg.RedemptionExecution10.mmEqualisation, com.tools20022.repository.msg.SubscriptionExecution7.mmEqualisation,
					com.tools20022.repository.msg.RedemptionOrder14.mmEqualisation, com.tools20022.repository.msg.SwitchSubscriptionLegOrder6.mmEqualisation, com.tools20022.repository.msg.SubscriptionExecution13.mmEqualisation,
					com.tools20022.repository.msg.SubscriptionExecution12.mmEqualisation, com.tools20022.repository.msg.SubscriptionOrder15.mmEqualisation, com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmEqualisation,
					com.tools20022.repository.msg.RedemptionOrder15.mmEqualisation, com.tools20022.repository.msg.RedemptionExecution16.mmEqualisation, com.tools20022.repository.msg.SubscriptionOrder14.mmEqualisation,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.mmEqualisation, com.tools20022.repository.msg.RedemptionExecution15.mmEqualisation,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution4.mmEqualisation);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Equalisation";
			definition = "Part of an investor's subscription amount that is held by the fund in order to pay incentive / performance fees at the end of the fiscal year.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Equalisation.mmRelatedInvestmentFundTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Equalisation.mmObject();
		}
	};
	protected CurrencyAndAmount topUpAmount;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3#mmTopUpAmount
	 * ExpectedExecutionDetails3.mmTopUpAmount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmTopUpAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExpectedExecutionDetails3.mmTopUpAmount);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TopUpAmount";
			definition = "Additional amount of money (top-up amount) required to meet the minimum subscription amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyAndAmount holdBackAmount;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation1#mmHoldBackAmount
	 * HoldBackInformation1.mmHoldBackAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2#mmAmount
	 * HoldBackInformation2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3#mmAmount
	 * HoldBackInformation3.mmAmount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmHoldBackAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays
					.asList(com.tools20022.repository.msg.HoldBackInformation1.mmHoldBackAmount, com.tools20022.repository.msg.HoldBackInformation2.mmAmount, com.tools20022.repository.msg.HoldBackInformation3.mmAmount);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldBackAmount";
			definition = "Value of the redemption amount subject to hold back.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected ISODate holdBackReleaseDate;
	/**
	 * Date on which the hold back amount is to be released.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation1#mmHoldBackReleaseDate
	 * HoldBackInformation1.mmHoldBackReleaseDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2#mmExpectedReleaseDate
	 * HoldBackInformation2.mmExpectedReleaseDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3#mmExpectedReleaseDate
	 * HoldBackInformation3.mmExpectedReleaseDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmHoldBackReleaseDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.HoldBackInformation1.mmHoldBackReleaseDate, com.tools20022.repository.msg.HoldBackInformation2.mmExpectedReleaseDate,
					com.tools20022.repository.msg.HoldBackInformation3.mmExpectedReleaseDate);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldBackReleaseDate";
			definition = "Date on which the hold back amount is to be released.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Max350Text lotDescription;
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
	public static final MMBusinessAttribute mmLotDescription = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LotDescription";
			definition = "Description of the lot.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected GenericIdentification fundClassification;
	/**
	 * Method of classifying a fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForInvestmentFundClass
	 * GenericIdentification.mmIdentificationForInvestmentFundClass}</li>
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
	public static final MMBusinessAssociationEnd mmFundClassification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundClassification";
			definition = "Method of classifying a fund.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmIdentificationForInvestmentFundClass;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected FinancialInstrumentProductTypeCode underlyingAssetType;
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
	public static final MMBusinessAttribute mmUnderlyingAssetType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingAssetType";
			definition = "Specifies the type of assets in which the fund invests.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
		}
	};
	protected InvestorTypeCode investorType;
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
	public static final MMBusinessAttribute mmInvestorType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestorType";
			definition = "Type of investor that can invest in the fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestorTypeCode.mmObject();
		}
	};
	protected Reinvestment reinvestment;
	/**
	 * Reinvestment information which involves this investment fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reinvestment#mmInvestmentFundClass
	 * Reinvestment.mmInvestmentFundClass}</li>
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
	public static final MMBusinessAssociationEnd mmReinvestment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reinvestment";
			definition = "Reinvestment information which involves this investment fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Reinvestment.mmInvestmentFundClass;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reinvestment.mmObject();
		}
	};
	protected DecimalNumber outstandingUnits;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFund1#mmTotalUnitsOutstanding
	 * InvestmentFund1.mmTotalUnitsOutstanding}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmOutstandingUnits = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFund1.mmTotalUnitsOutstanding);
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OutstandingUnits";
			definition = "Investment fund class currently held by shareholders.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundClass";
				definition = "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, for example, a dividend option or valuation currency.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmIdentificationForInvestmentFundClass, com.tools20022.repository.entity.InvestmentFund.mmInvestmentFundClass,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmFundClass, com.tools20022.repository.entity.NetAssetValueCalculation.mmRelatedFund,
						com.tools20022.repository.entity.InvestmentAccount.mmInvestmentFundClass, com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundClass,
						com.tools20022.repository.entity.Equalisation.mmRelatedInvestmentFundTransaction, com.tools20022.repository.entity.Reinvestment.mmInvestmentFundClass);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Repartition1.mmFinancialInstrument, com.tools20022.repository.msg.InvestmentPlan4.mmSecurityDetails,
						com.tools20022.repository.msg.BlockedHoldingDetails1.mmBlockedHolding, com.tools20022.repository.msg.FinancialInstrument29.mmBlockedHoldingDetails, com.tools20022.repository.msg.Repartition2.mmFinancialInstrument,
						com.tools20022.repository.msg.InvestmentPlan6.mmSecurityDetails, com.tools20022.repository.msg.PEPISATransfer1.mmAssets, com.tools20022.repository.msg.PEPISATransfer6.mmFinancialInstrumentAssetForTransfer,
						com.tools20022.repository.msg.ISATransfer4.mmFinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.ISATransfer6.mmFinancialInstrumentAssetForTransfer,
						com.tools20022.repository.msg.InvestmentPlan5.mmSecurityDetails, com.tools20022.repository.msg.InvestmentPlan3.mmSecurityDetails, com.tools20022.repository.msg.InvestmentPlan7.mmSecurityDetails,
						com.tools20022.repository.msg.PEPISATransfer8.mmFinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.ISATransfer3.mmFinancialInstrumentAssetForTransfer,
						com.tools20022.repository.msg.ISATransfer8.mmFinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.Unit2.mmInstrument,
						com.tools20022.repository.msg.PEPISATransfer4.mmFinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.ISATransfer2.mmFinancialInstrumentAssetForTransfer,
						com.tools20022.repository.msg.ISATransfer10.mmFinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.PEPISATransfer3.mmFinancialInstrumentAssetForTransfer,
						com.tools20022.repository.msg.ISATransfer1.mmFinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.ISATransfer7.mmFinancialInstrumentAssetForTransfer,
						com.tools20022.repository.msg.TransferIn1.mmFinancialInstrumentDetails, com.tools20022.repository.msg.TransferIn4.mmFinancialInstrumentDetails, com.tools20022.repository.msg.Transfer17.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.TransferOut1.mmFinancialInstrumentDetails, com.tools20022.repository.msg.TransferOut6.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.Transfer14.mmFinancialInstrumentDetails, com.tools20022.repository.msg.Transfer24.mmFinancialInstrumentDetails, com.tools20022.repository.msg.Transfer25.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.TransferIn2.mmFinancialInstrumentDetails, com.tools20022.repository.msg.TransferIn3.mmFinancialInstrumentDetails, com.tools20022.repository.msg.Transfer16.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.TransferOut2.mmFinancialInstrumentDetails, com.tools20022.repository.msg.TransferOut5.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.Transfer12.mmFinancialInstrumentDetails, com.tools20022.repository.msg.Transfer20.mmFinancialInstrumentDetails, com.tools20022.repository.msg.Transfer22.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.Transfer18.mmFinancialInstrumentDetails, com.tools20022.repository.msg.Transfer26.mmFinancialInstrumentDetails, com.tools20022.repository.msg.Transfer15.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.Transfer21.mmFinancialInstrumentDetails, com.tools20022.repository.msg.Transfer13.mmFinancialInstrumentDetails, com.tools20022.repository.msg.Transfer23.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.Transfer11.mmFinancialInstrumentDetails, com.tools20022.repository.msg.Transfer19.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.AggregateBalanceInformation8.mmInvestmentFundsFinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation11.mmInvestmentFundsFinancialInstrumentAttributes,
						com.tools20022.repository.msg.AggregateBalanceInformation2.mmFinancialInstrumentDetails, com.tools20022.repository.msg.AggregateBalanceInformation3.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.AggregateBalanceInformation13.mmInvestmentFundsFinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation15.mmInvestmentFundsFinancialInstrumentAttributes,
						com.tools20022.repository.msg.AggregateBalanceInformation17.mmInvestmentFundsFinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation19.mmInvestmentFundsFinancialInstrumentAttributes,
						com.tools20022.repository.msg.AggregateBalanceInformation22.mmInvestmentFundsFinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation23.mmInvestmentFundsFinancialInstrumentAttributes,
						com.tools20022.repository.msg.AggregateBalanceInformation9.mmInvestmentFundsFinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation10.mmInvestmentFundsFinancialInstrumentAttributes,
						com.tools20022.repository.msg.AggregateBalanceInformation1.mmFinancialInstrumentDetails, com.tools20022.repository.msg.AggregateBalanceInformation4.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.AggregateBalanceInformation12.mmInvestmentFundsFinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation14.mmInvestmentFundsFinancialInstrumentAttributes,
						com.tools20022.repository.msg.AggregateBalanceInformation16.mmInvestmentFundsFinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation18.mmInvestmentFundsFinancialInstrumentAttributes,
						com.tools20022.repository.msg.AggregateBalanceInformation21.mmInvestmentFundsFinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation24.mmInvestmentFundsFinancialInstrumentAttributes,
						com.tools20022.repository.msg.PEPISATransfer5.mmFinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.ISATransfer5.mmFinancialInstrumentAssetForTransfer,
						com.tools20022.repository.msg.InvestmentFund1.mmFinancialInstrumentIdentification, com.tools20022.repository.msg.TotalPortfolioValuation1.mmInvestmentFundDetails,
						com.tools20022.repository.msg.AggregateBalanceInformation5.mmFinancialInstrumentDetails, com.tools20022.repository.msg.PEPISACashTransfer1.mmAssets, com.tools20022.repository.msg.UnitsAndCash.mmInstrument,
						com.tools20022.repository.msg.AggregateBalanceInformation20.mmInvestmentFundsFinancialInstrumentAttributes, com.tools20022.repository.choice.InstrumentIdentification1Choice.mmInvestmentFund,
						com.tools20022.repository.choice.InstrumentIdentification2Choice.mmInvestmentFund, com.tools20022.repository.msg.InvestmentPlan9.mmSecurityDetails, com.tools20022.repository.msg.InvestmentPlan8.mmSecurityDetails,
						com.tools20022.repository.msg.Transfer27.mmFinancialInstrumentDetails, com.tools20022.repository.msg.Transfer28.mmFinancialInstrumentDetails, com.tools20022.repository.msg.Transfer29.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.ISATransfer15.mmFinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.ISATransfer16.mmFinancialInstrumentAssetForTransfer,
						com.tools20022.repository.msg.ISATransfer13.mmFinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.ISATransfer14.mmFinancialInstrumentAssetForTransfer,
						com.tools20022.repository.msg.ISATransfer21.mmFinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.InvestmentPlan10.mmSecurityDetails,
						com.tools20022.repository.msg.ISATransfer18.mmFinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.Repartition3.mmFinancialInstrument, com.tools20022.repository.msg.InvestmentPlan11.mmSecurityDetails,
						com.tools20022.repository.msg.AggregateBalanceInformation26.mmInvestmentFundsFinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation25.mmInvestmentFundsFinancialInstrumentAttributes,
						com.tools20022.repository.msg.AggregateBalanceInformation28.mmInvestmentFundsFinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation27.mmInvestmentFundsFinancialInstrumentAttributes,
						com.tools20022.repository.msg.AggregateBalanceInformation30.mmInvestmentFundsFinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation31.mmInvestmentFundsFinancialInstrumentAttributes,
						com.tools20022.repository.msg.ISATransfer23.mmFinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.InvestmentPlan12.mmSecurityDetails,
						com.tools20022.repository.msg.ISATransfer26.mmFinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.Transfer31.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.Transfer30.mmFinancialInstrumentDetails, com.tools20022.repository.msg.Transfer32.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.ISATransfer27.mmFinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.Transfer33.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.ISATransfer22.mmFinancialInstrumentAssetForTransfer, com.tools20022.repository.msg.FinancialInstrument51.mmBlockedHoldingDetails,
						com.tools20022.repository.msg.InvestmentPlan13.mmSecurityDetails, com.tools20022.repository.msg.Repartition4.mmFinancialInstrument, com.tools20022.repository.msg.BlockedHoldingDetails2.mmBlockedHolding,
						com.tools20022.repository.msg.AggregateBalanceInformation32.mmInvestmentFundsFinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation33.mmInvestmentFundsFinancialInstrumentAttributes,
						com.tools20022.repository.msg.InvestmentPlan14.mmSecurityDetails, com.tools20022.repository.msg.InvestmentPlan15.mmSecurityDetails, com.tools20022.repository.msg.Repartition5.mmFinancialInstrument,
						com.tools20022.repository.msg.FinancialInstrument56.mmBlockedHoldingDetails);
				superType_lazy = () -> Security.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.mmClassType, com.tools20022.repository.entity.InvestmentFundClass.mmDistributionPolicy,
						com.tools20022.repository.entity.InvestmentFundClass.mmDividendPolicy, com.tools20022.repository.entity.InvestmentFundClass.mmDualFundIndicator,
						com.tools20022.repository.entity.InvestmentFundClass.mmRequestedNAVCurrency, com.tools20022.repository.entity.InvestmentFundClass.mmTradingCurrency,
						com.tools20022.repository.entity.InvestmentFundClass.mmInvestmentFund, com.tools20022.repository.entity.InvestmentFundClass.mmPhysicalBearerSecurities,
						com.tools20022.repository.entity.InvestmentFundClass.mmDematerialisedBearerSecurities, com.tools20022.repository.entity.InvestmentFundClass.mmPhysicalRegisteredSecurities,
						com.tools20022.repository.entity.InvestmentFundClass.mmDematerialisedRegisteredSecurities, com.tools20022.repository.entity.InvestmentFundClass.mmProcessingCharacteristics,
						com.tools20022.repository.entity.InvestmentFundClass.mmProductGroup, com.tools20022.repository.entity.InvestmentFundClass.mmInvestmentAccount,
						com.tools20022.repository.entity.InvestmentFundClass.mmNetAssetValueCalculation, com.tools20022.repository.entity.InvestmentFundClass.mmInvestmentFundTransaction,
						com.tools20022.repository.entity.InvestmentFundClass.mmSeriesIssueIdentificationDate, com.tools20022.repository.entity.InvestmentFundClass.mmSeriesName,
						com.tools20022.repository.entity.InvestmentFundClass.mmNewIssueIndicator, com.tools20022.repository.entity.InvestmentFundClass.mmEqualisation, com.tools20022.repository.entity.InvestmentFundClass.mmTopUpAmount,
						com.tools20022.repository.entity.InvestmentFundClass.mmHoldBackAmount, com.tools20022.repository.entity.InvestmentFundClass.mmHoldBackReleaseDate,
						com.tools20022.repository.entity.InvestmentFundClass.mmLotDescription, com.tools20022.repository.entity.InvestmentFundClass.mmFundClassification,
						com.tools20022.repository.entity.InvestmentFundClass.mmUnderlyingAssetType, com.tools20022.repository.entity.InvestmentFundClass.mmInvestorType, com.tools20022.repository.entity.InvestmentFundClass.mmReinvestment,
						com.tools20022.repository.entity.InvestmentFundClass.mmOutstandingUnits);
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

	public Max35Text getClassType() {
		return classType;
	}

	public void setClassType(Max35Text classType) {
		this.classType = classType;
	}

	public DistributionPolicyCode getDistributionPolicy() {
		return distributionPolicy;
	}

	public void setDistributionPolicy(DistributionPolicyCode distributionPolicy) {
		this.distributionPolicy = distributionPolicy;
	}

	public DividendPolicyCode getDividendPolicy() {
		return dividendPolicy;
	}

	public void setDividendPolicy(DividendPolicyCode dividendPolicy) {
		this.dividendPolicy = dividendPolicy;
	}

	public YesNoIndicator getDualFundIndicator() {
		return dualFundIndicator;
	}

	public void setDualFundIndicator(YesNoIndicator dualFundIndicator) {
		this.dualFundIndicator = dualFundIndicator;
	}

	public CurrencyCode getRequestedNAVCurrency() {
		return requestedNAVCurrency;
	}

	public void setRequestedNAVCurrency(CurrencyCode requestedNAVCurrency) {
		this.requestedNAVCurrency = requestedNAVCurrency;
	}

	public CurrencyCode getTradingCurrency() {
		return tradingCurrency;
	}

	public void setTradingCurrency(CurrencyCode tradingCurrency) {
		this.tradingCurrency = tradingCurrency;
	}

	public InvestmentFund getInvestmentFund() {
		return investmentFund;
	}

	public void setInvestmentFund(com.tools20022.repository.entity.InvestmentFund investmentFund) {
		this.investmentFund = investmentFund;
	}

	public YesNoIndicator getPhysicalBearerSecurities() {
		return physicalBearerSecurities;
	}

	public void setPhysicalBearerSecurities(YesNoIndicator physicalBearerSecurities) {
		this.physicalBearerSecurities = physicalBearerSecurities;
	}

	public YesNoIndicator getDematerialisedBearerSecurities() {
		return dematerialisedBearerSecurities;
	}

	public void setDematerialisedBearerSecurities(YesNoIndicator dematerialisedBearerSecurities) {
		this.dematerialisedBearerSecurities = dematerialisedBearerSecurities;
	}

	public YesNoIndicator getPhysicalRegisteredSecurities() {
		return physicalRegisteredSecurities;
	}

	public void setPhysicalRegisteredSecurities(YesNoIndicator physicalRegisteredSecurities) {
		this.physicalRegisteredSecurities = physicalRegisteredSecurities;
	}

	public YesNoIndicator getDematerialisedRegisteredSecurities() {
		return dematerialisedRegisteredSecurities;
	}

	public void setDematerialisedRegisteredSecurities(YesNoIndicator dematerialisedRegisteredSecurities) {
		this.dematerialisedRegisteredSecurities = dematerialisedRegisteredSecurities;
	}

	public List<InvestmentFundClassProcessingCharacteristics> getProcessingCharacteristics() {
		return processingCharacteristics;
	}

	public void setProcessingCharacteristics(List<com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics> processingCharacteristics) {
		this.processingCharacteristics = processingCharacteristics;
	}

	public Max140Text getProductGroup() {
		return productGroup;
	}

	public void setProductGroup(Max140Text productGroup) {
		this.productGroup = productGroup;
	}

	public List<InvestmentAccount> getInvestmentAccount() {
		return investmentAccount;
	}

	public void setInvestmentAccount(List<com.tools20022.repository.entity.InvestmentAccount> investmentAccount) {
		this.investmentAccount = investmentAccount;
	}

	public NetAssetValueCalculation getNetAssetValueCalculation() {
		return netAssetValueCalculation;
	}

	public void setNetAssetValueCalculation(com.tools20022.repository.entity.NetAssetValueCalculation netAssetValueCalculation) {
		this.netAssetValueCalculation = netAssetValueCalculation;
	}

	public List<InvestmentFundTransaction> getInvestmentFundTransaction() {
		return investmentFundTransaction;
	}

	public void setInvestmentFundTransaction(List<com.tools20022.repository.entity.InvestmentFundTransaction> investmentFundTransaction) {
		this.investmentFundTransaction = investmentFundTransaction;
	}

	public ISODate getSeriesIssueIdentificationDate() {
		return seriesIssueIdentificationDate;
	}

	public void setSeriesIssueIdentificationDate(ISODate seriesIssueIdentificationDate) {
		this.seriesIssueIdentificationDate = seriesIssueIdentificationDate;
	}

	public Max35Text getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(Max35Text seriesName) {
		this.seriesName = seriesName;
	}

	public YesNoIndicator getNewIssueIndicator() {
		return newIssueIndicator;
	}

	public void setNewIssueIndicator(YesNoIndicator newIssueIndicator) {
		this.newIssueIndicator = newIssueIndicator;
	}

	public Equalisation getEqualisation() {
		return equalisation;
	}

	public void setEqualisation(com.tools20022.repository.entity.Equalisation equalisation) {
		this.equalisation = equalisation;
	}

	public CurrencyAndAmount getTopUpAmount() {
		return topUpAmount;
	}

	public void setTopUpAmount(CurrencyAndAmount topUpAmount) {
		this.topUpAmount = topUpAmount;
	}

	public CurrencyAndAmount getHoldBackAmount() {
		return holdBackAmount;
	}

	public void setHoldBackAmount(CurrencyAndAmount holdBackAmount) {
		this.holdBackAmount = holdBackAmount;
	}

	public ISODate getHoldBackReleaseDate() {
		return holdBackReleaseDate;
	}

	public void setHoldBackReleaseDate(ISODate holdBackReleaseDate) {
		this.holdBackReleaseDate = holdBackReleaseDate;
	}

	public Max350Text getLotDescription() {
		return lotDescription;
	}

	public void setLotDescription(Max350Text lotDescription) {
		this.lotDescription = lotDescription;
	}

	public GenericIdentification getFundClassification() {
		return fundClassification;
	}

	public void setFundClassification(com.tools20022.repository.entity.GenericIdentification fundClassification) {
		this.fundClassification = fundClassification;
	}

	public FinancialInstrumentProductTypeCode getUnderlyingAssetType() {
		return underlyingAssetType;
	}

	public void setUnderlyingAssetType(FinancialInstrumentProductTypeCode underlyingAssetType) {
		this.underlyingAssetType = underlyingAssetType;
	}

	public InvestorTypeCode getInvestorType() {
		return investorType;
	}

	public void setInvestorType(InvestorTypeCode investorType) {
		this.investorType = investorType;
	}

	public Reinvestment getReinvestment() {
		return reinvestment;
	}

	public void setReinvestment(com.tools20022.repository.entity.Reinvestment reinvestment) {
		this.reinvestment = reinvestment;
	}

	public DecimalNumber getOutstandingUnits() {
		return outstandingUnits;
	}

	public void setOutstandingUnits(DecimalNumber outstandingUnits) {
		this.outstandingUnits = outstandingUnits;
	}
}