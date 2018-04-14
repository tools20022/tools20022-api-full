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
import com.tools20022.repository.codeset.DTCAssetType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * DTC (The Depository Trust Company) security sub-issue type code list.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
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
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCAssetTypeCode
 * DTCAssetTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCAssetType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "DTC (The Depository Trust Company) security sub-issue type code list."</li>
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
public class DTCAssetType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code Equity = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.Equity.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code CommonStock = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonStock";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.CommonStock.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleCommonStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code ConvertibleCommonStock = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertibleCommonStock";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.ConvertibleCommonStock.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonStockREIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code CommonStockREIT = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonStockREIT";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.CommonStockREIT.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreferredStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code PreferredStock = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreferredStock";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.PreferredStock.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreferredStockREIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code PreferredStockREIT = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreferredStockREIT";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.PreferredStockREIT.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertiblePreferredStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code ConvertiblePreferredStock = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertiblePreferredStock";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.ConvertiblePreferredStock.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderRatePreferredStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code TenderRatePreferredStock = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderRatePreferredStock";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.TenderRatePreferredStock.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedPartnership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code LimitedPartnership = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitedPartnership";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.LimitedPartnership.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CMODenominUnitsorUndividedInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code CMODenominUnitsorUndividedInterest = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CMODenominUnitsorUndividedInterest";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.CMODenominUnitsorUndividedInterest.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ABSDenominUnitsorUndividedInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code ABSDenominUnitsorUndividedInterest = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ABSDenominUnitsorUndividedInterest";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.ABSDenominUnitsorUndividedInterest.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDenominUnitsorUndividedInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code IssueDenominUnitsorUndividedInterest = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDenominUnitsorUndividedInterest";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.IssueDenominUnitsorUndividedInterest.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuctionRatePreferredStockARPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code AuctionRatePreferredStockARPS = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuctionRatePreferredStockARPS";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.AuctionRatePreferredStockARPS.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmericanDepositaryReceiptADR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code AmericanDepositaryReceiptADR = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmericanDepositaryReceiptADR";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.AmericanDepositaryReceiptADR.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositaryShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code DepositaryShare = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositaryShare";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.DepositaryShare.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalOptionCallRight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code MunicipalOptionCallRight = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalOptionCallRight";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.MunicipalOptionCallRight.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeTradedFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code ExchangeTradedFunds = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedFunds";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.ExchangeTradedFunds.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIPreferredStockinCPlikemode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code MMIPreferredStockinCPlikemode = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIPreferredStockinCPlikemode";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.MMIPreferredStockinCPlikemode.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SealedEnvelope"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code SealedEnvelope = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SealedEnvelope";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.SealedEnvelope.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyUserCUSIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code CustodyUserCUSIP = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyUserCUSIP";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.CustodyUserCUSIP.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealEstateInvestmentTrustREIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code RealEstateInvestmentTrustREIT = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealEstateInvestmentTrustREIT";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.RealEstateInvestmentTrustREIT.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code MunicipalBond = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalBond";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.MunicipalBond.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code MunicipalNote = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.MunicipalNote.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalAuctionRateNoteARN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code MunicipalAuctionRateNoteARN = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalAuctionRateNoteARN";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.MunicipalAuctionRateNoteARN.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalVariableModeObligationVMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code MunicipalVariableModeObligationVMO = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalVariableModeObligationVMO";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.MunicipalVariableModeObligationVMO.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalVariableRateDemandObligationVRDO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code MunicipalVariableRateDemandObligationVRDO = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalVariableRateDemandObligationVRDO";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.MunicipalVariableRateDemandObligationVRDO.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalInsuredCustodialReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code MunicipalInsuredCustodialReceipt = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalInsuredCustodialReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.MunicipalInsuredCustodialReceipt.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIMunicipalVRDOCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code MMIMunicipalVRDOCP = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMunicipalVRDOCP";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.MMIMunicipalVRDOCP.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIMunicipalCommercialPaper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code MMIMunicipalCommercialPaper = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMunicipalCommercialPaper";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.MMIMunicipalCommercialPaper.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BearerCallableZeroCouponBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code BearerCallableZeroCouponBond = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BearerCallableZeroCouponBond";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.BearerCallableZeroCouponBond.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GNMAREMICSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code GNMAREMICSecurities = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMAREMICSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.GNMAREMICSecurities.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GNMAPassThroughSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code GNMAPassThroughSecurities = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMAPassThroughSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.GNMAPassThroughSecurities.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GNMASerialNoteSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code GNMASerialNoteSecurities = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMASerialNoteSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.GNMASerialNoteSecurities.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateBondCBorGlobalCorpBondGCB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code CorporateBondCBorGlobalCorpBondGCB = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateBondCBorGlobalCorpBondGCB";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.CorporateBondCBorGlobalCorpBondGCB.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIBankersAcceptanceNoteBA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code MMIBankersAcceptanceNoteBA = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIBankersAcceptanceNoteBA";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.MMIBankersAcceptanceNoteBA.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIInstitutionalCertificatesofDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code MMIInstitutionalCertificatesofDeposit = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIInstitutionalCertificatesofDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.MMIInstitutionalCertificatesofDeposit.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificatedMoneyMarketInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code CertificatedMoneyMarketInstrument = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificatedMoneyMarketInstrument";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.CertificatedMoneyMarketInstrument.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificatedMoneyMarketPeriodicPayer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code CertificatedMoneyMarketPeriodicPayer = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificatedMoneyMarketPeriodicPayer";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.CertificatedMoneyMarketPeriodicPayer.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificatesOfDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code CertificatesOfDeposit = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificatesOfDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.CertificatesOfDeposit.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CPIInterestAtMaturityIAMCommercialPaper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code CPIInterestAtMaturityIAMCommercialPaper = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CPIInterestAtMaturityIAMCommercialPaper";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.CPIInterestAtMaturityIAMCommercialPaper.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeriodicPaymentCommercialPaper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code PeriodicPaymentCommercialPaper = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodicPaymentCommercialPaper";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.PeriodicPaymentCommercialPaper.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CPIDiscountCommercialPaperCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code CPIDiscountCommercialPaperCP = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CPIDiscountCommercialPaperCP";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.CPIDiscountCommercialPaperCP.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMICorporateCommercialPaper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code MMICorporateCommercialPaper = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMICorporateCommercialPaper";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.MMICorporateCommercialPaper.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMICorporateVRDOCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code MMICorporateVRDOCP = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMICorporateVRDOCP";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.MMICorporateVRDOCP.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MTNMediumTermNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code MTNMediumTermNote = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MTNMediumTermNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.MTNMediumTermNote.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIDepositNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code MMIDepositNote = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIDepositNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.MMIDepositNote.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIMediumTermBankNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code MMIMediumTermBankNote = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMediumTermBankNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.MMIMediumTermBankNote.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIMediumTermNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code MMIMediumTermNote = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIMediumTermNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.MMIMediumTermNote.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralizedMtgeObligationorGlobalCMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code CollateralizedMtgeObligationorGlobalCMO = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralizedMtgeObligationorGlobalCMO";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.CollateralizedMtgeObligationorGlobalCMO.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetBackedSecurityABSorGlobalABSGABS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code AssetBackedSecurityABSorGlobalABSGABS = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetBackedSecurityABSorGlobalABSGABS";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.AssetBackedSecurityABSorGlobalABSGABS.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonCMOABSAmortizingIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code NonCMOABSAmortizingIssue = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonCMOABSAmortizingIssue";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.NonCMOABSAmortizingIssue.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIShortTermBankNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code MMIShortTermBankNote = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIShortTermBankNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.MMIShortTermBankNote.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZCPNDenominInitialPrincipalAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code ZCPNDenominInitialPrincipalAmt = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZCPNDenominInitialPrincipalAmt";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.ZCPNDenominInitialPrincipalAmt.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MMIDiscountNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code MMIDiscountNote = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MMIDiscountNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.MMIDiscountNote.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateAuctionRateNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code CorporateAuctionRateNote = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateAuctionRateNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.CorporateAuctionRateNote.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleCorporateDebt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code ConvertibleCorporateDebt = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertibleCorporateDebt";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.ConvertibleCorporateDebt.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateVariableModeObligationCVMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code CorporateVariableModeObligationCVMO = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateVariableModeObligationCVMO";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.CorporateVariableModeObligationCVMO.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateShortTermNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code CorporateShortTermNote = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateShortTermNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.CorporateShortTermNote.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateDebenture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code CorporateDebenture = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateDebenture";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.CorporateDebenture.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateVRDOMunicipalVRDOMMD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code CorporateVRDOMunicipalVRDOMMD = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateVRDOMunicipalVRDOMMD";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.CorporateVRDOMunicipalVRDOMMD.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateInsuredCustodialReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code CorporateInsuredCustodialReceipt = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateInsuredCustodialReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.CorporateInsuredCustodialReceipt.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderRateNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code TenderRateNote = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderRateNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.TenderRateNote.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZeroCouponBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code ZeroCouponBond = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZeroCouponBond";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.ZeroCouponBond.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code GovernmentSecurity = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.GovernmentSecurity.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentTrustCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code GovernmentTrustCertificate = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentTrustCertificate";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.GovernmentTrustCertificate.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JunkAndTreasuryGrowthReceiptJGR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code JunkAndTreasuryGrowthReceiptJGR = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JunkAndTreasuryGrowthReceiptJGR";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.JunkAndTreasuryGrowthReceiptJGR.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTreasurySecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code USTreasurySecurity = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasurySecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.USTreasurySecurity.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTreasuryBill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code USTreasuryBill = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasuryBill";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.USTreasuryBill.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTreasuryNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code USTreasuryNote = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasuryNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.USTreasuryNote.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTreasuryBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code USTreasuryBond = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTreasuryBond";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.USTreasuryBond.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGovernmentAgencySecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code USGovernmentAgencySecurity = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGovernmentAgencySecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.USGovernmentAgencySecurity.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentNatlMortgageAssociationGNMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code GovernmentNatlMortgageAssociationGNMA = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentNatlMortgageAssociationGNMA";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.GovernmentNatlMortgageAssociationGNMA.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "REMICRealEstateMtgeInvestmentConduit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code REMICRealEstateMtgeInvestmentConduit = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "REMICRealEstateMtgeInvestmentConduit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.REMICRealEstateMtgeInvestmentConduit.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GNMASerialNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code GNMASerialNote = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GNMASerialNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.GNMASerialNote.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Package"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code Package = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Package";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.Package.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateDebtDerivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code CorporateDebtDerivative = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateDebtDerivative";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.CorporateDebtDerivative.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquityDerivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code EquityDerivative = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityDerivative";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.EquityDerivative.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalDerivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code MunicipalDerivative = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalDerivative";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.MunicipalDerivative.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalAmortizedIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code MunicipalAmortizedIssue = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalAmortizedIssue";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.MunicipalAmortizedIssue.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionDerivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code OptionDerivative = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionDerivative";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.OptionDerivative.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Warrant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code Warrant = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Warrant";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.Warrant.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Right"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code Right = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Right";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.Right.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MutualFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code MutualFund = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MutualFund";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.MutualFund.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedEndFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code ClosedEndFund = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedEndFund";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.ClosedEndFund.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IMMIInstitutionalMMIMutualFundShares"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code IMMIInstitutionalMMIMutualFundShares = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IMMIInstitutionalMMIMutualFundShares";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.IMMIInstitutionalMMIMutualFundShares.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquityUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code EquityUnit = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityUnit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.EquityUnit.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code DebtUnit = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtUnit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.DebtUnit.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitInvestmentTrustUITNuveenOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code UnitInvestmentTrustUITNuveenOnly = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitInvestmentTrustUITNuveenOnly";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.UnitInvestmentTrustUITNuveenOnly.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalUnitTrust"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code GlobalUnitTrust = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalUnitTrust";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.GlobalUnitTrust.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitInvestmentTrustUIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code UnitInvestmentTrustUIT = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitInvestmentTrustUIT";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.UnitInvestmentTrustUIT.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equity144aDesignatedInvestors"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code Equity144aDesignatedInvestors = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity144aDesignatedInvestors";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.Equity144aDesignatedInvestors.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalOtherTaxExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code MunicipalOtherTaxExempt = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalOtherTaxExempt";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.MunicipalOtherTaxExempt.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateOtherTaxExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code CorporateOtherTaxExempt = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateOtherTaxExempt";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.CorporateOtherTaxExempt.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Corporate144aDesignatedInvestors"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAssetType1Code Corporate144aDesignatedInvestors = new DTCAssetType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Corporate144aDesignatedInvestors";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAssetType1Code.mmObject();
			codeName = DTCAssetTypeCode.Corporate144aDesignatedInvestors.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCAssetType1Code> codesByName = new LinkedHashMap<>();

	protected DTCAssetType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("S005");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCAssetType1Code";
				definition = "DTC (The Depository Trust Company) security sub-issue type code list.";
				trace_lazy = () -> DTCAssetTypeCode.mmObject();
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
	}

	public static DTCAssetType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCAssetType1Code[] values() {
		DTCAssetType1Code[] values = new DTCAssetType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCAssetType1Code> {
		@Override
		public DTCAssetType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCAssetType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}