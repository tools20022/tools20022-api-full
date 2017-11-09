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
import com.tools20022.repository.codeset.DTCAssetTypeCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * DTC (The Depository Trust Company) security sub-issue type code list.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
 * DTCAssetTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmEquity
 * DTCAssetType1Code.mmEquity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmCommonStock
 * DTCAssetType1Code.mmCommonStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmConvertibleCommonStock
 * DTCAssetType1Code.mmConvertibleCommonStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmCommonStockREIT
 * DTCAssetType1Code.mmCommonStockREIT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmPreferredStock
 * DTCAssetType1Code.mmPreferredStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmPreferredStockREIT
 * DTCAssetType1Code.mmPreferredStockREIT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmConvertiblePreferredStock
 * DTCAssetType1Code.mmConvertiblePreferredStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmTenderRatePreferredStock
 * DTCAssetType1Code.mmTenderRatePreferredStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmLimitedPartnership
 * DTCAssetType1Code.mmLimitedPartnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmCMODenominUnitsorUndividedInterest
 * DTCAssetType1Code.mmCMODenominUnitsorUndividedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmABSDenominUnitsorUndividedInterest
 * DTCAssetType1Code.mmABSDenominUnitsorUndividedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmIssueDenominUnitsorUndividedInterest
 * DTCAssetType1Code.mmIssueDenominUnitsorUndividedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmAuctionRatePreferredStockARPS
 * DTCAssetType1Code.mmAuctionRatePreferredStockARPS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmAmericanDepositaryReceiptADR
 * DTCAssetType1Code.mmAmericanDepositaryReceiptADR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmDepositaryShare
 * DTCAssetType1Code.mmDepositaryShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmMunicipalOptionCallRight
 * DTCAssetType1Code.mmMunicipalOptionCallRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmExchangeTradedFunds
 * DTCAssetType1Code.mmExchangeTradedFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmMMIPreferredStockinCPlikemode
 * DTCAssetType1Code.mmMMIPreferredStockinCPlikemode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmSealedEnvelope
 * DTCAssetType1Code.mmSealedEnvelope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmCustodyUserCUSIP
 * DTCAssetType1Code.mmCustodyUserCUSIP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmRealEstateInvestmentTrustREIT
 * DTCAssetType1Code.mmRealEstateInvestmentTrustREIT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmMunicipalBond
 * DTCAssetType1Code.mmMunicipalBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmMunicipalNote
 * DTCAssetType1Code.mmMunicipalNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmMunicipalAuctionRateNoteARN
 * DTCAssetType1Code.mmMunicipalAuctionRateNoteARN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmMunicipalVariableModeObligationVMO
 * DTCAssetType1Code.mmMunicipalVariableModeObligationVMO}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmMunicipalVariableRateDemandObligationVRDO
 * DTCAssetType1Code.mmMunicipalVariableRateDemandObligationVRDO}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmMunicipalInsuredCustodialReceipt
 * DTCAssetType1Code.mmMunicipalInsuredCustodialReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmMMIMunicipalVRDOCP
 * DTCAssetType1Code.mmMMIMunicipalVRDOCP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmMMIMunicipalCommercialPaper
 * DTCAssetType1Code.mmMMIMunicipalCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmBearerCallableZeroCouponBond
 * DTCAssetType1Code.mmBearerCallableZeroCouponBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmGNMAREMICSecurities
 * DTCAssetType1Code.mmGNMAREMICSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmGNMAPassThroughSecurities
 * DTCAssetType1Code.mmGNMAPassThroughSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmGNMASerialNoteSecurities
 * DTCAssetType1Code.mmGNMASerialNoteSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmCorporateBondCBorGlobalCorpBondGCB
 * DTCAssetType1Code.mmCorporateBondCBorGlobalCorpBondGCB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmMMIBankersAcceptanceNoteBA
 * DTCAssetType1Code.mmMMIBankersAcceptanceNoteBA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmMMIInstitutionalCertificatesofDeposit
 * DTCAssetType1Code.mmMMIInstitutionalCertificatesofDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmCertificatedMoneyMarketInstrument
 * DTCAssetType1Code.mmCertificatedMoneyMarketInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmCertificatedMoneyMarketPeriodicPayer
 * DTCAssetType1Code.mmCertificatedMoneyMarketPeriodicPayer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmCertificatesOfDeposit
 * DTCAssetType1Code.mmCertificatesOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmCPIInterestAtMaturityIAMCommercialPaper
 * DTCAssetType1Code.mmCPIInterestAtMaturityIAMCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmPeriodicPaymentCommercialPaper
 * DTCAssetType1Code.mmPeriodicPaymentCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmCPIDiscountCommercialPaperCP
 * DTCAssetType1Code.mmCPIDiscountCommercialPaperCP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmMMICorporateCommercialPaper
 * DTCAssetType1Code.mmMMICorporateCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmMMICorporateVRDOCP
 * DTCAssetType1Code.mmMMICorporateVRDOCP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmMTNMediumTermNote
 * DTCAssetType1Code.mmMTNMediumTermNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmMMIDepositNote
 * DTCAssetType1Code.mmMMIDepositNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmMMIMediumTermBankNote
 * DTCAssetType1Code.mmMMIMediumTermBankNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmMMIMediumTermNote
 * DTCAssetType1Code.mmMMIMediumTermNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmCollateralizedMtgeObligationorGlobalCMO
 * DTCAssetType1Code.mmCollateralizedMtgeObligationorGlobalCMO}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmAssetBackedSecurityABSorGlobalABSGABS
 * DTCAssetType1Code.mmAssetBackedSecurityABSorGlobalABSGABS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmNonCMOABSAmortizingIssue
 * DTCAssetType1Code.mmNonCMOABSAmortizingIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmMMIShortTermBankNote
 * DTCAssetType1Code.mmMMIShortTermBankNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmZCPNDenominInitialPrincipalAmt
 * DTCAssetType1Code.mmZCPNDenominInitialPrincipalAmt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmMMIDiscountNote
 * DTCAssetType1Code.mmMMIDiscountNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmCorporateAuctionRateNote
 * DTCAssetType1Code.mmCorporateAuctionRateNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmConvertibleCorporateDebt
 * DTCAssetType1Code.mmConvertibleCorporateDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmCorporateVariableModeObligationCVMO
 * DTCAssetType1Code.mmCorporateVariableModeObligationCVMO}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmCorporateShortTermNote
 * DTCAssetType1Code.mmCorporateShortTermNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmCorporateDebenture
 * DTCAssetType1Code.mmCorporateDebenture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmCorporateVRDOMunicipalVRDOMMD
 * DTCAssetType1Code.mmCorporateVRDOMunicipalVRDOMMD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmCorporateInsuredCustodialReceipt
 * DTCAssetType1Code.mmCorporateInsuredCustodialReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmTenderRateNote
 * DTCAssetType1Code.mmTenderRateNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmZeroCouponBond
 * DTCAssetType1Code.mmZeroCouponBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmGovernmentSecurity
 * DTCAssetType1Code.mmGovernmentSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmGovernmentTrustCertificate
 * DTCAssetType1Code.mmGovernmentTrustCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmJunkAndTreasuryGrowthReceiptJGR
 * DTCAssetType1Code.mmJunkAndTreasuryGrowthReceiptJGR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmUSTreasurySecurity
 * DTCAssetType1Code.mmUSTreasurySecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmUSTreasuryBill
 * DTCAssetType1Code.mmUSTreasuryBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmUSTreasuryNote
 * DTCAssetType1Code.mmUSTreasuryNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmUSTreasuryBond
 * DTCAssetType1Code.mmUSTreasuryBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmUSGovernmentAgencySecurity
 * DTCAssetType1Code.mmUSGovernmentAgencySecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmGovernmentNatlMortgageAssociationGNMA
 * DTCAssetType1Code.mmGovernmentNatlMortgageAssociationGNMA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmREMICRealEstateMtgeInvestmentConduit
 * DTCAssetType1Code.mmREMICRealEstateMtgeInvestmentConduit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmGNMASerialNote
 * DTCAssetType1Code.mmGNMASerialNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmPackage
 * DTCAssetType1Code.mmPackage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmCorporateDebtDerivative
 * DTCAssetType1Code.mmCorporateDebtDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmEquityDerivative
 * DTCAssetType1Code.mmEquityDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmMunicipalDerivative
 * DTCAssetType1Code.mmMunicipalDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmMunicipalAmortizedIssue
 * DTCAssetType1Code.mmMunicipalAmortizedIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmOptionDerivative
 * DTCAssetType1Code.mmOptionDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmWarrant
 * DTCAssetType1Code.mmWarrant}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmRight
 * DTCAssetType1Code.mmRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmMutualFund
 * DTCAssetType1Code.mmMutualFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmClosedEndFund
 * DTCAssetType1Code.mmClosedEndFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmIMMIInstitutionalMMIMutualFundShares
 * DTCAssetType1Code.mmIMMIInstitutionalMMIMutualFundShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmEquityUnit
 * DTCAssetType1Code.mmEquityUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmDebtUnit
 * DTCAssetType1Code.mmDebtUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmUnitInvestmentTrustUITNuveenOnly
 * DTCAssetType1Code.mmUnitInvestmentTrustUITNuveenOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmGlobalUnitTrust
 * DTCAssetType1Code.mmGlobalUnitTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmUnitInvestmentTrustUIT
 * DTCAssetType1Code.mmUnitInvestmentTrustUIT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmEquity144aDesignatedInvestors
 * DTCAssetType1Code.mmEquity144aDesignatedInvestors}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmMunicipalOtherTaxExempt
 * DTCAssetType1Code.mmMunicipalOtherTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmCorporateOtherTaxExempt
 * DTCAssetType1Code.mmCorporateOtherTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#mmCorporate144aDesignatedInvestors
 * DTCAssetType1Code.mmCorporate144aDesignatedInvestors}</li>
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
 * "DTCAssetType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "DTC (The Depository Trust Company) security sub-issue type code list."</li>
 * </ul>
 */
public class DTCAssetType1Code extends DTCAssetTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equity"</li>
	 * </ul>
	 */
	public static final MMCode mmEquity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonStock"</li>
	 * </ul>
	 */
	public static final MMCode mmCommonStock = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonStock";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleCommonStock"</li>
	 * </ul>
	 */
	public static final MMCode mmConvertibleCommonStock = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertibleCommonStock";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonStockREIT"</li>
	 * </ul>
	 */
	public static final MMCode mmCommonStockREIT = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonStockREIT";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreferredStock"</li>
	 * </ul>
	 */
	public static final MMCode mmPreferredStock = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreferredStock";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreferredStockREIT"</li>
	 * </ul>
	 */
	public static final MMCode mmPreferredStockREIT = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreferredStockREIT";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertiblePreferredStock"</li>
	 * </ul>
	 */
	public static final MMCode mmConvertiblePreferredStock = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertiblePreferredStock";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderRatePreferredStock"</li>
	 * </ul>
	 */
	public static final MMCode mmTenderRatePreferredStock = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderRatePreferredStock";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedPartnership"</li>
	 * </ul>
	 */
	public static final MMCode mmLimitedPartnership = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitedPartnership";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CMODenominUnitsorUndividedInterest"</li>
	 * </ul>
	 */
	public static final MMCode mmCMODenominUnitsorUndividedInterest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CMODenominUnitsorUndividedInterest";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ABSDenominUnitsorUndividedInterest"</li>
	 * </ul>
	 */
	public static final MMCode mmABSDenominUnitsorUndividedInterest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ABSDenominUnitsorUndividedInterest";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDenominUnitsorUndividedInterest"</li>
	 * </ul>
	 */
	public static final MMCode mmIssueDenominUnitsorUndividedInterest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDenominUnitsorUndividedInterest";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuctionRatePreferredStockARPS"</li>
	 * </ul>
	 */
	public static final MMCode mmAuctionRatePreferredStockARPS = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuctionRatePreferredStockARPS";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmericanDepositaryReceiptADR"</li>
	 * </ul>
	 */
	public static final MMCode mmAmericanDepositaryReceiptADR = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmericanDepositaryReceiptADR";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositaryShare"</li>
	 * </ul>
	 */
	public static final MMCode mmDepositaryShare = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositaryShare";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalOptionCallRight"</li>
	 * </ul>
	 */
	public static final MMCode mmMunicipalOptionCallRight = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalOptionCallRight";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeTradedFunds"</li>
	 * </ul>
	 */
	public static final MMCode mmExchangeTradedFunds = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedFunds";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIPreferredStockinCPlikemode"</li>
	 * </ul>
	 */
	public static final MMCode mmMMIPreferredStockinCPlikemode = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIPreferredStockinCPlikemode";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SealedEnvelope"</li>
	 * </ul>
	 */
	public static final MMCode mmSealedEnvelope = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SealedEnvelope";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyUserCUSIP"</li>
	 * </ul>
	 */
	public static final MMCode mmCustodyUserCUSIP = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyUserCUSIP";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealEstateInvestmentTrustREIT"</li>
	 * </ul>
	 */
	public static final MMCode mmRealEstateInvestmentTrustREIT = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealEstateInvestmentTrustREIT";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalBond"</li>
	 * </ul>
	 */
	public static final MMCode mmMunicipalBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalBond";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalNote"</li>
	 * </ul>
	 */
	public static final MMCode mmMunicipalNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalNote";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalAuctionRateNoteARN"</li>
	 * </ul>
	 */
	public static final MMCode mmMunicipalAuctionRateNoteARN = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalAuctionRateNoteARN";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalVariableModeObligationVMO"</li>
	 * </ul>
	 */
	public static final MMCode mmMunicipalVariableModeObligationVMO = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalVariableModeObligationVMO";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalVariableRateDemandObligationVRDO"</li>
	 * </ul>
	 */
	public static final MMCode mmMunicipalVariableRateDemandObligationVRDO = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalVariableRateDemandObligationVRDO";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalInsuredCustodialReceipt"</li>
	 * </ul>
	 */
	public static final MMCode mmMunicipalInsuredCustodialReceipt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalInsuredCustodialReceipt";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIMunicipalVRDOCP"</li>
	 * </ul>
	 */
	public static final MMCode mmMMIMunicipalVRDOCP = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMunicipalVRDOCP";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIMunicipalCommercialPaper"</li>
	 * </ul>
	 */
	public static final MMCode mmMMIMunicipalCommercialPaper = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMunicipalCommercialPaper";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BearerCallableZeroCouponBond"</li>
	 * </ul>
	 */
	public static final MMCode mmBearerCallableZeroCouponBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BearerCallableZeroCouponBond";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GNMAREMICSecurities"</li>
	 * </ul>
	 */
	public static final MMCode mmGNMAREMICSecurities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMAREMICSecurities";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GNMAPassThroughSecurities"</li>
	 * </ul>
	 */
	public static final MMCode mmGNMAPassThroughSecurities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMAPassThroughSecurities";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GNMASerialNoteSecurities"</li>
	 * </ul>
	 */
	public static final MMCode mmGNMASerialNoteSecurities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMASerialNoteSecurities";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateBondCBorGlobalCorpBondGCB"</li>
	 * </ul>
	 */
	public static final MMCode mmCorporateBondCBorGlobalCorpBondGCB = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateBondCBorGlobalCorpBondGCB";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIBankersAcceptanceNoteBA"</li>
	 * </ul>
	 */
	public static final MMCode mmMMIBankersAcceptanceNoteBA = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIBankersAcceptanceNoteBA";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIInstitutionalCertificatesofDeposit"</li>
	 * </ul>
	 */
	public static final MMCode mmMMIInstitutionalCertificatesofDeposit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIInstitutionalCertificatesofDeposit";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificatedMoneyMarketInstrument"</li>
	 * </ul>
	 */
	public static final MMCode mmCertificatedMoneyMarketInstrument = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificatedMoneyMarketInstrument";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificatedMoneyMarketPeriodicPayer"</li>
	 * </ul>
	 */
	public static final MMCode mmCertificatedMoneyMarketPeriodicPayer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificatedMoneyMarketPeriodicPayer";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificatesOfDeposit"</li>
	 * </ul>
	 */
	public static final MMCode mmCertificatesOfDeposit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificatesOfDeposit";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CPIInterestAtMaturityIAMCommercialPaper"</li>
	 * </ul>
	 */
	public static final MMCode mmCPIInterestAtMaturityIAMCommercialPaper = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CPIInterestAtMaturityIAMCommercialPaper";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeriodicPaymentCommercialPaper"</li>
	 * </ul>
	 */
	public static final MMCode mmPeriodicPaymentCommercialPaper = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodicPaymentCommercialPaper";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CPIDiscountCommercialPaperCP"</li>
	 * </ul>
	 */
	public static final MMCode mmCPIDiscountCommercialPaperCP = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CPIDiscountCommercialPaperCP";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMICorporateCommercialPaper"</li>
	 * </ul>
	 */
	public static final MMCode mmMMICorporateCommercialPaper = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMICorporateCommercialPaper";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMICorporateVRDOCP"</li>
	 * </ul>
	 */
	public static final MMCode mmMMICorporateVRDOCP = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMICorporateVRDOCP";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MTNMediumTermNote"</li>
	 * </ul>
	 */
	public static final MMCode mmMTNMediumTermNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MTNMediumTermNote";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIDepositNote"</li>
	 * </ul>
	 */
	public static final MMCode mmMMIDepositNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIDepositNote";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIMediumTermBankNote"</li>
	 * </ul>
	 */
	public static final MMCode mmMMIMediumTermBankNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMediumTermBankNote";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIMediumTermNote"</li>
	 * </ul>
	 */
	public static final MMCode mmMMIMediumTermNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMediumTermNote";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralizedMtgeObligationorGlobalCMO"</li>
	 * </ul>
	 */
	public static final MMCode mmCollateralizedMtgeObligationorGlobalCMO = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralizedMtgeObligationorGlobalCMO";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetBackedSecurityABSorGlobalABSGABS"</li>
	 * </ul>
	 */
	public static final MMCode mmAssetBackedSecurityABSorGlobalABSGABS = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetBackedSecurityABSorGlobalABSGABS";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonCMOABSAmortizingIssue"</li>
	 * </ul>
	 */
	public static final MMCode mmNonCMOABSAmortizingIssue = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonCMOABSAmortizingIssue";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIShortTermBankNote"</li>
	 * </ul>
	 */
	public static final MMCode mmMMIShortTermBankNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIShortTermBankNote";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZCPNDenominInitialPrincipalAmt"</li>
	 * </ul>
	 */
	public static final MMCode mmZCPNDenominInitialPrincipalAmt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZCPNDenominInitialPrincipalAmt";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIDiscountNote"</li>
	 * </ul>
	 */
	public static final MMCode mmMMIDiscountNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIDiscountNote";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateAuctionRateNote"</li>
	 * </ul>
	 */
	public static final MMCode mmCorporateAuctionRateNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateAuctionRateNote";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleCorporateDebt"</li>
	 * </ul>
	 */
	public static final MMCode mmConvertibleCorporateDebt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertibleCorporateDebt";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateVariableModeObligationCVMO"</li>
	 * </ul>
	 */
	public static final MMCode mmCorporateVariableModeObligationCVMO = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateVariableModeObligationCVMO";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateShortTermNote"</li>
	 * </ul>
	 */
	public static final MMCode mmCorporateShortTermNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateShortTermNote";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateDebenture"</li>
	 * </ul>
	 */
	public static final MMCode mmCorporateDebenture = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateDebenture";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateVRDOMunicipalVRDOMMD"</li>
	 * </ul>
	 */
	public static final MMCode mmCorporateVRDOMunicipalVRDOMMD = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateVRDOMunicipalVRDOMMD";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateInsuredCustodialReceipt"</li>
	 * </ul>
	 */
	public static final MMCode mmCorporateInsuredCustodialReceipt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateInsuredCustodialReceipt";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderRateNote"</li>
	 * </ul>
	 */
	public static final MMCode mmTenderRateNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderRateNote";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZeroCouponBond"</li>
	 * </ul>
	 */
	public static final MMCode mmZeroCouponBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZeroCouponBond";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentSecurity"</li>
	 * </ul>
	 */
	public static final MMCode mmGovernmentSecurity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentSecurity";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentTrustCertificate"</li>
	 * </ul>
	 */
	public static final MMCode mmGovernmentTrustCertificate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentTrustCertificate";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JunkAndTreasuryGrowthReceiptJGR"</li>
	 * </ul>
	 */
	public static final MMCode mmJunkAndTreasuryGrowthReceiptJGR = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JunkAndTreasuryGrowthReceiptJGR";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTreasurySecurity"</li>
	 * </ul>
	 */
	public static final MMCode mmUSTreasurySecurity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasurySecurity";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTreasuryBill"</li>
	 * </ul>
	 */
	public static final MMCode mmUSTreasuryBill = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasuryBill";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTreasuryNote"</li>
	 * </ul>
	 */
	public static final MMCode mmUSTreasuryNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasuryNote";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTreasuryBond"</li>
	 * </ul>
	 */
	public static final MMCode mmUSTreasuryBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasuryBond";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGovernmentAgencySecurity"</li>
	 * </ul>
	 */
	public static final MMCode mmUSGovernmentAgencySecurity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGovernmentAgencySecurity";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentNatlMortgageAssociationGNMA"</li>
	 * </ul>
	 */
	public static final MMCode mmGovernmentNatlMortgageAssociationGNMA = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentNatlMortgageAssociationGNMA";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "REMICRealEstateMtgeInvestmentConduit"</li>
	 * </ul>
	 */
	public static final MMCode mmREMICRealEstateMtgeInvestmentConduit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "REMICRealEstateMtgeInvestmentConduit";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GNMASerialNote"</li>
	 * </ul>
	 */
	public static final MMCode mmGNMASerialNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMASerialNote";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Package"</li>
	 * </ul>
	 */
	public static final MMCode mmPackage = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Package";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateDebtDerivative"</li>
	 * </ul>
	 */
	public static final MMCode mmCorporateDebtDerivative = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateDebtDerivative";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquityDerivative"</li>
	 * </ul>
	 */
	public static final MMCode mmEquityDerivative = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityDerivative";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalDerivative"</li>
	 * </ul>
	 */
	public static final MMCode mmMunicipalDerivative = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalDerivative";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalAmortizedIssue"</li>
	 * </ul>
	 */
	public static final MMCode mmMunicipalAmortizedIssue = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalAmortizedIssue";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionDerivative"</li>
	 * </ul>
	 */
	public static final MMCode mmOptionDerivative = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionDerivative";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Warrant"</li>
	 * </ul>
	 */
	public static final MMCode mmWarrant = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Warrant";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Right"</li>
	 * </ul>
	 */
	public static final MMCode mmRight = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Right";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MutualFund"</li>
	 * </ul>
	 */
	public static final MMCode mmMutualFund = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MutualFund";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedEndFund"</li>
	 * </ul>
	 */
	public static final MMCode mmClosedEndFund = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedEndFund";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IMMIInstitutionalMMIMutualFundShares"</li>
	 * </ul>
	 */
	public static final MMCode mmIMMIInstitutionalMMIMutualFundShares = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IMMIInstitutionalMMIMutualFundShares";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquityUnit"</li>
	 * </ul>
	 */
	public static final MMCode mmEquityUnit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityUnit";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtUnit"</li>
	 * </ul>
	 */
	public static final MMCode mmDebtUnit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtUnit";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitInvestmentTrustUITNuveenOnly"</li>
	 * </ul>
	 */
	public static final MMCode mmUnitInvestmentTrustUITNuveenOnly = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitInvestmentTrustUITNuveenOnly";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalUnitTrust"</li>
	 * </ul>
	 */
	public static final MMCode mmGlobalUnitTrust = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalUnitTrust";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitInvestmentTrustUIT"</li>
	 * </ul>
	 */
	public static final MMCode mmUnitInvestmentTrustUIT = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitInvestmentTrustUIT";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equity144aDesignatedInvestors"</li>
	 * </ul>
	 */
	public static final MMCode mmEquity144aDesignatedInvestors = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity144aDesignatedInvestors";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalOtherTaxExempt"</li>
	 * </ul>
	 */
	public static final MMCode mmMunicipalOtherTaxExempt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalOtherTaxExempt";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateOtherTaxExempt"</li>
	 * </ul>
	 */
	public static final MMCode mmCorporateOtherTaxExempt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateOtherTaxExempt";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Corporate144aDesignatedInvestors"</li>
	 * </ul>
	 */
	public static final MMCode mmCorporate144aDesignatedInvestors = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Corporate144aDesignatedInvestors";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("S005");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCAssetType1Code";
				definition = "DTC (The Depository Trust Company) security sub-issue type code list.";
				code_lazy = () -> Arrays.asList(DTCAssetType1Code.mmEquity, DTCAssetType1Code.mmCommonStock, DTCAssetType1Code.mmConvertibleCommonStock, DTCAssetType1Code.mmCommonStockREIT, DTCAssetType1Code.mmPreferredStock,
						DTCAssetType1Code.mmPreferredStockREIT, DTCAssetType1Code.mmConvertiblePreferredStock, DTCAssetType1Code.mmTenderRatePreferredStock, DTCAssetType1Code.mmLimitedPartnership,
						DTCAssetType1Code.mmCMODenominUnitsorUndividedInterest, DTCAssetType1Code.mmABSDenominUnitsorUndividedInterest, DTCAssetType1Code.mmIssueDenominUnitsorUndividedInterest,
						DTCAssetType1Code.mmAuctionRatePreferredStockARPS, DTCAssetType1Code.mmAmericanDepositaryReceiptADR, DTCAssetType1Code.mmDepositaryShare, DTCAssetType1Code.mmMunicipalOptionCallRight,
						DTCAssetType1Code.mmExchangeTradedFunds, DTCAssetType1Code.mmMMIPreferredStockinCPlikemode, DTCAssetType1Code.mmSealedEnvelope, DTCAssetType1Code.mmCustodyUserCUSIP,
						DTCAssetType1Code.mmRealEstateInvestmentTrustREIT, DTCAssetType1Code.mmMunicipalBond, DTCAssetType1Code.mmMunicipalNote, DTCAssetType1Code.mmMunicipalAuctionRateNoteARN,
						DTCAssetType1Code.mmMunicipalVariableModeObligationVMO, DTCAssetType1Code.mmMunicipalVariableRateDemandObligationVRDO, DTCAssetType1Code.mmMunicipalInsuredCustodialReceipt, DTCAssetType1Code.mmMMIMunicipalVRDOCP,
						DTCAssetType1Code.mmMMIMunicipalCommercialPaper, DTCAssetType1Code.mmBearerCallableZeroCouponBond, DTCAssetType1Code.mmGNMAREMICSecurities, DTCAssetType1Code.mmGNMAPassThroughSecurities,
						DTCAssetType1Code.mmGNMASerialNoteSecurities, DTCAssetType1Code.mmCorporateBondCBorGlobalCorpBondGCB, DTCAssetType1Code.mmMMIBankersAcceptanceNoteBA, DTCAssetType1Code.mmMMIInstitutionalCertificatesofDeposit,
						DTCAssetType1Code.mmCertificatedMoneyMarketInstrument, DTCAssetType1Code.mmCertificatedMoneyMarketPeriodicPayer, DTCAssetType1Code.mmCertificatesOfDeposit,
						DTCAssetType1Code.mmCPIInterestAtMaturityIAMCommercialPaper, DTCAssetType1Code.mmPeriodicPaymentCommercialPaper, DTCAssetType1Code.mmCPIDiscountCommercialPaperCP, DTCAssetType1Code.mmMMICorporateCommercialPaper,
						DTCAssetType1Code.mmMMICorporateVRDOCP, DTCAssetType1Code.mmMTNMediumTermNote, DTCAssetType1Code.mmMMIDepositNote, DTCAssetType1Code.mmMMIMediumTermBankNote, DTCAssetType1Code.mmMMIMediumTermNote,
						DTCAssetType1Code.mmCollateralizedMtgeObligationorGlobalCMO, DTCAssetType1Code.mmAssetBackedSecurityABSorGlobalABSGABS, DTCAssetType1Code.mmNonCMOABSAmortizingIssue, DTCAssetType1Code.mmMMIShortTermBankNote,
						DTCAssetType1Code.mmZCPNDenominInitialPrincipalAmt, DTCAssetType1Code.mmMMIDiscountNote, DTCAssetType1Code.mmCorporateAuctionRateNote, DTCAssetType1Code.mmConvertibleCorporateDebt,
						DTCAssetType1Code.mmCorporateVariableModeObligationCVMO, DTCAssetType1Code.mmCorporateShortTermNote, DTCAssetType1Code.mmCorporateDebenture, DTCAssetType1Code.mmCorporateVRDOMunicipalVRDOMMD,
						DTCAssetType1Code.mmCorporateInsuredCustodialReceipt, DTCAssetType1Code.mmTenderRateNote, DTCAssetType1Code.mmZeroCouponBond, DTCAssetType1Code.mmGovernmentSecurity, DTCAssetType1Code.mmGovernmentTrustCertificate,
						DTCAssetType1Code.mmJunkAndTreasuryGrowthReceiptJGR, DTCAssetType1Code.mmUSTreasurySecurity, DTCAssetType1Code.mmUSTreasuryBill, DTCAssetType1Code.mmUSTreasuryNote, DTCAssetType1Code.mmUSTreasuryBond,
						DTCAssetType1Code.mmUSGovernmentAgencySecurity, DTCAssetType1Code.mmGovernmentNatlMortgageAssociationGNMA, DTCAssetType1Code.mmREMICRealEstateMtgeInvestmentConduit, DTCAssetType1Code.mmGNMASerialNote,
						DTCAssetType1Code.mmPackage, DTCAssetType1Code.mmCorporateDebtDerivative, DTCAssetType1Code.mmEquityDerivative, DTCAssetType1Code.mmMunicipalDerivative, DTCAssetType1Code.mmMunicipalAmortizedIssue,
						DTCAssetType1Code.mmOptionDerivative, DTCAssetType1Code.mmWarrant, DTCAssetType1Code.mmRight, DTCAssetType1Code.mmMutualFund, DTCAssetType1Code.mmClosedEndFund,
						DTCAssetType1Code.mmIMMIInstitutionalMMIMutualFundShares, DTCAssetType1Code.mmEquityUnit, DTCAssetType1Code.mmDebtUnit, DTCAssetType1Code.mmUnitInvestmentTrustUITNuveenOnly, DTCAssetType1Code.mmGlobalUnitTrust,
						DTCAssetType1Code.mmUnitInvestmentTrustUIT, DTCAssetType1Code.mmEquity144aDesignatedInvestors, DTCAssetType1Code.mmMunicipalOtherTaxExempt, DTCAssetType1Code.mmCorporateOtherTaxExempt,
						DTCAssetType1Code.mmCorporate144aDesignatedInvestors);
				trace_lazy = () -> DTCAssetTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}