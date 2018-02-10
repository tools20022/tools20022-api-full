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
import com.tools20022.repository.codeset.MergerTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Types of merger for the TSE/JASDEC extension.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MergerTypeCode#OrdinaryMerger
 * MergerTypeCode.OrdinaryMerger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MergerTypeCode#ExchangeofShares
 * MergerTypeCode.ExchangeofShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MergerTypeCode#TransferofShares
 * MergerTypeCode.TransferofShares}</li>
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
 * "MergerTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Types of merger for the TSE/JASDEC extension."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MergerTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The type of merger is an ordinary merger.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MergerTypeCode
	 * MergerTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MRGR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrdinaryMerger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The type of merger is an ordinary merger."</li>
	 * </ul>
	 */
	public static final MergerTypeCode OrdinaryMerger = new MergerTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrdinaryMerger";
			definition = "The type of merger is an ordinary merger.";
			owner_lazy = () -> com.tools20022.repository.codeset.MergerTypeCode.mmObject();
			codeName = "MRGR";
		}
	};
	/**
	 * The type of merger is an exchange of shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MergerTypeCode
	 * MergerTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXSH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeofShares"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The type of merger is an exchange of shares."</li>
	 * </ul>
	 */
	public static final MergerTypeCode ExchangeofShares = new MergerTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeofShares";
			definition = "The type of merger is an exchange of shares.";
			owner_lazy = () -> com.tools20022.repository.codeset.MergerTypeCode.mmObject();
			codeName = "EXSH";
		}
	};
	/**
	 * The type of merger is a transfer of shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MergerTypeCode
	 * MergerTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRSH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferofShares"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The type of merger is a transfer of shares."</li>
	 * </ul>
	 */
	public static final MergerTypeCode TransferofShares = new MergerTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferofShares";
			definition = "The type of merger is a transfer of shares.";
			owner_lazy = () -> com.tools20022.repository.codeset.MergerTypeCode.mmObject();
			codeName = "TRSH";
		}
	};
	final static private LinkedHashMap<String, MergerTypeCode> codesByName = new LinkedHashMap<>();

	protected MergerTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MergerTypeCode";
				definition = "Types of merger for the TSE/JASDEC extension.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MergerTypeCode.OrdinaryMerger, com.tools20022.repository.codeset.MergerTypeCode.ExchangeofShares,
						com.tools20022.repository.codeset.MergerTypeCode.TransferofShares);
				length = 4;
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OrdinaryMerger.getCodeName().get(), OrdinaryMerger);
		codesByName.put(ExchangeofShares.getCodeName().get(), ExchangeofShares);
		codesByName.put(TransferofShares.getCodeName().get(), TransferofShares);
	}

	public static MergerTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MergerTypeCode[] values() {
		MergerTypeCode[] values = new MergerTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MergerTypeCode> {
		@Override
		public MergerTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MergerTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}