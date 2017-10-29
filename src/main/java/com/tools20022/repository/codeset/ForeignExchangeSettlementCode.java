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
 * Specifies the method to be used to settle a foreign exchange trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ForeignExchangeSettlementCode#CLS
 * ForeignExchangeSettlementCode.CLS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ForeignExchangeSettlementCode#Net
 * ForeignExchangeSettlementCode.Net}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ForeignExchangeSettlementCode#Gross
 * ForeignExchangeSettlementCode.Gross}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ForeignExchangeSettlementCode#Split
 * ForeignExchangeSettlementCode.Split}</li>
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
 * <li>"CLSB"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForeignExchangeSettlementCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the method to be used to settle a foreign exchange trade."</li>
 * </ul>
 */
public class ForeignExchangeSettlementCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement is done through the Continuous Link Settlement (CLS) Bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ForeignExchangeSettlementCode
	 * ForeignExchangeSettlementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLSB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CLS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement is done through the Continuous Link Settlement (CLS) Bank."</li>
	 * </ul>
	 */
	public static final MMCode CLS = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "CLS";
			definition = "Settlement is done through the Continuous Link Settlement (CLS) Bank.";
			owner_lazy = () -> ForeignExchangeSettlementCode.mmObject();
			codeName = "CLSB";
		}
	};
	/**
	 * Settlement done by netting amounts (for trades in the same currency and
	 * for the same value date).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ForeignExchangeSettlementCode
	 * ForeignExchangeSettlementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NETA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Net"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement done by netting amounts (for trades in the same currency and for the same value date)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Net = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Net";
			definition = "Settlement done by netting amounts (for trades in the same currency and for the same value date).";
			owner_lazy = () -> ForeignExchangeSettlementCode.mmObject();
			codeName = "NETA";
		}
	};
	/**
	 * Each trade is settled by a single entry to the account of the
	 * beneficiary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ForeignExchangeSettlementCode
	 * ForeignExchangeSettlementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GROS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gross"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Each trade is settled by a single entry to the account of the beneficiary."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Gross = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Gross";
			definition = "Each trade is settled by a single entry to the account of the beneficiary.";
			owner_lazy = () -> ForeignExchangeSettlementCode.mmObject();
			codeName = "GROS";
		}
	};
	/**
	 * Each trade is split into several amounts and delivered to different
	 * accounts of the buyer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ForeignExchangeSettlementCode
	 * ForeignExchangeSettlementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Split"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Each trade is split into several amounts and delivered to different accounts of the buyer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Split = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Split";
			definition = "Each trade is split into several amounts and delivered to different accounts of the buyer.";
			owner_lazy = () -> ForeignExchangeSettlementCode.mmObject();
			codeName = "SPLT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CLSB");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				name = "ForeignExchangeSettlementCode";
				definition = "Specifies the method to be used to settle a foreign exchange trade.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ForeignExchangeSettlementCode.CLS, com.tools20022.repository.codeset.ForeignExchangeSettlementCode.Net,
						com.tools20022.repository.codeset.ForeignExchangeSettlementCode.Gross, com.tools20022.repository.codeset.ForeignExchangeSettlementCode.Split);
			}
		});
		return mmObject_lazy.get();
	}
}