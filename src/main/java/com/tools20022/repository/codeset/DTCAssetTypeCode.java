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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies DTC (The Depository Trust Company) security sub-issue type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
 * DTCAssetType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
 * DTCAssetType2Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmEquity
 * DTCAssetTypeCode.mmEquity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmCommonStock
 * DTCAssetTypeCode.mmCommonStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmConvertibleCommonStock
 * DTCAssetTypeCode.mmConvertibleCommonStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmCommonStockREIT
 * DTCAssetTypeCode.mmCommonStockREIT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmPreferredStock
 * DTCAssetTypeCode.mmPreferredStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmPreferredStockREIT
 * DTCAssetTypeCode.mmPreferredStockREIT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmConvertiblePreferredStock
 * DTCAssetTypeCode.mmConvertiblePreferredStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmTenderRatePreferredStock
 * DTCAssetTypeCode.mmTenderRatePreferredStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmLimitedPartnership
 * DTCAssetTypeCode.mmLimitedPartnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmCMODenominUnitsorUndividedInterest
 * DTCAssetTypeCode.mmCMODenominUnitsorUndividedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmABSDenominUnitsorUndividedInterest
 * DTCAssetTypeCode.mmABSDenominUnitsorUndividedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmIssueDenominUnitsorUndividedInterest
 * DTCAssetTypeCode.mmIssueDenominUnitsorUndividedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmAuctionRatePreferredStockARPS
 * DTCAssetTypeCode.mmAuctionRatePreferredStockARPS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmAmericanDepositaryReceiptADR
 * DTCAssetTypeCode.mmAmericanDepositaryReceiptADR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmDepositaryShare
 * DTCAssetTypeCode.mmDepositaryShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmMunicipalOptionCallRight
 * DTCAssetTypeCode.mmMunicipalOptionCallRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmExchangeTradedFunds
 * DTCAssetTypeCode.mmExchangeTradedFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmMMIPreferredStockinCPlikemode
 * DTCAssetTypeCode.mmMMIPreferredStockinCPlikemode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmSealedEnvelope
 * DTCAssetTypeCode.mmSealedEnvelope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmCustodyUserCUSIP
 * DTCAssetTypeCode.mmCustodyUserCUSIP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmRealEstateInvestmentTrustREIT
 * DTCAssetTypeCode.mmRealEstateInvestmentTrustREIT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmMunicipalBond
 * DTCAssetTypeCode.mmMunicipalBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmMunicipalNote
 * DTCAssetTypeCode.mmMunicipalNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmMunicipalAuctionRateNoteARN
 * DTCAssetTypeCode.mmMunicipalAuctionRateNoteARN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmMunicipalVariableModeObligationVMO
 * DTCAssetTypeCode.mmMunicipalVariableModeObligationVMO}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmMunicipalVariableRateDemandObligationVRDO
 * DTCAssetTypeCode.mmMunicipalVariableRateDemandObligationVRDO}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmMunicipalInsuredCustodialReceipt
 * DTCAssetTypeCode.mmMunicipalInsuredCustodialReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmMMIMunicipalVRDOCP
 * DTCAssetTypeCode.mmMMIMunicipalVRDOCP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmMMIMunicipalCommercialPaper
 * DTCAssetTypeCode.mmMMIMunicipalCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmBearerCallableZeroCouponBond
 * DTCAssetTypeCode.mmBearerCallableZeroCouponBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmGNMAREMICSecurities
 * DTCAssetTypeCode.mmGNMAREMICSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmGNMAPassThroughSecurities
 * DTCAssetTypeCode.mmGNMAPassThroughSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmGNMASerialNoteSecurities
 * DTCAssetTypeCode.mmGNMASerialNoteSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmCorporateBondCBorGlobalCorpBondGCB
 * DTCAssetTypeCode.mmCorporateBondCBorGlobalCorpBondGCB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmMMIBankersAcceptanceNoteBA
 * DTCAssetTypeCode.mmMMIBankersAcceptanceNoteBA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmMMIInstitutionalCertificatesofDeposit
 * DTCAssetTypeCode.mmMMIInstitutionalCertificatesofDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmCertificatedMoneyMarketInstrument
 * DTCAssetTypeCode.mmCertificatedMoneyMarketInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmCertificatedMoneyMarketPeriodicPayer
 * DTCAssetTypeCode.mmCertificatedMoneyMarketPeriodicPayer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmCertificatesOfDeposit
 * DTCAssetTypeCode.mmCertificatesOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmCPIInterestAtMaturityIAMCommercialPaper
 * DTCAssetTypeCode.mmCPIInterestAtMaturityIAMCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmPeriodicPaymentCommercialPaper
 * DTCAssetTypeCode.mmPeriodicPaymentCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmCPIDiscountCommercialPaperCP
 * DTCAssetTypeCode.mmCPIDiscountCommercialPaperCP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmMMICorporateCommercialPaper
 * DTCAssetTypeCode.mmMMICorporateCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmMMICorporateVRDOCP
 * DTCAssetTypeCode.mmMMICorporateVRDOCP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmMTNMediumTermNote
 * DTCAssetTypeCode.mmMTNMediumTermNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmMMIDepositNote
 * DTCAssetTypeCode.mmMMIDepositNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmMMIMediumTermBankNote
 * DTCAssetTypeCode.mmMMIMediumTermBankNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmMMIMediumTermNote
 * DTCAssetTypeCode.mmMMIMediumTermNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmCollateralizedMtgeObligationorGlobalCMO
 * DTCAssetTypeCode.mmCollateralizedMtgeObligationorGlobalCMO}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmAssetBackedSecurityABSorGlobalABSGABS
 * DTCAssetTypeCode.mmAssetBackedSecurityABSorGlobalABSGABS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmNonCMOABSAmortizingIssue
 * DTCAssetTypeCode.mmNonCMOABSAmortizingIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmMMIShortTermBankNote
 * DTCAssetTypeCode.mmMMIShortTermBankNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmZCPNDenominInitialPrincipalAmt
 * DTCAssetTypeCode.mmZCPNDenominInitialPrincipalAmt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmMMIDiscountNote
 * DTCAssetTypeCode.mmMMIDiscountNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmCorporateAuctionRateNote
 * DTCAssetTypeCode.mmCorporateAuctionRateNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmConvertibleCorporateDebt
 * DTCAssetTypeCode.mmConvertibleCorporateDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmCorporateVariableModeObligationCVMO
 * DTCAssetTypeCode.mmCorporateVariableModeObligationCVMO}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmCorporateShortTermNote
 * DTCAssetTypeCode.mmCorporateShortTermNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmCorporateDebenture
 * DTCAssetTypeCode.mmCorporateDebenture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmCorporateVRDOMunicipalVRDOMMD
 * DTCAssetTypeCode.mmCorporateVRDOMunicipalVRDOMMD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmCorporateInsuredCustodialReceipt
 * DTCAssetTypeCode.mmCorporateInsuredCustodialReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmTenderRateNote
 * DTCAssetTypeCode.mmTenderRateNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmZeroCouponBond
 * DTCAssetTypeCode.mmZeroCouponBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmGovernmentSecurity
 * DTCAssetTypeCode.mmGovernmentSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmGovernmentTrustCertificate
 * DTCAssetTypeCode.mmGovernmentTrustCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmJunkAndTreasuryGrowthReceiptJGR
 * DTCAssetTypeCode.mmJunkAndTreasuryGrowthReceiptJGR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmUSTreasurySecurity
 * DTCAssetTypeCode.mmUSTreasurySecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmUSTreasuryBill
 * DTCAssetTypeCode.mmUSTreasuryBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmUSTreasuryNote
 * DTCAssetTypeCode.mmUSTreasuryNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmUSTreasuryBond
 * DTCAssetTypeCode.mmUSTreasuryBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmUSGovernmentAgencySecurity
 * DTCAssetTypeCode.mmUSGovernmentAgencySecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmGovernmentNatlMortgageAssociationGNMA
 * DTCAssetTypeCode.mmGovernmentNatlMortgageAssociationGNMA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmREMICRealEstateMtgeInvestmentConduit
 * DTCAssetTypeCode.mmREMICRealEstateMtgeInvestmentConduit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmGNMASerialNote
 * DTCAssetTypeCode.mmGNMASerialNote}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmPackage
 * DTCAssetTypeCode.mmPackage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmCorporateDebtDerivative
 * DTCAssetTypeCode.mmCorporateDebtDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmEquityDerivative
 * DTCAssetTypeCode.mmEquityDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmMunicipalDerivative
 * DTCAssetTypeCode.mmMunicipalDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmMunicipalAmortizedIssue
 * DTCAssetTypeCode.mmMunicipalAmortizedIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmOptionDerivative
 * DTCAssetTypeCode.mmOptionDerivative}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmWarrant
 * DTCAssetTypeCode.mmWarrant}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmRight
 * DTCAssetTypeCode.mmRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmMutualFund
 * DTCAssetTypeCode.mmMutualFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmClosedEndFund
 * DTCAssetTypeCode.mmClosedEndFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmIMMIInstitutionalMMIMutualFundShares
 * DTCAssetTypeCode.mmIMMIInstitutionalMMIMutualFundShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmEquityUnit
 * DTCAssetTypeCode.mmEquityUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmDebtUnit
 * DTCAssetTypeCode.mmDebtUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmUnitInvestmentTrustUITNuveenOnly
 * DTCAssetTypeCode.mmUnitInvestmentTrustUITNuveenOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmGlobalUnitTrust
 * DTCAssetTypeCode.mmGlobalUnitTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmUnitInvestmentTrustUIT
 * DTCAssetTypeCode.mmUnitInvestmentTrustUIT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmEquity144aDesignatedInvestors
 * DTCAssetTypeCode.mmEquity144aDesignatedInvestors}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmMunicipalOtherTaxExempt
 * DTCAssetTypeCode.mmMunicipalOtherTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmCorporateOtherTaxExempt
 * DTCAssetTypeCode.mmCorporateOtherTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmCorporate144aDesignatedInvestors
 * DTCAssetTypeCode.mmCorporate144aDesignatedInvestors}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode#mmNonStandardAssetUserCUSIP
 * DTCAssetTypeCode.mmNonStandardAssetUserCUSIP}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
 * "Specifies  DTC (The Depository Trust Company) security sub-issue type."</li>
 * </ul>
 */
public class DTCAssetTypeCode {

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
	public static final MMCode mmEquity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity";
			definition = "Equity.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmCommonStock = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonStock";
			definition = "Common Stock.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmConvertibleCommonStock = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertibleCommonStock";
			definition = "Convertible Common Stock.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmCommonStockREIT = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonStockREIT";
			definition = "Common Stock REIT.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmPreferredStock = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreferredStock";
			definition = "Preferred Stock.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmPreferredStockREIT = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreferredStockREIT";
			definition = "Preferred Stock REIT.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmConvertiblePreferredStock = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertiblePreferredStock";
			definition = "Convertible Preferred Stock.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmTenderRatePreferredStock = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderRatePreferredStock";
			definition = "Tender Rate Preferred Stock.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmLimitedPartnership = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitedPartnership";
			definition = "Limited Partnership.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmCMODenominUnitsorUndividedInterest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CMODenominUnitsorUndividedInterest";
			definition = "CMO Denomination in \"Units\" or \"Undivided Interest\".";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmABSDenominUnitsorUndividedInterest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ABSDenominUnitsorUndividedInterest";
			definition = "ABS Denomination in \"Units\" or \"Undivided Interest\".";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmIssueDenominUnitsorUndividedInterest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDenominUnitsorUndividedInterest";
			definition = "Issue Denomination in \"Units\" or \"Undivided Interest\".";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmAuctionRatePreferredStockARPS = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuctionRatePreferredStockARPS";
			definition = "Auction Rate Preferred Stock (ARPS).";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmAmericanDepositaryReceiptADR = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmericanDepositaryReceiptADR";
			definition = "American Depositary Receipt (ADR).";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmDepositaryShare = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositaryShare";
			definition = "Depositary Share.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmMunicipalOptionCallRight = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalOptionCallRight";
			definition = "Municipal Option Call Right.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmExchangeTradedFunds = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedFunds";
			definition = "Exchange Traded Funds.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmMMIPreferredStockinCPlikemode = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIPreferredStockinCPlikemode";
			definition = "MMI Preferred Stock (in CP-like mode).";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmSealedEnvelope = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SealedEnvelope";
			definition = "Sealed Envelope.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmCustodyUserCUSIP = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyUserCUSIP";
			definition = "Custody User CUSIP.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmRealEstateInvestmentTrustREIT = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealEstateInvestmentTrustREIT";
			definition = "Real-Estate Investment Trust (REIT).";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmMunicipalBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalBond";
			definition = "Municipal Bond.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmMunicipalNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalNote";
			definition = "Municipal Note.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	 * definition} = "Municipal Auction Rate Note  (ARN)."</li>
	 * </ul>
	 */
	public static final MMCode mmMunicipalAuctionRateNoteARN = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalAuctionRateNoteARN";
			definition = "Municipal Auction Rate Note  (ARN).";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	 * definition} = "Municipal Variable Mode Obligation  (VMO)."</li>
	 * </ul>
	 */
	public static final MMCode mmMunicipalVariableModeObligationVMO = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalVariableModeObligationVMO";
			definition = "Municipal Variable Mode Obligation  (VMO).";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmMunicipalVariableRateDemandObligationVRDO = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalVariableRateDemandObligationVRDO";
			definition = "Municipal Variable Rate Demand Obligation (VRDO).";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmMunicipalInsuredCustodialReceipt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalInsuredCustodialReceipt";
			definition = "Municipal Insured Custodial Receipt.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmMMIMunicipalVRDOCP = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMunicipalVRDOCP";
			definition = "MMI Municipal VRDO/CP.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmMMIMunicipalCommercialPaper = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMunicipalCommercialPaper";
			definition = "MMI Municipal Commercial Paper.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmBearerCallableZeroCouponBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BearerCallableZeroCouponBond";
			definition = "Bearer, Callable Zero Coupon Bond.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmGNMAREMICSecurities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMAREMICSecurities";
			definition = "GNMA REMIC securities.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmGNMAPassThroughSecurities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMAPassThroughSecurities";
			definition = "GNMA Pass-through securities.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmGNMASerialNoteSecurities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMASerialNoteSecurities";
			definition = "GNMA Serial note securities.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmCorporateBondCBorGlobalCorpBondGCB = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateBondCBorGlobalCorpBondGCB";
			definition = "Corporate Bond (CB) or Global Corp Bond (GCB).";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmMMIBankersAcceptanceNoteBA = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIBankersAcceptanceNoteBA";
			definition = "MMI Bankers' Acceptance Note (BA).";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmMMIInstitutionalCertificatesofDeposit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIInstitutionalCertificatesofDeposit";
			definition = "MMI Institutional Certificates of Deposit.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmCertificatedMoneyMarketInstrument = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificatedMoneyMarketInstrument";
			definition = "Certificated Money Market Instrument.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmCertificatedMoneyMarketPeriodicPayer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificatedMoneyMarketPeriodicPayer";
			definition = "Certificated Money Market - Periodic Payer.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmCertificatesOfDeposit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificatesOfDeposit";
			definition = "Certificates of Deposit.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmCPIInterestAtMaturityIAMCommercialPaper = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CPIInterestAtMaturityIAMCommercialPaper";
			definition = "CPI Interest at Maturity (IAM) Commercial Paper.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmPeriodicPaymentCommercialPaper = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodicPaymentCommercialPaper";
			definition = "Periodic Payment Commercial Paper.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmCPIDiscountCommercialPaperCP = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CPIDiscountCommercialPaperCP";
			definition = "CPI Discount Commercial Paper (CP).";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmMMICorporateCommercialPaper = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMICorporateCommercialPaper";
			definition = "MMI Corporate Commercial Paper.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmMMICorporateVRDOCP = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMICorporateVRDOCP";
			definition = "MMI Corporate VRDO/CP.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmMTNMediumTermNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MTNMediumTermNote";
			definition = "MTN Medium Term Note.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmMMIDepositNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIDepositNote";
			definition = "MMI Deposit Note.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmMMIMediumTermBankNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMediumTermBankNote";
			definition = "MMI Medium-Term Bank Note.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmMMIMediumTermNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMediumTermNote";
			definition = "MMI Medium Term Note.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmCollateralizedMtgeObligationorGlobalCMO = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralizedMtgeObligationorGlobalCMO";
			definition = "Collateralized Mortgage Obligation or Global CMO.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmAssetBackedSecurityABSorGlobalABSGABS = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetBackedSecurityABSorGlobalABSGABS";
			definition = "Asset-Backed security (ABS) or global ABS (GABS).";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmNonCMOABSAmortizingIssue = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonCMOABSAmortizingIssue";
			definition = "Non-CMO/ABS Amortizing Issue.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmMMIShortTermBankNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIShortTermBankNote";
			definition = "MMI Short-Term Bank Note.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmZCPNDenominInitialPrincipalAmt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZCPNDenominInitialPrincipalAmt";
			definition = "Z CPN Denomination in Initial Principal Amt.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmMMIDiscountNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIDiscountNote";
			definition = "MMI Discount Note.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmCorporateAuctionRateNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateAuctionRateNote";
			definition = "Corporate Auction Rate Note.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmConvertibleCorporateDebt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertibleCorporateDebt";
			definition = "Convertible Corporate Debt.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmCorporateVariableModeObligationCVMO = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateVariableModeObligationCVMO";
			definition = "Corporate Variable Mode Obligation (CVMO).";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmCorporateShortTermNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateShortTermNote";
			definition = "Corporate Short-Term Note.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmCorporateDebenture = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateDebenture";
			definition = "Corporate Debenture.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmCorporateVRDOMunicipalVRDOMMD = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateVRDOMunicipalVRDOMMD";
			definition = "Corporate VRDO / Municipal VRDO (MMD).";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmCorporateInsuredCustodialReceipt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateInsuredCustodialReceipt";
			definition = "Corporate Insured Custodial Receipt.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmTenderRateNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderRateNote";
			definition = "Tender Rate Note.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmZeroCouponBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZeroCouponBond";
			definition = "Zero Coupon Bond.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmGovernmentSecurity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentSecurity";
			definition = "Government security.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmGovernmentTrustCertificate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentTrustCertificate";
			definition = "Government Trust Certificate.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmJunkAndTreasuryGrowthReceiptJGR = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JunkAndTreasuryGrowthReceiptJGR";
			definition = "Junk and Treasury Growth Receipt (JGR).";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmUSTreasurySecurity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasurySecurity";
			definition = "U.S. Treasury security.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmUSTreasuryBill = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasuryBill";
			definition = "US Treasury Bill.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmUSTreasuryNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasuryNote";
			definition = "US Treasury Note.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmUSTreasuryBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasuryBond";
			definition = "US Treasury Bond.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmUSGovernmentAgencySecurity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGovernmentAgencySecurity";
			definition = "U.S. government agency security.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmGovernmentNatlMortgageAssociationGNMA = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentNatlMortgageAssociationGNMA";
			definition = "Government Nat'l Mortgage Association (GNMA).";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmREMICRealEstateMtgeInvestmentConduit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "REMICRealEstateMtgeInvestmentConduit";
			definition = "REMIC (Real Estate Mortgage Investment Conduit).";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmGNMASerialNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMASerialNote";
			definition = "GNMA Serial Note.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmPackage = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Package";
			definition = "Package.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmCorporateDebtDerivative = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateDebtDerivative";
			definition = "Corporate Debt Derivative.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmEquityDerivative = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityDerivative";
			definition = "Equity Derivative.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmMunicipalDerivative = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalDerivative";
			definition = "Municipal Derivative.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmMunicipalAmortizedIssue = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalAmortizedIssue";
			definition = "Municipal Amortized Issue.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmOptionDerivative = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionDerivative";
			definition = "Option Derivative.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmWarrant = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Warrant";
			definition = "Warrant.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmRight = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Right";
			definition = "Right.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmMutualFund = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MutualFund";
			definition = "Mutual Fund.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmClosedEndFund = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedEndFund";
			definition = "Closed End Fund.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmIMMIInstitutionalMMIMutualFundShares = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IMMIInstitutionalMMIMutualFundShares";
			definition = "(IMMI) Institutional MMI Mutual Fund Shares.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmEquityUnit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityUnit";
			definition = "Equity Unit.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmDebtUnit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtUnit";
			definition = "Debt Unit.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmUnitInvestmentTrustUITNuveenOnly = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitInvestmentTrustUITNuveenOnly";
			definition = "Unit Investment Trust (UIT) - Nuveen Only.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmGlobalUnitTrust = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalUnitTrust";
			definition = "Global Unit Trust.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmUnitInvestmentTrustUIT = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitInvestmentTrustUIT";
			definition = "Unit Investment Trust (UIT).";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmEquity144aDesignatedInvestors = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity144aDesignatedInvestors";
			definition = "Equity, subject to 144a, designated investors.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmMunicipalOtherTaxExempt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalOtherTaxExempt";
			definition = "Municipal debt, classified as other, subject to tax exempt.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmCorporateOtherTaxExempt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateOtherTaxExempt";
			definition = "Corporate debt, classified as other, subject to tax exempt.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmCorporate144aDesignatedInvestors = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Corporate144aDesignatedInvestors";
			definition = "Corporate debt, subject to 144a, designated investors.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
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
	public static final MMCode mmNonStandardAssetUserCUSIP = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandardAssetUserCUSIP";
			definition = "Non standard asset user CUSIP.";
			owner_lazy = () -> DTCAssetTypeCode.mmObject();
			codeName = "S127";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("S005");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCAssetTypeCode";
				definition = "Specifies  DTC (The Depository Trust Company) security sub-issue type.";
				code_lazy = () -> Arrays.asList(DTCAssetTypeCode.mmEquity, DTCAssetTypeCode.mmCommonStock, DTCAssetTypeCode.mmConvertibleCommonStock, DTCAssetTypeCode.mmCommonStockREIT, DTCAssetTypeCode.mmPreferredStock,
						DTCAssetTypeCode.mmPreferredStockREIT, DTCAssetTypeCode.mmConvertiblePreferredStock, DTCAssetTypeCode.mmTenderRatePreferredStock, DTCAssetTypeCode.mmLimitedPartnership,
						DTCAssetTypeCode.mmCMODenominUnitsorUndividedInterest, DTCAssetTypeCode.mmABSDenominUnitsorUndividedInterest, DTCAssetTypeCode.mmIssueDenominUnitsorUndividedInterest,
						DTCAssetTypeCode.mmAuctionRatePreferredStockARPS, DTCAssetTypeCode.mmAmericanDepositaryReceiptADR, DTCAssetTypeCode.mmDepositaryShare, DTCAssetTypeCode.mmMunicipalOptionCallRight,
						DTCAssetTypeCode.mmExchangeTradedFunds, DTCAssetTypeCode.mmMMIPreferredStockinCPlikemode, DTCAssetTypeCode.mmSealedEnvelope, DTCAssetTypeCode.mmCustodyUserCUSIP, DTCAssetTypeCode.mmRealEstateInvestmentTrustREIT,
						DTCAssetTypeCode.mmMunicipalBond, DTCAssetTypeCode.mmMunicipalNote, DTCAssetTypeCode.mmMunicipalAuctionRateNoteARN, DTCAssetTypeCode.mmMunicipalVariableModeObligationVMO,
						DTCAssetTypeCode.mmMunicipalVariableRateDemandObligationVRDO, DTCAssetTypeCode.mmMunicipalInsuredCustodialReceipt, DTCAssetTypeCode.mmMMIMunicipalVRDOCP, DTCAssetTypeCode.mmMMIMunicipalCommercialPaper,
						DTCAssetTypeCode.mmBearerCallableZeroCouponBond, DTCAssetTypeCode.mmGNMAREMICSecurities, DTCAssetTypeCode.mmGNMAPassThroughSecurities, DTCAssetTypeCode.mmGNMASerialNoteSecurities,
						DTCAssetTypeCode.mmCorporateBondCBorGlobalCorpBondGCB, DTCAssetTypeCode.mmMMIBankersAcceptanceNoteBA, DTCAssetTypeCode.mmMMIInstitutionalCertificatesofDeposit, DTCAssetTypeCode.mmCertificatedMoneyMarketInstrument,
						DTCAssetTypeCode.mmCertificatedMoneyMarketPeriodicPayer, DTCAssetTypeCode.mmCertificatesOfDeposit, DTCAssetTypeCode.mmCPIInterestAtMaturityIAMCommercialPaper, DTCAssetTypeCode.mmPeriodicPaymentCommercialPaper,
						DTCAssetTypeCode.mmCPIDiscountCommercialPaperCP, DTCAssetTypeCode.mmMMICorporateCommercialPaper, DTCAssetTypeCode.mmMMICorporateVRDOCP, DTCAssetTypeCode.mmMTNMediumTermNote, DTCAssetTypeCode.mmMMIDepositNote,
						DTCAssetTypeCode.mmMMIMediumTermBankNote, DTCAssetTypeCode.mmMMIMediumTermNote, DTCAssetTypeCode.mmCollateralizedMtgeObligationorGlobalCMO, DTCAssetTypeCode.mmAssetBackedSecurityABSorGlobalABSGABS,
						DTCAssetTypeCode.mmNonCMOABSAmortizingIssue, DTCAssetTypeCode.mmMMIShortTermBankNote, DTCAssetTypeCode.mmZCPNDenominInitialPrincipalAmt, DTCAssetTypeCode.mmMMIDiscountNote,
						DTCAssetTypeCode.mmCorporateAuctionRateNote, DTCAssetTypeCode.mmConvertibleCorporateDebt, DTCAssetTypeCode.mmCorporateVariableModeObligationCVMO, DTCAssetTypeCode.mmCorporateShortTermNote,
						DTCAssetTypeCode.mmCorporateDebenture, DTCAssetTypeCode.mmCorporateVRDOMunicipalVRDOMMD, DTCAssetTypeCode.mmCorporateInsuredCustodialReceipt, DTCAssetTypeCode.mmTenderRateNote, DTCAssetTypeCode.mmZeroCouponBond,
						DTCAssetTypeCode.mmGovernmentSecurity, DTCAssetTypeCode.mmGovernmentTrustCertificate, DTCAssetTypeCode.mmJunkAndTreasuryGrowthReceiptJGR, DTCAssetTypeCode.mmUSTreasurySecurity, DTCAssetTypeCode.mmUSTreasuryBill,
						DTCAssetTypeCode.mmUSTreasuryNote, DTCAssetTypeCode.mmUSTreasuryBond, DTCAssetTypeCode.mmUSGovernmentAgencySecurity, DTCAssetTypeCode.mmGovernmentNatlMortgageAssociationGNMA,
						DTCAssetTypeCode.mmREMICRealEstateMtgeInvestmentConduit, DTCAssetTypeCode.mmGNMASerialNote, DTCAssetTypeCode.mmPackage, DTCAssetTypeCode.mmCorporateDebtDerivative, DTCAssetTypeCode.mmEquityDerivative,
						DTCAssetTypeCode.mmMunicipalDerivative, DTCAssetTypeCode.mmMunicipalAmortizedIssue, DTCAssetTypeCode.mmOptionDerivative, DTCAssetTypeCode.mmWarrant, DTCAssetTypeCode.mmRight, DTCAssetTypeCode.mmMutualFund,
						DTCAssetTypeCode.mmClosedEndFund, DTCAssetTypeCode.mmIMMIInstitutionalMMIMutualFundShares, DTCAssetTypeCode.mmEquityUnit, DTCAssetTypeCode.mmDebtUnit, DTCAssetTypeCode.mmUnitInvestmentTrustUITNuveenOnly,
						DTCAssetTypeCode.mmGlobalUnitTrust, DTCAssetTypeCode.mmUnitInvestmentTrustUIT, DTCAssetTypeCode.mmEquity144aDesignatedInvestors, DTCAssetTypeCode.mmMunicipalOtherTaxExempt,
						DTCAssetTypeCode.mmCorporateOtherTaxExempt, DTCAssetTypeCode.mmCorporate144aDesignatedInvestors, DTCAssetTypeCode.mmNonStandardAssetUserCUSIP);
				derivation_lazy = () -> Arrays.asList(DTCAssetType1Code.mmObject(), DTCAssetType2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}