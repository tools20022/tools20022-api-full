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
import com.tools20022.repository.codeset.DTCAssetType2Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#ABSDenominUnitsorUndividedInterest
 * DTCAssetType2Code.ABSDenominUnitsorUndividedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#AmericanDepositaryReceiptADR
 * DTCAssetType2Code.AmericanDepositaryReceiptADR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#AssetBackedSecurityABSorGlobalABSGABS
 * DTCAssetType2Code.AssetBackedSecurityABSorGlobalABSGABS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#AuctionRatePreferredStockARPS
 * DTCAssetType2Code.AuctionRatePreferredStockARPS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#CertificatedMoneyMarketInstrument
 * DTCAssetType2Code.CertificatedMoneyMarketInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#BearerCallableZeroCouponBond
 * DTCAssetType2Code.BearerCallableZeroCouponBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#CertificatedMoneyMarketPeriodicPayer
 * DTCAssetType2Code.CertificatedMoneyMarketPeriodicPayer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#CertificatesOfDeposit
 * DTCAssetType2Code.CertificatesOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#ClosedEndFund
 * DTCAssetType2Code.ClosedEndFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#CMODenominUnitsorUndividedInterest
 * DTCAssetType2Code.CMODenominUnitsorUndividedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#CollateralizedMtgeObligationorGlobalCMO
 * DTCAssetType2Code.CollateralizedMtgeObligationorGlobalCMO}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#CommonStock
 * DTCAssetType2Code.CommonStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#CommonStockREIT
 * DTCAssetType2Code.CommonStockREIT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#ConvertibleCommonStock
 * DTCAssetType2Code.ConvertibleCommonStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#ConvertibleCorporateDebt
 * DTCAssetType2Code.ConvertibleCorporateDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#ConvertiblePreferredStock
 * DTCAssetType2Code.ConvertiblePreferredStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#Corporate144aDesignatedInvestors
 * DTCAssetType2Code.Corporate144aDesignatedInvestors}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#CorporateAuctionRateNote
 * DTCAssetType2Code.CorporateAuctionRateNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#CorporateBondCBorGlobalCorpBondGCB
 * DTCAssetType2Code.CorporateBondCBorGlobalCorpBondGCB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#CorporateDebenture
 * DTCAssetType2Code.CorporateDebenture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#CorporateDebtDerivative
 * DTCAssetType2Code.CorporateDebtDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#CorporateInsuredCustodialReceipt
 * DTCAssetType2Code.CorporateInsuredCustodialReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#CorporateOtherTaxExempt
 * DTCAssetType2Code.CorporateOtherTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#CorporateShortTermNote
 * DTCAssetType2Code.CorporateShortTermNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#CorporateVariableModeObligationCVMO
 * DTCAssetType2Code.CorporateVariableModeObligationCVMO}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#CorporateVRDOMunicipalVRDOMMD
 * DTCAssetType2Code.CorporateVRDOMunicipalVRDOMMD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#CPIDiscountCommercialPaperCP
 * DTCAssetType2Code.CPIDiscountCommercialPaperCP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#CPIInterestAtMaturityIAMCommercialPaper
 * DTCAssetType2Code.CPIInterestAtMaturityIAMCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#CustodyUserCUSIP
 * DTCAssetType2Code.CustodyUserCUSIP}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#DebtUnit
 * DTCAssetType2Code.DebtUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#DepositaryShare
 * DTCAssetType2Code.DepositaryShare}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#Equity
 * DTCAssetType2Code.Equity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#Equity144aDesignatedInvestors
 * DTCAssetType2Code.Equity144aDesignatedInvestors}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#EquityDerivative
 * DTCAssetType2Code.EquityDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#ExchangeTradedFunds
 * DTCAssetType2Code.ExchangeTradedFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#GNMAPassThroughSecurities
 * DTCAssetType2Code.GNMAPassThroughSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#GovernmentNatlMortgageAssociationGNMA
 * DTCAssetType2Code.GovernmentNatlMortgageAssociationGNMA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#GovernmentSecurity
 * DTCAssetType2Code.GovernmentSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#IssueDenominUnitsorUndividedInterest
 * DTCAssetType2Code.IssueDenominUnitsorUndividedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#EquityUnit
 * DTCAssetType2Code.EquityUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#GlobalUnitTrust
 * DTCAssetType2Code.GlobalUnitTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#GNMASerialNoteSecurities
 * DTCAssetType2Code.GNMASerialNoteSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#GNMASerialNote
 * DTCAssetType2Code.GNMASerialNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#GNMAREMICSecurities
 * DTCAssetType2Code.GNMAREMICSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#GovernmentTrustCertificate
 * DTCAssetType2Code.GovernmentTrustCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#IMMIInstitutionalMMIMutualFundShares
 * DTCAssetType2Code.IMMIInstitutionalMMIMutualFundShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#JunkAndTreasuryGrowthReceiptJGR
 * DTCAssetType2Code.JunkAndTreasuryGrowthReceiptJGR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#LimitedPartnership
 * DTCAssetType2Code.LimitedPartnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#MMIBankersAcceptanceNoteBA
 * DTCAssetType2Code.MMIBankersAcceptanceNoteBA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#MMICorporateCommercialPaper
 * DTCAssetType2Code.MMICorporateCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#MMICorporateVRDOCP
 * DTCAssetType2Code.MMICorporateVRDOCP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#MMIDepositNote
 * DTCAssetType2Code.MMIDepositNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#MMIDiscountNote
 * DTCAssetType2Code.MMIDiscountNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#MMIInstitutionalCertificatesofDeposit
 * DTCAssetType2Code.MMIInstitutionalCertificatesofDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#MMIMediumTermBankNote
 * DTCAssetType2Code.MMIMediumTermBankNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#MMIMediumTermNote
 * DTCAssetType2Code.MMIMediumTermNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#MMIMunicipalCommercialPaper
 * DTCAssetType2Code.MMIMunicipalCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#MMIMunicipalVRDOCP
 * DTCAssetType2Code.MMIMunicipalVRDOCP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#MMIPreferredStockinCPlikemode
 * DTCAssetType2Code.MMIPreferredStockinCPlikemode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#MMIShortTermBankNote
 * DTCAssetType2Code.MMIShortTermBankNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#MTNMediumTermNote
 * DTCAssetType2Code.MTNMediumTermNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#MunicipalAmortizedIssue
 * DTCAssetType2Code.MunicipalAmortizedIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#MunicipalAuctionRateNoteARN
 * DTCAssetType2Code.MunicipalAuctionRateNoteARN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#MunicipalBond
 * DTCAssetType2Code.MunicipalBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#MunicipalDerivative
 * DTCAssetType2Code.MunicipalDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#MunicipalInsuredCustodialReceipt
 * DTCAssetType2Code.MunicipalInsuredCustodialReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#MunicipalNote
 * DTCAssetType2Code.MunicipalNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#MunicipalOtherTaxExempt
 * DTCAssetType2Code.MunicipalOtherTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#MunicipalOptionCallRight
 * DTCAssetType2Code.MunicipalOptionCallRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#MunicipalVariableModeObligationVMO
 * DTCAssetType2Code.MunicipalVariableModeObligationVMO}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#MunicipalVariableRateDemandObligationVRDO
 * DTCAssetType2Code.MunicipalVariableRateDemandObligationVRDO}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#MutualFund
 * DTCAssetType2Code.MutualFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#NonCMOABSAmortizingIssue
 * DTCAssetType2Code.NonCMOABSAmortizingIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#NonStandardAssetUserCUSIP
 * DTCAssetType2Code.NonStandardAssetUserCUSIP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#OptionDerivative
 * DTCAssetType2Code.OptionDerivative}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#Package
 * DTCAssetType2Code.Package}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#PeriodicPaymentCommercialPaper
 * DTCAssetType2Code.PeriodicPaymentCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#PreferredStock
 * DTCAssetType2Code.PreferredStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#PreferredStockREIT
 * DTCAssetType2Code.PreferredStockREIT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#RealEstateInvestmentTrustREIT
 * DTCAssetType2Code.RealEstateInvestmentTrustREIT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#REMICRealEstateMtgeInvestmentConduit
 * DTCAssetType2Code.REMICRealEstateMtgeInvestmentConduit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#Right
 * DTCAssetType2Code.Right}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#SealedEnvelope
 * DTCAssetType2Code.SealedEnvelope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#TenderRateNote
 * DTCAssetType2Code.TenderRateNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#TenderRatePreferredStock
 * DTCAssetType2Code.TenderRatePreferredStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#UnitInvestmentTrustUIT
 * DTCAssetType2Code.UnitInvestmentTrustUIT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#UnitInvestmentTrustUITNuveenOnly
 * DTCAssetType2Code.UnitInvestmentTrustUITNuveenOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#USGovernmentAgencySecurity
 * DTCAssetType2Code.USGovernmentAgencySecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#USTreasuryBill
 * DTCAssetType2Code.USTreasuryBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#USTreasuryBond
 * DTCAssetType2Code.USTreasuryBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#USTreasurySecurity
 * DTCAssetType2Code.USTreasurySecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#USTreasuryNote
 * DTCAssetType2Code.USTreasuryNote}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#Warrant
 * DTCAssetType2Code.Warrant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#ZCPNDenominInitialPrincipalAmt
 * DTCAssetType2Code.ZCPNDenominInitialPrincipalAmt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code#ZeroCouponBond
 * DTCAssetType2Code.ZeroCouponBond}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
 * DTCAssetTypeCode}</li>
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
 * "DTCAssetType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies  DTC (The Depository Trust Company) security sub-issue type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCAssetType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ABSDenominUnitsorUndividedInterest"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code ABSDenominUnitsorUndividedInterest = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ABSDenominUnitsorUndividedInterest";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.ABSDenominUnitsorUndividedInterest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmericanDepositaryReceiptADR"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code AmericanDepositaryReceiptADR = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmericanDepositaryReceiptADR";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.AmericanDepositaryReceiptADR.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetBackedSecurityABSorGlobalABSGABS"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code AssetBackedSecurityABSorGlobalABSGABS = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetBackedSecurityABSorGlobalABSGABS";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.AssetBackedSecurityABSorGlobalABSGABS.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuctionRatePreferredStockARPS"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code AuctionRatePreferredStockARPS = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuctionRatePreferredStockARPS";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.AuctionRatePreferredStockARPS.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificatedMoneyMarketInstrument"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code CertificatedMoneyMarketInstrument = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificatedMoneyMarketInstrument";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.CertificatedMoneyMarketInstrument.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BearerCallableZeroCouponBond"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code BearerCallableZeroCouponBond = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BearerCallableZeroCouponBond";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.BearerCallableZeroCouponBond.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificatedMoneyMarketPeriodicPayer"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code CertificatedMoneyMarketPeriodicPayer = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificatedMoneyMarketPeriodicPayer";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.CertificatedMoneyMarketPeriodicPayer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificatesOfDeposit"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code CertificatesOfDeposit = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificatesOfDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.CertificatesOfDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedEndFund"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code ClosedEndFund = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedEndFund";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.ClosedEndFund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CMODenominUnitsorUndividedInterest"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code CMODenominUnitsorUndividedInterest = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CMODenominUnitsorUndividedInterest";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.CMODenominUnitsorUndividedInterest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralizedMtgeObligationorGlobalCMO"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code CollateralizedMtgeObligationorGlobalCMO = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralizedMtgeObligationorGlobalCMO";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.CollateralizedMtgeObligationorGlobalCMO.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonStock"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code CommonStock = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonStock";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.CommonStock.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonStockREIT"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code CommonStockREIT = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonStockREIT";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.CommonStockREIT.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleCommonStock"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code ConvertibleCommonStock = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertibleCommonStock";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.ConvertibleCommonStock.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleCorporateDebt"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code ConvertibleCorporateDebt = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertibleCorporateDebt";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.ConvertibleCorporateDebt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertiblePreferredStock"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code ConvertiblePreferredStock = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertiblePreferredStock";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.ConvertiblePreferredStock.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Corporate144aDesignatedInvestors"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code Corporate144aDesignatedInvestors = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Corporate144aDesignatedInvestors";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.Corporate144aDesignatedInvestors.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateAuctionRateNote"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code CorporateAuctionRateNote = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateAuctionRateNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.CorporateAuctionRateNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateBondCBorGlobalCorpBondGCB"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code CorporateBondCBorGlobalCorpBondGCB = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateBondCBorGlobalCorpBondGCB";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.CorporateBondCBorGlobalCorpBondGCB.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateDebenture"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code CorporateDebenture = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateDebenture";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.CorporateDebenture.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateDebtDerivative"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code CorporateDebtDerivative = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateDebtDerivative";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.CorporateDebtDerivative.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateInsuredCustodialReceipt"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code CorporateInsuredCustodialReceipt = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateInsuredCustodialReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.CorporateInsuredCustodialReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateOtherTaxExempt"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code CorporateOtherTaxExempt = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateOtherTaxExempt";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.CorporateOtherTaxExempt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateShortTermNote"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code CorporateShortTermNote = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateShortTermNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.CorporateShortTermNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateVariableModeObligationCVMO"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code CorporateVariableModeObligationCVMO = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateVariableModeObligationCVMO";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.CorporateVariableModeObligationCVMO.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateVRDOMunicipalVRDOMMD"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code CorporateVRDOMunicipalVRDOMMD = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateVRDOMunicipalVRDOMMD";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.CorporateVRDOMunicipalVRDOMMD.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CPIDiscountCommercialPaperCP"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code CPIDiscountCommercialPaperCP = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CPIDiscountCommercialPaperCP";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.CPIDiscountCommercialPaperCP.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CPIInterestAtMaturityIAMCommercialPaper"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code CPIInterestAtMaturityIAMCommercialPaper = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CPIInterestAtMaturityIAMCommercialPaper";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.CPIInterestAtMaturityIAMCommercialPaper.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyUserCUSIP"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code CustodyUserCUSIP = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyUserCUSIP";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.CustodyUserCUSIP.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtUnit"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code DebtUnit = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtUnit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.DebtUnit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositaryShare"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code DepositaryShare = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositaryShare";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.DepositaryShare.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equity"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code Equity = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.Equity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equity144aDesignatedInvestors"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code Equity144aDesignatedInvestors = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity144aDesignatedInvestors";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.Equity144aDesignatedInvestors.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquityDerivative"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code EquityDerivative = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityDerivative";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.EquityDerivative.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeTradedFunds"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code ExchangeTradedFunds = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedFunds";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.ExchangeTradedFunds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GNMAPassThroughSecurities"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code GNMAPassThroughSecurities = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMAPassThroughSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.GNMAPassThroughSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentNatlMortgageAssociationGNMA"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code GovernmentNatlMortgageAssociationGNMA = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentNatlMortgageAssociationGNMA";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.GovernmentNatlMortgageAssociationGNMA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentSecurity"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code GovernmentSecurity = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.GovernmentSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDenominUnitsorUndividedInterest"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code IssueDenominUnitsorUndividedInterest = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDenominUnitsorUndividedInterest";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.IssueDenominUnitsorUndividedInterest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquityUnit"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code EquityUnit = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityUnit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.EquityUnit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalUnitTrust"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code GlobalUnitTrust = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalUnitTrust";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.GlobalUnitTrust.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GNMASerialNoteSecurities"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code GNMASerialNoteSecurities = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMASerialNoteSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.GNMASerialNoteSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GNMASerialNote"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code GNMASerialNote = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMASerialNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.GNMASerialNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GNMAREMICSecurities"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code GNMAREMICSecurities = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMAREMICSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.GNMAREMICSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentTrustCertificate"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code GovernmentTrustCertificate = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentTrustCertificate";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.GovernmentTrustCertificate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IMMIInstitutionalMMIMutualFundShares"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code IMMIInstitutionalMMIMutualFundShares = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IMMIInstitutionalMMIMutualFundShares";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.IMMIInstitutionalMMIMutualFundShares.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JunkAndTreasuryGrowthReceiptJGR"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code JunkAndTreasuryGrowthReceiptJGR = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JunkAndTreasuryGrowthReceiptJGR";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.JunkAndTreasuryGrowthReceiptJGR.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedPartnership"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code LimitedPartnership = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitedPartnership";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.LimitedPartnership.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIBankersAcceptanceNoteBA"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code MMIBankersAcceptanceNoteBA = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIBankersAcceptanceNoteBA";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.MMIBankersAcceptanceNoteBA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMICorporateCommercialPaper"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code MMICorporateCommercialPaper = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMICorporateCommercialPaper";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.MMICorporateCommercialPaper.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMICorporateVRDOCP"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code MMICorporateVRDOCP = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMICorporateVRDOCP";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.MMICorporateVRDOCP.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIDepositNote"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code MMIDepositNote = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIDepositNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.MMIDepositNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIDiscountNote"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code MMIDiscountNote = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIDiscountNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.MMIDiscountNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIInstitutionalCertificatesofDeposit"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code MMIInstitutionalCertificatesofDeposit = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIInstitutionalCertificatesofDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.MMIInstitutionalCertificatesofDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIMediumTermBankNote"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code MMIMediumTermBankNote = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMediumTermBankNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.MMIMediumTermBankNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIMediumTermNote"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code MMIMediumTermNote = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMediumTermNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.MMIMediumTermNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIMunicipalCommercialPaper"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code MMIMunicipalCommercialPaper = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMunicipalCommercialPaper";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.MMIMunicipalCommercialPaper.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIMunicipalVRDOCP"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code MMIMunicipalVRDOCP = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMunicipalVRDOCP";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.MMIMunicipalVRDOCP.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIPreferredStockinCPlikemode"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code MMIPreferredStockinCPlikemode = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIPreferredStockinCPlikemode";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.MMIPreferredStockinCPlikemode.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIShortTermBankNote"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code MMIShortTermBankNote = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIShortTermBankNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.MMIShortTermBankNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MTNMediumTermNote"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code MTNMediumTermNote = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MTNMediumTermNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.MTNMediumTermNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalAmortizedIssue"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code MunicipalAmortizedIssue = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalAmortizedIssue";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.MunicipalAmortizedIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalAuctionRateNoteARN"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code MunicipalAuctionRateNoteARN = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalAuctionRateNoteARN";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.MunicipalAuctionRateNoteARN.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalBond"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code MunicipalBond = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalBond";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.MunicipalBond.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalDerivative"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code MunicipalDerivative = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalDerivative";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.MunicipalDerivative.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalInsuredCustodialReceipt"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code MunicipalInsuredCustodialReceipt = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalInsuredCustodialReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.MunicipalInsuredCustodialReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalNote"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code MunicipalNote = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.MunicipalNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalOtherTaxExempt"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code MunicipalOtherTaxExempt = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalOtherTaxExempt";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.MunicipalOtherTaxExempt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalOptionCallRight"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code MunicipalOptionCallRight = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalOptionCallRight";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.MunicipalOptionCallRight.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalVariableModeObligationVMO"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code MunicipalVariableModeObligationVMO = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalVariableModeObligationVMO";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.MunicipalVariableModeObligationVMO.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalVariableRateDemandObligationVRDO"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code MunicipalVariableRateDemandObligationVRDO = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalVariableRateDemandObligationVRDO";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.MunicipalVariableRateDemandObligationVRDO.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MutualFund"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code MutualFund = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MutualFund";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.MutualFund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonCMOABSAmortizingIssue"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code NonCMOABSAmortizingIssue = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonCMOABSAmortizingIssue";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.NonCMOABSAmortizingIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonStandardAssetUserCUSIP"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code NonStandardAssetUserCUSIP = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandardAssetUserCUSIP";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.NonStandardAssetUserCUSIP.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionDerivative"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code OptionDerivative = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionDerivative";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.OptionDerivative.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Package"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code Package = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Package";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.Package.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeriodicPaymentCommercialPaper"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code PeriodicPaymentCommercialPaper = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodicPaymentCommercialPaper";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.PeriodicPaymentCommercialPaper.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreferredStock"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code PreferredStock = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreferredStock";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.PreferredStock.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreferredStockREIT"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code PreferredStockREIT = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreferredStockREIT";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.PreferredStockREIT.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealEstateInvestmentTrustREIT"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code RealEstateInvestmentTrustREIT = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealEstateInvestmentTrustREIT";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.RealEstateInvestmentTrustREIT.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "REMICRealEstateMtgeInvestmentConduit"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code REMICRealEstateMtgeInvestmentConduit = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "REMICRealEstateMtgeInvestmentConduit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.REMICRealEstateMtgeInvestmentConduit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Right"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code Right = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Right";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.Right.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SealedEnvelope"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code SealedEnvelope = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SealedEnvelope";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.SealedEnvelope.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderRateNote"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code TenderRateNote = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderRateNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.TenderRateNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderRatePreferredStock"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code TenderRatePreferredStock = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderRatePreferredStock";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.TenderRatePreferredStock.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitInvestmentTrustUIT"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code UnitInvestmentTrustUIT = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitInvestmentTrustUIT";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.UnitInvestmentTrustUIT.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitInvestmentTrustUITNuveenOnly"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code UnitInvestmentTrustUITNuveenOnly = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitInvestmentTrustUITNuveenOnly";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.UnitInvestmentTrustUITNuveenOnly.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGovernmentAgencySecurity"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code USGovernmentAgencySecurity = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGovernmentAgencySecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.USGovernmentAgencySecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTreasuryBill"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code USTreasuryBill = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasuryBill";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.USTreasuryBill.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTreasuryBond"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code USTreasuryBond = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasuryBond";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.USTreasuryBond.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTreasurySecurity"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code USTreasurySecurity = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasurySecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.USTreasurySecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTreasuryNote"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code USTreasuryNote = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasuryNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.USTreasuryNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Warrant"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code Warrant = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Warrant";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.Warrant.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZCPNDenominInitialPrincipalAmt"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code ZCPNDenominInitialPrincipalAmt = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZCPNDenominInitialPrincipalAmt";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.ZCPNDenominInitialPrincipalAmt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZeroCouponBond"</li>
	 * </ul>
	 */
	public static final DTCAssetType2Code ZeroCouponBond = new DTCAssetType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZeroCouponBond";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType2Code.mmObject();
			codeName = DTCAssetTypeCode.ZeroCouponBond.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCAssetType2Code> codesByName = new LinkedHashMap<>();

	protected DTCAssetType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCAssetType2Code";
				definition = "Specifies  DTC (The Depository Trust Company) security sub-issue type.";
				trace_lazy = () -> DTCAssetTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCAssetType2Code.ABSDenominUnitsorUndividedInterest, com.tools20022.repository.codeset.DTCAssetType2Code.AmericanDepositaryReceiptADR,
						com.tools20022.repository.codeset.DTCAssetType2Code.AssetBackedSecurityABSorGlobalABSGABS, com.tools20022.repository.codeset.DTCAssetType2Code.AuctionRatePreferredStockARPS,
						com.tools20022.repository.codeset.DTCAssetType2Code.CertificatedMoneyMarketInstrument, com.tools20022.repository.codeset.DTCAssetType2Code.BearerCallableZeroCouponBond,
						com.tools20022.repository.codeset.DTCAssetType2Code.CertificatedMoneyMarketPeriodicPayer, com.tools20022.repository.codeset.DTCAssetType2Code.CertificatesOfDeposit,
						com.tools20022.repository.codeset.DTCAssetType2Code.ClosedEndFund, com.tools20022.repository.codeset.DTCAssetType2Code.CMODenominUnitsorUndividedInterest,
						com.tools20022.repository.codeset.DTCAssetType2Code.CollateralizedMtgeObligationorGlobalCMO, com.tools20022.repository.codeset.DTCAssetType2Code.CommonStock,
						com.tools20022.repository.codeset.DTCAssetType2Code.CommonStockREIT, com.tools20022.repository.codeset.DTCAssetType2Code.ConvertibleCommonStock,
						com.tools20022.repository.codeset.DTCAssetType2Code.ConvertibleCorporateDebt, com.tools20022.repository.codeset.DTCAssetType2Code.ConvertiblePreferredStock,
						com.tools20022.repository.codeset.DTCAssetType2Code.Corporate144aDesignatedInvestors, com.tools20022.repository.codeset.DTCAssetType2Code.CorporateAuctionRateNote,
						com.tools20022.repository.codeset.DTCAssetType2Code.CorporateBondCBorGlobalCorpBondGCB, com.tools20022.repository.codeset.DTCAssetType2Code.CorporateDebenture,
						com.tools20022.repository.codeset.DTCAssetType2Code.CorporateDebtDerivative, com.tools20022.repository.codeset.DTCAssetType2Code.CorporateInsuredCustodialReceipt,
						com.tools20022.repository.codeset.DTCAssetType2Code.CorporateOtherTaxExempt, com.tools20022.repository.codeset.DTCAssetType2Code.CorporateShortTermNote,
						com.tools20022.repository.codeset.DTCAssetType2Code.CorporateVariableModeObligationCVMO, com.tools20022.repository.codeset.DTCAssetType2Code.CorporateVRDOMunicipalVRDOMMD,
						com.tools20022.repository.codeset.DTCAssetType2Code.CPIDiscountCommercialPaperCP, com.tools20022.repository.codeset.DTCAssetType2Code.CPIInterestAtMaturityIAMCommercialPaper,
						com.tools20022.repository.codeset.DTCAssetType2Code.CustodyUserCUSIP, com.tools20022.repository.codeset.DTCAssetType2Code.DebtUnit, com.tools20022.repository.codeset.DTCAssetType2Code.DepositaryShare,
						com.tools20022.repository.codeset.DTCAssetType2Code.Equity, com.tools20022.repository.codeset.DTCAssetType2Code.Equity144aDesignatedInvestors, com.tools20022.repository.codeset.DTCAssetType2Code.EquityDerivative,
						com.tools20022.repository.codeset.DTCAssetType2Code.ExchangeTradedFunds, com.tools20022.repository.codeset.DTCAssetType2Code.GNMAPassThroughSecurities,
						com.tools20022.repository.codeset.DTCAssetType2Code.GovernmentNatlMortgageAssociationGNMA, com.tools20022.repository.codeset.DTCAssetType2Code.GovernmentSecurity,
						com.tools20022.repository.codeset.DTCAssetType2Code.IssueDenominUnitsorUndividedInterest, com.tools20022.repository.codeset.DTCAssetType2Code.EquityUnit,
						com.tools20022.repository.codeset.DTCAssetType2Code.GlobalUnitTrust, com.tools20022.repository.codeset.DTCAssetType2Code.GNMASerialNoteSecurities, com.tools20022.repository.codeset.DTCAssetType2Code.GNMASerialNote,
						com.tools20022.repository.codeset.DTCAssetType2Code.GNMAREMICSecurities, com.tools20022.repository.codeset.DTCAssetType2Code.GovernmentTrustCertificate,
						com.tools20022.repository.codeset.DTCAssetType2Code.IMMIInstitutionalMMIMutualFundShares, com.tools20022.repository.codeset.DTCAssetType2Code.JunkAndTreasuryGrowthReceiptJGR,
						com.tools20022.repository.codeset.DTCAssetType2Code.LimitedPartnership, com.tools20022.repository.codeset.DTCAssetType2Code.MMIBankersAcceptanceNoteBA,
						com.tools20022.repository.codeset.DTCAssetType2Code.MMICorporateCommercialPaper, com.tools20022.repository.codeset.DTCAssetType2Code.MMICorporateVRDOCP,
						com.tools20022.repository.codeset.DTCAssetType2Code.MMIDepositNote, com.tools20022.repository.codeset.DTCAssetType2Code.MMIDiscountNote,
						com.tools20022.repository.codeset.DTCAssetType2Code.MMIInstitutionalCertificatesofDeposit, com.tools20022.repository.codeset.DTCAssetType2Code.MMIMediumTermBankNote,
						com.tools20022.repository.codeset.DTCAssetType2Code.MMIMediumTermNote, com.tools20022.repository.codeset.DTCAssetType2Code.MMIMunicipalCommercialPaper,
						com.tools20022.repository.codeset.DTCAssetType2Code.MMIMunicipalVRDOCP, com.tools20022.repository.codeset.DTCAssetType2Code.MMIPreferredStockinCPlikemode,
						com.tools20022.repository.codeset.DTCAssetType2Code.MMIShortTermBankNote, com.tools20022.repository.codeset.DTCAssetType2Code.MTNMediumTermNote,
						com.tools20022.repository.codeset.DTCAssetType2Code.MunicipalAmortizedIssue, com.tools20022.repository.codeset.DTCAssetType2Code.MunicipalAuctionRateNoteARN,
						com.tools20022.repository.codeset.DTCAssetType2Code.MunicipalBond, com.tools20022.repository.codeset.DTCAssetType2Code.MunicipalDerivative,
						com.tools20022.repository.codeset.DTCAssetType2Code.MunicipalInsuredCustodialReceipt, com.tools20022.repository.codeset.DTCAssetType2Code.MunicipalNote,
						com.tools20022.repository.codeset.DTCAssetType2Code.MunicipalOtherTaxExempt, com.tools20022.repository.codeset.DTCAssetType2Code.MunicipalOptionCallRight,
						com.tools20022.repository.codeset.DTCAssetType2Code.MunicipalVariableModeObligationVMO, com.tools20022.repository.codeset.DTCAssetType2Code.MunicipalVariableRateDemandObligationVRDO,
						com.tools20022.repository.codeset.DTCAssetType2Code.MutualFund, com.tools20022.repository.codeset.DTCAssetType2Code.NonCMOABSAmortizingIssue,
						com.tools20022.repository.codeset.DTCAssetType2Code.NonStandardAssetUserCUSIP, com.tools20022.repository.codeset.DTCAssetType2Code.OptionDerivative, com.tools20022.repository.codeset.DTCAssetType2Code.Package,
						com.tools20022.repository.codeset.DTCAssetType2Code.PeriodicPaymentCommercialPaper, com.tools20022.repository.codeset.DTCAssetType2Code.PreferredStock,
						com.tools20022.repository.codeset.DTCAssetType2Code.PreferredStockREIT, com.tools20022.repository.codeset.DTCAssetType2Code.RealEstateInvestmentTrustREIT,
						com.tools20022.repository.codeset.DTCAssetType2Code.REMICRealEstateMtgeInvestmentConduit, com.tools20022.repository.codeset.DTCAssetType2Code.Right,
						com.tools20022.repository.codeset.DTCAssetType2Code.SealedEnvelope, com.tools20022.repository.codeset.DTCAssetType2Code.TenderRateNote, com.tools20022.repository.codeset.DTCAssetType2Code.TenderRatePreferredStock,
						com.tools20022.repository.codeset.DTCAssetType2Code.UnitInvestmentTrustUIT, com.tools20022.repository.codeset.DTCAssetType2Code.UnitInvestmentTrustUITNuveenOnly,
						com.tools20022.repository.codeset.DTCAssetType2Code.USGovernmentAgencySecurity, com.tools20022.repository.codeset.DTCAssetType2Code.USTreasuryBill, com.tools20022.repository.codeset.DTCAssetType2Code.USTreasuryBond,
						com.tools20022.repository.codeset.DTCAssetType2Code.USTreasurySecurity, com.tools20022.repository.codeset.DTCAssetType2Code.USTreasuryNote, com.tools20022.repository.codeset.DTCAssetType2Code.Warrant,
						com.tools20022.repository.codeset.DTCAssetType2Code.ZCPNDenominInitialPrincipalAmt, com.tools20022.repository.codeset.DTCAssetType2Code.ZeroCouponBond);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ABSDenominUnitsorUndividedInterest.getCodeName().get(), ABSDenominUnitsorUndividedInterest);
		codesByName.put(AmericanDepositaryReceiptADR.getCodeName().get(), AmericanDepositaryReceiptADR);
		codesByName.put(AssetBackedSecurityABSorGlobalABSGABS.getCodeName().get(), AssetBackedSecurityABSorGlobalABSGABS);
		codesByName.put(AuctionRatePreferredStockARPS.getCodeName().get(), AuctionRatePreferredStockARPS);
		codesByName.put(CertificatedMoneyMarketInstrument.getCodeName().get(), CertificatedMoneyMarketInstrument);
		codesByName.put(BearerCallableZeroCouponBond.getCodeName().get(), BearerCallableZeroCouponBond);
		codesByName.put(CertificatedMoneyMarketPeriodicPayer.getCodeName().get(), CertificatedMoneyMarketPeriodicPayer);
		codesByName.put(CertificatesOfDeposit.getCodeName().get(), CertificatesOfDeposit);
		codesByName.put(ClosedEndFund.getCodeName().get(), ClosedEndFund);
		codesByName.put(CMODenominUnitsorUndividedInterest.getCodeName().get(), CMODenominUnitsorUndividedInterest);
		codesByName.put(CollateralizedMtgeObligationorGlobalCMO.getCodeName().get(), CollateralizedMtgeObligationorGlobalCMO);
		codesByName.put(CommonStock.getCodeName().get(), CommonStock);
		codesByName.put(CommonStockREIT.getCodeName().get(), CommonStockREIT);
		codesByName.put(ConvertibleCommonStock.getCodeName().get(), ConvertibleCommonStock);
		codesByName.put(ConvertibleCorporateDebt.getCodeName().get(), ConvertibleCorporateDebt);
		codesByName.put(ConvertiblePreferredStock.getCodeName().get(), ConvertiblePreferredStock);
		codesByName.put(Corporate144aDesignatedInvestors.getCodeName().get(), Corporate144aDesignatedInvestors);
		codesByName.put(CorporateAuctionRateNote.getCodeName().get(), CorporateAuctionRateNote);
		codesByName.put(CorporateBondCBorGlobalCorpBondGCB.getCodeName().get(), CorporateBondCBorGlobalCorpBondGCB);
		codesByName.put(CorporateDebenture.getCodeName().get(), CorporateDebenture);
		codesByName.put(CorporateDebtDerivative.getCodeName().get(), CorporateDebtDerivative);
		codesByName.put(CorporateInsuredCustodialReceipt.getCodeName().get(), CorporateInsuredCustodialReceipt);
		codesByName.put(CorporateOtherTaxExempt.getCodeName().get(), CorporateOtherTaxExempt);
		codesByName.put(CorporateShortTermNote.getCodeName().get(), CorporateShortTermNote);
		codesByName.put(CorporateVariableModeObligationCVMO.getCodeName().get(), CorporateVariableModeObligationCVMO);
		codesByName.put(CorporateVRDOMunicipalVRDOMMD.getCodeName().get(), CorporateVRDOMunicipalVRDOMMD);
		codesByName.put(CPIDiscountCommercialPaperCP.getCodeName().get(), CPIDiscountCommercialPaperCP);
		codesByName.put(CPIInterestAtMaturityIAMCommercialPaper.getCodeName().get(), CPIInterestAtMaturityIAMCommercialPaper);
		codesByName.put(CustodyUserCUSIP.getCodeName().get(), CustodyUserCUSIP);
		codesByName.put(DebtUnit.getCodeName().get(), DebtUnit);
		codesByName.put(DepositaryShare.getCodeName().get(), DepositaryShare);
		codesByName.put(Equity.getCodeName().get(), Equity);
		codesByName.put(Equity144aDesignatedInvestors.getCodeName().get(), Equity144aDesignatedInvestors);
		codesByName.put(EquityDerivative.getCodeName().get(), EquityDerivative);
		codesByName.put(ExchangeTradedFunds.getCodeName().get(), ExchangeTradedFunds);
		codesByName.put(GNMAPassThroughSecurities.getCodeName().get(), GNMAPassThroughSecurities);
		codesByName.put(GovernmentNatlMortgageAssociationGNMA.getCodeName().get(), GovernmentNatlMortgageAssociationGNMA);
		codesByName.put(GovernmentSecurity.getCodeName().get(), GovernmentSecurity);
		codesByName.put(IssueDenominUnitsorUndividedInterest.getCodeName().get(), IssueDenominUnitsorUndividedInterest);
		codesByName.put(EquityUnit.getCodeName().get(), EquityUnit);
		codesByName.put(GlobalUnitTrust.getCodeName().get(), GlobalUnitTrust);
		codesByName.put(GNMASerialNoteSecurities.getCodeName().get(), GNMASerialNoteSecurities);
		codesByName.put(GNMASerialNote.getCodeName().get(), GNMASerialNote);
		codesByName.put(GNMAREMICSecurities.getCodeName().get(), GNMAREMICSecurities);
		codesByName.put(GovernmentTrustCertificate.getCodeName().get(), GovernmentTrustCertificate);
		codesByName.put(IMMIInstitutionalMMIMutualFundShares.getCodeName().get(), IMMIInstitutionalMMIMutualFundShares);
		codesByName.put(JunkAndTreasuryGrowthReceiptJGR.getCodeName().get(), JunkAndTreasuryGrowthReceiptJGR);
		codesByName.put(LimitedPartnership.getCodeName().get(), LimitedPartnership);
		codesByName.put(MMIBankersAcceptanceNoteBA.getCodeName().get(), MMIBankersAcceptanceNoteBA);
		codesByName.put(MMICorporateCommercialPaper.getCodeName().get(), MMICorporateCommercialPaper);
		codesByName.put(MMICorporateVRDOCP.getCodeName().get(), MMICorporateVRDOCP);
		codesByName.put(MMIDepositNote.getCodeName().get(), MMIDepositNote);
		codesByName.put(MMIDiscountNote.getCodeName().get(), MMIDiscountNote);
		codesByName.put(MMIInstitutionalCertificatesofDeposit.getCodeName().get(), MMIInstitutionalCertificatesofDeposit);
		codesByName.put(MMIMediumTermBankNote.getCodeName().get(), MMIMediumTermBankNote);
		codesByName.put(MMIMediumTermNote.getCodeName().get(), MMIMediumTermNote);
		codesByName.put(MMIMunicipalCommercialPaper.getCodeName().get(), MMIMunicipalCommercialPaper);
		codesByName.put(MMIMunicipalVRDOCP.getCodeName().get(), MMIMunicipalVRDOCP);
		codesByName.put(MMIPreferredStockinCPlikemode.getCodeName().get(), MMIPreferredStockinCPlikemode);
		codesByName.put(MMIShortTermBankNote.getCodeName().get(), MMIShortTermBankNote);
		codesByName.put(MTNMediumTermNote.getCodeName().get(), MTNMediumTermNote);
		codesByName.put(MunicipalAmortizedIssue.getCodeName().get(), MunicipalAmortizedIssue);
		codesByName.put(MunicipalAuctionRateNoteARN.getCodeName().get(), MunicipalAuctionRateNoteARN);
		codesByName.put(MunicipalBond.getCodeName().get(), MunicipalBond);
		codesByName.put(MunicipalDerivative.getCodeName().get(), MunicipalDerivative);
		codesByName.put(MunicipalInsuredCustodialReceipt.getCodeName().get(), MunicipalInsuredCustodialReceipt);
		codesByName.put(MunicipalNote.getCodeName().get(), MunicipalNote);
		codesByName.put(MunicipalOtherTaxExempt.getCodeName().get(), MunicipalOtherTaxExempt);
		codesByName.put(MunicipalOptionCallRight.getCodeName().get(), MunicipalOptionCallRight);
		codesByName.put(MunicipalVariableModeObligationVMO.getCodeName().get(), MunicipalVariableModeObligationVMO);
		codesByName.put(MunicipalVariableRateDemandObligationVRDO.getCodeName().get(), MunicipalVariableRateDemandObligationVRDO);
		codesByName.put(MutualFund.getCodeName().get(), MutualFund);
		codesByName.put(NonCMOABSAmortizingIssue.getCodeName().get(), NonCMOABSAmortizingIssue);
		codesByName.put(NonStandardAssetUserCUSIP.getCodeName().get(), NonStandardAssetUserCUSIP);
		codesByName.put(OptionDerivative.getCodeName().get(), OptionDerivative);
		codesByName.put(Package.getCodeName().get(), Package);
		codesByName.put(PeriodicPaymentCommercialPaper.getCodeName().get(), PeriodicPaymentCommercialPaper);
		codesByName.put(PreferredStock.getCodeName().get(), PreferredStock);
		codesByName.put(PreferredStockREIT.getCodeName().get(), PreferredStockREIT);
		codesByName.put(RealEstateInvestmentTrustREIT.getCodeName().get(), RealEstateInvestmentTrustREIT);
		codesByName.put(REMICRealEstateMtgeInvestmentConduit.getCodeName().get(), REMICRealEstateMtgeInvestmentConduit);
		codesByName.put(Right.getCodeName().get(), Right);
		codesByName.put(SealedEnvelope.getCodeName().get(), SealedEnvelope);
		codesByName.put(TenderRateNote.getCodeName().get(), TenderRateNote);
		codesByName.put(TenderRatePreferredStock.getCodeName().get(), TenderRatePreferredStock);
		codesByName.put(UnitInvestmentTrustUIT.getCodeName().get(), UnitInvestmentTrustUIT);
		codesByName.put(UnitInvestmentTrustUITNuveenOnly.getCodeName().get(), UnitInvestmentTrustUITNuveenOnly);
		codesByName.put(USGovernmentAgencySecurity.getCodeName().get(), USGovernmentAgencySecurity);
		codesByName.put(USTreasuryBill.getCodeName().get(), USTreasuryBill);
		codesByName.put(USTreasuryBond.getCodeName().get(), USTreasuryBond);
		codesByName.put(USTreasurySecurity.getCodeName().get(), USTreasurySecurity);
		codesByName.put(USTreasuryNote.getCodeName().get(), USTreasuryNote);
		codesByName.put(Warrant.getCodeName().get(), Warrant);
		codesByName.put(ZCPNDenominInitialPrincipalAmt.getCodeName().get(), ZCPNDenominInitialPrincipalAmt);
		codesByName.put(ZeroCouponBond.getCodeName().get(), ZeroCouponBond);
	}

	public static DTCAssetType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCAssetType2Code[] values() {
		DTCAssetType2Code[] values = new DTCAssetType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCAssetType2Code> {
		@Override
		public DTCAssetType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCAssetType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}