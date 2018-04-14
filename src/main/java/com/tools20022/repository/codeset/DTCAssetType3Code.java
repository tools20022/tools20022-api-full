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
import com.tools20022.repository.codeset.DTCAssetType3Code.InternalXmlAdapter;
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
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#ABSDenominationUnitsOrUndividedInterest
 * DTCAssetType3Code.ABSDenominationUnitsOrUndividedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#AmericanDepositaryReceipt
 * DTCAssetType3Code.AmericanDepositaryReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#AssetBackedSecurityOrGlobal
 * DTCAssetType3Code.AssetBackedSecurityOrGlobal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#AuctionRatePreferredStock
 * DTCAssetType3Code.AuctionRatePreferredStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#BearerCallableZeroCouponBond
 * DTCAssetType3Code.BearerCallableZeroCouponBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#CertificatedMoneyMarketInstrument
 * DTCAssetType3Code.CertificatedMoneyMarketInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#CertificatedMoneyMarketPeriodicPayer
 * DTCAssetType3Code.CertificatedMoneyMarketPeriodicPayer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#CertificatesOfDeposit
 * DTCAssetType3Code.CertificatesOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#ClosedEndFund
 * DTCAssetType3Code.ClosedEndFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#CMODenominationUnitsOrUndividedInterest
 * DTCAssetType3Code.CMODenominationUnitsOrUndividedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#CommonStock
 * DTCAssetType3Code.CommonStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#CommonStockREIT
 * DTCAssetType3Code.CommonStockREIT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#ConsumerPriceIndexDiscountCP
 * DTCAssetType3Code.ConsumerPriceIndexDiscountCP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#ConvertibleCommonStock
 * DTCAssetType3Code.ConvertibleCommonStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#ConvertibleCorporateDebt
 * DTCAssetType3Code.ConvertibleCorporateDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#CorporateBondOrGlobal
 * DTCAssetType3Code.CorporateBondOrGlobal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#CorporateDebenture
 * DTCAssetType3Code.CorporateDebenture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#CorporateDebtDerivative
 * DTCAssetType3Code.CorporateDebtDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#CorporateOtherTaxExempt
 * DTCAssetType3Code.CorporateOtherTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#CorporateVariableModeObligation
 * DTCAssetType3Code.CorporateVariableModeObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#CorporateShortTermNote
 * DTCAssetType3Code.CorporateShortTermNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#CorporateOrMunicipalVariableRateDemandObligation
 * DTCAssetType3Code.CorporateOrMunicipalVariableRateDemandObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#CorporateInsuredCustodialReceipt
 * DTCAssetType3Code.CorporateInsuredCustodialReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#CorporateAuctionRateNote
 * DTCAssetType3Code.CorporateAuctionRateNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#Corporate144aDesignatedInvestors
 * DTCAssetType3Code.Corporate144aDesignatedInvestors}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#ConvertiblePreferredStock
 * DTCAssetType3Code.ConvertiblePreferredStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#ConsumerPriceIndexAtMaturityCP
 * DTCAssetType3Code.ConsumerPriceIndexAtMaturityCP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#CollateralizedMortgageObligationOrGlobal
 * DTCAssetType3Code.CollateralizedMortgageObligationOrGlobal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#CustodyUserCUSIP
 * DTCAssetType3Code.CustodyUserCUSIP}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#DebtUnit
 * DTCAssetType3Code.DebtUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#DepositaryShare
 * DTCAssetType3Code.DepositaryShare}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#Equity
 * DTCAssetType3Code.Equity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#Equity144aDesignatedInvestors
 * DTCAssetType3Code.Equity144aDesignatedInvestors}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#EquityDerivative
 * DTCAssetType3Code.EquityDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#EquityUnit
 * DTCAssetType3Code.EquityUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#ExchangeTradedFunds
 * DTCAssetType3Code.ExchangeTradedFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#GNMAPassThroughSecurity
 * DTCAssetType3Code.GNMAPassThroughSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#GNMARealEstateMortgageInvestmentConduit
 * DTCAssetType3Code.GNMARealEstateMortgageInvestmentConduit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#GNMASerialNoteSecurity
 * DTCAssetType3Code.GNMASerialNoteSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#GovernmentNationallMortgageAssociation
 * DTCAssetType3Code.GovernmentNationallMortgageAssociation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#GovernmentSecurity
 * DTCAssetType3Code.GovernmentSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#GovernmentTrustCertificate
 * DTCAssetType3Code.GovernmentTrustCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#InstitutionalMMIMutualFundShare
 * DTCAssetType3Code.InstitutionalMMIMutualFundShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#IssueDenominationUnitsOrUndividedInterest
 * DTCAssetType3Code.IssueDenominationUnitsOrUndividedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#JunkAndTreasuryGrowthReceipt
 * DTCAssetType3Code.JunkAndTreasuryGrowthReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#MediumTermNote
 * DTCAssetType3Code.MediumTermNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#MMICorporateVariableRateDemandObligation
 * DTCAssetType3Code.MMICorporateVariableRateDemandObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#MMIDepositNote
 * DTCAssetType3Code.MMIDepositNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#MMICorporateCommercialPaper
 * DTCAssetType3Code.MMICorporateCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#MMIBankersAcceptanceNote
 * DTCAssetType3Code.MMIBankersAcceptanceNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#LimitedPartnership
 * DTCAssetType3Code.LimitedPartnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#GNMASerialNote
 * DTCAssetType3Code.GNMASerialNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#GlobalUnitTrust
 * DTCAssetType3Code.GlobalUnitTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#MMIDiscountNote
 * DTCAssetType3Code.MMIDiscountNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#MMIInstitutionalCertificatesOfDeposit
 * DTCAssetType3Code.MMIInstitutionalCertificatesOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#MMIMediumTermNote
 * DTCAssetType3Code.MMIMediumTermNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#MMIMunicipalVariableRateDemandObligation
 * DTCAssetType3Code.MMIMunicipalVariableRateDemandObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#MMIPreferredStockCPLike
 * DTCAssetType3Code.MMIPreferredStockCPLike}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#MunicipalAmortizedIssue
 * DTCAssetType3Code.MunicipalAmortizedIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#MunicipalBond
 * DTCAssetType3Code.MunicipalBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#MunicipalDerivative
 * DTCAssetType3Code.MunicipalDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#MunicipalNote
 * DTCAssetType3Code.MunicipalNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#MunicipalOtherTaxExempt
 * DTCAssetType3Code.MunicipalOtherTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#MutualFund
 * DTCAssetType3Code.MutualFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#NonCMOABSAmortizingIssue
 * DTCAssetType3Code.NonCMOABSAmortizingIssue}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#Package
 * DTCAssetType3Code.Package}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#PeriodicPaymentCommercialPaper
 * DTCAssetType3Code.PeriodicPaymentCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#MMIShortTermBankNote
 * DTCAssetType3Code.MMIShortTermBankNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#MMIMediumTermBankNote
 * DTCAssetType3Code.MMIMediumTermBankNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#MMIMunicipalCommercialPaper
 * DTCAssetType3Code.MMIMunicipalCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#MunicipalAuctionRateNote
 * DTCAssetType3Code.MunicipalAuctionRateNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#MunicipalInsuredCustodialReceipt
 * DTCAssetType3Code.MunicipalInsuredCustodialReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#MunicipalOptionCallRight
 * DTCAssetType3Code.MunicipalOptionCallRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#MunicipalVariableRateDemandObligation
 * DTCAssetType3Code.MunicipalVariableRateDemandObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#MunicipalVariableModeObligation
 * DTCAssetType3Code.MunicipalVariableModeObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#NonStandardAssetUserCUSIP
 * DTCAssetType3Code.NonStandardAssetUserCUSIP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#OptionDerivative
 * DTCAssetType3Code.OptionDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#PreferredStock
 * DTCAssetType3Code.PreferredStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#PreferredStockREIT
 * DTCAssetType3Code.PreferredStockREIT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#RealEstateInvestmentTrust
 * DTCAssetType3Code.RealEstateInvestmentTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#RealEstateMortgageInvestmentConduit
 * DTCAssetType3Code.RealEstateMortgageInvestmentConduit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#Right
 * DTCAssetType3Code.Right}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#SealedEnvelope
 * DTCAssetType3Code.SealedEnvelope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#TenderRateNote
 * DTCAssetType3Code.TenderRateNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#TenderRatePreferredStock
 * DTCAssetType3Code.TenderRatePreferredStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#UnitInvestmentTrust
 * DTCAssetType3Code.UnitInvestmentTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#UnitInvestmentTrustNuveenOnly
 * DTCAssetType3Code.UnitInvestmentTrustNuveenOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#USGovernmentAgencySecurity
 * DTCAssetType3Code.USGovernmentAgencySecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#USTreasuryBill
 * DTCAssetType3Code.USTreasuryBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#USTreasuryBond
 * DTCAssetType3Code.USTreasuryBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#USTreasuryNote
 * DTCAssetType3Code.USTreasuryNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#USTreasurySecurity
 * DTCAssetType3Code.USTreasurySecurity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#Warrant
 * DTCAssetType3Code.Warrant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#ZCPNDenominationInitialPrincipalAmount
 * DTCAssetType3Code.ZCPNDenominationInitialPrincipalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code#ZeroCouponBond
 * DTCAssetType3Code.ZeroCouponBond}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeV2Code
 * DTCAssetTypeV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCAssetType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTC (The Depository Trust Company) security sub-issue type."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCAssetType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ABSDenominationUnitsOrUndividedInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code ABSDenominationUnitsOrUndividedInterest = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ABSDenominationUnitsOrUndividedInterest";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.ABSDenominationUnitsOrUndividedInterest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmericanDepositaryReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code AmericanDepositaryReceipt = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmericanDepositaryReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.AmericanDepositaryReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetBackedSecurityOrGlobal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code AssetBackedSecurityOrGlobal = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetBackedSecurityOrGlobal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.AssetBackedSecurityOrGlobal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuctionRatePreferredStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code AuctionRatePreferredStock = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuctionRatePreferredStock";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.AuctionRatePreferredStock.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BearerCallableZeroCouponBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code BearerCallableZeroCouponBond = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BearerCallableZeroCouponBond";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.BearerCallableZeroCouponBond.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificatedMoneyMarketInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code CertificatedMoneyMarketInstrument = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificatedMoneyMarketInstrument";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.CertificatedMoneyMarketInstrument.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificatedMoneyMarketPeriodicPayer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code CertificatedMoneyMarketPeriodicPayer = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificatedMoneyMarketPeriodicPayer";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.CertificatedMoneyMarketPeriodicPayer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificatesOfDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code CertificatesOfDeposit = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificatesOfDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.CertificatesOfDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedEndFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code ClosedEndFund = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedEndFund";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.ClosedEndFund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CMODenominationUnitsOrUndividedInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code CMODenominationUnitsOrUndividedInterest = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CMODenominationUnitsOrUndividedInterest";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.CMODenominationUnitsOrUndividedInterest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code CommonStock = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonStock";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.CommonStock.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonStockREIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code CommonStockREIT = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonStockREIT";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.CommonStockREIT.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsumerPriceIndexDiscountCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code ConsumerPriceIndexDiscountCP = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsumerPriceIndexDiscountCP";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.ConsumerPriceIndexDiscountCP.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleCommonStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code ConvertibleCommonStock = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertibleCommonStock";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.ConvertibleCommonStock.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleCorporateDebt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code ConvertibleCorporateDebt = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertibleCorporateDebt";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.ConvertibleCorporateDebt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateBondOrGlobal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code CorporateBondOrGlobal = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateBondOrGlobal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.CorporateBondOrGlobal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateDebenture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code CorporateDebenture = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateDebenture";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.CorporateDebenture.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateDebtDerivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code CorporateDebtDerivative = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateDebtDerivative";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.CorporateDebtDerivative.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateOtherTaxExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code CorporateOtherTaxExempt = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateOtherTaxExempt";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.CorporateOtherTaxExempt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateVariableModeObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code CorporateVariableModeObligation = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateVariableModeObligation";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.CorporateVariableModeObligation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateShortTermNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code CorporateShortTermNote = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateShortTermNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.CorporateShortTermNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateOrMunicipalVariableRateDemandObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code CorporateOrMunicipalVariableRateDemandObligation = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateOrMunicipalVariableRateDemandObligation";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.CorporateOrMunicipalVariableRateDemandObligation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateInsuredCustodialReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code CorporateInsuredCustodialReceipt = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateInsuredCustodialReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.CorporateInsuredCustodialReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateAuctionRateNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code CorporateAuctionRateNote = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateAuctionRateNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.CorporateAuctionRateNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Corporate144aDesignatedInvestors"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code Corporate144aDesignatedInvestors = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Corporate144aDesignatedInvestors";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.Corporate144aDesignatedInvestors.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertiblePreferredStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code ConvertiblePreferredStock = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertiblePreferredStock";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.ConvertiblePreferredStock.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsumerPriceIndexAtMaturityCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code ConsumerPriceIndexAtMaturityCP = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsumerPriceIndexAtMaturityCP";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.ConsumerPriceIndexAtMaturityCP.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralizedMortgageObligationOrGlobal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code CollateralizedMortgageObligationOrGlobal = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralizedMortgageObligationOrGlobal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.CollateralizedMortgageObligationOrGlobal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyUserCUSIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code CustodyUserCUSIP = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyUserCUSIP";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.CustodyUserCUSIP.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code DebtUnit = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtUnit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.DebtUnit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositaryShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code DepositaryShare = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositaryShare";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.DepositaryShare.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code Equity = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.Equity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equity144aDesignatedInvestors"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code Equity144aDesignatedInvestors = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity144aDesignatedInvestors";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.Equity144aDesignatedInvestors.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquityDerivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code EquityDerivative = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityDerivative";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.EquityDerivative.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquityUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code EquityUnit = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityUnit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.EquityUnit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeTradedFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code ExchangeTradedFunds = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedFunds";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.ExchangeTradedFunds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GNMAPassThroughSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code GNMAPassThroughSecurity = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMAPassThroughSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.GNMAPassThroughSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GNMARealEstateMortgageInvestmentConduit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code GNMARealEstateMortgageInvestmentConduit = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMARealEstateMortgageInvestmentConduit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.GNMARealEstateMortgageInvestmentConduit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GNMASerialNoteSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code GNMASerialNoteSecurity = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMASerialNoteSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.GNMASerialNoteSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentNationallMortgageAssociation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code GovernmentNationallMortgageAssociation = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentNationallMortgageAssociation";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.GovernmentNationallMortgageAssociation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code GovernmentSecurity = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.GovernmentSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentTrustCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code GovernmentTrustCertificate = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentTrustCertificate";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.GovernmentTrustCertificate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstitutionalMMIMutualFundShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code InstitutionalMMIMutualFundShare = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstitutionalMMIMutualFundShare";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.InstitutionalMMIMutualFundShare.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDenominationUnitsOrUndividedInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code IssueDenominationUnitsOrUndividedInterest = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDenominationUnitsOrUndividedInterest";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.IssueDenominationUnitsOrUndividedInterest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JunkAndTreasuryGrowthReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code JunkAndTreasuryGrowthReceipt = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JunkAndTreasuryGrowthReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.JunkAndTreasuryGrowthReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MediumTermNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code MediumTermNote = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MediumTermNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.MediumTermNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMICorporateVariableRateDemandObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code MMICorporateVariableRateDemandObligation = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMICorporateVariableRateDemandObligation";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.MMICorporateVariableRateDemandObligation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIDepositNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code MMIDepositNote = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIDepositNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.MMIDepositNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMICorporateCommercialPaper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code MMICorporateCommercialPaper = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMICorporateCommercialPaper";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.MMICorporateCommercialPaper.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIBankersAcceptanceNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code MMIBankersAcceptanceNote = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIBankersAcceptanceNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.MMIBankersAcceptanceNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedPartnership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code LimitedPartnership = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitedPartnership";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.LimitedPartnership.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GNMASerialNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code GNMASerialNote = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMASerialNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.GNMASerialNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalUnitTrust"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code GlobalUnitTrust = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalUnitTrust";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.GlobalUnitTrust.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIDiscountNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code MMIDiscountNote = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIDiscountNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.MMIDiscountNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIInstitutionalCertificatesOfDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code MMIInstitutionalCertificatesOfDeposit = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIInstitutionalCertificatesOfDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.MMIInstitutionalCertificatesOfDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIMediumTermNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code MMIMediumTermNote = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMediumTermNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.MMIMediumTermNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIMunicipalVariableRateDemandObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code MMIMunicipalVariableRateDemandObligation = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMunicipalVariableRateDemandObligation";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.MMIMunicipalVariableRateDemandObligation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIPreferredStockCPLike"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code MMIPreferredStockCPLike = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIPreferredStockCPLike";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.MMIPreferredStockCPLike.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalAmortizedIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code MunicipalAmortizedIssue = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalAmortizedIssue";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.MunicipalAmortizedIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code MunicipalBond = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalBond";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.MunicipalBond.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalDerivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code MunicipalDerivative = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalDerivative";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.MunicipalDerivative.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code MunicipalNote = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.MunicipalNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalOtherTaxExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code MunicipalOtherTaxExempt = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalOtherTaxExempt";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.MunicipalOtherTaxExempt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MutualFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code MutualFund = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MutualFund";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.MutualFund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonCMOABSAmortizingIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code NonCMOABSAmortizingIssue = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonCMOABSAmortizingIssue";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.NonCMOABSAmortizingIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Package"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code Package = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Package";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.Package.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeriodicPaymentCommercialPaper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code PeriodicPaymentCommercialPaper = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodicPaymentCommercialPaper";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.PeriodicPaymentCommercialPaper.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIShortTermBankNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code MMIShortTermBankNote = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIShortTermBankNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.MMIShortTermBankNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIMediumTermBankNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code MMIMediumTermBankNote = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMediumTermBankNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.MMIMediumTermBankNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIMunicipalCommercialPaper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code MMIMunicipalCommercialPaper = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMunicipalCommercialPaper";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.MMIMunicipalCommercialPaper.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalAuctionRateNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code MunicipalAuctionRateNote = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalAuctionRateNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.MunicipalAuctionRateNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalInsuredCustodialReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code MunicipalInsuredCustodialReceipt = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalInsuredCustodialReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.MunicipalInsuredCustodialReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalOptionCallRight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code MunicipalOptionCallRight = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalOptionCallRight";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.MunicipalOptionCallRight.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalVariableRateDemandObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code MunicipalVariableRateDemandObligation = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalVariableRateDemandObligation";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.MunicipalVariableRateDemandObligation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalVariableModeObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code MunicipalVariableModeObligation = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalVariableModeObligation";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.MunicipalVariableModeObligation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonStandardAssetUserCUSIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code NonStandardAssetUserCUSIP = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandardAssetUserCUSIP";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.NonStandardAssetUserCUSIP.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionDerivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code OptionDerivative = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionDerivative";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.OptionDerivative.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreferredStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code PreferredStock = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreferredStock";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.PreferredStock.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreferredStockREIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code PreferredStockREIT = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreferredStockREIT";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.PreferredStockREIT.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealEstateInvestmentTrust"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code RealEstateInvestmentTrust = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealEstateInvestmentTrust";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.RealEstateInvestmentTrust.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealEstateMortgageInvestmentConduit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code RealEstateMortgageInvestmentConduit = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealEstateMortgageInvestmentConduit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.RealEstateMortgageInvestmentConduit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Right"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code Right = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Right";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.Right.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SealedEnvelope"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code SealedEnvelope = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SealedEnvelope";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.SealedEnvelope.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderRateNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code TenderRateNote = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderRateNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.TenderRateNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderRatePreferredStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code TenderRatePreferredStock = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderRatePreferredStock";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.TenderRatePreferredStock.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitInvestmentTrust"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code UnitInvestmentTrust = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitInvestmentTrust";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.UnitInvestmentTrust.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitInvestmentTrustNuveenOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code UnitInvestmentTrustNuveenOnly = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitInvestmentTrustNuveenOnly";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.UnitInvestmentTrustNuveenOnly.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGovernmentAgencySecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code USGovernmentAgencySecurity = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGovernmentAgencySecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.USGovernmentAgencySecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTreasuryBill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code USTreasuryBill = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasuryBill";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.USTreasuryBill.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTreasuryBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code USTreasuryBond = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasuryBond";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.USTreasuryBond.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTreasuryNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code USTreasuryNote = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasuryNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.USTreasuryNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTreasurySecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code USTreasurySecurity = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasurySecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.USTreasurySecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Warrant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code Warrant = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Warrant";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.Warrant.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZCPNDenominationInitialPrincipalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code ZCPNDenominationInitialPrincipalAmount = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZCPNDenominationInitialPrincipalAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.ZCPNDenominationInitialPrincipalAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZeroCouponBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType3Code ZeroCouponBond = new DTCAssetType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZeroCouponBond";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType3Code.mmObject();
			codeName = DTCAssetTypeV2Code.ZeroCouponBond.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCAssetType3Code> codesByName = new LinkedHashMap<>();

	protected DTCAssetType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCAssetType3Code";
				definition = "Specifies DTC (The Depository Trust Company) security sub-issue type.";
				trace_lazy = () -> DTCAssetTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCAssetType3Code.ABSDenominationUnitsOrUndividedInterest, com.tools20022.repository.codeset.DTCAssetType3Code.AmericanDepositaryReceipt,
						com.tools20022.repository.codeset.DTCAssetType3Code.AssetBackedSecurityOrGlobal, com.tools20022.repository.codeset.DTCAssetType3Code.AuctionRatePreferredStock,
						com.tools20022.repository.codeset.DTCAssetType3Code.BearerCallableZeroCouponBond, com.tools20022.repository.codeset.DTCAssetType3Code.CertificatedMoneyMarketInstrument,
						com.tools20022.repository.codeset.DTCAssetType3Code.CertificatedMoneyMarketPeriodicPayer, com.tools20022.repository.codeset.DTCAssetType3Code.CertificatesOfDeposit,
						com.tools20022.repository.codeset.DTCAssetType3Code.ClosedEndFund, com.tools20022.repository.codeset.DTCAssetType3Code.CMODenominationUnitsOrUndividedInterest,
						com.tools20022.repository.codeset.DTCAssetType3Code.CommonStock, com.tools20022.repository.codeset.DTCAssetType3Code.CommonStockREIT, com.tools20022.repository.codeset.DTCAssetType3Code.ConsumerPriceIndexDiscountCP,
						com.tools20022.repository.codeset.DTCAssetType3Code.ConvertibleCommonStock, com.tools20022.repository.codeset.DTCAssetType3Code.ConvertibleCorporateDebt,
						com.tools20022.repository.codeset.DTCAssetType3Code.CorporateBondOrGlobal, com.tools20022.repository.codeset.DTCAssetType3Code.CorporateDebenture,
						com.tools20022.repository.codeset.DTCAssetType3Code.CorporateDebtDerivative, com.tools20022.repository.codeset.DTCAssetType3Code.CorporateOtherTaxExempt,
						com.tools20022.repository.codeset.DTCAssetType3Code.CorporateVariableModeObligation, com.tools20022.repository.codeset.DTCAssetType3Code.CorporateShortTermNote,
						com.tools20022.repository.codeset.DTCAssetType3Code.CorporateOrMunicipalVariableRateDemandObligation, com.tools20022.repository.codeset.DTCAssetType3Code.CorporateInsuredCustodialReceipt,
						com.tools20022.repository.codeset.DTCAssetType3Code.CorporateAuctionRateNote, com.tools20022.repository.codeset.DTCAssetType3Code.Corporate144aDesignatedInvestors,
						com.tools20022.repository.codeset.DTCAssetType3Code.ConvertiblePreferredStock, com.tools20022.repository.codeset.DTCAssetType3Code.ConsumerPriceIndexAtMaturityCP,
						com.tools20022.repository.codeset.DTCAssetType3Code.CollateralizedMortgageObligationOrGlobal, com.tools20022.repository.codeset.DTCAssetType3Code.CustodyUserCUSIP,
						com.tools20022.repository.codeset.DTCAssetType3Code.DebtUnit, com.tools20022.repository.codeset.DTCAssetType3Code.DepositaryShare, com.tools20022.repository.codeset.DTCAssetType3Code.Equity,
						com.tools20022.repository.codeset.DTCAssetType3Code.Equity144aDesignatedInvestors, com.tools20022.repository.codeset.DTCAssetType3Code.EquityDerivative,
						com.tools20022.repository.codeset.DTCAssetType3Code.EquityUnit, com.tools20022.repository.codeset.DTCAssetType3Code.ExchangeTradedFunds, com.tools20022.repository.codeset.DTCAssetType3Code.GNMAPassThroughSecurity,
						com.tools20022.repository.codeset.DTCAssetType3Code.GNMARealEstateMortgageInvestmentConduit, com.tools20022.repository.codeset.DTCAssetType3Code.GNMASerialNoteSecurity,
						com.tools20022.repository.codeset.DTCAssetType3Code.GovernmentNationallMortgageAssociation, com.tools20022.repository.codeset.DTCAssetType3Code.GovernmentSecurity,
						com.tools20022.repository.codeset.DTCAssetType3Code.GovernmentTrustCertificate, com.tools20022.repository.codeset.DTCAssetType3Code.InstitutionalMMIMutualFundShare,
						com.tools20022.repository.codeset.DTCAssetType3Code.IssueDenominationUnitsOrUndividedInterest, com.tools20022.repository.codeset.DTCAssetType3Code.JunkAndTreasuryGrowthReceipt,
						com.tools20022.repository.codeset.DTCAssetType3Code.MediumTermNote, com.tools20022.repository.codeset.DTCAssetType3Code.MMICorporateVariableRateDemandObligation,
						com.tools20022.repository.codeset.DTCAssetType3Code.MMIDepositNote, com.tools20022.repository.codeset.DTCAssetType3Code.MMICorporateCommercialPaper,
						com.tools20022.repository.codeset.DTCAssetType3Code.MMIBankersAcceptanceNote, com.tools20022.repository.codeset.DTCAssetType3Code.LimitedPartnership,
						com.tools20022.repository.codeset.DTCAssetType3Code.GNMASerialNote, com.tools20022.repository.codeset.DTCAssetType3Code.GlobalUnitTrust, com.tools20022.repository.codeset.DTCAssetType3Code.MMIDiscountNote,
						com.tools20022.repository.codeset.DTCAssetType3Code.MMIInstitutionalCertificatesOfDeposit, com.tools20022.repository.codeset.DTCAssetType3Code.MMIMediumTermNote,
						com.tools20022.repository.codeset.DTCAssetType3Code.MMIMunicipalVariableRateDemandObligation, com.tools20022.repository.codeset.DTCAssetType3Code.MMIPreferredStockCPLike,
						com.tools20022.repository.codeset.DTCAssetType3Code.MunicipalAmortizedIssue, com.tools20022.repository.codeset.DTCAssetType3Code.MunicipalBond,
						com.tools20022.repository.codeset.DTCAssetType3Code.MunicipalDerivative, com.tools20022.repository.codeset.DTCAssetType3Code.MunicipalNote,
						com.tools20022.repository.codeset.DTCAssetType3Code.MunicipalOtherTaxExempt, com.tools20022.repository.codeset.DTCAssetType3Code.MutualFund,
						com.tools20022.repository.codeset.DTCAssetType3Code.NonCMOABSAmortizingIssue, com.tools20022.repository.codeset.DTCAssetType3Code.Package,
						com.tools20022.repository.codeset.DTCAssetType3Code.PeriodicPaymentCommercialPaper, com.tools20022.repository.codeset.DTCAssetType3Code.MMIShortTermBankNote,
						com.tools20022.repository.codeset.DTCAssetType3Code.MMIMediumTermBankNote, com.tools20022.repository.codeset.DTCAssetType3Code.MMIMunicipalCommercialPaper,
						com.tools20022.repository.codeset.DTCAssetType3Code.MunicipalAuctionRateNote, com.tools20022.repository.codeset.DTCAssetType3Code.MunicipalInsuredCustodialReceipt,
						com.tools20022.repository.codeset.DTCAssetType3Code.MunicipalOptionCallRight, com.tools20022.repository.codeset.DTCAssetType3Code.MunicipalVariableRateDemandObligation,
						com.tools20022.repository.codeset.DTCAssetType3Code.MunicipalVariableModeObligation, com.tools20022.repository.codeset.DTCAssetType3Code.NonStandardAssetUserCUSIP,
						com.tools20022.repository.codeset.DTCAssetType3Code.OptionDerivative, com.tools20022.repository.codeset.DTCAssetType3Code.PreferredStock, com.tools20022.repository.codeset.DTCAssetType3Code.PreferredStockREIT,
						com.tools20022.repository.codeset.DTCAssetType3Code.RealEstateInvestmentTrust, com.tools20022.repository.codeset.DTCAssetType3Code.RealEstateMortgageInvestmentConduit,
						com.tools20022.repository.codeset.DTCAssetType3Code.Right, com.tools20022.repository.codeset.DTCAssetType3Code.SealedEnvelope, com.tools20022.repository.codeset.DTCAssetType3Code.TenderRateNote,
						com.tools20022.repository.codeset.DTCAssetType3Code.TenderRatePreferredStock, com.tools20022.repository.codeset.DTCAssetType3Code.UnitInvestmentTrust,
						com.tools20022.repository.codeset.DTCAssetType3Code.UnitInvestmentTrustNuveenOnly, com.tools20022.repository.codeset.DTCAssetType3Code.USGovernmentAgencySecurity,
						com.tools20022.repository.codeset.DTCAssetType3Code.USTreasuryBill, com.tools20022.repository.codeset.DTCAssetType3Code.USTreasuryBond, com.tools20022.repository.codeset.DTCAssetType3Code.USTreasuryNote,
						com.tools20022.repository.codeset.DTCAssetType3Code.USTreasurySecurity, com.tools20022.repository.codeset.DTCAssetType3Code.Warrant,
						com.tools20022.repository.codeset.DTCAssetType3Code.ZCPNDenominationInitialPrincipalAmount, com.tools20022.repository.codeset.DTCAssetType3Code.ZeroCouponBond);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ABSDenominationUnitsOrUndividedInterest.getCodeName().get(), ABSDenominationUnitsOrUndividedInterest);
		codesByName.put(AmericanDepositaryReceipt.getCodeName().get(), AmericanDepositaryReceipt);
		codesByName.put(AssetBackedSecurityOrGlobal.getCodeName().get(), AssetBackedSecurityOrGlobal);
		codesByName.put(AuctionRatePreferredStock.getCodeName().get(), AuctionRatePreferredStock);
		codesByName.put(BearerCallableZeroCouponBond.getCodeName().get(), BearerCallableZeroCouponBond);
		codesByName.put(CertificatedMoneyMarketInstrument.getCodeName().get(), CertificatedMoneyMarketInstrument);
		codesByName.put(CertificatedMoneyMarketPeriodicPayer.getCodeName().get(), CertificatedMoneyMarketPeriodicPayer);
		codesByName.put(CertificatesOfDeposit.getCodeName().get(), CertificatesOfDeposit);
		codesByName.put(ClosedEndFund.getCodeName().get(), ClosedEndFund);
		codesByName.put(CMODenominationUnitsOrUndividedInterest.getCodeName().get(), CMODenominationUnitsOrUndividedInterest);
		codesByName.put(CommonStock.getCodeName().get(), CommonStock);
		codesByName.put(CommonStockREIT.getCodeName().get(), CommonStockREIT);
		codesByName.put(ConsumerPriceIndexDiscountCP.getCodeName().get(), ConsumerPriceIndexDiscountCP);
		codesByName.put(ConvertibleCommonStock.getCodeName().get(), ConvertibleCommonStock);
		codesByName.put(ConvertibleCorporateDebt.getCodeName().get(), ConvertibleCorporateDebt);
		codesByName.put(CorporateBondOrGlobal.getCodeName().get(), CorporateBondOrGlobal);
		codesByName.put(CorporateDebenture.getCodeName().get(), CorporateDebenture);
		codesByName.put(CorporateDebtDerivative.getCodeName().get(), CorporateDebtDerivative);
		codesByName.put(CorporateOtherTaxExempt.getCodeName().get(), CorporateOtherTaxExempt);
		codesByName.put(CorporateVariableModeObligation.getCodeName().get(), CorporateVariableModeObligation);
		codesByName.put(CorporateShortTermNote.getCodeName().get(), CorporateShortTermNote);
		codesByName.put(CorporateOrMunicipalVariableRateDemandObligation.getCodeName().get(), CorporateOrMunicipalVariableRateDemandObligation);
		codesByName.put(CorporateInsuredCustodialReceipt.getCodeName().get(), CorporateInsuredCustodialReceipt);
		codesByName.put(CorporateAuctionRateNote.getCodeName().get(), CorporateAuctionRateNote);
		codesByName.put(Corporate144aDesignatedInvestors.getCodeName().get(), Corporate144aDesignatedInvestors);
		codesByName.put(ConvertiblePreferredStock.getCodeName().get(), ConvertiblePreferredStock);
		codesByName.put(ConsumerPriceIndexAtMaturityCP.getCodeName().get(), ConsumerPriceIndexAtMaturityCP);
		codesByName.put(CollateralizedMortgageObligationOrGlobal.getCodeName().get(), CollateralizedMortgageObligationOrGlobal);
		codesByName.put(CustodyUserCUSIP.getCodeName().get(), CustodyUserCUSIP);
		codesByName.put(DebtUnit.getCodeName().get(), DebtUnit);
		codesByName.put(DepositaryShare.getCodeName().get(), DepositaryShare);
		codesByName.put(Equity.getCodeName().get(), Equity);
		codesByName.put(Equity144aDesignatedInvestors.getCodeName().get(), Equity144aDesignatedInvestors);
		codesByName.put(EquityDerivative.getCodeName().get(), EquityDerivative);
		codesByName.put(EquityUnit.getCodeName().get(), EquityUnit);
		codesByName.put(ExchangeTradedFunds.getCodeName().get(), ExchangeTradedFunds);
		codesByName.put(GNMAPassThroughSecurity.getCodeName().get(), GNMAPassThroughSecurity);
		codesByName.put(GNMARealEstateMortgageInvestmentConduit.getCodeName().get(), GNMARealEstateMortgageInvestmentConduit);
		codesByName.put(GNMASerialNoteSecurity.getCodeName().get(), GNMASerialNoteSecurity);
		codesByName.put(GovernmentNationallMortgageAssociation.getCodeName().get(), GovernmentNationallMortgageAssociation);
		codesByName.put(GovernmentSecurity.getCodeName().get(), GovernmentSecurity);
		codesByName.put(GovernmentTrustCertificate.getCodeName().get(), GovernmentTrustCertificate);
		codesByName.put(InstitutionalMMIMutualFundShare.getCodeName().get(), InstitutionalMMIMutualFundShare);
		codesByName.put(IssueDenominationUnitsOrUndividedInterest.getCodeName().get(), IssueDenominationUnitsOrUndividedInterest);
		codesByName.put(JunkAndTreasuryGrowthReceipt.getCodeName().get(), JunkAndTreasuryGrowthReceipt);
		codesByName.put(MediumTermNote.getCodeName().get(), MediumTermNote);
		codesByName.put(MMICorporateVariableRateDemandObligation.getCodeName().get(), MMICorporateVariableRateDemandObligation);
		codesByName.put(MMIDepositNote.getCodeName().get(), MMIDepositNote);
		codesByName.put(MMICorporateCommercialPaper.getCodeName().get(), MMICorporateCommercialPaper);
		codesByName.put(MMIBankersAcceptanceNote.getCodeName().get(), MMIBankersAcceptanceNote);
		codesByName.put(LimitedPartnership.getCodeName().get(), LimitedPartnership);
		codesByName.put(GNMASerialNote.getCodeName().get(), GNMASerialNote);
		codesByName.put(GlobalUnitTrust.getCodeName().get(), GlobalUnitTrust);
		codesByName.put(MMIDiscountNote.getCodeName().get(), MMIDiscountNote);
		codesByName.put(MMIInstitutionalCertificatesOfDeposit.getCodeName().get(), MMIInstitutionalCertificatesOfDeposit);
		codesByName.put(MMIMediumTermNote.getCodeName().get(), MMIMediumTermNote);
		codesByName.put(MMIMunicipalVariableRateDemandObligation.getCodeName().get(), MMIMunicipalVariableRateDemandObligation);
		codesByName.put(MMIPreferredStockCPLike.getCodeName().get(), MMIPreferredStockCPLike);
		codesByName.put(MunicipalAmortizedIssue.getCodeName().get(), MunicipalAmortizedIssue);
		codesByName.put(MunicipalBond.getCodeName().get(), MunicipalBond);
		codesByName.put(MunicipalDerivative.getCodeName().get(), MunicipalDerivative);
		codesByName.put(MunicipalNote.getCodeName().get(), MunicipalNote);
		codesByName.put(MunicipalOtherTaxExempt.getCodeName().get(), MunicipalOtherTaxExempt);
		codesByName.put(MutualFund.getCodeName().get(), MutualFund);
		codesByName.put(NonCMOABSAmortizingIssue.getCodeName().get(), NonCMOABSAmortizingIssue);
		codesByName.put(Package.getCodeName().get(), Package);
		codesByName.put(PeriodicPaymentCommercialPaper.getCodeName().get(), PeriodicPaymentCommercialPaper);
		codesByName.put(MMIShortTermBankNote.getCodeName().get(), MMIShortTermBankNote);
		codesByName.put(MMIMediumTermBankNote.getCodeName().get(), MMIMediumTermBankNote);
		codesByName.put(MMIMunicipalCommercialPaper.getCodeName().get(), MMIMunicipalCommercialPaper);
		codesByName.put(MunicipalAuctionRateNote.getCodeName().get(), MunicipalAuctionRateNote);
		codesByName.put(MunicipalInsuredCustodialReceipt.getCodeName().get(), MunicipalInsuredCustodialReceipt);
		codesByName.put(MunicipalOptionCallRight.getCodeName().get(), MunicipalOptionCallRight);
		codesByName.put(MunicipalVariableRateDemandObligation.getCodeName().get(), MunicipalVariableRateDemandObligation);
		codesByName.put(MunicipalVariableModeObligation.getCodeName().get(), MunicipalVariableModeObligation);
		codesByName.put(NonStandardAssetUserCUSIP.getCodeName().get(), NonStandardAssetUserCUSIP);
		codesByName.put(OptionDerivative.getCodeName().get(), OptionDerivative);
		codesByName.put(PreferredStock.getCodeName().get(), PreferredStock);
		codesByName.put(PreferredStockREIT.getCodeName().get(), PreferredStockREIT);
		codesByName.put(RealEstateInvestmentTrust.getCodeName().get(), RealEstateInvestmentTrust);
		codesByName.put(RealEstateMortgageInvestmentConduit.getCodeName().get(), RealEstateMortgageInvestmentConduit);
		codesByName.put(Right.getCodeName().get(), Right);
		codesByName.put(SealedEnvelope.getCodeName().get(), SealedEnvelope);
		codesByName.put(TenderRateNote.getCodeName().get(), TenderRateNote);
		codesByName.put(TenderRatePreferredStock.getCodeName().get(), TenderRatePreferredStock);
		codesByName.put(UnitInvestmentTrust.getCodeName().get(), UnitInvestmentTrust);
		codesByName.put(UnitInvestmentTrustNuveenOnly.getCodeName().get(), UnitInvestmentTrustNuveenOnly);
		codesByName.put(USGovernmentAgencySecurity.getCodeName().get(), USGovernmentAgencySecurity);
		codesByName.put(USTreasuryBill.getCodeName().get(), USTreasuryBill);
		codesByName.put(USTreasuryBond.getCodeName().get(), USTreasuryBond);
		codesByName.put(USTreasuryNote.getCodeName().get(), USTreasuryNote);
		codesByName.put(USTreasurySecurity.getCodeName().get(), USTreasurySecurity);
		codesByName.put(Warrant.getCodeName().get(), Warrant);
		codesByName.put(ZCPNDenominationInitialPrincipalAmount.getCodeName().get(), ZCPNDenominationInitialPrincipalAmount);
		codesByName.put(ZeroCouponBond.getCodeName().get(), ZeroCouponBond);
	}

	public static DTCAssetType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCAssetType3Code[] values() {
		DTCAssetType3Code[] values = new DTCAssetType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCAssetType3Code> {
		@Override
		public DTCAssetType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCAssetType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}