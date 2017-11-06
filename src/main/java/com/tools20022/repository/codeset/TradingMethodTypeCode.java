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
 * Identifies the type of trading method.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode#mmCentralizedPriceBidding
 * TradingMethodTypeCode.mmCentralizedPriceBidding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode#mmContinuousMatching
 * TradingMethodTypeCode.mmContinuousMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode#mmBilateralTrade
 * TradingMethodTypeCode.mmBilateralTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode#mmOneClickTrade
 * TradingMethodTypeCode.mmOneClickTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode#mmLimitOrder
 * TradingMethodTypeCode.mmLimitOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode#mmNegotiationTrade
 * TradingMethodTypeCode.mmNegotiationTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode#mmQuotationAuction
 * TradingMethodTypeCode.mmQuotationAuction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode#mmTenderingAuction
 * TradingMethodTypeCode.mmTenderingAuction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode#mmAnonymousClick
 * TradingMethodTypeCode.mmAnonymousClick}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TradingMethodType1Code
 * TradingMethodType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradingMethodTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the type of trading method."</li>
 * </ul>
 */
public class TradingMethodTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Members submit orders, and trading system uses matchmaking mechanism of
	 * Centralized Price Bidding to match orders.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode
	 * TradingMethodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CERB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralizedPriceBidding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Members submit orders, and trading system uses matchmaking mechanism of Centralized Price Bidding to match orders.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCentralizedPriceBidding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralizedPriceBidding";
			definition = "Members submit orders, and trading system uses matchmaking mechanism of Centralized Price Bidding to match orders.\r\n";
			owner_lazy = () -> TradingMethodTypeCode.mmObject();
			codeName = "CERB";
		}
	};
	/**
	 * Members submit orders, and trading system uses continuous matchmaking
	 * mechanism to match orders.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode
	 * TradingMethodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContinuousMatching"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Members submit orders, and trading system uses continuous matchmaking mechanism to match orders.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmContinuousMatching = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContinuousMatching";
			definition = "Members submit orders, and trading system uses continuous matchmaking mechanism to match orders.\r\n";
			owner_lazy = () -> TradingMethodTypeCode.mmObject();
			codeName = "CUMA";
		}
	};
	/**
	 * Taker submits a bilateral request, maker replys the quotation, and taker
	 * accepts the quotation to complete a bilateral trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode
	 * TradingMethodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BITR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilateralTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Taker submits a bilateral request, maker replys the quotation, and taker accepts the quotation to complete a bilateral trade."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBilateralTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralTrade";
			definition = "Taker submits a bilateral request, maker replys the quotation, and taker accepts the quotation to complete a bilateral trade.";
			owner_lazy = () -> TradingMethodTypeCode.mmObject();
			codeName = "BITR";
		}
	};
	/**
	 * When market makers quote continuously, members could just click the
	 * quotation to make a deal with market makers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode
	 * TradingMethodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ONCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneClickTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When market makers quote continuously, members could just click the quotation to make a deal with market makers."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOneClickTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneClickTrade";
			definition = "When market makers quote continuously, members could just click the quotation to make a deal with market makers.";
			owner_lazy = () -> TradingMethodTypeCode.mmObject();
			codeName = "ONCT";
		}
	};
	/**
	 * Member activate an order, and if order matches with market maker's
	 * quotationa, the order will be filled automatically.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode
	 * TradingMethodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Member activate an order, and if order matches with market maker's quotationa, the order will be filled automatically. "
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLimitOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitOrder";
			definition = "Member activate an order, and if order matches with market maker's quotationa, the order will be filled automatically. ";
			owner_lazy = () -> TradingMethodTypeCode.mmObject();
			codeName = "LIOR";
		}
	};
	/**
	 * Member completes product elements and submits, and the counterpart just
	 * confirms the deal to complete a negotiation trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode
	 * TradingMethodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NETR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegotiationTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Member completes product elements and submits, and the counterpart just confirms the deal to complete a negotiation trade."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNegotiationTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegotiationTrade";
			definition = "Member completes product elements and submits, and the counterpart just confirms the deal to complete a negotiation trade.";
			owner_lazy = () -> TradingMethodTypeCode.mmObject();
			codeName = "NETR";
		}
	};
	/**
	 * Market members can click the predetermined price setted by issuer to make
	 * a deal， and then the subscription amount will deduct in time.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode
	 * TradingMethodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QUAU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotationAuction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Market members can click the predetermined price setted by issuer to make a deal， and then the subscription amount will deduct in time.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmQuotationAuction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotationAuction";
			definition = "Market members can click the predetermined price setted by issuer to make a deal， and then the subscription amount will deduct in time.\r\n";
			owner_lazy = () -> TradingMethodTypeCode.mmObject();
			codeName = "QUAU";
		}
	};
	/**
	 * Administrator reviews the deposit that filled by issuer, and sends it to
	 * the tenderers as reference. Atfer this, the issuer confirms the tendering
	 * result.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode
	 * TradingMethodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TEAU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderingAuction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Administrator reviews the deposit that filled by issuer, and sends it to the tenderers as reference. Atfer this, the issuer confirms the tendering result.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTenderingAuction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderingAuction";
			definition = "Administrator reviews the deposit that filled by issuer, and sends it to the tenderers as reference. Atfer this, the issuer confirms the tendering result.\r\n";
			owner_lazy = () -> TradingMethodTypeCode.mmObject();
			codeName = "TEAU";
		}
	};
	/**
	 * Trades are executed any click anonymously.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode
	 * TradingMethodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ANCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnonymousClick"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trades are executed any click anonymously."</li>
	 * </ul>
	 */
	public static final MMCode mmAnonymousClick = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnonymousClick";
			definition = "Trades are executed any click anonymously.";
			owner_lazy = () -> TradingMethodTypeCode.mmObject();
			codeName = "ANCL";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradingMethodTypeCode";
				definition = "Identifies the type of trading method.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradingMethodTypeCode.mmCentralizedPriceBidding, com.tools20022.repository.codeset.TradingMethodTypeCode.mmContinuousMatching,
						com.tools20022.repository.codeset.TradingMethodTypeCode.mmBilateralTrade, com.tools20022.repository.codeset.TradingMethodTypeCode.mmOneClickTrade,
						com.tools20022.repository.codeset.TradingMethodTypeCode.mmLimitOrder, com.tools20022.repository.codeset.TradingMethodTypeCode.mmNegotiationTrade,
						com.tools20022.repository.codeset.TradingMethodTypeCode.mmQuotationAuction, com.tools20022.repository.codeset.TradingMethodTypeCode.mmTenderingAuction,
						com.tools20022.repository.codeset.TradingMethodTypeCode.mmAnonymousClick);
				derivation_lazy = () -> Arrays.asList(TradingMethodType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}