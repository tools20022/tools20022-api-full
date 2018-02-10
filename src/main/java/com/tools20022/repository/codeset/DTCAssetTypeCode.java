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
import com.tools20022.repository.codeset.DTCAssetTypeCode.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#Equity
 * DTCAssetTypeCode.Equity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#CommonStock
 * DTCAssetTypeCode.CommonStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#ConvertibleCommonStock
 * DTCAssetTypeCode.ConvertibleCommonStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#CommonStockREIT
 * DTCAssetTypeCode.CommonStockREIT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#PreferredStock
 * DTCAssetTypeCode.PreferredStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#PreferredStockREIT
 * DTCAssetTypeCode.PreferredStockREIT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#ConvertiblePreferredStock
 * DTCAssetTypeCode.ConvertiblePreferredStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#TenderRatePreferredStock
 * DTCAssetTypeCode.TenderRatePreferredStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#LimitedPartnership
 * DTCAssetTypeCode.LimitedPartnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#CMODenominUnitsorUndividedInterest
 * DTCAssetTypeCode.CMODenominUnitsorUndividedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#ABSDenominUnitsorUndividedInterest
 * DTCAssetTypeCode.ABSDenominUnitsorUndividedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#IssueDenominUnitsorUndividedInterest
 * DTCAssetTypeCode.IssueDenominUnitsorUndividedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#AuctionRatePreferredStockARPS
 * DTCAssetTypeCode.AuctionRatePreferredStockARPS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#AmericanDepositaryReceiptADR
 * DTCAssetTypeCode.AmericanDepositaryReceiptADR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#DepositaryShare
 * DTCAssetTypeCode.DepositaryShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#MunicipalOptionCallRight
 * DTCAssetTypeCode.MunicipalOptionCallRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#ExchangeTradedFunds
 * DTCAssetTypeCode.ExchangeTradedFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#MMIPreferredStockinCPlikemode
 * DTCAssetTypeCode.MMIPreferredStockinCPlikemode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#SealedEnvelope
 * DTCAssetTypeCode.SealedEnvelope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#CustodyUserCUSIP
 * DTCAssetTypeCode.CustodyUserCUSIP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#RealEstateInvestmentTrustREIT
 * DTCAssetTypeCode.RealEstateInvestmentTrustREIT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#MunicipalBond
 * DTCAssetTypeCode.MunicipalBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#MunicipalNote
 * DTCAssetTypeCode.MunicipalNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#MunicipalAuctionRateNoteARN
 * DTCAssetTypeCode.MunicipalAuctionRateNoteARN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#MunicipalVariableModeObligationVMO
 * DTCAssetTypeCode.MunicipalVariableModeObligationVMO}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#MunicipalVariableRateDemandObligationVRDO
 * DTCAssetTypeCode.MunicipalVariableRateDemandObligationVRDO}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#MunicipalInsuredCustodialReceipt
 * DTCAssetTypeCode.MunicipalInsuredCustodialReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#MMIMunicipalVRDOCP
 * DTCAssetTypeCode.MMIMunicipalVRDOCP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#MMIMunicipalCommercialPaper
 * DTCAssetTypeCode.MMIMunicipalCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#BearerCallableZeroCouponBond
 * DTCAssetTypeCode.BearerCallableZeroCouponBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#GNMAREMICSecurities
 * DTCAssetTypeCode.GNMAREMICSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#GNMAPassThroughSecurities
 * DTCAssetTypeCode.GNMAPassThroughSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#GNMASerialNoteSecurities
 * DTCAssetTypeCode.GNMASerialNoteSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#CorporateBondCBorGlobalCorpBondGCB
 * DTCAssetTypeCode.CorporateBondCBorGlobalCorpBondGCB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#MMIBankersAcceptanceNoteBA
 * DTCAssetTypeCode.MMIBankersAcceptanceNoteBA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#MMIInstitutionalCertificatesofDeposit
 * DTCAssetTypeCode.MMIInstitutionalCertificatesofDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#CertificatedMoneyMarketInstrument
 * DTCAssetTypeCode.CertificatedMoneyMarketInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#CertificatedMoneyMarketPeriodicPayer
 * DTCAssetTypeCode.CertificatedMoneyMarketPeriodicPayer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#CertificatesOfDeposit
 * DTCAssetTypeCode.CertificatesOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#CPIInterestAtMaturityIAMCommercialPaper
 * DTCAssetTypeCode.CPIInterestAtMaturityIAMCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#PeriodicPaymentCommercialPaper
 * DTCAssetTypeCode.PeriodicPaymentCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#CPIDiscountCommercialPaperCP
 * DTCAssetTypeCode.CPIDiscountCommercialPaperCP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#MMICorporateCommercialPaper
 * DTCAssetTypeCode.MMICorporateCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#MMICorporateVRDOCP
 * DTCAssetTypeCode.MMICorporateVRDOCP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#MTNMediumTermNote
 * DTCAssetTypeCode.MTNMediumTermNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#MMIDepositNote
 * DTCAssetTypeCode.MMIDepositNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#MMIMediumTermBankNote
 * DTCAssetTypeCode.MMIMediumTermBankNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#MMIMediumTermNote
 * DTCAssetTypeCode.MMIMediumTermNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#CollateralizedMtgeObligationorGlobalCMO
 * DTCAssetTypeCode.CollateralizedMtgeObligationorGlobalCMO}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#AssetBackedSecurityABSorGlobalABSGABS
 * DTCAssetTypeCode.AssetBackedSecurityABSorGlobalABSGABS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#NonCMOABSAmortizingIssue
 * DTCAssetTypeCode.NonCMOABSAmortizingIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#MMIShortTermBankNote
 * DTCAssetTypeCode.MMIShortTermBankNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#ZCPNDenominInitialPrincipalAmt
 * DTCAssetTypeCode.ZCPNDenominInitialPrincipalAmt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#MMIDiscountNote
 * DTCAssetTypeCode.MMIDiscountNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#CorporateAuctionRateNote
 * DTCAssetTypeCode.CorporateAuctionRateNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#ConvertibleCorporateDebt
 * DTCAssetTypeCode.ConvertibleCorporateDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#CorporateVariableModeObligationCVMO
 * DTCAssetTypeCode.CorporateVariableModeObligationCVMO}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#CorporateShortTermNote
 * DTCAssetTypeCode.CorporateShortTermNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#CorporateDebenture
 * DTCAssetTypeCode.CorporateDebenture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#CorporateVRDOMunicipalVRDOMMD
 * DTCAssetTypeCode.CorporateVRDOMunicipalVRDOMMD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#CorporateInsuredCustodialReceipt
 * DTCAssetTypeCode.CorporateInsuredCustodialReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#TenderRateNote
 * DTCAssetTypeCode.TenderRateNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#ZeroCouponBond
 * DTCAssetTypeCode.ZeroCouponBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#GovernmentSecurity
 * DTCAssetTypeCode.GovernmentSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#GovernmentTrustCertificate
 * DTCAssetTypeCode.GovernmentTrustCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#JunkAndTreasuryGrowthReceiptJGR
 * DTCAssetTypeCode.JunkAndTreasuryGrowthReceiptJGR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#USTreasurySecurity
 * DTCAssetTypeCode.USTreasurySecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#USTreasuryBill
 * DTCAssetTypeCode.USTreasuryBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#USTreasuryNote
 * DTCAssetTypeCode.USTreasuryNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#USTreasuryBond
 * DTCAssetTypeCode.USTreasuryBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#USGovernmentAgencySecurity
 * DTCAssetTypeCode.USGovernmentAgencySecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#GovernmentNatlMortgageAssociationGNMA
 * DTCAssetTypeCode.GovernmentNatlMortgageAssociationGNMA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#REMICRealEstateMtgeInvestmentConduit
 * DTCAssetTypeCode.REMICRealEstateMtgeInvestmentConduit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#GNMASerialNote
 * DTCAssetTypeCode.GNMASerialNote}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#Package
 * DTCAssetTypeCode.Package}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#CorporateDebtDerivative
 * DTCAssetTypeCode.CorporateDebtDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#EquityDerivative
 * DTCAssetTypeCode.EquityDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#MunicipalDerivative
 * DTCAssetTypeCode.MunicipalDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#MunicipalAmortizedIssue
 * DTCAssetTypeCode.MunicipalAmortizedIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#OptionDerivative
 * DTCAssetTypeCode.OptionDerivative}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#Warrant
 * DTCAssetTypeCode.Warrant}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#Right
 * DTCAssetTypeCode.Right}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#MutualFund
 * DTCAssetTypeCode.MutualFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#ClosedEndFund
 * DTCAssetTypeCode.ClosedEndFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#IMMIInstitutionalMMIMutualFundShares
 * DTCAssetTypeCode.IMMIInstitutionalMMIMutualFundShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#EquityUnit
 * DTCAssetTypeCode.EquityUnit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#DebtUnit
 * DTCAssetTypeCode.DebtUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#UnitInvestmentTrustUITNuveenOnly
 * DTCAssetTypeCode.UnitInvestmentTrustUITNuveenOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#GlobalUnitTrust
 * DTCAssetTypeCode.GlobalUnitTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#UnitInvestmentTrustUIT
 * DTCAssetTypeCode.UnitInvestmentTrustUIT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#Equity144aDesignatedInvestors
 * DTCAssetTypeCode.Equity144aDesignatedInvestors}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#MunicipalOtherTaxExempt
 * DTCAssetTypeCode.MunicipalOtherTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#CorporateOtherTaxExempt
 * DTCAssetTypeCode.CorporateOtherTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#Corporate144aDesignatedInvestors
 * DTCAssetTypeCode.Corporate144aDesignatedInvestors}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#NonStandardAssetUserCUSIP
 * DTCAssetTypeCode.NonStandardAssetUserCUSIP}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
 * DTCAssetType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
 * DTCAssetType2Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCAssetTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTC (The Depository Trust Company) security sub-issue type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCAssetTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Equity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S005"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Equity."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode Equity = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity";
			definition = "Equity.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S005";
		}
	};
	/**
	 * Common Stock.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S010"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Common Stock."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode CommonStock = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonStock";
			definition = "Common Stock.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S010";
		}
	};
	/**
	 * Convertible Common Stock.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S011"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleCommonStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Convertible Common Stock."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode ConvertibleCommonStock = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertibleCommonStock";
			definition = "Convertible Common Stock.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S011";
		}
	};
	/**
	 * Common Stock REIT.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S012"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonStockREIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Common Stock REIT."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode CommonStockREIT = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonStockREIT";
			definition = "Common Stock REIT.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S012";
		}
	};
	/**
	 * Preferred Stock.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S020"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreferredStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Preferred Stock."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode PreferredStock = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreferredStock";
			definition = "Preferred Stock.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S020";
		}
	};
	/**
	 * Preferred Stock REIT.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S022"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreferredStockREIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Preferred Stock REIT."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode PreferredStockREIT = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreferredStockREIT";
			definition = "Preferred Stock REIT.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S022";
		}
	};
	/**
	 * Convertible Preferred Stock.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S023"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertiblePreferredStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Convertible Preferred Stock."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode ConvertiblePreferredStock = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertiblePreferredStock";
			definition = "Convertible Preferred Stock.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S023";
		}
	};
	/**
	 * Tender Rate Preferred Stock.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S024"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderRatePreferredStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tender Rate Preferred Stock."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode TenderRatePreferredStock = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderRatePreferredStock";
			definition = "Tender Rate Preferred Stock.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S024";
		}
	};
	/**
	 * Limited Partnership.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S030"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedPartnership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Limited Partnership."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode LimitedPartnership = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitedPartnership";
			definition = "Limited Partnership.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S030";
		}
	};
	/**
	 * CMO Denomination in "Units" or "Undivided Interest".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S040"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CMODenominUnitsorUndividedInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CMO Denomination in \"Units\" or \"Undivided Interest\"."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode CMODenominUnitsorUndividedInterest = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CMODenominUnitsorUndividedInterest";
			definition = "CMO Denomination in \"Units\" or \"Undivided Interest\".";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S040";
		}
	};
	/**
	 * ABS Denomination in "Units" or "Undivided Interest".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S041"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ABSDenominUnitsorUndividedInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ABS Denomination in \"Units\" or \"Undivided Interest\"."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode ABSDenominUnitsorUndividedInterest = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ABSDenominUnitsorUndividedInterest";
			definition = "ABS Denomination in \"Units\" or \"Undivided Interest\".";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S041";
		}
	};
	/**
	 * Issue Denomination in "Units" or "Undivided Interest".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S042"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDenominUnitsorUndividedInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Issue Denomination in \"Units\" or \"Undivided Interest\"."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode IssueDenominUnitsorUndividedInterest = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDenominUnitsorUndividedInterest";
			definition = "Issue Denomination in \"Units\" or \"Undivided Interest\".";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S042";
		}
	};
	/**
	 * Auction Rate Preferred Stock (ARPS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S102"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuctionRatePreferredStockARPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Auction Rate Preferred Stock (ARPS)."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode AuctionRatePreferredStockARPS = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuctionRatePreferredStockARPS";
			definition = "Auction Rate Preferred Stock (ARPS).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S102";
		}
	};
	/**
	 * American Depositary Receipt (ADR).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S110"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmericanDepositaryReceiptADR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "American Depositary Receipt (ADR)."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode AmericanDepositaryReceiptADR = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmericanDepositaryReceiptADR";
			definition = "American Depositary Receipt (ADR).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S110";
		}
	};
	/**
	 * Depositary Share.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S111"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositaryShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Depositary Share."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode DepositaryShare = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositaryShare";
			definition = "Depositary Share.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S111";
		}
	};
	/**
	 * Municipal Option Call Right.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S112"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalOptionCallRight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Municipal Option Call Right."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode MunicipalOptionCallRight = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalOptionCallRight";
			definition = "Municipal Option Call Right.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S112";
		}
	};
	/**
	 * Exchange Traded Funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S117"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeTradedFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exchange Traded Funds."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode ExchangeTradedFunds = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedFunds";
			definition = "Exchange Traded Funds.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S117";
		}
	};
	/**
	 * MMI Preferred Stock (in CP-like mode).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S120"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIPreferredStockinCPlikemode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "MMI Preferred Stock (in CP-like mode)."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode MMIPreferredStockinCPlikemode = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIPreferredStockinCPlikemode";
			definition = "MMI Preferred Stock (in CP-like mode).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S120";
		}
	};
	/**
	 * Sealed Envelope.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S125"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SealedEnvelope"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sealed Envelope."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode SealedEnvelope = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SealedEnvelope";
			definition = "Sealed Envelope.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S125";
		}
	};
	/**
	 * Custody User CUSIP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S126"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyUserCUSIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Custody User CUSIP."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode CustodyUserCUSIP = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyUserCUSIP";
			definition = "Custody User CUSIP.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S126";
		}
	};
	/**
	 * Real-Estate Investment Trust (REIT).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S130"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealEstateInvestmentTrustREIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Real-Estate Investment Trust (REIT)."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode RealEstateInvestmentTrustREIT = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealEstateInvestmentTrustREIT";
			definition = "Real-Estate Investment Trust (REIT).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S130";
		}
	};
	/**
	 * Municipal Bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S310"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Municipal Bond."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode MunicipalBond = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalBond";
			definition = "Municipal Bond.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S310";
		}
	};
	/**
	 * Municipal Note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S311"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Municipal Note."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode MunicipalNote = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalNote";
			definition = "Municipal Note.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S311";
		}
	};
	/**
	 * Municipal Auction Rate Note (ARN).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S312"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalAuctionRateNoteARN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Municipal Auction Rate Note (ARN)."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode MunicipalAuctionRateNoteARN = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalAuctionRateNoteARN";
			definition = "Municipal Auction Rate Note (ARN).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S312";
		}
	};
	/**
	 * Municipal Variable Mode Obligation (VMO).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S313"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalVariableModeObligationVMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Municipal Variable Mode Obligation (VMO)."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode MunicipalVariableModeObligationVMO = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalVariableModeObligationVMO";
			definition = "Municipal Variable Mode Obligation (VMO).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S313";
		}
	};
	/**
	 * Municipal Variable Rate Demand Obligation (VRDO).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S314"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalVariableRateDemandObligationVRDO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Municipal Variable Rate Demand Obligation (VRDO)."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode MunicipalVariableRateDemandObligationVRDO = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalVariableRateDemandObligationVRDO";
			definition = "Municipal Variable Rate Demand Obligation (VRDO).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S314";
		}
	};
	/**
	 * Municipal Insured Custodial Receipt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S315"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalInsuredCustodialReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Municipal Insured Custodial Receipt."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode MunicipalInsuredCustodialReceipt = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalInsuredCustodialReceipt";
			definition = "Municipal Insured Custodial Receipt.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S315";
		}
	};
	/**
	 * MMI Municipal VRDO/CP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S320"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIMunicipalVRDOCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "MMI Municipal VRDO/CP."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode MMIMunicipalVRDOCP = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMunicipalVRDOCP";
			definition = "MMI Municipal VRDO/CP.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S320";
		}
	};
	/**
	 * MMI Municipal Commercial Paper.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S330"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIMunicipalCommercialPaper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "MMI Municipal Commercial Paper."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode MMIMunicipalCommercialPaper = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMunicipalCommercialPaper";
			definition = "MMI Municipal Commercial Paper.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S330";
		}
	};
	/**
	 * Bearer, Callable Zero Coupon Bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S340"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BearerCallableZeroCouponBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bearer, Callable Zero Coupon Bond."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode BearerCallableZeroCouponBond = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BearerCallableZeroCouponBond";
			definition = "Bearer, Callable Zero Coupon Bond.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S340";
		}
	};
	/**
	 * GNMA REMIC securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S450"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GNMAREMICSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "GNMA REMIC securities."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode GNMAREMICSecurities = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMAREMICSecurities";
			definition = "GNMA REMIC securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S450";
		}
	};
	/**
	 * GNMA Pass-through securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S451"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GNMAPassThroughSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "GNMA Pass-through securities."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode GNMAPassThroughSecurities = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMAPassThroughSecurities";
			definition = "GNMA Pass-through securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S451";
		}
	};
	/**
	 * GNMA Serial note securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S452"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GNMASerialNoteSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "GNMA Serial note securities."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode GNMASerialNoteSecurities = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMASerialNoteSecurities";
			definition = "GNMA Serial note securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S452";
		}
	};
	/**
	 * Corporate Bond (CB) or Global Corp Bond (GCB).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S500"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateBondCBorGlobalCorpBondGCB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate Bond (CB) or Global Corp Bond (GCB)."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode CorporateBondCBorGlobalCorpBondGCB = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateBondCBorGlobalCorpBondGCB";
			definition = "Corporate Bond (CB) or Global Corp Bond (GCB).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S500";
		}
	};
	/**
	 * MMI Bankers' Acceptance Note (BA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S502"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIBankersAcceptanceNoteBA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "MMI Bankers' Acceptance Note (BA)."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode MMIBankersAcceptanceNoteBA = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIBankersAcceptanceNoteBA";
			definition = "MMI Bankers' Acceptance Note (BA).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S502";
		}
	};
	/**
	 * MMI Institutional Certificates of Deposit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S504"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIInstitutionalCertificatesofDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "MMI Institutional Certificates of Deposit."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode MMIInstitutionalCertificatesofDeposit = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIInstitutionalCertificatesofDeposit";
			definition = "MMI Institutional Certificates of Deposit.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S504";
		}
	};
	/**
	 * Certificated Money Market Instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S505"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificatedMoneyMarketInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificated Money Market Instrument."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode CertificatedMoneyMarketInstrument = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificatedMoneyMarketInstrument";
			definition = "Certificated Money Market Instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S505";
		}
	};
	/**
	 * Certificated Money Market - Periodic Payer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S506"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificatedMoneyMarketPeriodicPayer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificated Money Market - Periodic Payer."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode CertificatedMoneyMarketPeriodicPayer = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificatedMoneyMarketPeriodicPayer";
			definition = "Certificated Money Market - Periodic Payer.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S506";
		}
	};
	/**
	 * Certificates of Deposit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S507"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificatesOfDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificates of Deposit."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode CertificatesOfDeposit = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificatesOfDeposit";
			definition = "Certificates of Deposit.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S507";
		}
	};
	/**
	 * CPI Interest at Maturity (IAM) Commercial Paper.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S510"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CPIInterestAtMaturityIAMCommercialPaper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CPI Interest at Maturity (IAM) Commercial Paper."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode CPIInterestAtMaturityIAMCommercialPaper = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CPIInterestAtMaturityIAMCommercialPaper";
			definition = "CPI Interest at Maturity (IAM) Commercial Paper.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S510";
		}
	};
	/**
	 * Periodic Payment Commercial Paper.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S511"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeriodicPaymentCommercialPaper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Periodic Payment Commercial Paper."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode PeriodicPaymentCommercialPaper = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodicPaymentCommercialPaper";
			definition = "Periodic Payment Commercial Paper.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S511";
		}
	};
	/**
	 * CPI Discount Commercial Paper (CP).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S520"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CPIDiscountCommercialPaperCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CPI Discount Commercial Paper (CP)."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode CPIDiscountCommercialPaperCP = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CPIDiscountCommercialPaperCP";
			definition = "CPI Discount Commercial Paper (CP).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S520";
		}
	};
	/**
	 * MMI Corporate Commercial Paper.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S525"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMICorporateCommercialPaper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "MMI Corporate Commercial Paper."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode MMICorporateCommercialPaper = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMICorporateCommercialPaper";
			definition = "MMI Corporate Commercial Paper.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S525";
		}
	};
	/**
	 * MMI Corporate VRDO/CP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S526"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMICorporateVRDOCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "MMI Corporate VRDO/CP."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode MMICorporateVRDOCP = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMICorporateVRDOCP";
			definition = "MMI Corporate VRDO/CP.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S526";
		}
	};
	/**
	 * MTN Medium Term Note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S530"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MTNMediumTermNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "MTN Medium Term Note."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode MTNMediumTermNote = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MTNMediumTermNote";
			definition = "MTN Medium Term Note.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S530";
		}
	};
	/**
	 * MMI Deposit Note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S531"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIDepositNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "MMI Deposit Note."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode MMIDepositNote = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIDepositNote";
			definition = "MMI Deposit Note.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S531";
		}
	};
	/**
	 * MMI Medium-Term Bank Note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S532"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIMediumTermBankNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "MMI Medium-Term Bank Note."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode MMIMediumTermBankNote = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMediumTermBankNote";
			definition = "MMI Medium-Term Bank Note.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S532";
		}
	};
	/**
	 * MMI Medium Term Note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S533"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIMediumTermNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "MMI Medium Term Note."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode MMIMediumTermNote = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMediumTermNote";
			definition = "MMI Medium Term Note.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S533";
		}
	};
	/**
	 * Collateralized Mortgage Obligation or Global CMO.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S540"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralizedMtgeObligationorGlobalCMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collateralized Mortgage Obligation or Global CMO."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode CollateralizedMtgeObligationorGlobalCMO = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralizedMtgeObligationorGlobalCMO";
			definition = "Collateralized Mortgage Obligation or Global CMO.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S540";
		}
	};
	/**
	 * Asset-Backed security (ABS) or global ABS (GABS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S541"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetBackedSecurityABSorGlobalABSGABS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset-Backed security (ABS) or global ABS (GABS)."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode AssetBackedSecurityABSorGlobalABSGABS = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetBackedSecurityABSorGlobalABSGABS";
			definition = "Asset-Backed security (ABS) or global ABS (GABS).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S541";
		}
	};
	/**
	 * Non-CMO/ABS Amortizing Issue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S542"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonCMOABSAmortizingIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Non-CMO/ABS Amortizing Issue."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode NonCMOABSAmortizingIssue = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonCMOABSAmortizingIssue";
			definition = "Non-CMO/ABS Amortizing Issue.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S542";
		}
	};
	/**
	 * MMI Short-Term Bank Note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S550"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIShortTermBankNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "MMI Short-Term Bank Note."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode MMIShortTermBankNote = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIShortTermBankNote";
			definition = "MMI Short-Term Bank Note.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S550";
		}
	};
	/**
	 * Z CPN Denomination in Initial Principal Amt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S551"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZCPNDenominInitialPrincipalAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Z CPN Denomination in Initial Principal Amt."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode ZCPNDenominInitialPrincipalAmt = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZCPNDenominInitialPrincipalAmt";
			definition = "Z CPN Denomination in Initial Principal Amt.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S551";
		}
	};
	/**
	 * MMI Discount Note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S560"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIDiscountNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "MMI Discount Note."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode MMIDiscountNote = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIDiscountNote";
			definition = "MMI Discount Note.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S560";
		}
	};
	/**
	 * Corporate Auction Rate Note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S571"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateAuctionRateNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate Auction Rate Note."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode CorporateAuctionRateNote = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateAuctionRateNote";
			definition = "Corporate Auction Rate Note.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S571";
		}
	};
	/**
	 * Convertible Corporate Debt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S572"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleCorporateDebt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Convertible Corporate Debt."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode ConvertibleCorporateDebt = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertibleCorporateDebt";
			definition = "Convertible Corporate Debt.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S572";
		}
	};
	/**
	 * Corporate Variable Mode Obligation (CVMO).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S573"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateVariableModeObligationCVMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate Variable Mode Obligation (CVMO)."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode CorporateVariableModeObligationCVMO = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateVariableModeObligationCVMO";
			definition = "Corporate Variable Mode Obligation (CVMO).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S573";
		}
	};
	/**
	 * Corporate Short-Term Note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S574"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateShortTermNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate Short-Term Note."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode CorporateShortTermNote = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateShortTermNote";
			definition = "Corporate Short-Term Note.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S574";
		}
	};
	/**
	 * Corporate Debenture.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S575"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateDebenture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate Debenture."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode CorporateDebenture = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateDebenture";
			definition = "Corporate Debenture.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S575";
		}
	};
	/**
	 * Corporate VRDO / Municipal VRDO (MMD).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S576"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateVRDOMunicipalVRDOMMD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate VRDO / Municipal VRDO (MMD)."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode CorporateVRDOMunicipalVRDOMMD = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateVRDOMunicipalVRDOMMD";
			definition = "Corporate VRDO / Municipal VRDO (MMD).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S576";
		}
	};
	/**
	 * Corporate Insured Custodial Receipt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S577"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateInsuredCustodialReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate Insured Custodial Receipt."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode CorporateInsuredCustodialReceipt = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateInsuredCustodialReceipt";
			definition = "Corporate Insured Custodial Receipt.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S577";
		}
	};
	/**
	 * Tender Rate Note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S578"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderRateNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tender Rate Note."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode TenderRateNote = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderRateNote";
			definition = "Tender Rate Note.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S578";
		}
	};
	/**
	 * Zero Coupon Bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S579"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZeroCouponBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Zero Coupon Bond."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode ZeroCouponBond = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZeroCouponBond";
			definition = "Zero Coupon Bond.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S579";
		}
	};
	/**
	 * Government security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S601"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Government security."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode GovernmentSecurity = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentSecurity";
			definition = "Government security.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S601";
		}
	};
	/**
	 * Government Trust Certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S602"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentTrustCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Government Trust Certificate."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode GovernmentTrustCertificate = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentTrustCertificate";
			definition = "Government Trust Certificate.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S602";
		}
	};
	/**
	 * Junk and Treasury Growth Receipt (JGR).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S603"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JunkAndTreasuryGrowthReceiptJGR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Junk and Treasury Growth Receipt (JGR)."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode JunkAndTreasuryGrowthReceiptJGR = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JunkAndTreasuryGrowthReceiptJGR";
			definition = "Junk and Treasury Growth Receipt (JGR).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S603";
		}
	};
	/**
	 * U.S. Treasury security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S610"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTreasurySecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "U.S. Treasury security."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode USTreasurySecurity = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasurySecurity";
			definition = "U.S. Treasury security.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S610";
		}
	};
	/**
	 * US Treasury Bill.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S611"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTreasuryBill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "US Treasury Bill."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode USTreasuryBill = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasuryBill";
			definition = "US Treasury Bill.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S611";
		}
	};
	/**
	 * US Treasury Note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S612"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTreasuryNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "US Treasury Note."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode USTreasuryNote = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasuryNote";
			definition = "US Treasury Note.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S612";
		}
	};
	/**
	 * US Treasury Bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S613"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTreasuryBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "US Treasury Bond."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode USTreasuryBond = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasuryBond";
			definition = "US Treasury Bond.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S613";
		}
	};
	/**
	 * U.S. government agency security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S620"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGovernmentAgencySecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "U.S. government agency security."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode USGovernmentAgencySecurity = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGovernmentAgencySecurity";
			definition = "U.S. government agency security.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S620";
		}
	};
	/**
	 * Government Nat'l Mortgage Association (GNMA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S650"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentNatlMortgageAssociationGNMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Government Nat'l Mortgage Association (GNMA)."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode GovernmentNatlMortgageAssociationGNMA = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentNatlMortgageAssociationGNMA";
			definition = "Government Nat'l Mortgage Association (GNMA).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S650";
		}
	};
	/**
	 * REMIC (Real Estate Mortgage Investment Conduit).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S651"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "REMICRealEstateMtgeInvestmentConduit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "REMIC (Real Estate Mortgage Investment Conduit)."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode REMICRealEstateMtgeInvestmentConduit = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "REMICRealEstateMtgeInvestmentConduit";
			definition = "REMIC (Real Estate Mortgage Investment Conduit).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S651";
		}
	};
	/**
	 * GNMA Serial Note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S652"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GNMASerialNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "GNMA Serial Note."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode GNMASerialNote = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMASerialNote";
			definition = "GNMA Serial Note.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S652";
		}
	};
	/**
	 * Package.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S700"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Package"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Package."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode Package = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Package";
			definition = "Package.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S700";
		}
	};
	/**
	 * Corporate Debt Derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S704"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateDebtDerivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate Debt Derivative."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode CorporateDebtDerivative = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateDebtDerivative";
			definition = "Corporate Debt Derivative.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S704";
		}
	};
	/**
	 * Equity Derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S705"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquityDerivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Equity Derivative."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode EquityDerivative = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityDerivative";
			definition = "Equity Derivative.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S705";
		}
	};
	/**
	 * Municipal Derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S706"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalDerivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Municipal Derivative."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode MunicipalDerivative = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalDerivative";
			definition = "Municipal Derivative.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S706";
		}
	};
	/**
	 * Municipal Amortized Issue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S708"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalAmortizedIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Municipal Amortized Issue."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode MunicipalAmortizedIssue = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalAmortizedIssue";
			definition = "Municipal Amortized Issue.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S708";
		}
	};
	/**
	 * Option Derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S710"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionDerivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option Derivative."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode OptionDerivative = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionDerivative";
			definition = "Option Derivative.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S710";
		}
	};
	/**
	 * Warrant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S720"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Warrant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Warrant."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode Warrant = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Warrant";
			definition = "Warrant.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S720";
		}
	};
	/**
	 * Right.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S730"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Right"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Right."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode Right = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Right";
			definition = "Right.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S730";
		}
	};
	/**
	 * Mutual Fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S760"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MutualFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mutual Fund."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode MutualFund = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MutualFund";
			definition = "Mutual Fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S760";
		}
	};
	/**
	 * Closed End Fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S761"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedEndFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Closed End Fund."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode ClosedEndFund = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedEndFund";
			definition = "Closed End Fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S761";
		}
	};
	/**
	 * (IMMI) Institutional MMI Mutual Fund Shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S762"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IMMIInstitutionalMMIMutualFundShares"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "(IMMI) Institutional MMI Mutual Fund Shares."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode IMMIInstitutionalMMIMutualFundShares = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IMMIInstitutionalMMIMutualFundShares";
			definition = "(IMMI) Institutional MMI Mutual Fund Shares.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S762";
		}
	};
	/**
	 * Equity Unit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S780"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquityUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Equity Unit."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode EquityUnit = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityUnit";
			definition = "Equity Unit.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S780";
		}
	};
	/**
	 * Debt Unit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S781"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debt Unit."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode DebtUnit = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtUnit";
			definition = "Debt Unit.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S781";
		}
	};
	/**
	 * Unit Investment Trust (UIT) - Nuveen Only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S790"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitInvestmentTrustUITNuveenOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit Investment Trust (UIT) - Nuveen Only."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode UnitInvestmentTrustUITNuveenOnly = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitInvestmentTrustUITNuveenOnly";
			definition = "Unit Investment Trust (UIT) - Nuveen Only.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S790";
		}
	};
	/**
	 * Global Unit Trust.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S791"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalUnitTrust"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Global Unit Trust."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode GlobalUnitTrust = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalUnitTrust";
			definition = "Global Unit Trust.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S791";
		}
	};
	/**
	 * Unit Investment Trust (UIT).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S795"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitInvestmentTrustUIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit Investment Trust (UIT)."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode UnitInvestmentTrustUIT = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitInvestmentTrustUIT";
			definition = "Unit Investment Trust (UIT).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S795";
		}
	};
	/**
	 * Equity, subject to 144a, designated investors.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S121"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equity144aDesignatedInvestors"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Equity, subject to 144a, designated investors."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode Equity144aDesignatedInvestors = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity144aDesignatedInvestors";
			definition = "Equity, subject to 144a, designated investors.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S121";
		}
	};
	/**
	 * Municipal debt, classified as other, subject to tax exempt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S346"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalOtherTaxExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Municipal debt, classified as other, subject to tax exempt."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode MunicipalOtherTaxExempt = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalOtherTaxExempt";
			definition = "Municipal debt, classified as other, subject to tax exempt.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S346";
		}
	};
	/**
	 * Corporate debt, classified as other, subject to tax exempt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S546"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateOtherTaxExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate debt, classified as other, subject to tax exempt."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode CorporateOtherTaxExempt = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateOtherTaxExempt";
			definition = "Corporate debt, classified as other, subject to tax exempt.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S546";
		}
	};
	/**
	 * Corporate debt, subject to 144a, designated investors.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S545"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Corporate144aDesignatedInvestors"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate debt, subject to 144a, designated investors."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode Corporate144aDesignatedInvestors = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Corporate144aDesignatedInvestors";
			definition = "Corporate debt, subject to 144a, designated investors.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S545";
		}
	};
	/**
	 * Non standard asset user CUSIP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
	 * DTCAssetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S127"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonStandardAssetUserCUSIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Non standard asset user CUSIP."</li>
	 * </ul>
	 */
	public static final DTCAssetTypeCode NonStandardAssetUserCUSIP = new DTCAssetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandardAssetUserCUSIP";
			definition = "Non standard asset user CUSIP.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetTypeCode.mmObject();
			codeName = "S127";
		}
	};
	final static private LinkedHashMap<String, DTCAssetTypeCode> codesByName = new LinkedHashMap<>();

	protected DTCAssetTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("S005");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCAssetTypeCode";
				definition = "Specifies DTC (The Depository Trust Company) security sub-issue type.";
				derivation_lazy = () -> Arrays.asList(DTCAssetType1Code.mmObject(), DTCAssetType2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCAssetTypeCode.Equity, com.tools20022.repository.codeset.DTCAssetTypeCode.CommonStock,
						com.tools20022.repository.codeset.DTCAssetTypeCode.ConvertibleCommonStock, com.tools20022.repository.codeset.DTCAssetTypeCode.CommonStockREIT, com.tools20022.repository.codeset.DTCAssetTypeCode.PreferredStock,
						com.tools20022.repository.codeset.DTCAssetTypeCode.PreferredStockREIT, com.tools20022.repository.codeset.DTCAssetTypeCode.ConvertiblePreferredStock,
						com.tools20022.repository.codeset.DTCAssetTypeCode.TenderRatePreferredStock, com.tools20022.repository.codeset.DTCAssetTypeCode.LimitedPartnership,
						com.tools20022.repository.codeset.DTCAssetTypeCode.CMODenominUnitsorUndividedInterest, com.tools20022.repository.codeset.DTCAssetTypeCode.ABSDenominUnitsorUndividedInterest,
						com.tools20022.repository.codeset.DTCAssetTypeCode.IssueDenominUnitsorUndividedInterest, com.tools20022.repository.codeset.DTCAssetTypeCode.AuctionRatePreferredStockARPS,
						com.tools20022.repository.codeset.DTCAssetTypeCode.AmericanDepositaryReceiptADR, com.tools20022.repository.codeset.DTCAssetTypeCode.DepositaryShare,
						com.tools20022.repository.codeset.DTCAssetTypeCode.MunicipalOptionCallRight, com.tools20022.repository.codeset.DTCAssetTypeCode.ExchangeTradedFunds,
						com.tools20022.repository.codeset.DTCAssetTypeCode.MMIPreferredStockinCPlikemode, com.tools20022.repository.codeset.DTCAssetTypeCode.SealedEnvelope,
						com.tools20022.repository.codeset.DTCAssetTypeCode.CustodyUserCUSIP, com.tools20022.repository.codeset.DTCAssetTypeCode.RealEstateInvestmentTrustREIT,
						com.tools20022.repository.codeset.DTCAssetTypeCode.MunicipalBond, com.tools20022.repository.codeset.DTCAssetTypeCode.MunicipalNote, com.tools20022.repository.codeset.DTCAssetTypeCode.MunicipalAuctionRateNoteARN,
						com.tools20022.repository.codeset.DTCAssetTypeCode.MunicipalVariableModeObligationVMO, com.tools20022.repository.codeset.DTCAssetTypeCode.MunicipalVariableRateDemandObligationVRDO,
						com.tools20022.repository.codeset.DTCAssetTypeCode.MunicipalInsuredCustodialReceipt, com.tools20022.repository.codeset.DTCAssetTypeCode.MMIMunicipalVRDOCP,
						com.tools20022.repository.codeset.DTCAssetTypeCode.MMIMunicipalCommercialPaper, com.tools20022.repository.codeset.DTCAssetTypeCode.BearerCallableZeroCouponBond,
						com.tools20022.repository.codeset.DTCAssetTypeCode.GNMAREMICSecurities, com.tools20022.repository.codeset.DTCAssetTypeCode.GNMAPassThroughSecurities,
						com.tools20022.repository.codeset.DTCAssetTypeCode.GNMASerialNoteSecurities, com.tools20022.repository.codeset.DTCAssetTypeCode.CorporateBondCBorGlobalCorpBondGCB,
						com.tools20022.repository.codeset.DTCAssetTypeCode.MMIBankersAcceptanceNoteBA, com.tools20022.repository.codeset.DTCAssetTypeCode.MMIInstitutionalCertificatesofDeposit,
						com.tools20022.repository.codeset.DTCAssetTypeCode.CertificatedMoneyMarketInstrument, com.tools20022.repository.codeset.DTCAssetTypeCode.CertificatedMoneyMarketPeriodicPayer,
						com.tools20022.repository.codeset.DTCAssetTypeCode.CertificatesOfDeposit, com.tools20022.repository.codeset.DTCAssetTypeCode.CPIInterestAtMaturityIAMCommercialPaper,
						com.tools20022.repository.codeset.DTCAssetTypeCode.PeriodicPaymentCommercialPaper, com.tools20022.repository.codeset.DTCAssetTypeCode.CPIDiscountCommercialPaperCP,
						com.tools20022.repository.codeset.DTCAssetTypeCode.MMICorporateCommercialPaper, com.tools20022.repository.codeset.DTCAssetTypeCode.MMICorporateVRDOCP,
						com.tools20022.repository.codeset.DTCAssetTypeCode.MTNMediumTermNote, com.tools20022.repository.codeset.DTCAssetTypeCode.MMIDepositNote, com.tools20022.repository.codeset.DTCAssetTypeCode.MMIMediumTermBankNote,
						com.tools20022.repository.codeset.DTCAssetTypeCode.MMIMediumTermNote, com.tools20022.repository.codeset.DTCAssetTypeCode.CollateralizedMtgeObligationorGlobalCMO,
						com.tools20022.repository.codeset.DTCAssetTypeCode.AssetBackedSecurityABSorGlobalABSGABS, com.tools20022.repository.codeset.DTCAssetTypeCode.NonCMOABSAmortizingIssue,
						com.tools20022.repository.codeset.DTCAssetTypeCode.MMIShortTermBankNote, com.tools20022.repository.codeset.DTCAssetTypeCode.ZCPNDenominInitialPrincipalAmt,
						com.tools20022.repository.codeset.DTCAssetTypeCode.MMIDiscountNote, com.tools20022.repository.codeset.DTCAssetTypeCode.CorporateAuctionRateNote,
						com.tools20022.repository.codeset.DTCAssetTypeCode.ConvertibleCorporateDebt, com.tools20022.repository.codeset.DTCAssetTypeCode.CorporateVariableModeObligationCVMO,
						com.tools20022.repository.codeset.DTCAssetTypeCode.CorporateShortTermNote, com.tools20022.repository.codeset.DTCAssetTypeCode.CorporateDebenture,
						com.tools20022.repository.codeset.DTCAssetTypeCode.CorporateVRDOMunicipalVRDOMMD, com.tools20022.repository.codeset.DTCAssetTypeCode.CorporateInsuredCustodialReceipt,
						com.tools20022.repository.codeset.DTCAssetTypeCode.TenderRateNote, com.tools20022.repository.codeset.DTCAssetTypeCode.ZeroCouponBond, com.tools20022.repository.codeset.DTCAssetTypeCode.GovernmentSecurity,
						com.tools20022.repository.codeset.DTCAssetTypeCode.GovernmentTrustCertificate, com.tools20022.repository.codeset.DTCAssetTypeCode.JunkAndTreasuryGrowthReceiptJGR,
						com.tools20022.repository.codeset.DTCAssetTypeCode.USTreasurySecurity, com.tools20022.repository.codeset.DTCAssetTypeCode.USTreasuryBill, com.tools20022.repository.codeset.DTCAssetTypeCode.USTreasuryNote,
						com.tools20022.repository.codeset.DTCAssetTypeCode.USTreasuryBond, com.tools20022.repository.codeset.DTCAssetTypeCode.USGovernmentAgencySecurity,
						com.tools20022.repository.codeset.DTCAssetTypeCode.GovernmentNatlMortgageAssociationGNMA, com.tools20022.repository.codeset.DTCAssetTypeCode.REMICRealEstateMtgeInvestmentConduit,
						com.tools20022.repository.codeset.DTCAssetTypeCode.GNMASerialNote, com.tools20022.repository.codeset.DTCAssetTypeCode.Package, com.tools20022.repository.codeset.DTCAssetTypeCode.CorporateDebtDerivative,
						com.tools20022.repository.codeset.DTCAssetTypeCode.EquityDerivative, com.tools20022.repository.codeset.DTCAssetTypeCode.MunicipalDerivative,
						com.tools20022.repository.codeset.DTCAssetTypeCode.MunicipalAmortizedIssue, com.tools20022.repository.codeset.DTCAssetTypeCode.OptionDerivative, com.tools20022.repository.codeset.DTCAssetTypeCode.Warrant,
						com.tools20022.repository.codeset.DTCAssetTypeCode.Right, com.tools20022.repository.codeset.DTCAssetTypeCode.MutualFund, com.tools20022.repository.codeset.DTCAssetTypeCode.ClosedEndFund,
						com.tools20022.repository.codeset.DTCAssetTypeCode.IMMIInstitutionalMMIMutualFundShares, com.tools20022.repository.codeset.DTCAssetTypeCode.EquityUnit, com.tools20022.repository.codeset.DTCAssetTypeCode.DebtUnit,
						com.tools20022.repository.codeset.DTCAssetTypeCode.UnitInvestmentTrustUITNuveenOnly, com.tools20022.repository.codeset.DTCAssetTypeCode.GlobalUnitTrust,
						com.tools20022.repository.codeset.DTCAssetTypeCode.UnitInvestmentTrustUIT, com.tools20022.repository.codeset.DTCAssetTypeCode.Equity144aDesignatedInvestors,
						com.tools20022.repository.codeset.DTCAssetTypeCode.MunicipalOtherTaxExempt, com.tools20022.repository.codeset.DTCAssetTypeCode.CorporateOtherTaxExempt,
						com.tools20022.repository.codeset.DTCAssetTypeCode.Corporate144aDesignatedInvestors, com.tools20022.repository.codeset.DTCAssetTypeCode.NonStandardAssetUserCUSIP);
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
		codesByName.put(CMODenominUnitsorUndividedInterest.getCodeName().get(), CMODenominUnitsorUndividedInterest);
		codesByName.put(ABSDenominUnitsorUndividedInterest.getCodeName().get(), ABSDenominUnitsorUndividedInterest);
		codesByName.put(IssueDenominUnitsorUndividedInterest.getCodeName().get(), IssueDenominUnitsorUndividedInterest);
		codesByName.put(AuctionRatePreferredStockARPS.getCodeName().get(), AuctionRatePreferredStockARPS);
		codesByName.put(AmericanDepositaryReceiptADR.getCodeName().get(), AmericanDepositaryReceiptADR);
		codesByName.put(DepositaryShare.getCodeName().get(), DepositaryShare);
		codesByName.put(MunicipalOptionCallRight.getCodeName().get(), MunicipalOptionCallRight);
		codesByName.put(ExchangeTradedFunds.getCodeName().get(), ExchangeTradedFunds);
		codesByName.put(MMIPreferredStockinCPlikemode.getCodeName().get(), MMIPreferredStockinCPlikemode);
		codesByName.put(SealedEnvelope.getCodeName().get(), SealedEnvelope);
		codesByName.put(CustodyUserCUSIP.getCodeName().get(), CustodyUserCUSIP);
		codesByName.put(RealEstateInvestmentTrustREIT.getCodeName().get(), RealEstateInvestmentTrustREIT);
		codesByName.put(MunicipalBond.getCodeName().get(), MunicipalBond);
		codesByName.put(MunicipalNote.getCodeName().get(), MunicipalNote);
		codesByName.put(MunicipalAuctionRateNoteARN.getCodeName().get(), MunicipalAuctionRateNoteARN);
		codesByName.put(MunicipalVariableModeObligationVMO.getCodeName().get(), MunicipalVariableModeObligationVMO);
		codesByName.put(MunicipalVariableRateDemandObligationVRDO.getCodeName().get(), MunicipalVariableRateDemandObligationVRDO);
		codesByName.put(MunicipalInsuredCustodialReceipt.getCodeName().get(), MunicipalInsuredCustodialReceipt);
		codesByName.put(MMIMunicipalVRDOCP.getCodeName().get(), MMIMunicipalVRDOCP);
		codesByName.put(MMIMunicipalCommercialPaper.getCodeName().get(), MMIMunicipalCommercialPaper);
		codesByName.put(BearerCallableZeroCouponBond.getCodeName().get(), BearerCallableZeroCouponBond);
		codesByName.put(GNMAREMICSecurities.getCodeName().get(), GNMAREMICSecurities);
		codesByName.put(GNMAPassThroughSecurities.getCodeName().get(), GNMAPassThroughSecurities);
		codesByName.put(GNMASerialNoteSecurities.getCodeName().get(), GNMASerialNoteSecurities);
		codesByName.put(CorporateBondCBorGlobalCorpBondGCB.getCodeName().get(), CorporateBondCBorGlobalCorpBondGCB);
		codesByName.put(MMIBankersAcceptanceNoteBA.getCodeName().get(), MMIBankersAcceptanceNoteBA);
		codesByName.put(MMIInstitutionalCertificatesofDeposit.getCodeName().get(), MMIInstitutionalCertificatesofDeposit);
		codesByName.put(CertificatedMoneyMarketInstrument.getCodeName().get(), CertificatedMoneyMarketInstrument);
		codesByName.put(CertificatedMoneyMarketPeriodicPayer.getCodeName().get(), CertificatedMoneyMarketPeriodicPayer);
		codesByName.put(CertificatesOfDeposit.getCodeName().get(), CertificatesOfDeposit);
		codesByName.put(CPIInterestAtMaturityIAMCommercialPaper.getCodeName().get(), CPIInterestAtMaturityIAMCommercialPaper);
		codesByName.put(PeriodicPaymentCommercialPaper.getCodeName().get(), PeriodicPaymentCommercialPaper);
		codesByName.put(CPIDiscountCommercialPaperCP.getCodeName().get(), CPIDiscountCommercialPaperCP);
		codesByName.put(MMICorporateCommercialPaper.getCodeName().get(), MMICorporateCommercialPaper);
		codesByName.put(MMICorporateVRDOCP.getCodeName().get(), MMICorporateVRDOCP);
		codesByName.put(MTNMediumTermNote.getCodeName().get(), MTNMediumTermNote);
		codesByName.put(MMIDepositNote.getCodeName().get(), MMIDepositNote);
		codesByName.put(MMIMediumTermBankNote.getCodeName().get(), MMIMediumTermBankNote);
		codesByName.put(MMIMediumTermNote.getCodeName().get(), MMIMediumTermNote);
		codesByName.put(CollateralizedMtgeObligationorGlobalCMO.getCodeName().get(), CollateralizedMtgeObligationorGlobalCMO);
		codesByName.put(AssetBackedSecurityABSorGlobalABSGABS.getCodeName().get(), AssetBackedSecurityABSorGlobalABSGABS);
		codesByName.put(NonCMOABSAmortizingIssue.getCodeName().get(), NonCMOABSAmortizingIssue);
		codesByName.put(MMIShortTermBankNote.getCodeName().get(), MMIShortTermBankNote);
		codesByName.put(ZCPNDenominInitialPrincipalAmt.getCodeName().get(), ZCPNDenominInitialPrincipalAmt);
		codesByName.put(MMIDiscountNote.getCodeName().get(), MMIDiscountNote);
		codesByName.put(CorporateAuctionRateNote.getCodeName().get(), CorporateAuctionRateNote);
		codesByName.put(ConvertibleCorporateDebt.getCodeName().get(), ConvertibleCorporateDebt);
		codesByName.put(CorporateVariableModeObligationCVMO.getCodeName().get(), CorporateVariableModeObligationCVMO);
		codesByName.put(CorporateShortTermNote.getCodeName().get(), CorporateShortTermNote);
		codesByName.put(CorporateDebenture.getCodeName().get(), CorporateDebenture);
		codesByName.put(CorporateVRDOMunicipalVRDOMMD.getCodeName().get(), CorporateVRDOMunicipalVRDOMMD);
		codesByName.put(CorporateInsuredCustodialReceipt.getCodeName().get(), CorporateInsuredCustodialReceipt);
		codesByName.put(TenderRateNote.getCodeName().get(), TenderRateNote);
		codesByName.put(ZeroCouponBond.getCodeName().get(), ZeroCouponBond);
		codesByName.put(GovernmentSecurity.getCodeName().get(), GovernmentSecurity);
		codesByName.put(GovernmentTrustCertificate.getCodeName().get(), GovernmentTrustCertificate);
		codesByName.put(JunkAndTreasuryGrowthReceiptJGR.getCodeName().get(), JunkAndTreasuryGrowthReceiptJGR);
		codesByName.put(USTreasurySecurity.getCodeName().get(), USTreasurySecurity);
		codesByName.put(USTreasuryBill.getCodeName().get(), USTreasuryBill);
		codesByName.put(USTreasuryNote.getCodeName().get(), USTreasuryNote);
		codesByName.put(USTreasuryBond.getCodeName().get(), USTreasuryBond);
		codesByName.put(USGovernmentAgencySecurity.getCodeName().get(), USGovernmentAgencySecurity);
		codesByName.put(GovernmentNatlMortgageAssociationGNMA.getCodeName().get(), GovernmentNatlMortgageAssociationGNMA);
		codesByName.put(REMICRealEstateMtgeInvestmentConduit.getCodeName().get(), REMICRealEstateMtgeInvestmentConduit);
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
		codesByName.put(IMMIInstitutionalMMIMutualFundShares.getCodeName().get(), IMMIInstitutionalMMIMutualFundShares);
		codesByName.put(EquityUnit.getCodeName().get(), EquityUnit);
		codesByName.put(DebtUnit.getCodeName().get(), DebtUnit);
		codesByName.put(UnitInvestmentTrustUITNuveenOnly.getCodeName().get(), UnitInvestmentTrustUITNuveenOnly);
		codesByName.put(GlobalUnitTrust.getCodeName().get(), GlobalUnitTrust);
		codesByName.put(UnitInvestmentTrustUIT.getCodeName().get(), UnitInvestmentTrustUIT);
		codesByName.put(Equity144aDesignatedInvestors.getCodeName().get(), Equity144aDesignatedInvestors);
		codesByName.put(MunicipalOtherTaxExempt.getCodeName().get(), MunicipalOtherTaxExempt);
		codesByName.put(CorporateOtherTaxExempt.getCodeName().get(), CorporateOtherTaxExempt);
		codesByName.put(Corporate144aDesignatedInvestors.getCodeName().get(), Corporate144aDesignatedInvestors);
		codesByName.put(NonStandardAssetUserCUSIP.getCodeName().get(), NonStandardAssetUserCUSIP);
	}

	public static DTCAssetTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCAssetTypeCode[] values() {
		DTCAssetTypeCode[] values = new DTCAssetTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCAssetTypeCode> {
		@Override
		public DTCAssetTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCAssetTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}