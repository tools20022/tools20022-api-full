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
 * Specifies the corporate action event type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmDividendReinvestment
 * CorporateActionEventTypeV4Code.mmDividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmCapitalGainsDistribution
 * CorporateActionEventTypeV4Code.mmCapitalGainsDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmCashDividend
 * CorporateActionEventTypeV4Code.mmCashDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmDividendOption
 * CorporateActionEventTypeV4Code.mmDividendOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmStockDividend
 * CorporateActionEventTypeV4Code.mmStockDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmLiquidationDividend
 * CorporateActionEventTypeV4Code.mmLiquidationDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmMerger
 * CorporateActionEventTypeV4Code.mmMerger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmNameChange
 * CorporateActionEventTypeV4Code.mmNameChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmSpinOff
 * CorporateActionEventTypeV4Code.mmSpinOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmTender
 * CorporateActionEventTypeV4Code.mmTender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmBonusIssue
 * CorporateActionEventTypeV4Code.mmBonusIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmChange
 * CorporateActionEventTypeV4Code.mmChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmRedenomination
 * CorporateActionEventTypeV4Code.mmRedenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmExchangeOption
 * CorporateActionEventTypeV4Code.mmExchangeOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmExchange
 * CorporateActionEventTypeV4Code.mmExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmDecreaseInValue
 * CorporateActionEventTypeV4Code.mmDecreaseInValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmEarlyRedemption
 * CorporateActionEventTypeV4Code.mmEarlyRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmFinalMaturity
 * CorporateActionEventTypeV4Code.mmFinalMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmInterestPayment
 * CorporateActionEventTypeV4Code.mmInterestPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmPrefunding
 * CorporateActionEventTypeV4Code.mmPrefunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmRemarketing
 * CorporateActionEventTypeV4Code.mmRemarketing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmSubscription
 * CorporateActionEventTypeV4Code.mmSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmAttachment
 * CorporateActionEventTypeV4Code.mmAttachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmConversion
 * CorporateActionEventTypeV4Code.mmConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmDetachment
 * CorporateActionEventTypeV4Code.mmDetachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmActiveTradingStatus
 * CorporateActionEventTypeV4Code.mmActiveTradingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmAnnualGeneralMeeting
 * CorporateActionEventTypeV4Code.mmAnnualGeneralMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmBankruptcy
 * CorporateActionEventTypeV4Code.mmBankruptcy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmBondDefault
 * CorporateActionEventTypeV4Code.mmBondDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmCallOnIntermediateSecurities
 * CorporateActionEventTypeV4Code.mmCallOnIntermediateSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmCapitalisation
 * CorporateActionEventTypeV4Code.mmCapitalisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmConsent
 * CorporateActionEventTypeV4Code.mmConsent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmCompanyOption
 * CorporateActionEventTypeV4Code.mmCompanyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmCouponStripping
 * CorporateActionEventTypeV4Code.mmCouponStripping}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmCourtMeeting
 * CorporateActionEventTypeV4Code.mmCourtMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmDisclosure
 * CorporateActionEventTypeV4Code.mmDisclosure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmDrawing
 * CorporateActionEventTypeV4Code.mmDrawing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmDutchAuction
 * CorporateActionEventTypeV4Code.mmDutchAuction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmExtraordinaryGeneralMeeting
 * CorporateActionEventTypeV4Code.mmExtraordinaryGeneralMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmFullCall
 * CorporateActionEventTypeV4Code.mmFullCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmIncreaseInValue
 * CorporateActionEventTypeV4Code.mmIncreaseInValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmInstalmentCall
 * CorporateActionEventTypeV4Code.mmInstalmentCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmInterestPaymentWithPrincipal
 * CorporateActionEventTypeV4Code.mmInterestPaymentWithPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmIntermediateSecuritiesDistribution
 * CorporateActionEventTypeV4Code.mmIntermediateSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmMaturityExtension
 * CorporateActionEventTypeV4Code.mmMaturityExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmNonUSTEFRADCertification
 * CorporateActionEventTypeV4Code.mmNonUSTEFRADCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmOddLotSalePurchase
 * CorporateActionEventTypeV4Code.mmOddLotSalePurchase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmOrdinaryGeneralMeeting
 * CorporateActionEventTypeV4Code.mmOrdinaryGeneralMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmOtherEvent
 * CorporateActionEventTypeV4Code.mmOtherEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmPariPassu
 * CorporateActionEventTypeV4Code.mmPariPassu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmPartialRedemptionWithNominalValueReduction
 * CorporateActionEventTypeV4Code.mmPartialRedemptionWithNominalValueReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmPartialRedemptionWithoutNominalValueReduction
 * CorporateActionEventTypeV4Code.
 * mmPartialRedemptionWithoutNominalValueReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmPayInKind
 * CorporateActionEventTypeV4Code.mmPayInKind}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmPlaceOfIncorporation
 * CorporateActionEventTypeV4Code.mmPlaceOfIncorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmPriorityIssue
 * CorporateActionEventTypeV4Code.mmPriorityIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmPutRedemption
 * CorporateActionEventTypeV4Code.mmPutRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmRemarketingAgreement
 * CorporateActionEventTypeV4Code.mmRemarketingAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmRepurchaseOffer
 * CorporateActionEventTypeV4Code.mmRepurchaseOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmReverseStockSplit
 * CorporateActionEventTypeV4Code.mmReverseStockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmRightsIssue
 * CorporateActionEventTypeV4Code.mmRightsIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmScripDividend
 * CorporateActionEventTypeV4Code.mmScripDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmSharesPremiumDividend
 * CorporateActionEventTypeV4Code.mmSharesPremiumDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmSmallestNegotiableUnit
 * CorporateActionEventTypeV4Code.mmSmallestNegotiableUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmStockSplit
 * CorporateActionEventTypeV4Code.mmStockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmTaxReclaim
 * CorporateActionEventTypeV4Code.mmTaxReclaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmTradingStatusDelisted
 * CorporateActionEventTypeV4Code.mmTradingStatusDelisted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmTradingStatusSuspended
 * CorporateActionEventTypeV4Code.mmTradingStatusSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmWarrantExercise
 * CorporateActionEventTypeV4Code.mmWarrantExercise}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmWithholdingTaxReliefCertification
 * CorporateActionEventTypeV4Code.mmWithholdingTaxReliefCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmWorthless
 * CorporateActionEventTypeV4Code.mmWorthless}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmClassActionProposedSettlement
 * CorporateActionEventTypeV4Code.mmClassActionProposedSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmCapitalDistribution
 * CorporateActionEventTypeV4Code.mmCapitalDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmCreditEvent
 * CorporateActionEventTypeV4Code.mmCreditEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmSecuritiesHoldersMeeting
 * CorporateActionEventTypeV4Code.mmSecuritiesHoldersMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmCashDistributionFromNonEligibleSecuritiesSales
 * CorporateActionEventTypeV4Code.
 * mmCashDistributionFromNonEligibleSecuritiesSales}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmAccumulation
 * CorporateActionEventTypeV4Code.mmAccumulation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmInformation
 * CorporateActionEventTypeV4Code.mmInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code#mmNonOfficialOffer
 * CorporateActionEventTypeV4Code.mmNonOfficialOffer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType10Code
 * CorporateActionEventType10Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType13Code
 * CorporateActionEventType13Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType12Code
 * CorporateActionEventType12Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
 * CorporateActionEventType11Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType14Code
 * CorporateActionEventType14Code}</li>
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
 * <li>"DRIP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionEventTypeV4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the corporate action event type."</li>
 * </ul>
 */
public class CorporateActionEventTypeV4Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Event is a dividend payment type where cash dividend is rolled over into
	 * additional shares in the issuing company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a dividend payment type where cash dividend is rolled over into additional shares in the issuing company."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDividendReinvestment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestment";
			definition = "Event is a dividend payment type where cash dividend is rolled over into additional shares in the issuing company.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "DRIP";
		}
	};
	/**
	 * Event is the distribution of profits resulting from the sale of
	 * securities. Shareholders of mutual funds, unit trusts, or Sicavs are
	 * recipients of capital gains distributions and are often reinvested in
	 * additional shares of the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAPG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainsDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is the distribution of profits resulting from the sale of securities. Shareholders of mutual funds, unit trusts, or Sicavs are recipients of capital gains distributions and are often reinvested in additional shares of the fund."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCapitalGainsDistribution = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGainsDistribution";
			definition = "Event is the distribution of profits resulting from the sale of securities. Shareholders of mutual funds, unit trusts, or Sicavs are recipients of capital gains distributions and are often reinvested in additional shares of the fund.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "CAPG";
		}
	};
	/**
	 * Distribution of cash to shareholders, in proportion to their equity
	 * holding. Ordinary dividends are recurring and regular. Shareholder must
	 * take cash and may be offered a choice of currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Distribution of cash to shareholders, in proportion to their equity holding. Ordinary dividends are recurring and regular. Shareholder must take cash and may be offered a choice of currency."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCashDividend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividend";
			definition = "Distribution of cash to shareholders, in proportion to their equity holding. Ordinary dividends are recurring and regular. Shareholder must take cash and may be offered a choice of currency.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "DVCA";
		}
	};
	/**
	 * Event is a distribution of a dividend to shareholders with the choice of
	 * payment method. The shareholder must choose the form of payment - stock,
	 * cash, or both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a distribution of a dividend to shareholders with the choice of payment method. The shareholder must choose the form of payment - stock, cash, or both."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDividendOption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendOption";
			definition = "Event is a distribution of a dividend to shareholders with the choice of payment method. The shareholder must choose the form of payment - stock, cash, or both.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "DVOP";
		}
	};
	/**
	 * Event is a dividend paid to shareholders in the form of shares of stock
	 * in the issuing company or in another company. The shareholder must take
	 * stock and is not offered a choice in the form of distribution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a dividend paid to shareholders in the form of shares of stock in the issuing company or in another company. The shareholder must take stock and is not offered a choice in the form of distribution."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmStockDividend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockDividend";
			definition = "Event is a dividend paid to shareholders in the form of shares of stock in the issuing company or in another company. The shareholder must take stock and is not offered a choice in the form of distribution.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "DVSE";
		}
	};
	/**
	 * A distribution of cash, assets or both. Debt may be paid in order of
	 * priority based on preferred claims to assets specified by the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIQU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidationDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A distribution of cash, assets or both. Debt may be paid in order of priority based on preferred claims to assets specified by the security."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLiquidationDividend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidationDividend";
			definition = "A distribution of cash, assets or both. Debt may be paid in order of priority based on preferred claims to assets specified by the security.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "LIQU";
		}
	};
	/**
	 * Event is a mandatory or voluntary exchange of outstanding securities as
	 * the result of two or more companies combining assets. Cash payments may
	 * accompany share exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MRGR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a mandatory or voluntary exchange of outstanding securities as the result of two or more companies combining assets. Cash payments may accompany share exchange."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMerger = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Merger";
			definition = "Event is a mandatory or voluntary exchange of outstanding securities as the result of two or more companies combining assets. Cash payments may accompany share exchange.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "MRGR";
		}
	};
	/**
	 * Event is a name change. The issuing company changes its name. The event
	 * shows the change from old name to new name and may involve surrendering
	 * physical shares with the old name to the registrar.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NAME"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a name change. The issuing company changes its name. The event shows the change from old name to new name and may involve surrendering physical shares with the old name to the registrar."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNameChange = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameChange";
			definition = "Event is a name change. The issuing company changes its name. The event shows the change from old name to new name and may involve surrendering physical shares with the old name to the registrar.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "NAME";
		}
	};
	/**
	 * Event is a demerger or distribution or an unbundling. It is a
	 * distribution of subsidiary stock to the shareholders of the parent
	 * company without a surrender of shares. A spin-off represents a form of
	 * divestiture resulting in an independent company. Normally this is without
	 * cost to the parent issue shareholder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOFF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpinOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a demerger or distribution or an unbundling. It is a distribution of subsidiary stock to the shareholders of the parent company without a surrender of shares. A spin-off represents a form of divestiture resulting in an independent company. Normally this is without cost to the parent issue shareholder."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSpinOff = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpinOff";
			definition = "Event is a demerger or distribution or an unbundling. It is a distribution of subsidiary stock to the shareholders of the parent company without a surrender of shares. A spin-off represents a form of divestiture resulting in an independent company. Normally this is without cost to the parent issue shareholder.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "SOFF";
		}
	};
	/**
	 * Event is an acquisition or take-over or offre publique de retrait (FR) or
	 * purchase offer. It is an offer made to holders by a third party,
	 * requesting them to sell (tender) or exchange their securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is an acquisition or take-over or offre publique de retrait (FR) or purchase offer. It is an offer made to holders by a third party, requesting them to sell (tender) or exchange their securities."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTender = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tender";
			definition = "Event is an acquisition or take-over or offre publique de retrait (FR) or purchase offer. It is an offer made to holders by a third party, requesting them to sell (tender) or exchange their securities.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "TEND";
		}
	};
	/**
	 * Event is a bonus issue or scrip issue or capitalisation issue. Security
	 * holders are awarded additional assets free of payment from the issuer in
	 * proportion to their holding. A bonus issue is typically represented by
	 * shares, rights or warrants. Nominal value doesn't change. Holder may be
	 * offered choice of form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BONU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BonusIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a bonus issue or scrip issue or capitalisation issue. Security holders are awarded additional assets free of payment from the issuer in proportion to their holding. A bonus issue is typically represented by shares, rights or warrants. Nominal value doesn't change. Holder may be offered choice of form."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBonusIssue = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BonusIssue";
			definition = "Event is a bonus issue or scrip issue or capitalisation issue. Security holders are awarded additional assets free of payment from the issuer in proportion to their holding. A bonus issue is typically represented by shares, rights or warrants. Nominal value doesn't change. Holder may be offered choice of form.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "BONU";
		}
	};
	/**
	 * Information regarding a change further described in the corporate action
	 * details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Change"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information regarding a change further described in the corporate action details."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmChange = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Change";
			definition = "Information regarding a change further described in the corporate action details.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "CHAN";
		}
	};
	/**
	 * Event by which the unit (currency and/or nominal) of a security is
	 * restated, for example, nominal/par value of security in a national
	 * currency is restated in another currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REDO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redenomination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event by which the unit (currency and/or nominal) of a security is restated, for example, nominal/par value of security in a national currency is restated in another currency."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRedenomination = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redenomination";
			definition = "Event by which the unit (currency and/or nominal) of a security is restated, for example, nominal/par value of security in a national currency is restated in another currency.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "REDO";
		}
	};
	/**
	 * Event is an option for the shareholders to exchange their securities for
	 * other securities and/or cash. Exchange options are mentioned in the terms
	 * and conditions of a security and are valid during the whole lifetime of a
	 * security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is an option for the shareholders to exchange their securities for other securities and/or cash. Exchange options are mentioned in the terms and conditions of a security and are valid during the whole lifetime of a security."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmExchangeOption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeOption";
			definition = "Event is an option for the shareholders to exchange their securities for other securities and/or cash. Exchange options are mentioned in the terms and conditions of a security and are valid during the whole lifetime of a security.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "EXOP";
		}
	};
	/**
	 * Exchange of holdings for other securities and/or cash. The exchange can
	 * be either mandatory or voluntary involving the exchange of outstanding
	 * securities for different securities and/or cash. For example
	 * "exchange offer", "capital reorganisation" or "funds separation" .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXOF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange of holdings for other securities and/or cash. The exchange can be either mandatory or voluntary involving the exchange of outstanding securities for different securities and/or cash. For example \"exchange offer\", \"capital reorganisation\" or \"funds separation\" ."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmExchange = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exchange";
			definition = "Exchange of holdings for other securities and/or cash. The exchange can be either mandatory or voluntary involving the exchange of outstanding securities for different securities and/or cash. For example \"exchange offer\", \"capital reorganisation\" or \"funds separation\" .";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "EXOF";
		}
	};
	/**
	 * Reduction of face value of a single share or the value of fund assets.
	 * The number of circulating shares/units remains unchanged. This event may
	 * include a cash payout to holders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DECR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DecreaseInValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reduction of face value of a single share or the value of fund assets. The number of circulating shares/units remains unchanged. This event may include a cash payout to holders."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDecreaseInValue = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DecreaseInValue";
			definition = "Reduction of face value of a single share or the value of fund assets. The number of circulating shares/units remains unchanged. This event may include a cash payout to holders.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "DECR";
		}
	};
	/**
	 * This includes drawing, partial and full call, put. Redemption in part or
	 * full before the scheduled final maturity date of a security, subject to
	 * the terms and conditions of the issue. Drawing - Securities are redeemed
	 * in part by lottery. Partial Call - Securities are redeemed in part by
	 * reducing proportionally the outstanding amount of securities. Put - Early
	 * redemption of a bond at the election of the bondholder. Full Call - The
	 * entire outstanding of a security is redeemed by the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ERED"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyRedemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This includes drawing, partial and full call, put.\nRedemption in part or full before the scheduled final maturity date of a security, subject to the terms and conditions of the issue. \nDrawing - Securities are redeemed in part by lottery.\nPartial Call - Securities are redeemed in part by reducing proportionally the outstanding amount of securities.\nPut - Early redemption of a bond at the election of the bondholder.\nFull Call - The entire outstanding of a security is redeemed by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEarlyRedemption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyRedemption";
			definition = "This includes drawing, partial and full call, put.\nRedemption in part or full before the scheduled final maturity date of a security, subject to the terms and conditions of the issue. \nDrawing - Securities are redeemed in part by lottery.\nPartial Call - Securities are redeemed in part by reducing proportionally the outstanding amount of securities.\nPut - Early redemption of a bond at the election of the bondholder.\nFull Call - The entire outstanding of a security is redeemed by the issuer.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "ERED";
		}
	};
	/**
	 * The redemption of an entire issue outstanding of securities, eg, bonds,
	 * preferred equity, funds, by the issuer or its agent, for example, asset
	 * manager, at final maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalMaturity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The redemption of an entire issue outstanding of securities, eg, bonds, preferred equity, funds, by the issuer or its agent, for example, asset manager, at final maturity."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFinalMaturity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalMaturity";
			definition = "The redemption of an entire issue outstanding of securities, eg, bonds, preferred equity, funds, by the issuer or its agent, for example, asset manager, at final maturity.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "REDM";
		}
	};
	/**
	 * Interest payment distributed to holders of an interest bearing asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest payment distributed to holders of an interest bearing asset."</li>
	 * </ul>
	 */
	public static final MMCode mmInterestPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPayment";
			definition = "Interest payment distributed to holders of an interest bearing asset.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "INTR";
		}
	};
	/**
	 * Also called partial defeasance. Issuer has money set aside to redeem a
	 * portion of an issue and the indenture states that the securities could be
	 * called earlier than the stated maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDEF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Prefunding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Also called partial defeasance. Issuer has money set aside to redeem a portion of an issue and the indenture states that the securities could be called earlier than the stated maturity."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPrefunding = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Prefunding";
			definition = "Also called partial defeasance. Issuer has money set aside to redeem a portion of an issue and the indenture states that the securities could be called earlier than the stated maturity.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "PDEF";
		}
	};
	/**
	 * Purchase and sale of remarketed preferred equities/bonds through the
	 * negotiation of interest rate between the issuers and the holders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RMRK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Remarketing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Purchase and sale of remarketed preferred equities/bonds through the negotiation of interest rate between the issuers and the holders."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRemarketing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Remarketing";
			definition = "Purchase and sale of remarketed preferred equities/bonds through the negotiation of interest rate between the issuers and the holders.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "RMRK";
		}
	};
	/**
	 * The ability for security holders to purchase (additional or new)
	 * securities at a certain price, in proportion to their holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUBS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The ability for security holders to purchase (additional or new) securities at a certain price, in proportion to their holding."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSubscription = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subscription";
			definition = "The ability for security holders to purchase (additional or new) securities at a certain price, in proportion to their holding.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "SUBS";
		}
	};
	/**
	 * Combination of different security types to create a unit. Units are
	 * usually comprised of warrants and bonds or warrants and equities.
	 * Securities may be combined at the request of the security holder or based
	 * on market convention.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATTI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Attachment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Combination of different security types to create a unit. Units are usually comprised of warrants and bonds or warrants and equities. Securities may be combined at the request of the security holder or based on market convention."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAttachment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Attachment";
			definition = "Combination of different security types to create a unit. Units are usually comprised of warrants and bonds or warrants and equities. Securities may be combined at the request of the security holder or based on market convention.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "ATTI";
		}
	};
	/**
	 * Conversion of securities ( generally convertible bonds or preferred
	 * shares) into another form of securities ( usually common shares) at a
	 * pre-stated price/ratio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Conversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conversion of securities ( generally convertible bonds or preferred shares) into another form of securities ( usually common shares) at a pre-stated price/ratio."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmConversion = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Conversion";
			definition = "Conversion of securities ( generally convertible bonds or preferred shares) into another form of securities ( usually common shares) at a pre-stated price/ratio.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "CONV";
		}
	};
	/**
	 * Separation of components that comprise a security, for example, usually
	 * units comprised of warrants and bond or warrants and equity . Units may
	 * be broken up at the request of the security holder or based on market
	 * convention.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DETI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Detachment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Separation of components that comprise a security, for example, usually units comprised of warrants and bond or warrants and equity . Units may be broken up at the request of the security holder or based on market convention."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDetachment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Detachment";
			definition = "Separation of components that comprise a security, for example, usually units comprised of warrants and bond or warrants and equity . Units may be broken up at the request of the security holder or based on market convention.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "DETI";
		}
	};
	/**
	 * Trading in security has commenced or security has been re-activated after
	 * a suspension in trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActiveTradingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trading in security has commenced or security has been re-activated after a suspension in trading."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmActiveTradingStatus = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActiveTradingStatus";
			definition = "Trading in security has commenced or security has been re-activated after a suspension in trading.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "ACTV";
		}
	};
	/**
	 * Meeting Annual general meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MEET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnualGeneralMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting Annual general meeting."</li>
	 * </ul>
	 */
	public static final MMCode mmAnnualGeneralMeeting = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnualGeneralMeeting";
			definition = "Meeting Annual general meeting.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "MEET";
		}
	};
	/**
	 * Legal status of a company unable to pay creditors. Bankruptcy usually
	 * involves a formal court ruling. Securities may become valueless.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRUP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bankruptcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal status of a company unable to pay creditors. Bankruptcy usually involves a formal court ruling. Securities may become valueless."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBankruptcy = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bankruptcy";
			definition = "Legal status of a company unable to pay creditors. Bankruptcy usually involves a formal court ruling. Securities may become valueless.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "BRUP";
		}
	};
	/**
	 * Failure by the company to perform obligations defined as default events
	 * under the bond agreement and that have not been remedied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondDefault"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Failure by the company to perform obligations defined as default events under the bond agreement and that have not been remedied."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBondDefault = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondDefault";
			definition = "Failure by the company to perform obligations defined as default events under the bond agreement and that have not been remedied.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "DFLT";
		}
	};
	/**
	 * Call or exercise on nil paid securities or intermediate securities
	 * resulting from an intermediate securities distribution (RHDI). This code
	 * is used for the second event, when an intermediate securities' issue
	 * (rights/coupons) is composed of two events, the first event being the
	 * distribution of intermediate securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXRI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallOnIntermediateSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Call or exercise on nil paid securities or intermediate securities resulting from an intermediate securities distribution (RHDI). This code is used for the second event, when an intermediate securities' issue (rights/coupons) is composed of two events, the first event being the distribution of intermediate securities."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCallOnIntermediateSecurities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallOnIntermediateSecurities";
			definition = "Call or exercise on nil paid securities or intermediate securities resulting from an intermediate securities distribution (RHDI). This code is used for the second event, when an intermediate securities' issue (rights/coupons) is composed of two events, the first event being the distribution of intermediate securities.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "EXRI";
		}
	};
	/**
	 * Increase of the current principal of a debt instrument without increasing
	 * the nominal value. It normally arises from the incorporation of due but
	 * unpaid interest into the principal. This is commonly done by increasing
	 * the pool factor value, for example, capitalisation, and negative
	 * amortisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAPI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Capitalisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Increase of the current principal of a debt instrument without increasing the nominal value. It normally arises from the incorporation of due but unpaid interest into the principal. This is commonly done by increasing the pool factor value, for example, capitalisation, and negative amortisation."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCapitalisation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Capitalisation";
			definition = "Increase of the current principal of a debt instrument without increasing the nominal value. It normally arises from the incorporation of due but unpaid interest into the principal. This is commonly done by increasing the pool factor value, for example, capitalisation, and negative amortisation.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "CAPI";
		}
	};
	/**
	 * Procedure that aims to obtain consent of holder to a proposal by the
	 * issuer or a third party without convening a meeting. For example, consent
	 * to change the terms of a bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Procedure that aims to obtain consent of holder  to a proposal by the issuer or a third party without convening a meeting. For example, consent to change the terms of a bond."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmConsent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consent";
			definition = "Procedure that aims to obtain consent of holder  to a proposal by the issuer or a third party without convening a meeting. For example, consent to change the terms of a bond.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "CONS";
		}
	};
	/**
	 * A Company Option may be granted by the company, allowing the holder to
	 * take up shares at some future date(s) at a pre arranged price in the
	 * company. A company may not grant options which enable the holder to take
	 * up unissued shares at a time which is five or more years from the date of
	 * the grant. Option holders are not members of a company. They are
	 * contingent creditors of a company and hence may, in some instances, be
	 * entitled to vote on and be bound by a scheme of arrangement between the
	 * creditors and the company. As many options have multiple exercise periods
	 * a company option will either lapse or carry on to the next expiry date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompanyOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A Company Option may be granted by the company, allowing the holder to take up shares at some future date(s) at a pre arranged price in the company. A company may not grant options which enable the holder to take up unissued shares at a time which is five or more years from the date of the grant. Option holders are not members of a company. They are contingent creditors of a company and hence may, in some instances, be entitled to vote on and be bound by a scheme of arrangement between the creditors and the company. As many options have multiple exercise periods a company option will either lapse or carry on to the next expiry date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCompanyOption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompanyOption";
			definition = "A Company Option may be granted by the company, allowing the holder to take up shares at some future date(s) at a pre arranged price in the company. A company may not grant options which enable the holder to take up unissued shares at a time which is five or more years from the date of the grant. Option holders are not members of a company. They are contingent creditors of a company and hence may, in some instances, be entitled to vote on and be bound by a scheme of arrangement between the creditors and the company. As many options have multiple exercise periods a company option will either lapse or carry on to the next expiry date.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "COOP";
		}
	};
	/**
	 * Coupon stripping is the process whereby interest coupons for future
	 * payment dates are separated from the security corpus that entitles the
	 * holder to the principal repayment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponStripping"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Coupon stripping is the process whereby interest coupons for future payment dates are separated from the security corpus that entitles the holder to the principal repayment."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCouponStripping = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponStripping";
			definition = "Coupon stripping is the process whereby interest coupons for future payment dates are separated from the security corpus that entitles the holder to the principal repayment.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "CPST";
		}
	};
	/**
	 * Announcement of a meeting at a Court.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CourtMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Announcement of a meeting at a Court."</li>
	 * </ul>
	 */
	public static final MMCode mmCourtMeeting = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CourtMeeting";
			definition = "Announcement of a meeting at a Court.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "CMET";
		}
	};
	/**
	 * Requirement for holders or beneficial owners to disclose their name,
	 * location and holdings of any issue to the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DSCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disclosure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requirement for holders or beneficial owners to disclose their name, location and holdings of any issue to the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDisclosure = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disclosure";
			definition = "Requirement for holders or beneficial owners to disclose their name, location and holdings of any issue to the issuer.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "DSCL";
		}
	};
	/**
	 * Redemption in part before the scheduled final maturity date of a
	 * security. Drawing is distinct from partial call since drawn bonds are
	 * chosen by lottery and with no reduction in nominal value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRAW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Drawing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Redemption in part before the scheduled final maturity date of a security. Drawing is distinct from partial call since drawn bonds are chosen by lottery and with no reduction in nominal value."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDrawing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Drawing";
			definition = "Redemption in part before the scheduled final maturity date of a security. Drawing is distinct from partial call since drawn bonds are chosen by lottery and with no reduction in nominal value.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "DRAW";
		}
	};
	/**
	 * An action by a party wishing to acquire a security. Holders of the
	 * security are invited to make an offer to sell, within a specific price
	 * range. The acquiring party will buy from the holder with lowest offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DTCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DutchAuction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An action by a party wishing to acquire a security. Holders of the security are invited to make an offer to sell, within a specific price range. The acquiring party will buy from the holder with lowest offer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDutchAuction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DutchAuction";
			definition = "An action by a party wishing to acquire a security. Holders of the security are invited to make an offer to sell, within a specific price range. The acquiring party will buy from the holder with lowest offer.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "DTCH";
		}
	};
	/**
	 * Extraordinary or Special General Meeting. Extraordinary or special
	 * general meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XMET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtraordinaryGeneralMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Extraordinary or Special General Meeting. Extraordinary or special general meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmExtraordinaryGeneralMeeting = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtraordinaryGeneralMeeting";
			definition = "Extraordinary or Special General Meeting. Extraordinary or special general meeting.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "XMET";
		}
	};
	/**
	 * The redemption of an entire issue outstanding of securities, eg, bonds,
	 * preferred equity, funds, by the issuer or its agent, for example, asset
	 * manager,before final maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The redemption of an entire issue outstanding of securities, eg, bonds, preferred equity, funds, by the issuer or its agent, for example, asset manager,before final maturity."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFullCall = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullCall";
			definition = "The redemption of an entire issue outstanding of securities, eg, bonds, preferred equity, funds, by the issuer or its agent, for example, asset manager,before final maturity.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "MCAL";
		}
	};
	/**
	 * Increase in the face value of a single security. The number of
	 * circulating securities remains unchanged .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INCR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncreaseInValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Increase in the face value of a single security. The number of circulating securities remains unchanged ."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIncreaseInValue = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncreaseInValue";
			definition = "Increase in the face value of a single security. The number of circulating securities remains unchanged .";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "INCR";
		}
	};
	/**
	 * An instalment towards the purchase of equity capital, subject to an
	 * agreement between an issuer and a purchaser.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PPMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An instalment towards the purchase of equity capital, subject to an agreement between an issuer and a purchaser."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInstalmentCall = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentCall";
			definition = "An instalment towards the purchase of equity capital, subject to an agreement between an issuer and a purchaser.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "PPMT";
		}
	};
	/**
	 * An event which consists of two components, the decrease of the amortized
	 * value of a pool factor security and an interest payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRII"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaymentWithPrincipal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An event which consists of two components, the decrease of the amortized value of a pool factor security and an interest payment."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInterestPaymentWithPrincipal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentWithPrincipal";
			definition = "An event which consists of two components, the decrease of the amortized value of a pool factor security and an interest payment.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "PRII";
		}
	};
	/**
	 * The distribution of intermediate securities that gives the holder the
	 * right to take part in a future event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RHDI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The distribution of intermediate securities that gives the holder the right to take part in a future event."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIntermediateSecuritiesDistribution = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistribution";
			definition = "The distribution of intermediate securities that gives the holder the right to take part in a future event.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "RHDI";
		}
	};
	/**
	 * As stipulated in a bond's Terms and Conditions, the issuer or the
	 * bond-holder may prolong the maturity date of a bond. After extension, the
	 * security may differ from original issue (new rate or maturity date). May
	 * be subject to bondholder's approval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXTM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityExtension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "As stipulated in a bond's Terms and Conditions, the issuer or the bond-holder may prolong the maturity date of a bond. After extension, the security may differ from original issue (new rate or maturity date). May be subject to bondholder's approval."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMaturityExtension = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityExtension";
			definition = "As stipulated in a bond's Terms and Conditions, the issuer or the bond-holder may prolong the maturity date of a bond. After extension, the security may differ from original issue (new rate or maturity date). May be subject to bondholder's approval.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "EXTM";
		}
	};
	/**
	 * Non-US beneficial owner certification requirement for exchange of
	 * temporary to permanent notes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CERT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonUSTEFRADCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Non-US beneficial owner certification requirement for exchange of temporary to permanent notes."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNonUSTEFRADCertification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonUSTEFRADCertification";
			definition = "Non-US beneficial owner certification requirement for exchange of temporary to permanent notes.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "CERT";
		}
	};
	/**
	 * Odd Lot Sale/Purchase . Sale or purchase of odd-lots to/from the issuing
	 * company, initiated either by the holder of the security or through an
	 * offer made by the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ODLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OddLotSalePurchase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Odd Lot Sale/Purchase . Sale or purchase of odd-lots to/from the issuing company, initiated either by the holder of the security or through an offer made by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOddLotSalePurchase = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddLotSalePurchase";
			definition = "Odd Lot Sale/Purchase . Sale or purchase of odd-lots to/from the issuing company, initiated either by the holder of the security or through an offer made by the issuer.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "ODLT";
		}
	};
	/**
	 * Ordinary general meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OMET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrdinaryGeneralMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ordinary general meeting."</li>
	 * </ul>
	 */
	public static final MMCode mmOrdinaryGeneralMeeting = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrdinaryGeneralMeeting";
			definition = "Ordinary general meeting.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "OMET";
		}
	};
	/**
	 * Other event, use only when no other event type applies, for example, a
	 * new event type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Other event, use only when no other event type applies, for example, a new event type."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOtherEvent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherEvent";
			definition = "Other event, use only when no other event type applies, for example, a new event type.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Occurs when securities with different characteristics, for example,
	 * shares with different entitlements to dividend or voting rights, become
	 * identical in all respects, for example , pari-passu or assimilation. May
	 * be scheduled in advance, for example, shares resulting from a bonus may
	 * become fungible after a pre-set period of time, or may result from
	 * outside events, for example, merger, reorganisation, issue of
	 * supplementary tranches.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PARI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PariPassu"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Occurs when securities with different characteristics, for example, shares with different entitlements to dividend or voting rights, become identical in all respects, for example , pari-passu or assimilation. May be scheduled in advance, for example, shares resulting from a bonus may become fungible after a pre-set period of time, or may result from outside events, for example, merger, reorganisation, issue of supplementary tranches."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPariPassu = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PariPassu";
			definition = "Occurs when securities with different characteristics, for example, shares with different entitlements to dividend or voting rights, become identical in all respects, for example , pari-passu or assimilation. May be scheduled in advance, for example, shares resulting from a bonus may become fungible after a pre-set period of time, or may result from outside events, for example, merger, reorganisation, issue of supplementary tranches.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "PARI";
		}
	};
	/**
	 * Securities are redeemed in part before their scheduled final maturity
	 * date with reduction of the nominal value of the shares. The outstanding
	 * amount of securities will be reduced proportionally.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PCAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialRedemptionWithNominalValueReduction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities are redeemed in part before their scheduled final maturity date with reduction of the nominal value of the shares. The outstanding amount of securities will be reduced proportionally."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPartialRedemptionWithNominalValueReduction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithNominalValueReduction";
			definition = "Securities are redeemed in part before their scheduled final maturity date with reduction of the nominal value of the shares. The outstanding amount of securities will be reduced proportionally.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "PCAL";
		}
	};
	/**
	 * Securities are redeemed in part before their scheduled final maturity
	 * date without reduction of the nominal value of the shares. This is
	 * commonly done by pool factor reduction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRED"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialRedemptionWithoutNominalValueReduction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities are redeemed in part before their scheduled final maturity date without reduction of the nominal value of the shares. This is commonly done by pool factor reduction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPartialRedemptionWithoutNominalValueReduction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithoutNominalValueReduction";
			definition = "Securities are redeemed in part before their scheduled final maturity date without reduction of the nominal value of the shares. This is commonly done by pool factor reduction.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "PRED";
		}
	};
	/**
	 * Interest payment, in any kind except cash, distributed to holders of an
	 * interest bearing asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PINK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayInKind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest payment, in any kind except cash, distributed to holders of an interest bearing asset."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPayInKind = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayInKind";
			definition = "Interest payment, in any kind except cash, distributed to holders of an interest bearing asset.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "PINK";
		}
	};
	/**
	 * Changes in the state of incorporation for US companies and changes in the
	 * place of incorporation for foreign companies. Where shares need to be
	 * registered following the incorporation change, the holder(s) may have to
	 * elect the registrar.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfIncorporation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Changes in the state of incorporation for US companies and changes in the place of incorporation for foreign companies. Where shares need to be registered following the incorporation change, the holder(s) may have to elect the registrar."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPlaceOfIncorporation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfIncorporation";
			definition = "Changes in the state of incorporation for US companies and changes in the place of incorporation for foreign companies. Where shares need to be registered following the incorporation change, the holder(s) may have to elect the registrar.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "PLAC";
		}
	};
	/**
	 * Form of open or public offer where, due to a limited amount of securities
	 * available, priority is given to existing shareholders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRIO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorityIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Form of open or public offer where, due to a limited amount of securities available, priority is given to existing shareholders."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPriorityIssue = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorityIssue";
			definition = "Form of open or public offer where, due to a limited amount of securities available, priority is given to existing shareholders.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "PRIO";
		}
	};
	/**
	 * Redemption in part before the scheduled final maturity date of a
	 * security. Drawing is distinct from partial call since drawn bonds are
	 * chosen by lottery and with no reduction in nominal value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BPUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutRedemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Redemption in part before the scheduled final maturity date of a security. Drawing is distinct from partial call since drawn bonds are chosen by lottery and with no reduction in nominal value."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPutRedemption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutRedemption";
			definition = "Redemption in part before the scheduled final maturity date of a security. Drawing is distinct from partial call since drawn bonds are chosen by lottery and with no reduction in nominal value.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "BPUT";
		}
	};
	/**
	 * Purchase and sale of remarketed preferred equities/bonds through the
	 * negotiation of interest rate between the issuers and the holders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REMK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemarketingAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Purchase and sale of remarketed preferred equities/bonds through the negotiation of interest rate between the issuers and the holders."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRemarketingAgreement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemarketingAgreement";
			definition = "Purchase and sale of remarketed preferred equities/bonds through the negotiation of interest rate between the issuers and the holders.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "REMK";
		}
	};
	/**
	 * Repurchase offer/Issuer bid/ Reverse rights. Offer to existing holders by
	 * the issuing company to repurchase its own securities. The objective of
	 * the offer is to reduce the number of outstanding securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BIDS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseOffer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Repurchase offer/Issuer bid/ Reverse rights. Offer to existing holders by the issuing company to repurchase its own securities. The objective of the offer is to reduce the number of outstanding securities."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRepurchaseOffer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseOffer";
			definition = "Repurchase offer/Issuer bid/ Reverse rights. Offer to existing holders by the issuing company to repurchase its own securities. The objective of the offer is to reduce the number of outstanding securities.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "BIDS";
		}
	};
	/**
	 * Event is a change in nominal value, a consolidation. It is a decrease in
	 * number of outstanding shares of stock without any change in the
	 * shareholder's equity or the aggregate market value at the time of the
	 * split. Stock price and nominal value are reduced accordingly.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPLR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseStockSplit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a change in nominal value, a consolidation. It is a decrease in number of outstanding shares of stock without any change in the shareholder's equity or the aggregate market value at the time of the split. Stock price and nominal value are reduced accordingly."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReverseStockSplit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseStockSplit";
			definition = "Event is a change in nominal value, a consolidation. It is a decrease in number of outstanding shares of stock without any change in the shareholder's equity or the aggregate market value at the time of the split. Stock price and nominal value are reduced accordingly.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "SPLR";
		}
	};
	/**
	 * Rights Issue/ Subscription Rights/ Rights Offer. Offer to holders of a
	 * security to subscribe for additional securities via the distribution of
	 * an intermediate security. Both processes are included in the same event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RHTS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rights Issue/ Subscription Rights/ Rights Offer. Offer to holders of a security to subscribe for additional securities via the distribution of an intermediate security. Both processes are included in the same event."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRightsIssue = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsIssue";
			definition = "Rights Issue/ Subscription Rights/ Rights Offer. Offer to holders of a security to subscribe for additional securities via the distribution of an intermediate security. Both processes are included in the same event.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "RHTS";
		}
	};
	/**
	 * Scrip Dividend/Payment. Dividend or interest paid in the form of scrip.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scrip Dividend/Payment. Dividend or interest paid in the form of scrip."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmScripDividend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripDividend";
			definition = "Scrip Dividend/Payment. Dividend or interest paid in the form of scrip.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "DVSC";
		}
	};
	/**
	 * This corporate event pays shareholders an amount in cash issued from the
	 * shares premium reserve. It is similar to a dividend but with different
	 * tax implications.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SharesPremiumDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This corporate event pays shareholders an amount in cash issued from the shares premium reserve. It is similar to a dividend but with different tax implications."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSharesPremiumDividend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SharesPremiumDividend";
			definition = "This corporate event pays shareholders an amount in cash issued from the shares premium reserve. It is similar to a dividend but with different tax implications.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "SHPR";
		}
	};
	/**
	 * Modification of the smallest negotiable unit of shares in order to obtain
	 * a new negotiable unit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SmallestNegotiableUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification of the smallest negotiable unit of shares in order to obtain a new negotiable unit."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSmallestNegotiableUnit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SmallestNegotiableUnit";
			definition = "Modification of the smallest negotiable unit of shares in order to obtain a new negotiable unit.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "SMAL";
		}
	};
	/**
	 * Event is a change in nominal value, a subdivision. It is an increase in a
	 * corporation's number of outstanding shares of stock without any change in
	 * the shareholder's equity or the aggregate market value at the time of the
	 * split. Stock price and nominal value are reduced accordingly.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPLF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockSplit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a change in nominal value, a subdivision. It is an increase in a corporation's number of outstanding shares of stock without any change in the shareholder's equity or the aggregate market value at the time of the split. Stock price and nominal value are reduced accordingly."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmStockSplit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockSplit";
			definition = "Event is a change in nominal value, a subdivision. It is an increase in a corporation's number of outstanding shares of stock without any change in the shareholder's equity or the aggregate market value at the time of the split. Stock price and nominal value are reduced accordingly.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "SPLF";
		}
	};
	/**
	 * Event related to tax reclaim activities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TREC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxReclaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event related to tax reclaim activities."</li>
	 * </ul>
	 */
	public static final MMCode mmTaxReclaim = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReclaim";
			definition = "Event related to tax reclaim activities.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "TREC";
		}
	};
	/**
	 * Security is no longer able to comply with the listing requirements of a
	 * stock exchange and is removed from official board quotation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DLST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingStatusDelisted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security is no longer able to comply with the listing requirements of a stock exchange and is removed from official board quotation."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTradingStatusDelisted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingStatusDelisted";
			definition = "Security is no longer able to comply with the listing requirements of a stock exchange and is removed from official board quotation.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "DLST";
		}
	};
	/**
	 * Trading in the security has been suspended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingStatusSuspended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trading in the security has been suspended."</li>
	 * </ul>
	 */
	public static final MMCode mmTradingStatusSuspended = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingStatusSuspended";
			definition = "Trading in the security has been suspended.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "SUSP";
		}
	};
	/**
	 * Option offered to holders to buy (call warrant) or to sell (put warrant)
	 * a specific amount of stock, cash, or commodity, at a predetermined price,
	 * during a predetermined period of time (which usually corresponds to the
	 * life of the issue).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXWA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantExercise"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Option offered to holders to buy (call warrant) or to sell (put warrant) a specific amount of stock, cash, or commodity, at a predetermined price, during a predetermined period of time (which usually corresponds to the life of the issue)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmWarrantExercise = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantExercise";
			definition = "Option offered to holders to buy (call warrant) or to sell (put warrant) a specific amount of stock, cash, or commodity, at a predetermined price, during a predetermined period of time (which usually corresponds to the life of the issue).";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "EXWA";
		}
	};
	/**
	 * Certification process for withholding tax reduction or exemption based on
	 * the tax status of the holder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WTRC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxReliefCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certification process for withholding tax reduction or exemption based on the tax status of the holder."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmWithholdingTaxReliefCertification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxReliefCertification";
			definition = "Certification process for withholding tax reduction or exemption based on the tax status of the holder.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "WTRC";
		}
	};
	/**
	 * Booking out of valueless securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WRTH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Worthless"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Booking out of valueless securities."</li>
	 * </ul>
	 */
	public static final MMCode mmWorthless = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Worthless";
			definition = "Booking out of valueless securities.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "WRTH";
		}
	};
	/**
	 * Situation where interested parties seek restitution for financial loss.
	 * The security holder may be offered the opportunity to join a class action
	 * proceeding and would need to respond with an instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassActionProposedSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Situation where interested parties seek restitution for financial loss. The security holder may be offered the opportunity to join a class action proceeding and would need to respond with an instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmClassActionProposedSettlement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassActionProposedSettlement";
			definition = "Situation where interested parties seek restitution for financial loss. The security holder may be offered the opportunity to join a class action proceeding and would need to respond with an instruction.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "CLSA";
		}
	};
	/**
	 * The Corporate event pays shareholders an amount in cash issued from the
	 * Capital account. There is no reduction to the face value of a single
	 * share (or the share has no par value). The number of circulating shares
	 * remains unchanged.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Corporate event pays shareholders an amount in cash issued from the Capital account. There is no reduction to the face value of a single share (or the share has no par value). The number of circulating shares remains unchanged."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCapitalDistribution = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalDistribution";
			definition = "The Corporate event pays shareholders an amount in cash issued from the Capital account. There is no reduction to the face value of a single share (or the share has no par value). The number of circulating shares remains unchanged.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "CAPD";
		}
	};
	/**
	 * An occurrence of credit derivative for which the issuer of one or several
	 * underlying securities is unable to fulfill his financial obligations (as
	 * defined in terms and conditions).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CREV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An occurrence of credit derivative for which the issuer of one or several underlying securities is unable to fulfill his financial obligations (as defined in terms and conditions)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCreditEvent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditEvent";
			definition = "An occurrence of credit derivative for which the issuer of one or several underlying securities is unable to fulfill his financial obligations (as defined in terms and conditions).";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "CREV";
		}
	};
	/**
	 * Ordinary or annual or extraordinary or special general meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MTNG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesHoldersMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ordinary or annual or extraordinary or special general meeting."</li>
	 * </ul>
	 */
	public static final MMCode mmSecuritiesHoldersMeeting = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesHoldersMeeting";
			definition = "Ordinary or annual or extraordinary or special general meeting.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "MTNG";
		}
	};
	/**
	 * Distribution to shareholders of cash resulting from the selling of
	 * non-eligible securities, for example, in the frame of a depositary
	 * receipt program.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDistributionFromNonEligibleSecuritiesSales"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Distribution to shareholders of cash resulting from the selling of non-eligible securities, for example, in the frame of a depositary receipt program."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCashDistributionFromNonEligibleSecuritiesSales = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashDistributionFromNonEligibleSecuritiesSales";
			definition = "Distribution to shareholders of cash resulting from the selling of non-eligible securities, for example, in the frame of a depositary receipt program.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "DRCA";
		}
	};
	/**
	 * Funds related event in which the income (for example accumulation units)
	 * that accrues during an accounting period is retained within the fund
	 * instead of being paid away to investors. The retained income is
	 * nonetheless deemed to have been distributed to investors for tax
	 * purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACCU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accumulation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Funds related event in which the income (for example accumulation units) that accrues during an accounting period is retained within the fund instead of being paid away to investors. The retained income is nonetheless deemed to have been distributed to investors for tax purposes. "
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAccumulation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accumulation";
			definition = "Funds related event in which the income (for example accumulation units) that accrues during an accounting period is retained within the fund instead of being paid away to investors. The retained income is nonetheless deemed to have been distributed to investors for tax purposes. ";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "ACCU";
		}
	};
	/**
	 * Information provided by the issuer having no accounting/financial impact
	 * on the holder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INFO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Information"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information provided by the issuer having no accounting/financial impact on the holder."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInformation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Information";
			definition = "Information provided by the issuer having no accounting/financial impact on the holder.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "INFO";
		}
	};
	/**
	 * Offers that are not supervised or regulated by an official entity and
	 * being offered by a party, for example a broker, usually at a discount
	 * price, for example broker offer, mini-tender, mini odd lot offer or third
	 * party offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
	 * CorporateActionEventTypeV4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOOF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonOfficialOffer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Offers that are not supervised or regulated by an official entity and being offered by a party, for example a broker, usually at a discount price, for example broker offer, mini-tender, mini odd lot offer or third party offer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNonOfficialOffer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonOfficialOffer";
			definition = "Offers that are not supervised or regulated by an official entity and being offered by a party, for example a broker, usually at a discount price, for example broker offer, mini-tender, mini odd lot offer or third party offer.";
			owner_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
			codeName = "NOOF";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("DRIP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventTypeV4Code";
				definition = "Specifies the corporate action event type.";
				code_lazy = () -> Arrays.asList(CorporateActionEventTypeV4Code.mmDividendReinvestment, CorporateActionEventTypeV4Code.mmCapitalGainsDistribution, CorporateActionEventTypeV4Code.mmCashDividend,
						CorporateActionEventTypeV4Code.mmDividendOption, CorporateActionEventTypeV4Code.mmStockDividend, CorporateActionEventTypeV4Code.mmLiquidationDividend, CorporateActionEventTypeV4Code.mmMerger,
						CorporateActionEventTypeV4Code.mmNameChange, CorporateActionEventTypeV4Code.mmSpinOff, CorporateActionEventTypeV4Code.mmTender, CorporateActionEventTypeV4Code.mmBonusIssue, CorporateActionEventTypeV4Code.mmChange,
						CorporateActionEventTypeV4Code.mmRedenomination, CorporateActionEventTypeV4Code.mmExchangeOption, CorporateActionEventTypeV4Code.mmExchange, CorporateActionEventTypeV4Code.mmDecreaseInValue,
						CorporateActionEventTypeV4Code.mmEarlyRedemption, CorporateActionEventTypeV4Code.mmFinalMaturity, CorporateActionEventTypeV4Code.mmInterestPayment, CorporateActionEventTypeV4Code.mmPrefunding,
						CorporateActionEventTypeV4Code.mmRemarketing, CorporateActionEventTypeV4Code.mmSubscription, CorporateActionEventTypeV4Code.mmAttachment, CorporateActionEventTypeV4Code.mmConversion,
						CorporateActionEventTypeV4Code.mmDetachment, CorporateActionEventTypeV4Code.mmActiveTradingStatus, CorporateActionEventTypeV4Code.mmAnnualGeneralMeeting, CorporateActionEventTypeV4Code.mmBankruptcy,
						CorporateActionEventTypeV4Code.mmBondDefault, CorporateActionEventTypeV4Code.mmCallOnIntermediateSecurities, CorporateActionEventTypeV4Code.mmCapitalisation, CorporateActionEventTypeV4Code.mmConsent,
						CorporateActionEventTypeV4Code.mmCompanyOption, CorporateActionEventTypeV4Code.mmCouponStripping, CorporateActionEventTypeV4Code.mmCourtMeeting, CorporateActionEventTypeV4Code.mmDisclosure,
						CorporateActionEventTypeV4Code.mmDrawing, CorporateActionEventTypeV4Code.mmDutchAuction, CorporateActionEventTypeV4Code.mmExtraordinaryGeneralMeeting, CorporateActionEventTypeV4Code.mmFullCall,
						CorporateActionEventTypeV4Code.mmIncreaseInValue, CorporateActionEventTypeV4Code.mmInstalmentCall, CorporateActionEventTypeV4Code.mmInterestPaymentWithPrincipal,
						CorporateActionEventTypeV4Code.mmIntermediateSecuritiesDistribution, CorporateActionEventTypeV4Code.mmMaturityExtension, CorporateActionEventTypeV4Code.mmNonUSTEFRADCertification,
						CorporateActionEventTypeV4Code.mmOddLotSalePurchase, CorporateActionEventTypeV4Code.mmOrdinaryGeneralMeeting, CorporateActionEventTypeV4Code.mmOtherEvent, CorporateActionEventTypeV4Code.mmPariPassu,
						CorporateActionEventTypeV4Code.mmPartialRedemptionWithNominalValueReduction, CorporateActionEventTypeV4Code.mmPartialRedemptionWithoutNominalValueReduction, CorporateActionEventTypeV4Code.mmPayInKind,
						CorporateActionEventTypeV4Code.mmPlaceOfIncorporation, CorporateActionEventTypeV4Code.mmPriorityIssue, CorporateActionEventTypeV4Code.mmPutRedemption, CorporateActionEventTypeV4Code.mmRemarketingAgreement,
						CorporateActionEventTypeV4Code.mmRepurchaseOffer, CorporateActionEventTypeV4Code.mmReverseStockSplit, CorporateActionEventTypeV4Code.mmRightsIssue, CorporateActionEventTypeV4Code.mmScripDividend,
						CorporateActionEventTypeV4Code.mmSharesPremiumDividend, CorporateActionEventTypeV4Code.mmSmallestNegotiableUnit, CorporateActionEventTypeV4Code.mmStockSplit, CorporateActionEventTypeV4Code.mmTaxReclaim,
						CorporateActionEventTypeV4Code.mmTradingStatusDelisted, CorporateActionEventTypeV4Code.mmTradingStatusSuspended, CorporateActionEventTypeV4Code.mmWarrantExercise,
						CorporateActionEventTypeV4Code.mmWithholdingTaxReliefCertification, CorporateActionEventTypeV4Code.mmWorthless, CorporateActionEventTypeV4Code.mmClassActionProposedSettlement,
						CorporateActionEventTypeV4Code.mmCapitalDistribution, CorporateActionEventTypeV4Code.mmCreditEvent, CorporateActionEventTypeV4Code.mmSecuritiesHoldersMeeting,
						CorporateActionEventTypeV4Code.mmCashDistributionFromNonEligibleSecuritiesSales, CorporateActionEventTypeV4Code.mmAccumulation, CorporateActionEventTypeV4Code.mmInformation,
						CorporateActionEventTypeV4Code.mmNonOfficialOffer);
				derivation_lazy = () -> Arrays.asList(CorporateActionEventType10Code.mmObject(), CorporateActionEventType13Code.mmObject(), CorporateActionEventType12Code.mmObject(), CorporateActionEventType11Code.mmObject(),
						CorporateActionEventType14Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}