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
 * Specifies the type of foreign exchange trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ForeignExchangeTradeTypeCode#Trade
 * ForeignExchangeTradeTypeCode.Trade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ForeignExchangeTradeTypeCode#Swap
 * ForeignExchangeTradeTypeCode.Swap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ForeignExchangeTradeTypeCode#Opening
 * ForeignExchangeTradeTypeCode.Opening}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ForeignExchangeTradeTypeCode#PartialClosing
 * ForeignExchangeTradeTypeCode.PartialClosing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ForeignExchangeTradeTypeCode#FinalClosing
 * ForeignExchangeTradeTypeCode.FinalClosing}</li>
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
 * <li>"CONF"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForeignExchangeTradeTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of foreign exchange trade."</li>
 * </ul>
 */
public class ForeignExchangeTradeTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the trade is a spot or forward agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ForeignExchangeTradeTypeCode
	 * ForeignExchangeTradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the trade is a spot or forward agreement."</li>
	 * </ul>
	 */
	public static final MMCode Trade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Trade";
			definition = "Indicates that the trade is a spot or forward agreement.";
			owner_lazy = () -> ForeignExchangeTradeTypeCode.mmObject();
			codeName = "CONF";
		}
	};
	/**
	 * Trade is part of a swap agreement
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ForeignExchangeTradeTypeCode
	 * ForeignExchangeTradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is part of a swap agreement"</li>
	 * </ul>
	 */
	public static final MMCode Swap = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Swap";
			definition = "Trade is part of a swap agreement";
			owner_lazy = () -> ForeignExchangeTradeTypeCode.mmObject();
			codeName = "SWAP";
		}
	};
	/**
	 * Trade is eligible to be closed by one or more 'reverse' trades, ie, in
	 * the opposite direction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ForeignExchangeTradeTypeCode
	 * ForeignExchangeTradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Opening"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade is eligible to be closed by one or more 'reverse' trades, ie, in the opposite direction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Opening = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Opening";
			definition = "Trade is eligible to be closed by one or more 'reverse' trades, ie, in the opposite direction.";
			owner_lazy = () -> ForeignExchangeTradeTypeCode.mmObject();
			codeName = "OPEN";
		}
	};
	/**
	 * Trade is a partial closing of another trade, for the same pair of
	 * currencies, and for the same value date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ForeignExchangeTradeTypeCode
	 * ForeignExchangeTradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PCLO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialClosing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade is a partial closing of another trade, for the same pair of currencies, and for the same value date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PartialClosing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "PartialClosing";
			definition = "Trade is a partial closing of another trade, for the same pair of currencies, and for the same value date.";
			owner_lazy = () -> ForeignExchangeTradeTypeCode.mmObject();
			codeName = "PCLO";
		}
	};
	/**
	 * Trade is the final closing of another trade, ie, in the opposite
	 * direction, for the same pair of currencies and for the same value date.
	 * This trade agreement contains the net settlement amount that has to be
	 * paid by one of the parties as a result of netting of several agreements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ForeignExchangeTradeTypeCode
	 * ForeignExchangeTradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCLO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalClosing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade is the final closing of another trade, ie, in the opposite direction, for the same pair of currencies and for the same value date. This trade agreement contains the net settlement amount that has to be paid by one of the parties as a result of netting of several agreements."
	 * </li>
	 * </ul>
	 */
	public static final MMCode FinalClosing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "FinalClosing";
			definition = "Trade is the final closing of another trade, ie, in the opposite direction, for the same pair of currencies and for the same value date. This trade agreement contains the net settlement amount that has to be paid by one of the parties as a result of netting of several agreements.";
			owner_lazy = () -> ForeignExchangeTradeTypeCode.mmObject();
			codeName = "FCLO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CONF");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				name = "ForeignExchangeTradeTypeCode";
				definition = "Specifies the type of foreign exchange trade.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ForeignExchangeTradeTypeCode.Trade, com.tools20022.repository.codeset.ForeignExchangeTradeTypeCode.Swap,
						com.tools20022.repository.codeset.ForeignExchangeTradeTypeCode.Opening, com.tools20022.repository.codeset.ForeignExchangeTradeTypeCode.PartialClosing,
						com.tools20022.repository.codeset.ForeignExchangeTradeTypeCode.FinalClosing);
			}
		});
		return mmObject_lazy.get();
	}
}