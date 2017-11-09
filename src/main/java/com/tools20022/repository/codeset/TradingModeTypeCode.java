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
 * Identifies the type of the trading mode.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TradingModeType1Code
 * TradingModeType1Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingModeTypeCode#mmQuotationDriven
 * TradingModeTypeCode.mmQuotationDriven}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingModeTypeCode#mmOrderDriven
 * TradingModeTypeCode.mmOrderDriven}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingModeTypeCode#mmNegotiationTrade
 * TradingModeTypeCode.mmNegotiationTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingModeTypeCode#mmAuction
 * TradingModeTypeCode.mmAuction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingModeTypeCode#mmBilateral
 * TradingModeTypeCode.mmBilateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingModeTypeCode#mmAnonymous
 * TradingModeTypeCode.mmAnonymous}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingModeTypeCode#mmMatching
 * TradingModeTypeCode.mmMatching}</li>
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
 * "TradingModeTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the type of the trading mode."</li>
 * </ul>
 */
public class TradingModeTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Members could click When market makers quote continuously,or enter RFQ
	 * trading process, and make a deal with market makers finally.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingModeTypeCode
	 * TradingModeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QUDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotationDriven"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Members could click When market makers quote continuously,or enter RFQ trading process, and make a deal with market makers finally."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmQuotationDriven = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotationDriven";
			definition = "Members could click When market makers quote continuously,or enter RFQ trading process, and make a deal with market makers finally.";
			owner_lazy = () -> TradingModeTypeCode.mmObject();
			codeName = "QUDR";
		}
	};
	/**
	 * Using matchmaking mechanism to match orders which are submitted by
	 * members.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingModeTypeCode
	 * TradingModeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDriven"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Using matchmaking mechanism to match orders which are submitted by members."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOrderDriven = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDriven";
			definition = "Using matchmaking mechanism to match orders which are submitted by members.";
			owner_lazy = () -> TradingModeTypeCode.mmObject();
			codeName = "ORDR";
		}
	};
	/**
	 * Members send advertisements, and then other members could enter
	 * negotiation trade process. In the negotiation trade process, the member
	 * completes product elements and submits, and the counterpart just confirms
	 * the deal to make a negotiation trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingModeTypeCode
	 * TradingModeTypeCode}</li>
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
	 * "Members send advertisements, and then other members could enter negotiation trade process. In the negotiation trade process, the member completes product elements and submits, and the counterpart just confirms the deal to make a negotiation trade."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNegotiationTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegotiationTrade";
			definition = "Members send advertisements, and then other members could enter negotiation trade process. In the negotiation trade process, the member completes product elements and submits, and the counterpart just confirms the deal to make a negotiation trade.";
			owner_lazy = () -> TradingModeTypeCode.mmObject();
			codeName = "NETR";
		}
	};
	/**
	 * When issuer issues the deposits, market members subscribe the deposits.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingModeTypeCode
	 * TradingModeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Auction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When issuer issues the deposits, market members subscribe the deposits.  "
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAuction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Auction";
			definition = "When issuer issues the deposits, market members subscribe the deposits.  ";
			owner_lazy = () -> TradingModeTypeCode.mmObject();
			codeName = "AUCT";
		}
	};
	/**
	 * Counterparties neogiate trading details to execute trades. .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingModeTypeCode
	 * TradingModeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BILA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bilateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparties neogiate trading details to execute trades. ."</li>
	 * </ul>
	 */
	public static final MMCode mmBilateral = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bilateral";
			definition = "Counterparties neogiate trading details to execute trades. .";
			owner_lazy = () -> TradingModeTypeCode.mmObject();
			codeName = "BILA";
		}
	};
	/**
	 * Trades are executed anonymously to each counterparty, based on rule
	 * "pritority of price and time" to match trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingModeTypeCode
	 * TradingModeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ANON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Anonymous"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trades are executed anonymously to each counterparty, based on rule \"pritority of price and time\" to match trade."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAnonymous = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Anonymous";
			definition = "Trades are executed anonymously to each counterparty, based on rule \"pritority of price and time\" to match trade.";
			owner_lazy = () -> TradingModeTypeCode.mmObject();
			codeName = "ANON";
		}
	};
	/**
	 * Trades are executed through matching system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingModeTypeCode
	 * TradingModeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MARC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Matching"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trades are executed through matching system."</li>
	 * </ul>
	 */
	public static final MMCode mmMatching = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Matching";
			definition = "Trades are executed through matching system.";
			owner_lazy = () -> TradingModeTypeCode.mmObject();
			codeName = "MARC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradingModeTypeCode";
				definition = "Identifies the type of the trading mode.";
				code_lazy = () -> Arrays.asList(TradingModeTypeCode.mmQuotationDriven, TradingModeTypeCode.mmOrderDriven, TradingModeTypeCode.mmNegotiationTrade, TradingModeTypeCode.mmAuction, TradingModeTypeCode.mmBilateral,
						TradingModeTypeCode.mmAnonymous, TradingModeTypeCode.mmMatching);
				derivation_lazy = () -> Arrays.asList(TradingModeType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}