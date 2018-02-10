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
import com.tools20022.repository.codeset.AssetClassTransactionType1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionType1Code#Crack
 * AssetClassTransactionType1Code.Crack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionType1Code#Differential
 * AssetClassTransactionType1Code.Differential}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionType1Code#Futures
 * AssetClassTransactionType1Code.Futures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionType1Code#Minis
 * AssetClassTransactionType1Code.Minis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionType1Code#Options
 * AssetClassTransactionType1Code.Options}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionType1Code#OTC
 * AssetClassTransactionType1Code.OTC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionType1Code#Outright
 * AssetClassTransactionType1Code.Outright}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionType1Code#Swaps
 * AssetClassTransactionType1Code.Swaps}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionType1Code#TAPOS
 * AssetClassTransactionType1Code.TAPOS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionType1Code#Other
 * AssetClassTransactionType1Code.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionTypeCode
 * AssetClassTransactionTypeCode}</li>
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
 * "AssetClassTransactionType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Code list of transaction type as specified by the trading venue."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AssetClassTransactionType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionType1Code
	 * AssetClassTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Crack"</li>
	 * </ul>
	 */
	public static final AssetClassTransactionType1Code Crack = new AssetClassTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Crack";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassTransactionType1Code.mmObject();
			codeName = AssetClassTransactionTypeCode.Crack.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionType1Code
	 * AssetClassTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Differential"</li>
	 * </ul>
	 */
	public static final AssetClassTransactionType1Code Differential = new AssetClassTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Differential";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassTransactionType1Code.mmObject();
			codeName = AssetClassTransactionTypeCode.Differential.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionType1Code
	 * AssetClassTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Futures"</li>
	 * </ul>
	 */
	public static final AssetClassTransactionType1Code Futures = new AssetClassTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Futures";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassTransactionType1Code.mmObject();
			codeName = AssetClassTransactionTypeCode.Futures.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionType1Code
	 * AssetClassTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Minis"</li>
	 * </ul>
	 */
	public static final AssetClassTransactionType1Code Minis = new AssetClassTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Minis";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassTransactionType1Code.mmObject();
			codeName = AssetClassTransactionTypeCode.Minis.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionType1Code
	 * AssetClassTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Options"</li>
	 * </ul>
	 */
	public static final AssetClassTransactionType1Code Options = new AssetClassTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Options";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassTransactionType1Code.mmObject();
			codeName = AssetClassTransactionTypeCode.Options.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionType1Code
	 * AssetClassTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OTC"</li>
	 * </ul>
	 */
	public static final AssetClassTransactionType1Code OTC = new AssetClassTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OTC";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassTransactionType1Code.mmObject();
			codeName = AssetClassTransactionTypeCode.OTC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionType1Code
	 * AssetClassTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Outright"</li>
	 * </ul>
	 */
	public static final AssetClassTransactionType1Code Outright = new AssetClassTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Outright";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassTransactionType1Code.mmObject();
			codeName = AssetClassTransactionTypeCode.Outright.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionType1Code
	 * AssetClassTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swaps"</li>
	 * </ul>
	 */
	public static final AssetClassTransactionType1Code Swaps = new AssetClassTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swaps";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassTransactionType1Code.mmObject();
			codeName = AssetClassTransactionTypeCode.Swaps.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionType1Code
	 * AssetClassTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TAPOS"</li>
	 * </ul>
	 */
	public static final AssetClassTransactionType1Code TAPOS = new AssetClassTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TAPOS";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassTransactionType1Code.mmObject();
			codeName = AssetClassTransactionTypeCode.TAPOS.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionType1Code
	 * AssetClassTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final AssetClassTransactionType1Code Other = new AssetClassTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassTransactionType1Code.mmObject();
			codeName = AssetClassTransactionTypeCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AssetClassTransactionType1Code> codesByName = new LinkedHashMap<>();

	protected AssetClassTransactionType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassTransactionType1Code";
				definition = "Code list of transaction type as specified by the trading venue.";
				trace_lazy = () -> AssetClassTransactionTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AssetClassTransactionType1Code.Crack, com.tools20022.repository.codeset.AssetClassTransactionType1Code.Differential,
						com.tools20022.repository.codeset.AssetClassTransactionType1Code.Futures, com.tools20022.repository.codeset.AssetClassTransactionType1Code.Minis,
						com.tools20022.repository.codeset.AssetClassTransactionType1Code.Options, com.tools20022.repository.codeset.AssetClassTransactionType1Code.OTC,
						com.tools20022.repository.codeset.AssetClassTransactionType1Code.Outright, com.tools20022.repository.codeset.AssetClassTransactionType1Code.Swaps,
						com.tools20022.repository.codeset.AssetClassTransactionType1Code.TAPOS, com.tools20022.repository.codeset.AssetClassTransactionType1Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Crack.getCodeName().get(), Crack);
		codesByName.put(Differential.getCodeName().get(), Differential);
		codesByName.put(Futures.getCodeName().get(), Futures);
		codesByName.put(Minis.getCodeName().get(), Minis);
		codesByName.put(Options.getCodeName().get(), Options);
		codesByName.put(OTC.getCodeName().get(), OTC);
		codesByName.put(Outright.getCodeName().get(), Outright);
		codesByName.put(Swaps.getCodeName().get(), Swaps);
		codesByName.put(TAPOS.getCodeName().get(), TAPOS);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static AssetClassTransactionType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AssetClassTransactionType1Code[] values() {
		AssetClassTransactionType1Code[] values = new AssetClassTransactionType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AssetClassTransactionType1Code> {
		@Override
		public AssetClassTransactionType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AssetClassTransactionType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}