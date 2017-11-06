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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies in what capacity (role) the originator of a quote is acting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OriginatorRoleCode#mmSystematicInternaliser
 * OriginatorRoleCode.mmSystematicInternaliser}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OriginatorRoleCode#mmMultilateralTradingFacility
 * OriginatorRoleCode.mmMultilateralTradingFacility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OriginatorRoleCode#mmRegulatedMarket
 * OriginatorRoleCode.mmRegulatedMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OriginatorRoleCode#mmMarketMaker
 * OriginatorRoleCode.mmMarketMaker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OriginatorRoleCode#mmInvestor
 * OriginatorRoleCode.mmInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OriginatorRoleCode#mmTransfertAgent
 * OriginatorRoleCode.mmTransfertAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OriginatorRole2Code
 * OriginatorRole2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OriginatorRole1Code
 * OriginatorRole1Code}</li>
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
 * <li>"SINT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OriginatorRoleCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies in what capacity (role) the originator of a quote is acting."</li>
 * </ul>
 */
public class OriginatorRoleCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Firms which, on an organised, frequent and systematic basis deal on their
	 * own account by executing client orders outside a regulated market or a
	 * Multilateral Trading Facility. SI's will have the obligation to provide,
	 * and make public, a definite bid and offer quote for liquid securities.
	 * They act as "mini"exchanges.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OriginatorRoleCode
	 * OriginatorRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SINT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystematicInternaliser"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Firms which, on an organised, frequent and systematic basis deal on their own account by executing client orders outside a regulated market or a Multilateral Trading Facility. SI's will have the obligation to provide, and make public, a definite bid and offer quote for liquid securities. They act as \"mini\"exchanges."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSystematicInternaliser = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystematicInternaliser";
			definition = "Firms which, on an organised, frequent and systematic basis deal on their own account by executing client orders outside a regulated market or a Multilateral Trading Facility. SI's will have the obligation to provide, and make public, a definite bid and offer quote for liquid securities. They act as \"mini\"exchanges.";
			owner_lazy = () -> OriginatorRoleCode.mmObject();
			codeName = "SINT";
		}
	};
	/**
	 * Multilateral system which brings together multiple third-party buying and
	 * selling interests in financial instruments in a way that results in a
	 * contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OriginatorRoleCode
	 * OriginatorRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MLTF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultilateralTradingFacility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Multilateral system which brings together multiple third-party buying and selling interests in financial instruments in a way that results in a contract."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMultilateralTradingFacility = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MultilateralTradingFacility";
			definition = "Multilateral system which brings together multiple third-party buying and selling interests in financial instruments in a way that results in a contract.";
			owner_lazy = () -> OriginatorRoleCode.mmObject();
			codeName = "MLTF";
		}
	};
	/**
	 * Market on which financial instruments can be traded according to rules
	 * defined by the stock exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OriginatorRoleCode
	 * OriginatorRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RMKT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatedMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Market on which financial instruments can be traded according to rules defined by the stock exchange."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRegulatedMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegulatedMarket";
			definition = "Market on which financial instruments can be traded according to rules defined by the stock exchange.";
			owner_lazy = () -> OriginatorRoleCode.mmObject();
			codeName = "RMKT";
		}
	};
	/**
	 * Dealer or specialist that is trading for their own account in the OTC
	 * market. Market makers are expected to maintain an orderly market by being
	 * available to buy or sell.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OriginatorRoleCode
	 * OriginatorRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MKTM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketMaker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dealer or specialist that is trading for their own account in the OTC market. Market makers are expected to maintain an orderly market by being available to buy or sell."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMarketMaker = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketMaker";
			definition = "Dealer or specialist that is trading for their own account in the OTC market. Market makers are expected to maintain an orderly market by being available to buy or sell.";
			owner_lazy = () -> OriginatorRoleCode.mmObject();
			codeName = "MKTM";
		}
	};
	/**
	 * Party, either an individual or organisation, whose assets are being
	 * invested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OriginatorRoleCode
	 * OriginatorRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party, either an individual or organisation, whose assets are being invested."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvestor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Investor";
			definition = "Party, either an individual or organisation, whose assets are being invested.";
			owner_lazy = () -> OriginatorRoleCode.mmObject();
			codeName = "INVE";
		}
	};
	/**
	 * Party appointed by the fund management company. It updates records of
	 * investor accounts to reflect the daily investor purchases, redemptions,
	 * switches, transfers, and re-registrations. It ensures the timely
	 * settlement of transactions, and may provide tax information to the
	 * investor and/or to its intermediaries. It may calculate, collect, and
	 * rebate commissions. It prepares and distributes confirmations reflecting
	 * transactions, resulting in unit or cash account movements to the investor
	 * or the investor's intermediary. It responds to inquiries concerning
	 * account status, and processes the income distribution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OriginatorRoleCode
	 * OriginatorRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAGT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransfertAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party appointed by the fund management company. It updates records of investor accounts to reflect the daily investor purchases, redemptions, switches, transfers, and re-registrations. It ensures the timely settlement of transactions, and may provide tax information to the investor and/or to its intermediaries. It may calculate, collect, and rebate commissions. It prepares and distributes confirmations reflecting transactions, resulting in unit or cash account movements to the investor or the investor's intermediary. It responds to inquiries concerning account status, and processes the income distribution."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTransfertAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransfertAgent";
			definition = "Party appointed by the fund management company. It updates records of investor accounts to reflect the daily investor purchases, redemptions, switches, transfers, and re-registrations. It ensures the timely settlement of transactions, and may provide tax information to the investor and/or to its intermediaries. It may calculate, collect, and rebate commissions. It prepares and distributes confirmations reflecting transactions, resulting in unit or cash account movements to the investor or the investor's intermediary. It responds to inquiries concerning account status, and processes the income distribution.";
			owner_lazy = () -> OriginatorRoleCode.mmObject();
			codeName = "TAGT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("SINT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OriginatorRoleCode";
				definition = "Specifies in what capacity (role) the originator of a quote is acting.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OriginatorRoleCode.mmSystematicInternaliser, com.tools20022.repository.codeset.OriginatorRoleCode.mmMultilateralTradingFacility,
						com.tools20022.repository.codeset.OriginatorRoleCode.mmRegulatedMarket, com.tools20022.repository.codeset.OriginatorRoleCode.mmMarketMaker, com.tools20022.repository.codeset.OriginatorRoleCode.mmInvestor,
						com.tools20022.repository.codeset.OriginatorRoleCode.mmTransfertAgent);
				derivation_lazy = () -> Arrays.asList(OriginatorRole2Code.mmObject(), OriginatorRole1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}