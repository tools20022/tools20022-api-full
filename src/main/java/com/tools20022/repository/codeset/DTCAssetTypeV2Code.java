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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.DTCAssetTypeV2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies DTC (The Depository Trust Company) security sub-issue type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#Equity
 * DTCAssetTypeV2Code.Equity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#CommonStock
 * DTCAssetTypeV2Code.CommonStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#ConvertibleCommonStock
 * DTCAssetTypeV2Code.ConvertibleCommonStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#CommonStockREIT
 * DTCAssetTypeV2Code.CommonStockREIT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#PreferredStock
 * DTCAssetTypeV2Code.PreferredStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#PreferredStockREIT
 * DTCAssetTypeV2Code.PreferredStockREIT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#ConvertiblePreferredStock
 * DTCAssetTypeV2Code.ConvertiblePreferredStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#TenderRatePreferredStock
 * DTCAssetTypeV2Code.TenderRatePreferredStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#LimitedPartnership
 * DTCAssetTypeV2Code.LimitedPartnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#CMODenominationUnitsOrUndividedInterest
 * DTCAssetTypeV2Code.CMODenominationUnitsOrUndividedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#ABSDenominationUnitsOrUndividedInterest
 * DTCAssetTypeV2Code.ABSDenominationUnitsOrUndividedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#IssueDenominationUnitsOrUndividedInterest
 * DTCAssetTypeV2Code.IssueDenominationUnitsOrUndividedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#AuctionRatePreferredStock
 * DTCAssetTypeV2Code.AuctionRatePreferredStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#AmericanDepositaryReceipt
 * DTCAssetTypeV2Code.AmericanDepositaryReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#DepositaryShare
 * DTCAssetTypeV2Code.DepositaryShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#MunicipalOptionCallRight
 * DTCAssetTypeV2Code.MunicipalOptionCallRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#ExchangeTradedFunds
 * DTCAssetTypeV2Code.ExchangeTradedFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#MMIPreferredStockCPLike
 * DTCAssetTypeV2Code.MMIPreferredStockCPLike}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#SealedEnvelope
 * DTCAssetTypeV2Code.SealedEnvelope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#CustodyUserCUSIP
 * DTCAssetTypeV2Code.CustodyUserCUSIP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#RealEstateInvestmentTrust
 * DTCAssetTypeV2Code.RealEstateInvestmentTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#MunicipalBond
 * DTCAssetTypeV2Code.MunicipalBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#MunicipalNote
 * DTCAssetTypeV2Code.MunicipalNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#MunicipalAuctionRateNote
 * DTCAssetTypeV2Code.MunicipalAuctionRateNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#MunicipalVariableModeObligation
 * DTCAssetTypeV2Code.MunicipalVariableModeObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#MunicipalVariableRateDemandObligation
 * DTCAssetTypeV2Code.MunicipalVariableRateDemandObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#MunicipalInsuredCustodialReceipt
 * DTCAssetTypeV2Code.MunicipalInsuredCustodialReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#MMIMunicipalVariableRateDemandObligation
 * DTCAssetTypeV2Code.MMIMunicipalVariableRateDemandObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#MMIMunicipalCommercialPaper
 * DTCAssetTypeV2Code.MMIMunicipalCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#BearerCallableZeroCouponBond
 * DTCAssetTypeV2Code.BearerCallableZeroCouponBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#GNMARealEstateMortgageInvestmentConduit
 * DTCAssetTypeV2Code.GNMARealEstateMortgageInvestmentConduit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#GNMAPassThroughSecurity
 * DTCAssetTypeV2Code.GNMAPassThroughSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#GNMASerialNoteSecurity
 * DTCAssetTypeV2Code.GNMASerialNoteSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#CorporateBondOrGlobal
 * DTCAssetTypeV2Code.CorporateBondOrGlobal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#MMIBankersAcceptanceNote
 * DTCAssetTypeV2Code.MMIBankersAcceptanceNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#MMIInstitutionalCertificatesOfDeposit
 * DTCAssetTypeV2Code.MMIInstitutionalCertificatesOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#CertificatedMoneyMarketInstrument
 * DTCAssetTypeV2Code.CertificatedMoneyMarketInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#CertificatedMoneyMarketPeriodicPayer
 * DTCAssetTypeV2Code.CertificatedMoneyMarketPeriodicPayer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#CertificatesOfDeposit
 * DTCAssetTypeV2Code.CertificatesOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#ConsumerPriceIndexAtMaturityCP
 * DTCAssetTypeV2Code.ConsumerPriceIndexAtMaturityCP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#PeriodicPaymentCommercialPaper
 * DTCAssetTypeV2Code.PeriodicPaymentCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#ConsumerPriceIndexDiscountCP
 * DTCAssetTypeV2Code.ConsumerPriceIndexDiscountCP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#MMICorporateCommercialPaper
 * DTCAssetTypeV2Code.MMICorporateCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#MMICorporateVariableRateDemandObligation
 * DTCAssetTypeV2Code.MMICorporateVariableRateDemandObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#MediumTermNote
 * DTCAssetTypeV2Code.MediumTermNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#MMIDepositNote
 * DTCAssetTypeV2Code.MMIDepositNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#MMIMediumTermBankNote
 * DTCAssetTypeV2Code.MMIMediumTermBankNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#MMIMediumTermNote
 * DTCAssetTypeV2Code.MMIMediumTermNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#CollateralizedMortgageObligationOrGlobal
 * DTCAssetTypeV2Code.CollateralizedMortgageObligationOrGlobal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#AssetBackedSecurityOrGlobal
 * DTCAssetTypeV2Code.AssetBackedSecurityOrGlobal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#NonCMOABSAmortizingIssue
 * DTCAssetTypeV2Code.NonCMOABSAmortizingIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#MMIShortTermBankNote
 * DTCAssetTypeV2Code.MMIShortTermBankNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#ZCPNDenominationInitialPrincipalAmount
 * DTCAssetTypeV2Code.ZCPNDenominationInitialPrincipalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#MMIDiscountNote
 * DTCAssetTypeV2Code.MMIDiscountNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#CorporateAuctionRateNote
 * DTCAssetTypeV2Code.CorporateAuctionRateNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#ConvertibleCorporateDebt
 * DTCAssetTypeV2Code.ConvertibleCorporateDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#CorporateVariableModeObligation
 * DTCAssetTypeV2Code.CorporateVariableModeObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#CorporateShortTermNote
 * DTCAssetTypeV2Code.CorporateShortTermNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#CorporateDebenture
 * DTCAssetTypeV2Code.CorporateDebenture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#CorporateOrMunicipalVariableRateDemandObligation
 * DTCAssetTypeV2Code.CorporateOrMunicipalVariableRateDemandObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#CorporateInsuredCustodialReceipt
 * DTCAssetTypeV2Code.CorporateInsuredCustodialReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#TenderRateNote
 * DTCAssetTypeV2Code.TenderRateNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#ZeroCouponBond
 * DTCAssetTypeV2Code.ZeroCouponBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#GovernmentSecurity
 * DTCAssetTypeV2Code.GovernmentSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#GovernmentTrustCertificate
 * DTCAssetTypeV2Code.GovernmentTrustCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#JunkAndTreasuryGrowthReceipt
 * DTCAssetTypeV2Code.JunkAndTreasuryGrowthReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#USTreasurySecurity
 * DTCAssetTypeV2Code.USTreasurySecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#USTreasuryBill
 * DTCAssetTypeV2Code.USTreasuryBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#USTreasuryNote
 * DTCAssetTypeV2Code.USTreasuryNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#USTreasuryBond
 * DTCAssetTypeV2Code.USTreasuryBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#USGovernmentAgencySecurity
 * DTCAssetTypeV2Code.USGovernmentAgencySecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#GovernmentNationallMortgageAssociation
 * DTCAssetTypeV2Code.GovernmentNationallMortgageAssociation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#RealEstateMortgageInvestmentConduit
 * DTCAssetTypeV2Code.RealEstateMortgageInvestmentConduit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#GNMASerialNote
 * DTCAssetTypeV2Code.GNMASerialNote}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#Package
 * DTCAssetTypeV2Code.Package}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#CorporateDebtDerivative
 * DTCAssetTypeV2Code.CorporateDebtDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#EquityDerivative
 * DTCAssetTypeV2Code.EquityDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#MunicipalDerivative
 * DTCAssetTypeV2Code.MunicipalDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#MunicipalAmortizedIssue
 * DTCAssetTypeV2Code.MunicipalAmortizedIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#OptionDerivative
 * DTCAssetTypeV2Code.OptionDerivative}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#Warrant
 * DTCAssetTypeV2Code.Warrant}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#Right
 * DTCAssetTypeV2Code.Right}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#MutualFund
 * DTCAssetTypeV2Code.MutualFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#ClosedEndFund
 * DTCAssetTypeV2Code.ClosedEndFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#InstitutionalMMIMutualFundShare
 * DTCAssetTypeV2Code.InstitutionalMMIMutualFundShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#EquityUnit
 * DTCAssetTypeV2Code.EquityUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#DebtUnit
 * DTCAssetTypeV2Code.DebtUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#UnitInvestmentTrustNuveenOnly
 * DTCAssetTypeV2Code.UnitInvestmentTrustNuveenOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#GlobalUnitTrust
 * DTCAssetTypeV2Code.GlobalUnitTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#UnitInvestmentTrust
 * DTCAssetTypeV2Code.UnitInvestmentTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#Equity144aDesignatedInvestors
 * DTCAssetTypeV2Code.Equity144aDesignatedInvestors}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#MunicipalOtherTaxExempt
 * DTCAssetTypeV2Code.MunicipalOtherTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#CorporateOtherTaxExempt
 * DTCAssetTypeV2Code.CorporateOtherTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#Corporate144aDesignatedInvestors
 * DTCAssetTypeV2Code.Corporate144aDesignatedInvestors}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code#NonStandardAssetUserCUSIP
 * DTCAssetTypeV2Code.NonStandardAssetUserCUSIP}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
 * DTCAssetType3Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCAssetTypeV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTC (The Depository Trust Company) security sub-issue type."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"S005"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCAssetTypeV2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Asset is an equity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S005"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is an equity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code Equity = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity";
			definition = "Asset is an equity.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S005";
		}
	};
	/**
	 * Asset is a common stock.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S010"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a common stock."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code CommonStock = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonStock";
			definition = "Asset is a common stock.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S010";
		}
	};
	/**
	 * Asset is a convertible common stock.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S011"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleCommonStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a convertible common stock."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code ConvertibleCommonStock = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertibleCommonStock";
			definition = "Asset is a convertible common stock.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S011";
		}
	};
	/**
	 * Asset is a common stock real estate investment trust.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S012"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonStockREIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a common stock real estate investment trust."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code CommonStockREIT = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonStockREIT";
			definition = "Asset is a common stock real estate investment trust.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S012";
		}
	};
	/**
	 * Asset is a preferred stock.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S020"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreferredStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a preferred stock."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code PreferredStock = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreferredStock";
			definition = "Asset is a preferred stock.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S020";
		}
	};
	/**
	 * Asset is a preferred stock real estate investment trust.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S022"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreferredStockREIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a preferred stock real estate investment trust."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code PreferredStockREIT = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreferredStockREIT";
			definition = "Asset is a preferred stock real estate investment trust.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S022";
		}
	};
	/**
	 * Asset is a convertible preferred stock.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S023"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertiblePreferredStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a convertible preferred stock."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code ConvertiblePreferredStock = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertiblePreferredStock";
			definition = "Asset is a convertible preferred stock.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S023";
		}
	};
	/**
	 * Asset is a tender rate preferred stock.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S024"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderRatePreferredStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a tender rate preferred stock."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code TenderRatePreferredStock = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderRatePreferredStock";
			definition = "Asset is a tender rate preferred stock.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S024";
		}
	};
	/**
	 * Asset is a limited partnership.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S030"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedPartnership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a limited partnership."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code LimitedPartnership = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitedPartnership";
			definition = "Asset is a limited partnership.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S030";
		}
	};
	/**
	 * Asset is a collateralized mortgage obligation denomination in "Units" or
	 * "Undivided Interest".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S040"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CMODenominationUnitsOrUndividedInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is a collateralized mortgage obligation denomination in \"Units\" or \"Undivided Interest\"."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code CMODenominationUnitsOrUndividedInterest = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CMODenominationUnitsOrUndividedInterest";
			definition = "Asset is a collateralized mortgage obligation denomination in \"Units\" or \"Undivided Interest\".";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S040";
		}
	};
	/**
	 * Asset is an asset-backed security denomination in "Units" or
	 * "Undivided Interest".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S041"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ABSDenominationUnitsOrUndividedInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is an asset-backed security denomination in \"Units\" or \"Undivided Interest\"."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code ABSDenominationUnitsOrUndividedInterest = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ABSDenominationUnitsOrUndividedInterest";
			definition = "Asset is an asset-backed security denomination in \"Units\" or \"Undivided Interest\".";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S041";
		}
	};
	/**
	 * Asset is an issue denomination in "Units" or "Undivided Interest".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S042"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDenominationUnitsOrUndividedInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is an issue denomination in \"Units\" or \"Undivided Interest\"."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code IssueDenominationUnitsOrUndividedInterest = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDenominationUnitsOrUndividedInterest";
			definition = "Asset is an issue denomination in \"Units\" or \"Undivided Interest\".";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S042";
		}
	};
	/**
	 * Asset is an auction rate preferred stock (ARPS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S102"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuctionRatePreferredStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is an auction rate preferred stock (ARPS)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code AuctionRatePreferredStock = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuctionRatePreferredStock";
			definition = "Asset is an auction rate preferred stock (ARPS).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S102";
		}
	};
	/**
	 * Asset is an American depositary receipt (ADR).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S110"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmericanDepositaryReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is an American depositary receipt (ADR)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code AmericanDepositaryReceipt = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmericanDepositaryReceipt";
			definition = "Asset is an American depositary receipt (ADR).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S110";
		}
	};
	/**
	 * Asset is a depositary share.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S111"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositaryShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a depositary share."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code DepositaryShare = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositaryShare";
			definition = "Asset is a depositary share.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S111";
		}
	};
	/**
	 * Asset is a municipal option call right.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S112"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalOptionCallRight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a municipal option call right."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code MunicipalOptionCallRight = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalOptionCallRight";
			definition = "Asset is a municipal option call right.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S112";
		}
	};
	/**
	 * Asset is an exchange traded funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S117"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeTradedFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is an exchange traded funds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code ExchangeTradedFunds = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedFunds";
			definition = "Asset is an exchange traded funds.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S117";
		}
	};
	/**
	 * Asset is a money market instrument preferred stock (in CP-like mode).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S120"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIPreferredStockCPLike"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is a money market instrument preferred stock (in CP-like mode)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code MMIPreferredStockCPLike = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIPreferredStockCPLike";
			definition = "Asset is a money market instrument preferred stock (in CP-like mode).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S120";
		}
	};
	/**
	 * Asset is a sealed envelope.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S125"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SealedEnvelope"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a sealed envelope."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code SealedEnvelope = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SealedEnvelope";
			definition = "Asset is a sealed envelope.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S125";
		}
	};
	/**
	 * Asset is a custody user CUSIP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S126"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyUserCUSIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a custody user CUSIP."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code CustodyUserCUSIP = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyUserCUSIP";
			definition = "Asset is a custody user CUSIP.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S126";
		}
	};
	/**
	 * Asset is a real estate investment trust (REIT).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S130"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealEstateInvestmentTrust"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a real estate investment trust (REIT)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code RealEstateInvestmentTrust = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealEstateInvestmentTrust";
			definition = "Asset is a real estate investment trust (REIT).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S130";
		}
	};
	/**
	 * Asset is a municipal bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S310"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a municipal bond."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code MunicipalBond = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalBond";
			definition = "Asset is a municipal bond.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S310";
		}
	};
	/**
	 * Asset is a municipal note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S311"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a municipal note."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code MunicipalNote = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalNote";
			definition = "Asset is a municipal note.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S311";
		}
	};
	/**
	 * Asset is a municipal auction rate note (ARN).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S312"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalAuctionRateNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a municipal auction rate note (ARN)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code MunicipalAuctionRateNote = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalAuctionRateNote";
			definition = "Asset is a municipal auction rate note (ARN).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S312";
		}
	};
	/**
	 * Asset is a municipal variable mode obligation (VMO).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S313"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalVariableModeObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a municipal variable mode obligation (VMO)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code MunicipalVariableModeObligation = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalVariableModeObligation";
			definition = "Asset is a municipal variable mode obligation (VMO).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S313";
		}
	};
	/**
	 * Asset is a municipal variable rate demand obligation (VRDO).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S314"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalVariableRateDemandObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is a municipal variable rate demand obligation (VRDO)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code MunicipalVariableRateDemandObligation = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalVariableRateDemandObligation";
			definition = "Asset is a municipal variable rate demand obligation (VRDO).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S314";
		}
	};
	/**
	 * Asset is a municipal insured custodial receipt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S315"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalInsuredCustodialReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a municipal insured custodial receipt."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code MunicipalInsuredCustodialReceipt = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalInsuredCustodialReceipt";
			definition = "Asset is a municipal insured custodial receipt.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S315";
		}
	};
	/**
	 * Asset is a money market instrument municipal variable rate demand
	 * obligation commercial paper.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S320"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIMunicipalVariableRateDemandObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is a money market instrument municipal variable rate demand obligation commercial paper."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code MMIMunicipalVariableRateDemandObligation = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMunicipalVariableRateDemandObligation";
			definition = "Asset is a money market instrument municipal variable rate demand obligation commercial paper.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S320";
		}
	};
	/**
	 * Asset is a money market instrument municipal commercial paper.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S330"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIMunicipalCommercialPaper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is a money market instrument municipal commercial paper."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code MMIMunicipalCommercialPaper = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMunicipalCommercialPaper";
			definition = "Asset is a money market instrument municipal commercial paper.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S330";
		}
	};
	/**
	 * Asset is a bearer, callable zero coupon bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S340"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BearerCallableZeroCouponBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a bearer, callable zero coupon bond."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code BearerCallableZeroCouponBond = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BearerCallableZeroCouponBond";
			definition = "Asset is a bearer, callable zero coupon bond.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S340";
		}
	};
	/**
	 * Asset is a government national mortgage association real estate mortgage
	 * investment conduit security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S450"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GNMARealEstateMortgageInvestmentConduit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is a government national mortgage association real estate mortgage investment conduit security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code GNMARealEstateMortgageInvestmentConduit = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMARealEstateMortgageInvestmentConduit";
			definition = "Asset is a government national mortgage association real estate mortgage investment conduit security.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S450";
		}
	};
	/**
	 * Asset is a government national mortgage association pass-through
	 * security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S451"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GNMAPassThroughSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is a government national mortgage association pass-through security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code GNMAPassThroughSecurity = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMAPassThroughSecurity";
			definition = "Asset is a government national mortgage association pass-through security.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S451";
		}
	};
	/**
	 * Asset is a government national mortgage association serial note security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S452"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GNMASerialNoteSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is a government national mortgage association serial note security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code GNMASerialNoteSecurity = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMASerialNoteSecurity";
			definition = "Asset is a government national mortgage association serial note security.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S452";
		}
	};
	/**
	 * Asset is a corporate bond (CB) Or a global corporate bond (GCB).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S500"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateBondOrGlobal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is a corporate bond (CB) Or a global corporate bond (GCB)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code CorporateBondOrGlobal = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateBondOrGlobal";
			definition = "Asset is a corporate bond (CB) Or a global corporate bond (GCB).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S500";
		}
	};
	/**
	 * Asset is a money market instrument bankers' acceptance note (BA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S502"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIBankersAcceptanceNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is a money market instrument bankers' acceptance note (BA)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code MMIBankersAcceptanceNote = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIBankersAcceptanceNote";
			definition = "Asset is a money market instrument bankers' acceptance note (BA).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S502";
		}
	};
	/**
	 * Asset is a money market instrument institutional certificates of deposit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S504"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIInstitutionalCertificatesOfDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is a money market instrument institutional certificates of deposit."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code MMIInstitutionalCertificatesOfDeposit = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIInstitutionalCertificatesOfDeposit";
			definition = "Asset is a money market instrument institutional certificates of deposit.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S504";
		}
	};
	/**
	 * Asset is a certificated money market instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S505"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificatedMoneyMarketInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a certificated money market instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code CertificatedMoneyMarketInstrument = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificatedMoneyMarketInstrument";
			definition = "Asset is a certificated money market instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S505";
		}
	};
	/**
	 * Asset is a certificated money market - periodic payer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S506"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificatedMoneyMarketPeriodicPayer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a certificated money market - periodic payer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code CertificatedMoneyMarketPeriodicPayer = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificatedMoneyMarketPeriodicPayer";
			definition = "Asset is a certificated money market - periodic payer.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S506";
		}
	};
	/**
	 * Asset is a certificates of deposit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S507"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificatesOfDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a certificates of deposit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code CertificatesOfDeposit = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificatesOfDeposit";
			definition = "Asset is a certificates of deposit.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S507";
		}
	};
	/**
	 * Asset is a consumer price index interest at maturity (IAM) commercial
	 * paper.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S510"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsumerPriceIndexAtMaturityCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is a consumer price index interest at maturity (IAM) commercial paper."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code ConsumerPriceIndexAtMaturityCP = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsumerPriceIndexAtMaturityCP";
			definition = "Asset is a consumer price index interest at maturity (IAM) commercial paper.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S510";
		}
	};
	/**
	 * Asset is a periodic payment commercial paper.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S511"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeriodicPaymentCommercialPaper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a periodic payment commercial paper."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code PeriodicPaymentCommercialPaper = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodicPaymentCommercialPaper";
			definition = "Asset is a periodic payment commercial paper.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S511";
		}
	};
	/**
	 * Asset is a consumer price index discount commercial paper.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S520"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsumerPriceIndexDiscountCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is a consumer price index discount commercial paper."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code ConsumerPriceIndexDiscountCP = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsumerPriceIndexDiscountCP";
			definition = "Asset is a consumer price index discount commercial paper.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S520";
		}
	};
	/**
	 * Asset is a money market instrument corporate commercial paper.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S525"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMICorporateCommercialPaper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is a money market instrument corporate commercial paper."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code MMICorporateCommercialPaper = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMICorporateCommercialPaper";
			definition = "Asset is a money market instrument corporate commercial paper.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S525";
		}
	};
	/**
	 * Asset is a money market instrument corporate variable rate demand
	 * obligation commercial paper.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S526"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMICorporateVariableRateDemandObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is a money market instrument corporate variable rate demand obligation commercial paper."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code MMICorporateVariableRateDemandObligation = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMICorporateVariableRateDemandObligation";
			definition = "Asset is a money market instrument corporate variable rate demand obligation commercial paper.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S526";
		}
	};
	/**
	 * Asset is a medium term note (MTN).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S530"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MediumTermNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a medium term note (MTN)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code MediumTermNote = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MediumTermNote";
			definition = "Asset is a medium term note (MTN).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S530";
		}
	};
	/**
	 * Asset is a money market instrument deposit note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S531"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIDepositNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a money market instrument deposit note."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code MMIDepositNote = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIDepositNote";
			definition = "Asset is a money market instrument deposit note.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S531";
		}
	};
	/**
	 * Asset is a money market instrument medium-term bank note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S532"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIMediumTermBankNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a money market instrument medium-term bank note."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code MMIMediumTermBankNote = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMediumTermBankNote";
			definition = "Asset is a money market instrument medium-term bank note.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S532";
		}
	};
	/**
	 * Asset is a money market instrument medium term note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S533"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIMediumTermNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a money market instrument medium term note."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code MMIMediumTermNote = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMediumTermNote";
			definition = "Asset is a money market instrument medium term note.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S533";
		}
	};
	/**
	 * Asset is a collateralized mortgage obligation or global collateralized
	 * mortgage obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S540"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralizedMortgageObligationOrGlobal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is a collateralized mortgage obligation or global collateralized mortgage obligation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code CollateralizedMortgageObligationOrGlobal = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralizedMortgageObligationOrGlobal";
			definition = "Asset is a collateralized mortgage obligation or global collateralized mortgage obligation.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S540";
		}
	};
	/**
	 * Asset is an asset-backed security (ABS) or global asset backed security
	 * (GABS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S541"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetBackedSecurityOrGlobal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is an asset-backed security (ABS) or global asset backed security (GABS)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code AssetBackedSecurityOrGlobal = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetBackedSecurityOrGlobal";
			definition = "Asset is an asset-backed security (ABS) or global asset backed security (GABS).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S541";
		}
	};
	/**
	 * Asset is a non-collateralized mortgage obligation ABS amortizing issue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S542"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonCMOABSAmortizingIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is a non-collateralized mortgage obligation ABS amortizing issue."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code NonCMOABSAmortizingIssue = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonCMOABSAmortizingIssue";
			definition = "Asset is a non-collateralized mortgage obligation ABS amortizing issue.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S542";
		}
	};
	/**
	 * MMI Short-Term Bank Note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S550"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIShortTermBankNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "MMI Short-Term Bank Note."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code MMIShortTermBankNote = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIShortTermBankNote";
			definition = "MMI Short-Term Bank Note.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S550";
		}
	};
	/**
	 * Asset is a zero coupon denomination in initial principal amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S551"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZCPNDenominationInitialPrincipalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is a zero coupon denomination in initial principal amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code ZCPNDenominationInitialPrincipalAmount = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZCPNDenominationInitialPrincipalAmount";
			definition = "Asset is a zero coupon denomination in initial principal amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S551";
		}
	};
	/**
	 * Asset is a money market instrument discount note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S560"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIDiscountNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a money market instrument discount note."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code MMIDiscountNote = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIDiscountNote";
			definition = "Asset is a money market instrument discount note.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S560";
		}
	};
	/**
	 * Asset is a corporate auction rate note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S571"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateAuctionRateNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a corporate auction rate note."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code CorporateAuctionRateNote = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateAuctionRateNote";
			definition = "Asset is a corporate auction rate note.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S571";
		}
	};
	/**
	 * Asset is a convertible corporate debt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S572"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleCorporateDebt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a convertible corporate debt."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code ConvertibleCorporateDebt = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertibleCorporateDebt";
			definition = "Asset is a convertible corporate debt.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S572";
		}
	};
	/**
	 * Asset is a corporate variable mode obligation (CVMO).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S573"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateVariableModeObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a corporate variable mode obligation (CVMO)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code CorporateVariableModeObligation = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateVariableModeObligation";
			definition = "Asset is a corporate variable mode obligation (CVMO).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S573";
		}
	};
	/**
	 * Asset is a corporate short-term note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S574"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateShortTermNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a corporate short-term note."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code CorporateShortTermNote = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateShortTermNote";
			definition = "Asset is a corporate short-term note.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S574";
		}
	};
	/**
	 * Asset is a corporate debenture.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S575"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateDebenture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a corporate debenture."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code CorporateDebenture = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateDebenture";
			definition = "Asset is a corporate debenture.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S575";
		}
	};
	/**
	 * Asset is a corporate variable rate demand obligation or a municipal
	 * variable rate demand obligation (MMD).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S576"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateOrMunicipalVariableRateDemandObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is a corporate variable rate demand obligation or a municipal variable rate demand obligation (MMD)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code CorporateOrMunicipalVariableRateDemandObligation = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateOrMunicipalVariableRateDemandObligation";
			definition = "Asset is a corporate variable rate demand obligation or a municipal variable rate demand obligation (MMD).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S576";
		}
	};
	/**
	 * Asset is a corporate insured custodial receipt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S577"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateInsuredCustodialReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a corporate insured custodial receipt."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code CorporateInsuredCustodialReceipt = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateInsuredCustodialReceipt";
			definition = "Asset is a corporate insured custodial receipt.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S577";
		}
	};
	/**
	 * Asset is a tender rate note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S578"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderRateNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a tender rate note."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code TenderRateNote = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderRateNote";
			definition = "Asset is a tender rate note.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S578";
		}
	};
	/**
	 * Asset is a zero coupon bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S579"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZeroCouponBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a zero coupon bond."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code ZeroCouponBond = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZeroCouponBond";
			definition = "Asset is a zero coupon bond.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S579";
		}
	};
	/**
	 * Asset is a government national mortgage association government security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S601"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is a government national mortgage association government security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code GovernmentSecurity = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentSecurity";
			definition = "Asset is a government national mortgage association government security.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S601";
		}
	};
	/**
	 * Asset is a government trust certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S602"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentTrustCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a government trust certificate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code GovernmentTrustCertificate = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentTrustCertificate";
			definition = "Asset is a government trust certificate.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S602";
		}
	};
	/**
	 * Asset is a junk and treasury growth receipt (JGR).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S603"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JunkAndTreasuryGrowthReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a junk and treasury growth receipt (JGR)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code JunkAndTreasuryGrowthReceipt = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JunkAndTreasuryGrowthReceipt";
			definition = "Asset is a junk and treasury growth receipt (JGR).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S603";
		}
	};
	/**
	 * Asset is a U.S. treasury security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S610"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTreasurySecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a U.S. treasury security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code USTreasurySecurity = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasurySecurity";
			definition = "Asset is a U.S. treasury security.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S610";
		}
	};
	/**
	 * Asset is a US treasury bill.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S611"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTreasuryBill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a US treasury bill."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code USTreasuryBill = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasuryBill";
			definition = "Asset is a US treasury bill.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S611";
		}
	};
	/**
	 * Asset is a US treasury note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S612"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTreasuryNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a US treasury note."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code USTreasuryNote = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasuryNote";
			definition = "Asset is a US treasury note.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S612";
		}
	};
	/**
	 * Asset is a US treasury bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S613"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTreasuryBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a US treasury bond."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code USTreasuryBond = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasuryBond";
			definition = "Asset is a US treasury bond.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S613";
		}
	};
	/**
	 * Asset is a U.S. government agency security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S620"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGovernmentAgencySecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a U.S. government agency security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code USGovernmentAgencySecurity = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGovernmentAgencySecurity";
			definition = "Asset is a U.S. government agency security.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S620";
		}
	};
	/**
	 * Asset is a government national mortgage association (GNMA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S650"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentNationallMortgageAssociation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is a government national mortgage association (GNMA)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code GovernmentNationallMortgageAssociation = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentNationallMortgageAssociation";
			definition = "Asset is a government national mortgage association (GNMA).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S650";
		}
	};
	/**
	 * Asset is a real estate mortgage investment conduit (REMIC).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S651"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealEstateMortgageInvestmentConduit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is a real estate mortgage investment conduit (REMIC)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code RealEstateMortgageInvestmentConduit = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealEstateMortgageInvestmentConduit";
			definition = "Asset is a real estate mortgage investment conduit (REMIC).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S651";
		}
	};
	/**
	 * Asset is a government national mortgage association serial note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S652"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GNMASerialNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is a government national mortgage association serial note."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code GNMASerialNote = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMASerialNote";
			definition = "Asset is a government national mortgage association serial note.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S652";
		}
	};
	/**
	 * Asset is a package.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S700"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Package"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a package."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code Package = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Package";
			definition = "Asset is a package.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S700";
		}
	};
	/**
	 * Corporate Debt Derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S704"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateDebtDerivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate Debt Derivative."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code CorporateDebtDerivative = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateDebtDerivative";
			definition = "Corporate Debt Derivative.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S704";
		}
	};
	/**
	 * Asset is an equity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S705"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquityDerivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is an equity derivative."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code EquityDerivative = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityDerivative";
			definition = "Asset is an equity derivative.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S705";
		}
	};
	/**
	 * Asset is a municipal derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S706"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalDerivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a municipal derivative."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code MunicipalDerivative = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalDerivative";
			definition = "Asset is a municipal derivative.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S706";
		}
	};
	/**
	 * Asset is a municipal amortized issue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S708"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalAmortizedIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a municipal amortized issue."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code MunicipalAmortizedIssue = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalAmortizedIssue";
			definition = "Asset is a municipal amortized issue.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S708";
		}
	};
	/**
	 * Asset is an option derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S710"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionDerivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is an option derivative."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code OptionDerivative = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionDerivative";
			definition = "Asset is an option derivative.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S710";
		}
	};
	/**
	 * Asset is a warrant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S720"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Warrant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a warrant."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code Warrant = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Warrant";
			definition = "Asset is a warrant.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S720";
		}
	};
	/**
	 * Asset is a right.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S730"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Right"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a right."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code Right = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Right";
			definition = "Asset is a right.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S730";
		}
	};
	/**
	 * Asset is a mutual fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S760"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MutualFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a mutual fund."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code MutualFund = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MutualFund";
			definition = "Asset is a mutual fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S760";
		}
	};
	/**
	 * Asset is a closed end fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S761"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedEndFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a closed end fund."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code ClosedEndFund = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedEndFund";
			definition = "Asset is a closed end fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S761";
		}
	};
	/**
	 * Asset is a institutional money market instrument mutual fund share.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S762"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstitutionalMMIMutualFundShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is a institutional money market instrument mutual fund share."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code InstitutionalMMIMutualFundShare = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstitutionalMMIMutualFundShare";
			definition = "Asset is a institutional money market instrument mutual fund share.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S762";
		}
	};
	/**
	 * Asset is a equity unit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S780"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquityUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a equity unit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code EquityUnit = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityUnit";
			definition = "Asset is a equity unit.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S780";
		}
	};
	/**
	 * Asset is a debt unit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S781"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a debt unit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code DebtUnit = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtUnit";
			definition = "Asset is a debt unit.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S781";
		}
	};
	/**
	 * Asset is a unit investment trust (UIT) nuveen only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S790"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitInvestmentTrustNuveenOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a unit investment trust (UIT) nuveen only."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code UnitInvestmentTrustNuveenOnly = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitInvestmentTrustNuveenOnly";
			definition = "Asset is a unit investment trust (UIT) nuveen only.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S790";
		}
	};
	/**
	 * Asset is a global unit trust.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S791"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalUnitTrust"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a global unit trust."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code GlobalUnitTrust = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalUnitTrust";
			definition = "Asset is a global unit trust.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S791";
		}
	};
	/**
	 * Asset is a unit investment trust (UIT).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S795"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitInvestmentTrust"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a unit investment trust (UIT)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code UnitInvestmentTrust = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitInvestmentTrust";
			definition = "Asset is a unit investment trust (UIT).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S795";
		}
	};
	/**
	 * Asset is an equity, subject to 144a, designated investors.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S121"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equity144aDesignatedInvestors"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is an equity, subject to 144a, designated investors."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code Equity144aDesignatedInvestors = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity144aDesignatedInvestors";
			definition = "Asset is an equity, subject to 144a, designated investors.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S121";
		}
	};
	/**
	 * Asset is a municipal debt, classified as other, subject to tax exempt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S346"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalOtherTaxExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is a municipal debt, classified as other, subject to tax exempt."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code MunicipalOtherTaxExempt = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalOtherTaxExempt";
			definition = "Asset is a municipal debt, classified as other, subject to tax exempt.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S346";
		}
	};
	/**
	 * Asset is a corporate debt, classified as other, subject to tax exempt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S546"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateOtherTaxExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is a corporate debt, classified as other, subject to tax exempt."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code CorporateOtherTaxExempt = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateOtherTaxExempt";
			definition = "Asset is a corporate debt, classified as other, subject to tax exempt.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S546";
		}
	};
	/**
	 * Asset is a corporate debt, subject to 144a, designated investors.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S545"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Corporate144aDesignatedInvestors"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset is a corporate debt, subject to 144a, designated investors."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code Corporate144aDesignatedInvestors = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Corporate144aDesignatedInvestors";
			definition = "Asset is a corporate debt, subject to 144a, designated investors.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S545";
		}
	};
	/**
	 * Asset is a non standard asset user CUSIP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
	 * DTCAssetTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S127"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonStandardAssetUserCUSIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset is a non standard asset user CUSIP."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetTypeV2Code NonStandardAssetUserCUSIP = new DTCAssetTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandardAssetUserCUSIP";
			definition = "Asset is a non standard asset user CUSIP.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeV2Code.mmObject();
			codeName = "S127";
		}
	};
	final static private LinkedHashMap<String, DTCAssetTypeV2Code> codesByName = new LinkedHashMap<>();

	protected DTCAssetTypeV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("S005");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCAssetTypeV2Code";
				definition = "Specifies DTC (The Depository Trust Company) security sub-issue type.";
				derivation_lazy = () -> Arrays.asList(DTCAssetType3Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCAssetTypeV2Code.Equity, com.tools20022.repository.codeset.DTCAssetTypeV2Code.CommonStock,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.ConvertibleCommonStock, com.tools20022.repository.codeset.DTCAssetTypeV2Code.CommonStockREIT, com.tools20022.repository.codeset.DTCAssetTypeV2Code.PreferredStock,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.PreferredStockREIT, com.tools20022.repository.codeset.DTCAssetTypeV2Code.ConvertiblePreferredStock,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.TenderRatePreferredStock, com.tools20022.repository.codeset.DTCAssetTypeV2Code.LimitedPartnership,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.CMODenominationUnitsOrUndividedInterest, com.tools20022.repository.codeset.DTCAssetTypeV2Code.ABSDenominationUnitsOrUndividedInterest,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.IssueDenominationUnitsOrUndividedInterest, com.tools20022.repository.codeset.DTCAssetTypeV2Code.AuctionRatePreferredStock,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.AmericanDepositaryReceipt, com.tools20022.repository.codeset.DTCAssetTypeV2Code.DepositaryShare,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.MunicipalOptionCallRight, com.tools20022.repository.codeset.DTCAssetTypeV2Code.ExchangeTradedFunds,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.MMIPreferredStockCPLike, com.tools20022.repository.codeset.DTCAssetTypeV2Code.SealedEnvelope,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.CustodyUserCUSIP, com.tools20022.repository.codeset.DTCAssetTypeV2Code.RealEstateInvestmentTrust,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.MunicipalBond, com.tools20022.repository.codeset.DTCAssetTypeV2Code.MunicipalNote, com.tools20022.repository.codeset.DTCAssetTypeV2Code.MunicipalAuctionRateNote,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.MunicipalVariableModeObligation, com.tools20022.repository.codeset.DTCAssetTypeV2Code.MunicipalVariableRateDemandObligation,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.MunicipalInsuredCustodialReceipt, com.tools20022.repository.codeset.DTCAssetTypeV2Code.MMIMunicipalVariableRateDemandObligation,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.MMIMunicipalCommercialPaper, com.tools20022.repository.codeset.DTCAssetTypeV2Code.BearerCallableZeroCouponBond,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.GNMARealEstateMortgageInvestmentConduit, com.tools20022.repository.codeset.DTCAssetTypeV2Code.GNMAPassThroughSecurity,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.GNMASerialNoteSecurity, com.tools20022.repository.codeset.DTCAssetTypeV2Code.CorporateBondOrGlobal,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.MMIBankersAcceptanceNote, com.tools20022.repository.codeset.DTCAssetTypeV2Code.MMIInstitutionalCertificatesOfDeposit,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.CertificatedMoneyMarketInstrument, com.tools20022.repository.codeset.DTCAssetTypeV2Code.CertificatedMoneyMarketPeriodicPayer,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.CertificatesOfDeposit, com.tools20022.repository.codeset.DTCAssetTypeV2Code.ConsumerPriceIndexAtMaturityCP,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.PeriodicPaymentCommercialPaper, com.tools20022.repository.codeset.DTCAssetTypeV2Code.ConsumerPriceIndexDiscountCP,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.MMICorporateCommercialPaper, com.tools20022.repository.codeset.DTCAssetTypeV2Code.MMICorporateVariableRateDemandObligation,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.MediumTermNote, com.tools20022.repository.codeset.DTCAssetTypeV2Code.MMIDepositNote, com.tools20022.repository.codeset.DTCAssetTypeV2Code.MMIMediumTermBankNote,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.MMIMediumTermNote, com.tools20022.repository.codeset.DTCAssetTypeV2Code.CollateralizedMortgageObligationOrGlobal,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.AssetBackedSecurityOrGlobal, com.tools20022.repository.codeset.DTCAssetTypeV2Code.NonCMOABSAmortizingIssue,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.MMIShortTermBankNote, com.tools20022.repository.codeset.DTCAssetTypeV2Code.ZCPNDenominationInitialPrincipalAmount,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.MMIDiscountNote, com.tools20022.repository.codeset.DTCAssetTypeV2Code.CorporateAuctionRateNote,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.ConvertibleCorporateDebt, com.tools20022.repository.codeset.DTCAssetTypeV2Code.CorporateVariableModeObligation,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.CorporateShortTermNote, com.tools20022.repository.codeset.DTCAssetTypeV2Code.CorporateDebenture,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.CorporateOrMunicipalVariableRateDemandObligation, com.tools20022.repository.codeset.DTCAssetTypeV2Code.CorporateInsuredCustodialReceipt,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.TenderRateNote, com.tools20022.repository.codeset.DTCAssetTypeV2Code.ZeroCouponBond, com.tools20022.repository.codeset.DTCAssetTypeV2Code.GovernmentSecurity,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.GovernmentTrustCertificate, com.tools20022.repository.codeset.DTCAssetTypeV2Code.JunkAndTreasuryGrowthReceipt,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.USTreasurySecurity, com.tools20022.repository.codeset.DTCAssetTypeV2Code.USTreasuryBill, com.tools20022.repository.codeset.DTCAssetTypeV2Code.USTreasuryNote,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.USTreasuryBond, com.tools20022.repository.codeset.DTCAssetTypeV2Code.USGovernmentAgencySecurity,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.GovernmentNationallMortgageAssociation, com.tools20022.repository.codeset.DTCAssetTypeV2Code.RealEstateMortgageInvestmentConduit,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.GNMASerialNote, com.tools20022.repository.codeset.DTCAssetTypeV2Code.Package, com.tools20022.repository.codeset.DTCAssetTypeV2Code.CorporateDebtDerivative,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.EquityDerivative, com.tools20022.repository.codeset.DTCAssetTypeV2Code.MunicipalDerivative,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.MunicipalAmortizedIssue, com.tools20022.repository.codeset.DTCAssetTypeV2Code.OptionDerivative, com.tools20022.repository.codeset.DTCAssetTypeV2Code.Warrant,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.Right, com.tools20022.repository.codeset.DTCAssetTypeV2Code.MutualFund, com.tools20022.repository.codeset.DTCAssetTypeV2Code.ClosedEndFund,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.InstitutionalMMIMutualFundShare, com.tools20022.repository.codeset.DTCAssetTypeV2Code.EquityUnit, com.tools20022.repository.codeset.DTCAssetTypeV2Code.DebtUnit,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.UnitInvestmentTrustNuveenOnly, com.tools20022.repository.codeset.DTCAssetTypeV2Code.GlobalUnitTrust,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.UnitInvestmentTrust, com.tools20022.repository.codeset.DTCAssetTypeV2Code.Equity144aDesignatedInvestors,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.MunicipalOtherTaxExempt, com.tools20022.repository.codeset.DTCAssetTypeV2Code.CorporateOtherTaxExempt,
						com.tools20022.repository.codeset.DTCAssetTypeV2Code.Corporate144aDesignatedInvestors, com.tools20022.repository.codeset.DTCAssetTypeV2Code.NonStandardAssetUserCUSIP);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Equity.getCodeName().get(), Equity);
		codesByName.put(CommonStock.getCodeName().get(), CommonStock);
		codesByName.put(ConvertibleCommonStock.getCodeName().get(), ConvertibleCommonStock);
		codesByName.put(CommonStockREIT.getCodeName().get(), CommonStockREIT);
		codesByName.put(PreferredStock.getCodeName().get(), PreferredStock);
		codesByName.put(PreferredStockREIT.getCodeName().get(), PreferredStockREIT);
		codesByName.put(ConvertiblePreferredStock.getCodeName().get(), ConvertiblePreferredStock);
		codesByName.put(TenderRatePreferredStock.getCodeName().get(), TenderRatePreferredStock);
		codesByName.put(LimitedPartnership.getCodeName().get(), LimitedPartnership);
		codesByName.put(CMODenominationUnitsOrUndividedInterest.getCodeName().get(), CMODenominationUnitsOrUndividedInterest);
		codesByName.put(ABSDenominationUnitsOrUndividedInterest.getCodeName().get(), ABSDenominationUnitsOrUndividedInterest);
		codesByName.put(IssueDenominationUnitsOrUndividedInterest.getCodeName().get(), IssueDenominationUnitsOrUndividedInterest);
		codesByName.put(AuctionRatePreferredStock.getCodeName().get(), AuctionRatePreferredStock);
		codesByName.put(AmericanDepositaryReceipt.getCodeName().get(), AmericanDepositaryReceipt);
		codesByName.put(DepositaryShare.getCodeName().get(), DepositaryShare);
		codesByName.put(MunicipalOptionCallRight.getCodeName().get(), MunicipalOptionCallRight);
		codesByName.put(ExchangeTradedFunds.getCodeName().get(), ExchangeTradedFunds);
		codesByName.put(MMIPreferredStockCPLike.getCodeName().get(), MMIPreferredStockCPLike);
		codesByName.put(SealedEnvelope.getCodeName().get(), SealedEnvelope);
		codesByName.put(CustodyUserCUSIP.getCodeName().get(), CustodyUserCUSIP);
		codesByName.put(RealEstateInvestmentTrust.getCodeName().get(), RealEstateInvestmentTrust);
		codesByName.put(MunicipalBond.getCodeName().get(), MunicipalBond);
		codesByName.put(MunicipalNote.getCodeName().get(), MunicipalNote);
		codesByName.put(MunicipalAuctionRateNote.getCodeName().get(), MunicipalAuctionRateNote);
		codesByName.put(MunicipalVariableModeObligation.getCodeName().get(), MunicipalVariableModeObligation);
		codesByName.put(MunicipalVariableRateDemandObligation.getCodeName().get(), MunicipalVariableRateDemandObligation);
		codesByName.put(MunicipalInsuredCustodialReceipt.getCodeName().get(), MunicipalInsuredCustodialReceipt);
		codesByName.put(MMIMunicipalVariableRateDemandObligation.getCodeName().get(), MMIMunicipalVariableRateDemandObligation);
		codesByName.put(MMIMunicipalCommercialPaper.getCodeName().get(), MMIMunicipalCommercialPaper);
		codesByName.put(BearerCallableZeroCouponBond.getCodeName().get(), BearerCallableZeroCouponBond);
		codesByName.put(GNMARealEstateMortgageInvestmentConduit.getCodeName().get(), GNMARealEstateMortgageInvestmentConduit);
		codesByName.put(GNMAPassThroughSecurity.getCodeName().get(), GNMAPassThroughSecurity);
		codesByName.put(GNMASerialNoteSecurity.getCodeName().get(), GNMASerialNoteSecurity);
		codesByName.put(CorporateBondOrGlobal.getCodeName().get(), CorporateBondOrGlobal);
		codesByName.put(MMIBankersAcceptanceNote.getCodeName().get(), MMIBankersAcceptanceNote);
		codesByName.put(MMIInstitutionalCertificatesOfDeposit.getCodeName().get(), MMIInstitutionalCertificatesOfDeposit);
		codesByName.put(CertificatedMoneyMarketInstrument.getCodeName().get(), CertificatedMoneyMarketInstrument);
		codesByName.put(CertificatedMoneyMarketPeriodicPayer.getCodeName().get(), CertificatedMoneyMarketPeriodicPayer);
		codesByName.put(CertificatesOfDeposit.getCodeName().get(), CertificatesOfDeposit);
		codesByName.put(ConsumerPriceIndexAtMaturityCP.getCodeName().get(), ConsumerPriceIndexAtMaturityCP);
		codesByName.put(PeriodicPaymentCommercialPaper.getCodeName().get(), PeriodicPaymentCommercialPaper);
		codesByName.put(ConsumerPriceIndexDiscountCP.getCodeName().get(), ConsumerPriceIndexDiscountCP);
		codesByName.put(MMICorporateCommercialPaper.getCodeName().get(), MMICorporateCommercialPaper);
		codesByName.put(MMICorporateVariableRateDemandObligation.getCodeName().get(), MMICorporateVariableRateDemandObligation);
		codesByName.put(MediumTermNote.getCodeName().get(), MediumTermNote);
		codesByName.put(MMIDepositNote.getCodeName().get(), MMIDepositNote);
		codesByName.put(MMIMediumTermBankNote.getCodeName().get(), MMIMediumTermBankNote);
		codesByName.put(MMIMediumTermNote.getCodeName().get(), MMIMediumTermNote);
		codesByName.put(CollateralizedMortgageObligationOrGlobal.getCodeName().get(), CollateralizedMortgageObligationOrGlobal);
		codesByName.put(AssetBackedSecurityOrGlobal.getCodeName().get(), AssetBackedSecurityOrGlobal);
		codesByName.put(NonCMOABSAmortizingIssue.getCodeName().get(), NonCMOABSAmortizingIssue);
		codesByName.put(MMIShortTermBankNote.getCodeName().get(), MMIShortTermBankNote);
		codesByName.put(ZCPNDenominationInitialPrincipalAmount.getCodeName().get(), ZCPNDenominationInitialPrincipalAmount);
		codesByName.put(MMIDiscountNote.getCodeName().get(), MMIDiscountNote);
		codesByName.put(CorporateAuctionRateNote.getCodeName().get(), CorporateAuctionRateNote);
		codesByName.put(ConvertibleCorporateDebt.getCodeName().get(), ConvertibleCorporateDebt);
		codesByName.put(CorporateVariableModeObligation.getCodeName().get(), CorporateVariableModeObligation);
		codesByName.put(CorporateShortTermNote.getCodeName().get(), CorporateShortTermNote);
		codesByName.put(CorporateDebenture.getCodeName().get(), CorporateDebenture);
		codesByName.put(CorporateOrMunicipalVariableRateDemandObligation.getCodeName().get(), CorporateOrMunicipalVariableRateDemandObligation);
		codesByName.put(CorporateInsuredCustodialReceipt.getCodeName().get(), CorporateInsuredCustodialReceipt);
		codesByName.put(TenderRateNote.getCodeName().get(), TenderRateNote);
		codesByName.put(ZeroCouponBond.getCodeName().get(), ZeroCouponBond);
		codesByName.put(GovernmentSecurity.getCodeName().get(), GovernmentSecurity);
		codesByName.put(GovernmentTrustCertificate.getCodeName().get(), GovernmentTrustCertificate);
		codesByName.put(JunkAndTreasuryGrowthReceipt.getCodeName().get(), JunkAndTreasuryGrowthReceipt);
		codesByName.put(USTreasurySecurity.getCodeName().get(), USTreasurySecurity);
		codesByName.put(USTreasuryBill.getCodeName().get(), USTreasuryBill);
		codesByName.put(USTreasuryNote.getCodeName().get(), USTreasuryNote);
		codesByName.put(USTreasuryBond.getCodeName().get(), USTreasuryBond);
		codesByName.put(USGovernmentAgencySecurity.getCodeName().get(), USGovernmentAgencySecurity);
		codesByName.put(GovernmentNationallMortgageAssociation.getCodeName().get(), GovernmentNationallMortgageAssociation);
		codesByName.put(RealEstateMortgageInvestmentConduit.getCodeName().get(), RealEstateMortgageInvestmentConduit);
		codesByName.put(GNMASerialNote.getCodeName().get(), GNMASerialNote);
		codesByName.put(Package.getCodeName().get(), Package);
		codesByName.put(CorporateDebtDerivative.getCodeName().get(), CorporateDebtDerivative);
		codesByName.put(EquityDerivative.getCodeName().get(), EquityDerivative);
		codesByName.put(MunicipalDerivative.getCodeName().get(), MunicipalDerivative);
		codesByName.put(MunicipalAmortizedIssue.getCodeName().get(), MunicipalAmortizedIssue);
		codesByName.put(OptionDerivative.getCodeName().get(), OptionDerivative);
		codesByName.put(Warrant.getCodeName().get(), Warrant);
		codesByName.put(Right.getCodeName().get(), Right);
		codesByName.put(MutualFund.getCodeName().get(), MutualFund);
		codesByName.put(ClosedEndFund.getCodeName().get(), ClosedEndFund);
		codesByName.put(InstitutionalMMIMutualFundShare.getCodeName().get(), InstitutionalMMIMutualFundShare);
		codesByName.put(EquityUnit.getCodeName().get(), EquityUnit);
		codesByName.put(DebtUnit.getCodeName().get(), DebtUnit);
		codesByName.put(UnitInvestmentTrustNuveenOnly.getCodeName().get(), UnitInvestmentTrustNuveenOnly);
		codesByName.put(GlobalUnitTrust.getCodeName().get(), GlobalUnitTrust);
		codesByName.put(UnitInvestmentTrust.getCodeName().get(), UnitInvestmentTrust);
		codesByName.put(Equity144aDesignatedInvestors.getCodeName().get(), Equity144aDesignatedInvestors);
		codesByName.put(MunicipalOtherTaxExempt.getCodeName().get(), MunicipalOtherTaxExempt);
		codesByName.put(CorporateOtherTaxExempt.getCodeName().get(), CorporateOtherTaxExempt);
		codesByName.put(Corporate144aDesignatedInvestors.getCodeName().get(), Corporate144aDesignatedInvestors);
		codesByName.put(NonStandardAssetUserCUSIP.getCodeName().get(), NonStandardAssetUserCUSIP);
	}

	public static DTCAssetTypeV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCAssetTypeV2Code[] values() {
		DTCAssetTypeV2Code[] values = new DTCAssetTypeV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCAssetTypeV2Code> {
		@Override
		public DTCAssetTypeV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCAssetTypeV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}