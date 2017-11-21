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
 * Code list of transaction type as specified by the trading venue.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode#mmFutures
 * AssetClassTransactionTypeCode.mmFutures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode#mmOptions
 * AssetClassTransactionTypeCode.mmOptions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode#mmTAPOS
 * AssetClassTransactionTypeCode.mmTAPOS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode#mmSwaps
 * AssetClassTransactionTypeCode.mmSwaps}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode#mmMinis
 * AssetClassTransactionTypeCode.mmMinis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode#mmOTC
 * AssetClassTransactionTypeCode.mmOTC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode#mmOutright
 * AssetClassTransactionTypeCode.mmOutright}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode#mmCrack
 * AssetClassTransactionTypeCode.mmCrack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode#mmDifferential
 * AssetClassTransactionTypeCode.mmDifferential}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode#mmOther
 * AssetClassTransactionTypeCode.mmOther}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionType1Code
 * AssetClassTransactionType1Code}</li>
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
 * "AssetClassTransactionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Code list of transaction type as specified by the trading venue. "</li>
 * </ul>
 */
public class AssetClassTransactionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Futures.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode
	 * AssetClassTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Futures"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Futures."</li>
	 * </ul>
	 */
	public static final MMCode mmFutures = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Futures";
			definition = "Futures.";
			owner_lazy = () -> AssetClassTransactionTypeCode.mmObject();
			codeName = "FUTR";
		}
	};
	/**
	 * Options.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode
	 * AssetClassTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Options"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Options.\r\n"</li>
	 * </ul>
	 */
	public static final MMCode mmOptions = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Options";
			definition = "Options.\r\n";
			owner_lazy = () -> AssetClassTransactionTypeCode.mmObject();
			codeName = "OPTN";
		}
	};
	/**
	 * TAPOS.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode
	 * AssetClassTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TAPOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TAPOS."</li>
	 * </ul>
	 */
	public static final MMCode mmTAPOS = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TAPOS";
			definition = "TAPOS.";
			owner_lazy = () -> AssetClassTransactionTypeCode.mmObject();
			codeName = "TAPO";
		}
	};
	/**
	 * Swaps.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode
	 * AssetClassTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swaps"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Swaps."</li>
	 * </ul>
	 */
	public static final MMCode mmSwaps = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swaps";
			definition = "Swaps.";
			owner_lazy = () -> AssetClassTransactionTypeCode.mmObject();
			codeName = "SWAP";
		}
	};
	/**
	 * Minis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode
	 * AssetClassTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MINI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Minis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Minis."</li>
	 * </ul>
	 */
	public static final MMCode mmMinis = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Minis";
			definition = "Minis.";
			owner_lazy = () -> AssetClassTransactionTypeCode.mmObject();
			codeName = "MINI";
		}
	};
	/**
	 * Over-The-Counter.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode
	 * AssetClassTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Over-The-Counter."</li>
	 * </ul>
	 */
	public static final MMCode mmOTC = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OTC";
			definition = "Over-The-Counter.";
			owner_lazy = () -> AssetClassTransactionTypeCode.mmObject();
			codeName = "OTCT";
		}
	};
	/**
	 * Outright.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode
	 * AssetClassTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Outright"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Outright."</li>
	 * </ul>
	 */
	public static final MMCode mmOutright = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Outright";
			definition = "Outright.";
			owner_lazy = () -> AssetClassTransactionTypeCode.mmObject();
			codeName = "ORIT";
		}
	};
	/**
	 * Crack.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode
	 * AssetClassTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRCK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Crack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Crack. "</li>
	 * </ul>
	 */
	public static final MMCode mmCrack = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Crack";
			definition = "Crack. ";
			owner_lazy = () -> AssetClassTransactionTypeCode.mmObject();
			codeName = "CRCK";
		}
	};
	/**
	 * Differential.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode
	 * AssetClassTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIFF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Differential"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Differential."</li>
	 * </ul>
	 */
	public static final MMCode mmDifferential = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Differential";
			definition = "Differential.";
			owner_lazy = () -> AssetClassTransactionTypeCode.mmObject();
			codeName = "DIFF";
		}
	};
	/**
	 * Other.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode
	 * AssetClassTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other."</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other.";
			owner_lazy = () -> AssetClassTransactionTypeCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassTransactionTypeCode";
				definition = "Code list of transaction type as specified by the trading venue. ";
				code_lazy = () -> Arrays.asList(AssetClassTransactionTypeCode.mmFutures, AssetClassTransactionTypeCode.mmOptions, AssetClassTransactionTypeCode.mmTAPOS, AssetClassTransactionTypeCode.mmSwaps,
						AssetClassTransactionTypeCode.mmMinis, AssetClassTransactionTypeCode.mmOTC, AssetClassTransactionTypeCode.mmOutright, AssetClassTransactionTypeCode.mmCrack, AssetClassTransactionTypeCode.mmDifferential,
						AssetClassTransactionTypeCode.mmOther);
				derivation_lazy = () -> Arrays.asList(AssetClassTransactionType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}