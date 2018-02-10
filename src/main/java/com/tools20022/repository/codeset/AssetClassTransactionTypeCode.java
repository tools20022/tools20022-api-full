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
import com.tools20022.repository.codeset.AssetClassTransactionTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Code list of transaction type as specified by the trading venue.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode#Futures
 * AssetClassTransactionTypeCode.Futures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode#Options
 * AssetClassTransactionTypeCode.Options}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode#TAPOS
 * AssetClassTransactionTypeCode.TAPOS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode#Swaps
 * AssetClassTransactionTypeCode.Swaps}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode#Minis
 * AssetClassTransactionTypeCode.Minis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode#OTC
 * AssetClassTransactionTypeCode.OTC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode#Outright
 * AssetClassTransactionTypeCode.Outright}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode#Crack
 * AssetClassTransactionTypeCode.Crack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode#Differential
 * AssetClassTransactionTypeCode.Differential}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode#Other
 * AssetClassTransactionTypeCode.Other}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AssetClassTransactionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Code list of transaction type as specified by the trading venue."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AssetClassTransactionTypeCode extends MMCode {

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
	public static final AssetClassTransactionTypeCode Futures = new AssetClassTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Futures";
			definition = "Futures.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassTransactionTypeCode.mmObject();
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
	public static final AssetClassTransactionTypeCode Options = new AssetClassTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Options";
			definition = "Options.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassTransactionTypeCode.mmObject();
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
	public static final AssetClassTransactionTypeCode TAPOS = new AssetClassTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TAPOS";
			definition = "TAPOS.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassTransactionTypeCode.mmObject();
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
	public static final AssetClassTransactionTypeCode Swaps = new AssetClassTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swaps";
			definition = "Swaps.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassTransactionTypeCode.mmObject();
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
	public static final AssetClassTransactionTypeCode Minis = new AssetClassTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Minis";
			definition = "Minis.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassTransactionTypeCode.mmObject();
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
	public static final AssetClassTransactionTypeCode OTC = new AssetClassTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OTC";
			definition = "Over-The-Counter.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassTransactionTypeCode.mmObject();
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
	public static final AssetClassTransactionTypeCode Outright = new AssetClassTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Outright";
			definition = "Outright.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassTransactionTypeCode.mmObject();
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
	 * definition} = "Crack."</li>
	 * </ul>
	 */
	public static final AssetClassTransactionTypeCode Crack = new AssetClassTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Crack";
			definition = "Crack.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassTransactionTypeCode.mmObject();
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
	public static final AssetClassTransactionTypeCode Differential = new AssetClassTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Differential";
			definition = "Differential.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassTransactionTypeCode.mmObject();
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
	public static final AssetClassTransactionTypeCode Other = new AssetClassTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassTransactionTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	final static private LinkedHashMap<String, AssetClassTransactionTypeCode> codesByName = new LinkedHashMap<>();

	protected AssetClassTransactionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassTransactionTypeCode";
				definition = "Code list of transaction type as specified by the trading venue.";
				derivation_lazy = () -> Arrays.asList(AssetClassTransactionType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AssetClassTransactionTypeCode.Futures, com.tools20022.repository.codeset.AssetClassTransactionTypeCode.Options,
						com.tools20022.repository.codeset.AssetClassTransactionTypeCode.TAPOS, com.tools20022.repository.codeset.AssetClassTransactionTypeCode.Swaps, com.tools20022.repository.codeset.AssetClassTransactionTypeCode.Minis,
						com.tools20022.repository.codeset.AssetClassTransactionTypeCode.OTC, com.tools20022.repository.codeset.AssetClassTransactionTypeCode.Outright, com.tools20022.repository.codeset.AssetClassTransactionTypeCode.Crack,
						com.tools20022.repository.codeset.AssetClassTransactionTypeCode.Differential, com.tools20022.repository.codeset.AssetClassTransactionTypeCode.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Futures.getCodeName().get(), Futures);
		codesByName.put(Options.getCodeName().get(), Options);
		codesByName.put(TAPOS.getCodeName().get(), TAPOS);
		codesByName.put(Swaps.getCodeName().get(), Swaps);
		codesByName.put(Minis.getCodeName().get(), Minis);
		codesByName.put(OTC.getCodeName().get(), OTC);
		codesByName.put(Outright.getCodeName().get(), Outright);
		codesByName.put(Crack.getCodeName().get(), Crack);
		codesByName.put(Differential.getCodeName().get(), Differential);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static AssetClassTransactionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AssetClassTransactionTypeCode[] values() {
		AssetClassTransactionTypeCode[] values = new AssetClassTransactionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AssetClassTransactionTypeCode> {
		@Override
		public AssetClassTransactionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AssetClassTransactionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}