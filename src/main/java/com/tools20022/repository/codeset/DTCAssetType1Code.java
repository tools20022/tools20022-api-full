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
import com.tools20022.repository.codeset.DTCAssetTypeCode;
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
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#Equity
 * DTCAssetType1Code.Equity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#CommonStock
 * DTCAssetType1Code.CommonStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#ConvertibleCommonStock
 * DTCAssetType1Code.ConvertibleCommonStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#CommonStockREIT
 * DTCAssetType1Code.CommonStockREIT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#PreferredStock
 * DTCAssetType1Code.PreferredStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#PreferredStockREIT
 * DTCAssetType1Code.PreferredStockREIT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#ConvertiblePreferredStock
 * DTCAssetType1Code.ConvertiblePreferredStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#TenderRatePreferredStock
 * DTCAssetType1Code.TenderRatePreferredStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#LimitedPartnership
 * DTCAssetType1Code.LimitedPartnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#CMODenominUnitsorUndividedInterest
 * DTCAssetType1Code.CMODenominUnitsorUndividedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#ABSDenominUnitsorUndividedInterest
 * DTCAssetType1Code.ABSDenominUnitsorUndividedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#IssueDenominUnitsorUndividedInterest
 * DTCAssetType1Code.IssueDenominUnitsorUndividedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#AuctionRatePreferredStockARPS
 * DTCAssetType1Code.AuctionRatePreferredStockARPS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#AmericanDepositaryReceiptADR
 * DTCAssetType1Code.AmericanDepositaryReceiptADR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#DepositaryShare
 * DTCAssetType1Code.DepositaryShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#MunicipalOptionCallRight
 * DTCAssetType1Code.MunicipalOptionCallRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#ExchangeTradedFunds
 * DTCAssetType1Code.ExchangeTradedFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#MMIPreferredStockinCPlikemode
 * DTCAssetType1Code.MMIPreferredStockinCPlikemode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#SealedEnvelope
 * DTCAssetType1Code.SealedEnvelope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#CustodyUserCUSIP
 * DTCAssetType1Code.CustodyUserCUSIP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#RealEstateInvestmentTrustREIT
 * DTCAssetType1Code.RealEstateInvestmentTrustREIT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#MunicipalBond
 * DTCAssetType1Code.MunicipalBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#MunicipalNote
 * DTCAssetType1Code.MunicipalNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#MunicipalAuctionRateNoteARN
 * DTCAssetType1Code.MunicipalAuctionRateNoteARN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#MunicipalVariableModeObligationVMO
 * DTCAssetType1Code.MunicipalVariableModeObligationVMO}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#MunicipalVariableRateDemandObligationVRDO
 * DTCAssetType1Code.MunicipalVariableRateDemandObligationVRDO}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#MunicipalInsuredCustodialReceipt
 * DTCAssetType1Code.MunicipalInsuredCustodialReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#MMIMunicipalVRDOCP
 * DTCAssetType1Code.MMIMunicipalVRDOCP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#MMIMunicipalCommercialPaper
 * DTCAssetType1Code.MMIMunicipalCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#BearerCallableZeroCouponBond
 * DTCAssetType1Code.BearerCallableZeroCouponBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#GNMAREMICSecurities
 * DTCAssetType1Code.GNMAREMICSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#GNMAPassThroughSecurities
 * DTCAssetType1Code.GNMAPassThroughSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#GNMASerialNoteSecurities
 * DTCAssetType1Code.GNMASerialNoteSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#CorporateBondCBorGlobalCorpBondGCB
 * DTCAssetType1Code.CorporateBondCBorGlobalCorpBondGCB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#MMIBankersAcceptanceNoteBA
 * DTCAssetType1Code.MMIBankersAcceptanceNoteBA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#MMIInstitutionalCertificatesofDeposit
 * DTCAssetType1Code.MMIInstitutionalCertificatesofDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#CertificatedMoneyMarketInstrument
 * DTCAssetType1Code.CertificatedMoneyMarketInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#CertificatedMoneyMarketPeriodicPayer
 * DTCAssetType1Code.CertificatedMoneyMarketPeriodicPayer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#CertificatesOfDeposit
 * DTCAssetType1Code.CertificatesOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#CPIInterestAtMaturityIAMCommercialPaper
 * DTCAssetType1Code.CPIInterestAtMaturityIAMCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#PeriodicPaymentCommercialPaper
 * DTCAssetType1Code.PeriodicPaymentCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#CPIDiscountCommercialPaperCP
 * DTCAssetType1Code.CPIDiscountCommercialPaperCP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#MMICorporateCommercialPaper
 * DTCAssetType1Code.MMICorporateCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#MMICorporateVRDOCP
 * DTCAssetType1Code.MMICorporateVRDOCP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#MTNMediumTermNote
 * DTCAssetType1Code.MTNMediumTermNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#MMIDepositNote
 * DTCAssetType1Code.MMIDepositNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#MMIMediumTermBankNote
 * DTCAssetType1Code.MMIMediumTermBankNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#MMIMediumTermNote
 * DTCAssetType1Code.MMIMediumTermNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#CollateralizedMtgeObligationorGlobalCMO
 * DTCAssetType1Code.CollateralizedMtgeObligationorGlobalCMO}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#AssetBackedSecurityABSorGlobalABSGABS
 * DTCAssetType1Code.AssetBackedSecurityABSorGlobalABSGABS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#NonCMOABSAmortizingIssue
 * DTCAssetType1Code.NonCMOABSAmortizingIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#MMIShortTermBankNote
 * DTCAssetType1Code.MMIShortTermBankNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#ZCPNDenominInitialPrincipalAmt
 * DTCAssetType1Code.ZCPNDenominInitialPrincipalAmt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#MMIDiscountNote
 * DTCAssetType1Code.MMIDiscountNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#CorporateAuctionRateNote
 * DTCAssetType1Code.CorporateAuctionRateNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#ConvertibleCorporateDebt
 * DTCAssetType1Code.ConvertibleCorporateDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#CorporateVariableModeObligationCVMO
 * DTCAssetType1Code.CorporateVariableModeObligationCVMO}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#CorporateShortTermNote
 * DTCAssetType1Code.CorporateShortTermNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#CorporateDebenture
 * DTCAssetType1Code.CorporateDebenture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#CorporateVRDOMunicipalVRDOMMD
 * DTCAssetType1Code.CorporateVRDOMunicipalVRDOMMD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#CorporateInsuredCustodialReceipt
 * DTCAssetType1Code.CorporateInsuredCustodialReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#TenderRateNote
 * DTCAssetType1Code.TenderRateNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#ZeroCouponBond
 * DTCAssetType1Code.ZeroCouponBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#GovernmentSecurity
 * DTCAssetType1Code.GovernmentSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#GovernmentTrustCertificate
 * DTCAssetType1Code.GovernmentTrustCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#JunkAndTreasuryGrowthReceiptJGR
 * DTCAssetType1Code.JunkAndTreasuryGrowthReceiptJGR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#USTreasurySecurity
 * DTCAssetType1Code.USTreasurySecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#USTreasuryBill
 * DTCAssetType1Code.USTreasuryBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#USTreasuryNote
 * DTCAssetType1Code.USTreasuryNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#USTreasuryBond
 * DTCAssetType1Code.USTreasuryBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#USGovernmentAgencySecurity
 * DTCAssetType1Code.USGovernmentAgencySecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#GovernmentNatlMortgageAssociationGNMA
 * DTCAssetType1Code.GovernmentNatlMortgageAssociationGNMA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#REMICRealEstateMtgeInvestmentConduit
 * DTCAssetType1Code.REMICRealEstateMtgeInvestmentConduit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#GNMASerialNote
 * DTCAssetType1Code.GNMASerialNote}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#Package
 * DTCAssetType1Code.Package}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#CorporateDebtDerivative
 * DTCAssetType1Code.CorporateDebtDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#EquityDerivative
 * DTCAssetType1Code.EquityDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#MunicipalDerivative
 * DTCAssetType1Code.MunicipalDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#MunicipalAmortizedIssue
 * DTCAssetType1Code.MunicipalAmortizedIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#OptionDerivative
 * DTCAssetType1Code.OptionDerivative}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#Warrant
 * DTCAssetType1Code.Warrant}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#Right
 * DTCAssetType1Code.Right}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#MutualFund
 * DTCAssetType1Code.MutualFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#ClosedEndFund
 * DTCAssetType1Code.ClosedEndFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#IMMIInstitutionalMMIMutualFundShares
 * DTCAssetType1Code.IMMIInstitutionalMMIMutualFundShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#EquityUnit
 * DTCAssetType1Code.EquityUnit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#DebtUnit
 * DTCAssetType1Code.DebtUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#UnitInvestmentTrustUITNuveenOnly
 * DTCAssetType1Code.UnitInvestmentTrustUITNuveenOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#GlobalUnitTrust
 * DTCAssetType1Code.GlobalUnitTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#UnitInvestmentTrustUIT
 * DTCAssetType1Code.UnitInvestmentTrustUIT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#Equity144aDesignatedInvestors
 * DTCAssetType1Code.Equity144aDesignatedInvestors}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#MunicipalOtherTaxExempt
 * DTCAssetType1Code.MunicipalOtherTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#CorporateOtherTaxExempt
 * DTCAssetType1Code.CorporateOtherTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code#Corporate144aDesignatedInvestors
 * DTCAssetType1Code.Corporate144aDesignatedInvestors}</li>
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
	public static final MMCode Equity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode CommonStock = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode ConvertibleCommonStock = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode CommonStockREIT = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode PreferredStock = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode PreferredStockREIT = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode ConvertiblePreferredStock = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode TenderRatePreferredStock = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode LimitedPartnership = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode CMODenominUnitsorUndividedInterest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode ABSDenominUnitsorUndividedInterest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode IssueDenominUnitsorUndividedInterest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode AuctionRatePreferredStockARPS = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode AmericanDepositaryReceiptADR = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode DepositaryShare = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MunicipalOptionCallRight = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode ExchangeTradedFunds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MMIPreferredStockinCPlikemode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode SealedEnvelope = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode CustodyUserCUSIP = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode RealEstateInvestmentTrustREIT = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MunicipalBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MunicipalNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MunicipalAuctionRateNoteARN = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MunicipalVariableModeObligationVMO = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MunicipalVariableRateDemandObligationVRDO = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MunicipalInsuredCustodialReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MMIMunicipalVRDOCP = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MMIMunicipalCommercialPaper = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode BearerCallableZeroCouponBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode GNMAREMICSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode GNMAPassThroughSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode GNMASerialNoteSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode CorporateBondCBorGlobalCorpBondGCB = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MMIBankersAcceptanceNoteBA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MMIInstitutionalCertificatesofDeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode CertificatedMoneyMarketInstrument = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode CertificatedMoneyMarketPeriodicPayer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode CertificatesOfDeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode CPIInterestAtMaturityIAMCommercialPaper = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode PeriodicPaymentCommercialPaper = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode CPIDiscountCommercialPaperCP = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MMICorporateCommercialPaper = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MMICorporateVRDOCP = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MTNMediumTermNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MMIDepositNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MMIMediumTermBankNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MMIMediumTermNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode CollateralizedMtgeObligationorGlobalCMO = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode AssetBackedSecurityABSorGlobalABSGABS = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode NonCMOABSAmortizingIssue = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MMIShortTermBankNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode ZCPNDenominInitialPrincipalAmt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MMIDiscountNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode CorporateAuctionRateNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode ConvertibleCorporateDebt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode CorporateVariableModeObligationCVMO = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode CorporateShortTermNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode CorporateDebenture = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode CorporateVRDOMunicipalVRDOMMD = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode CorporateInsuredCustodialReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode TenderRateNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode ZeroCouponBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode GovernmentSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode GovernmentTrustCertificate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode JunkAndTreasuryGrowthReceiptJGR = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode USTreasurySecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode USTreasuryBill = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode USTreasuryNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode USTreasuryBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode USGovernmentAgencySecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode GovernmentNatlMortgageAssociationGNMA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode REMICRealEstateMtgeInvestmentConduit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode GNMASerialNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode Package = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode CorporateDebtDerivative = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode EquityDerivative = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MunicipalDerivative = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MunicipalAmortizedIssue = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode OptionDerivative = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode Warrant = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode Right = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MutualFund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode ClosedEndFund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode IMMIInstitutionalMMIMutualFundShares = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode EquityUnit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode DebtUnit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnitInvestmentTrustUITNuveenOnly = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode GlobalUnitTrust = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnitInvestmentTrustUIT = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode Equity144aDesignatedInvestors = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MunicipalOtherTaxExempt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode CorporateOtherTaxExempt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode Corporate144aDesignatedInvestors = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Corporate144aDesignatedInvestors";
			owner_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("S005");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DTCAssetType1Code";
				definition = "DTC (The Depository Trust Company) security sub-issue type code list.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCAssetType1Code.Equity, com.tools20022.repository.codeset.DTCAssetType1Code.CommonStock,
						com.tools20022.repository.codeset.DTCAssetType1Code.ConvertibleCommonStock, com.tools20022.repository.codeset.DTCAssetType1Code.CommonStockREIT, com.tools20022.repository.codeset.DTCAssetType1Code.PreferredStock,
						com.tools20022.repository.codeset.DTCAssetType1Code.PreferredStockREIT, com.tools20022.repository.codeset.DTCAssetType1Code.ConvertiblePreferredStock,
						com.tools20022.repository.codeset.DTCAssetType1Code.TenderRatePreferredStock, com.tools20022.repository.codeset.DTCAssetType1Code.LimitedPartnership,
						com.tools20022.repository.codeset.DTCAssetType1Code.CMODenominUnitsorUndividedInterest, com.tools20022.repository.codeset.DTCAssetType1Code.ABSDenominUnitsorUndividedInterest,
						com.tools20022.repository.codeset.DTCAssetType1Code.IssueDenominUnitsorUndividedInterest, com.tools20022.repository.codeset.DTCAssetType1Code.AuctionRatePreferredStockARPS,
						com.tools20022.repository.codeset.DTCAssetType1Code.AmericanDepositaryReceiptADR, com.tools20022.repository.codeset.DTCAssetType1Code.DepositaryShare,
						com.tools20022.repository.codeset.DTCAssetType1Code.MunicipalOptionCallRight, com.tools20022.repository.codeset.DTCAssetType1Code.ExchangeTradedFunds,
						com.tools20022.repository.codeset.DTCAssetType1Code.MMIPreferredStockinCPlikemode, com.tools20022.repository.codeset.DTCAssetType1Code.SealedEnvelope,
						com.tools20022.repository.codeset.DTCAssetType1Code.CustodyUserCUSIP, com.tools20022.repository.codeset.DTCAssetType1Code.RealEstateInvestmentTrustREIT,
						com.tools20022.repository.codeset.DTCAssetType1Code.MunicipalBond, com.tools20022.repository.codeset.DTCAssetType1Code.MunicipalNote, com.tools20022.repository.codeset.DTCAssetType1Code.MunicipalAuctionRateNoteARN,
						com.tools20022.repository.codeset.DTCAssetType1Code.MunicipalVariableModeObligationVMO, com.tools20022.repository.codeset.DTCAssetType1Code.MunicipalVariableRateDemandObligationVRDO,
						com.tools20022.repository.codeset.DTCAssetType1Code.MunicipalInsuredCustodialReceipt, com.tools20022.repository.codeset.DTCAssetType1Code.MMIMunicipalVRDOCP,
						com.tools20022.repository.codeset.DTCAssetType1Code.MMIMunicipalCommercialPaper, com.tools20022.repository.codeset.DTCAssetType1Code.BearerCallableZeroCouponBond,
						com.tools20022.repository.codeset.DTCAssetType1Code.GNMAREMICSecurities, com.tools20022.repository.codeset.DTCAssetType1Code.GNMAPassThroughSecurities,
						com.tools20022.repository.codeset.DTCAssetType1Code.GNMASerialNoteSecurities, com.tools20022.repository.codeset.DTCAssetType1Code.CorporateBondCBorGlobalCorpBondGCB,
						com.tools20022.repository.codeset.DTCAssetType1Code.MMIBankersAcceptanceNoteBA, com.tools20022.repository.codeset.DTCAssetType1Code.MMIInstitutionalCertificatesofDeposit,
						com.tools20022.repository.codeset.DTCAssetType1Code.CertificatedMoneyMarketInstrument, com.tools20022.repository.codeset.DTCAssetType1Code.CertificatedMoneyMarketPeriodicPayer,
						com.tools20022.repository.codeset.DTCAssetType1Code.CertificatesOfDeposit, com.tools20022.repository.codeset.DTCAssetType1Code.CPIInterestAtMaturityIAMCommercialPaper,
						com.tools20022.repository.codeset.DTCAssetType1Code.PeriodicPaymentCommercialPaper, com.tools20022.repository.codeset.DTCAssetType1Code.CPIDiscountCommercialPaperCP,
						com.tools20022.repository.codeset.DTCAssetType1Code.MMICorporateCommercialPaper, com.tools20022.repository.codeset.DTCAssetType1Code.MMICorporateVRDOCP,
						com.tools20022.repository.codeset.DTCAssetType1Code.MTNMediumTermNote, com.tools20022.repository.codeset.DTCAssetType1Code.MMIDepositNote, com.tools20022.repository.codeset.DTCAssetType1Code.MMIMediumTermBankNote,
						com.tools20022.repository.codeset.DTCAssetType1Code.MMIMediumTermNote, com.tools20022.repository.codeset.DTCAssetType1Code.CollateralizedMtgeObligationorGlobalCMO,
						com.tools20022.repository.codeset.DTCAssetType1Code.AssetBackedSecurityABSorGlobalABSGABS, com.tools20022.repository.codeset.DTCAssetType1Code.NonCMOABSAmortizingIssue,
						com.tools20022.repository.codeset.DTCAssetType1Code.MMIShortTermBankNote, com.tools20022.repository.codeset.DTCAssetType1Code.ZCPNDenominInitialPrincipalAmt,
						com.tools20022.repository.codeset.DTCAssetType1Code.MMIDiscountNote, com.tools20022.repository.codeset.DTCAssetType1Code.CorporateAuctionRateNote,
						com.tools20022.repository.codeset.DTCAssetType1Code.ConvertibleCorporateDebt, com.tools20022.repository.codeset.DTCAssetType1Code.CorporateVariableModeObligationCVMO,
						com.tools20022.repository.codeset.DTCAssetType1Code.CorporateShortTermNote, com.tools20022.repository.codeset.DTCAssetType1Code.CorporateDebenture,
						com.tools20022.repository.codeset.DTCAssetType1Code.CorporateVRDOMunicipalVRDOMMD, com.tools20022.repository.codeset.DTCAssetType1Code.CorporateInsuredCustodialReceipt,
						com.tools20022.repository.codeset.DTCAssetType1Code.TenderRateNote, com.tools20022.repository.codeset.DTCAssetType1Code.ZeroCouponBond, com.tools20022.repository.codeset.DTCAssetType1Code.GovernmentSecurity,
						com.tools20022.repository.codeset.DTCAssetType1Code.GovernmentTrustCertificate, com.tools20022.repository.codeset.DTCAssetType1Code.JunkAndTreasuryGrowthReceiptJGR,
						com.tools20022.repository.codeset.DTCAssetType1Code.USTreasurySecurity, com.tools20022.repository.codeset.DTCAssetType1Code.USTreasuryBill, com.tools20022.repository.codeset.DTCAssetType1Code.USTreasuryNote,
						com.tools20022.repository.codeset.DTCAssetType1Code.USTreasuryBond, com.tools20022.repository.codeset.DTCAssetType1Code.USGovernmentAgencySecurity,
						com.tools20022.repository.codeset.DTCAssetType1Code.GovernmentNatlMortgageAssociationGNMA, com.tools20022.repository.codeset.DTCAssetType1Code.REMICRealEstateMtgeInvestmentConduit,
						com.tools20022.repository.codeset.DTCAssetType1Code.GNMASerialNote, com.tools20022.repository.codeset.DTCAssetType1Code.Package, com.tools20022.repository.codeset.DTCAssetType1Code.CorporateDebtDerivative,
						com.tools20022.repository.codeset.DTCAssetType1Code.EquityDerivative, com.tools20022.repository.codeset.DTCAssetType1Code.MunicipalDerivative,
						com.tools20022.repository.codeset.DTCAssetType1Code.MunicipalAmortizedIssue, com.tools20022.repository.codeset.DTCAssetType1Code.OptionDerivative, com.tools20022.repository.codeset.DTCAssetType1Code.Warrant,
						com.tools20022.repository.codeset.DTCAssetType1Code.Right, com.tools20022.repository.codeset.DTCAssetType1Code.MutualFund, com.tools20022.repository.codeset.DTCAssetType1Code.ClosedEndFund,
						com.tools20022.repository.codeset.DTCAssetType1Code.IMMIInstitutionalMMIMutualFundShares, com.tools20022.repository.codeset.DTCAssetType1Code.EquityUnit, com.tools20022.repository.codeset.DTCAssetType1Code.DebtUnit,
						com.tools20022.repository.codeset.DTCAssetType1Code.UnitInvestmentTrustUITNuveenOnly, com.tools20022.repository.codeset.DTCAssetType1Code.GlobalUnitTrust,
						com.tools20022.repository.codeset.DTCAssetType1Code.UnitInvestmentTrustUIT, com.tools20022.repository.codeset.DTCAssetType1Code.Equity144aDesignatedInvestors,
						com.tools20022.repository.codeset.DTCAssetType1Code.MunicipalOtherTaxExempt, com.tools20022.repository.codeset.DTCAssetType1Code.CorporateOtherTaxExempt,
						com.tools20022.repository.codeset.DTCAssetType1Code.Corporate144aDesignatedInvestors);
				trace_lazy = () -> DTCAssetTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}