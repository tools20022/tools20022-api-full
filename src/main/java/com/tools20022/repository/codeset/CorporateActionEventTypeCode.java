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
 * Specifies the type of corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmDividendReinvestment
 * CorporateActionEventTypeCode.mmDividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmCapitalGainsDistribution
 * CorporateActionEventTypeCode.mmCapitalGainsDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmCashDividend
 * CorporateActionEventTypeCode.mmCashDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmDividendOption
 * CorporateActionEventTypeCode.mmDividendOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmStockDividend
 * CorporateActionEventTypeCode.mmStockDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmLiquidation
 * CorporateActionEventTypeCode.mmLiquidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmMerger
 * CorporateActionEventTypeCode.mmMerger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmNameChange
 * CorporateActionEventTypeCode.mmNameChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmSpinOff
 * CorporateActionEventTypeCode.mmSpinOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmStockSplit
 * CorporateActionEventTypeCode.mmStockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmReverseStockSplit
 * CorporateActionEventTypeCode.mmReverseStockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmTender
 * CorporateActionEventTypeCode.mmTender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmBonusIssue
 * CorporateActionEventTypeCode.mmBonusIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmRightsDistribution
 * CorporateActionEventTypeCode.mmRightsDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmCallOnRights
 * CorporateActionEventTypeCode.mmCallOnRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmChange
 * CorporateActionEventTypeCode.mmChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmRedenomination
 * CorporateActionEventTypeCode.mmRedenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmExchangeOption
 * CorporateActionEventTypeCode.mmExchangeOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmExchangeOffer
 * CorporateActionEventTypeCode.mmExchangeOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmDecreaseInValue
 * CorporateActionEventTypeCode.mmDecreaseInValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmEarlyRedemption
 * CorporateActionEventTypeCode.mmEarlyRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmFinalMaturity
 * CorporateActionEventTypeCode.mmFinalMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmInterestPayment
 * CorporateActionEventTypeCode.mmInterestPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmPrefunding
 * CorporateActionEventTypeCode.mmPrefunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmPrincipalAndInterestPaydown
 * CorporateActionEventTypeCode.mmPrincipalAndInterestPaydown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmRemarketing
 * CorporateActionEventTypeCode.mmRemarketing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmSubscription
 * CorporateActionEventTypeCode.mmSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmAttachment
 * CorporateActionEventTypeCode.mmAttachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmConversion
 * CorporateActionEventTypeCode.mmConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmDetachment
 * CorporateActionEventTypeCode.mmDetachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmScripDividend
 * CorporateActionEventTypeCode.mmScripDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmPariPassu
 * CorporateActionEventTypeCode.mmPariPassu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmPriorityIssue
 * CorporateActionEventTypeCode.mmPriorityIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmBidRepurchaseOffer
 * CorporateActionEventTypeCode.mmBidRepurchaseOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmCallOnWarrants
 * CorporateActionEventTypeCode.mmCallOnWarrants}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode#mmOddLotSalePurchase
 * CorporateActionEventTypeCode.mmOddLotSalePurchase}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code
 * CorporateActionEventType1Code}</li>
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
 * "CorporateActionEventTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of corporate action event."</li>
 * </ul>
 */
public class CorporateActionEventTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Event is a dividend payment type where cash dividend is rolled over into
	 * additional shares in the issuing company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRIP"</li>
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
	public static final MMCode mmDividendReinvestment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DividendReinvestment";
			definition = "Event is a dividend payment type where cash dividend is rolled over into additional shares in the issuing company.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAPG"</li>
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
	public static final MMCode mmCapitalGainsDistribution = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CapitalGainsDistribution";
			definition = "Event is the distribution of profits resulting from the sale of securities. Shareholders of mutual funds, unit trusts, or Sicavs are recipients of capital gains distributions and are often reinvested in additional shares of the fund.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVCA"</li>
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
	public static final MMCode mmCashDividend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashDividend";
			definition = "Event is a distribution of cash to shareholders, in proportion to their equity holding. Ordinary dividends are recurring and regular. The shareholder must take cash and is not offered a choice in the form of distribution.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVOP"</li>
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
	public static final MMCode mmDividendOption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DividendOption";
			definition = "Event is a distribution of a dividend to shareholders with the choice of payment method. The shareholder must choose the form of payment - stock, cash, or both.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVSE"</li>
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
	public static final MMCode mmStockDividend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StockDividend";
			definition = "Event is a dividend paid to shareholders in the form of shares of stock in the issuing company or in another company. The shareholder must take stock and is not offered a choice in the form of distribution.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
			codeName = "DVSE";
		}
	};
	/**
	 * Event is a liquidating dividend or liquidation that consists of a
	 * distribution of cash, assets, or both. Debt may be paid in order of
	 * priority based on preferred claims to assets specified by the security.
	 * The security holder may be able to choose the form of liquidation
	 * distribution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIQU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Liquidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a liquidating dividend or liquidation that consists of a distribution of cash, assets, or both. Debt may be paid in order of priority based on preferred claims to assets specified by the security. The security holder may be able to choose the form of liquidation distribution."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLiquidation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Liquidation";
			definition = "Event is a liquidating dividend or liquidation that consists of a distribution of cash, assets, or both. Debt may be paid in order of priority based on preferred claims to assets specified by the security. The security holder may be able to choose the form of liquidation distribution.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MRGR"</li>
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
	public static final MMCode mmMerger = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Merger";
			definition = "Event is a mandatory or voluntary exchange of outstanding securities as the result of two or more companies combining assets. Cash payments may accompany share exchange.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NAME"</li>
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
	public static final MMCode mmNameChange = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NameChange";
			definition = "Event is a name change. The issuing company changes its name. The event shows the change from old name to new name and may involve surrendering physical shares with the old name to the registrar.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOFF"</li>
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
	public static final MMCode mmSpinOff = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpinOff";
			definition = "Event is a demerger or distribution or an unbundling. It is a distribution of subsidiary stock to the shareholders of the parent company without a surrender of shares. A spin-off represents a form of divestiture resulting in an independent company. Normally this is without cost to the parent issue shareholder.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPLF"</li>
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
	public static final MMCode mmStockSplit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StockSplit";
			definition = "Event is a change in nominal value, a subdivision. It is an increase in a corporation's number of outstanding shares of stock without any change in the shareholder's equity or the aggregate market value at the time of the split. Stock price and nominal value are reduced accordingly.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPLR"</li>
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
	public static final MMCode mmReverseStockSplit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReverseStockSplit";
			definition = "Event is a change in nominal value, a consolidation. It is a decrease in number of outstanding shares of stock without any change in the shareholder's equity or the aggregate market value at the time of the split. Stock price and nominal value are reduced accordingly.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TEND"</li>
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
	public static final MMCode mmTender = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tender";
			definition = "Event is an acquisition or take-over or offre publique de retrait (FR) or purchase offer or buy-back. It is an offer made to shareholders requesting them to sell (tender) their shares for a specified price usually at a premium over prevailing market price. Generally, the objective of a tender offer is to take control of the target company.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BONU"</li>
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
	public static final MMCode mmBonusIssue = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BonusIssue";
			definition = "Event is a bonus issue or scrip issue or capitalisation issue. Security holders are awarded additional assets free of payment from the issuer in proportion to their holding. A bonus issue is typically represented by shares, rights or warrants. Nominal value doesn't change. Holder may be offered choice of form.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RHDI"</li>
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
	public static final MMCode mmRightsDistribution = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RightsDistribution";
			definition = "Event is the distribution of rights to shareholders, in proportion to their equity holding.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXRI"</li>
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
	public static final MMCode mmCallOnRights = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CallOnRights";
			definition = "Event is a call or exercise on nil-paid securities or rights resulting from a rights distribution (RHDI). This is to be used for the second event in those cases where the rights issue is dealt with in two events, the first event being the rights distribution (RHDI).";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHAN"</li>
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
	public static final MMCode mmChange = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Change";
			definition = "Event is a generic change. For example,  a change in the terms of an issue, a change in the identification of a security, change of a board lot, a change from global to definitive.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
			codeName = "CHAN";
		}
	};
	/**
	 * Event by which the unit (currency and/or nominal) of a financial
	 * instrument is restated, eg, the debt in a national currency is restated
	 * in euro.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REDO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redenomination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event by which the unit (currency and/or nominal) of a financial instrument is restated, eg, the debt in a national currency is restated in euro."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRedenomination = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Redenomination";
			definition = "Event by which the unit (currency and/or nominal) of a financial instrument is restated, eg, the debt in a national currency is restated in euro.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXOP"</li>
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
	public static final MMCode mmExchangeOption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExchangeOption";
			definition = "Event is an option for the shareholders to exchange their securities for other securities and/or cash. Exchange options are mentioned in the terms and conditions of a security and are valid during the whole lifetime of a security.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
			codeName = "EXOP";
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXOF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeOffer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is an exchange offer or capital reorganisation.\nIt is an offer to shareholders to exchange their holdings for other securities and/or cash. Exchange offers are usually voluntary involving the exchange of outstanding security for a different security or securities and/or cash."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmExchangeOffer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExchangeOffer";
			definition = "Event is an exchange offer or capital reorganisation.\nIt is an offer to shareholders to exchange their holdings for other securities and/or cash. Exchange offers are usually voluntary involving the exchange of outstanding security for a different security or securities and/or cash.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DECR"</li>
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
	public static final MMCode mmDecreaseInValue = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DecreaseInValue";
			definition = "Event is a reduction of the share capital and face value of a single share. The number of the circulating shares remains unchanged. It may include a capital pay-out to shareholder.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
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
	 * "This includes drawing, partial and full call, put.\nRedemption in part or full before the scheduled final maturity date of a security, subject to the terms and conditions of the issue. \nDrawing - Securities are redeemed in part by lottery.\nPartial Call - Securities are redeemed in part by reducing proportionally the outstanding amount of securities.\nPut - Early redemption of a bond at the election of the bondholder.\nFull Call - The entire outstanding of a security is redeemed by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEarlyRedemption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EarlyRedemption";
			definition = "This includes drawing, partial and full call, put.\nRedemption in part or full before the scheduled final maturity date of a security, subject to the terms and conditions of the issue. \nDrawing - Securities are redeemed in part by lottery.\nPartial Call - Securities are redeemed in part by reducing proportionally the outstanding amount of securities.\nPut - Early redemption of a bond at the election of the bondholder.\nFull Call - The entire outstanding of a security is redeemed by the issuer.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
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
	public static final MMCode mmFinalMaturity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinalMaturity";
			definition = "Redemption of an entire issue outstanding of securities by the issuer at final maturity.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
			codeName = "REDM";
		}
	};
	/**
	 * Interest payment distributed to holders of an interest bearing asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
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
	public static final MMCode mmInterestPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestPayment";
			definition = "Interest payment distributed to holders of an interest bearing asset.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
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
	public static final MMCode mmPrefunding = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Prefunding";
			definition = "Also called partial defeasance. Issuer has money set aside to redeem a portion of an issue and the indenture states that the securities could be called earlier than the stated maturity.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
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
	public static final MMCode mmPrincipalAndInterestPaydown = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrincipalAndInterestPaydown";
			definition = "A payment of a portion of the principal of an interest bearing asset, in addition to the interest payment.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
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
	public static final MMCode mmRemarketing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Remarketing";
			definition = "Purchase and sale of remarketed preferred equities/bonds through the negotiation of interest rate between the issuers and the holders.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
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
	public static final MMCode mmSubscription = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Subscription";
			definition = "The ability for security holders to purchase (additional or new) securities at a certain price, in proportion to their holding.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
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
	public static final MMCode mmAttachment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Attachment";
			definition = "The combination of different security types to create a unit. Units are usually comprised of warrants and bond or warrants and equity. Securities may be combined at the request of the security holder or based on market convention.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
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
	public static final MMCode mmConversion = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Conversion";
			definition = "Conversion of securities (generally convertible bonds or preferred shares) into another form of securities (usually common shares) at a pre-stated price.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
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
	public static final MMCode mmDetachment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Detachment";
			definition = "Separation of components that comprise a security usually units comprised of warrants and bond or warrants and equity. Units may be broken up at the request of the security holder or based on market convention.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
			codeName = "DETI";
		}
	};
	/**
	 * Dividend or interest paid in the form of scrip.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
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
	public static final MMCode mmScripDividend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ScripDividend";
			definition = "Dividend or interest paid in the form of scrip.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
			codeName = "DVSC";
		}
	};
	/**
	 * Also called Assimilation or Enfranchisement. Occurs when securities with
	 * different characteristics, for example, equities with different
	 * entitlements to dividend or voting rights, are assimilated, ie, become
	 * identical in all respects. The event may be scheduled in advance or be
	 * the result of an outside event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
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
	 * "Also called Assimilation or Enfranchisement. Occurs when securities with different characteristics, for example, equities with different entitlements to dividend or voting rights, are assimilated, ie, become identical in all respects. The event may be scheduled in advance or be the result of an outside event."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPariPassu = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PariPassu";
			definition = "Also called Assimilation or Enfranchisement. Occurs when securities with different characteristics, for example, equities with different entitlements to dividend or voting rights, are assimilated, ie, become identical in all respects. The event may be scheduled in advance or be the result of an outside event.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
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
	public static final MMCode mmPriorityIssue = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriorityIssue";
			definition = "Form of open or public offer where priority is given to existing shareholders due to limited amount of securities available in the offer. Shareholders can buy a type of security during a short period of time.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
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
	 * "Also called Issuer Bid or Reverse Rights.\nOffer to existing shareholders by the issuing company to repurchase equity or other securities convertible into equity. The objective of the offer is to reduce the number of outstanding equities."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBidRepurchaseOffer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BidRepurchaseOffer";
			definition = "Also called Issuer Bid or Reverse Rights.\nOffer to existing shareholders by the issuing company to repurchase equity or other securities convertible into equity. The objective of the offer is to reduce the number of outstanding equities.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
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
	public static final MMCode mmCallOnWarrants = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CallOnWarrants";
			definition = "Warrant conversion. Option offered to security holders to buy (call warrant) or to sell (put warrant) a specific amount of stock, cash, or commodity, at a predetermined price, during a predetermined period of time (which usually corresponds to the life of the issue).";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
	 * CorporateActionEventTypeCode}</li>
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
	public static final MMCode mmOddLotSalePurchase = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OddLotSalePurchase";
			definition = "Sale to or purchase of odd-lots from the issuing company, initiated either by the holder of the security or through an offer made by the issuer.";
			owner_lazy = () -> CorporateActionEventTypeCode.mmObject();
			codeName = "ODLT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("DRIP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventTypeCode";
				definition = "Specifies the type of corporate action event.";
				code_lazy = () -> Arrays.asList(CorporateActionEventTypeCode.mmDividendReinvestment, CorporateActionEventTypeCode.mmCapitalGainsDistribution, CorporateActionEventTypeCode.mmCashDividend,
						CorporateActionEventTypeCode.mmDividendOption, CorporateActionEventTypeCode.mmStockDividend, CorporateActionEventTypeCode.mmLiquidation, CorporateActionEventTypeCode.mmMerger,
						CorporateActionEventTypeCode.mmNameChange, CorporateActionEventTypeCode.mmSpinOff, CorporateActionEventTypeCode.mmStockSplit, CorporateActionEventTypeCode.mmReverseStockSplit, CorporateActionEventTypeCode.mmTender,
						CorporateActionEventTypeCode.mmBonusIssue, CorporateActionEventTypeCode.mmRightsDistribution, CorporateActionEventTypeCode.mmCallOnRights, CorporateActionEventTypeCode.mmChange,
						CorporateActionEventTypeCode.mmRedenomination, CorporateActionEventTypeCode.mmExchangeOption, CorporateActionEventTypeCode.mmExchangeOffer, CorporateActionEventTypeCode.mmDecreaseInValue,
						CorporateActionEventTypeCode.mmEarlyRedemption, CorporateActionEventTypeCode.mmFinalMaturity, CorporateActionEventTypeCode.mmInterestPayment, CorporateActionEventTypeCode.mmPrefunding,
						CorporateActionEventTypeCode.mmPrincipalAndInterestPaydown, CorporateActionEventTypeCode.mmRemarketing, CorporateActionEventTypeCode.mmSubscription, CorporateActionEventTypeCode.mmAttachment,
						CorporateActionEventTypeCode.mmConversion, CorporateActionEventTypeCode.mmDetachment, CorporateActionEventTypeCode.mmScripDividend, CorporateActionEventTypeCode.mmPariPassu,
						CorporateActionEventTypeCode.mmPriorityIssue, CorporateActionEventTypeCode.mmBidRepurchaseOffer, CorporateActionEventTypeCode.mmCallOnWarrants, CorporateActionEventTypeCode.mmOddLotSalePurchase);
				derivation_lazy = () -> Arrays.asList(CorporateActionEventType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}