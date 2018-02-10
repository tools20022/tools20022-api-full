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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the corporate action event type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#DividendReinvestment
 * CorporateActionEventTypeV2Code.DividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#CapitalGainsDistribution
 * CorporateActionEventTypeV2Code.CapitalGainsDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#CashDividend
 * CorporateActionEventTypeV2Code.CashDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#DividendOption
 * CorporateActionEventTypeV2Code.DividendOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#StockDividend
 * CorporateActionEventTypeV2Code.StockDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#Merger
 * CorporateActionEventTypeV2Code.Merger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#NameChange
 * CorporateActionEventTypeV2Code.NameChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#SpinOff
 * CorporateActionEventTypeV2Code.SpinOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#StockSplit
 * CorporateActionEventTypeV2Code.StockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#ReverseStockSplit
 * CorporateActionEventTypeV2Code.ReverseStockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#Tender
 * CorporateActionEventTypeV2Code.Tender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#BonusIssue
 * CorporateActionEventTypeV2Code.BonusIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#RightsDistribution
 * CorporateActionEventTypeV2Code.RightsDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#CallOnRights
 * CorporateActionEventTypeV2Code.CallOnRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#Change
 * CorporateActionEventTypeV2Code.Change}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#ExchangeOffer
 * CorporateActionEventTypeV2Code.ExchangeOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#DecreaseInValue
 * CorporateActionEventTypeV2Code.DecreaseInValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#EarlyRedemption
 * CorporateActionEventTypeV2Code.EarlyRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#FinalMaturity
 * CorporateActionEventTypeV2Code.FinalMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#InterestPayment
 * CorporateActionEventTypeV2Code.InterestPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#Prefunding
 * CorporateActionEventTypeV2Code.Prefunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#PrincipalAndInterestPaydown
 * CorporateActionEventTypeV2Code.PrincipalAndInterestPaydown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#Remarketing
 * CorporateActionEventTypeV2Code.Remarketing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#Subscription
 * CorporateActionEventTypeV2Code.Subscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#Attachment
 * CorporateActionEventTypeV2Code.Attachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#Conversion
 * CorporateActionEventTypeV2Code.Conversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#Detachment
 * CorporateActionEventTypeV2Code.Detachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#ScripDividend
 * CorporateActionEventTypeV2Code.ScripDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#PariPassu
 * CorporateActionEventTypeV2Code.PariPassu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#PriorityIssue
 * CorporateActionEventTypeV2Code.PriorityIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#BidRepurchaseOffer
 * CorporateActionEventTypeV2Code.BidRepurchaseOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#CallOnWarrants
 * CorporateActionEventTypeV2Code.CallOnWarrants}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#OddLotSalePurchase
 * CorporateActionEventTypeV2Code.OddLotSalePurchase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#ClassActionProposedSettlement
 * CorporateActionEventTypeV2Code.ClassActionProposedSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#ActiveTradingStatus
 * CorporateActionEventTypeV2Code.ActiveTradingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#PutRedemption
 * CorporateActionEventTypeV2Code.PutRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#Bankruptcy
 * CorporateActionEventTypeV2Code.Bankruptcy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#NonUSTEFRADCertification
 * CorporateActionEventTypeV2Code.NonUSTEFRADCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#CourtMeeting
 * CorporateActionEventTypeV2Code.CourtMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#Consent
 * CorporateActionEventTypeV2Code.Consent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#CompanyOption
 * CorporateActionEventTypeV2Code.CompanyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#CouponStripping
 * CorporateActionEventTypeV2Code.CouponStripping}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#BondDefault
 * CorporateActionEventTypeV2Code.BondDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#TradingStatusDelisted
 * CorporateActionEventTypeV2Code.TradingStatusDelisted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#Drawing
 * CorporateActionEventTypeV2Code.Drawing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#Disclosure
 * CorporateActionEventTypeV2Code.Disclosure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#DutchAuction
 * CorporateActionEventTypeV2Code.DutchAuction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#MaturityExtension
 * CorporateActionEventTypeV2Code.MaturityExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#IncreaseInValue
 * CorporateActionEventTypeV2Code.IncreaseInValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#FullCall
 * CorporateActionEventTypeV2Code.FullCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#AnnualGeneralMeeting
 * CorporateActionEventTypeV2Code.AnnualGeneralMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#OrdinaryGeneralMeeting
 * CorporateActionEventTypeV2Code.OrdinaryGeneralMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#OtherEvent
 * CorporateActionEventTypeV2Code.OtherEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#PartialRedemptionWithNominalValueReduction
 * CorporateActionEventTypeV2Code.PartialRedemptionWithNominalValueReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#PayInKind
 * CorporateActionEventTypeV2Code.PayInKind}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#PlaceOfIncorporation
 * CorporateActionEventTypeV2Code.PlaceOfIncorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#InstalmentCall
 * CorporateActionEventTypeV2Code.InstalmentCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#PartialRedemptionWithoutNominalValueReduction
 * CorporateActionEventTypeV2Code.PartialRedemptionWithoutNominalValueReduction}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#RemarketingAgreement
 * CorporateActionEventTypeV2Code.RemarketingAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#RightsIssue
 * CorporateActionEventTypeV2Code.RightsIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#SharesPremiumDividend
 * CorporateActionEventTypeV2Code.SharesPremiumDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#SmallestNegotiableUnit
 * CorporateActionEventTypeV2Code.SmallestNegotiableUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#TradingStatusSuspended
 * CorporateActionEventTypeV2Code.TradingStatusSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#TaxReclaim
 * CorporateActionEventTypeV2Code.TaxReclaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#Worthless
 * CorporateActionEventTypeV2Code.Worthless}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#WithholdingTaxReliefCertification
 * CorporateActionEventTypeV2Code.WithholdingTaxReliefCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#ExtraordinaryGeneralMeeting
 * CorporateActionEventTypeV2Code.ExtraordinaryGeneralMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#Redenomination
 * CorporateActionEventTypeV2Code.Redenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#LiquidationDividend
 * CorporateActionEventTypeV2Code.LiquidationDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#ExchangeOption
 * CorporateActionEventTypeV2Code.ExchangeOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code#Capitalisation
 * CorporateActionEventTypeV2Code.Capitalisation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
 * CorporateActionEventType3Code}</li>
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
 * <li>"DRIP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionEventTypeV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the corporate action event type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionEventTypeV2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Event is a dividend payment type where cash dividend is rolled over into
	 * additional shares in the issuing company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAEV//DRIP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a dividend payment type where cash dividend is rolled over into additional shares in the issuing company."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code DividendReinvestment = new CorporateActionEventTypeV2Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAEV//DRIP"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DividendReinvestment";
			definition = "Event is a dividend payment type where cash dividend is rolled over into additional shares in the issuing company.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAPG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAEV//CAPG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainsDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is the distribution of profits resulting from the sale of securities. Shareholders of mutual funds, unit trusts, or Sicavs are recipients of capital gains distributions and are often reinvested in additional shares of the fund."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code CapitalGainsDistribution = new CorporateActionEventTypeV2Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAEV//CAPG"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CapitalGainsDistribution";
			definition = "Event is the distribution of profits resulting from the sale of securities. Shareholders of mutual funds, unit trusts, or Sicavs are recipients of capital gains distributions and are often reinvested in additional shares of the fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "CAPG";
		}
	};
	/**
	 * Event is a distribution of cash to shareholders, in proportion to their
	 * equity holding. Ordinary dividends are recurring and regular. The
	 * shareholder must take cash and is not offered a choice in the form of
	 * distribution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAEV//DVCA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a distribution of cash to shareholders, in proportion to their equity holding. Ordinary dividends are recurring and regular. The shareholder must take cash and is not offered a choice in the form of distribution."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code CashDividend = new CorporateActionEventTypeV2Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAEV//DVCA"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashDividend";
			definition = "Event is a distribution of cash to shareholders, in proportion to their equity holding. Ordinary dividends are recurring and regular. The shareholder must take cash and is not offered a choice in the form of distribution.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAEV//DVOP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a distribution of a dividend to shareholders with the choice of payment method. The shareholder must choose the form of payment - stock, cash, or both."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code DividendOption = new CorporateActionEventTypeV2Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAEV//DVOP"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DividendOption";
			definition = "Event is a distribution of a dividend to shareholders with the choice of payment method. The shareholder must choose the form of payment - stock, cash, or both.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAEV//DVSE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a dividend paid to shareholders in the form of shares of stock in the issuing company or in another company. The shareholder must take stock and is not offered a choice in the form of distribution."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code StockDividend = new CorporateActionEventTypeV2Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAEV//DVSE"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StockDividend";
			definition = "Event is a dividend paid to shareholders in the form of shares of stock in the issuing company or in another company. The shareholder must take stock and is not offered a choice in the form of distribution.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "DVSE";
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MRGR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAEV//MRGR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a mandatory or voluntary exchange of outstanding securities as the result of two or more companies combining assets. Cash payments may accompany share exchange."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code Merger = new CorporateActionEventTypeV2Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAEV//MRGR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Merger";
			definition = "Event is a mandatory or voluntary exchange of outstanding securities as the result of two or more companies combining assets. Cash payments may accompany share exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NAME"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAEV//NAME</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a name change. The issuing company changes its name. The event shows the change from old name to new name and may involve surrendering physical shares with the old name to the registrar."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code NameChange = new CorporateActionEventTypeV2Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAEV//NAME"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NameChange";
			definition = "Event is a name change. The issuing company changes its name. The event shows the change from old name to new name and may involve surrendering physical shares with the old name to the registrar.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOFF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAEV//SOFF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpinOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a demerger or distribution or an unbundling. It is a distribution of subsidiary stock to the shareholders of the parent company without a surrender of shares. A spin-off represents a form of divestiture resulting in an independent company. Normally this is without cost to the parent issue shareholder."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code SpinOff = new CorporateActionEventTypeV2Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAEV//SOFF"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpinOff";
			definition = "Event is a demerger or distribution or an unbundling. It is a distribution of subsidiary stock to the shareholders of the parent company without a surrender of shares. A spin-off represents a form of divestiture resulting in an independent company. Normally this is without cost to the parent issue shareholder.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "SOFF";
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPLF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAEV//SPLF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockSplit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a change in nominal value, a subdivision. It is an increase in a corporation's number of outstanding shares of stock without any change in the shareholder's equity or the aggregate market value at the time of the split. Stock price and nominal value are reduced accordingly."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code StockSplit = new CorporateActionEventTypeV2Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAEV//SPLF"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StockSplit";
			definition = "Event is a change in nominal value, a subdivision. It is an increase in a corporation's number of outstanding shares of stock without any change in the shareholder's equity or the aggregate market value at the time of the split. Stock price and nominal value are reduced accordingly.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "SPLF";
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPLR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAEV//SPLR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseStockSplit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a change in nominal value, a consolidation. It is a decrease in number of outstanding shares of stock without any change in the shareholder's equity or the aggregate market value at the time of the split. Stock price and nominal value are reduced accordingly."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code ReverseStockSplit = new CorporateActionEventTypeV2Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAEV//SPLR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReverseStockSplit";
			definition = "Event is a change in nominal value, a consolidation. It is a decrease in number of outstanding shares of stock without any change in the shareholder's equity or the aggregate market value at the time of the split. Stock price and nominal value are reduced accordingly.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "SPLR";
		}
	};
	/**
	 * Event is an acquisition or take-over or offre publique de retrait (FR) or
	 * purchase offer or buy-back. It is an offer made to shareholders
	 * requesting them to sell (tender) their shares for a specified price
	 * usually at a premium over prevailing market price. Generally, the
	 * objective of a tender offer is to take control of the target company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAEV//TEND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is an acquisition or take-over or offre publique de retrait (FR) or purchase offer or buy-back. It is an offer made to shareholders requesting them to sell (tender) their shares for a specified price usually at a premium over prevailing market price. Generally, the objective of a tender offer is to take control of the target company."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code Tender = new CorporateActionEventTypeV2Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAEV//TEND"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tender";
			definition = "Event is an acquisition or take-over or offre publique de retrait (FR) or purchase offer or buy-back. It is an offer made to shareholders requesting them to sell (tender) their shares for a specified price usually at a premium over prevailing market price. Generally, the objective of a tender offer is to take control of the target company.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BONU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAEV//BONU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BonusIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a bonus issue or scrip issue or capitalisation issue. Security holders are awarded additional assets free of payment from the issuer in proportion to their holding. A bonus issue is typically represented by shares, rights or warrants. Nominal value doesn't change. Holder may be offered choice of form."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code BonusIssue = new CorporateActionEventTypeV2Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAEV//BONU"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BonusIssue";
			definition = "Event is a bonus issue or scrip issue or capitalisation issue. Security holders are awarded additional assets free of payment from the issuer in proportion to their holding. A bonus issue is typically represented by shares, rights or warrants. Nominal value doesn't change. Holder may be offered choice of form.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "BONU";
		}
	};
	/**
	 * Event is the distribution of rights to shareholders, in proportion to
	 * their equity holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RHDI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAEV//RHDI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is the distribution of rights to shareholders, in proportion to their equity holding."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code RightsDistribution = new CorporateActionEventTypeV2Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAEV//RHDI"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RightsDistribution";
			definition = "Event is the distribution of rights to shareholders, in proportion to their equity holding.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "RHDI";
		}
	};
	/**
	 * Event is a call or exercise on nil-paid securities or rights resulting
	 * from a rights distribution (RHDI). This is to be used for the second
	 * event in those cases where the rights issue is dealt with in two events,
	 * the first event being the rights distribution (RHDI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXRI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAEV//EXRI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallOnRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a call or exercise on nil-paid securities or rights resulting from a rights distribution (RHDI). This is to be used for the second event in those cases where the rights issue is dealt with in two events, the first event being the rights distribution (RHDI)."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code CallOnRights = new CorporateActionEventTypeV2Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAEV//EXRI"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CallOnRights";
			definition = "Event is a call or exercise on nil-paid securities or rights resulting from a rights distribution (RHDI). This is to be used for the second event in those cases where the rights issue is dealt with in two events, the first event being the rights distribution (RHDI).";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "EXRI";
		}
	};
	/**
	 * Event is a generic change. For example, a change in the terms of an
	 * issue, a change in the identification of a security, change of a board
	 * lot, a change from global to definitive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAEV//CHAN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Change"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a generic change. For example,  a change in the terms of an issue, a change in the identification of a security, change of a board lot, a change from global to definitive."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code Change = new CorporateActionEventTypeV2Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAEV//CHAN"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Change";
			definition = "Event is a generic change. For example,  a change in the terms of an issue, a change in the identification of a security, change of a board lot, a change from global to definitive.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "CHAN";
		}
	};
	/**
	 * Event is an exchange offer or capital reorganisation. It is an offer to
	 * shareholders to exchange their holdings for other securities and/or cash.
	 * Exchange offers are usually voluntary involving the exchange of
	 * outstanding security for a different security or securities and/or cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXOF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAEV//EXOF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeOffer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is an exchange offer or capital reorganisation. It is an offer to shareholders to exchange their holdings for other securities and/or cash. Exchange offers are usually voluntary involving the exchange of outstanding security for a different security or securities and/or cash."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code ExchangeOffer = new CorporateActionEventTypeV2Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAEV//EXOF"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExchangeOffer";
			definition = "Event is an exchange offer or capital reorganisation. It is an offer to shareholders to exchange their holdings for other securities and/or cash. Exchange offers are usually voluntary involving the exchange of outstanding security for a different security or securities and/or cash.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "EXOF";
		}
	};
	/**
	 * Event is a reduction of the share capital and face value of a single
	 * share. The number of the circulating shares remains unchanged. It may
	 * include a capital pay-out to shareholder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DECR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAEV//DECR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DecreaseInValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a reduction of the share capital and face value of a single share. The number of the circulating shares remains unchanged. It may include a capital pay-out to shareholder."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code DecreaseInValue = new CorporateActionEventTypeV2Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAEV//DECR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DecreaseInValue";
			definition = "Event is a reduction of the share capital and face value of a single share. The number of the circulating shares remains unchanged. It may include a capital pay-out to shareholder.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ERED"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyRedemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This includes drawing, partial and full call, put. Redemption in part or full before the scheduled final maturity date of a security, subject to the terms and conditions of the issue. Drawing - Securities are redeemed in part by lottery. Partial Call - Securities are redeemed in part by reducing proportionally the outstanding amount of securities. Put - Early redemption of a bond at the election of the bondholder. Full Call - The entire outstanding of a security is redeemed by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code EarlyRedemption = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EarlyRedemption";
			definition = "This includes drawing, partial and full call, put. Redemption in part or full before the scheduled final maturity date of a security, subject to the terms and conditions of the issue. Drawing - Securities are redeemed in part by lottery. Partial Call - Securities are redeemed in part by reducing proportionally the outstanding amount of securities. Put - Early redemption of a bond at the election of the bondholder. Full Call - The entire outstanding of a security is redeemed by the issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "ERED";
		}
	};
	/**
	 * Redemption of an entire issue outstanding of securities by the issuer at
	 * final maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalMaturity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Redemption of an entire issue outstanding of securities by the issuer at final maturity."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code FinalMaturity = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinalMaturity";
			definition = "Redemption of an entire issue outstanding of securities by the issuer at final maturity.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "REDM";
		}
	};
	/**
	 * Interest payment distributed to holders of an interest bearing asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest payment distributed to holders of an interest bearing asset."</li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code InterestPayment = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestPayment";
			definition = "Interest payment distributed to holders of an interest bearing asset.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDEF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Prefunding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Also called partial defeasance. Issuer has money set aside to redeem a portion of an issue and the indenture states that the securities could be called earlier than the stated maturity."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code Prefunding = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Prefunding";
			definition = "Also called partial defeasance. Issuer has money set aside to redeem a portion of an issue and the indenture states that the securities could be called earlier than the stated maturity.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "PDEF";
		}
	};
	/**
	 * A payment of a portion of the principal of an interest bearing asset, in
	 * addition to the interest payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRII"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalAndInterestPaydown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A payment of a portion of the principal of an interest bearing asset, in addition to the interest payment."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code PrincipalAndInterestPaydown = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrincipalAndInterestPaydown";
			definition = "A payment of a portion of the principal of an interest bearing asset, in addition to the interest payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "PRII";
		}
	};
	/**
	 * Purchase and sale of remarketed preferred equities/bonds through the
	 * negotiation of interest rate between the issuers and the holders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RMRK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Remarketing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Purchase and sale of remarketed preferred equities/bonds through the negotiation of interest rate between the issuers and the holders."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code Remarketing = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Remarketing";
			definition = "Purchase and sale of remarketed preferred equities/bonds through the negotiation of interest rate between the issuers and the holders.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUBS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The ability for security holders to purchase (additional or new) securities at a certain price, in proportion to their holding."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code Subscription = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Subscription";
			definition = "The ability for security holders to purchase (additional or new) securities at a certain price, in proportion to their holding.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "SUBS";
		}
	};
	/**
	 * The combination of different security types to create a unit. Units are
	 * usually comprised of warrants and bond or warrants and equity. Securities
	 * may be combined at the request of the security holder or based on market
	 * convention.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATTI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Attachment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The combination of different security types to create a unit. Units are usually comprised of warrants and bond or warrants and equity. Securities may be combined at the request of the security holder or based on market convention."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code Attachment = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Attachment";
			definition = "The combination of different security types to create a unit. Units are usually comprised of warrants and bond or warrants and equity. Securities may be combined at the request of the security holder or based on market convention.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "ATTI";
		}
	};
	/**
	 * Conversion of securities (generally convertible bonds or preferred
	 * shares) into another form of securities (usually common shares) at a
	 * pre-stated price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Conversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conversion of securities (generally convertible bonds or preferred shares) into another form of securities (usually common shares) at a pre-stated price."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code Conversion = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Conversion";
			definition = "Conversion of securities (generally convertible bonds or preferred shares) into another form of securities (usually common shares) at a pre-stated price.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "CONV";
		}
	};
	/**
	 * Separation of components that comprise a security usually units comprised
	 * of warrants and bond or warrants and equity. Units may be broken up at
	 * the request of the security holder or based on market convention.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DETI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Detachment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Separation of components that comprise a security usually units comprised of warrants and bond or warrants and equity. Units may be broken up at the request of the security holder or based on market convention."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code Detachment = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Detachment";
			definition = "Separation of components that comprise a security usually units comprised of warrants and bond or warrants and equity. Units may be broken up at the request of the security holder or based on market convention.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "DETI";
		}
	};
	/**
	 * Dividend or interest paid in the form of scrip.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend or interest paid in the form of scrip."</li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code ScripDividend = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ScripDividend";
			definition = "Dividend or interest paid in the form of scrip.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "DVSC";
		}
	};
	/**
	 * Also called Assimilation or Enfranchisement. Occurs when securities with
	 * different characteristics, for example, equities with different
	 * entitlements to dividend or voting rights, are assimilated, that is,
	 * become identical in all respects. The event may be scheduled in advance
	 * or be the result of an outside event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PARI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PariPassu"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Also called Assimilation or Enfranchisement. Occurs when securities with different characteristics, for example, equities with different entitlements to dividend or voting rights, are assimilated, that is, become identical in all respects. The event may be scheduled in advance or be the result of an outside event."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code PariPassu = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PariPassu";
			definition = "Also called Assimilation or Enfranchisement. Occurs when securities with different characteristics, for example, equities with different entitlements to dividend or voting rights, are assimilated, that is, become identical in all respects. The event may be scheduled in advance or be the result of an outside event.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "PARI";
		}
	};
	/**
	 * Form of open or public offer where priority is given to existing
	 * shareholders due to limited amount of securities available in the offer.
	 * Shareholders can buy a type of security during a short period of time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRIO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorityIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Form of open or public offer where priority is given to existing shareholders due to limited amount of securities available in the offer. Shareholders can buy a type of security during a short period of time."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code PriorityIssue = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriorityIssue";
			definition = "Form of open or public offer where priority is given to existing shareholders due to limited amount of securities available in the offer. Shareholders can buy a type of security during a short period of time.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "PRIO";
		}
	};
	/**
	 * Also called Issuer Bid or Reverse Rights. Offer to existing shareholders
	 * by the issuing company to repurchase equity or other securities
	 * convertible into equity. The objective of the offer is to reduce the
	 * number of outstanding equities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BIDS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidRepurchaseOffer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Also called Issuer Bid or Reverse Rights. Offer to existing shareholders by the issuing company to repurchase equity or other securities convertible into equity. The objective of the offer is to reduce the number of outstanding equities."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code BidRepurchaseOffer = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BidRepurchaseOffer";
			definition = "Also called Issuer Bid or Reverse Rights. Offer to existing shareholders by the issuing company to repurchase equity or other securities convertible into equity. The objective of the offer is to reduce the number of outstanding equities.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "BIDS";
		}
	};
	/**
	 * Warrant conversion. Option offered to security holders to buy (call
	 * warrant) or to sell (put warrant) a specific amount of stock, cash, or
	 * commodity, at a predetermined price, during a predetermined period of
	 * time (which usually corresponds to the life of the issue).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXWA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallOnWarrants"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Warrant conversion. Option offered to security holders to buy (call warrant) or to sell (put warrant) a specific amount of stock, cash, or commodity, at a predetermined price, during a predetermined period of time (which usually corresponds to the life of the issue)."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code CallOnWarrants = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CallOnWarrants";
			definition = "Warrant conversion. Option offered to security holders to buy (call warrant) or to sell (put warrant) a specific amount of stock, cash, or commodity, at a predetermined price, during a predetermined period of time (which usually corresponds to the life of the issue).";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "EXWA";
		}
	};
	/**
	 * Sale to or purchase of odd-lots from the issuing company, initiated
	 * either by the holder of the security or through an offer made by the
	 * issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ODLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OddLotSalePurchase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sale to or purchase of odd-lots from the issuing company, initiated either by the holder of the security or through an offer made by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code OddLotSalePurchase = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OddLotSalePurchase";
			definition = "Sale to or purchase of odd-lots from the issuing company, initiated either by the holder of the security or through an offer made by the issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "ODLT";
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	public static final CorporateActionEventTypeV2Code ClassActionProposedSettlement = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassActionProposedSettlement";
			definition = "Situation where interested parties seek restitution for financial loss. The security holder may be offered the opportunity to join a class action proceeding and would need to respond with an instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "CLSA";
		}
	};
	/**
	 * Trading in security has commenced or security has been reactivated after
	 * a suspension in trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	 * "Trading in security has commenced or security has been reactivated after a suspension in trading."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code ActiveTradingStatus = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActiveTradingStatus";
			definition = "Trading in security has commenced or security has been reactivated after a suspension in trading.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "ACTV";
		}
	};
	/**
	 * Early redemption of a security at the election of the holder subject to
	 * the terms and condition of the issue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	 * "Early redemption of a security at the election of the holder subject to the terms and condition of the issue."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code PutRedemption = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutRedemption";
			definition = "Early redemption of a security at the election of the holder subject to the terms and condition of the issue.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "BPUT";
		}
	};
	/**
	 * Legal status of a company unable to pay creditors. Bankruptcy usually
	 * involves a formal court ruling. Securities may become valueless.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	public static final CorporateActionEventTypeV2Code Bankruptcy = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bankruptcy";
			definition = "Legal status of a company unable to pay creditors. Bankruptcy usually involves a formal court ruling. Securities may become valueless.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "BRUP";
		}
	};
	/**
	 * Non US Tax Equity and Fiscal Responsibility Act (TEFRA) D certification.
	 * Non US beneficial owner certification requirement for exchange of
	 * temporary to permanent notes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	 * "Non US Tax Equity and Fiscal Responsibility Act (TEFRA) D certification. Non US beneficial owner certification requirement for exchange of temporary to permanent notes."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code NonUSTEFRADCertification = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonUSTEFRADCertification";
			definition = "Non US Tax Equity and Fiscal Responsibility Act (TEFRA) D certification. Non US beneficial owner certification requirement for exchange of temporary to permanent notes.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "CERT";
		}
	};
	/**
	 * Announcement of a meeting at a Court.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	public static final CorporateActionEventTypeV2Code CourtMeeting = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CourtMeeting";
			definition = "Announcement of a meeting at a Court.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "CMET";
		}
	};
	/**
	 * Procedure that aims to obtain the consent of holders, without a formal
	 * general meeting, to a proposal by the issuer or a third party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	 * "Procedure that aims to obtain the consent of holders, without a formal general meeting, to a proposal by the issuer or a third party."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code Consent = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consent";
			definition = "Procedure that aims to obtain the consent of holders, without a formal general meeting, to a proposal by the issuer or a third party.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "CONS";
		}
	};
	/**
	 * Company option may be granted by the company, allowing the holder to take
	 * up shares at some future date(s) at a prearranged price in the company. A
	 * company may not grant options which enable the holder to take up unissued
	 * shares at a time which is five or more years from the date of the grant.
	 * Option holders are not members of a company. They are contingent
	 * creditors of a company and hence may, in some instances, be entitled to
	 * vote on and be bound by a scheme of arrangement between the creditors and
	 * the company. As many options have multiple exercise periods a company
	 * option will either lapse or carry on to the next expiry date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	 * "Company option may be granted by the company, allowing the holder to take up shares at some future date(s) at a prearranged price in the company. A company may not grant options which enable the holder to take up unissued shares at a time which is five or more years from the date of the grant. Option holders are not members of a company. They are contingent creditors of a company and hence may, in some instances, be entitled to vote on and be bound by a scheme of arrangement between the creditors and the company. As many options have multiple exercise periods a company option will either lapse or carry on to the next expiry date."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code CompanyOption = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompanyOption";
			definition = "Company option may be granted by the company, allowing the holder to take up shares at some future date(s) at a prearranged price in the company. A company may not grant options which enable the holder to take up unissued shares at a time which is five or more years from the date of the grant. Option holders are not members of a company. They are contingent creditors of a company and hence may, in some instances, be entitled to vote on and be bound by a scheme of arrangement between the creditors and the company. As many options have multiple exercise periods a company option will either lapse or carry on to the next expiry date.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	public static final CorporateActionEventTypeV2Code CouponStripping = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponStripping";
			definition = "Coupon stripping is the process whereby interest coupons for future payment dates are separated from the security corpus that entitles the holder to the principal repayment.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "CPST";
		}
	};
	/**
	 * Failure by the company to perform obligations defined as default events
	 * under the bond agreement and that have not been remedied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	public static final CorporateActionEventTypeV2Code BondDefault = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondDefault";
			definition = "Failure by the company to perform obligations defined as default events under the bond agreement and that have not been remedied.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "DFLT";
		}
	};
	/**
	 * Security is no longer able to comply with the listing requirements of a
	 * stock exchange and is removed from official board quotation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	public static final CorporateActionEventTypeV2Code TradingStatusDelisted = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingStatusDelisted";
			definition = "Security is no longer able to comply with the listing requirements of a stock exchange and is removed from official board quotation.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "DLST";
		}
	};
	/**
	 * Redemption in part before the scheduled final maturity date of a
	 * security. Drawing is distinct from partial call since drawn bonds are
	 * chosen by lottery and results are confirmed to bondholder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	 * "Redemption in part before the scheduled final maturity date of a security. Drawing is distinct from partial call since drawn bonds are chosen by lottery and results are confirmed to bondholder."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code Drawing = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Drawing";
			definition = "Redemption in part before the scheduled final maturity date of a security. Drawing is distinct from partial call since drawn bonds are chosen by lottery and results are confirmed to bondholder.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "DRAW";
		}
	};
	/**
	 * Requirement for holders or beneficial owners to disclose their name,
	 * location and holdings of any issue to the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	public static final CorporateActionEventTypeV2Code Disclosure = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disclosure";
			definition = "Requirement for holders or beneficial owners to disclose their name, location and holdings of any issue to the issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "DSCL";
		}
	};
	/**
	 * Action by a party wishing to acquire a security. Holders of the security
	 * are invited to make an offer to sell, within a specific price range. The
	 * acquiring party will buy from the holder with lowest offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	 * "Action by a party wishing to acquire a security. Holders of the security are invited to make an offer to sell, within a specific price range. The acquiring party will buy from the holder with lowest offer."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code DutchAuction = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DutchAuction";
			definition = "Action by a party wishing to acquire a security. Holders of the security are invited to make an offer to sell, within a specific price range. The acquiring party will buy from the holder with lowest offer.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "DTCH";
		}
	};
	/**
	 * As stipulated in a bond's terms and conditions, the issuer or the bond
	 * holder may prolong the maturity date of a bond. After extension, the
	 * security may differ from original issue (new rate or maturity date). May
	 * be subject to bondholder's approval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	 * "As stipulated in a bond's terms and conditions, the issuer or the bond holder may prolong the maturity date of a bond. After extension, the security may differ from original issue (new rate or maturity date). May be subject to bondholder's approval."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code MaturityExtension = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityExtension";
			definition = "As stipulated in a bond's terms and conditions, the issuer or the bond holder may prolong the maturity date of a bond. After extension, the security may differ from original issue (new rate or maturity date). May be subject to bondholder's approval.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "EXTM";
		}
	};
	/**
	 * Increase in the face value of a single security. The number of
	 * circulating securities remains unchanged.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	 * "Increase in the face value of a single security. The number of circulating securities remains unchanged."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code IncreaseInValue = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncreaseInValue";
			definition = "Increase in the face value of a single security. The number of circulating securities remains unchanged.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "INCR";
		}
	};
	/**
	 * Redemption of an entire issue outstanding of bonds/preferred equity by
	 * the issuer before final maturity. Also known as early redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	 * "Redemption of an entire issue outstanding of bonds/preferred equity by the issuer before final maturity. Also known as early redemption."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code FullCall = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullCall";
			definition = "Redemption of an entire issue outstanding of bonds/preferred equity by the issuer before final maturity. Also known as early redemption.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "MCAL";
		}
	};
	/**
	 * General meeting taking place on annual basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	 * definition} = "General meeting taking place on annual basis."</li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code AnnualGeneralMeeting = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnualGeneralMeeting";
			definition = "General meeting taking place on annual basis.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "MEET";
		}
	};
	/**
	 * Ordinary general meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	public static final CorporateActionEventTypeV2Code OrdinaryGeneralMeeting = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrdinaryGeneralMeeting";
			definition = "Ordinary general meeting.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	public static final CorporateActionEventTypeV2Code OtherEvent = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherEvent";
			definition = "Other event, use only when no other event type applies, for example, a new event type.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "OTHR";
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	public static final CorporateActionEventTypeV2Code PartialRedemptionWithNominalValueReduction = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithNominalValueReduction";
			definition = "Securities are redeemed in part before their scheduled final maturity date with reduction of the nominal value of the shares. The outstanding amount of securities will be reduced proportionally.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "PCAL";
		}
	};
	/**
	 * Interest payment, in any kind except cash, distributed to holders of an
	 * interest bearing asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	public static final CorporateActionEventTypeV2Code PayInKind = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayInKind";
			definition = "Interest payment, in any kind except cash, distributed to holders of an interest bearing asset.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	public static final CorporateActionEventTypeV2Code PlaceOfIncorporation = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfIncorporation";
			definition = "Changes in the state of incorporation for US companies and changes in the place of incorporation for foreign companies. Where shares need to be registered following the incorporation change, the holder(s) may have to elect the registrar.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "PLAC";
		}
	};
	/**
	 * Instalment towards the purchase of equity capital, subject to an
	 * agreement between an issuer and a purchaser.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	 * "Instalment towards the purchase of equity capital, subject to an agreement between an issuer and a purchaser."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code InstalmentCall = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentCall";
			definition = "Instalment towards the purchase of equity capital, subject to an agreement between an issuer and a purchaser.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "PPMT";
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	public static final CorporateActionEventTypeV2Code PartialRedemptionWithoutNominalValueReduction = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithoutNominalValueReduction";
			definition = "Securities are redeemed in part before their scheduled final maturity date without reduction of the nominal value of the shares. This is commonly done by pool factor reduction.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "PRED";
		}
	};
	/**
	 * Purchase and sale of remarketed preferred equities/bonds through the
	 * negotiation of interest rate between the issuers and the holders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	public static final CorporateActionEventTypeV2Code RemarketingAgreement = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemarketingAgreement";
			definition = "Purchase and sale of remarketed preferred equities/bonds through the negotiation of interest rate between the issuers and the holders.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "REMK";
		}
	};
	/**
	 * Distribution of a security or privilege that gives the holder an
	 * entitlement or right to take part in a future event. Also known as
	 * subscription rights or rights offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	 * "Distribution of a security or privilege that gives the holder an entitlement or right to take part in a future event. Also known as subscription rights or rights offer."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code RightsIssue = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsIssue";
			definition = "Distribution of a security or privilege that gives the holder an entitlement or right to take part in a future event. Also known as subscription rights or rights offer.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "RHTS";
		}
	};
	/**
	 * Corporate event that pays shareholders an amount in cash issued from the
	 * shares premium reserve. It is similar to a dividend but with different
	 * tax implications.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	 * "Corporate event that pays shareholders an amount in cash issued from the shares premium reserve. It is similar to a dividend but with different tax implications."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code SharesPremiumDividend = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SharesPremiumDividend";
			definition = "Corporate event that pays shareholders an amount in cash issued from the shares premium reserve. It is similar to a dividend but with different tax implications.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	public static final CorporateActionEventTypeV2Code SmallestNegotiableUnit = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SmallestNegotiableUnit";
			definition = "Modification of the smallest negotiable unit of shares in order to obtain a new negotiable unit.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "SMAL";
		}
	};
	/**
	 * Trading in the security has been suspended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	public static final CorporateActionEventTypeV2Code TradingStatusSuspended = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingStatusSuspended";
			definition = "Trading in the security has been suspended.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "SUSP";
		}
	};
	/**
	 * Event related to tax reclaim activities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	public static final CorporateActionEventTypeV2Code TaxReclaim = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReclaim";
			definition = "Event related to tax reclaim activities.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "TREC";
		}
	};
	/**
	 * Booking out of valueless securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	public static final CorporateActionEventTypeV2Code Worthless = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Worthless";
			definition = "Booking out of valueless securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "WRTH";
		}
	};
	/**
	 * Certification request for withholding tax reduction or exemption based on
	 * the tax status of the holder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	 * "Certification request for withholding tax reduction or exemption based on the tax status of the holder."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code WithholdingTaxReliefCertification = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxReliefCertification";
			definition = "Certification request for withholding tax reduction or exemption based on the tax status of the holder.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "WTRC";
		}
	};
	/**
	 * Extraordinary or special general meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	 * definition} = "Extraordinary or special general meeting."</li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code ExtraordinaryGeneralMeeting = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtraordinaryGeneralMeeting";
			definition = "Extraordinary or special general meeting.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "XMET";
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	public static final CorporateActionEventTypeV2Code Redenomination = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redenomination";
			definition = "Event by which the unit (currency and/or nominal) of a security is restated, for example, nominal/par value of security in a national currency is restated in another currency.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "REDO";
		}
	};
	/**
	 * Distribution of cash, assets or both. Debt may be paid in order of
	 * priority based on preferred claims to assets specified by the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIQU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAEV//LIQU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidationDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Distribution of cash, assets or both. Debt may be paid in order of priority based on preferred claims to assets specified by the security."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code LiquidationDividend = new CorporateActionEventTypeV2Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAEV//LIQU"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LiquidationDividend";
			definition = "Distribution of cash, assets or both. Debt may be paid in order of priority based on preferred claims to assets specified by the security.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "LIQU";
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAEV//EXOP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is an option for the shareholders to exchange their securities for other securities and/or cash. Exchange options are mentioned in the terms and conditions of a security and are valid during the whole lifetime of a security."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV2Code ExchangeOption = new CorporateActionEventTypeV2Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAEV//EXOP"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExchangeOption";
			definition = "Event is an option for the shareholders to exchange their securities for other securities and/or cash. Exchange options are mentioned in the terms and conditions of a security and are valid during the whole lifetime of a security.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "EXOP";
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
	 * CorporateActionEventTypeV2Code}</li>
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
	public static final CorporateActionEventTypeV2Code Capitalisation = new CorporateActionEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Capitalisation";
			definition = "Increase of the current principal of a debt instrument without increasing the nominal value. It normally arises from the incorporation of due but unpaid interest into the principal. This is commonly done by increasing the pool factor value, for example, capitalisation, and negative amortisation.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.mmObject();
			codeName = "CAPI";
		}
	};
	final static private LinkedHashMap<String, CorporateActionEventTypeV2Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionEventTypeV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DRIP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventTypeV2Code";
				definition = "Specifies the corporate action event type.";
				derivation_lazy = () -> Arrays.asList(CorporateActionEventType3Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.DividendReinvestment, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.CapitalGainsDistribution,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.CashDividend, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.DividendOption,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.StockDividend, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.Merger,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.NameChange, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.SpinOff,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.StockSplit, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.ReverseStockSplit,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.Tender, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.BonusIssue,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.RightsDistribution, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.CallOnRights,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.Change, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.ExchangeOffer,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.DecreaseInValue, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.EarlyRedemption,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.FinalMaturity, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.InterestPayment,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.Prefunding, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.PrincipalAndInterestPaydown,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.Remarketing, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.Subscription,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.Attachment, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.Conversion,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.Detachment, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.ScripDividend,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.PariPassu, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.PriorityIssue,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.BidRepurchaseOffer, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.CallOnWarrants,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.OddLotSalePurchase, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.ClassActionProposedSettlement,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.ActiveTradingStatus, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.PutRedemption,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.Bankruptcy, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.NonUSTEFRADCertification,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.CourtMeeting, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.Consent,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.CompanyOption, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.CouponStripping,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.BondDefault, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.TradingStatusDelisted,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.Drawing, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.Disclosure,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.DutchAuction, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.MaturityExtension,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.IncreaseInValue, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.FullCall,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.AnnualGeneralMeeting, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.OrdinaryGeneralMeeting,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.OtherEvent, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.PartialRedemptionWithNominalValueReduction,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.PayInKind, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.PlaceOfIncorporation,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.InstalmentCall, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.PartialRedemptionWithoutNominalValueReduction,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.RemarketingAgreement, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.RightsIssue,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.SharesPremiumDividend, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.SmallestNegotiableUnit,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.TradingStatusSuspended, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.TaxReclaim,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.Worthless, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.WithholdingTaxReliefCertification,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.ExtraordinaryGeneralMeeting, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.Redenomination,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.LiquidationDividend, com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.ExchangeOption,
						com.tools20022.repository.codeset.CorporateActionEventTypeV2Code.Capitalisation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DividendReinvestment.getCodeName().get(), DividendReinvestment);
		codesByName.put(CapitalGainsDistribution.getCodeName().get(), CapitalGainsDistribution);
		codesByName.put(CashDividend.getCodeName().get(), CashDividend);
		codesByName.put(DividendOption.getCodeName().get(), DividendOption);
		codesByName.put(StockDividend.getCodeName().get(), StockDividend);
		codesByName.put(Merger.getCodeName().get(), Merger);
		codesByName.put(NameChange.getCodeName().get(), NameChange);
		codesByName.put(SpinOff.getCodeName().get(), SpinOff);
		codesByName.put(StockSplit.getCodeName().get(), StockSplit);
		codesByName.put(ReverseStockSplit.getCodeName().get(), ReverseStockSplit);
		codesByName.put(Tender.getCodeName().get(), Tender);
		codesByName.put(BonusIssue.getCodeName().get(), BonusIssue);
		codesByName.put(RightsDistribution.getCodeName().get(), RightsDistribution);
		codesByName.put(CallOnRights.getCodeName().get(), CallOnRights);
		codesByName.put(Change.getCodeName().get(), Change);
		codesByName.put(ExchangeOffer.getCodeName().get(), ExchangeOffer);
		codesByName.put(DecreaseInValue.getCodeName().get(), DecreaseInValue);
		codesByName.put(EarlyRedemption.getCodeName().get(), EarlyRedemption);
		codesByName.put(FinalMaturity.getCodeName().get(), FinalMaturity);
		codesByName.put(InterestPayment.getCodeName().get(), InterestPayment);
		codesByName.put(Prefunding.getCodeName().get(), Prefunding);
		codesByName.put(PrincipalAndInterestPaydown.getCodeName().get(), PrincipalAndInterestPaydown);
		codesByName.put(Remarketing.getCodeName().get(), Remarketing);
		codesByName.put(Subscription.getCodeName().get(), Subscription);
		codesByName.put(Attachment.getCodeName().get(), Attachment);
		codesByName.put(Conversion.getCodeName().get(), Conversion);
		codesByName.put(Detachment.getCodeName().get(), Detachment);
		codesByName.put(ScripDividend.getCodeName().get(), ScripDividend);
		codesByName.put(PariPassu.getCodeName().get(), PariPassu);
		codesByName.put(PriorityIssue.getCodeName().get(), PriorityIssue);
		codesByName.put(BidRepurchaseOffer.getCodeName().get(), BidRepurchaseOffer);
		codesByName.put(CallOnWarrants.getCodeName().get(), CallOnWarrants);
		codesByName.put(OddLotSalePurchase.getCodeName().get(), OddLotSalePurchase);
		codesByName.put(ClassActionProposedSettlement.getCodeName().get(), ClassActionProposedSettlement);
		codesByName.put(ActiveTradingStatus.getCodeName().get(), ActiveTradingStatus);
		codesByName.put(PutRedemption.getCodeName().get(), PutRedemption);
		codesByName.put(Bankruptcy.getCodeName().get(), Bankruptcy);
		codesByName.put(NonUSTEFRADCertification.getCodeName().get(), NonUSTEFRADCertification);
		codesByName.put(CourtMeeting.getCodeName().get(), CourtMeeting);
		codesByName.put(Consent.getCodeName().get(), Consent);
		codesByName.put(CompanyOption.getCodeName().get(), CompanyOption);
		codesByName.put(CouponStripping.getCodeName().get(), CouponStripping);
		codesByName.put(BondDefault.getCodeName().get(), BondDefault);
		codesByName.put(TradingStatusDelisted.getCodeName().get(), TradingStatusDelisted);
		codesByName.put(Drawing.getCodeName().get(), Drawing);
		codesByName.put(Disclosure.getCodeName().get(), Disclosure);
		codesByName.put(DutchAuction.getCodeName().get(), DutchAuction);
		codesByName.put(MaturityExtension.getCodeName().get(), MaturityExtension);
		codesByName.put(IncreaseInValue.getCodeName().get(), IncreaseInValue);
		codesByName.put(FullCall.getCodeName().get(), FullCall);
		codesByName.put(AnnualGeneralMeeting.getCodeName().get(), AnnualGeneralMeeting);
		codesByName.put(OrdinaryGeneralMeeting.getCodeName().get(), OrdinaryGeneralMeeting);
		codesByName.put(OtherEvent.getCodeName().get(), OtherEvent);
		codesByName.put(PartialRedemptionWithNominalValueReduction.getCodeName().get(), PartialRedemptionWithNominalValueReduction);
		codesByName.put(PayInKind.getCodeName().get(), PayInKind);
		codesByName.put(PlaceOfIncorporation.getCodeName().get(), PlaceOfIncorporation);
		codesByName.put(InstalmentCall.getCodeName().get(), InstalmentCall);
		codesByName.put(PartialRedemptionWithoutNominalValueReduction.getCodeName().get(), PartialRedemptionWithoutNominalValueReduction);
		codesByName.put(RemarketingAgreement.getCodeName().get(), RemarketingAgreement);
		codesByName.put(RightsIssue.getCodeName().get(), RightsIssue);
		codesByName.put(SharesPremiumDividend.getCodeName().get(), SharesPremiumDividend);
		codesByName.put(SmallestNegotiableUnit.getCodeName().get(), SmallestNegotiableUnit);
		codesByName.put(TradingStatusSuspended.getCodeName().get(), TradingStatusSuspended);
		codesByName.put(TaxReclaim.getCodeName().get(), TaxReclaim);
		codesByName.put(Worthless.getCodeName().get(), Worthless);
		codesByName.put(WithholdingTaxReliefCertification.getCodeName().get(), WithholdingTaxReliefCertification);
		codesByName.put(ExtraordinaryGeneralMeeting.getCodeName().get(), ExtraordinaryGeneralMeeting);
		codesByName.put(Redenomination.getCodeName().get(), Redenomination);
		codesByName.put(LiquidationDividend.getCodeName().get(), LiquidationDividend);
		codesByName.put(ExchangeOption.getCodeName().get(), ExchangeOption);
		codesByName.put(Capitalisation.getCodeName().get(), Capitalisation);
	}

	public static CorporateActionEventTypeV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionEventTypeV2Code[] values() {
		CorporateActionEventTypeV2Code[] values = new CorporateActionEventTypeV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionEventTypeV2Code> {
		@Override
		public CorporateActionEventTypeV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionEventTypeV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}